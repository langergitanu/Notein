package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTQ extends zzKO {
    private static Class zzRm = zzZZO.zzA(Double.TYPE);
    private int zzRn;
    private int zzRo;
    private zzKN zzRp;

    private zzTQ(zzKN zzkn, int i, int i2) {
        super(zzYY(i));
        this.zzRp = zzkn;
        this.zzRo = i;
        this.zzRn = i2;
    }

    private static Object zzC(double d) {
        if (Double.isNaN(d)) {
            return null;
        }
        return Double.valueOf(d);
    }

    private static Class zzYY(int i) {
        return i != 0 ? i != 1 ? zzRm : Object.class : String.class;
    }

    public static zzTQ zzZ(zzKN zzkn) {
        zzKO zzkoZzIL = zzkn.zzIL();
        if (zzkoZzIL.zzs()) {
            return new zzTQ(zzkn, 1, 0);
        }
        if (zzkoZzIL.zzno()) {
            return new zzTQ(zzkn, 2, 0);
        }
        if (zzkoZzIL.zznn() && !zzkoZzIL.zzns()) {
            return new zzTQ(zzkn, 3, 0);
        }
        int iZzJ = zz7T.zzJ(zzkoZzIL.zzw());
        return zz7T.zzUB(iZzJ) ? new zzTQ(zzkn, 4, iZzJ) : new zzTQ(zzkn, 0, 0);
    }

    @Override // com.aspose.words.internal.zzZVP
    public final Object zzTT() {
        if (zzs()) {
            return null;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZVP
    public final boolean zzTU() {
        return zzs();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return this.zzRo == 1;
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object objZzx = this.zzRp.zzx();
        if (objZzx == null) {
            return null;
        }
        int i = this.zzRo;
        if (i == 0) {
            return objZzx.toString();
        }
        if (i == 2) {
            return Double.valueOf(((Boolean) objZzx).booleanValue() ? 1.0d : 0.0d);
        }
        if (i == 3) {
            return zzC(zz7F.zzQ(objZzx, this.zzRp.zzIL().zznw()));
        }
        if (i == 4) {
            return zzC(zz7T.zzX(objZzx, this.zzRn));
        }
        throw new IllegalStateException();
    }
}
