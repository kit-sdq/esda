# Energy State Data Analysis (ESDA)

ESDA is a component-oriented reference and test application for use in performance benchmarks and tests. This community case study emulates a message-based system for analyzing energy state data.

## Getting Started

```sh
# Docker
docker pull wurstmeister/kafka
docker pull openjdk

# Git
git clone https://git.scc.kit.edu/i43/esda
cd .\esda

# Build
mvn -f .\edu.kit.ipd.are.esda\pom.xml clean install

mvn -f .\edu.kit.ipd.are.esda.aggregate\pom.xml clean package
docker build -t esda/aggregate .\edu.kit.ipd.are.esda.aggregate

mvn -f .\edu.kit.ipd.are.esda.analysis\pom.xml clean package
docker build -t esda/analysis .\edu.kit.ipd.are.esda.analysis

mvn -f .\edu.kit.ipd.are.esda.importer\pom.xml clean package
docker build -t esda/importer .\edu.kit.ipd.are.esda.importer

# Execut
docker-compose up -d

docker run -i --log-driver=none -a stdin -a stdout -a stderr esda/importer
docker run -i --log-driver=none -a stdin -a stdout -a stderr esda/aggregate
docker run -i --log-driver=none -a stdin -a stdout -a stderr esda/analysis

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
