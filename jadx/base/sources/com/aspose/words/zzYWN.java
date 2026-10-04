package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWN implements zzZB1 {
    static zzYWN zzXVX = new zzYWN();

    private zzYWN() {
    }

    @Override // com.aspose.words.zzZB1
    public final void zzZ(zzYWB zzywb) {
        Iterator<Node> it = zzywb.iterator();
        while (it.hasNext()) {
            Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
            if (inline != null) {
                inline.getFont().setNoProofing(true);
            }
        }
    }
}
