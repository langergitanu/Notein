package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH3 implements zzZ9H {
    private zzYCZ zzXOw;
    private int zzXvf;
    private boolean zzXvg;
    private int zzXvh;
    private zzYFV zzXvi;
    private zzYHQ zzXvj;
    private zzYHP zzXvk;
    private zzYH3 zzXvl;
    private int zzXvx;
    private zzYFT zzXwE;
    private zzYEF zzZsP;
    private zzYMX zzZsQ;

    public zzYH3(zzYFT zzyft) {
        this.zzXvi = new zzYFV();
        this.zzXvx = -1;
        this.zzXvh = -1;
        this.zzXvf = -1;
        this.zzXwE = zzyft;
        this.zzXvk = zzYHO.zzCw("\\rtf");
        this.zzXvj = new zzYHF(zzyft);
    }

    private static boolean zzY(zzYHP zzyhp) {
        int type;
        return (zzyhp == null || (type = zzyhp.getType()) == 110 || type == 111) ? false : true;
    }

    private zzYCZ zzYin() {
        zzYH3 zzyh3 = this;
        do {
            zzYCZ zzycz = zzyh3.zzXOw;
            if (zzycz != null) {
                return zzycz;
            }
            zzyh3 = zzyh3.zzXvl;
        } while (zzyh3 != null);
        return null;
    }

    private zzYMX zzYio() {
        zzYH3 zzyh3 = this;
        do {
            zzYMX zzymx = zzyh3.zzZsQ;
            if (zzymx != null) {
                return zzymx;
            }
            zzyh3 = zzyh3.zzXvl;
        } while (zzyh3 != null);
        return null;
    }

    private zzYEF zzYip() {
        zzYH3 zzyh3 = this;
        do {
            zzYEF zzyef = zzyh3.zzZsP;
            if (zzyef != null) {
                return zzyef;
            }
            zzyh3 = zzyh3.zzXvl;
        } while (zzyh3 != null);
        return null;
    }

    private int zzYiq() {
        return this.zzXwE.zzJ(0, 0);
    }

    public final zzYMX zzRo(boolean z) {
        zzZNS.zzZ(zzZYj());
        zzYMX zzymx = (zzYMX) zzZYj().zzbn();
        int iZzYiq = zzYiq();
        int iZzZ7j = zzZYj().zzVE(1000) ? zzZYj().zzZ7j() : iZzYiq;
        Style styleZzVp = this.zzXwE.getDocument().getStyles().zzVp(iZzZ7j, 0);
        if (styleZzVp.getType() != 1) {
            styleZzVp = this.zzXwE.getDocument().getStyles().zzVp(0, 0);
        }
        if (!zzZYj().zzVE(1000) && iZzYiq != 0) {
            zzymx.zzBl(iZzZ7j);
        }
        zzYMX zzymx2 = new zzYMX();
        if (z) {
            TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(this.zzXwE.getDocument().getStyles().zzZ8(this.zzXwE.zzYhj().zzZYf().zzZ7j(), false), TableStyle.class);
            if (tableStyle != null) {
                zzymx2 = (zzYMX) styleZzVp.zzZYj().zzbn();
                if (styleZzVp.zzY3j() != null) {
                    zzymx2.zzX(tableStyle.zzZYj());
                } else {
                    tableStyle.zzZYj().zzY(zzymx2);
                }
            }
        }
        styleZzVp.zzZYj().zzY(zzymx2);
        zzYEO.zzX(zzymx2, zzymx);
        this.zzXwE.getDocument().getLists().zzZ(zzymx, zzymx2);
        zzymx.zzX(zzymx2, 1000);
        return zzymx;
    }

    public final int zzYWo() {
        return this.zzXvf;
    }

    public final zzYHP zzYiN() {
        return this.zzXvk;
    }

    public final void zzYif() {
        this.zzXvg = true;
    }

    public final boolean zzYig() {
        return this.zzXvg;
    }

    public final zzYH3 zzYih() {
        return this.zzXvl;
    }

    public final int zzYii() {
        return this.zzXvh;
    }

    public final int zzYij() {
        return this.zzXvx;
    }

    public final zzYFV zzYik() {
        return this.zzXvi;
    }

    public final boolean zzYil() {
        zzYH3 zzyh3 = this.zzXvl;
        return (zzyh3 != null && this.zzXvk == zzyh3.zzXvk && this.zzXvj == zzyh3.zzXvj) ? false : true;
    }

    public final zzYHQ zzYim() {
        return this.zzXvj;
    }

    public final zzYEF zzYir() {
        zzYEF zzyef = (zzYEF) this.zzXwE.zzXt7.zzbn();
        zzZYh().zzY(zzyef);
        if (this.zzXvi.getBidi() && !zzyef.contains(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2)) {
            zzyef.setLocaleIdBi(this.zzXwE.zzYgm().getLocaleIdBi());
        }
        zzYEF zzyef2 = new zzYEF();
        this.zzXwE.getDocument().getStyles().zzVp(zzZYj().zzVE(1000) ? zzZYj().zzZ7j() : zzYiq(), 0).zzZYh().zzY(zzyef2);
        Style styleZzVp = this.zzXwE.getDocument().getStyles().zzVp(zzZYh().zzZ7j(), 10);
        if (styleZzVp.getType() != 2) {
            zzyef.remove(50);
        } else if (styleZzVp.zzZ7j() != 10) {
            styleZzVp.zzZYh().zzY(zzyef2);
        }
        zzyef.zzX(zzyef2, 50);
        return zzyef;
    }

    public final zzYCZ zzYvR() {
        if (this.zzXOw == null) {
            zzYCZ zzyczZzYin = zzYin();
            this.zzXOw = zzyczZzYin != null ? (zzYCZ) zzyczZzYin.zzbn() : new zzYCZ();
        }
        return this.zzXOw;
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        if (this.zzZsP == null) {
            zzYEF zzyefZzYip = zzYip();
            if (zzyefZzYip != null) {
                zzYEF zzyef = (zzYEF) zzyefZzYip.zzbn();
                this.zzZsP = zzyef;
                zzyef.remove(StyleIdentifier.BIBLIOGRAPHY);
            } else {
                zzYEF zzyef2 = new zzYEF();
                this.zzZsP = zzyef2;
                zzyef2.zzQ(190, 24);
                this.zzZsP.zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, 24);
            }
        }
        return this.zzZsP;
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        if (this.zzZsQ == null) {
            zzYMX zzymxZzYio = zzYio();
            if (zzymxZzYio != null) {
                this.zzZsQ = (zzYMX) zzymxZzYio.zzbn();
            } else {
                zzYMX zzymx = new zzYMX();
                this.zzZsQ = zzymx;
                zzYEO.zzG(zzymx);
            }
        }
        return this.zzZsQ;
    }

    public final void zzoQ(int i) {
        this.zzXvf = i;
    }

    public final void zzoR(int i) {
        this.zzXvh = i;
    }

    public final void zzoS(int i) {
        this.zzXvx = i;
    }

    public zzYH3(zzYFT zzyft, zzYH3 zzyh3, zzYHP zzyhp) throws Exception {
        this.zzXvi = new zzYFV();
        this.zzXvx = -1;
        this.zzXvh = -1;
        this.zzXvf = -1;
        this.zzXwE = zzyft;
        this.zzXvl = zzyh3;
        this.zzXvx = zzyh3.zzXvx;
        this.zzXvh = zzyh3.zzXvh;
        if (zzY(zzyhp)) {
            this.zzXvk = zzyhp;
            this.zzXvj = this.zzXvl.zzXvj.zzZ(zzyhp);
        } else {
            zzYH3 zzyh32 = this.zzXvl;
            this.zzXvk = zzyh32.zzXvk;
            this.zzXvj = zzyh32.zzXvj;
        }
    }
}
