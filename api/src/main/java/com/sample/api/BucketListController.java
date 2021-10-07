package com.sample.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BucketListController {

    private List<BucketList> myBucketList = new ArrayList();
    private List<ProductDetails> myProducDetails = new ArrayList();
    private final AtomicLong counter = new AtomicLong();

    public BucketListController(){
        myBucketList.add(new BucketList(counter.incrementAndGet(), "Visit Colosseum in Rome"));
        
        // FOR SKU PRODUCT
        myProducDetails.add(new ProductDetails(123456,"Flare-leg",456789,"Jeans Mens","Jeans-Mens-Flare-leg","フレアレッグ"));

    }

    @GetMapping(value = "/")
    public ResponseEntity index() {
        return ResponseEntity.ok(myBucketList);
    }

    @GetMapping(value = "/bucket")
    public ResponseEntity getBucket(@RequestParam(value="id") Long id) {
        BucketList itemToReturn = null;
        for(BucketList bucket : myBucketList){
            if(bucket.getId() == id)
                itemToReturn = bucket;
        }

        return ResponseEntity.ok(itemToReturn);
    }

    @PostMapping(value = "/")
    public ResponseEntity addToBucketList(@RequestParam(value="name") String name) {
        myBucketList.add(new BucketList(counter.incrementAndGet(), name));
        return ResponseEntity.ok(myBucketList);
    }

    // 商品検索 POST REQUEST 1 
    @PostMapping(value = "/rest/fits")
    public ResponseEntity shohinKensaku(@RequestParam(required = false) String UserMark,
    		@RequestParam(required = false) String Khkbn,
    		@RequestParam(required = false) String Searchkey,
    		@RequestParam(required = false) String latitude,
    		@RequestParam(required = false) String longitude
    		) {
        return ResponseEntity.ok(myProducDetails);
    }

    // 商品検索 POST REQUEST 2
    // Just name change
    @PostMapping(value = "/rest/fits1")
    public ResponseEntity shohinKensaku1(@RequestParam(value="UserMark") String UserMark,
    		@RequestParam(value="Khkbn") String Khkbn,
    		@RequestParam(value="Searchkey") String Searchkey,
    		@RequestParam(required = false) String latitude,
    		@RequestParam(required = false) String longitude
    		) {
        return ResponseEntity.ok(myProducDetails);
    }
   
    // 商品検索 POST REQUEST 3
    // ALL Five param are mandetory
    @PostMapping(value = "/rest/fits2")
    public ResponseEntity shohinKensaku2(@RequestParam(value="UserMark") String UserMark,
    		@RequestParam(value="Khkbn") String Khkbn,
    		@RequestParam(value="Searchkey") String Searchkey,
    		@RequestParam(value="latitude") String latitude,
    		@RequestParam(value="longitude") String longitude
    		) {
        return ResponseEntity.ok(myProducDetails);
    }
    
    
    
    
    
    
    
//    @PutMapping(value = "/")
//    public ResponseEntity updateBucketList(@RequestParam(value="name") String name, @RequestParam(value="id") Long id) {
//        myBucketList.forEach(bucketList ->  {
//            if(bucketList.getId() == id){
//                bucketList.setName(name);
//            }
//        });
//        return ResponseEntity.ok(myBucketList);
//    }
//
//    @DeleteMapping(value = "/")
//    public ResponseEntity removeBucketList(@RequestParam(value="id") Long id) {
//        BucketList itemToRemove = null;
//        for(BucketList bucket : myBucketList){
//            if(bucket.getId() == id)
//                itemToRemove = bucket;
//        }
//
//        myBucketList.remove(itemToRemove);
//        return ResponseEntity.ok(myBucketList);
//    }
    
}