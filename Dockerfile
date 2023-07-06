FROM bellsoft/liberica-openjdk-alpine:latest


COPY ./src ./javatest

COPY ./javadoc ./javadoc2

RUN javac -sourcepath ./javatest -d out javatest/main/java/pack/App.java javatest/main/java/pack/Main.java

CMD java -classpath ./out pack.Main
