curl -X DELETE http://localhost:2525/imposters/4545
docker pull bbyars/mountebank:2.7.0
docker run --rm -p 2525:2525 -p 4545:4545 -p 5555:5555 bbyars/mountebank:2.7.0 mb start


curl -X DELETE http://localhost:2525/imposters/4545
docker pull bbyars/mountebank:2.7.0
docker run --rm -p 2525:2525 -p 4545:4545 -p 5555:5555 bbyars/mountebank:2.7.0 mb start


curl -i -X POST -H 'Content-Type: application/json' http://localhost:2525/imposters --data '{
  "port": 4545,
   "protocol": "http",
   "stubs": [
     {
       "responses": [
         {
           "is": { "body": {"message":"This is MounteBank Payload Just some message"} },
           "behaviors": [
             { "wait": 0 }
           ]
         }
       ]
     }
   ]
 }'
