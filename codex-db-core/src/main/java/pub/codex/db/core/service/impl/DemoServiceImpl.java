package pub.codex.db.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import pub.codex.db.core.mapper.DemoMapper;
import pub.codex.db.core.entity.DemoEntity;
import pub.codex.db.core.service.DemoService;


@Service("demoService")
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoEntity> implements DemoService {


}
