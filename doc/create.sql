/*==============================================================*/
/* Database name:  library                                      */
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/8/28 10:07:14                           */
/*==============================================================*/


drop database if exists library;

/*==============================================================*/
/* Database: library                                            */
/*==============================================================*/
create database library;

use library;

/*==============================================================*/
/* Table: book                                                  */
/*==============================================================*/
create table book
(
   id                   bigint not null auto_increment,
   name                 varchar(64) not null,
   description          text not null,
   author               varchar(32) not null,
   borrower_id          bigint,
   status               int not null comment '0：在库
            1：借出',
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

/*==============================================================*/
/* Table: borrowed_record                                       */
/*==============================================================*/
create table borrowed_record
(
   id                   bigint not null auto_increment,
   user_id              bigint not null,
   book_id              bigint not null,
   borrow_time          datetime not null comment '借阅时间',
   expiration_time      datetime not null comment '到期时间',
   return_time          datetime comment '归还时间',
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   id                   bigint not null,
   super_id             bigint,
   name                 varchar(64) not null,
   web_action_id        bigint,
   icon                 varchar(32),
   sort                 integer not null default 0,
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   bigint not null,
   name                 varchar(32) not null,
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

/*==============================================================*/
/* Table: role_menu_relation                                    */
/*==============================================================*/
create table role_menu_relation
(
   id                   bigint not null,
   role_id              bigint not null,
   menu_id              bigint not null,
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

/*==============================================================*/
/* Table: role_web_action_relation                              */
/*==============================================================*/
create table role_web_action_relation
(
   id                   bigint not null,
   role_id              bigint not null,
   web_action_id        bigint not null,
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   bigint not null,
   name                 varchar(32) not null,
   password             varchar(32) not null,
   telephone            varchar(32) not null,
   address              varchar(64) not null,
   type                 smallint not null comment '1：管理员
            2：老师
            3：学生',
   role_id              bigint not null,
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

/*==============================================================*/
/* Table: web_action                                            */
/*==============================================================*/
create table web_action
(
   id                   bigint not null,
   name                 varchar(32) not null,
   url                  varchar(64) not null,
   primary key (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

alter table book add constraint FK_Reference_2 foreign key (borrower_id)
      references user (id) on update restrict;

alter table borrowed_record add constraint FK_Reference_3 foreign key (user_id)
      references user (id) on update restrict;

alter table borrowed_record add constraint FK_Reference_4 foreign key (book_id)
      references book (id) on update restrict;

alter table menu add constraint FK_Reference_5 foreign key (super_id)
      references menu (id) on delete restrict on update restrict;

alter table menu add constraint FK_Reference_6 foreign key (web_action_id)
      references web_action (id) on delete restrict on update restrict;

alter table role_menu_relation add constraint FK_Reference_10 foreign key (role_id)
      references role (id) on delete restrict on update restrict;

alter table role_menu_relation add constraint FK_Reference_11 foreign key (menu_id)
      references menu (id) on delete restrict on update restrict;

alter table role_web_action_relation add constraint FK_Reference_7 foreign key (role_id)
      references role (id) on delete restrict on update restrict;

alter table role_web_action_relation add constraint FK_Reference_8 foreign key (web_action_id)
      references web_action (id) on delete restrict on update restrict;

alter table user add constraint FK_Reference_9 foreign key (role_id)
      references role (id) on delete restrict on update restrict;

