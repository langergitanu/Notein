package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM2 extends zzZMB {
    private zzY9N zzYvF;

    public zzZM2(DocumentBase documentBase, zzY9N zzy9n) {
        super(documentBase, zzy9n);
        this.zzYvF = zzy9n;
    }

    private boolean zz40() {
        if (this.zzYvF.getOrientation() != 0) {
            return this.zzYvF.getOrientation() == -1 && this.zzYvF.getHeight() >= this.zzYvF.getWidth();
        }
        return true;
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() {
        if (zz40()) {
            float fZzZn = (zzZ67().zzZn() + zzZ67().zzZo()) / 2.0f;
            zzX(2, com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm(), zzZ67().zzZo(), zzZ67().zzkw(), fZzZn));
            zzX(3, com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm(), fZzZn, zzZ67().zzkw(), zzZ67().zzZn()));
            return;
        }
        float fZzkw = (zzZ67().zzkw() + zzZ67().zzZm()) / 2.0f;
        zzX(0, com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm(), zzZ67().zzZo(), fZzkw, zzZ67().zzZn()));
        zzX(1, com.aspose.words.internal.zzZQ4.zzX(fZzkw, zzZ67().zzZo(), zzZ67().zzkw(), zzZ67().zzZn()));
    }
}
