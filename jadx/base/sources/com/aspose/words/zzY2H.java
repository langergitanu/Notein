package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2H {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("r", "v", "t");
    private int zzWWC;
    private int zzWWD;
    private boolean zzWWE;
    private int zzWWF;
    private zzYM5[] zzZ3t;
    private zzYM6[] zzZ3u;
    private StringBuilder zzxe = new StringBuilder();
    private ArrayList<zzYM6> zzZ3w = new ArrayList<>();
    private ArrayList<zzYM2> zzZ3v = new ArrayList<>();

    public zzY2H(String str) {
        zzzg(str.toLowerCase());
        this.zzZ3u = new zzYM6[this.zzZ3w.size()];
        for (int i = 0; i < this.zzZ3w.size(); i++) {
            this.zzZ3u[i] = this.zzZ3w.get(i);
        }
        this.zzZ3t = new zzYM5[this.zzZ3v.size() / 2];
        for (int i2 = 0; i2 < this.zzZ3v.size() / 2; i2++) {
            int i3 = i2 * 2;
            this.zzZ3t[i2] = new zzYM5(this.zzZ3v.get(i3), this.zzZ3v.get(i3 + 1));
        }
    }

    private static int zzX(zzYM6 zzym6, int i) {
        if (zzym6.zzYnL() == 3) {
            return 1;
        }
        int iZzYnH = zzym6.zzYnH();
        if (iZzYnH > 0) {
            return i / iZzYnH;
        }
        return 0;
    }

    private void zzXTb() {
        String string = this.zzxe.toString();
        this.zzxe.setLength(0);
        zzYM2 zzym2Zzzc = zzzc(string);
        boolean zZzZP = com.aspose.words.internal.zzAN.zzZP(this.zzWWF);
        if (this.zzWWE) {
            zzym2Zzzc = zZzZP ? new zzYM2(zzym2Zzzc.getValue() + this.zzWWC) : new zzYM2(zzym2Zzzc.getValue() + this.zzWWD);
        } else if (zZzZP) {
            this.zzWWC = zzym2Zzzc.getValue();
        } else {
            this.zzWWD = zzym2Zzzc.getValue();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3v, zzym2Zzzc);
        this.zzWWF++;
    }

    private void zzXTc() {
        if (this.zzZ3w.size() > 0) {
            zzYM6 zzym6 = (zzYM6) C21505OooO0Oo.OooO00o(1, this.zzZ3w);
            ArrayList<zzYM6> arrayList = this.zzZ3w;
            arrayList.set(arrayList.size() - 1, new zzYM6(zzym6.zzYnL(), zzX(zzym6, this.zzWWF / 2)));
        }
        String string = this.zzxe.toString();
        this.zzxe.setLength(0);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ3w, new zzYM6(zzze(string), 0));
        this.zzWWE = zzzd(string);
        this.zzWWF = 0;
    }

    private void zzio(int i) {
        if (i == 2 || i == 3) {
            zzXTb();
            this.zzxe.append('e');
        }
        zzXTc();
    }

    public static zzYM2 zzzc(String str) {
        boolean z;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return new zzYM2();
        }
        if (com.aspose.words.internal.zzZKN.zzS(str, "@", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            str = com.aspose.words.internal.zzZKN.zzU(str, '@');
            z = true;
        } else {
            z = false;
        }
        return new zzYM2(com.aspose.words.internal.zzJB.parseInt(str), z);
    }

    private static boolean zzzd(String str) {
        int iZzTP = zzUR.zzTP(str);
        return iZzTP == 0 || iZzTP == 1 || iZzTP == 2;
    }

    private static int zzze(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 0;
        }
        int i = 1;
        if (iZzTP != 1) {
            i = 2;
            if (iZzTP != 2) {
                return zzY30.zzzm(str);
            }
        }
        return i;
    }

    private static boolean zzzf(String str) {
        return zzze(str) != -1;
    }

    private void zzzg(String str) {
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt) || cCharAt == '-') {
                if (i == 0) {
                    i = 3;
                    this.zzxe.append(cCharAt);
                } else {
                    if (i == 1) {
                        zzXTc();
                        i = 3;
                    }
                    this.zzxe.append(cCharAt);
                }
            } else if (Character.isLowerCase(cCharAt)) {
                if (i == 0) {
                    zzXTb();
                } else if (i != 1) {
                    if (i == 2 || i == 3) {
                        zzXTb();
                    }
                } else if (zzzf(this.zzxe.toString())) {
                    zzXTc();
                }
                this.zzxe.append(cCharAt);
                i = 1;
            } else if (cCharAt == ',') {
                if (i == 1) {
                    zzXTc();
                }
                zzXTb();
                i = 0;
            } else if (cCharAt == '@') {
                if (i == 1) {
                    zzXTc();
                } else if (i == 2 || i == 3) {
                    zzXTb();
                }
                this.zzxe.append(cCharAt);
                i = 2;
            }
        }
        zzio(i);
    }

    public final zzYM5[] zzZAE() {
        return this.zzZ3t;
    }

    public final zzYM6[] zzZAF() {
        return this.zzZ3u;
    }
}
