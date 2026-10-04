package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZOM extends zzZP9 {
    public zzZOM(zzYWB zzywb) {
        super(zzywb, 7);
    }

    @Override // com.aspose.words.zzZP9
    public boolean zzQ(Node node, Node node2) {
        return (zzYVU.zzXW(node2) || (node2 instanceof InlineStory)) ? false : true;
    }

    @Override // com.aspose.words.zzZPA
    public StringBuilder zzY(StringBuilder sb, char c, int i) {
        if (com.aspose.words.internal.zzZKU.zzG(c)) {
            c = ControlChar.SPACE_CHAR;
        }
        return super.zzY(sb, c, i);
    }

    @Override // com.aspose.words.zzZPA
    public zzYIS zzZ(zzYIS zzyis, zzYIV zzyiv, int i) {
        return super.zzZ(zzyis, zzyiv, i);
    }
}
