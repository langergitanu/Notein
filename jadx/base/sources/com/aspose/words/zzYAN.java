package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAN {
    private zzTO zzXcC;

    private zzYAN(zzTO zzto) {
        this.zzXcC = zzto;
    }

    public static void zzO(zzYAU zzyau, int i) throws Exception {
        zzY9S zzy9s = (zzY9S) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9S.class);
        if (zzy9s != null) {
            zzy9s.zzY4J();
            zzy9s.zzlI(zzy9s.zzY5J() + i);
        } else {
            zzY9W zzy9w = (zzY9W) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9W.class);
            if (zzy9w != null) {
                zzy9w.zzlU(zzy9w.zzY78() + i);
            }
        }
    }

    private void zzVF(int i, int i2) throws Exception {
        ArrayList<zzYAU> arrayListZzMQ = this.zzXcC.zzMQ(i);
        int length = 0;
        for (zzYAU zzyau : arrayListZzMQ) {
            length = zzyau.zzZo6() == 10754 ? length + zzyau.getLength() : length + 1;
        }
        int iZzZ = zzZ(arrayListZzMQ, i2 / length);
        if (iZzZ > 0) {
            zzZ(arrayListZzMQ, iZzZ / length);
        }
    }

    public static void zzZ(zzTO zzto, int i) throws Exception {
        new zzYAN(zzto).zzlN(i);
    }

    private void zzlN(int i) throws Exception {
        for (int i2 = 1; i2 < 7; i2++) {
            int iZzMP = this.zzXcC.zzMP(i2);
            if (iZzMP > 0) {
                int iMin = Math.min(i, iZzMP);
                zzVF(i2, iMin);
                i -= iMin;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    private int zzZ(Iterable<zzYAU> iterable, int i) throws Exception {
        int i2 = 0;
        for (zzYAU zzyau : iterable) {
            int iZzR = this.zzXcC.zzR(zzyau);
            if (i <= iZzR) {
                zzO(zzyau, -i);
            } else {
                zzO(zzyau, -iZzR);
                i2 += i - iZzR;
            }
        }
        return i2;
    }
}
