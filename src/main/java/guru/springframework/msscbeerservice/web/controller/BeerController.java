package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID id) {
        //TODO Impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping()
    ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beer) {
        //TODO Impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") UUID id, @RequestBody BeerDto beer) {
        //TODO Impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
