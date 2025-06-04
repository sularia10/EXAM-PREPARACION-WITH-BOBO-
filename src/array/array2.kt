package array

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val array = IntArray(8760) { (-20..45).random() }
    var valid = false
    var numMenu: Int

    do {
        println(
            """
            MENÚ:
            1. Veure les dades
            2. Mostrar la temperatura mitjana
            3. Mostrar quants cops s’ha estat per sota de 0º i el %
            4. Mostrar quants cops s’ha estat per sobre de 30º i el %
            5. Mostrar percentatges per rangs climàtics
            6. Demanar un rang a l’usuari i mostrar el %
            7. Sortir
        """.trimIndent()
        )
        numMenu = scanner.nextInt()

        when (numMenu) {
            1 -> {
                array.forEach { println(it) }
            }

            2 -> {
                val mitjana = array.sum() / array.size.toDouble()
                println("Temperatura mitjana: %.2fº".format(mitjana))
            }

            3 -> {
                val sota = array.count { it < 0 }
                val percent = sota * 100.0 / array.size
                println("Temperatures sota 0º: $sota (${String.format("%.2f", percent)}%)")
            }

            4 -> {
                val sobre = array.count { it > 30 }
                val percent = sobre * 100.0 / array.size
                println("Temperatures sobre 30º: $sobre (${String.format("%.2f", percent)}%)")
            }

            5 -> {
                val rangs = mapOf(
                    "Extremes (-20º a -5º)" to array.count { it in -20..-5 },
                    "Molt fred (-4º a 4º)" to array.count { it in -4..4 },
                    "Fred (5º a 14º)" to array.count { it in 5..14 },
                    "Ideal (15º a 29º)" to array.count { it in 15..29 },
                    "Molta calor (30º a 45º)" to array.count { it in 30..45 }
                )

                println("📊 Percentatges per rang:")
                for ((descripcio, count) in rangs) {
                    val percent = count * 100.0 / array.size
                    println("$descripcio: $count registres (${String.format("%.2f", percent)}%)")
                }
            }

            6 -> {
                var min: Int
                var max: Int
                do {
                    println("Introdueix Tmin i Tmax entre -20 i 45:")
                    min = scanner.nextInt()
                    max = scanner.nextInt()
                    if (min > max || min < -20 || max > 45) {
                        println("Rang incorrecte. Torna-ho a provar.")
                    }
                } while (min > max || min < -20 || max > 45)

                val dinsRang = array.count { it in min..max }
                val percent = dinsRang * 100.0 / array.size
                println("Temperatures dins [$min - $max]: $dinsRang (${String.format("%.2f", percent)}%)")
            }

            7 -> {
                println("Adeu Bambino! ")
                valid = true
            }

            else -> println("Opció no vàlida.")
        }
    } while (!valid)
}
