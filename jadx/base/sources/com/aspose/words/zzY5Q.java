package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5Q {
    private boolean zzX3A;
    private boolean zzX3B;
    private boolean zzX3C;
    private boolean zzX3D;
    private boolean zzX3E;
    private boolean zzX3F;
    private boolean zzX3G;
    private zzY5P zzX3H;
    private boolean zzX3x;
    private boolean zzX3y;
    private int zzX3z = 0;
    private int zzY7n = UnicodeScript.UNKNOWN;
    private String zzZi;

    public zzY5Q(String str, zzY5P zzy5p) {
        this.zzZi = str;
        this.zzX3H = zzy5p;
        this.zzX3y = zzy5p.zzX3s;
    }

    private boolean zzN(char c, char c2) {
        return com.aspose.words.internal.zzUX.isLetter(c) == com.aspose.words.internal.zzUX.isLetter(c2) && Character.isDigit(c) == Character.isDigit(c2) && com.aspose.words.internal.zzUX.zzP(c) == com.aspose.words.internal.zzUX.zzP(c2) && !com.aspose.words.internal.zzUX.zzZ(c2, zzZ3X.zzwI(this.zzX3H.zzX3t)) && !com.aspose.words.internal.zzUX.zzZ(c, zzZ3X.zzwI(this.zzX3H.zzX3t));
    }

    private boolean zzXVZ() {
        return this.zzX3H.zzX3u || this.zzX3y;
    }

    private static boolean zzZ(int i, boolean z, int i2, boolean z2) {
        if ((i == i2 && z == z2) || zzY42.zzjm(i2)) {
            return true;
        }
        if (zzY42.zzjm(i) && !zzY42.zzjm(i2)) {
            return false;
        }
        zzY42.zzjm(i);
        return z == z2 && (zzY42.zzjo(i) || zzY42.zzjo(i2));
    }

    private boolean zzjG(int i) {
        int i2 = this.zzX3z;
        return i2 == 0 || i2 == i;
    }

    private void zzjH(int i) {
        this.zzX3z = i;
        this.zzX3G = false;
        this.zzX3F = false;
        this.zzX3E = false;
        this.zzX3D = false;
        this.zzX3C = false;
        this.zzX3B = false;
        this.zzX3x = false;
        this.zzY7n = UnicodeScript.UNKNOWN;
        this.zzX3A = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzjI(int i) {
        boolean z;
        char cCharAt = this.zzZi.charAt(i);
        int script = zzY42.getScript(cCharAt);
        boolean zZz7 = com.aspose.words.internal.zzZVU.zz7(cCharAt);
        boolean zIsLowerCase = this.zzX3H.zzYx2 ? Character.isLowerCase(cCharAt) : false;
        zzY5P zzy5p = this.zzX3H;
        boolean z2 = (zzy5p.zzYx1 || zzy5p.zzYx2) ? !zzWZ.zzZs(this.zzZi.charAt(i)) : false;
        zzY5P zzy5p2 = this.zzX3H;
        boolean zZzP = zzy5p2.zzX3w ? zz0.zzP(zzy5p2.zzX3r.getName(), cCharAt) : false;
        zzY5P zzy5p3 = this.zzX3H;
        boolean z3 = (zzy5p3.zzX3v || zzy5p3.zzX3q) && (zz0.zzZC(cCharAt) || zzYAW.zzXP(cCharAt));
        boolean z4 = !this.zzX3H.zzX3r.getComplexScript() && zzY0C.zzX(cCharAt, this.zzX3H.zzX3r) == 1;
        boolean zZzZx = zz0.zzZx(cCharAt);
        boolean z5 = cCharAt == 0;
        boolean zZzjG = zzjG(1);
        boolean z6 = !zZzjG;
        if (zZzjG && i > 0) {
            char cCharAt2 = this.zzZi.charAt(i - 1);
            if (zIsLowerCase == this.zzX3G && z2 == this.zzX3F && zZzP == this.zzX3E && z4 == this.zzX3D && z5 == this.zzX3x) {
                zzY5P zzy5p4 = this.zzX3H;
                if ((!zzy5p4.zzX3p || zZzZx == this.zzX3C) && ((!zzy5p4.zzX3v || (!z3 && !this.zzX3B)) && ((!zzy5p4.zzX3q || (!z3 && !this.zzX3B)) && ((!zzXVZ() || zzN(cCharAt2, cCharAt)) && zzZ(this.zzY7n, this.zzX3A, script, zZz7))))) {
                    z = false;
                }
                z6 = z;
            } else {
                z = true;
                z6 = z;
            }
        }
        this.zzX3z = 1;
        this.zzX3G = zIsLowerCase;
        this.zzX3F = z2;
        this.zzX3E = zZzP;
        this.zzX3D = z4;
        this.zzX3C = zZzZx;
        this.zzX3B = z3;
        this.zzX3x = z5;
        if (z6 || i == 0) {
            this.zzY7n = script;
            this.zzX3A = zZz7;
            return z6;
        }
        if (zzY42.zzjo(this.zzY7n) && zzY42.zzjn(script)) {
            this.zzY7n = script;
        }
        return z6;
    }

    public final boolean zzXW0() {
        return this.zzX3y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<String> zzYRK() {
        com.aspose.words.internal.zzZYD.zzXk(this.zzZi);
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzZi.length() == 1) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, this.zzZi);
            this.zzX3y |= com.aspose.words.internal.zzZVU.zz7(this.zzZi.charAt(0));
            return arrayList;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzZi.length(); i3++) {
            this.zzX3y |= com.aspose.words.internal.zzZVU.zz7(this.zzZi.charAt(i3));
            i2++;
            if (i2 < 16382) {
                char cCharAt = this.zzZi.charAt(i3);
                if (cCharAt != 2 && cCharAt != 5 && cCharAt != '\n' && cCharAt != 160 && cCharAt != 173 && cCharAt != 1564 && cCharAt != 8197 && cCharAt != 12288 && cCharAt != 65279 && cCharAt != 8194 && cCharAt != 8195 && cCharAt != 8211 && cCharAt != 8212) {
                    switch (cCharAt) {
                        case 30:
                        case 31:
                            break;
                        case ' ':
                            boolean zZzjG = zzjG(2);
                            zzjH(2);
                            if (zZzjG) {
                                break;
                            }
                            break;
                        default:
                            switch (cCharAt) {
                                default:
                                    switch (cCharAt) {
                                        default:
                                            switch (cCharAt) {
                                                case 8294:
                                                case 8295:
                                                case 8296:
                                                case 8297:
                                                    break;
                                                default:
                                                    if (!zzjI(i3)) {
                                                        break;
                                                    }
                                                    break;
                                            }
                                        case 8234:
                                        case 8235:
                                        case 8236:
                                        case 8237:
                                        case 8238:
                                            break;
                                    }
                                case 8203:
                                case 8204:
                                case 8205:
                                case 8206:
                                case 8207:
                                    break;
                            }
                            break;
                    }
                } else {
                    zzjH(3);
                    if (i3 == 0) {
                    }
                }
            } else {
                zzZ(this.zzZi, arrayList, i, i3 - 1);
                i = i3;
                i2 = 0;
            }
        }
        String str = this.zzZi;
        zzZ(str, arrayList, i, str.length() - 1);
        return arrayList;
    }

    private static void zzZ(String str, Collection<String> collection, int i, int i2) {
        int i3 = (i2 - i) + 1;
        if (i != 0 || i3 != str.length()) {
            if (str.charAt(i) == ' ') {
                str = zzY9W.getText(i3);
            } else {
                str = str.substring(i, i3 + i);
            }
        }
        collection.add(str);
    }
}
