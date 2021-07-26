import java.util.*

data class Post(
    val id: Long = 1,
    val fromId: Long = 12,
    var ownerId: Long = 13,
    var createdBy: Long = 33,
    var date: Int = 2021,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean = friendsOnly(),
    var comments: Comments,
    var copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    var postType: String = postType(),
    var signerId: Long=11,
    var canPin: Boolean = canPin(),
    var canDelete: Boolean =canDelete (),
    var canEdit: Boolean = canEdit(),
    var isPinned: Boolean = isPinned (),
    var markedAsAds: Boolean = markedAsAds(),
    var isFavorite: Boolean = isFavorite (),
    var donut: Donut,
    var postponedId: Long = 2,

    )
fun friendsOnly (): Boolean {
        TODO()
}

fun postType ( ) = when ("post") {
    "post" -> TODO()
    "copy" -> TODO()
    "reply" -> TODO()
    "postpone" -> TODO()
    "suggest" -> TODO()
    else ->  "Неверная команда!"
}

fun canPin (): Boolean {
    TODO()
}
fun canDelete ():Boolean{
    TODO()
}
fun canEdit () :Boolean{
    TODO()
}
fun isPinned (): Boolean {
    TODO()
}
fun markedAsAds (): Boolean {
    TODO()
}
fun isFavorite (): Boolean {
    TODO()
}