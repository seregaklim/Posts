import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {
    @Test
    fun updateExisting() {
        val service = WallService()
//    заполняем несколькими постами
        service.update(
            Post(
                id = 1,
                fromId = 0,
                ownerId = 0,
                createdBy = 0,
                date = 2021,
                text = "Новая Нетология",
                replyOwnerId = 0,
                replyPostId = 0,
                friendsOnly = true,
                comments = Comments(0),
                copyright = Copyright(0, "", "Frog", ""),
                likes = Likes(0),
                reposts = Reposts(0),
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
        )
        //создаём информацию об обновлении

        //создаём информацию об обновлении
        val update = Post(
            id =1,
            fromId = 1422,
            ownerId = 142,
            date = 2021,
            createdBy = 4322,
            text = "Тест2",
            replyOwnerId = 24234221,
            replyPostId = 2342324,
            friendsOnly = true,
            comments = Comments(0),
            copyright = Copyright(1, "", "юля", ""),
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
            postponedId = 4234,)

        // выполняем целевое действие
            service.add(update)
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun notUpdateExisting() {
        val service = WallService()

        //    заполняем несколькими постами
        service.update(
            Post(
                id = 1,
                fromId = 0,
                ownerId = 0,
                createdBy = 0,
                date = 2021,
                text = "Новая Нетология",
                replyOwnerId = 0,
                replyPostId = 0,
                friendsOnly = true,
                comments = Comments(0),
                copyright = Copyright(0, "", "Frog", ""),
                likes = Likes(0),
                reposts = Reposts(0),
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
        )
        //создаём информацию об обновлении
        val update = Post(
            id =14,
            date = 2021,
            text = ("Тест"),
            replyOwnerId = 3163,
            replyPostId = 23132,
            friendsOnly = true,
            comments = Comments(0),
            copyright = Copyright(0, "", "", ""),
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
        // выполняем целевое действие
        service.add(update)
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
    @Test
    fun addExisting() {
        val service = WallService ()
        //    заполняем несколькими постами
        service.add(
            Post(
                id = 1,
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
                donut = Donut(false, "Нет подписки", false, "all" , Placeholder),
                postponedId = 4234,
            )
        )
        var original =
            Post(
                id =0,
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
                donut = Donut(false, "Нет подписки", false, "all" , Placeholder),
                postponedId = 4234,
            )
        service.add(original)
        assertEquals(0, original.id)
    }
}