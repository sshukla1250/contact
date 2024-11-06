FROM openjdk:11
EXPOSE 8098
ADD target/contact_service.jar contact_service.jar
ENTRYPOINT ["java","-jar","/contact_service.jar"]
