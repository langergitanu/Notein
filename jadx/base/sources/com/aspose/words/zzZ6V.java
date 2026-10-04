package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6V extends zzZ6S {
    private zzYN8 zzYBS;

    public zzZ6V(zzYMD zzymd, zzYN8 zzyn8) {
        super(zzymd);
        this.zzYBS = zzyn8;
    }

    @Override // com.aspose.words.zzZ6S
    public final float getHeight() throws Exception {
        if (this.zzYgm == null) {
            return 0.0f;
        }
        return r0.getHeight() / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final float getWidth() throws Exception {
        if (this.zzYgm == null) {
            return 0.0f;
        }
        return r0.getWidth() / 1000.0f;
    }

    public final boolean isHeader() {
        return ((zzZKY) this.zzYgm).isHeader();
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzYMD zzymd = this.zzYgm;
        if (zzymd == null) {
            return;
        }
        zzZKY zzzky = (zzZKY) zzymd;
        if (zzzky.isHeader()) {
            zzzky.zzZ8m();
        } else {
            zzzky.zzZ8m();
        }
        zzz61.zzY(this);
        zzZ6S.zzZ(zzz61, zzzky.zz6x());
        zzz61.zzX(this);
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZm() {
        if (this.zzYgm == null) {
            return 0.0f;
        }
        return r0.getX() / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final float zzZo() throws Exception {
        if (this.zzYgm == null) {
            return 0.0f;
        }
        return r0.getY() / 1000.0f;
    }

    @Override // com.aspose.words.zzZ6S
    public final com.aspose.words.internal.zzZQ4 zzbL() throws Exception {
        return new com.aspose.words.internal.zzZQ4(-zzZm(), 0.0f, this.zzYBS.getWidth() / 1000.0f, getHeight());
    }
}
