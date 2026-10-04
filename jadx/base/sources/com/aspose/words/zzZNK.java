package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZNK {
    private zzYCP zzYxS;
    private zzYCP zzYxT;
    private Iterable<com.aspose.words.internal.zzZQ5> zzYxU;
    private com.aspose.words.internal.zzZQ5 zzYxV;
    private zzZNO zzZsr;

    public zzZNK(zzZNO zzzno, com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        this.zzZsr = zzzno;
        this.zzYxV = zzzq5;
        ArrayList arrayList = new ArrayList();
        for (zzZNO zzzno2 : this.zzZsr.zzZ8D()) {
            if (!zzS(zzzno2)) {
                zzXR zzxrZzZ8O = zzzno2.zzZ8O();
                zzxrZzZ8O.zz7F();
                com.aspose.words.internal.zzZQ5 zzzq5Zz7G = zzxrZzZ8O.zz7G();
                if (zzzq5Zz7G.getWidth() >= 0 && zzzq5Zz7G.getHeight() >= 0) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZQ5>) arrayList, zzzq5Zz7G);
                }
            }
        }
        this.zzYxU = arrayList;
    }

    private static boolean zzR(zzZNO zzzno) {
        zzzno.zzZ93().zzqh(1024);
        return zzzno.zzZ99() != 25604 && zzzno.zzZ8G().zzYMd() == 2;
    }

    private boolean zzS(zzZNO zzzno) {
        if (zzzno != null && zzzno.zzZ8T()) {
            return zzZ(this.zzZsr, zzzno);
        }
        return true;
    }

    private zzYCP zzXM(long j) {
        int iMax = (int) j;
        com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(iMax, (int) (j >> 32), this.zzYxV.getWidth(), this.zzYxV.getHeight());
        int right = zzzq5.getRight();
        for (com.aspose.words.internal.zzZQ5 zzzq52 : this.zzYxU) {
            if (zzzq5.zzP(zzzq52)) {
                right = Math.min(right, zzzq52.getX());
                iMax = Math.max(iMax, zzzq52.getRight());
            }
        }
        return new zzYCP(right, iMax);
    }

    private boolean zzXo(int i, int i2) {
        return i >= this.zzYxV.getX() && (this.zzYxV.getWidth() + i2) - this.zzZsr.zzZ8M() <= this.zzYxT.getEnd();
    }

    private static boolean zzY(zzZNO zzzno, zzZNO zzzno2) {
        zzzno.zzZ93().zzqh(1024);
        zzzno2.zzZ93().zzqh(1024);
        return !zzzno.zzZ8Y() || zzzno2.zzZ8G().getAllowOverlap() || zzR(zzzno2);
    }

    public static zzXR zzZ(zzZNO zzzno, zzXR zzxr) throws Exception {
        zzxr.zz7F();
        com.aspose.words.internal.zzZQ5 zzzq5Zz7G = zzxr.zz7G();
        if (zzzq5Zz7G.getWidth() >= 0 && zzzq5Zz7G.getHeight() >= 0 && zzzq5Zz7G.getHeight() != 0) {
            zzZNK zzznkZzZ = zzZ(zzzno, zzzq5Zz7G);
            long jZzZE = zzxr.zzZE();
            boolean z = false;
            do {
                RefBoolean refBoolean = new RefBoolean(z);
                jZzZE = zzznkZzZ.zzZ(jZzZE, refBoolean);
                z = refBoolean.get();
            } while (!z);
            if (!com.aspose.words.internal.zzZPZ.zzD(jZzZE, zzxr.zzZE())) {
                return zzxr.zzYB(((int) jZzZE) - zzxr.getX(), ((int) (jZzZE >> 32)) - zzxr.getY());
            }
        }
        return zzxr;
    }

    private void zzZ80() throws Exception {
        zzYN8 zzyn8ZzZ8m = this.zzZsr.zzZ93().zzZ8m();
        this.zzYxT = zzX(zzyn8ZzZ8m);
        this.zzYxS = zzW(zzyn8ZzZ8m);
    }

    private int zzz(long j, int i) {
        if (this.zzYxV.getX() < ((int) j)) {
            i = zzXM(com.aspose.words.internal.zzZPZ.zzZm(this.zzYxV.getX(), (int) (j >> 32))).getStart();
        }
        int width = i - this.zzYxV.getWidth();
        this.zzYxV.getX();
        return width;
    }

    public abstract int zzBw(int i);

    public abstract int zzBx(int i);

    public boolean zzBy(int i) {
        return this.zzYxT.getStart() <= i + this.zzZsr.zzZ8N();
    }

    public abstract zzYCP zzW(zzYN8 zzyn8) throws Exception;

    public zzYCP zzX(zzYN8 zzyn8) throws Exception {
        return this.zzZsr.zzZ8C();
    }

    public abstract long zzXL(long j);

    public abstract boolean zzXm(int i, int i2);

    public abstract boolean zzXn(int i, int i2);

    public final zzYCP zzZ7T() {
        return this.zzYxS;
    }

    public final Iterable<com.aspose.words.internal.zzZQ5> zzZ7U() {
        return this.zzYxU;
    }

    public final int zzZ7V() {
        return this.zzYxV.getHeight();
    }

    public final int zzZ7W() {
        return this.zzYxV.getWidth();
    }

    public final com.aspose.words.internal.zzZQ5 zzZ7X() {
        return this.zzYxV;
    }

    public final boolean zzZ7Y() {
        return this.zzYxS != null;
    }

    public final int zzZ7Z() {
        return this.zzZsr.zzZ8G().zzYMd();
    }

    public final zzZNO zzZXN() {
        return this.zzZsr;
    }

    private static zzZNK zzZ(zzZNO zzzno, com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        zzZNK zzzni;
        if (zzzno.zzZZJ().zza7().zzZYM()) {
            zzzni = new zzZNJ(zzzno, zzzq5);
        } else {
            zzzni = new zzZNI(zzzno, zzzq5);
        }
        zzzni.zzZ80();
        return zzzni;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r0
      0x0049: PHI (r0v6 int) = (r0v4 int), (r0v5 int) binds: [B:16:0x0047, B:19:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long zzZ(long j, RefBoolean refBoolean) {
        zzYCP zzycpZzXM = zzXM(j);
        refBoolean.set(!(zzycpZzXM.getLength() > 0));
        if (refBoolean.get()) {
            return j;
        }
        int i = (int) (j >> 32);
        int end = zzycpZzXM.getEnd();
        if (!zzXo((int) j, end)) {
            end = zzz(j, zzycpZzXM.getStart());
            if (!zzBy(end)) {
                end = this.zzYxV.getX();
                int iZzBx = zzBx(i);
                if (zzXn(i, iZzBx)) {
                    i = iZzBx;
                } else {
                    iZzBx = zzBw(i);
                    if (!zzXm(i, iZzBx)) {
                        refBoolean.set(true);
                    }
                }
            }
        }
        if (refBoolean.get()) {
            return zzXL(j);
        }
        return com.aspose.words.internal.zzZPZ.zzZm(end, i);
    }

    private static boolean zzZ(zzZNO zzzno, zzZNO zzzno2) {
        zzzno.zzZ8Z();
        zzzno2.zzZ8Z();
        zzzno.zzZZJ();
        zzzno2.zzZZJ();
        if (zzzno == zzzno2) {
            return true;
        }
        zzZKY zzzky = (zzZKY) zzzno.zzZ93().zzqh(1024);
        if (zzzky != null) {
            return zzZ(zzzno, zzzky, zzzno2);
        }
        if (((zzZKY) zzzno2.zzZ93().zzqh(1024)) != null) {
            return zzY(zzzno2, zzzno);
        }
        return zzzno.zzZ8G().getAllowOverlap() && zzzno2.zzZ8G().getAllowOverlap();
    }

    private static boolean zzZ(zzZNO zzzno, zzZKY zzzky, zzZNO zzzno2) {
        zzzno.zzZ93().zzqh(1024);
        zzZKY zzzky2 = (zzZKY) zzzno2.zzZ93().zzqh(1024);
        if (zzzky2 == zzzky) {
            return zzzno.zzZ8G().getAllowOverlap() && zzzno2.zzZ8G().getAllowOverlap();
        }
        if (zzzky2 != null) {
            return true;
        }
        return zzY(zzzno, zzzno2);
    }
}
