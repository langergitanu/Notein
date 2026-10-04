package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWZ {
    private zzZJY zzYnt;
    private zzYMX zzYnx;
    private zzZK3 zzYqv;
    private DocumentBuilder zzZwh;
    private boolean zzYnB = false;
    private com.aspose.words.internal.zzZQC<Paragraph> zzYnu = new com.aspose.words.internal.zzZQC<>();

    public zzYWZ(zzZK3 zzzk3, DocumentBuilder documentBuilder, zzYMX zzymx, zzZJY zzzjy) {
        this.zzYqv = zzzk3;
        this.zzZwh = documentBuilder;
        this.zzYnx = zzymx;
        this.zzYnt = zzzjy;
    }

    public final void zzSL(boolean z) {
        this.zzYqv.isEmpty();
        if (z) {
            this.zzYnB = true;
        }
    }

    public final boolean zzYZR() {
        return this.zzYnB;
    }

    public final boolean zzZ01() throws Exception {
        boolean z;
        this.zzYqv.isEmpty();
        if (this.zzZwh.isAtStartOfParagraph()) {
            z = false;
        } else {
            this.zzYqv.zzZ4o();
            this.zzZwh.insertParagraph();
            z = true;
        }
        this.zzYnB = false;
        int iZzYps = this.zzZwh.getCurrentParagraph().zzZYj().zzYps();
        this.zzZwh.getCurrentParagraph().zzZ((zzYMX) this.zzYnx.zzbn());
        if (iZzYps != 0) {
            this.zzZwh.getCurrentParagraph().zzZYj().zzqF(iZzYps);
        }
        this.zzZwh.getCurrentParagraph().zzC(this.zzZwh.zzZpG());
        return z;
    }

    public final void zzZ02() throws Exception {
        if (this.zzYnB && zzZ01()) {
            this.zzYnt.zzVv(false);
        }
    }

    public final void zzZ5(Node node) {
        this.zzYqv.isEmpty();
        this.zzZwh.getCurrentParagraph();
        this.zzYnu.push(this.zzZwh.getCurrentParagraph());
        this.zzZwh.moveTo(node);
    }
}
