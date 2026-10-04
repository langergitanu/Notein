package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTL extends zzZTO {
    private int zzYK5;

    public zzZTL() {
        super(61442);
    }

    public static zzZTL zzEe(int i) {
        zzZTL zzztl = new zzZTL();
        zzztl.zzYK5 = i;
        zzZTM zzztm = new zzZTM();
        zzztl.zzZiD().zzZ(zzztm);
        zzztm.zzEh(i + 1);
        zzZSZ zzzsz = new zzZSZ();
        zzztl.zzZiD().zzZ(zzzsz);
        zzZT2 zzzt2 = new zzZT2();
        zzzsz.zzZiD().zzZ(zzzt2);
        zzzt2.zzZiD().zzZ(new zzZT0());
        zzZT4 zzzt4 = new zzZT4();
        zzzt4.zzE4(0);
        zzzt4.setShapeType(0);
        zzzt4.zzWn(true);
        zzzt4.zzZif();
        zzzt2.zzZiD().zzZ(zzzt4);
        return zzztl;
    }

    private static void zzZ(zzZTO zzzto, zzZTM zzztm) {
        for (int i = 0; i < zzzto.zzZiD().getCount(); i++) {
            zzZT7 zzzt7ZzEi = zzzto.zzZiD().zzEi(i);
            if (zzzt7ZzEi instanceof zzZT4) {
                zzZT4 zzzt4 = (zzZT4) zzzt7ZzEi;
                if (!zzzt4.zzZie() && !zzzt4.zzZic()) {
                    zzztm.zzEg(zzztm.zzZiC() + 1);
                }
                if (!zzzt4.zzZie()) {
                    zzztm.zzEf(Math.max(zzztm.zzZiB(), zzzt4.zzZih()));
                }
            }
            if (zzzt7ZzEi instanceof zzZTO) {
                zzZ((zzZTO) zzzt7ZzEi, zzztm);
            }
        }
    }

    public final void zzEd(int i) {
        this.zzYK5 = i;
    }

    public final void zzZiA() {
        zzZ(this, zzZiz());
    }

    public final zzZSZ zzZiw() {
        return (zzZSZ) zzn(zzZSZ.class);
    }

    public final int zzZix() {
        return this.zzYK5;
    }

    public final zzZSU zzZiy() {
        return (zzZSU) zzn(zzZSU.class);
    }

    public final zzZTM zzZiz() {
        return (zzZTM) zzn(zzZTM.class);
    }
}
