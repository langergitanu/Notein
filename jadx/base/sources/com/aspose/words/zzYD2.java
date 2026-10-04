package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYD2 extends zzYDG {
    private static com.aspose.words.internal.zzZNR zzXnZ = new com.aspose.words.internal.zzZNR("^\\[\\d+\\]");
    private boolean zzXo0;
    private String zzXo1;

    public static class zzZ {
        private String zzXnW;
        private int zzXnX;
        private com.aspose.words.internal.zzIM<zzYD2> zzXnY = new com.aspose.words.internal.zzIM<>();

        public zzZ(String str) {
            this.zzXnW = str;
        }

        public final String zzYcx() {
            return this.zzXnW;
        }

        public final int zzYcy() {
            return this.zzXnX;
        }

        public final com.aspose.words.internal.zzIM<zzYD2> zzYcz() {
            return this.zzXnY;
        }

        public final void zzmz(int i) {
            this.zzXnX = i;
        }
    }

    private static boolean zzBd(String str) {
        return com.aspose.words.internal.zzZKN.zzS(str, "//", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private static void zzW(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) throws Exception {
        if (structuredDocumentTag.getXmlMapping().isEmpty() || structuredDocumentTag2.getXmlMapping().isEmpty()) {
            return;
        }
        int iZzXQH = structuredDocumentTag.getXmlMapping().zzXQH();
        int iZzn = zzn(structuredDocumentTag);
        if (iZzXQH == 0 || iZzn >= iZzXQH || zzn(structuredDocumentTag2) == 1) {
            return;
        }
        structuredDocumentTag2.insertBefore(structuredDocumentTag, structuredDocumentTag.getParentNode());
    }

    private static void zzX(StructuredDocumentTag structuredDocumentTag, zzZ zzz) throws Exception {
        Iterator<T> it = structuredDocumentTag.getChildNodes(28, true).iterator();
        while (it.hasNext()) {
            zzZ(structuredDocumentTag, (StructuredDocumentTag) it.next(), zzz);
        }
    }

    private static void zzY(StructuredDocumentTag structuredDocumentTag, zzZ zzz) throws Exception {
        int level = structuredDocumentTag.getLevel();
        if (level == 2 || level == 3) {
            zzX(structuredDocumentTag, zzz);
        } else if (level != 4) {
            throw new IllegalStateException("Unexpected SDT level.");
        }
        zzz.zzmz(zzz.zzYcy() + 1);
    }

    private static boolean zzZ(StructuredDocumentTag structuredDocumentTag, zzZ zzz) throws Exception {
        zzYD2 zzyd2 = (zzYD2) structuredDocumentTag.zzY3H();
        if (zzz.zzYcz().contains(zzyd2)) {
            return true;
        }
        for (StructuredDocumentTag structuredDocumentTag2 : structuredDocumentTag.getChildNodes(28, false)) {
            if (structuredDocumentTag2.zzY3O()) {
                zzY(structuredDocumentTag2, zzz);
            } else {
                structuredDocumentTag2.getXmlMapping().zzXQI();
            }
        }
        zzz.zzYcz().add(zzyd2);
        return true;
    }

    private static int zzn(StructuredDocumentTag structuredDocumentTag) {
        int i = 0;
        Iterator<T> it = structuredDocumentTag.getChildNodes(28, false).iterator();
        while (it.hasNext()) {
            if (((StructuredDocumentTag) it.next()).zzY3O()) {
                i++;
            }
        }
        return i;
    }

    private static void zzo(StructuredDocumentTag structuredDocumentTag) throws Exception {
        int iZzXQH = !structuredDocumentTag.getXmlMapping().isEmpty() ? structuredDocumentTag.getXmlMapping().zzXQH() : 0;
        if (iZzXQH == 0) {
            return;
        }
        CompositeNode compositeNode = (structuredDocumentTag.getFirstChild() == null || structuredDocumentTag.getFirstChild().getNodeType() != 5) ? structuredDocumentTag : (CompositeNode) structuredDocumentTag.getFirstChild();
        NodeCollection childNodes = compositeNode.getChildNodes(28, false);
        ArrayList arrayList = new ArrayList();
        StructuredDocumentTag structuredDocumentTag2 = null;
        int i = 0;
        for (int i2 = 0; i2 < childNodes.getCount(); i2++) {
            StructuredDocumentTag structuredDocumentTag3 = (StructuredDocumentTag) childNodes.get(i2);
            NodeCollection childNodes2 = structuredDocumentTag3.getChildNodes(28, false);
            for (int i3 = 0; i3 < childNodes2.getCount(); i3++) {
                StructuredDocumentTag structuredDocumentTag4 = (StructuredDocumentTag) childNodes2.get(i3);
                if (structuredDocumentTag3.zzY3O() && structuredDocumentTag4.zzY3P() && compositeNode.getNodeType() == 28) {
                    zzW(structuredDocumentTag4, (StructuredDocumentTag) compositeNode);
                }
            }
            if (structuredDocumentTag3.zzY3O()) {
                if (structuredDocumentTag3.hasChildNodes() && i < iZzXQH) {
                    i++;
                    zzY(structuredDocumentTag, structuredDocumentTag3, i2);
                    structuredDocumentTag2 = structuredDocumentTag3;
                } else if (!arrayList.contains(structuredDocumentTag3)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<StructuredDocumentTag>) arrayList, structuredDocumentTag3);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((StructuredDocumentTag) it.next()).remove();
        }
        if (structuredDocumentTag2 == null) {
            return;
        }
        while (i < iZzXQH) {
            StructuredDocumentTag structuredDocumentTag5 = (StructuredDocumentTag) structuredDocumentTag2.deepClone(true);
            zzY(structuredDocumentTag, structuredDocumentTag5, i);
            compositeNode.insertAfter(structuredDocumentTag5, structuredDocumentTag2);
            i++;
        }
    }

    public static boolean zzp(StructuredDocumentTag structuredDocumentTag) throws Exception {
        if (structuredDocumentTag.getXmlMapping().isEmpty()) {
            return true;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getXmlMapping().getXPath())) {
            return false;
        }
        zzo(structuredDocumentTag);
        zzZ zzz = new zzZ(structuredDocumentTag.getXmlMapping().getXPath());
        if (structuredDocumentTag.isShowingPlaceholderText() && structuredDocumentTag.getPlaceholder() == null) {
            structuredDocumentTag.isShowingPlaceholderText(false);
        }
        return zzZ(structuredDocumentTag, zzz);
    }

    @Override // com.aspose.words.zzYDG
    public final int getType() {
        return 14;
    }

    public final void zzBe(String str) {
        this.zzXo1 = str;
    }

    public final void zzR2(boolean z) {
        this.zzXo0 = z;
    }

    public final boolean zzYcA() {
        return this.zzXo0;
    }

    public final String zzYcB() {
        return this.zzXo1;
    }

    private static void zzY(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2, int i) throws Exception {
        for (StructuredDocumentTag structuredDocumentTag3 : structuredDocumentTag2.getChildNodes(28, true)) {
            if (structuredDocumentTag3.getXmlMapping().isMapped()) {
                String xPath = structuredDocumentTag.getXmlMapping().getXPath();
                String xPath2 = structuredDocumentTag3.getXmlMapping().getXPath();
                if (!zzBd(xPath2) && com.aspose.words.internal.zzZKN.zzS(xPath2, xPath, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8)) {
                    xPath2 = zzXnZ.zzZR(com.aspose.words.internal.zzZKN.zzT(xPath2, 0, xPath.length()), "/");
                }
                if (zzBd(xPath2)) {
                    structuredDocumentTag3.getXmlMapping().setXPath(com.aspose.words.internal.zzZKN.format("{0}[{1}]/{2}", xPath, Integer.valueOf(i + 1), com.aspose.words.internal.zzZKN.zzU(xPath2, IOUtils.DIR_SEPARATOR_UNIX)));
                }
            }
        }
    }

    private static void zzZ(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2, zzZ zzz) throws Exception {
        String strZzYcx = zzz.zzYcx();
        com.aspose.words.internal.zzZNR zzznr = new com.aspose.words.internal.zzZNR(com.aspose.words.internal.zzZNR.zzUU(strZzYcx) + "\\[(\\d+)\\].*", 66);
        if (structuredDocumentTag2.getXmlMapping().isEmpty() || !com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag2.getXmlMapping().getXPath())) {
            return;
        }
        String xPath = structuredDocumentTag2.getXmlMapping().getXPath();
        String string = Integer.toString(zzz.zzYcy() + 1);
        com.aspose.words.internal.zzZNT zzzntZzUX = zzznr.zzUX(xPath);
        if (zzzntZzUX.zzhL()) {
            structuredDocumentTag2.getXmlMapping().setXPath(zzZ(zzzntZzUX, string));
            structuredDocumentTag.getXmlMapping().zzXQI();
            return;
        }
        if (xPath.length() < strZzYcx.length() || !com.aspose.words.internal.zzZYD.zzi(xPath.substring(0, strZzYcx.length()), strZzYcx)) {
            return;
        }
        if (xPath.length() == strZzYcx.length() || xPath.charAt(strZzYcx.length()) == '/') {
            structuredDocumentTag2.getXmlMapping().setXPath(com.aspose.words.internal.zzZKN.zzV(xPath, strZzYcx.length(), "[" + string + "]"));
            structuredDocumentTag.getXmlMapping().zzXQI();
        }
    }

    private static String zzZ(com.aspose.words.internal.zzZNT zzznt, String str) {
        return com.aspose.words.internal.zzZKN.zzV(com.aspose.words.internal.zzZKN.zzT(zzznt.getValue(), zzznt.zzhJ().zzQx(1).getIndex(), zzznt.zzhJ().zzQx(1).getLength()), zzznt.zzhJ().zzQx(1).getIndex(), str);
    }
}
