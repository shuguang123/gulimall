package com.atguigu.gulimall.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.gulimall.product.dao.BrandDao;
import com.atguigu.gulimall.product.service.BrandService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    BrandDao brandDao;

    @Test
    public void contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setBrandId(1L);
        // brandEntity.setDescript("华为手机的描述修改");
        // brandEntity.setName("华为mate");
        // brandService.updateById(brandEntity);
        // List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 2L));
        // List<BrandEntity> list =
        // brandDao.selectList(new LambdaQueryWrapper<BrandEntity>().eq(BrandEntity::getBrandId, 2L));
        // list.forEach(System.out::println);
    }

}
