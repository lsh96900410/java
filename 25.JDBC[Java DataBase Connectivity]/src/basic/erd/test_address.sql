select * from address;

--insert
insert into address values(address_no_seq.nextval,'김경호','123-3456','경기도 포천시'); 

--pk update
update ADDRESS set name='김변경' , phone='888-8888',address ='서울시 강남구' where no=2;

--pk delete
delete from address where no=3;

-- select(pk)
select no,name,phone,address from address where no=2;


-- select( all select )
select no,name,phone,address from address;
























