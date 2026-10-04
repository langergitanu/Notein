package com.aspose.slides.internal.p237ks;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.network.embedded.C18208i0;
import com.miui.penengine.p597f.C18776a;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.ks.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5910x1 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f16728k4 = new C7017h4("none", "box", "check", "circle", "diamond", "disc", "dash", "square", "arabic-indic", "bengali", "binary", "burmese", "cambodian", "cjk-decimal", "decimal", "devanagari", "eastern-nagari", "fullwidth-decimal", "gujarati", "gurmukhi", "kannada", "khmer", "lower-hexadecimal", "lao", "lepcha", "malayalam", "marathi", "mongolian", "myanmar", "new-base-60", "octal", "oriya", LocalePreferences.CalendarType.PERSIAN, "super-decimal", "tamil", "telugu", "tibetan", "thai", "upper-hexadecimal", "afar", "agaw", "ari", "blin", "cjk-earthly-branch", "cjk-heavenly-stem", C18776a.f57276h, "fullwidth-lower-alpha", "fullwidth-upper-alpha", "gedeo", "gumuz", "hadiyya", "harari", "hindi", "hiragana-iroha", "hiragana", "kaffa", "katakana-iroha", "katakana", "kebena", "kembata", "konso", "korean-consonant", "korean-syllable", "kunama", "lower-alpha", "lower-belorussian", "lower-bulgarian", "lower-greek", "lower-latin", "lower-macedonian", "lower-oromo-qubee", "lower-russian", "lower-russian-full", "lower-serbo-croatian", "lower-ukrainian", "lower-ukrainian-full", "meen", "oromo", "saho", "sidama", "silti", "thai-alphabetic", "tigre", "upper-alpha", "upper-belorussian", "upper-bulgarian", "upper-latin", "upper-macedonian", "upper-oromo-qubee", "upper-russian", "upper-russian-full", "upper-serbo-croatian", "upper-ukrainian", "upper-ukrainian-full", "wolaita", "yemsa", "asterisks", "footnotes", "lower-alpha-symbolic", "upper-alpha-symbolic", "circled-decimal", "circled-lower-latin", "circled-upper-latin", "circled-korean-consonants", "circled-korean-syllables", "decimal-leading-zero", "dotted-decimal", "double-circled-decimal", "filled-circled-decimal", "fullwidth-upper-roman", "fullwidth-lower-roman", "parenthesized-decimal", "parenthesized-lower-latin", "parenthesized-hangul-consonants", "parenthesized-hangul-syllable", "persian-abjad", "persian-alphabetic", LocalePreferences.CalendarType.HEBREW, "simple-upper-roman", "simple-lower-roman", "upper-roman", "lower-roman", "lower-armenian", "upper-armenian", "armenian", "georgian", "ancient-tamil", "japanese-informal", "japanese-formal", "korean-hangul-formal", "korean-hanja-informal", "korean-hanja-formal", "greek");

    /* JADX INFO: renamed from: k4 */
    public final C5906k4 m23878k4(String str) {
        int iM27428k4 = f16728k4.m27428k4(str);
        Integer numValueOf = Integer.valueOf(SQLitePersistence.MAX_ARGS);
        switch (iM27428k4) {
            case 0:
                return new C5906k4(C14113y2.f47374k4);
            case 1:
                C5906k4 c5906k4OooO00o = OooO00o.OooO00o(0, "box");
                c5906k4OooO00o.m23786k4("\\25FD");
                c5906k4OooO00o.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o;
            case 2:
                C5906k4 c5906k4OooO00o2 = OooO00o.OooO00o(0, "check");
                c5906k4OooO00o2.m23786k4("\\2713");
                c5906k4OooO00o2.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o2;
            case 3:
                C5906k4 c5906k4OooO00o3 = OooO00o.OooO00o(0, "circle");
                c5906k4OooO00o3.m23786k4("\\25E6");
                c5906k4OooO00o3.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o3;
            case 4:
                C5906k4 c5906k4OooO00o4 = OooO00o.OooO00o(0, "diamond");
                c5906k4OooO00o4.m23786k4("\\25C6");
                c5906k4OooO00o4.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o4;
            case 5:
                C5906k4 c5906k4OooO00o5 = OooO00o.OooO00o(0, "disc");
                c5906k4OooO00o5.m23786k4("\\2022");
                c5906k4OooO00o5.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o5;
            case 6:
                C5906k4 c5906k4OooO00o6 = OooO00o.OooO00o(0, "dash");
                c5906k4OooO00o6.m23786k4("\\2014");
                c5906k4OooO00o6.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o6;
            case 7:
                C5906k4 c5906k4OooO00o7 = OooO00o.OooO00o(0, "square");
                c5906k4OooO00o7.m23786k4("\\25FE");
                c5906k4OooO00o7.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o7;
            case 8:
                C5906k4 c5906k4OooO00o8 = OooO00o.OooO00o(1, "arabic-indic");
                c5906k4OooO00o8.m23786k4("\\660", "\\661", "\\662", "\\663", "\\664", "\\665", "\\666", "\\667", "\\668", "\\669");
                return c5906k4OooO00o8;
            case 9:
                C5906k4 c5906k4OooO00o9 = OooO00o.OooO00o(1, "bengali");
                c5906k4OooO00o9.m23786k4("\\9E6", "\\9E7", "\\9E8", "\\9E9", "\\9EA", "\\9EB", "\\9EC", "\\9ED", "\\9EE", "\\9EF");
                return c5906k4OooO00o9;
            case 10:
                C5906k4 c5906k4OooO00o10 = OooO00o.OooO00o(1, "binary");
                c5906k4OooO00o10.m23786k4("\\30", "\\31");
                return c5906k4OooO00o10;
            case 11:
                C5906k4 c5906k4OooO00o11 = OooO00o.OooO00o(1, "burmese");
                c5906k4OooO00o11.m23786k4("\\1040", "\\1041", "\\1042", "\\1043", "\\1044", "\\1045", "\\1046", "\\1047", "\\1048", "\\1049");
                return c5906k4OooO00o11;
            case 12:
                C5906k4 c5906k4OooO00o12 = OooO00o.OooO00o(1, "cambodian");
                c5906k4OooO00o12.m23786k4("\\17E0", "\\17E1", "\\17E2", "\\17E3", "\\17E4", "\\17E5", "\\17E6", "\\17E7", "\\17E8", "\\17E9");
                return c5906k4OooO00o12;
            case 13:
                C5906k4 c5906k4OooO00o13 = OooO00o.OooO00o(1, "cjk-decimal");
                c5906k4OooO00o13.m23786k4("\\3007", "\\4E00", "\\4E8C", "\\4E09", "\\56DB", "\\4E94", "\\516D", "\\4E03", "\\516B", "\\4E5D");
                return c5906k4OooO00o13;
            case 14:
                C5906k4 c5906k4OooO00o14 = OooO00o.OooO00o(1, "decimal");
                c5906k4OooO00o14.m23786k4("\\30", "\\31", "\\32", "\\33", "\\34", "\\35", "\\36", "\\37", "\\38", "\\39");
                return c5906k4OooO00o14;
            case 15:
                C5906k4 c5906k4OooO00o15 = OooO00o.OooO00o(1, "devanagari");
                c5906k4OooO00o15.m23786k4("\\966", "\\967", "\\968", "\\969", "\\96A", "\\96B", "\\96C", "\\96D", "\\96E", "\\96F");
                return c5906k4OooO00o15;
            case 16:
                C5906k4 c5906k4OooO00o16 = OooO00o.OooO00o(1, "eastern-nagari");
                c5906k4OooO00o16.m23786k4("\\9E6", "\\9E7", "\\9E8", "\\9E9", "\\9EA", "\\9EB", "\\9EC", "\\9ED", "\\9EE", "\\9EF");
                return c5906k4OooO00o16;
            case 17:
                C5906k4 c5906k4OooO00o17 = OooO00o.OooO00o(1, "fullwidth-decimal");
                c5906k4OooO00o17.m23786k4("\\FF10", "\\FF11", "\\FF12", "\\FF13", "\\FF14", "\\FF15", "\\FF16", "\\FF17", "\\FF18", "\\FF19");
                return c5906k4OooO00o17;
            case 18:
                C5906k4 c5906k4OooO00o18 = OooO00o.OooO00o(1, "gujarati");
                c5906k4OooO00o18.m23786k4("\\AE6", "\\AE7", "\\AE8", "\\AE9", "\\AEA", "\\AEB", "\\AEC", "\\AED", "\\AEE", "\\AEF");
                return c5906k4OooO00o18;
            case 19:
                C5906k4 c5906k4OooO00o19 = OooO00o.OooO00o(1, "gurmukhi");
                c5906k4OooO00o19.m23786k4("\\A66", "\\A67", "\\A68", "\\A69", "\\A6A", "\\A6B", "\\A6C", "\\A6D", "\\A6E", "\\A6F");
                return c5906k4OooO00o19;
            case 20:
                C5906k4 c5906k4OooO00o20 = OooO00o.OooO00o(1, "kannada");
                c5906k4OooO00o20.m23786k4("\\CE6", "\\CE7", "\\CE8", "\\CE9", "\\CEA", "\\CEB", "\\CEC", "\\CED", "\\CEE", "\\CEF");
                return c5906k4OooO00o20;
            case 21:
                C5906k4 c5906k4OooO00o21 = OooO00o.OooO00o(1, "khmer");
                c5906k4OooO00o21.m23786k4("\\17E0", "\\17E1", "\\17E2", "\\17E3", "\\17E4", "\\17E5", "\\17E6", "\\17E7", "\\17E8", "\\17E9");
                return c5906k4OooO00o21;
            case 22:
                C5906k4 c5906k4OooO00o22 = OooO00o.OooO00o(1, "lower-hexadecimal");
                c5906k4OooO00o22.m23786k4("\\30", "\\31", "\\32", "\\33", "\\34", "\\35", "\\36", "\\37", "\\38", "\\39", "\\61", "\\62", "\\63", "\\64", "\\65", "\\66");
                return c5906k4OooO00o22;
            case 23:
                C5906k4 c5906k4OooO00o23 = OooO00o.OooO00o(1, "lao");
                c5906k4OooO00o23.m23786k4("\\ED0", "\\ED1", "\\ED2", "\\ED3", "\\ED4", "\\ED5", "\\ED6", "\\ED7", "\\ED8", "\\ED9");
                return c5906k4OooO00o23;
            case 24:
                C5906k4 c5906k4OooO00o24 = OooO00o.OooO00o(1, "lepcha");
                c5906k4OooO00o24.m23786k4("\\1C40", "\\1C41", "\\1C42", "\\1C43", "\\1C44", "\\1C45", "\\1C46", "\\1C47", "\\1C48", "\\1C49");
                return c5906k4OooO00o24;
            case 25:
                C5906k4 c5906k4OooO00o25 = OooO00o.OooO00o(1, "malayalam");
                c5906k4OooO00o25.m23786k4("\\D66", "\\D67", "\\D68", "\\D69", "\\D6A", "\\D6B", "\\D6C", "\\D6D", "\\D6E", "\\D6F");
                return c5906k4OooO00o25;
            case 26:
                C5906k4 c5906k4OooO00o26 = OooO00o.OooO00o(1, "marathi");
                c5906k4OooO00o26.m23786k4("\\966", "\\967", "\\968", "\\969", "\\96A", "\\96B", "\\96C", "\\96D", "\\96E", "\\96F");
                return c5906k4OooO00o26;
            case 27:
                C5906k4 c5906k4OooO00o27 = OooO00o.OooO00o(1, "mongolian");
                c5906k4OooO00o27.m23786k4("\\1810", "\\1811", "\\1812", "\\1813", "\\1814", "\\1815", "\\1816", "\\1817", "\\1818", "\\1819");
                return c5906k4OooO00o27;
            case 28:
                C5906k4 c5906k4OooO00o28 = OooO00o.OooO00o(1, "myanmar");
                c5906k4OooO00o28.m23786k4("\\1040", "\\1041", "\\1042", "\\1043", "\\1044", "\\1045", "\\1046", "\\1047", "\\1048", "\\1049");
                return c5906k4OooO00o28;
            case 29:
                C5906k4 c5906k4OooO00o29 = OooO00o.OooO00o(1, "new-base-60");
                c5906k4OooO00o29.m23786k4("\\30", "\\31", "\\32", "\\33", "\\34", "\\35", "\\36", "\\37", "\\38", "\\39", "\\41", "\\42", "\\43", "\\44", "\\45", "\\46", "\\47", "\\48", "\\4A", "\\4B", "\\4C", "\\4D", "\\4E", "\\50", "\\51", "\\52", "\\53", "\\54", "\\55", "\\56", "\\57", "\\58", "\\59", "\\5A", "\\5F", "\\61", "\\62", "\\63", "\\64", "\\65", "\\66", "\\67", "\\68", "\\69", "\\6A", "\\6B", "\\6D", "\\6E", "\\6F", "\\70", "\\71", "\\72", "\\73", "\\74", "\\75", "\\76", "\\77", "\\78", "\\79", "\\7A");
                return c5906k4OooO00o29;
            case 30:
                C5906k4 c5906k4OooO00o30 = OooO00o.OooO00o(1, "octal");
                c5906k4OooO00o30.m23786k4("\\30", "\\31", "\\32", "\\33", "\\34", "\\35", "\\36", "\\37");
                return c5906k4OooO00o30;
            case 31:
                C5906k4 c5906k4OooO00o31 = OooO00o.OooO00o(1, "oriya");
                c5906k4OooO00o31.m23786k4("\\B66", "\\B67", "\\B68", "\\B69", "\\B6A", "\\B6B", "\\B6C", "\\B6D", "\\B6E", "\\B6F");
                return c5906k4OooO00o31;
            case 32:
                C5906k4 c5906k4OooO00o32 = OooO00o.OooO00o(1, LocalePreferences.CalendarType.PERSIAN);
                c5906k4OooO00o32.m23786k4("\\6F0", "\\6F1", "\\6F2", "\\6F3", "\\6F4", "\\6F5", "\\6F6", "\\6F7", "\\6F8", "\\6F9");
                return c5906k4OooO00o32;
            case 33:
                C5906k4 c5906k4OooO00o33 = OooO00o.OooO00o(1, "super-decimal");
                c5906k4OooO00o33.m23786k4("\\2070", "\\B9", "\\B2", "\\B3", "\\2074", "\\2075", "\\2076", "\\2077", "\\2078", "\\2079");
                return c5906k4OooO00o33;
            case 34:
                C5906k4 c5906k4OooO00o34 = OooO00o.OooO00o(1, "tamil");
                c5906k4OooO00o34.m23786k4("\\BE6", "\\BE7", "\\BE8", "\\BE9", "\\BEA", "\\BEB", "\\BEC", "\\BED", "\\BEE", "\\BEF");
                return c5906k4OooO00o34;
            case 35:
                C5906k4 c5906k4OooO00o35 = OooO00o.OooO00o(1, "telugu");
                c5906k4OooO00o35.m23786k4("\\C66", "\\C67", "\\C68", "\\C69", "\\C6A", "\\C6B", "\\C6C", "\\C6D", "\\C6E", "\\C6F");
                return c5906k4OooO00o35;
            case 36:
                C5906k4 c5906k4OooO00o36 = OooO00o.OooO00o(1, "tibetan");
                c5906k4OooO00o36.m23786k4("\\F20", "\\F21", "\\F22", "\\F23", "\\F24", "\\F25", "\\F26", "\\F27", "\\F28", "\\F29");
                return c5906k4OooO00o36;
            case 37:
                C5906k4 c5906k4OooO00o37 = OooO00o.OooO00o(1, "thai");
                c5906k4OooO00o37.m23786k4("\\E50", "\\E51", "\\E52", "\\E53", "\\E54", "\\E55", "\\E56", "\\E57", "\\E58", "\\E59");
                return c5906k4OooO00o37;
            case 38:
                C5906k4 c5906k4OooO00o38 = OooO00o.OooO00o(1, "upper-hexadecimal");
                c5906k4OooO00o38.m23786k4("\\30", "\\31", "\\32", "\\33", "\\34", "\\35", "\\36", "\\37", "\\38", "\\39", "\\41", "\\42", "\\43", "\\44", "\\45", "\\46");
                return c5906k4OooO00o38;
            case 39:
                C5906k4 c5906k4OooO00o39 = OooO00o.OooO00o(2, "afar");
                c5906k4OooO00o39.m23786k4("\\1200", "\\1208", "\\1210", "\\1218", "\\1228", "\\1230", "\\1260", "\\1270", "\\1290", "\\12A0", "\\12A8", "\\12C8", "\\12D0", "\\12E8", "\\12F0", "\\12F8", "\\1308", "\\1338", "\\1348");
                c5906k4OooO00o39.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o39;
            case 40:
                C5906k4 c5906k4OooO00o40 = OooO00o.OooO00o(2, "agaw");
                c5906k4OooO00o40.m23786k4("\\1200", "\\1208", "\\1210", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1250", "\\1260", "\\1268", "\\1270", "\\1278", "\\1290", "\\1298", "\\1300", "\\1308", "\\1318", "\\1320", "\\1328", "\\1330", "\\1338", "\\1348", "\\1350");
                c5906k4OooO00o40.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o40;
            case 41:
                C5906k4 c5906k4OooO00o41 = OooO00o.OooO00o(2, "ari");
                c5906k4OooO00o41.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1260", "\\1268", "\\1270", "\\1278", "\\1290", "\\1300", "\\1308", "\\1328", "\\1340", "\\1350");
                c5906k4OooO00o41.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o41;
            case 42:
                C5906k4 c5906k4OooO00o42 = OooO00o.OooO00o(2, "blin");
                c5906k4OooO00o42.m23786k4("\\1200", "\\1208", "\\1210", "\\1218", "\\1230", "\\1238", "\\1228", "\\1240", "\\1250", "\\1260", "\\1270", "\\1290", "\\1300", "\\1308", "\\1318", "\\1320", "\\1328", "\\1348", "\\1278", "\\1298", "\\1338", "\\1330", "\\1350");
                c5906k4OooO00o42.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o42;
            case 43:
                C5906k4 c5906k4OooO00o43 = OooO00o.OooO00o(2, "cjk-earthly-branch");
                c5906k4OooO00o43.m23786k4("\\5B50", "\\4E11", "\\5BC5", "\\536F", "\\8FB0", "\\5DF3", "\\5348", "\\672A", "\\7533", "\\9149", "\\620C", "\\4EA5");
                c5906k4OooO00o43.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                return c5906k4OooO00o43;
            case 44:
                C5906k4 c5906k4OooO00o44 = OooO00o.OooO00o(2, "cjk-heavenly-stem");
                c5906k4OooO00o44.m23786k4("\\7532", "\\4E59", "\\4E19", "\\4E01", "\\620A", "\\5DF1", "\\5E9A", "\\8F9B", "\\58EC", "\\7678");
                c5906k4OooO00o44.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                return c5906k4OooO00o44;
            case 45:
                C5906k4 c5906k4OooO00o45 = OooO00o.OooO00o(2, C18776a.f57276h);
                c5906k4OooO00o45.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\1300", "\\1308", "\\1320", "\\1328", "\\1338", "\\1340", "\\1348");
                c5906k4OooO00o45.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o45;
            case 46:
                C5906k4 c5906k4OooO00o46 = OooO00o.OooO00o(2, "fullwidth-lower-alpha");
                c5906k4OooO00o46.m23786k4("\\FF41", "\\FF42", "\\FF43", "\\FF44", "\\FF45", "\\FF46", "\\FF47", "\\FF48", "\\FF49", "\\FF4A", "\\FF4B", "\\FF4C", "\\FF4D", "\\FF4E", "\\FF4F", "\\FF50", "\\FF51", "\\FF52", "\\FF53", "\\FF54", "\\FF55", "\\FF56", "\\FF57", "\\FF58", "\\FF59", "\\FF5A");
                c5906k4OooO00o46.m23784k4(C14113y2.m67405k4(new char[]{65294}));
                return c5906k4OooO00o46;
            case 47:
                C5906k4 c5906k4OooO00o47 = OooO00o.OooO00o(2, "fullwidth-upper-alpha");
                c5906k4OooO00o47.m23786k4("\\FF21", "\\FF22", "\\FF23", "\\FF24", "\\FF25", "\\FF26", "\\FF27", "\\FF28", "\\FF29", "\\FF2A", "\\FF2B", "\\FF2C", "\\FF2D", "\\FF2E", "\\FF2F", "\\FF30", "\\FF31", "\\FF32", "\\FF33", "\\FF34", "\\FF35", "\\FF36", "\\FF37", "\\FF38", "\\FF39", "\\FF3A");
                c5906k4OooO00o47.m23784k4(C14113y2.m67405k4(new char[]{65294}));
                return c5906k4OooO00o47;
            case 48:
                C5906k4 c5906k4OooO00o48 = OooO00o.OooO00o(2, "gedeo");
                c5906k4OooO00o48.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1338", "\\1348", "\\1350");
                c5906k4OooO00o48.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o48;
            case 49:
                C5906k4 c5906k4OooO00o49 = OooO00o.OooO00o(2, "gumuz");
                c5906k4OooO00o49.m23786k4("\\1200", "\\1210", "\\1208", "\\1210", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1268", "\\1270", "\\1278", "\\1290", "\\1298", "\\1308", "\\1328", "\\1330", "\\1340", "\\1350");
                c5906k4OooO00o49.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o49;
            case 50:
                C5906k4 c5906k4OooO00o50 = OooO00o.OooO00o(2, "hadiyya");
                c5906k4OooO00o50.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1348", "\\1350");
                c5906k4OooO00o50.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o50;
            case 51:
                C5906k4 c5906k4OooO00o51 = OooO00o.OooO00o(2, "harari");
                c5906k4OooO00o51.m23786k4("\\1210", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\1300", "\\1308", "\\1320", "\\1328", "\\1348");
                c5906k4OooO00o51.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o51;
            case 52:
                C5906k4 c5906k4OooO00o52 = OooO00o.OooO00o(2, "hindi");
                c5906k4OooO00o52.m23786k4("\\915", "\\916", "\\917", "\\918", "\\919", "\\91A", "\\91B", "\\91C", "\\91D", "\\91E", "\\91F", "\\920", "\\921", "\\922", "\\923", "\\924", "\\925", "\\926", "\\927", "\\928", "\\92A", "\\92B", "\\92C", "\\92D", "\\92E", "\\92F", "\\930", "\\932", "\\935", "\\936", "\\937", "\\938", "\\939");
                return c5906k4OooO00o52;
            case 53:
                C5906k4 c5906k4OooO00o53 = OooO00o.OooO00o(2, "hiragana-iroha");
                c5906k4OooO00o53.m23786k4("\\3044", "\\308D", "\\306F", "\\306B", "\\307B", "\\3078", "\\3068", "\\3061", "\\308A", "\\306C", "\\308B", "\\3092", "\\308F", "\\304B", "\\3088", "\\305F", "\\308C", "\\305D", "\\3064", "\\306D", "\\306A", "\\3089", "\\3080", "\\3046", "\\3090", "\\306E", "\\304A", "\\304F", "\\3084", "\\307E", "\\3051", "\\3075", "\\3053", "\\3048", "\\3066", "\\3042", "\\3055", "\\304D", "\\3086", "\\3081", "\\307F", "\\3057", "\\3091", "\\3072", "\\3082", "\\305B", "\\3059", "\\3093");
                c5906k4OooO00o53.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                return c5906k4OooO00o53;
            case 54:
                C5906k4 c5906k4OooO00o54 = OooO00o.OooO00o(2, "hiragana");
                c5906k4OooO00o54.m23786k4("\\3042", "\\3044", "\\3046", "\\3048", "\\304A", "\\304B", "\\304D", "\\304F", "\\3051", "\\3053", "\\3055", "\\3057", "\\3059", "\\305B", "\\305D", "\\305F", "\\3061", "\\3064", "\\3066", "\\3068", "\\306A", "\\306B", "\\306C", "\\306D", "\\306E", "\\306F", "\\3072", "\\3075", "\\3078", "\\307B", "\\307E", "\\307F", "\\3080", "\\3081", "\\3082", "\\3084", "\\3086", "\\3088", "\\3089", "\\308A", "\\308B", "\\308C", "\\308D", "\\308F", "\\3092", "\\3093");
                c5906k4OooO00o54.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                return c5906k4OooO00o54;
            case 55:
                C5906k4 c5906k4OooO00o55 = OooO00o.OooO00o(2, "kaffa");
                c5906k4OooO00o55.m23786k4("\\1200", "\\1208", "\\1210", "\\1218", "\\1220", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1280", "\\1290", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1348", "\\1350");
                c5906k4OooO00o55.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o55;
            case 56:
                C5906k4 c5906k4OooO00o56 = OooO00o.OooO00o(2, "katakana-iroha");
                c5906k4OooO00o56.m23786k4("\\30A4", "\\30ED", "\\30CF", "\\30CB", "\\30DB", "\\30D8", "\\30C8", "\\30C1", "\\30EA", "\\30CC", "\\30EB", "\\30F2", "\\30EF", "\\30AB", "\\30E8", "\\30BF", "\\30EC", "\\30BD", "\\30C4", "\\30CD", "\\30CA", "\\30E9", "\\30E0", "\\30A6", "\\30F0", "\\30CE", "\\30AA", "\\30AF", "\\30E4", "\\30DE", "\\30B1", "\\30D5", "\\30B3", "\\30A8", "\\30C6", "\\30A2", "\\30B5", "\\30AD", "\\30E6", "\\30E1", "\\30DF", "\\30B7", "\\30F1", "\\30D2", "\\30E2", "\\30BB", "\\30B9", "\\30F3");
                c5906k4OooO00o56.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                return c5906k4OooO00o56;
            case 57:
                C5906k4 c5906k4OooO00o57 = OooO00o.OooO00o(2, "katakana");
                c5906k4OooO00o57.m23786k4("\\30A2", "\\30A4", "\\30A6", "\\30A8", "\\30AA", "\\30AB", "\\30AD", "\\30AF", "\\30B1", "\\30B3", "\\30B5", "\\30B7", "\\30B9", "\\30BB", "\\30BD", "\\30BF", "\\30C1", "\\30C4", "\\30C6", "\\30C8", "\\30CA", "\\30CB", "\\30CC", "\\30CD", "\\30CE", "\\30CF", "\\30D2", "\\30D5", "\\30D8", "\\30DB", "\\30DE", "\\30DF", "\\30E0", "\\30E1", "\\30E2", "\\30E4", "\\30E6", "\\30E8", "\\30E9", "\\30EA", "\\30EB", "\\30EC", "\\30ED", "\\30EF", "\\30F2", "\\30F3");
                c5906k4OooO00o57.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                return c5906k4OooO00o57;
            case 58:
                C5906k4 c5906k4OooO00o58 = OooO00o.OooO00o(2, "kebena");
                c5906k4OooO00o58.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1348", "\\1350");
                c5906k4OooO00o58.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o58;
            case 59:
                C5906k4 c5906k4OooO00o59 = OooO00o.OooO00o(2, "kembata");
                c5906k4OooO00o59.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1268", "\\1270", "\\1278", "\\1290", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1348");
                c5906k4OooO00o59.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o59;
            case 60:
                C5906k4 c5906k4OooO00o60 = OooO00o.OooO00o(2, "konso");
                c5906k4OooO00o60.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\1300", "\\1348", "\\1350");
                c5906k4OooO00o60.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o60;
            case 61:
                C5906k4 c5906k4OooO00o61 = OooO00o.OooO00o(2, "korean-consonant");
                c5906k4OooO00o61.m23786k4("\\3131", "\\3134", "\\3137", "\\3139", "\\3141", "\\3142", "\\3145", "\\3147", "\\3148", "\\314A", "\\314B", "\\314C", "\\314D", "\\314E");
                return c5906k4OooO00o61;
            case 62:
                C5906k4 c5906k4OooO00o62 = OooO00o.OooO00o(2, "korean-syllable");
                c5906k4OooO00o62.m23786k4("\\AC00", "\\B098", "\\B2E4", "\\B77C", "\\B9C8", "\\BC14", "\\C0AC", "\\C544", "\\C790", "\\CC28", "\\CE74", "\\D0C0", "\\D30C", "\\D558");
                return c5906k4OooO00o62;
            case 63:
                C5906k4 c5906k4OooO00o63 = OooO00o.OooO00o(2, "kunama");
                c5906k4OooO00o63.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\1300", "\\1308");
                c5906k4OooO00o63.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o63;
            case 64:
                C5906k4 c5906k4OooO00o64 = OooO00o.OooO00o(2, "lower-alpha");
                c5906k4OooO00o64.m23786k4("\\61", "\\62", "\\63", "\\64", "\\65", "\\66", "\\67", "\\68", "\\69", "\\6A", "\\6B", "\\6C", "\\6D", "\\6E", "\\6F", "\\70", "\\71", "\\72", "\\73", "\\74", "\\75", "\\76", "\\77", "\\78", "\\79", "\\7A");
                return c5906k4OooO00o64;
            case 65:
                C5906k4 c5906k4OooO00o65 = OooO00o.OooO00o(2, "lower-belorussian");
                c5906k4OooO00o65.m23786k4("\\430", "\\431", "\\432", "\\433", "\\434", "\\435", "\\451", "\\436", "\\437", "\\456", "\\439", "\\43A", "\\43B", "\\43C", "\\43D", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\443", "\\45E", "\\444", "\\445", "\\446", "\\447", "\\448", "\\44B", "\\44C", "\\44D", "\\44E", "\\44F");
                c5906k4OooO00o65.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o65;
            case 66:
                C5906k4 c5906k4OooO00o66 = OooO00o.OooO00o(2, "lower-bulgarian");
                c5906k4OooO00o66.m23786k4("\\430", "\\431", "\\432", "\\433", "\\434", "\\435", "\\436", "\\437", "\\438", "\\439", "\\43A", "\\43B", "\\43C", "\\43D", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\443", "\\444", "\\445", "\\446", "\\447", "\\448", "\\449", "\\44A", "\\44C", "\\44E", "\\44F");
                c5906k4OooO00o66.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o66;
            case 67:
                C5906k4 c5906k4OooO00o67 = OooO00o.OooO00o(2, "lower-greek");
                c5906k4OooO00o67.m23786k4("\\3B1", "\\3B2", "\\3B3", "\\3B4", "\\3B5", "\\3B6", "\\3B7", "\\3B8", "\\3B9", "\\3BA", "\\3BB", "\\3BC", "\\3BD", "\\3BE", "\\3BF", "\\3C0", "\\3C1", "\\3C3", "\\3C4", "\\3C5", "\\3C6", "\\3C7", "\\3C8", "\\3C9");
                return c5906k4OooO00o67;
            case 68:
                C5906k4 c5906k4OooO00o68 = OooO00o.OooO00o(2, "lower-latin");
                c5906k4OooO00o68.m23786k4("\\61", "\\62", "\\63", "\\64", "\\65", "\\66", "\\67", "\\68", "\\69", "\\6A", "\\6B", "\\6C", "\\6D", "\\6E", "\\6F", "\\70", "\\71", "\\72", "\\73", "\\74", "\\75", "\\76", "\\77", "\\78", "\\79", "\\7A");
                return c5906k4OooO00o68;
            case 69:
                C5906k4 c5906k4OooO00o69 = OooO00o.OooO00o(2, "lower-macedonian");
                c5906k4OooO00o69.m23786k4("\\430", "\\431", "\\432", "\\433", "\\434", "\\453", "\\435", "\\436", "\\437", "\\455", "\\438", "\\458", "\\43A", "\\43B", "\\459", "\\43C", "\\43D", "\\45A", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\45C", "\\443", "\\444", "\\445", "\\446", "\\447", "\\45F", "\\448");
                c5906k4OooO00o69.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o69;
            case 70:
                C5906k4 c5906k4OooO00o70 = OooO00o.OooO00o(2, "lower-oromo-qubee");
                c5906k4OooO00o70.m23786k4("\\61", "\\61\\61", "\\62", "\\63", "\\64", "\\65", "\\65\\65", "\\66", "\\67", "\\68", "\\69", "\\69\\69", "\\6A", "\\6B", "\\6C", "\\6D", "\\6E", "\\6F", "\\6F\\6F", "\\70", "\\71", "\\72", "\\73", "\\74", "\\75", "\\75\\75", "\\76", "\\77", "\\78", "\\79", "\\7A", "\\63\\68", "\\64\\68", "\\6B\\68", "\\6E\\79", "\\70\\68", "\\73\\68");
                return c5906k4OooO00o70;
            case 71:
                C5906k4 c5906k4OooO00o71 = OooO00o.OooO00o(2, "lower-russian");
                c5906k4OooO00o71.m23786k4("\\430", "\\431", "\\432", "\\433", "\\434", "\\435", "\\436", "\\437", "\\438", "\\43A", "\\43B", "\\43C", "\\43D", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\443", "\\444", "\\445", "\\446", "\\447", "\\448", "\\449", "\\44D", "\\44E", "\\44F");
                c5906k4OooO00o71.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o71;
            case 72:
                C5906k4 c5906k4OooO00o72 = OooO00o.OooO00o(2, "lower-russian-full");
                c5906k4OooO00o72.m23786k4("\\430", "\\431", "\\432", "\\433", "\\434", "\\435", "\\451", "\\436", "\\437", "\\438", "\\439", "\\43A", "\\43B", "\\43C", "\\43D", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\443", "\\444", "\\445", "\\446", "\\447", "\\448", "\\449", "\\44A", "\\44B", "\\44C", "\\44D", "\\44E", "\\44F");
                c5906k4OooO00o72.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o72;
            case 73:
                C5906k4 c5906k4OooO00o73 = OooO00o.OooO00o(2, "lower-serbo-croatian");
                c5906k4OooO00o73.m23786k4("\\430", "\\431", "\\432", "\\433", "\\434", "\\452", "\\435", "\\436", "\\437", "\\438", "\\458", "\\43A", "\\43B", "\\459", "\\43C", "\\43D", "\\45A", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\45B", "\\443", "\\444", "\\445", "\\446", "\\447", "\\45F", "\\448");
                c5906k4OooO00o73.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o73;
            case 74:
                C5906k4 c5906k4OooO00o74 = OooO00o.OooO00o(2, "lower-ukrainian");
                c5906k4OooO00o74.m23786k4("\\430", "\\431", "\\432", "\\433", "\\434", "\\435", "\\454", "\\436", "\\437", "\\438", "\\456", "\\43A", "\\43B", "\\43C", "\\43D", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\443", "\\444", "\\445", "\\446", "\\447", "\\448", "\\44E", "\\44F");
                c5906k4OooO00o74.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o74;
            case 75:
                C5906k4 c5906k4OooO00o75 = OooO00o.OooO00o(2, "lower-ukrainian-full");
                c5906k4OooO00o75.m23786k4("\\430", "\\431", "\\432", "\\433", "\\491", "\\434", "\\435", "\\454", "\\436", "\\437", "\\438", "\\456", "\\457", "\\439", "\\43A", "\\43B", "\\43C", "\\43D", "\\43E", "\\43F", "\\440", "\\441", "\\442", "\\443", "\\444", "\\445", "\\446", "\\447", "\\448", "\\449", "\\44C", "\\44E", "\\44F");
                c5906k4OooO00o75.m23784k4(C14113y2.m67405k4(new char[]{')'}));
                return c5906k4OooO00o75;
            case 76:
                C5906k4 c5906k4OooO00o76 = OooO00o.OooO00o(2, "meen");
                c5906k4OooO00o76.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1280", "\\1290", "\\1298", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1350", "\\1340");
                c5906k4OooO00o76.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o76;
            case 77:
                C5906k4 c5906k4OooO00o77 = OooO00o.OooO00o(2, "oromo");
                c5906k4OooO00o77.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\12A0", "\\12A8", "\\12C8", "\\12E8", "\\12F0", "\\12F8", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1338", "\\1348");
                c5906k4OooO00o77.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o77;
            case 78:
                C5906k4 c5906k4OooO00o78 = OooO00o.OooO00o(2, "saho");
                c5906k4OooO00o78.m23786k4("\\1200", "\\1208", "\\1210", "\\1218", "\\1228", "\\1230", "\\1240", "\\1260", "\\1270", "\\1290", "\\1308", "\\1320", "\\1328", "\\1330", "\\1338", "\\1348");
                c5906k4OooO00o78.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o78;
            case 79:
                C5906k4 c5906k4OooO00o79 = OooO00o.OooO00o(2, "sidama");
                c5906k4OooO00o79.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\12A0", "\\12A8", "\\12C8", "\\12E8", "\\12F0", "\\12F8", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1338", "\\1348");
                c5906k4OooO00o79.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o79;
            case 80:
                C5906k4 c5906k4OooO00o80 = OooO00o.OooO00o(2, "silti");
                c5906k4OooO00o80.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1348");
                c5906k4OooO00o80.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o80;
            case 81:
                C5906k4 c5906k4OooO00o81 = OooO00o.OooO00o(2, "thai-alphabetic");
                c5906k4OooO00o81.m23786k4("\\E01", "\\E02", "\\E04", "\\E07", "\\E08", "\\E09", "\\E0A", "\\E0B", "\\E0C", "\\E0D", "\\E0E", "\\E0F", "\\E10", "\\E11", "\\E12", "\\E13", "\\E14", "\\E15", "\\E16", "\\E17", "\\E18", "\\E19", "\\E1A", "\\E1B", "\\E1C", "\\E1D", "\\E1E", "\\E1F", "\\E20", "\\E21", "\\E22", "\\E23", "\\E25", "\\E27", "\\E28", "\\E29", "\\E2A", "\\E2B", "\\E2C", "\\E2D", "\\E2E");
                return c5906k4OooO00o81;
            case 82:
                C5906k4 c5906k4OooO00o82 = OooO00o.OooO00o(2, "tigre");
                c5906k4OooO00o82.m23786k4("\\1200", "\\1208", "\\1210", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\12A0", "\\12A8", "\\12C8", "\\12D0", "\\12D8", "\\12E8", "\\12F0", "\\1300", "\\1308", "\\1320", "\\1328", "\\1330", "\\1338", "\\1348", "\\1350");
                c5906k4OooO00o82.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o82;
            case 83:
                C5906k4 c5906k4OooO00o83 = OooO00o.OooO00o(2, "upper-alpha");
                c5906k4OooO00o83.m23786k4("\\41", "\\42", "\\43", "\\44", "\\45", "\\46", "\\47", "\\48", "\\49", "\\4A", "\\4B", "\\4C", "\\4D", "\\4E", "\\4F", "\\50", "\\51", "\\52", "\\53", "\\54", "\\55", "\\56", "\\57", "\\58", "\\59", "\\5A");
                return c5906k4OooO00o83;
            case 84:
                C5906k4 c5906k4OooO00o84 = OooO00o.OooO00o(2, "upper-belorussian");
                c5906k4OooO00o84.m23786k4("\\410", "\\411", "\\412", "\\413", "\\414", "\\415", "\\401", "\\416", "\\417", "\\406", "\\419", "\\41A", "\\41B", "\\41C", "\\41D", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\423", "\\40E", "\\424", "\\425", "\\426", "\\427", "\\428", "\\42B", "\\42C", "\\42D", "\\42E", "\\42F");
                return c5906k4OooO00o84;
            case 85:
                C5906k4 c5906k4OooO00o85 = OooO00o.OooO00o(2, "upper-bulgarian");
                c5906k4OooO00o85.m23786k4("\\410", "\\411", "\\412", "\\413", "\\414", "\\415", "\\416", "\\417", "\\418", "\\419", "\\41A", "\\41B", "\\41C", "\\41D", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\423", "\\424", "\\425", "\\426", "\\427", "\\428", "\\429", "\\42A", "\\42C", "\\42E", "\\42F");
                return c5906k4OooO00o85;
            case 86:
                C5906k4 c5906k4OooO00o86 = OooO00o.OooO00o(2, "upper-latin");
                c5906k4OooO00o86.m23786k4("\\41", "\\42", "\\43", "\\44", "\\45", "\\46", "\\47", "\\48", "\\49", "\\4A", "\\4B", "\\4C", "\\4D", "\\4E", "\\4F", "\\50", "\\51", "\\52", "\\53", "\\54", "\\55", "\\56", "\\57", "\\58", "\\59", "\\5A");
                return c5906k4OooO00o86;
            case 87:
                C5906k4 c5906k4OooO00o87 = OooO00o.OooO00o(2, "upper-macedonian");
                c5906k4OooO00o87.m23786k4("\\410", "\\411", "\\412", "\\413", "\\414", "\\403", "\\415", "\\416", "\\417", "\\405", "\\418", "\\408", "\\41A", "\\41B", "\\409", "\\41C", "\\41D", "\\40A", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\40C", "\\423", "\\424", "\\425", "\\426", "\\427", "\\40F", "\\428");
                return c5906k4OooO00o87;
            case 88:
                C5906k4 c5906k4OooO00o88 = OooO00o.OooO00o(2, "upper-oromo-qubee");
                c5906k4OooO00o88.m23786k4("\\41", "\\41\\41", "\\42", "\\43", "\\44", "\\45", "\\45\\45", "\\46", "\\47", "\\48", "\\49", "\\49\\49", "\\4A", "\\4B", "\\4C", "\\4D", "\\4E", "\\4F", "\\4F\\4F", "\\50", "\\51", "\\52", "\\53", "\\54", "\\55", "\\55\\55", "\\56", "\\57", "\\58", "\\59", "\\5A", "\\43\\48", "\\44\\48", "\\4B\\48", "\\4E\\59", "\\50\\48", "\\53\\48");
                return c5906k4OooO00o88;
            case 89:
                C5906k4 c5906k4OooO00o89 = OooO00o.OooO00o(2, "upper-russian");
                c5906k4OooO00o89.m23786k4("\\410", "\\411", "\\412", "\\413", "\\414", "\\415", "\\416", "\\417", "\\418", "\\41A", "\\41B", "\\41C", "\\41D", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\423", "\\424", "\\425", "\\426", "\\427", "\\428", "\\429", "\\42D", "\\42E", "\\42F");
                return c5906k4OooO00o89;
            case 90:
                C5906k4 c5906k4OooO00o90 = OooO00o.OooO00o(2, "upper-russian-full");
                c5906k4OooO00o90.m23786k4("\\410", "\\411", "\\412", "\\413", "\\414", "\\415", "\\401", "\\416", "\\417", "\\418", "\\419", "\\41A", "\\41B", "\\41C", "\\41D", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\423", "\\424", "\\425", "\\426", "\\427", "\\428", "\\429", "\\42A", "\\42B", "\\42C", "\\42D", "\\42E", "\\42F");
                return c5906k4OooO00o90;
            case 91:
                C5906k4 c5906k4OooO00o91 = OooO00o.OooO00o(2, "upper-serbo-croatian");
                c5906k4OooO00o91.m23786k4("\\410", "\\411", "\\412", "\\413", "\\414", "\\402", "\\415", "\\416", "\\417", "\\418", "\\408", "\\41A", "\\41B", "\\409", "\\41C", "\\41D", "\\40A", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\40B", "\\423", "\\424", "\\425", "\\426", "\\427", "\\40F", "\\428");
                return c5906k4OooO00o91;
            case 92:
                C5906k4 c5906k4OooO00o92 = OooO00o.OooO00o(2, "upper-ukrainian");
                c5906k4OooO00o92.m23786k4("\\410", "\\411", "\\412", "\\413", "\\414", "\\415", "\\404", "\\416", "\\417", "\\418", "\\406", "\\41A", "\\41B", "\\41C", "\\41D", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\423", "\\424", "\\425", "\\426", "\\427", "\\428", "\\42E", "\\42F");
                return c5906k4OooO00o92;
            case 93:
                C5906k4 c5906k4OooO00o93 = OooO00o.OooO00o(2, "upper-ukrainian-full");
                c5906k4OooO00o93.m23786k4("\\410", "\\411", "\\412", "\\413", "\\490", "\\414", "\\415", "\\404", "\\416", "\\417", "\\418", "\\406", "\\407", "\\419", "\\41A", "\\41B", "\\41C", "\\41D", "\\41E", "\\41F", "\\420", "\\421", "\\422", "\\423", "\\424", "\\425", "\\426", "\\427", "\\428", "\\429", "\\42C", "\\42E", "\\42F");
                return c5906k4OooO00o93;
            case 94:
                C5906k4 c5906k4OooO00o94 = OooO00o.OooO00o(2, "wolaita");
                c5906k4OooO00o94.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1270", "\\1278", "\\1290", "\\1298", "\\1230", "\\1308", "\\1320", "\\1328", "\\1330", "\\1338", "\\1340", "\\1348", "\\1350");
                c5906k4OooO00o94.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o94;
            case 95:
                C5906k4 c5906k4OooO00o95 = OooO00o.OooO00o(2, "yemsa");
                c5906k4OooO00o95.m23786k4("\\1200", "\\1208", "\\1218", "\\1228", "\\1230", "\\1238", "\\1240", "\\1260", "\\1268", "\\1270", "\\1278", "\\1290", "\\1298", "\\1300", "\\1308", "\\1318", "\\1320", "\\1328", "\\1330", "\\1348", "\\1350");
                c5906k4OooO00o95.m23784k4(C14113y2.m67405k4(new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
                return c5906k4OooO00o95;
            case 96:
                C5906k4 c5906k4OooO00o96 = OooO00o.OooO00o(3, "asterisks");
                c5906k4OooO00o96.m23786k4("\\2A");
                c5906k4OooO00o96.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o96;
            case 97:
                C5906k4 c5906k4OooO00o97 = OooO00o.OooO00o(3, "footnotes");
                c5906k4OooO00o97.m23786k4("\\2A", "\\2051", "\\2020", "\\2021");
                c5906k4OooO00o97.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o97;
            case 98:
                C5906k4 c5906k4OooO00o98 = OooO00o.OooO00o(3, "lower-alpha-symbolic");
                c5906k4OooO00o98.m23786k4("\\61", "\\62", "\\63", "\\64", "\\65", "\\66", "\\67", "\\68", "\\69", "\\6A", "\\6B", "\\6C", "\\6D", "\\6E", "\\6F", "\\70", "\\71", "\\72", "\\73", "\\74", "\\75", "\\76", "\\77", "\\78", "\\79", "\\7A");
                return c5906k4OooO00o98;
            case 99:
                C5906k4 c5906k4OooO00o99 = OooO00o.OooO00o(3, "upper-alpha-symbolic");
                c5906k4OooO00o99.m23786k4("\\41", "\\42", "\\43", "\\44", "\\45", "\\46", "\\47", "\\48", "\\49", "\\4A", "\\4B", "\\4C", "\\4D", "\\4E", "\\4F", "\\50", "\\51", "\\52", "\\53", "\\54", "\\55", "\\56", "\\57", "\\58", "\\59", "\\5A");
                return c5906k4OooO00o99;
            case 100:
                C5906k4 c5906k4OooO00o100 = OooO00o.OooO00o(5, "circled-decimal");
                c5906k4OooO00o100.m23786k4("\\24EA", "\\2460", "\\2461", "\\2462", "\\2463", "\\2464", "\\2465", "\\2466", "\\2467", "\\2468", "\\2469", "\\246A", "\\246B", "\\246C", "\\246D", "\\246E", "\\246F", "\\2470", "\\2471", "\\2472", "\\2473", "\\3251", "\\3252", "\\3253", "\\3254", "\\3255", "\\3256", "\\3257", "\\3258", "\\3259", "\\325A", "\\325B", "\\325C", "\\325D", "\\325E", "\\325F", "\\32B1", "\\32B2", "\\32B3", "\\32B4", "\\32B5", "\\32B6", "\\32B7", "\\32B8", "\\32B9", "\\32BA", "\\32BB", "\\32BC", "\\32BD", "\\32BE", "\\32BF");
                c5906k4OooO00o100.m23784k4(C14113y2.f47374k4);
                c5906k4OooO00o100.m23792x1(0);
                return c5906k4OooO00o100;
            case 101:
                C5906k4 c5906k4OooO00o101 = OooO00o.OooO00o(5, "circled-lower-latin");
                c5906k4OooO00o101.m23786k4("\\24D0", "\\24D1", "\\24D2", "\\24D3", "\\24D4", "\\24D5", "\\24D6", "\\24D7", "\\24D8", "\\24D9", "\\24DA", "\\24DB", "\\24DC", "\\24DD", "\\24DE", "\\24DF", "\\24E0", "\\24E1", "\\24E2", "\\24E3", "\\24E4", "\\24E5", "\\24E6", "\\24E7", "\\24E8", "\\24E9");
                c5906k4OooO00o101.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o101;
            case 102:
                C5906k4 c5906k4OooO00o102 = OooO00o.OooO00o(5, "circled-upper-latin");
                c5906k4OooO00o102.m23786k4("\\24B6", "\\24B7", "\\24B8", "\\24B9", "\\24BA", "\\24BB", "\\24BC", "\\24BD", "\\24BE", "\\24BF", "\\24C0", "\\24C1", "\\24C2", "\\24C3", "\\24C4", "\\24C5", "\\24C6", "\\24C7", "\\24C8", "\\24C9", "\\24CA", "\\24CB", "\\24CC", "\\24CD", "\\24CE", "\\24CF");
                c5906k4OooO00o102.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o102;
            case 103:
                C5906k4 c5906k4OooO00o103 = OooO00o.OooO00o(5, "circled-korean-consonants");
                c5906k4OooO00o103.m23786k4("\\3260", "\\3261", "\\3262", "\\3263", "\\3264", "\\3265", "\\3266", "\\3267", "\\3268", "\\3269", "\\326A", "\\326B", "\\326C", "\\326D");
                c5906k4OooO00o103.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o103;
            case 104:
                C5906k4 c5906k4OooO00o104 = OooO00o.OooO00o(5, "circled-korean-syllables");
                c5906k4OooO00o104.m23786k4("\\326E", "\\326F", "\\3270", "\\3271", "\\3272", "\\3273", "\\3274", "\\3275", "\\3276", "\\3277", "\\3278", "\\3279", "\\327A", "\\327B");
                c5906k4OooO00o104.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o104;
            case 105:
                C5906k4 c5906k4OooO00o105 = OooO00o.OooO00o(5, "decimal-leading-zero");
                c5906k4OooO00o105.m23786k4("\\2D\\30\\39", "\\2D\\30\\38", "\\2D\\30\\37", "\\2D\\30\\36", "\\2D\\30\\35", "\\2D\\30\\34", "\\2D\\30\\33", "\\2D\\30\\32", "\\2D\\30\\31", "\\30\\30", "\\30\\31", "\\30\\32", "\\30\\33", "\\30\\34", "\\30\\35", "\\30\\36", "\\30\\37", "\\30\\38", "\\30\\39");
                c5906k4OooO00o105.m23792x1(-9);
                return c5906k4OooO00o105;
            case 106:
                C5906k4 c5906k4OooO00o106 = OooO00o.OooO00o(5, "dotted-decimal");
                c5906k4OooO00o106.m23786k4("\\2488", "\\2489", "\\248A", "\\248B", "\\248C", "\\248D", "\\248E", "\\248F", "\\2490", "\\2491", "\\2492", "\\2493", "\\2494", "\\2495", "\\2496", "\\2497", "\\2498", "\\2499", "\\249A", "\\249B");
                c5906k4OooO00o106.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o106;
            case 107:
                C5906k4 c5906k4OooO00o107 = OooO00o.OooO00o(5, "double-circled-decimal");
                c5906k4OooO00o107.m23786k4("\\24F5", "\\24F6", "\\24F7", "\\24F8", "\\24F9", "\\24FA", "\\24FB", "\\24FC", "\\24FD", "\\24FE");
                c5906k4OooO00o107.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o107;
            case 108:
                C5906k4 c5906k4OooO00o108 = OooO00o.OooO00o(5, "filled-circled-decimal");
                c5906k4OooO00o108.m23786k4("\\2776", "\\2777", "\\2778", "\\2779", "\\277A", "\\277B", "\\277C", "\\277D", "\\277E", "\\277F", "\\24EB", "\\24EC", "\\24ED", "\\24EE", "\\24EF", "\\24F0", "\\24F1", "\\24F2", "\\24F3", "\\24F4");
                c5906k4OooO00o108.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o108;
            case 109:
                C5906k4 c5906k4OooO00o109 = OooO00o.OooO00o(5, "fullwidth-upper-roman");
                c5906k4OooO00o109.m23786k4("\\2160", "\\2161", "\\2162", "\\2163", "\\2164", "\\2165", "\\2166", "\\2167", "\\2168", "\\2169", "\\216A", "\\216B");
                c5906k4OooO00o109.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o109;
            case 110:
                C5906k4 c5906k4OooO00o110 = OooO00o.OooO00o(5, "fullwidth-lower-roman");
                c5906k4OooO00o110.m23786k4("\\2170", "\\2171", "\\2172", "\\2173", "\\2174", "\\2175", "\\2176", "\\2177", "\\2178", "\\2179", "\\217A", "\\217B");
                c5906k4OooO00o110.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o110;
            case 111:
                C5906k4 c5906k4OooO00o111 = OooO00o.OooO00o(5, "parenthesized-decimal");
                c5906k4OooO00o111.m23786k4("\\2474", "\\2475", "\\2476", "\\2477", "\\2478", "\\2479", "\\247A", "\\247B", "\\247C", "\\247D", "\\247E", "\\247F", "\\2480", "\\2481", "\\2482", "\\2483", "\\2484", "\\2485", "\\2486", "\\2487");
                c5906k4OooO00o111.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o111;
            case 112:
                C5906k4 c5906k4OooO00o112 = OooO00o.OooO00o(5, "parenthesized-lower-latin");
                c5906k4OooO00o112.m23786k4("\\249C", "\\249D", "\\249E", "\\249F", "\\24A0", "\\24A1", "\\24A2", "\\24A3", "\\24A4", "\\24A5", "\\24A6", "\\24A7", "\\24A8", "\\24A9", "\\24AA", "\\24AB", "\\24AC", "\\24AD", "\\24AE", "\\24AF", "\\24B0", "\\24B1", "\\24B2", "\\24B3", "\\24B4", "\\24B5");
                c5906k4OooO00o112.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o112;
            case 113:
                C5906k4 c5906k4OooO00o113 = OooO00o.OooO00o(5, "parenthesized-hangul-consonants");
                c5906k4OooO00o113.m23786k4("\\3200", "\\3201", "\\3202", "\\3203", "\\3204", "\\3205", "\\3206", "\\3207", "\\3208", "\\3209", "\\320A", "\\320B", "\\320C", "\\320D");
                c5906k4OooO00o113.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o113;
            case 114:
                C5906k4 c5906k4OooO00o114 = OooO00o.OooO00o(5, "parenthesized-hangul-syllable");
                c5906k4OooO00o114.m23786k4("\\320E", "\\320F", "\\3210", "\\3211", "\\3212", "\\3213", "\\3214", "\\3215", "\\3216", "\\3217", "\\3218", "\\3219", "\\321A");
                c5906k4OooO00o114.m23784k4(C14113y2.f47374k4);
                return c5906k4OooO00o114;
            case 115:
                C5906k4 c5906k4OooO00o115 = OooO00o.OooO00o(5, "persian-abjad");
                c5906k4OooO00o115.m23786k4("\\627", "\\628", "\\62C", "\\62F", "\\647\\200D", "\\648", "\\632", "\\62D", "\\637", "\\6CC", "\\6A9", "\\644", "\\645", "\\646", "\\633", "\\639", "\\641", "\\635", "\\642", "\\631", "\\634", "\\62A", "\\62B", "\\62E", "\\630", "\\636", "\\638", "\\63A");
                return c5906k4OooO00o115;
            case 116:
                C5906k4 c5906k4OooO00o116 = OooO00o.OooO00o(5, "persian-alphabetic");
                c5906k4OooO00o116.m23786k4("\\627", "\\628", "\\67E", "\\62A", "\\62B", "\\62C", "\\686", "\\62D", "\\62E", "\\62F", "\\630", "\\631", "\\632", "\\698", "\\633", "\\634", "\\635", "\\636", "\\637", "\\638", "\\639", "\\63A", "\\641", "\\642", "\\6A9", "\\6AF", "\\644", "\\645", "\\646", "\\648", "\\647\\200D", "\\6CC");
                return c5906k4OooO00o116;
            case 117:
                C5906k4 c5906k4 = new C5906k4(LocalePreferences.CalendarType.HEBREW);
                c5906k4.m23782k4(4);
                c5906k4.m23781k4(1.0f);
                c5906k4.m23781k4(Float.POSITIVE_INFINITY);
                c5906k4.m23785k4(400, "\\5EA", 300, "\\5E9", 200, "\\5E8", 100, "\\5E7", 90, "\\5E6", 80, "\\5E4", 70, "\\5E2", 60, "\\5E1", 50, "\\5E0", 40, "\\5DE", 30, "\\5DC", 20, "\\5DB", 19, "\\5D9\\5D8", 18, "\\5D9\\5D7", 17, "\\5D9\\5D6", 16, "\\5D8\\5D6", 15, "\\5D8\\5D5", 10, "\\5D9", 9, "\\5D8", 8, "\\5D7", 7, "\\5D6", 6, "\\5D5", 5, "\\5D4", 4, "\\5D3", 3, "\\5D2", 2, "\\5D1", 1, "\\5D0");
                return c5906k4;
            case 118:
                C5906k4 c5906k42 = new C5906k4("simple-upper-roman");
                c5906k42.m23782k4(4);
                c5906k42.m23781k4(1.0f);
                c5906k42.m23781k4(4999.0f);
                c5906k42.m23785k4(1000, "\\4D", 500, "\\44", 100, "\\43", 50, "\\4C", 10, "\\58", 5, "\\56", 1, "\\49");
                return c5906k42;
            case 119:
                C5906k4 c5906k43 = new C5906k4("simple-lower-roman");
                c5906k43.m23782k4(4);
                c5906k43.m23781k4(1.0f);
                c5906k43.m23781k4(4999.0f);
                c5906k43.m23785k4(1000, "\\6D", 500, "\\64", 100, "\\63", 50, "\\6C", 10, "\\78", 5, "\\76", 1, "\\69");
                return c5906k43;
            case 120:
                C5906k4 c5906k44 = new C5906k4("upper-roman");
                c5906k44.m23782k4(4);
                c5906k44.m23781k4(1.0f);
                c5906k44.m23781k4(4999.0f);
                c5906k44.m23785k4(1000, "\\4D", numValueOf, "\\43\\4D", 500, "\\44", 400, "\\43\\44", 100, "\\43", 90, "\\58\\43", 50, "\\4C", 40, "\\58\\4C", 10, "\\58", 9, "\\49\\58", 5, "\\56", 4, "\\49\\56", 1, "\\49");
                return c5906k44;
            case 121:
                C5906k4 c5906k45 = new C5906k4("lower-roman");
                c5906k45.m23782k4(4);
                c5906k45.m23781k4(1.0f);
                c5906k45.m23781k4(4999.0f);
                c5906k45.m23785k4(1000, "\\6D", numValueOf, "\\63\\6D", 500, "\\64", 400, "\\63\\64", 100, "\\63", 90, "\\78\\63", 50, "\\6C", 40, "\\78\\6C", 10, "\\78", 9, "\\69\\78", 5, "\\76", 4, "\\69\\76", 1, "\\69");
                return c5906k45;
            case 122:
                C5906k4 c5906k46 = new C5906k4("lower-armenian");
                c5906k46.m23782k4(4);
                c5906k46.m23781k4(1.0f);
                c5906k46.m23781k4(9999.0f);
                c5906k46.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\584", 8000, "\\583", 7000, "\\582", Integer.valueOf(C18208i0.f55081h), "\\581", 5000, "\\580", 4000, "\\57F", 3000, "\\57E", 2000, "\\57D", 1000, "\\57C", numValueOf, "\\57B", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\57A", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\579", 600, "\\578", 500, "\\577", 400, "\\576", 300, "\\575", 200, "\\574", 100, "\\573", 90, "\\572", 80, "\\571", 70, "\\570", 60, "\\56F", 50, "\\56E", 40, "\\56D", 30, "\\56C", 20, "\\56B", 10, "\\56A", 9, "\\569", 8, "\\568", 7, "\\567", 6, "\\566", 5, "\\565", 4, "\\564", 3, "\\563", 2, "\\562", 1, "\\561");
                return c5906k46;
            case 123:
                C5906k4 c5906k47 = new C5906k4("upper-armenian");
                c5906k47.m23782k4(4);
                c5906k47.m23781k4(1.0f);
                c5906k47.m23781k4(9999.0f);
                c5906k47.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\554", 8000, "\\553", 7000, "\\552", Integer.valueOf(C18208i0.f55081h), "\\551", 5000, "\\550", 4000, "\\54F", 3000, "\\54E", 2000, "\\54D", 1000, "\\54C", numValueOf, "\\54B", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\54A", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\549", 600, "\\548", 500, "\\547", 400, "\\546", 300, "\\545", 200, "\\544", 100, "\\543", 90, "\\542", 80, "\\541", 70, "\\540", 60, "\\53F", 50, "\\53E", 40, "\\53D", 30, "\\53C", 20, "\\53B", 10, "\\53A", 9, "\\539", 8, "\\538", 7, "\\537", 6, "\\536", 5, "\\535", 4, "\\534", 3, "\\533", 2, "\\532", 1, "\\531");
                return c5906k47;
            case 124:
                C5906k4 c5906k48 = new C5906k4("armenian");
                c5906k48.m23782k4(4);
                c5906k48.m23781k4(1.0f);
                c5906k48.m23781k4(9999.0f);
                c5906k48.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\554", 8000, "\\553", 7000, "\\552", Integer.valueOf(C18208i0.f55081h), "\\551", 5000, "\\550", 4000, "\\54F", 3000, "\\54E", 2000, "\\54D", 1000, "\\54C", numValueOf, "\\54B", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\54A", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\549", 600, "\\548", 500, "\\547", 400, "\\546", 300, "\\545", 200, "\\544", 100, "\\543", 90, "\\542", 80, "\\541", 70, "\\540", 60, "\\53F", 50, "\\53E", 40, "\\53D", 30, "\\53C", 20, "\\53B", 10, "\\53A", 9, "\\539", 8, "\\538", 7, "\\537", 6, "\\536", 5, "\\535", 4, "\\534", 3, "\\533", 2, "\\532", 1, "\\531");
                return c5906k48;
            case 125:
                C5906k4 c5906k49 = new C5906k4("georgian");
                c5906k49.m23782k4(4);
                c5906k49.m23781k4(1.0f);
                c5906k49.m23781k4(19999.0f);
                c5906k49.m23785k4(10000, "\\10F5", Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\10F0", 8000, "\\10EF", 7000, "\\10F4", Integer.valueOf(C18208i0.f55081h), "\\10EE", 5000, "\\10ED", 4000, "\\10EC", 3000, "\\10EB", 2000, "\\10EA", 1000, "\\10E9", numValueOf, "\\10E8", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\10E7", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\10E6", 600, "\\10E5", 500, "\\10E4", 400, "\\10F3", 300, "\\10E2", 200, "\\10E1", 100, "\\10E0", 90, "\\10DF", 80, "\\10DE", 70, "\\10DD", 60, "\\10F2", 50, "\\10DC", 40, "\\10DB", 30, "\\10DA", 20, "\\10D9", 10, "\\10D8", 9, "\\10D7", 8, "\\10F1", 7, "\\10D6", 6, "\\10D5", 5, "\\10D4", 4, "\\10D3", 3, "\\10D2", 2, "\\10D1", 1, "\\10D0");
                return c5906k49;
            case 126:
                C5906k4 c5906k410 = new C5906k4("ancient-tamil");
                c5906k410.m23782k4(4);
                c5906k410.m23781k4(1.0f);
                c5906k410.m23781k4(9999.0f);
                c5906k410.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\BEF\\BF2", 8000, "\\BEE\\BF2", 7000, "\\BED\\BF2", Integer.valueOf(C18208i0.f55081h), "\\BEC\\BF2", 5000, "\\BEB\\BF2", 4000, "\\BEA\\BF2", 3000, "\\BE9\\BF2", 2000, "\\BE8\\BF2", 1000, "\\BF2", numValueOf, "\\BEF\\BF1", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\BEE\\BF1", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\BED\\BF1", 600, "\\BEC\\BF1", 500, "\\BEB\\BF1", 400, "\\BEA\\BF1", 300, "\\BE9\\BF1", 200, "\\BE8\\BF1", 100, "\\BF1", 90, "\\BEF\\BF0", 80, "\\BEE\\BF0", 70, "\\BED\\BF0", 60, "\\BEC\\BF0", 50, "\\BEB\\BF0", 40, "\\BEA\\BF0", 30, "\\BE9\\BF0", 20, "\\BE8\\BF0", 10, "\\BF0", 9, "\\BEF", 8, "\\BEE", 7, "\\BED", 6, "\\BEC", 5, "\\BEB", 4, "\\BEA", 3, "\\BE9", 2, "\\BE8", 1, "\\BE7");
                return c5906k410;
            case 127:
                C5906k4 c5906k4OooO00o117 = OooO00o.OooO00o(4, "japanese-informal");
                c5906k4OooO00o117.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                c5906k4OooO00o117.m23781k4(0.0f);
                c5906k4OooO00o117.m23781k4(9999.0f);
                c5906k4OooO00o117.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\4E5D\\5343", 8000, "\\516B\\5343", 7000, "\\4E03\\5343", Integer.valueOf(C18208i0.f55081h), "\\516D\\5343", 5000, "\\4E94\\5343", 4000, "\\56DB\\5343", 3000, "\\4E09\\5343", 2000, "\\4E8C\\5343", 1000, "\\5343", numValueOf, "\\4E5D\\767E", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\516B\\767E", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\4E03\\767E", 600, "\\516D\\767E", 500, "\\4E94\\767E", 400, "\\56DB\\767E", 300, "\\4E09\\767E", 200, "\\4E8C\\767E", 100, "\\767E", 90, "\\4E5D\\5341", 80, "\\516B\\5341", 70, "\\4E03\\5341", 60, "\\516D\\5341", 50, "\\4E94\\5341", 40, "\\56DB\\5341", 30, "\\4E09\\5341", 20, "\\4E8C\\5341", 10, "\\5341", 9, "\\4E5D", 8, "\\516B", 7, "\\4E03", 6, "\\516D", 5, "\\4E94", 4, "\\56DB", 3, "\\4E09", 2, "\\4E8C", 1, "\\4E00", 0, "\\3007");
                c5906k4OooO00o117.m23788kk("cjk-decimal");
                return c5906k4OooO00o117;
            case 128:
                C5906k4 c5906k4OooO00o118 = OooO00o.OooO00o(4, "japanese-formal");
                c5906k4OooO00o118.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                c5906k4OooO00o118.m23781k4(0.0f);
                c5906k4OooO00o118.m23781k4(9999.0f);
                c5906k4OooO00o118.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\4E5D\\9621", 8000, "\\516B\\9621", 7000, "\\4E03\\9621", Integer.valueOf(C18208i0.f55081h), "\\516D\\9621", 5000, "\\4F0D\\9621", 4000, "\\56DB\\9621", 3000, "\\53C2\\9621", 2000, "\\5F10\\9621", 1000, "\\58F1\\9621", numValueOf, "\\4E5D\\767E", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\516B\\767E", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\4E03\\767E", 600, "\\516D\\767E", 500, "\\4F0D\\767E", 400, "\\56DB\\767E", 300, "\\53C2\\767E", 200, "\\5F10\\767E", 100, "\\58F1\\767E", 90, "\\4E5D\\62FE", 80, "\\516B\\62FE", 70, "\\4E03\\62FE", 60, "\\516D\\62FE", 50, "\\4F0D\\62FE", 40, "\\56DB\\62FE", 30, "\\53C2\\62FE", 20, "\\5F10\\62FE", 10, "\\58F1\\62FE", 9, "\\4E5D", 8, "\\516B", 7, "\\4E03", 6, "\\516D", 5, "\\4F0D", 4, "\\56DB", 3, "\\53C2", 2, "\\5F10", 1, "\\58F1", 0, "\\96F6");
                c5906k4OooO00o118.m23788kk("cjk-decimal");
                return c5906k4OooO00o118;
            case 129:
                C5906k4 c5906k4OooO00o119 = OooO00o.OooO00o(4, "korean-hangul-formal");
                c5906k4OooO00o119.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                c5906k4OooO00o119.m23781k4(0.0f);
                c5906k4OooO00o119.m23781k4(9999.0f);
                c5906k4OooO00o119.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\AD6C\\CC9C", 8000, "\\D314\\CC9C", 7000, "\\CE60\\CC9C", Integer.valueOf(C18208i0.f55081h), "\\C721\\CC9C", 5000, "\\C624\\CC9C", 4000, "\\C0AC\\CC9C", 3000, "\\C0BC\\CC9C", 2000, "\\C774\\CC9C", 1000, "\\C77C\\CC9C", numValueOf, "\\AD6C\\BC31", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\D314\\BC31", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\CE60\\BC31", 600, "\\C721\\BC31", 500, "\\C624\\BC31", 400, "\\C0AC\\BC31", 300, "\\C0BC\\BC31", 200, "\\C774\\BC31", 100, "\\C77C\\BC31", 90, "\\AD6C\\C2ED", 80, "\\D314\\C2ED", 70, "\\CE60\\C2ED", 60, "\\C721\\C2ED", 50, "\\C624\\C2ED", 40, "\\C0AC\\C2ED", 30, "\\C0BC\\C2ED", 20, "\\C774\\C2ED", 10, "\\C77C\\C2ED", 9, "\\AD6C", 8, "\\D314", 7, "\\CE60", 6, "\\C721", 5, "\\C624", 4, "\\C0AC", 3, "\\C0BC", 2, "\\C774", 1, "\\C77C", 0, "\\C601");
                return c5906k4OooO00o119;
            case 130:
                C5906k4 c5906k4OooO00o120 = OooO00o.OooO00o(4, "korean-hanja-informal");
                c5906k4OooO00o120.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                c5906k4OooO00o120.m23781k4(0.0f);
                c5906k4OooO00o120.m23781k4(9999.0f);
                c5906k4OooO00o120.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\4E5D\\5343", 8000, "\\516B\\5343", 7000, "\\4E03\\5343", Integer.valueOf(C18208i0.f55081h), "\\516D\\5343", 5000, "\\4E94\\5343", 4000, "\\56DB\\5343", 3000, "\\4E09\\5343", 2000, "\\4E8C\\5343", 1000, "\\5343", numValueOf, "\\4E5D\\767E", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\516B\\767E", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\4E03\\767E", 600, "\\516D\\767E", 500, "\\4E94\\767E", 400, "\\56DB\\767E", 300, "\\4E09\\767E", 200, "\\4E8C\\767E", 100, "\\767E", 90, "\\4E5D\\5341", 80, "\\516B\\5341", 70, "\\4E03\\5341", 60, "\\516D\\5341", 50, "\\4E94\\5341", 40, "\\56DB\\5341", 30, "\\4E09\\5341", 20, "\\4E8C\\5341", 10, "\\5341", 9, "\\4E5D", 8, "\\516B", 7, "\\4E03", 6, "\\516D", 5, "\\4E94", 4, "\\56DB", 3, "\\4E09", 2, "\\4E8C", 1, "\\4E00", 0, "\\96F6");
                return c5906k4OooO00o120;
            case 131:
                C5906k4 c5906k4OooO00o121 = OooO00o.OooO00o(4, "korean-hanja-formal");
                c5906k4OooO00o121.m23784k4(C14113y2.m67405k4(new char[]{12289}));
                c5906k4OooO00o121.m23781k4(0.0f);
                c5906k4OooO00o121.m23781k4(9999.0f);
                c5906k4OooO00o121.m23785k4(Integer.valueOf(ConnectionResult.NETWORK_ERROR), "\\4E5D\\4EDF", 8000, "\\516B\\4EDF", 7000, "\\4E03\\4EDF", Integer.valueOf(C18208i0.f55081h), "\\516D\\4EDF", 5000, "\\4E94\\4EDF", 4000, "\\56DB\\4EDF", 3000, "\\53C3\\4EDF", 2000, "\\8CB3\\4EDF", 1000, "\\58F9\\4EDF", numValueOf, "\\4E5D\\767E", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\516B\\767E", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\4E03\\767E", 600, "\\516D\\767E", 500, "\\4E94\\767E", 400, "\\56DB\\767E", 300, "\\53C3\\767E", 200, "\\8CB3\\767E", 100, "\\58F9\\767E", 90, "\\4E5D\\62FE", 80, "\\516B\\62FE", 70, "\\4E03\\62FE", 60, "\\516D\\62FE", 50, "\\4E94\\62FE", 40, "\\56DB\\62FE", 30, "\\53C3\\62FE", 20, "\\8CB3\\62FE", 10, "\\58F9\\62FE", 9, "\\4E5D", 8, "\\516B", 7, "\\4E03", 6, "\\516D", 5, "\\4E94", 4, "\\56DB", 3, "\\53C3", 2, "\\8CB3", 1, "\\58F9", 0, "\\96F6");
                return c5906k4OooO00o121;
            case 132:
                C5906k4 c5906k411 = new C5906k4("greek");
                c5906k411.m23782k4(4);
                c5906k411.m23781k4(1.0f);
                c5906k411.m23781k4(999.0f);
                c5906k411.m23785k4(numValueOf, "\\3E1", Integer.valueOf(LogSeverity.EMERGENCY_VALUE), "\\3C9", Integer.valueOf(LogSeverity.ALERT_VALUE), "\\3C8", 600, "\\3C7", 500, "\\3C6", 400, "\\3C5", 300, "\\3C4", 200, "\\3C3", 100, "\\3C1", 90, "\\3DF", 80, "\\3C0", 70, "\\3BF", 60, "\\3BE", 50, "\\3BD", 40, "\\3BC", 30, "\\3BB", 20, "\\3BA", 10, "\\3B9", 9, "\\3B8", 8, "\\3B7", 7, "\\3B6", 6, "\\3C3\\3C4", 5, "\\3B4", 4, "\\3B3", 3, "\\3B2", 2, "\\3B1", 1, "\\3B0");
                return c5906k411;
            default:
                return m23878k4("decimal");
        }
    }
}
