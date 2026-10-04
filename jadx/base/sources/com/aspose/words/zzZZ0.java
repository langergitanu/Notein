package com.aspose.words;

import com.aspose.words.internal.C22246OooO0oo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ0 {
    private static int[] zzYRV = {1, 3, 4, 0, 5, 2};
    private zzU8 zzZGE;

    private zzZZ0(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    private static void zzK(Document document) throws Exception {
        String upperCase = "";
        for (StructuredDocumentTag structuredDocumentTag : document.getChildNodes(28, true)) {
            if (structuredDocumentTag.getXmlMapping().isMapped()) {
                CustomXmlPart byId = document.getCustomXmlParts().getById(structuredDocumentTag.getXmlMapping().getStoreItemId());
                if (com.aspose.words.internal.zzZKN.zzU3(structuredDocumentTag.getXmlMapping().getStoreItemId()) && byId != null) {
                    if (com.aspose.words.internal.zzZKN.zzU3(upperCase)) {
                        upperCase = com.aspose.words.internal.zzZZS.zzY(new Object[0]).toString().toUpperCase();
                    }
                    structuredDocumentTag.getXmlMapping().zzyh(upperCase);
                }
            }
        }
        if (com.aspose.words.internal.zzZKN.zzU3(upperCase)) {
            return;
        }
        document.getCustomXmlParts().getById("").setId(upperCase);
    }

    private static ArrayList<com.aspose.words.internal.zz6R> zzL(Document document) {
        ArrayList<com.aspose.words.internal.zz6R> arrayList = new ArrayList<>();
        HashMap map = new HashMap();
        for (RevisionGroup revisionGroup : document.getRevisions().getGroups()) {
            String strZzZ = zzZ(revisionGroup);
            if (revisionGroup.getRevisionType() == 1 && zzY(revisionGroup)) {
                map.put(strZzZ, revisionGroup);
            }
        }
        for (RevisionGroup revisionGroup2 : document.getRevisions().getGroups()) {
            String strZzZ2 = zzZ(revisionGroup2);
            if (revisionGroup2.getRevisionType() == 0 && zzY(revisionGroup2) && map.containsKey(strZzZ2)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new com.aspose.words.internal.zz6R(map.get(strZzZ2), revisionGroup2));
            }
        }
        return arrayList;
    }

    private static void zzM(Document document) {
        int i;
        for (com.aspose.words.internal.zz6R zz6r : zzL(document)) {
            RevisionGroup revisionGroup = (RevisionGroup) zz6r.getFirst();
            RevisionGroup revisionGroup2 = (RevisionGroup) zz6r.zzwW();
            String strZzTX = com.aspose.words.internal.zzZKN.zzTX(revisionGroup.getText());
            int length = strZzTX.length();
            String text = revisionGroup.getText();
            int i2 = com.aspose.words.internal.zzZOF.CURRENT_CULTURE$4894b8c8;
            int iZzT = com.aspose.words.internal.zzZKN.zzT(text, strZzTX, i2);
            int iZzT2 = com.aspose.words.internal.zzZKN.zzT(revisionGroup2.getText(), strZzTX, i2);
            while (true) {
                int i3 = iZzT + length;
                if (i3 >= revisionGroup.getText().length() || (i = iZzT2 + length) >= revisionGroup2.getText().length() || revisionGroup.getText().charAt(i3) != revisionGroup2.getText().charAt(i)) {
                    break;
                } else {
                    length++;
                }
            }
            if (length > 10) {
                zzYWB zzywbZzT = zzT(revisionGroup.zzYlk(), iZzT, length);
                zzZ(revisionGroup, zzywbZzT, document.zzZqs());
                zzYWB zzywbZzT2 = zzT(revisionGroup2.zzYlk(), iZzT2, length);
                zzZ(revisionGroup2, zzywbZzT2, document.zzZqs());
                zzYJ4.zzZ(zzywbZzT2, zzywbZzT, document.zzZqs().getAuthor(), document.zzZqs().zzZx());
            }
        }
        document.getRevisions().zzYlw();
    }

    private static void zzN(Document document) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (StructuredDocumentTag structuredDocumentTag : document.getChildNodes(28, true)) {
            if (structuredDocumentTag.getSdtType() == 12) {
                Iterator<T> it = structuredDocumentTag.getChildNodes(8, true).iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((Paragraph) it.next()).hasChildNodes()) {
                        i++;
                    }
                }
                if (i > 1) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<StructuredDocumentTag>) arrayList, structuredDocumentTag);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((StructuredDocumentTag) it2.next()).removeSelfOnly();
        }
    }

    private static void zzO(Document document) {
        for (Table table : document.getChildNodes(5, true).zzYAN()) {
            if (!table.zzY0f()) {
                table.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.aspose.words.Run] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static zzYWB zzT(ArrayList<Node> arrayList, int i, int i2) {
        int i3 = i2 + i;
        ?? r0 = 0;
        int length = 0;
        Node node = null;
        for (Node node2 : arrayList) {
            String strZzZYp = node2.isComposite() ? ((CompositeNode) node2).zzZYp() : node2.getText();
            if (r0 == 0 && length == i) {
                r0 = node2;
            }
            if (node == null && strZzZYp.length() + length == i3) {
                node = node2;
            }
            if (r0 == 0 && strZzZYp.length() + length > i) {
                r0 = (Run) node2;
                r0.zzng(i - length);
            }
            if (node == null && strZzZYp.length() + length > i3) {
                Run run = (Run) node2;
                run.zznf(i3 - length);
                node = run;
            }
            length += strZzZYp.length();
            r0 = r0;
        }
        return new zzYWB((Node) r0, node);
    }

    private static boolean zzY(RevisionGroup revisionGroup) {
        Iterator<Node> it = revisionGroup.zzYlk().iterator();
        while (it.hasNext()) {
            int nodeType = it.next().getNodeType();
            if (nodeType != 8) {
                switch (nodeType) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        break;
                    default:
                        return false;
                }
            }
        }
        return true;
    }

    public static void zzZ(Document document, Document document2, CompareOptions compareOptions) throws Exception {
        if (document.hasRevisions() || document2.hasRevisions()) {
            throw new IllegalStateException("Compared documents must not have revisions.");
        }
        zzK(document);
        zzK(document2);
        zzO(document);
        zzO(document2);
        Iterator<T> it = document.getSections().iterator();
        while (it.hasNext()) {
            ((Section) it.next()).ensureMinimum();
        }
        Iterator<T> it2 = document2.getSections().iterator();
        while (it2.hasNext()) {
            ((Section) it2.next()).ensureMinimum();
        }
        if (compareOptions.getIgnoreComments() && compareOptions.getTarget() == 1) {
            Iterator it3 = document.zzY(new int[]{19, 33, 34}, true).zzYAN().iterator();
            while (it3.hasNext()) {
                ((Node) it3.next()).remove();
            }
        }
        zzU8 zzu8 = new zzU8(document, document2, compareOptions);
        zzZZ0 zzzz0 = new zzZZ0(zzu8);
        zzZ(zzu8);
        zzY82 zzy82 = new zzY82(document);
        try {
            zzU4.zzZ(document, zzu8);
            zzy82.dispose();
            zzy82 = new zzY82(document2);
            try {
                zzU4.zzZ(document2, (zzU8) null);
                zzy82.dispose();
                document.zzZq9().add(24);
                zzzz0.zzZpk();
                zzy82 = new zzY82(document);
                try {
                    zzU4.zzY(document, zzu8);
                    zzy82.dispose();
                    zzy82 = new zzY82(document2);
                    try {
                        zzU4.zzY(document2, zzu8);
                        zzy82.dispose();
                        zzN(document);
                        if (compareOptions.getCompareMoves()) {
                            zzM(document);
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private void zzZpk() throws Exception {
        HeaderFooter byHeaderFooterType;
        Document documentZzZZ6 = this.zzZGE.zzZZ6();
        Document documentZzZZ5 = this.zzZGE.zzZZ5();
        for (Comment comment : documentZzZZ6.getChildNodes(19, true)) {
            zzU8 zzu8 = this.zzZGE;
            zzu8.zzZuq = Math.max(zzu8.zzZuq, comment.getId());
        }
        for (Comment comment2 : documentZzZZ5.getChildNodes(19, true)) {
            zzU8 zzu82 = this.zzZGE;
            zzu82.zzZuq = Math.max(zzu82.zzZuq, comment2.getId());
        }
        if (this.zzZGE.zzZup.getTarget() == 1) {
            for (Map.Entry<String, String> entry : documentZzZZ5.getVariables()) {
                if (!documentZzZZ6.getVariables().contains(entry.getKey())) {
                    documentZzZZ6.getVariables().add(entry.getKey(), entry.getValue());
                }
            }
        }
        new zzY8F(this.zzZGE).zzY26();
        zzY9D.zzU(documentZzZZ6, documentZzZZ5, this.zzZGE);
        int i = 0;
        int i2 = 0;
        while (i < documentZzZZ6.getSections().getCount()) {
            Section section = documentZzZZ6.getSections().get(i);
            Section section2 = documentZzZZ5.getSections().get(i2);
            Paragraph lastParagraph = section.getBody().getLastParagraph();
            if (lastParagraph == null || lastParagraph.getDeleteRevision() == null) {
                if (!this.zzZGE.zzZup.getIgnoreHeadersAndFooters()) {
                    for (int i3 : zzYRV) {
                        HeaderFooter byHeaderFooterType2 = section.getHeadersFooters().getByHeaderFooterType(i3);
                        HeaderFooter byHeaderFooterType3 = section2 != null ? section2.getHeadersFooters().getByHeaderFooterType(i3) : null;
                        if (!com.aspose.words.internal.zzZ4.zzX(byHeaderFooterType2, byHeaderFooterType3)) {
                            if (byHeaderFooterType3 == null) {
                                zzU4.zzY(byHeaderFooterType2, this.zzZGE);
                            } else if (byHeaderFooterType2 == null) {
                                section.insertBefore((HeaderFooter) zzU4.zzZ((Node) byHeaderFooterType3, this.zzZGE, true), section.getBody());
                            } else if (byHeaderFooterType2.isLinkedToPrevious()) {
                                Iterator<T> it = byHeaderFooterType3.getChildNodes(0, false).iterator();
                                while (it.hasNext()) {
                                    byHeaderFooterType2.appendChild(zzU4.zzZ((Node) it.next(), this.zzZGE, true));
                                }
                            } else {
                                zzY9D.zzU(byHeaderFooterType2, byHeaderFooterType3, this.zzZGE);
                            }
                        }
                    }
                }
                i++;
                i2++;
            } else {
                for (int i4 : zzYRV) {
                    if (!this.zzZGE.zzZup.getIgnoreHeadersAndFooters() && (byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(i4)) != null) {
                        zzU4.zzY(byHeaderFooterType, this.zzZGE);
                    }
                }
                i++;
            }
        }
        if (this.zzZGE.hasRevisions()) {
            this.zzZGE.zzZZ8();
        }
        this.zzZGE.zzZZ6().zzZq8();
    }

    private static zzYEF zzs(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType == 8) {
            return ((Paragraph) node).zzYp5();
        }
        switch (nodeType) {
            case 21:
            case 22:
            case 23:
            case 24:
                return ((Inline) node).zzZYh();
            default:
                return null;
        }
    }

    private static void zzZ(zzU8 zzu8) throws Exception {
        zzU6.zzSU("{Equal tables list}");
        zzU6.zzZZ2();
        com.aspose.words.internal.zzZYG zzzyg = new com.aspose.words.internal.zzZYG();
        for (Table table : zzu8.zzZZ6().getChildNodes(5, true)) {
            zzzyg.set(table.getText(), table);
        }
        for (Table table2 : zzu8.zzZZ5().getChildNodes(5, true)) {
            String text = table2.getText();
            if (zzzyg.containsKey(text)) {
                Table table3 = (Table) zzzyg.get(text);
                if (zzU6.zzZtG) {
                    String strZzST = zzU6.zzST(text);
                    if (strZzST.length() > 30) {
                        strZzST = C22246OooO0oo.OooO00o(new StringBuilder(), strZzST, "...", 0, 30);
                    }
                    zzU6.zzSU(com.aspose.words.internal.zzZKN.format("{0} -> {1}: {2}", table3, table2, strZzST));
                }
                if (!zzu8.zzZuj.containsKey(text)) {
                    com.aspose.words.internal.zzZYI zzzyi = zzu8.zzZuj;
                    zzzyi.set(text, zzzyi.getCount() + 1);
                }
            }
        }
        zzU6.zzZZ1();
    }

    private static String zzZ(RevisionGroup revisionGroup) {
        return com.aspose.words.internal.zzZKN.zzV(revisionGroup.getText(), ControlChar.SPACE_CHAR, FilenameUtils.EXTENSION_SEPARATOR, ControlChar.PARAGRAPH_BREAK_CHAR);
    }

    private static void zzZ(RevisionGroup revisionGroup, zzYWB zzywb, zzZV7 zzzv7) {
        int i = revisionGroup.getRevisionType() == 0 ? 14 : 12;
        boolean z = false;
        int i2 = revisionGroup.getRevisionType() == 0 ? 1 : 0;
        for (Node node : revisionGroup.zzYlk()) {
            if (z || node == zzywb.zzYA2().getNode()) {
                zzYEF zzyefZzs = zzs(node);
                if (zzyefZzs != null) {
                    zzyefZzs.remove(i);
                    zzyefZzs.zzQ(15, new zzYX5(i2, zzzv7.getAuthor(), zzzv7.zzZx()));
                }
                if (node == zzywb.zzYA1().getNode()) {
                    return;
                } else {
                    z = true;
                }
            }
        }
    }
}
