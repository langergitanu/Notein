package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYC {
    private zzYD zzZCJ;
    private zzYJ9 zzZCK;
    private DocumentBase zzZCL;

    private zzYC(DocumentBase documentBase, zzYJ9 zzyj9) {
        this.zzZCL = documentBase;
        this.zzZCJ = new zzYD((Document) documentBase);
        this.zzZCK = zzyj9.zzYlh();
        zz9e();
    }

    private void execute() throws Exception {
        zz9h();
        new zzY8(this.zzZCL, this.zzZCK).zz99();
    }

    private void zz9e() {
        zzZ(this.zzZCK.zzYle(), this.zzZCK.zzYlc(), 7);
        zzZ(this.zzZCK.zzYlc(), this.zzZCK.zzYld(), 6);
        zzZ(this.zzZCK.zzYld(), this.zzZCK.zzYlb(), 5);
    }

    private void zz9f() throws Exception {
        Iterator it = this.zzZCL.getChildNodes(9, true).zzYAN().iterator();
        while (it.hasNext()) {
            BookmarkStart bookmarkStart = (BookmarkStart) ((Node) it.next());
            if (zzTi(bookmarkStart.getName())) {
                Bookmark bookmark = this.zzZCJ.get(bookmarkStart.getName());
                if (zzZ(bookmark)) {
                    bookmark.remove();
                }
            }
        }
    }

    private void zz9g() {
        for (Map.Entry<Node, Node> entry : new zzY2(this.zzZCL, this.zzZCK).zz90().entrySet()) {
            if (entry.getValue() != null) {
                ((BookmarkEnd) entry.getValue()).remove();
                ((BookmarkStart) entry.getKey()).remove();
            }
        }
    }

    private void zz9h() throws Exception {
        zz9g();
        zz9f();
    }

    private boolean zzN(Node node) {
        return this.zzZCK.zzN(node);
    }

    private boolean zzO(Node node) {
        CompositeNode ancestor = node.getAncestor(7);
        return ancestor != null && zzN(ancestor);
    }

    public static boolean zzP(Node node) {
        return node.getNodeType() == 8 || (node instanceof zzZAM);
    }

    private static boolean zzTi(String str) {
        return !"_GoBack".equals(str);
    }

    private boolean zzY(Bookmark bookmark) throws Exception {
        boolean zZzN;
        Node previousSibling = bookmark.getBookmarkStart().getPreviousSibling();
        while (true) {
            if (previousSibling == null) {
                zZzN = false;
                break;
            }
            if (zzP(previousSibling)) {
                zZzN = zzN(previousSibling);
                break;
            }
            previousSibling = previousSibling.getPreviousSibling();
        }
        if (!zZzN) {
            return false;
        }
        for (Node nextSibling = bookmark.getBookmarkEnd().getNextSibling(); nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
            if (zzP(nextSibling)) {
                return zzN(nextSibling);
            }
        }
        return false;
    }

    public static void zzZ(DocumentBase documentBase, zzYJ9 zzyj9) throws Exception {
        new zzYC(documentBase, zzyj9).execute();
    }

    private boolean zzZ(Bookmark bookmark) throws Exception {
        if (bookmark == null) {
            return false;
        }
        boolean z = false;
        for (Node node : bookmark.zz9m()) {
            if (zzP(node)) {
                if (!zzN(node)) {
                    return false;
                }
                z = true;
            }
        }
        return z || zzY(bookmark) || zzO(bookmark.getBookmarkStart());
    }

    private static void zzZ(ArrayList<Node> arrayList, ArrayList<Node> arrayList2, int i) {
        CompositeNode compositeNode = null;
        for (Node node : arrayList) {
            CompositeNode compositeNodeZzYBd = node.zzYBd();
            if (compositeNodeZzYBd != compositeNode && compositeNodeZzYBd.getNodeType() == i && !arrayList2.contains(compositeNodeZzYBd)) {
                Node nodeZzZYv = compositeNodeZzYBd.zzZYv();
                while (true) {
                    if (nodeZzZYv != null) {
                        if (nodeZzZYv.getNodeType() == node.getNodeType() && !arrayList.contains(nodeZzZYv)) {
                            break;
                        } else {
                            nodeZzZYv = nodeZzZYv.zzYB7();
                        }
                    } else {
                        arrayList2.add(compositeNodeZzYBd);
                        break;
                    }
                }
                compositeNode = compositeNodeZzYBd;
            }
        }
    }
}
