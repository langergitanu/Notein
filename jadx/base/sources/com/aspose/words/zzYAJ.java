package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAJ extends zzYAU {
    private String zzXcr;

    public zzYAJ(String str) {
        this.zzXcr = str;
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() {
        return this.zzXcr;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYAJ zzyaj = new zzYAJ(getText());
        zzZB(zzyaj);
        return zzyaj;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZXS() {
        char cCharAt = this.zzXcr.charAt(0);
        if (cCharAt != 1564 && cCharAt != 8206 && cCharAt != 8207) {
            switch (cCharAt) {
                case 8234:
                case 8235:
                case 8236:
                case 8237:
                case 8238:
                    break;
                default:
                    return zzY6N().zzZr().zz5(this.zzXcr);
            }
        }
        return 0;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return 9754;
    }
}
