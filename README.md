# Praktikum8

## Kardinalitas

#### Payment.java mempunyai relasi generalization dengan Cash.java, Check.java dan Credit.java
#### Payment.java mempunyai relasi asosiasi kardinalitas 1 or more dengan Order.java


* Order.java mempunyai kardinalitas exactly one dengan Payment.java
* Order.java mempunyai relasi asosiasi dan kardinalitas zero or more dengan Customer.java
* Order.java mempunyai relasi agregasi dan kardinalitas exactly one dengan OrderDetail.java


* Customer.java mempunyai kardinalitas exactly one dengan Order.java


* OrderDetail.java mempunyai kardinalitas 1 or more dengan Order.java
* OrderDetail.java mempunyai relasi asosiasi dan kardinalitas zero or more dengan Item.java


* Item.java mempunyai kardinalitas exactly one dengan OrderDetail.java