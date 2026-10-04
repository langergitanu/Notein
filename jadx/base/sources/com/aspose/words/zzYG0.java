package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYG0 extends zzYHQ implements zzZ9H {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\ipgp", "\\itap");
    private zzZK1 zzXtN;
    private zzYI1 zzXvo;
    private zzYG4 zzXvr;

    public zzYG0(zzYFT zzyft) {
        super(zzyft);
        this.zzXvr = new zzYG4(zzyft, this);
        this.zzXvo = new zzYI1(zzyft);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzXtN.setParentId(zzyet.zzYeT());
        } else if (iZzTP == 1) {
            this.zzXtN.zzAa(zzyet.zzYeT());
        } else {
            if (this.zzXvr.zzX(zzyet)) {
                return;
            }
            this.zzXvo.zzX(zzyet);
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() != 266) {
            return;
        }
        zzZNS.zzZ(this.zzXtN.zzZYj());
        zzZ(this.zzXtN.zzZYj(), 1160, 1592);
        zzZ(this.zzXtN.zzZYj(), EditingLanguage.BRETON, 1593);
        zzZ(this.zzXtN.zzZYj(), 1200, 1594);
        zzZ(this.zzXtN.zzZYj(), 1220, 1595);
        this.zzXtN.zzZ4i();
        this.zzXw4.getDocument().zzZq2().zzZ(this.zzXtN);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        if (zzYiN().getType() != 266) {
            return;
        }
        this.zzXtN = new zzZK1(this.zzXw4.getDocument().zzZq2().getCount() + 1);
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        return null;
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        return this.zzXtN.zzZYj();
    }

    private static void zzZ(zzZS zzzs, int i, int i2) {
        zzzs.zzP(i2, zzzs.zzPk(i));
        zzzs.remove(i);
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        if (zzyhp.getType() != 266) {
            return null;
        }
        return this;
    }
}
