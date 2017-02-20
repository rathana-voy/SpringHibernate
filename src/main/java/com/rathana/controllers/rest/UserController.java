package com.rathana.controllers.rest;

import com.rathana.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by RATHANA on 28-Jan-17.
 */

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @RequestMapping("")
    public ResponseEntity<Map<String,Object>> getUsers(){
        Map<String ,Object> map=new HashMap<>();

        ArrayList<User> users=new ArrayList<>();

        try{

            if(users!=null){
                map.put("CODE",200);
                map.put("DATA",users);
                map.put("STATUS",true);
                map.put("MESSAGE","GET USER SUCCESS");
            }else{
                map.put("CODE",202);
                map.put("DATA",null);
                map.put("STATUS",true);
                map.put("MESSAGE","GET USER UNSUCCESS");
            }
        }catch (Exception e){
            map.put("CODE",500);
            map.put("DATA",null);
            map.put("STATUS",false);
            map.put("MESSAGE","HAVE AN ERROR");
            e.printStackTrace();
        }

        return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
    }
}
