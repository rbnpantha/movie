package com.rbn.programmingblog.api;

import com.rbn.programmingblog.Business.Service.ContentBusinessService;
import com.rbn.programmingblog.Domain.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;
import java.util.List;

@RestController
@RequestMapping({"/content"})
public class ContentResources {

    @Autowired
    private ContentBusinessService contentBusinessService;

    @RequestMapping("/all")
    public List<Content> findAll( ) {
        return  contentBusinessService.findAll();

    }

    @RequestMapping("/{id}")
    public Content getContentById(@PathVariable("id") Integer id) {
        System.out.println("The question id received by REST is : " + id);
        return   contentBusinessService.findById(id);

    }

    @POST
    @RequestMapping("/add")
    public Content createContent(@RequestBody Content content){
        contentBusinessService.createContent(content);
        return content;
    }

    @RequestMapping(name="/delete/{id}", method = RequestMethod.DELETE)
    public Content deleteContentById(@PathVariable("id") Integer id) {
        System.out.println("The question id received by REST is : " + id);
        return   contentBusinessService.findById(id);

    }

    @RequestMapping(name="/update", method = RequestMethod.PUT)
    public void updateContent(@RequestParam Content content){

    }
}



