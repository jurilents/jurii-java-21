package org.obrii.mit.dp2021.jurilents.geoquiz;


public class QuizProvider {

    /*
     * 1. Ukraine
     * 2. Rwanda
     * 3. New Zealand
     * 4. Japan
     * 5. USA
     * 6. Norway
     * 7. Belarus
     * 8. Switzerland
     * 9. Vietnam
     * 10. Mongolia
     * 11. Guatemala
     * 12. Russia
     * 13. France
     * 14. the United Kingdom
     * 15. Brazil
     * 16. India
     * 17. Israel
     * 18. Greenland
     * 19. Kongo
     * 20. Canada
     * */
    private static Country[] getCountriesData() {
        return new Country[]{
                Country.builder() // 1
                        .name("Ukraine")
                        .description("Ukraine is a developing country ranking 74th in the Human Development Index. It is the poorest country in Europe alongside Moldova, and suffers from a very high poverty rate as well as severe corruption. However, because of its extensive fertile farmlands, Ukraine is one of the world's largest grain exporters. It also maintains the third-largest military in Europe after Russia and France. Ukraine is a unitary republic under a semi-presidential system with separate powers: legislative, executive and judicial branches. The country is a member of the United Nations, the Council of Europe, the Organization for Security and Co-operation in Europe (OSCE), the GUAM organization, and one of the founding states of the Commonwealth of Independent States (CIS).")
                        .imagePath("https://www.state.gov/wp-content/uploads/2018/11/Ukraine-2109x1406.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Ukraine.svg/125px-Flag_of_Ukraine.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(false)
                        .temperature(Temperature.Moderate)
                        .evolutionLevel(Level.Low)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Bigger)
                        .build(),

                Country.builder() // 2
                        .name("Rwanda")
                        .description("Hunter-gatherers settled the territory in the Stone and Iron Ages, followed later by Bantu peoples. The population coalesced first into clans and then into kingdoms. The Kingdom of Rwanda dominated from the mid-eighteenth century, with the Tutsi kings conquering others militarily, centralising power and later enacting anti-Hutu policies. Germany colonised Rwanda in 1884 as part of German East Africa, followed by Belgium, which invaded in 1916 during World War I. Both European nations ruled through the kings and perpetuated a pro-Tutsi policy. The Hutu population revolted in 1959. They massacred numerous Tutsi and ultimately established an independent, Hutu-dominated republic in 1962. A 1973 military coup saw a change of leadership, but the pro-Hutu policy remained. The Tutsi-led Rwandan Patriotic Front launched a civil war in 1990. The presidents of Rwanda and Burundi, both Hutus, were killed when their aircraft was shot down on 6 April 1994. Social tensions erupted in the 1994 genocide that followed, in which Hutu extremists killed an estimated 500,000–1,000,000 Tutsi and moderate Hutu. The RPF ended the genocide with a military victory.")
                        .imagePath("https://equatorial.by/sites/default/files/ruanda011.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Flag_of_Rwanda.svg/1200px-Flag_of_Rwanda.svg.png")
                        .hasSeaLine(false)
                        .isInMountains(true)
                        .isInForest(true)
                        .temperature(Temperature.Hot)
                        .evolutionLevel(Level.Low)
                        .pollutionLevel(Level.Low)
                        .size(Size.Small)
                        .build(),

                Country.builder() // 3
                        .name("New Zealand")
                        .description("Owing to their remoteness, the islands of New Zealand were the last large habitable lands to be settled by humans. Between about 1280 and 1350, Polynesians began to settle in the islands and then developed a distinctive Māori culture. In 1642, the Dutch explorer, Abel Tasman, became the first European to sight New Zealand. In 1840, representatives of the United Kingdom and Māori chiefs signed the Treaty of Waitangi, which declared British sovereignty over the islands. In 1841, New Zealand became a colony within the British Empire, and in 1907 it became a dominion; it gained full statutory independence in 1947, and the British monarch remained the head of state. Today, the majority of New Zealand's population of 5 million is of European descent; the indigenous Māori are the largest minority, followed by Asians and Pacific Islanders. Reflecting this, New Zealand's culture is mainly derived from Māori and early British settlers, with recent broadening arising from increased immigration. The official languages are English, Māori, and New Zealand Sign Language, with English being very dominant.")
                        .imagePath("https://upload.wikimedia.org/wikipedia/commons/e/e5/Lake_Gunn.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/1920px-Flag_of_New_Zealand.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(true)
                        .temperature(Temperature.Hot)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.Low)
                        .size(Size.Medium)
                        .build(),

                Country.builder() // 4
                        .name("Japan")
                        .description("Japan is the eleventh-most populous country in the world, as well as one of the most densely populated and urbanized. About three-fourths of the country's terrain is mountainous, concentrating its population of 125.57 million on narrow coastal plains. Japan is divided into 47 administrative prefectures and eight traditional regions. The Greater Tokyo Area is the most populous metropolitan area in the world, with more than 37.4 million residents. Animeland!")
                        .imagePath("https://img5.goodfon.ru/wallpaper/nbig/c/74/jp-nik-by-jp-nik-environments-peizazh-stil-den-art-gora-fudz.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/800px-Flag_of_Japan.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(false)
                        .temperature(Temperature.Moderate)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Medium)
                        .build(),

                Country.builder() // 5
                        .name("the U.S.A.")
                        .description("The United States is a federal republic and a representative democracy with three separate branches of government, including a bicameral legislature. It is a founding member of the United Nations, World Bank, International Monetary Fund, Organization of American States (OAS), NATO, and other international organizations. It is a permanent member of the United Nations Security Council. The U.S. ranks high in international measures of economic freedom, reduced levels of perceived corruption, quality of life, and quality of higher education. It is one of the most racially and ethnically diverse nations in the world. Considered a melting pot of cultures and ethnicities, its population has been profoundly shaped by centuries of immigration. Welcome to the KKK club!")
                        .imagePath("https://i.pinimg.com/originals/1b/d2/6f/1bd26fe47ccc02b0883a8c41f4279408.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/800px-Flag_of_the_United_States.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(true)
                        .temperature(Temperature.Moderate)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.High)
                        .size(Size.Huge)
                        .build(),

                Country.builder() // 6
                        .name("Norway")
                        .description("Norway has both administrative and political subdivisions on two levels: counties and municipalities. The Sámi people have a certain amount of self-determination and influence over traditional territories through the Sámi Parliament and the Finnmark Act. Norway maintains close ties with both the European Union and the United States. Norway is also a founding member of the United Nations, NATO, the European Free Trade Association, the Council of Europe, the Antarctic Treaty, and the Nordic Council; a member of the European Economic Area, the WTO, and the OECD; and a part of the Schengen Area. In addition, the Norwegian languages share mutual intelligibility with Danish and Swedish. Norway maintains the Nordic welfare model with universal health care and a comprehensive social security system, and its values are rooted in egalitarian ideals.")
                        .imagePath("https://www.state.gov/wp-content/uploads/2018/11/Norway-2560x1328.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Norway.svg/512px-Flag_of_Norway.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(false)
                        .temperature(Temperature.Cold)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.Low)
                        .size(Size.Bigger)
                        .build(),

                Country.builder() // 7
                        .name("Belarus")
                        .description("Until the 20th century, different states at various times controlled the lands of modern-day Belarus, including Kievan Rus', the Principality of Polotsk, the Grand Duchy of Lithuania, the Polish–Lithuanian Commonwealth, and the Russian Empire. In the aftermath of the Russian Revolution in 1917, different states arose competing for legitimacy amidst the Civil War, ultimately ending in the rise of the Byelorussian SSR, which became a founding constituent republic of the Soviet Union in 1922. After the Polish-Soviet War, Belarus lost almost half of its territory to Poland. Much of the borders of Belarus took their modern shape in 1939, when some lands of the Second Polish Republic were reintegrated into it after the Soviet invasion of Poland, and were finalized after World War II. During WWII, military operations devastated Belarus, which lost about a quarter of its population and half of its economic resources. The republic was redeveloped in the post-war years. In 1945, the Byelorussian SSR became a founding member of the United Nations, along with the Soviet Union.")
                        .imagePath("https://eufordigital.eu/wp-content/uploads/2019/08/bellarus.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Flag_of_Belarus.svg/800px-Flag_of_Belarus.svg.png")
                        .hasSeaLine(false)
                        .isInMountains(false)
                        .isInForest(true)
                        .temperature(Temperature.Moderate)
                        .evolutionLevel(Level.Moderate)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Medium)
                        .build(),

                Country.builder() // 8
                        .name("Switzerland")
                        .description("Forty-eight of Switzerland's mountains are 4,000 metres (13,000 ft) above sea in altitude or higher. At 4,634 m (15,203 ft), Monte Rosa is the highest, although the Matterhorn (4,478 m or 14,692 ft) is often regarded as the most famous. Both are located within the Pennine Alps in the canton of Valais, on the border with Italy. The section of the Bernese Alps above the deep glacial Lauterbrunnen valley, containing 72 waterfalls, is well known for the Jungfrau (4,158 m or 13,642 ft) Eiger and Mönch, and the many picturesque valleys in the region. In the southeast the long Engadin Valley, encompassing the St. Moritz area in canton of Graubünden, is also well known; the highest peak in the neighbouring Bernina Alps is Piz Bernina (4,049 m or 13,284 ft). The more populous northern part of the country, constituting about 30% of the country's total area, is called the Swiss Plateau. It has greater open and hilly landscapes, partly forested, partly open pastures, usually with grazing herds, or vegetables and fruit fields, but it is still hilly. There are large lakes found here and the biggest Swiss cities are in this area of the country. Within Switzerland there are two small enclaves: Büsingen belongs to Germany, Campione d'Italia belongs to Italy. Switzerland has no exclaves in other countries.")
                        .imagePath("https://www.expatica.com/app/uploads/sites/9/2017/07/cost-of-living-in-switzerland.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Switzerland.svg/512px-Flag_of_Switzerland.svg.png")
                        .hasSeaLine(false)
                        .isInMountains(true)
                        .isInForest(false)
                        .temperature(Temperature.Cold)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.Low)
                        .size(Size.Small)
                        .build(),

