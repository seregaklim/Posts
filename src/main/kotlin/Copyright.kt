class Copyright(
    id: Long = 0,
    var link: String,
    var name: String = "Frog",
    var type: String,
) {
    var id = id
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}