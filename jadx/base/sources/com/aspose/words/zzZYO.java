package com.aspose.words;

import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYO {
    private ArrayList<zzYAU> zzXl;
    private zzYAU[] zzYQ9;
    private boolean zzYQa;
    private Node zzYQb;
    private zzYJA zzYQc;
    private zzZ zzYQd;
    private zzYBP zzYQe;
    private com.aspose.words.internal.zzZQC<zzY> zzYQf;
    private boolean zzYQg;
    private zzZYN zzYQh;
    private int zzYQi;
    private zzYA0 zzYQj;
    private zzYAU zzYQk;
    private zzYAU zzYQl;
    private zzYAU zzYQm;
    private zzYAB zzYQn;
    private int zzYQo;
    private boolean zzYQp;
    private boolean zzYQq;
    private zzYAK zzYQr;
    private com.aspose.words.internal.zzZQC<zzX> zzYQs;
    private com.aspose.words.internal.zzZQC<zzYAH> zzYQt;
    private com.aspose.words.internal.zzZQC<zzY9Y> zzYQu;
    private com.aspose.words.internal.zzZYG<zzYAU> zzYRv;
    private zzZ6R zzZEV;
    private Document zzZEY;
    private zzYAU zzZw8;

    public final class zzX {
        private zzYAU[] zzYQ0;
        private zzYAU zzYQ1;
        private zzYAU zzYQ2;
        private int zzYQi;

        public zzX(zzYAU zzyau, int i, zzYAU zzyau2, zzYAU[] zzyauArr) {
            this.zzYQ2 = zzyau;
            this.zzYQi = i;
            this.zzYQ1 = zzyau2;
            this.zzYQ0 = zzyauArr;
        }

        private boolean zzZ(zzX zzx) {
            return com.aspose.words.internal.zzZKO.equals(this.zzYQ2, zzx.zzYQ2) && com.aspose.words.internal.zzZKO.equals(this.zzYQ1, zzx.zzYQ1) && this.zzYQi == zzx.zzYQi && com.aspose.words.internal.zzZKO.equals(this.zzYQ0, zzx.zzYQ0);
        }

        public final boolean equals(Object obj) {
            return !com.aspose.words.internal.zzZKO.zzA(null, obj) && (obj instanceof zzX) && zzZ((zzX) obj);
        }

        public final int getStoryType() {
            return this.zzYQi;
        }

        public final int hashCode() {
            zzYAU zzyau = this.zzYQ2;
            int iHashCode = (zzyau != null ? zzyau.hashCode() : 0) * 397;
            zzYAU zzyau2 = this.zzYQ1;
            int iHashCode2 = (((iHashCode ^ (zzyau2 != null ? zzyau2.hashCode() : 0)) * 397) ^ this.zzYQi) * 397;
            zzYAU[] zzyauArr = this.zzYQ0;
            return iHashCode2 ^ (zzyauArr != null ? zzyauArr.hashCode() : 0);
        }

        public final zzYAU[] zzZnd() {
            return this.zzYQ0;
        }

        public final zzYAU zzZne() {
            return this.zzYQ1;
        }

        public final zzYAU zzZnf() {
            return this.zzYQ2;
        }
    }

    public final class zzY {
        private boolean zzWD;
        private zzYBP zzYQe;
        private boolean zzYQw;

        public zzY(zzYBP zzybp, boolean z, boolean z2) {
            this.zzYQe = zzybp;
            this.zzWD = z;
            this.zzYQw = z2;
        }

        private boolean zzZ(zzY zzy) {
            return com.aspose.words.internal.zzZKO.equals(this.zzYQe, zzy.zzYQe) && this.zzWD == zzy.zzWD && this.zzYQw == zzy.zzYQw;
        }

        public final boolean equals(Object obj) {
            return !com.aspose.words.internal.zzZKO.zzA(null, obj) && (obj instanceof zzY) && zzZ((zzY) obj);
        }

        public final int hashCode() {
            zzYBP zzybp = this.zzYQe;
            return ((((zzybp != null ? zzybp.hashCode() : 0) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzWD)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzYQw);
        }

        public final boolean zzZng() {
            return this.zzYQw;
        }

        public final boolean zzZnh() {
            return this.zzWD;
        }

        public final zzYBP zzZni() {
            return this.zzYQe;
        }
    }

    public zzZYO(Document document, zzZ6R zzz6r, zzX6 zzx6, com.aspose.words.internal.zzZYG<zzYAU> zzzyg) {
        this(document, zzz6r, zzx6, zzzyg, 0);
    }

    private void reset() {
        this.zzYQr.reset();
        this.zzYQg = zzWr(true);
        this.zzYQd.reset();
    }

    private void zzC(zzYAU zzyau) {
        zzW(zzyau, this.zzYQm);
    }

    private boolean zzD(zzYAU zzyau) {
        zzC(zzyau);
        return zzZnn();
    }

    private static boolean zzE(Paragraph paragraph) {
        for (Node nodeZzZYv = paragraph.zzZYv(); nodeZzZYv != null; nodeZzZYv = nodeZzZYv.zzYB7()) {
            if (!zzYVU.zzXW(nodeZzZYv)) {
                return false;
            }
        }
        return paragraph.isEndOfSection() && !paragraph.isEndOfDocument();
    }

    private boolean zzF(Paragraph paragraph) {
        boolean zZzYkW = this.zzZEV.zzYSR().zzYkW();
        if (zZzYkW || !paragraph.isDeleteRevision()) {
            return zZzYkW && !paragraph.isDeleteRevision() && paragraph.isInsertRevision();
        }
        return true;
    }

    private void zzFD(int i) throws Exception {
        this.zzYQs.push(new zzX(this.zzZw8, this.zzYQi, this.zzYQl, this.zzYQ9));
        this.zzYQ9 = new zzYAU[3];
        zzYAU zzyau = this.zzZw8;
        this.zzYQl = zzyau;
        this.zzYQi = i;
        this.zzYQq = i != 1;
        if (i == 2 || i == 3 || i == 4) {
            this.zzYQm = this.zzYQh.zzZ(i, (zzYA3) zzyau);
        } else {
            this.zzYQm = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzG(zzYAU zzyau) throws Exception {
        boolean z = (zzyau instanceof zzY9Y) && ((zzY9Y) zzyau).zzZ1s() == 3;
        boolean z2 = zzyau instanceof zzYAT;
        boolean z3 = z2 && zzY98.zzlj(this.zzYQi);
        int i = 2;
        while (true) {
            if (i <= 0) {
                break;
            }
            zzYAS zzyas = (zzYAS) com.aspose.words.internal.zzZKW.zzZ(this.zzYQ9[i], zzYAS.class);
            boolean z4 = zzyas != null && zzY9R.zzmW(zzyas.zzZo6());
            boolean z5 = z4 && (zzY9R.zzmU(zzyas.zzZo6()) || (z3 && zzY9R.zzmT(zzyas.zzZo6())));
            if (z4) {
                if (i == 2) {
                    if (z2 && !z5) {
                        return false;
                    }
                    this.zzYQq = true;
                    zzW(zzyau, this.zzYQ9[1]);
                    return zzZnn();
                }
                zzY9Y zzy9y = (zzY9Y) com.aspose.words.internal.zzZKW.zzZ(this.zzYQ9[2], zzY9Y.class);
                if (zzy9y == null || zzy9y.zzZ1s() != 3) {
                    zzYAU[] zzyauArr = this.zzYQ9;
                    zzYAU zzyau2 = zzyauArr[2];
                    if (zzyau2 instanceof zzYAT) {
                        if (z5) {
                            this.zzYQq = true;
                            zzW(zzyau, zzyau2);
                            zzZnV();
                            return zzZnn();
                        }
                        if (z2) {
                            zzZnV();
                        } else if (z) {
                            this.zzYQq = true;
                            zzW(zzyau, zzyauArr[0]);
                            zzZnV();
                            return zzZnn();
                        }
                    }
                } else if (z || (z2 && z5)) {
                    this.zzYQq = true;
                    zzW(zzyau, this.zzYQ9[2]);
                    zzZnV();
                    return zzZnn();
                }
            }
            i--;
        }
    }

    private void zzR(String str, Object obj) {
        zzY20.zzZ(this.zzZEY.getWarningCallback(), str, obj);
    }

    private boolean zzU(Row row) {
        boolean zZzYkW = this.zzZEV.zzYSR().zzYkW();
        if (zZzYkW || !row.zzZYf().zzYrW()) {
            return zZzYkW && !row.zzZYf().zzYrW() && row.zzZYf().zzYrV();
        }
        return true;
    }

    private boolean zzV(zzYAU zzyau, int i) throws Exception {
        zzC(zzyau);
        zzFD(i);
        this.zzYQg = zzWr(false);
        return true;
    }

    private boolean zzWr(boolean z) {
        zzX(this.zzYQr.zzYWt());
        if (this.zzYQr.zzYWt() != null && this.zzYQr.zzYWt().getNode().getNodeType() == 8) {
            this.zzYQa = this.zzYQr.zzYWt().zzZou();
        }
        if (this.zzYQb != null && this.zzYQr.zzYWt().getNode().getNodeType() == 8 && this.zzYQr.zzYWt().zzZou()) {
            this.zzYQr.zz6(this.zzYQb, this.zzYQb.zzYB4().getPreviousSibling());
            this.zzYQb = null;
        }
        if (!this.zzYQr.zzSE(z)) {
            return false;
        }
        Node node = this.zzYQr.zzYWt().getNode();
        if (!this.zzYQa && node.getNodeType() == 33 && (node.zzYB5() instanceof Paragraph)) {
            node.zzYAY();
            this.zzYQb = node;
            while (zzYVU.zztq(this.zzYQr.zzYWt().getNode().getNodeType())) {
                this.zzYQr.zzSE(true);
            }
        }
        return true;
    }

    private boolean zzWs(boolean z) {
        if (z) {
            zzYAU[] zzyauArr = this.zzYQ9;
            zzyauArr[0] = zzyauArr[1];
            zzyauArr[1] = zzyauArr[2];
            zzyauArr[2] = this.zzZw8;
        }
        return z;
    }

    private void zzX(zzZYT zzzyt) {
        ArrayList<Node> arrayListZzW;
        zzYJA zzyja = this.zzYQc;
        if (zzyja == null || (arrayListZzW = zzyja.zzW(zzzyt)) == null) {
            return;
        }
        this.zzYQr.zzYZ(arrayListZzW);
    }

    private void zzY(zzYAS zzyas) throws Exception {
        if (zzyas.zzZo6() != 21595) {
            return;
        }
        Table table = (Table) this.zzYQr.zzYWt().getNode().getAncestor(5);
        if (table.getFirstRow().zzZYf().zzXXp().zzYmE() != 0) {
            zzR("Cell spacing is not supported. The table will be rendered without cell spacing.", table);
        }
        if (zzyas.zzY6a().zzYKv()) {
            zzR("Table column widths may need to be calculated. Rendered column widths could differ.", table);
        }
    }

    public static int zzZ(OfficeMath officeMath) {
        officeMath.getParentNode().getNodeType();
        if (!zzk(officeMath) || zzn(officeMath)) {
            return 1;
        }
        return officeMath.getChildNodes(0, false).getCount();
    }

    private void zzZQ(ArrayList<zzYAU> arrayList) {
        this.zzXl = arrayList;
        this.zzYQo = 0;
    }

    private boolean zzZnA() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzZno();
    }

    private boolean zzZnB() throws Exception {
        if (18 != this.zzYQr.zzYWt().getNode().getNodeType()) {
            this.zzYQr.zzYWt().getNode().getNodeType();
        }
        if (18 == this.zzYQr.zzYWt().getNode().getNodeType() && ((ShapeBase) this.zzYQr.zzYWt().getNode()).getMarkupLanguage() == 0) {
            this.zzYQr.zzYWt().getNode().getNodeType();
            if (((Shape) this.zzYQr.zzYWt().getNode()).zzY9h().getHidden()) {
                this.zzYQr.zzYWt().zzZor();
                this.zzYQr.zzYWt().zzZot();
                if (this.zzYQr.zzYWt().zzZot()) {
                    zzZnm();
                }
                return zzZno();
            }
        }
        boolean z = (this.zzYQr.zzYWt().getNode() instanceof CompositeNode) && ((CompositeNode) this.zzYQr.zzYWt().getNode()).zzZYy();
        if (!this.zzYQr.zzYWt().zzZot()) {
            zzY9X zzy9x = (zzY9X) this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode());
            zzY(zzy9x.zzY6M().zzYLJ());
            return z ? zzV(zzy9x, 5) : zzD(zzy9x);
        }
        if (z) {
            zzZnl();
        }
        zzZnm();
        return zzZno();
    }

    private boolean zzZnC() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzD((zzYAC) this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode()));
    }

    private boolean zzZnD() throws Exception {
        if (22 != this.zzYQr.zzYWt().getNode().getNodeType()) {
            this.zzYQr.zzYWt().getNode().getNodeType();
        }
        zzYAH zzyah = (zzYAH) this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode());
        if (zzyah.zzY5z().getNodeType() == 22) {
            int fieldType = zzyah.zzY5z().getFieldType();
            if (fieldType == 13) {
                this.zzYQn.zzY5p().zzYV(true);
            } else if (fieldType == 88) {
                this.zzYQn.zzQt(true);
            }
        } else if (zzyah.zzY5z().getNodeType() == 23 && zzyah.zzY5z().getFieldType() == 88) {
            this.zzYQn.zzQt(false);
        }
        this.zzYQt.push(zzyah);
        return zzD(zzyah);
    }

    private boolean zzZnE() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzZnD();
    }

    private boolean zzZnF() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzZnD();
    }

    private boolean zzZnG() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        zzYAH zzyah = (zzYAH) this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode());
        zzYAH zzyahPop = this.zzYQt.pop();
        if (zzyahPop.zzY5z().getNodeType() == 23) {
            zzyah.zzX(zzyahPop);
            zzyahPop = this.zzYQt.pop();
        }
        zzyah.zzY(zzyahPop);
        if (zzyahPop.getFieldType() == 13) {
            this.zzYQn.zzY5p().zzYV(false);
        }
        return zzD(zzyah);
    }

    private boolean zzZnH() throws Exception {
        if (this.zzYQr.zzYWt().zzZou()) {
            return zzV(this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode()), ((Footnote) this.zzYQr.zzYWt().getNode()).getStoryType());
        }
        this.zzYQr.zzYWt().zzZot();
        zzZnl();
        zzZnm();
        return zzZno();
    }

    private boolean zzZnI() throws Exception {
        this.zzYQr.zzYWt().getNode();
        if (!this.zzYQr.zzYWt().zzZou()) {
            zzR("Comments are partially supported. Appearance and position could be different.", this.zzYQr.zzYWt().getNode());
            zzZnl();
            if (this.zzYQr.zzYWt().zzZot()) {
                zzZnm();
            }
            return zzZno();
        }
        zzYAQ zzyaq = (zzYAQ) this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode());
        if (zzyaq.zzY6N().isHidden()) {
            this.zzYQr.zzYWt().zzZor();
            return zzZno();
        }
        zzY(zzyaq);
        zzZQ(this.zzYQd.zzZ(zzyaq, (Comment) this.zzYQr.zzYWt().getNode()));
        return zzV(zzyaq, 4);
    }

    private boolean zzZnJ() throws Exception {
        if (this.zzYQr.zzYWt().getNode().getNodeType() != 33) {
            this.zzYQr.zzYWt().getNode().getNodeType();
        }
        return this.zzYQr.zzYWt().zzZou() ? zzD((zzYAQ) this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode())) : zzZno();
    }

    private boolean zzZnK() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        BookmarkEnd bookmarkEnd = (BookmarkEnd) this.zzYQr.zzYWt().getNode();
        zzYAU zzyau = this.zzYRv.get(bookmarkEnd.getName());
        if (zzyau == null) {
            return zzZno();
        }
        zzYAT zzyat = (zzYAT) this.zzYQn.zzWw(bookmarkEnd);
        zzyat.zzZC(zzyau);
        zzyau.zzZC(zzyat);
        if (zzG(zzyat)) {
            return true;
        }
        return zzD(zzyat);
    }

    private boolean zzZnL() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        zzYAT zzyat = (zzYAT) this.zzYQn.zzWw(this.zzYQr.zzYWt().getNode());
        if (!this.zzYRv.containsKey(zzyat.getName())) {
            this.zzYRv.zzW(zzyat.getName(), zzyat);
        }
        if (zzG(zzyat)) {
            return true;
        }
        return zzD(zzyat);
    }

    private boolean zzZnM() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzZno();
    }

    private boolean zzZnN() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        if (this.zzYQr.zzYWt().zzZou()) {
            return zzZno();
        }
        zzYAS zzyasZzWy = this.zzYQn.zzWy(this.zzYQr.zzYWt().getNode());
        zzY(zzyasZzWy);
        return zzD(zzyasZzWy);
    }

    private boolean zzZnO() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzZno();
    }

    private boolean zzZnP() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        Paragraph paragraph = (Paragraph) this.zzYQr.zzYWt().getNode();
        if (this.zzYQr.zzYWt().zzZou()) {
            zzD(paragraph);
            if (paragraph.getParagraphFormat().getAlignment() == 4) {
                zzR("Distributed paragraph alignment is not supported. Justified will be used instead. The paragraph text could be aligned differently.", paragraph);
            }
            if (zzC(paragraph)) {
                zzZ(paragraph.getRuns());
            }
            if (zzZnu()) {
                return true;
            }
            return zzZno();
        }
        this.zzYQr.zzYWt().zzZot();
        zzZnj();
        zzYAS zzyasZzWy = this.zzYQn.zzWy(paragraph);
        zzZ(zzyasZzWy, paragraph);
        if (paragraph.isEndOfSection()) {
            this.zzYQk = zzyasZzWy;
        }
        if (paragraph.zzYp2() || paragraph.zzYp3()) {
            if (zzY98.zzlj(this.zzYQi)) {
                this.zzYQh.zzZ(this.zzYQi, zzyasZzWy);
            }
            zzyasZzWy.zzZx(this.zzYQl);
            this.zzYQl.zzZx(zzyasZzWy);
        }
        return zzD(zzyasZzWy);
    }

    private boolean zzZnQ() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        if (!this.zzYQr.zzYWt().zzZou()) {
            zzZnm();
        } else if (this.zzYQp) {
            this.zzYQr.zzYWt().zzZor();
        } else {
            this.zzYQi = 1;
            this.zzYQl = null;
        }
        return zzZno();
    }

    private boolean zzZnR() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        int storyType = ((HeaderFooter) this.zzYQr.zzYWt().getNode()).getStoryType();
        if (!this.zzYQr.zzYWt().zzZou()) {
            this.zzYQr.zzYWt().zzZot();
            this.zzYQm = null;
            this.zzYQi = 1;
            this.zzYQl = null;
            zzZnm();
        } else if (this.zzYQp) {
            this.zzYQm = null;
            this.zzYQi = storyType;
            this.zzYQl = this.zzYQk;
        } else {
            this.zzYQr.zzYWt().zzZor();
        }
        return zzZno();
    }

    private boolean zzZnS() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        if (this.zzYQr.zzYWt().zzZot()) {
            if (this.zzYQp) {
                zzZnl();
                this.zzYQp = false;
            } else {
                zzFD(1);
                this.zzYQp = true;
                this.zzYQr.zzYWt().zzZos();
            }
            zzZnm();
        }
        return zzZno();
    }

    private boolean zzZnT() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        if (this.zzYQr.zzYWt().zzZot()) {
            return true;
        }
        zzZno();
        return false;
    }

    private void zzZnV() {
        zzYAU[] zzyauArr = this.zzYQ9;
        zzyauArr[2] = zzyauArr[1];
        zzyauArr[1] = zzyauArr[0];
        zzyauArr[0] = null;
    }

    private void zzZnW() {
        if (!this.zzYQq) {
            this.zzYQm = this.zzZw8;
        } else {
            this.zzYQq = false;
            this.zzZw8 = this.zzYQm;
        }
    }

    private void zzZnj() {
        if (this.zzYQf.size() <= 0) {
            return;
        }
        zzY zzyPop = this.zzYQf.pop();
        this.zzYQe = zzyPop.zzZni();
        this.zzYQn.zzQu(zzyPop.zzZnh());
        this.zzYQn.zzQv(zzyPop.zzZng());
    }

    private boolean zzZnk() {
        return this.zzYQu.size() > 0;
    }

    private void zzZnl() {
        zzX zzxPop = this.zzYQs.pop();
        this.zzYQm = zzxPop.zzZnf();
        this.zzYQl = zzxPop.zzZne();
        this.zzYQi = zzxPop.getStoryType();
        this.zzYQ9 = zzxPop.zzZnd();
    }

    private void zzZnm() {
        zzYAU[] zzyauArr = this.zzYQ9;
        zzyauArr[0] = null;
        zzyauArr[1] = null;
        zzyauArr[2] = null;
    }

    private boolean zzZnn() {
        this.zzYQg = zzWr(false);
        return true;
    }

    private boolean zzZno() {
        this.zzYQg = zzWr(true);
        return false;
    }

    private zzYJA zzZnp() {
        zzYJ7 zzyj7ZzYSR = this.zzZEV.zzYSR();
        if (!this.zzZEY.hasRevisions() || zzyj7ZzYSR.getShowInBalloons() == 0) {
            return null;
        }
        return new zzYJA(this.zzZEY, zzyj7ZzYSR);
    }

    private boolean zzZnq() {
        ArrayList<zzYAU> arrayList = this.zzXl;
        if (arrayList == null) {
            return false;
        }
        if (this.zzYQo >= arrayList.size()) {
            zzZQ(null);
            return false;
        }
        ArrayList<zzYAU> arrayList2 = this.zzXl;
        int i = this.zzYQo;
        this.zzYQo = i + 1;
        zzYAU zzyau = arrayList2.get(i);
        zzC(zzyau);
        if (!com.aspose.words.internal.zzZYD.zzi("Arial Unicode MS", zzyau.zzY6N().getName())) {
            return true;
        }
        zzR("Arial Unicode MS font is used in the document. Line spacing could be rendered differently.", zzyau);
        return true;
    }

    private boolean zzZnr() throws Exception {
        Node node = this.zzYQr.zzYWt().getNode();
        boolean z = node.getNodeType() == 21;
        node.getNodeType();
        if (this.zzYQr.zzYWt().zzZot()) {
            return zzZno();
        }
        boolean zZzk = zzk(node);
        if (zZzk && !zzl(node)) {
            return zzZno();
        }
        if ((zZzk && zzl(node) && !zzn(node)) || z) {
            OfficeMath officeMath = (OfficeMath) node.getParentNode().deepClone(false);
            officeMath.appendChild(node.deepClone(true));
            officeMath.zzYG(node.getParentNode().getParentNode());
            node = officeMath;
        }
        zzY9X zzy9x = (zzY9X) this.zzYQn.zzWw(node);
        zzY(zzy9x.zzY6M().zzYLJ());
        this.zzYQr.zzYWt().zzZor();
        return zzD(zzy9x);
    }

    private String zzZns() {
        if (this.zzZEV.zzYSN()) {
            return this.zzYQr.zzYWt().getNode().getText();
        }
        if (this.zzYQe == null || this.zzYQr.zzYWt().getNode().getNodeType() != 21) {
            return null;
        }
        String strZzY8s = this.zzYQe.zzY8s();
        this.zzYQe.moveNext();
        return strZzY8s;
    }

    private boolean zzZnt() throws Exception {
        if (21 != this.zzYQr.zzYWt().getNode().getNodeType()) {
            this.zzYQr.zzYWt().getNode().getNodeType();
        }
        if (zzm(this.zzYQr.zzYWt().getNode())) {
            return zzZnr();
        }
        zzZQ(this.zzYQn.zzY((Inline) this.zzYQr.zzYWt().getNode(), zzZns(), zzZnk()));
        if (this.zzXl == null) {
            return zzZno();
        }
        zzZno();
        this.zzXl.size();
        return zzZnq();
    }

    private boolean zzZnu() throws Exception {
        this.zzYQr.zzYWt().getNode();
        Paragraph paragraph = (Paragraph) this.zzYQr.zzYWt().getNode();
        if ((!this.zzZEV.zzYTa() && (((!paragraph.isEndOfCell() && paragraph.getParagraphBreakFont().getHidden()) || (paragraph.isEndOfSection() && !paragraph.isEndOfDocument())) && zzYMK.zzXe(paragraph) != 0)) || zzE(paragraph)) {
            return false;
        }
        Paragraph paragraphZzG = zzG(paragraph);
        if (paragraph.zzYoU() || paragraph.zzYoT() || (paragraph != paragraphZzG && (paragraphZzG.zzYoU() || paragraphZzG.zzYoT()))) {
            return zzD(this.zzYQn.zzWx(paragraph));
        }
        return false;
    }

    private boolean zzZnv() {
        this.zzYQr.zzYWt().getNode();
        if (this.zzYQr.zzYWt().zzZot()) {
            zzZnm();
        }
        return zzZno();
    }

    private boolean zzZnw() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return (this.zzYQr.zzYWt().zzZou() && (this.zzYQr.zzYWt().getNode() instanceof zzZMS)) ? zzZnv() : zzZno();
    }

    private boolean zzZnx() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzZnr();
    }

    private boolean zzZny() {
        this.zzYQr.zzYWt().getNode().getNodeType();
        return zzZno();
    }

    private boolean zzZnz() throws Exception {
        this.zzYQr.zzYWt().getNode().getNodeType();
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) this.zzYQr.zzYWt().getNode();
        boolean z = structuredDocumentTag.getLevel() == 2 || structuredDocumentTag.getLevel() == 4;
        if (structuredDocumentTag.getLevel() == 1) {
            structuredDocumentTag.zzYBd().getNodeType();
        } else if (z) {
            if (structuredDocumentTag.getLevel() == 2 && structuredDocumentTag.zzYBd().getNodeType() != 3 && structuredDocumentTag.zzYBd().getNodeType() != 4 && structuredDocumentTag.zzYBd().getNodeType() != 18) {
                structuredDocumentTag.zzYBd().getNodeType();
            }
            if (structuredDocumentTag.getLevel() == 4) {
                structuredDocumentTag.zzYBd().getNodeType();
            }
        } else {
            structuredDocumentTag = null;
        }
        if (this.zzYQr.zzYWt().zzZou()) {
            if (structuredDocumentTag == null) {
                this.zzYQu.push(null);
                return zzZno();
            }
            zzY9Y zzy9y = (zzY9Y) this.zzYQn.zzWw(structuredDocumentTag);
            zzy9y.zzlD(2);
            this.zzYQu.push(zzy9y);
            return zzD(zzy9y);
        }
        this.zzYQr.zzYWt().zzZot();
        this.zzYQu.size();
        zzYAU zzyau = (zzY9Y) this.zzYQu.pop();
        if (zzyau == null) {
            return zzZno();
        }
        zzY9Y zzy9y2 = (zzY9Y) this.zzYQn.zzWw(structuredDocumentTag);
        zzy9y2.zzlD(3);
        zzy9y2.zzZC(zzyau);
        zzyau.zzZC(zzy9y2);
        if (z && zzG(zzy9y2)) {
            return true;
        }
        return zzD(zzy9y2);
    }

    private static boolean zzk(Node node) {
        while (node.getNodeType() != 35) {
            if (!zzm(node)) {
                return false;
            }
            node = node.getParentNode();
        }
        return zzYOL.zzi((OfficeMath) node);
    }

    private static boolean zzl(Node node) {
        return zzm(node) && !zzm(node.getParentNode());
    }

    private static boolean zzm(Node node) {
        return (node == null || node.getParentNode() == null || node.getParentNode().getNodeType() != 35) ? false : true;
    }

    private static boolean zzn(Node node) {
        return 35 == node.getNodeType() && ((OfficeMath) node).zzYrX().getMathObjectType() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        return zzWs(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean moveNext() throws Exception {
        zzZnW();
        boolean z = true;
        if (zzZnq()) {
            return zzWs(true);
        }
        boolean z2 = false;
        boolean zZzZnw = false;
        while (true) {
            if (!zZzZnw) {
                if (this.zzYQg) {
                    this.zzYQr.zzYWt().getNode();
                    switch (this.zzYQr.zzYWt().getNode().getNodeType()) {
                        case 1:
                            zZzZnw = zzZnT();
                            z = !zZzZnw;
                            break;
                        case 2:
                            zZzZnw = zzZnS();
                            break;
                        case 3:
                            zZzZnw = zzZnQ();
                            break;
                        case 4:
                            zZzZnw = zzZnR();
                            break;
                        case 5:
                            zZzZnw = zzZnO();
                            break;
                        case 6:
                            zZzZnw = zzZnN();
                            break;
                        case 7:
                            zZzZnw = zzZnM();
                            break;
                        case 8:
                            zZzZnw = zzZnP();
                            break;
                        case 9:
                            zZzZnw = zzZnL();
                            break;
                        case 10:
                            zZzZnw = zzZnK();
                            break;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 29:
                        case 30:
                            zZzZnw = zzZno();
                            break;
                        case 17:
                        case 18:
                            zZzZnw = zzZnB();
                            break;
                        case 19:
                            zZzZnw = zzZnI();
                            break;
                        case 20:
                            zZzZnw = zzZnH();
                            break;
                        case 21:
                        case 26:
                            zZzZnw = zzZnt();
                            break;
                        case 22:
                            zZzZnw = zzZnF();
                            break;
                        case 23:
                            zZzZnw = zzZnE();
                            break;
                        case 24:
                            zZzZnw = zzZnG();
                            break;
                        case 25:
                            zZzZnw = zzZnC();
                            break;
                        case 27:
                            zZzZnw = zzZnA();
                            break;
                        case 28:
                            zZzZnw = zzZnz();
                            break;
                        case 31:
                        case 32:
                        default:
                            throw new IllegalStateException("Unrecognized node type.");
                        case 33:
                        case 34:
                            zZzZnw = zzZnJ();
                            break;
                        case 35:
                            zZzZnw = zzZnx();
                            break;
                        case 36:
                            zZzZnw = zzZny();
                            break;
                        case 37:
                            zZzZnw = zzZnw();
                            break;
                    }
                }
            } else {
                z2 = z;
            }
        }
    }

    public final zzYAU zz14() {
        return this.zzZw8;
    }

    public final zzYA0 zzZnU() {
        return this.zzYQj;
    }

    public zzZYO(CompositeNode compositeNode, zzZ6R zzz6r, zzX6 zzx6, com.aspose.words.internal.zzZYG<zzYAU> zzzyg, int i) {
        this.zzYQu = new com.aspose.words.internal.zzZQC<>();
        this.zzYQt = new com.aspose.words.internal.zzZQC<>();
        this.zzYQs = new com.aspose.words.internal.zzZQC<>();
        this.zzYQj = new zzYA0();
        this.zzYQf = new com.aspose.words.internal.zzZQC<>();
        this.zzYQ9 = new zzYAU[3];
        compositeNode.zzYBb();
        Document documentZzYBb = compositeNode.zzYBb();
        this.zzZEY = documentZzYBb;
        this.zzZEV = zzz6r;
        this.zzYRv = zzzyg;
        this.zzYQi = i;
        this.zzYQn = new zzYAB(documentZzYBb, zzz6r, zzx6);
        this.zzYQh = new zzZYN(null);
        this.zzYQc = zzZnp();
        this.zzYQr = new zzYAK(new zzYWB(compositeNode, compositeNode));
        this.zzYQd = new zzZ(this.zzYQn, this.zzYQc);
        reset();
    }

    private static boolean zzC(Paragraph paragraph) {
        return paragraph.zzYVe() != null;
    }

    private void zzW(zzYAU zzyau, zzYAU zzyau2) {
        this.zzZw8 = zzyau;
        this.zzYQj.zzZ(zzyau2, this.zzYQi, this.zzYQl);
    }

    public static class zzZ {
        private zzYJA zzYQ4;
        private int zzYQ5 = -1;
        private int zzYQ6;
        private int zzYQ7;
        private int zzYQ8;
        private zzYAB zzYQn;

        public zzZ(zzYAB zzyab, zzYJA zzyja) {
            this.zzYQn = zzyab;
            this.zzYQ4 = zzyja;
        }

        private String[] zzX(zzYAQ zzyaq, Comment comment) {
            String strZzX = zzX(comment);
            this.zzYQ7++;
            return new String[]{com.aspose.words.internal.zzZKN.format("{0} [{1}{2}{3}]", zzUF.zzZZu(), zzyaq.getInitials(), Integer.valueOf(this.zzYQ7), strZzX), C18241k5.f55433h, " "};
        }

        private String[] zzY(zzYAQ zzyaq, Comment comment) {
            int i = this.zzYQ8 + 1;
            this.zzYQ8 = i;
            zzyaq.zzlO(i);
            return zzyaq.zzY60() ? zzY(comment) : zzX(zzyaq, comment);
        }

        public final void reset() {
            this.zzYQ8 = 0;
            this.zzYQ7 = 0;
            this.zzYQ6 = 0;
        }

        public final ArrayList<zzYAU> zzZ(zzYAQ zzyaq, Comment comment) throws Exception {
            String[] strArrZzY = zzY(zzyaq, comment);
            DocumentBase document = comment.getDocument();
            Paragraph paragraph = new Paragraph(document);
            Style styleZzZ7 = document.getStyles().zzZ7(153, false);
            if (styleZzZ7 != null) {
                paragraph.getParagraphFormat().setStyle(styleZzZ7);
            }
            ArrayList<zzYAU> arrayList = new ArrayList<>();
            for (String str : strArrZzY) {
                Run run = new Run(document, str);
                run.getFont().setBold(true);
                if (styleZzZ7 != null) {
                    run.getFont().setSize(styleZzZ7.getFont().getSize());
                    run.getFont().setSizeBi(styleZzZ7.getFont().getSizeBi());
                }
                paragraph.appendChild(run);
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) this.zzYQn.zzY(run, str, false));
            }
            Iterator<zzYAU> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().zzY79();
            }
            return arrayList;
        }

        private String zzX(Comment comment) {
            if (comment.getParentId() == -1) {
                return "";
            }
            if (this.zzYQ5 != comment.getParentId()) {
                this.zzYQ5 = comment.getParentId();
                this.zzYQ6 = this.zzYQ7;
            }
            return com.aspose.words.internal.zzZKN.format("R{0}", Integer.valueOf(this.zzYQ6));
        }

        private String[] zzY(Comment comment) {
            String strZzZZp;
            RevisionGroup revisionGroupZzN = this.zzYQ4.zzN(comment);
            boolean z = true;
            if (revisionGroupZzN.zzYlm() != null) {
                if (revisionGroupZzN.zzYlm().getType() == 1) {
                    strZzZZp = zzUF.zzZZt();
                } else {
                    throw new UnsupportedOperationException("Insertion revision is not supported.");
                }
            } else if (revisionGroupZzN.zzYll() != null) {
                strZzZZp = zzZ(revisionGroupZzN, comment.zzYBb());
                if (revisionGroupZzN.zzYll().getType() == 1) {
                    z = false;
                }
            } else {
                revisionGroupZzN.zzYsN();
                strZzZZp = zzUF.zzZZp();
            }
            if (z) {
                return new String[]{strZzZZp, C18241k5.f55433h, " "};
            }
            return new String[]{strZzZZp};
        }

        private static String zzZ(RevisionGroup revisionGroup, Document document) {
            String strZzZZq;
            com.aspose.words.internal.zzZYD.zzXk(revisionGroup.zzYlj());
            Iterator<RevisionGroup> it = document.getRevisions().getGroups().iterator();
            int i = 0;
            boolean z = false;
            while (true) {
                if (it.hasNext()) {
                    RevisionGroup next = it.next();
                    if (zzZYO.zzX(next)) {
                        i++;
                    }
                    if (com.aspose.words.internal.zzZKN.equals(next.zzYlj(), revisionGroup.zzYlj())) {
                        if (!zzZYO.zzX(next)) {
                            z = true;
                        } else if (zzZYO.zzX(revisionGroup)) {
                            strZzZZq = zzUF.zzZZs();
                        } else if (z) {
                            strZzZZq = zzUF.zzZZr();
                        } else {
                            strZzZZq = zzUF.zzZZq();
                        }
                    }
                } else {
                    strZzZZq = "";
                    break;
                }
            }
            com.aspose.words.internal.zzZYD.zzXk(strZzZZq);
            return com.aspose.words.internal.zzZKN.format(strZzZZq, Integer.valueOf(i));
        }
    }

    private void zzD(Paragraph paragraph) {
        this.zzYQf.push(new zzY(this.zzYQe, this.zzYQn.zzZng(), this.zzYQn.zzZnh()));
        this.zzYQn.zzQu(zzYMK.zzZ(paragraph, this.zzZEV).getBidi());
        zzYAB zzyab = this.zzYQn;
        zzyab.zzQv(zzyab.zzY5p().zzZ(paragraph));
    }

    private void zzZ(zzYAS zzyas, Paragraph paragraph) {
        zzYJA zzyja = this.zzYQc;
        if (zzyja != null) {
            zzyja.zzZ(zzyas, this.zzYQi, paragraph);
        }
    }

    private void zzF(zzYAU zzyau) throws Exception {
        int storyType = zzyau.zzaa().getStoryType();
        this.zzYQi = storyType;
        if (storyType == 1) {
            this.zzYQl = null;
            return;
        }
        if (storyType == 2 || storyType == 3) {
            this.zzYQl = ((zzYVN) zzE(zzyau)).zzYzk();
            return;
        }
        if (storyType == 4) {
            this.zzYQl = ((zzUI) zzE(zzyau)).zzZZC();
            return;
        }
        if (storyType != 5) {
            zzYAU zzyauZzYQc = ((zzZ55) ((zzZKV) zzyau.zzaa()).zzZ4C().zzZXY().zz6w()).zzYQc();
            this.zzYQl = zzyauZzYQc;
            if (zzyauZzYQc instanceof zzYAS) {
                zzY9R.zzmP(zzyauZzYQc.zzZo6());
                return;
            }
            return;
        }
        this.zzYQl = ((zzYBY) zzyau.zzaa()).zzY8N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzX(RevisionGroup revisionGroup) {
        return revisionGroup.zzYll() != null && revisionGroup.zzYll().getType() == 1;
    }

    private static zzYCT zzE(zzYAU zzyau) {
        if (zzyau.zza9() != null) {
            return zzyau.zza9().zzYTk();
        }
        zzZ4N zzz4nZzYPe = zzyau.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(zzyau);
        while (zzz4nZzYPe.moveNext()) {
            zzYAU zzyau2 = (zzYAU) zzz4nZzYPe.zzYPi();
            if (zzyau2.zzY6X()) {
                return zzyau2.zza9().zzYTk();
            }
        }
        return null;
    }

    private void zzZ(RunCollection runCollection) {
        if (this.zzZEV.zzYSN()) {
            return;
        }
        this.zzYQe = new zzYBP(runCollection, this.zzZEV);
    }

    private void zzY(zzYAQ zzyaq) {
        zzYJA zzyja = this.zzYQc;
        if (zzyja != null) {
            zzyja.zzW(zzyaq, (Comment) this.zzYQr.zzYWt().getNode());
        }
    }

    private void zzY(zzZ39 zzz39) {
        if (this.zzYQr.zzYWt().zzZou()) {
            if ((this.zzYQr.zzYWt().getNode().zzYBd() == null || this.zzYQr.zzYWt().getNode().zzYBd().getNodeType() != 17) && zzz39.isFloating()) {
                int wrapType = zzz39.getWrapType();
                if (wrapType == 4) {
                    zzR("There are known issues with \"Tight\" text wrapping type. Wrapped content could be rendered differently.", this.zzYQr.zzYWt().getNode());
                } else if (wrapType == 5) {
                    zzR("There are known issues with \"Through\" text wrapping type. Wrapped content could be rendered differently.", this.zzYQr.zzYWt().getNode());
                }
                if (zzz39.zzYMf() != 2 || this.zzYQr.zzYWt().getNode().getAncestor(7) == null || ((Paragraph) this.zzYQr.zzYWt().getNode().getAncestor(8)).getParagraphFormat().getLeftIndent() >= 0.0d) {
                    return;
                }
                zzR("Combination of paragraph indents and relative position of the nested floating object could result in unexpected rendered position.", this.zzYQr.zzYWt().getNode());
            }
        }
    }

    public zzZYO(zzYWB zzywb, zzYAU zzyau) throws Exception {
        this.zzYQu = new com.aspose.words.internal.zzZQC<>();
        this.zzYQt = new com.aspose.words.internal.zzZQC<>();
        this.zzYQs = new com.aspose.words.internal.zzZQC<>();
        this.zzYQj = new zzYA0();
        this.zzYQf = new com.aspose.words.internal.zzZQC<>();
        this.zzYQ9 = new zzYAU[3];
        if (zzywb != null) {
            zzywb.zzYA2();
        }
        this.zzZEY = zzywb.zzYA2().getNode().zzYBb();
        this.zzZEV = zzyau.zza8();
        this.zzYRv = zzyau.zzab().zzZoO();
        this.zzYQn = new zzYAB(this.zzZEY, this.zzZEV, zzyau.zzab().zzZoP());
        this.zzYQh = new zzZYN(zzyau);
        this.zzYQr = new zzYAK(zzywb);
        this.zzYQc = null;
        this.zzYQd = new zzZ(this.zzYQn, null);
        zzY(zzywb);
        reset();
        zzZ4N zzz4nZzYPe = zzyau.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(zzyau);
        this.zzZw8 = zzz4nZzYPe.movePrevious() ? (zzYAU) zzz4nZzYPe.zzYPi() : null;
        this.zzYQp = zzyau.zzaa() instanceof zzZKV;
        zzF(zzyau);
        this.zzYQn.zzY5p().zzYV(zzyau.zzZ(false, 13) != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0010, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Paragraph zzG(Paragraph paragraph) {
        if (!zzF(paragraph)) {
            return paragraph;
        }
        Document documentZzYBb = paragraph.zzYBb();
        zzZYT zzzyt = new zzZYT(paragraph);
        while (zzzyt.zzZ(documentZzYBb, true, true, false, false, false)) {
            int nodeType = zzzyt.getNode().getNodeType();
            if (nodeType != 4 && nodeType != 31) {
                if (nodeType != 6) {
                    if (nodeType != 7) {
                        if (nodeType != 8) {
                            if (nodeType != 35 && nodeType != 36) {
                                switch (nodeType) {
                                }
                            }
                        } else {
                            if (!zzF((Paragraph) zzzyt.getNode())) {
                                return (Paragraph) zzzyt.getNode();
                            }
                            zzzyt.zzZor();
                        }
                    }
                } else {
                    if (!zzU((Row) zzzyt.getNode())) {
                        return paragraph;
                    }
                    zzzyt.zzZor();
                }
            }
            if (zzzyt.zzZot()) {
                return paragraph;
            }
            zzzyt.zzZor();
        }
        return paragraph;
    }

    private void zzY(zzYWB zzywb) {
        if (this.zzZEV.zzYSN()) {
            return;
        }
        this.zzYQe = new zzYBP(zzywb, this.zzZEV);
    }
}
