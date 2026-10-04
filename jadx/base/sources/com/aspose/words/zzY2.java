package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2 {
    private zzYJ9 zzZCK;
    private DocumentBase zzZCL;
    private Map<Node, Node> zzZCr;

    public zzY2(DocumentBase documentBase, zzYJ9 zzyj9) {
        this.zzZCL = documentBase;
        this.zzZCK = zzyj9;
    }

    private boolean zzY(CompositeNode compositeNode, boolean z) {
        Node nodeZzZ;
        boolean z2 = true;
        for (Node firstChild = compositeNode.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (!z && zzYC.zzP(firstChild)) {
                if (!this.zzZCK.zzN(firstChild)) {
                    if (z2) {
                        this.zzZCr.clear();
                    }
                    return false;
                }
                z2 = false;
            }
            if (firstChild instanceof CompositeNode) {
                if (!zzY((CompositeNode) firstChild, z || this.zzZCK.zzN(firstChild))) {
                    return false;
                }
            } else if (firstChild.getNodeType() == 9) {
                com.aspose.words.internal.zzZQF.zzY(this.zzZCr, firstChild, null);
            } else if (firstChild.getNodeType() == 10 && (nodeZzZ = zzZ(this.zzZCr, (BookmarkEnd) firstChild)) != null) {
                this.zzZCr.put(nodeZzZ, firstChild);
            }
        }
        return true;
    }

    private static Node zzZ(Map<Node, Node> map, BookmarkEnd bookmarkEnd) {
        Iterator<Node> it = map.keySet().iterator();
        while (it.hasNext()) {
            BookmarkStart bookmarkStart = (BookmarkStart) it.next();
            if (com.aspose.words.internal.zzZYD.zzi(bookmarkStart.getName(), bookmarkEnd.getName())) {
                return bookmarkStart;
            }
        }
        return null;
    }

    public final Map<Node, Node> zz90() {
        this.zzZCr = new HashMap();
        zzY(this.zzZCL, false);
        return this.zzZCr;
    }
}
