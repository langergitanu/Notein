package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFA extends zzYHS {
    public zzYFA(zzYFT zzyft) {
        super(zzyft);
    }

    private int zzYhQ() {
        return this.zzXw4.zzYgo().zzYiL().zzYiN().getType();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) {
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() {
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ == 130) {
            this.zzXw4.zzT(1, "Nested TOC entries are not allowed.");
            return;
        }
        switch (iZzYhQ) {
            case 256:
                this.zzXw4.zzT(1, "Theme Data is not supported.");
                break;
            case 257:
                this.zzXw4.zzT(1, "Colors Schema Mapping is not supported.");
                break;
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                this.zzXw4.zzT(1, "Data store is not supported.");
                break;
            default:
                super.zzZ(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        if (type != 130) {
            switch (type) {
                case 256:
                case 257:
                case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                    break;
                default:
                    return super.zzZ(zzyhp);
            }
        }
        return this;
    }
}
