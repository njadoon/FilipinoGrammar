package com.example.filipinogrammar;
public class QuestionPack {
    private final String[] questions = {
            "Ginawa ____ mga estudyante ang kanilang proyekto.",
            "Si Joseph ay pinuno ____ aming grupo.",
            "Umiinom si Ali ____ gamot bago matulog.",
            "Kumain ____ kumain ang nagugutom na bata.",
            "Nakita ____ tatay ang mahirap na bata.",
            "Magsumikap ka ____ ang buhay mo'y guminhawa.",
            "Sumasagot kami ng takdang aralin ____ dumating si Alex.",
            "____ kumakatok sa labas.",
            "____ maganda siyang anak.",
            "____ mga babaeng naghihintay sa iyo.",
            "____ lapis siyang dala.",
            "Kakain ____ si Omar dito.",
            "Bababa ____ si mama ngayon.",
            "Panget ____ ung teleserye sabi ni Valdez.",
            "Sasama ____ si Jayson sa atin.",
            "Buksan mo nga ang ____.",
            "Nangyari ang suntukan sa may ____.",
            "Nag mamadaling inakyat ni James ang mga ____.",
            "Ilagay mo ang ____ sa tapat ng bintana.",
            "____ mo ang mga luha sa iyong mga mata.",
            "____ mo ng palaman ang tinapay.",
            "____ mo ang pawis sa iyong likod.",
            "____ mo ng alkohol ang iyong binti.",
            "____ ang tiyan ni Aaron sa Lunes.",
            "____ si Aaron sa tiyan sa Lunes.",
            "____ ninyo ang mga kalat sa sahig.",
            "____ ninyo ang sahig.",
            "Nakatatlong ____ muana sila bago natunton ang daan patungo sa loob ng kuweba.",
            "____ mong lagi ang sinasabi ng iyong mga magulang.",
            "____ mo siya para hindi siya maligaw.",
            "____ mo sa anim ang manok.",
            "____ mo ang pagkain sa mga bata.",
            "Manood ____ ng sine."
    };
    private final String[][] choices = {
            {"ng", "nang", "na", "nung"},
            {"nang", "na", "ng", "ni"},
            {"ng", "nang", "na", "nung"},
            {"nang", "na", "ng", "ni"},
            {"ng", "nang", "na", "nung"},
            {"nang", "na", "ng", "ni"},
            {"ng", "nang", "na", "nung"},
            {"Mayroon","May","Meron","Meyron"},
            {"Meyron","Mayroon","May","Meron"},
            {"Mayroon","May","Meron","Meyron"},
            {"Meyron","Mayroon","May","Meron"},
            {"din","raw","rin","ng"},
            {"daw","raw","din","nang"},
            {"daw","raw","rin","ng"},
            {"daw","rin","din","nang"},
            {"pintuan","dor","pinto","pintoan"},
            {"pintuan","dor","pinto","pintoan"},
            {"pintuan","hagdanan","pinto","hagdan"},
            {"pintuan","hagdanan","pinto","hagdan"},
            {"Punasin","Pahiran","Punasan","Pahirin"},
            {"Punasin","Pahiran","Punasan","Pahirin"},
            {"Punasin","Pahiran","Punasan","Pahirin"},
            {"Punasin","Pahiran","Punasan","Pahirin"},
            {"Ooperahan","Mag-opera","Ma-operahan","Ooperahin"},
            {"Ooperahan","Mag-opera","Ma-operahan","Ooperahin"},
            {"Punasan","Walisan","Walisin","Pahian"},
            {"Punasan","Walisan","Walisin","Pahian"},
            {"ikot","ikit","ikut","ikat"},
            {"Sunorin","Sunodin","Sundin","Sundan"},
            {"Sunorin","Sunodin","Sundin","Sundan"},
            {"Hatian","Hatiin","Hinahatian","Paghatian"},
            {"Hinahatian","Hatiin","Hatian","Paghatian"},
            {"kila","kita","kata","kina"}
    };
    private final String[] correctAnswer = {
            "ng",
            "ng",
            "ng",
            "nang",
            "nang",
            "nang",
            "nang",
            "May",
            "May",
            "May",
            "May",
            "din",
            "raw",
            "daw",
            "rin",
            "pinto",
            "pintuan",
            "hagdan",
            "hagdanan",
            "Pahirin",
            "Pahiran",
            "Punasin",
            "Punasan",
            "Ooperahin",
            "Ooperahan",
            "Walisin",
            "Walisan",
            "ikit",
            "Sundin",
            "Sundan",
            "Hatiin",
            "Hatian",
            "kata"
    };
    public String getQuestion(int a){
        return questions[a];
    }
    public String getChoice1 ( int a){
        return choices[a][0];
    }
    public String getChoice2 ( int a){
        return choices[a][1];
    }
    public String getChoice3 ( int a){
        return choices[a][2];
    }
    public String getChoice4 ( int a){
        return choices[a][3];
    }
    public String getCorrectAnswer ( int a){
        return correctAnswer[a];
    }
}
