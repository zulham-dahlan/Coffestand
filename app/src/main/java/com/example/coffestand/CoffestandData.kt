package com.example.coffestand

object CoffestandData {
    private val coffestandName = arrayOf(
        "Nguyup Kopi",
        "Demak Coffee",
        "Kopi Pelangi Demak",
        "Kopi Teras 21 Coffee Shop",
        "Kopi Chuseyo Demak",
        "Kopi Ruang Hati",
        "Oppa Milk",
        "Kafe'in Coffee Shop",
        "Raihan Coffee",
        "KV Cafe"
    )

    private val coffestandAddress = arrayOf(
        "Jl. Kyai Palembang No.2, Petengan Selatan, Bintoro, Kec. Demak, Kabupaten Demak, Jawa Tengah 59511",
        "Jl. Kyai Turmudzi No.10, Rw. 1, Bintoro, Kec. Demak, Kabupaten Demak, Jawa Tengah 59511",
        "Jl. Diponegoro No.1, Jogoloyo, Wonosalam, Kabupaten Demak, Jawa Tengah 59571",
        "Jl. Bhayangkara, Petengan Selatan, Bintoro, Kec. Demak, Kupaten Demak, Jawa Tengah 59511",
        "Jl. Teuku Umar No.10, Katonsari, Kec. Demak, Kabupaten Demak, Jawa Tengah 59511",
        "Jl. Sultan Fatah No.1, Bogorame, Bintoro, Kec. Demak, Kabupaten Demak, Jawa Tengah 59515",
        "Jl. Sultan Fatah, Kauman, Bintoro, Kec. Demak, Kabupaten Demak, Jawa Tengah 59511",
        "Jl. Sultan Fatah No.40, Bogorame, Bintoro, Kec. Demak, Kabupaten Demak, Jawa Tengah 59511",
        "4J3P+5WM, Bogorame, Bintoro, Kec. Demak, Kabupaten Demak, Jawa Tengah 59511",
        "Jl. Teuku Umar, Bogorame, Mangunjiwan, Kec. Demak, Kabupaten Demak, Jawa Tengah 59511"
    )

    private val coffestandSchedule = arrayOf(
        "14:00 - 00:00",
        "Buka 24 Jam",
        "10:00 - 23:00",
        "11:00 - 23:00",
        "09:00 – 21:00",
        "10:00 – 23:00",
        "10:00 – 23:00",
        "15:00 – 00:00",
        "10:00 – 23:59",
        "09:00 – 00:00"
    )

    private val coffestandRating = arrayOf(
        "4,6",
        "3,9",
        "4,4",
        "4,4",
        "4,5",
        "4,6",
        "4,3",
        "4,4",
        "4,3",
        "4,9"
    )

    private val coffestandKoordinat = arrayOf(
        "https://goo.gl/maps/S4fnPqoSG4gG8FvZ6",
        "https://goo.gl/maps/d8oBuiiJ6SPWhKog9",
        "https://goo.gl/maps/jrkQZoEvCWbw26eXA",
        "https://goo.gl/maps/ms4wteJxPDtuQuhGA",
        "https://goo.gl/maps/qswJQfFgu3TGfMSw6",
        "https://goo.gl/maps/Q6BnX3fwSV9vqjZd9",
        "https://goo.gl/maps/5QBtoaEkzD4s7YaN9",
        "https://goo.gl/maps/prx4cmZB7PiGC3ZU7",
        "https://goo.gl/maps/H7QXhpmrf3R8BEJH7",
        "https://goo.gl/maps/8AvY2R9k4L4oaKzv5"
    )

    private val coffestandPhoto = intArrayOf(
        R.drawable.nguyup_kopi,
        R.drawable.demak_coffe,
        R.drawable.kopi_pelangi,
        R.drawable.kopi_teras,
        R.drawable.kopi_chuseyo,
        R.drawable.ruang_hati,
        R.drawable.oppa_milk,
        R.drawable.kafein_coffee_shop,
        R.drawable.raihan_coffe,
        R.drawable.kv_cafe
    )

    val listData : ArrayList<Coffestand>
        get() {
            val list = arrayListOf<Coffestand>()
            for (position in coffestandName.indices){
                val coffestand = Coffestand()
                coffestand.name = coffestandName[position]
                coffestand.address = coffestandAddress[position]
                coffestand.openTime = coffestandSchedule[position]
                coffestand.rating = coffestandRating[position]
                coffestand.koordinat = coffestandKoordinat[position]
                coffestand.photo = coffestandPhoto[position]
                list.add(coffestand)
            }
            return list
        }
}