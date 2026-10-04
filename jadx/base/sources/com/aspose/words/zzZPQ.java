package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPQ {
    private String zzYCl;
    private zzY zzYCm;
    private zzYWB zzYCn;
    private Field zzZz7;

    public static class zzZ {
        private char zzbh = 0;

        public final void zzYX(char c) {
            this.zzbh = c;
        }

        public final char zzqe() {
            return this.zzbh;
        }
    }

    public zzZPQ(Field field) {
        if (field.getType() != 35) {
            field.getType();
        }
        this.zzZz7 = field;
    }

    private static String zzD7(int i) {
        if (i == 2) {
            return "Error! Digit expected.";
        }
        if (i == 3) {
            return "Error! Not a valid Hex digit.";
        }
        if (i == 4) {
            return "Error! Cannot insert return character.";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: errorResult");
    }

    private static Table zzT(zzYWB zzywb) {
        for (Node node : zzywb) {
            if (node.getNodeType() == 5) {
                return (Table) node;
            }
        }
        return null;
    }

    private static void zzY(zzY zzy, zzZR8 zzzr8) throws Exception {
        zzy.zzS(zzzr8.zzZga());
        if (zzzr8.zzZgc()) {
            Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(zzy.zzZG(zzzr8.zzZga().zzYA2().getNode()), Run.class);
            Run run2 = (Run) com.aspose.words.internal.zzZKW.zzZ(zzy.zzZG(zzzr8.zzZga().zzYA1().getNode()), Run.class);
            zzZ(run, true);
            zzZ(run2, false);
        }
    }

    private void zzZ(zzY zzy, zzZR8 zzzr8) throws Exception {
        Table tableZzT = zzT(zzzr8.zzZga());
        if (tableZzT == null) {
            zzY(zzy, zzzr8);
        } else {
            if (zzy.isEmpty()) {
                return;
            }
            zzZ(zzy, tableZzT);
        }
    }

    private void zzZcC() throws Exception {
        this.zzYCl = null;
        this.zzYCn = null;
        this.zzZz7.zzZgq().zzZfv();
        this.zzYCm = new zzY(this.zzZz7.getStart().getDocument(), this.zzZz7.getStart().getParentParagraph());
        Inline sourceNode = new zzWA(this.zzZz7).getSourceNode();
        for (zzZR8 zzzr8 : this.zzZz7.zzZgq().zzZfD()) {
            if (zzzr8.zzZgc() || zzzr8.zzZgb()) {
                zzY(this.zzYCm, zzzr8);
            } else {
                zzZ zzz = new zzZ();
                int iZzZ = zzZ(zzzr8, zzz);
                if (iZzZ == 0) {
                    this.zzYCm.zzZF(new Run(this.zzZz7.getStart().getDocument(), Character.toString(zzz.zzqe()), sourceNode.zzZYh()));
                } else {
                    if (iZzZ != 1) {
                        this.zzYCl = zzD7(iZzZ);
                        return;
                    }
                    zzZ(this.zzYCm, zzzr8);
                }
            }
        }
        if (this.zzYCm.isEmpty()) {
            return;
        }
        this.zzYCn = this.zzYCm.zzZcB();
    }

    public final zzZP6 zzZg8() throws Exception {
        zzZcC();
        String str = this.zzYCl;
        if (str != null) {
            return new zzZP2(this.zzZz7, str);
        }
        zzYWB zzywb = this.zzYCn;
        return zzywb != null ? new zzZP5(this.zzZz7, new zzYW7(zzywb)) : new zzZP5(this.zzZz7, "");
    }

    private void zzZ(zzY zzy, Table table) throws Exception {
        Paragraph paragraph = new Paragraph(this.zzZz7.getStart().getDocument());
        Iterator<T> it = table.getRows().iterator();
        while (it.hasNext()) {
            for (Cell cell : ((Row) it.next()).getCells()) {
                for (Node node : new zzYWB(cell, cell)) {
                    if (node instanceof zzZAM) {
                        paragraph.appendChild(node.deepClone(false));
                    }
                }
            }
        }
        if (paragraph.hasChildNodes()) {
            zzy.zzS(new zzYWB(paragraph.getFirstChild(), paragraph.getLastChild()));
        }
    }

    public static class zzY implements zzZA5 {
        private Node zzYCi;
        private Node zzYDA;
        private DocumentBase zzZCL;
        private HashMap<Node, Node> zzYCk = new HashMap<>();
        private HashMap<Node, Node> zzYCj = new HashMap<>();
        private boolean zzD7 = true;

        public zzY(DocumentBase documentBase, Paragraph paragraph) {
            Run run = new Run(documentBase);
            Paragraph paragraph2 = (Paragraph) paragraph.deepClone(false);
            Body body = new Body(documentBase);
            Section section = new Section(documentBase);
            section.appendChild(body);
            body.appendChild(paragraph2);
            paragraph2.appendChild(run);
            this.zzYDA = run;
            this.zzZCL = documentBase;
            this.zzYCi = section;
        }

        private static OfficeMath zzQ(zzYWB zzywb) {
            OfficeMath officeMathZzZE = zzZE(zzywb.zzYA2().getNode());
            if (officeMathZzZE == zzZE(zzywb.zzYA1().getNode())) {
                return officeMathZzZE;
            }
            return null;
        }

        private boolean zzR(zzYWB zzywb) throws Exception {
            OfficeMath officeMathZzQ = zzQ(zzywb);
            if (officeMathZzQ == null) {
                return false;
            }
            if (!zzYVU.zzl(zzywb.zzYA1().getNode().getParentNode(), zzywb.zzYA2().getNode().getParentNode())) {
                return false;
            }
            Node nodeZzZ = zzZ(zzywb.zzYA2().getNode(), officeMathZzQ);
            zzZ(zzywb, nodeZzZ);
            nodeZzZ.remove();
            return true;
        }

        private Node zzZ(Node node, OfficeMath officeMath) {
            CompositeNode parentNode = node.getParentNode();
            Node nodeAppendChild = null;
            CompositeNode compositeNode = null;
            while (true) {
                CompositeNode compositeNode2 = (CompositeNode) parentNode.zzZ(false, (zzZA5) this);
                if (nodeAppendChild == null) {
                    nodeAppendChild = compositeNode2.appendChild(node.deepClone(false));
                }
                if (compositeNode != null) {
                    compositeNode2.appendChild(compositeNode);
                }
                if (parentNode == officeMath) {
                    this.zzYDA.zzYC(compositeNode2);
                    return nodeAppendChild;
                }
                parentNode = parentNode.getParentNode();
                compositeNode = compositeNode2;
            }
        }

        private static OfficeMath zzZE(Node node) {
            CompositeNode ancestor = node.getAncestor(35);
            if (ancestor == null) {
                return null;
            }
            return ((OfficeMath) ancestor).zzYrX();
        }

        private void zzZcA() {
            Node node = this.zzYCi;
            Iterator<Node> it = zzYWG.zzY(new zzYWB(node, node), 35).iterator();
            while (it.hasNext()) {
                OfficeMath officeMath = (OfficeMath) it.next();
                OfficeMath officeMath2 = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(officeMath.getPreviousSibling(), OfficeMath.class);
                if (officeMath2 != null && (this.zzYCj.get(officeMath) == this.zzYCj.get(officeMath2) || officeMath.isTopLevel())) {
                    if (zzZ((CompositeNode) officeMath, (CompositeNode) officeMath2)) {
                        officeMath.remove();
                    }
                }
            }
        }

        public final boolean isEmpty() {
            return this.zzD7;
        }

        public final void zzS(zzYWB zzywb) throws Exception {
            this.zzD7 = false;
            if (zzR(zzywb)) {
                return;
            }
            zzZ(zzywb, this.zzYDA);
        }

        @Override // com.aspose.words.zzZA5
        public final void zzW(Node node, Node node2) {
            this.zzYCk.put(node, node2);
            this.zzYCj.put(node2, node);
        }

        public final void zzZF(Node node) throws Exception {
            new Paragraph(this.zzZCL).appendChild(node);
            zzS(new zzYWB(node, node));
        }

        public final Node zzZG(Node node) {
            return (Node) com.aspose.words.internal.zzQW.zzZ(this.zzYCk, node);
        }

        public final zzYWB zzZcB() {
            zzZcA();
            Node node = this.zzYCi;
            return zzZOO.zzP(node, node);
        }

        private void zzZ(zzYWB zzywb, Node node) throws Exception {
            zzYWJ.zzZ(zzywb, node, (zzZA2) null, this, 6);
        }

        private static boolean zzZ(CompositeNode compositeNode, CompositeNode compositeNode2) {
            for (Node node : compositeNode.getChildNodes(0, false).toArray()) {
                if (!compositeNode2.zzT(node)) {
                    return false;
                }
                compositeNode2.appendChild(node);
            }
            return true;
        }
    }

    private static int zzY(String str, zzZ zzz) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || !com.aspose.words.internal.zzZYD.isDigit(str.charAt(0))) {
            return 1;
        }
        int iMin = Math.min(str.length(), 3);
        if (str.length() > iMin) {
            str = str.substring(0, iMin);
        }
        return zzZ(com.aspose.words.internal.zzJB.zzZo(str), 2, zzz);
    }

    private static void zzZ(Run run, boolean z) {
        if (run == null || com.aspose.words.internal.zzZKN.zzU3(run.getText())) {
            return;
        }
        int length = z ? 0 : run.getText().length() - 1;
        if (zzZQT.zzk(run.getText().charAt(length))) {
            run.setText(com.aspose.words.internal.zzZKN.zzT(run.getText(), length, 1));
        }
    }

    private static int zzZ(String str, zzZ zzz) {
        if (!com.aspose.words.internal.zzZYD.zzg(str, "0x")) {
            return 1;
        }
        if (str.length() == 2) {
            return 2;
        }
        return zzZ(com.aspose.words.internal.zzJB.zzZc(str.substring(2, Math.min(str.length() - 2, 4) + 2)), 3, zzz);
    }

    private static int zzZ(int i, int i2, zzZ zzz) {
        if (i == Integer.MIN_VALUE) {
            return i2;
        }
        zzz.zzYX((char) i);
        return zzz.zzqe() == '\r' ? 4 : 0;
    }

    private static int zzZ(zzZR8 zzzr8, zzZ zzz) {
        String strZzW2 = zzzr8.zzW2(true);
        int iZzZ = zzZ(strZzW2, zzz);
        return iZzZ != 1 ? iZzZ : zzY(strZzW2, zzz);
    }
}
