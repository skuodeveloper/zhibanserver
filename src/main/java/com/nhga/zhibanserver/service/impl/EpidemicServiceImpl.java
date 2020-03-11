package com.nhga.zhibanserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nhga.zhibanserver.entity.Epidemic;
import com.nhga.zhibanserver.entity.Zhiban;
import com.nhga.zhibanserver.mapper.EpidemicMapper;
import com.nhga.zhibanserver.mapper.ZhibanMapper;
import com.nhga.zhibanserver.service.IEpidemicService;
import com.nhga.zhibanserver.service.IZhibanService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-28
 */
@Service
public class EpidemicServiceImpl extends ServiceImpl<EpidemicMapper, Epidemic> implements IEpidemicService {

}
