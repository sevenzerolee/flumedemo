#!/bin/sh

jarlist=$(ls /home/lb/software/bigdata/apache-flume-1.7.0-bin/lib/*.jar)
CLASSPATH=/home/lb/workspace/demo/target/demo-0.0.1-SNAPSHOT.jar

for jar in ${jarlist}
do
    CLASSPATH=${CLASSPATH}:${jar}
done
echo ${CLASSPATH}
 
java -classpath $CLASSPATH com.ctsi.flum.demo.WriteLog

