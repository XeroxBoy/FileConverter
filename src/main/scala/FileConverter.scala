import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

class FileConverter {
    def csvConvert(path:String):Unit={
      val conf = new SparkConf()
        .setAppName("QJZK")
        .setMaster("local")
      val sc = new SparkContext(conf)
      val sQLContext = new SQLContext(sc)

      //读取一个Parquet文件
      var paquetDF = sQLContext.read.format("parquet").load("C:\\Users\\sx\\Desktop\\2019070206.parquet")
      paquetDF = paquetDF.drop("ConnStatus")
      paquetDF = paquetDF.drop("SynCount")
      paquetDF = paquetDF.drop("RstCount")
      paquetDF = paquetDF.drop("FinCount")
      paquetDF = paquetDF.drop("UrgentCount")
      paquetDF.write.format("csv").save("D:\\csv\\2019-07-0206")
    }

}
