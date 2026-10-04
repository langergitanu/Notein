package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR2 {
    private int zzYG9;
    private com.aspose.words.internal.zzZQC<FieldStart> zzYQt;

    public zzZR2() {
        this(false);
    }

    public static boolean zzZV(Node node) {
        FieldChar fieldChar = (FieldChar) com.aspose.words.internal.zzZKW.zzZ(node, FieldChar.class);
        return (fieldChar == null || fieldChar.isDeleteRevision()) ? false : true;
    }

    private void zzZfV() {
        this.zzYQt.pop();
    }

    private void zzZfW() {
        this.zzYG9--;
    }

    public final boolean isInFieldCode() {
        return this.zzYG9 != 0;
    }

    public final void zzZW(Node node) {
        if (zzZV(node)) {
            switch (node.getNodeType()) {
                case 22:
                    this.zzYG9++;
                    this.zzYQt.push((FieldStart) node);
                    break;
                case 23:
                    zzZfW();
                    break;
                case 24:
                    if (!((FieldEnd) node).hasSeparator()) {
                        zzZfW();
                    }
                    zzZfV();
                    break;
            }
        }
    }

    public final int zzZfR() {
        return this.zzYQt.size();
    }

    public final FieldStart zzZfS() {
        if (zzZfT()) {
            return this.zzYQt.peek();
        }
        return null;
    }

    public final boolean zzZfT() {
        return this.zzYQt.size() != 0;
    }

    public final boolean zzZfU() {
        return zzZfT() && !isInFieldCode();
    }

    public zzZR2(boolean z) {
        com.aspose.words.internal.zzZQC<FieldStart> zzzqc = new com.aspose.words.internal.zzZQC<>();
        this.zzYQt = zzzqc;
        if (z) {
            zzzqc.push(null);
        }
    }
}
