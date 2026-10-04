package com.aspose.words;

import androidx.core.text.util.LocalePreferences;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXP {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzYOf = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOe = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOd = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOc = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOb = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOa = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO9 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO8 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO7 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO6 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO5 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO4 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO3 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO2 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO1 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYO0 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNZ = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNY = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNX = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNW = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNV = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNU = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNT = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNS = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNR = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNQ = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNP = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNO = new com.aspose.words.internal.zzZYJ();

    static {
        zzYOd.zzH("none", 0);
        zzYOd.zzH("single", 1);
        zzYOd.zzH("thick", 2);
        zzYOd.zzH("double", 3);
        zzYOd.zzH("dotted", 6);
        zzYOd.zzH("dashed", 7);
        zzYOd.zzH("dotDash", 8);
        zzYOd.zzH("dotDotDash", 9);
        zzYOd.zzH("triple", 10);
        zzYOd.zzH("thinThickSmallGap", 11);
        zzYOd.zzH("thickThinSmallGap", 12);
        zzYOd.zzH("thinThickThinSmallGap", 13);
        zzYOd.zzH("thinThickMediumGap", 14);
        zzYOd.zzH("thickThinMediumGap", 15);
        zzYOd.zzH("thinThickThinMediumGap", 16);
        zzYOd.zzH("thinThickLargeGap", 17);
        zzYOd.zzH("thickThinLargeGap", 18);
        zzYOd.zzH("thinThickThinLargeGap", 19);
        zzYOd.zzH("wave", 20);
        zzYOd.zzH("doubleWave", 21);
        zzYOd.zzH("dashSmallGap", 22);
        zzYOd.zzH("dashDotStroked", 23);
        zzYOd.zzH("threeDEmboss", 24);
        zzYOd.zzH("threeDEngrave", 25);
        zzYOd.zzH("outset", 26);
        zzYOd.zzH("inset", 27);
        zzYOd.zzH("apples", 64);
        zzYOd.zzH("archedScallops", 65);
        zzYOd.zzH("babyPacifier", 66);
        zzYOd.zzH("babyRattle", 67);
        zzYOd.zzH("balloons3Colors", 68);
        zzYOd.zzH("balloonsHotAir", 69);
        zzYOd.zzH("basicBlackDashes", 70);
        zzYOd.zzH("basicBlackDots", 71);
        zzYOd.zzH("basicBlackSquares", 72);
        zzYOd.zzH("basicThinLines", 73);
        zzYOd.zzH("basicWhiteDashes", 74);
        zzYOd.zzH("basicWhiteDots", 75);
        zzYOd.zzH("basicWhiteSquares", 76);
        zzYOd.zzH("basicWideInline", 77);
        zzYOd.zzH("basicWideMidline", 78);
        zzYOd.zzH("basicWideOutline", 79);
        zzYOd.zzH("bats", 80);
        zzYOd.zzH("birds", 81);
        zzYOd.zzH("birdsFlight", 82);
        zzYOd.zzH("cabins", 83);
        zzYOd.zzH("cakeSlice", 84);
        zzYOd.zzH("candyCorn", 85);
        zzYOd.zzH("celticKnotwork", 86);
        zzYOd.zzH("certificateBanner", 87);
        zzYOd.zzH("chainLink", 88);
        zzYOd.zzH("champagneBottle", 89);
        zzYOd.zzH("checkedBarBlack", 90);
        zzYOd.zzH("checkedBarColor", 91);
        zzYOd.zzH("checkered", 92);
        zzYOd.zzH("christmasTree", 93);
        zzYOd.zzH("circlesLines", 94);
        zzYOd.zzH("circlesRectangles", 95);
        zzYOd.zzH("classicalWave", 96);
        zzYOd.zzH("clocks", 97);
        zzYOd.zzH("compass", 98);
        zzYOd.zzH("confetti", 99);
        zzYOd.zzH("confettiGrays", 100);
        zzYOd.zzH("confettiOutline", 101);
        zzYOd.zzH("confettiStreamers", 102);
        zzYOd.zzH("confettiWhite", 103);
        zzYOd.zzH("cornerTriangles", 104);
        zzYOd.zzH("couponCutoutDashes", 105);
        zzYOd.zzH("couponCutoutDots", 106);
        zzYOd.zzH("crazyMaze", 107);
        zzYOd.zzH("creaturesButterfly", 108);
        zzYOd.zzH("creaturesFish", 109);
        zzYOd.zzH("creaturesInsects", 110);
        zzYOd.zzH("creaturesLadyBug", 111);
        zzYOd.zzH("crossStitch", 112);
        zzYOd.zzH("cup", 113);
        zzYOd.zzH("decoArch", 114);
        zzYOd.zzH("decoArchColor", 115);
        zzYOd.zzH("decoBlocks", 116);
        zzYOd.zzH("diamondsGray", 117);
        zzYOd.zzH("doubleD", 118);
        zzYOd.zzH("doubleDiamonds", 119);
        zzYOd.zzH("earth1", 120);
        zzYOd.zzH("earth2", 121);
        zzYOd.zzH("eclipsingSquares1", 122);
        zzYOd.zzH("eclipsingSquares2", 123);
        zzYOd.zzH("eggsBlack", 124);
        zzYOd.zzH("fans", 125);
        zzYOd.zzH("film", 126);
        zzYOd.zzH("firecrackers", 127);
        zzYOd.zzH("flowersBlockPrint", 128);
        zzYOd.zzH("flowersDaisies", 129);
        zzYOd.zzH("flowersModern1", 130);
        zzYOd.zzH("flowersModern2", 131);
        zzYOd.zzH("flowersPansy", 132);
        zzYOd.zzH("flowersRedRose", 133);
        zzYOd.zzH("flowersRoses", 134);
        zzYOd.zzH("flowersTeacup", 135);
        zzYOd.zzH("flowersTiny", 136);
        zzYOd.zzH("gems", 137);
        zzYOd.zzH("gingerbreadMan", 138);
        zzYOd.zzH("gradient", 139);
        zzYOd.zzH("handmade1", 140);
        zzYOd.zzH("handmade2", 141);
        zzYOd.zzH("heartBalloon", 142);
        zzYOd.zzH("heartGray", 143);
        zzYOd.zzH("hearts", 144);
        zzYOd.zzH("heebieJeebies", 145);
        zzYOd.zzH("holly", 146);
        zzYOd.zzH("houseFunky", 147);
        zzYOd.zzH("hypnotic", 148);
        zzYOd.zzH("iceCreamCones", 149);
        zzYOd.zzH("lightBulb", 150);
        zzYOd.zzH("lightning1", 151);
        zzYOd.zzH("lightning2", 152);
        zzYOd.zzH("mapPins", 153);
        zzYOd.zzH("mapleLeaf", 154);
        zzYOd.zzH("mapleMuffins", 155);
        zzYOd.zzH("marquee", 156);
        zzYOd.zzH("marqueeToothed", 157);
        zzYOd.zzH("moons", 158);
        zzYOd.zzH("mosaic", 159);
        zzYOd.zzH("musicNotes", 160);
        zzYOd.zzH("northwest", 161);
        zzYOd.zzH("ovals", 162);
        zzYOd.zzH("packages", 163);
        zzYOd.zzH("palmsBlack", 164);
        zzYOd.zzH("palmsColor", 165);
        zzYOd.zzH("paperClips", 166);
        zzYOd.zzH("papyrus", 167);
        zzYOd.zzH("partyFavor", 168);
        zzYOd.zzH("partyGlass", 169);
        zzYOd.zzH("pencils", 170);
        zzYOd.zzH("people", 171);
        zzYOd.zzH("peopleWaving", 172);
        zzYOd.zzH("peopleHats", 173);
        zzYOd.zzH("poinsettias", 174);
        zzYOd.zzH("postageStamp", 175);
        zzYOd.zzH("pumpkin1", 176);
        zzYOd.zzH("pushPinNote1", 178);
        zzYOd.zzH("pushPinNote2", 177);
        zzYOd.zzH("pyramids", 179);
        zzYOd.zzH("pyramidsAbove", 180);
        zzYOd.zzH("quadrants", 181);
        zzYOd.zzH("rings", 182);
        zzYOd.zzH("safari", 183);
        zzYOd.zzH("sawtooth", 184);
        zzYOd.zzH("sawtoothGray", 185);
        zzYOd.zzH("scaredCat", 186);
        zzYOd.zzH("seattle", 187);
        zzYOd.zzH("shadowedSquares", 188);
        zzYOd.zzH("sharksTeeth", 189);
        zzYOd.zzH("shorebirdTracks", 190);
        zzYOd.zzH("skyrocket", 191);
        zzYOd.zzH("snowflakeFancy", 192);
        zzYOd.zzH("snowflakes", 193);
        zzYOd.zzH("sombrero", 194);
        zzYOd.zzH("southwest", 195);
        zzYOd.zzH("stars", 196);
        zzYOd.zzH("starsTop", 197);
        zzYOd.zzH("stars3d", 198);
        zzYOd.zzH("starsBlack", 199);
        zzYOd.zzH("starsShadowed", 200);
        zzYOd.zzH(LocalePreferences.FirstDayOfWeek.SUNDAY, 201);
        zzYOd.zzH("swirligig", 202);
        zzYOd.zzH("tornPaper", 203);
        zzYOd.zzH("tornPaperBlack", 204);
        zzYOd.zzH("trees", 205);
        zzYOd.zzH("triangleParty", 206);
        zzYOd.zzH("triangles", 207);
        zzYOd.zzH("tribal1", 208);
        zzYOd.zzH("tribal2", 209);
        zzYOd.zzH("tribal3", 210);
        zzYOd.zzH("tribal4", 211);
        zzYOd.zzH("tribal5", 212);
        zzYOd.zzH("tribal6", 213);
        zzYOd.zzH("twistedLines1", 214);
        zzYOd.zzH("twistedLines2", 215);
        zzYOd.zzH("vine", 216);
        zzYOd.zzH("waveline", 217);
        zzYOd.zzH("weavingAngles", 218);
        zzYOd.zzH("weavingBraid", 219);
        zzYOd.zzH("weavingRibbon", 220);
        zzYOd.zzH("weavingStrips", 221);
        zzYOd.zzH("whiteFlowers", 222);
        zzYOd.zzH("woodwork", 223);
        zzYOd.zzH("xIllusions", 224);
        zzYOd.zzH("zanyTriangles", 225);
        zzYOd.zzH("zigZag", 226);
        zzYOd.zzH("zigZagStitch", 227);
        zzYOd.zzH("earth3", 228);
        zzYOd.zzH("triangle1", 229);
        zzYOd.zzH("triangle2", 230);
        zzYOd.zzH("triangleCircle1", 231);
        zzYOd.zzH("triangleCircle2", 232);
        zzYOd.zzH("shapes1", 233);
        zzYOd.zzH("shapes2", 234);
        zzYOd.zzH("custom", 235);
        zzYOf.zzH("decimal", 0);
        zzYOf.zzH("upperRoman", 1);
        zzYOf.zzH("lowerRoman", 2);
        zzYOf.zzH("upperLetter", 3);
        zzYOf.zzH("lowerLetter", 4);
        zzYOf.zzH("ordinal", 5);
        zzYOf.zzH("cardinalText", 6);
        zzYOf.zzH("ordinalText", 7);
        zzYOf.zzH("hex", 8);
        zzYOf.zzH("chicago", 9);
        zzYOf.zzH("ideographDigital", 10);
        zzYOf.zzH("japaneseCounting", 11);
        zzYOf.zzH("aiueo", 12);
        zzYOf.zzH("iroha", 13);
        zzYOf.zzH("decimalFullWidth", 14);
        zzYOf.zzH("decimalHalfWidth", 15);
        zzYOf.zzH("japaneseLegal", 16);
        zzYOf.zzH("japaneseDigitalTenThousand", 17);
        zzYOf.zzH("decimalEnclosedCircle", 18);
        zzYOf.zzH("decimalFullWidth2", 19);
        zzYOf.zzH("aiueoFullWidth", 20);
        zzYOf.zzH("irohaFullWidth", 21);
        zzYOf.zzH("decimalZero", 22);
        zzYOf.zzH("bullet", 23);
        zzYOf.zzH("ganada", 24);
        zzYOf.zzH("chosung", 25);
        zzYOf.zzH("decimalEnclosedFullstop", 26);
        zzYOf.zzH("decimalEnclosedParen", 27);
        zzYOf.zzH("decimalEnclosedCircleChinese", 28);
        zzYOf.zzH("ideographEnclosedCircle", 29);
        zzYOf.zzH("ideographTraditional", 30);
        zzYOf.zzH("ideographZodiac", 31);
        zzYOf.zzH("ideographZodiacTraditional", 32);
        zzYOf.zzH("taiwaneseCounting", 33);
        zzYOf.zzH("ideographLegalTraditional", 34);
        zzYOf.zzH("taiwaneseCountingThousand", 35);
        zzYOf.zzH("taiwaneseDigital", 36);
        zzYOf.zzH("chineseCounting", 37);
        zzYOf.zzH("chineseLegalSimplified", 38);
        zzYOf.zzH("chineseCountingThousand", 39);
        zzYOf.zzH("koreanDigital", 41);
        zzYOf.zzH("koreanCounting", 42);
        zzYOf.zzH("koreanLegal", 43);
        zzYOf.zzH("koreanDigital2", 44);
        zzYOf.zzH("vietnameseCounting", 56);
        zzYOf.zzH("russianLower", 58);
        zzYOf.zzH("russianUpper", 59);
        zzYOf.zzH("none", 255);
        zzYOf.zzH("numberInDash", 57);
        zzYOf.zzH("hebrew1", 45);
        zzYOf.zzH("hebrew2", 47);
        zzYOf.zzH("arabicAlpha", 46);
        zzYOf.zzH("arabicAbjad", 48);
        zzYOf.zzH("hindiVowels", 49);
        zzYOf.zzH("hindiConsonants", 50);
        zzYOf.zzH("hindiNumbers", 51);
        zzYOf.zzH("hindiCounting", 52);
        zzYOf.zzH("thaiLetters", 53);
        zzYOf.zzH("thaiNumbers", 54);
        zzYOf.zzH("thaiCounting", 55);
        zzYOf.zzH("custom", 65280);
        zzYOc.zzH("paragraph", 1);
        zzYOc.zzH(FirebaseAnalytics.Param.CHARACTER, 2);
        zzYOc.zzH("table", 3);
        zzYOc.zzH("numbering", 4);
        zzYOe.zzH("auto", 0);
        zzYOe.zzH("decorative", 5);
        zzYOe.zzH("modern", 3);
        zzYOe.zzH("roman", 1);
        zzYOe.zzH("script", 4);
        zzYOe.zzH("swiss", 2);
        zzYOb.zzH("normal", -1);
        zzYOb.zzH("separator", 0);
        zzYOb.zzH("continuationSeparator", 1);
        zzYOb.zzH("continuationNotice", 2);
        zzYOa.zzH("normal", -1);
        zzYOa.zzH("separator", 3);
        zzYOa.zzH("continuationSeparator", 4);
        zzYOa.zzH("continuationNotice", 5);
        zzYO9.zzH(FirebaseAnalytics.Param.CONTENT, 0);
        zzYO9.zzH(ContextChain.TAG_PRODUCT, 1);
        zzYO9.zzH("pg", 2);
        zzYO8.zzH("any", 0);
        zzYO8.zzH("autoTxt", 1);
        zzYO8.zzH("bib", 2);
        zzYO8.zzH("coverPg", 3);
        zzYO8.zzH("custAutoTxt", 4);
        zzYO8.zzH("custBib", 5);
        zzYO8.zzH("custCoverPg", 6);
        zzYO8.zzH("custEq", 7);
        zzYO8.zzH("custFtrs", 8);
        zzYO8.zzH("custHdrs", 9);
        zzYO8.zzH("custom1", 10);
        zzYO8.zzH("custom2", 11);
        zzYO8.zzH("custom3", 12);
        zzYO8.zzH("custom4", 13);
        zzYO8.zzH("custom5", 14);
        zzYO8.zzH("custPgNum", 15);
        zzYO8.zzH("custPgNumB", 16);
        zzYO8.zzH("custPgNumMargins", 17);
        zzYO8.zzH("custPgNumT", 18);
        zzYO8.zzH("custQuickParts", 19);
        zzYO8.zzH("custTblOfContents", 20);
        zzYO8.zzH("custTbls", 21);
        zzYO8.zzH("custTxtBox", 22);
        zzYO8.zzH("custWatermarks", 23);
        zzYO8.zzH("default", 24);
        zzYO8.zzH("docParts", 25);
        zzYO8.zzH("eq", 26);
        zzYO8.zzH("ftrs", 27);
        zzYO8.zzH("hdrs", 28);
        zzYO8.zzH("pgNum", 29);
        zzYO8.zzH("pgNumB", 30);
        zzYO8.zzH("pgNumMargins", 31);
        zzYO8.zzH("pgNumT", 32);
        zzYO8.zzH("placeholder", 33);
        zzYO8.zzH("tblOfContents", 34);
        zzYO8.zzH("tbls", 35);
        zzYO8.zzH("txtBox", 36);
        zzYO8.zzH("watermarks", 37);
        zzYO7.zzH("autoExp", 1);
        zzYO7.zzH("bbPlcHdr", 2);
        zzYO7.zzH("formFld", 3);
        zzYO7.zzH("none", 0);
        zzYO7.zzH("normal", 4);
        zzYO7.zzH("speller", 5);
        zzYO7.zzH("toolbar", 6);
        zzYO6.zzH(LocalePreferences.CalendarType.GREGORIAN, 0);
        zzYO6.zzH("gregorianArabic", 1);
        zzYO6.zzH("gregorianMeFrench", 2);
        zzYO6.zzH("gregorianUs", 3);
        zzYO6.zzH("gregorianXlitEnglish", 4);
        zzYO6.zzH("gregorianXlitFrench", 5);
        zzYO6.zzH(LocalePreferences.CalendarType.HEBREW, 6);
        zzYO6.zzH("hijri", 7);
        zzYO6.zzH("japan", 8);
        zzYO6.zzH("korea", 9);
        zzYO6.zzH("none", 10);
        zzYO6.zzH("saka", 11);
        zzYO6.zzH("taiwan", 12);
        zzYO6.zzH("thai", 13);
        zzYO5.zzH("contentLocked", 1);
        zzYO5.zzH("sdtContentLocked", 2);
        zzYO5.zzH("sdtLocked", 3);
        zzYO5.zzH("unlocked", 0);
        zzYO4.zzH("date", 0);
        zzYO4.zzH("dateTime", 1);
        zzYO4.zzH("text", 2);
        zzYO3.zzH("boundingBox", 0);
        zzYO3.zzH("tags", 1);
        zzYO3.zzH("hidden", 2);
        zzYO2.zzH("center", 2);
        zzYO2.zzH("centerGroup", 1);
        zzYO2.zzH("left", 3);
        zzYO2.zzH("right", 4);
        zzYO1.zzH("double-struck", 3);
        zzYO1.zzH("fraktur", 2);
        zzYO1.zzH("monospace", 5);
        zzYO1.zzH("roman", 0);
        zzYO1.zzH("sans-serif", 4);
        zzYO1.zzH("script", 1);
        zzYO0.zzH(ContextChain.TAG_PRODUCT, 0);
        zzYO0.zzH("b", 1);
        zzYO0.zzH(ContextChain.TAG_INFRA, 2);
        zzYO0.zzH("bi", 3);
        zzYNZ.zzH("top", 0);
        zzYNZ.zzH("bot", 1);
        zzYNY.zzH("centered", 0);
        zzYNY.zzH("match", 1);
        zzYNX.zzH("top", 0);
        zzYNX.zzH("bot", 1);
        zzYNW.zzH("bar", 0);
        zzYNW.zzH("lin", 1);
        zzYNW.zzH("noBar", 2);
        zzYNW.zzH("skw", 3);
        zzYNV.zzH("subSup", 0);
        zzYNV.zzH("undOvr", 1);
        zzYNU.zzH("center", 1);
        zzYNU.zzH("left", 0);
        zzYNU.zzH("right", 2);
        zzYNS.zzH("dot", 0);
        zzYNS.zzH("hyphen", 1);
        zzYNS.zzH("middleDot", 2);
        zzYNS.zzH("none", 3);
        zzYNS.zzH("underscore", 4);
        zzYNT.zzH(HTMLWriter.INDENT, 0);
        zzYNT.zzH("margin", 1);
        zzYNR.zzH("None", 0);
        zzYNR.zzH("AD", 1);
        zzYNR.zzH("Windows Live", 2);
        zzYNQ.zzH("right", 0);
        zzYNQ.zzH("left", 1);
        zzYNP.zzH("omex", 1);
        zzYNP.zzH("spapp", 2);
        zzYNP.zzH("registry", 5);
        zzYNP.zzH("exchange", 3);
        zzYNP.zzH("spcatalog", 0);
        zzYNP.zzH("excatalog", 6);
        zzYNP.zzH("filesystem", 4);
        zzYNO.zzH("text", 2);
        zzYNO.zzH("table", 1);
        zzYNO.zzH("matrix", 0);
        zzUR = new com.aspose.words.internal.zzZHW("application/msword", "application/vnd.ms-excel", "application/vnd.ms-powerpoint", "application/vnd.visio", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.wordprocessingml.template", "application/vnd.ms-word.document.macroEnabled.12", "application/vnd.ms-word.template.macroEnabled.12", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.ms-excel.sheet.macroEnabled.12", "application/vnd.ms-excel.sheet.binary.macroEnabled.12", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.ms-powerpoint.presentation.macroEnabled.12", "application/vnd.openxmlformats-officedocument.presentationml.slideshow", "application/vnd.ms-powerpoint.slideshow.macroEnabled.12", "application/vnd.openxmlformats-officedocument.presentationml.slide", "application/vnd.ms-powerpoint.slide.macroEnabled.12", "application/vnd.ms-visio.drawing", "default", "lining", "oldStyle", "proportional", "tabular", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "calculated", "currentDate", "currentTime", "date", "number", "", "regular", "top", "bottom", "bot", "center");
    }

    public static String zz2(int i, boolean z) {
        return i != 0 ? i != 1 ? "center" : z ? "bottom" : "bot" : "top";
    }

    public static String zz3(int i, boolean z) {
        return (z ? zzYOa : zzYOb).zzO(i, "");
    }

    public static String zzEL(int i) {
        return zzYNO.zzO(i, "matrix");
    }

    public static String zzEM(int i) {
        return zzYNP.zzO(i, "spcatalog");
    }

    public static String zzEN(int i) {
        return zzYNQ.zzO(i, "right");
    }

    public static String zzEO(int i) {
        return zzYNR.zzO(i, "None");
    }

    public static String zzEP(int i) {
        return zzYNT.zzO(i, "");
    }

    public static String zzEQ(int i) {
        return zzYNS.zzO(i, "");
    }

    public static String zzER(int i) {
        return zzYNU.zzO(i, "");
    }

    public static String zzES(int i) {
        return zzYNV.zzO(i, "");
    }

    public static String zzET(int i) {
        return zzYNW.zzO(i, "");
    }

    public static String zzEU(int i) {
        return zzYNX.zzO(i, "");
    }

    public static String zzEV(int i) {
        return zzYNY.zzO(i, "");
    }

    public static String zzEW(int i) {
        return zzYNZ.zzO(i, "");
    }

    public static String zzEX(int i) {
        return zzYO0.zzO(i, "");
    }

    public static String zzEY(int i) {
        return zzYO1.zzO(i, "");
    }

    public static String zzEZ(int i) {
        return zzYO2.zzO(i, "");
    }

    public static String zzF0(int i) {
        return zzYO3.zzO(i, "boundingBox");
    }

    public static String zzF1(int i) {
        return zzYO4.zzO(i, "dateTime");
    }

    public static String zzF2(int i) {
        return zzYO5.zzO(i, "");
    }

    public static String zzF3(int i) {
        return zzYO6.zzO(i, "");
    }

    public static String zzF4(int i) {
        return zzYO7.zzO(i, "");
    }

    public static String zzF5(int i) {
        return zzYO8.zzO(i, "any");
    }

    public static String zzF6(int i) {
        return zzYO9.zzO(i, "");
    }

    public static String zzF7(int i) {
        return zzYOc.zzO(i, "paragraph");
    }

    public static String zzF8(int i) {
        return i != 5 ? zzYOd.zzO(i, "none") : "single";
    }

    public static String zzF9(int i) {
        return zzYOe.zzO(i, "");
    }

    public static String zzFa(int i) {
        return zzYOf.zzO(i, "");
    }

    public static String zzFb(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "calculated" : "currentTime" : "currentDate" : "date" : "number";
    }

    public static String zzFc(int i) {
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "2";
        }
        switch (i) {
            case 4:
                return "3";
            case 8:
                return "4";
            case 16:
                return "5";
            case 32:
                return "6";
            case 64:
                return "7";
            case 128:
                return "8";
            case 256:
                return "9";
            case 512:
                return "10";
            case 1024:
                return "11";
            case 2048:
                return "12";
            case 4096:
                return "13";
            case 8192:
                return "14";
            case 16384:
                return "15";
            case 32768:
                return "16";
            case 65536:
                return "17";
            case 131072:
                return "18";
            case 262144:
                return "19";
            case 524288:
                return "20";
            default:
                return "0";
        }
    }

    public static String zzFd(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "tabular" : "proportional" : "default";
    }

    public static String zzFe(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "oldStyle" : "lining" : "default";
    }

    public static String zzFf(int i) {
        if (i == 0) {
            return "none";
        }
        if (i == 15) {
            return "all";
        }
        StringBuilder sb = new StringBuilder();
        if ((i & 1) != 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, "Standard");
        }
        if ((i & 2) != 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, "Contextual");
        }
        if ((i & 4) != 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, "Historical");
        }
        if ((i & 8) != 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, "Discretional");
        }
        String string = sb.toString();
        return com.aspose.words.internal.zzZKN.format("{0}{1}", string.substring(0, 1).toLowerCase(), string.substring(1));
    }

    public static int zzMX(String str) {
        return zzYNO.zzG(str, 0);
    }

    public static int zzMY(String str) {
        return zzYNP.zzG(str, 0);
    }

    public static int zzMZ(String str) {
        return zzYNQ.zzG(str, 0);
    }

    public static int zzN0(String str) {
        return zzYNR.zzG(str, 0);
    }

    public static int zzN1(String str) {
        return zzYNT.zzG(str, 0);
    }

    public static int zzN2(String str) {
        return zzYNS.zzG(str, 3);
    }

    public static int zzN3(String str) {
        return zzYNU.zzG(str, 0);
    }

    public static int zzN4(String str) {
        return zzYNV.zzG(str, 1);
    }

    public static int zzN5(String str) {
        return zzYNW.zzG(str, 0);
    }

    public static int zzN6(String str) {
        return zzYNX.zzG(str, 1);
    }

    public static int zzN7(String str) {
        return zzYNY.zzG(str, 0);
    }

    public static int zzN8(String str) {
        return zzYNZ.zzG(str, 1);
    }

    public static int zzN9(String str) {
        return zzYO0.zzG(str, 2);
    }

    public static int zzNa(String str) {
        return zzYO1.zzG(str, 0);
    }

    public static int zzNb(String str) {
        return zzYO2.zzG(str, 1);
    }

    public static int zzNc(String str) {
        return zzYO3.zzG(str, 0);
    }

    public static int zzNd(String str) {
        return zzYO4.zzG(str, 1);
    }

    public static int zzNe(String str) {
        return zzYO5.zzG(str, 0);
    }

    public static int zzNf(String str) {
        return zzYO6.zzG(str, 10);
    }

    public static int zzNg(String str) {
        return zzYO7.zzG(str, 0);
    }

    public static int zzNh(String str) {
        return zzYO8.zzG(str, 0);
    }

    public static int zzNi(String str) {
        return zzYO9.zzG(str, 0);
    }

    public static int zzNj(String str) {
        return zzYOc.zzG(str, 1);
    }

    public static int zzNk(String str) {
        return zzYOd.zzG(str, 0);
    }

    public static int zzNl(String str) {
        return zzYOe.zzG(str, 0);
    }

    public static int zzNm(String str) {
        return zzYOf.zzG(str, 0);
    }

    public static int zzNn(String str) {
        switch (zzUR.zzTP(str)) {
            case 43:
                return 5;
            case 44:
                return 3;
            case 45:
                return 4;
            case 46:
                return 2;
            case 47:
                return 1;
            default:
                return 0;
        }
    }

    public static int zzNo(String str) {
        switch (zzUR.zzTP(str)) {
            case 23:
                return 1;
            case 24:
                return 2;
            case 25:
                return 4;
            case 26:
                return 8;
            case 27:
                return 16;
            case 28:
                return 32;
            case 29:
                return 64;
            case 30:
                return 128;
            case 31:
                return 256;
            case 32:
                return 512;
            case 33:
                return 1024;
            case 34:
                return 2048;
            case 35:
                return 4096;
            case 36:
                return 8192;
            case 37:
                return 16384;
            case 38:
                return 32768;
            case 39:
                return 65536;
            case 40:
                return 131072;
            case 41:
                return 262144;
            case 42:
                return 524288;
            default:
                return 0;
        }
    }

    public static int zzNp(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 21) {
            return iZzTP != 22 ? 0 : 2;
        }
        return 1;
    }

    public static int zzNq(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 19) {
            return iZzTP != 20 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    public static int zzNr(String str) {
        if ("none".equals(str)) {
            return 0;
        }
        if ("all".equals(str)) {
            return 15;
        }
        boolean zZzX = com.aspose.words.internal.zzZYD.zzX(str, "standard", true);
        ?? r0 = zZzX;
        if (com.aspose.words.internal.zzZYD.zzX(str, "contextual", true)) {
            r0 = (zZzX ? 1 : 0) | 2;
        }
        ?? r02 = r0;
        if (com.aspose.words.internal.zzZYD.zzX(str, "historical", true)) {
            r02 = (r0 == true ? 1 : 0) | 4;
        }
        return com.aspose.words.internal.zzZYD.zzX(str, "discretional", true) ? r02 | 8 : r02;
    }

    public static String zzNs(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
                return ".doc";
            case 1:
                return ".xls";
            case 2:
                return ".ppt";
            case 3:
                return ".vsd";
            case 4:
                return ".docx";
            case 5:
                return ".dotx";
            case 6:
                return ".docm";
            case 7:
                return ".dotm";
            case 8:
                return ".xlsx";
            case 9:
                return ".xlsm";
            case 10:
                return ".xlsb";
            case 11:
                return ".pptx";
            case 12:
                return ".pptm";
            case 13:
                return ".ppsx";
            case 14:
                return ".ppsm";
            case 15:
                return ".sldx";
            case 16:
                return ".sldm";
            case 17:
                return ".vsdx";
            default:
                return ".bin";
        }
    }

    public static int zzX(String str, zzYO3 zzyo3) {
        switch (zzUR.zzTP(str)) {
            case 51:
                if (zzyo3 != null) {
                    zzyo3.zzYrc();
                }
                break;
        }
        return 1;
    }

    public static int zzv(String str, boolean z) {
        return (z ? zzYOa : zzYOb).zzG(str, -1);
    }
}
