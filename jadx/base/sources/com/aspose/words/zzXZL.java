package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18293o1;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZL extends DocumentVisitor {
    private zzXZ7 zzWSV;
    private boolean zzWSW;
    private boolean zzWT3;
    private boolean zzWT4;
    private double[] zzWT5;
    private zzXZA zzWT6;
    private int zzWT7;
    private int zzWT8;
    private com.aspose.words.internal.zz77 zzWT9;
    private zzXZN zzWTa;
    private Table zzXBR;
    private int zzY64;
    private Section zzYOx;
    private zzYDW zzYTo;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzZWT zzmY;
    private com.aspose.words.internal.zzZQC<zzXZN> zzYOC = new com.aspose.words.internal.zzZQC<>();
    private ArrayList<zzXZA> zzWT2 = new ArrayList<>();
    private ArrayList<zzXZG> zzWT1 = new ArrayList<>();
    private HashMap<Integer, Integer> zzWT0 = new HashMap<>();
    private ArrayList<String> zzWSZ = new ArrayList<>();
    private ArrayList<zzY> zzWSY = new ArrayList<>();
    private ArrayList<zzX> zzWSX = new ArrayList<>();
    private com.aspose.words.internal.zzZQC<FieldStart> zzXqB = new com.aspose.words.internal.zzZQC<>();
    private zzXZB zzWSU = new zzXZB(this);

    public static class zzX {
        private int zzX4n;
        private int zzXRZ;
        private boolean zzYlb;
        private ShapeBase zzZBi;

        public zzX(ShapeBase shapeBase, int i, int i2, boolean z) {
            this.zzZBi = shapeBase;
            this.zzX4n = i;
            this.zzXRZ = i2;
            this.zzYlb = z;
        }

        public final int getColumn() {
            return this.zzXRZ;
        }

        public final int getRow() {
            return this.zzX4n;
        }

        public final void setRow(int i) {
            this.zzX4n = i;
        }

        public final ShapeBase zz7u() {
            return this.zzZBi;
        }

        public final boolean zzEE() {
            return this.zzYlb;
        }
    }

    public static class zzY {
        private int zzX4n;
        private int zzXRZ;
        private int zzWSN = 1;
        private int zzYlk = 1;

        public zzY(int i, int i2) {
            this.zzX4n = i;
            this.zzXRZ = i2;
        }

        public final int getColumn() {
            return this.zzXRZ;
        }

        public final int getColumnCount() {
            return this.zzYlk;
        }

        public final int getRow() {
            return this.zzX4n;
        }

        public final int getRowCount() {
            return this.zzWSN;
        }

        public final void setColumnCount(int i) {
            this.zzYlk = i;
        }

        public final void setRowCount(int i) {
            this.zzWSN = i;
        }

        public final String zzZAT() {
            return zzXZL.zzx(this.zzX4n, this.zzXRZ, (this.zzWSN + r0) - 1, (this.zzYlk + r1) - 1);
        }
    }

    public static class zzZ {
        private boolean zzWSR;
        private String zzWSS;
        private String zzWST;
        static zzZ zzWSQ = new zzZ("s", null);
        static zzZ zzWSP = new zzZ(BackupFile.PREFIX_NOTE_DIR, null);
        static zzZ zzWSO = new zzZ(null, null);

        public zzZ(String str, String str2) {
            this(str, str2, false);
        }

        public final String getDataType() {
            return this.zzWST;
        }

        public final boolean zzXRb() {
            return this.zzWSR;
        }

        public final String zzXRc() {
            return this.zzWSS;
        }

        public zzZ(String str, String str2, boolean z) {
            this.zzWST = str;
            this.zzWSS = str2;
            this.zzWSR = z;
        }
    }

    public zzXZL(zzXZ7 zzxz7, com.aspose.words.internal.zzZWT zzzwt, IWarningCallback iWarningCallback) {
        this.zzWSV = zzxz7;
        this.zzmY = zzzwt;
        this.zzZG0 = iWarningCallback;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    private boolean isInFieldCode() {
        return this.zzXqB.size() > this.zzWSW;
    }

    private void zzC(CompositeNode compositeNode) throws Exception {
        this.zzWT8 = 0;
        zzXZN zzxzn = this.zzWTa;
        zzxzn.zzY("sheets");
        this.zzYOx = (Section) compositeNode.getFirstChild();
        while (this.zzYOx != null) {
            zzyo(zzXRs());
            this.zzYOx = (Section) this.zzYOx.getNextSibling();
            this.zzWT8++;
        }
        zzxzn.zzo();
    }

    private void zzG(int i, String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 1, 27, str);
        }
    }

    private void zzPv(boolean z) {
        int i = this.zzY64;
        int i2 = (!z ? 1 : 0) + i;
        for (zzX zzx : this.zzWSX) {
            if (!zzx.zzEE() && zzx.getRow() >= i) {
                this.zzY64 = i2;
                zzx.setRow(i2);
                i2++;
                zzVP(zzx.zz7u().getHeight() + 1.5d);
                this.zzWTa.zzo();
            }
        }
    }

    private static boolean zzU(HeaderFooter headerFooter) {
        Node nodeZzZYr;
        if (headerFooter == null || (nodeZzZYr = headerFooter.zzZYr()) == null) {
            return true;
        }
        return nodeZzZYr.getNodeType() == 8 && nodeZzZYr == headerFooter.zzZYq() && ((CompositeNode) nodeZzZYr).zzZYr() == null;
    }

    private void zzUU(int i, int i2) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzWSZ, zzx(this.zzY64, this.zzWT7, (i2 + r0) - 1, (i + r1) - 1));
    }

    private void zzUV(int i, int i2) {
        int size = this.zzWSY.size();
        for (int i3 = size - 1; i3 >= Math.max(size - 10, 0); i3--) {
            zzY zzy = this.zzWSY.get(i3);
            if (zzy.getRow() + zzy.getRowCount() == i && zzy.getColumn() == i2 && zzy.getColumnCount() == 1) {
                zzy.setRowCount(zzy.getRowCount() + 1);
                return;
            } else {
                if (zzy.getColumn() + zzy.getColumnCount() == i2 && zzy.getRow() == i && zzy.getRowCount() == 1) {
                    zzy.setColumnCount(zzy.getColumnCount() + 1);
                    return;
                }
            }
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzWSY, new zzY(i, i2));
    }

    private void zzVP(double d) {
        this.zzWTa.zzY("row");
        this.zzWTa.zzZj("r", this.zzY64 + 1);
        if (Double.isNaN(d)) {
            return;
        }
        this.zzWTa.zzO(TranslateLanguage.HAITIAN_CREOLE, d);
        this.zzWTa.zz0("customHeight", "1");
    }

    private double zzVQ(double d) {
        double dPointToPixel = com.aspose.words.internal.zzSA.pointToPixel(d) + 5.0d;
        return ((((dPointToPixel % 8.0d) + dPointToPixel) - 5.0d) * 0.9d) / (com.aspose.words.internal.zzSA.pointToPixel(zzXRe().zzXR8().getSize()) * 0.48d);
    }

    private static boolean zzW1(Node node) throws Exception {
        ImageData imageData;
        if (node != null && node.getNodeType() == 18 && (imageData = ((Shape) node).getImageData()) != null && imageData.zzZjT()) {
            byte[] imageBytes = imageData.getImageBytes();
            if (imageBytes.length == 8818 && com.aspose.words.internal.zzIL.zz3(imageBytes).hashCode() == 217815787) {
                return true;
            }
        }
        return false;
    }

    private void zzW2(Node node) throws Exception {
        boolean z = node.getNodeType() == 8;
        if (!z) {
            node.getNodeType();
        }
        Cell cell = !z ? (Cell) node : null;
        zzXZA zzxza = this.zzWT6;
        zzXZH zzxzhZzXR8 = zzxza != null ? zzxza.zzXQS().zzXR8() : zzXZH.zzY(cell.getFirstParagraph().getParagraphBreakFont(), this.zzWSV.getDocument());
        zzXZQ zzxzqZzXO = z ? zzXZQ.zzXO((Paragraph) node) : zzXZQ.zzf(cell);
        zzXZP zzxzpZzV = z ? zzXZP.zzWTd : zzXZP.zzV(cell.getCellFormat().getBorders());
        zzXZI zzxziZzL = z ? zzXZI.zzWSF : zzXZE.zzL(cell.getCellFormat().getShading());
        zzZ zzzZzY = zzY(this.zzWT6);
        int iZzZ = zzZ(new zzXZG(zzxzhZzXR8, zzxzqZzXO, zzxziZzL, zzxzpZzV, zzzZzY.zzXRc()));
        zzZ(zzzZzY);
        zzhq(iZzZ);
        zzY(zzzZzY);
        this.zzWTa.zzo();
        this.zzWT6 = null;
        if (!z) {
            if (cell.zz6G().getVerticalMerge() == 1) {
                this.zzWT0.put(Integer.valueOf(this.zzWT7), Integer.valueOf(iZzZ));
            }
            zzZ(cell, iZzZ, false);
        }
        if (z) {
            double[] dArr = this.zzWT5;
            if (dArr.length > 1) {
                zzUU(dArr.length, 1);
            }
        }
    }

    private void zzXM(Paragraph paragraph) throws Exception {
        zzVP(this.zzWT5.length > 1 ? zzXRl() : Double.NaN);
        zzXRi();
        zzW2(paragraph);
        this.zzWTa.zzo();
    }

    private boolean zzXN(Paragraph paragraph) throws Exception {
        boolean z;
        if (zzo(paragraph.zzYVe())) {
            z = this.zzWT3;
            this.zzWT3 = true;
        } else if (zzW1(paragraph.zzZYr())) {
            z = this.zzWT4;
            this.zzWT4 = true;
        } else {
            z = false;
        }
        if (!z || paragraph.zzZYr() != paragraph.zzZYq()) {
            return false;
        }
        this.zzY64--;
        zzYDW zzydw = this.zzYTo;
        if (zzydw != null) {
            zzydw.zzYd0();
        }
        return true;
    }

    private XlsxSaveOptions zzXRd() {
        return (XlsxSaveOptions) this.zzWSV.zzZqS().zzXpa;
    }

    private String zzXRh() {
        return zzXZ8.zzUS(this.zzY64, this.zzWT7);
    }

    private void zzXRi() {
        this.zzWTa.zzY("c");
        this.zzWTa.zz0("r", zzXRh());
    }

    private void zzXRj() throws Exception {
        zzo("sharedStrings.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sharedStrings");
        zzXZN zzxzn = this.zzWTa;
        zzxzn.zzZ("sst");
        zzxzn.zz0("xmlns", zzXZF.zzZlD());
        zzxzn.zzZj(C18293o1.f55803f, this.zzWT2.size());
        zzxzn.zzZj("uniqueCount", this.zzWT2.size());
        Iterator<zzXZA> it = this.zzWT2.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
        this.zzWTa.endDocument();
        zzZlX();
    }

    private String zzXRk() throws Exception {
        return zzo(com.aspose.words.internal.zzZKN.format("worksheets/sheet{0}.xml", Integer.valueOf(this.zzWT8 + 1)), "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet");
    }

    private double zzXRl() {
        StringBuilder sb = new StringBuilder();
        this.zzWT6.zzv(sb);
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(sb.toString().replace(IOUtils.LINE_SEPARATOR_WINDOWS, "\r"), ControlChar.PARAGRAPH_BREAK_CHAR);
        zzXZH zzxzhZzXR8 = this.zzWT6.zzXQS().zzXR8();
        zzXZH zzxzhZzXR82 = zzxzhZzXR8;
        for (zzXZD zzxzd : this.zzWT6.zzXQT()) {
            if (zzxzd.zzXR8().getSize() > zzxzhZzXR82.getSize()) {
                zzxzhZzXR82 = zzxzd.zzXR8();
            }
        }
        double size = zzxzhZzXR8.getSize() * 0.5d;
        double dZzYRX = ((double) this.zzYOx.getPageSetup().zzYRX()) - ((4.7d * size) / 2.0d);
        int iCeil = 0;
        for (String str : strArrZzR) {
            iCeil += (int) Math.ceil((((double) str.length()) * size) / dZzYRX);
        }
        if (iCeil <= 1 && zzxzhZzXR82.equals(zzXRe().zzXR8())) {
            return Double.NaN;
        }
        double dZzZ = zzZ(zzxzhZzXR8);
        return (zzZ(zzxzhZzXR82) - dZzZ) + (((double) iCeil) * dZzZ);
    }

    private void zzXRm() {
        this.zzWTa.zzX("sheetFormatPr", "defaultRowHeight", com.aspose.words.internal.zzJB.zzZZ(zzZ(zzXRe().zzXR8())));
    }

    private void zzXRn() {
        zzXZN zzxzn = this.zzWTa;
        zzxzn.zzY("sheetViews");
        zzxzn.zzX("sheetView", "tabSelected", this.zzWT8 == 0 ? "1" : "0", "workbookViewId", "0");
        zzxzn.zzo();
    }

    private void zzXRo() throws Exception {
        if (this.zzWSX.size() == 0) {
            return;
        }
        this.zzWTa.zzX("drawing", "r:id", this.zzWSU.zzYQ(this.zzWSX));
    }

    private String zzXRp() {
        StringBuilder sb = new StringBuilder();
        for (zzY zzy : this.zzWSY) {
            if (sb.length() > 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, " ");
            }
            com.aspose.words.internal.zzZNH.zzU(sb, zzy.zzZAT());
        }
        return sb.toString();
    }

    private void zzXRq() {
        if (this.zzWSY.size() == 0) {
            return;
        }
        this.zzWTa.zzY("ignoredErrors");
        this.zzWTa.zzX("ignoredError", "sqref", zzXRp(), "numberStoredAsText", "1");
        this.zzWTa.zzo();
    }

    private void zzXRr() {
        if (this.zzWSZ.size() == 0) {
            return;
        }
        zzXZN zzxzn = this.zzWTa;
        zzxzn.zzY("mergeCells");
        zzxzn.zzZj(C18293o1.f55803f, this.zzWSZ.size());
        Iterator<String> it = this.zzWSZ.iterator();
        while (it.hasNext()) {
            zzxzn.zzX("mergeCell", "ref", it.next());
        }
        zzxzn.zzo();
    }

    private String zzXRs() throws Exception {
        String strZzXRk = zzXRk();
        zzXZN zzxzn = this.zzWTa;
        Section section = this.zzYOx;
        zzxzn.zzNU("worksheet");
        zzXRn();
        zzXRm();
        ArrayList<Node> arrayListZzy = zzy(this.zzYOx);
        this.zzWT5 = new zzXZM().zzA(arrayListZzy);
        this.zzWT0.clear();
        this.zzWSZ.clear();
        this.zzWSX.clear();
        this.zzWT4 = false;
        this.zzWT3 = false;
        zzY(zzxzn);
        zzxzn.zzY("sheetData");
        this.zzY64 = -1;
        this.zzWT7 = -1;
        for (Node node : arrayListZzy) {
            if (node.getNodeType() == 3) {
                this.zzYOx = (Section) node.getParentNode();
            }
            node.accept(this);
        }
        zzxzn.zzo();
        zzXRr();
        zzx(section);
        zzw(section);
        zzXRq();
        zzXRo();
        zzxzn.endDocument();
        zzZlX();
        return strZzXRk;
    }

    private void zzXRt() throws Exception {
        Document document = this.zzWSV.getDocument();
        this.zzYTo = new zzYDW(document, zzXRd(), 262144);
        zzXZN zzxzn = this.zzWTa;
        zzxzn.zzNU("workbook");
        if (zzXRd().getExportGeneratorName()) {
            zzxzn.zzU(com.aspose.words.internal.zzZKN.format(" Generated by {0} ", "Aspose.Words for Android via Java 24.3.0"));
        }
        zzC(document);
        zzxzn.endDocument();
        this.zzYTo.complete();
        this.zzYTo = null;
    }

    private com.aspose.words.internal.zz77 zzXRu() throws Exception {
        return this.zzWSV.zzZmf().zzZ(null, "/xl/workbook.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument");
    }

    private void zzXX(ShapeBase shapeBase) {
        zzG(1, "Shape format may lost when saving as XLSX.");
        zzXY(shapeBase);
    }

    private void zzXY(ShapeBase shapeBase) {
        if (shapeBase.getNodeType() == 18 && ((Shape) shapeBase).hasChart() && shapeBase.zzY9n() != null) {
            shapeBase = shapeBase.zzY9n();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzWSX, new zzX(shapeBase, this.zzY64, this.zzWT7, this.zzXBR != null));
    }

    private String zzY(com.aspose.words.internal.zz77 zz77Var, String str, String str2, String str3) throws Exception {
        Ref<String> ref = new Ref<>(null);
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzWSV.zzZmf().zzZ(zz77Var, str, str2, str3, ref);
        String str4 = ref.get();
        if (this.zzmY.zzoq()) {
            zz77VarZzZ.zz5(this.zzmY.zzor());
        }
        zzZ(new zzXZN(zz77VarZzZ, zzXRd().getPrettyFormat(), this.zzZG0));
        return str4;
    }

    private void zzZ(zzXZN zzxzn) {
        this.zzYOC.push(this.zzWTa);
        this.zzWTa = zzxzn;
    }

    private static int zzb(double d, double d2) {
        if (d > d2) {
            d2 = d;
            d = d2;
        }
        return zzXZK.zza(d, d2);
    }

    private void zze(Cell cell) {
        int iZzW = zzWI.zzW(cell);
        int i = 1;
        if (cell.zz6G().getVerticalMerge() == 1) {
            int iZzV = zzWI.zzV(cell);
            Row nextRow = cell.getParentRow().getNextRow();
            while (nextRow != null) {
                Cell cellZzY = zzWI.zzY(nextRow, iZzV);
                if (cellZzY == null || cellZzY.zz6G().getVerticalMerge() != 2 || cellZzY.zz6G().getHorizontalMerge() == 2) {
                    break;
                }
                int iZzW2 = zzWI.zzW(cellZzY);
                if (iZzW2 < iZzW) {
                    iZzW = iZzW2;
                }
                nextRow = nextRow.getNextRow();
                i++;
            }
        }
        zzUU(iZzW, i);
    }

    private void zzhq(int i) {
        if (i != 0) {
            this.zzWTa.zzZj("s", i);
        }
    }

    private static boolean zzo(Run run) {
        return run != null && run.getParentNode().getParentNode().getNodeType() == 4 && com.aspose.words.internal.zzZYD.zzg(run.getText(), "Created with an evaluation copy of Aspose.Words");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzx(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return zzXZ8.zzUS(i, i2);
        }
        return zzXZ8.zzUS(i, i2) + C18241k5.f55433h + zzXZ8.zzUS(i3, i4);
    }

    private ArrayList<Node> zzy(Section section) {
        ArrayList<Node> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (section != null) {
            HeaderFooterCollection headersFooters = section.getHeadersFooters();
            if (!zzU(headersFooters.getByHeaderFooterType(4))) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList, headersFooters.getByHeaderFooterType(4));
            }
            if (!zzU(headersFooters.getByHeaderFooterType(0))) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList, headersFooters.getByHeaderFooterType(0));
            }
            if (!zzU(headersFooters.getByHeaderFooterType(1))) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList, headersFooters.getByHeaderFooterType(1));
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Body>) arrayList2, section.getBody());
            section = (Section) section.getNextSibling();
            while (section != null && (section.getPageSetup().getSectionStart() == 0 || section.getPageSetup().getSectionStart() == 1)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Body>) arrayList2, section.getBody());
                section = (Section) section.getNextSibling();
            }
            if (!zzU(headersFooters.getByHeaderFooterType(3))) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList3, headersFooters.getByHeaderFooterType(3));
            }
            if (!zzU(headersFooters.getByHeaderFooterType(2))) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList3, headersFooters.getByHeaderFooterType(2));
            }
            if (!zzU(headersFooters.getByHeaderFooterType(5))) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList3, headersFooters.getByHeaderFooterType(5));
            }
            if (zzXRd().getSectionMode() == 0) {
                break;
            }
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) arrayList2);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) arrayList3);
        return arrayList;
    }

    private static double zzyn(String str) {
        if (str.length() > 30) {
            return Double.NaN;
        }
        char c = 0;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt > ' ') {
                if (c == 0) {
                    i++;
                    c = cCharAt;
                } else if (cCharAt == c) {
                    i++;
                }
            }
        }
        if (c != ':' && i < 2) {
            return Double.NaN;
        }
        com.aspose.words.internal.zzZQ9 zzzq9ZzZh = com.aspose.words.internal.zzJB.zzZh(str);
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZh, zzzq9)) {
            zzzq9ZzZh = com.aspose.words.internal.zzJB.zzV(str, true);
        }
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZh, zzzq9)) {
            return Double.NaN;
        }
        if (c != ':') {
            return zzCG.zzp(zzzq9ZzZh);
        }
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZh.zzkT(), com.aspose.words.internal.zzZQ9.zzkN())) {
            return zzzq9ZzZh.zzkO().zzhB();
        }
        return Double.NaN;
    }

    private void zzyo(String str) {
        int i = this.zzWT8 + 1;
        this.zzWTa.zzX("sheet", "name", com.aspose.words.internal.zzZKN.format("Sheet{0}", Integer.toString(i)), "sheetId", Integer.toString(i), "r:id", str);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellEnd(Cell cell) throws Exception {
        if (cell.getParentRow().getParentTable() != this.zzXBR) {
            return 0;
        }
        zzWP zzwpZz6G = cell.zz6G();
        if (zzwpZz6G.getHorizontalMerge() != 2 && zzwpZz6G.getVerticalMerge() != 2) {
            zzW2(cell);
        }
        this.zzWT7 += cell.zz6G().zz5q();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) {
        zzWP zzwpZz6G = cell.zz6G();
        if (cell.getParentRow().getParentTable() == this.zzXBR && zzwpZz6G.getHorizontalMerge() != 2) {
            if (zzwpZz6G.getVerticalMerge() == 2) {
                RefInt refInt = new RefInt(0);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzWT0, Integer.valueOf(this.zzWT7), refInt);
                int i = refInt.get();
                if (zZzZ) {
                    zzZ(cell, i, true);
                }
                return 0;
            }
            zzXRi();
            if (zzwpZz6G.zz5q() > 1 || zzwpZz6G.getHorizontalMerge() == 1 || zzwpZz6G.getVerticalMerge() == 1) {
                zze(cell);
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        zzG(1, "Comments are not supported when saving as XLSX.");
        return 1;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        this.zzWSW = false;
        this.zzXqB.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        this.zzWSW = true;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        this.zzXqB.push(fieldStart);
        this.zzWSW = false;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) {
        zzG(1, "Footnotes are not supported when saving as XLSX.");
        return 1;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) {
        zzG(1, "Form fields are not supported when saving as XLSX.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) {
        zzXX(groupShape);
        return 1;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) {
        zzG(1, "Office Math is not supported when saving as XLSX.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) throws Exception {
        if (zzXN(paragraph)) {
            return 0;
        }
        boolean z = this.zzWT6 == null;
        if (!z && this.zzXBR == null) {
            zzXM(paragraph);
        }
        if (this.zzXBR != null) {
            Cell cellZzZex = paragraph.zzZex();
            if (cellZzZex == null || cellZzZex.getParentRow().getParentTable() != this.zzXBR || cellZzZex.getLastParagraph() != paragraph) {
                zzU(IOUtils.LINE_SEPARATOR_WINDOWS, paragraph.getParagraphBreakFont());
            }
        } else {
            zzPv(z);
        }
        zzYDW zzydw = this.zzYTo;
        if (zzydw != null) {
            zzydw.zzYd0();
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        if (this.zzXBR == null) {
            this.zzY64++;
            this.zzWT7 = 0;
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) {
        if (row.getParentTable() != this.zzXBR) {
            return 0;
        }
        this.zzWTa.zzo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) {
        if (row.getParentTable() != this.zzXBR) {
            return 0;
        }
        this.zzY64++;
        this.zzWT7 = 0;
        zzVP(Double.NaN);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        if ((!this.zzWT3 || !zzo(run)) && com.aspose.words.internal.zzZYD.zzXk(run.getText()) && !isInFieldCode()) {
            zzU(run.getText(), run.getFont());
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        if (this.zzWT4 && zzW1(shape)) {
            return 1;
        }
        zzXX(shape);
        return 1;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagStart(SmartTag smartTag) {
        zzG(1, "Smart tags are not supported when saving as XLSX.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSpecialChar(SpecialChar specialChar) {
        zzG(1, "Special chars are not supported when saving as XLSX.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagRangeStart(StructuredDocumentTagRangeStart structuredDocumentTagRangeStart) {
        zzG(1, "Structured document tags are not supported when saving as XLSX.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) {
        zzG(1, "Structured document tags are not supported when saving as XLSX.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) {
        if (this.zzXBR != table) {
            return 0;
        }
        this.zzXBR = null;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) {
        if (this.zzXBR != null) {
            return 0;
        }
        this.zzXBR = table;
        return 0;
    }

    public final void zzIg() throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzXRu = zzXRu();
        this.zzWT9 = zz77VarZzXRu;
        zzZ(new zzXZN(zz77VarZzXRu, zzXRd().getPrettyFormat(), this.zzZG0));
        zzZ(new zzXZG(zzXZH.zzY(this.zzWSV.getDocument().getStyles().getByStyleIdentifier(65).getFont(), this.zzWSV.getDocument()), zzXZQ.zzWTo, zzXZI.zzWSF, zzXZP.zzWTd));
        zzXRt();
        zzXRj();
        zzXZ9.zzZ(this);
        zzZlX();
    }

    public final String zzR(byte[] bArr, String str) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzZXR.zzZ(6, bArr, str);
        this.zzWSV.zzZmf().zzxo().zzY(zz77VarZzZ);
        return this.zzWTa.zzZmN().zzxn().zzZ("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", zz77VarZzZ.getName(), false);
    }

    public final zzXZG zzXRe() {
        if (this.zzWT1.size() > 0) {
            return this.zzWT1.get(0);
        }
        return null;
    }

    public final ArrayList<zzXZG> zzXRf() {
        return this.zzWT1;
    }

    public final zzXZN zzXRg() {
        return this.zzWTa;
    }

    public final void zzZlX() {
        this.zzWTa = this.zzYOC.pop();
    }

    private void zzw(Section section) {
        PageSetup pageSetup = section.getPageSetup();
        int iZzb = zzb(pageSetup.getPageWidth(), pageSetup.getPageHeight());
        if (iZzb != 0) {
            this.zzWTa.zzX("pageSetup", "paperSize", Integer.toString(iZzb), "orientation", pageSetup.getPageWidth() > pageSetup.getPageHeight() ? "landscape" : "portrait");
            return;
        }
        this.zzWTa.zzX("pageSetup", "paperWidth", com.aspose.words.internal.zzJB.zzZU(pageSetup.getPageWidth()) + TranslateLanguage.PORTUGUESE, "paperHeight", com.aspose.words.internal.zzJB.zzZU(pageSetup.getPageHeight()) + TranslateLanguage.PORTUGUESE, "orientation", pageSetup.getPageWidth() > pageSetup.getPageHeight() ? "landscape" : "portrait");
    }

    private static double zzZ(zzXZH zzxzh) {
        return Math.ceil(zzxzh.getSize() * 1.3d);
    }

    public final String zzo(String str, String str2, String str3) throws Exception {
        return zzY(this.zzWTa.zzZmN(), str, str2, str3);
    }

    private void zzZ(zzZ zzz) {
        if ("s".equals(zzz.getDataType())) {
            this.zzWTa.zz0("t", zzz.getDataType());
            if (zzz.zzXRb()) {
                zzUV(this.zzY64, this.zzWT7);
            }
        }
    }

    private void zzU(String str, Font font) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        if (this.zzWT6 == null) {
            zzXZA zzxza = new zzXZA();
            this.zzWT6 = zzxza;
            com.aspose.words.internal.zzZQG.zzZ(this.zzWT2, zzxza);
        }
        zzXZH zzxzhZzY = zzXZH.zzY(font, this.zzWSV.getDocument());
        zzXZD zzxzdZzXQR = this.zzWT6.zzXQR();
        if (zzxzdZzXQR != null && com.aspose.words.internal.zzZKO.equals(zzxzdZzXQR.zzXR8(), zzxzhZzY)) {
            zzxzdZzXQR.setText(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzxzdZzXQR.getText(), str));
        } else {
            this.zzWT6.zzXQT().zzZ(str, zzxzhZzY);
        }
    }

    private void zzx(Section section) {
        zzXZN zzxzn = this.zzWTa;
        PageSetup pageSetup = section.getPageSetup();
        zzxzn.zzY("pageMargins");
        zzxzn.zzO("left", pageSetup.getLeftMargin() / 72.0d);
        zzxzn.zzO("right", pageSetup.getRightMargin() / 72.0d);
        zzxzn.zzO("top", pageSetup.getTopMargin() / 72.0d);
        zzxzn.zzO("bottom", pageSetup.getBottomMargin() / 72.0d);
        zzxzn.zzO("header", pageSetup.getHeaderDistance() / 72.0d);
        zzxzn.zzO("footer", pageSetup.getFooterDistance() / 72.0d);
        zzxzn.zzo();
    }

    private void zzY(zzXZN zzxzn) {
        zzxzn.zzY("cols");
        int i = 0;
        while (i < this.zzWT5.length) {
            int i2 = i + 1;
            String string = Integer.toString(i2);
            zzxzn.zzX("col", "min", string, "max", string, "width", com.aspose.words.internal.zzJB.zzX(zzVQ(this.zzWT5[i]), 4));
            i = i2;
        }
        zzxzn.zzo();
    }

    private void zzZ(Cell cell, int i, boolean z) {
        if (i == 0) {
            return;
        }
        int iZzW = zzWI.zzW(cell);
        for (int i2 = !z ? 1 : 0; i2 < iZzW; i2++) {
            this.zzWTa.zzX("c", "r", zzXZ8.zzUS(this.zzY64, this.zzWT7 + i2), "s", Integer.toString(i));
        }
    }

    private void zzY(zzZ zzz) {
        int size = this.zzWT2.size() - 1;
        if (this.zzWT6 != null) {
            this.zzWT2.get(size);
        }
        if (this.zzWT6 == null) {
            return;
        }
        if ("s".equals(zzz.getDataType())) {
            this.zzWTa.zzZ("v", size);
            return;
        }
        this.zzWT6.zzXQT().getCount();
        this.zzWTa.zzZ("v", this.zzWT6.zzXQS().getText());
        this.zzWT2.remove(size);
    }

    private int zzZ(zzXZG zzxzg) {
        for (int i = 0; i < this.zzWT1.size(); i++) {
            if (zzxzg.equals(this.zzWT1.get(i))) {
                return i;
            }
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzWT1, zzxzg);
        return this.zzWT1.size() - 1;
    }

    public final void zzZ(zzXZH zzxzh, String str, String str2) {
        zzXZN zzxzn = this.zzWTa;
        zzxzn.zzY(str);
        if (zzxzh.getBold()) {
            zzxzn.zzZ("b", (String) null);
        }
        if (zzxzh.getItalic()) {
            zzxzn.zzZ(ContextChain.TAG_INFRA, (String) null);
        }
        if (zzxzh.zzXRa()) {
            zzxzn.zzZ("strike", (String) null);
        }
        if (zzxzh.getOutline()) {
            zzxzn.zzZ("outline", (String) null);
        }
        if (zzxzh.getShadow()) {
            zzxzn.zzZ("shadow", (String) null);
        }
        if (!com.aspose.words.internal.zzAN.zzQ(zzxzh.getSize(), 0.0d, 0.01d)) {
            zzxzn.zzM("sz", zzxzh.getSize());
        }
        if (zzxzh.zzZy() != null && !zzxzh.zzZy().isEmpty()) {
            zzZ(zzxzh.zzZy(), "color");
        }
        if (zzxzh.getUnderline() != 0) {
            zzxzn.zzYz("u", zzXZK.zzhp(zzxzh.getUnderline()));
        }
        zzxzn.zzYz(str2, zzxzh.getName());
        if (zzxzh.getFamily() != 0) {
            zzxzn.zzZl("family", zzxzh.getFamily());
        }
        if (zzxzh.getCharset() > 0) {
            zzxzn.zzZl("charset", zzxzh.getCharset());
        }
        if (zzxzh.zzXR9() != 0) {
            zzxzn.zzYz("vertAlign", zzYUQ.zzt6(zzxzh.zzXR9()));
        }
        zzxzn.zzo();
    }

    private static zzZ zzY(zzXZA zzxza) {
        String str;
        if (zzxza == null) {
            return zzZ.zzWSO;
        }
        if (zzxza.zzXQT().getCount() > 1) {
            return zzZ.zzWSQ;
        }
        zzXZD zzxzdZzXQS = zzxza.zzXQS();
        String text = zzxzdZzXQS.getText();
        if (!com.aspose.words.internal.zzZKN.zzS(text, "0", com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8)) {
            double dZzZs = com.aspose.words.internal.zzJB.zzZs(text);
            if (Double.isNaN(dZzZs)) {
                dZzZs = com.aspose.words.internal.zzJB.zzZq(text);
            }
            if (!Double.isNaN(dZzZs)) {
                boolean zZzXc = com.aspose.words.internal.zzZYD.zzXc(text);
                if (zZzXc && text.length() > 15) {
                    return new zzZ("s", null, true);
                }
                zzxzdZzXQS.setText(com.aspose.words.internal.zzJB.zzZZ(dZzZs));
                if (zZzXc && text.length() >= 10) {
                    return new zzZ(BackupFile.PREFIX_NOTE_DIR, "1");
                }
                return zzZ.zzWSP;
            }
        }
        double dZzyn = zzyn(text);
        if (!Double.isNaN(dZzyn)) {
            zzxzdZzXQS.setText(com.aspose.words.internal.zzJB.zzZZ(dZzyn));
            boolean z = Math.abs(dZzyn) >= 1.0d;
            boolean zZzQ = com.aspose.words.internal.zzAN.zzQ(dZzyn, com.aspose.words.internal.zzZKQ.zzZb(dZzyn), 1.157E-8d);
            if (z) {
                str = !zZzQ ? PublicApiId.PCA_ACQUIRE_TOKEN_SILENT_ASYNC_WITH_PARAMETERS : "14";
            } else {
                str = "20";
            }
            return new zzZ("d", str);
        }
        return zzZ.zzWSQ;
    }

    public final void zzZ(com.aspose.words.internal.zzPV zzpv, String str) {
        this.zzWTa.zzX(str, "rgb", zzXZN.zzg(zzpv));
    }

    private void zzZ(zzXZA zzxza) {
        zzXZN zzxzn = this.zzWTa;
        zzxzn.zzY("si");
        for (zzXZD zzxzd : zzxza.zzXQT()) {
            String strZzT = zzxzn.zzT(zzxzd.getText());
            if (com.aspose.words.internal.zzZYD.zzXk(strZzT)) {
                zzxzn.zzY("r");
                zzZ(zzxzd.zzXR8(), "rPr", "rFont");
                zzxzn.zzY("t");
                if (strZzT.charAt(0) <= ' ' || androidx.core.content.OooO0O0.OooO00o(1, strZzT) <= ' ') {
                    zzxzn.zz0("xml:space", "preserve");
                }
                zzxzn.writeString(strZzT);
                zzxzn.zzo();
                zzxzn.zzo();
            }
        }
        zzxzn.zzo();
    }
}
