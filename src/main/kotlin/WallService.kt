class WallService {

    var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        posts += post.copy(id = ++id)
        return posts.last()
    }
    fun update(updatedPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == updatedPost.id) {
                posts[index] = updatedPost.copy(
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
                    donut = Donut(false, "Нет подписки", false, "all", Placeholder),
                    postponedId = 4234,
                )
                return true
            }
        }
       return false
    }
}