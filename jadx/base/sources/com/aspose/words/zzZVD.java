package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVD {
    private ArrayList<Node> zzYM4 = new ArrayList<>();
    private zzZYM zzYM5;
    private zzYDZ zzZFZ;

    public zzZVD(zzZYM zzzym, zzYDZ zzydz) {
        this.zzZFZ = zzydz;
        this.zzYM5 = zzzym;
    }

    private static Node zzV(Field field) throws Exception {
        return field.zzZgI().zzYA2().getNode();
    }

    public final void zzW(Field field) throws Exception {
        if (field.getStart().getFieldType() != 49) {
            return;
        }
        switch (this.zzZFZ.zzXpa.getSaveFormat()) {
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                zzV(zzV(field), field.getEnd());
                break;
        }
    }

    public final void zzZnb() {
        Iterator<Node> it = this.zzYM4.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
    }

    private void zzV(Node node, Node node2) throws Exception {
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(node, Run.class);
        if (run == null || !"".equals(run.getText())) {
            node2.zzYD(node);
            com.aspose.words.internal.zzZQG.zzZ(this.zzYM4, node);
            node.accept(this.zzYM5);
        }
    }
}
