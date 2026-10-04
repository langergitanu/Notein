package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ80 {
    private Style zzYio;

    public zzZ80(int i, StyleCollection styleCollection) {
        this.zzYio = styleCollection.zzZ7(i, true);
    }

    private boolean zzK(Node node, Node node2) throws Exception {
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(node, Inline.class);
        Inline inline2 = (Inline) com.aspose.words.internal.zzZKW.zzZ(node2, Inline.class);
        if (inline == null || inline2 == null) {
            return false;
        }
        zzN(inline2);
        zzY(inline, inline2);
        return true;
    }

    private int[] zzM(Inline inline) {
        zzYEF zzyefZzZYh = inline.zzZYh();
        int[] iArr = new int[zzyefZzZYh.getCount()];
        for (int i = 0; i < zzyefZzZYh.getCount(); i++) {
            int iZzT3 = zzyefZzZYh.zzT3(i);
            if (!zzZ(iZzT3, zzyefZzZYh.zzPk(iZzT3), inline)) {
                iZzT3 = -1;
            }
            iArr[i] = iZzT3;
        }
        return iArr;
    }

    private static void zzN(Inline inline) {
        inline.zzZYh().zzYpN();
        inline.zzZYh().remove(14);
    }

    private static void zzV(zzZS zzzs, int[] iArr) {
        for (int i : iArr) {
            if (i != -1) {
                zzzs.remove(i);
            }
        }
    }

    private static boolean zzY(int i, Object obj, Inline inline) {
        return com.aspose.words.internal.zzKY.zzL(obj, zzZ7R.zzY(inline, i));
    }

    private static boolean zzZs(Object obj) {
        zzU1 zzu1 = (zzU1) com.aspose.words.internal.zzZKW.zzZ(obj, zzU1.class);
        return zzu1 != null && zzu1.zzZYI() && zzu1.zzZYJ() == 131076;
    }

    public static boolean zzf(int i, Object obj) {
        if (i == 230 || i == 240) {
            return zzZs(obj);
        }
        return false;
    }

    public static boolean zzyf(int i) {
        return i == 190 || i == 350 || i == 50;
    }

    public final Node zzL(Node node, Node node2) throws Exception {
        if (!zzK(node, node2) && node.getNodeType() == 28) {
            zzYWI zzywi = (zzYWI) new zzYWB(node, node).iterator();
            zzYWI zzywi2 = (zzYWI) new zzYWB(node2, node2).iterator();
            while (zzywi.zzF(true, true) && zzywi2.zzF(true, true)) {
                zzK(zzywi.next(), zzywi2.next());
            }
        }
        return node2;
    }

    public final void zzX(Inline inline, Inline inline2) {
        zzV(inline2.zzZYh(), zzM(inline));
    }

    public abstract void zzY(Inline inline, Inline inline2) throws Exception;

    public final Style zzYVa() {
        return this.zzYio;
    }

    public boolean zzZ(int i, Object obj, Inline inline) {
        return zzyf(i) || zzY(i, obj, inline) || zzX(i, obj, inline);
    }

    private boolean zzX(int i, Object obj, Inline inline) {
        if (obj instanceof zzZU) {
            return ((zzZU) zzZ7R.zzY(inline).zzZa(i, false)) == zzZU.zzZF6 || zzZ(i, inline);
        }
        return false;
    }

    public final boolean zzZ(int i, Inline inline) {
        Style style = this.zzYio;
        if (style == null) {
            return false;
        }
        return inline.getFont().zzPj(i).equals(style.zzZa(i, true));
    }
}
