object WallService {

    var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        posts += post
      return  posts.last()
        post.copy(id = ++id)
    }
    fun update(post: Post): Boolean {
        for ((id, post) in posts.withIndex())
            if (post.id == id) true
        post.copy(
            fromId = 142,
            ownerId = 143,
            createdBy = 435,
            text = "Тест",
            replyOwnerId = 2423421,
            replyPostId = 234234,
            friendsOnly = true,
            comments = Comments(0),
            copyright = Copyright(1, "", "коля", ""),
            likes = Likes(0),
            reposts = Reposts(112),
            views = Views(0),
            postType = ("post"),
            signerId = 11,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = Donut(false, "Нет подписки", false, "all", null),
            postponedId = 4234,
        )
        if (post.id != id) false
        return false
    }
}