                Country.builder() // 9
                        .name("Vietnam")
                        .description("After North and South Vietnam were reunified as a communist state under a unitary socialist government in 1976, the country became economically and politically isolated until 1986, when the Communist Party initiated a series of economic and political reforms that facilitated Vietnamese integration into world politics and the global economy. As a result of the successful reforms, Vietnam has enjoyed a high GDP growth rate, consistently ranked among the fastest-growing countries in the world. It nevertheless faces challenges including corruption, pollution, poverty, inadequate social welfare and a poor human rights record, including increasing persecution of religious groups and human rights advocates and intensifying restrictions on civil liberties. By 2010, Vietnam had established diplomatic relations with 178 countries. It is a member of such international organisations as the United Nations (UN), the Association of Southeast Asian Nations (ASEAN), the Asia-Pacific Economic Cooperation (APEC) forum, and the World Trade Organization (WTO).")
                        .imagePath("https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Halong_Bay_panorama.jpg/1000px-Halong_Bay_panorama.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/800px-Flag_of_Vietnam.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(false)
                        .isInForest(true)
                        .temperature(Temperature.Tropic)
                        .evolutionLevel(Level.Low)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Medium)
                        .build(),

                Country.builder() // 10
                        .name("Mongolia")
                        .description("The name \"Gobi\" is a Mongol term for a desert steppe, which usually refers to a category of arid rangeland with insufficient vegetation to support marmots but with enough to support camels. Mongols distinguish Gobi from desert proper, although the distinction is not always apparent to outsiders unfamiliar with the Mongolian landscape. Gobi rangelands are fragile and easily destroyed by overgrazing, which results in expansion of the true desert, a stony waste where not even Bactrian camels can survive.[62] The arid conditions in the Gobi are attributed to the rain shadow effect caused by the Himalayas. Before the Himalayas were formed by the collision of the Indo-Australian plate with the Eurasian plate 10 million years ago, Mongolia was a flourishing habitat for major fauna but still somewhat arid and cold due to distance from sources of evaporation. Sea turtle and mollusk fossils have been found in the Gobi, apart from well-known dinosaur fossils. Tadpole shrimps (Lepidurus mongolicus) are still found in the Gobi today. The eastern part of Mongolia including the Onon, Kherlen rivers and Lake Buir form part of the Amur river basin draining to the Pacific Ocean. It hosts some unique species like the Eastern brook lamprey, Daurian crayfish (cambaroides dauricus) and Daurian pearl oyster (dahurinaia dahurica) in the Onon/Kherlen rivers as well as Siberian prawn (exopalaemon modestus) in Lake Buir.")
                        .imagePath("https://abs-sustainabledevelopment.net/wp-content/uploads/2018/04/Mongolia-Main-Image-1200x600.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Flag_of_Mongolia.svg/800px-Flag_of_Mongolia.svg.png")
                        .hasSeaLine(false)
                        .isInMountains(false)
                        .isInForest(false)
                        .temperature(Temperature.Tropic)
                        .evolutionLevel(Level.Moderate)
                        .pollutionLevel(Level.Low)
                        .size(Size.Huge)
                        .build(),

