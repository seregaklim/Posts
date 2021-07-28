object WallService {
    var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        posts += post
        return posts.last()
        return (post.copy(id = ++id))
    }

    fun update(post: Post) {
        for ((index, post) in posts.withIndex()) {
            when {
                (post.id == id) -> posts[index] = post.copy(

                    text = "new text",
                    replyOwnerId = 4,
                    replyPostId = 4,
                    friendsOnly = true,
                    comments = Comments(0),
                    copyright = Copyright(0, "", "Frog", ""),
                    likes = Likes(0),
                    reposts = Reposts(112),
                    views = Views(0),
                    postType = ("post"),
                    signerId = 6,
                    canPin = true,
                    canDelete = true,
                    canEdit = true,
                    isPinned = true,
                    markedAsAds = true,
                    isFavorite = true,
                    donut = Donut(false, "Нет подписки", false, "all", null),
                    postponedId = 4234,
                )
                else -> false
            }
        }
    }
}



