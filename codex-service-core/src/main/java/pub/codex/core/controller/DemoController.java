package pub.codex.core.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pub.codex.apix.annotations.Api;
import pub.codex.apix.annotations.ApiOperation;
import pub.codex.apix.annotations.group.VG;
import pub.codex.common.models.R;
import pub.codex.db.core.entity.DemoEntity;
import pub.codex.db.core.service.DemoService;

/**
 * 演示表
 *
 * @date 20191129165430
 */
@Api("演示表")
@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    /**
     * 新增接口
     *
     * @param demoEntity
     * @return
     */
    @ApiOperation("新增接口")
    @PostMapping("/demo/add")
    public R add(@RequestBody @Validated(VG.Add.class) DemoEntity demoEntity) {
        demoService.insert(demoEntity);
        return R.ok();
    }

    /**
     * 更新接口
     *
     * @param demoEntity
     * @return
     */
    @ApiOperation("更新接口")
    @PostMapping("/demo/update")
    public R update(@RequestBody @Validated(VG.Update.class) DemoEntity demoEntity) {
        demoService.updateById(demoEntity);
        return R.ok();
    }

    /**
     * 删除接口
     *
     * @param demoEntity
     * @return
     */
    @ApiOperation("删除接口")
    @PostMapping("/demo/delete")
    public R delete(@RequestBody @Validated(VG.Delete.class) DemoEntity demoEntity) {
        demoService.deleteById(demoEntity);
        return R.ok();
    }

    /**
     * 详情接口
     *
     * @param demoEntity
     * @return
     */
    @ApiOperation("详情接口")
    @PostMapping("/demo/detail")
    public R detail(@RequestBody @Validated(VG.Get.class) DemoEntity demoEntity) {
        return R.ok().data(demoService.selectById(demoEntity));
    }

    /**
     * 列表接口
     *
     * @param demoEntity
     * @return
     */
    @ApiOperation("列表接口")
    @PostMapping("/demo/list")
    public R list(@RequestBody @Validated(VG.List.class) DemoEntity demoEntity) {
        return R.ok().data(demoService.selectList(new EntityWrapper<DemoEntity>()));
    }

}