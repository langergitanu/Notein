package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzII {
    private float zzPp;
    private int zzUt;
    private long zzZhA;
    private float zzZhB;
    private int zzZhy;
    private ArrayList<zzID> zzXz = new ArrayList<>();
    private ArrayList<zzIE> zzZhz = new ArrayList<>();

    public zzII(long j, float f, int i, int i2, float f2) {
        this.zzZhA = 0L;
        this.zzZhA = j;
        this.zzPp = f;
        this.zzZhy = i;
        this.zzUt = i2;
        this.zzZhB = f2;
    }

    private float zzZ(zzID zzid, zzIE zzie) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzT = com.aspose.words.internal.zzZQ4.zzT(zzZRA(), zzid.zzT(zzie));
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZhA) / zzzq4ZzT.getWidth();
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(this.zzZhA) / zzzq4ZzT.getHeight();
        return Math.min(fIntBitsToFloat, fZzYz) * this.zzPp;
    }

    private zzID zzZRB() {
        if (this.zzXz.size() != 0) {
            return ((zzID) C21505OooO0Oo.OooO00o(1, this.zzXz)).zzZ(this.zzZhy == 0, zzZRs());
        }
        int i = this.zzUt;
        if (i == 0) {
            return new zzIC(0L);
        }
        if (i == 1) {
            return new zzIA(0L);
        }
        throw new IllegalStateException("Unexpected snake algorithm offset.");
    }

    private float zzZRs() {
        return this.zzZhB * this.zzPp;
    }

    private boolean zzZY(com.aspose.words.internal.zzZQ4 zzzq4) {
        return zzHW.zzz(zzzq4.getSize(), this.zzZhA);
    }

    public final int getOffset() {
        return this.zzUt;
    }

    public final float getScale() {
        return this.zzPp;
    }

    public final float zzU(zzIE zzie) {
        return zzZ(zzZRB(), zzie);
    }

    public final float zzV(zzIE zzie) {
        return zzZ(zzZRx(), zzie);
    }

    public final boolean zzW(zzIE zzie) {
        zzie.zzZx(this.zzPp);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZRA = zzZRA();
        zzID zzidZzZRB = zzZRB();
        if (!zzZY(com.aspose.words.internal.zzZQ4.zzT(zzidZzZRB.zzT(zzie), zzzq4ZzZRA))) {
            return false;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXz, zzidZzZRB);
        zzidZzZRB.zzS(zzie);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZhz, zzie);
        return true;
    }

    public final boolean zzX(zzIE zzie) {
        zzie.zzZx(this.zzPp);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZRA = zzZRA();
        zzID zzidZzZRx = zzZRx();
        if (!zzZY(com.aspose.words.internal.zzZQ4.zzT(zzidZzZRx.zzT(zzie), zzzq4ZzZRA))) {
            return false;
        }
        zzidZzZRx.zzS(zzie);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZhz, zzie);
        return true;
    }

    public final com.aspose.words.internal.zzZQ4 zzZRA() {
        if (this.zzXz.size() == 0) {
            return new com.aspose.words.internal.zzZQ4();
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZSh = this.zzXz.get(0).zzZSh();
        Iterator<zzID> it = this.zzXz.iterator();
        while (it.hasNext()) {
            zzzq4ZzZSh = com.aspose.words.internal.zzZQ4.zzT(zzzq4ZzZSh, it.next().zzZSh());
        }
        return zzzq4ZzZSh;
    }

    public final int zzZRt() {
        return this.zzZhy;
    }

    public final long zzZRu() {
        return this.zzZhA;
    }

    public final ArrayList<zzIE> zzZRv() {
        return this.zzZhz;
    }

    public final ArrayList<zzID> zzZRw() {
        return this.zzXz;
    }

    public final zzID zzZRx() {
        this.zzXz.size();
        return (zzID) C21505OooO0Oo.OooO00o(1, this.zzXz);
    }

    public final float zzZRy() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZSh = this.zzXz.get(0).zzZSh();
        float fMax = 0.0f;
        int i = 0;
        while (i <= this.zzXz.size() - 2) {
            zzID zzid = this.zzXz.get(i);
            i++;
            fMax = Math.max(fMax, Float.intBitsToFloat((int) this.zzZhA) / com.aspose.words.internal.zzZQ4.zzT(zzzq4ZzZSh, zzid.zzT(this.zzXz.get(i).zzZA().get(0))).getWidth());
        }
        return this.zzPp * fMax;
    }

    public final void zzZRz() {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXz, zzZRB());
    }

    public final zzII zzZy(float f) {
        zzII zzii = new zzII(this.zzZhA, f, this.zzZhy, this.zzUt, this.zzZhB);
        for (zzID zzid : this.zzXz) {
            zzii.zzZRz();
            Iterator<zzIE> it = zzid.zzZA().iterator();
            while (it.hasNext()) {
                zzii.zzX(it.next());
            }
        }
        return zzii;
    }
}
