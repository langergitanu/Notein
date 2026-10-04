package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNZ extends DocumentVisitor {
    private static char[] zzYyY = {'^', '$'};
    static boolean zzZtG = false;
    private FindReplaceOptions zzYyZ;
    private com.aspose.words.internal.zzZNR zzYz0;
    private String zzYz1;
    private Node zzYz2;
    private zzZNY zzYz3;
    private DocumentBase zzZG3;

    public static class zzZ implements Comparator<Node> {
        private boolean zzYyX;

        public zzZ(boolean z) {
            this.zzYyX = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public int compare(Node node, Node node2) {
            HeaderFooter headerFooter = (HeaderFooter) com.aspose.words.internal.zzZKW.zzZ(node, HeaderFooter.class);
            HeaderFooter headerFooter2 = (HeaderFooter) com.aspose.words.internal.zzZKW.zzZ(node2, HeaderFooter.class);
            if (headerFooter == null || headerFooter2 == null) {
                throw new IllegalStateException("Wrong object type.");
            }
            return zzY(headerFooter) - zzY(headerFooter2);
        }

        private int zzY(HeaderFooter headerFooter) {
            int headerFooterType = headerFooter.getHeaderFooterType();
            if (headerFooterType == 0) {
                return 2;
            }
            if (headerFooterType == 1) {
                return this.zzYyX ? 4 : 0;
            }
            if (headerFooterType == 2) {
                return 3;
            }
            if (headerFooterType == 3) {
                return this.zzYyX ? 5 : 1;
            }
            if (headerFooterType == 4) {
                return 0;
            }
            if (headerFooterType == 5) {
                return 1;
            }
            throw new IllegalStateException("Unknown type of the header or footer.");
        }
    }

    public zzZNZ(Node node, String str, String str2, FindReplaceOptions findReplaceOptions) {
        this(node, zzZ(str, findReplaceOptions), str2, findReplaceOptions);
    }

    private IReplacingCallback getReplacingCallback() {
        FindReplaceOptions findReplaceOptions = this.zzYyZ;
        if (findReplaceOptions != null) {
            return findReplaceOptions.getReplacingCallback();
        }
        return null;
    }

    private boolean zzH(String str, int i, int i2) throws Exception {
        int iZztw;
        int iZztw2;
        Node nodeZztx = this.zzYz3.zztx(i);
        if (nodeZztx.getNodeType() == 18) {
            return false;
        }
        if (nodeZztx.getParentNode() instanceof SmartTag) {
            zzZl(nodeZztx);
        }
        if (nodeZztx.getNodeType() == 21 && (iZztw2 = i - (iZztw = this.zzYz3.zztw(i))) > 0) {
            Run run = (Run) nodeZztx;
            zzY81 zzy81 = new zzY81(this.zzZG3);
            try {
                Run runZzng = run.zzng(iZztw2);
                zzy81.dispose();
                this.zzYz3.zzZ(iZztw, iZztw, runZzng);
                this.zzYz3.zzX(iZztw + iZztw2, run);
            } catch (Throwable th) {
                zzy81.dispose();
                throw th;
            }
        }
        zzx(i, str);
        zzw(i, this.zzYz3.zzYAc().substring(i, i2));
        return true;
    }

    private static String zzLq(String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '&') {
                if (cCharAt == 'b' || cCharAt == 'p' || cCharAt == 'l' || cCharAt == 'm') {
                    if (z) {
                        cCharAt = zzYU(cCharAt);
                    }
                    sb.append(cCharAt);
                } else {
                    if (z) {
                        sb.append('&');
                    }
                    sb.append(cCharAt);
                }
                z = false;
            } else {
                if (z) {
                    sb.append('&');
                }
                z = !z;
            }
        }
        if (z) {
            sb.append('&');
        }
        return sb.toString();
    }

    private static boolean zzLr(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            int iZzc = com.aspose.words.internal.zzZVU.zzc(cCharAt);
            boolean z2 = true;
            if (iZzc != 1 && iZzc != 2) {
                z2 = false;
            }
            z |= z2;
            if (!z2 && !com.aspose.words.internal.zzZKU.zzG(cCharAt)) {
                return false;
            }
        }
        return z;
    }

    private void zzS(int i, char c) {
        Node nodeZztx = this.zzYz3.zztx(i);
        if (c == 57357) {
            zzZh(nodeZztx);
        } else {
            if (c != 57359) {
                return;
            }
            zzZg(nodeZztx);
        }
    }

    private void zzU(StructuredDocumentTag structuredDocumentTag) throws Exception {
        String value = structuredDocumentTag.getXmlMapping().getValue();
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            String strZzZS = this.zzYz0.zzZS(value, this.zzYz1);
            if (com.aspose.words.internal.zzZKN.equals(strZzZS, value)) {
                return;
            }
            structuredDocumentTag.getXmlMapping().setValue(strZzZS);
        }
    }

    private void zzXy(int i, int i2) throws Exception {
        StructuredDocumentTag structuredDocumentTag;
        com.aspose.words.internal.zzIM<StructuredDocumentTag> zzim = new com.aspose.words.internal.zzIM();
        while (i2 > 0) {
            Run run = (Run) this.zzYz3.zztx(i);
            if (this.zzYyZ.getIgnoreStructuredDocumentTags() && (structuredDocumentTag = (StructuredDocumentTag) run.getAncestor(28)) != null && structuredDocumentTag.getXmlMapping().isMapped()) {
                zzim.add(structuredDocumentTag);
            }
            if (run.zz0R() <= i2) {
                i2 -= run.zz0R();
                i += run.zz0R();
                run.setText("");
                SmartTag smartTag = (SmartTag) com.aspose.words.internal.zzZKW.zzZ(run.getParentNode(), SmartTag.class);
                run.remove();
                if (smartTag != null && smartTag.getCount() == 0) {
                    smartTag.remove();
                }
            } else {
                if (run.getParentNode() instanceof SmartTag) {
                    zzZl(run);
                }
                zzY81 zzy81 = new zzY81(this.zzZG3);
                try {
                    Run runZzng = run.zzng(i2);
                    zzy81.dispose();
                    this.zzYz3.zzZ(i, i, runZzng);
                    this.zzYz3.zzX(i2 + i, run);
                    runZzng.remove();
                    i2 = 0;
                } catch (Throwable th) {
                    zzy81.dispose();
                    throw th;
                }
            }
        }
        for (StructuredDocumentTag structuredDocumentTag2 : zzim) {
            String text = structuredDocumentTag2.getText();
            if (text.length() == 0) {
                structuredDocumentTag2.remove();
            } else {
                structuredDocumentTag2.getXmlMapping().setValue(text);
            }
        }
    }

    private static char zzYU(char c) {
        if (c == '&') {
            return '&';
        }
        if (c == 'b') {
            return (char) 57359;
        }
        if (c == 'p') {
            return (char) 57357;
        }
        if (c == 'l') {
            return ControlChar.LINE_BREAK_CHAR;
        }
        if (c != 'm') {
            return c;
        }
        return '\f';
    }

    private static boolean zzYV(char c) {
        return c == ' ' || c == '\t' || c == 57357 || c == 57359 || c == 57360 || c == 14 || "`~!@#$%^&*()-=+[{]}\\|;:'\",.<>/?\u000b".contains(Character.toString(c));
    }

    private boolean zzZ(com.aspose.words.internal.zzZNT zzznt, int i) {
        int index = zzznt.getIndex() + i;
        if (index > 0 && !zzYV(this.zzYz3.zzYAc().get(index - 1))) {
            return false;
        }
        int length = zzznt.getLength() + index;
        return length >= this.zzYz3.zzYAc().getLength() || zzYV(this.zzYz3.zzYAc().get(length));
    }

    private boolean zzZ9A() {
        FindReplaceOptions findReplaceOptions = this.zzYyZ;
        return findReplaceOptions != null && findReplaceOptions.getUseSubstitutions();
    }

    private boolean zzZ9B() {
        FindReplaceOptions findReplaceOptions = this.zzYyZ;
        return findReplaceOptions != null && findReplaceOptions.getFindWholeWordsOnly();
    }

    private boolean zzZ9C() {
        FindReplaceOptions findReplaceOptions = this.zzYyZ;
        return findReplaceOptions == null || findReplaceOptions.getDirection() == 0;
    }

    private boolean zzZ9z() {
        com.aspose.words.internal.zzZNR zzznr = this.zzYz0;
        return (zzznr == null || (zzznr.getOptions() & 8) == 0) ? false : true;
    }

    private static void zzZB(ArrayList<Node> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ(arrayList2, (Iterable) arrayList);
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        Section parentSection = null;
        int i = -1;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Node node = (Node) arrayList2.get(i2);
            if (node.getNodeType() == 4) {
                HeaderFooter headerFooter = (HeaderFooter) node;
                if (parentSection == null || headerFooter.getParentSection() == parentSection) {
                    if (i < 0) {
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList3, headerFooter);
                    parentSection = headerFooter.getParentSection();
                } else {
                    Collections.sort(arrayList3, new zzZ(parentSection.getPageSetup().getDifferentFirstPageHeaderFooter()));
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) arrayList3);
                    zzZ(arrayList2, i + 1, i2 - 1, arrayList);
                    arrayList3.clear();
                }
                i = i2;
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList3, headerFooter);
                parentSection = headerFooter.getParentSection();
            }
            if (parentSection == null) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, node);
            }
        }
        if (arrayList3.size() > 0) {
            Collections.sort(arrayList3, new zzZ(parentSection.getPageSetup().getDifferentFirstPageHeaderFooter()));
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) arrayList3);
            zzZ(arrayList2, i + 1, arrayList2.size() - 1, arrayList);
        }
    }

    private int zzZT(String str, int i) throws Exception {
        com.aspose.words.internal.zzZNS zzznsZzUW = this.zzYz0.zzUW(str);
        int i2 = zzZ9C() ? 1 : -1;
        int count = zzZ9C() ? 0 : zzznsZzUW.getCount() - 1;
        int count2 = zzznsZzUW.getCount();
        int i3 = 0;
        while (count2 > 0) {
            String strZzV0 = this.zzYz1;
            int index = zzznsZzUW.zzQw(count).getIndex() + i;
            int iReplacing = (!zzZ9B() || zzZ(zzznsZzUW.zzQw(count), i)) ? 0 : 1;
            if (getReplacingCallback() != null && iReplacing == 0) {
                ReplacingArgs replacingArgs = new ReplacingArgs(zzznsZzUW.zzQw(count), this.zzYz3.zztx(index), index - this.zzYz3.zztw(index), this.zzYz1);
                iReplacing = getReplacingCallback().replacing(replacingArgs);
                strZzV0 = zzLq(replacingArgs.getReplacement());
            }
            if (iReplacing == 2) {
                break;
            }
            if (iReplacing != 1) {
                if (zzZ9A()) {
                    strZzV0 = zzznsZzUW.zzQw(count).zzV0(strZzV0);
                }
                if (zzH(strZzV0, index, zzznsZzUW.zzQw(count).getLength())) {
                    i3++;
                }
            }
            count2--;
            count += i2;
        }
        return i3;
    }

    private void zzZg(Node node) {
        Paragraph paragraph = (Paragraph) node;
        Section section = (Section) paragraph.getAncestor(2);
        Section section2 = (Section) section.getNextSibling();
        section2.getBody().zzZ(section.getBody().getFirstChild(), (Node) null, section2.getBody().getFirstChild());
        section.remove();
        zzZh(paragraph);
    }

    private void zzZh(Node node) {
        Paragraph paragraph = (Paragraph) node;
        if (this.zzZG3.zzZqp()) {
            zzYJ4.zzW(paragraph, this.zzZG3.zzYBa().zzZqs());
            return;
        }
        Paragraph paragraph2 = this.zzYyZ.getSmartParagraphBreakReplacement() ? (Paragraph) paragraph.zzYE(paragraph.getDocument()) : (Paragraph) com.aspose.words.internal.zzZKW.zzZ(node.zzYB4(), Paragraph.class);
        if (paragraph2 == null) {
            return;
        }
        Node nodeZzYB4 = node.zzYB4();
        if (paragraph.getNextSibling() != nodeZzYB4) {
            paragraph2.zzZ(paragraph.getNextSibling(), nodeZzYB4.getPreviousSibling(), paragraph2.getFirstChild());
        }
        paragraph2.zzZ(paragraph.getFirstChild(), (Node) null, paragraph2.getFirstChild());
        paragraph.remove();
    }

    private static boolean zzZi(Node node) {
        for (CompositeNode parentNode = node.getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            int nodeType = parentNode.getNodeType();
            if (nodeType != 4 && nodeType != 7 && nodeType != 28) {
                switch (nodeType) {
                    case 17:
                    case 18:
                    case 19:
                        return false;
                    default:
                        break;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZj(Node node) {
        CompositeNode parentNode = node.getParentNode();
        while (parentNode != null) {
            if (parentNode.getNodeType() != 28) {
                parentNode = parentNode.getParentNode();
            } else {
                if (((StructuredDocumentTag) parentNode).getLevel() == 1) {
                    return false;
                }
                parentNode = parentNode.getParentNode();
            }
        }
        return true;
    }

    private void zzZk(Node node) {
        if (zzZi(node)) {
            Section section = new Section(this.zzZG3);
            section.appendChild(new Body(this.zzZG3));
            Section section2 = (Section) node.getAncestor(2);
            section.zzY((zzYCZ) section2.zzYvR().zzbn());
            while (section2.getHeadersFooters().getCount() > 0) {
                section.appendChild(section2.getHeadersFooters().get(0));
            }
            section2.zzYC(section);
            int iZzYAY = node.zzYAY();
            if (iZzYAY != 3) {
                if (iZzYAY != 6) {
                    return;
                }
                zzZm(node);
                section.getBody().zzY(section2.getBody().getFirstChild(), node.getParentNode().getPreviousSibling().getNextSibling(), null);
                return;
            }
            section.getBody().zzY(section2.getBody().getFirstChild(), node, null);
            Paragraph paragraph = new Paragraph(this.zzZG3);
            section.getBody().appendChild(paragraph);
            Paragraph paragraph2 = (Paragraph) node;
            while (paragraph2.hasChildNodes()) {
                paragraph.appendChild(paragraph2.getFirstChild());
            }
        }
    }

    private static void zzZl(Node node) {
        while (node.getParentNode().getNodeType() != 8) {
            CompositeNode parentNode = node.getParentNode();
            parentNode.getParentNode().zzZ(parentNode.getFirstChild(), (Node) null, parentNode.getNextSibling());
            parentNode.remove();
        }
    }

    private void zzZm(Node node) {
        if (zzZj(node)) {
            Paragraph paragraph = node.getNodeType() == 8 ? (Paragraph) node : (Paragraph) com.aspose.words.internal.zzZKW.zzZ(node.getAncestor(8), Paragraph.class);
            Paragraph paragraph2 = paragraph != null ? new Paragraph(this.zzZG3, (zzYMX) paragraph.zzZYj().zzbn(), (zzYEF) paragraph.zzYp5().zzbn()) : new Paragraph(this.zzZG3, (zzYMX) this.zzYyZ.zzZ9t().zzbn(), (zzYEF) this.zzYyZ.zzZ9u().zzbn());
            this.zzYyZ.zzZ9t().zzY(paragraph2.zzZYj());
            int iZzYAY = node.zzYAY();
            if (iZzYAY == 3) {
                Paragraph paragraph3 = (Paragraph) node;
                node.zzYC(paragraph2);
                while (paragraph3.hasChildNodes()) {
                    paragraph2.appendChild(paragraph3.getFirstChild());
                }
                return;
            }
            if (iZzYAY != 6) {
                return;
            }
            Paragraph parentParagraph = ((Run) node).getParentParagraph();
            parentParagraph.zzYC(paragraph2);
            zzY81 zzy81 = new zzY81(this.zzZG3);
            try {
                paragraph2.zzZ(parentParagraph.getFirstChild(), node, (Node) null);
            } finally {
                zzy81.dispose();
            }
        }
    }

    private int zzZn(Node node) throws Exception {
        if (!this.zzYyZ.getIgnoreStructuredDocumentTags() && node.getNodeType() == 28) {
            zzU((StructuredDocumentTag) node);
        }
        zzZNY zzzny = new zzZNY(node, this.zzYyZ);
        this.zzYz3 = zzzny;
        int length = zzzny.zzYAc().getLength();
        int iZzZn = 0;
        if (length != 0) {
            if (!zzZ9z() || com.aspose.words.internal.zzZKN.zzZ(this.zzYz0.toString(), zzYyY) == -1) {
                iZzZn = zzZT(this.zzYz3.zzYAc().zz0T(), 0);
            } else {
                int iZzZT = 0;
                int i = 0;
                while (iZzZn < this.zzYz3.zzZ9x().getCount()) {
                    int i2 = this.zzYz3.zzZ9x().get(iZzZn);
                    iZzZT += zzZT(this.zzYz3.zzYAc().substring(i, (i2 - i) + 1), i);
                    i = i2 + 1;
                    iZzZn++;
                }
                iZzZn = iZzZT;
            }
        }
        if (this.zzYz3.zzZ9y().size() != 0) {
            ArrayList<Node> arrayListZzZ9y = this.zzYz3.zzZ9y();
            zzZB(arrayListZzZ9y);
            Iterator<Node> it = arrayListZzZ9y.iterator();
            while (it.hasNext()) {
                iZzZn += zzZn(it.next());
            }
        }
        return iZzZn;
    }

    private static boolean zzZq(char c) {
        switch (c) {
            case 57357:
            case 57359:
            case 57360:
            case 57369:
                return true;
            default:
                return false;
        }
    }

    private void zzw(int i, String str) throws Exception {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (zzZq(cCharAt)) {
                if (sb.length() > 0) {
                    zzXy(i, sb.length());
                }
                zzS(sb.length() + i, cCharAt);
                int length = sb.length() + 1 + i;
                sb.setLength(0);
                i = length;
            } else {
                sb.append(cCharAt);
            }
        }
        if (sb.length() > 0) {
            zzXy(i, sb.length());
        }
    }

    private void zzx(int i, String str) {
        Node nodeZztx = this.zzYz3.zztx(i);
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (zzZq(cCharAt)) {
                if (sb.length() > 0) {
                    nodeZztx = zzZ(nodeZztx, sb.toString(), i);
                    sb.setLength(0);
                }
                zzZ(nodeZztx, cCharAt);
            } else {
                sb.append(cCharAt);
            }
        }
        if (sb.length() > 0) {
            zzZ(nodeZztx, sb.toString(), i);
        }
    }

    public final int zzZ9D() throws Exception {
        zzY81 zzy81 = new zzY81(this.zzZG3, 1);
        try {
            zzY82 zzy82 = new zzY82(this.zzZG3);
            try {
                return zzZn(this.zzYz2);
            } finally {
                zzy82.dispose();
            }
        } finally {
            zzy81.dispose();
        }
    }

    public zzZNZ(Node node, com.aspose.words.internal.zzZNR zzznr, String str, FindReplaceOptions findReplaceOptions) {
        this.zzYyZ = findReplaceOptions;
        this.zzYz2 = node;
        this.zzZG3 = node.getDocument();
        String strZzLq = zzLq(zzznr.toString());
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzLq)) {
            throw new IllegalArgumentException("The search string cannot be null or empty.");
        }
        this.zzYz0 = new com.aspose.words.internal.zzZNR(strZzLq, zzznr.getOptions());
        this.zzYz1 = zzLq(str);
    }

    private static void zzZ(ArrayList<Node> arrayList, int i, int i2, ArrayList<Node> arrayList2) {
        while (i <= i2) {
            if (arrayList.get(i).getNodeType() != 4) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, arrayList.get(i));
            }
            i++;
        }
    }

    private Node zzZ(Node node, String str, int i) {
        zzYEF zzyef;
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam != null) {
            zzyef = (zzYEF) zzzam.getRunPr_IInline().zzbn();
            this.zzYyZ.zzZ9u().zzY(zzyef);
            if (this.zzYyZ.zzZ9u().contains(160) && !this.zzYyZ.zzZ9u().contains(500)) {
                zzyef.remove(500);
            }
        } else {
            zzyef = (zzYEF) this.zzYyZ.zzZ9u().zzbn();
        }
        if (zzLr(str)) {
            zzyef.zzQ(StyleIdentifier.BIBLIOGRAPHY, zzZU.zzZF6);
        }
        if (node.getNodeType() == 21) {
            zzY81 zzy81 = new zzY81(this.zzZG3);
            try {
                Run run = (Run) node.zzYD(node.deepClone(false));
                Run run2 = (Run) node;
                run2.setText(str);
                run2.zzZ(zzyef);
                zzy81.dispose();
                if (this.zzZG3.zzZqp()) {
                    zzYJ4.zzX(run2, this.zzZG3.zzYBa().zzZqs());
                }
                this.zzYz3.zzZ(i, i, run);
                return run;
            } catch (Throwable th) {
                zzy81.dispose();
                throw th;
            }
        }
        Run run3 = new Run(this.zzZG3, str, zzyef);
        if (node.zzYAY() == 6) {
            node.zzYC(run3);
            return node;
        }
        if (node.getNodeType() == 8) {
            ((Paragraph) node).appendChild(run3);
        }
        return node;
    }

    private void zzZ(Node node, char c) {
        if (c == 57357) {
            zzZm(node);
        } else {
            if (c != 57359) {
                return;
            }
            zzZk(node);
        }
    }

    private static com.aspose.words.internal.zzZNR zzZ(String str, FindReplaceOptions findReplaceOptions) {
        return new com.aspose.words.internal.zzZNR(com.aspose.words.internal.zzZNR.zzUU(str).replace("\"", "[\"“”]"), findReplaceOptions.getMatchCase() ? 0 : 66);
    }
}
