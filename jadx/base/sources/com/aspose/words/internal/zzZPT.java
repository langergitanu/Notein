package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes5.dex */
final class zzZPT {
    private static final zzZPT zz2k;
    private String zz1Q;
    private String zz1R;
    private String zz1S;
    private String zz1T;
    private String zz1U;
    private String zz1V;
    private String zz1W;
    private String zz1X;
    private String zz1Y;
    private String zz1Z;
    private int zz20;
    private boolean zz21;
    private String[] zz22;
    private String[] zz23;
    private String[] zz24;
    private String[] zz25;
    private String[] zz26;
    private String[] zz27;
    private String[] zz28;
    private String[] zz29;
    private String[] zz2a;
    private String[] zz2b;
    private String[] zz2c;
    private String zz2d;
    private String[] zz2e;
    private String[] zz2f;
    private String[] zz2g;
    private int zz2h;
    private int zz2i;
    private String zz2j;

    static {
        zzZPT zzzpt = new zzZPT();
        zzzpt.zz2j = "Gregorian Calendar";
        zzzpt.zz2i = 2029;
        zzzpt.zz2h = 1;
        zzzpt.zz2g = new String[]{"MM/dd/yyyy", "yyyy-MM-dd"};
        zzzpt.zz2f = new String[]{"dddd, dd MMMM yyyy"};
        zzzpt.zz2e = new String[]{"yyyy MMMM"};
        zzzpt.zz2d = "MMMM dd";
        zzzpt.zz2c = new String[]{"A.D."};
        zzzpt.zz2b = new String[]{"AD"};
        zzzpt.zz2a = new String[]{"AD"};
        zzzpt.zz29 = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        zzzpt.zz28 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        zzzpt.zz27 = new String[]{"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
        String[] strArr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""};
        zzzpt.zz26 = strArr;
        String[] strArr2 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""};
        zzzpt.zz25 = strArr2;
        zzzpt.zz24 = strArr;
        zzzpt.zz23 = strArr2;
        zzzpt.zz22 = strArr;
        zzzpt.zz21 = false;
        zzzpt.zz1T = "AM";
        zzzpt.zz1U = "PM";
        zzzpt.zz1X = "/";
        zzzpt.zz1V = "dddd, dd MMMM yyyy HH:mm:ss";
        zzzpt.zz1Z = "HH:mm:ss";
        zzzpt.zz1S = "ddd, dd MMM yyyy HH':'mm':'ss 'GMT'";
        zzzpt.zz1Y = "HH:mm";
        zzzpt.zz1R = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
        zzzpt.zz1Q = "yyyy'-'MM'-'dd HH':'mm':'ss'Z'";
        zzzpt.zz1W = C18241k5.f55433h;
        zz2k = zzzpt;
    }

    public static zzZPT zzk9() {
        return zz2k;
    }

    public final String getAMDesignator() {
        return this.zz1T;
    }

    public final String getLongDatePattern() {
        String[] strArr = this.zz2f;
        if (strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    public final String getLongTimePattern() {
        return this.zz1Z;
    }

    public final String getPMDesignator() {
        return this.zz1U;
    }

    public final String getShortDatePattern() {
        String[] strArr = this.zz2g;
        if (strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    public final String getShortTimePattern() {
        return this.zz1Y;
    }

    public final void setAMDesignator(String str) {
        this.zz1T = str;
    }

    public final void setLongDatePattern(String str) {
        this.zz2f = new String[]{str};
    }

    public final void setLongTimePattern(String str) {
        this.zz1Z = str;
    }

    public final void setPMDesignator(String str) {
        this.zz1U = str;
    }

    public final void setShortDatePattern(String str) {
        this.zz2g = new String[]{str};
    }

    public final void setShortTimePattern(String str) {
        this.zz1Y = str;
    }

    public final void zzRg(int i) {
        this.zz20 = i;
    }

    public final void zzVJ(String str) {
        this.zz1Q = str;
    }

    public final void zzVK(String str) {
        this.zz1R = str;
    }

    public final void zzVL(String str) {
        this.zz1S = str;
    }

    public final void zzVM(String str) {
        this.zz1V = str;
    }

    public final void zzVN(String str) {
        this.zz1W = str;
    }

    public final void zzVO(String str) {
        this.zz1X = str;
    }

    public final void zzVP(String str) {
        this.zz2e = new String[]{str};
    }

    public final void zzVQ(String str) {
        this.zz2d = str;
    }

    public final String zzka() {
        return this.zz1Q;
    }

    public final String zzkb() {
        return this.zz1R;
    }

    public final String zzkc() {
        return this.zz1S;
    }

    public final String zzkd() {
        return this.zz1V;
    }

    public final String zzke() {
        return this.zz1W;
    }

    public final String zzkf() {
        return this.zz1X;
    }

    public final String zzkg() {
        String[] strArr = this.zz2e;
        if (strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    public final String zzkh() {
        return this.zz2d;
    }
}
