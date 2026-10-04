package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzM0 extends zzMO {
    private long[] zzDl;
    private int[] zzDm;
    private int zzDn;
    private boolean zzDo;
    private ArrayList<zzP5> zzH4;

    public zzM0(boolean z) {
        this.zzDo = z;
    }

    private ArrayList<zzP5> zz9(long j) {
        boolean z;
        ArrayList<zzP5> arrayList = new ArrayList<>();
        zzP5 zzp5 = new zzP5();
        long j2 = j;
        int i = 0;
        while (i < this.zzDn) {
            int i2 = this.zzDm[i];
            long[] jArr = this.zzDl;
            int i3 = i + 1;
            long j3 = jArr[i];
            boolean z2 = (i2 & 1) == 1;
            if ((i2 & 6) == 6) {
                z = !zzAN.zzH(j2, j3) ? true : z2;
                j2 = j3;
            } else {
                if ((i2 & 2) == 2) {
                    zzp5.zzR(j2, j3);
                    j2 = j3;
                } else if ((i2 & 4) == 4) {
                    long j4 = jArr[i3];
                    int i4 = i + 3;
                    long j5 = jArr[i + 2];
                    zzZQG.zzZ((ArrayList<zzPZ>) zzp5.zzNY(), new zzPZ(j2, j3, j4, j5));
                    j2 = j5;
                    z = z2;
                    i3 = i4;
                }
                z = z2;
            }
            if (z && zzp5.getCount() > 0) {
                if (z2) {
                    zzp5.zze(true);
                }
                zzZQG.zzZ(arrayList, zzp5);
                zzp5 = new zzP5();
            }
            i = i3;
        }
        if (zzp5.getCount() > 0) {
            zzZQG.zzZ(arrayList, zzp5);
        }
        return arrayList;
    }

    public final boolean isEmpty() {
        return this.zzDn == 0;
    }

    public final long[] zzJx() {
        return this.zzDl;
    }

    public final int zzJy() {
        return this.zzDn;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        this.zzDn = zzJJ().zzXc();
        this.zzDl = this.zzDo ? zzJJ().zzXJ(this.zzDn) : zzJJ().zzXK(this.zzDn);
        this.zzDm = zzJJ().zzXI(this.zzDn);
    }

    public final ArrayList<zzP5> zza(long j) {
        if (this.zzH4 == null) {
            this.zzH4 = zz9(j);
        }
        return this.zzH4;
    }
}
