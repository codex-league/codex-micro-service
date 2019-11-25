package pub.codex.common.core.constant;


/**
 * 公共常量
 */
public class CommonConstant {

    /**
     * http 请求类型
     */
    public enum RequestMethod implements IEnum<Integer, String> {
        POST(1, "POST"),
        GET(2, "GET");

        Integer value;
        String desc;

        RequestMethod(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public Integer getValue() {
            return value;
        }

        public String getDesc() {
            return desc;
        }

    }


    /**
     * http 设置参数
     */
    public enum HttpParams implements IEnum<Integer, String> {
        REQUESTPROPERTYCODE(0, "Content-Type"),
        REQUESTPROPERTY(1, "application/json"),
        ENC(2, "UTF-8");

        Integer value;
        String desc;

        public Integer getValue() {
            return value;
        }

        HttpParams(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 是否有效
     */
    public enum IsActive implements IEnum<Integer, String> {
        TRUE(1, "有效"),
        FALSE(2, "无效");

        Integer value;
        String desc;

        IsActive(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public Integer getValue() {
            return value;
        }

        public String getDesc() {
            return desc;
        }

        public static String getLocaleDesc(Integer value) {
            if (value != null) {
                for (IsActive str : IsActive.values()) {

                    if (str.value.intValue() == value.intValue()) {
                        return str.getDesc();
                    }
                }
            }

            return "";
        }
    }


}
