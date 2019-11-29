package pub.codex.common.core.models;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pub.codex.common.core.exceptions.CodeDefined;
import pub.codex.common.core.exceptions.RException;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 */
public class R extends HashMap<String, Object> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final long serialVersionUID = 1L;

    public R() {
        put("code", CodeDefined.SUCCESS.getValue());
        put("msg", CodeDefined.SUCCESS.getDesc());
    }


    public static R error(String code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }


    public static R error() {
        return error(CodeDefined.ERROR.getValue(), CodeDefined.ERROR.getDesc());
    }

    public static R error(String msg) {
        return error(CodeDefined.ERROR.getValue(), msg);
    }

    public static R error(CodeDefined codeDefined) {
        return error(codeDefined.getValue(), codeDefined.getDesc());
    }

    public static R error(RException ex) {
        return error(ex.getCode(), ex.getMsg());
    }


    public static R ok() {
        return new R();
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }


    public static R valid(String msg) {
        R r = new R();
        r.put("code", CodeDefined.VALID.getValue());
        r.put("msg", msg);
        return r;
    }


    public R data(Object value) {
        super.put("data", value);
        return this;
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
//
//    /**
//     * list转为page，返回分页数据
//     *
//     * @param list
//     * @param pageSize
//     * @param currentPage
//     * @return
//     */
//    public R list2page(List<?> list, int pageSize, int currentPage) {
//        if (list.size() <= 0) {
//            Map<String, Object> resultMap = new HashMap<>();
//            resultMap.put("current", currentPage);
//            resultMap.put("size", pageSize);
//            resultMap.put("pages", 1);
//            resultMap.put("total", 0);
//            resultMap.put("records", new ArrayList<>());
//            super.put("data", resultMap);
//        } else {
//            //分页后的list
//            List<?> pageList = PageUtil.pageBySubList(list, pageSize, currentPage);
//            //总条数
//            int totalCount = list.size();
//            //总页数
//            int pageCount = 0;
//
//            int m = totalCount % pageSize;
//            if (m > 0) {
//                pageCount = totalCount / pageSize + 1;
//            } else {
//                pageCount = totalCount / pageSize;
//            }
//
//            Map<String, Object> resultMap = new HashMap<>();
//            resultMap.put("current", currentPage);
//            resultMap.put("size", pageSize);
//            resultMap.put("pages", pageCount);
//            resultMap.put("total", totalCount);
//            resultMap.put("records", pageList);
//            super.put("data", resultMap);
//        }
//        return this;
//    }
//
//
//    /**
//     * 获取结果，如果code不等于 SUCCESS，则抛出异常
//     *
//     * @param clazz 转换的对象
//     *              需要返回对象 = 对象.class
//     *              需要返回数组 = ArrayList.class
//     *              需要返回整型 = Integer.class
//     *              需要返回字符 = String.class
//     *              <p>
//     *              上下的自己脑补
//     * @param <T>
//     * @return
//     */
//    public <T> T getResult(Class<T> clazz) {
//
//        isAssert();
//
//        try {
//
//            if (super.get("data") instanceof Map) {
//                T t = clazz.newInstance();
//                return (T) BeanUtils.Map2Bean(t, (LinkedHashMap) super.get("data"));
//            }
//
//            if (!(super.get("data") instanceof Map)) {
//                return (T) super.get("data");
//            }
//
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//
//            throw new RException(super.get("data").getClass().getName() + " 类型不能转换成" + clazz.getName(),
//                    CodeDefined.RESPONSE_ERROR.getValue());
//
//        }
//
//        return null;
//    }
//
//    /**
//     * 获取 OBJECT 结果，如果code不等于 SUCCESS，则抛出异常
//     *
//     * @return
//     */
//    public Object getResultObject() {
//        isAssert();
//
//        return super.get("data");
//    }
//
//
//    /**
//     * 获取 LinkedHashMap 结果，如果code不等于 SUCCESS，则抛出异常
//     *
//     * @return
//     */
//    public LinkedHashMap getResultMap() {
//        isAssert();
//
//        return (LinkedHashMap) super.get("data");
//    }
//
//
//    /**
//     * 断言验证
//     */
//    public void isAssert() {
//        if (!super.get("code").equals(CodeDefined.SUCCESS.getValue())) {
//            throw new RException((String) super.get("msg"), (String) super.get("code"));
//        }
//
//
//    }

}
