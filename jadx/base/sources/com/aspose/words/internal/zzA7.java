package com.aspose.words.internal;

import com.aspose.words.Cluster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzA7 extends zzZ5 {
    private zzZQC<zzZ> zzYA = new zzZQC<>();
    private zzZ9 zzz9 = new zzZ9();

    public static class zzY {
        private zzP9 zzrm;
        private zzP9 zzrn;

        public zzY(zzP9 zzp9, zzP9 zzp92) {
            this.zzrn = zzp9;
            this.zzrm = zzp92;
        }

        public final zzP9 zzAv() {
            return this.zzrm;
        }

        public final zzP9 zzAw() {
            return this.zzrn;
        }
    }

    public static class zzZ {
        private boolean zzD7 = true;
        private ArrayList<zzZL> zzro = new ArrayList<>();
        private zzG zzrp;
        private zzZ zzrq;

        public zzZ(zzZ zzz, zzG zzg) {
            this.zzrq = zzz;
            this.zzrp = zzg;
        }

        public final boolean isEmpty() {
            return this.zzD7;
        }

        public final void zzAA() {
            this.zzD7 = false;
        }

        public final zzG zzAx() {
            return this.zzrp;
        }

        public final ArrayList<zzZL> zzAy() {
            return this.zzro;
        }

        public final zzZ zzAz() {
            return this.zzrq;
        }
    }

    private zzA7() {
        this.zzYA.push(new zzZ(null, null));
        zzZ(this.zzz9);
    }

    private zzZ zzAB() {
        return this.zzYA.peek();
    }

    private static zzY zzE(zzP9 zzp9) {
        if (zzp9.zzOp()) {
            return new zzY(zzp9, new zzP9());
        }
        float[] fArrZzOr = zzp9.zzOr();
        float f = fArrZzOr[0];
        float f2 = fArrZzOr[1];
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        float fZzZN = zzZKQ.zzZN(f);
        float fZzZN2 = zzZKQ.zzZN(f2);
        zzP9 zzp92 = new zzP9();
        zzp92.zzY(fArrZzOr[4], fArrZzOr[5], 1);
        zzp92.zzZ(fAbs, fAbs2, 1);
        zzP9 zzp93 = new zzP9();
        zzp93.zzZ(fZzZN, fZzZN2, 1);
        zzp93.zzZ(new zzP9(1.0f, fArrZzOr[2], 0.0f, 1.0f, 0.0f, 0.0f), 1);
        zzp93.zzX(fArrZzOr[3], 1);
        return new zzY(zzp92, zzp93);
    }

    private static boolean zzF(zzP9 zzp9) {
        return zzAN.zzS(zzp9.zzOf(), 1.0f) && zzAN.zzS(zzp9.zzOe(), 0.0f) && zzAN.zzS(zzp9.zzOd(), 0.0f) && zzAN.zzS(zzp9.zzOc(), 1.0f) && zzAN.zzS(zzp9.zzOb(), 0.0f) && zzAN.zzS(zzp9.zzOa(), 0.0f);
    }

    public static zzG zzK(zzG zzg) throws Exception {
        zzA7 zza7 = new zzA7();
        zzg.zzZ(zza7.zzYJ());
        zzG zzg2 = new zzG();
        zzg2.zzZ(zza7.zzAB().zzAy());
        return zzg2;
    }

    private void zzL(zzZL zzzl) {
        zzZQG.zzZ(zzAB().zzAy(), zzzl);
        zzAB().zzAA();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        zzZ zzzPop = this.zzYA.pop();
        if (zzzPop.isEmpty()) {
            return;
        }
        if (zzzPop.zzAx() == null) {
            zzZQG.zzZ((ArrayList) zzzPop.zzAz().zzAy(), (Iterable) zzzPop.zzAy());
            zzzPop.zzAz().zzAA();
        } else {
            zzzPop.zzAx().zzZ(zzzPop.zzAy());
            zzZQG.zzZ((ArrayList<zzG>) zzzPop.zzAz().zzAy(), zzzPop.zzAx());
            zzzPop.zzAz().zzAA();
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        if (zzg.zzZN() == null) {
            this.zzYA.push(new zzZ(zzAB(), null));
            return;
        }
        zzG zzg2 = new zzG();
        zzg2.zzZ(zzg.zzZN().zzO8());
        zzg2.zzZN().zzY(this.zzz9.zzR(zzg.zzZO()));
        this.zzYA.push(new zzZ(zzAB(), zzg2));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) {
        zzY zzyZzZ = zzZ(zzzg, this.zzz9.zzR(zzzg.zzZO()));
        zzZG zzzg2 = new zzZG();
        zzzg2.zzY(zzZ(zzzg.zzZ1(), zzyZzZ.zzAw()));
        zzzg2.zzX(zzZ(zzzg.zzZ2(), zzyZzZ.zzAw()));
        zzzg2.zzW(zzF(zzyZzZ.zzAv()) ? null : zzyZzZ.zzAv());
        if (zzzg.zzZN() != null) {
            zzzg2.zzZ(zzzg.zzZN().zzO8());
            zzzg2.zzZN().zzY(zzyZzZ.zzAw());
        }
        zzzg2.zzZ0().zzY1(zzzg.zzZ0().zzO6());
        for (int i = 0; i < zzzg.zzZ0().getCount(); i++) {
            zzP5 zzp5ZzNZ = zzzg.zzZ0().zzO7().get(i).zzNZ();
            zzp5ZzNZ.zzY(zzyZzZ.zzAw());
            zzZQG.zzZ(zzzg2.zzZ0().zzO7(), zzp5ZzNZ);
        }
        zzL(zzzg2);
    }

    private static zzY zzZ(zzZG zzzg, zzP9 zzp9) {
        if (zzzg.zzZ2() == null) {
            return new zzY(zzp9, new zzP9());
        }
        return zzZ(zzp9, false);
    }

    private static zzPY zzZ(zzPY zzpy, zzP9 zzp9) {
        if (zzpy == null) {
            return null;
        }
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 2) {
            return zzZ((zzOH) zzpy, zzp9);
        }
        if (iZzPH == 3) {
            return zzZ((zzPA) zzpy, zzp9);
        }
        if (iZzPH != 4) {
            return iZzPH != 5 ? zzpy : zzZ((zzP0) zzpy, zzp9);
        }
        return zzZ((zzOP) zzpy, zzp9);
    }

    private static zzPY zzZ(zzOP zzop, zzP9 zzp9) {
        zzOP zzop2 = (zzOP) zzop.zzPI();
        if (zzP9.zzO(zzp9)) {
            return zzop2;
        }
        zzop2.zzNb().zzZ(zzp9, 1);
        return zzop2;
    }

    private static zzPA zzZ(zzPA zzpa, zzP9 zzp9) {
        zzPA zzpa2 = (zzPA) zzpa.zzPI();
        zzP9 zzp9ZzOh = zzp9.zzOh();
        if (zzpa.zzNb() != null) {
            zzp9ZzOh.zzZ(zzpa.zzNb(), 0);
        }
        zzY zzyZzE = zzE(zzp9ZzOh);
        zzpa2.zzL(zzyZzE.zzAv());
        zzpa2.zzP(zzyZzE.zzAw().zzO(zzpa.zzOw()));
        return zzpa2;
    }

    private static zzP0 zzZ(zzP0 zzp0, zzP9 zzp9) {
        zzP0 zzp02 = (zzP0) zzp0.zzPI();
        zzP9 zzp9ZzOh = zzp9.zzOh();
        if (zzp0.zzNb() != null) {
            zzp9ZzOh.zzZ(zzp0.zzNb(), 0);
        }
        zzp02.zzL(new zzP9());
        zzp02.zzo(zzp9ZzOh.zzR(zzp0.zzNV()));
        zzp02.zzUu().zzY(zzp9ZzOh);
        return zzp02;
    }

    private static zzOH zzZ(zzOH zzoh, zzP9 zzp9) {
        zzOH zzoh2 = (zzOH) zzoh.zzPI();
        if (zzoh2.zzNb() == null) {
            zzoh2.zzL(new zzP9());
        }
        zzoh2.zzNb().zzZ(zzp9, 1);
        return zzoh2;
    }

    private static zzOU zzZ(zzOU zzou, zzP9 zzp9) {
        if (zzou == null) {
            return null;
        }
        float fAbs = Math.abs(zzp9.zzOf());
        zzOU zzouZzNP = zzou.zzNP();
        zzouZzNP.zzY(zzZ(zzou.zzZ1(), zzp9));
        zzouZzNP.setWidth(zzouZzNP.getWidth() * fAbs);
        return zzouZzNP;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) {
        zzY zzyZzE = zzE(this.zzz9.zzYP());
        zzZP zzzp2 = (zzZP) zzzp.zz1();
        zzZQ4 zzzq4ZzO = zzyZzE.zzAw().zzO(zzzp2.zzZj());
        zzzp2.zzY(zzzq4ZzO.zzZE());
        zzzp2.setSize(zzzq4ZzO.getSize());
        if (!zzyZzE.zzAv().isIdentity()) {
            zzG zzg = new zzG();
            zzg.zzW(zzyZzE.zzAv());
            zzg.zzX(zzzp2);
            zzL(zzg);
            return;
        }
        zzL(zzzp2);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) {
        if (zzzu.isHidden()) {
            return;
        }
        zzY zzyZzZ = zzZ(this.zzz9.zzR(zzzu.zzZO()), true);
        zzZU zzzu2 = (zzZU) zzzu.zz1();
        zzzu2.zzW(zzyZzZ.zzAv());
        if (zzzu2.zzZN() != null) {
            if (zzzu.zzZO() != null) {
                zzzu2.zzZN().zzY(zzzu.zzZO().zzOo());
            }
            zzzu2.zzZN().zzY(zzyZzZ.zzAw());
        }
        float fZzOf = zzyZzZ.zzAw().zzOf();
        zzzu2.zzY(zzyZzZ.zzAw().zzR(zzzu.zzZT()));
        zzzu2.zzZr().zzR(fZzOf);
        zzzu2.setSize(zzZPW.zzG(Float.intBitsToFloat((int) zzzu.getSize()) * fZzOf, zzZPW.zzYz(zzzu.getSize()) * fZzOf));
        zzZ(zzzu2, fZzOf);
        zzL(zzzu2);
    }

    private static void zzZ(zzZU zzzu, float f) {
        if (zzzu.zzZh() == null) {
            return;
        }
        for (Cluster cluster : zzzu.zzZh()) {
            for (int i = 0; i < cluster.getGlyphs().length; i++) {
                zzRL zzrl = (zzRL) zzZKW.zzZ(cluster.getGlyphs()[i], zzRL.class);
                if (zzrl != null) {
                    cluster.getGlyphs()[i] = new zzRL(zzrl.getGlyphIndex(), zzrl.zzRa() * f, zzrl.getAdvance(), zzrl.getAdvanceOffset(), zzrl.getAscenderOffset());
                }
            }
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzN zzn) {
        zzN zznZz2 = zzn.zz2();
        zznZz2.zzY(this.zzz9.zzYP());
        zzL(zznZz2);
    }

    private static zzY zzZ(zzP9 zzp9, boolean z) {
        if (zzp9.zzOp()) {
            return new zzY(zzp9, new zzP9());
        }
        float[] fArrZzOr = zzp9.zzOr();
        float f = fArrZzOr[0];
        float f2 = fArrZzOr[1];
        float fZzZN = zzZKQ.zzZN(f);
        float fZzZN2 = zzZKQ.zzZN(f2);
        float fMin = Math.min(Math.abs(f), Math.abs(f2));
        float fAbs = z ? fMin : fZzZN * fMin;
        if (!z) {
            fMin *= fZzZN2;
        }
        if (zzAN.zzY(Math.abs(f / fAbs), Math.abs(f2 / fMin), 0.005f)) {
            fAbs = Math.abs(f) * zzZKQ.zzZN(fAbs);
            fMin = Math.abs(f2) * zzZKQ.zzZN(fMin);
        }
        zzP9 zzp92 = new zzP9();
        zzp92.zzY(fArrZzOr[4], fArrZzOr[5], 1);
        zzp92.zzZ(fAbs, fMin, 1);
        zzP9 zzp93 = new zzP9();
        zzp93.zzZ(f / fAbs, f2 / fMin, 1);
        zzp93.zzZ(new zzP9(1.0f, fArrZzOr[2], 0.0f, 1.0f, 0.0f, 0.0f), 1);
        zzp93.zzX(fArrZzOr[3], 1);
        return new zzY(zzp92, zzp93);
    }
}
