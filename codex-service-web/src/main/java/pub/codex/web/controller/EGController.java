package pub.codex.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pub.codex.common.models.R;

@RestController
public class EGController {

    /**
     * 示例
     */
    @GetMapping("eg-index")
    @ResponseBody
    public R EGIndex() {


        return R.ok();
    }

}
