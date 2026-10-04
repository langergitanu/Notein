package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz07 extends zzY {
    private zzJO zzdJ;

    public zz07(zzJO zzjo) {
        super(false);
        this.zzdJ = zzjo;
    }

    private static String zzTc(int i) {
        return i <= 255 ? zzJB.zzWw(i) : zzY.zzV(i);
    }

    private static int zzY(int i, zzZYV<Integer> zzzyv) {
        if (zzzyv.zzVE(i)) {
            return zzzyv.get(i).intValue();
        }
        return 0;
    }

    @Override // com.aspose.words.internal.zzY
    public final void zzZ(zzZOP zzzop) throws Exception {
        zz08[] zz08VarArrZzQ = zzZZY.zzQ(this.zzdJ.zzTt());
        int i = 0;
        if (this.zzdJ.zzPl().zzHG() && this.zzdJ.zzPl().zzVe()) {
            zzY.zzZ(zzzop, "{0} begincidchar", zzJB.zzWD(zz08VarArrZzQ.length));
            while (i < zz08VarArrZzQ.length) {
                zz08 zz08Var = zz08VarArrZzQ[i];
                zzY.zzZ(zzzop, "<{0}>{1}", zzTc(zz08Var.zzZD()), Integer.toString(zzY(zz08Var.getIndex(), this.zzdJ.zzPl().zzpC())));
                i++;
            }
            zzY.zzY(zzzop, "endcidchar");
            return;
        }
        zzY.zzZ(zzzop, "{0} beginbfchar", zzJB.zzWD(zz08VarArrZzQ.length));
        while (i < zz08VarArrZzQ.length) {
            zz08 zz08Var2 = zz08VarArrZzQ[i];
            zzY.zzZ(zzzop, "<{0}>{1}", zzTc(zz08Var2.zzZD()), zz08Var2.zzZD() <= 255 ? zzZKN.format("<{0}>", zzTc(zz08Var2.zzZD())) : zzZKN.format("/{0}", zzZZY.zzTb(zz08Var2.zzZD())));
            i++;
        }
        zzY.zzY(zzzop, "endbfchar");
    }
}
