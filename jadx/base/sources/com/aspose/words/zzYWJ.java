package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWJ extends zzYVW {
    private static int[] zzXVu = zzYAw();
    private int zzCF;
    private CompositeNode zzXVA;
    private Node zzXVB;
    private zzZA5 zzXVC;
    private zzZA2 zzXVD;
    private zzZS zzXVE;
    private boolean zzXVv;
    private boolean zzXVw;
    private boolean zzXVx;
    private boolean zzXVy;
    private Node zzXVz;
    private Node zzYPs;
    private DocumentBuilder zzZwh;

    public static class zzZ extends zzYVW {
        private Node zzXVB;

        public zzZ(zzYWB zzywb) {
            super(zzywb);
        }

        @Override // com.aspose.words.zzYVW
        public final void zzYAF() {
            zzYzv();
        }

        @Override // com.aspose.words.zzYVW
        public final void zzYAH() {
            this.zzXVB = next();
        }

        public final Node zzYAv() throws Exception {
            zzYzw();
            return this.zzXVB;
        }
    }

    private zzYWJ(zzYWB zzywb, Node node, zzZA2 zzza2, zzZA5 zzza5, int i) {
        super(zzywb);
        this.zzYPs = node;
        this.zzXVD = zzza2;
        this.zzXVC = zzza5;
        this.zzCF = i;
        Node node2 = zzywb.zzYA2().getNode();
        this.zzXVv = zzYAx() && node.zzYAY() == 6 && node2.zzYAY() == 3 && zzYVU.zztq(node2.getNodeType());
        this.zzXVz = node.getPreviousSibling();
        this.zzZwh = new DocumentBuilder(node.zzYBb());
        zzZS zzzsZzZn = zzZn((Paragraph) this.zzYPs.getAncestor(8));
        if (zzzsZzZn.zzS(zzYMX.zzXGZ) || zzL(zzywb)) {
            this.zzXVE = zzzsZzZn;
        }
    }

    private void zzA(Node node, Node node2) {
        Node nodeZzYm = zzYm(node);
        this.zzXVz = nodeZzYm;
        this.zzXVz = nodeZzYm.zzYD(node2);
    }

    private void zzB(Node node, Node node2) {
        if (node2 == null) {
            return;
        }
        if (zzYAB()) {
            zzYp(node2);
        } else if (this.zzXVz == null || this.zzXVy) {
            zzz(node, node2);
        } else {
            zzA(node, node2);
        }
    }

    private static Node zzC(Node node, Node node2) {
        while (node.getParentNode() != node2) {
            node = node.getParentNode();
        }
        return node;
    }

    private static boolean zzL(zzYWB zzywb) {
        ArrayList<Node> arrayListZzY = zzYWG.zzY(zzywb, 8);
        CompositeNode ancestor = zzywb.zzYA2().getNode().getAncestor(8);
        if (ancestor != null) {
            arrayListZzY.add(0, ancestor);
        }
        zzZS zzzs = null;
        for (int i = 0; i < arrayListZzY.size(); i++) {
            Node node = arrayListZzY.get(i);
            if (i != arrayListZzY.size() - 1 || !zzywb.zzYA1().getNode().zzYF(node) || !zzywb.zzYA1().getNode().zzYB2()) {
                zzZS zzzsZzZn = zzZn((Paragraph) node);
                if (!zzzsZzZn.zzS(zzYMX.zzXGZ)) {
                    return false;
                }
                if (zzzs != null && !zzzsZzZn.zzV(zzzs)) {
                    return false;
                }
                zzzs = zzzsZzZn;
            }
        }
        return true;
    }

    public static void zzS(Paragraph paragraph, zzYMX zzymx) {
        zzZS zzzsZzZn = zzZn(paragraph);
        paragraph.zzZ((zzYMX) zzymx.zzbn());
        zzZ(zzzsZzZn, paragraph.zzZYj());
    }

    private void zzSH(boolean z) {
        if (this.zzXVx) {
            return;
        }
        this.zzZwh.moveTo(this.zzYPs);
        if (z) {
            this.zzZwh.insertParagraph();
        }
        this.zzZwh.write(ControlChar.PAGE_BREAK);
        this.zzXVx = true;
        this.zzXVw = true;
    }

    public static zzYWB zzX(zzYWB zzywb, Node node, zzZA2 zzza2) throws Exception {
        return zzZ(zzywb, node, zzza2, (zzZA3) null, zzZPM.zzYC7);
    }

    public static void zzY(zzYWB zzywb, Node node) throws Exception {
        zzY(zzywb, node, null);
    }

    private boolean zzYAA() {
        return (this.zzCF & 1) != 0;
    }

    private boolean zzYAB() {
        return this.zzXVA != null;
    }

    private Node zzYAC() {
        return zzYm(next() != null ? next() : zzZga().zzYA2().getNode());
    }

    private void zzYAD() {
        Section section;
        if (zzYAA() && (section = (Section) this.zzZwh.getCurrentSection().getPreviousSibling()) != null) {
            section.zzY((zzYCZ) ((Section) zzYVU.zzK(zzZga().zzYA2().getNode(), 2)).zzYvR().zzbn());
            zzYn(section.getBody().zzZYq());
        }
    }

    private void zzYAE() {
        Section section;
        if (this.zzYPs.getAncestor(3) == null) {
            return;
        }
        if (this.zzYPs.getAncestor(20) != null) {
            zzSH(true);
            return;
        }
        if (this.zzYPs.getAncestor(18) != null) {
            zzSH(false);
            return;
        }
        if (this.zzXVx) {
            return;
        }
        this.zzZwh.moveTo(this.zzYPs);
        Section section2 = (Section) zzYVU.zzK(zzZga().zzYA1().getNode(), 2);
        this.zzZwh.zzFU(section2.getPageSetup().getSectionStart());
        if (zzYAz() && section2 != (section = (Section) zzYVU.zzK(zzZga().zzYA2().getNode(), 2))) {
            for (HeaderFooter headerFooter : section2.getHeadersFooters().toArray()) {
                this.zzZwh.getCurrentSection().getHeadersFooters().add(headerFooter);
            }
            for (HeaderFooter headerFooter2 : section.getHeadersFooters().toArray()) {
                if (!zzX(headerFooter2)) {
                    section2.getHeadersFooters().add(headerFooter2.deepClone(true));
                }
            }
        }
        if (this.zzYPs.getNodeType() == 8) {
            this.zzZwh.getCurrentSection().getBody().prependChild(this.zzYPs);
        }
        zzYAD();
        if (!this.zzZwh.getCurrentParagraph().hasChildNodes()) {
            this.zzZwh.getCurrentParagraph().remove();
        }
        this.zzXVx = true;
    }

    private boolean zzYAG() {
        Node node = this.zzXVz;
        if (node == null) {
            node = this.zzYPs;
        }
        return this.zzXVv && next().zzYAY() == 3 && node.zzYAY() == 6;
    }

    private boolean zzYAI() {
        for (Node node = zzZga().zzYA2().getNode(); node != null; node = node.getParentNode()) {
            if (zzYx(node)) {
                return true;
            }
        }
        return false;
    }

    private void zzYAJ() throws Exception {
        Node nodeZzYAv;
        if (zzYAI() && (nodeZzYAv = new zzZ(zzZga()).zzYAv()) != null) {
            Node node = zzZga().zzYA2().getNode();
            while (nodeZzYAv != node && !zzYx(nodeZzYAv)) {
                nodeZzYAv = zzC(node, nodeZzYAv);
            }
            if (nodeZzYAv == node) {
                return;
            }
            while (zzYw(nodeZzYAv)) {
                nodeZzYAv = nodeZzYAv.getParentNode();
            }
            for (Node nodeZzC = nodeZzYAv; nodeZzC != node && zzYj(nodeZzC); nodeZzC = zzC(node, nodeZzC)) {
                zzYv(nodeZzC);
            }
            this.zzXVB = nodeZzYAv;
        }
    }

    private static int[] zzYAw() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        zzdb.zzX(zzYMX.zzXGZ);
        zzdb.zzX(zzYMX.zzXGY);
        return zzdb.toArray();
    }

    private boolean zzYAx() {
        return (this.zzCF & 8) != 0;
    }

    private boolean zzYAy() {
        return (this.zzCF & 4) != 0;
    }

    private boolean zzYAz() {
        return (this.zzCF & 16) != 0;
    }

    private static boolean zzYk(Node node) {
        if (node.getNodeType() != 8) {
            return false;
        }
        return ((Paragraph) node).zzYp8();
    }

    private boolean zzYl(Node node) {
        return this.zzXVv && node.zzYAY() == 3 && zzYVU.zztq(node.getNodeType()) && this.zzXVz.zzYAY() == 6;
    }

    private Node zzYm(Node node) {
        if (this.zzXVz == null) {
            this.zzXVz = this.zzYPs;
        }
        if (node.zzYAY() != this.zzXVz.zzYAY() && !zzYl(node)) {
            if (this.zzXVy) {
                return zzy(node, this.zzYPs);
            }
            Node nodeZzy = zzy(node, this.zzXVz);
            return nodeZzy != null ? nodeZzy : zzx(node, this.zzXVz);
        }
        return this.zzXVz;
    }

    private void zzYn(Node node) {
        if (zzYAA() && node != null && node.getNodeType() == 8) {
            Paragraph paragraph = (Paragraph) node;
            Node node2 = zzZga().zzYA2().getNode();
            Node nodeZzK = (!zzYVU.zztq(node2.getNodeType()) || node2.zzYAY() == 6) ? zzYVU.zzK(node2, 8) : zzYVU.zzXF(node2);
            if (nodeZzK == null || nodeZzK.getNodeType() != 8) {
                return;
            }
            Paragraph paragraph2 = (Paragraph) nodeZzK;
            if (this.zzXVE != null) {
                zzS(paragraph, paragraph2.zzZYj());
            } else {
                paragraph.zzZ((zzYMX) paragraph2.zzZYj().zzbn());
            }
            paragraph.zzC((zzYEF) paragraph2.zzYp5().zzbn());
        }
    }

    private void zzYo(Node node) {
        if (this.zzXVx || this.zzYPs.zzYAY() == node.zzYAY()) {
            return;
        }
        if (this.zzYPs.getNodeType() == 21 && this.zzYPs.zz9I()) {
            return;
        }
        this.zzZwh.moveTo(this.zzYPs);
        zzYEF zzyef = (zzYEF) this.zzZwh.getCurrentParagraph().zzYp5().zzbn();
        this.zzZwh.insertParagraph();
        this.zzZwh.getCurrentParagraph().zzC(zzyef);
        zzYn(this.zzZwh.getCurrentParagraph().zzYB9());
        this.zzXVx = true;
    }

    private void zzYp(Node node) {
        this.zzXVA.appendChild(node);
    }

    private void zzYr(Node node) throws Exception {
        if (this.zzXVw && zzYk(node)) {
            return;
        }
        zzB(node, zzC(node, true));
    }

    private void zzYs(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType == 2) {
            zzYAE();
            this.zzXVz = this.zzYPs;
            this.zzXVz = zzYAC();
            this.zzXVy = true;
            return;
        }
        if (nodeType != 8) {
            return;
        }
        zzYo(node);
        this.zzXVz = this.zzYPs;
        this.zzXVz = zzYAC();
        this.zzXVy = true;
    }

    private void zzYt(Node node) throws Exception {
        zzYu(node);
        zzYr(node);
    }

    private void zzYu(Node node) {
        if (zzYAB()) {
            return;
        }
        int nodeType = node.getNodeType();
        if (nodeType == 2) {
            zzYAE();
            return;
        }
        if (nodeType == 5 || nodeType == 8 || nodeType == 28) {
            if (zzZga().zzYA6()) {
                zzYo(node);
            } else {
                if (node.zzYB4() == null && this.zzYPs.isComposite()) {
                    return;
                }
                zzYAE();
            }
        }
    }

    private void zzYv(Node node) throws Exception {
        Node nodeZzC = zzC(node, false);
        zzYu(node);
        zzB(node, nodeZzC);
        this.zzXVA = (CompositeNode) nodeZzC;
    }

    private boolean zzYw(Node node) {
        if (node.zzYAY() == 4 && this.zzYPs.zzYAY() != 4) {
            return true;
        }
        if (node.zzYAY() != 5 || this.zzYPs.zzYAY() == 5) {
            return node.getNodeType() == 35 && !((OfficeMath) node).isTopLevel();
        }
        return true;
    }

    private static boolean zzYx(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType == 5 || nodeType == 18 || nodeType == 35) {
            return true;
        }
        return (zzYVU.zzXQ(node) || zzYVU.zzXP(node)) && !zzYVU.zztq(node.getNodeType());
    }

    private static Node zzYy(Node node) {
        while (node.getParentNode() != null) {
            if (node.getParentNode().getNodeType() == 32) {
                return node;
            }
            node = node.getParentNode();
        }
        return null;
    }

    private static void zzZ(zzZS zzzs, zzZS zzzs2) {
        if (zzzs.zzS(zzYMX.zzXGZ) || zzzs2.zzS(zzYMX.zzXGZ)) {
            zzzs.zzZ(zzzs2, zzYMX.zzXGY);
        }
        zzzs.zzZ(zzzs2, zzYMX.zzXGZ);
    }

    private void zzZdx() throws Exception {
        zzYAJ();
        zzYzw();
    }

    private static zzZS zzZn(Paragraph paragraph) {
        zzYMX zzymx = new zzYMX();
        if (paragraph != null) {
            paragraph.zzZYj().zzZ(zzymx, zzXVu);
            for (int i : zzXVu) {
                if (!zzymx.zzVE(i)) {
                    Object objFetchParaAttr = paragraph.fetchParaAttr(i);
                    if (!objFetchParaAttr.equals(zzYMX.zzOt(i))) {
                        zzymx.add(i, objFetchParaAttr);
                    }
                }
            }
        }
        return zzymx;
    }

    private static Node zzx(Node node, Node node2) {
        while (node2 != null && node2.isComposite() && node2.zzYAY() != node.zzYAY()) {
            node2 = zzYWI.zzYg(((CompositeNode) node2).getLastChild());
        }
        return node2;
    }

    private static Node zzy(Node node, Node node2) {
        while (node2 != null && node2.zzYAY() != node.zzYAY()) {
            if (node.zzYAY() == 7 && node2.getParentNode().zzT(node)) {
                return node2;
            }
            node2 = zzYWI.zzYh(node2.getParentNode());
        }
        return node2;
    }

    private void zzz(Node node, Node node2) {
        boolean z = this.zzXVz == null;
        Node nodeZzYm = zzYm(node);
        this.zzXVz = nodeZzYm;
        nodeZzYm.zzYC(node2);
        if (z) {
            this.zzXVz = node2;
        }
    }

    @Override // com.aspose.words.zzYVW
    public final void zz9c() throws Exception {
        zzYr(next());
    }

    @Override // com.aspose.words.zzYVW
    public final void zzYAF() throws Exception {
        if (!zzYAs()) {
            zzYzv();
            return;
        }
        if (zzYAB() || zzYx(next())) {
            zzYv(next());
            return;
        }
        Node node = zzZga().zzYA2().getNode();
        if (zzYAx() && zzYVU.zztq(node.getNodeType()) && node.zzYAY() == 3 && node.zzYB4() == next()) {
            return;
        }
        zzYs(next());
    }

    @Override // com.aspose.words.zzYVW
    public final void zzYAH() {
        if (zzYAs()) {
            if (zzYAB()) {
                this.zzXVz = this.zzXVA;
                this.zzXVA = next() != this.zzXVB ? this.zzXVA.getParentNode() : null;
            } else if (zzYAx() && zzYVU.zztq(zzZga().zzYA1().getNode().getNodeType()) && zzZga().zzYA1().getNode().zzYB9() == next()) {
                zzYs(next());
            }
        }
    }

    @Override // com.aspose.words.zzYWI
    public final boolean zzYq(Node node) {
        return (this.zzCF & 2) != 0 && zzYVU.zztq(node.getNodeType());
    }

    @Override // com.aspose.words.zzYVW
    public final void zzZe4() throws Exception {
        if (zzYAs()) {
            if (!zzYAG()) {
                zzYt(next());
                return;
            }
            this.zzXVv = false;
            for (Node node : ((CompositeNode) next()).getChildNodes(0, false)) {
                if (node.isComposite()) {
                    zzYt(node);
                } else {
                    zzYr(node);
                }
            }
            zzYs(next());
        }
    }

    @Override // com.aspose.words.zzYWI
    public final void zztA(int i) {
        if (zzYAB()) {
            return;
        }
        if (i == 4 || i == 5) {
            this.zzXVz = zzYAC();
        }
    }

    private static void zzY(zzYWB zzywb, Node node, zzZA2 zzza2) throws Exception {
        zzZ(zzywb, node, zzza2, (zzZA5) null, 6);
    }

    private Node zzC(Node node, boolean z) throws Exception {
        Node nodeZzZ = zzZ(node, this.zzXVD, this.zzXVC, zzYAy(), z);
        if (this.zzXVE != null && nodeZzZ != null && nodeZzZ.getNodeType() == 8) {
            zzZ(this.zzXVE, ((Paragraph) nodeZzZ).zzZYj());
        }
        return nodeZzZ;
    }

    private static boolean zzX(HeaderFooter headerFooter) {
        Paragraph firstParagraph;
        return headerFooter.hasChildNodes() && headerFooter.getCount() == 1 && (firstParagraph = headerFooter.getFirstParagraph()) != null && !firstParagraph.hasChildNodes();
    }

    public static void zzZ(zzYWB zzywb, Node node, zzZA2 zzza2) throws Exception {
        zzY(zzywb, node, zzza2);
    }

    public static void zzZ(zzYWB zzywb, Node node, zzZA2 zzza2, zzZA5 zzza5, int i) throws Exception {
        zzYWB zzywb2;
        if (zzywb.zz13()) {
            return;
        }
        if (zzywb.zzYA1().getNode().isComposite() && zzywb.zzYA1().zzZot()) {
            zzZYT zzzytZzZop = zzywb.zzYA1().zzZop();
            zzzytZzZop.zzZ(zzywb.zzYA1().getNode().getDocument() instanceof GlossaryDocument ? zzYy(zzywb.zzYA1().getNode()) : null, true, false, false, false, false);
            zzywb2 = new zzYWB(zzywb.zzYA2(), zzzytZzZop);
        } else {
            zzywb2 = zzywb;
        }
        new zzYWJ(zzywb2, node, zzza2, zzza5, i).zzZdx();
    }

    public static zzYWB zzZ(zzYWB zzywb, Node node, zzZA2 zzza2, zzZA3 zzza3, boolean z, int i) throws Exception {
        return zzZ(zzywb, node, zzza2, zzza3, z ? zzZPM.zzYC7 : zzZPK.zzYC7, i);
    }

    public static zzYWB zzZ(zzYWB zzywb, Node node, zzZA2 zzza2, zzZA3 zzza3, zzZB4 zzzb4) throws Exception {
        return zzZ(zzywb, node, zzza2, zzza3, zzzb4, 6);
    }

    private static zzYWB zzZ(zzYWB zzywb, Node node, zzZA2 zzza2, zzZA3 zzza3, zzZB4 zzzb4, int i) throws Exception {
        zzZYT zzzytZzq = zzZYT.zzq(node);
        zzzytZzq.zzZ(null, false, false, false, false, false);
        zzZ(zzywb, node, zzza2, zzza3, i);
        zzYWB zzywb2 = new zzYWB(zzzytZzq, zzZYT.zzq(node));
        if (zzza3 != null) {
            zzza3.zzZ(zzywb, zzywb2);
        }
        return zzZPN.zzZ(zzywb2, zzzb4);
    }
}
