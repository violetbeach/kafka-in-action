bin/kafka-topics.sh --create --topic checkout.complete.v1 --partitions 5 --bootstrap-server localhost:9092
bin/kafka-topics.sh --create --topic checkout.aggregated.v1 --partitions 5 --bootstrap-server localhost:9092