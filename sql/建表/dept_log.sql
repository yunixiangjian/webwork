create table dept_log
(
    id          int auto_increment comment '主键ID'
        primary key,
    create_time datetime     null comment '操作时间',
    description varchar(300) null comment '操作描述'
)
    comment '部门操作日志表';

