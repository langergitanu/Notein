package com.aspose.words;

import com.aspose.slides.C22218Oooo;

/* JADX INFO: loaded from: classes6.dex */
class zzZ68 extends zzZ6H {
    private zzYC5 zzYfa;
    private zzZ6L zzYfb;

    public zzZ68(zzYMD zzymd) throws Exception {
        super(zzymd);
    }

    private boolean zz7(com.aspose.words.internal.zzG zzg) {
        float fZzXG = zzYVU.zzXG(((zzY9X) this.zzYgm).zzY53().getNode());
        if (fZzXG == 0.0f) {
            return false;
        }
        long jZzB = com.aspose.words.internal.zzJ6.zzB(this.zzYfa.zz7s());
        int i = (int) jZzB;
        zzg.zzZO().zzY(-Float.intBitsToFloat(i), -com.aspose.words.internal.zzZPY.zzYC(jZzB), 1);
        zzg.zzZO().zzX(-fZzXG, 1);
        zzg.zzZO().zzY(com.aspose.words.internal.zzZPY.zzYC(jZzB), Float.intBitsToFloat(i), 1);
        return true;
    }

    private com.aspose.words.internal.zzG zzT(zzZ6R zzz6r) throws Exception {
        zzY63 zzy63;
        if (((zzY9X) this.zzYgm).zzY50()) {
            zzy63 = new zzY63((zzY9X) this.zzYgm);
            zzy63.zzX(zzz6r);
        } else {
            zzy63 = null;
        }
        zzY63 zzy632 = zzy63;
        int iZzYSP = zzz6r.zzYSP();
        int iZzYSO = zzz6r.zzYSO();
        Document document = (Document) ((zzY9X) this.zzYgm).zzY53().getNode().getDocument();
        document.zzZqg().setTextShaperFactory(zzz6r.getTextShaperFactory());
        zz2L zz2l = new zz2L(document.getWarningCallback(), iZzYSP, iZzYSO, zzy632, document.zzZqf());
        ShapeBase shapeBase = (ShapeBase) ((zzY9X) this.zzYgm).zzY53().getNode();
        zzYC5 zzyc5 = new zzYC5(shapeBase);
        this.zzYfa = zzyc5;
        com.aspose.words.internal.zzG zzgZzY = zzY(zz2l.zzZ(zzyc5, zzz6r.zzYT1() || !this.zzYfa.zz7u().zzYaa()), shapeBase);
        zzX(zzgZzY, ((ShapeBase) ((zzY9X) this.zzYgm).zzY53().getNode()).zzYvW().isInline());
        return zzgZzY;
    }

    public static zzYC5 zzU(zzY9X zzy9x) throws Exception {
        zzZ68 zzz68 = new zzZ68(zzy9x);
        zzz68.zzV(zzy9x.zza8());
        return zzz68.zzYfa;
    }

