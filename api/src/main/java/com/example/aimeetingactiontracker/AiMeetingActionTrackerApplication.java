package com.example.aimeetingactiontracker;
import java.time.LocalDate;import org.springframework.boot.*;import org.springframework.boot.autoconfigure.*;import org.springframework.context.annotation.*;
@SpringBootApplication public class AiMeetingActionTrackerApplication{
 public static void main(String[] args){SpringApplication.run(AiMeetingActionTrackerApplication.class,args);}
 @Bean CommandLineRunner seed(ItemRepository r){return a->{if(r.count()==0){r.save(new Item("Finalize launch checklist","Maya Chen","In Progress",LocalDate.parse("2026-11-04"),"Product","Confirm owners and acceptance criteria for launch."));r.save(new Item("Send design review notes","Noah Patel","Open",LocalDate.parse("2026-11-02"),"Design","Share approved design changes with engineering."));r.save(new Item("Confirm pilot customer dates","Ava Kim","Done",LocalDate.parse("2026-10-28"),"Customer","Pilot schedule confirmed."));}};}
}
