package com.aspose.words;

import android.graphics.Bitmap;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJM implements com.aspose.words.internal.zzFS {
    private zzW2[] zzXCa;
    private Shape zzXCb;
    private boolean zzXCc;
    private boolean zzXCd;
    private boolean zzXCe;
    private boolean zzXCf;
    private zzZRO zzXV1;
    private DocumentBuilder zzZwh;

    public static class zzZ implements IResourceLoadingCallback {
        private int zzXC8;
        private IResourceLoadingCallback zzXC9;

        public zzZ(IResourceLoadingCallback iResourceLoadingCallback) {
            this.zzXC9 = iResourceLoadingCallback;
        }

        @Override // com.aspose.words.IResourceLoadingCallback
        public final int resourceLoading(ResourceLoadingArgs resourceLoadingArgs) throws Exception {
            int iResourceLoading = this.zzXC9.resourceLoading(resourceLoadingArgs);
            this.zzXC8 = iResourceLoading;
            return iResourceLoading;
        }

        public final int zzYlQ() {
            return this.zzXC8;
        }
    }

    public zzYJM(Document document, zzZRO zzzro, boolean z, boolean z2) {
        this.zzZwh = new DocumentBuilder(document);
        this.zzXV1 = zzzro;
        this.zzXCf = z;
        this.zzXCe = z2;
    }

    private static boolean zzCN(String str) {
        return com.aspose.words.internal.zzZKN.zzZ(str, new char[]{IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS, ':', FilenameUtils.EXTENSION_SEPARATOR}) < 0;
    }

    private static String zzCO(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (com.aspose.words.internal.zzZYD.zzZ1(sb.charAt(i))) {
                sb.setCharAt(i, '_');
            }
        }
        return sb.toString();
    }

    private static void zzX(Shape shape, int i) throws Exception {
        if (i == 0 || !shape.getImageData().hasImage()) {
            return;
        }
        ImageSize imageSize = shape.getImageData().getImageSize();
        int iZzZ = zzZ(i, shape, imageSize);
        if (iZzZ == 1) {
            shape.setHeight(imageSize.getHeightPoints() * (shape.getWidth() / imageSize.getWidthPoints()));
        } else if (iZzZ == 2) {
            shape.setWidth(imageSize.getWidthPoints() * (shape.getHeight() / imageSize.getHeightPoints()));
        } else if (iZzZ == 3) {
            shape.zze(imageSize.getWidthPoints(), imageSize.getHeightPoints());
        } else {
            if (iZzZ != 5) {
                throw new IllegalStateException();
            }
            shape.getImageData().fitImageToShape();
        }
    }

    private DocumentBuilder zzX6(Node node) {
        if (node.getDocument() == this.zzZwh.getDocument()) {
            return this.zzZwh;
        }
        this.zzXV1.zzZh9().getDocument();
        return this.zzXV1.zzZh9();
    }

    private static void zzX7(Node node) {
        node.getNodeType();
        Paragraph paragraph = (Paragraph) node.getParentNode();
        if (paragraph == null || !paragraph.getListFormat().isListItem()) {
            return;
        }
        paragraph.zzZYj().add(1643, com.aspose.words.internal.zzXI.zzVk);
    }

    private int zzXT(byte[] bArr) throws Exception {
        if (this.zzXCc && com.aspose.words.internal.zzEF.zzZR(bArr)) {
            return com.aspose.words.internal.zzEF.zzZA(bArr);
        }
        return 1;
    }

    private void zzY(Object obj, int i, byte[] bArr) throws Exception {
        Shape shape = (Shape) obj;
        shape.getImageData().setImageBytes(bArr);
        zzZ(shape, i);
    }

    private LoadOptions zzYlR() {
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.zzZ(this.zzZwh.getDocument().zzZqr());
        loadOptions.setResourceLoadingCallback(this.zzZwh.getDocument().getResourceLoadingCallback());
        return loadOptions;
    }

    private static boolean zzpA(int i) {
        return i == 5 || i == 6 || i == 7 || i == 8;
    }

    private static int zzpz(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalStateException("Wrong import format mode.");
    }

    @Override // com.aspose.words.internal.zzFS
    public final int zzA(Object obj) {
        return zzWI.zzV((Cell) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final int zzB(Object obj) {
        return ((Cell) obj).getRowIndex();
    }

    @Override // com.aspose.words.internal.zzFS
    public final String zzC(Object obj) {
        String str = ControlChar.CELL;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        ((Cell) obj).zzI(sb);
        com.aspose.words.internal.zzZNH.zzZ(sb, str, "", sb.length() - length, length);
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzD(Object obj) {
        Table table = (Table) obj;
        if (zzYJK.zzc(table)) {
            table.convertToHorizontallyMergedCells();
        }
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzE(Object obj) {
        Paragraph paragraph = (Paragraph) obj;
        if (paragraph.isRemoved() || zzYVU.zzZf(paragraph) || zzYJK.zzYu(paragraph)) {
            return;
        }
        paragraph.remove();
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzEN() {
        return this.zzZwh.getDocument();
    }

    @Override // com.aspose.words.internal.zzFS
    public final boolean zzEO() {
        return this.zzXCd;
    }

    @Override // com.aspose.words.internal.zzFS
    public final Class zzEP() {
        return Document.class;
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzEQ() {
        this.zzXV1.zzEQ();
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzER() {
        this.zzXCb = null;
        this.zzXCa = null;
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzES() {
        this.zzXV1.zz8(this.zzXCb);
        this.zzXCb.remove();
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzET() {
        for (zzW2 zzw2 : this.zzXCa) {
            if (zzw2 != null) {
                zzw2.zz26();
            }
        }
        this.zzXV1.zz9(this.zzXCb);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzF(Object obj) {
        return zzZ76.zzZ0((Node) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzG(Object obj) {
        return zzZ76.zzYY((Node) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzJ(Object obj, Object obj2) {
        Cell cell = (Cell) obj;
        while (cell != null && cell.getParentRow().getParentTable() != obj2) {
            cell = (Cell) cell.getAncestor(7);
        }
        return cell;
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzK(Object obj, Object obj2) throws Exception {
        zzYW4.zzY((Node) obj, (Node) obj2, 0);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzT(boolean z, boolean z2) {
        this.zzXCd = z;
        this.zzXCc = z2;
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzWa(int i) {
        zzYJL.zzW(this.zzXCb, i);
    }

    @Override // com.aspose.words.internal.zzFS
    public final String zzZ(com.aspose.words.internal.zzFT zzft) {
        if (zzYW6.zzZ((Node) zzft.zzEW(), (Node) zzft.zzEV(), zzft.zzEU(), true) == 0) {
            return "Can not copy or remove document contents between different stories or cells of different tables.";
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zza(int i, int i2) {
        this.zzXCa[i].zzNG(i2);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzu(Object obj) {
        return ((Table) obj).getAncestor(5);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzv(Object obj) {
        return ((Cell) obj).getParentRow().getParentTable();
    }

    @Override // com.aspose.words.internal.zzFS
    public final int zzw(Object obj) {
        return zzWI.zzW((Cell) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final int zzx(Object obj) {
        return zzWI.zzX((Cell) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final boolean zzy(Object obj) {
        return zzYJK.zzs((Cell) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final boolean zzz(Object obj) {
        return zzYJK.zzt((Cell) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzT(Object obj, String str) {
        Node node = (Node) obj;
        DocumentBuilder documentBuilderZzX6 = zzX6(node);
        documentBuilderZzX6.moveTo(node);
        documentBuilderZzX6.getFont().setBold(true);
        documentBuilderZzX6.write(str);
        zzZRO.zza(node);
    }

    private static void zzY(Shape shape, int i) {
        double rotation = shape.getRotation() + zzZSL.zzDX(i);
        if (rotation >= 360.0d) {
            rotation -= 360.0d;
        }
        int flipOrientation = shape.getFlipOrientation();
        if (flipOrientation != 0 && flipOrientation != 3 && zzpA(i)) {
            flipOrientation ^= 3;
        }
        int iZzDW = zzZSL.zzDW(i) ^ flipOrientation;
        shape.setRotation(rotation);
        shape.setFlipOrientation(iZzDW);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(com.aspose.words.internal.zzFT zzft, Map map) throws Exception {
        zzYW9.zzZ((Node) zzft.zzEW(), (Node) zzft.zzEV(), map, this.zzXV1, zzft.zzEU());
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, Object obj2, boolean z, boolean z2) throws Exception {
        String string = obj2 != null ? obj2.toString() : "";
        Node node = (Node) obj;
        node.getNodeType();
        DocumentBuilder documentBuilderZzX6 = zzX6(node);
        if (z) {
            zzZ(node, documentBuilderZzX6);
            documentBuilderZzX6.insertHtml(string, !z2);
            zzX(node, false, false);
        } else {
            documentBuilderZzX6.moveTo(node);
            documentBuilderZzX6.write(string);
        }
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzX(com.aspose.words.internal.zzFT zzft) {
        Node node = (Node) zzft.zzEW();
        Node node2 = (Node) zzft.zzEV();
        node.getNodeType();
        if (node2 != null) {
            node2.getNodeType();
        }
        node.remove();
        if (node2 == null || node2 == node) {
            return;
        }
        node2.remove();
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzY(Object obj, String str, String str2) {
        Node node = (Node) obj;
        node.getNodeType();
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) zzZRO.zz3(node);
        if (structuredDocumentTag.getSdtType() != 5) {
            structuredDocumentTag.getSdtType();
        }
        structuredDocumentTag.getListItems().add(new SdtListItem(str2, str));
    }

    private static void zzX(Node node, boolean z, boolean z2) {
        node.getNodeType();
        Paragraph paragraph = (Paragraph) node.getParentNode();
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.getPreviousSibling(), Paragraph.class);
        if (paragraph2 != null) {
            zzYJK.zzU(paragraph2, paragraph);
            if (z2) {
                Node nodeZzYB9 = paragraph2.zzYB9();
                if (nodeZzYB9.getNodeType() == 8) {
                    zzYJK.zzU((Paragraph) nodeZzYB9, paragraph);
                    nodeZzYB9.remove();
                }
            } else {
                paragraph.zzZ((zzYMX) paragraph2.zzZYj().zzbn());
                if (z) {
                    paragraph.zzC((zzYEF) paragraph2.zzYp5().zzbn());
                }
            }
            paragraph2.remove();
        }
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzY(com.aspose.words.internal.zzFT zzft) throws Exception {
        zzYW4.zzY((Node) zzft.zzEW(), (Node) zzft.zzEV(), zzft.zzEU());
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, int i, byte[] bArr) throws Exception {
        zzY(obj, i, bArr);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzY(com.aspose.words.internal.zzFT zzft, int i) {
        zzYW2.zzX((Node) zzft.zzEW(), (Node) zzft.zzEV(), com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, int i, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        Shape shape = (Shape) obj;
        if (zzzop != null) {
            try {
                shape.getImageData().setImage(com.aspose.words.internal.zzZVQ.zzZT(zzzop));
            } finally {
                zzzop.close();
            }
        } else {
            shape.getImageData().zzZ1(null);
        }
        zzZ(shape, i);
    }

    private boolean zzY(Object obj, com.aspose.words.internal.zzZOP zzzop, int i, boolean z, Object obj2) throws Exception {
        try {
            Document document = new Document(zzzop, zzYlR(), false);
            if (zzzop != null) {
                zzzop.close();
            }
            return zzZ(obj, document, i, z, obj2);
        } finally {
        }
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, int i, Bitmap bitmap) throws Exception {
        Shape shape = (Shape) obj;
        shape.getImageData().setImage(bitmap);
        zzZ(shape, i);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzY(Object obj, boolean z) {
        return zzYJK.zzY((Cell) obj, z);
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.words.internal.zzFS
    public final boolean zzZ(Object obj, int i, String str) throws Exception {
        zzZ zzz;
        int iZzYlQ;
        IResourceLoadingCallback resourceLoadingCallback = this.zzZwh.getDocument().getResourceLoadingCallback();
        if (resourceLoadingCallback != null) {
            zzz = new zzZ(resourceLoadingCallback);
            this.zzZwh.getDocument().setResourceLoadingCallback(zzz);
        } else {
            zzz = null;
        }
        try {
            byte[] bArrZzZ = zzZ8I.zzZ(str, this.zzZwh.getDocument());
            if (resourceLoadingCallback != null) {
                this.zzZwh.getDocument().setResourceLoadingCallback(resourceLoadingCallback);
                iZzYlQ = zzz.zzYlQ();
            } else {
                iZzYlQ = 0;
            }
            if (bArrZzZ == null) {
                return iZzYlQ != 0;
            }
            zzY(obj, i, bArrZzZ);
            return true;
        } catch (Throwable th) {
            if (resourceLoadingCallback != null) {
                this.zzZwh.getDocument().setResourceLoadingCallback(resourceLoadingCallback);
            }
            throw th;
        }
    }

    private void zzZ(Shape shape, int i) throws Exception {
        int iZzXT = zzXT(shape.getImageData().getImageBytes());
        if (iZzXT != 1) {
            zzY(shape, iZzXT);
            if (zzpA(iZzXT)) {
                double width = shape.getWidth();
                shape.setWidth(shape.getHeight());
                shape.setHeight(width);
                if (i == 1) {
                    i = 2;
                } else if (i == 2) {
                    i = 1;
                }
            }
        }
        zzX(shape, i);
    }

    private static int zzZ(int i, Shape shape, ImageSize imageSize) {
        return i != 4 ? i : imageSize.getHeightPoints() > shape.getHeight() ? (imageSize.getWidthPoints() <= shape.getWidth() || imageSize.getHeightPoints() / shape.getHeight() > imageSize.getWidthPoints() / shape.getWidth()) ? 2 : 1 : imageSize.getWidthPoints() > shape.getWidth() ? 1 : 3;
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, String str, String str2) {
        Node node = (Node) obj;
        node.getNodeType();
        DocumentBuilder documentBuilderZzX6 = zzX6(node);
        documentBuilderZzX6.moveTo(node);
        documentBuilderZzX6.removeRunAttr(160);
        documentBuilderZzX6.removeRunAttr(140);
        node.getDocument();
        boolean zZzCN = zzCN(str);
        if (zZzCN) {
            str = zzCO(str);
        }
        documentBuilderZzX6.getFont().setStyleIdentifier(85);
        documentBuilderZzX6.insertHyperlink(str2, str, zZzCN);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(com.aspose.words.internal.zzFT zzft, String str) {
        String strZzCO = zzCO(str);
        Node node = (Node) zzft.zzEW();
        Node node2 = (Node) zzft.zzEV();
        node.getNodeType();
        node2.getNodeType();
        node.zzYC(new BookmarkStart(node.getDocument(), strZzCO));
        node2.zzYD(new BookmarkEnd(node2.getDocument(), strZzCO));
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Iterable iterable, boolean z) throws Exception {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzX7((Node) it.next());
        }
        if (z) {
            zzZ46.zzs(this.zzZwh.getDocument());
        }
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, boolean z) throws Exception {
        Node node = (Node) obj;
        node.getNodeType();
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node;
        structuredDocumentTag.getSdtType();
        structuredDocumentTag.setChecked(z);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, int[] iArr) {
        Shape shape = (Shape) obj;
        this.zzXCb = shape;
        shape.hasChart();
        zzW2[] zzw2ArrZzZ = zzW2.zzZ(this.zzXCb, iArr);
        this.zzXCa = zzw2ArrZzZ;
        for (zzW2 zzw2 : zzw2ArrZzZ) {
            if (zzw2 != null) {
                zzw2.zz2b();
            }
        }
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.zzXCa[i].zzZ(obj, obj2, obj3, i2);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzZ(int i, Object obj) {
        return zzZ76.zzZ(i, (Node) obj);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(com.aspose.words.internal.zzFT zzft, int i) {
        zzYWA.zzZ((Node) zzft.zzEW(), (Node) zzft.zzEV(), com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.internal.zzFS
    public final boolean zzZ(Object obj, byte[] bArr, int i, boolean z, Object obj2) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) bArr, "documentBytes");
        return zzY(obj, new com.aspose.words.internal.zzZOR(bArr), i, z, obj2);
    }

    @Override // com.aspose.words.internal.zzFS
    public final boolean zzZ(Object obj, com.aspose.words.internal.zzZOP zzzop, int i, boolean z, Object obj2) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop, "documentStream");
        return zzY(obj, zzzop, i, z, obj2);
    }

    @Override // com.aspose.words.internal.zzFS
    public final boolean zzZ(Object obj, Object obj2, int i, boolean z, Object obj3) throws Exception {
        com.aspose.words.internal.zzZ4.zzY(obj2, "document");
        return zzZ(obj, (Document) obj2, i, z, obj3);
    }

    @Override // com.aspose.words.internal.zzFS
    public final byte zzZ(Object obj, String str, int i, boolean z, Object obj2) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "documentUri");
        try {
            com.aspose.words.internal.zzZOP zzzopZzZ = Document.zzZ(str, this.zzZwh.getDocument().getResourceLoadingCallback(), false);
            return (zzzopZzZ == null || zzY(obj, zzzopZzZ, i, z, obj2)) ? (byte) 1 : (byte) 0;
        } catch (Exception unused) {
            return (byte) -1;
        }
    }

    private boolean zzZ(Object obj, Document document, int i, boolean z, Object obj2) throws Exception {
        Document document2;
        boolean zZzZ;
        Node node = (Node) obj;
        node.getNodeType();
        if (obj2 != null) {
            new ReportingEngine();
            document2 = document;
            zZzZ = ReportingEngine.zzZ(document2, obj2, this.zzXCd, this.zzXCc, this.zzXCf, this.zzXCe);
        } else {
            document2 = document;
            zZzZ = true;
        }
        DocumentBuilder documentBuilderZzX6 = zzX6(node);
        zzZ(node, documentBuilderZzX6);
        ImportFormatOptions importFormatOptions = new ImportFormatOptions();
        importFormatOptions.setAdjustSentenceAndWordSpacing(true);
        documentBuilderZzX6.insertDocument(document2, zzpz(i), importFormatOptions);
        zzX(node, true, z);
        return zZzZ;
    }

    private void zzZ(Node node, DocumentBuilder documentBuilder) {
        node.getNodeType();
        Paragraph paragraph = (Paragraph) zzYJK.zzZ(node.getParentNode(), node, this.zzXV1, null);
        paragraph.zzC((zzYEF) ((Run) node).zzZYh().zzbn());
        documentBuilder.moveTo(paragraph);
    }

    @Override // com.aspose.words.internal.zzFS
    public final Object zzZ(Object obj, int i, int i2) {
        return zzZ76.zzX((Table) obj, i, i2);
    }

    @Override // com.aspose.words.internal.zzFS
    public final void zzZ(Object obj, Object obj2, boolean z) {
        zzYJK.zzZ((Cell) obj, (Cell) obj2, z);
    }
}
