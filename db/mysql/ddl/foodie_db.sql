(
CREATE TABLE user
user_name VARCHAR(100), 
mail_address VARCHAR(100),
sex BOOLEAN,
birth_date DATE,
post_num CHAR(7),
address VARCHAR(240),
phone_number CHAR(11),
PRIMARY KEY (user_id)
 );
 
INSERT INTO user (user_id,user_name,mail_address,sex,birth_date,post_num,address,phone_number) VALUES(uuid(),"yamada","yamada@mail.com",TRUE,"2000-01-01","1111111","tokyo","08000001111");