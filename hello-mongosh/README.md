# mongodb

--------------------
## docker 로 mongodb container 실행 및 mongosh 실행
```
docker run --name ndg-mongo -v ~/data:/data/db -d -p 27017:27017 mongo
docker exec -it ndg-mongo mongosh
```
--------------------


- [meta 예시](./meta/meat.md)
- [insertOne 예시](./insert/insertOne.md)
- [insertMany 예시](./insert/insertMany.md)
- [upsert 예시](./upsert/upsert.md)
- [updateOne 예시](./update/updateOne.md)
- [updateMany 예시](./update/updateMany.md)
- [replaceOne 예시](./update/replaceOne.md)
- [findAndUpdate 예시](./update/findOneAndUpdate.md)
- [deleteOne 예시](./delete/deleteOne.md)
- [deleteMany 얘시](./delete/deleteMany.md)
- [array 예시](./array/array.md)