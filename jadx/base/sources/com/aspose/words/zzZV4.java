package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZV4 extends DocumentVisitor {
    private int zzYLP;
    private EditableRangeEnd zzYLR;
    private EditableRangeStart zzYLS;
    private boolean zzZCF;

    private zzZV4(int i, boolean z) {
        this.zzYLP = i;
        this.zzZCF = z;
    }

    public static EditableRangeEnd zzW(Node node, int i) throws Exception {
        if (node == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: node");
        }
        zzZV4 zzzv4 = new zzZV4(i, false);
        node.accept(zzzv4);
        return zzzv4.zzYLR;
    }

    public static EditableRangeStart zzX(Node node, int i) throws Exception {
        zzZV4 zzzv4 = new zzZV4(i, true);
        node.accept(zzzv4);
        return zzzv4.zzYLS;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) {
        if (this.zzZCF || this.zzYLP != editableRangeEnd.getId()) {
            return 0;
        }
        this.zzYLR = editableRangeEnd;
        return 2;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeStart(EditableRangeStart editableRangeStart) {
        if (!this.zzZCF || this.zzYLP != editableRangeStart.getId()) {
            return 0;
        }
        this.zzYLS = editableRangeStart;
        return 2;
    }
}
