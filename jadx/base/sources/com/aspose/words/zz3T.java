package com.aspose.words;

import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz3T extends zz1O implements zzZC7 {
    private zz3V zzZ09;

    public zz3T(zz3V zz3v) {
        super(zz3v);
        this.zzZ09 = zz3v;
        this.zzZjc = zz3v.zzZTd();
        this.zzZjb = this.zzZ09.zzZTc();
    }

    private boolean zzD(com.aspose.words.internal.zzZL zzzl) throws Exception {
        com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(zzzl, com.aspose.words.internal.zzZG.class);
        if (zzzg == null) {
            return false;
        }
        if (!zz7Y.zzZ(this.zzZjc, null) || com.aspose.words.internal.zzZZP.zzz(zzzg.zzZ0())) {
            return this.zzZ09.zzZTe() == null || this.zzZ09.zzZTe().getCount() == 0 || com.aspose.words.internal.zzZKN.zzX(this.zzZ09.zzZTf().zzZAO(), DrawToolFactory.LASSO_TYPE_RECT, com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
        }
        return false;
    }

    private com.aspose.words.internal.zzZL zzX(zz82 zz82Var) throws Exception {
        Document documentZzYBb = zz82Var.zzZBO().getDocument().zzYBb();
        byte[] imageBytes = zz82Var.zzZBO().getImageBytes();
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), this.zzZ09.zzZTh().zzZv().getSize());
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(imageBytes);
        try {
            zzY7R zzy7rZzZ = zzY7I.zzV(zzzor, documentZzYBb).zzZ(new zzYB5(zzzq4.getWidth(), zzzq4.getHeight()), (zzYB5) null);
            zzzor.close();
            com.aspose.words.internal.zzG zzg = (com.aspose.words.internal.zzG) zzy7rZzZ.zzY11();
            new com.aspose.words.internal.zzZE().zzZ(zzg, 1, 12700);
            long jZzG = com.aspose.words.internal.zzSA.zzG(zzy7rZzZ.getSize());
            zzg.zzW(com.aspose.words.internal.zzP9.zzZ(zzZd().zzx(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) jZzG), com.aspose.words.internal.zzZPW.zzYz(jZzG))), zzzq4));
            com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
            zzg2.zzZ(com.aspose.words.internal.zzP8.zzM(zzzq4));
            zzg2.zzX((com.aspose.words.internal.zzZL) zzg);
            zzg2.zzQ(true);
            return zzg2;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private com.aspose.words.internal.zzEP zzZd() {
        return ((Shape) this.zzZ09.zzZyb()).getImageData().zzZd();
    }

    private static int zzw(com.aspose.words.internal.zzG zzg) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < zzg.getCount(); i++) {
            com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(zzg.zzN(i), com.aspose.words.internal.zzZG.class);
            if (zzzg != null) {
                com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
                zzzgZzYZ.zzX(null);
                zzzg.zzY(com.aspose.words.internal.zzPY.zzPJ());
                if (zzy(zzzg)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList2, zzzg);
                }
                if (!zzy(zzzgZzYZ)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzgZzYZ);
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zzg.removeAt(zzg.zzW((com.aspose.words.internal.zzZG) it.next()));
        }
        zzg.zzZ(0, arrayList);
        return arrayList.size();
    }

    private static boolean zzy(com.aspose.words.internal.zzZG zzzg) {
        return (zzzg.zzZ1() == null || zzzg.zzZ1().isEmpty()) && (zzzg.zzZ2() == null || zzzg.zzZ1() == null || zzzg.zzZ2().zzZ1().isEmpty());
    }

    @Override // com.aspose.words.zzZC7
    public final com.aspose.words.internal.zzZL zzZ(zz50 zz50Var) throws Exception {
        com.aspose.words.internal.zzZL zzg;
        int iZzw;
        com.aspose.words.internal.zzF4 zzf4ZzI = zz50Var.zzZIB() != null ? zz50Var.zzZIB().zzI() : null;
        zz50Var.zzZy8().zzO(this.zzZ09.zzZTh());
        try {
            try {
                zz2G zz2gZzS = zzS(zz50Var);
                zz2gZzS.zzZv9();
                com.aspose.words.internal.zzG zzgZzZ = zzZ(this.zzZ09.zzZTf(), zz2gZzS);
                com.aspose.words.internal.zzZL zzzlZzZ = zzZ(zz2gZzS, zzf4ZzI);
                if (zzD(zzzlZzZ)) {
                    zzzlZzZ = zzZ(zz2gZzS, (com.aspose.words.internal.zzZG) zzzlZzZ);
                }
                if (zzzlZzZ != null) {
                    iZzw = zzw(zzgZzZ);
                    zzgZzZ.zzZ(iZzw, zzzlZzZ);
                } else {
                    iZzw = -1;
                }
                if (zz7Y.zzZ(this.zzZjc, null) && zzgZzZ.getCount() > 1) {
                    zzZ(zzgZzZ, iZzw, zz50Var);
                }
                zzZ(zz50Var.zzZy8(), zzgZzZ);
                zzg = zz2B.zzZ(this.zzZ09.zzZTe(), zzgZzZ, zz50Var.zzZIB(), zzZ(this.zzZ09, zzgZzZ, zz2gZzS), this.zzZ09.getFill().zzZQ4(), this.zzZ09.zzZFk(), false);
            } catch (Exception e) {
                if (zzf4ZzI != null) {
                    zzf4ZzI.zzZ(4, 2, com.aspose.words.internal.zzZKN.format("DrawingML picture rendering failed with exception:'{0}'", e.getMessage()));
                }
                zzg = new com.aspose.words.internal.zzG();
            }
            zz50Var.zzZy8().zzZsa();
            return zzg;
        } catch (Throwable th) {
            zz50Var.zzZy8().zzZsa();
            throw th;
        }
    }

    private static void zzZ(com.aspose.words.internal.zzG zzg, int i, zz50 zz50Var) throws Exception {
        if (i > 0) {
            while (i < zzg.getCount()) {
                if (zzg.zzN(i) instanceof com.aspose.words.internal.zzZG) {
                    com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) zzg.zzN(i);
                    if (zzzg.zzZO() == null) {
                        zzzg.zzW(new com.aspose.words.internal.zzP9());
                    }
                    zzzg.zzZO().zzZ(0.99f, 0.99f, 1);
                }
                i++;
            }
        }
        byte[] bArrZzZ = com.aspose.words.internal.zzE.zzZ(zzg, 96.0f, com.aspose.words.internal.zzPV.zzHZ, 12700, zz50Var.zzZIB().getDocument().zzZqx(), com.aspose.words.internal.zzZQ4.zz2T);
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArrZzZ);
        com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzSA.zzp(zzegZzZT.getWidthPoints()), com.aspose.words.internal.zzSA.zzp(zzegZzZT.getHeightPoints())), bArrZzZ);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzX(zzzp);
        com.aspose.words.internal.zzG zzg3 = new com.aspose.words.internal.zzG();
        zzg3.zzX((com.aspose.words.internal.zzZL) zzg2);
        zzg.clear();
        zzg.zzX((com.aspose.words.internal.zzZL) zzg3);
    }

    @Override // com.aspose.words.zz1O
    public final void zzZ(com.aspose.words.internal.zzZL zzzl, zz05 zz05Var) {
        if (zzzl instanceof com.aspose.words.internal.zzG) {
            com.aspose.words.internal.zzG zzg = (com.aspose.words.internal.zzG) zzzl;
            if (zzg.getCount() == 1 && (zzg.zzN(0) instanceof com.aspose.words.internal.zzG)) {
                if (zzg.zzZN() != null) {
                    zzZ(zzg.zzZN(), zz05Var);
                }
                com.aspose.words.internal.zzG zzg2 = (com.aspose.words.internal.zzG) zzg.zzN(0);
                if (zzg2.zzZO() == null) {
                    com.aspose.words.internal.OooO0O0.OooO00o(zzg2);
                }
                zzg2.zzZO().zzZ(zzZ(zz05Var, true), 1);
            }
        }
    }

    private com.aspose.words.internal.zzZL zzZ(zz2G zz2g, com.aspose.words.internal.zzF4 zzf4) throws Exception {
        zz82 zz82Var = this.zzZ09.zzZwy().zzZQ1().hasExtensions() ? this.zzZ09.zzZwy().zzZQ1().getExtensions().get("{96DAC541-7B7A-43D3-8B79-37D633B846F1}") : null;
        if (zz82Var != null) {
            try {
                return zzX(zz82Var);
            } catch (Exception e) {
                if (zzf4 != null) {
                    zzf4.zzZ(4, 7, com.aspose.words.internal.zzZKN.format("SVG extension of DrawingML image rendering failed with exception:'{0}'", e.getMessage()));
                }
            }
        }
        int imageType = this.zzZ09.zzZwy().zzZQ1().getImageType();
        if (imageType != 2 && imageType != 3) {
            return zzZ(zz2g);
        }
        return zzZ(zz2g, this.zzZ09.zzZwy().zzZQ1().getImageBytes());
    }

    private com.aspose.words.internal.zzZL zzZ(zz2G zz2g, byte[] bArr) throws Exception {
        com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), this.zzZ09.zzZTh().zzZv().getSize(), bArr, zzZd());
        zz08.zzZ(zzzp, this.zzZ09.zzZwy().zzZQ1().zzZQ7(), zz2g.zzZvb());
        return zzZ(zzzp, (com.aspose.words.internal.zzP9) null, com.aspose.words.internal.zzP8.zzM(zzzp.zzZj()));
    }

    private static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZP zzzp, com.aspose.words.internal.zzP9 zzp9, com.aspose.words.internal.zzP8 zzp8) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzzp);
        zzg.zzW(zzp9);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzZ(zzp8);
        zzg2.zzX((com.aspose.words.internal.zzZL) zzg);
        return zzg2;
    }

    private com.aspose.words.internal.zzZG zzZ(zz2G zz2g) throws Exception {
        zzGR zzgrZzZvb = zz2g.zzZvb();
        com.aspose.words.internal.zzZG zzzgZzZ = zz7F.zzZ(this.zzZ09.zzZTf(), zz2g);
        if (zzzgZzZ == null) {
            return null;
        }
        boolean zZzZQ5 = this.zzZ09.zzZwy().zzZQ5();
        try {
            this.zzZ09.zzZwy().zzY6(true);
            zzzgZzZ.zzY(this.zzZ09.zzZwy().zzZ(zzgrZzZvb));
            return zzzgZzZ;
        } finally {
            this.zzZ09.zzZwy().zzY6(zZzZQ5);
        }
    }

    private com.aspose.words.internal.zzZL zzZ(zz2G zz2g, com.aspose.words.internal.zzZG zzzg) {
        if (zzzg.zzZ1() != null && zzzg.zzZ1().zzPH() == 2) {
            com.aspose.words.internal.zzOH zzoh = (com.aspose.words.internal.zzOH) zzzg.zzZ1();
            if (zzoh.zzNa() == 4) {
                com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), zz2g.zzZvb().zzZPK().getSize(), zzoh.getImageBytes(), zzZd());
                zzzp.zzZ9();
                zzzg.zzY((com.aspose.words.internal.zzPY) null);
                return zzZ(zzzp, zzZ(zz2g.zzZvb(), zzoh), DrawToolFactory.LASSO_TYPE_RECT.equals(this.zzZ09.zzZTf().zzZAO()) ? null : zzzg.zzZ0());
            }
        }
        return zzzg;
    }

    private com.aspose.words.internal.zzP9 zzZ(zzGR zzgr, com.aspose.words.internal.zzOH zzoh) {
        if (com.aspose.words.internal.zzP9.zzO(zzoh.zzNb()) || !this.zzZ09.zzZwy().zzZPY().zzZPU()) {
            return null;
        }
        com.aspose.words.internal.zzP9 zzp9ZzOh = zzoh.zzNb().zzOh();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzgr.zzZPK();
        if (this.zzZ09.zzZwy().zzZQ5()) {
            zzp9ZzOh.zzZ(zz32.zzZ(zzgr, com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZPK.getWidth() / 2.0f, zzzq4ZzZPK.getHeight() / 2.0f)).zzOo(), 1);
        }
        zzp9ZzOh.zzZ(com.aspose.words.internal.zzP9.zzZ(com.aspose.words.internal.zzSA.zzS(zzzq4ZzZPK), this.zzZ09.zzZwy().zzZQ3()), 1);
        return zzp9ZzOh;
    }
}
