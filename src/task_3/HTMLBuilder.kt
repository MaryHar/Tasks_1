sealed interface HtmlElement {
    override fun toString(): String
}

data class HtmlText(private val value: String) : HtmlElement {
    override fun toString() = value
}

data class HtmlTag(
    private val name: String,
    private val attributes: Map<String, String> = emptyMap(),
    private val children: List<HtmlElement> = emptyList()
) : HtmlElement {
    override fun toString(): String {
        val attrs = if (attributes.isNotEmpty()) {
            attributes.entries.joinToString(" ", " ") { (k, v) -> "$k=\"$v\"" }
        } else {
            ""
        }
        val content = children.joinToString("")
        return "<$name$attrs>$content</$name>"
    }
}

class HtmlBuilder {
    private val elements: MutableList<HtmlElement> = mutableListOf()

    fun text(value: String) {
        elements.add(HtmlText(value))
    }

    fun tag(name: String, attributes: Map<String, String> = emptyMap(), init: HtmlBuilder.() -> Unit = {}) {
        val builder = HtmlBuilder()
        builder.init()
        elements.add(HtmlTag(name, attributes, builder.elements))
    }

    fun build(): List<HtmlElement> = elements
}

fun html(init: HtmlBuilder.() -> Unit): HtmlElement {
    val builder = HtmlBuilder()
    builder.init()
    return HtmlTag("html", children = builder.build())
}

// DSL functions for common HTML tags
fun HtmlBuilder.head(init: HtmlBuilder.() -> Unit) {
    tag("head", init = init)
}

fun HtmlBuilder.body(init: HtmlBuilder.() -> Unit) {
    tag("body", init = init)
}

fun HtmlBuilder.div(attributes: Map<String, String> = emptyMap(), init: HtmlBuilder.() -> Unit = {}) {
    tag("div", attributes, init)
}

fun HtmlBuilder.p(attributes: Map<String, String> = emptyMap(), init: HtmlBuilder.() -> Unit = {}) {
    tag("p", attributes, init)
}

fun HtmlBuilder.h1(attributes: Map<String, String> = emptyMap(), init: HtmlBuilder.() -> Unit = {}) {
    tag("h1", attributes, init)
}

data class User(val name: String, val age: Int, val email: String)

fun HtmlBuilder.userList(users: List<User>) {
    div(attributes = mapOf("class" to "user-list")) {
        users.forEach { user ->
            div(attributes = mapOf("class" to "user-info")) {
                h1 {
                    text(user.name)
                }
                p {
                    text("Age: ${user.age}")
                }
                p {
                    text("Email: ${user.email}")
                }
            }
        }
    }
}

// Main function
fun main() {
    val users = listOf(
        User("Mary", 22, "mary@example.com"),
        User("Mary", 22, "mary@example.com"),
        User("Mary", 22, "mary@example.com")
    )

    // Create the HTML document
    val htmlDocument = html {
        head {
            tag("title") {
                text("User Information Example")
            }
        }
        body {
            h1 {
                text("User Information")
            }
            userList(users) // Call the function to generate the user list
        }
    }

    // Print the generated HTML
    println(htmlDocument)
}
