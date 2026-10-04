package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz0H extends zz1O {
    private static char[] zzYXn = {'!', '?', ']', '}', FilenameUtils.EXTENSION_SEPARATOR, ',', ')', ':', ';'};
    private com.aspose.words.internal.zzH zzYXi;
    private com.aspose.words.internal.zzZQ4 zzYXj;
    private long zzYXk;
    private float zzYXl;
    private float zzYXm;
    private boolean zzYYt;
    private float zzYh;
    private zz2O zzZ3O;
    private zz0J zzZ3g;
    private DocumentBase zzZG3;

    private zz0H(zz2O zz2o, boolean z) {
        this(zz2o, zz2o.zzZAk(), com.aspose.words.internal.zzZQ4.zz2T, zz2o.zzZyb().getDocument(), z);
    }

    private ShapeRenderer getShapeRenderer() throws Exception {
        float fZzZsr = zzZsr();
        return (this.zzYYt && this.zzZ3g.zzZCZ().zzMi().size() > 0 && com.aspose.words.internal.zzAN.zzZD(this.zzZ3O.zzZTh().zzZCC().getValue()) && com.aspose.words.internal.zzAN.zzZD(this.zzZ3O.zzZAk().zzZTh().zzZCC().getValue())) ? zzZst() : fZzZsr > 0.0f ? zzYN(fZzZsr) : zzZ(this.zzZ3g, zzZso());
    }

    private static boolean zzGE(int i) {
        return zzZ3X.zzwN(i) || zzZ3X.zzwO(i);
    }

    private static double zzX(zz49 zz49Var) {
        zz3X zz3x = (zz3X) com.aspose.words.internal.zzZKW.zzZ(zz49Var.zzZxd(), zz3X.class);
        if (zz3x == null || zz3x.getValue() >= 1.0d) {
            return Double.NaN;
        }
        return zz3x.getValue();
    }

    private com.aspose.words.internal.zzG zzY(zz50 zz50Var, com.aspose.words.internal.zzG zzg) throws Exception {
        zzZRN();
        com.aspose.words.internal.zzG zzgZzZsu = zzZsu();
        if (zzgZzZsu.getCount() > 0) {
            zz07 zz07VarZzZAi = this.zzZ3O.zzZAk().zzZTh().zzZAi();
            boolean zZzU = zz07VarZzZAi.zzU(new zz07());
            double dZzZs6 = zz50Var.zzZy8().zzZs9().zzZs6();
            if (!zZzU) {
                zz50Var.zzZy8().zzZs9().zzXg(1.0d);
                zz50Var.zzZy8().zzO(zz07VarZzZAi);
            }
            zzZ(zz50Var.zzZy8(), zzgZzZsu, true);
            com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(32768);
            zzzs.zzX(zzgZzZsu);
            zzg.zzX(zzzs);
            if (!zZzU) {
                zz50Var.zzZy8().zzZsa();
                zz50Var.zzZy8().zzZs9().zzXg(dZzZs6);
            }
        }
        return zzg;
    }

    private ShapeRenderer zzYN(float f) throws Exception {
        zz0J zz0jZzZsy = this.zzZ3g.zzZsy();
        zz0jZzZsy.zzZCZ().zzZtK().zzGI(0);
        return zzZ(zz0jZzZsy, new com.aspose.words.internal.zzZQ4(zzZso().getX(), zzZso().getY(), zzZso().getWidth() + f, zzZso().getHeight()));
    }

    private float zzYU() {
        if (Float.isNaN(this.zzYh)) {
            this.zzYh = zzX(this.zzZ3g);
        }
        return this.zzYh;
    }

    public static com.aspose.words.internal.zzG zzZ(zz0J zz0j, com.aspose.words.internal.zzZQ4 zzzq4, DocumentBase documentBase) throws Exception {
        return new zz0H(zz0j, zzzq4, documentBase).zzZsu();
    }

    private zz10 zzZHh() {
        return this.zzZ3g.zzZCZ().zzZtK();
    }

    private com.aspose.words.internal.zzZQ4 zzZp(com.aspose.words.internal.zzZQ4 zzzq4) {
        float fZzZtF = zzZHh().zzZtF() + zzZHh().zzZtG();
        if (com.aspose.words.internal.zzAN.zzR(zzYU(), zzzq4.getHeight() - fZzZtF)) {
            return zzzq4;
        }
        float fZzYU = zzYU() + fZzZtF;
        float height = fZzYU - zzzq4.getHeight();
        int iZzMg = zzZHh().zzMg();
        return iZzMg != 1 ? iZzMg != 2 ? new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), zzzq4.getWidth(), fZzYU) : new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY() - height, zzzq4.getWidth(), fZzYU) : new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY() - (height / 2.0f), zzzq4.getWidth(), fZzYU);
    }

    private com.aspose.words.internal.zzZQ4 zzZq(com.aspose.words.internal.zzZQ4 zzzq4) {
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), Float.intBitsToFloat((int) zzZsq()) * zzzq4.getWidth(), com.aspose.words.internal.zzZPW.zzYz(zzZsq()) * zzzq4.getHeight());
    }

    private com.aspose.words.internal.zzH zzZsn() {
        if (this.zzYXi == null) {
            this.zzYXi = new com.aspose.words.internal.zzH();
        }
        return this.zzYXi;
    }

    private com.aspose.words.internal.zzZQ4 zzZso() {
        if (this.zzYXj.isEmpty()) {
            this.zzYXj = zzZss();
        }
        return this.zzYXj;
    }

    private zz07 zzZsp() {
        zz2O zz2o = this.zzZ3O;
        return zz2o != null ? zz2o.zzZTh() : new zz07();
    }

    private long zzZsq() {
        if (com.aspose.words.internal.zzZPW.zzYF(this.zzYXk)) {
            zz2O zz2o = this.zzZ3O;
            this.zzYXk = zz2o != null ? zz1O.zzJ(zz2o.zzZyb()) : com.aspose.words.internal.zzZPW.zzG(1.0f, 1.0f);
        }
        return this.zzYXk;
    }

    private float zzZsr() {
        zz31 zz31Var;
        zz2O zz2o = this.zzZ3O;
        if (zz2o != null && zzz(zz2o.zzZyb()) && this.zzZ3O.zzZAk().zzZCZ().zzMi().size() != 0) {
            zz4A zz4a = this.zzZ3O.zzZAk().zzZCZ().zzMi().get(this.zzZ3O.zzZAk().zzZCZ().zzMi().size() - 1);
            if (zz4a.zzMf().size() == 0) {
                return 0.0f;
            }
            zz47 zz47Var = zz4a.zzMf().get(zz4a.zzMf().size() - 1);
            if ((zzGE(zz47Var.zzZx5().zzTu()) || zzGE(zz47Var.zzZx5().zzZvZ())) && (zz31Var = (zz31) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz31.class)) != null && zz31Var.getText().length() != 0) {
                char cCharAt = zz31Var.getText().charAt(zz31Var.getText().length() - 1);
                for (char c : zzYXn) {
                    if (c == cCharAt) {
                        return ((float) zz47Var.zzZx5().zzZvS().zzZsz()) * 0.4f;
                    }
                }
            }
        }
        return 0.0f;
    }

    private com.aspose.words.internal.zzZQ4 zzZss() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZv = zzZsp().zzZv();
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZv.getWidth(), zzzq4ZzZv.getHeight());
        com.aspose.words.internal.zzZQ4 zzzq4ZzZv2 = this.zzZ3g.zzZTh().zzZv();
        if (zzzq4ZzZv2.isEmpty()) {
            zz2O zz2o = this.zzZ3O;
            if (zz2o != null && !zz2o.zzZTf().zzZAL().isEmpty()) {
                zzzq4 = new com.aspose.words.internal.zzZQ4(this.zzZ3O.zzZTf().zzZAL().getX(), this.zzZ3O.zzZTf().zzZAL().getY(), this.zzZ3O.zzZTf().zzZAL().getWidth() / Float.intBitsToFloat((int) zzZsq()), this.zzZ3O.zzZTf().zzZAL().getHeight() / com.aspose.words.internal.zzZPW.zzYz(zzZsq()));
            }
        } else {
            zzzq4 = new com.aspose.words.internal.zzZQ4(zzzq4ZzZv2.getX() - zzzq4ZzZv.getX(), zzzq4ZzZv2.getY() - zzzq4ZzZv.getY(), zzzq4ZzZv2.getWidth(), zzzq4ZzZv2.getHeight());
        }
        return zzZp(zzZq(zzzq4));
    }

    private ShapeRenderer zzZst() throws Exception {
        int size = this.zzZ3g.zzZCZ().zzMi().size();
        zz49 zz49VarZzZxp = this.zzZ3g.zzZCZ().zzMi().get(0).zzZxp();
        zz49 zz49VarZzZxp2 = this.zzZ3g.zzZCZ().zzMi().get(size - 1).zzZxp();
        boolean zZzZtw = this.zzZ3g.zzZCZ().zzZtK().zzZtw();
        zz0E zz0eZzZxb = zz49VarZzZxp.zzZxb();
        zz0E zz0eZzZxc = zz49VarZzZxp2.zzZxc();
        zzZ(zz49VarZzZxp, true);
        zzZ(zz49VarZzZxp2, false);
        ShapeRenderer shapeRendererZzZ = zzZ(this.zzZ3g, zzZso());
        zz49VarZzZxp.zzX(zz0eZzZxb);
        zz49VarZzZxp2.zzY(zz0eZzZxc);
        this.zzZ3g.zzZCZ().zzZtK().zzWF(zZzZtw);
        return shapeRendererZzZ;
    }

    private com.aspose.words.internal.zzG zzZsu() throws Exception {
        com.aspose.words.internal.zzG zzgZzyv = getShapeRenderer().zzyv();
        new com.aspose.words.internal.zzZE().zzZ(zzgZzyv, 1, 12700);
        com.aspose.words.internal.zzG zzgZzc = zzc(zzgZzyv);
        zza(zzgZzc);
        zzY(zzgZzc, com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzZPW.zzYz(r0.zzYzG().getSize())));
        zzb(zzgZzc);
        return zzgZzc;
    }

    private void zza(com.aspose.words.internal.zzG zzg) throws Exception {
        float fZzZQQ = (float) this.zzZ3g.zzZCZ().zzZtK().zzZCC().zzZQQ();
        if (com.aspose.words.internal.zzAN.zzf(fZzZQQ)) {
            return;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZsn().zzZ((com.aspose.words.internal.zzZL) zzg);
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzZ(fZzZQQ, com.aspose.words.internal.zzJ6.zzB(zzzq4ZzZ), 0);
    }

    private void zzb(com.aspose.words.internal.zzG zzg) {
        if (com.aspose.words.internal.zzZPY.zzYF(zzZso().zzZE())) {
            return;
        }
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzY(zzZso().getX(), zzZso().getY(), 0);
    }

    private com.aspose.words.internal.zzG zzc(com.aspose.words.internal.zzG zzg) throws Exception {
        boolean z = zzZHh().zzZtB() == 1;
        boolean z2 = zzZHh().zzZtt() == 2;
        if ((!z && !z2) || this.zzZ3O == null) {
            return zzg;
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZsn().zzZ((com.aspose.words.internal.zzZL) zzg);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZso = com.aspose.words.internal.zzJ6.zzA(zzZsp().zzZv()) ? zzZso() : zzZsp().zzZv();
        zzg2.zzZ(com.aspose.words.internal.zzP8.zzM(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, z ? zzzq4ZzZso.getWidth() : zzzq4ZzZ.zzkw(), z2 ? zzzq4ZzZso.getHeight() : zzzq4ZzZ.zzZn())));
        zzg2.zzX((com.aspose.words.internal.zzZL) zzg);
        return zzg2;
    }

    private boolean zzz(ShapeBase shapeBase) {
        do {
            shapeBase = (GroupShape) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getParentNode(), GroupShape.class);
            if (shapeBase == null) {
                return false;
            }
        } while (!shapeBase.isTopLevel());
        return shapeBase.zzY9i().zzZHY() == 5;
    }

    private zz0H(zz0J zz0j, com.aspose.words.internal.zzZQ4 zzzq4, DocumentBase documentBase) {
        this(null, zz0j, zzzq4, documentBase, false);
    }

    private zz0H(zz2O zz2o, zz0J zz0j, com.aspose.words.internal.zzZQ4 zzzq4, DocumentBase documentBase, boolean z) {
        super(zz2o);
        this.zzYXm = 0.0f;
        this.zzYXl = 0.0f;
        this.zzYh = Float.NaN;
        this.zzYXk = 0L;
        this.zzYXj = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzYYt = z;
        this.zzZ3O = zz2o;
        this.zzZ3g = zz0j;
        this.zzYXj = zzzq4.isEmpty() ? zzzq4 : zzZp(zzzq4);
        this.zzZG3 = documentBase;
    }

    public static com.aspose.words.internal.zzG zzZ(zz50 zz50Var, zz2O zz2o, com.aspose.words.internal.zzG zzg, boolean z) throws Exception {
        return zz2o.zzZAk() == null ? zzg : new zz0H(zz2o, z).zzY(zz50Var, zzg);
    }

    private static float zzX(zz0J zz0j) {
        Iterator<zz4A> it = zz0j.zzZCZ().zzMi().iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            Iterator<zz47> it2 = it.next().zzMf().iterator();
            while (it2.hasNext()) {
                fMax = (float) Math.max(it2.next().zzZx5().zzZvS().zzZsz(), fMax);
            }
        }
        return fMax;
    }

    private void zzZ(zz49 zz49Var, boolean z) {
        if (Double.isNaN(zzX(zz49Var))) {
            return;
        }
        this.zzZ3g.zzZCZ().zzZtK().zzWF(true);
        this.zzYXl = zzYU();
        int iZzYU = (int) ((((double) zzYU()) / 12700.0d) * 100.0d);
        if (z) {
            this.zzYXm = zzYU();
            zz49Var.zzX(new zz3K(new zz0K(iZzYU)));
        } else {
            this.zzYXl = zzYU();
            zz49Var.zzY(new zz3K(new zz0K(iZzYU)));
        }
    }

    private void zzY(com.aspose.words.internal.zzG zzg, float f) throws Exception {
        float f2;
        float f3;
        if (zzZHh().zzZtC() || zzZHh().zzZtt() == 0 || zzZHh().zzZts() == 2) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZsn().zzZ((com.aspose.words.internal.zzZL) zzg);
            float width = (zzZso().getWidth() - zzZHh().zzZtD()) - zzZHh().zzZtE();
            float height = (zzZso().getHeight() - zzZHh().zzZtG()) - zzZHh().zzZtF();
            float f4 = 0.0f;
            float width2 = (zzZHh().zzZtC() || (zzZHh().zzZts() == 2 && zzZHh().zzMg() == 1)) ? (width - zzzq4ZzZ.getWidth()) / 2.0f : 0.0f;
            if (zzZHh().zzZtt() == 0) {
                float fZzZtG = (((f - zzZHh().zzZtG()) - zzZHh().zzZtF()) - this.zzYXl) - this.zzYXm;
                int iZzMg = zzZHh().zzMg();
                if (iZzMg == 1) {
                    f2 = (height - fZzZtG) / 2.0f;
                    f3 = this.zzYXm;
                } else if (iZzMg != 2) {
                    f4 = -this.zzYXm;
                } else {
                    f2 = height - fZzZtG;
                    f3 = this.zzYXl;
                }
                f4 = f2 - f3;
            }
            if (com.aspose.words.internal.zzAN.zzf(width2) && com.aspose.words.internal.zzAN.zzf(f4)) {
                return;
            }
            if (zzg.zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(zzg);
            }
            zzg.zzZO().zzY(width2, f4, 0);
        }
    }

    private ShapeRenderer zzZ(zz0J zz0j, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        Document documentZzZpS = this.zzZG3.zzZpS();
        ShapeBase shapeBaseZzY = zz0G.zzY(zz0j, zzzq4, documentZzZpS);
        documentZzZpS.getFirstSection().getBody().getFirstParagraph().appendChild(shapeBaseZzY);
        PageSetup pageSetup = documentZzZpS.getFirstSection().getPageSetup();
        double pageWidth = pageSetup.getPageWidth() - ((double) pageSetup.zzYRX());
        double pageHeight = pageSetup.getPageHeight() - ((double) pageSetup.zzYRW());
        pageSetup.setPageWidth(Math.max(pageSetup.getPageWidth(), zzZHh().zzZts() == 2 ? 1584.0d : pageWidth + shapeBaseZzY.getWidth()));
        pageSetup.setPageHeight(Math.max(pageSetup.getPageHeight(), shapeBaseZzY.getHeight() + pageHeight));
        return shapeBaseZzY.getShapeRenderer();
    }
}
