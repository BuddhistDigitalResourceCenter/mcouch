# mCouch - in memory CouchDB mocking

This package provides in memory implementation of couch db which can be used in unit testing to speed up the performance of your tests. No meant to be used for production. It supports:
- PUT, POST, DELETE and GET of documents.
- Bulk API, add, update and delete of documents.
- Execution of views.
- Supports count as standard reducer.

It Does not implement:
- Replication
- Document conflict checks
- Custom reducers

It uses Rhino to interpret the JavaScript map functions and Jackson for JSON parsing. It is based on stubbing of Apache Commons HTTP client.

## Installation

With maven:

```xml
    <dependency>
      <groupId>io.bdrc</groupId>
      <artifactId>mcouch</artifactId>
      <version>1.0.0</version>
    </dependency>
```

## Usage

```java
public class InMemoryCouchDb implements HttpClient
```

## Change history

See [Change log](CHANGELOG.md).

## License

The code is Copyright Vivek Singh 2012, distributed under the [Apache 2.0 License](LICENSE).