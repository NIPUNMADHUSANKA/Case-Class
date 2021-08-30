object Q_01 extends App {

  val p1 = new Point(4,2)
  val p2 = new Point(1,6)

  println(p1)
  println(p2)
  println(p1+p2)
  println(p1.move(4,9))
  println(p1.distant(p2))
  println(p1.invert())

}

case class Point(x:Int,y:Int){
  def +(that:Point) = Point(this.x+that.x, this.y+that.y)

  def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)

  def distant(that:Point) ={
    math.sqrt(math.pow((this.x - that.x), 2) + math.pow((this.y - that.y), 2))
  }

  def invert() =Point(this.y,this.x)


}