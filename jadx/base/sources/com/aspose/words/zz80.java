package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz80 implements zzZCH {
    private com.aspose.words.internal.zzZYG<zz82> zzZaq;

    public static com.aspose.words.internal.zzZYG<zz82> zzN(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        if (zzzyg == null) {
            return null;
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg2 = new com.aspose.words.internal.zzZYG<>();
        for (zz82 zz82Var : zzzyg.zzCJ()) {
            zzzyg2.set(zz82Var.getUri(), zz82Var.zzZC0());
        }
        return zzzyg2;
    }

    @Override // com.aspose.words.zzZCH
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZaq;
    }

    public final boolean hasExtensions() {
        return this.zzZaq != null;
    }

    @Override // com.aspose.words.zzZCH
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZaq = zzzyg;
    }

    public final com.aspose.words.internal.zzZYG<zz82> zzZBz() {
        return zzN(this.zzZaq);
    }
}
