package com.aspose.words.internal;

import com.aspose.words.net.System.Globalization.CultureNotFoundException;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzZPR implements Cloneable {
    private static volatile zzZPR zz1L;
    private boolean zz0A;
    private boolean zz0B;
    private String zz0C;
    private String zz0D;
    private String zz0F;
    private String zz0G;
    private String zz0H;
    private String zz0I;
    private int zz0J;
    private String zz0O;
    private String zz0P;
    private String zz0Q;
    private volatile int[] zz0S;
    private volatile String[] zz0V;
    private volatile String[] zz0W;
    private volatile String[] zz0X;
    private String zz0Y;
    private String zz0Z;
    private volatile Locale zz0w;
    private int zz0x;
    private int zz0y;
    private zzZPT[] zz0z;
    private int zz10;
    private String zz11;
    private String zz13;
    private String zz14;
    private int[] zz15;
    private int zz16;
    private int zz17;
    private int zz18;
    private String zz19;
    private String zz1A;
    private String zz1B;
    private String zz1C;
    private String zz1D;
    private String zz1E;
    private String zz1F;
    private String zz1G;
    private String zz1H;
    private String zz1I;
    private String zz1J;
    private String zz1K;
    private String zz1a;
    private String zz1b;
    private String zz1c;
    private String zz1d;
    private String zz1e;
    private String zz1h;
    private String zz1i;
    private String zz1j;
    private String zz1k;
    private String zz1l;
    private int[] zz1m;
    private int zz1n;
    private int zz1o;
    private int zz1p;
    private int zz1q;
    private String[] zz1r;
    private String zz1s;
    private String zz1t;
    private String zz1u;
    private String zz1v;
    private String zz1w;
    private String zz1y;
    private String zz1z;
    private static final Map<String, zzZPR> zz1M = new ConcurrentHashMap();
    private static final Map<Integer, String> zz0v = new ConcurrentHashMap();
    private int zz1x = -1;
    private int zz1g = -1;
    private int zz1f = -1;
    private int zz12 = -1;
    private int zz0U = -1;
    private int zz0T = -1;
    private int zz0R = -1;
    private int zz0N = -1;
    private int zz0M = -1;
    private int zz0L = -1;
    private int zz0K = -1;
    private int zz0E = -1;

    public static class zzZ {
        private String zz0s;
        private String zz0t;
        private final String zz0u;

        public zzZ(String str) {
            this.zz0u = str;
            if (zzZKN.zzU3(str) || "Invariant".equals(str)) {
                this.zz0t = TranslateLanguage.ENGLISH;
                this.zz0s = AbstractDevicePopManager.CertificateProperties.COUNTRY;
                return;
            }
            String[] strArrSplit = str.split(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            if (strArrSplit.length > 1) {
                this.zz0t = strArrSplit[0];
                this.zz0s = strArrSplit[1];
            } else {
                this.zz0t = strArrSplit[0];
                this.zz0s = "";
            }
        }

        public final boolean zzjW() {
            return (zzZKN.zzU3(this.zz0t) || zzZKN.zzU3(this.zz0s)) ? false : true;
        }
    }

    private void setLocale(String str) {
        zzZ zzz = new zzZ(str);
        this.zz0w = new Locale(zzz.zz0t, zzz.zz0s);
    }

    private static zzZPR zzL(String str, boolean z) {
        zzZPR zzzpr = new zzZPR();
        zzzpr.zz0B = z;
        zzzpr.zz1K = str;
        if (zzZPQ.zzZ(zzzpr)) {
            return zzzpr;
        }
        zzZ zzz = new zzZ(str);
        if (zzZKN.zzU3(zzz.zz0t)) {
            return zzjX();
        }
        zzzpr.zz1K = zzz.zz0t;
        if (zzZPQ.zzZ(zzzpr)) {
            return zzZ(zzzpr, zzz);
        }
        return null;
    }

    public static zzZPR zzM(String str, boolean z) {
        if (zzZKN.zzU3(str)) {
            return zzjX();
        }
        Map<String, zzZPR> map = zz1M;
        zzZPR zzzpr = map.get(str);
        if (zzzpr != null) {
            return zzzpr;
        }
        zzZPR zzzprZzL = zzL(str, z);
        if (zzzprZzL == null) {
            return null;
        }
        map.put(str, zzzprZzL);
        return zzzprZzL;
    }

    private static String zzRb(int i) {
        Map<Integer, String> map = zz0v;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), zzZPQ.zzRb(i));
        }
        return map.get(Integer.valueOf(i));
    }

    private static zzZPR zzjX() {
        if (zz1L == null) {
            zzZPR zzzpr = new zzZPR();
            zzzpr.zz0B = false;
            zzzpr.zz1K = "";
            zzzpr.zz1J = "";
            zzzpr.zz1I = "";
            zzzpr.zz1H = "";
            zzzpr.zz0A = false;
            zzzpr.zz1F = "Invariant Language (Invariant Country)";
            zzzpr.zz1E = "Invariant Language (Invariant Country)";
            zzzpr.zz1G = "Invariant Language (Invariant Country)";
            zzzpr.zz1D = "";
            zzzpr.zz1C = "iv";
            zzzpr.zz1B = "Invariant Language";
            zzzpr.zz1A = "Invariant Language";
            zzzpr.zz1z = "Invariant Language";
            zzzpr.zz1y = "IV";
            zzzpr.zz1x = 244;
            zzzpr.zz1w = "Invariant Country";
            zzzpr.zz1v = "Invariant Country";
            zzzpr.zz1u = "IV";
            zzzpr.zz1t = "+";
            zzzpr.zz1s = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
            zzzpr.zz1r = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            zzzpr.zz1q = 1;
            zzzpr.zz1p = 1;
            zzzpr.zz1o = 2;
            zzzpr.zz1n = 1;
            zzzpr.zz1m = new int[]{3};
            zzzpr.zz1l = ".";
            zzzpr.zz1k = ",";
            zzzpr.zz1j = "NaN";
            zzzpr.zz1i = "Infinity";
            zzzpr.zz1h = "-Infinity";
            zzzpr.zz1g = 0;
            zzzpr.zz1f = 0;
            zzzpr.zz1e = "%";
            zzzpr.zz1d = "\\x2030";
            zzzpr.zz1c = "\\x00a4";
            zzzpr.zz1b = "XDR";
            zzzpr.zz1a = "International Monetary Fund";
            zzzpr.zz19 = "International Monetary Fund";
            zzzpr.zz18 = 2;
            zzzpr.zz17 = 0;
            zzzpr.zz16 = 0;
            zzzpr.zz15 = new int[]{3};
            zzzpr.zz14 = ".";
            zzzpr.zz13 = ",";
            zzzpr.zz12 = 0;
            zzzpr.zz11 = ",";
            zzzpr.zz10 = 1252;
            zzzpr.zz0Z = "AM";
            zzzpr.zz0Y = "PM";
            zzzpr.zz0X = new String[]{"HH:mm:ss"};
            zzzpr.zz0W = new String[]{"HH:mm", "hh:mm tt", "H:mm", "h:mm tt"};
            zzzpr.zz0V = new String[]{"HH:mm:ss"};
            zzzpr.zz0U = 0;
            zzzpr.zz0T = 0;
            zzzpr.zz0S = new int[]{1};
            zzZPT[] zzzptArr = new zzZPT[23];
            zzzpr.zz0z = zzzptArr;
            zzzptArr[0] = zzZPT.zzk9();
            zzzpr.zz0R = 0;
            zzzpr.zz0Q = "";
            zzzpr.zz0P = "";
            zzzpr.zz0O = "Latn;";
            zzzpr.zz0J = 127;
            zzzpr.zz0N = 1252;
            zzzpr.zz0M = 437;
            zzzpr.zz0L = 10000;
            zzzpr.zz0K = 31;
            zzzpr.zz0I = "IVL";
            zzzpr.zz0H = "IVC";
            zzzpr.zz0G = "ivl";
            zzzpr.zz0F = "ivc";
            zzzpr.zz0E = 127;
            zzzpr.zz0D = "";
            zzzpr.zz0C = "0409:00000409";
            zz1L = zzzpr;
        }
        return zz1L;
    }

    public static zzZPR zzy(int i, boolean z) {
        zzZPR zzzprZzM;
        String strZzRb = zzRb(i);
        if (!zzZKN.zzU3(strZzRb)) {
            strZzRb.getClass();
            if (strZzRb.equals("zh-Hans")) {
                strZzRb = "zh-CHS";
            } else if (strZzRb.equals("zh-Hant")) {
                strZzRb = "zh-CHT";
            }
            zzzprZzM = zzM(strZzRb, z);
        } else {
            if (i == 127) {
                return zzjX();
            }
            zzzprZzM = null;
        }
        if (zzzprZzM != null) {
            return zzzprZzM;
        }
        throw new CultureNotFoundException(i);
    }

    public final Locale getLocale() {
        if (this.zz0w == null) {
            setLocale(this.zz1K);
        }
        return this.zz0w;
    }

    public final String getName() {
        return this.zz1I;
    }

    public final void setName(String str) {
        this.zz1I = str;
    }

    public final void zzP(int[] iArr) {
        this.zz0S = iArr;
    }

    public final void zzRc(int i) {
        this.zz10 = i;
    }

    public final void zzRd(int i) {
        this.zz0x = i;
    }

    public final void zzRe(int i) {
        this.zz0J = i;
    }

    public final void zzRf(int i) {
        this.zz0y = i;
    }

    public final int zzTu() {
        return this.zz0J;
    }

    public final void zzVC(String str) {
        this.zz11 = str;
    }

    public final void zzVD(String str) {
        this.zz1C = str;
    }

    public final void zzVE(String str) {
        this.zz0I = str;
    }

    public final void zzVF(String str) {
        this.zz0G = str;
    }

    public final void zzVG(String str) {
        this.zz1E = str;
    }

    public final void zzVH(String str) {
        this.zz1F = str;
    }

    public final void zzVI(String str) {
        this.zz1G = str;
    }

    public final void zzZ(zzZPT zzzpt) {
        zzZPT[] zzzptArr = this.zz0z;
        if (zzzptArr == null || zzzptArr.length == 0) {
            this.zz0z = new zzZPT[1];
        }
        this.zz0z[0] = zzzpt;
    }

    public final void zzZ8(boolean z) {
        this.zz0A = z;
    }

    public final int zzjY() {
        return this.zz10;
    }

    public final String zzjZ() {
        return this.zz11;
    }

    public final zzZPT zzk0() {
        zzZPT[] zzzptArr = this.zz0z;
        return zzzptArr.length > 0 ? zzzptArr[0] : new zzZPT();
    }

    public final String zzk1() {
        return this.zz1G;
    }

    public final String zzk2() {
        String str = this.zz1I;
        if (str != null) {
            str.getClass();
            if (str.equals("zh-CHS") || str.equals("zh-CHT")) {
                return this.zz1I;
            }
        }
        return this.zz1K;
    }

    public final int[] zzk3() {
        return this.zz0S;
    }

    public final zzZPU zzk4() {
        if (this.zz0y == 0) {
            this.zz0y = this.zz0S[0];
        }
        return zzZP1.zzQP(this.zz0y);
    }

    private static zzZPR zzZ(zzZPR zzzpr, zzZ zzz) {
        String str;
        zzzpr.zz1K = zzz.zz0u;
        zzzpr.zz1I = zzz.zz0u;
        zzzpr.zz0J = 4096;
        if (zzz.zzjW()) {
            str = zzZKN.format("Unknown Locale ({0})", zzz.zz0u);
        } else {
            str = zzZKN.format("Unknown Language ({0})", zzz.zz0u);
        }
        zzzpr.zz1G = str;
        zzzpr.zz1F = str;
        zzzpr.zz1E = str;
        return zzzpr;
    }
}
