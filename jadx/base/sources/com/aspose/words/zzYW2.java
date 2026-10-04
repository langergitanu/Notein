package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW2 extends zzYWI {
    private zzYW2(Node node, Node node2) {
        super(new zzYWB(node, node2), true);
    }

    public static void zzX(Node node, Node node2, com.aspose.words.internal.zzPV zzpv) {
        node.zzYF(node2);
        node2.zzYF(node);
        new zzYW2(node, node2).zzZT(zzpv);
    }

    private static void zzY(Node node, com.aspose.words.internal.zzPV zzpv) {
        if (!zzY3(node) || zzY2(node)) {
            return;
        }
        zzY1(node).zzm(zzpv);
    }

    private static Font zzY1(Node node) {
        return node.getNodeType() != 8 ? ((Inline) node).getFont() : ((Paragraph) node).getParagraphBreakFont();
    }

    private static boolean zzY2(Node node) {
        if (node.getNodeType() == 8) {
            return ((Paragraph) node).zzYp5().get(160) != null;
        }
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(node, Inline.class);
        return (inline == null || inline.zzZYh().get(160) == null) ? false : true;
    }

    private static boolean zzY3(Node node) {
        if (node.getNodeType() != 8) {
            return node instanceof Inline;
        }
        return true;
    }

    private void zzZT(com.aspose.words.internal.zzPV zzpv) {
        Node next = null;
        boolean z = true;
        while (zzF(z, false)) {
            z = next().getNodeType() != 18;
            if (!zzYWt().zzZou() && next() != next) {
                zzY(next(), zzpv);
                next = next();
            }
        }
    }
}
