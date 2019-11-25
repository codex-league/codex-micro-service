package pub.codex.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {

    @Value("${version}")
    String version;


    /**
     * 测试分布式配置
     * @return
     */
    @GetMapping("configTest")
    public String configTest() {
        return version;
    }



//    private Map<String, String> valAttributeDefinition(MongoDatabase definitionDatabase, String collectionName) {
//        Map<String, String> map = new HashMap<>();
//        Map<String, Class<?>> columnMap = new HashMap<>();
//        columnMap.put("id",Integer.class);
//        MongoCollection<Document> attDefCollection = definitionDatabase.getCollection(collectionName);
//        MongoCursor<Document> cursor = attDefCollection.find().iterator();
//        while (cursor.hasNext()) {
//            Document document = cursor.next();
//            validationColumn(collectionName, map, document,columnMap);
//        }
//        return map;
//    }
//
//    private void validationColumn(String collectionName, Map<String, String> map, Document document, Map<String, Class<?>> columnMap) {
//        columnMap.forEach((column,type) ->{
//            if (!(document.get(column) instanceof type.toString())) {
//                combinationMap(collectionName, map, document,column,type);
//            }
//        });
//    }


//    public static void main(String[] args) {
//
//        Map<String, Class<?>> columnMap = new HashMap<>();
//        columnMap.put("id",Integer.class);
//
//
//        int value = 1;
//
//        Class<?> type = Integer.class;
//
//
//        System.out.println(value.getClass().equals(type));
//
//
//    }


}
