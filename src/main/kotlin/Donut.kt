

class Donut(
    var isDonut: Boolean = isDonut(),
    var paidDuration: PaidDuration = PaidDuration ("Нет подписки"),
    var canPublishFreeCopy: Boolean =canPublishFreeCopy (),
    var editMode: String = editMode(),
        )

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
