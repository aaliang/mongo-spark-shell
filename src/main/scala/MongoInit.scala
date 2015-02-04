// everything is imported directly into the scala/spark repl. essentially a script
// this should probably be put in a class tho
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.hadoop.conf.Configuration
import org.bson.BSONObject
import org.bson.BasicBSONObject

import java.io.FileInputStream
import java.io.IOException
import java.util.Properties

import scala.collection.JavaConversions._

val config = new Configuration()

val input = new FileInputStream("config.properties")

val properties =  new Properties()

properties.load(input)

config.set("mongo.input.uri", properties.get("mongo.input.uri").toString())
config.set("mongo.output.uri", properties.get("mongo.output.uri").toString())
config.set("mongo.input.query", properties.get("mongo.input.query").toString())


val mongoRDD = sc.newAPIHadoopRDD(config, classOf[com.mongodb.hadoop.MongoInputFormat], classOf[Object], classOf[BSONObject])
