
fun main() {

    var original = Post (
        id = 1,
        fromId =12,
        ownerId =13,
        createdBy =435,
        date =2021,
        text = "Новая Нетология",
        replyOwnerId = 2423421,
        replyPostId = 234234,
        friendsOnly = friendsOnly(),
        comments = Comments (),
        copyright = Copyright(1,"","Frog",""),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        postType =  postType(),
        signerId =11,
        canPin = canPin(),
        canDelete =canDelete(),
        canEdit = canEdit(),
        isPinned = isPinned(),
        markedAsAds = markedAsAds(),
        isFavorite = isFavorite(),
        donut = Donut (),
        postponedId = 4234,
    )
    WallService.add(original)


}





