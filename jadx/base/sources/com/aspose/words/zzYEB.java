package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEB extends zzYEE {
    private com.aspose.words.internal.zzFQ<String> zzYPO;
    private Theme zzYTf;

    private void zzYdu() {
        if (this.zzYTf != null) {
            for (int i : zzYEF.zzXqa) {
                String fontName = this.zzYTf.getFontName(i);
                if (com.aspose.words.internal.zzZYD.zzXk(fontName)) {
                    this.zzYPO.add(fontName);
                }
            }
        }
        this.zzYPO.add(zzYEF.zzYdx());
        zzYEF.zzOt(270);
        zzYEF.zzOt(230);
        zzYEF.zzOt(235);
        zzYEF.zzOt(230);
        zzYEF.zzOt(240);
        zzYEF.zzOt(230);
    }

    private void zzs(zzYEF zzyef) {
        for (int i : zzYEF.zzXq6) {
            zzU1 zzu1 = (zzU1) zzyef.zzPk(i);
            if (zzu1 != null) {
                this.zzYPO.add(zzU1.zzZ(zzu1, this.zzYTf));
            }
        }
    }

    public final void zzZ(DocumentBase documentBase, com.aspose.words.internal.zzFQ<String> zzfq) throws Exception {
        this.zzYTf = documentBase.zzZqI();
        this.zzYPO = zzfq;
        documentBase.accept(this);
        if (this.zzYPO != null) {
            zzYdu();
        }
    }

    @Override // com.aspose.words.zzYEE
    public final void zzt(zzYEF zzyef) {
        if (zzyef == null) {
            return;
        }
        if (this.zzYPO != null) {
            zzs(zzyef);
            if (zzyef.zz6D()) {
                zzs((zzYEF) zzyef.zzYsN().zzZ6C());
            }
        }
        zzY5J.zzZ(zzyef, this.zzYTf);
    }
}
