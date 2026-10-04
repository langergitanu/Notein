package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFR {
    private zzZDN zzYno;
    private zzZDN zzYnp;
    private zzZHR zzYqf;
    private zzYWQ zzYs1;
    private zzZN8 zzYs5;
    private zzZH4 zzYs8;
    private HtmlSaveOptions zzYt2;
    private zzZAO zzYt4;
    private static zzPT[] zzYns = {new zzM3("background-color", zzL4.zzZnp, (byte) 0), new zzM3("border-top-style", zzL4.zzZno, (byte) 0), new zzM3("border-right-style", zzL4.zzZno, (byte) 0), new zzM3("border-bottom-style", zzL4.zzZno, (byte) 0), new zzM3("border-left-style", zzL4.zzZno, (byte) 0)};
    private static zzPT[] zzYnr = {new zzM3("background-color", zzL4.zzZnp, (byte) 0), new zzM3("border-top-color", zzL4.zzZnp, (byte) 0), new zzM3("border-top-style", zzL4.zzZno, (byte) 0), new zzM3("border-top-width", zzL4.zzZlB, (byte) 0), new zzM3("border-right-color", zzL4.zzZnp, (byte) 0), new zzM3("border-right-style", zzL4.zzZno, (byte) 0), new zzM3("border-right-width", zzL4.zzZlB, (byte) 0), new zzM3("border-bottom-color", zzL4.zzZnp, (byte) 0), new zzM3("border-bottom-style", zzL4.zzZno, (byte) 0), new zzM3("border-bottom-width", zzL4.zzZlB, (byte) 0), new zzM3("border-left-color", zzL4.zzZnp, (byte) 0), new zzM3("border-left-style", zzL4.zzZno, (byte) 0), new zzM3("border-left-width", zzL4.zzZlB, (byte) 0), new zzM3("padding-top", new zzOI(0.0d, 4), (byte) 0), new zzM3("padding-right", new zzOI(0.0d, 4), (byte) 0), new zzM3("padding-bottom", new zzOI(0.0d, 4), (byte) 0), new zzM3("padding-left", new zzOI(0.0d, 4), (byte) 0)};
    private static String[] zzYnq = {"-aw-border-top-style", "-aw-border-top-width", "-aw-border-right-style", "-aw-border-right-width", "-aw-border-bottom-style", "-aw-border-bottom-width", "-aw-border-left-style", "-aw-border-left-width"};

    public zzZFR(Document document, zzZAO zzzao, HtmlSaveOptions htmlSaveOptions, zzYWQ zzywq, zzZH4 zzzh4, zzZN8 zzzn8) {
        this.zzYt4 = zzzao;
        this.zzYt2 = htmlSaveOptions;
        this.zzYs1 = zzywq;
        this.zzYs8 = zzzh4;
        this.zzYqf = new zzZHR(document, htmlSaveOptions);
        this.zzYs5 = zzzn8;
    }

    private static String zzKp(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 9; i++) {
            com.aspose.words.internal.zzZNH.zzZ(sb, com.aspose.words.internal.zzZKN.zzS((char) i, 1), zzZDY.zzyG(i));
        }
        return sb.toString();
    }

    private static String zzX(zzZGI zzzgi) {
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        List list = zzzgi.getList();
        ListLevel listLevel = zzzgi.getListLevel();
        int i = 0;
        for (int i2 = 0; i2 < listLevel.getNumberFormat().length(); i2++) {
            char cCharAt = listLevel.getNumberFormat().charAt(i2);
            if (ListLevel.zzYF(cCharAt) && zzZ4D.zzxd(list.getListLevels().get(cCharAt).getNumberStyle())) {
                if (!zzd3.zzVE(cCharAt)) {
                    zzd3.add(cCharAt, zzzgi.zzZ0Q()[i]);
                }
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < 9; i3++) {
            if (zzd3.zzVE(i3)) {
                if (sb.length() > 0) {
                    sb.append(ControlChar.SPACE_CHAR);
                }
                com.aspose.words.internal.zzZNH.zzU(sb, (String) zzd3.get(i3));
            }
        }
        return sb.toString();
    }

    private static boolean zzZ(Paragraph paragraph, zzLU zzlu) {
        if (paragraph.getParagraphFormat().getFirstLineIndent() >= 0.0d) {
            return false;
        }
        for (zzPT zzpt : zzYns) {
            if (!zzlu.zzSd(zzpt.zzZWo()).zzX(zzpt.zzZWj())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(Paragraph paragraph, zzYMX zzymx, int i, boolean z) throws Exception {
        Paragraph paragraph2;
        zzLU zzluZzY = this.zzYt4.zzZ3C().zzY(paragraph, zzymx, i);
        zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
        if (zzzgiZzZW.zzZ0R()) {
            int iZzQ = zzL5.zzQ(paragraph);
            zzZGL zzzglZzV = zzZGL.zzV(paragraph, 1);
            zzzglZzV.zzZ(zzluZzY, iZzQ, paragraph.getParagraphFormat().getBidi());
            if (this.zzYt2.getExportRoundtripInformation()) {
                zzluZzY.zzV(new zzM3("-aw-import", zzL4.zzZms, (byte) 0));
                ListLevel listLevel = zzzgiZzZW.getListLevel();
                zzluZzY.zzV(new zzM3("-aw-list-level-number", new zzNH(listLevel.zzYOa()), (byte) 0));
                zzluZzY.zzV(new zzM3("-aw-list-number-format", new zzM2(zzKp(listLevel.getNumberFormat())), (byte) 0));
                String strZzY = zzY(zzzgiZzZW);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzY)) {
                    zzluZzY.zzV(new zzM3("-aw-list-number-styles", new zzM2(strZzY), (byte) 0));
                }
                String strZzX = zzX(zzzgiZzZW);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzX)) {
                    zzluZzY.zzV(new zzM3("-aw-list-number-values", new zzM2(strZzX), (byte) 0));
                }
                paragraph2 = paragraph;
                zzO7.zzZ(zzluZzY, paragraph2, this.zzYqf, this.zzYs5, zzzglZzV, true, false, this.zzYt2.getExportRoundtripInformation());
            } else {
                paragraph2 = paragraph;
            }
        }
        if (zzZ(paragraph2, zzluZzY)) {
            this.zzYt4.zzZ3E().zzZN("div", 0);
            this.zzYt4.zzZ3E().zzYXX().zzyz(4);
            this.zzYnp = this.zzYt4.zzZ3E().zzYXX();
            zzZ(paragraph2, zzluZzY, i);
        }
        this.zzYt4.zzZ3E().zzZN(zzZJ2.zzzO(zzymx.zzZ7j()), 2);
        this.zzYno = this.zzYt4.zzZ3E().zzYXX();
        zzYWQ zzywq = this.zzYs1;
        if (zzywq != null) {
            zzywq.zzT(paragraph2, zzymx);
        }
        this.zzYs8.zzW(paragraph2, zzymx);
        this.zzYt4.zzZ3C().zzZM(paragraph2);
        if (!z) {
            zzluZzY.zzZs("display", "none");
        }
        if (paragraph2.getFrameFormat().isFrame() && this.zzYt2.getExportRoundtripInformation()) {
            ParagraphFormat paragraphFormat = paragraph2.getParagraphFormat();
            zzluZzY.zzZs("-aw-element-wrap", zzZDY.zzyF(paragraphFormat.getWrapType()));
            if (paragraphFormat.getRelativeVerticalPosition() == 1 || paragraphFormat.getRelativeVerticalPosition() == 2) {
                zzluZzY.zzZs("-aw-element-anchor-vertical", zzZDY.zzyE(paragraphFormat.getRelativeVerticalPosition()));
            }
            zzluZzY.zzZs("-aw-element-anchor-horizontal", zzZDY.zzyD(paragraphFormat.getRelativeHorizontalPosition()));
            if (!com.aspose.words.internal.zzAN.zzZD(paragraphFormat.zzYow())) {
                zzluZzY.zzZ("-aw-element-top", paragraphFormat.zzYow(), 4);
            } else if (paragraphFormat.getVerticalAlignment() != -1 && paragraphFormat.getVerticalAlignment() != 0) {
                zzluZzY.zzZs("-aw-element-top", zzZDY.zzyA(paragraphFormat.getVerticalAlignment()));
            }
            if (!com.aspose.words.internal.zzAN.zzZD(paragraphFormat.zzYox())) {
                zzluZzY.zzZ("-aw-element-left", paragraphFormat.zzYox(), 4);
            } else if (paragraphFormat.getHorizontalAlignment() != 1 && paragraphFormat.getHorizontalAlignment() != 0) {
                zzluZzY.zzZs("-aw-element-left", zzZDY.zzyB(paragraphFormat.getHorizontalAlignment()));
            }
            if (!com.aspose.words.internal.zzAN.zzZD(paragraphFormat.zzZs0())) {
                zzluZzY.zzZ("-aw-frame-width", paragraphFormat.zzZs0(), 4);
            }
            if (!com.aspose.words.internal.zzAN.zzZD(paragraphFormat.zzZrZ())) {
                zzluZzY.zzZ("-aw-frame-height", paragraphFormat.zzZrZ(), 4);
            }
            if (!com.aspose.words.internal.zzAN.zzZD(paragraphFormat.zzYou())) {
                zzluZzY.zzZ("-aw-element-frame-hspace", paragraphFormat.zzYou(), 4);
            }
            if (!com.aspose.words.internal.zzAN.zzZD(paragraphFormat.zzYot())) {
                zzluZzY.zzZ("-aw-element-frame-vspace", paragraphFormat.zzYot(), 4);
            }
            zzluZzY.zzZs("-aw-height-rule", zzZDY.zzyC(paragraphFormat.zzYpA()));
            if (paragraphFormat.zzYpo()) {
                zzluZzY.zzZs("-aw-element-anchor-lock", "locked");
            }
        }
        this.zzYt4.zzZ3C().zzV(zzluZzY);
    }

    public final void zzYZQ() {
        this.zzYt4.zzZ3E().zzp();
        this.zzYno = null;
        if (this.zzYnp != null) {
            this.zzYt4.zzZ3E().endElement("div");
            this.zzYnp = null;
        }
    }

    private void zzZ(Paragraph paragraph, zzLU zzlu, int i) {
        zzO0 zzo0;
        paragraph.getParagraphFormat().getFirstLineIndent();
        zzLU zzlu2 = new zzLU();
        if (i == 0) {
            zzO0 zzo0Zzk = new zzO0(zzlu).zzk(zzL5.zzQ(paragraph), paragraph.getParagraphFormat().getBidi());
            zzo0Zzk.setLeft(paragraph.getParagraphFormat().getFirstLineIndent() + zzo0Zzk.getLeft());
            zzo0 = zzo0Zzk.zzl(zzL5.zzQ(paragraph), paragraph.getParagraphFormat().getBidi());
        } else {
            zzo0 = new zzO0(0.0d, 0.0d, 0.0d, 0.0d);
        }
        zzo0.zzZ(zzlu2);
        new zzO0(0.0d, 0.0d, 0.0d, -paragraph.getParagraphFormat().getFirstLineIndent()).zzl(zzL5.zzQ(paragraph), paragraph.getParagraphFormat().getBidi()).zzZ(zzlu);
        zzPS zzpsZzZWe = zzlu.zzZWe();
        for (zzPT zzpt : zzYnr) {
            zzPT zzptZzSx = zzpsZzZWe.zzSx(zzpt.zzZWo());
            if (!zzptZzSx.zzZWj().zzX(zzpt.zzZWj())) {
                zzlu2.zzV(zzptZzSx);
                zzlu.zzV(zzpt);
            }
        }
        for (String str : zzYnq) {
            zzPT zzptZzSx2 = zzpsZzZWe.zzSx(str);
            if (zzptZzSx2 != null) {
                zzlu2.zzV(zzptZzSx2);
                zzlu.remove(str);
            }
        }
        this.zzYt4.zzZ3C().zzV(zzlu2);
    }

    private static String zzY(zzZGI zzzgi) {
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        List list = zzzgi.getList();
        ListLevel listLevel = zzzgi.getListLevel();
        for (int i = 0; i < listLevel.getNumberFormat().length(); i++) {
            char cCharAt = listLevel.getNumberFormat().charAt(i);
            if (ListLevel.zzYF(cCharAt) && !zzd4.zzVE(cCharAt)) {
                zzd4.add(cCharAt, list.getListLevels().get(cCharAt).getNumberStyle());
            }
        }
        int iZzYOa = listLevel.zzYOa();
        if (!zzd4.zzVE(iZzYOa)) {
            zzd4.add(iZzYOa, listLevel.getNumberStyle());
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 9; i2++) {
            if (zzd4.zzVE(i2)) {
                if (sb.length() > 0) {
                    sb.append(ControlChar.SPACE_CHAR);
                }
                com.aspose.words.internal.zzZNH.zzU(sb, zzZXP.zzFa(zzd4.get(i2)));
            }
        }
        return sb.toString();
    }
}