    private void zzX(com.aspose.words.internal.zzG zzg, boolean z) {
        if (zzg == null) {
            return;
        }
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        } else {
            zzg.zzW(new com.aspose.words.internal.zzP9(zzg.zzZO().zzOf(), zzg.zzZO().zzOe(), zzg.zzZO().zzOd(), zzg.zzZO().zzOc(), 0.0f, 0.0f));
        }
        boolean zZz7 = z ? zz7(zzg) : false;
        com.aspose.words.internal.zzZQ4 zzzq4Zz7s = this.zzYfa.zz7s();
        zzg.zzZO().zzY(-(zZz7 ? zzzq4Zz7s.zzZo() : zzzq4Zz7s.zzZm()), -(zZz7 ? this.zzYfa.zz7s().zzZm() : this.zzYfa.zz7s().zzZo()), 1);
    }

    private static com.aspose.words.internal.zzG zzY(com.aspose.words.internal.zzG zzg, ShapeBase shapeBase) {
        if (!shapeBase.zzZ4E() || shapeBase.zzYaa() || shapeBase.zzYa9() || shapeBase.zzYa8()) {
            return zzg;
        }
        if (zzg.zzZO() != null) {
            zzg.zzW(new com.aspose.words.internal.zzP9(zzg.zzZO().zzOf(), zzg.zzZO().zzOe(), zzg.zzZO().zzOd(), zzg.zzZO().zzOc(), 0.0f, 0.0f));
        }
        com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(WarningType.HINT);
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(shapeBase.getMarkupLanguage() == 0 ? "d" : "v");
        sbOooO0OO.append(Integer.toString(shapeBase.getId()));
        zzzs.setTag(sbOooO0OO.toString());
        zzzs.zzX(zzg);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzX(zzzs);
        return zzg2;
    }

    private float zzYRC() throws Exception {
        return this.zzYgm.zzZZJ().zzZXS() / 1000.0f;
    }

    private com.aspose.words.internal.zzG zzYRD() throws Exception {
        return (com.aspose.words.internal.zzG) ((zzZ6J) ((zzY9X) this.zzYgm).zzY53()).zzYS1().zzYGn().zz1();
    }

    private boolean zzYRw() throws Exception {
        return ((zzbz().isImage() || zzbz().zzZid() || zzbz().isWordArt() || zzbz().hasSmartArt() || zzbz().hasChart()) && zz14().zzY6M().zzYLJ().getWrapType() == 0 && (zz14().zzaa().zzbD() || zz14().zzaa().zzZ4E())) && !(((zzZ55) zz14().zzZZJ()).zzYQf() || zzYJP.zzk((zzZ55) zz14().zzZZJ()) > 0) && (zz14().getBaseline() - zz14().getContentHeight() < 0 || zz14().getBaseline() > ((zzZ55) zz14().zzZZJ()).getHeight());
    }

    private boolean zzYRx() throws Exception {
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(getNode(), ShapeBase.class);
        return ((zzZ55) zz14().zzZZJ()).zzYPS() > 0 && zz14().zzY75() && !(shapeBase != null && shapeBase.zzYvW() != null && com.aspose.words.internal.zzZKO.equals(Boolean.TRUE, shapeBase.zzYvW().zzPj(1343)));
    }

    private int zzYRy() {
        return this.zzYgm.zza7().zzYMw();
    }

    private zzZ6L zzbz() {
        if (this.zzYfb == null) {
            this.zzYfb = zzZ6L.zzYT(getNode());
        }
        return this.zzYfb;
    }

    public final Node getNode() {
        return ((zzY9X) this.zzYgm).zzY53().getNode();
    }

    public final boolean isInline() throws Exception {
        return zzbz().isInline();
    }

    public final String zzBC() {
        zzZ6L zzz6lZzY53 = ((zzY9X) zz14()).zzY53();
        return zzz6lZzY53.getNode() instanceof ShapeBase ? ((ShapeBase) zzz6lZzY53.getNode()).getAlternativeText() : "";
    }

    @Override // com.aspose.words.zzZ6H
    public final boolean zzM8() throws Exception {
        return zzbz().isInline() && super.zzM8();
    }

    public final com.aspose.words.internal.zzG zzV(zzZ6R zzz6r) throws Exception {
        int nodeType = ((zzY9X) this.zzYgm).zzY53().getNode().getNodeType();
        if (nodeType == 17 || nodeType == 18) {
            return ((ShapeBase) ((zzY9X) this.zzYgm).zzY53().getNode()).getMarkupLanguage() == 1 ? zzU(zzz6r) : zzT(zzz6r);
        }
        if (nodeType == 35) {
            return zzYRD();
        }
        throw new IllegalStateException("Unexpected node type.");
    }

    public final boolean zzYRA() {
        if (zzbz().isWordArt() || zzbz().zzZid() || (zzbz().isImage() && !zzbz().zzYS7())) {
            return true;
        }
        if (zzYRy() > 11) {
            return false;
        }
        return zzbz().hasChart() || zzbz().isImage();
    }

    public final boolean zzYRB() {
        if (zzbz().isWordArt() || zzbz().zzZid() || (zzbz().isImage() && !zzbz().zzYS7())) {
            return true;
        }
        return zzYRy() <= 11 && !zzbz().zzYS8() && zzbz().isImage();
    }

    @Override // com.aspose.words.zzZ6H
    public final boolean zzYRQ() throws Exception {
        int iZzYMw;
        if (!super.zzYRQ() || !zzbz().isInline()) {
            return false;
        }
        if (getFont().getDoubleStrikeThrough() && zzYRA()) {
            return false;
        }
        if (zzbz().zzYS8() || zzbz().zzZid() || zzbz().isImage() || (iZzYMw = this.zzYgm.zza7().zzYMw()) > 12) {
            return true;
        }
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(((zzY9X) this.zzYgm).zzY53().getNode(), ShapeBase.class);
        if (shapeBase.zzY9P()) {
            return false;
        }
        if (((zzY9X) this.zzYgm).zzY53().getNode().getNodeType() != 17 || iZzYMw >= 12) {
            return shapeBase.getShapeType() <= 0 || shapeBase.getShapeType() >= 136;
        }
        return false;
    }

    public final boolean zzYRz() throws Exception {
        if ((((zzY9X) this.zzYgm).zzaa() instanceof zzUH) || zzbz().zzYS8()) {
            return false;
        }
        if (zzbz().isInline() && zzbz().zzZid()) {
            return false;
        }
        return (this.zzYgm.zza7().zzYMw() <= 11 && zzbz().isImage() && zzbz().isInline() && this.zzYgm.zzZZJ().zzZZJ().zz60() == 16 && !zzbz().zzYS3()) ? false : true;
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzz61.zzZ(this);
    }

    @Override // com.aspose.words.zzZ6H, com.aspose.words.zzZ6S
    public final long zzZT() throws Exception {
        zzZNO zzznoZzR;
        if (zz14().zzY6M().zzYLJ().isFloating() && (zzznoZzR = zzZNO.zzR(zz14())) != null) {
            long jZzF = com.aspose.words.internal.zzSA.zzF(zzznoZzR.zzZ8S());
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzF), com.aspose.words.internal.zzZPY.zzYC(jZzF) + zzYRW());
        }
        return super.zzZT();
    }

    public final zzYC5 zzZua() {
        return this.zzYfa;
    }

    @Override // com.aspose.words.zzZ6S
    public final com.aspose.words.internal.zzZQ4 zzbL() throws Exception {
        float width;
        float x;
        int height;
        if (!zzmS()) {
            return com.aspose.words.internal.zzZQ4.zz2T;
        }
        zzYC5 zzyc5 = this.zzYfa;
        if (zzyc5 == null || zzyc5.zz7s().getWidth() <= 0.0f) {
            width = zz14().getWidth() / 1000.0f;
            x = 0.0f;
        } else {
            x = this.zzYfa.zz7s().getX();
            width = this.zzYfa.zz7s().getWidth();
        }
        if (zzYRx()) {
            zzYCO zzycoZzZ = zz5.zzZ(zz14(), x, width);
            float fZzYbM = zzycoZzZ.zzYbM();
            width = zzycoZzZ.getLength();
            x = fZzYbM;
        }
        int baseline = zz14().getBaseline() - zz14().getContentHeight();
        float y = baseline <= 0 ? (-baseline) / 1000.0f : 0.0f;
        zzYC5 zzyc52 = this.zzYfa;
        if (zzyc52 != null) {
            y += zzyc52.zz7s().getY();
        }
        if (zzYRw()) {
            int height2 = ((zzZ55) zz14().zzZZJ()).getHeight();
            if (baseline > 0) {
                height2 -= baseline;
            }
            height = Math.max(0, height2);
        } else {
            height = zz14().getHeight();
        }
        return new com.aspose.words.internal.zzZQ4(x, y, width, height / 1000.0f);
    }

    public final boolean zzmS() throws Exception {
        return zzYRw() || zzYRx();
    }

    private com.aspose.words.internal.zzG zzU(zzZ6R zzz6r) throws Exception {
        zzY63 zzy63;
        if (((zzY9X) this.zzYgm).zzY50()) {
            zzy63 = new zzY63((zzY9X) this.zzYgm);
            zzy63.zzX(zzz6r);
        } else {
            zzy63 = null;
        }
        float fZzYRC = zzYRC();
        ShapeBase shapeBase = (ShapeBase) ((zzY9X) this.zzYgm).zzY53().getNode();
        Document documentZzYBb = shapeBase.zzYBb();
        this.zzYfa = new zzYC5(shapeBase, fZzYRC);
        com.aspose.words.internal.zzG zzgZzY = zzY(new zzYCF(zzy63, documentZzYBb.getWarningCallback(), ((Document) ((zzY9X) this.zzYgm).zzY53().getNode().getDocument()).zzZqf()).zzZ(this.zzYfa, zzz6r.zzYT1() || !shapeBase.zzYaa()), shapeBase);
        zzX(zzgZzY, this.zzYfa.zz7u().isInline());
        return zzgZzY;
    }
}
