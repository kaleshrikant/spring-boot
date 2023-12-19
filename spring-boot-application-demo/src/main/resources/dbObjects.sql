mysql> create database dcbapp;
Query OK, 1 row affected (0.06 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| course_api         |
| dcbapp             |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> use dcbapp;
Database changed

mysql> create database dcbapp_qa;
Query OK, 1 row affected (0.01 sec)

mysql> create database dcbapp_prod;
Query OK, 1 row affected (0.01 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| course_api         |
| dcbapp             |
| dcbapp_prod        |
| dcbapp_qa          |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
8 rows in set (0.00 sec)