package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGP {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private int zzPm;
    private String zzYp7;
    private String zzYp8;
    private String zzYp9;
    private int zzYpa;
    private String zzYpb;
    private boolean zzYpc;
    private static ArrayList<zzZGP> zzYoX = new ArrayList<>();
    private static zzZGP zzYp6 = zzZ("circle", "circle", 1, "o", "Courier New");
    private static zzZGP zzYp5 = zzZ("disc", "disc", 0, "\uf0b7", "Symbol");
    private static zzZGP zzYp4 = zzZ("square", "square", 2, "\uf0a7", "Wingdings");
    private static zzZGP zzYp3 = zzV("decimal", "1", 6, 0);
    private static zzZGP zzYp2 = zzV("decimal-leading-zero", "1", 6, 22);
    private static zzZGP zzYp1 = zzV("lower-latin", "a", 11, 4);
    private static zzZGP zzYoZ = zzV("upper-latin", C18385v2.f56336h, 9, 3);
    private static zzZGP zzYp0 = zzV("lower-roman", ContextChain.TAG_INFRA, 12, 2);
    private static zzZGP zzYoY = zzV("upper-roman", "I", 8, 1);

    static {
        zzV("lower-alpha", "a", 11, 4);
        zzV("upper-alpha", C18385v2.f56336h, 9, 3);
        zzV("lower-greek", "", 11, 4);
        zzV("upper-greek", "", 9, 3);
        zzUR = new com.aspose.words.internal.zzZHW("ol", "ul", "\uf0b7", "o", "\uf0a7");
    }

    private zzZGP(String str, boolean z, String str2, int i, int i2, String str3, String str4) {
        this.zzYp9 = str;
        this.zzYpc = z;
        this.zzYpb = str2;
        this.zzYpa = i;
        this.zzPm = i2;
        this.zzYp8 = str3;
        this.zzYp7 = str4;
    }

    public static zzZGP zzKz(String str) {
        for (zzZGP zzzgp : zzYoX) {
            if (com.aspose.words.internal.zzZYD.zzi(zzzgp.zzYp9, str)) {
                return zzzgp;
            }
        }
        return null;
    }

    private static zzZGP zzV(String str, String str2, int i, int i2) {
        zzZGP zzzgp = new zzZGP(str, false, str2, i, i2, "", "");
        com.aspose.words.internal.zzZQG.zzZ(zzYoX, zzzgp);
        return zzzgp;
    }

    private static zzZGP zzX(ListLevel listLevel) {
        int iZzTP = zzUR.zzTP(listLevel.getNumberFormat());
        if (iZzTP == 2) {
            return zzYp5;
        }
        if (iZzTP == 3) {
            return zzYp6;
        }
        if (iZzTP == 4) {
            return zzYp4;
        }
        if (listLevel.getNumberStyle() == 23 || listLevel.getNumberStyle() == 255) {
            return zzzn(listLevel.zzYOa());
        }
        return null;
    }

    public static zzZGP zzY(ListLevel listLevel) {
        zzZGP zzzgpZzX = zzX(listLevel);
        if (zzzgpZzX != null) {
            return zzzgpZzX;
        }
        int numberStyle = listLevel.getNumberStyle();
        if (numberStyle == 22) {
            return zzYp2;
        }
        switch (numberStyle) {
            case 0:
            case 5:
            case 6:
            case 7:
                return zzYp3;
            case 1:
                return zzYoY;
            case 2:
                return zzYp0;
            case 3:
                return zzYoZ;
            case 4:
                return zzYp1;
            default:
                return zzYp3;
        }
    }

    private static zzZGP zzZ(String str, String str2, int i, String str3, String str4) {
        zzZGP zzzgp = new zzZGP(str, true, str2, i, 23, str3, str4);
        com.aspose.words.internal.zzZQG.zzZ(zzYoX, zzzgp);
        return zzzgp;
    }

    public static zzZGP zzZK(String str, int i) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return zzYp3;
        }
        if (iZzTP != 1) {
            return null;
        }
        return zzzn(i);
    }

    private static zzZGP zzzn(int i) {
        int i2 = i % 3;
        if (i2 == 0) {
            return zzYp5;
        }
        if (i2 == 1) {
            return zzYp6;
        }
        if (i2 != 2) {
            return null;
        }
        return zzYp4;
    }

    public final int getNumberStyle() {
        return this.zzPm;
    }

    public final String zzZ1h() {
        return this.zzYp7;
    }

    public final String zzZ1i() {
        return this.zzYp8;
    }

    public final int zzZ1j() {
        return this.zzYpa;
    }

    public final String zzZ1k() {
        return this.zzYpb;
    }

    public final String zzZ1l() {
        return this.zzYp9;
    }

    public final boolean zzZ1m() {
        return this.zzYpc;
    }
}
