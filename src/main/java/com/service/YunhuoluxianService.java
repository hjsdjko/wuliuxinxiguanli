package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YunhuoluxianEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 运货路线 服务类
 */
public interface YunhuoluxianService extends IService<YunhuoluxianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}