                Country.builder() // 11
                        .name("Guatemala")
                        .description("The core of the Maya civilization, which extended across Mesoamerica, was historically based in the territory of modern Guatemala. In the 16th century, most of this area was conquered by the Spanish and claimed as part of the viceroyalty of New Spain. Guatemala attained independence in 1821 as part of the Federal Republic of Central America, which dissolved by 1841. From the mid- to late 19th century, Guatemala suffered chronic instability and civil strife. Beginning in the early 20th century, it was ruled by a series of dictators backed by the United Fruit Company and the United States government. In 1944, the authoritarian leader Jorge Ubico was overthrown by a pro-democratic military coup, initiating a decade-long revolution that led to sweeping social and economic reforms. A U.S.-backed military coup in 1954 ended the revolution and installed a dictatorship.")
                        .imagePath("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Tikal_mayan_ruins_2009.jpg/800px-Tikal_mayan_ruins_2009.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Flag_of_Guatemala.svg/800px-Flag_of_Guatemala.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(false)
                        .isInForest(true)
                        .temperature(Temperature.Hot)
                        .evolutionLevel(Level.Low)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Small)
                        .build(),

                Country.builder() // 12
                        .name("Russia")
                        .description("Russia is described as a potential superpower; with the world's second-most powerful military, and the fourth-highest military expenditure. As a recognised nuclear-weapon state, the country possesses the world's largest stockpile of nuclear weapons. Its economy ranks as the eleventh-largest in the world by nominal GDP and the sixth-largest by PPP. Russia's extensive mineral and energy resources are the largest in the world, and it is one of the leading producers of oil and natural gas globally. It is ranked very high in the Human Development Index, with a universal healthcare system and free university education.")
                        .imagePath("https://www.state.gov/wp-content/uploads/2018/11/Russia-2499x1406.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/800px-Flag_of_Russia.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(true)
                        .temperature(Temperature.Moderate)
                        .evolutionLevel(Level.Moderate)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Huge)
                        .build(),

