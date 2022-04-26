package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,
            "The Lisbon earth quake occurred in",
            "1880",
            "1755",
            "1680",
            "1980",
            2
        )
        questionsList.add(question1)

        val question2 = Question(
            1,
            "Which missonary is commonly known as the missionary to the world?",
            "Joseph Bates",
            "Joseph Wolf",
            "William Miller",
            "John Wycliffe",
            2
        )
        questionsList.add(question2)

        val question3 = Question(
            1,
            "Who was the first General Conference president?",
            "John Byington",
            "James White",
            "Uriah Smith",
            "Ted Wilson",
            1
        )
        questionsList.add(question3)

        val question4 = Question(
            1,
            "When was the name Seventh-day Adventist Church was adopted ?",
            "1847",
            "1863",
            "1860",
            "1865",
            3
        )
        questionsList.add(question4)

        val question5 = Question(
            1,
            "Who was the longest serving General Conference president?",
            "Jan Paulsen",
            "James White",
            "A.G Daniels",
            "Ted Wilson",
            3
        )
        questionsList.add(question5)

        val question6 = Question(
            1,
            "The church of God is founded on?",
            "John",
            "Jesus Christ",
            "Peter",
            "James",
            2
        )
        questionsList.add(question6)

        val question7 = Question(
            1,
            "What is the meaning of Time, Times and a dividing of Times?",
            "2300",
            "1260",
            "1300",
            "1104",
            2
        )
        questionsList.add(question7)

        val question8 = Question(
            1,
            "The Bible was written approximately",
            "1000 years",
            "1200 years",
            "2000 years",
            "1500 years",
            5
        )
        questionsList.add(question8)

        val question9 = Question(
            1,
            "How many books are in the Old Testament",
            "38",
            "37",
            "39",
            "27",
            3
        )
        questionsList.add(question9)

        val question10 = Question(
            1,
            "Where was the first pathfinder club in africa",
            "Zambia",
            "Zimbabwe",
            "Uganda",
            "Kenya",
            2
        )
        questionsList.add(question10)
        return questionsList
    }
}