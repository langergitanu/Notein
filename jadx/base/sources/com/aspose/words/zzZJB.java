package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJB {
    private boolean zzZ5I;
    private com.aspose.words.internal.zzZQC<zzUE> zzeU = new com.aspose.words.internal.zzZQC<>();

    public zzZJB(boolean z) {
        this.zzZ5I = z;
    }

    public final void zzJ(zzPS zzps) {
        this.zzeU.push(new zzUE(this.zzeU.size() > 0 ? this.zzeU.peek() : null, new zzXS(zzps)));
    }

    public final void zzLg() throws Exception {
        this.zzeU.size();
        zzUE zzuePop = this.zzeU.pop();
        if (this.zzZ5I) {
            return;
        }
        zzuePop.zzZZg();
    }

    public final void zzZ(Paragraph paragraph, zzPS zzps) {
        if (this.zzeU.size() == 0) {
            return;
        }
        this.zzeU.peek().zzZ((CompositeNode) paragraph, new zzXS(zzps));
    }

    public final void zzc(Paragraph paragraph) {
        zzZ(paragraph, zzPS.zzZqo);
    }

    public final void zzZ(Table table, zzPS zzps) {
        if (this.zzeU.size() == 0) {
            return;
        }
        this.zzeU.peek().zzZ((CompositeNode) table, new zzXS(zzps));
    }
}
