package com.milan.ci_cd_gitgub_actions_examle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {

    @GetMapping("/")
    public String getWelcomeMessage(){
        return "Welcome. This message is proofe that code is working after developing " +
                "in ci/cd flow using Github Actions and Docker";
    }

//    echo "# sb_githubActions_Docke_simple_project" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/milberonja/sb_githubActions_Docke_simple_project.git
//    git push -u origin main

}
