package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.common.callercontext.ContextChain;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGY {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(ContextChain.TAG_PRODUCT, "h1", "h2", "h3", "h4", "h5", "h6");
    private HashMap<zzZDN, zzZDN> zzYpm = new HashMap<>();
    private int zzYpn;
    private zzYXT zzYrL;
    private zzZFE zzYrU;
    private zzZDT zzYrZ;
    private zzZEU zzYsa;
    private HtmlSaveOptions zzYt2;
    private zzZAO zzYt4;
    private zzYDZ zzZFZ;

    public zzZGY(zzZAO zzzao, zzZEU zzzeu, zzZFE zzzfe, HtmlSaveOptions htmlSaveOptions, zzYDZ zzydz, zzZDT zzzdt, zzYXT zzyxt) {
        this.zzYt4 = zzzao;
        this.zzYsa = zzzeu;
        this.zzYrU = zzzfe;
        this.zzYt2 = htmlSaveOptions;
        this.zzZFZ = zzydz;
        this.zzYrZ = zzzdt;
        this.zzYrL = zzyxt;
    }

    private void zz9(com.aspose.words.internal.zzG zzg) throws Exception {
        for (zzZDD zzzdd : zzZDE.zz8(zzg)) {
            for (com.aspose.words.internal.zzZQ4 zzzq4 : zzzdd.zzYX8()) {
                zzZ3E().zzZN("area", 1);
                zzZ3E().zzX("shape", DrawToolFactory.LASSO_TYPE_RECT);
                zzZ3E().zzX("href", this.zzYt2.zzYZ4() ? zzZDZ.zzJX(zzzdd.getTarget()) : zzzdd.getTarget());
                if (this.zzYt2.zzYZ4()) {
                    zzZ3E().zzX("alt", "");
                }
                zzZ3E().zzX("coords", com.aspose.words.internal.zzZKN.format("{0},{1},{2},{3}", com.aspose.words.internal.zzJB.zzWD(com.aspose.words.internal.zzSA.zzV(zzzq4.getX(), 96.0d)), com.aspose.words.internal.zzJB.zzWD(com.aspose.words.internal.zzSA.zzV(zzzq4.getY(), 96.0d)), com.aspose.words.internal.zzJB.zzWD(com.aspose.words.internal.zzSA.zzV(zzzq4.getWidth() + zzzq4.getX(), 96.0d)), com.aspose.words.internal.zzJB.zzWD(com.aspose.words.internal.zzSA.zzV(zzzq4.getHeight() + zzzq4.getY(), 96.0d))));
                zzZ3E().endElement("area");
            }
        }
    }

    private static boolean zzX(zzZDN zzzdn) {
        switch (zzUR.zzTP(zzzdn.getName())) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private zzZE7 zzZ3E() {
        return this.zzYt4.zzZ3E();
    }

    private static boolean zzc(ShapeBase shapeBase) {
        Iterator<T> it = shapeBase.getChildNodes(22, true).iterator();
        while (it.hasNext()) {
            if (((FieldStart) it.next()).getFieldType() == 88) {
                return true;
            }
        }
        Iterator<T> it2 = shapeBase.getChildNodes(18, true).iterator();
        while (it2.hasNext()) {
            if (com.aspose.words.internal.zzZYD.zzXk(((ShapeBase) it2.next()).getHRef())) {
                return true;
            }
        }
        return false;
    }

    private void zzd(ShapeBase shapeBase) {
        zzZDN zzzdnZzYXX = zzZ3E().zzYXX();
        zzZDN zzzdn = (zzZDN) com.aspose.words.internal.zzQW.zzZ(this.zzYpm, zzzdnZzYXX);
        boolean z = false;
        int index = zzzdn != null ? zzzdn.getIndex() : 0;
        zzZDN zzzdn2 = new zzZDN("span");
        zzzdn2.zzyz(6);
        zzZ3E().zzZ(index, zzzdn2);
        this.zzYpm.put(zzzdnZzYXX, zzZ3E().zzYXX());
        zzLU zzlu = new zzLU();
        zzlu.zzZs(RequestParameters.POSITION, this.zzYt2.getSaveFormat() == 52 ? "relative" : "absolute");
        zzlu.zzZs("display", "block");
        if (shapeBase.getParentParagraph() != null && shapeBase.getParentParagraph().getParagraphFormat().getBidi()) {
            z = true;
        }
        zzlu.zzZs("text-align", !z ? "left" : "right");
        zzlu.zzZ("height", 0.0d, 4);
        zzZ(shapeBase, zzlu);
        zzZDN zzzdnZzYXX2 = zzZ3E().zzYXX();
        while (true) {
            if (zzzdnZzYXX2 == null) {
                break;
            }
            if (zzX(zzzdnZzYXX2)) {
                zzPT zzptZzSx = zzzdnZzYXX2.zzYXf().zzSx("margin-top");
                if (zzptZzSx != null) {
                    zzptZzSx.zzZWj().getCount();
                    zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
                    if (zzl4ZzZVx.getValueType() == 4) {
                        zzOI zzoi = (zzOI) zzl4ZzZVx;
                        zzlu.zzZ("margin-top", -zzoi.getDoubleValue(), zzoi.getUnit());
                    }
                }
            } else {
                zzzdnZzYXX2 = zzzdnZzYXX2.zzYXe();
            }
        }
        this.zzYsa.zzV(zzlu);
    }

    public static boolean zzx(Shape shape) {
        ImageData imageData;
        if (shape.getShapeType() != 75 && shape.getShapeType() != -2 && shape.getShapeType() != 201) {
            return false;
        }
        Stroke stroke = shape.getStroke();
        if (stroke.getOn() && stroke.zz8Q().zzPD() > 0) {
            return shape.getMarkupLanguage() == 1;
        }
        if (shape.getWrapType() != 0 || (imageData = shape.getImageData()) == null) {
            return false;
        }
        Iterator<Border> it = imageData.getBorders().iterator();
        while (it.hasNext()) {
            if (zzQS.zzMD(it.next().getLineStyle())) {
                return true;
            }
        }
        return false;
    }

    private static int zzzr(int i) {
        switch (i) {
            case 1:
                return 22;
            case 2:
                return 6;
            case 3:
                return 8;
            case 4:
                return 9;
            case 5:
                return 6;
            case 6:
            case 7:
                return 7;
            case 8:
            case 9:
                return 8;
            case 10:
                return 9;
            default:
                return 1;
        }
    }

    public final void zzZ(ShapeBase shapeBase, byte[] bArr, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        zzZ(shapeBase, false, false, com.aspose.words.internal.zzZO0.zzhV().zzZn(bArr), 39, zzzq4, null, true);
    }

    public final zzLU zzy(Shape shape) {
        shape.zzY9h().zzZyf();
        zzLU zzlu = new zzLU();
        zzZ3E().zzZN("div", 0);
        zzZKI zzzkiZzZyf = shape.zzY9h().zzZyf();
        if (zzzkiZzZyf.zzZ4w() == 1 || zzzkiZzZyf.zzZ4w() == 2) {
            String strZzyH = zzZDY.zzyH(zzzkiZzZyf.zzZ4w());
            if (!this.zzYt2.zzYZ4()) {
                zzZ3E().zzX("align", strZzyH);
            }
            zzlu.zzZs("text-align", strZzyH);
        }
        if (shape.getParentParagraph() != null) {
            ParagraphFormat paragraphFormat = shape.getParentParagraph().getParagraphFormat();
            double rightIndent = paragraphFormat.getBidi() ? paragraphFormat.getRightIndent() : paragraphFormat.getLeftIndent();
            double leftIndent = paragraphFormat.getBidi() ? paragraphFormat.getLeftIndent() : paragraphFormat.getRightIndent();
            zzlu.zzZ("margin-left", rightIndent, 4);
            zzlu.zzZ("margin-right", leftIndent, 4);
        }
        return zzlu;
    }

    public final void zzZ(ShapeBase shapeBase, boolean z, boolean z2, String str, int i, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzG zzg) throws Exception {
        zzZ(shapeBase, z, z2, str, i, zzzq4, zzg, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(ShapeBase shapeBase, boolean z, boolean z2, String str, int i, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzG zzg, boolean z3) throws Exception {
        ShapeBase shapeBase2;
        zzZF3 zzzf3Zze;
        zzZF3 zzzf3;
        boolean z4;
        zzZGY zzzgy = this;
        if (zzzgy.zzZ3E().zzYXX() != null && shapeBase.getWrapType() == 3) {
            shapeBase2 = shapeBase;
            zzzf3Zze = zzzgy.zzYt4.zze(shapeBase2);
            if (zzzf3Zze != null) {
                zzd(shapeBase);
                zzzf3 = zzzf3Zze;
                z4 = true;
            }
            if (shapeBase2.zzZYh().zzYrV()) {
                zzzgy.zzYrU.zzZ(false, zzzgy.zzYt2.getExportRoundtripInformation(), shapeBase2.zzZYh().getInsertRevision().getAuthor(), shapeBase2.zzZYh().getInsertRevision().zzZx(), false);
            }
            if (shapeBase2.zzZYh().zzYrW()) {
                zzzgy.zzYrU.zzY(false, zzzgy.zzYt2.getExportRoundtripInformation(), shapeBase2.zzZYh().getDeleteRevision().getAuthor(), shapeBase2.zzZYh().getDeleteRevision().zzZx(), false);
            }
            if (!z3) {
                zzzgy.zzZ(shapeBase2, str, zzzq4, zzzf3, z4);
                zzzgy = this;
            } else {
                zzzgy.zzZ(shapeBase2, z, z2, str, i, zzzq4, zzg, zzzf3, z4);
            }
            zzzgy.zzYrU.zzYZp();
            if (shapeBase.getNodeType() == 18 && shapeBase.getWrapType() == 1) {
                zzzgy.zzZ3E().zzZN("br", 1);
                zzzgy.zzZ3E().endElement("br");
            }
            if (z4) {
                return;
            }
            zzzgy.zzZ3E().endElement("span");
            return;
        }
        shapeBase2 = shapeBase;
        zzzf3Zze = null;
        zzzf3 = zzzf3Zze;
        z4 = false;
        if (shapeBase2.zzZYh().zzYrV()) {
        }
        if (shapeBase2.zzZYh().zzYrW()) {
        }
        if (!z3) {
        }
        zzzgy.zzYrU.zzYZp();
        if (shapeBase.getNodeType() == 18) {
            zzzgy.zzZ3E().zzZN("br", 1);
            zzzgy.zzZ3E().endElement("br");
        }
        if (z4) {
        }
    }

    private void zzZ(ShapeBase shapeBase, boolean z, boolean z2, String str, int i, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzG zzg, zzZF3 zzzf3, boolean z3) throws Exception {
        int i2;
        String str2;
        shapeBase.zzY9G();
        zzZKI zzzkiZzZyf = shapeBase.isHorizontalRule() ? ((Shape) shapeBase).zzY9h().zzZyf() : null;
        zzLU zzluZzy = zzzkiZzZyf != null ? zzy((Shape) shapeBase) : null;
        zzZ3E().zzZN("img", 1);
        String strZzJX = this.zzYt2.zzYZ4() ? zzZDZ.zzJX(str) : str;
        if (z || this.zzYt2.getSaveFormat() != 53) {
            i2 = i;
        } else {
            i2 = i;
            if (i2 == 39) {
                strZzJX = this.zzYrL.zzYCg();
            }
        }
        if (this.zzYt2.getSaveFormat() == 51 && this.zzYt2.getExportCidUrlsForMhtmlResources() && !com.aspose.words.internal.zzZVR.zzWF(strZzJX)) {
            strZzJX = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("cid:", strZzJX);
        }
        if (this.zzYt2.getSaveFormat() == 54) {
            str2 = "recindex";
        } else {
            str2 = "src";
        }
        zzZ3E().zzX(str2, strZzJX);
        long jZzZ = zzYDY.zzZ(zzzq4.getSize(), 1.0f, 96.0f, 96.0f, FileFormatUtil.zzC8(i2));
        if (zzzkiZzZyf == null || com.aspose.words.internal.zzAN.zzZD(zzzkiZzZyf.zzZ4v())) {
            zzZ3E().zzZD("width", (int) jZzZ);
        } else {
            zzZ3E().zzX("width", com.aspose.words.internal.zzJB.zzWD((int) zzzkiZzZyf.zzZ4v()) + "%");
        }
        zzZ3E().zzZD("height", (int) (jZzZ >>> 32));
        zzZ3E().zzX("alt", shapeBase.getAlternativeText());
        boolean zZzc = zzc(shapeBase);
        String strZzZI = "awmap";
        if (zZzc) {
            int i3 = this.zzYpn + 1;
            this.zzYpn = i3;
            strZzZI = com.aspose.words.internal.zzZKN.zzZI("awmap", com.aspose.words.internal.zzJB.zzWD(i3));
            zzZ3E().zzX("usemap", com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("#", strZzZI));
        }
        String str3 = strZzZI;
        zzZ(shapeBase, z2, zzzq4, zzzf3, z3, zZzc);
        if (shapeBase.getWrapType() == 3 && shapeBase.getParentParagraph() != null && (shapeBase.getParentParagraph().getParentNode() instanceof Cell)) {
            Cell cell = (Cell) shapeBase.getParentParagraph().getParentNode();
            if (cell.getParentRow() != null && !com.aspose.words.internal.zzAN.zzZD(cell.getParentRow().getRowFormat().getHeight()) && cell.getCellFormat().getVerticalAlignment() != 0) {
                this.zzYt4.zzY(new zzZNT(zzZ3E().zzYXX()));
            }
        }
        if (zzzkiZzZyf != null) {
            this.zzYt4.zzY(new zzZSA(zzZ3E().zzYXX()));
        }
        zzZ3E().endElement("img");
        if (zZzc) {
            zzZ3E().zzZN("map", 0);
            zzZ3E().zzX("name", str3);
            zz9(zzg);
            zzZ3E().endElement("map");
        }
        if (zzzkiZzZyf != null) {
            this.zzYsa.zzV(zzluZzy);
            zzZ3E().endElement("div");
        }
        if (z2 && zZzc && this.zzYt2.zzYZ4()) {
            this.zzYrZ.zzT(WarningType.HINT, "The element img with the attribute usemap appears as a descendant of the a element that doesn't conform to HTML5 standard.");
        }
    }

    private void zzZ(ShapeBase shapeBase, String str, com.aspose.words.internal.zzZQ4 zzzq4, zzZF3 zzzf3, boolean z) throws Exception {
        zzZ3E().zzZN("span", 0);
        zzZ(shapeBase, false, zzzq4, zzzf3, z, false);
        zzZ3E().zzY(str, true);
        zzZ3E().endElement("span");
    }

    private void zzZ(ShapeBase shapeBase, boolean z, com.aspose.words.internal.zzZQ4 zzzq4, zzZF3 zzzf3, boolean z2, boolean z3) throws Exception {
        boolean zZzS;
        zzLU zzlu = new zzLU();
        boolean z4 = true;
        if (this.zzZFZ.zzYK(shapeBase) != null) {
            zZzS = true;
        } else {
            zZzS = shapeBase.zzY9I() ? com.aspose.words.internal.zzZKN.zzS(shapeBase.zzY9h().getOleFormat().getProgId(), "equation", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8) : false;
        }
        if (zZzS) {
            zzlu.zzV(new zzM3("vertical-align", zzL4.zzZmW, (byte) 0));
        } else {
            ParagraphFormat paragraphFormat = shapeBase.getParentParagraph() != null ? shapeBase.getParentParagraph().getParagraphFormat() : null;
            if (paragraphFormat != null && paragraphFormat.getBaselineAlignment() != 4 && paragraphFormat.getBaselineAlignment() != 2) {
                zzlu.zzV(new zzM3("vertical-align", zzL5.zzM6(paragraphFormat.getBaselineAlignment()), (byte) 0));
            }
        }
        if (!z && !z3) {
            z4 = false;
        }
        zzZ(shapeBase, z4, zzlu, this.zzYt2.getExportRoundtripInformation());
        zzZ(shapeBase, zzzq4, zzzf3, zzlu);
        if (shapeBase.getWrapType() == 3 && !z2) {
            zzZ(shapeBase, zzlu);
        }
        if (zzlu.getCount() > 0) {
            this.zzYsa.zzV(zzlu);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(ShapeBase shapeBase, boolean z, zzLU zzlu, boolean z2) throws Exception {
        boolean zZzZ;
        ImageData imageData;
        if (shapeBase.getNodeType() == 18) {
            Shape shape = (Shape) shapeBase;
            if (zzx(shape)) {
                Stroke stroke = shape.getStroke();
                if (stroke.getOn() && stroke.zz8Q().zzPD() > 0) {
                    Border border = new Border();
                    border.setLineStyle(zzzr(stroke.getDashStyle()));
                    border.zzZ5(stroke.getWeight());
                    border.zzm(stroke.zz8Q());
                    zZzZ = zzQS.zzZ(border, zzlu, z2);
                } else {
                    zZzZ = (shape.getWrapType() != 0 || (imageData = shape.getImageData()) == null) ? false : zzQS.zzZ(zzlu, imageData.getBorders(), z2);
                }
            }
        }
        if (zZzZ || !z) {
            return;
        }
        zzlu.zzX(zzL4.zzZno, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzZQ4 zzzq4, zzZF3 zzzf3, zzLU zzlu) {
        int wrapType = shapeBase.getWrapType();
        if (wrapType == 2) {
            zzlu.zzZs(RequestParameters.POSITION, "relative");
            zzlu.zzU(shapeBase.getDistanceTop() + ((double) zzzq4.zzZo()), shapeBase.getDistanceRight(), shapeBase.getDistanceBottom(), shapeBase.getDistanceLeft() + ((double) zzzq4.zzZm()));
            if (shapeBase.getHorizontalAlignment() == 0 && shapeBase.getRelativeHorizontalPosition() == 2 && shapeBase.getParentParagraph() != null && !zzZGI.zzZW(shapeBase.getParentParagraph()).isListItem() && !shapeBase.getParentParagraph().isInCell()) {
                Section section = (Section) shapeBase.getAncestor(2);
                if (shapeBase.getLeft() > 54.0d) {
                    if (shapeBase.getWidth() + shapeBase.getLeft() + 18.0d > section.getPageSetup().zzYRX()) {
                        zzlu.zzZs("float", "right");
                    } else {
                        zzlu.zzZs("float", "left");
                    }
                }
            } else {
                zzlu.zzZs("float", shapeBase.getHorizontalAlignment() == 3 ? "right" : "left");
            }
        } else if (wrapType == 3) {
            zzlu.zzZs(RequestParameters.POSITION, "absolute");
            boolean z = shapeBase.getParentParagraph() != null && shapeBase.getParentParagraph().getParagraphFormat().getBidi();
            if (zzzf3 != null) {
                double dZzZm = zzzf3.zzZPK().zzZm();
                if (shapeBase.getParentParagraph() != null) {
                    double dIntBitsToFloat = dZzZm + ((double) Float.intBitsToFloat((int) zzzf3.zzYZ0()));
                    zzZGI zzzgiZzZW = zzZGI.zzZW(shapeBase.getParentParagraph());
                    dZzZm = dIntBitsToFloat - zzzgiZzZW.getLeftIndent();
                    if (!zzzgiZzZW.isListItem() || zzzgiZzZW.getFirstLineIndent() > 0.0d) {
                        dZzZm -= zzzgiZzZW.getFirstLineIndent();
                    }
                    Cell cell = (Cell) shapeBase.getAncestor(7);
                    if (cell != null) {
                        dZzZm -= cell.getCellFormat().getLeftPadding();
                    }
                }
                zzlu.zzZ(z ? "margin-right" : "margin-left", dZzZm, 4);
                zzlu.zzZ("margin-top", zzzf3.zzZPK().zzZo(), 4);
            } else {
                double dZzYJ = zzYCH.zzYJ(shapeBase) + ((double) zzzq4.zzZm());
                if (shapeBase.getParentParagraph() != null) {
                    zzZGI zzzgiZzZW2 = zzZGI.zzZW(shapeBase.getParentParagraph());
                    if (zzzgiZzZW2.isListItem()) {
                        dZzYJ -= zzzgiZzZW2.getLeftIndent();
                    }
                }
                double dZzYI = zzYCH.zzYI(shapeBase) + ((double) zzzq4.zzZo());
                zzlu.zzZ(z ? "margin-right" : "margin-left", dZzYJ, 4);
                zzlu.zzZ("margin-top", dZzYI, 4);
            }
        } else if (wrapType == 4 || wrapType == 5) {
        }
        if (this.zzYt2.getExportRoundtripInformation()) {
            zzlu.zzZs("-aw-wrap-type", zzZDY.zzyM(shapeBase.getWrapType()));
            zzlu.zzZs("-aw-rel-hpos", zzZDY.zzyL(shapeBase.getRelativeHorizontalPosition()));
            zzlu.zzZs("-aw-rel-vpos", zzZDY.zzyK(shapeBase.getRelativeVerticalPosition()));
            zzlu.zzZ("-aw-top-pos", shapeBase.getTop(), 4);
            zzlu.zzZ("-aw-left-pos", shapeBase.getLeft(), 4);
        }
    }

    private void zzZ(ShapeBase shapeBase, zzLU zzlu) {
        zzlu.zzV("z-index", this.zzZFZ.zzYL(shapeBase));
    }
}
