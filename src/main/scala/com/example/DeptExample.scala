package com.example

object DeptExample {
  def main(args:Array[String]): Unit = {
	  
	  var dept = new Dept
	  dept.deptno = 10
	  dept.dname = "chongmuboo"
	  dept.loc = "seoul"
	  
	  println("deptno = " + dept.deptno);
	   println("dname = " + dept.dname);
	     println("dloc = " + dept.loc);
	  
	  
  }
}