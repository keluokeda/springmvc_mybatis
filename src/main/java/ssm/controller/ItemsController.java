package ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ssm.controller.vaildation.Vaildation;
import ssm.po.*;
import ssm.service.ItemsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    //    method 限时请求方式
    @RequestMapping(value = "query", method = {RequestMethod.GET, RequestMethod.POST})
    public void queryItems(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
//                           @RequestParam(value = "id",required = false) String itemId
                           ItemsQueryVo in//post id=10&name=hankuke&price=100 可以 自动绑定
                           //如果是po中套有 po 则 使用 itemsCustom.name=hanha 来 完成 映射
//            , @RequestParam(value = "pageNo", required = false) int pageNo
//                           Validated 表示需要校验 BindingResult接收校验出错的信息
//                           配对 出现并且 顺序 固定
//                           value 指定 校验分组
                           , @Validated(value = {Vaildation.class}) UserCustom userCustom, BindingResult result
    ) throws Exception {
            if (result.hasErrors()){
                List<ObjectError> list = result.getAllErrors();
            }
//        System.out.println(in);
//        System.out.println(pageNo);
        Items items = itemsService.selectByPrimaryKey(1);
        //该方法必须 写在getWriter 之前才有效果
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("application/json;charset=utf-8");

        httpServletResponse.getWriter().println(items.toString());
        if (in != null && in.getItemsCustom() != null)
            httpServletResponse.getWriter().println(in.toString());
    }


    @RequestMapping(value = "json" ,method = {RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody User json(@RequestBody(required = false) User user, HttpSession httpSession){
        if (user==null){
            User user1=new User(1,"default","default");
            return user1;
        }
        System.out.println(user);
        return user;
    }

}
