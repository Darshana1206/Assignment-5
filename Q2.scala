package functiondata

object Q2 {
  class Rational(a:Int,b:Int){
    def numer=a
    def denom=b
    def sub(number:Rational) = new Rational(this.numer*number.denom - number.numer*this.denom, this.denom*number.denom)
    def neg=new Rational(-this.numer,this.denom)
    override def toString = numer + "/" +denom
};

  def main(args:Array[String])={
    val a=new Rational(3,4)
    val b=new Rational(5,8)
    val c=new Rational(2,7)
    println((a.sub(b)).sub(c));
    
  }

}


