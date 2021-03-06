import com.mongodb.BasicDBObject

/**
  * @author Humayun
  */
object TestFindByQuery {
  def main(args: Array[String]): Unit = {
    def client = new MongoClient
    def db = client.db("mydb")
    val col = db.readOnlyCollection("test")
    val updatableCol = db.updatableCollection("test")
    for(i <- 1 to 100) updatableCol += new BasicDBObject("i", i)

    val rangeQuery = new BasicDBObject("i", new BasicDBObject("$gt", 20))
    val richQuery = Query(rangeQuery).skip(20).limit(10)
    val cursor = col.find(richQuery)
    while(cursor.hasNext()) {
      println(cursor.next());
    }
  }
}
