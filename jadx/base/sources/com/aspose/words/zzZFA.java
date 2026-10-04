package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFA implements zzZ9F {
    private int zzYms;
    private zzZF0 zzYrW;
    private zzZEF zzYrY;
    private zzZAO zzYt4;

    public zzZFA(zzZF0 zzzf0, zzZAO zzzao, zzZEF zzzef) {
        this.zzYrW = zzzf0;
        this.zzYt4 = zzzao;
        this.zzYrY = zzzef;
    }

    private void zzP(Font font) throws Exception {
        this.zzYrW.zzY(font, "&#xad;");
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzT(Font font) throws Exception {
        zzP(font);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzU(Font font) throws Exception {
        zzP(font);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzV(Font font) throws Exception {
        this.zzYrW.zzY(font, "&#x2011;");
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzW(Font font) throws Exception {
        this.zzYrW.zzY(font, "&#xa0;");
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzX(Font font) throws Exception {
        this.zzYrW.zzN(font);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzY(Font font) {
        zzZo1();
    }

    public final void zzYZh() {
        this.zzYms++;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, String str, int i) throws Exception {
        this.zzYrW.zzX(font, str, i);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZnZ() {
        if (this.zzYrY.zzYNg()) {
            return;
        }
        int i = this.zzYms;
        if (i > 0) {
            this.zzYms = i - 1;
            return;
        }
        this.zzYt4.zzZ3E().zzZN("br", 1);
        zzLU zzlu = new zzLU();
        zzlu.zzZs("mso-column-break-before", "always");
        zzlu.zzZs("clear", "both");
        this.zzYt4.zzZ3C().zzV(zzlu);
        this.zzYt4.zzZ3E().endElement("br");
        this.zzYrW.zzYYX();
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo0() {
        if (this.zzYrY.zzYNg()) {
            return;
        }
        int i = this.zzYms;
        if (i > 0) {
            this.zzYms = i - 1;
            return;
        }
        this.zzYt4.zzZ3E().zzZN("br", 1);
        zzLU zzlu = new zzLU();
        zzlu.zzZs("page-break-before", "always");
        zzlu.zzZs("clear", "both");
        this.zzYt4.zzZ3C().zzV(zzlu);
        this.zzYt4.zzZ3E().endElement("br");
        this.zzYrW.zzYYX();
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo1() {
        this.zzYt4.zzZ3E().zzZN("br", 1);
        this.zzYt4.zzZ3E().endElement("br");
        this.zzYrW.zzYYX();
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, boolean z) throws Exception {
        this.zzYrW.zzY(font, z ? "&#x200f;" : "&#x200e;");
    }
}
