docker exec -it eats-kafka-1 

# kafka-topics.sh --bootstrap-server localhost:9092 --create --topic pagamentosConfirmados --partitions 2
# kafka-console-producer.sh --topic pagamentosConfirmados --bootstrap-server localhost:9092
# kafka-console-consumer.sh --topic pagamentosConfirmados --from-beginning --bootstrap-server localhost:9092
# kafka-consumer-groups.sh --bootstrap-server localhost:9092 --all-groups --describe
