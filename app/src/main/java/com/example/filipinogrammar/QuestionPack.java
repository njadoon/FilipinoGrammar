package com.example.filipinogrammar;
public class QuestionPack {
    private final String[] questions = {
            "Ginawa _______ mga estudyante ang kanilang proyekto.",
            "Si Joseph ay pinuno _______ aming grupo.",
            "Umiinom si Ali _______ gamot bago matulog.",
            "Kumain _______ kumain ang nagugutom na bata.",
            "Nakita _______ tatay ang mahirap na bata.",
            "Magsumikap ka _______ ang buhay mo'y guminhawa.",
            "Sumasagot kami ng takdang aralin _______ dumating si Alex.",
            "_______ kumakatok sa labas.",
            "_______ maganda siyang anak.",
            "_______ mga babaeng naghihintay sa iyo.",
            "_______ lapis siyang dala.",
            "Kakain _______ si Omar dito.",
            "Bababa _______ si mama ngayon.",
            "Panget _______ yung teleserye sabi ni Valdez.",
            "Sasama _______ si Jayson sa atin.",
            "Buksan mo nga ang _______.",
            "Nangyari ang suntukan sa may _______.",
            "Nag mamadaling inakyat ni James ang mga _______.",
            "Ilagay mo ang _______ sa tapat ng bintana.",
            "_______ mo ang mga luha sa iyong mga mata.",
            "_______ mo ng palaman ang tinapay.",
            "_______ mo ang pawis sa iyong likod.",
            "_______ mo ng alkohol ang iyong binti.",
            "_______ ang tiyan ni Aaron sa Lunes.",
            "_______ si Aaron sa tiyan sa Lunes.",
            "_______ ninyo ang mga kalat sa sahig.",
            "_______ ninyo ang sahig.",
            "Nakatatlong _______ muna sila bago natunton ang daan patungo sa loob ng kuweba.",
            "_______ mong lagi ang sinasabi ng iyong mga magulang.",
            "_______ mo siya para hindi siya maligaw.",
            "_______ mo sa anim ang manok.",
            "_______ mo ang pagkain sa mga bata.",
            "Manood _______ ng sine."
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
