

 class Comments
    (count: Long = 0,
   var canPost :Boolean = canPost (),
   var groupsCanPost: Boolean = groupsCanPost (),
   var canClose: Boolean = canClose(),
   var canOpen : Boolean = canOpen()
 )
 {
    var count =count
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
  }

fun canPost () : Boolean {
    TODO()
}
fun groupsCanPost () : Boolean {
    TODO()
}
fun canClose () : Boolean {
    TODO()
}
 fun canOpen () : Boolean {
     TODO()
 }