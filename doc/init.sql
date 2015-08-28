/*web_action��*/
insert into web_action(id,name,url) value(1,"ͼ���б�","listBook.action");
insert into web_action(id,name,url) value(2,"���ͼ��","addBook.action");
insert into web_action(id,name,url) value(3,"���ļ�¼","listBorrowedRecord.action");
insert into web_action(id,name,url) value(4,"�û��б�","listUser.action");
insert into web_action(id,name,url) value(5,"����û�","addUser.action");
insert into web_action(id,name,url) value(6,"�ҵ�ͼ��","myBorrowedBooks.action");
insert into web_action(id,name,url) value(7,"�������б�","listWorkflow.action");
insert into web_action(id,name,url) value(8,"��ʦ����","teacherApproval.action");
insert into web_action(id,name,url) value(9,"����Ա����","studentArrpoval.action");

/*role��*/
insert into role(id,name) value(1,"administrator");
insert into role(id,name) value(2,"teacher");
insert into role(id,name) value(3,"student");

/*role_web_action_relation*/
insert into role_web_action_relation(id,role_id,web_action_id) value(1,1,1);
insert into role_web_action_relation(id,role_id,web_action_id) value(2,1,2);
insert into role_web_action_relation(id,role_id,web_action_id) value(3,1,3);
insert into role_web_action_relation(id,role_id,web_action_id) value(4,1,4);
insert into role_web_action_relation(id,role_id,web_action_id) value(5,1,5);
insert into role_web_action_relation(id,role_id,web_action_id) value(6,1,6);
insert into role_web_action_relation(id,role_id,web_action_id) value(7,1,7);
insert into role_web_action_relation(id,role_id,web_action_id) value(8,1,8);
insert into role_web_action_relation(id,role_id,web_action_id) value(9,1,9);
insert into role_web_action_relation(id,role_id,web_action_id) value(10,2,1);
insert into role_web_action_relation(id,role_id,web_action_id) value(11,2,2);
insert into role_web_action_relation(id,role_id,web_action_id) value(12,2,3);
insert into role_web_action_relation(id,role_id,web_action_id) value(13,2,4);
insert into role_web_action_relation(id,role_id,web_action_id) value(14,2,5);
insert into role_web_action_relation(id,role_id,web_action_id) value(15,2,6);
insert into role_web_action_relation(id,role_id,web_action_id) value(16,2,7);
insert into role_web_action_relation(id,role_id,web_action_id) value(17,2,8);
insert into role_web_action_relation(id,role_id,web_action_id) value(18,2,9);
insert into role_web_action_relation(id,role_id,web_action_id) value(19,3,1);
insert into role_web_action_relation(id,role_id,web_action_id) value(20,3,2);
insert into role_web_action_relation(id,role_id,web_action_id) value(21,3,3);
insert into role_web_action_relation(id,role_id,web_action_id) value(22,3,4);
insert into role_web_action_relation(id,role_id,web_action_id) value(23,3,5);
insert into role_web_action_relation(id,role_id,web_action_id) value(24,3,6);
insert into role_web_action_relation(id,role_id,web_action_id) value(25,3,7);
insert into role_web_action_relation(id,role_id,web_action_id) value(26,3,8);
insert into role_web_action_relation(id,role_id,web_action_id) value(27,3,9);


/*menu��*/
insert into menu(id,name,icon) value(1,"ͼ��","icon-th");
insert into menu(id,name,icon) value(2,"�û�","icon-th");
insert into menu(id,name,icon) value(3,"������","icon-th");

insert into menu(id,super_id,name,web_action_id) value(4,1,"ͼ���б�",1);
insert into menu(id,super_id,name,web_action_id) value(5,1,"���ͼ��",2);
insert into menu(id,super_id,name,web_action_id) value(6,1,"���ļ�¼",3);

insert into menu(id,super_id,name,web_action_id) value(7,2,"�û��б�",4);
insert into menu(id,super_id,name,web_action_id) value(8,2,"����û�",5);
insert into menu(id,super_id,name,web_action_id) value(9,2,"�ҵ�ͼ��",6);

insert into menu(id,super_id,name,web_action_id) value(10,3,"�������б�",7);
insert into menu(id,super_id,name,web_action_id) value(11,3,"��ʦ����",8);
insert into menu(id,super_id,name,web_action_id) value(12,3,"����Ա����",9);



/*role_menu_relation*/
insert into role_menu_relation(id,role_id,menu_id) value(1,1,1);
insert into role_menu_relation(id,role_id,menu_id) value(2,1,2);
insert into role_menu_relation(id,role_id,menu_id) value(3,1,3);
insert into role_menu_relation(id,role_id,menu_id) value(4,1,4);
insert into role_menu_relation(id,role_id,menu_id) value(5,1,5);
insert into role_menu_relation(id,role_id,menu_id) value(6,1,6);
insert into role_menu_relation(id,role_id,menu_id) value(7,1,7);
insert into role_menu_relation(id,role_id,menu_id) value(8,1,8);
insert into role_menu_relation(id,role_id,menu_id) value(9,1,9);
insert into role_menu_relation(id,role_id,menu_id) value(10,1,10);
insert into role_menu_relation(id,role_id,menu_id) value(11,1,11);
insert into role_menu_relation(id,role_id,menu_id) value(12,1,12);

/*user��*/
insert into user(id,name,password,telephone,address,type,role_id) value(1,"admin","admin","15050362125","ѩ��",1,1);
insert into user(id,name,password,telephone,address,type,role_id) value(2,"teacher","teacher","15050362126","��ׯ",2,2);
insert into user(id,name,password,telephone,address,type,role_id) value(3,"student","student","15050362127","��Ȫ",3,3);

/*book��*/
insert into book(id,name,description,author,status) value(1,"JAVA��̿���ָ��","JAVA��̿���ָ�ϵĽ���","����",0);
insert into book(id,name,description,author,status) value(2,"PHP��̿���ָ��","PHP��̿���ָ�ϵĽ���","��˳ƽ",0);




