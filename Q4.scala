package functiondata

object Q4 {
 def main(args:Array[String])={
    
    var a1 = new Account("973254553V",1001,10000);
    var a2 = new Account("995687442V",1002,4000);
    var a3 = new Account("973564154V",1003,-2500);
    var a4 = new Account("981123548V",1004,9800);
    var a5 = new Account("971900067V",1005,-3500);

    var bank:List[Account] = List(a1,a2,a3,a4,a5);
    println("----Bank Accounts----");
    println(bank);
    
    val overdraft = (b:List[Account]) => b.filter(x=> x.balance < 0);
    println("----Accounts with negative balences ----");
    println(overdraft(bank))
 
    val balance = (a:List[Account])=> a.reduce((x,y)=> (new Account(x.nic,x.acnumber,x.balance+y.balance)))
    println("----Sum of account balances----");
    println(balance(bank).balance)
   
    val interest = (acc: List[Account])=> acc.map(x=> {
    if(x.balance<0)  (new Account(x.nic,x.acnumber,x.balance*1.05)) else (new Account(x.nic,x.acnumber,x.balance*1.1))})
    println("----Accounts after interest-----");
    println(interest(bank))
   
}
 
class Account(id:String,n:Int,b:Double){
    val nic:String = id
    val acnumber:Int = n
    var balance:Double = b

    def withdraw(a:Double)= this.balance = this.balance - a

    def deposit(a:Double) = this.balance = this.balance + a

    def transfer(a:Account, b:Double){
        a.balance += b;
        this.balance -=b;
    }

    override def toString = "[ "+nic+" : "+acnumber+" : "+balance+" ]";
}
}