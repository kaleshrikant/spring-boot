mysql> create database course_api;
Query OK, 1 row affected (0.00 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| course_api         |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql> use course_api
Database changed
Query OK, 0 rows affected (0.02 sec)

mysql> create table topic (id varchar(50) primary key, name varchar(100) not null, description varchar(100));
Query OK, 0 rows affected (0.02 sec)

mysql> show tables;
+----------------------+
| Tables_in_course_api |
+----------------------+
| topic                |
+----------------------+
1 row in set (0.00 sec)

mysql> desc topic;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| id          | varchar(50)  | NO   | PRI | NULL    |       |
| name        | varchar(100) | NO   |     | NULL    |       |
| description | varchar(100) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> insert into topic (id, name, description) values ('Spring','Spring Framework','Spring Framework Description');
Query OK, 1 row affected (0.01 sec)

mysql> insert into topic (id, name, description) values ('Hibernate','Hibernate Framework','Hibernate Framework Description');
Query OK, 1 row affected (0.00 sec)

mysql> insert into topic (id, name, description) values ('Python','Django Framework','Django Framework Description');
Query OK, 1 row affected (0.00 sec)

mysql> insert into topic (id, name, description) values ('JavaScript',' Angular Framework','Angular Framework Description');
Query OK, 1 row affected (0.00 sec)

mysql> select * from topic;
+------------+---------------------+---------------------------------+
| id         | name                | description                     |
+------------+---------------------+---------------------------------+
| Hibernate  | Hibernate Framework | Hibernate Framework Description |
| JavaScript |  Angular Framework  | Angular Framework Description   |
| Python     | Django Framework    | Django Framework Description    |
| Spring     | Spring Framework    | Spring Framework Description    |
+------------+---------------------+---------------------------------+
4 rows in set (0.01 sec)