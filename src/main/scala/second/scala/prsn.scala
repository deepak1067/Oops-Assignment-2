package second.scala


trait Ordered{
  def checkName(p:Person)
  def checkAge(p:Person)
}
class Person(val name: String, val age: Int) extends Ordered {
  def checkName(p:Person): Unit ={
    if (this.name.equals(p.name)){
      //      println("true")
      checkAge(p)  // calling checkAge method to check according to age
    }
    else {
      if(this.name.length.equals(p.name.length))  //check name length is equal or not
      {
        println("true")
      }
      else {
        println("false")
      }

    }
  }

  override def checkAge(p:Person): Unit = {

    if(this.age <= p.age)  // check if age equals or greater
    {
      println("true")  //Age is greater
    }
    else {
      println("false") //Age is not equals
    }
  }
}

object Main{
  def main(args: Array[String]): Unit = {
    var personOne =new Person("Deepak",24)
    var personTwo =new Person("Aa",25)

    personOne.checkName(personTwo)trait Ordered{
  def checkName(p:Person)
  def checkAge(p:Person)
}
class Person(val name: String, val age: Int) extends Ordered {
  def checkName(p:Person): Unit ={
    if (this.name.equals(p.name)){
//      println("true")
      checkAge(p)  // calling checkAge method to check according to age
    }
    else {
      if(this.name.length.equals(p.name.length))  //check name length is equal or not
      {
        println("true")
      }
      else {
        println("false")
      }

    }
  }

  override def checkAge(p:Person): Unit = {

    if(this.age <= p.age)  // check if age equals or greater
      {
        println("true")  //Age is greater
      }
    else {
      println("false") //Age is not equals
    }
  }
}

object Main{
  def main(args: Array[String]): Unit = {
    var personOne =new Person("Deepak",24)
    var personTwo =new Person("Aa",25)

    personOne.checkName(personTwo)
//    personTwo.checkAge(personOne)
  }
}
    //    personTwo.checkAge(personOne)
  }
}