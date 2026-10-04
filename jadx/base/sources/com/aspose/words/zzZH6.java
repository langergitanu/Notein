package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZH6 {
    private zzZK3 zzYqv;
    private DocumentBuilder zzZwh;
    private com.aspose.words.internal.zzIM<String> zzYpM = new com.aspose.words.internal.zzIM<>();
    private zzZ zzYpL = new zzZ();
    private com.aspose.words.internal.zzIM<String> zzYpI = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<String> zzYpK = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<String> zzYpJ = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzZYG<BookmarkEnd> zzYpN = new com.aspose.words.internal.zzZYG<>();

    public static class zzY {
        private Node zzYpC;
        private Node zzYpD;

        private zzY() {
        }

        public final Node zzZ1F() {
            return this.zzYpC;
        }

        public final Node zzZ1G() {
            return this.zzYpD;
        }

        public final void zzZ6(Node node) {
            this.zzYpC = node;
        }

        public final void zzZ7(Node node) {
            this.zzYpD = node;
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    private boolean zzKD(String str) {
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(str);
        return this.zzYpL.zzKD(strZzU2) || this.zzYpI.contains(strZzU2) || this.zzYpK.contains(strZzU2);
    }

    private static String zzM(zzZAS zzzas) {
        String strZzKM = zzzas.zzKM("id");
        return strZzKM != null ? com.aspose.words.internal.zzZKN.zzU2(strZzKM) : "";
    }

    public final boolean zzKE(String str) {
        return this.zzYpK.contains(com.aspose.words.internal.zzZKN.zzU2(str));
    }

    public final void zzKF(String str) {
        if (com.aspose.words.internal.zzZVR.zzWw(str)) {
            String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZVR.zzWG(str));
            if (this.zzYpM.contains(strZzU2)) {
                return;
            }
            this.zzYpM.add(strZzU2);
        }
    }

    public final BookmarkEnd zzN(zzZAS zzzas) throws Exception {
        Bookmark bookmarkZzKC;
        String strZzM = zzM(zzzas);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzM) || (bookmarkZzKC = this.zzYpL.zzKC(strZzM)) == null || bookmarkZzKC.getBookmarkEnd().getParentNode() != null) {
            return null;
        }
        this.zzZwh.insertNode(bookmarkZzKC.getBookmarkEnd());
        this.zzYpN.zzW(strZzM, bookmarkZzKC.getBookmarkEnd());
        return bookmarkZzKC.getBookmarkEnd();
    }

    public final BookmarkStart zzO(zzZAS zzzas) {
        String strZzM = zzM(zzzas);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzM) || zzKD(strZzM)) {
            return null;
        }
        BookmarkStart bookmarkStartStartBookmark = this.zzZwh.startBookmark(strZzM);
        BookmarkEnd bookmarkEnd = new BookmarkEnd(this.zzZwh.getDocument());
        bookmarkEnd.setName(strZzM);
        this.zzYpL.zzZ(strZzM, new Bookmark(bookmarkStartStartBookmark, bookmarkEnd));
        return bookmarkStartStartBookmark;
    }

    public final void zzP(zzZIG zzzig) {
        String strZzM = zzM(zzzig);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzM) && !zzKD(strZzM)) {
            zzY zzy = new zzY((byte) 0);
            zzy.zzZ7(this.zzZwh.getCurrentParagraph());
            this.zzYpL.zzZ(strZzM, this.zzZwh.getCurrentParagraph(), zzy);
        }
    }

    public final void zzQ(zzZIG zzzig) {
        String strZzM = zzM(zzzig);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzM) && !zzKD(strZzM)) {
            zzY zzy = new zzY((byte) 0);
            zzy.zzZ7(this.zzZwh.getCurrentParagraph());
            this.zzYpL.zzZ(strZzM, this.zzZwh.getCurrentParagraph(), zzy);
        }
    }

    public final void zzR(String str, boolean z, boolean z2) throws Exception {
        BookmarkEnd bookmarkEndEndBookmark;
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(str);
            if (!this.zzYpJ.contains(strZzU2) && this.zzYpK.contains(strZzU2)) {
                if (z2) {
                    this.zzYqv.zzZ4o();
                }
                if (this.zzYpN.containsKey(str)) {
                    this.zzYpN.get(str).remove();
                    this.zzYpN.zzXn(str);
                }
                if (z || this.zzZwh.getCurrentParagraph().zzYB0() == null || this.zzZwh.getCurrentParagraph().hasChildNodes() || this.zzZwh.getCurrentParagraph().zzYB0().getNodeType() != 28) {
                    bookmarkEndEndBookmark = this.zzZwh.endBookmark(str);
                } else {
                    bookmarkEndEndBookmark = new BookmarkEnd(this.zzZwh.getDocument(), str);
                    StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) this.zzZwh.getCurrentParagraph().zzYB0();
                    structuredDocumentTag.insertAfter(bookmarkEndEndBookmark, structuredDocumentTag.getLastChild());
                }
                this.zzYpN.zzW(str, bookmarkEndEndBookmark);
                if (z2) {
                    this.zzYpJ.add(strZzU2);
                }
            }
        }
    }

    public final void zzS(String str, boolean z, boolean z2) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(str);
            if (zzKD(strZzU2)) {
                return;
            }
            if (z2) {
                this.zzYqv.zzZ4o();
            }
            if (z || this.zzZwh.getCurrentParagraph().zzYB0() == null || this.zzZwh.getCurrentParagraph().hasChildNodes() || this.zzZwh.getCurrentParagraph().zzYB0().getNodeType() != 28) {
                this.zzZwh.startBookmark(str);
            } else {
                BookmarkStart bookmarkStart = new BookmarkStart(this.zzZwh.getDocument(), str);
                StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) this.zzZwh.getCurrentParagraph().zzYB0();
                structuredDocumentTag.insertAfter(bookmarkStart, structuredDocumentTag.getLastChild());
            }
            this.zzYpK.add(strZzU2);
        }
    }

    public final void zzZ(DocumentBuilder documentBuilder, zzZK3 zzzk3, boolean z) {
        this.zzZwh = documentBuilder;
        this.zzYqv = zzzk3;
        if (z) {
            Iterator<T> it = documentBuilder.getDocument().getChildNodes(9, true).iterator();
            while (it.hasNext()) {
                this.zzYpI.add(com.aspose.words.internal.zzZKN.zzU2(((BookmarkStart) ((Node) it.next())).getName()));
            }
        }
    }

    public final com.aspose.words.internal.zzZYG<BookmarkEnd> zzZ1J() {
        return this.zzYpN;
    }

    public final void zzZ1K() throws Exception {
        zzY zzyZzKB;
        for (String str : this.zzYpL.zzZ1I()) {
            if (this.zzYpM.contains(str) && (zzyZzKB = this.zzYpL.zzKB(str)) != null) {
                CompositeNode parentNode = zzyZzKB.zzZ1G().getParentNode();
                BookmarkStart bookmarkStart = new BookmarkStart(this.zzZwh.getDocument(), str);
                BookmarkEnd bookmarkEnd = new BookmarkEnd(this.zzZwh.getDocument(), str);
                if (zzyZzKB.zzZ1F() != null) {
                    parentNode.insertBefore(bookmarkStart, zzyZzKB.zzZ1G());
                    zzyZzKB.zzZ1F().zzYD(bookmarkEnd);
                } else {
                    parentNode.insertAfter(bookmarkStart, zzyZzKB.zzZ1G());
                    parentNode.insertAfter(bookmarkEnd, bookmarkStart);
                }
                this.zzYpN.zzW(str, bookmarkEnd);
            }
        }
        com.aspose.words.internal.zzZYG<Bookmark>.zzZ zzzZzZ1H = this.zzYpL.zzZ1H();
        while (zzzZzZ1H.moveNext()) {
            if (!this.zzYpM.contains(zzzZzZ1H.zzr3()) && zzzZzZ1H.zzCI() != null) {
                zzzZzZ1H.zzCI().remove();
                this.zzYpN.zzXn(zzzZzZ1H.zzCI().getName());
            }
        }
    }

    public static class zzZ {
        private com.aspose.words.internal.zzZYG<Bookmark> zzYpH = new com.aspose.words.internal.zzZYG<>();
        private com.aspose.words.internal.zzZYG<zzY> zzYpG = new com.aspose.words.internal.zzZYG<>();
        private ArrayList<String> zzYpF = new ArrayList<>();
        private HashMap<Node, ArrayList<String>> zzYpE = new HashMap<>();

        public final zzY zzKB(String str) {
            return this.zzYpG.get(str);
        }

        public final Bookmark zzKC(String str) {
            return this.zzYpH.get(str);
        }

        public final boolean zzKD(String str) {
            com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
            return this.zzYpH.containsKey(str) || this.zzYpG.containsKey(str);
        }

        public final void zzN(Node node, Node node2) {
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYpE, node, ref);
            ArrayList<String> arrayList = (ArrayList) ref.get();
            if (zZzZ) {
                com.aspose.words.internal.zzZQF.zzY(this.zzYpE, node);
                this.zzYpE.put(node2, arrayList);
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY zzyZzKB = zzKB(it.next());
                    if (zzyZzKB != null) {
                        zzyZzKB.zzZ7(node2);
                    }
                }
            }
        }

        public final void zzZ(String str, Bookmark bookmark) {
            com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
            this.zzYpH.containsKey(str);
            this.zzYpH.zzW(str, bookmark);
        }

        public final com.aspose.words.internal.zzZYG<Bookmark>.zzZ zzZ1H() {
            return this.zzYpH.zzr2();
        }

        public final ArrayList<String> zzZ1I() {
            return this.zzYpF;
        }

        public final void zzZ(String str, Node node, zzY zzy) {
            com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
            this.zzYpG.containsKey(str);
            this.zzYpG.zzW(str, zzy);
            com.aspose.words.internal.zzZQG.zzZ(this.zzYpF, str);
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYpE, node, ref);
            ArrayList arrayList = (ArrayList) ref.get();
            if (!zZzZ) {
                arrayList = new ArrayList();
                com.aspose.words.internal.zzZQF.zzY(this.zzYpE, node, arrayList);
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, str);
        }
    }

    public final void zzZ(zzZIG zzzig, Table table) {
        this.zzYpL.zzN(this.zzZwh.getCurrentParagraph(), table);
        String strZzM = zzM(zzzig);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzM) && !zzKD(strZzM)) {
            zzY zzy = new zzY((byte) 0);
            zzy.zzZ7(table);
            zzy.zzZ6(table);
            this.zzYpL.zzZ(strZzM, this.zzZwh.getCurrentParagraph(), zzy);
        }
    }

    public final void zzO(zzZIG zzzig) {
        zzY zzyZzKB;
        String strZzM = zzM(zzzig);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzM) && (zzyZzKB = this.zzYpL.zzKB(strZzM)) != null && zzyZzKB.zzZ1F() == null) {
            zzyZzKB.zzZ6(this.zzZwh.getCurrentParagraph());
        }
    }
}
