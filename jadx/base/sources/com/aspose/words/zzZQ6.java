package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ6 implements zzZA2 {
    private zzYEF zzYDM;
    private zzZR2 zzYEu = new zzZR2();
    private Document zzZEY;

    public zzZQ6(Document document) {
        this.zzZEY = document;
    }

    private static boolean zzDk(int i) {
        return i == 140 || i == 160 || i == 500 || i == 510 || i == 520;
    }

    private void zzO(Node node, boolean z) {
        this.zzYEu.zzZW(node);
        zzZO(node);
        if (z && node.isComposite()) {
            Iterator<V> it = ((CompositeNode) node).iterator();
            while (it.hasNext()) {
                zzO((Node) it.next(), true);
            }
        }
    }

    private void zzP(zzYEF zzyef) {
        for (int i : zzZdI().zzrc()) {
            if (zzyef.zzVE(i)) {
                zzyef.remove(i);
            } else {
                zzyef.add(i, zzZdI().get(i));
            }
        }
    }

    private static void zzQ(zzYEF zzyef) {
        for (int i : zzyef.zzrc()) {
            if (zzDk(i)) {
                zzyef.remove(i);
            }
        }
    }

    private void zzZO(Node node) {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(node, Inline.class);
        if (inline != null && zzZdJ()) {
            zzQ(inline.zzZYh());
            zzP(inline.zzZYh());
            inline.zzZYh().remove(50);
        }
    }

    private zzYEF zzZdI() {
        if (this.zzYDM == null) {
            Style styleZzZ7 = this.zzZEY.getStyles().zzZ7(85, false);
            if (styleZzZ7 != null) {
                zzYEF zzyefZzl1 = styleZzZ7.zzl1(0);
                this.zzYDM = zzyefZzl1;
                for (int i : zzyefZzl1.zzrc()) {
                    if (zzDk(i)) {
                        this.zzYDM.remove(i);
                    }
                }
            } else {
                this.zzYDM = new zzYEF();
            }
        }
        return this.zzYDM;
    }

    private boolean zzZdJ() {
        return this.zzYEu.zzZfU() && this.zzYEu.zzZfS().getFieldType() == 88;
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) {
        zzO(node2, z);
        return node2;
    }
}
