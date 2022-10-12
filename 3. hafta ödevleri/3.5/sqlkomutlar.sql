SELECT * FROM Customers;

SELECT ContactName,City FROM Customers

SELECT ContactName Ad, City Şehir From Customers

SELECT * FROM Customers where City="London"

Select * From Products where categoryId=1 or categoryId=3

Select * From Products where categoryId=1 and Price>=10

Select * From Products order by ProductName

Select * From Products order by CategoryId,ProductName

select * from Products order by Price

select * from Products order by Price desc

select * from Products where categoryId=1 order by Price desc

select count(*) from Products

select count(*) from Products where categoryId=2

select categoryId from Products group by CategoryId

select categoryId,count(*) from Products group by categoryId

select categoryId,count(*) from Products group by categoryId having count(*)<10 

select categoryId,count(*) from Products where Price>20 group by categoryId having count(*)<10 

select Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryId = Categories.CategoryId

select Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryId = Categories.CategoryId
where Products.Price >10 

select * from Products p left join OrderDetails od
on p.ProductId = od.ProductId 

select * from Customers c left join Orders o
on c.CustomerId = o.CustomerId
where o.CustomerId is null 

select * from Products p inner join OrderDetails od
on p.ProductId = od.ProductId
inner join Orders o
on o.OrderId = od.OrderId