# array 예시

---

## 요소 추가하기
### $push

- 배열 끝에 추가
---
```
db.blog.posts.findOne()
{
  _id: ObjectId("653dfc427ac72954efac02cb"),
  title: 'A Blog Post',
  content: 'abc',
  author: { name: 'joe schmoe', email: 'joe@example.com' }
}
db.blog.posts.updateOne({"title": "A Blog Post"}, {$push : {comments : {name: "joe", email: "joe@example.com", content: "nice post."}}})
{
  acknowledged: true,
  insertedId: null,
  matchedCount: 1,
  modifiedCount: 1,
  upsertedCount: 0
}
db.blog.posts.findOne()
{
  _id: ObjectId("653dfc427ac72954efac02cb"),
  title: 'A Blog Post',
  content: 'abc',
  author: { name: 'joe schmoe', email: 'joe@example.com' },
  comments: [ { name: 'joe', email: 'joe@example.com', content: 'nice post.' } ]
}

```
### $each $push

- 한번에 여러건 배열로 push 
---
```
db.stock.ticker.updateOne({_id: "GOOG"}, {$push: {hourly: {$each : [562.776, 562.790, 559.123]}}})
{
  acknowledged: true,
  insertedId: null,
  matchedCount: 1,
  modifiedCount: 1,
  upsertedCount: 0
}
db.stock.ticker.findOne()
{ _id: 'GOOG', hourly: [ 562.776, 562.79, 559.123 ] }

```