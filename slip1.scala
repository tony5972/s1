object slip1
{
    def main(args: Array[String])
    {
        var str=""
        var emp= Map("mr.joshi"->"management",
                    "mr.rathi"->"management",
                    "mr.stark"->"technical",
                    "mr.banner"->"h.r",
                    "mr.quill"->"management",
                    "mr.parker"->"marketing")

    
    println("key        values")
        for ((k,v) <- emp)
        println(k,v)

    println("person having same department as mr.joshi")
        for ((k,v) <- emp)
        {
            if(k=="mr.joshi")
            {
                    str=v
            }
 for ((k,v) <- emp)
        {
            if(v==str)
            {
                println(k,v)
            }
        }
    }
}
}
