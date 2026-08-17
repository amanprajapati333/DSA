/*

SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;

*/
select Email from Person group by Email 
Having count(Email)>1;