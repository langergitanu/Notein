package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYVW extends zzYWI {
    private boolean zzXUK;

    public zzYVW(zzYWB zzywb) {
        super(zzywb, true);
    }

    public void zz9c() throws Exception {
    }

    public void zzYAF() throws Exception {
    }

    public void zzYAH() throws Exception {
    }

    public final void zzYzv() {
        this.zzXUK = true;
    }

    public final void zzYzw() throws Exception {
        this.zzXUK = false;
        Node next = null;
        boolean z = true;
        while (!this.zzXUK && zzF(z, false)) {
            if (next != next()) {
                if (!zzYWt().zzZot()) {
                    if (!next().isComposite()) {
                        zz9c();
                    } else if (zzYVU.zzl(zzZga().zzYA1().getNode(), next())) {
                        zzYAF();
                        z = true;
                    } else {
                        zzZe4();
                    }
                    z = false;
                } else if (next().isComposite() && zzYVU.zzl(zzZga().zzYA2().getNode(), next())) {
                    zzYAH();
                }
                next = next();
            }
        }
    }

    public void zzZe4() throws Exception {
    }
}
