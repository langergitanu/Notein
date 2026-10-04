package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY52 extends zzZ80 implements zzZA2 {
    public zzY52(int i, StyleCollection styleCollection) {
        super(i, styleCollection);
    }

    private void zzW(Inline inline, Inline inline2) {
        if (zzYVa() == null) {
            return;
        }
        zzYEF zzyefZzl1 = zzZ7R.zzY(inline).zzl1(0);
        zzYEF zzyefZzZYh = inline.zzZYh();
        zzYEF zzyefZzZYh2 = inline2.zzZYh();
        for (int i = 0; i < zzyefZzl1.getCount(); i++) {
            int iZzT3 = zzyefZzl1.zzT3(i);
            Object obj = zzyefZzl1.get(iZzT3);
            if (!zzZ80.zzyf(iZzT3) && zzyefZzZYh.get(iZzT3) == null) {
                if (obj instanceof zzZU) {
                    if (obj == zzZU.zzZF6 && !zzZ(iZzT3, inline)) {
                        zzyefZzZYh2.add(iZzT3, zzZU.zzZF4);
                    }
                } else if (!zzZ(iZzT3, inline)) {
                    zzyefZzZYh2.add(iZzT3, obj);
                }
            }
        }
    }

    @Override // com.aspose.words.zzZ80
    public final void zzY(Inline inline, Inline inline2) {
        zzX(inline, inline2);
        zzW(inline, inline2);
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) throws Exception {
        return zzL(node, node2);
    }
}
