package org.wsz.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.wsz.gulimall.common.utils.R;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @GetMapping("coupon/coupon/member/list")
    R memberCoupons();
}
