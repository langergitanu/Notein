package com.aspose.words.internal;

import java.text.DecimalFormatSymbols;

/* JADX INFO: loaded from: classes5.dex */
final class zzZQA {
    private boolean zznt = false;
    private int zzns = 0;
    private int zznq = -1;
    private int zznp = 0;
    private int zzno = 0;
    private int zznm = 0;
    private int zznl = 0;
    private boolean zz3b = false;
    private int zz3a = 0;
    private int zz39 = 0;
    private boolean zz38 = true;
    private int zznk = 0;
    private int zznj = 0;
    private int zzni = 0;

    public static void zzZ(String str, boolean[] zArr, boolean z, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[3];
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '\"' || cCharAt == '\'') {
                if (i3 == 0 || str.charAt(i3 - 1) != '\\') {
                    z2 = !z2;
                }
            } else if (cCharAt == ';' && !z2 && (i3 == 0 || str.charAt(i3 - 1) != '\\')) {
                int i4 = i + 1;
                iArr3[i] = i3 - i2;
                i2 = i3 + 1;
                i = i4;
                if (i4 == 3) {
                    break;
                }
            }
        }
        if (i == 0) {
            iArr[0] = 0;
            iArr2[0] = str.length();
            return;
        }
        if (i == 1) {
            if (zArr[0] || z) {
                iArr[0] = 0;
                iArr2[0] = iArr3[0];
                return;
            } else if (iArr3[0] + 1 >= str.length()) {
                iArr[0] = 0;
                iArr2[0] = iArr3[0];
                return;
            } else {
                zArr[0] = true;
                iArr[0] = iArr3[0] + 1;
                iArr2[0] = str.length() - iArr[0];
                return;
            }
        }
        if (i == 2) {
            if (z) {
                iArr[0] = iArr3[0] + iArr3[1] + 2;
                iArr2[0] = str.length() - iArr[0];
                return;
            }
            if (zArr[0]) {
                iArr[0] = 0;
                iArr2[0] = iArr3[0];
                return;
            }
            int i5 = iArr3[1];
            if (i5 <= 0) {
                iArr[0] = 0;
                iArr2[0] = iArr3[0];
                return;
            } else {
                zArr[0] = true;
                iArr[0] = iArr3[0] + 1;
                iArr2[0] = i5;
                return;
            }
        }
        if (i != 3) {
            throw new IllegalArgumentException();
        }
        if (z) {
            iArr[0] = iArr3[0] + iArr3[1] + 2;
            iArr2[0] = iArr3[2];
            return;
        }
        if (zArr[0]) {
            iArr[0] = 0;
            iArr2[0] = iArr3[0];
            return;
        }
        int i6 = iArr3[1];
        if (i6 <= 0) {
            iArr[0] = 0;
            iArr2[0] = iArr3[0];
        } else {
            zArr[0] = true;
            iArr[0] = iArr3[0] + 1;
            iArr2[0] = i6;
        }
    }

    public final int zzkW() {
        return this.zzni;
    }

    public final int zzkX() {
        return this.zznj;
    }

    public final int zzkY() {
        return this.zznk;
    }

    public final boolean zzkZ() {
        return this.zz38;
    }

    public final int zzl0() {
        return this.zz39;
    }

    public final int zzl1() {
        return this.zz3a;
    }

    public final boolean zzl2() {
        return this.zz3b;
    }

    public final int zzl3() {
        return this.zznm;
    }

    public final int zzl4() {
        return this.zznp;
    }

    public final int zzxG() {
        return this.zzns;
    }

    public final int zzxH() {
        return this.zzno;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZQA zzZ(String str, int i, int i2) {
        zzZQA zzzqa = new zzZQA();
        int i3 = i;
        boolean z = true;
        boolean z2 = true;
        char c = 0;
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = false;
        while (i3 - i < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == c && cCharAt != 0) {
                c = 0;
            } else if (c == 0) {
                if (!z3 || cCharAt == 0 || cCharAt == '0' || cCharAt == '#') {
                    char c2 = '\"';
                    if (cCharAt != '\"') {
                        if (cCharAt != '#') {
                            if (cCharAt == '%') {
                                zzzqa.zznj++;
                            } else if (cCharAt == '\'') {
                                c2 = '\"';
                                if (cCharAt != c2) {
                                    c = cCharAt;
                                }
                            } else if (cCharAt != ',') {
                                if (cCharAt == '.') {
                                    if (zzzqa.zznq == -1) {
                                        zzzqa.zznq = i3;
                                    }
                                    z4 = true;
                                    z3 = false;
                                    z = false;
                                } else if (cCharAt != '0') {
                                    if (cCharAt == 'E') {
                                        if (!zzzqa.zz3b) {
                                            zzzqa.zz3b = true;
                                            int i5 = i3 + 1;
                                            if (i5 - i >= i2) {
                                                z3 = true;
                                                z = false;
                                                z4 = false;
                                            } else {
                                                char cCharAt2 = str.charAt(i5);
                                                if (cCharAt2 == '+') {
                                                    zzzqa.zz38 = false;
                                                }
                                                if (cCharAt2 == '+' || cCharAt2 == '-') {
                                                    i3 = i5;
                                                    z3 = true;
                                                    z = false;
                                                    z4 = false;
                                                } else if (cCharAt2 == '0' || cCharAt2 == '#') {
                                                    z = false;
                                                    z3 = true;
                                                    z4 = false;
                                                } else {
                                                    zzzqa.zz3b = false;
                                                    if (zzzqa.zznq < 0) {
                                                        z = true;
                                                    }
                                                    z3 = true;
                                                    z4 = false;
                                                }
                                            }
                                        }
                                    } else if (cCharAt == '\\') {
                                        i3++;
                                    } else if (cCharAt != 'e') {
                                        if (cCharAt == 8240) {
                                            zzzqa.zzni++;
                                        }
                                    }
                                }
                            } else if (z && zzzqa.zzno > 0) {
                                i4++;
                            }
                        } else if (z2 && z) {
                            zzzqa.zznm++;
                        } else if (z4) {
                            zzzqa.zznp++;
                        } else if (z3) {
                            zzzqa.zz39++;
                        }
                        if (cCharAt != '#') {
                            if (z4) {
                                zzzqa.zznp = 0;
                            } else if (z3) {
                                zzzqa.zz39 = 0;
                            }
                            z2 = false;
                        }
                        if (zzzqa.zznl == -1) {
                            zzzqa.zznl = i3;
                        }
                        if (z) {
                            zzzqa.zzno++;
                            if (i4 > 0) {
                                zzzqa.zznt = true;
                            }
                            i4 = 0;
                        } else if (z4) {
                            zzzqa.zzns++;
                        } else if (z3) {
                            zzzqa.zz3a++;
                        }
                    } else if (cCharAt != c2 || cCharAt == '\'') {
                        c = cCharAt;
                    }
                } else {
                    z = zzzqa.zznq < 0;
                    z4 = !z;
                    i3--;
                    z3 = false;
                }
            }
            i3++;
        }
        if (zzzqa.zz3a == 0) {
            zzzqa.zz3b = false;
        } else {
            zzzqa.zznm = 0;
        }
        if (zzzqa.zzns == 0) {
            zzzqa.zznq = -1;
        }
        zzzqa.zznk = (i4 * 3) + zzzqa.zznk;
        return zzzqa;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[PHI: r9
      0x004b: PHI (r9v23 int) = (r9v20 int), (r9v21 int) binds: [B:21:0x0049, B:24:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzZ(String str, int i, int i2, DecimalFormatSymbols decimalFormatSymbols, boolean z, StringBuilder sb, StringBuilder sb2, StringBuilder sb3) {
        int length;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = {3};
        String string = Character.toString(decimalFormatSymbols.getGroupingSeparator());
        if (this.zznt) {
            length = sb.length();
            int i10 = 0;
            for (int i11 = 0; i11 <= 0; i11++) {
                i10 = iArr2[0];
            }
            int i12 = iArr2[0];
            int i13 = length > i10 ? length - i10 : 0;
            if (i12 == 0) {
                i3 = 0;
                while (i3 >= 0 && iArr2[i3] == 0) {
                    i3--;
                }
                i5 = i13 > 0 ? i13 : iArr2[i3];
            } else {
                i5 = i12;
                i3 = 0;
            }
            if (i13 == 0) {
                i4 = i5;
            } else {
                i3 += i13 / i5;
                int i14 = i13 % i5;
                if (i14 != 0) {
                    i3++;
                    int i15 = i5;
                    i5 = i14;
                    i4 = i15;
                }
            }
        } else {
            this.zznt = false;
            length = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i16 = i;
        int i17 = 0;
        char c = 0;
        boolean z2 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = i5;
        boolean z3 = true;
        int i21 = i4;
        int i22 = i3;
        int i23 = length;
        StringBuilder sb5 = sb3;
        while (i16 - i < i9) {
            char cCharAt = str.charAt(i16);
            if (cCharAt != c || cCharAt == 0) {
                if (c != 0) {
                    sb4.append(cCharAt);
                    iArr = iArr2;
                    i6 = i23;
                } else {
                    iArr = iArr2;
                    if (cCharAt != '\"') {
                        i6 = i23;
                        if (cCharAt == '#') {
                            i7 = i22;
                            if (z3) {
                                i18++;
                                if (this.zzno - i18 < sb.length() + i19 || cCharAt == '0') {
                                    int i24 = i19;
                                    i23 = i6;
                                    i22 = i7;
                                    while ((this.zzno - i18) + i24 < sb.length()) {
                                        int i25 = i24 + 1;
                                        sb4.append(sb.charAt(i24));
                                        if (this.zznt && i23 - 1 > 0 && i20 - 1 == 0) {
                                            sb4.append(string);
                                            i22--;
                                            i20 = (i22 > 0 || i22 < 0) ? i21 : iArr[i22];
                                            i21 = i20;
                                        }
                                        i24 = i25;
                                    }
                                    i19 = i24;
                                }
                            } else {
                                if (z2) {
                                    if (i17 < sb2.length()) {
                                        sb4.append(sb2.charAt(i17));
                                        i17++;
                                    }
                                } else {
                                    sb4.append(cCharAt);
                                }
                                i23 = i6;
                                i22 = i7;
                            }
                            i23 = i6;
                            i22 = i7;
                        } else {
                            if (cCharAt == '%') {
                                i7 = i22;
                                sb4.append(decimalFormatSymbols.getPercent());
                            } else if (cCharAt == '\'') {
                                i7 = i22;
                            } else if (cCharAt != ',') {
                                if (cCharAt == '.') {
                                    int i26 = i22;
                                    if (this.zznq == i16) {
                                        if (this.zzns > 0) {
                                            while (true) {
                                                i8 = i19;
                                                if (i8 >= sb.length()) {
                                                    break;
                                                }
                                                i19 = i8 + 1;
                                                sb4.append(sb.charAt(i8));
                                            }
                                            i19 = i8;
                                        }
                                        if (sb2.length() > 0) {
                                            sb4.append(decimalFormatSymbols.getDecimalSeparator());
                                        }
                                    }
                                    z2 = true;
                                    i23 = i6;
                                    i22 = i26;
                                    z3 = false;
                                } else if (cCharAt != '0') {
                                    if (cCharAt == 'E') {
                                        if (sb5 != null && this.zz3b) {
                                            int i27 = i16 + 1;
                                            int i28 = i27;
                                            i7 = i22;
                                            boolean z4 = false;
                                            while (i28 - i < i9) {
                                                if (str.charAt(i28) == '0') {
                                                    z4 = true;
                                                } else if (i28 != i27 || (str.charAt(i28) != '+' && str.charAt(i28) != '-')) {
                                                    if (!z4) {
                                                        sb4.append(cCharAt);
                                                    }
                                                    i16 = i28 - 1;
                                                    z3 = this.zznq >= 0;
                                                    z2 = !z3;
                                                    sb4.append(cCharAt);
                                                    sb4.append((CharSequence) sb5);
                                                    sb5 = null;
                                                    i23 = i6;
                                                    i22 = i7;
                                                }
                                                i28++;
                                                i9 = i2;
                                            }
                                            i16 = i28 - 1;
                                            if (this.zznq >= 0) {
                                            }
                                            z2 = !z3;
                                            sb4.append(cCharAt);
                                            sb4.append((CharSequence) sb5);
                                            sb5 = null;
                                            i23 = i6;
                                            i22 = i7;
                                        } else {
                                            i7 = i22;
                                            sb4.append(cCharAt);
                                        }
                                    } else if (cCharAt != '\\') {
                                        if (cCharAt != 'e') {
                                            if (cCharAt != 8240) {
                                                sb4.append(cCharAt);
                                            } else {
                                                sb4.append(decimalFormatSymbols.getPerMill());
                                            }
                                            i7 = i22;
                                        }
                                        i23 = i6;
                                        i22 = i7;
                                    } else {
                                        i16++;
                                        if (i16 - i < i9) {
                                            sb4.append(str.charAt(i16));
                                        }
                                        i23 = i6;
                                    }
                                }
                            }
                            i23 = i6;
                            i22 = i7;
                        }
                    } else {
                        i6 = i23;
                        i7 = i22;
                    }
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        c = cCharAt;
                    }
                    i23 = i6;
                    i22 = i7;
                }
                i7 = i22;
                i23 = i6;
                i22 = i7;
            } else {
                iArr = iArr2;
                c = 0;
            }
            i16++;
            i9 = i2;
            iArr2 = iArr;
        }
        if (!z) {
            sb4.insert(0, decimalFormatSymbols.getMinusSign());
        }
        return sb4.toString();
    }
}
