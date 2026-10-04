package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.EditingLanguage;
import com.aspose.words.TableStyleOptions;
import com.aspose.words.internal.zzZPL;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.text.DateFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZP0 implements zzZPC, Cloneable {
    private static volatile zzZP0 zzZXW = null;
    private static volatile zzZP0 zzZXX = null;
    private static boolean zzZYB = false;
    private static boolean zzZYC = false;
    private static String[] zzZYu;
    private String zz0u;
    private Locale zz0w;
    private boolean zzZXT;
    private boolean zzZXU;
    private boolean zzZXV;
    int zzZXY;
    private String zzZXZ;
    private String zzZY0;
    private String zzZY1;
    private String zzZY2;
    private String zzZY3;
    private String zzZY4;
    private String zzZY5;
    private String zzZY6;
    private String zzZY7;
    private String zzZY8;
    private String zzZY9;
    private String zzZYA;
    private String[] zzZYD;
    private boolean zzZYE;
    private zzZ[] zzZYF;
    private DateFormatSymbols zzZYa;
    private String zzZYb;
    private String[] zzZYc;
    private String[] zzZYd;
    private String[] zzZYe;
    private String[] zzZYf;
    private String[] zzZYg;
    private String[] zzZYh;
    private int zzZYw;
    private String zzZYx;
    private String zzZYy;
    private String zzZYz;
    private zzZPU zzZZw;
    private static String[] zzZYv = {"A.D.", "B.C", "AD", "BC"};
    private static String[] zzZYt = {"יום ראשון", "יום שני", "יום שלישי", "יום רביעי", "יום חמישי", "יום שישי", "שבת"};
    private static String[] zzZYs = {"יום א", "יום ב", "יום ג", "יום ד", "יום ה", "יום ו", "שבת"};
    private static String[] zzZYr = {"א", "ב", "ג", "ד", "ה", "ו", "ש"};
    private static String[] zzZYq = {"תשרי", "חשון", "כסלו", "טבת", "שבט", "אדר", "אדר ב", "ניסן", "אייר", "סיון", "תמוז", "אב", "אלול"};
    private static String[] zzZYp = {"לספירה", "לספירה"};
    private static String[] zzZYo = {"الاحد", "الاثنين", "الثلاثاء", "الاربعاء", "الخميس", "الجمعة", "السبت"};
    private static String[] zzZYn = {"محرم", "صفر", "ربيع الأول", "ربيع الثاني", "جمادى الأولى", "جمادى الثانية", "رجب", "شعبان", "رمضان", "شوال", "ذو القعدة", "ذو الحجة"};
    private static String[] zzZYm = {"بعد الهجرة", "بعد الهجرة"};
    private static String[] zzZYl = {"igandea", "astelehena", "asteartea", "asteazkena", "osteguna", "ostirala", "larunbata"};
    private static String[] zzZYk = {"ig.", "al.", "ar.", "az.", "og.", "or.", "lr."};
    private static String[] zzZYj = {"urtarrila", "otsaila", "martxoa", "apirila", "maiatza", "ekaina", "uztaila", "abuztu", "iraila", "urria", "azaroa", "abendua"};
    private static String[] zzZYi = {"urt.", "ots.", "mar.", "api.", "mai.", "eka.", "uzt.", "abu.", "ira.", "urr.", "aza.", "abe."};

    public static class zzZ {
        private int zzZXQ;
        private int zzZXR;
        private String zzZXS;

        public zzZ(String str, int i, int i2) {
            this.zzZXS = str;
            this.zzZXR = i;
            this.zzZXQ = i2;
        }

        public static /* synthetic */ int zzZ(zzZ zzz, int i) {
            int i2 = i | zzz.zzZXR;
            zzz.zzZXR = i2;
            return i2;
        }
    }

    public zzZP0() {
        this(zzZNG.zzpZ());
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String[] zzQ(String[] strArr) {
        int length = strArr.length - 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 1, strArr2, 0, length);
        return strArr2;
    }

    public static String zzQL(int i) {
        if (i >= 0) {
            String[] strArr = zzZYv;
            if (i <= strArr.length) {
                return strArr[i];
            }
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Out of range "));
    }

    public static zzZP0 zzZ(zzZPC zzzpc) {
        return zzzpc instanceof zzZP1 ? ((zzZP1) zzzpc).zzjc() : zzzpc instanceof zzZP0 ? (zzZP0) zzzpc : zzZNG.zzpZ().zzjc();
    }

    private static boolean zzZU(char c) {
        return c >= 1424 && c <= 1535;
    }

    public static zzZP0 zziI() {
        if (zzZXX == null) {
            zzZXX = new zzZP0(new zzZP1("zh-TW"));
        }
        return zzZXX;
    }

    public static zzZP0 zziJ() {
        if (zzZXW == null) {
            zzZXW = new zzZP0(new zzZP1("ja-JP"));
        }
        return zzZXW;
    }

    private String[] zziK() {
        return new String[]{this.zzZY6};
    }

    private String[] zziL() {
        return new String[]{this.zzZY5};
    }

    private String[] zziM() {
        return new String[]{this.zzZY8};
    }

    private String[] zziN() {
        return new String[]{this.zzZY4};
    }

    private String[] zziO() {
        return new String[]{this.zzZY7};
    }

    public static zzZP0 zziQ() {
        return new zzZP0(zzZP1.zzj8());
    }

    private static String[] zziV() {
        if (zzZYu == null) {
            zzZYu = new DateFormatSymbols(Locale.ENGLISH).getEras();
        }
        return zzZYu;
    }

    public static void zziW() {
    }

    public static void zziX() {
    }

    private String[] zziY() {
        return this.zzZXV ? zzZYt : this.zzZXU ? zzZYo : this.zzZXT ? zzZYl : zzQ(this.zzZYa.getWeekdays());
    }

    private String[] zziZ() {
        return zzQ(this.zzZYa.getShortWeekdays());
    }

    private String[] zzj0() {
        return this.zzZXV ? this.zzZZw instanceof zzZPG ? zzZYr : zzZYs : this.zzZXU ? zzZYo : this.zzZXT ? zzZYk : zzQ(this.zzZYa.getShortWeekdays());
    }

    private zzZ[] zzj1() {
        boolean z;
        zzZ[] zzzArr = this.zzZYF;
        if (zzzArr == null) {
            zzzArr = new zzZ[199];
            zzZ(zzzArr, ",", 15, 0);
            zzZ(zzzArr, ".", 15, 0);
            zzZ(zzzArr, this.zzZYA, 1792, 0);
            zzZ(zzzArr, this.zzZYy, EditingLanguage.CATALAN, 0);
            zzZ(zzzArr, this.zzZYx, 1284, 1);
            if ("sq-AL".equals(this.zz0u)) {
                zzZ(zzzArr, "." + this.zzZYy, EditingLanguage.CATALAN, 0);
                zzZ(zzzArr, "." + this.zzZYx, 1284, 1);
            }
            zzZ(zzzArr, "年", 2048, 0);
            zzZ(zzzArr, "년", 2048, 0);
            zzZ(zzzArr, "月", 2304, 0);
            zzZ(zzzArr, "월", 2304, 0);
            zzZ(zzzArr, "日", 2560, 0);
            zzZ(zzzArr, "일", 2560, 0);
            zzZ(zzzArr, "時", 2816, 0);
            zzZ(zzzArr, "时", 2816, 0);
            zzZ(zzzArr, "分", 3072, 0);
            zzZ(zzzArr, "秒", 3328, 0);
            if (TranslateLanguage.KOREAN.equals(this.zzZYb)) {
                zzZ(zzzArr, "시", 2816, 0);
                zzZ(zzzArr, "분", 3072, 0);
                zzZ(zzzArr, "초", 3328, 0);
            }
            if ("ky-KG".equals(this.zz0u)) {
                zzZ(zzzArr, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, 15, 0);
            } else {
                zzZ(zzzArr, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, 3840, 0);
            }
            if (this.zzZYD == null) {
                if (this.zzZYE) {
                    new zzZPN();
                    this.zzZYD = zzZPN.zzY(this);
                } else {
                    this.zzZYD = zziK();
                }
            }
            String[] strArr = this.zzZYD;
            if (strArr != null) {
                z = false;
                for (int i = 0; i < strArr.length; i++) {
                    switch (strArr[i].charAt(0)) {
                        case 57344:
                            zzZ(zzzArr, strArr[i].substring(1));
                            break;
                        case 57345:
                            String strSubstring = strArr[i].substring(1);
                            zzZ(zzzArr, strSubstring, 15, 0);
                            if (this.zzZYz.trim().equals(strSubstring)) {
                                z = true;
                            }
                            break;
                        default:
                            zzZ(zzzArr, strArr[i], 10, 0);
                            if ("eu-ES".equals(this.zz0u)) {
                                zzZ(zzzArr, "." + strArr[i], 10, 0);
                            }
                            break;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                zzZ(zzzArr, this.zzZYz, TableStyleOptions.DEFAULT_2003, 0);
            }
            zzZ(zzzArr, (String) null);
            for (int i2 = 1; i2 <= 13; i2++) {
                zzZ(zzzArr, zzQN(i2), 5, i2);
            }
            if ("gl-ES".equals(this.zz0u)) {
                for (int i3 = 1; i3 <= 13; i3++) {
                    String strZzQM = zzQM(i3);
                    if (strZzQM.length() > 0) {
                        zzZ(zzzArr, strZzQM.concat(TranslateLanguage.GERMAN), 5, i3);
                    }
                }
            }
            if ((this.zzZXY & 1) != 0) {
                for (int i4 = 1; i4 <= 13; i4++) {
                    zzZ(zzzArr, zzQM(i4), 5, i4);
                }
            }
            if ((this.zzZXY & 2) != 0) {
                for (int i5 = 1; i5 <= 13; i5++) {
                    zzZ(zzzArr, zzQM(i5), 5, i5);
                }
            }
            for (int i6 = 0; i6 < 7; i6++) {
                zzZ(zzzArr, zzQI(i6), 7, i6);
                zzZ(zzzArr, zzQJ(i6), 7, i6);
            }
            int[] iArrZzkj = this.zzZZw.zzkj();
            for (int i7 = 1; i7 <= iArrZzkj.length; i7++) {
                zzZ(zzzArr, zzQK(i7), 9, i7);
                zzZ(zzzArr, zzQL(i7), 9, i7);
            }
            if (TranslateLanguage.JAPANESE.equals(this.zzZYb)) {
                for (int i8 = 0; i8 < 7; i8++) {
                    zzZ(zzzArr, "(" + zzQJ(i8) + ")", 7, i8);
                }
                if (!(this.zzZZw instanceof zzZPB)) {
                    zzZP0 zzzp0ZziJ = zziJ();
                    for (int i9 = 1; i9 <= zzzp0ZziJ.zzZZw.zzkj().length; i9++) {
                        zzZ(zzzArr, zzzp0ZziJ.zzQK(i9), 13, i9);
                        zzZ(zzzArr, zzQL(i9), 13, i9);
                        zzZ(zzzArr, zziV()[i9 - 1], 13, i9);
                    }
                }
            } else if ("zh-TW".equals(this.zz0u)) {
                zzZP0 zzzp0ZziI = zziI();
                for (int i10 = 1; i10 <= zzzp0ZziI.zzZZw.zzkj().length; i10++) {
                    if (zzzp0ZziI.zzQK(i10).length() > 0) {
                        zzZ(zzzArr, zzzp0ZziI.zzQK(i10), 14, i10);
                    }
                }
            }
            zzZ(zzzArr, zziQ().zzZYy, EditingLanguage.CATALAN, 0);
            zzZ(zzzArr, zziQ().zzZYx, 1284, 1);
            for (int i11 = 1; i11 <= 12; i11++) {
                zzZ(zzzArr, zziQ().zzQM(i11), 5, i11);
                zzZ(zzzArr, zziQ().zzQN(i11), 5, i11);
            }
            for (int i12 = 0; i12 < 7; i12++) {
                zzZ(zzzArr, zziQ().zzQI(i12), 7, i12);
                zzZ(zzzArr, zziQ().zzQJ(i12), 7, i12);
            }
            int i13 = 0;
            while (i13 < zziV().length) {
                String str = zziV()[i13];
                i13++;
                zzZ(zzzArr, str, 9, i13);
            }
            zzZ(zzzArr, "T", 3584, 0);
            zzZ(zzzArr, "GMT", 8, 0);
            zzZ(zzzArr, "Z", 8, 0);
            zzZ(zzzArr, "/", TableStyleOptions.DEFAULT_2003, 0);
            zzZ(zzzArr, C18241k5.f55433h, 1792, 0);
            this.zzZYF = zzzArr;
        }
        return zzzArr;
    }

    private void zzj2() {
        this.zzZYF = null;
        this.zzZYD = null;
        this.zzZYE = true;
    }

    public static zzZP0 zzj3() {
        return zzZNG.zzpZ().zzjc();
    }

    public final String getAMDesignator() {
        return this.zzZYy;
    }

    public final String[] getAbbreviatedDayNames() {
        return this.zzZYh;
    }

    public final String[] getAbbreviatedMonthNames() {
        return ((this.zzZZw instanceof zzZPG) && "he-IL".equals(this.zz0u)) ? zzZYq : (((this.zzZZw instanceof zzZPD) && this.zz0u.startsWith("ar-")) || this.zzZXU) ? zzZYn : ((this.zzZZw instanceof zzZPI) && this.zzZXT) ? zzZYi : this.zzZYa.getShortMonths();
    }

    public final String[] getDayNames() {
        return this.zzZYf;
    }

    public final String[] getEraNames() {
        return this.zzZXV ? zzZYp : this.zzZXU ? zzZYm : this.zzZYa.getEras();
    }

    public final String getLongDatePattern() {
        return this.zzZY6;
    }

    public final String getLongTimePattern() {
        return this.zzZY4;
    }

    public final String[] getMonthNames() {
        return ((this.zzZZw instanceof zzZPG) && "he-IL".equals(this.zz0u)) ? zzZYq : (((this.zzZZw instanceof zzZPD) && this.zz0u.startsWith("ar-")) || this.zzZXU) ? zzZYn : ((this.zzZZw instanceof zzZPI) && this.zzZXT) ? zzZYj : this.zzZYa.getMonths();
    }

    public final String getPMDesignator() {
        return this.zzZYx;
    }

    public final String getShortDatePattern() {
        return this.zzZY7;
    }

    public final String getShortTimePattern() {
        return this.zzZY5;
    }

    public final String[] getShortestDayNames() {
        return this.zzZYg;
    }

    public final void setAMDesignator(String str) {
        this.zzZYy = str;
    }

    public final void setAbbreviatedDayNames(String[] strArr) {
        this.zzZYh = strArr;
    }

    public final void setAbbreviatedMonthNames(String[] strArr) {
        this.zzZYa.setShortMonths(strArr);
        this.zzZYe = strArr;
    }

    public final void setDayNames(String[] strArr) {
        this.zzZYf = strArr;
    }

    public final void setLongDatePattern(String str) {
        this.zzZY6 = str;
    }

    public final void setLongTimePattern(String str) {
        this.zzZY4 = str;
    }

    public final void setMonthNames(String[] strArr) {
        this.zzZYa.setMonths(strArr);
        this.zzZYd = strArr;
    }

    public final void setPMDesignator(String str) {
        this.zzZYx = str;
    }

    public final void setShortDatePattern(String str) {
        this.zzZY7 = str;
    }

    public final void setShortTimePattern(String str) {
        this.zzZY5 = str;
    }

    public final void setShortestDayNames(String[] strArr) {
        this.zzZYg = strArr;
    }

    public final String zzQI(int i) {
        if (i >= 0) {
            String[] strArr = this.zzZYf;
            if (i <= strArr.length - 1) {
                return strArr[i];
            }
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Out of range "));
    }

    public final String zzQJ(int i) {
        if (i >= 0) {
            String[] strArr = this.zzZYh;
            if (i <= strArr.length - 1) {
                return strArr[i];
            }
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Out of range "));
    }

    public final String zzQK(int i) {
        if (i >= 0) {
            String[] strArr = this.zzZYc;
            if (i <= strArr.length) {
                return strArr[i - 1];
            }
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Out of range "));
    }

    public final String zzQM(int i) {
        if (i >= 0) {
            String[] strArr = this.zzZYd;
            if (i <= strArr.length) {
                return strArr[i - 1];
            }
        }
        if (i == 13) {
            return "";
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Out of month range "));
    }

    public final String zzQN(int i) {
        if (i >= 0) {
            String[] strArr = this.zzZYe;
            if (i <= strArr.length) {
                return strArr[i - 1];
            }
        }
        if (i == 13) {
            return "";
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Out of month range "));
    }

    public final String[] zzZV(char c) throws Exception {
        if (c == 'D') {
            return zziK();
        }
        if (c != 'M') {
            if (c != 'O') {
                if (c != 'R') {
                    if (c != 'Y') {
                        if (c == 'd') {
                            return zziO();
                        }
                        if (c != 'm') {
                            if (c != 'o') {
                                if (c != 'y') {
                                    if (c == 'F') {
                                        return zzZ(zziK(), zziN(), " ");
                                    }
                                    if (c == 'G') {
                                        return zzZ(zziO(), zziN(), " ");
                                    }
                                    if (c == 'T') {
                                        return zziN();
                                    }
                                    if (c == 'U') {
                                        return zzZ(zziK(), zziN(), " ");
                                    }
                                    if (c == 'f') {
                                        return zzZ(zziK(), zziL(), " ");
                                    }
                                    if (c == 'g') {
                                        return zzZ(zziO(), zziL(), " ");
                                    }
                                    switch (c) {
                                        case 'r':
                                            break;
                                        case 's':
                                            return new String[]{this.zzZY2};
                                        case 't':
                                            return zziL();
                                        case 'u':
                                            return new String[]{this.zzZY1};
                                        default:
                                            throw new Exception("Argument_BadFormatSpecifier");
                                    }
                                }
                            }
                        }
                    }
                    return zziM();
                }
                return new String[]{this.zzZY3};
            }
            return new String[]{"yyyy'-'MM'-'dd'T'HH':'mm':'ss.fffffffK"};
        }
        return new String[]{this.zzZY9};
    }

    public final zzZP0 zziF() {
        zzZP0 zzzp0 = (zzZP0) memberwiseClone();
        zzzp0.zzZ((zzZPU) this.zzZZw.zzkm());
        return zzzp0;
    }

    public final int zziG() {
        if (this.zzZXY == 0 && this.zzZYE) {
            this.zzZXY = 0;
            int iZzZ = zzZPN.zzZ(getMonthNames(), this.zzZYe, getAbbreviatedMonthNames(), this.zzZYe);
            this.zzZXY = iZzZ;
            int iZzY = iZzZ | zzZPN.zzY(getMonthNames(), this.zzZYe, getAbbreviatedMonthNames(), this.zzZYe);
            this.zzZXY = iZzY;
            int iZzZ2 = iZzY | zzZPN.zzZ(this.zzZYf, this.zzZYh);
            this.zzZXY = iZzZ2;
            this.zzZXY = iZzZ2 | zzZPN.zzVw(this.zz0u);
        }
        return this.zzZXY;
    }

    public final boolean zziH() {
        return (zziG() & 8) != 0;
    }

    public final String zziP() {
        if (this.zzZXZ == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzZY7);
            sb.append(" ");
            this.zzZXZ = androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.zzZY6, " zzz");
        }
        return this.zzZXZ;
    }

    public final boolean zziR() {
        int id = this.zzZZw.getID();
        return id == 3 || id == 4;
    }

    public final String zziS() {
        return this.zzZY7 + " " + this.zzZY4;
    }

    public final String zziT() {
        return this.zzZY7 + " " + this.zzZY5;
    }

    public final String zziU() {
        return this.zzZY3;
    }

    public final zzZPU zzjs() {
        return this.zzZZw;
    }

    public final String zzk2() {
        return this.zz0u;
    }

    public final String zzka() {
        return this.zzZY1;
    }

    public final String zzkb() {
        return this.zzZY2;
    }

    public final String zzkd() {
        return this.zzZY0;
    }

    public final String zzke() {
        return this.zzZYA;
    }

    public final String zzkf() {
        return this.zzZYz;
    }

    public final String zzkg() {
        return this.zzZY8;
    }

    public final String zzkh() {
        return this.zzZY9;
    }

    private zzZP0(zzZP1 zzzp1) {
        this(zzzp1.zzjb(), zzzp1.zzjs());
    }

    public zzZP0(zzZPR zzzpr, zzZPU zzzpu) {
        this.zzZYE = false;
        this.zzZYD = null;
        this.zzZYw = 0;
        this.zzZXY = 0;
        Locale locale = zzzpr.getLocale();
        this.zz0u = zzzpr.getName();
        this.zzZYb = locale.getLanguage();
        this.zzZZw = zzzpu;
        String string = locale.toString();
        this.zzZXV = "he_IL".equals(string) || "iw_IL".equals(string);
        this.zzZXU = string.startsWith("ar_") || string.startsWith("ar-");
        this.zzZXT = "eu_ES".equals(string);
        this.zzZYa = new DateFormatSymbols(locale);
        this.zzZYh = zzj0();
        this.zzZYg = zziZ();
        this.zzZYf = zziY();
        this.zzZYe = getAbbreviatedMonthNames();
        this.zzZYd = getMonthNames();
        this.zzZYc = getEraNames();
        this.zz0w = locale;
        zzZPT zzzptZzk0 = zzzpr.zzk0();
        this.zzZY4 = zzzptZzk0.getLongTimePattern();
        this.zzZY6 = zzzptZzk0.getLongDatePattern();
        this.zzZY7 = zzzptZzk0.getShortDatePattern();
        this.zzZY5 = zzzptZzk0.getShortTimePattern();
        this.zzZY9 = zzzptZzk0.zzkh();
        this.zzZY8 = zzzptZzk0.zzkg();
        this.zzZYz = zzzptZzk0.zzkf();
        this.zzZYA = zzzptZzk0.zzke();
        this.zzZY0 = zzzptZzk0.zzkd();
        this.zzZYx = zzzptZzk0.getPMDesignator();
        this.zzZYy = zzzptZzk0.getAMDesignator();
        this.zzZY3 = zzzptZzk0.zzkc();
        this.zzZY2 = zzzptZzk0.zzkb();
        this.zzZY1 = zzzptZzk0.zzka();
        zzj2();
    }

    public final boolean zzZ(int i, zzZPL.zzT zzt, zzZPL zzzpl) {
        int iZzK;
        zzt.setType(11);
        zzt.setValue(0);
        char cZzFI = zzzpl.zzFI();
        boolean zIsLetter = Character.isLetter(cZzFI);
        if (zIsLetter) {
            cZzFI = Character.toLowerCase(cZzFI);
            if (zzZU(cZzFI) && i == 255 && zzZ(zzzpl, zzt)) {
                zzt.setType(12);
                return true;
            }
        }
        int i2 = cZzFI % 199;
        int i3 = (cZzFI % 197) + 1;
        int iZzjS = zzzpl.zzjS() - zzzpl.getIndex();
        zzZ[] zzzArrZzj1 = this.zzZYF;
        if (zzzArrZzj1 == null) {
            zzzArrZzj1 = zzj1();
        }
        int i4 = 0;
        do {
            zzZ zzz = zzzArrZzj1[i2];
            if (zzz == null) {
                break;
            }
            if ((zzz.zzZXR & i) > 0 && zzz.zzZXS.length() <= iZzjS) {
                if (zzZKN.zzZ(zzzpl.getValue(), zzzpl.getIndex(), zzz.zzZXS, 0, zzz.zzZXS.length(), true) == 0) {
                    if (zIsLetter) {
                        int length = zzz.zzZXS.length() + zzzpl.getIndex();
                        if (length < zzzpl.zzjS() && Character.isLetter(zzzpl.getValue().charAt(length))) {
                            return false;
                        }
                    }
                    zzt.setType(i & zzz.zzZXR);
                    zzt.setValue(zzz.zzZXQ);
                    zzzpl.zzR8(zzz.zzZXS.length());
                    return true;
                }
                if (zzz.zzZXR != 5 || !zzZYC) {
                    if (zzz.zzZXR == 7 && zzZYB && (iZzK = zzzpl.zzK(zzz.zzZXS, true)) != -1) {
                        zzt.setType(i & zzz.zzZXR);
                        zzt.setValue(zzz.zzZXQ);
                        zzzpl.zzR8(iZzK);
                        return true;
                    }
                } else {
                    int iZzK2 = zzzpl.zzK(zzz.zzZXS, true);
                    if (iZzK2 != -1) {
                        zzt.setType(i & zzz.zzZXR);
                        zzt.setValue(zzz.zzZXQ);
                        zzzpl.zzR8(iZzK2);
                        return true;
                    }
                }
            }
            i4++;
            i2 += i3;
            if (i2 >= 199) {
                i2 -= 199;
            }
        } while (i4 < 199);
        return false;
    }

    private void zzZ(zzZ[] zzzArr, String str) {
        for (int i = 1; i <= 13; i++) {
            String strZzQM = zzQM(i);
            if (strZzQM.length() > 0) {
                if (str != null) {
                    zzZ(zzzArr, strZzQM.concat(str), 5, i);
                } else {
                    zzZ(zzzArr, strZzQM, 5, i);
                }
            }
            zzZ(zzzArr, zzQN(i), 5, i);
        }
    }

    private static void zzZ(zzZ[] zzzArr, String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            return;
        }
        int i3 = 0;
        if (zzZKU.zzG(str.charAt(0)) || zzZKU.zzG(str.charAt(str.length() - 1))) {
            str = str.trim();
            if (str.length() == 0) {
                return;
            }
        }
        String str2 = str;
        char lowerCase = Character.toLowerCase(str2.charAt(0));
        int i4 = (lowerCase % 197) + 1;
        int i5 = lowerCase % 199;
        while (true) {
            zzZ zzz = zzzArr[i5];
            if (zzz != null) {
                if (str2.length() >= zzz.zzZXS.length() && zzZKN.zzZ(str2, 0, zzz.zzZXS, 0, zzz.zzZXS.length(), true) == 0) {
                    if (str2.length() <= zzz.zzZXS.length()) {
                        int i6 = i;
                        int i7 = i2;
                        if ((i6 & 65280) != (65280 & zzz.zzZXR)) {
                            zzZ.zzZ(zzz, i6);
                            if (i7 != 0) {
                                zzz.zzZXQ = i7;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    zzZ(zzzArr, str2, lowerCase, i, i2, i3, i5, i4);
                    return;
                }
                char c = lowerCase;
                int i8 = i;
                int i9 = i2;
                String str3 = str2;
                zzZ[] zzzArr2 = zzzArr;
                i3++;
                i5 += i4;
                if (i5 >= 199) {
                    i5 -= 199;
                }
                if (i3 >= 199) {
                    return;
                }
                zzzArr = zzzArr2;
                str2 = str3;
                lowerCase = c;
                i = i8;
                i2 = i9;
            } else {
                zzzArr[i5] = new zzZ(str2, i, i2);
                return;
            }
        }
    }

    private static void zzZ(zzZ[] zzzArr, String str, char c, int i, int i2, int i3, int i4, int i5) {
        zzZ zzz = zzzArr[i4];
        zzzArr[i4] = new zzZ(str, i, i2);
        while (true) {
            i3++;
            if (i3 >= 199) {
                return;
            }
            i4 += i5;
            if (i4 >= 199) {
                i4 -= 199;
            }
            zzZ zzz2 = zzzArr[i4];
            if (zzz2 == null || Character.toLowerCase(zzz2.zzZXS.charAt(0)) == c) {
                zzzArr[i4] = zzz;
                if (zzz2 == null) {
                    return;
                } else {
                    zzz = zzz2;
                }
            }
        }
    }

    public final void zzZ(zzZPU zzzpu) {
        this.zzZZw = zzzpu;
        this.zzZYa = new DateFormatSymbols(this.zz0w);
        this.zzZYh = zzj0();
        this.zzZYg = zziZ();
        this.zzZYf = zziY();
        this.zzZYe = getAbbreviatedMonthNames();
        this.zzZYd = getMonthNames();
        this.zzZYc = getEraNames();
    }

    public final boolean zzZ(int[] iArr, boolean z) {
        if ((this.zzZXY & 8) != 0) {
            int i = iArr[0];
            if (i < 1000) {
                iArr[0] = i + 5000;
            }
            int i2 = iArr[0];
            zzZPU zzzpu = this.zzZZw;
            if (i2 >= zzzpu.zzE(zzzpu.zzkp())) {
                int i3 = iArr[0];
                zzZPU zzzpu2 = this.zzZZw;
                if (i3 <= zzzpu2.zzE(zzzpu2.zzko())) {
                    if (z && !this.zzZZw.zzZl(iArr[0], 0)) {
                        int i4 = iArr[1];
                        if (i4 >= 8) {
                            iArr[1] = i4 - 1;
                        } else if (i4 == 7) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private static String[] zzZ(String[] strArr, String[] strArr2, String str) {
        String[] strArr3 = new String[strArr.length * strArr2.length];
        for (int i = 0; i < strArr.length; i++) {
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                strArr3[(strArr2.length * i) + i2] = strArr[i] + str + strArr2[i2];
            }
        }
        return strArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzZ(zzZPL zzzpl, zzZPL.zzT zzt) {
        int i;
        int iZzZ;
        zzt.setValue(-1);
        int index = zzzpl.getIndex();
        if (!zzZPF.zzZW(zzzpl.getValue().charAt(index))) {
            return false;
        }
        zzZPE zzzpe = new zzZPE();
        while (true) {
            i = index + 1;
            iZzZ = zzZPF.zzZ(zzzpl.getValue().charAt(index), zzzpe);
            if (iZzZ == 0 || iZzZ == 1) {
                break;
            }
            if (i >= zzzpl.getValue().length() || iZzZ == 2) {
                break;
            }
            index = i;
        }
        if (iZzZ != 2) {
            return false;
        }
        zzzpl.zzR8(i - zzzpl.getIndex());
        zzt.setValue(zzzpe.zzZYY);
        return true;
    }
}
