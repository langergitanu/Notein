package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR3 implements zzZA2 {
    private boolean zzNo;
    private Run zzYGd;
    private Body zzYGe;
    private DocumentBase zzZCL;

    private zzZR3(Paragraph paragraph) {
        DocumentBase document = paragraph.getDocument();
        this.zzZCL = document;
        Body body = (Body) new Section(document).appendChild(new Body(this.zzZCL));
        this.zzYGe = body;
        this.zzYGd = (Run) ((Paragraph) body.appendChild(paragraph.deepClone(false))).appendChild(new Run(this.zzZCL));
    }

    private static Shape zzD(Shape shape) {
        if (shape.getWrapType() != 0) {
            return null;
        }
        shape.getStroke().setVisible(false);
        shape.getFill().setVisible(false);
        shape.getChildNodes(0, false).clear();
        return shape;
    }

    private boolean zzO(Table table) {
        for (Row row : table.getRows()) {
            Iterator<T> it = row.getCells().iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((Cell) it.next()).getChildNodes(0, false).iterator();
                while (it2.hasNext()) {
                    zzZY((Node) it2.next());
                }
                this.zzYGe.getFirstParagraph().appendChild(new Run(this.zzZCL, ControlChar.CELL));
            }
            if (!row.isLastRow()) {
                this.zzYGe.getFirstParagraph().appendChild(new Run(this.zzZCL, ControlChar.CELL));
            }
        }
        return true;
    }

    private Node zzQ(Node node, boolean z) {
        if (!zzZX(node)) {
            return null;
        }
        int nodeType = node.getNodeType();
        if (nodeType == 18) {
            return zzD((Shape) node);
        }
        if (nodeType == 21) {
            return zzW((Run) node);
        }
        if (z && node.isComposite()) {
            for (Node node2 : ((CompositeNode) node).getChildNodes(0, false)) {
                if (zzQ(node2, true) == null) {
                    node2.remove();
                }
            }
        }
        return node;
    }

    private void zzW(zzYWB zzywb) throws Exception {
        zzYWJ.zzZ(zzywb, this.zzYGd, this);
        this.zzYGd.remove();
    }

    public static zzYWB zzZ(zzZR8 zzzr8) throws Exception {
        if (zzzr8 == null) {
            return null;
        }
        zzZR3 zzzr3 = new zzZR3(zzzr8.getField().getStart().getParentParagraph());
        zzzr3.zzW(zzzr8.zzZga());
        zzzr3.zzZfY();
        return zzzr3.zzZfX();
    }

    private boolean zzZX(Node node) {
        if (this.zzNo) {
            return false;
        }
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(node, Run.class);
        if (run == null || !com.aspose.words.internal.zzZKN.equals(run.getText(), ControlChar.PAGE_BREAK)) {
            return true;
        }
        this.zzNo = true;
        return false;
    }

    private boolean zzZY(Node node) {
        if (node == this.zzYGe.getFirstParagraph()) {
            return false;
        }
        int nodeType = node.getNodeType();
        if (nodeType == 5) {
            return zzO((Table) node);
        }
        if (nodeType != 8) {
            return false;
        }
        return zzv((Paragraph) node);
    }

    private zzYWB zzZfX() {
        if (!this.zzNo) {
            Paragraph firstParagraph = this.zzYGe.getFirstParagraph();
            return zzZOO.zzP(firstParagraph, firstParagraph);
        }
        Run run = new Run(this.zzZCL, "DisplayText cannot span more than one line!");
        run.getFont().setBold(true);
        return new zzYWB(run, run);
    }

    private void zzZfY() {
        if (this.zzNo) {
            return;
        }
        for (Node node : this.zzYGe.getChildNodes(0, false)) {
            if (zzZY(node)) {
                node.remove();
            }
        }
        this.zzYGe.getParagraphs().getCount();
    }

    private boolean zzv(Paragraph paragraph) {
        this.zzYGe.getFirstParagraph().zzZ(paragraph.getFirstChild(), (Node) null, (Node) null);
        return true;
    }

    private static Node zzW(Run run) {
        run.setText(run.getText().replace(ControlChar.LINE_BREAK, ""));
        return run;
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) {
        return zzQ(node2, z);
    }
}
