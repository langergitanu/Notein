package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.net.System.Globalization.CultureInfo;
import com.aspose.words.net.System.Globalization.CultureNotFoundException;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZP1 implements zzZPC, Cloneable {
    private String mName;
    private boolean zz2m;
    private zzZPR zzZYG;
    private zzZP0 zzZYH;
    private volatile zzZP4 zzZYI;
    private zzZPU zzZZw;
    private static final Map<String, zzZP1> zzZYM = new ConcurrentHashMap();
    private static final Map<Integer, zzZP1> zzZYL = new ConcurrentHashMap();
    private static final zzZP1 zzZYK = new zzZP1("");
    private static final zzZP1 zzZYJ = zzj7();

    private zzZP1(String str, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        str = "iw-IL".equals(str) ? "he-IL" : str;
        str = "in-ID".equals(str) ? "id-ID" : str;
        zzZPR zzzprZzM = zzZPR.zzM(str, z);
        this.zzZYG = zzzprZzM;
        if (zzzprZzM == null) {
            throw new CultureNotFoundException(C20593OooO0Oo.OooO0O0("Culture name '", str, "' is not supported"));
        }
        this.mName = zzzprZzM.zzk2();
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static zzZP1 zzN(int i, String str) {
        zzZP1 zzzp1;
        zzZP1 zzzp12;
        if (i == -1) {
            zzzp1 = zzZYM.get(str + "\\xfffdnull");
        } else {
            zzzp1 = i == 0 ? zzZYM.get(str) : i > 0 ? zzZYL.get(Integer.valueOf(i)) : null;
        }
        if (zzzp1 != null) {
            return zzzp1;
        }
        try {
            if (i == -1) {
                zzzp12 = new zzZP1(str, (String) null);
            } else {
                zzzp12 = i == 0 ? new zzZP1(str, false) : new zzZP1(i, false);
            }
            zzzp12.zz2m = true;
            if (i == -1) {
                zzZYM.put(str + "\\xfffdnull", zzzp12);
                return zzzp12;
            }
            String str2 = zzzp12.mName;
            zzZYM.put(str2, zzzp12);
            if ((zzzp12.zzj9().intValue() == 4 && "zh-hans".equals(str2)) || (zzzp12.zzj9().intValue() == 31748 && "zh-hant".equals(str2))) {
                return zzzp12;
            }
            zzZYL.put(zzzp12.zzj9(), zzzp12);
            return zzzp12;
        } catch (Exception e) {
            zzZHV.zzY(e);
            return null;
        }
    }

    private static zzZPU zzQO(int i) {
        switch (i) {
            case 2:
            case 9:
            case 10:
            case 11:
            case 12:
                return new zzZPI(i);
            case 3:
                return new zzZPB();
            case 4:
                return new zzZP6();
            case 5:
                return new zzZP9();
            case 6:
                return new zzZPD();
            case 7:
                return new zzZP3();
            case 8:
                return new zzZPG();
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return new zzZPI();
            case 14:
                return new zzZPA();
            case 15:
                return new zzZPS();
            case 20:
                return new zzZP8();
            case 21:
                return new zzZP5();
            case 22:
                return new zzZP7();
            case 23:
                return new zzZP2();
        }
    }

    public static zzZPU zzQP(int i) {
        return i == 1 ? new zzZPI() : zzQO(i);
    }

    public static zzZP1 zzQQ(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("culture is out or range");
        }
        zzZP1 zzzp1ZzN = zzN(i, null);
        if (zzzp1ZzN != null) {
            return zzzp1ZzN;
        }
        throw new CultureNotFoundException(o0Oo0oo.OooO0O0(i, "cultureID '", "' not supported"));
    }

    public static CultureInfo zzT(zzZP1 zzzp1) {
        return new CultureInfo(zzzp1);
    }

    public static zzZP1 zzVq(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name");
        }
        zzZP1 zzzp1ZzN = zzN(0, str);
        if (zzzp1ZzN != null) {
            return zzzp1ZzN;
        }
        throw new CultureNotFoundException(str);
    }

    private static zzZP1 zzVr(String str) {
        try {
            return new zzZP1(str);
        } catch (Exception e) {
            zzZHV.zzY(e);
            return null;
        }
    }

    private static String zzX(Locale locale) {
        if (locale == null) {
            return null;
        }
        String country = locale.getCountry();
        return locale.getLanguage() + (zzZKN.zzU3(country) ? "" : com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, country));
    }

    public static zzZP1 zzZ(CultureInfo cultureInfo) {
        if (cultureInfo == null) {
            return null;
        }
        return cultureInfo.getMsCultureInfo();
    }

    private static String zzj6() {
        Locale locale = Locale.getDefault();
        return locale.getLanguage() + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + locale.getCountry();
    }

    private static zzZP1 zzj7() {
        String strZzj6 = zzj6();
        return (strZzj6 == null && (strZzj6 = zzj6()) == null) ? zzZYK : zzVr(strZzj6);
    }

    public static zzZP1 zzj8() {
        return zzZYK;
    }

    public static zzZP1 zzpZ() {
        return zzZNG.zzpZ();
    }

    private void zzx(int i, boolean z) {
        if (i == 0 || i == 1024 || i == 2048 || i == 3072 || i == 4096) {
            throw new CultureNotFoundException(i);
        }
        this.zzZYG = zzZPR.zzy(i, z);
    }

    public final String getDisplayName() {
        return this.zzZYG.zzk1();
    }

    public final Locale getLocale() {
        return this.zzZYG.getLocale();
    }

    public final String getName() {
        return this.zzZYG.getName();
    }

    public final String toString() {
        return this.zzZYG.zzk2();
    }

    public final void zzV(zzZP0 zzzp0) {
        this.zzZYH = zzzp0;
    }

    public final zzZP1 zzj4() {
        zzZP1 zzzp1 = (zzZP1) memberwiseClone();
        if (this.zzZYH == null) {
            this.zzZYH = new zzZP0(this.zzZYG, zzjs());
        }
        zzzp1.zzZYH = this.zzZYH.zziF();
        return zzzp1;
    }

    public final zzZP4 zzj5() {
        if (this.zzZYI == null) {
            this.zzZYI = new zzZP4(this.zzZYG);
        }
        return this.zzZYI;
    }

    public final Integer zzj9() {
        return Integer.valueOf(this.zzZYG.zzTu());
    }

    public final zzZPU[] zzja() {
        int[] iArrZzk3 = this.zzZYG.zzk3();
        int length = iArrZzk3.length;
        zzZPU[] zzzpuArr = new zzZPU[length];
        for (int i = 0; i < length; i++) {
            zzzpuArr[i] = zzQP(iArrZzk3[i]);
        }
        return zzzpuArr;
    }

    public final zzZPR zzjb() {
        return this.zzZYG;
    }

    public final zzZP0 zzjc() {
        if (this.zzZYH == null) {
            this.zzZYH = new zzZP0(this.zzZYG, zzjs());
        }
        return this.zzZYH;
    }

    public final zzZPU zzjs() {
        if (this.zzZZw == null) {
            this.zzZZw = this.zzZYG.zzk4();
        }
        return this.zzZZw;
    }

    public zzZP1(int i) {
        this(i, true);
    }

    public zzZP1(int i, boolean z) {
        if (i >= 0) {
            zzx(i, z);
            this.mName = this.zzZYG.zzk2();
            return;
        }
        throw new IllegalArgumentException("culture id is out of range");
    }

    public zzZP1(Locale locale) {
        this(zzX(locale));
    }

    public zzZP1(String str) {
        this(str, true);
    }

    private zzZP1(String str, String str2) {
        if (str != null) {
            zzZPR zzzprZzM = zzZPR.zzM(str, false);
            this.zzZYG = zzzprZzM;
            if (zzzprZzM != null) {
                this.mName = zzzprZzM.zzk2();
                this.zzZYI = zzVq(null).zzj5();
                return;
            }
            throw new CultureNotFoundException(str);
        }
        throw new IllegalArgumentException("cultureName cannot be null");
    }
}
