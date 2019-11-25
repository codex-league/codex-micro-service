package pub.codex.common.core.exceptions;


public enum CodeDefined implements IMessageEnum {

    SUCCESS("0000", "成功"),
    ERROR("9999", "系统异常,请稍后再试"),

    // ------------------ 以下为自定义异常类型 千位：大分类  百位：小分类   个位十位：自定义----------------------------

    RESPONSE_ERROR("0005", "服务响应对象类型转换错误"),
    VALID("0009", "自定义验证"),

    // URL、参数 错误
    URL_NOT_FOUND("2100", "URL地址错误"),
    METHOD_ERROR("2101", "请求方法类型错误，可以使用' %s '等类型"),
    ERROR_PARAMETER("2200", "参数错误"),
    ERROR_SYNTAX("2201", "请求语法错误"),
    ERROR_CAPTCHA_LACK_PARAM("2202", "缺少获取验证码的必要参数"),
    ERROR_OBJECT_TO_JSONSTRING("2202", "对象转json格式字符串异常"),


    // 账户 错误
    LOCK_LOGIN("3000", "该账户已被锁定"),
    LOCK_LOGIN_PASS_MISTAKE("3001", "该账户因为密码错误次数过多，已被暂时锁定，请30分钟后重试登录"),

    //组织机构 通知公告 应用 错误
    NULL_ORGANIZATION_NAME("3100", "organizationName字段必填！！"),
    ERROR_ORGANIZATION_EXIST("3101", "组织机构名称已存在"),
    NULL_NOTICE_MESSAGEDIGEST("3102", "公告标题不能为空！！"),
    NULL_NOTICE_MESSAGECONTENT("3103", "公告内容不能为空！！"),
    ILLEGAL_STRING("3104", "公告内容包含非法字符' %s '！！请重新编写"),
    ORGANIZATION_NO_REPORT("3105", "您所属的组织机构上报国家后方可上报应用，请您耐心等待！"),
    ORGANIZATION_LACK_FIELD("3110","应用上报失败：请您编辑补全应用信息后再上报"),
    NULL_ANNOUNCEMENT_MESSAGEDIGEST("3106", "通知标题不能为空！！"),
    NULL_ANNOUNCEMENT_MESSAGECONTENT("3107", "通知内容不能为空！！"),
    ILLEGAL_ANNOUNCEMENT_STRING("3108", "通知包含非法字符' %s '！！请重新编写"),
    ERROR_UNIFORMCREDITCODE_EXIST("3109", "统一信用代码已存在,请修改统一信用代码"),

	// oauth 二次验证
	ERROR_OAUTH_USER("3201","验证错误"),
    ERROR_SHIRO_AUTH("3202","鉴权失败，暂无权限执行当前操作"),
    ERROR_SIGN("3203", "签名验证失败"),

    // 其他
    RESOURCE_AGENT("4001", "资源未被代理"),
    UPDATE_ERROR("4002", "更新失败"),
    WITHDRAW_ERROR("4003","撤回失败"),
    NULL_ORGID_ERROR("4004","组织结构id不能为空"),
    NO_ORGID_ERROR("4005","该组织机构没有相关的绑定信息"),

    //数据库错误
    DUPLICATEKEY_ERROR("5001", "存在重复信息，请确认后重新输入！"),

    // 文件类型错误
    NOT_FIND_File("6002", "未找到资源文件"),

    // MQ 错误
    MQ_SEND_ERROR("7001", "发送MQ消息异常"),
    MQ_RECEIVE_ERROR("7002", "接收MQ消息异常"),

    //elasticSearch日志错误
    NO_SUCH_INDEX("7100", "日志中没有' %s '模块"),
    NO_INDEX("7101", "没有指定日志模块"),

    // 业务错误
    ERROR_QueryType("8000", "不存在的查询类型，1-待分配 2-已分配 3-待开库 4-已开库 5-待测试 6-已测试"),
    ERROR_TableType("8001", "不存在的查询类型，0-未上传 1-已上传"),
    ERROR_PREPOSITIONCONFIGURE_TYPE("8002", "前置机类型有误, 0为归集前置机，1为共享前置机，2为全部前置机"),


    // 第三方信息、 账户信息 错误
    ERROR_TOKEN("9900", "TOKEN认证错误"),
    ERROR_USER_OR_PASS("9901", "用户名或密码错误，请注意区分用户名或密码的大小写"),
    ERROR_SINGLE_DEVICE_LOGIN("9902", "你的账号在其他地方被登录，请尽快确定账号安全！"),
    ERROR_CAPTCHA("9903", "验证码错误或失效"),
    ERROR_USER_EXIST("9904", "用戶名已存在,请修改用戶名"),
    ERROR_REQUEST_URL("9990", "第三方URL调用异常"),
    ERROR_CONNECTION("9998", "第三方API调用异常");


	/***************************************************************************/

    private String code;

    private String msg;

    CodeDefined(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getValue() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.msg;
    }

}


