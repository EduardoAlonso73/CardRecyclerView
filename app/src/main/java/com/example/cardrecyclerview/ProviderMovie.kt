package com.example.cardrecyclerview


class ProviderMovie {

    companion object{
         /*fun populateBooks():MutableList<Book> {
            val book1 = Book(
                R.drawable.abtm,
                "Victoria Devine",
                "AGELESS BODY, TIMELESS MIND",
                "The definitive text on the healing powers of the mind/body connection. In Ageless Body, " +
                        "Timeless Mind, world-renowned pioneer of integrative medicine " +
                        "Deepak Chopra goes beyond ancient mind/body wisdom and " +
                        "current anti-ageing research to show that you do not have to " +
                        "grow old. With the passage of time, you can retain your physical " +
                        "vitality, creativity, memory and self-esteem. Based on the theories" +
                        " of Ayurveda and groundbreaking research, Chopra reveals how we can" +
                        " use our innate capacity for balance to direct the way our bodies " +
                        "metabolize time and achieve our unbounded potential."
            )
            bookList.add(book1)

            val book2 = Book(
                R.drawable.tmom,
                "Amanda Lohrey",
                "THE MIRACLE OF MINDFULNESS",
                "This is the definitive book on mindfulness from the beloved Zen master and Nobel Peace Prize nominee Thich Nhat Hanh. With his signature clarity and warmth, he shares practical exercises and anecdotes to help us arrive at greater self-understanding and peacefulness, whether we are beginners or advanced students.\n" + "\n" + "Beautifully written, The Miracle of Mindfulness is the essential guide to welcoming presence in your life and truly living in the moment from the father of mindfulness.\n"
            )
            bookList.add(book2)

            val book3 = Book(
                R.drawable.trlt,
                "M. Scott Peck",
                "THE ROAD LESS TRAVELLED",
                "A timeless classic in personal development, The Road Less Travelled is a landmark work that has inspired millions. Drawing on the experiences of his career as a psychiatrist, Scott Peck combines scientific and spiritual views to guide us through the difficult, painful times in life by showing us how to confront our problems through the key principles of discipline, love and grace.Teaching us how to distinguish dependency from love, how to become a more sensitive parent and how to connect with your true self, this incredible book is the key to accepting and overcoming life's challenges and achieving a higher level of self-understanding."
            )
            bookList.add(book3)

            val book4 = Book(
                R.drawable.iewu,
                "Colleen Hoover",
                "IT ENDS WITH US",
                "'A brave and heartbreaking novel that digs its claws into you and doesn't let go, long after you've finished it' Anna Todd, author of the After series\n" + "\n" + "'A glorious and touching read, a forever keeper' USA Today\n" + "\n" + "'Will break your heart while filling you with hope' Sarah Pekkanen, Perfect Neighbors\n",
            )
            bookList.add(book4)

            val book5 = Book(
                R.drawable.ips,
                "Ross Coulthart",
                "IN PLAIN SIGHT",
                "Investigative journalist Ross Coulthart has been intrigued by UFOs since mysterious glowing lights were reported near New Zealand's Kaikoura mountains when he was a teenager. The 1978 sighting is just one of thousands since the 1940s, and yet research into UFOs is still seen as the realm of crackpots and conspiracy theorists."
            )
            bookList.add(book5)

            val book6 = Book(
                R.drawable.ttmc,
                "Richard Osman",
                "THE THURSDAY MURDER CLUB",
                "In a peaceful retirement village, four unlikely friends meet up once a week to investigate unsolved murders.\n" + "\n" + "But when a brutal killing takes place on their very doorstep, the Thursday Murder Club find themselves in the middle of their first live case.\n" + "\n" + "Elizabeth, Joyce, Ibrahim and Ron might be pushing eighty but they still have a few tricks up their sleeves.",
            )
            bookList.add(book6)

            val book7 = Book(
                R.drawable.wyam,
                "Michael Robotham",
                "WHEN YOU ARE MINE",
                "Philomena McCarthy has defied the odds and become a promising young officer with the Metropolitan Police despite being the daughter of a notorious London gangster. Called to the scene of a domestic assault one day, she rescues a bloodied young woman, Tempe Brown, the mistress of a decorated detective. The incident is hushed up, but Phil has unwittingly made a dangerous enemy with powerful friends.\n"
            )
            bookList.add(book7)

            return bookList


        }
*/


        val bookList= mutableListOf(
            Book(
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ggFHVNu6YYI5L9pCfOacjizRGt.jpg",
                "Vince Gilligan",
                "Breaking Bad (2008)",
                "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure" +
                        " his family's financial future at any cost as he enters the dangerous world of drugs and crime.",1),
            Book(
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/a0Vt3wx8ciKmPt4iXPx9sH4HBVU.jpg",
                "Joe Carnahan\n" +
                        "\n",
                "The Grey (2012)",
                "Following a grueling five-week shift at an Alaskan oil refinery, workers led by sharpshooter John Ottway, are flying home for a much-needed vacation. But a brutal storm causes their plane to crash in the frozen wilderness, and only eight men, including Ottway, survive. As they trek southward toward civilization and safety, Ottway and his companions must battle mortal " +
                        "injuries, the icy elements, and a pack of hungry wolves.\n",2
            ), Book(
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8VjVLMiPm598Kg6XmKk5m1fz0p7.jpg",
                "Jorge Coira",
                "Code Name: Emperor (2022)",
                "Follows Juan, an agent working for the intelligence services, who also reports to a parallel unit involved in illegal activities.",3
            ), Book(
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/AsdjYB61U8zVAsEyQgOebAjCoUN.jpg",
                "Colleen Hoover",
                "Devil in Ohio (2022)",
                "Determined to protect a young patient who escaped a mysterious cult," +
                        " a psychiatrist takes the girl in, putting her own family — and life — in danger.\n",4
            )
            , Book(
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5Hm5oKL1pDsqWr66UbZonWE6wV6.jpg",
                "Antoine Fuqua",
                "Southpaw (2015)",
                "Billy \"The Great\" Hope, the reigning junior middleweight boxing champion, has an impressive career, a loving wife and daughter, and a lavish lifestyle. However, when tragedy strikes, Billy hits rock bottom, losing his family, his house and his manager. He soon finds an unlikely savior in Tick Willis, a former fighter who trains the city's toughest amateur boxers. With his future" +
                        " on the line, Hope fights to reclaim the trust of those he loves",5
            )
            , Book(
             "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/856bLLUvEYu3dRDXCCoRE7oxO0V.jpg",
                "Babak Anvari",
                "I Came By (2022)",
                "A rebellious young graffiti artist, who targets the homes of the wealthy elite, discovers a shocking secret that leads him on a journey endangering himself and those closest to him..",6
            ),
            Book(
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iZvzMpREGiqDQ5eYbx8z70qPgst.jpg",
                "John Patton Ford",
                "Emily the Criminal (2022)",
                "Emily, who is saddled with student debt and locked out of the job market due to a minor criminal record, gets involved in a credit card scam that pulls her into the criminal underworld of Los Angeles, ultimately leading to deadly consequences..\n",7
            )



        )

    }
}