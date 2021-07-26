 class Likes (
 count: Long =1 ,
var userLikes: Boolean = userLikes(),
var canLike:Boolean = canLike (),
var canPublish: Boolean = canPublish(),
        )
{
        var count = count
                set(value) {
                        if (value < 0) {
                                return
                        }
                        field = value
                }
}

fun userLikes () : Boolean {
        TODO()
}
fun canLike () : Boolean {
        TODO()
}
fun canPublish () : Boolean {
        TODO()
}