package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzEV {
    private zzZOX zzW6;

    public zzEV(zzZOX zzzox) {
        this.zzW6 = zzzox;
    }

    public final ArrayList<zzEX> zzEd() throws Exception {
        short s;
        byte[] bArr;
        byte[] bArrZzn;
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        short sZzXa = this.zzW6.zzXa();
        ArrayList<zzEX> arrayList = new ArrayList<>(sZzXa);
        int i = 0;
        boolean z = false;
        while (i < sZzXa) {
            int iZzX6 = this.zzW6.zzX6() & 255;
            int i2 = iZzX6 == 0 ? 256 : iZzX6;
            int iZzX62 = this.zzW6.zzX6() & 255;
            int i3 = iZzX62 == 0 ? 256 : iZzX62;
            int iZzX63 = this.zzW6.zzX6() & 255;
            this.zzW6.zzX6();
            short sZzXa2 = this.zzW6.zzXa();
            short sZzXa3 = this.zzW6.zzXa();
            int iZzXc = this.zzW6.zzXc();
            int iZzXc2 = this.zzW6.zzXc();
            long position = this.zzW6.zzq().getPosition();
            int i4 = i;
            boolean z2 = z;
            this.zzW6.zzq().zzH(iZzXc2);
            int iZzXc3 = this.zzW6.zzXc();
            if (iZzXc3 != 40) {
                this.zzW6.zzq().zzH(position);
                s = sZzXa;
                z = true;
            } else {
                int iZzXc4 = this.zzW6.zzXc();
                int iZzXc5 = this.zzW6.zzXc();
                short sZzXa4 = this.zzW6.zzXa();
                short sZzXa5 = this.zzW6.zzXa();
                s = sZzXa;
                int iZzXc6 = this.zzW6.zzXc();
                this.zzW6.zzXc();
                int iZzXc7 = this.zzW6.zzXc();
                int iZzXc8 = this.zzW6.zzXc();
                int iZzXc9 = this.zzW6.zzXc();
                int iZzXc10 = this.zzW6.zzXc();
                int i5 = i2;
                byte[] bArrZzn2 = this.zzW6.zzn(zzEF.zzP(iZzXc6, sZzXa5, iZzXc9));
                int i6 = iZzXc4 * iZzXc4;
                int i7 = (i6 * sZzXa5) / 8;
                byte[] bArrZzn3 = this.zzW6.zzn(i7);
                if (iZzXc5 == iZzXc4 * 2) {
                    int i8 = i6 / 8;
                    int length = (iZzXc - iZzXc3) - bArrZzn2.length;
                    int i9 = i7 + i8;
                    if (length != i9) {
                        int i10 = length - i9;
                        bArr = bArrZzn2;
                        this.zzW6.zzq().zzH(this.zzW6.zzq().getPosition() + ((long) i10));
                    } else {
                        bArr = bArrZzn2;
                    }
                    bArrZzn = this.zzW6.zzn(i8);
                } else {
                    bArr = bArrZzn2;
                    bArrZzn = null;
                }
                zzEW zzew = new zzEW(iZzXc3, sZzXa4, sZzXa5, iZzXc6, iZzXc7, iZzXc8, iZzXc9, iZzXc10, bArr, bArrZzn, bArrZzn3);
                this.zzW6.zzq().zzH(position);
                zzZQG.zzZ(arrayList, new zzEX(i5, i3, iZzXc, iZzX63, sZzXa2, sZzXa3, zzew));
                z = z2;
            }
            i = i4 + 1;
            sZzXa = s;
        }
        if (z && arrayList.size() == 0) {
            throw new UnsupportedOperationException("A PNG image was encountered in the ICO file.");
        }
        return arrayList;
    }
}
