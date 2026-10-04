package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class zzY4 {
    private boolean zzWA;
    private ArrayList<zzY3> zzWi;
    private boolean zzWj;
    private zzY8[] zzWk;
    private zzHI zzWl;
    private int zzWm;
    private byte zzWn;
    private String zzWp;
    private String zzWq;
    private String zzZi;
    private String zzWo = "";
    private int[] zzWh = {5};
    private int[] zzWg = {10, 11, 12, 13};

    public zzY4(String str, int i, zzHI zzhi) {
        this.zzWq = str;
        this.zzZi = str;
        this.zzWm = i;
        this.zzWl = zzhi;
    }

    private char[] zzG(boolean z) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        this.zzWA = false;
        this.zzWj = false;
        for (int i = 0; i < this.zzZi.length(); i++) {
            int iZzc = zzZVU.zzc(this.zzZi.charAt(i));
            this.zzWA |= iZzc == 2 || iZzc == 6;
            this.zzWj |= iZzc == 8;
            sb2.setLength(0);
            zzZ(z, this.zzZi.charAt(i), sb2);
            for (int i2 = 0; i2 < sb2.length(); i2++) {
                char cCharAt = sb2.charAt(i2);
                int iZza = zzZVU.zza(cCharAt);
                int length = sb.length();
                if (iZza != 0) {
                    while (length > 0 && zzZVU.zza(sb.charAt(length - 1)) > iZza) {
                        length--;
                    }
                }
                if (sb.length() == length) {
                    sb.append(cCharAt);
                } else {
                    sb.insert(length, cCharAt);
                }
            }
        }
        return sb.toString().toCharArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[PHI: r13
      0x00b2: PHI (r13v30 byte) = (r13v29 byte), (r13v35 byte) binds: [B:40:0x00ca, B:34:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzH(boolean z) {
        this.zzWk = new zzY8[this.zzZi.length()];
        byte b = this.zzWn;
        zzD7 zzd7 = new zzD7();
        zzXE zzxe = new zzXE();
        int i = 0;
        int iZzCQ = 0;
        for (int i2 = 0; i2 < this.zzZi.length(); i2++) {
            char cCharAt = this.zzZi.charAt(i2);
            zzY8 zzy8 = new zzY8();
            zzy8.zzq(zzZVU.zzc(cCharAt));
            zzy8.zzX(cCharAt);
            this.zzWk[i2] = zzy8;
            if (cCharAt == 8235 || cCharAt == 8238) {
                int i3 = b & 255;
                zzy8.zzr(i3);
                if (i3 < 60) {
                    zzxe.zzX(b);
                    zzd7.zzVF(iZzCQ);
                    b = (byte) (((byte) (b + 1)) | 1);
                    iZzCQ = cCharAt == 8235 ? 0 : 1;
                }
            } else if (cCharAt == 8234 || cCharAt == 8237) {
                int i4 = b & 255;
                zzy8.zzr(i4);
                if (i4 < 59) {
                    zzxe.zzX(b);
                    zzd7.zzVF(iZzCQ);
                    b = (byte) (((byte) (b | 1)) + 1);
                    if (cCharAt != 8234) {
                        iZzCQ = 2;
                    }
                }
            } else if (cCharAt != 8236 && zzy8.zzXw() != 9) {
                zzy8.zzr(b & 255);
                if (iZzCQ == 2) {
                    zzy8.zzq(0);
                } else if (iZzCQ == 1) {
                    zzy8.zzq(1);
                }
            } else if (cCharAt == 8236) {
                zzy8.zzr(b & 255);
                if (zzxe.getCount() > 0) {
                    b = zzxe.get(zzxe.getCount() - 1);
                    zzxe.removeAt(zzxe.getCount() - 1);
                    iZzCQ = zzd7.zzCQ();
                }
            } else if (zzy8.zzXw() == 9) {
                zzy8.zzr(b & 255);
            }
        }
        int i5 = this.zzWn & 255;
        while (true) {
            int i6 = i;
            if (i6 >= this.zzZi.length()) {
                zzXo();
                return;
            }
            int iZzXx = this.zzWk[i6].zzXx();
            int iZzs = zzs(Math.max(i5, iZzXx));
            i = i6 + 1;
            while (i < this.zzZi.length() && this.zzWk[i].zzXx() == iZzXx) {
                i++;
            }
            int iZzs2 = zzs(Math.max(i < this.zzZi.length() ? this.zzWk[i].zzXx() : this.zzWn & 255, iZzXx));
            zzZ(i6, i, iZzs, iZzs2);
            zzZ(i6, i, iZzs, iZzs2, iZzXx);
            zzZ(i6, i, iZzXx);
            i5 = iZzXx;
        }
    }

    private void zzI(boolean z) {
        this.zzZi = zzZ(zzG(z));
    }

    public static boolean zzJ(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (zzZVU.zzc(str.charAt(i)) == 10) {
                return true;
            }
        }
        return false;
    }

    private void zzXo() {
        zzHI zzhi = this.zzWl;
        if (zzhi != null) {
            zzhi.zzZ(this, this.zzWk);
        }
        StringBuilder sb = new StringBuilder();
        this.zzWi = new ArrayList<>();
        int i = 0;
        int iZzXx = -1;
        while (true) {
            zzY8[] zzy8Arr = this.zzWk;
            if (i >= zzy8Arr.length) {
                this.zzWi.add(new zzY3(sb.toString(), iZzXx));
                return;
            }
            if ("\u200f\u202b\u202e\u200e\u202a\u202d\u202c".indexOf(zzy8Arr[i].getChar()) == -1) {
                if (this.zzWk[i].zzXx() != iZzXx || iZzXx == -1) {
                    if (iZzXx != -1) {
                        this.zzWi.add(new zzY3(sb.toString(), iZzXx));
                    }
                    sb.setLength(0);
                    iZzXx = this.zzWk[i].zzXx();
                }
                sb.append(this.zzWk[i].getChar());
            }
            i++;
        }
    }

    private void zzXp() {
        int i = this.zzWm;
        if (i != -1) {
            this.zzWn = (byte) i;
            return;
        }
        for (int i2 = 0; i2 < this.zzZi.length(); i2++) {
            int iZzc = zzZVU.zzc(this.zzZi.charAt(i2));
            if (iZzc == 1 || iZzc == 2) {
                this.zzWn = (byte) 1;
                return;
            } else {
                if (iZzc == 0) {
                    return;
                }
            }
        }
    }

    private void zzXq() {
        if (this.zzWi.size() <= 1) {
            return;
        }
        ArrayList<zzY3> arrayList = new ArrayList<>(this.zzWi.size());
        boolean zZzXn = this.zzWi.get(0).zzXn();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i <= this.zzWi.size()) {
            boolean zZzXn2 = i < this.zzWi.size() ? this.zzWi.get(i).zzXn() : !zZzXn;
            if (zZzXn2 != zZzXn) {
                for (int i4 = (i2 + i3) - 1; i4 >= i3; i4--) {
                    zzZQG.zzZ(arrayList, this.zzWi.get(i4));
                }
                i2 = 1;
                i3 = i;
                zZzXn = zZzXn2;
            } else {
                i2++;
            }
            i++;
        }
        Collections.reverse(arrayList);
        this.zzWi = arrayList;
    }

    private void zzXr() {
        if (this.zzWi.size() <= 1) {
            return;
        }
        ArrayList<zzY3> arrayList = new ArrayList<>(this.zzWi.size());
        int level = this.zzWi.get(0).getLevel();
        boolean zZzXj = this.zzWi.get(0).zzXj();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i <= this.zzWi.size()) {
            int level2 = i < this.zzWi.size() ? this.zzWi.get(i).getLevel() : -1;
            boolean z = i < this.zzWi.size() && this.zzWi.get(i).zzXj();
            if (level2 != level || z != zZzXj) {
                if (i3 == 1) {
                    arrayList.add(this.zzWi.get(i2));
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = i2; i4 < i2 + i3; i4++) {
                        zzZNH.zzU(sb, this.zzWi.get(i4).getText());
                    }
                    arrayList.add(new zzY3(sb.toString(), level));
                }
                i3 = 0;
                i2 = i;
                level = level2;
                zZzXj = z;
            }
            i3++;
            i++;
        }
        this.zzWi = arrayList;
    }

    private void zzXs() {
        int i = 0;
        while (i < this.zzWi.size()) {
            zzY3 zzy3 = this.zzWi.get(i);
            if (zzy3.zzXl()) {
                int i2 = i + 1;
                int iMax = Math.max(i > 0 ? Math.min(this.zzWi.get(i - 1).getLevel(), zzy3.getLevel()) : -1, i2 < this.zzWi.size() ? Math.min(this.zzWi.get(i2).getLevel(), zzy3.getLevel()) : -1);
                if (iMax >= 0 && iMax != zzy3.getLevel()) {
                    zzY3 zzy32 = new zzY3(zzy3.getText(), iMax);
                    zzy32.zzF(zzy3.zzXl());
                    zzy32.zzE(zzy3.zzXk());
                    this.zzWi.set(i, zzy32);
                }
            }
            i++;
        }
    }

    private void zzXt() {
        for (zzY3 zzy3 : this.zzWi) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < zzy3.getText().length(); i++) {
                char cCharAt = zzy3.getText().charAt(i);
                int iZzc = zzZVU.zzc(cCharAt);
                if (iZzc == 3 || iZzc == 6) {
                    z2 = true;
                } else if (cCharAt == '+' || cCharAt == '-' || cCharAt == '/') {
                    z4 = true;
                } else if (cCharAt != ',' && cCharAt != '.' && cCharAt != ':' && cCharAt != 1548) {
                    z3 = true;
                }
            }
            if (z2 && !z3) {
                z = true;
            }
            zzy3.zzF(z);
            zzy3.zzE(z4);
        }
    }

    private void zzY(int i, int i2, int i3) {
        while (i < i2) {
            this.zzWk[i].zzq(i3);
            i++;
        }
    }

    public static ArrayList<zzY4> zzZ(String str, zzHH zzhh, zzHI zzhi) throws Exception {
        ArrayList<zzY4> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String strZzQ = "";
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (zzZVU.zzc(cCharAt) == 10) {
                strZzQ = zzZKN.zzQ(strZzQ, cCharAt);
                int i2 = i + 1;
                if (i2 < str.length() && str.charAt(i) == '\r' && str.charAt(i2) == '\n') {
                    strZzQ = zzZKN.zzQ(strZzQ, str.charAt(i2));
                    i = i2;
                }
            } else {
                sb.append(cCharAt);
            }
            if (!"".equals(strZzQ) || i + 1 == str.length()) {
                String string = sb.toString();
                zzY4 zzy4 = new zzY4(string, zzhh != null ? zzhh.zzZ(arrayList, string) : -1, zzhi);
                zzy4.zzWo = strZzQ;
                arrayList.add(zzy4);
                sb.setLength(0);
                strZzQ = "";
            }
            i++;
        }
        return arrayList;
    }

    private static int zzs(int i) {
        return (i & 1) == 0 ? 0 : 1;
    }

    public final byte getEmbeddingLevel() {
        return this.zzWn;
    }

    public final ArrayList<zzY3> zzK(boolean z) {
        zzJ(true);
        zzXt();
        zzXs();
        zzXr();
        if (this.zzWi.size() > 1) {
            int level = this.zzWi.get(0).getLevel();
            for (int i = 1; i < this.zzWi.size(); i++) {
                level = Math.min(level, this.zzWi.get(i).getLevel());
            }
            if ((level % 2 == 1) != z) {
                zzXq();
            }
        }
        ArrayList<zzY3> arrayList = this.zzWi;
        this.zzWp = null;
        this.zzWi = null;
        return arrayList;
    }

    public final Collection<zzY3> zzXu() {
        if (this.zzWi == null) {
            zzJ(false);
        }
        return this.zzWi;
    }

    public final String zzXv() {
        return this.zzWo;
    }

    private void zzJ(boolean z) {
        zzI(z);
        zzXp();
        zzH(false);
    }

    private void zzZ(int i, int i2, int i3, int i4) {
        if (this.zzWj) {
            int i5 = i3;
            for (int i6 = i; i6 < i2; i6++) {
                int iZzXw = this.zzWk[i6].zzXw();
                if (iZzXw == 8) {
                    this.zzWk[i6].zzq(i5);
                } else {
                    i5 = iZzXw;
                }
            }
        }
        int i7 = 3;
        for (int i8 = i; i8 < i2; i8++) {
            if (this.zzWk[i8].zzXw() == 0 || this.zzWk[i8].zzXw() == 1) {
                i7 = 3;
            } else if (this.zzWk[i8].zzXw() == 2) {
                i7 = 6;
            } else if (this.zzWk[i8].zzXw() == 3) {
                this.zzWk[i8].zzq(i7);
            }
        }
        if (this.zzWA) {
            for (int i9 = i; i9 < i2; i9++) {
                if (this.zzWk[i9].zzXw() == 2) {
                    this.zzWk[i9].zzq(1);
                }
            }
        }
        for (int i10 = i + 1; i10 < i2 - 1; i10++) {
            if (this.zzWk[i10].zzXw() == 4 || this.zzWk[i10].zzXw() == 7) {
                int iZzXw2 = this.zzWk[i10 - 1].zzXw();
                int iZzXw3 = this.zzWk[i10 + 1].zzXw();
                if (iZzXw2 == 3 && iZzXw3 == 3) {
                    this.zzWk[i10].zzq(3);
                } else if (this.zzWk[i10].zzXw() == 7 && iZzXw2 == 6 && iZzXw3 == 6) {
                    this.zzWk[i10].zzq(6);
                }
            }
        }
        int i11 = i;
        while (i11 < i2) {
            if (this.zzWk[i11].zzXw() == 5) {
                int iZzZ = zzZ(i11, i2, this.zzWh);
                int iZzXw4 = i11 == i ? i3 : this.zzWk[i11 - 1].zzXw();
                if (iZzXw4 != 3) {
                    iZzXw4 = iZzZ == i2 ? i4 : this.zzWk[iZzZ].zzXw();
                }
                if (iZzXw4 == 3) {
                    zzY(i11, iZzZ, 3);
                }
                i11 = iZzZ;
            }
            i11++;
        }
        for (int i12 = i; i12 < i2; i12++) {
            int iZzXw5 = this.zzWk[i12].zzXw();
            if (iZzXw5 == 4 || iZzXw5 == 5 || iZzXw5 == 7) {
                this.zzWk[i12].zzq(13);
            }
        }
        int i13 = i3 == 0 ? 0 : 3;
        while (i < i2) {
            if (this.zzWk[i].zzXw() == 1) {
                i13 = 3;
            } else if (this.zzWk[i].zzXw() == 0) {
                i13 = 0;
            } else if (this.zzWk[i].zzXw() == 3) {
                this.zzWk[i].zzq(i13);
            }
            i++;
        }
    }

    private void zzZ(int i, int i2, int i3, int i4, int i5) {
        int iZzXw;
        int iZzXw2;
        int i6 = i;
        while (i6 < i2) {
            int iZzXw3 = this.zzWk[i6].zzXw();
            if (iZzXw3 == 12 || iZzXw3 == 13 || iZzXw3 == 10 || iZzXw3 == 11) {
                int iZzZ = zzZ(i6, i2, this.zzWg);
                if (i6 == i) {
                    iZzXw = i3;
                } else {
                    iZzXw = this.zzWk[i6 - 1].zzXw();
                    if (iZzXw == 6 || iZzXw == 3) {
                        iZzXw = 1;
                    }
                }
                if (iZzZ == i2) {
                    iZzXw2 = i4;
                } else {
                    iZzXw2 = this.zzWk[iZzZ].zzXw();
                    if (iZzXw2 == 6 || iZzXw2 == 3) {
                        iZzXw2 = 1;
                    }
                }
                if (iZzXw != iZzXw2) {
                    iZzXw = zzs(i5);
                }
                zzY(i6, iZzZ, iZzXw);
                i6 = iZzZ;
            }
            i6++;
        }
    }

    private void zzZ(int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            while (i < i2) {
                int iZzXw = this.zzWk[i].zzXw();
                if (iZzXw == 0 || iZzXw == 6 || iZzXw == 3) {
                    zzY8 zzy8 = this.zzWk[i];
                    zzy8.zzr(zzy8.zzXx() + 1);
                }
                i++;
            }
            return;
        }
        while (i < i2) {
            int iZzXw2 = this.zzWk[i].zzXw();
            if (iZzXw2 == 1) {
                zzY8 zzy82 = this.zzWk[i];
                zzy82.zzr(zzy82.zzXx() + 1);
            } else if (iZzXw2 == 6 || iZzXw2 == 3) {
                zzY8 zzy83 = this.zzWk[i];
                zzy83.zzr(zzy83.zzXx() + 2);
            }
            i++;
        }
    }

    private static String zzZ(char[] cArr) {
        if (cArr.length == 0) {
            return "";
        }
        char[] cArr2 = new char[cArr.length];
        cArr2[0] = cArr[0];
        char c = cArr[0];
        int iZza = zzZVU.zza(c);
        if (iZza != 0) {
            iZza = 256;
        }
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < cArr.length; i3++) {
            char c2 = cArr[i3];
            int iZza2 = zzZVU.zza(c2);
            char cZzX = zzZVU.zzX(c, c2);
            if (zzZVU.zz9(cZzX) == 0 && cZzX != 65535 && (iZza < iZza2 || iZza == 0)) {
                cArr2[i] = cZzX;
                c = cZzX;
            } else {
                if (iZza2 == 0) {
                    i = i2;
                    c = c2;
                }
                cArr2[i2] = c2;
                i2++;
                iZza = iZza2;
            }
        }
        return new String(cArr2, 0, i2);
    }

    private static void zzZ(boolean z, char c, StringBuilder sb) {
        String strZz5 = zzZVU.zz5(c);
        if (strZz5 != null && (!z || zzZVU.zz9(c) == 0)) {
            for (int i = 0; i < strZz5.length(); i++) {
                zzZ(z, strZz5.charAt(i), sb);
            }
            return;
        }
        sb.append(c);
    }

    private int zzZ(int i, int i2, int[] iArr) {
        boolean z;
        int i3 = i - 1;
        do {
            i3++;
            if (i3 >= i2) {
                return i2;
            }
            int iZzXw = this.zzWk[i3].zzXw();
            z = false;
            for (int i4 = 0; i4 < iArr.length && !z; i4++) {
                if (iZzXw == iArr[i4]) {
                    z = true;
                }
            }
        } while (z);
        return i3;
    }
}
