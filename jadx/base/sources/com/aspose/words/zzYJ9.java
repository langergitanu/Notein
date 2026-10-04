package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJ9 {
    private zzYXA zzXBa;
    private Node zzXBb;
    private boolean zzXBk;
    private ArrayList<Revision> zzXBm;
    private int zzXX2;
    private ArrayList<Node> zzXBj = new ArrayList<>();
    private ArrayList<Node> zzXBi = new ArrayList<>();
    private ArrayList<Node> zzXBh = new ArrayList<>();
    private ArrayList<Node> zzXBg = new ArrayList<>();
    private ArrayList<Node> zzXBf = new ArrayList<>();
    private ArrayList<Node> zzXBe = new ArrayList<>();
    private HashMap<StructuredDocumentTag, zzY> zzXBd = new HashMap<>();
    private ArrayList<StructuredDocumentTag> zzXBc = new ArrayList<>();
    private boolean zzXBl = false;

    public static class zzY {
        private boolean zzXB8;
        private StructuredDocumentTag zzXB9;

        public zzY(StructuredDocumentTag structuredDocumentTag, boolean z) {
            this.zzXB9 = structuredDocumentTag;
            this.zzXB8 = z;
        }

        public final boolean zzYBE() {
            return this.zzXB8;
        }

        public final StructuredDocumentTag zzYl4() {
            return this.zzXB9;
        }
    }

    public static final class zzZ implements Comparator<StructuredDocumentTag> {
        private zzZ() {
        }

        public static void zzS(ArrayList<StructuredDocumentTag> arrayList) {
            Collections.sort(arrayList, new zzZ());
        }

        private static int zzY(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) {
            if (structuredDocumentTag == structuredDocumentTag2) {
                return 0;
            }
            return structuredDocumentTag.zzYB(structuredDocumentTag2) ? -1 : 1;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) {
            return zzY(structuredDocumentTag, structuredDocumentTag2);
        }
    }

    public zzYJ9(ArrayList<Revision> arrayList, boolean z) {
        this.zzXBm = arrayList;
        this.zzXBk = z;
    }

    public final Node getCurrentNode() {
        return this.zzXBb;
    }

    public final int getRevisionType() {
        return this.zzXX2;
    }

    public final ArrayList<StructuredDocumentTag> zzH(StructuredDocumentTag structuredDocumentTag) {
        ArrayList<StructuredDocumentTag> arrayList = new ArrayList<>();
        for (Map.Entry<StructuredDocumentTag, zzY> entry : this.zzXBd.entrySet()) {
            if (entry.getValue().zzYl4() == structuredDocumentTag && !entry.getKey().zzYF(structuredDocumentTag)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, entry.getKey());
            }
        }
        zzZ.zzS(arrayList);
        return arrayList;
    }

    public final boolean zzI(StructuredDocumentTag structuredDocumentTag) {
        for (zzY zzy : this.zzXBd.values()) {
            if (zzy.zzYl4() == structuredDocumentTag) {
                return zzy.zzYBE();
            }
        }
        return false;
    }

    public final boolean zzN(Node node) {
        int nodeType = node.getNodeType();
        return nodeType != 5 ? nodeType != 6 ? nodeType != 7 ? nodeType != 8 ? nodeType != 28 ? (node instanceof zzZAM) && this.zzXBj.contains(node) : this.zzXBe.contains(node) : this.zzXBi.contains(node) : this.zzXBg.contains(node) : this.zzXBh.contains(node) : this.zzXBf.contains(node);
    }

    public final void zzWY(Node node) {
        zzYXA zzyxaZzF;
        this.zzXBb = node;
        zzZA6 zzza6 = (zzZA6) com.aspose.words.internal.zzZKW.zzZ(node, zzZA6.class);
        if (zzza6 == null || (zzza6.getMoveFromRevision() == null && zzza6.getMoveToRevision() == null)) {
            zzyxaZzF = null;
        } else {
            zzyxaZzF = zzYX8.zzF(node, zzza6.getMoveToRevision() != null);
        }
        this.zzXBa = zzyxaZzF;
    }

    public final void zzWZ(Node node) {
        if (zzN(node)) {
            return;
        }
        int nodeType = node.getNodeType();
        if (nodeType == 5) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXBf, node);
            return;
        }
        if (nodeType == 6) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXBh, node);
            return;
        }
        if (nodeType == 7) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXBg, node);
            return;
        }
        if (nodeType == 8) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXBi, node);
        } else if (nodeType == 28) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXBe, node);
        } else {
            if (!(node instanceof zzZAM)) {
                throw new IllegalStateException("Wrong node type.");
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzXBj, node);
        }
    }

    public final boolean zzYl5() {
        return this.zzXBk;
    }

    public final boolean zzYl6() {
        return this.zzXBl;
    }

    public final ArrayList<Revision> zzYl7() {
        return this.zzXBm;
    }

    public final ArrayList<StructuredDocumentTag> zzYl8() {
        ArrayList<StructuredDocumentTag> arrayList = new ArrayList<>();
        for (zzY zzy : this.zzXBd.values()) {
            if (!arrayList.contains(zzy.zzYl4())) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzy.zzYl4());
            }
        }
        return arrayList;
    }

    public final ArrayList<StructuredDocumentTag> zzYl9() {
        return this.zzXBc;
    }

    public final ArrayList<Node> zzYla() {
        return this.zzXBe;
    }

    public final ArrayList<Node> zzYlb() {
        return this.zzXBf;
    }

    public final ArrayList<Node> zzYlc() {
        return this.zzXBg;
    }

    public final ArrayList<Node> zzYld() {
        return this.zzXBh;
    }

    public final ArrayList<Node> zzYle() {
        return this.zzXBi;
    }

    public final ArrayList<Node> zzYlf() {
        return this.zzXBj;
    }

    public final zzYXA zzYlg() {
        return this.zzXBa;
    }

    public final zzYJ9 zzYlh() {
        zzYJ9 zzyj9 = new zzYJ9(this.zzXBm, this.zzXBk);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzyj9.zzXBj, (Iterable) this.zzXBj);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzyj9.zzXBi, (Iterable) this.zzXBi);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzyj9.zzXBg, (Iterable) this.zzXBg);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzyj9.zzXBh, (Iterable) this.zzXBh);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzyj9.zzXBf, (Iterable) this.zzXBf);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzyj9.zzXBe, (Iterable) this.zzXBe);
        for (Map.Entry<StructuredDocumentTag, zzY> entry : this.zzXBd.entrySet()) {
            com.aspose.words.internal.zzZQF.zzY(zzyj9.zzXBd, entry.getKey(), entry.getValue());
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzyj9.zzXBc, (Iterable) this.zzXBc);
        return zzyj9;
    }

    public final void zzZ(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2, boolean z) {
        if (this.zzXBd.containsKey(structuredDocumentTag2)) {
            return;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzXBd, structuredDocumentTag2, new zzY(structuredDocumentTag, z));
    }

    public final boolean zzs(Node node, boolean z) {
        if (!node.isComposite()) {
            return false;
        }
        Node firstChild = ((CompositeNode) node).getFirstChild();
        while (firstChild != null) {
            if ((!zzYVU.zzXM(firstChild) || !z) && (firstChild instanceof zzZ8X) && !zzN(firstChild)) {
                return true;
            }
            firstChild = firstChild.nextPreOrder(node);
        }
        return false;
    }

    public zzYJ9(boolean z, int i) {
        this.zzXBk = z;
        this.zzXX2 = i;
    }
}
