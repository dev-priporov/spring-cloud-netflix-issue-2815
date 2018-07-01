# spring-cloud-netflix-issue-2815
this is a reproducing of issue: https://github.com/spring-cloud/spring-cloud-netflix/issues/2815

request to reproduce:
```
curl -X POST \
  'http://127.0.0.1:8089/test?uid=123456' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F uid=654321
  -F 'photo=@/test.jpg' 
  ```

it has 2 uid params = [123456,654321]
launch 2 modules, make the request and see that 654321 will be removed and you will not see that in mockServer
