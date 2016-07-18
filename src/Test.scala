/**
  * Created by kenichi on 2016/06/21.
  */
object Test {
  def main(args: Array[String]) {
    // 普通の
    var input1: String = "hogehoge"
    val INPUT2: String = "no_change"
    var inputNum: Integer = 0
    input1 = "aaaaa"
    println(input1 + INPUT2)
    // 配列
    var array = Array(1, 2, 3)
    println(array.deep)
    // List あまり使わなそう　配列でいいかと
    var list = List(1, 2, 3)
    println(list)
    // Map
    var map = Map[String, String]("aaa" -> "bbb", "kkk" -> "jjj")
    println(map("kkk"))
    // use summary
    var result = this.methodTest()
    println(result)
    // foreach
    var i = 0
    (0 to 100).foreach(
      i += _
    )
    println(i)
    array.foreach(
      println(_)
    )
    map.foreach { case (key, value) =>
      println(key + ":" + value)
    }
  }

  def methodTest() = {
    1 + 100
  }
}