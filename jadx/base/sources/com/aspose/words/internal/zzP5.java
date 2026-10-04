package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzP5 {
    private ArrayList<zzOW> zzGU;
    private boolean zzKZ;

    public zzP5() {
        this(0);
    }

    public static zzP5 zzK(zzZQ4 zzzq4) {
        zzP5 zzp5 = new zzP5();
        zzp5.zzKZ = true;
        zzp5.zzJ(zzzq4);
        return zzp5;
    }

    public static zzP5 zzS(long j, long j2) {
        zzP5 zzp5 = new zzP5();
        zzp5.zzR(j, j2);
        return zzp5;
    }

    private void zzV(zz0Q zz0q) {
        int count = zz0q.getCount();
        int i = 0;
        while (i < count - 3) {
            ArrayList<zzOW> arrayList = this.zzGU;
            long j = zz0q.get(i);
            long j2 = zz0q.get(i + 1);
            long j3 = zz0q.get(i + 2);
            i += 3;
            zzZQG.zzZ((ArrayList<zzPZ>) arrayList, new zzPZ(j, j2, j3, zz0q.get(i)));
        }
    }

    public static zzP5 zzW(zz0Q zz0q) {
        zzP5 zzp5 = new zzP5();
        zzp5.zzKZ = false;
        zzp5.zzV(zz0q);
        return zzp5;
    }

    public static zzP5 zzX(zz0Q zz0q, boolean z, boolean z2) {
        zzP5 zzp5 = new zzP5();
        zzp5.zzKZ = z2;
        zzp5.zzZ(zz0q, z);
        return zzp5;
    }

    public static zzP5 zzY(long[] jArr) {
        return zzW(new zz0Q(jArr));
    }

    private long zzf(boolean z) {
        if (this.zzGU.size() == 0) {
            return 0L;
        }
        zzOW zzow = this.zzGU.get(z ? 0 : r0.size() - 1);
        return z ? zzow.zzPR() : zzow.zzPQ();
    }

    public final int getCount() {
        return this.zzGU.size();
    }

    public final boolean isClosed() {
        return this.zzKZ;
    }

    public final void zzJ(zzZQ4 zzzq4) {
        zzOS zzos = new zzOS();
        zzos.zzNu().add(zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()));
        zzos.zzNu().add(zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()));
        zzos.zzNu().add(zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()));
        zzos.zzNu().add(zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn()));
        zzZQG.zzZ((ArrayList<zzOS>) this.zzGU, zzos);
    }

    public final ArrayList<zzOW> zzNY() {
        return this.zzGU;
    }

    public final zzP5 zzNZ() {
        zzP5 zzp5 = new zzP5(this.zzGU.size());
        zzp5.zzKZ = this.zzKZ;
        Iterator<zzOW> it = this.zzGU.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ(zzp5.zzGU, it.next().zzPM());
        }
        return zzp5;
    }

    public final long zzPQ() {
        return zzf(false);
    }

    public final long zzPR() {
        return zzf(true);
    }

    public final void zzR(long j, long j2) {
        zzOS zzos = new zzOS();
        zzos.zzNu().add(j);
        zzos.zzNu().add(j2);
        zzZQG.zzZ((ArrayList<zzOS>) this.zzGU, zzos);
    }

    public final void zzU(zzP5 zzp5) {
        Iterator<zzOW> it = zzp5.zzGU.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ(this.zzGU, it.next().zzPM());
        }
    }

    public final void zzZ(zz0Q zz0q, boolean z) {
        zzZQG.zzZ((ArrayList<zzOS>) this.zzGU, new zzOS(zz0q, z));
    }

    public final void zze(boolean z) {
        this.zzKZ = z;
    }

    public zzP5(int i) {
        this.zzGU = new ArrayList<>(i);
    }

    public final void zzY(zzH2 zzh2) throws Exception {
        zzh2.zzZ(this);
        Iterator<zzOW> it = this.zzGU.iterator();
        while (it.hasNext()) {
            if (!it.next().zzZ(zzh2)) {
                return;
            }
        }
        zzh2.zzY(this);
    }

    public static zzP5 zzX(long[] jArr, boolean z, boolean z2) {
        zzP5 zzp5 = new zzP5(1);
        zzp5.zzKZ = z2;
        zzp5.zzZ(jArr, z);
        return zzp5;
    }

    public final void zzZ(long[] jArr, boolean z) {
        zzZQG.zzZ((ArrayList<zzOS>) this.zzGU, new zzOS(jArr, z));
    }

    public final void zzX(long[] jArr) {
        zzV(new zz0Q(jArr, false));
    }

    public final void zzY(zzP9 zzp9) {
        Iterator<zzOW> it = this.zzGU.iterator();
        while (it.hasNext()) {
            it.next().zzY(zzp9);
        }
    }

    public final void zzZ(zzQ5 zzq5) {
        zzQ2 zzq2ZzPV = zzq5.zzPV();
        for (int i = 0; i < zzq2ZzPV.getCount(); i++) {
            zzZQG.zzZ((ArrayList<zzPZ>) this.zzGU, new zzPZ(zzq2ZzPV, i));
        }
    }
}
