package com.example.gitaction.action;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/action")
public class ActionController {


        @RequestMapping("/plus")
        public Long hello() {
            Long a = 1L;
            Long b = 2L;

            Long result = a + b;
            return result;
        }

        @RequestMapping("/minus")
        public Long minus() {
            Long a = 10L;
            Long b = 2L;

            Long result = a - b;
            return result;
        }
}
