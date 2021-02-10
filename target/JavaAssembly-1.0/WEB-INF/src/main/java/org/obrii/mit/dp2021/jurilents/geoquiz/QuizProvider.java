package org.obrii.mit.dp2021.jurilents.geoquiz;


public class QuizProvider {

    private static Country[] getCountriesData() {
        return new Country[]{
                Country.builder()
                        .setName("Ukraine")
                        .setDescription("Ukraine is a developing country ranking 74th in the Human Development Index. It is the poorest country in Europe alongside Moldova, and suffers from a very high poverty rate as well as severe corruption. However, because of its extensive fertile farmlands, Ukraine is one of the world's largest grain exporters. It also maintains the third-largest military in Europe after Russia and France. Ukraine is a unitary republic under a semi-presidential system with separate powers: legislative, executive and judicial branches. The country is a member of the United Nations, the Council of Europe, the Organization for Security and Co-operation in Europe (OSCE), the GUAM organization, and one of the founding states of the Commonwealth of Independent States (CIS).")
                        .setImagePath("https://www.state.gov/wp-content/uploads/2018/11/Ukraine-2109x1406.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Ukraine.svg/125px-Flag_of_Ukraine.svg.png")
                        .setHasSeaLine(true)
                        .setIsInMountains(true)
                        .setIsInForest(false)
                        .setTemperature(Temperature.Moderate)
                        .setEvolutionLevel(Level.Low)
                        .setPollutionLevel(Level.Moderate)
                        .setSize(Size.Huge)
                        .build(),

                Country.builder()
                        .setName("Rwanda")
                        .setDescription("Hunter-gatherers settled the territory in the Stone and Iron Ages, followed later by Bantu peoples. The population coalesced first into clans and then into kingdoms. The Kingdom of Rwanda dominated from the mid-eighteenth century, with the Tutsi kings conquering others militarily, centralising power and later enacting anti-Hutu policies. Germany colonised Rwanda in 1884 as part of German East Africa, followed by Belgium, which invaded in 1916 during World War I. Both European nations ruled through the kings and perpetuated a pro-Tutsi policy. The Hutu population revolted in 1959. They massacred numerous Tutsi and ultimately established an independent, Hutu-dominated republic in 1962. A 1973 military coup saw a change of leadership, but the pro-Hutu policy remained. The Tutsi-led Rwandan Patriotic Front launched a civil war in 1990. The presidents of Rwanda and Burundi, both Hutus, were killed when their aircraft was shot down on 6 April 1994. Social tensions erupted in the 1994 genocide that followed, in which Hutu extremists killed an estimated 500,000–1,000,000 Tutsi and moderate Hutu. The RPF ended the genocide with a military victory.")
                        .setImagePath("https://equatorial.by/sites/default/files/ruanda011.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Flag_of_Rwanda.svg/1200px-Flag_of_Rwanda.svg.png")
                        .setHasSeaLine(false)
                        .setIsInMountains(true)
                        .setIsInForest(true)
                        .setTemperature(Temperature.Hot)
                        .setEvolutionLevel(Level.Low)
                        .setPollutionLevel(Level.Low)
                        .setSize(Size.Small)
                        .build(),

                Country.builder()
                        .setName("New Zealand")
                        .setDescription("Owing to their remoteness, the islands of New Zealand were the last large habitable lands to be settled by humans. Between about 1280 and 1350, Polynesians began to settle in the islands and then developed a distinctive Māori culture. In 1642, the Dutch explorer, Abel Tasman, became the first European to sight New Zealand. In 1840, representatives of the United Kingdom and Māori chiefs signed the Treaty of Waitangi, which declared British sovereignty over the islands. In 1841, New Zealand became a colony within the British Empire, and in 1907 it became a dominion; it gained full statutory independence in 1947, and the British monarch remained the head of state. Today, the majority of New Zealand's population of 5 million is of European descent; the indigenous Māori are the largest minority, followed by Asians and Pacific Islanders. Reflecting this, New Zealand's culture is mainly derived from Māori and early British settlers, with recent broadening arising from increased immigration. The official languages are English, Māori, and New Zealand Sign Language, with English being very dominant.")
                        .setImagePath("https://upload.wikimedia.org/wikipedia/commons/e/e5/Lake_Gunn.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1920px-Flag_of_New_Zealand.svg.png")
                        .setHasSeaLine(true)
                        .setIsInMountains(true)
                        .setIsInForest(true)
                        .setTemperature(Temperature.Hot)
                        .setEvolutionLevel(Level.High)
                        .setPollutionLevel(Level.Low)
                        .setSize(Size.Medium)
                        .build(),

                Country.builder()
                        .setName("Japan")
                        .setDescription("Japan is the eleventh-most populous country in the world, as well as one of the most densely populated and urbanized. About three-fourths of the country's terrain is mountainous, concentrating its population of 125.57 million on narrow coastal plains. Japan is divided into 47 administrative prefectures and eight traditional regions. The Greater Tokyo Area is the most populous metropolitan area in the world, with more than 37.4 million residents. Animeland!")
                        .setImagePath("https://img5.goodfon.ru/wallpaper/nbig/c/74/jp-nik-by-jp-nik-environments-peizazh-stil-den-art-gora-fudz.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/800px-Flag_of_Japan.svg.png")
                        .setHasSeaLine(true)
                        .setIsInMountains(true)
                        .setIsInForest(false)
                        .setTemperature(Temperature.Moderate)
                        .setEvolutionLevel(Level.High)
                        .setPollutionLevel(Level.Moderate)
                        .setSize(Size.Medium)
                        .build(),

                Country.builder()
                        .setName("the U.S.A.")
                        .setDescription("The United States is a federal republic and a representative democracy with three separate branches of government, including a bicameral legislature. It is a founding member of the United Nations, World Bank, International Monetary Fund, Organization of American States (OAS), NATO, and other international organizations. It is a permanent member of the United Nations Security Council. The U.S. ranks high in international measures of economic freedom, reduced levels of perceived corruption, quality of life, and quality of higher education. It is one of the most racially and ethnically diverse nations in the world. Considered a melting pot of cultures and ethnicities, its population has been profoundly shaped by centuries of immigration. Welcome to the KKK club!")
                        .setImagePath("https://i.pinimg.com/originals/1b/d2/6f/1bd26fe47ccc02b0883a8c41f4279408.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/800px-Flag_of_the_United_States.svg.png")
                        .setHasSeaLine(true)
                        .setIsInMountains(true)
                        .setIsInForest(true)
                        .setTemperature(Temperature.Moderate)
                        .setEvolutionLevel(Level.High)
                        .setPollutionLevel(Level.High)
                        .setSize(Size.Huge)
                        .build(),

                Country.builder()
                        .setName("Norway")
                        .setDescription("Norway has both administrative and political subdivisions on two levels: counties and municipalities. The Sámi people have a certain amount of self-determination and influence over traditional territories through the Sámi Parliament and the Finnmark Act. Norway maintains close ties with both the European Union and the United States. Norway is also a founding member of the United Nations, NATO, the European Free Trade Association, the Council of Europe, the Antarctic Treaty, and the Nordic Council; a member of the European Economic Area, the WTO, and the OECD; and a part of the Schengen Area. In addition, the Norwegian languages share mutual intelligibility with Danish and Swedish. Norway maintains the Nordic welfare model with universal health care and a comprehensive social security system, and its values are rooted in egalitarian ideals.")
                        .setImagePath("https://www.state.gov/wp-content/uploads/2018/11/Norway-2560x1328.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Norway.svg/512px-Flag_of_Norway.svg.png")
                        .setHasSeaLine(true)
                        .setIsInMountains(true)
                        .setIsInForest(true)
                        .setTemperature(Temperature.Cold)
                        .setEvolutionLevel(Level.High)
                        .setPollutionLevel(Level.Low)
                        .setSize(Size.Medium)
                        .build(),

                Country.builder()
                        .setName("Belarus")
                        .setDescription("Until the 20th century, different states at various times controlled the lands of modern-day Belarus, including Kievan Rus', the Principality of Polotsk, the Grand Duchy of Lithuania, the Polish–Lithuanian Commonwealth, and the Russian Empire. In the aftermath of the Russian Revolution in 1917, different states arose competing for legitimacy amidst the Civil War, ultimately ending in the rise of the Byelorussian SSR, which became a founding constituent republic of the Soviet Union in 1922. After the Polish-Soviet War, Belarus lost almost half of its territory to Poland. Much of the borders of Belarus took their modern shape in 1939, when some lands of the Second Polish Republic were reintegrated into it after the Soviet invasion of Poland, and were finalized after World War II. During WWII, military operations devastated Belarus, which lost about a quarter of its population and half of its economic resources. The republic was redeveloped in the post-war years. In 1945, the Byelorussian SSR became a founding member of the United Nations, along with the Soviet Union.")
                        .setImagePath("https://eufordigital.eu/wp-content/uploads/2019/08/bellarus.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Flag_of_Belarus.svg/800px-Flag_of_Belarus.svg.png")
                        .setHasSeaLine(false)
                        .setIsInMountains(false)
                        .setIsInForest(true)
                        .setTemperature(Temperature.Moderate)
                        .setEvolutionLevel(Level.Moderate)
                        .setPollutionLevel(Level.Moderate)
                        .setSize(Size.Medium)
                        .build(),

                Country.builder()
                        .setName("Switzerland")
                        .setDescription("Forty-eight of Switzerland's mountains are 4,000 metres (13,000 ft) above sea in altitude or higher. At 4,634 m (15,203 ft), Monte Rosa is the highest, although the Matterhorn (4,478 m or 14,692 ft) is often regarded as the most famous. Both are located within the Pennine Alps in the canton of Valais, on the border with Italy. The section of the Bernese Alps above the deep glacial Lauterbrunnen valley, containing 72 waterfalls, is well known for the Jungfrau (4,158 m or 13,642 ft) Eiger and Mönch, and the many picturesque valleys in the region. In the southeast the long Engadin Valley, encompassing the St. Moritz area in canton of Graubünden, is also well known; the highest peak in the neighbouring Bernina Alps is Piz Bernina (4,049 m or 13,284 ft). The more populous northern part of the country, constituting about 30% of the country's total area, is called the Swiss Plateau. It has greater open and hilly landscapes, partly forested, partly open pastures, usually with grazing herds, or vegetables and fruit fields, but it is still hilly. There are large lakes found here and the biggest Swiss cities are in this area of the country. Within Switzerland there are two small enclaves: Büsingen belongs to Germany, Campione d'Italia belongs to Italy. Switzerland has no exclaves in other countries.")
                        .setImagePath("https://www.expatica.com/app/uploads/sites/9/2017/07/cost-of-living-in-switzerland.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Switzerland.svg/512px-Flag_of_Switzerland.svg.png")
                        .setHasSeaLine(false)
                        .setIsInMountains(true)
                        .setIsInForest(false)
                        .setTemperature(Temperature.Cold)
                        .setEvolutionLevel(Level.High)
                        .setPollutionLevel(Level.Low)
                        .setSize(Size.Small)
                        .build(),

                Country.builder()
                        .setName("Vietnam")
                        .setDescription("After North and South Vietnam were reunified as a communist state under a unitary socialist government in 1976, the country became economically and politically isolated until 1986, when the Communist Party initiated a series of economic and political reforms that facilitated Vietnamese integration into world politics and the global economy. As a result of the successful reforms, Vietnam has enjoyed a high GDP growth rate, consistently ranked among the fastest-growing countries in the world. It nevertheless faces challenges including corruption, pollution, poverty, inadequate social welfare and a poor human rights record, including increasing persecution of religious groups and human rights advocates and intensifying restrictions on civil liberties. By 2010, Vietnam had established diplomatic relations with 178 countries. It is a member of such international organisations as the United Nations (UN), the Association of Southeast Asian Nations (ASEAN), the Asia-Pacific Economic Cooperation (APEC) forum, and the World Trade Organization (WTO).")
                        .setImagePath("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Halong_Bay_panorama.jpg/1000px-Halong_Bay_panorama.jpg")
                        .setFlagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/800px-Flag_of_Vietnam.svg.png")
                        .setHasSeaLine(true)
                        .setIsInMountains(false)
                        .setIsInForest(true)
                        .setTemperature(Temperature.Hot)
                        .setEvolutionLevel(Level.Low)
                        .setPollutionLevel(Level.Moderate)
                        .setSize(Size.Medium)
                        .build(),

        };
    }

    public static Country findMostSimilar(Country source) {
        // create array for comparing results
        Country[] prototypes = getCountriesData();
        float[] results = new float[prototypes.length];

        // compare source country with each other and save result
        System.out.println("====================");
        for (int i = 0; i < prototypes.length; i++) {
            results[i] = source.compareTo(prototypes[i]);
            System.out.println(prototypes[i].getName() + ":  " + results[i]);
        }

        // find index of best comparing result
        int indexOfMax = 0;
        for (int i = 0; i < prototypes.length; i++) {
            indexOfMax = results[i] > results[indexOfMax] ? i : indexOfMax;
        }

        // return the nearest country to source from prototypes
        return prototypes[indexOfMax];
    }
}