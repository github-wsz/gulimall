package org.wsz.gulimall.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wsz.gulimall.common.utils.R;
import org.wsz.gulimall.member.entity.MemberEntity;
import org.wsz.gulimall.member.feign.CouponFeignService;

@RestController
@RequestMapping("test")
@RequiredArgsConstructor(onConstructor_ = {@Lazy, @Autowired})
public class TestOpenFeignController {
    private final CouponFeignService couponService;

    @GetMapping("/feign")
    public R t() {
        MemberEntity member = new MemberEntity();
        member.setNickname("韦小宝");
        R r = couponService.memberCoupons();
        Object coupons = r.get("coupons");
        return R.ok().put("member", member).put("coupons", coupons);
    }
}
