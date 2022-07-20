curl -X DELETE http://localhost:2525/imposters/4545
docker pull bbyars/mountebank:2.7.0
docker run --rm -p 2525:2525 -p 4545:4545 -p 5555:5555 bbyars/mountebank:2.7.0 mb start


curl -i -X POST -H 'Content-Type: application/json' http://localhost:2525/imposters --data '{
   "port":"4545", 
   "protocol":"http", 
   "name":"Mocking server with delay", 
   "stubs": [{
    "predicates": [{  
          "equals": {
            "method": "GET",
            "path": "/getDocument"
          }
      }],
    "responses": [{ 
      "is":{
        "statusCode": 200,
        "headers": {
              "Location": "http://localhost:4545/getDocument"
            },
        "body" : [
            { "RandomParagraph" :"1There once lived an old man and an old woman1 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"2There once lived an old man and an old woman2 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"3There once lived an old man and an old woman3 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"4There once lived an old man and an old woman4 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"5There once lived an old man and an old woman5 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"6There once lived an old man and an old woman6 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"7There once lived an old man and an old woman7 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"8There once lived an old man and an old woman8 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"9There once lived an old man and an old woman9 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
          ,{ "RandomParagraph" :"10There once lived an old man and an old woman10 who were peasants and had to work hard to earn their daily bread. The old man used to go to fix fences and do other odd jobs for the farmers around, and while he was gone the old woman, his wife, did the work of the house and worked in their own little plot of land." }
         ]
     
      ,"behaviors": [
        { "wait": 1000 }
      ] 
      }
      }]
   }]
 }'
