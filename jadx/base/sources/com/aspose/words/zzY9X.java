package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class zzY9X extends zzYAU implements zzZ99, zzZ9B {
    private static zzZVF zzXbr = new zzZVF();
    private int mLength = -1;
    private zzYC4 zzXbs;
    private zzY9X zzXbt;
    private zzY9X zzXbu;
    private zzYBY zzXbv;
    private zzZ6L zzXbw;
    private com.aspose.words.internal.zzZL zzZFE;

    public zzY9X(Node node) {
        zzZ6L zzz6lZzYT = zzZ6L.zzYT(node);
        this.zzXbw = zzz6lZzYT;
        zzz6lZzYT.zzV(this);
    }

    private com.aspose.words.internal.zzZL zzU(zzZ68 zzz68) throws Exception {
        com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(0);
        new zzZ5G(zz5.zzZ(this, zzzs), new zzYTZ(), zzz68.getNode().getDocument().zzZqy(), false).zzX(zzz68);
        return zzzs;
    }

    private zzZ9B zzY4X() {
        return this.zzXbw.getNode() instanceof zzZ9B ? (zzZ9B) this.zzXbw.getNode() : zzXbr;
    }

    private int zzY4Z() {
        return zzY6M().isHorizontalRule() ? 2500 : 0;
    }

    private int zzY58() throws Exception {
        if (((zzZ6J) com.aspose.words.internal.zzZKW.zzZ(this.zzXbw, zzZ6J.class)) == null || ((zzZ37) zzY6S().zzYTt()).zzYLJ().isFloating()) {
            return 0;
        }
        return getContentHeight() - com.aspose.words.internal.zzSA.zzn((zzY6N().zzZr().getAscentPoints() / 2.0f) + r0.zzYS1().zzYGq());
    }

    private boolean zzY9P() {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(this.zzXbw.getNode(), Shape.class);
        if (shape == null) {
            return false;
        }
        boolean z = (!this.zzXbw.hasChildNodes() && this.zzXbu == null && this.zzXbt == null) ? false : true;
        if (z) {
            shape.getMarkupLanguage();
        }
        return z;
    }

    public static boolean zzZf(zzYAU zzyau) throws Exception {
        if (zzyau != null && 25604 == zzyau.zzZo6()) {
            return ((zzY9X) zzyau).zzXbw.zzYS6();
        }
        return false;
    }

    private static zzYIA zzf(zzYMD zzymd) {
        zzYIA zzyia = null;
        do {
            zzymd = zzymd.zzqh(8);
            if (zzymd != null) {
                zzyia = (zzYIA) zzymd;
                zzymd = zzymd.zzZZJ();
            }
        } while (zzymd != null);
        return zzyia;
    }

    @Override // com.aspose.words.zzYAU
    public final int getBaseline() throws Exception {
        return super.getBaseline() + zzY58();
    }

    @Override // com.aspose.words.zzYAU, com.aspose.words.zzYMD
    public final int getContentHeight() throws Exception {
        return com.aspose.words.internal.zzSA.zzn((float) this.zzXbw.getHeight());
    }

    @Override // com.aspose.words.zzYAU, com.aspose.words.zzYMD
    public final int getHeight() throws Exception {
        return zzY6M().zzYLJ().getWrapType() == 0 ? super.getHeight() : zzYjN() + zzYjL();
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean getNoSpaceRaiseLower() {
        return false;
    }

    public final Node getNode() {
        return this.zzXbw.getNode();
    }

    @Override // com.aspose.words.zzZ99
    public final String getScreenTip() {
        return this.zzXbw.getScreenTip();
    }

    @Override // com.aspose.words.zzZ9B
    public int getZOrder_IShape() throws Exception {
        return zzY4X().getZOrder_IShape();
    }

    @Override // com.aspose.words.zzYAU
    public final boolean isHorizontalRule() {
        return zzY6M().isHorizontalRule();
    }

    @Override // com.aspose.words.zzYAU, com.aspose.words.zzYMD
    public final void remove() throws Exception {
        super.remove();
    }

    @Override // com.aspose.words.zzYMD
    public final void zzF(com.aspose.words.internal.zzZL zzzl) {
        zzYC4 zzyc4ZzQo;
        if (zzzl != null || (zzyc4ZzQo = zzQo(false)) == null) {
            return;
        }
        zzYMD.zzs(zzyc4ZzQo);
    }

    @Override // com.aspose.words.zzYAU
    public final int zzHU() throws Exception {
        if (zzYol()) {
            return 0;
        }
        return zzY4Z() + (zzY6N().getUnderline() != 0 ? super.zzHU() : 0) + zzY58();
    }

    @Override // com.aspose.words.zzYAU
    public final int zzHV() throws Exception {
        if (zzYol()) {
            return 0;
        }
        return zzYRO() ? zzYLR.zzYb(zzY6N().zzZr().zzPg()) : (getContentHeight() + zzY4Z()) - zzY58();
    }

    public final long zzK(zzYN8 zzyn8) throws Exception {
        zzYIA zzyiaZzf;
        if (zzyn8 == zzZ8m() || !zzaa().zzbD() || (zzyiaZzf = zzf(this)) == null || !((zzYIC) zzyiaZzf.zza9()).zzBz()) {
            return 0L;
        }
        int iZzYMf = zzY6M().zzYLJ().zzYMf();
        int iZzYMd = zzY6M().zzYLJ().zzYMd();
        boolean z = true;
        boolean z2 = zzY57() || iZzYMf == 2;
        if (!zzY57() && iZzYMd != 3 && iZzYMd != 2) {
            z = false;
        }
        return com.aspose.words.internal.zzZPY.zzG((z2 ? (int) zzyn8.zzYqh() : 0) / 1000.0f, (z ? (int) (zzyn8.zzYqh() >> 32) : 0) / 1000.0f);
    }

    public final void zzQ(zzY9X zzy9x) {
        this.zzXbt = zzy9x;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYBY zzQJ(boolean z) {
        if (this.zzXbv == null && z) {
            this.zzXbv = new zzYBY(this);
        }
        return this.zzXbv;
    }

    public final zzYC4 zzQo(boolean z) {
        if (this.zzXbs == null && z) {
            this.zzXbs = new zzYC4(this);
        }
        return this.zzXbs;
    }

    public final void zzR(zzY9X zzy9x) {
        this.zzXbu = zzy9x;
    }

    public final boolean zzY4Y() {
        if (this.zzXbw.getNode().getNodeType() != 35) {
            return false;
        }
        OfficeMath officeMath = (OfficeMath) this.zzXbw.getNode();
        return (officeMath.zzYGb() || officeMath.zzYGa()) ? false : true;
    }

    public final boolean zzY50() {
        return zzY9P() || zzZ(this, (Map<zzZ92, zzY9X>) null);
    }

    public final void zzY51() {
        this.zzXbs = null;
    }

    public final zzYC4 zzY52() {
        return zzQo(true);
    }

    public final zzZ6L zzY53() {
        return this.zzXbw;
    }

    public final zzY9X zzY54() {
        zzY9X zzy9x = this;
        while (true) {
            zzY9X zzy9x2 = zzy9x.zzXbu;
            if (zzy9x2 == null) {
                return zzy9x;
            }
            zzy9x = zzy9x2;
        }
    }

    public final zzY9X zzY55() {
        return this.zzXbt;
    }

    public final zzY9X zzY56() {
        return this.zzXbu;
    }

    public final boolean zzY57() {
        zzZ39 zzz39ZzYLJ = zzY6M().zzYLJ();
        if (((zzYBL) ((zzZ55) zzZZJ()).zzZZJ()).zz60() == 16) {
            return zzY6M().zzYL9() || zzz39ZzYLJ.zzYMf() == 3 || zzz39ZzYLJ.zzYMd() == 3 || zza7().zzZYM();
        }
        return false;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY70() {
        int wrapType = zzY6M().zzYLJ().getWrapType();
        return wrapType == 1 || wrapType == 2 || wrapType == 4 || wrapType == 5;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzY9X zzy9x = new zzY9X(this.zzXbw.getNode());
        zzy9x.zzlT(zzYTl());
        zzy9x.mLength = this.mLength;
        zzy9x.zzZ(zzaa());
        zzYBY zzyby = this.zzXbv;
        if (zzyby != null) {
            zzy9x.zzXbv = zzyby.zzS(zzy9x);
        }
        zzZB(zzy9x);
        return zzy9x;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY7g() throws Exception {
        return ((zzZ37) ((zzYMM) ((zzZ55) zzZZJ()).zza9()).zzYTt()).getLineSpacingRule() != 0 && zza7().zzZYM() && !zzY4Y() && getContentHeight() > 0;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7n() {
        return 5;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYRO() throws Exception {
        return zzY7r() == 5121;
    }

    @Override // com.aspose.words.zzZ99
    public final String zzYWa() {
        return this.zzXbw.zzZe();
    }

    @Override // com.aspose.words.zzYMD
    public final long zzYqr() throws Exception {
        if (!zzY6M().zzYLJ().isFloating()) {
            return super.zzYqr();
        }
        zzZNO zzznoZzR = zzZNO.zzR(this);
        if (zzznoZzR == null) {
            return 0L;
        }
        return zzznoZzR.zzZ8S();
    }

    @Override // com.aspose.words.zzYAU
    public final void zzZ(Map<zzYAU, zzYAU> map, zzYAU zzyau) {
        zzY9X zzy9x;
        super.zzZ(map, zzyau);
        zzY9X zzy9x2 = ((zzY9X) zzyau).zzXbt;
        if (zzy9x2 == null || (zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ((zzYAU) com.aspose.words.internal.zzQW.zzZ((Map<zzY9X, TValue>) map, zzy9x2), zzY9X.class)) == null) {
            return;
        }
        this.zzXbt = zzy9x;
        zzy9x.zzXbu = this;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZXS() throws Exception {
        if (!zzY6M().isHorizontalRule()) {
            return com.aspose.words.internal.zzSA.zzn((float) this.zzXbw.getWidth());
        }
        zzY6M().zzYLJ();
        return Math.max(0, zzZZJ().getWidth());
    }

    @Override // com.aspose.words.zzZ99
    public final String zzZkA() {
        return this.zzXbw.getHRef();
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return 25604;
    }

    @Override // com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (this.zzZFE == null) {
            this.zzZFE = zzU(new zzZ68(this));
        }
        return this.zzZFE;
    }

    public static boolean zzZ(zzY9X zzy9x, Map<zzZ92, zzY9X> map) {
        if (zzy9x.zzY6Z()) {
            return false;
        }
        if (zzy9x.zzXbw.getNode().getNodeType() == 17) {
            ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(zzy9x.zzXbw.getNode(), ShapeBase.class);
            zzYBY zzybyZzQJ = zzy9x.zzQJ(shapeBase != null && shapeBase.getMarkupLanguage() == 0);
            zzybyZzQJ.zzY4s().reset();
            while (zzybyZzQJ.zzY4s().moveNext() && !zzybyZzQJ.zzY4s().isLast()) {
                if (zzZ((zzY9X) zzybyZzQJ.zzY4s().zzYPi(), map) && map == null) {
                    return true;
                }
            }
        } else if (zzy9x.zzXbu != null || zzy9x.zzXbw.hasChildNodes()) {
            if (map != null) {
                com.aspose.words.internal.zzZQF.zzY(map, (zzZ92) zzy9x.zzXbw.getNode(), zzy9x);
            }
            return true;
        }
        return false;
    }
}
