package cn.gpnu.xiaozhudaina.web;

import cn.gpnu.xiaozhudaina.entity.User;
import cn.gpnu.xiaozhudaina.service.UserService;
import cn.gpnu.xiaozhudaina.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserControler {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    private Map<String,Object> login(HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        String username = HttpServletRequestUtil.getString(request, "username");
        String password = HttpServletRequestUtil.getString(request, "password");
        HttpSession session = request.getSession();
        //非空判断
        if (username != null && password != null && !("".equals(username)) && !("".equals(password))){
            User user = userService.login(username, password);
            if (user != null){
                modelMap.put("success",true);
                session.setAttribute("currentUser",user);
                return modelMap;
            }else {
                modelMap.put("success",false);
                modelMap.put("errMsg","账号或密码错误，请重新填写。");
            }
        }else{
            modelMap.put("success",false);
            modelMap.put("errMsg","账号或密码不能为空");
        }
        return modelMap;
    }
}
