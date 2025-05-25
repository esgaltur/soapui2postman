package cz.esgaltur.soapui2postman;

import cz.esgaltur.soapui2postman.configuration.SoapUi2PostmanConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;

@SpringBootApplication
@Slf4j
public class Soapui2postmanApplication implements CommandLineRunner {

	@Autowired
	private SoapUi2PostmanConfig config;

	public static void main(String[] args) {
		log.info("STARTING THE APPLICATION");
		ConfigurableApplicationContext context = SpringApplication.run(Soapui2postmanApplication.class, args);
		log.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) {
		log.info("EXECUTING : command line runner");

		// Process command line arguments
		if (args.length > 0) {
			processCommandLineArgs(args);
		}

		// Log the configuration
		log.info("Input file: {}", config.getFileName());
		log.info("Output directory: {}", config.getOutDir());

		// Validate configuration
		validateConfiguration();
	}

	/**
	 * Process command line arguments to override configuration properties.
	 * 
	 * @param args Command line arguments
	 */
	private void processCommandLineArgs(String... args) {
		for (int i = 0; i < args.length; ++i) {
			String arg = args[i];
			log.info("Processing arg[{}]: {}", i, arg);

			if (arg.equals("--input") || arg.equals("-i")) {
				if (i + 1 < args.length) {
					String inputFile = args[++i];
					log.info("Setting input file to: {}", inputFile);
					config.setFileName(inputFile);
				} else {
					log.error("Missing value for --input argument");
				}
			} else if (arg.equals("--output") || arg.equals("-o")) {
				if (i + 1 < args.length) {
					String outputDir = args[++i];
					log.info("Setting output directory to: {}", outputDir);
					config.setOutDir(outputDir);
				} else {
					log.error("Missing value for --output argument");
				}
			} else if (arg.equals("--help") || arg.equals("-h")) {
				printHelp();
				System.exit(0);
			}
		}
	}

	/**
	 * Validate the configuration to ensure the input file exists and the output directory is valid.
	 */
	private void validateConfiguration() {
		// Check if input file exists
		File inputFile = new File(config.getFileName());
		if (!inputFile.exists()) {
			log.error("Input file does not exist: {}", config.getFileName());
			log.error("Please provide a valid input file using --input or -i");
			printHelp();
			System.exit(1);
		}

		// Check if output directory exists, create if it doesn't
		File outputDir = new File(config.getOutDir());
		if (!outputDir.exists()) {
			log.info("Output directory does not exist, creating: {}", outputDir.getAbsolutePath());
			if (!outputDir.mkdirs()) {
				log.error("Failed to create output directory: {}", outputDir.getAbsolutePath());
				log.error("Please provide a valid output directory using --output or -o");
				printHelp();
				System.exit(1);
			}
		}

		// Check if output directory is writable
		if (!outputDir.canWrite()) {
			log.error("Output directory is not writable: {}", outputDir.getAbsolutePath());
			log.error("Please provide a writable output directory using --output or -o");
			printHelp();
			System.exit(1);
		}
	}

	/**
	 * Print help information about the application and its command line arguments.
	 */
	private void printHelp() {
		System.out.println("SoapUI to Postman Converter");
		System.out.println("---------------------------");
		System.out.println("Converts SoapUI XML projects to Postman JSON collections.");
		System.out.println();
		System.out.println("Usage: java -jar soapui2postman.jar [options]");
		System.out.println();
		System.out.println("Options:");
		System.out.println("  --input, -i <file>    Input SoapUI XML file");
		System.out.println("  --output, -o <dir>    Output directory for Postman JSON collection");
		System.out.println("  --help, -h            Show this help message");
		System.out.println();
		System.out.println("Example:");
		System.out.println("  java -jar soapui2postman.jar -i project.xml -o output/");
	}
}
