package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHH extends zzZP9 {
    private String zzXvT;

    public zzYHH(zzYWB zzywb) {
        super(zzywb);
    }

    @Override // com.aspose.words.zzZP9
    public final boolean zzQ(Node node, Node node2) {
        this.zzXvT = node2.getNodeType() == 21 ? ((Run) node2).getText() : null;
        return super.zzQ(node, node2);
    }

    @Override // com.aspose.words.zzZPA
    public final StringBuilder zzY(StringBuilder sb, char c, int i) {
        if (c == ':' && i > 0 && this.zzXvT.charAt(i - 1) == '\\') {
            sb = super.zzY(sb, IOUtils.DIR_SEPARATOR_WINDOWS, i);
        }
        return super.zzY(sb, c, i);
    }

    @Override // com.aspose.words.zzZPA
    public final zzYIS zzZ(zzYIS zzyis, zzYIV zzyiv, int i) {
        return super.zzZ(zzyis, zzyiv, i);
    }
}
