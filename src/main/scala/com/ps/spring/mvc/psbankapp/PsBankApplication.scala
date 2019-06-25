package com.ps.springmvc.psbankapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PsBankApplication {

}
object PsBankApplication {
  def main(args: Array[String]): Unit = {

    SpringApplication.run(classOf[PsBankApplication], args: _*)

    /*

        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-tomcat</artifactId>
        </dependency>
            <dependency>
                <groupId>com.h2database</groupId>
                <artifactId>h2</artifactId>
            </dependency>
     */

  }

}
