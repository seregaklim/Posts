class Donut {
    var isDonut: Boolean
    var paidDuration: String
    val placeholder: Object
    var canPublishFreeCopy: Boolean
    var editMode: String

    constructor(
        isDonut: Boolean = isDonut(),
        paidDuration: String = ("Нет подписки"),
        canPublishFreeCopy: Boolean = canPublishFreeCopy(),
        editMode: String = editMode(),
        placeholder: Object?,
    ) {
        this.isDonut = isDonut
        this.paidDuration = paidDuration
        this.canPublishFreeCopy = canPublishFreeCopy
        this.editMode = editMode
        this.placeholder = placeholder!!
    }
}

fun isDonut(): Boolean {
    TODO()
}

fun canPublishFreeCopy(): Boolean {
    TODO()
}

fun editMode() = when ("all") {
    "all" -> TODO()
    "duration" -> TODO()
    else -> "Неизвестное значение"
}
