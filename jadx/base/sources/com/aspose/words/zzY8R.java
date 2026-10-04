package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY8R {
    private com.aspose.words.internal.zzZQC<Style> zzX9r = new com.aspose.words.internal.zzZQC<>();
    protected zzZN7 zzX9s;
    protected zzYMP zzX9t;
    protected zzLS zzX9u;
    protected Document zzYfy;

    public zzY8R(Document document, zzLS zzls, zzYMP zzymp, zzZN7 zzzn7) {
        this.zzYfy = document;
        this.zzX9u = zzls;
        this.zzX9t = zzymp;
        this.zzX9s = zzzn7;
    }

    public final Style zzY2R() {
        if (this.zzX9r.size() > 0) {
            return this.zzX9r.peek();
        }
        return null;
    }

    public abstract void zzY2S() throws Exception;

    public abstract Style zzZpe();

    public final void zzZpg() {
        this.zzX9r.size();
        this.zzX9r.pop();
    }

    public final void zzZph() throws Exception {
        Style styleZzkL = zzkL(2);
        if (styleZzkL == null) {
            styleZzkL = zzY2R();
        }
        this.zzX9r.push(styleZzkL);
    }

    public abstract Style zzkL(int i) throws Exception;
}
