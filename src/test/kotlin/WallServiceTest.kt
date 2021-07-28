import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        var posts = emptyArray<Post>()
        var id = 4


        var original = Post(
            id = 0,
            fromId = 12,
            ownerId = 13,
            createdBy = 435,
            date = 2021,
            text = "Новая Нетология",
            replyOwnerId = 2423421,
            replyPostId = 234234,
            friendsOnly = true,
            comments = Comments(0),
            copyright = Copyright(1, "", "Frog", ""),
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
        WallService.add(original)

        fun add(post: Post): Post {
            posts += post
            return posts.last()
            return (post.copy(id = ++id))
        }

        assertTrue(true)
    }
}




