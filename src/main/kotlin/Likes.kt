class Likes(
    count: Int = 0,
    var userLikes: Boolean = true,
    var canLike: Boolean = true,
    var canPublish: Boolean = true,
) {
    var count = count
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}

fun userLikes(): Boolean {
    TODO()
}

fun canLike(): Boolean {
    TODO()
}

fun canPublish(): Boolean {
    TODO()
}