# SoapUI to Postman Converter

A Java-based tool to convert SoapUI XML projects to Postman JSON collections.

## Features

- Converts SoapUI REST services to Postman collections
- Preserves request methods (GET, POST, PUT, etc.)
- Maintains headers, query parameters, and request bodies
- Supports basic authentication
- Handles path parameters

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

```bash
mvn clean install
```

## Usage

1. Configure the input and output paths in `application.properties`:

```properties
soapui2postman.filename=path/to/your/soapui-project.xml
soapui2postman.outdir=path/to/output/directory/
```

2. Run the application:

```bash
java -jar target/soapui2postman-0.0.1-SNAPSHOT.jar
```

## Project Structure

- `src/main/java/cz/esgaltur/soapui2postman/` - Main source code
  - `configuration/` - Configuration classes
  - `constants/` - Constants used in the project
  - `generated/` - Generated model classes
  - `mappers/` - MapStruct mappers for conversion
  - `unmarshaller/` - XML unmarshalling utilities

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the terms of the license included in the repository.
