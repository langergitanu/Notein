package com.aspose.words;

import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(HTMLWriter.MEDIA_TYPE, "full-path");
    private String zzXOa;
    private zzYOR zzXRT;
    private String zzYlV;
    private zzYQO zzZDr;

    public zzYQQ(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private String zz1(Shape shape) {
        zzZBL zzzblZzYrB = shape.zzYrB();
        if (zzzblZzYrB != null) {
            String clsidInternal = zzzblZzYrB.getClsidInternal();
            if (!com.aspose.words.internal.zzZKN.equals(clsidInternal, com.aspose.words.internal.zzZOZ.zzZXP.toString()) && !com.aspose.words.internal.zzZKN.equals(clsidInternal, zzYO6.zzXIR.toString())) {
                return clsidInternal.toUpperCase();
            }
        }
        String strZzD7 = zzYOA.zzD7((String) shape.fetchShapeAttr(4113));
        com.aspose.words.internal.zzZOZ zzzoz = com.aspose.words.internal.zzZOZ.zzZXP;
        if (!com.aspose.words.internal.zzZKN.equals(strZzD7, zzzoz.toString())) {
            return com.aspose.words.internal.zzZKN.zzV(strZzD7, '{', '}').toUpperCase();
        }
        String strZzD72 = zzYOA.zzD7(zzYS3.zzFl(this.zzYlV));
        return !com.aspose.words.internal.zzZKN.equals(strZzD72, zzzoz.toString()) ? com.aspose.words.internal.zzZKN.zzV(strZzD72, '{', '}').toUpperCase() : zzzoz.toString();
    }

    private void zz2(Shape shape) throws Exception {
        OleFormat oleFormat = shape.getOleFormat();
        this.zzYlV = null;
        this.zzXOa = null;
        this.zzZDr = null;
        zzZBL zzzblZzYrB = shape.zzYrB();
        String str = "draw:object-ole";
        if (oleFormat.isLink()) {
            this.zzXOa = zzYOU.zzJ(oleFormat.getSourceFullName(), this.zzXRT.getDocument().getBaseUri(), true);
        } else {
            if (zzzblZzYrB == null) {
                return;
            }
            String str2 = com.aspose.words.internal.zzZKN.format("Object {0}", Integer.valueOf(this.zzXRT.zzYsA()));
            boolean zZzY = zzY(shape, str2);
            if (!zZzY) {
                com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzzblZzYrB.getOleObject().zzYrr());
                com.aspose.words.internal.zzZOR zzzorZzYu = zzkd.zzIf().zzYu("EmbeddedOdf");
                if (zzzorZzYu != null) {
                    zzP(zzzorZzYu, str2);
                    str = "draw:object";
                } else {
                    zzYQO zzyqo = new zzYQO(str2);
                    this.zzZDr = zzyqo;
                    zzkd.zzL(zzyqo.zzYvo());
                }
            }
            if (this.zzZDr != null) {
                this.zzXRT.zzYss().add(new zzYR5(zZzY ? "application/octet-stream" : "application/vnd.sun.star.oleobject", str2));
                this.zzXRT.zzYuU().zzYvp().zzZ(this.zzZDr);
                this.zzXOa = str2;
            }
        }
        zzw(str, this.zzXOa, zz1(shape));
    }

    private void zzP(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        zzYQP zzyqp = new zzYQP(zzzop);
        zzYQ9 zzyq9 = new zzYQ9(zzyqp.zzYvp().zzEl("/META-INF/manifest.xml").zzYvo());
        while (zzyq9.zzQ("manifest")) {
            if (!"file-entry".equals(zzyq9.getLocalName())) {
                zzyq9.zzk();
            }
            String value = "";
            String value2 = null;
            while (zzyq9.zzi()) {
                int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
                if (iZzTP == 0) {
                    value = zzyq9.getValue();
                } else if (iZzTP == 1) {
                    value2 = zzyq9.getValue();
                }
            }
            if (value2 != null) {
                int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                if (com.aspose.words.internal.zzZKN.zzS(value, "application/vnd.oasis.opendocument.", i) && "/".equals(value2)) {
                    this.zzXOa = com.aspose.words.internal.zzZKN.format("./{0}", str);
                    this.zzXRT.zzYss().add(new zzYR5(value, com.aspose.words.internal.zzZKN.format("{0}/", str)));
                    this.zzYlV = value;
                } else if (!com.aspose.words.internal.zzZKN.zzW(value2, "manifest.xml", i)) {
                    String str2 = com.aspose.words.internal.zzZKN.format("/{0}", value2);
                    String str3 = com.aspose.words.internal.zzZKN.format("{0}{1}", str, str2);
                    zzYQO zzyqoZzEl = zzyqp.zzYvp().zzEl(str2);
                    if (zzyqoZzEl != null) {
                        this.zzXRT.zzYuU().zzYvp().zzZ(new zzYQO(str3, zzyqoZzEl.zzYvo()));
                    }
                    this.zzXRT.zzYss().add(new zzYR5(value, str3));
                }
            }
        }
    }

    private boolean zzY(Shape shape, String str) throws Exception {
        zzYO2 zzyo2 = (zzYO2) com.aspose.words.internal.zzZKW.zzZ(shape.zzYrB(), zzYO2.class);
        if (zzyo2 == null) {
            return false;
        }
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzYO6.zzZ((String) shape.fetchShapeAttr(4113), zzyo2, true));
        zzYQO zzyqo = new zzYQO(str);
        this.zzZDr = zzyqo;
        zzkd.zzL(zzyqo.zzYvo());
        return true;
    }

    private void zzw(String str, String str2, String str3) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzGB(str);
        zzytgZzYsG.zzYu("xlink:href", str2);
        zzytgZzYsG.zzYu("xlink:type", "simple");
        zzytgZzYsG.zzYu("xlink:show", "embed");
        zzytgZzYsG.zzYu("xlink:actuate", "onLoad");
        zzytgZzYsG.zzYu("draw:class-id", str3);
        zzytgZzYsG.zzX("/>");
    }

    public final void zz3(Shape shape) throws Exception {
        zzYOR zzyor = this.zzXRT;
        zzyor.zzrb(zzyor.zzYsA() + 1);
        zz2(shape);
        zzY("draw:image", shape);
    }

    private void zzY(String str, Shape shape) throws Exception {
        ImageData imageData = shape.getImageData();
        if (imageData.zzZjT()) {
            byte[] imageBytes = imageData.getImageBytes();
            String str2 = com.aspose.words.internal.zzZKN.format("ObjectReplacements/Object {0}", Integer.valueOf(this.zzXRT.zzYsA()));
            zzYQO zzyqo = new zzYQO(str2);
            this.zzXRT.zzYuU().zzYvp().zzZ(zzyqo);
            this.zzXRT.zzYss().add(new zzYR5("", str2));
            zzyqo.zzYvo().write(imageBytes, 0, imageBytes.length);
            zzw(str, str2, null);
            this.zzXRT.zzYs1();
            return;
        }
        if (imageData.isLink()) {
            zzw("draw:image", zzYOU.zzJ(imageData.getSourceFullName(), this.zzXRT.getDocument().getBaseUri(), true), null);
        }
    }
}
