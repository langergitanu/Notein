package com.aspose.words.internal;

import com.aspose.words.C22241OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDE extends zzDQ {
    private float[] zzuZ;
    private int[] zzv0;
    private static char[] zzv2 = {'!', '\'', '\"'};
    private static char[] zzv1 = {'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    private zzDE(zzDO zzdo) {
        super(zzdo);
    }

    private zzDL zzCU() {
        zzE2 zze2 = zzD8().zzD7().get(zzDP.zzY(zzD9(), "contextRef"));
        zzED zzed = zzD8().zzD5().get(zzDP.zzY(zzD9(), "brushRef"));
        String string = zzD9().readString();
        zzDL zzdl = new zzDL(zze2, zzed, zzYE(string));
        zzZ(zzdl, string);
        return zzdl;
    }

    public static zzDL zzT(zzDO zzdo) {
        return new zzDE(zzdo).zzCU();
    }

    private void zzW(zzDL zzdl) {
        int size = zzdl.zzD4().zzDv().zzDg().zzDu().size();
        this.zzv0 = new int[size];
        this.zzuZ = new float[size];
        for (int i = 0; i < size; i++) {
            this.zzv0[i] = 2;
            this.zzuZ[i] = 0.0f;
        }
    }

    private static int zzYE(String str) {
        if (zzZKN.zzU3(str)) {
            return 0;
        }
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ',') {
                i++;
            }
        }
        return i;
    }

    private void zzZ(zzDL zzdl, String str) {
        if (zzZKN.zzU3(str)) {
            return;
        }
        zzW(zzdl);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < str.length()) {
            if (i2 >= str.length() || str.charAt(i2) == ',') {
                zzZ(zzdl, C22241OooO0Oo.OooO00o(i2, i, i, i, str), i3);
                i = i2 + 1;
                i3++;
            }
            i2++;
        }
    }

    private static boolean zzy(char c) {
        return (Character.isDigit(c) || c == '.' || c == 'E' || c == 'e') ? false : true;
    }

    private void zzZ(zzDL zzdl, String str, int i) {
        zzDL zzdl2;
        String str2;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < str.length()) {
            if (i4 >= str.length() || (i4 > i3 && Character.isDigit(str.charAt(i4 - 1)) && zzy(str.charAt(i4)))) {
                zzdl2 = zzdl;
                str2 = str;
                i2 = i;
                zzZ(str2, i3, i4, i2, i5, zzdl2);
                i5++;
                i3 = i4;
            } else {
                zzdl2 = zzdl;
                str2 = str;
                i2 = i;
            }
            i4++;
            str = str2;
            i = i2;
            zzdl = zzdl2;
        }
    }

    private void zzZ(String str, int i, int i2, int i3, int i4, zzDL zzdl) {
        String strZzTX = zzZKN.zzTX(str.substring(i, (i2 - i) + i));
        float fZzZr = 0.0f;
        boolean z = false;
        for (int i5 = 0; i5 < strZzTX.length() && !z; i5++) {
            char cCharAt = strZzTX.charAt(i5);
            char lowerCase = Character.toLowerCase(cCharAt);
            if (lowerCase == '!') {
                this.zzv0[i4] = 2;
            } else if (lowerCase == '\"') {
                this.zzv0[i4] = 1;
            } else if (lowerCase != '\'') {
                if (lowerCase == '*') {
                    zzZ(i3, i4, zzdl, fZzZr);
                } else if (lowerCase == 'f') {
                    ((zzE5) zzdl.zzD1()[i4]).set(i3, false);
                } else if (lowerCase != 't') {
                    if (Character.isDigit(cCharAt) || cCharAt == '-') {
                        fZzZr = zzJB.zzZr(strZzTX.substring(i5));
                        zzZ(i3, i4, zzdl, fZzZr);
                    }
                } else {
                    ((zzE5) zzdl.zzD1()[i4]).set(i3, true);
                }
                z = true;
            } else {
                this.zzv0[i4] = 0;
            }
        }
    }

    private void zzZ(int i, int i2, zzDL zzdl, float f) {
        zzE4 zze4 = (zzE4) zzdl.zzD1()[i2];
        int i3 = this.zzv0[i2];
        if (i3 == 0) {
            this.zzuZ[i2] = f;
            zze4.zzX(i, zze4.get(i - 1) + this.zzuZ[i2]);
        } else if (i3 == 1) {
            float[] fArr = this.zzuZ;
            fArr[i2] = fArr[i2] + f;
            zze4.zzX(i, zze4.get(i - 1) + this.zzuZ[i2]);
        } else {
            if (i3 == 2) {
                this.zzuZ[i2] = 0.0f;
                zze4.zzX(i, f);
                return;
            }
            throw new zzDS("Invalid difference order.");
        }
    }
}
