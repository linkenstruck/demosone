package com.example.demos.common;

public enum StatusCode {

    /*
        错误码格式说明（示例：202001）
        --------------------------------------------------------------------
        服务级错误（1为系统级错误）	服务模块代码(即业务模块标识)	具体错误代码
                2                            02	                    001
        --------------------------------------------------------------------
    */

    /*常用的状态码，业务模块的状态码请勿添加在此处，而应该是在各个业务模块定义，格式如上*/
    OK(200, "操作成功！"),//成功
    OK_FAIL(201, "操作失败！"),//成功
    OK_FAIL_LOGIN(233,"账号密码不匹配"),//账号密码不匹配

    IS_NULL(300,"参数为空！"),// 判断参数为空

    NOT_FOUND(404,"参数不存在！"),


    ROLE_NAME_REPEAT(601,"角色名称已存在！"),
    UN_AUTHORIZED(602,"无权限！"),
    ROLE_EXIST_USER(60301,"该角色已绑定用户！不能删除！"),
    ROLE_EXIST_MENU(60302,"该角色已绑定菜单或操作权限！不能删除！"),
    ROLE_NOT_FOUND(604,"角色不存在！"),

    OPERATION_NAME_REPEAT(701,"权限名称已存在！"),
    OPERATION_CODE_REPEAT(702,"权限格式已存在！"),
    OPERATION_NOT_FOUND(704,"权限记录不存在！"),

    USER_NAME_REPEAT(801,"用户名称已存在！"),
    USER_PWD_ERROR(802,"用户密码修改时，必须填写原密码，且原密码必须正确！"),
    USER_DELETE(803,"用户已删除！如继续使用，请联系管理员恢复账号！"),
    USER_NOT_FOUND(804,"用户不存在！"),
    USER_NOT_WEB(806,"不是web端用户！"),

    MENU_NAME_REPEAT(901,"菜单名称已存在！"),
    MENU_URL_REPEAT(902,"菜单路径已存在！"),
    MENU_PATH_NAME_REPEAT(905,"菜单路径名称已存在！"),
    MENU_COMPONENT_REPEAT(906,"文件路径名称已存在！"),
    MENU_EXIST_SUB(903,"菜单存在子级，请先删除子级！"),
    MENU_NOT_FOUND(904,"菜单不存在！"),

    DATA_ZRBZ_REPEAT(1001,"责任班组机构编码重复！")
    ;

	
	
    /*状态码*/
    private int code;
    /*信息*/
    private String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
