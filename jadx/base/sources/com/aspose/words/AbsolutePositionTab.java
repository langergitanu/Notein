package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class AbsolutePositionTab extends SpecialChar {
    private int zzUG;
    private int zzZGF;
    private int zzZGG;

    public AbsolutePositionTab(DocumentBase documentBase, zzYEF zzyef) {
        super(documentBase, '\t', zzyef);
        this.zzUG = 0;
        this.zzZGG = 3;
        this.zzZGF = 0;
    }

    @Override // com.aspose.words.SpecialChar, com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitAbsolutePositionTab(this));
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final void setAlignment(int i) {
        this.zzUG = i;
    }

    public final void zzPp(int i) {
        this.zzZGG = i;
    }

    public final void zzPq(int i) {
        this.zzZGF = i;
    }

    public final int zzc0() {
        return this.zzZGG;
    }

    public final int zzc1() {
        return this.zzZGF;
    }
}
