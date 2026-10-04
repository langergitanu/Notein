package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZE implements zzZB0 {
    private Field zzZz7;

    public zzYZE(Field field) {
        this.zzZz7 = field;
    }

    @Override // com.aspose.words.zzZB0
    public final zzZB1 getFormatApplier() {
        if (zzZOO.zzCF(this.zzZz7.getType()) == 0) {
            return null;
        }
        this.zzZz7.zzW4(true);
        return zzZOO.zzCt(this.zzZz7.getType()) ? new zzZ8C(this.zzZz7.zzZgx()) : new zzYZG(this.zzZz7.zzZgx(), this.zzZz7.zzZgw(), this.zzZz7.zzZgv());
    }

    @Override // com.aspose.words.zzZB0
    public final Inline getSourceNode() {
        for (Node node : this.zzZz7.zzZgF()) {
            if (node.getNodeType() == 21) {
                return (Inline) node;
            }
        }
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(this.zzZz7.getStart().getPreviousSibling(), Inline.class);
        return inline != null ? inline : this.zzZz7.getEnd();
    }
}
