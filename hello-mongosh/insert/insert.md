## insertOne, insertMany, deleteOne, deleteMany

---
```
db.movies.insertOne({"title": "Stand by Me"})
db.movies.insertMany([
{"title": "Dark Knight"},
{"title": "인셉션"}
])
db.movies.insertMany([
{"title": "반지의 제왕 - 반지 원정대"},
{"title": "반지의 제왕 - 두개의 탑"},
{"title": "반지의 제왕 - 왕의 귀환"}
], {"ordered": false})
db.movies.insertOne({"_id": 1, "title": "삭제 대상"})
db.movies.deleteOne({"_id": 1})
db.movies.insertMany([
{"title": "deleteManay 대상1", "year": "1999"},
{"title": "deleteManay 대상2", "year": "1999"},
{"title": "deleteManay 대상3", "year": "1999"}
])

db.movies.deleteMany({"year": "1999"})
```