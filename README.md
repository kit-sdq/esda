# Energy State Data Analysis (ESDA)

ESDA is a component-oriented reference and test application for use in performance benchmarks and tests. This community case study emulates a message-based system for analyzing energy state data.

## Getting Started

```sh
docker pull wurstmeister/kafka
git-clone https://git.scc.kit.edu/i43/esda
cd esda
docker-compose up -d

# Building and execution of the three component
cd edu.kit.ipd.are.esda
mvn clean install
cd ../edu.kit.ipd.are.esda.importer
mvn clean install
mvn spring-boot:run
cd ../edu.kit.ipd.are.esda.aggregate
mvn clean install
mvn spring-boot:run
cd ../edu.kit.ipd.are.esda.analysis
mvn clean install
mvn spring-boot:run

# Test
curl "localhost:80/add/abc/30"
curl "localhost:80/add/abc/30"
curl "localhost:80/add/abc/30"

```

## Reference Documentation

For further reference, please consider the following sections:

* [Kafka Docker](https://wurstmeister.github.io/kafka-docker)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-kafka)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/_reference.html#kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/#_kafka_streams_binding_capabilities_of_spring_cloud_stream)
