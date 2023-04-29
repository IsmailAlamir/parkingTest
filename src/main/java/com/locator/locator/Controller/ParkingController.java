package com.locator.locator.Controller;


import com.locator.locator.Models.Parking;
import com.locator.locator.Repository.ParkingRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ParkingController {

    @Autowired
    ParkingRepository parkingRepository;

    @GetMapping("/parkings")
    public String getAllParkings(Model model){

        List<Parking> allParkings = (ArrayList)parkingRepository.findAll();
        model.addAttribute("allParkings", allParkings);

        return "parking.html";

    }

    @PostMapping("/parkings")
    public ResponseEntity addParking( Parking parking){
        parkingRepository.save(parking);
        return new ResponseEntity(parking, HttpStatus.ACCEPTED);

    }



}
