# mini-expression-server: MiniExpression server

minimalistic implementation for http://hackmd.diverse-team.fr/s/HkPqyy8-G#


# Test

start server

on command line send requests such as :

```
curl -H "Content-Type: application/json" -X POST -d '{"login":"xyz","pass":"xyz"}' http://localhost:8080/login
curl -H "Content-Type: application/json" -X POST -d '{"login":"admin","pass":"admin"}' http://localhost:8080/login
```


```
curl -H "Content-Type: application/json" -X POST -d '{"token":"*GENERATEDTOKEN*","expression": "(1+1.1)*2"}' http://localhost:8080/compute
curl -H "Content-Type: application/json" -X POST -d '{"token":"*GENERATEDTOKEN*","expression": "1 + 1 == 2"}' http://localhost:8080/compute
```
