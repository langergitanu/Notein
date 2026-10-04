package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5O {
    private static com.aspose.words.internal.zzH zzX3o = new com.aspose.words.internal.zzH();
    private com.aspose.words.internal.zzGQ zzFh;
    private com.aspose.words.internal.zzPM zzYX;
    private com.aspose.words.internal.zzPY zzYr;
    private com.aspose.words.internal.zzOU zzYs;

    public zzY5O(com.aspose.words.internal.zzPM zzpm, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy, com.aspose.words.internal.zzGQ zzgq) {
        this.zzYX = zzpm;
        this.zzFh = zzgq;
        zzY(zzou, zzpy);
    }

    private static boolean zzXJ(char c) {
        int type;
        if (c != 182 && c != 8729 && (type = Character.getType(c)) != 0 && type != 27 && type != 18 && type != 19) {
            switch (type) {
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    private void zzY(com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy) {
        this.zzYs = zzou;
        this.zzYr = zzpy;
    }

    private static int zzZW(int i, int i2, int i3) {
        if (i3 != 5) {
            i2 = 0;
        }
        return (i3 == 4 || (i3 == 5 && i2 == 0)) ? i - 1 : i2;
    }

    private static com.aspose.words.internal.zzP9 zzo(com.aspose.words.internal.zzZG zzzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzX3o.zzZ((com.aspose.words.internal.zzZL) zzzg);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((-zzzq4ZzZ.getWidth()) / 2.0f, (-zzzq4ZzZ.getHeight()) / 2.0f, 1);
        zzp9.zzZ(new com.aspose.words.internal.zzP9(1.0f, 0.0f, -0.34906584f, 1.0f, 0.0f, 0.0f), 1);
        zzp9.zzY(zzzq4ZzZ.getWidth() / 2.0f, zzzq4ZzZ.getHeight() / 2.0f, 1);
        return zzp9;
    }

    public final com.aspose.words.internal.zzZG[] zzT(String str, long j) throws Exception {
        return zzZ(str, j, 1.0f, 2, 0.0f, 0.0f, false, true, false);
    }

    public final com.aspose.words.internal.zzZG[] zzZ(String str, long j, float f, int i, float f2, float f3, boolean z, boolean z2, boolean z3) throws Exception {
        int i2;
        float f4;
        int i3;
        com.aspose.words.internal.zzUW zzuw;
        float f5;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        int length = str.length() - str.replace(" ", "").length();
        int iZzZW = zzZW(str.length(), length, i);
        float f6 = iZzZW > 0 ? (f3 - f2) / iZzZW : 0.0f;
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzYB zzyb = new com.aspose.words.internal.zzYB(str, this.zzYX);
        boolean z4 = true;
        int i4 = 1;
        while (zzyb.moveNext()) {
            com.aspose.words.internal.zzPM zzpm = this.zzYX;
            if (zzyb.zzr6()) {
                com.aspose.words.internal.zzZXH zzzxhZzZ = this.zzFh.zzZ(this.zzYX.zzPl(), zzyb.getText().charAt(0), z4);
                zzpm = zzzxhZzZ != null ? new com.aspose.words.internal.zzPM(this.zzYX.zzPg(), this.zzYX.zzPk(), zzzxhZzZ) : this.zzYX;
            }
            com.aspose.words.internal.zzUW zzuw2 = new com.aspose.words.internal.zzUW(zzpm, zzyb.getText(), z2, z);
            float f7 = (f - 1.0f) * 15.0f;
            int i5 = 0;
            while (i5 < zzyb.getText().length()) {
                char cCharAt = zzyb.getText().charAt(i5);
                float fZzY7 = zzpm.zzY7(cCharAt);
                if (zzXJ(cCharAt)) {
                    i2 = i5;
                    i3 = length;
                    com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzuw2.zzZ9(cCharAt));
                    com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
                    if (z3) {
                        zzuw = zzuw2;
                        f4 = fZzY7;
                        f5 = f6;
                        zzp9.zzY((-fZzY7) * 0.5f, (-zzpm.zzPg()) * 0.5f, 1);
                        zzp9.zzX(-90.0f, 1);
                        zzp9.zzY(f4 * 0.5f, zzpm.zzPg() * 0.5f, 1);
                    } else {
                        f4 = fZzY7;
                        zzuw = zzuw2;
                        f5 = f6;
                    }
                    zzp9.zzY(OooOO0.OooO0O0.OooO00o(f7, i4 - 1, fIntBitsToFloat, z3 ? (zzpm.zzPg() - f4) * 0.5f : 0.0f), com.aspose.words.internal.zzZPY.zzYC(j) + (zzpm.zzPg() - zzpm.getDescentPoints()), 1);
                    if (zzpm.zzPi()) {
                        zzp9.zzZ(zzo(zzzg), 0);
                    }
                    zzzg.zzY(zzp9);
                    zzzg.zzX(this.zzYs);
                    zzzg.zzY(this.zzYr);
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzg);
                } else {
                    i2 = i5;
                    f4 = fZzY7;
                    i3 = length;
                    zzuw = zzuw2;
                    f5 = f6;
                }
                i4++;
                fIntBitsToFloat += z3 ? zzpm.zzPg() : f4;
                if ((i == 5 && (i3 == 0 || cCharAt == ' ')) || i == 4) {
                    fIntBitsToFloat += f5;
                }
                i5 = i2 + 1;
                zzuw2 = zzuw;
                length = i3;
                f6 = f5;
            }
            z4 = true;
        }
        return (com.aspose.words.internal.zzZG[]) arrayList.toArray(new com.aspose.words.internal.zzZG[0]);
    }
}
