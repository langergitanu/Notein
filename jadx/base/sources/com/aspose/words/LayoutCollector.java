package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.huawei.hms.network.embedded.C18177fb;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class LayoutCollector {
    private com.aspose.words.internal.zz7D<Node> zzYgv;
    private HashMap<Node, zzYAU> zzYgw;
    private Document zzZEY;
    private zzZ zzYgu = new zzZ(0);
    private HashMap<Node, ArrayList<Integer>> zzYgt = new HashMap<>();

    public static class zzY {
        private int zzTL;
        private ArrayList<Paragraph> zzXK;
        private zzZYT zzYgp;
        private boolean zzYgq;

        public zzY(Iterable<Paragraph> iterable, boolean z) {
            this.zzXK = new ArrayList<>();
            this.zzXK = com.aspose.words.internal.zzZQG.zzT(iterable);
            this.zzYgq = z;
            if (!z) {
                this.zzTL = 0;
                this.zzYgp = new zzZYT(getParagraph());
            } else {
                this.zzTL = r2.size() - 1;
                zzZYT zzzyt = new zzZYT(getParagraph());
                this.zzYgp = zzzyt;
                zzzyt.zzZor();
            }
        }

        public final Node getNode() {
            return this.zzYgp.getNode();
        }

        public final Paragraph getParagraph() {
            return this.zzXK.get(this.zzTL);
        }

        public final boolean zzYTG() {
            while (true) {
                zzZYT zzzyt = this.zzYgp;
                Paragraph paragraph = getParagraph();
                boolean z = this.zzYgq;
                if (zzzyt.zzZ(paragraph, !z, true, !z, false, false)) {
                    return true;
                }
                if (!this.zzYgq && this.zzTL >= this.zzXK.size() - 1) {
                    return false;
                }
                boolean z2 = this.zzYgq;
                if (z2 && this.zzTL <= 0) {
                    return false;
                }
                this.zzTL += z2 ? -1 : 1;
                this.zzYgp.zzo(getParagraph());
                if (this.zzYgq) {
                    this.zzYgp.zzZor();
                } else {
                    this.zzYgp.zzZos();
                }
            }
        }

        public final void zzYTH() {
            this.zzYgp.zzZor();
        }
    }

    public LayoutCollector(Document document) {
        setDocument(document);
    }

    private void zzU(com.aspose.words.internal.zz7D<Node> zz7d) throws Exception {
        com.aspose.words.internal.zz7D<Node>.zzZ zzzZzxt = zz7d.zzxt();
        while (zzzZzxt.moveNext()) {
            zzzZzxt.zzxv();
            Paragraph paragraph = (Paragraph) zzzZzxt.zzxv();
            int iZzCL = zzzZzxt.zzCL() & 65535;
            int iZzxZ = zzxZ(zzzZzxt.zzCL());
            int i = 1;
            zzY zzy = new zzY(this.zzYgu.zzZD(paragraph), true);
            zzYE3 zzye3 = new zzYE3();
            zzYAS zzyas = (zzYAS) zzYV(zzy.getParagraph());
            zzZ55 zzz55 = (zzZ55) zzyas.zzZZJ();
            zzYN8 zzyn8ZzZ8m = zzz55.zzZ8m();
            zzZ55 zzz55ZzYQd = zzz55;
            int i2 = iZzxZ;
            while (iZzxZ >= iZzCL) {
                while (zzz55ZzYQd != null && zzz55ZzYQd.zza9() == zzyas.zza9() && zzz55ZzYQd.zzZ8m() == zzyn8ZzZ8m) {
                    zzz55ZzYQd = zzz55ZzYQd.zzYQd();
                }
                Node node = null;
                if (zzz55ZzYQd != null && zzz55ZzYQd.zza9() != zzyas.zza9()) {
                    zzz55ZzYQd = null;
                }
                int i3 = 0;
                if (zzz55ZzYQd != null) {
                    zzye3.zzZ(zzz55ZzYQd, zzy.getParagraph());
                    node = zzye3.getNode();
                    int offset = zzye3.getOffset();
                    ArrayList<Integer> arrayListZzYU = zzYU(node);
                    if (arrayListZzYU == null) {
                        HashMap<Node, ArrayList<Integer>> map = this.zzYgt;
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        map.put(node, arrayList);
                        arrayListZzYU = arrayList;
                    }
                    arrayListZzYU.add(0, Integer.valueOf(offset));
                    i3 = offset;
                }
                while (true) {
                    if (zzy.getNode() != node) {
                        Paragraph paragraph2 = zzy.getParagraph();
                        boolean zZzYTG = zzy.zzYTG();
                        Paragraph paragraph3 = zzy.getParagraph();
                        if ((!zZzYTG || paragraph3 != paragraph2) && !this.zzYgv.containsKey(paragraph2)) {
                            this.zzYgv.zzP(paragraph2, iZzxZ | (i2 << 16));
                        }
                        if (!zZzYTG) {
                            break;
                        }
                        this.zzYgv.set(zzy.getNode(), (iZzxZ << 16) | iZzxZ);
                        i = 1;
                    } else if (zzz55ZzYQd != null) {
                        this.zzYgv.set(zzy.getNode(), this.zzYgv.get(zzy.getNode()) - i);
                        if (i3 <= 0) {
                            this.zzYgv.set(zzy.getNode(), this.zzYgv.get(zzy.getNode()) - 65536);
                        }
                    }
                }
                zzyn8ZzZ8m = (zzYN8) zzyn8ZzZ8m.zzYo0();
                i2 = iZzxZ;
                iZzxZ--;
                i = 1;
            }
        }
    }

    private void zzYTI() throws Exception {
        zzU(zzYTJ());
    }

    private com.aspose.words.internal.zz7D<Node> zzYTJ() {
        com.aspose.words.internal.zz7D<Node> zz7d = new com.aspose.words.internal.zz7D<>();
        int count = this.zzYgv.getCount();
        Paragraph[] paragraphArr = new Paragraph[count];
        int[] iArr = new int[this.zzYgv.getCount()];
        com.aspose.words.internal.zz7D<Node>.zzZ zzzZzxt = this.zzYgv.zzxt();
        int i = 0;
        while (zzzZzxt.moveNext()) {
            paragraphArr[i] = (Paragraph) zzzZzxt.zzxv();
            iArr[i] = zzzZzxt.zzCL();
            i++;
        }
        for (int i2 = 0; i2 < count; i2++) {
            Paragraph paragraph = paragraphArr[i2];
            paragraph.getParentNode();
            int i3 = iArr[i2];
            if ((65535 & i3) != zzxZ(i3)) {
                zz7d.zzP(paragraph, i3);
            } else {
                zzY zzy = new zzY(this.zzYgu.zzZD(paragraph), false);
                while (zzy.zzYTG()) {
                    if (this.zzYgv.containsKey(zzy.getNode())) {
                        if (zzy.getNode() instanceof Paragraph) {
                            zzy.getNode().getAncestor(8);
                            zzy.getParagraph();
                        }
                        zzy.zzYTH();
                    } else {
                        this.zzYgv.set(zzy.getNode(), i3);
                        if (!this.zzYgv.containsKey(zzy.getParagraph())) {
                            this.zzYgv.set(zzy.getParagraph(), i3);
                        }
                    }
                }
            }
        }
        return zz7d;
    }

    private void zzYTK() {
        ArrayList arrayList = new ArrayList();
        for (Paragraph paragraph : this.zzZEY.getChildNodes(8, true)) {
            if (paragraph.getAncestor(4) == null) {
                zzYAU zzyau = (zzYAU) zzYV(paragraph);
                zzYN8 zzyn8ZzZ8m = (zzyau == null || zzyau.zzY6Z()) ? null : zzyau.zzY6S().zzZ9s().zzZ8m();
                if (zzyn8ZzZ8m == null) {
                    if (zzyau != null && zzyau.zzY6Z()) {
                        this.zzYgu.zzZE(paragraph);
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Paragraph>) arrayList, paragraph);
                } else {
                    this.zzYgu.zzZC(paragraph);
                    this.zzYgv.set(paragraph, ((zzyau.zzZ8m().getIndex() + 1) << 16) | (zzyn8ZzZ8m.getIndex() + 1));
                }
            }
        }
    }

    private void zzYTL() throws Exception {
        if (this.zzYgv != null) {
            return;
        }
        Document document = this.zzZEY;
        if (document == null) {
            throw new IllegalStateException("This instance is not attached to a document.");
        }
        if (document.zzWA(false) == null) {
            this.zzZEY.updatePageLayout();
        }
        this.zzYgv = new com.aspose.words.internal.zz7D<>();
        zzYTK();
        zzYTI();
        zzYW(this.zzZEY);
    }

    private zzYMD zzYV(Node node) {
        return (zzYMD) com.aspose.words.internal.zzQW.zzZ(this.zzYgw, node);
    }

    private int zzYW(Node node) {
        int i;
        int i2 = this.zzYgv.get(node);
        if (!com.aspose.words.internal.zz7D.zzWm(i2)) {
            return i2;
        }
        if (!(node instanceof CompositeNode)) {
            node.getNodeType();
        }
        if (node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (compositeNode.hasChildNodes()) {
                int iZzxZ = 0;
                int i3 = 65535;
                for (Node firstChild = compositeNode.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                    if (firstChild.getNodeType() != 4) {
                        int iZzYW = zzYW(firstChild);
                        int i4 = iZzYW & 65535;
                        if (i4 < i3) {
                            i3 = i4;
                        }
                        if (zzxZ(iZzYW) > iZzxZ) {
                            iZzxZ = zzxZ(iZzYW);
                        }
                    }
                }
                int i5 = ((iZzxZ & 65535) << 16) | i3;
                this.zzYgv.set(node, i5);
                return i5;
            }
        }
        zzZYT zzzyt = new zzZYT(node);
        while (true) {
            if (!zzzyt.zzZ(node.getDocument(), false, true, false, false, false)) {
                i = 65537;
                break;
            }
            i = this.zzYgv.get(zzzyt.getNode());
            if (!com.aspose.words.internal.zz7D.zzWm(i)) {
                break;
            }
        }
        this.zzYgv.set(node, (zzxZ(i) << 16) | zzxZ(i));
        return i;
    }

    private zzYMD zzYX(Node node) throws Exception {
        zzYTL();
        zzYMD zzymdZzYV = zzYV(node);
        if (zzymdZzYV == null || zzymdZzYV.zza9() != null) {
            return zzymdZzYV;
        }
        return null;
    }

    private static void zzm(Document document) {
        if (document == null || document.zzZqg().zzYSQ() == null) {
            return;
        }
        document.zzZqg().zzYSQ().zzZEY = null;
        document.zzZqg().zzZ(null);
    }

    private static int zzxZ(int i) {
        return (int) ((((long) i) >> 16) & C18177fb.f54859s);
    }

    public void clear() {
        this.zzYgw = new HashMap<>();
        this.zzYgv = null;
        this.zzYgu = new zzZ((byte) 0);
        this.zzYgt.clear();
    }

    public Document getDocument() {
        return this.zzZEY;
    }

    public int getEndPageIndex(Node node) throws Exception {
        zzYTL();
        int i = this.zzYgv.get(node);
        if (com.aspose.words.internal.zz7D.zzWm(i)) {
            return 0;
        }
        return zzxZ(i);
    }

    public Object getEntity(Node node) throws Exception {
        return zzYX(node);
    }

    public int getNumPagesSpanned(Node node) throws Exception {
        zzYTL();
        int i = this.zzYgv.get(node);
        if (com.aspose.words.internal.zz7D.zzWm(i)) {
            return 0;
        }
        return zzxZ(i) - (i & 65535);
    }

    public int getStartPageIndex(Node node) throws Exception {
        zzYTL();
        int i = this.zzYgv.get(node);
        if (com.aspose.words.internal.zz7D.zzWm(i)) {
            return 0;
        }
        return i & 65535;
    }

    public void setDocument(Document document) {
        zzm(this.zzZEY);
        zzm(document);
        this.zzZEY = document;
        if (document != null) {
            document.zzZqg().zzZ(this);
            if (this.zzZEY.zzZqj()) {
                this.zzZEY.zzZqk();
            }
        }
        clear();
    }

    public final ArrayList<Integer> zzYU(Node node) {
        Ref ref = new Ref(null);
        com.aspose.words.internal.zzZQF.zzZ(this.zzYgt, node, ref);
        return (ArrayList) ref.get();
    }

    public final void zzZ(Node node, zzYAU zzyau) {
        if (node.getAncestor(4) != null) {
            return;
        }
        this.zzYgw.put(node, zzyau);
    }

    public static class zzZ {
        private static Paragraph zzYgs = new Paragraph(null);
        private HashMap<Paragraph, ArrayList<Paragraph>> zzYgr;

        private zzZ() {
            this.zzYgr = new HashMap<>();
        }

        public final void zzZC(Paragraph paragraph) {
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYgr, zzYgs, ref);
            ArrayList arrayList = (ArrayList) ref.get();
            if (zZzZ) {
                com.aspose.words.internal.zzZQF.zzY(this.zzYgr, zzYgs);
            } else {
                arrayList = new ArrayList();
            }
            com.aspose.words.internal.zzZQF.zzY(this.zzYgr, paragraph, arrayList);
        }

        public final ArrayList<Paragraph> zzZD(Paragraph paragraph) {
            ArrayList<Paragraph> arrayListZzY = com.aspose.words.internal.zzZQG.zzY(this.zzYgr.get(paragraph));
            com.aspose.words.internal.zzZQG.zzZ(arrayListZzY, paragraph);
            return arrayListZzY;
        }

        public final void zzZE(Paragraph paragraph) {
            if (!this.zzYgr.containsKey(zzYgs)) {
                com.aspose.words.internal.zzZQF.zzY(this.zzYgr, zzYgs, new ArrayList());
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzYgr.get(zzYgs), paragraph);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }
}
