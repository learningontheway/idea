package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.Date;

@Controller
public class helloword {

    private static final String SUCCESS = "success";
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);

        //添加模型数据到 ModelAndView 中.
        modelAndView.addObject("time", new Date());

        return modelAndView;
    }
    @RequestMapping("/helloworld")
    public String helloworld(){
        System.out.println("helloworld");
        return "success";
    }
    @RequestMapping("/helloworld/*/abc")
    public String helloworld2(){
    //    System.out.println("helloworld2");
        return "success";
    }

}
