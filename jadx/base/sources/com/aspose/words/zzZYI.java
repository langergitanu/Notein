package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYI {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("pPr", "sectPr", "rPr", "t", "tcPr", "tblPr", "tblPrEx", "trPr");
    private zzZWM zzYPm;
    private zzZXA zzYPn;
    private zzYVG zzYPo;

    public zzZYI(zzYVG zzyvg, zzZXA zzzxa, zzZWM zzzwm) {
        this.zzYPo = zzyvg;
        this.zzYPn = zzzxa;
        this.zzYPm = zzzwm;
    }

    public static void zzT(zzYVB zzyvb) {
        zzyvb.zzZ(null);
    }

    public static void zzU(zzYVB zzyvb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int i = !"customXmlMoveFromRangeStart".equals(zzyu4ZzZsD.getLocalName()) ? 1 : 0;
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        zzyvb.zzZ(new zzYX5(i, zzyvh.getAuthor(), zzyvh.zzkT()));
    }

    public static void zzV(zzYVB zzyvb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        boolean zEquals = "customXmlDelRangeStart".equals(zzyu4ZzZsD.getLocalName());
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        zzyvb.zzZ(new zzZV8(zEquals ? 1 : 0, zzyvh.getAuthor(), zzyvh.zzkT()));
    }

    public static zzYVH zzY(zzYU4 zzyu4, zzYEF zzyef) {
        zzYVH zzyvh = new zzYVH(zzyu4);
        zzyef.zzQ(12, new zzZV8(1, zzyvh.getAuthor(), zzyvh.zzkT()));
        return zzyvh;
    }

    public static zzYVH zzZ(zzYU4 zzyu4, zzYEF zzyef) {
        zzYVH zzyvh = new zzYVH(zzyu4);
        zzyef.zzQ(14, new zzZV8(0, zzyvh.getAuthor(), zzyvh.zzkT()));
        return zzyvh;
    }

    public final void zzW(zzYVB zzyvb) throws Exception {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        zzZV8 zzzv8 = new zzZV8(0, zzyvh.getAuthor(), zzyvh.zzkT());
        zzyvb.zzXUm.zzV(zzzv8);
        this.zzYPn.zzY(zzyvb, null);
        zzyvb.zzXUm.zzX(zzzv8);
    }

    public final void zzX(zzYVB zzyvb) throws Exception {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        zzZV8 zzzv8 = new zzZV8(1, zzyvh.getAuthor(), zzyvh.zzkT());
        zzyvb.zzXUm.zzV(zzzv8);
        this.zzYPn.zzY(zzyvb, null);
        zzyvb.zzXUm.zzX(zzzv8);
    }

    public static void zzY(zzYU4 zzyu4, zzYMX zzymx) {
        zzYVH zzyvh = new zzYVH(zzyu4);
        zzYTV zzytv = new zzYTV();
        zzytv.setAuthor(zzyvh.getAuthor());
        zzytv.zz4(zzyvh.zzkT());
        zzYVG.zzZ(zzytv, zzyvh.zzYzh());
        zzytv.zzSt(true);
        zzymx.zzY(zzytv);
    }

    public final void zzZ(zzYVB zzyvb, zzYMX zzymx, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        while (zzyu4ZzZsD.zzQ("pPrChange")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 0) {
                zzyu4ZzZsD.zzk();
            } else {
                this.zzYPo.zzZ(zzyvb, zzymx, zzyef, zzyvh);
            }
        }
    }

    public static zzYVH zzW(zzYU4 zzyu4, zzYEF zzyef) {
        zzYVH zzyvh = new zzYVH(zzyu4);
        zzyef.zzQ(15, new zzYX5(1, zzyvh.getAuthor(), zzyvh.zzkT()));
        return zzyvh;
    }

    public static zzYVH zzX(zzYU4 zzyu4, zzYEF zzyef) {
        zzYVH zzyvh = new zzYVH(zzyu4);
        zzyef.zzQ(13, new zzYX5(0, zzyvh.getAuthor(), zzyvh.zzkT()));
        return zzyvh;
    }

    public final void zzX(zzYVB zzyvb, boolean z) throws Exception {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        zzYX5 zzyx5 = new zzYX5(z ? 1 : 0, zzyvh.getAuthor(), zzyvh.zzkT());
        zzyvb.zzXUm.zzZ(zzyx5, false);
        this.zzYPn.zzY(zzyvb, null);
        zzyvb.zzXUm.zzX(zzyx5);
    }

    public final void zzZ(zzYVB zzyvb, zzYCZ zzycz) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        while (zzyu4ZzZsD.zzQ("sectPrChange")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 1) {
                zzyu4ZzZsD.zzk();
            } else {
                zzYCZ zzycz2 = (zzYCZ) zzycz.zzbn();
                zzycz.clear();
                zzycz2.zzW(zzycz, 2210);
                zzycz2.zzW(zzycz, 2260);
                zzycz2.zzW(zzycz, 2260);
                zzycz2.zzW(zzycz, 2030);
                this.zzYPm.zzY(zzyvb, zzycz);
                zzycz2.zzX(zzycz);
                zzycz.zzZ(new zzZMK(zzycz2, zzyvh.getAuthor(), zzyvh.zzkT()));
            }
        }
    }

    public static void zzY(zzYVB zzyvb, zzY6G zzy6g) {
        zzZ(zzyvb, zzy6g, zzyvb.zzZsD().getLocalName());
    }

    public static void zzY(zzYVB zzyvb, boolean z) {
        Node zzyx4;
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (zzyvh.zzYDj()) {
            if (z) {
                zzyx4 = new zzYXC(zzyvb.getDocument(), zzyvh.getId(), zzyvh.zz9d());
            } else {
                zzyx4 = new zzYX4(zzyvb.getDocument(), zzyvh.getId(), zzyvh.zz9d());
            }
            if (zzyvb.zzXUm.zzX(new zzYX5(!z ? 1 : 0, zzyvh.getAuthor(), zzyvh.zzkT())) != null) {
                zzyvb.zzYK(zzyx4);
            }
        }
    }

    public final void zzZ(zzYVB zzyvb, zzYEF zzyef, boolean z) throws Exception {
        String str = z ? "del" : "ins";
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzZ(zzyvb, zzyu4ZzZsD, str, zzyef, z ? zzY(zzyu4ZzZsD, zzyef) : zzZ(zzyu4ZzZsD, zzyef));
        zzyef.remove(10010);
    }

    public final void zzZ(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzZ(zzyvb, zzyu4ZzZsD, "rPrChange", zzyef, new zzYVH(zzyu4ZzZsD));
    }

    private void zzZ(zzYVB zzyvb, zzYU4 zzyu4, String str, zzYEF zzyef, zzYVH zzyvh) throws Exception {
        while (zzyu4.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 2) {
                this.zzYPo.zzZ(zzyvb, zzyef, zzyvh);
            } else if (iZzTP != 3) {
                zzyu4.zzk();
            } else {
                zzZWW.zzZl1().zzP(zzyvb, zzyef);
            }
        }
    }

    public static void zzZ(zzYU4 zzyu4, zzYMX zzymx) {
        zzYVH zzyvh = new zzYVH(zzyu4);
        zzYTV zzytv = new zzYTV();
        zzytv.setAuthor(zzyvh.getAuthor());
        zzytv.zz4(zzyvh.zzkT());
        zzytv.zzSu(true);
        zzymx.zzY(zzytv);
    }

    public static void zzZ(zzYVB zzyvb, zzY6G zzy6g) {
        zzZ(zzyvb, zzy6g, zzyvb.zzZsD().getLocalName());
    }

    public static void zzZ(zzYVB zzyvb, zzWP zzwp) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        while (zzyu4ZzZsD.zzQ("tcPrChange")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 4) {
                zzyu4ZzZsD.zzk();
            } else {
                WordAttrCollection wordAttrCollection = (WordAttrCollection) zzwp.zzbn();
                zzwp.clear();
                zzZWW.zzZkZ().zzY(zzyvb, zzwp);
                wordAttrCollection.zzX(zzwp);
                zzwp.zzZ(new zzZMK(wordAttrCollection, zzyvh.getAuthor(), zzyvh.zzkT()));
            }
        }
    }

    public static void zzZ(zzYVB zzyvb, WordAttrCollection wordAttrCollection, int i) {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (i == 0) {
            wordAttrCollection.zzQ(14, new zzZV8(i, zzyvh.getAuthor(), zzyvh.zzkT()));
        } else {
            if (i != 1) {
                return;
            }
            wordAttrCollection.zzQ(12, new zzZV8(i, zzyvh.getAuthor(), zzyvh.zzkT()));
        }
    }

    private static void zzZ(zzYVB zzyvb, zzY6G zzy6g, String str) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        while (zzyu4ZzZsD.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 5 || iZzTP == 6) {
                zzZ(zzyvb, zzy6g, zzyvh, true);
            } else if (iZzTP != 7) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZ(zzyvb, zzy6g, zzyvh, false);
            }
        }
    }

    public static void zzZ(zzYVB zzyvb, boolean z) {
        zzYX6 zzyx3;
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (zzyvh.zzYDj()) {
            if (z) {
                zzyx3 = new zzYXB(zzyvb.getDocument(), zzyvh.getId(), zzyvh.getAuthor(), zzyvh.getName(), zzyvh.zzkT(), zzyvh.zz9d());
            } else {
                zzyx3 = new zzYX3(zzyvb.getDocument(), zzyvh.getId(), zzyvh.getAuthor(), zzyvh.getName(), zzyvh.zzkT(), zzyvh.zz9d());
            }
            if (zzyvh.zzYzg() >= 0 && zzyvh.zzYzf() >= 0) {
                zzyx3.zzOX(zzyvh.zzYzg());
                zzyx3.zzOW(zzyvh.zzYzf());
            }
            zzyvb.zzYK(zzyx3);
            zzyvb.zzXUm.zzZ(new zzYX5(!z ? 1 : 0, zzyvh.getAuthor(), zzyvh.zzkT()), true);
        }
    }

    private static void zzZ(zzYVB zzyvb, zzY6G zzy6g, zzYVH zzyvh, boolean z) {
        WordAttrCollection wordAttrCollection = (WordAttrCollection) zzy6g.zzbn();
        if (wordAttrCollection.zz6D()) {
            wordAttrCollection.zzYpN();
        }
        zzy6g.remove(10010);
        if (z) {
            zzZWE.zzU(zzyvb, zzy6g);
        } else {
            zzZWU.zzX(zzyvb, zzy6g);
        }
        wordAttrCollection.zzX(zzy6g);
        zzy6g.zzZ(new zzZMK(wordAttrCollection, zzyvh.getAuthor(), zzyvh.zzkT()));
    }
}
