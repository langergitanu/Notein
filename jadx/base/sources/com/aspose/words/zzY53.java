package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY53 extends zzZ80 implements zzZA2 {
    public zzY53(int i, StyleCollection styleCollection) {
        super(i, styleCollection);
    }

    private static boolean zzDk(int i) {
        return i == 140 || i == 160 || i == 500 || i == 510 || i == 520;
    }

    private static Font zzWc(Node node) {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(node, Inline.class);
        if (inline != null) {
            return inline.getFont();
        }
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(node, ShapeBase.class);
        if (shapeBase == null || !shapeBase.isTopLevel() || shapeBase.zzY9n() == null) {
            return null;
        }
        return shapeBase.getFont();
    }

    private static boolean zzWd(Node node) {
        Font fontZzWc = zzWc(node);
        if (fontZzWc == null) {
            return false;
        }
        fontZzWc.setStyleIdentifier(85);
        return true;
    }

    private Style zzjx(int i) {
        if (zzYVa() != null) {
            return zzYVa().getStyles().zzZ7(i, true);
        }
        return null;
    }

    private static boolean zzjy(int i) {
        if (i == 890 || i == 10010) {
            return false;
        }
        switch (i) {
            case 12:
            case 13:
            case 14:
            case 15:
                return false;
            default:
                return true;
        }
    }

    private Object zzjz(int i) {
        Style styleZzjx = zzjx(65);
        if (styleZzjx != null) {
            return styleZzjx.zzZa(i, zzjy(i));
        }
        return null;
    }

    @Override // com.aspose.words.zzZ80
    public final void zzY(Inline inline, Inline inline2) {
        zzX(inline, inline2);
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) throws Exception {
        Node nodeZzL = zzL(node, node2);
        if (!zzWd(nodeZzL)) {
            Iterator<Node> it = new zzYWB(nodeZzL, nodeZzL).iterator();
            while (it.hasNext()) {
                zzWd(it.next());
            }
        }
        return nodeZzL;
    }

    private boolean zzY(int i, Inline inline) {
        return zzZ(zzjx(85), i, inline) || zzZ(zzYVa(), i, inline);
    }

    @Override // com.aspose.words.zzZ80
    public final boolean zzZ(int i, Object obj, Inline inline) {
        return zzDk(i) || super.zzZ(i, obj, inline) || zzY(i, inline) || zzZ80.zzf(i, obj);
    }

    private boolean zzZ(Style style, int i, Inline inline) {
        Object objZzZa;
        if (style == null || (objZzZa = style.zzZa(i, false)) == null) {
            return false;
        }
        if (objZzZa instanceof zzZU) {
            return true;
        }
        if (objZzZa.equals(zzjz(i))) {
            return objZzZa.equals(inline.zzZYh().zzPj(i));
        }
        return false;
    }
}
