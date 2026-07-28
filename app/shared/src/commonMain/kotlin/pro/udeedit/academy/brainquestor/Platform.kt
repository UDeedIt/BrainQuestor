package pro.udeedit.academy.brainquestor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform