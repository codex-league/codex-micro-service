package pub.codex.db.core.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import pub.codex.db.core.mapper.DemoMapper;
import pub.codex.db.core.entity.DemoEntity;
import pub.codex.db.core.service.DemoService;


@Service("demoService")
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoEntity> implements DemoService {


}
