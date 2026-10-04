package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zz0A {
    private int zzdL;
    private int zzdM;
    private byte[] zzdO = new byte[5];
    private byte[] zzdN = new byte[4];
    private boolean zzdQ = false;
    private boolean zzdP = true;

    private zz0A(boolean z, boolean z2) {
    }

    private void zzT(StringBuilder sb) {
        zzY(this.zzdO.length, sb);
    }

    private void zzY(int i, StringBuilder sb) {
        for (int length = this.zzdO.length - 1; length >= 0; length--) {
            byte[] bArr = this.zzdO;
            int i2 = this.zzdM;
            bArr[length] = (byte) (((((long) i2) & 4294967295L) % 85) + 33);
            this.zzdM = (int) ((((long) i2) & 4294967295L) / 85);
        }
        for (int i3 = 0; i3 < i; i3++) {
            zzZ(sb, (char) (this.zzdO[i3] & 255));
        }
    }

    private void zzZ(StringBuilder sb, char c) {
        sb.append(c);
        int i = this.zzdL + 1;
        this.zzdL = i;
        if (i >= 75) {
            this.zzdL = 0;
            zzZNH.zzU(sb, IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    private String zzZa(byte[] bArr) {
        StringBuilder sb = new StringBuilder((this.zzdO.length / this.zzdN.length) * bArr.length);
        this.zzdL = 0;
        if (this.zzdQ) {
            zzY(sb, "<~");
        }
        this.zzdM = 0;
        int i = 0;
        for (byte b : bArr) {
            if (i >= this.zzdN.length - 1) {
                int i2 = this.zzdM | (b & 255);
                this.zzdM = i2;
                if (i2 == 0) {
                    zzZ(sb, 'z');
                } else {
                    zzT(sb);
                }
                this.zzdM = 0;
                i = 0;
            } else {
                this.zzdM = ((b & 255) << (24 - (i * 8))) | this.zzdM;
                i++;
            }
        }
        if (i > 0) {
            zzY(i + 1, sb);
        }
        if (this.zzdP) {
            zzY(sb, "~>");
        }
        return sb.toString();
    }

    public static String zzZb(byte[] bArr) {
        return new zz0A(false, true).zzZa(bArr);
    }

    private void zzY(StringBuilder sb, String str) {
        if (str.length() + this.zzdL > 75) {
            this.zzdL = 0;
            zzZNH.zzU(sb, IOUtils.LINE_SEPARATOR_WINDOWS);
        } else {
            this.zzdL = str.length() + this.zzdL;
        }
        zzZNH.zzU(sb, str);
    }
}
