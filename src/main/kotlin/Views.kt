class Views (
     views :Long =0,
        )
{
    var views = views
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}
