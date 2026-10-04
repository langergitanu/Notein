package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzA3 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("urn:microsoft.com/office/officeart/2005/8/layout/hList9", "urn:microsoft.com/office/officeart/2008/layout/AlternatingHexagons", "urn:microsoft.com/office/officeart/2005/8/layout/radial3", "urn:microsoft.com/office/officeart/2005/8/layout/hList2", "urn:microsoft.com/office/officeart/2005/8/layout/default", "urn:microsoft.com/office/officeart/2011/layout/RadialPictureList", "urn:diagrams.loki3.com/VaryingWidthList", "urn:microsoft.com/office/officeart/2011/layout/InterconnectedBlockProcess", "urn:microsoft.com/office/officeart/2009/3/layout/OpposingIdeas", "urn:microsoft.com/office/officeart/2005/8/layout/pyramid1", "urn:microsoft.com/office/officeart/2005/8/layout/pyramid3");
    private zz8Z zzZ70;
    private zz30 zzZa5;
    private zzZC3 zzZge;

    public zzA3(zz50 zz50Var, zzAV zzav) {
        this.zzZge = zz50Var.zzZIB();
        this.zzZ70 = new zz8Z(zz50Var, zzav);
    }

    private zzZ90 getThemeProvider() throws Exception {
        return this.zzZge.getThemeProvider();
    }

    private boolean zz7e() throws Exception {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzZge.getDocument(), Document.class);
        return document != null && document.getBuiltInDocumentProperties().zz7e();
    }

    private String zzQu(String str) {
        switch (zzUR.zzTP(this.zzZ70.zzZCP().zzZES().getUniqueId())) {
            case 7:
            case 8:
                if ("alignImgPlace1".equals(str)) {
                    return "revTx";
                }
                return null;
            case 9:
            case 10:
                if ("node1".equals(str)) {
                    return "revTx";
                }
                return null;
            default:
                return null;
        }
    }

    private zzBW zzQv(String str) {
        zz18 zz18VarZzPq = this.zzZ70.zzZCP().zzZEQ().zzPq(str);
        if (zz18VarZzPq != null) {
            return zzY(zz18VarZzPq.zzZTj());
        }
        return null;
    }

    private zzBW zzQw(String str) {
        zzBO zzboZzQz = this.zzZ70.zzZCP().zzZEP().zzQz(str);
        if (zzboZzQz == null || zzboZzQz.zzZFo() == null || zzboZzQz.zzZFo().isEmpty()) {
            return null;
        }
        return zzboZzQz.zzZFo().zzZO0()[0];
    }

    private void zzV(zz2O zz2o) throws Exception {
        zz07 zz07VarZzZTh = zz2o.zzZTh();
        zz07 zz07VarZzZTh2 = zz2o.zzZAk().zzZTh();
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(zz07VarZzZTh.zzZCC().zzZQQ());
        double dZzZJ2 = com.aspose.words.internal.zzAN.zzZJ(zz07VarZzZTh2.zzZCC().zzZQQ());
        if (!zz7e()) {
            if (com.aspose.words.internal.zzAN.zzL(dZzZJ, 180.0d) && com.aspose.words.internal.zzAN.zzL(dZzZJ2, 180.0d) && zz07VarZzZTh.getFlipOrientation() == 2) {
                zz07VarZzZTh2.zzX(new zzHK());
            }
            zzZ(zz2o, zz07VarZzZTh2);
            return;
        }
        if (zz07VarZzZTh2.zzU(zz07VarZzZTh)) {
            zzZ(zz2o, dZzZJ);
        } else if (com.aspose.words.internal.zzAN.zzZD(dZzZJ2)) {
            zz07VarZzZTh2.zzX(zzHK.zzYR(-dZzZJ));
        } else if (com.aspose.words.internal.zzAN.zzL(dZzZJ, dZzZJ2)) {
            zz07VarZzZTh2.zzX(zzHK.zzYR(-dZzZJ));
        }
    }

    private void zzW(zz2O zz2o) {
        zz93 zz93VarZzS;
        zz93 zz93VarZzY;
        if (zz2o.zzZEC() == null || (zz93VarZzS = this.zzZ70.zzZEk().zzS(zz2o.zzZEC())) == null || (zz93VarZzY = this.zzZ70.zzZEk().zzY(zz93VarZzS)) == null || !zz93VarZzY.hasExtensions()) {
            return;
        }
        Iterator<String> it = zz93VarZzY.getExtensions().zzxs().iterator();
        while (it.hasNext()) {
            zz82 zz82Var = zz93VarZzY.getExtensions().get(it.next());
            if (zz82Var.zzZBV().zzZxZ() != null) {
                if (zz2o.zzZyc() == null) {
                    zz2o.zzZ(new zz4M());
                }
                if (zz2o.zzZyc().zzZxV() == null) {
                    zz2o.zzZyc().zzY(new zz4T());
                }
                zz2o.zzZyc().zzZxV().zzZ(zz82Var.zzZBV().zzZxZ());
                return;
            }
        }
    }

    private void zzX(zz2O zz2o) throws Exception {
        if (zz2o.zzZAk() != null) {
            zzZ(zz2o.zzZAk(), zz2o.zzZTj(), zz2o.zzZEC());
            zzW(zz2o);
            zzV(zz2o);
        }
    }

    private void zzZ(zz2O zz2o, double d) {
        zz07 zz07VarZzZTh = zz2o.zzZAk().zzZTh();
        String uniqueId = this.zzZ70.zzZCP().zzZES().getUniqueId();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        boolean z = com.aspose.words.internal.zzZKN.zzS(uniqueId, "urn:microsoft.com/office/officeart/2005/8/layout/balance1", i) || com.aspose.words.internal.zzZKN.zzS(this.zzZ70.zzZCP().zzZES().getUniqueId(), "urn:microsoft.com/office/officeart/2005/8/layout/hList2", i);
        Object objZzZ = zzZ(this.zzZ70.zzZEk().zzS(zz2o.zzZEC()), 14);
        zz07VarZzZTh.zzX(zzHK.zzYR(z ? 0.0d : (objZzZ == null ? 0.0d : ((double) ((Integer) objZzZ).intValue()) / 60000.0d) - d));
        zzZ(zz07VarZzZTh, zzZ(zz2o, zzZ(zz2o.zzZTf(), zz2o.zzZTh(), !z)));
    }

    private static com.aspose.words.internal.zzZQ4 zzZA(com.aspose.words.internal.zzZQ4 zzzq4) {
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), zzzq4.getWidth() + (zzzq4.getWidth() * 0.01f), zzzq4.getHeight());
    }

    private static com.aspose.words.internal.zzZQ4 zzZB(com.aspose.words.internal.zzZQ4 zzzq4) {
        float width = zzzq4.getWidth() * 0.01f;
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX() - width, zzzq4.getY(), zzzq4.getWidth() + width, zzzq4.getHeight());
    }

    private zz30 zzZHw() throws Exception {
        if (this.zzZa5 == null) {
            zz30 zz30Var = new zz30();
            this.zzZa5 = zz30Var;
            zz30Var.zzZ(new zz7P());
            this.zzZa5.zzZvQ().zzOH(getThemeProvider().getFontName(131073));
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZa5.zzZvQ().zzZAY())) {
                this.zzZa5.zzZvQ().zzOH("Calibri");
            }
            this.zzZa5.setFill(new zz1C(getThemeProvider().getThemeColor(12)));
        }
        return this.zzZa5;
    }

    private static com.aspose.words.internal.zzZQ4 zzZz(com.aspose.words.internal.zzZQ4 zzzq4) {
        float width = zzzq4.getWidth() * 0.01f;
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX() - (width / 2.0f), zzzq4.getY(), zzzq4.getWidth() + width, zzzq4.getHeight());
    }

    public final zz2O zzY(zz2O zz2o) throws Exception {
        zz2O zz2o2 = (zz2O) zz2o.zzY(true, null);
        zzX(zz2o2);
        return zz2o2;
    }

    private static zzBW zzY(zz1K zz1k) {
        if (zz1k == null || zz1k.zzZu5() == null) {
            return null;
        }
        return zz1k.zzZu5().zzZQX();
    }

    private zzBW zzY(zz1K zz1k, zz5A zz5a) {
        if (zz5a == null) {
            return null;
        }
        String str = (String) zzZ(this.zzZ70.zzZEk().zzS(zz5a), 2);
        String strZzQu = zzQu(str);
        if (strZzQu != null) {
            zzBW zzbwZzQw = zzQw(strZzQu);
            return zzbwZzQw == null ? zzQv(strZzQu) : zzbwZzQw;
        }
        zzBW zzbwZzQw2 = zzQw(str);
        return zzbwZzQw2 == null ? zzY(zz1k) : zzbwZzQw2;
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zz7H zz7h, zz07 zz07Var, boolean z) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((float) zz07Var.zzQb(), (float) zz07Var.zzYm(), 1);
        if (z) {
            zzp9.zzZ((float) zz07Var.zzZCC().zzZQQ(), zz07Var.zzNV(), 1);
        }
        zz7h.zzZAP().zzp(zz07Var.getWidth(), zz07Var.getHeight());
        return com.aspose.words.internal.zzJ6.zzZ(zz7h.zzZAL(), zzp9);
    }

    private void zzZ(zz2O zz2o, zz07 zz07Var) {
        zzZ(zz07Var, zzZ(zz2o, zz07Var.zzZv()));
    }

    private com.aspose.words.internal.zzZQ4 zzZ(zz2O zz2o, com.aspose.words.internal.zzZQ4 zzzq4) {
        switch (zzUR.zzTP(this.zzZ70.zzZCP().zzZES().getUniqueId())) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                int alignment = zz2o.zzZAk().zzZCZ().zzMi().get(0).zzZxp().getAlignment();
                if (alignment == 0) {
                    return zzZA(zzzq4);
                }
                if (alignment != 2) {
                    return zzZz(zzzq4);
                }
                return zzZB(zzzq4);
            default:
                return zzzq4;
        }
    }

    private static void zzZ(zz07 zz07Var, com.aspose.words.internal.zzZQ4 zzzq4) {
        zz07Var.zzW(zzzq4.getX());
        zz07Var.zzV(zzzq4.getY());
        zz07Var.setWidth(zzzq4.getWidth());
        zz07Var.setHeight(zzzq4.getHeight());
    }

    private void zzZ(zz0J zz0j, zz1K zz1k, zz5A zz5a) throws Exception {
        if (zz0j == null) {
            return;
        }
        zz30 zz30VarZzZ = zzZ(zz1k, zz5a);
        Iterator<zz4A> it = zz0j.zzZCZ().zzMi().iterator();
        while (it.hasNext()) {
            it.next().zzZxp().zzZHc().zzU(zz30VarZzZ);
        }
    }

    private zz30 zzZ(zz1K zz1k, zz5A zz5a) throws Exception {
        zzBW zzbwZzY = zzY(zz1k, zz5a);
        if (zzbwZzY == null) {
            return zzZHw();
        }
        zz30 zz30Var = new zz30();
        zz30Var.zzU(zzZHw());
        zz30Var.setFill(new zz1C(zzbwZzY));
        return zz30Var;
    }

    private static Object zzZ(zz93 zz93Var, int i) {
        if (zz93Var == null || zz93Var.zzZCX() == null) {
            return null;
        }
        return zz93Var.zzZCX().zzZwi().zzLv(i);
    }
}
