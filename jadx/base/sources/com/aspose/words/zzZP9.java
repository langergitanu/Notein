package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZP9 extends zzZPA implements zzZA2 {
    private Node zzYBo;
    private zzZR2 zzYEu;

    public zzZP9(zzYWB zzywb) {
        this(zzywb, true);
    }

    private boolean isInCell() {
        return this.zzYBo != null;
    }

    private int zzK(Node node, boolean z) {
        if (node.getNodeType() != 21) {
            return 2;
        }
        Run run = (Run) node;
        String strZzV = zzV(run.getText(), this.zzYEu.zzZfT() || isInCell(), com.aspose.words.internal.zzJF.zzZK(run.getFont().getName()));
        boolean zZzU3 = com.aspose.words.internal.zzZKN.zzU3(strZzV);
        if (!zZzU3 || z) {
            run.setText(strZzV);
        }
        return zZzU3 ? 1 : 0;
    }

    private void zzL(Node node, boolean z) {
        if (z) {
            zzZW(node);
        }
        if (!node.isComposite()) {
            zzK(node, true);
            return;
        }
        for (Node firstChild = ((CompositeNode) node).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzL(firstChild, true);
        }
    }

    private void zzZW(Node node) {
        this.zzYEu.zzZW(node);
        zzZu(node);
    }

    private void zzZu(Node node) {
        Node node2 = this.zzYBo;
        if (node2 != null && !node.zzYF(node2)) {
            this.zzYBo = null;
        }
        if (node.getNodeType() == 7) {
            this.zzYBo = node;
        }
    }

    private void zzZv(Node node) {
        if (zzZbB() || (node instanceof FieldChar)) {
            return;
        }
        zzZbE();
    }

    public final boolean isInFieldCode() {
        return this.zzYEu.isInFieldCode();
    }

    public boolean zzQ(Node node, Node node2) {
        return true;
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) {
        zzZW(node2);
        boolean z2 = true;
        boolean z3 = !zzQ(node, node2);
        int iZzK = zzK(node2, false);
        if (iZzK == 0) {
            z2 = z3;
        } else if (iZzK != 1) {
            if (iZzK != 2) {
                throw new IllegalArgumentException();
            }
            if (node2.isComposite() && z) {
                zzL(node2, false);
            }
            zzVS(false);
            zzZv(node2);
            z2 = z3;
        }
        if (z2) {
            return null;
        }
        return node2;
    }

    @Override // com.aspose.words.zzZPA
    public final boolean zzZbD() {
        return this.zzYEu.isInFieldCode();
    }

    public zzZP9(zzYWB zzywb, int i) {
        super(i);
        this.zzYEu = new zzZR2(zzZOO.zzM(zzywb));
    }

    public zzZP9(zzYWB zzywb, boolean z) {
        this(zzywb, zzZP8.zzO(1, 2, z));
    }
}
