class Comments {
    var canPost: Boolean
    var groupsCanPost: Boolean
    var canClose: Boolean
    var canOpen: Boolean

    constructor(
        count: Long = 0,
        canPost: Boolean = canPost(),
        groupsCanPost: Boolean = groupsCanPost(),
        canClose: Boolean = canClose(),
        canOpen: Boolean = canOpen()
    ) {
        this.canPost = canPost
        this.groupsCanPost = groupsCanPost
        this.canClose = canClose
        this.canOpen = canOpen
        this.count = count
    }

    var count: Long
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}

fun canPost(): Boolean {
    TODO()
}

fun groupsCanPost(): Boolean {
    TODO()
}

fun canClose(): Boolean {
    TODO()
}

fun canOpen(): Boolean {
    TODO()
}