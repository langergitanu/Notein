package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYF7 extends zzYHS {
    private FieldStart zzYBO;

    public zzYF7(zzYFT zzyft) {
        super(zzyft);
    }

    private boolean zzYfs() {
        Iterator<Node> it = new zzYWB(this.zzYBO, zzYiM().getContainer().getLastChild()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZAM.class);
            if (zzzam != null) {
                if (zzzam.getRunPr_IInline().zzYdW().toBool()) {
                    z = false;
                }
                zzzam.getRunPr_IInline().remove(130);
            }
        }
        return z;
    }

    public final void zzYft() throws Exception {
        zzYWB zzywb = new zzYWB(this.zzYBO.getNextSibling().getNextSibling(), zzYiM().getContainer().getLastChild());
        zzYiM().zzCe(" ");
        zzYi8();
        boolean zZzYfs = zzYfs();
        zzYiM().zzYhK();
        if (zZzYfs) {
            zzYWJ.zzZ(zzywb, this.zzYBO, new zzZP9(zzywb));
        }
        String strZzK = zzYVY.zzK(zzywb);
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        boolean zZzS = com.aspose.words.internal.zzZKN.zzS(strZzK, "\"", i);
        boolean z = com.aspose.words.internal.zzZKN.zzW(strZzK, "\"", i) && !com.aspose.words.internal.zzZKN.zzW(strZzK, "\\\"", i);
        if (!(zZzS && z) && com.aspose.words.internal.zzZYD.zzXk(strZzK)) {
            Node nextSibling = zzywb.zzYA1().getNode().getNextSibling();
            Node node = zzywb.zzYA2().getNode();
            while (node != null && !(node instanceof zzZAM)) {
                node = node.nextPreOrder(nextSibling);
            }
            if (!zZzS) {
                node.zzYC(new Run(getDocument(), "\"", (zzYEF) ((zzZAM) node).getRunPr_IInline().zzbn()));
            }
            if (z) {
                return;
            }
            Node node2 = node;
            while (node != null && ((node instanceof zzZAM) || (node instanceof SmartTag))) {
                node2 = node;
                node = node.nextPreOrder(nextSibling);
            }
            node2.zzYD(new Run(getDocument(), "\"", (zzYEF) ((zzZAM) node2).getRunPr_IInline().zzbn()));
        }
    }

    public final void zzYfu() throws Exception {
        this.zzYBO = zzYiM().zzYhL();
        zzYiM().zzCe(zzYi7());
    }

    public abstract String zzYi7();

    public abstract void zzYi8() throws Exception;
}