                Country.builder() // 13
                        .name("France")
                        .description("The vast majority of France's territory and population is situated in Western Europe and is called Metropolitan France, to distinguish it from the country's various overseas polities. It is bordered by the North Sea in the north, the English Channel in the northwest, the Atlantic Ocean in the west and the Mediterranean sea in the southeast. Its land borders consist of Belgium and Luxembourg in the northeast, Germany and Switzerland in the east, Italy and Monaco in the southeast, and Andorra and Spain in the south and southwest. With the exception of the northeast, most of France's land borders are roughly delineated by natural boundaries and geographic features: to the south and southeast, the Pyrenees and the Alps and the Jura, respectively, and to the east, the Rhine river. Due to its shape, France is often referred to as l'Hexagone (\"The Hexagon\"). Metropolitan France includes various coastal islands, of which the largest is Corsica. Metropolitan France is situated mostly between latitudes 41° and 51° N, and longitudes 6° W and 10° E, on the western edge of Europe, and thus lies within the northern temperate zone. Its continental part covers about 1000 km from north to south and from east to west.")
                        .imagePath("https://en.esaip.org/wp-content/uploads/2018/11/study-in-france.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/c/c3/Flag_of_France.svg")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(false)
                        .temperature(Temperature.Tropic)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Bigger)
                        .build(),

                Country.builder() // 14
                        .name("the United Kingdom")
                        .description("The geographical division of the United Kingdom into counties or shires began in England and Scotland in the early Middle Ages and was complete throughout Great Britain and Ireland by the early Modern Period. Administrative arrangements were developed separately in each country of the United Kingdom, with origins which often predated the formation of the United Kingdom. Modern local government by elected councils, partly based on the ancient counties, was introduced separately: in England and Wales in a 1888 act, Scotland in a 1889 act and Ireland in a 1898 act, meaning there is no consistent system of administrative or geographic demarcation across the United Kingdom. Until the 19th century there was little change to those arrangements, but there has since been a constant evolution of role and function. The organisation of local government in England is complex, with the distribution of functions varying according to local arrangements. The upper-tier subdivisions of England are the nine regions, now used primarily for statistical purposes. One region, Greater London, has had a directly elected assembly and mayor since 2000 following popular support for the proposal in a referendum. It was intended that other regions would also be given their own elected regional assemblies, but a proposed assembly in the North East region was rejected by a referendum in 2004. Since 2011, ten combined authorities have been established in England. Eight of these have elected mayors, the first elections for which took place on 4 May 2017. Below the regional tier, some parts of England have county councils and district councils and others have unitary authorities, while London consists of 32 London boroughs and the City of London. Councillors are elected by the first-past-the-post system in single-member wards or by the multi-member plurality system in multi-member wards.")
                        .imagePath("https://res.klook.com/image/upload/fl_lossy.progressive/q_auto/f_auto/c_fill/blogen/2018/07/image3-7.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/800px-Flag_of_the_United_Kingdom.svg.png")
                        .hasSeaLine(true)
                        .isInMountains(false)
                        .isInForest(false)
                        .temperature(Temperature.Moderate)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.High)
                        .size(Size.Bigger)
                        .build(),

                Country.builder() // 15
                        .name("Brazil")
                        .description("Brazil is unique in the Americas because, following independence from Portugal, it did not fragment into separate countries as did British and Spanish possessions in the region; rather, it retained its identity through the intervening centuries and a variety of forms of government. Because of that hegemony, the Portuguese language is universal except among Brazil’s native Indians, especially those in the more-remote reaches of the Amazon basin. At the turn of the 21st century, Brazilians marked the 500th anniversary of Portuguese contact with a mixture of public celebration and deprecation. RIO!")
                        .imagePath("https://d1bvpoagx8hqbg.cloudfront.net/originals/erasmus-experience-rio-janeiro-brazil-gui-e9f3563b01b36b4f744125fa09e0ffff.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/en/0/05/Flag_of_Brazil.svg")
                        .hasSeaLine(true)
                        .isInMountains(false)
                        .isInForest(true)
                        .temperature(Temperature.Hot)
                        .evolutionLevel(Level.Moderate)
                        .pollutionLevel(Level.High)
                        .size(Size.Huge)
                        .build(),

                Country.builder() // 16
                        .name("India")
                        .description("India, country that occupies the greater part of South Asia. Its capital is New Delhi, built in the 20th century just south of the historic hub of Old Delhi to serve as India’s administrative centre. Its government is a constitutional republic that represents a highly diverse population consisting of thousands of ethnic groups and likely hundreds of languages.With roughly one-sixth of the world’s total population, India is the second most populous country, after China.")
                        .imagePath("https://doc-research.org/wp-content/uploads/2019/06/old-delhi-india.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/en/4/41/Flag_of_India.svg")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(true)
                        .temperature(Temperature.Hot)
                        .evolutionLevel(Level.Moderate)
                        .pollutionLevel(Level.High)
                        .size(Size.Huge)
                        .build(),

                Country.builder() // 17
                        .name("Israel")
                        .description("The State of Israel is the only Jewish nation in the modern period, and the region that now falls within its borders has a lengthy and rich history that dates from prebiblical times. The area was a part of the Roman Empire and, later, the Byzantine Empire before falling under the control of the fledgling Islamic caliphate in the 7th century ce. Although the object of dispute during the Crusades, the region, then generally known as Palestine, remained under the sway of successive Islamic dynasties until the collapse of the Ottoman Empire at the end of World War I, when it was placed under British mandate from the League of Nations.")
                        .imagePath("https://carleton.ca/studyisrael/wp-content/uploads/jerusalem-1712855_new.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/d/d4/Flag_of_Israel.svg")
                        .hasSeaLine(true)
                        .isInMountains(false)
                        .isInForest(false)
                        .temperature(Temperature.Hot)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.Moderate)
                        .size(Size.Small)
                        .build(),

                Country.builder() // 18
                        .name("Greenland")
                        .description("Greenland, the world’s largest island, lying in the North Atlantic Ocean. Greenland is noted for its vast tundra and immense glaciers. Although Greenland remains a part of the Kingdom of Denmark, the island’s home-rule government is responsible for most domestic affairs. The Greenlandic people are primarily Inuit (Eskimo). The capital of Greenland is Nuuk (Godthåb).")
                        .imagePath("https://cdn.mos.cms.futurecdn.net/eqtkCH73ianYAvz6edPWFo.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_Greenland.svg")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(false)
                        .temperature(Temperature.Cold)
                        .evolutionLevel(Level.Low)
                        .pollutionLevel(Level.Low)
                        .size(Size.Bigger)
                        .build(),

                Country.builder() // 19
                        .name("Kongo")
                        .description("The Kongo cultivate cassava, bananas, corn (maize), sweet potatoes, peanuts (groundnuts), beans, and taro. Cash crops are coffee, cacao, urena, bananas, and palm oil. Fishing and hunting are still practiced by some groups, but many Kongo live and work or trade in towns. Descent is reckoned through the female line, and kinship is further organized through lineages. The main characteristic of social organization is fragmentation: nearly every village is independent of its neighbours, and almost nothing remains of the ancient Kongo kingdom. The Kongo religion centres on ancestor and spirit cults, which also play a part in social and political organization. A strong tradition of prophetism and messianism among the Kongo gave rise in the 20th century to nativistic, political-religious movements.\n")
                        .imagePath("https://www.mission-21.org/fileadmin/_processed_/9/9/csm_DR_Kongo_Kooperation_197.1001_01_6cbcd63797.jpg")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/6/6f/Flag_of_the_Democratic_Republic_of_the_Congo.svg")
                        .hasSeaLine(false)
                        .isInMountains(false)
                        .isInForest(true)
                        .temperature(Temperature.Hot)
                        .evolutionLevel(Level.Low)
                        .pollutionLevel(Level.High)
                        .size(Size.Bigger)
                        .build(),

                Country.builder() // 20
                        .name("Canada")
                        .description("Despite Canada’s great size, it is one of the world’s most sparsely populated countries. This fact, coupled with the grandeur of the landscape, has been central to the sense of Canadian national identity, as expressed by the Dublin-born writer Anna Brownell Jameson, who explored central Ontario in 1837 and remarked exultantly on “the seemingly interminable line of trees before you; the boundless wilderness around you; the mysterious depths amid the multitudinous foliage, where foot of man hath never penetrated…the solitude in which we proceeded mile after mile, no human being, no human dwelling within sight.” Although Canadians are comparatively few in number, however, they have crafted what many observers consider to be a model multicultural society, welcoming immigrant populations from every other continent. In addition, Canada harbours and exports a wealth of natural resources and intellectual capital equaled by few other countries.")
                        .imagePath("https://pix10.agoda.net/geo/country/100/3_100_canada_02.jpg?s=1920x")
                        .flagPath("https://upload.wikimedia.org/wikipedia/commons/d/d9/Flag_of_Canada_%28Pantone%29.svg")
                        .hasSeaLine(true)
                        .isInMountains(true)
                        .isInForest(true)
                        .temperature(Temperature.Cold)
                        .evolutionLevel(Level.High)
                        .pollutionLevel(Level.Low)
                        .size(Size.Huge)
                        .build(),

        };
    }

    public static Country findMostSimilar(Country source) {
        // create array for comparing results
        Country[] prototypes = getCountriesData();
        float[] results = new float[prototypes.length];

        // compare source country with each other and save result
        System.out.println("----------------");
        for (int i = 0; i < prototypes.length; i++) {
            results[i] = source.compareTo(prototypes[i]);
//          if (results[i] > 0.7f)
            System.out.println(prototypes[i].getName() + ":  " + results[i] * 100f);
        }

        // find index of best comparing result
        int indexOfMax = 0;
        for (int i = 0; i < prototypes.length; i++) {
            indexOfMax = results[i] > results[indexOfMax] ? i : indexOfMax;
        }

        // return the nearest country to source from prototypes
        return prototypes[indexOfMax];
    }

    public static void comparingValuesTest() {
        Country[] prototypes = getCountriesData();

        for (Country country : prototypes) {
            System.out.println("----- " + country.getName() + " -----");
            findMostSimilar(country);
            System.out.println("\n ----- END -----\n");
        }
    }
}