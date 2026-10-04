package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7Y extends zzZ80 implements zzZA2 {
    public zzZ7Y(int i, StyleCollection styleCollection) {
        super(i, styleCollection);
    }

    private static boolean zzyc(int i) {
        return i == 130;
    }

    @Override // com.aspose.words.zzZ80
    public final void zzY(Inline inline, Inline inline2) {
        zzX(inline, inline2);
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) throws Exception {
        return zzL(node, node2);
    }

    @Override // com.aspose.words.zzZ80
    public final boolean zzZ(int i, Object obj, Inline inline) {
        return zzyc(i) || super.zzZ(i, obj, inline) || zzZ80.zzf(i, obj);
    }
}
