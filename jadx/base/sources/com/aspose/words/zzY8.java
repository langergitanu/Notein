package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8 {
    private zzYJ9 zzZCK;
    private DocumentBase zzZCL;

    public zzY8(DocumentBase documentBase, zzYJ9 zzyj9) {
        this.zzZCL = documentBase;
        this.zzZCK = zzyj9;
    }

    private static boolean zzY(CompositeNode compositeNode) {
        return compositeNode.zzYAY() == 3;
    }

    private void zzZ(CompositeNode compositeNode, boolean z, ArrayList<Node> arrayList) {
        if (!z) {
            zzZ(compositeNode, compositeNode.getFirstChild(), arrayList);
        }
        Node firstChild = compositeNode.getFirstChild();
        while (firstChild != null) {
            Node nextSibling = firstChild.getNextSibling();
            if (firstChild instanceof CompositeNode) {
                CompositeNode compositeNode2 = (CompositeNode) firstChild;
                zzZ(compositeNode2, z || this.zzZCK.zzN(compositeNode2), arrayList);
                if (!z) {
                    zzZ(compositeNode, nextSibling, arrayList);
                }
            } else if (z && (firstChild.getNodeType() == 9 || firstChild.getNodeType() == 10)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, firstChild);
            }
            firstChild = nextSibling;
        }
    }

    public final void zz99() {
        zzZ((CompositeNode) this.zzZCL, false, new ArrayList<>());
    }

    private static void zzZ(CompositeNode compositeNode, Node node, ArrayList<Node> arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            Node node2 = arrayList.get(i);
            if (!compositeNode.zzT(node2) || ((node2.getNodeType() == 9 && !zzY(compositeNode)) || (node2.getNodeType() == 10 && zzZ(arrayList, i - 1, ((BookmarkEnd) node2).getName())))) {
                i++;
            } else {
                compositeNode.insertBefore(node2, node);
                arrayList.remove(i);
            }
        }
    }

    private static boolean zzZ(ArrayList<Node> arrayList, int i, String str) {
        for (int i2 = 0; i2 <= i; i2++) {
            if (arrayList.get(i2).getNodeType() == 9 && com.aspose.words.internal.zzZYD.zzi(((BookmarkStart) arrayList.get(i2)).getName(), str)) {
                return true;
            }
        }
        return false;
    }
}
