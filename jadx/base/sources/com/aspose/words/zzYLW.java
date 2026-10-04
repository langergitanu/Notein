package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLW {
    private ArrayList<Node> zzXRL = new ArrayList<>();
    private zzZ1L zzY2R;
    private zzZ1K zzY2S;

    public zzYLW(zzZ1K zzz1k, zzZ1L zzz1l) {
        this.zzY2S = zzz1k;
        this.zzY2R = zzz1l;
    }

    public final void add(Node node) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXRL, node);
    }

    public final void zzYye() throws Exception {
        for (Node node : this.zzXRL) {
            int nodeType = node.getNodeType();
            if (nodeType == 9) {
                this.zzY2R.zzW((BookmarkStart) node);
            } else if (nodeType == 10) {
                this.zzY2R.zzW((BookmarkEnd) node);
            } else if (nodeType == 33) {
                this.zzY2S.zzZ((CommentRangeStart) node);
            } else {
                if (nodeType != 34) {
                    throw new IllegalStateException("Unexpected node type.");
                }
                this.zzY2S.zzZ((CommentRangeEnd) node);
            }
        }
        this.zzXRL.clear();
    }
}
