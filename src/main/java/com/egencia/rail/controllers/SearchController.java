package com.egencia.rail.controllers;

import com.egencia.rail.Models.Solution;
import com.egencia.rail.repositories.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by rnair on 11/20/15.
 */
@RestController
public class SearchController {

    @Autowired
    SearchRepository repository;

    @RequestMapping(value = "/clearValues", method = RequestMethod.GET)
    public String populateRepository() {
        repository.deleteAll();
        return "DB Values cleared";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Solution>> getSolutions() {
        List<Solution> solutions = repository.findAll();
        return new ResponseEntity<List<Solution>>(solutions, HttpStatus.OK);
    }

    @RequestMapping(value = "/createSolution" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, headers = "content-type=application/x-www-form-urlencoded")
    public ResponseEntity<Solution> createSolution(@RequestBody Solution solution){
        Solution newSolution = repository.save(solution);
        if(newSolution != null) {
            return new ResponseEntity<Solution>(newSolution, HttpStatus.OK);
        } else {
            return new ResponseEntity<Solution>(solution, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView newSolution() {
       return new ModelAndView("index");
    }
}
