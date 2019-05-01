# spring-boot-docker
Place holder for learning Boot and Docker

1. Download or clone the project 
2. bulild the project
3. start your docker [check if docker installed or not]
    
    docker --version
   
4. Build image out of this application [refer Dockerfile]

    docker build -f Dockerfile -t docker-spring-boot .
   
5. Run the image create in step4

    docker run -p 8085:8085 docker-spring-boot
    
6. Check if our REST URL working or not?

    http://localhost:8085//rest/spring/welcome -- Should return below message
    
    Welcome to Spring-boot learning Mr. Ramesh
