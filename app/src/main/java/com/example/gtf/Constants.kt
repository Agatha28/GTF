package com.example.gtf

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
             R.drawable.argentina,
            "Argentina",
            "Amerika",
            "Australia",
            "Albania",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.alaska,
            "Argentina",
            "Alaska",
            "Australia",
            "Albania",
            2
        )
        questionsList.add(que2)


        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.filipina,
            "Argentina",
            "Denmark",
            "Filipina",
            "Albania",
            3
        )
        questionsList.add(que3)



        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.afrikaselatan,
            "Denmark",
            "Alaska",
            "Iran",
            "South Africa",
            4
        )
        questionsList.add(que4)


        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.mexico,
            "Amerika",
            "Argentina",
            "China",
            "Mexico",
            4
        )
        questionsList.add(que5)



        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ausie,
            "Amerika",
            "Australia",
            "Belanda",
            "Brasil",
            2
        )
        questionsList.add(que6)



        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.brasil,
            "Australia",
            "Argentina",
            "Brasil",
            "Japan",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.china,
            "Australia",
            "Belanda",
            "China",
            "India",
            3
        )
        questionsList.add(que8)



        val que9= Question(
            9,
            "What country does this flag belong to?",
            R.drawable.denmark,
            "Amerika",
            "Belanda",
            "China",
            "Denmark",
            4
        )
        questionsList.add(que9)


        val que10= Question(
            10,
            "What country does this flag belong to?",
            R.drawable.italia,
            "Australia",
            "Brasil",
            "India",
            "Italia",
            4
        )
        questionsList.add(que10)


        return questionsList
    }
}