package com.aspose.words;

import com.aspose.words.zzXZL;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZB {
    private int zzWSo;
    private int zzWSp;
    private int zzWSq;
    private zzXZL zzWSr;

    public static class zzZ {
        private double zzXA;
        private double zzXy;

        public zzZ(double d, double d2) {
            this.zzXy = d;
            this.zzXA = d2;
        }

        public final double getHeight() {
            return this.zzXA;
        }

        public final double getWidth() {
            return this.zzXy;
        }
    }

    public zzXZB(zzXZL zzxzl) {
        this.zzWSr = zzxzl;
    }

    private void zzUT(int i, int i2) {
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzY("xdr:from");
        int iZzp = com.aspose.words.internal.zzSA.zzp(0.75d);
        zzxznZzXRg.zzZ("xdr:col", i2);
        zzxznZzXRg.zzZ("xdr:colOff", iZzp);
        zzxznZzXRg.zzZ("xdr:row", i);
        zzxznZzXRg.zzZ("xdr:rowOff", iZzp);
        zzxznZzXRg.zzo();
    }

    private String zzXQU() throws Exception {
        int i = this.zzWSq + 1;
        this.zzWSq = i;
        return this.zzWSr.zzo(com.aspose.words.internal.zzZKN.format("../drawings/drawing{0}.xml", Integer.valueOf(i)), "application/vnd.openxmlformats-officedocument.drawing+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/drawing");
    }

    private void zzXQV() {
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzY("a:extLst");
        zzxznZzXRg.zzY("a:ext");
        zzxznZzXRg.zz0("uri", "{28A0092B-C50C-407E-A947-70E740481C1C}");
        zzxznZzXRg.zzX("a14:useLocalDpi", "xmlns:a14", "http://schemas.microsoft.com/office/drawing/2010/main", "val", "0");
        zzxznZzXRg.zzo();
        zzxznZzXRg.zzo();
    }

    private void zzXU(ShapeBase shapeBase) {
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzY("xdr:nvPicPr");
        this.zzWSp++;
        String name = shapeBase.getName();
        if (!com.aspose.words.internal.zzZYD.zzXk(name)) {
            name = "Picture " + this.zzWSp;
        }
        zzxznZzXRg.zzX("xdr:cNvPr", "id", Integer.toString(this.zzWSp), "name", name);
        zzxznZzXRg.zzY("xdr:cNvPicPr");
        zzxznZzXRg.zzX("a:picLocks", "noChangeAspect", "1");
        zzxznZzXRg.zzo();
        zzxznZzXRg.zzo();
    }

    private static boolean zzXV(ShapeBase shapeBase) {
        if (!shapeBase.zzY9P()) {
            return false;
        }
        byte markupLanguage = shapeBase.getMarkupLanguage();
        if (markupLanguage == 0) {
            return shapeBase.zzY9a() != null && (shapeBase.zzY9a().zzZTl().zzZtH() instanceof zz2K);
        }
        if (markupLanguage != 1) {
            throw new IllegalStateException();
        }
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        return shape != null && shape.zzYbk();
    }

    private static byte[] zzXW(ShapeBase shapeBase) throws Exception {
        ShapeRenderer shapeRenderer = shapeBase.getShapeRenderer();
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions(101);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            shapeRenderer.zzZ(zzzor, imageSaveOptions);
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private void zzXy(byte[] bArr) throws Exception {
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzY("xdr:blipFill");
        zzxznZzXRg.zzY("a:blip");
        zzxznZzXRg.zz0("xmlns:r", zzXZF.zzZlE());
        this.zzWSo++;
        zzxznZzXRg.zz0("r:embed", this.zzWSr.zzR(bArr, "/xl/media/image" + this.zzWSo));
        zzXQV();
        zzxznZzXRg.zzo();
        zzxznZzXRg.zzY("a:stretch");
        zzxznZzXRg.zzZ("a:fillRect", (String) null);
        zzxznZzXRg.zzo();
        zzxznZzXRg.zzo();
    }

    private void zzY(zzZ zzz) {
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzY("xdr:spPr");
        zzxznZzXRg.zzY("a:xfrm");
        zzxznZzXRg.zzX("a:off", "x", "0", "y", "0");
        zzZ(zzz);
        zzxznZzXRg.zzo();
        zzxznZzXRg.zzY("a:prstGeom");
        zzxznZzXRg.zz0("prst", DrawToolFactory.LASSO_TYPE_RECT);
        zzxznZzXRg.zzZ("a:avLst", (String) null);
        zzxznZzXRg.zzo();
        zzxznZzXRg.zzo();
    }

    private void zzZ(zzXZL.zzX zzx, byte[] bArr) throws Exception {
        zzZ zzZ2 = zzZ(zzx.zz7u(), bArr);
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzY("xdr:oneCellAnchor");
        zzUT(zzx.getRow(), zzx.getColumn());
        zzZ(zzZ2);
        zzZ(zzx.zz7u(), bArr, zzZ2);
        zzxznZzXRg.zzZ("xdr:clientData", (String) null);
        zzxznZzXRg.zzo();
    }

    public final String zzYQ(ArrayList<zzXZL.zzX> arrayList) throws Exception {
        String strZzXQU = zzXQU();
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzZ("xdr:wsDr");
        zzxznZzXRg.zzX("xmlns:xdr", zzXZF.zzZlA());
        zzxznZzXRg.zzX("xmlns:a", zzXZF.zzZlz());
        for (zzXZL.zzX zzx : arrayList) {
            zzZ(zzx, zzXW(zzx.zz7u()));
        }
        zzxznZzXRg.endDocument();
        this.zzWSr.zzZlX();
        return strZzXQU;
    }

    private static zzZ zzZ(ShapeBase shapeBase, byte[] bArr) throws Exception {
        if (!zzXV(shapeBase)) {
            return new zzZ(shapeBase.getWidth(), shapeBase.getHeight());
        }
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(bArr);
        return new zzZ(com.aspose.words.internal.zzSA.pixelToPoint(zzxn.getWidth()), com.aspose.words.internal.zzSA.pixelToPoint(zzxn.getHeight()));
    }

    private void zzZ(zzZ zzz) {
        this.zzWSr.zzXRg().zzX("xdr:ext", "cx", Integer.valueOf(com.aspose.words.internal.zzSA.zzp(zzz.getWidth())), TranslateLanguage.WELSH, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(zzz.getHeight())));
    }

    private void zzZ(ShapeBase shapeBase, byte[] bArr, zzZ zzz) throws Exception {
        zzXZN zzxznZzXRg = this.zzWSr.zzXRg();
        zzxznZzXRg.zzY("xdr:pic");
        zzXU(shapeBase);
        zzXy(bArr);
        zzY(zzz);
        zzxznZzXRg.zzo();
    }
}
