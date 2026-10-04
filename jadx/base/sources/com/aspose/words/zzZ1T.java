package com.aspose.words;

import android.graphics.Color;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1T {
    private int zzY3e;
    private int zzY3f;
    private int zzY3g;
    private int zzY3h;
    private int zzY3i;
    private int zzY3j;
    private int zzY3k;
    private int zzY3l;
    private com.aspose.words.internal.zzD3<List> zzY3q;
    private zzYI zzY3r;
    private Footnote zzYqa;
    private DocumentBuilder zzZwh;
    private com.aspose.words.internal.zzD3<Style> zzY3p = new com.aspose.words.internal.zzD3<>();
    private List[] zzY3o = new List[9];
    private com.aspose.words.internal.zzD3<zzTI> zzY3n = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzZYI zzY3m = new com.aspose.words.internal.zzZYI(3);

    public zzZ1T(Document document) {
        DocumentBuilder documentBuilder = new DocumentBuilder(document);
        this.zzZwh = documentBuilder;
        documentBuilder.setBold(false);
        this.zzZwh.setItalic(false);
        this.zzZwh.getFont().setStrikeThrough(false);
        document.getStyles().zzY36().zzw3(160);
        zzYEF zzyefZzY37 = document.getStyles().zzY37();
        zzyefZzY37.setName("Calibri");
        zzyefZzY37.setSize(22);
        zzyefZzY37.zzvA(22);
        Style styleZz0 = this.zzZwh.getDocument().getStyles().zz0("Normal", true);
        styleZz0.zzZYh().remove(190);
        styleZz0.zzZYh().remove(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
    }

    private void clearFormatting() {
        this.zzZwh.zzZpC();
        this.zzZwh.getCurrentParagraph().zzZYj().clear();
        this.zzY3l = 0;
        this.zzY3k = 0;
        this.zzY3j = 0;
        this.zzY3i = 0;
    }

    private static void zzO(Style style) {
        Shading shading = new Shading();
        shading.setForegroundPatternColor(Color.rgb(226, 226, 226));
        shading.setTexture(1);
        style.zzZYj().zzZ(shading);
        style.zzZYh().setName("Consolas");
        style.zzZYh().setSize(20);
        style.zzZYh().zzvA(20);
    }

    private String zzP(zzYI zzyi) {
        String str;
        String str2;
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 18) {
            str = "Quote";
        } else if (bZzkz == 22) {
            str = "Footnote Text";
        } else {
            if (bZzkz != 26 && bZzkz != 27) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + com.aspose.words.internal.zzZKN.format("Unexpected block type: {0}", Byte.valueOf(zzyi.zzkz())));
            }
            str = "List";
        }
        int i = this.zzY3m.get(str);
        int i2 = 1;
        if (com.aspose.words.internal.zzZYI.zzWm(i)) {
            str2 = str;
        } else {
            str2 = com.aspose.words.internal.zzZKN.format("{0}{1}", str, Integer.valueOf(i));
            i2 = 1 + i;
        }
        this.zzY3m.set(str, i2);
        return str2;
    }

    private String zzQ(zzYI zzyi) {
        switch (zzyi.zzkz()) {
            case 16:
                return com.aspose.words.internal.zzZKN.format("{0} {1}", "Heading", Integer.valueOf(((zzZKT) zzyi).getLevel()));
            case 17:
                return com.aspose.words.internal.zzZKN.format("{0}{1}", "SetextHeading", Integer.valueOf(((zzZKT) zzyi).getLevel()));
            case 18:
            case 22:
            case 26:
            case 27:
                return zzP(zzyi);
            case 19:
            case 20:
            case 21:
            case 23:
            default:
                return "Normal";
            case 24:
                return "IndentedCode";
            case 25:
                String info = ((zzZRD) zzyi).getInfo();
                return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", "FencedCode", info.length() > 0 ? "." : "", info);
        }
    }

    private Style zzR(zzYI zzyi) {
        Style styleZzR = null;
        zzYI zzyi2 = null;
        int iZzZ = 0;
        boolean z = false;
        while (zzyi != null && zzyi.zzkz() != 0) {
            iZzZ = zzZ(zzyi, iZzZ);
            Style style = this.zzY3p.get(iZzZ);
            if (style == null) {
                byte bZzkz = zzyi.zzkz();
                if (bZzkz == 17) {
                    zzZO zzzo = new zzZO();
                    zzzo.setLevel(((zzZKT) zzyi).getLevel());
                    styleZzR = zzR(zzzo);
                } else if ((bZzkz == 26 || bZzkz == 27) && zzyi2 != null && (zzyi2.zzb4() == 2 || !zzyi2.zz9I())) {
                    z = true;
                }
                if (z) {
                    z = false;
                } else {
                    Style styleZzZ = zzZ(zzyi, styleZzR);
                    styleZzR = styleZzZ == null ? zzZ(zzyi, styleZzR, iZzZ) : styleZzZ;
                }
            } else {
                styleZzR = style;
            }
            zzyi2 = zzyi;
            zzyi = zzyi.zz9J();
        }
        return styleZzR;
    }

    private List zzY(zzZ4G zzz4g) {
        List listZzZ = zzZ(zzz4g);
        if (listZzZ == null) {
            listZzZ = this.zzZwh.getDocument().getLists().zzxt(2);
            this.zzY3n.add(listZzZ.getListId(), zzz4g.zzYOH());
        }
        int level = zzz4g.getLevel();
        if (listZzZ.getListLevels().get(level).getNumberFormat().length() == 0) {
            zzZ(listZzZ, level, zzz4g);
        }
        return listZzZ;
    }

    private void zzYHR() {
        this.zzZwh.popFont();
        this.zzZwh.zzZpI();
        this.zzY3l = this.zzY3h;
        this.zzY3k = this.zzY3g;
        this.zzY3j = this.zzY3f;
        this.zzY3i = this.zzY3e;
    }

    private void zzYHS() {
        this.zzZwh.pushFont();
        this.zzZwh.zzZpJ();
        this.zzY3h = this.zzY3l;
        this.zzY3g = this.zzY3k;
        this.zzY3f = this.zzY3j;
        this.zzY3e = this.zzY3i;
    }

    private com.aspose.words.internal.zzD3<List> zzYHT() {
        if (this.zzY3q == null) {
            this.zzY3q = new com.aspose.words.internal.zzD3<>(4);
        }
        return this.zzY3q;
    }

    private void zzYHU() {
        Paragraph paragraph;
        if (this.zzYqa.getParagraphs().getCount() == 1 && this.zzYqa.getParagraphs().get(0).getChildNodes(0, false).getCount() == 1) {
            paragraph = this.zzYqa.getParagraphs().get(0);
        } else {
            paragraph = new Paragraph(this.zzZwh.getDocument());
            this.zzYqa.getParagraphs().add(paragraph);
        }
        this.zzZwh.moveTo(paragraph);
        if (this.zzYqa.getParagraphs().getCount() == 1) {
            this.zzZwh.write(" ");
        }
    }

    private Style zzZ(zzYI zzyi, Style style, int i) {
        Style styleZzZv = zzZv(zzQ(zzyi), 1);
        if (styleZzZv.getStyleIdentifier() != 0 && style != null) {
            styleZzZv.zzl5(style.zzZ7j());
        }
        zzZ(styleZzZv, zzyi);
        this.zzY3p.add(i, styleZzZv);
        return styleZzZv;
    }

    private Style zzZv(String str, int i) {
        Style styleZz0 = this.zzZwh.getDocument().getStyles().zz0(str, true);
        return styleZz0 == null ? this.zzZwh.getDocument().getStyles().add(i, str) : styleZz0;
    }

    private List zzuZ(int i) {
        List listZzY = zzZ4H.zzY(this.zzZwh.getDocument().getLists(), 0);
        listZzY.getListLevels().get(0).zzZYh().zzBp("Courier New");
        String string = Character.toString(zzZ1N.zzuX(i));
        listZzY.getListLevels().get(0).setNumberFormat(string);
        if (i == 0) {
            for (int i2 = 1; i2 < 9; i2++) {
                listZzY.getListLevels().get(i2).setNumberFormat(string);
            }
        }
        return listZzY;
    }

    private List zzv0(int i) {
        List listZzv1 = zzv1(i);
        if (listZzv1 != null) {
            return listZzv1;
        }
        List listZzuZ = zzuZ(i);
        zzYHT().add(i, listZzuZ);
        return listZzuZ;
    }

    private List zzv1(int i) {
        List list = zzYHT().get(i);
        if (list == null) {
            return null;
        }
        return list;
    }

    public final void zzS(zzYI zzyi) {
        Node previousSibling;
        switch (zzyi.zzkz()) {
            case 0:
                Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getDocument().getLastSection().getBody().getLastChild(), Paragraph.class);
                if (paragraph != null && !paragraph.hasChildNodes() && (previousSibling = paragraph.getPreviousSibling()) != null && previousSibling.getNodeType() == 8) {
                    paragraph.remove();
                }
                break;
            case 2:
                int i = this.zzY3l - 1;
                this.zzY3l = i;
                this.zzZwh.setBold(i > 0);
                break;
            case 3:
                int i2 = this.zzY3k - 1;
                this.zzY3k = i2;
                this.zzZwh.setItalic(i2 > 0);
                break;
            case 4:
            case 7:
                this.zzZwh.getFont().setStyle(this.zzZwh.getDocument().getStyles().zzZ7(65, true));
                break;
            case 5:
                this.zzY3j--;
                this.zzZwh.getFont().setStrikeThrough(this.zzY3j > 0);
                break;
            case 6:
                int i3 = this.zzY3i - 1;
                this.zzY3i = i3;
                if (i3 == 0) {
                    this.zzZwh.getFont().setUnderline(0);
                }
                break;
            case 9:
                if (((zzZ4R) zzyi).zzYm0() != null) {
                    this.zzZwh.zzZpH();
                    this.zzZwh.getFont().setStyle(this.zzZwh.getDocument().getStyles().zzZ7(65, true));
                }
                break;
            case 11:
                this.zzZwh.moveTo(this.zzYqa.getParentParagraph());
                this.zzYqa = null;
                zzYHR();
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 24:
            case 25:
                Style styleZzR = zzR(zzyi);
                zzYMX zzymxZzZYj = this.zzZwh.getCurrentParagraph().zzZYj();
                zzymxZzZYj.set(1000, Integer.valueOf(styleZzR.zzZ7j()));
                zzZ(zzymxZzZYj, zzyi);
                if (this.zzYqa == null) {
                    this.zzZwh.writeln();
                }
                break;
            case 18:
                this.zzZwh.getParagraphFormat().setStyle(zzZv("Normal", 1));
                break;
            case 20:
                zzYIF zzyif = (zzYIF) zzyi;
                zzY71 zzy71 = (zzY71) zzyif.zzz((byte) 21);
                for (int count = zzyif.getCount(); count < zzy71.getColumnsCount(); count++) {
                    this.zzZwh.insertCell().getFirstParagraph().zzZYj().setAlignment(((zzWX) zzy71.zzXZW().zzMH(count)).getAlignment());
                }
                this.zzZwh.endRow();
                break;
            case 21:
                this.zzZwh.endTable();
                zzQ(this.zzZwh.getCurrentParagraph().zzZYj());
                break;
        }
        this.zzY3r = zzyi;
    }

    public final void zzT(zzYI zzyi) {
        zzYI zzyi2;
        switch (zzyi.zzkz()) {
            case 2:
                this.zzZwh.setBold(true);
                this.zzY3l++;
                break;
            case 3:
                this.zzZwh.setItalic(true);
                this.zzY3k++;
                break;
            case 4:
                Style styleZzZv = zzZv(zzZ((zzZ7U) zzyi), 2);
                this.zzZwh.getFont().setStyle(styleZzZv);
                zzP(styleZzZv);
                break;
            case 5:
                this.zzZwh.getFont().setStrikeThrough(true);
                this.zzY3j++;
                break;
            case 6:
                this.zzZwh.getFont().setUnderline(1);
                this.zzY3i++;
                break;
            case 7:
                this.zzZwh.getFont().setStyle(this.zzZwh.getDocument().getStyles().zzZ7(85, true));
                break;
            case 9:
                zzZ4R zzz4r = (zzZ4R) zzyi;
                zzZ4X zzz4xZzYm0 = zzz4r.zzYm0();
                if (zzz4xZzYm0 != null) {
                    this.zzZwh.getFont().setStyle(this.zzZwh.getDocument().getStyles().zzZ7(85, true));
                    this.zzZwh.zzZ(new zzZQX(com.aspose.words.internal.zzZVR.zzWH(zzz4xZzYm0.getUri()), com.aspose.words.internal.zzZVR.zzWG(zzz4xZzYm0.getUri()), zzz4xZzYm0.getTitle(), "", zzz4r.zzYm4(), false));
                }
                break;
            case 11:
                this.zzYqa = this.zzZwh.insertFootnote(0, "", null);
                zzYHS();
                clearFormatting();
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 24:
            case 25:
                if (this.zzYqa != null) {
                    zzYHU();
                }
                break;
            case 18:
                if (zzyi.zz9J().zzkz() == 0 && (zzyi2 = this.zzY3r) != null && zzyi2.zzkz() == 18) {
                    this.zzZwh.writeln();
                    this.zzZwh.getParagraphFormat().setStyle(zzZv("Normal", 1));
                    break;
                }
                break;
            case 19:
                zzYMX zzymxZzZYj = this.zzZwh.insertCell().getFirstParagraph().zzZYj();
                zzymxZzZYj.setAlignment(((zzWX) zzyi).getAlignment());
                zzQ(zzymxZzZYj);
                break;
            case 21:
                zzYI zzyi3 = this.zzY3r;
                if (zzyi3 != null && zzyi3.zzkz() == 21) {
                    this.zzZwh.writeln();
                }
                this.zzZwh.getParagraphFormat().setStyle(zzZv("Normal", 1));
                break;
        }
    }

    public final DocumentBuilder zzZ3K() {
        return this.zzZwh;
    }

    private static int zzZ(zzYI zzyi, int i) {
        int iZzkz;
        int iZzkz2;
        int level;
        byte bZzkz = zzyi.zzkz();
        switch (bZzkz) {
            case 15:
                iZzkz = 14;
                break;
            case 16:
            case 17:
                iZzkz2 = zzyi.zzkz() * 397;
                level = ((zzZKT) zzyi).getLevel();
                iZzkz = level ^ iZzkz2;
                break;
            default:
                switch (bZzkz) {
                    case 25:
                        iZzkz2 = zzyi.zzkz() * 397;
                        level = ((zzZRD) zzyi).getInfo().hashCode();
                        iZzkz = level ^ iZzkz2;
                        break;
                    case 26:
                    case 27:
                        zzZ4G zzz4g = (zzZ4G) zzyi;
                        iZzkz = (((((zzyi.zzkz() * 397) ^ zzz4g.getStartAt()) * 397) ^ zzz4g.zzYOG()) * 397) ^ zzz4g.getLevel();
                        break;
                    default:
                        iZzkz = zzyi.zzkz();
                        break;
                }
                break;
        }
        return iZzkz ^ (i * 397);
    }

    private static void zzP(Style style) {
        style.zzZYh().setName("Consolas");
        style.zzZYh().zzY(com.aspose.words.internal.zzPV.zzS(199, 37, 78));
        style.zzZYh().zzQ(20, com.aspose.words.internal.zzPV.zzS(StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, 242, 244));
        style.zzZYh().setSize(20);
        style.zzZYh().zzvA(20);
    }

    private static void zzQ(Style style) {
        style.zzZYj().zzM(new Border(1, 18, com.aspose.words.internal.zzPV.zzS(159, 159, 159)));
    }

    private void zzQ(zzYMX zzymx) {
        int iIntValue = ((Integer) zzymx.zzPj(EditingLanguage.KASHMIRI_ARABIC)).intValue();
        if (iIntValue != 0) {
            this.zzY3n.zzVG(iIntValue);
        }
        zzymx.remove(EditingLanguage.KASHMIRI_ARABIC);
        zzymx.remove(EditingLanguage.GALICIAN);
    }

    private Style zzZ(zzYI zzyi, Style style) {
        int level;
        String str;
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 18) {
            level = -1;
            str = "Quote";
        } else {
            if (bZzkz != 26 && bZzkz != 27) {
                return null;
            }
            level = ((zzZ4G) zzyi).getLevel();
            str = "List";
        }
        return zzZ(zzyi, style, str, level);
    }

    private Style zzZ(zzYI zzyi, Style style, String str, int i) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        for (Style style2 : this.zzY3p.zzCJ()) {
            if (com.aspose.words.internal.zzZKN.zzS(style2.getName(), str, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) && style2.zzY3j() == style) {
                List listZzY39 = style2.zzY39();
                if (i != -1 || listZzY39 != null) {
                    if (i != -1 && listZzY39 != null && (((Integer) style2.zzZYj().zzPj(EditingLanguage.GALICIAN)).intValue() == i || zzyi.zzkz() == 26)) {
                        if (zzZ(listZzY39, (zzZ4G) zzyi)) {
                        }
                    }
                }
                return style2;
            }
        }
        return null;
    }

    private static String zzZ(zzZ7U zzz7u) {
        return com.aspose.words.internal.zzZKN.format("{0}{1}", "InlineCode", zzz7u.zzYUS() > 1 ? com.aspose.words.internal.zzZKN.format(".{0}", Integer.valueOf(zzz7u.zzYUS())) : "");
    }

    private void zzZ(Style style, zzYI zzyi) {
        byte bZzkz = zzyi.zzkz();
        if (bZzkz == 4) {
            zzP(style);
            return;
        }
        if (bZzkz != 18) {
            switch (bZzkz) {
                case 24:
                case 25:
                    zzO(style);
                    break;
                case 26:
                    zzZ(style, (zzXK) zzyi);
                    break;
                case 27:
                    zzZ(style, (zzYNK) zzyi);
                    break;
            }
            return;
        }
        zzQ(style);
    }

    private void zzZ(Style style, zzXK zzxk) {
        style.zzZYj().zzxC(zzv0(zzxk.zzYOG()).getListId());
        style.zzZYj().zzrM(zzxk.getLevel());
    }

    private void zzZ(Style style, zzYNK zzynk) {
        zzZ(style.zzZYj(), zzynk);
    }

    private boolean zzZ(List list, zzZ4G zzz4g) {
        if (list == null) {
            return false;
        }
        if (zzz4g.zzkz() == 27 && zzz4g.zzYOH() != this.zzY3n.get(list.getListId())) {
            return false;
        }
        ListLevel listLevel = list.getListLevels().get(zzz4g.zzkz() == 27 ? zzz4g.getLevel() : 0);
        if (listLevel.getNumberFormat().length() == 0) {
            return true;
        }
        if (zzz4g.zzYOG() != zzZ1N.zzYE(listLevel.getNumberFormat().charAt(listLevel.getNumberFormat().length() - 1))) {
            return false;
        }
        return (zzz4g.zzkz() == 27 && zzz4g.zzYOF() && listLevel.getStartAt() != zzz4g.getStartAt()) ? false : true;
    }

    private void zzZ(zzYMX zzymx, zzYI zzyi) {
        zzZ4G zzz4g = (zzZ4G) com.aspose.words.internal.zzZKW.zzZ(zzyi, zzZ4G.class);
        if (zzz4g == null) {
            zzz4g = (zzZ4G) zzyi.zzYE(26, 27);
        }
        if (zzz4g != null) {
            zzZ(zzymx, zzyi, zzz4g);
        } else {
            zzQ(zzymx);
        }
    }

    private void zzZ(zzYMX zzymx, zzYI zzyi, zzZ4G zzz4g) {
        List listZzY;
        int iZzYOG = ((zzyi.zz9J() == zzz4g && zzyi.zz9I()) || zzyi == zzz4g) ? zzz4g.zzYOG() : 0;
        if (iZzYOG != 4 && iZzYOG != 5) {
            listZzY = zzv0(iZzYOG);
        } else {
            listZzY = zzY(zzz4g);
        }
        int level = zzz4g.getLevel();
        if (iZzYOG != 0) {
            this.zzY3o[level] = listZzY;
        }
        zzymx.set(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(listZzY.getListId()));
        zzymx.set(EditingLanguage.GALICIAN, Integer.valueOf(level));
    }

    private List zzZ(zzZ4G zzz4g) {
        int level = zzz4g.getLevel();
        List[] listArr = this.zzY3o;
        List list = listArr[level];
        if (list == null && level > 0) {
            list = listArr[level - 1];
        }
        if (zzZ(list, zzz4g)) {
            return list;
        }
        return null;
    }

    private static void zzZ(List list, int i, zzZ4G zzz4g) {
        int i2 = (i + 1) * 720;
        zzZ4C.zzZ(list, i, 0, com.aspose.words.internal.zzZKN.format("{0}{1}", Character.valueOf((char) i), Character.valueOf(zzZ1N.zzuX(zzz4g.zzYOG()))), 0, i2, i2, -360);
        list.getListLevels().get(i).setStartAt(zzz4g.getStartAt());
    }
}
