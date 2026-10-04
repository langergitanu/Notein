package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYG9 extends zzYOM {
    private int zzXSv;

    public zzYG9(Document document) {
        super(document, 30);
    }

    @Override // com.aspose.words.zzYOM
    public final int zzX(OfficeMath officeMath, zzZYM zzzym) throws Exception {
        if (this.zzXSv == 1) {
            ((Shape) com.aspose.words.internal.zzQW.zzZ((Map<OfficeMath, TValue>) zzZn7(), officeMath)).accept(zzzym);
        }
        this.zzXSv--;
        return super.zzX(officeMath, zzzym);
    }

    @Override // com.aspose.words.zzYOM
    public final void zzY(OfficeMath officeMath, Shape shape) {
    }

    @Override // com.aspose.words.zzYOM
    public final boolean zzZ(OfficeMath officeMath, zzZYM zzzym) throws Exception {
        if (this.zzXSv != 1) {
            return false;
        }
        Shape shapeZzl = zzYOM.zzl(officeMath);
        com.aspose.words.internal.zzZQF.zzY(zzZn7(), officeMath, shapeZzl);
        com.aspose.words.internal.zzZQF.zzY(zzZn6(), shapeZzl, officeMath);
        shapeZzl.setShapeAttr(780, "");
        return false;
    }

    @Override // com.aspose.words.zzYOM
    public final int zzY(OfficeMath officeMath, zzZYM zzzym) throws Exception {
        this.zzXSv++;
        return super.zzY(officeMath, zzzym);
    }
}
