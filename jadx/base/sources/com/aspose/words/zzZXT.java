package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZXT extends zzYVB implements zzZA0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("txbxContent");
    private HashMap<String, byte[]> zzYOM;
    private ArrayList<Integer> zzYON;
    private ArrayList<zzZYK> zzYOO;
    private zzZXG zzYOP;
    private com.aspose.words.internal.zzD3<Comment> zzYOQ;
    private com.aspose.words.internal.zzZQC<zzZW1> zzYOR;
    private zzZX3 zzYOS;
    private zzZWG zzYOT;
    private com.aspose.words.internal.zz77 zzYOU;
    private com.aspose.words.internal.zz78 zzYOV;
    private zzZWV zzYOW;
    private zzYMH zzYOX;
    private zzZW1 zzYP4;

    public zzZXT(com.aspose.words.internal.zz78 zz78Var, com.aspose.words.internal.zz77 zz77Var, DocumentBase documentBase, LoadOptions loadOptions, zzYO3 zzyo3, zzZWG zzzwg, zzZWH zzzwh, zzZX3 zzzx3, zzZWM zzzwm) throws Exception {
        super(documentBase, loadOptions, 9, zzyo3, zzzwh, zzzwm);
        this.zzYOR = new com.aspose.words.internal.zzZQC<>();
        this.zzYOQ = new com.aspose.words.internal.zzD3<>();
        this.zzYOO = new ArrayList<>();
        this.zzYON = new ArrayList<>();
        this.zzYOM = new HashMap<>();
        this.zzYOV = zz78Var;
        this.zzYOU = zz77Var;
        this.zzYOT = zzzwg;
        this.zzYOS = zzzx3;
        this.zzYP4 = new zzZW1(this.zzYOU, loadOptions.getWarningCallback(), 9, zzyo3);
        this.zzYOX = new zzYMH();
    }

    private com.aspose.words.internal.zz77 zzNQ(String str) {
        String strZzY9 = zzY9(str);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzY9)) {
            return this.zzYOV.zzYe(strZzY9);
        }
        return null;
    }

    private static boolean zzU(com.aspose.words.internal.zz77 zz77Var) throws Exception {
        if (zz77Var == null || "application/xml".equals(zz77Var.getContentType()) || "xml".equals(zz77Var.zzxl())) {
            return false;
        }
        return "application/octet-stream".equals(zz77Var.getContentType()) || zz77Var.zzR1().getLength() != 0;
    }

    private static void zzX(Paragraph paragraph, Paragraph paragraph2) {
        paragraph.zzZYj().zzZ(paragraph2.zzZYj(), zzYMX.zzXGZ);
        if (paragraph.zzZYj().zzS(zzYMX.zzXGZ)) {
            paragraph.zzZYj().zzZ(paragraph2.zzZYj(), zzYMX.zzXGY);
        }
    }

    private void zzY(List list) {
        Style styleZzZ8 = getDocument().getStyles().zzZ8(list.zzYPa().zzYOO(), false);
        if (styleZzZ8 == null || styleZzZ8.getType() != 4 || styleZzZ8.zzZ7j() == 12) {
            return;
        }
        List listByListId = getDocument().getLists().getListByListId(styleZzZ8.zzZYj().getListId());
        if (zzZ(listByListId) == null) {
            styleZzZ8.zzZYj().zzxC(list.getListId());
        }
        if (listByListId == null || listByListId.zzYPa().zzYOO() != 12) {
            return;
        }
        list.zzYPa().zzxh(12);
    }

    private void zzZmb() {
        Iterator<Table> it = this.zzXUk.iterator();
        while (it.hasNext()) {
            it.next().zzY0e();
        }
    }

    private void zzZmm() {
        this.zzYOX.zzYoa();
        this.zzYOX.zzYo9();
    }

    private void zzZmn() throws Exception {
        if (this.zzYOO.size() > 0) {
            getDocument().getStyles().ensureMinimum();
            for (int i = 0; i < this.zzYOO.size(); i++) {
                zzZYK zzzyk = this.zzYOO.get(i);
                Document documentZzZn2 = zzzyk.zzZn2();
                CompositeNode compositeNodeZzZn3 = zzzyk.zzZn3();
                Node nodeZzZpv = zzzyk.zzZpv();
                int iZzZn1 = zzzyk.zzZn1();
                boolean zIsInline = zzzyk.isInline();
                CompositeNode parentNode = compositeNodeZzZn3.getParentNode();
                boolean zZzA = (parentNode == null || parentNode.getNodeType() != 3) ? false : com.aspose.words.internal.zzZKO.zzA(((Body) parentNode).getFirstChild(), compositeNodeZzZn3);
                if (zZzA || documentZzZn2.getSections().getCount() > 1) {
                    zzY(documentZzZn2, compositeNodeZzZn3, iZzZn1);
                }
                if (zIsInline) {
                    zzZ(documentZzZn2, compositeNodeZzZn3, nodeZzZpv);
                } else {
                    zzZ(documentZzZn2, compositeNodeZzZn3, iZzZn1);
                }
                if (zZzA && documentZzZn2.getSections().getCount() > 1) {
                    zzX(documentZzZn2, compositeNodeZzZn3, iZzZn1);
                }
                getDocument().zzZq2().zzX(documentZzZn2.zzZq2());
                compositeNodeZzZn3.remove();
                zzZ(1, 9, "The altChunk is replaced with its content.");
            }
            this.zzYOO.clear();
        }
    }

    private void zzZmo() {
        Iterator<List> it = getDocument().getLists().iterator();
        while (it.hasNext()) {
            zzY(it.next());
        }
    }

    public final void endSection() {
        if (zzYz7().getNodeType() == 3) {
            zztj(3);
            ((Section) zzYz7()).zzY(this.zzXUi.getCount() > 0 ? this.zzXUi : zzYyV());
            zztj(2);
        }
    }

    @Override // com.aspose.words.zzYVB
    public final Comment zzFw(int i) {
        return this.zzYOQ.get(i);
    }

    public final zzUS zzFx(int i) {
        return this.zzYOX.zzFx(i);
    }

    public final void zzIh() throws Exception {
        zzZXI.zzE(this);
        zzZWL.zzE(this);
        zzZW4.zzE(this);
        this.zzYOT.zzE(this);
        this.zzYOS.zzE(this);
        zzZWZ.zzE(this);
        zzZYA.zzE(this);
        zzZY8.zzE(this);
        zzZY9.zzE(this);
        zzZY7.zzE(this);
        this.zzYOP = new zzZXG(this);
        zzZmu();
        Iterator<Style> it = getDocument().getStyles().iterator();
        while (it.hasNext()) {
            zzZMI.zzV(it.next());
        }
        zzZmm();
        zzYze();
        zzYzd();
        zzYzc();
        zzYza();
        zzZmn();
        getDocument().getLists().zzYOU();
        zzZmo();
        zzYz2();
        zzZmb();
        zzYzb();
        getDocument().getLists().zzYOV();
        zzYz1();
    }

    public final void zzJ(DocumentBase documentBase) {
        zzT(new Paragraph(documentBase));
        zzYUN.zzM(this, new zzYEF());
        zztj(8);
    }

    public final void zzK(DocumentBase documentBase) {
        if (zzYz7().getNodeType() != 3) {
            zzT(new Section(documentBase));
            zzT(new Body(documentBase));
        }
    }

    public final void zzL(DocumentBase documentBase) throws Exception {
        zzZ3Z zzz3z = new zzZ3Z(documentBase, zzYyZ());
        zzK(documentBase);
        String localName = this.zzYP4.getLocalName();
        while (this.zzYP4.zzQ(localName)) {
            zzz3z.zzW(this.zzYP4.zz5(), false);
            if ("sectPr".equals(this.zzYP4.getLocalName())) {
                zzSA(true);
            } else {
                zzZWW.zzZl2().zzF(this);
            }
        }
        if (this.zzYP4.zzYyz().length() > 0) {
            zzJ(getDocument());
        }
    }

    public final boolean zzNI(String str) throws Exception {
        return zzU(zzNQ(str));
    }

    public zzZW1 zzNJ(String str) throws Exception {
        return zzY(this.zzYOU, str);
    }

    public final zzZW1 zzNK(String str) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzYd = zzYd(zzY9(str));
        this.zzYOR.push(this.zzYP4);
        zzZW1 zzzw1 = new zzZW1(zz77VarZzYd, this.zzYP4.getWarningCallback(), 9, zzZqn());
        this.zzYP4 = zzzw1;
        return zzzw1;
    }

    public final boolean zzNL(String str) {
        return this.zzYP4.zzZmN().zzxn().zzY7(str).isExternal();
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzNM(String str) {
        com.aspose.words.internal.zz75 zz75VarZzY7 = this.zzYP4.zzZmN().zzxn().zzY7(str);
        return zz75VarZzY7 == null || zz75VarZzY7.isExternal();
    }

    public final byte[] zzNN(String str) {
        com.aspose.words.internal.zz77 zz77VarZzNQ = zzNQ(str);
        if (zz77VarZzNQ == null) {
            return null;
        }
        return com.aspose.words.internal.zzZYQ.zzZX(zz77VarZzNQ.zzR1());
    }

    @Override // com.aspose.words.zzZ8W
    public byte[] zzNO(String str) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzNQ = zzNQ(str);
        String name = zz77VarZzNQ == null ? "" : zz77VarZzNQ.getName();
        byte[] bArr = (byte[]) com.aspose.words.internal.zzQW.zzZ(this.zzYOM, name);
        if (bArr != null) {
            return bArr;
        }
        Ref<String> ref = new Ref<>(null);
        byte[] bArrZzZ = zzZ(zz77VarZzNQ, ref);
        ref.get();
        com.aspose.words.internal.zzZQF.zzY(this.zzYOM, name, bArrZzZ);
        return bArrZzZ;
    }

    @Override // com.aspose.words.zzZ8W
    public final zzZBL zzNP(String str) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzNQ = zzNQ(str);
        if (zz77VarZzNQ == null) {
            return null;
        }
        zz77VarZzNQ.zzR1().zzH(0L);
        return com.aspose.words.internal.zzKD.zzM(zz77VarZzNQ.zzR1()) ? new zzYOC(new com.aspose.words.internal.zzKD(zz77VarZzNQ.zzR1()).zzIf()) : new zzYO2(zz77VarZzNQ.zzR1(), zz77VarZzNQ.getContentType(), zz77VarZzNQ.getName());
    }

    public final void zzQ(int i, int i2, boolean z) {
        this.zzYOX.zzQ(i, i2, z);
    }

    @Override // com.aspose.words.zzYVB
    public final void zzT(Comment comment) {
        if (this.zzYOQ.zzVE(comment.getId())) {
            return;
        }
        this.zzYOQ.add(comment.getId(), comment);
    }

    @Override // com.aspose.words.zzYVB
    public final Footnote zzXR(int i, int i2) {
        return this.zzYOP.zzXR(i, i2);
    }

    public final void zzXS(int i, int i2) {
        this.zzYOX.zzXS(i, i2);
    }

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    public String zzY9(String str) {
        return this.zzYP4.zzZmN().zzY9(str);
    }

    public final com.aspose.words.internal.zz77 zzYd(String str) {
        return this.zzYOV.zzYd(str);
    }

    public final com.aspose.words.internal.zz77 zzYe(String str) {
        return this.zzYOV.zzYe(str);
    }

    public final void zzZ(int i, Paragraph paragraph) {
        boolean z = paragraph.getAncestor(19) != null;
        if (z) {
            i = this.zzYOX.zzqo(i);
        }
        paragraph.zzqu(i);
        if (z) {
            this.zzYOX.zzY(i, paragraph);
        }
    }

    public final ArrayList<zzZYK> zzZmc() {
        return this.zzYOO;
    }

    public final ArrayList<Integer> zzZmd() {
        return this.zzYON;
    }

    public final com.aspose.words.internal.zz77 zzZme() {
        return this.zzYOU;
    }

    public final com.aspose.words.internal.zz78 zzZmf() {
        return this.zzYOV;
    }

    @Override // com.aspose.words.zzZA0
    public final ShapeBase zzZmg() throws Exception {
        return new zz8I().zzt(this);
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmh() {
        return true;
    }

    public final zzZW1 zzZmi() {
        zzZW1 zzzw1Pop = this.zzYOR.size() > 0 ? this.zzYOR.pop() : null;
        this.zzYP4 = zzzw1Pop;
        return zzzw1Pop;
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmj() {
        throw new IllegalStateException("Not expected to call this.");
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmk() {
        throw new IllegalStateException("Not expected to call this.");
    }

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    public final void zzZml() {
    }

    public final zzZWV zzZmp() {
        if (this.zzYOW == null) {
            this.zzYOW = new zzZWV(zzZqn().zzYr9());
        }
        return this.zzYOW;
    }

    public abstract void zzZmu() throws Exception;

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    public final zzYU4 zzZsD() {
        return this.zzYP4;
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzs(ShapeBase shapeBase) throws Exception {
        while (this.zzYP4.zzQ("textbox")) {
            if (zzUR.zzTP(this.zzYP4.getLocalName()) != 0) {
                this.zzYP4.zzk();
            } else {
                this.zzXUm.zzY4h();
                zzZWW.zzZl2();
                zzQ(shapeBase);
                this.zzXUm.zzY4g();
            }
        }
        return false;
    }

    private static void zzX(Document document, CompositeNode compositeNode, int i) throws Exception {
        zzZ(document.getLastSection().getHeadersFooters(), (Section) compositeNode.getAncestor(2), new NodeImporter(document, compositeNode.getDocument(), i), true);
    }

    private List zzZ(List list) {
        while (list != null) {
            if (list.getStyle() != null) {
                List listByListId = getDocument().getLists().getListByListId(list.getStyle().zzZYj().getListId());
                if (listByListId == null) {
                    return null;
                }
                if (listByListId.getListId() != list.getListId()) {
                    list = listByListId;
                }
            }
            return list;
        }
        return null;
    }

    public final zzZW1 zzX(String str, Map<String, String> map) {
        return zzZ(new zzZW1(this.zzYP4.zzZmN(), zzZqn(), str, map));
    }

    private static void zzY(Document document, CompositeNode compositeNode, int i) throws Exception {
        NodeImporter nodeImporter = new NodeImporter(document, compositeNode.getDocument(), i);
        Section section = (Section) compositeNode.getAncestor(2);
        if (document.getFirstSection().getHeadersFooters().getCount() > 0) {
            zzZ(document.getFirstSection().getHeadersFooters(), section, nodeImporter, true);
        }
        if (document.getSections().getCount() <= 1 || section.getNextSibling() == null) {
            return;
        }
        NodeImporter nodeImporter2 = new NodeImporter(compositeNode.getDocument(), document, i);
        Section section2 = (Section) section.getNextSibling();
        for (Section section3 : document.getSections()) {
            if (!section3.zzYVf() && !section3.zzYB3()) {
                zzZ(section2.getHeadersFooters(), section3, nodeImporter2, false);
            }
        }
    }

    private static void zzZ(Document document, CompositeNode compositeNode, Node node) throws Exception {
        Paragraph paragraph;
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(compositeNode.zzYB9(), Paragraph.class);
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(compositeNode.zzYB9(), StructuredDocumentTag.class);
        zzZ(document, compositeNode, 0);
        if (paragraph2 != null) {
            Paragraph paragraph3 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph2.zzYB4(), Paragraph.class);
            if (paragraph3 != null) {
                zzX(paragraph2, paragraph3);
            }
            paragraph2.getParagraphFormat().clearFormatting();
            if (paragraph3 != null) {
                paragraph2.zzZ((zzYMX) paragraph3.zzZYj().zzbn());
                paragraph2.zzC((zzYEF) paragraph3.zzYp5().zzbn());
                while (paragraph3.hasChildNodes()) {
                    paragraph2.insertAfter(paragraph3.getLastChild(), node);
                }
                paragraph2.zzY(paragraph2.getNextSibling(), paragraph3, node);
                paragraph3.remove();
            }
        }
        if (structuredDocumentTag == null || (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(structuredDocumentTag.getParentNode().zzYB4(), Paragraph.class)) == null) {
            return;
        }
        while (paragraph.hasChildNodes()) {
            structuredDocumentTag.insertAfter(paragraph.getLastChild(), node);
        }
        structuredDocumentTag.zzY(structuredDocumentTag.getParentNode().getNextSibling(), paragraph, node);
        Paragraph paragraph4 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(structuredDocumentTag.getParentNode(), Paragraph.class);
        if (paragraph4 != null && paragraph.zzqy(0).getType() == 1) {
            paragraph4.getParagraphFormat().setStyle(paragraph.zzqy(0));
        }
        paragraph.remove();
    }

    public final zzZW1 zzY(com.aspose.words.internal.zz77 zz77Var, String str) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzZ(zz77Var, str);
        if (zz77VarZzZ == null) {
            return null;
        }
        return zzZ(new zzZW1(zz77VarZzZ, zzYyZ().getWarningCallback(), 9, zzZqn()));
    }

    private static void zzZ(Document document, CompositeNode compositeNode, int i) throws Exception {
        Body body = document.getLastSection().getBody();
        body.ensureMinimum();
        zzYWJ.zzZ(new zzYWB(document.getFirstSection().getBody().getFirstChild(), body.getLastChild()), compositeNode, new zzZSB(document, compositeNode.getDocument(), i), (zzZA5) null, 0);
    }

    private static void zzZ(HeaderFooterCollection headerFooterCollection, Section section, NodeImporter nodeImporter, boolean z) throws Exception {
        Iterator<T> it = headerFooterCollection.iterator();
        while (it.hasNext()) {
            HeaderFooter headerFooter = (HeaderFooter) it.next();
            HeaderFooter headerFooter2 = (HeaderFooter) nodeImporter.importNode(headerFooter, true);
            HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(headerFooter.getHeaderFooterType());
            if (byHeaderFooterType == null) {
                section.getHeadersFooters().add(headerFooter2);
            } else if (z) {
                byHeaderFooterType.appendParagraph("");
                nodeImporter.zzY(headerFooter, byHeaderFooterType);
            } else {
                byHeaderFooterType.prependChild(new Paragraph(byHeaderFooterType.getDocument()));
                while (headerFooter2.hasChildNodes()) {
                    byHeaderFooterType.prependChild(headerFooter2.getLastChild());
                }
            }
        }
    }

    private byte[] zzZ(com.aspose.words.internal.zz77 zz77Var, Ref<String> ref) throws Exception {
        byte[] bArrZzDL;
        ref.set("");
        if (zzU(zz77Var)) {
            if (zzYyZ().getConvertMetafilesToPng() && com.aspose.words.internal.zzEF.zzVW(com.aspose.words.internal.zzKE.zzZT(zz77Var.zzxl()))) {
                com.aspose.words.internal.zzEG zzegZzc = com.aspose.words.internal.zzEF.zzc(com.aspose.words.internal.zzSJ.zzQ(zz77Var.zzR1()));
                long jZzG = com.aspose.words.internal.zzZPW.zzG((float) zzegZzc.getHorizontalResolution(), (float) zzegZzc.getVerticalResolution());
                ref.set("image/png");
                zz77Var.zzR1().zzH(0L);
                com.aspose.words.internal.zzZOP zzzopZzQ = com.aspose.words.internal.zzSJ.zzQ(zz77Var.zzR1());
                try {
                    bArrZzDL = com.aspose.words.internal.zzXM.zzZ(zzzopZzQ, jZzG, null);
                } finally {
                    if (zzzopZzQ != null) {
                        zzzopZzQ.close();
                    }
                }
            } else {
                ref.set(zz77Var.getContentType());
                zz77Var.zzR1().zzH(0L);
                if ("image/x-pcz".equals(ref.get())) {
                    bArrZzDL = zzY23.zzXE(com.aspose.words.internal.zzZYQ.zzZX(zz77Var.zzR1()));
                } else if (com.aspose.words.internal.zzEF.zzt(zz77Var.zzR1())) {
                    zz77Var.zzR1().zzH(0L);
                    com.aspose.words.internal.zzEG zzegZzc2 = com.aspose.words.internal.zzEF.zzc(zz77Var.zzR1());
                    zz77Var.zzR1().zzH(0L);
                    bArrZzDL = com.aspose.words.internal.zzEF.zzZ(zz77Var.zzR1(), zzegZzc2);
                } else {
                    bArrZzDL = com.aspose.words.internal.zzZYQ.zzZX(zz77Var.zzR1());
                }
            }
        } else {
            bArrZzDL = com.aspose.words.internal.zzEF.zzDL();
        }
        return zzY0(bArrZzDL);
    }

    public final zzZW1 zzZ(zzZW1 zzzw1) {
        this.zzYOR.push(this.zzYP4);
        this.zzYP4 = zzzw1;
        return zzzw1;
    }

    public final com.aspose.words.internal.zz77 zzZ(com.aspose.words.internal.zz77 zz77Var, String str) {
        return this.zzYOV.zzZ(zz77Var, str);
    }

    public final void zzZ(zzZYK zzzyk) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYOO, zzzyk);
    }
}
