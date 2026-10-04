package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzUO extends zzU1 {

    public static class zzZ {
        int zzRY = 0;
        int index = 0;
        int zzRX = 0;
        boolean zzRW = false;
        boolean zzRV = false;

        public final void reset() {
            this.zzRY = 0;
            this.index = -1;
            this.zzRX = 0;
            this.zzRW = false;
            this.zzRV = false;
        }

        public final int zzY(zzUU zzuu) {
            if (this.zzRX >= zzuu.zzUd()) {
                this.zzRV = true;
                return -1;
            }
            byte[] bArrZzUf = zzuu.zzUf();
            int i = this.zzRX;
            this.zzRX = i + 1;
            return bArrZzUf[i] & 255;
        }
    }

    public final int zzZ(zzUU zzuu, int[] iArr) {
        zzZ zzz = new zzZ();
        zzz.reset();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (zzZ(zzz, zzuu)) {
            i2++;
            if (zzz.zzRW) {
                i3++;
            } else {
                long j = ((long) zzz.zzRY) & 4294967295L;
                if (j > 255) {
                    i++;
                    if (iArr != null && zzZ1.binarySearch(iArr, 0, iArr.length, (int) j) >= 0) {
                        i4++;
                    }
                }
            }
        }
        if (i <= 10 && i3 == 0) {
            if (i != 0 || i2 >= 10) {
                return i4 + 10;
            }
            return 0;
        }
        if (((double) i3) / ((double) i2) > 0.03d) {
            return 0;
        }
        if (iArr != null) {
            return Math.min((int) ((Math.log(i4 + 1) * (90.0d / Math.log(i / 4.0f))) + 10.0d), 100);
        }
        int i5 = (i + 30) - (i3 * 20);
        if (i5 > 100) {
            return 100;
        }
        return i5;
    }

    public abstract boolean zzZ(zzZ zzz, zzUU zzuu);
}
