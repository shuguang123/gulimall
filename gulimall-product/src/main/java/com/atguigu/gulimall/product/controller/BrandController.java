package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;

/**
 * 品牌
 *
 * @author aurora
 * @email aurora@gmail.com
 * @date 2024-01-20 19:34:23
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(/*@Validated(value = {AddGroup.class})*/ @RequestBody BrandEntity brand /*, BindingResult result*/) {
        // if (result.hasErrors()) {
        // Map<String, String> map = new HashMap<>();
        // // 1.获取错误的校验结果
        // result.getFieldErrors().forEach((item) -> {
        // // 获取发生错误时的message
        // String message = item.getDefaultMessage();
        // // 获取发生错误的字段
        // String field = item.getField();
        // map.put(field, message);
        // });
        // return R.error(400, "提交的数据不合法").put("data", map);
        // }
        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }
}
