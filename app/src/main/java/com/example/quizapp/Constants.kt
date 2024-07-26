package com.example.quizapp

object Constants {

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestion():ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 =Question(
            1,
            R.drawable.img,
            "What country does this flag belongs to?",
            "Africa",
            "India",
            "America",
            "Argentina",
            2)

        questionList.add(que1)

        // 2
        val que2 =Question(
            2,
            R.drawable.flag_of_scotland,
            "What country does this flag belongs to?",
            "Africa",
            "Tibet",
            "Scotland",
            "Argentina",
            3)

        questionList.add(que2)

        // 3
        val que3 =Question(
            3,
            R.drawable.tibetian_flag,
            "What country does this flag belongs to?",
            "Tibet",
            "China",
            "America",
            "Argentina",
            1)

        questionList.add(que3)

        // 4
        val que4 =Question(
            4,
            R.drawable.greek_flag,
            "What country does this flag belongs to?",
            "Greek",
            "India",
            "Scotland",
            "France",
            1)

        questionList.add(que4)

        // 5
        val que5 =Question(
            5,
            R.drawable.flag_israel,
            "What country does this flag belongs to?",
            "Brazil",
            "Cuba",
            "Israel",
            "Palestine",
            3)

        questionList.add(que5)

        // 6
        val que6 =Question(
            6,
            R.drawable.flag_america,
            "What country does this flag belongs to?",
            "America",
            "England",
            "Canada",
            "Argentina",
            1)

        questionList.add(que6)

        //7
        val que7 =Question(
            1,
            R.drawable.flag_argentina,
            "What country does this flag belongs to?",
            "Africa",
            "Tibet",
            "Scotland",
            "Argentina",
            4)

        questionList.add(que7)

        // 8
        val que8 =Question(
            1,
            R.drawable.tool_pliers,
            "What is the name of the tool?",
            "pliers",
            "Hammer",
            "File",
            "Chisel",
            1)

        questionList.add(que8)

        // 9
        val que9 =Question(
            1,
            R.drawable.srewdriver,
            "What is the name of the tool?",
            "Bradawl",
            "File",
            "Screwdiver",
            "Screw",
            3)

        questionList.add(que9)

        // 10
        val que10 =Question(
            1,
            R.drawable.handsaw,
            "What is the name of the tool?",
            "Cooping saw",
            "Hacksaw",
            "File",
            "Handsaw",
            4)

        questionList.add(que10)

        return questionList
    }

}