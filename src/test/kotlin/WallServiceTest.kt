import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {
    @Test
    fun updateExisting() {
        val service = WallService

        //    заполняем несколькими постами
        service.update(
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
                donut = Donut(false, "Нет подписки", false, "all", null),
                postponedId = 4234,
            )
        )
        //создаём информацию об обновлении
        val update = Post(
            id = 1,
            date = 2021,
            text = ("Тест"),
            replyOwnerId = 3163,
            replyPostId = 23132,
            friendsOnly = true,
            comments = Comments(4),
            copyright = Copyright(1, "", "", ""),
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
        // выполняем целевое действие
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun notUpdateExisting() {
        val service = WallService

        //    заполняем несколькими постами
        service.update(
            Post(
                id = 2,
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
        )
        //создаём информацию об обновлении
        val update = Post(
            id = 1,
            date = 2021,
            text = ("Тест"),
            replyOwnerId = 3163,
            replyPostId = 23132,
            friendsOnly = true,
            comments = Comments(4),
            copyright = Copyright(1, "", "", ""),
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
        // выполняем целевое действие
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @Test
    fun addExisting() {


        val service = WallService

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
                donut = Donut(false, "Нет подписки", false, "all", null),
                postponedId = 4234,
            )
        )
        var original =
            Post(
                id = 2,
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

        assertEquals(0, original.id)
    }
}