package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4 {
    private int zzZCv;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzZYG<zzY3> zzZCy = new com.aspose.words.internal.zzZYG<>(false);
    private Map<ShapeBase, zzZ> zzZCx = new HashMap();
    private com.aspose.words.internal.zzZQC<ShapeBase> zzZCw = new com.aspose.words.internal.zzZQC<>();

    public static class zzZ {
        private Collection<Node> zzZCt = new ArrayList();
        private Collection<Node> zzZCu = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final com.aspose.words.internal.zzFQ<String> zz93() {
            com.aspose.words.internal.zzX6 zzx6 = new com.aspose.words.internal.zzX6(this.zzZCt.size() / 2);
            for (Node node : this.zzZCt) {
                String name = ((zzZD7) node).getName();
                if (!zzx6.contains(name) && !node.isRemoved()) {
                    zzx6.add(name);
                }
            }
            return zzx6;
        }

        public final Collection<Node> zz94() {
            return this.zzZCu;
        }

        public final void zzU(Node node, boolean z) {
            if (z) {
                this.zzZCu.add(node);
            } else {
                this.zzZCt.add(node);
            }
        }
    }

    public zzY4(IWarningCallback iWarningCallback, int i) {
        this.zzZCv = i;
        this.zzZG0 = iWarningCallback;
    }

    private void zz2(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 1, 17, str);
        }
    }

    private void zz96() {
        for (zzY3 zzy3 : this.zzZCy.zzCJ()) {
            if (zzy3.zz92()) {
                zz2(com.aspose.words.internal.zzZKN.format("Bookmark '{0}' without corresponding BookmarkEnd was removed.", zzy3.getBookmarkStart().getName()));
                zzy3.getBookmarkStart().remove();
            }
        }
    }

    private ShapeBase zz97() {
        if (this.zzZCw.size() != 0) {
            return this.zzZCw.peek();
        }
        return null;
    }

    private boolean zzL(Node node) {
        ShapeBase shapeBaseZz97 = zz97();
        boolean z = false;
        if (shapeBaseZz97 == null) {
            return false;
        }
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ((Map<ShapeBase, V>) this.zzZCx, shapeBaseZz97, ref);
        zzZ zzz = (zzZ) ref.get();
        if (!zZzZ) {
            zzz = new zzZ();
            com.aspose.words.internal.zzZQF.zzY(this.zzZCx, shapeBaseZz97, zzz);
        }
        if (shapeBaseZz97.zzY9n() != null && node.zzYF(shapeBaseZz97.zzY9n())) {
            z = true;
        }
        zzz.zzU(node, z);
        return z;
    }

    private boolean zzTg(String str) {
        int i = this.zzZCv;
        return (i == 40 || i == 73 || str.length() <= 40) ? false : true;
    }

    public final com.aspose.words.internal.zzFQ<String> zz95() {
        return new com.aspose.words.internal.zzIM(this.zzZCy.zzxs());
    }

    public final void zzY(ShapeBase shapeBase) {
        if (shapeBase != zz97()) {
            return;
        }
        this.zzZCw.pop();
    }

    public final void zzZ(BookmarkStart bookmarkStart, int i) {
        if (zzL(bookmarkStart)) {
            return;
        }
        zzY(bookmarkStart, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzbQ() {
        zz96();
        for (zzZ zzz : this.zzZCx.values()) {
            zzY4 zzy4 = new zzY4(this.zzZG0, this.zzZCv);
            com.aspose.words.internal.zzFQ<String> zzfqZz93 = zzz.zz93();
            for (Node node : zzz.zz94()) {
                if (!zzfqZz93.contains(((zzZD7) node).getName())) {
                    node.remove();
                } else if (node.getNodeType() == 9) {
                    zzy4.zzY((BookmarkStart) node, 1);
                } else {
                    zzy4.zzY((BookmarkEnd) node, 1);
                }
            }
            zzy4.zz96();
        }
    }

    private void zzY(BookmarkStart bookmarkStart, int i) {
        if (zzTg(bookmarkStart.getName())) {
            zzY1Z.zzZ(this.zzZG0, 0, "Bookmark name exceeded maximum allowed length was truncated.", new Object[0]);
            bookmarkStart.zzTh(bookmarkStart.getName().substring(0, 40));
        }
        String strZzZ = zzY3.zzZ(bookmarkStart);
        zzY3 zzy3 = this.zzZCy.get(strZzZ);
        if (zzy3 == null) {
            this.zzZCy.zzW(strZzZ, new zzY3(bookmarkStart, i));
            return;
        }
        if (zzy3.zz92()) {
            bookmarkStart.remove();
        } else {
            zzy3.getBookmarkStart().remove();
            zzy3.getBookmarkEnd().remove();
            this.zzZCy.set(strZzZ, new zzY3(bookmarkStart, i));
        }
        zz2(com.aspose.words.internal.zzZKN.format("Bookmark with duplicated name '{0}' was removed.", bookmarkStart.getName()));
    }

    public final void zzZ(BookmarkEnd bookmarkEnd, int i) {
        if (zzL(bookmarkEnd)) {
            return;
        }
        zzY(bookmarkEnd, i);
    }

    public final void zzZ(ShapeBase shapeBase) {
        if (shapeBase.zzY9n() == null) {
            return;
        }
        this.zzZCw.push(shapeBase);
    }

    private static boolean zzZ(zzY3 zzy3, BookmarkEnd bookmarkEnd, int i) {
        if (zzy3 == null || !zzy3.zz92() || zzy3.zz91() != i) {
            return false;
        }
        if (i == 4) {
            return com.aspose.words.internal.zzZKO.zzA((Comment) zzy3.getBookmarkStart().getAncestor(19), (Comment) bookmarkEnd.getAncestor(19));
        }
        return true;
    }

    private void zzY(BookmarkEnd bookmarkEnd, int i) {
        if (zzTg(bookmarkEnd.getName())) {
            zz2("Bookmark name exceeded maximum allowed length was truncated.");
            bookmarkEnd.zzTh(bookmarkEnd.getName().substring(0, 40));
        }
        zzY3 zzy3 = this.zzZCy.get(zzY3.zzZ(bookmarkEnd));
        if (zzZ(zzy3, bookmarkEnd, i)) {
            zzy3.zzY(bookmarkEnd);
        } else {
            bookmarkEnd.remove();
            zz2(com.aspose.words.internal.zzZKN.format("Bookmark '{0}' without corresponding BookmarkStart was removed.", bookmarkEnd.getName()));
        }
    }
}
