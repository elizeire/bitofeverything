The application uses postgres docker database

first, initialize postgres on docker
 docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 --name spring_test -e POSTGRES_USER=spring_test -e POSTGRES_PASSWORD=spring_test -e POSTGRES_DB=spring_test -p 5432:5432 postgres:11.5
 or just docker-compose up from docker-compose.yml directory

1.)ChipManagement
Runs on port: 8081, ex.:http://localhost:8081/chips
http://localhost:8081/swagger-ui.htm

2.) DeviceManagement
Runs on port: 8082, ex.:http://localhost:8082/devices
http://localhost:8082/swagger-ui.htm

3.) UserManagement
Runs on port: 8083, ex.:http://localhost:8083/persons
http://localhost:8083/swagger-ui.htm
