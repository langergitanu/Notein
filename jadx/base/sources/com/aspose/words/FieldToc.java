package com.aspose.words;

import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldToc extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\h", "\\u", "\\w", "\\x", "\\z", "\\a", "\\b", "\\c", "\\d", "\\f", "\\l", "\\n", "\\o", "\\p", "\\s", "\\t");
    private boolean zzYBH;

    public static class zzY extends zzYVZ {
        public zzY() {
            super(35);
        }

        private static void zzX(OfficeMath officeMath) {
            if (!officeMath.zzT(new Run(officeMath.getDocument()))) {
                Iterator<T> it = officeMath.getChildNodes(35, false).iterator();
                while (it.hasNext()) {
                    zzX((OfficeMath) it.next());
                }
            } else {
                Node[] array = officeMath.getChildNodes(21, true).toArray();
                officeMath.removeAllChildren();
                for (Node node : array) {
                    officeMath.appendChild(node);
                }
            }
        }

        @Override // com.aspose.words.zzYVZ
        public final void zzT(Node node, Node node2) {
            if (((OfficeMath) node).isTopLevel()) {
                super.zzT(node, node2);
            }
        }

        @Override // com.aspose.words.zzYVZ
        public final void zzx(Node node) {
            zzX((OfficeMath) node);
        }
    }

    public static class zzZ implements zzZB8 {
        private zzZA2 zzYBG;

        public zzZ(zzZA2 zzza2) {
            this.zzYBG = zzza2;
        }

        @Override // com.aspose.words.zzZB8
        public final void zzZw(Node node) throws Exception {
            this.zzYBG.zzZ(node, node, false, null);
        }
    }

    private String zzF(String[] strArr) {
        String str;
        do {
            str = com.aspose.words.internal.zzZKN.format("_Toc{0}", Integer.valueOf(getStart().zzYBb().zzZqv()));
        } while (com.aspose.words.internal.zzZ1.zzZ(strArr, str) >= 0);
        return str;
    }

    private void zzU(DocumentBuilder documentBuilder) {
        documentBuilder.moveTo(getEnd().getNextSibling() != null ? getEnd().getNextSibling() : getEnd().getParentNode());
        zzYEF zzyef = (zzYEF) documentBuilder.getCurrentParagraph().zzYp5().zzbn();
        documentBuilder.writeln();
        documentBuilder.getCurrentParagraph().zzC(zzyef);
        Paragraph currentParagraph = documentBuilder.getCurrentParagraph();
        documentBuilder.moveTo(documentBuilder.getCurrentParagraph().zzYB9());
        documentBuilder.getParagraphFormat().clearFormatting();
        documentBuilder.getCurrentParagraph().getParagraphBreakFont().clearFormatting();
        currentParagraph.zzYx(documentBuilder.getCurrentParagraph());
        this.zzYBH = true;
    }

    private static void zzY(DocumentBuilder documentBuilder, zzZ8Z zzz8z, String str) throws Exception {
        if (zzz8z.hasBookmark()) {
            documentBuilder.insertField(com.aspose.words.internal.zzZKN.format(" PAGEREF {0} \\h ", str), MsalUtils.QUERY_STRING_SYMBOL);
        } else {
            documentBuilder.write(Integer.toString(zzz8z.getPageNumber()));
        }
    }

    private boolean zzZ(DocumentBuilder documentBuilder, ArrayList<zzZ8Z> arrayList, zzX zzx) throws Exception {
        String[] strArrZzZbT = zzZbT();
        com.aspose.words.internal.zzZKV.zzP(strArrZzZbT);
        Iterator<zzZ8Z> it = arrayList.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (zzZ(documentBuilder, strArrZzZbT, it.next(), zzx) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public static int zzZY(int i, boolean z) {
        if (z) {
            return 35;
        }
        switch (i) {
            case 2:
                return 20;
            case 3:
                return 21;
            case 4:
                return 22;
            case 5:
                return 23;
            case 6:
                return 24;
            case 7:
                return 25;
            case 8:
                return 26;
            case 9:
                return 27;
            default:
                return 19;
        }
    }

    private boolean zzZbR() {
        return zzZgq().zzMj("\\n");
    }

    private void zzZbS() throws Exception {
        Paragraph parentParagraph = getEnd().getParentParagraph();
        if (parentParagraph.getNextSibling() == null) {
            return;
        }
        Paragraph paragraph = (Paragraph) parentParagraph.zzYB4();
        if (paragraph.hasChildNodes()) {
            zzYW0.zzZ((Node) paragraph, true, paragraph.getFirstChild(), false, 2);
            return;
        }
        parentParagraph.zzZ(paragraph.zzZYj());
        parentParagraph.zzC(paragraph.zzYp5());
        paragraph.remove();
    }

    private String[] zzZbT() {
        NodeCollection nodeCollectionZzY = getStart().getDocument().zzY(new int[]{9, 10}, true);
        String[] strArr = new String[nodeCollectionZzY.getCount()];
        for (int i = 0; i < nodeCollectionZzY.getCount(); i++) {
            strArr[i] = ((zzZD7) nodeCollectionZzY.get(i)).getName();
        }
        return strArr;
    }

    private void zzZbU() throws Exception {
        Bookmark bookmarkZzLG;
        ArrayList<Field> arrayListZzZ = zzZQF.zzZ(zzZgF(), 37, 88, 12);
        if (arrayListZzZ.size() == 0) {
            return;
        }
        com.aspose.words.internal.zzX6 zzx6 = new com.aspose.words.internal.zzX6(arrayListZzZ.size());
        Iterator<Field> it = arrayListZzZ.iterator();
        while (it.hasNext()) {
            String strZzy = zzy(it.next());
            if (!com.aspose.words.internal.zzZKN.zzU3(strZzy) && zzx6.add(strZzy) && (bookmarkZzLG = zzZgo().zzLG(strZzy)) != null) {
                bookmarkZzLG.remove();
            }
        }
    }

    private zzZP6 zzZbV() throws Exception {
        zzX zzxZzZ = zzX.zzZ(this);
        if (zzxZzZ == null) {
            return new zzZP2(this, "Error! Not a valid heading level range.");
        }
        DocumentBuilder documentBuilderZzN = zzZQ3.zzN(this);
        boolean zZzYB2 = getStart().zzYB2();
        int iZzXX = new zzY51(zzxZzZ).zzXX(getEnd().getParentParagraph());
        if (getStart().getParentParagraph() != getEnd().getParentParagraph() && zzxZzZ.zzZbJ().zzxV(iZzXX) && zZzYB2) {
            zzU(documentBuilderZzN);
        }
        ArrayList<zzZ8Z> arrayListZzZ = zzY57.zzZ(getStart().zzYBb(), zzxZzZ);
        if (arrayListZzZ.size() == 0) {
            return new zzZP2(this, zzZ(zzxZzZ));
        }
        zzZgo().zzZ(new zzZSC(getStart().zzYBb()));
        zzZgo().zzZ(new zzZSD(getStart().zzYBb()), 3);
        if (zzZ(documentBuilderZzN, arrayListZzZ, zzxZzZ)) {
            return null;
        }
        return new zzZP2(this, zzZ(zzxZzZ));
    }

    private static String zzy(Field field) {
        int type = field.getType();
        if (type == 12) {
            return ((FieldSeq) field).getBookmarkName();
        }
        if (type == 37) {
            return ((FieldPageRef) field).getBookmarkName();
        }
        if (type == 88) {
            return ((FieldHyperlink) field).getSubAddress();
        }
        throw new IllegalArgumentException();
    }

    public String getBookmarkName() {
        return zzZgq().zzt("\\b", false);
    }

    public String getCaptionlessTableOfFiguresLabel() {
        return zzZgq().zzt("\\a", false);
    }

    public String getCustomStyles() {
        return zzZgq().zzt("\\t", false);
    }

    public String getEntryIdentifier() {
        return zzZgq().zzt("\\f", false);
    }

    public String getEntryLevelRange() {
        return zzZgq().zzt("\\l", false);
    }

    public String getEntrySeparator() {
        return zzZgq().zzt("\\p", false);
    }

    public String getHeadingLevelRange() {
        return zzZgq().zzt("\\o", false);
    }

    public boolean getHideInWebLayout() {
        return zzZgq().zzMj("\\z");
    }

    public boolean getInsertHyperlinks() {
        return zzZgq().zzMj("\\h");
    }

    public String getPageNumberOmittingLevelRange() {
        return zzZgq().zzt("\\n", false);
    }

    public String getPrefixedSequenceIdentifier() {
        return zzZgq().zzt("\\s", false);
    }

    public boolean getPreserveLineBreaks() {
        return zzZgq().zzMj("\\x");
    }

    public boolean getPreserveTabs() {
        return zzZgq().zzMj("\\w");
    }

    public String getSequenceSeparator() {
        return zzZgq().zzt("\\d", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public String getTableOfFiguresLabel() {
        return zzZgq().zzt("\\c", false);
    }

    public boolean getUseParagraphOutlineLevel() {
        return zzZgq().zzMj("\\u");
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzZf("\\b", str);
    }

    public void setCaptionlessTableOfFiguresLabel(String str) throws Exception {
        zzZgq().zzZf("\\a", str);
    }

    public void setCustomStyles(String str) throws Exception {
        zzZgq().zzZf("\\t", str);
    }

    public void setEntryIdentifier(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setEntryLevelRange(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setEntrySeparator(String str) throws Exception {
        zzZgq().zzZf("\\p", str);
    }

    public void setHeadingLevelRange(String str) throws Exception {
        zzZgq().zzZf("\\o", str);
    }

    public void setHideInWebLayout(boolean z) throws Exception {
        zzZgq().zzs("\\z", z);
    }

    public void setInsertHyperlinks(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setPageNumberOmittingLevelRange(String str) throws Exception {
        zzZgq().zzZf("\\n", str);
    }

    public void setPrefixedSequenceIdentifier(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public void setPreserveLineBreaks(boolean z) throws Exception {
        zzZgq().zzs("\\x", z);
    }

    public void setPreserveTabs(boolean z) throws Exception {
        zzZgq().zzs("\\w", z);
    }

    public void setSequenceSeparator(String str) throws Exception {
        zzZgq().zzZf("\\d", str);
    }

    public void setTableOfFiguresLabel(String str) throws Exception {
        zzZgq().zzZf("\\c", str);
    }

    public void setUseParagraphOutlineLevel(boolean z) throws Exception {
        zzZgq().zzs("\\u", z);
    }

    public boolean updatePageNumbers() throws Exception {
        ArrayList<Field> arrayListZzZ = zzZQF.zzZ(zzZgF(), 37);
        if (arrayListZzZ.size() == 0) {
            return false;
        }
        Iterator<Field> it = arrayListZzZ.iterator();
        while (it.hasNext()) {
            if (((FieldPageRef) it.next()).zzZcG() == null) {
                return false;
            }
        }
        zzZOQ.zzZF(arrayListZzZ);
        return true;
    }

    @Override // com.aspose.words.Field
    public final void zzZgJ() {
        Iterator<Node> it = zzZgF().iterator();
        while (it.hasNext()) {
            Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
            if (inline != null && inline.getFont().getStyleIdentifier() == 85) {
                inline.zzZYh().remove(50);
            }
        }
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzZbU();
        com.aspose.words.internal.zzZOY zzzoyZzZbn = zzZgn().zzZbn();
        try {
            zzZP6 zzzp6ZzZbV = zzZbV();
            if (zzzp6ZzZbV != null) {
                return zzzp6ZzZbV;
            }
            zzzoyZzZbn.dispose();
            if (this.zzYBH) {
                zzZbS();
            }
            return new zzZP4(this);
        } finally {
            zzzoyZzZbn.dispose();
        }
    }

    @Override // com.aspose.words.Field
    public final int zzZgN() {
        return 2;
    }

    public static final class zzX implements zzZ8Y {
        private boolean zzYBA;
        private boolean zzYBB;
        private boolean zzYBC;
        private com.aspose.words.internal.zzZYI zzYBs;
        private FieldToc zzYBt;
        private String zzYBu;
        private zzZ5S zzYBv;
        private zzZ5S zzYBw;
        private zzZ5S zzYBx;
        private String zzYBy;
        private boolean zzYBz;
        private FieldEnd zzYGf;
        private FieldStart zzYGh;
        private int zzjv;
        private boolean zzYBF = zzMj("\\b");
        private boolean zzYBE = zzMj("\\f");
        private boolean zzYBD = zzMj("\\l");

        private zzX(FieldToc fieldToc, zzZ5S zzz5s, zzZ5S zzz5s2, zzZ5S zzz5s3) {
            this.zzYBt = fieldToc;
            this.zzYBs = zzY(fieldToc);
            this.zzYBx = zzz5s;
            this.zzYBw = zzz5s2;
            this.zzYBv = zzz5s3;
            this.zzjv = zzZQ3.zzLV(fieldToc.zzZgq().zzt("\\f", false));
            this.zzYBC = zzMj("\\a") || zzMj("\\c");
            this.zzYBB = zzMj("\\o");
            this.zzYBA = zzMj("\\t");
            this.zzYBz = this.zzYBt.getUseParagraphOutlineLevel();
            this.zzYBy = this.zzYBt.getTableOfFiguresLabel();
            this.zzYBu = this.zzYBt.getCaptionlessTableOfFiguresLabel();
            this.zzYGf = this.zzYBt.getEnd();
            this.zzYGh = this.zzYBt.getStart();
            if (this.zzYBE || fieldToc.zzZgq().zzMi("\\l") != null) {
                return;
            }
            this.zzYBx = zzZ5S.zzYeV;
        }

        private boolean zzMj(String str) {
            return this.zzYBt.zzZgq().zzMj(str);
        }

        private static zzZ5S zzX(Field field, String str) {
            zzZR8 zzzr8ZzMi;
            if (field.zzZgq().zzMj(str) && (zzzr8ZzMi = field.zzZgq().zzMi(str)) != null) {
                return zzZ5S.zzJs(zzzr8ZzMi.zzW2(true));
            }
            return zzZ5S.zzYeW;
        }

        private static com.aspose.words.internal.zzZYI zzY(FieldToc fieldToc) {
            com.aspose.words.internal.zzZYI zzzyi = new com.aspose.words.internal.zzZYI(false);
            String customTocStyleSeparator = fieldToc.getStart().zzYBb().getFieldOptions().getCustomTocStyleSeparator();
            if (com.aspose.words.internal.zzZKN.zzU3(customTocStyleSeparator)) {
                customTocStyleSeparator = Character.toString(com.aspose.words.internal.zzJB.zzH2());
            }
            for (String str : fieldToc.zzZgq().zzMd("\\t")) {
                if (!com.aspose.words.internal.zzZKN.zzU3(str)) {
                    zzZ(zzzyi, fieldToc, com.aspose.words.internal.zzZKN.zzZ(str, new String[]{customTocStyleSeparator}, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd));
                }
            }
            return zzzyi;
        }

        public static zzX zzZ(FieldToc fieldToc) {
            zzZ5S zzz5sZzX;
            zzZ5S zzz5sZzX2;
            zzZ5S zzz5sZzX3 = zzX(fieldToc, "\\l");
            if (zzz5sZzX3 == null || (zzz5sZzX = zzX(fieldToc, "\\o")) == null || (zzz5sZzX2 = zzX(fieldToc, "\\n")) == null) {
                return null;
            }
            return new zzX(fieldToc, zzz5sZzX3, zzz5sZzX, zzz5sZzX2);
        }

        @Override // com.aspose.words.zzZ8Y
        public final String getCaptionlessTableOfFiguresLabel() {
            return this.zzYBu;
        }

        @Override // com.aspose.words.zzZ8Y
        public final FieldEnd getEnd() {
            return this.zzYGf;
        }

        @Override // com.aspose.words.zzZ8Y
        public final FieldStart getStart() {
            return this.zzYGh;
        }

        @Override // com.aspose.words.zzZ8Y
        public final String getTableOfFiguresLabel() {
            return this.zzYBy;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean getUseParagraphOutlineLevel() {
            return this.zzYBz;
        }

        @Override // com.aspose.words.zzZ8Y
        public final Bookmark zzZbF() throws Exception {
            Bookmark bookmark;
            if (this.zzYBt.getBookmarkName() != null && (bookmark = this.zzYBt.getStart().getDocument().getRange().getBookmarks().get(this.zzYBt.getBookmarkName())) != null && zzYVU.zzJ(bookmark.getBookmarkStart(), 3) && zzYVU.zzJ(bookmark.getBookmarkEnd(), 3)) {
                return bookmark;
            }
            return null;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbG() {
            return true;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbH() {
            return false;
        }

        public final zzZ5S zzZbI() {
            return this.zzYBv;
        }

        @Override // com.aspose.words.zzZ8Y
        public final zzZ5S zzZbJ() {
            return this.zzYBw;
        }

        @Override // com.aspose.words.zzZ8Y
        public final zzZ5S zzZbK() {
            return this.zzYBx;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbL() {
            return this.zzYBA;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbM() {
            return this.zzYBB;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbN() {
            return this.zzYBC;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbO() {
            return this.zzYBD;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbP() {
            return this.zzYBE;
        }

        @Override // com.aspose.words.zzZ8Y
        public final boolean zzZbQ() {
            return this.zzYBF;
        }

        @Override // com.aspose.words.zzZ8Y
        public final int zzuZ() {
            return this.zzjv;
        }

        private static boolean zzZ(StyleCollection styleCollection, String str, String str2) {
            return zzZ(styleCollection, str) || zzZ(styleCollection, str2);
        }

        private static boolean zzZ(StyleCollection styleCollection, String str) {
            return (com.aspose.words.internal.zzZKN.zzU3(str) || styleCollection.get(str) == null) ? false : true;
        }

        private static void zzZ(com.aspose.words.internal.zzZYI zzzyi, String str, String str2, int i) {
            zzZ(zzzyi, str, i);
            zzZ(zzzyi, str2, i);
        }

        private static void zzZ(com.aspose.words.internal.zzZYI zzzyi, String str, int i) {
            if (com.aspose.words.internal.zzZKN.zzU3(str) || zzzyi.containsKey(str)) {
                return;
            }
            zzzyi.add(str, i);
        }

        @Override // com.aspose.words.zzZ8Y
        public final int zzY(Paragraph paragraph, Style style) {
            if (this.zzYBz && !zzZ5S.zzxU(zzY51.zzXW(paragraph))) {
                return -1;
            }
            int i = this.zzYBs.get(style.getName());
            if (!com.aspose.words.internal.zzZYI.zzWm(i)) {
                return i;
            }
            for (String str : style.zzY3w()) {
                int i2 = this.zzYBs.get(str);
                if (!com.aspose.words.internal.zzZYI.zzWm(i2)) {
                    return i2;
                }
            }
            return -1;
        }

        private static void zzZ(com.aspose.words.internal.zzZYI zzzyi, Field field, String[] strArr) {
            int i;
            StyleCollection styles = field.getStart().getDocument().getStyles();
            int i2 = 0;
            int i3 = 1;
            while (i2 < strArr.length) {
                String strZzTX = com.aspose.words.internal.zzZKN.zzTX(strArr[i2]);
                String strZzAD = zzY8M.zzAD(strZzTX);
                if (i2 == strArr.length - 1) {
                    zzZ(zzzyi, strZzTX, strZzAD, 1);
                    return;
                }
                int i4 = i2 + 1;
                int iZzZk = com.aspose.words.internal.zzJB.zzZk(com.aspose.words.internal.zzZKN.zzTX(strArr[i4]));
                if (zzZ5S.zzxU(iZzZk)) {
                    i2 = i4;
                    i3 = iZzZk;
                    i = 9;
                } else if (zzZ(styles, strZzTX, strZzAD)) {
                    i = i3 < 9 ? i3 + 1 : i3;
                } else {
                    i = i3;
                    i3 = iZzZk;
                }
                if (zzZ5S.zzxU(i3)) {
                    zzZ(zzzyi, strZzTX, strZzAD, i3);
                }
                i2++;
                i3 = i;
            }
        }
    }

    private boolean zzZ(DocumentBuilder documentBuilder, String[] strArr, zzZ8Z zzz8z, zzX zzx) throws Exception {
        String strZzF = zzF(strArr);
        zzYWB zzywbInsertBookmark = zzz8z.insertBookmark(strZzF);
        if (zzywbInsertBookmark == null) {
            return false;
        }
        int iZzZY = zzZY(zzz8z.getLevel(), zzx.zzZbN());
        zzYEF zzyef = (zzYEF) getEnd().getParentParagraph().zzYp5().zzbn();
        zzZQ3.zzZ(this, documentBuilder, iZzZY);
        zzZQ3.zzZ(getStart().zzYBb(), documentBuilder.getCurrentParagraph());
        getEnd().getParentParagraph().zzC(zzyef);
        documentBuilder.zzZpC();
        Node nodeZzW = zzZQ3.zzW(documentBuilder);
        Node nodeZzZ = zzZ(zzz8z, nodeZzW, documentBuilder, strZzF);
        zzZ(zzz8z, zzywbInsertBookmark, nodeZzZ, zzx);
        documentBuilder.moveTo(nodeZzZ);
        documentBuilder.zzZpC();
        zzZ(documentBuilder, zzz8z, strZzF, zzx);
        nodeZzW.remove();
        return true;
    }

    private Node zzZ(zzZ8Z zzz8z, Node node, DocumentBuilder documentBuilder, String str) {
        if (!getInsertHyperlinks() || !zzz8z.hasBookmark()) {
            return node;
        }
        documentBuilder.moveTo(node);
        return documentBuilder.insertField(com.aspose.words.internal.zzZKN.format(" HYPERLINK \\l \"{0}\" ", str), "").getEnd();
    }

    private void zzZ(zzZ8Z zzz8z, zzYWB zzywb, Node node, zzZ8Y zzz8y) throws Exception {
        FieldTC fieldTC;
        zzTU zztu = new zzTU(new zzZA2[0]);
        zzYJY zzyjy = (zzYJY) com.aspose.words.internal.zzZKW.zzZ(zzz8z, zzYJY.class);
        if (zzyjy != null) {
            zztu.zzZ(new zzZSB(zzyjy.getDocument(), getStart().getDocument(), 0));
            fieldTC = (FieldTC) com.aspose.words.internal.zzZKW.zzZ(zzyjy.zzYma(), FieldTC.class);
        } else {
            fieldTC = null;
        }
        if (fieldTC == null) {
            fieldTC = (FieldTC) com.aspose.words.internal.zzZKW.zzZ(zzz8z, FieldTC.class);
        }
        if (fieldTC != null) {
            zztu.zzZ(new zzZP9(fieldTC.zzZeH(), 7));
        }
        zzY55 zzy55 = new zzY55(getPreserveTabs(), getPreserveLineBreaks(), zzz8z.getLevel(), zzz8y.zzZbN());
        zztu.zzZ(zzy55);
        zzZA2 zzza2ZzZ = zzZ(zzz8z);
        zztu.zzZ(zzza2ZzZ);
        zzYWB labelRange = zzz8z.getLabelRange();
        if (labelRange != null) {
            zzYWJ.zzZ(labelRange, node, zztu);
        }
        zzTS zzts = new zzTS();
        zzts.zzZ(new zzZQA(this, new zzZ(zzza2ZzZ)));
        zzts.zzZ(new zzTQ(28, 27));
        zzts.zzZ(new zzY());
        zzYWJ.zzZ(zzywb, node, zztu, zzts, new zzZPL(84));
        zzy55.zzXUV();
    }

    private void zzZ(DocumentBuilder documentBuilder, zzZ8Z zzz8z, String str, zzX zzx) throws Exception {
        String string;
        String string2;
        zzZQ3.zzZ(documentBuilder, getStart().getParentParagraph());
        if ((zzZbR() && zzx.zzZbI().zzxV(zzz8z.getLevel())) || zzz8z.getOmitPageNumber()) {
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(getEntrySeparator())) {
            string = Character.toString(getEntrySeparator().charAt(0));
        } else {
            string = ControlChar.TAB;
        }
        documentBuilder.write(string);
        if (!com.aspose.words.internal.zzZKN.zzU3(getPrefixedSequenceIdentifier())) {
            zzZ(documentBuilder, zzz8z, str);
            if (com.aspose.words.internal.zzZYD.zzXk(getSequenceSeparator())) {
                string2 = Character.toString(getSequenceSeparator().charAt(0));
            } else {
                string2 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
            }
            documentBuilder.write(string2);
        }
        zzY(documentBuilder, zzz8z, str);
        zzZgo().zzLF(str);
    }

    private void zzZ(DocumentBuilder documentBuilder, zzZ8Z zzz8z, String str) throws Exception {
        if (zzz8z.hasBookmark()) {
            documentBuilder.insertField(com.aspose.words.internal.zzZKN.format(" SEQ {0} {1} \\* ARABIC ", getPrefixedSequenceIdentifier(), str), MsalUtils.QUERY_STRING_SYMBOL);
            zzZPF zzzpf = (zzZPF) zzZgo().zzZav().zzm(zzZPF.class);
            if (zzzpf != null) {
                zzzpf.zzLM(str);
                return;
            }
            return;
        }
        documentBuilder.write(Integer.toString(zzz8z.getSequenceValue(getPrefixedSequenceIdentifier())));
    }

    private String zzZ(zzZ8Y zzz8y) throws Exception {
        if (zzz8y.zzZbQ() && zzz8y.zzZbF() == null) {
            zzZR8 zzzr8ZzMi = zzZgq().zzMi("\\b");
            if (zzzr8ZzMi != null && !zzzr8ZzMi.zzZga().zz13()) {
                return "Error! Bookmark not defined.";
            }
            return "Error! No bookmark name given.";
        }
        if (zzz8y.zzZbN()) {
            return "No table of figures entries found.";
        }
        return "No table of contents entries found.";
    }

    private zzZA2 zzZ(zzZ8Z zzz8z) {
        int iZzZY = zzZY(zzz8z.getLevel(), false);
        if (getInsertHyperlinks() && zzz8z.hasBookmark()) {
            return new zzY53(iZzZY, getStart().getDocument().getStyles());
        }
        return new zzY52(iZzZY, getStart().getDocument().getStyles());
    }
}
