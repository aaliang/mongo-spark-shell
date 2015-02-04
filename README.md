mongo-spark-shell
===========

Hastily written macro to initialize a mongo spark connector within the spark-shell and return the shell back to the
user

Read more details at http://codeforhire.com/2014/02/18/using-spark-with-mongodb/

[1]: https://github.com/mongodb/mongo-hadoop
[2]: https://spark.incubator.apache.org/


Prerequisites
-------------

* Scala 2.10 (SBT not required)
* mongo-hadoop and mongo-java driver (jars are included)
* you need a config.properties file placed in the working directory of spark-shell - i know, should be read in at the cli


Running
-------
 $ spark-shell -i /path/to/MongoInit.scala --jars /path/to/mongo-hadoop-core_2.2.0-1.2.0.jar,/path/to/mongo-java-driver-2.11.4.jar

 \>>  sc
License
-------

The code itself is released to the public domain according to the [Creative Commons CC0][3].
