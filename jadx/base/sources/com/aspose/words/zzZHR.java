package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHR {
    private static com.aspose.words.internal.zzZNR zzYql = new com.aspose.words.internal.zzZNR("arial|book|cambria|century gothic|copperplate gothic|courier|franklin gothic|garamond|gill sans|helv|microsoft sans serif|myriad|nimbus sans|palatino|script|tahoma|times|trebuchet|verdana|wingdings", 0);
    private static HashMap<String, String> zzYqm;
    private com.aspose.words.internal.zzGQ zzFh;
    private FontInfoCollection zzYSn;
    private boolean zzYqk;

    static {
        HashMap<String, String> map = new HashMap<>();
        zzYqm = map;
        com.aspose.words.internal.zzZQF.zzY(map, "adobe caslon pro", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "adobe minion cyrillic", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "adobe poetica", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "adobecorpid minionpkg", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "akzidenz grotesk", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "akzidenzgroteskbq-ligcnd", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "akzidenzgroteskbq-reg", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "albany", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "albany amt", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "albertus", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "albertus medium", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "algerian", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "alpha geometrique", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "arial", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "attika", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "avantgarde", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "avenir 45", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "avenir 55", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bastion", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "batang", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "batangche", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bauhaus 93", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bauhaus light", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "berlin sans fb", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bernhardmod bt", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bitstream charter", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bitstream cyberbit", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bitstream vera sans", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bitstream vera sans mono", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bitstream vera sans oblique", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bitstream vera serif", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "blackadder itc", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "blackoak std", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bmo nesbitt burns pi", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "bodoni", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "book", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "broadway", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "calibri", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "calisto mt", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "cambria", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "castellar", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "century", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "century gothic", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "cg omega", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "charlesworth", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "charter bt", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "chicago", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "comic sans ms", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "consolas", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "cooper black", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "copperplate gothic", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "corsiva", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "cottonwood", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "courier", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "courier new", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "critter", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "cumberland", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "cumberland amt", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "dauphin", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "dejavu sans mono", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "din-light", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "din-medium", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "dinmittelschrift", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "din-regular", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "dotumche", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "er bukinst", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "er kurier", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "er univers", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "eras demi itc", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "estrangelo edessa", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "everson mono", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ex ponto", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "excelcior cyrillic upright", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "fb reactor", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "felix titling", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "footlight mt light", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "franklin gothic", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "freesans", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "friz quadrata", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "frutiger 55 roman", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "futura", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "galliard", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "garamond", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ge inspira", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "geneva", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "georgia", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "gill sans", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "goudy old style", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "gulim", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "gulimche", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "haettenschweiler", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "helv", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "helvetica", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "impact", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "imprint mt shadow", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ipa pゴシック1", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "iso-font", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "itc avant garde gothic", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "itc stone sans", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "itc stone serif", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "kix barcode", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "letter gothic", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "letter gothic mt", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "lucida bright", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "lucida calligraphy", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "lucida console", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "lucida sans typewriter", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "lucida sans unicode", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "maiola-bolditalic", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "map symbols", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "microsoft sans serif", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "microsoftlogo95", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "minion web", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "modern no. 20", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "monaco", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "monotype albion 70", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "monotype corsiva", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ms georgia", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ms gothic", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ms mincho", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ms pgothic", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ms shell dlg", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "myriad", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "new york", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "nimbus mono l", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "nimbus sans", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "old english text mt", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "optima", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "palatino", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "playbill", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "pmingliu", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "prestige", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "rockwell", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "roman", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "sabon mt", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "sanvito", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "sapdings", "monospace");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "scalasans-regular", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "script", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "signet roundhand", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "signs", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "simsun", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "snell roundhand", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "studz", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "swis721 lt bt", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "swiss", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "sylfaen", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "symbol", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "tahoma", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "thorndale", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "thorndale amt", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "times", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "times new roman", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "tktypebold", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "tms rmn", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "tpg kpn pensioen", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "tradegothic", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "trebuchet", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "tw cen mt", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "tw cen mt condensed", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "typiko new era", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "univers", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "univers (w1)", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "univers ce", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "universalmath1 bt", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "utopia", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "verdana", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "wachovia celeste", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "water on the oil", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "webdings", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "wingdings", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "zapf-chancery", "cursive");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "zapfdingbats", "fantasy");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "zapfhumnst bt", "sans-serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ヒラギノ角ゴ pro w3", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "ヒラギノ角ゴ pro w6", "serif");
        com.aspose.words.internal.zzZQF.zzY(zzYqm, "新細明體", "serif");
    }

    public zzZHR(Document document, HtmlSaveOptions htmlSaveOptions) {
        if (htmlSaveOptions.zzYZ9()) {
            this.zzYSn = document.getFontInfos();
        }
        this.zzFh = document.zzZqy();
        this.zzYqk = htmlSaveOptions.getResolveFontNames();
    }

    private static String zzKI(String str) {
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(str);
        String str2 = (String) com.aspose.words.internal.zzQW.zzZ(zzYqm, strZzU2);
        if (str2 == null) {
            com.aspose.words.internal.zzZNT zzzntZzUX = zzYql.zzUX(strZzU2);
            if (zzzntZzUX.zzhL()) {
                return (String) com.aspose.words.internal.zzQW.zzZ(zzYqm, zzzntZzUX.getValue());
            }
        }
        return str2;
    }

    private static int zzL(boolean z, boolean z2) {
        return z2 ? (z ? 1 : 0) | 2 : z ? 1 : 0;
    }

    private com.aspose.words.internal.zzZXH zzO(String str, int i) throws Exception {
        return this.zzFh.zzN(str, i);
    }

    private static int zzQ(Font font) {
        boolean z = font.getBidi() || font.getComplexScript();
        return zzL(z ? font.getBoldBi() : font.getBold(), z ? font.getItalicBi() : font.getItalic());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String zzSw(String str) {
        String strZzKI;
        FontInfo fontInfo = this.zzYSn.get(str);
        if (fontInfo == null) {
            strZzKI = null;
        } else {
            int family = fontInfo.getFamily();
            if (family == 1) {
                strZzKI = "serif";
            } else if (family == 2) {
                strZzKI = "sans-serif";
            } else if (family == 3) {
                strZzKI = "monospace";
            } else if (family == 4) {
                strZzKI = "cursive";
            } else if (family == 5) {
                strZzKI = "fantasy";
            }
        }
        if (strZzKI == null) {
            strZzKI = zzKI(str);
        }
        return strZzKI != null ? strZzKI : "serif";
    }

    private String[] zzZM(String str, int i) throws Exception {
        if (this.zzYqk) {
            str = zzO(str, i).zzPh();
        }
        return this.zzYSn != null ? new String[]{str, zzSw(str)} : new String[]{str};
    }

    public final String[] zzT(String str, boolean z, boolean z2) throws Exception {
        return zzZM(str, zzL(z, z2));
    }

    public final com.aspose.words.internal.zzZXH zzW(Font font, int i) throws Exception {
        return zzO(font.getFontName(i), zzQ(font));
    }

    public final String[] zzX(Font font, int i) throws Exception {
        return zzZM(font.getFontName(i), zzQ(font));
    }
}
