package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz0G {
    private static int zzGD(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 4 ? 2 : 3;
        }
        return 1;
    }

    private static boolean zzOi(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (com.aspose.words.internal.zzUX.zzN(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static zzZ52 zzW(zz0E zz0e) {
        zz3K zz3k = (zz3K) com.aspose.words.internal.zzZKW.zzZ(zz0e, zz3K.class);
        if (zz3k != null) {
            return new zzZ52(com.aspose.words.internal.zzSA.zzr(zz3k.zzZwo().zzZsA()), 1);
        }
        zz3X zz3x = (zz3X) com.aspose.words.internal.zzZKW.zzZ(zz0e, zz3X.class);
        return zz3x != null ? new zzZ52((int) (zz3x.getValue() * ((double) com.aspose.words.internal.zzSA.zzr(12.0d))), 2) : new zzZ52(0, 0);
    }

    private static String zzX(zz4A zz4a) throws Exception {
        zz49 zz49VarZzZxp = zz4a.zzZxp();
        return com.aspose.words.internal.zzZKN.format("type={0};start={1};char='{2}';img={3}", Integer.valueOf(zz49VarZzZxp.zzZxl().zzZth()), Integer.valueOf(zz49VarZzZxp.zzZxl().getStartAt()), zz49VarZzZxp.zzZxl().zzZtf(), Integer.valueOf(zz49VarZzZxp.zzZxl().zzZtk() ? zz49VarZzZxp.zzZxl().zzZtg().getImageBytes().hashCode() : 0));
    }

    public static ShapeBase zzY(zz0J zz0j, com.aspose.words.internal.zzZQ4 zzzq4, DocumentBase documentBase) throws Exception {
        double d;
        double width;
        zz10 zz10VarZzZtK = zz0j.zzZCZ().zzZtK();
        int columnNumber = zz10VarZzZtK.getColumnNumber();
        double d2 = 12700.0d;
        if (columnNumber <= 1) {
            Shape shapeZzZ = zzZ(zz0j, documentBase, ((double) zzzq4.getWidth()) / 12700.0d, ((double) zzzq4.getHeight()) / 12700.0d, 0.0d, true);
            zzZ(shapeZzZ, zz10VarZzZtK);
            return shapeZzZ;
        }
        DocumentBase documentBase2 = documentBase;
        GroupShape groupShape = new GroupShape(documentBase2);
        groupShape.setWidth(((double) zzzq4.getWidth()) / 12700.0d);
        groupShape.setHeight(((double) zzzq4.getHeight()) / 12700.0d);
        double width2 = zzzq4.getWidth() / columnNumber;
        Shape[] shapeArr = new Shape[columnNumber];
        double d3 = 0.0d;
        int i = 0;
        while (i < columnNumber) {
            if (com.aspose.words.internal.zzAN.zzZD(groupShape.getWidth())) {
                width = (int) groupShape.zzY9d();
                d = d2;
            } else {
                d = d2;
                width = ((width2 / d2) / groupShape.getWidth()) * ((double) ((int) groupShape.zzY9d()));
            }
            double d4 = width;
            double d5 = width2;
            int i2 = i;
            Shape shapeZzZ2 = zzZ(zz0j, documentBase2, d4, (int) (groupShape.zzY9d() >>> 32), d3, i == 0);
            shapeArr[i2] = shapeZzZ2;
            shapeZzZ2.getTextBox().setInternalMarginLeft((((double) zz10VarZzZtK.zzZtx()) / d) / 2.0d);
            shapeArr[i2].getTextBox().setInternalMarginRight((((double) zz10VarZzZtK.zzZtx()) / d) / 2.0d);
            int i3 = i2 + 1;
            shapeArr[i2].setId(i3);
            if (columnNumber > shapeArr[i2].getId()) {
                Shape shape = shapeArr[i2];
                shape.zzmb(shape.getId() + 1);
            }
            groupShape.appendChild(shapeArr[i2]);
            d3 += d4;
            width2 = d5;
            i = i3;
            d2 = d;
            documentBase2 = documentBase;
        }
        double d6 = d2;
        shapeArr[0].getTextBox().setInternalMarginLeft(((double) zz10VarZzZtK.zzZtD()) / d6);
        int i4 = columnNumber - 1;
        shapeArr[i4].getTextBox().setInternalMarginRight(((double) zz10VarZzZtK.zzZtE()) / d6);
        zzZ(shapeArr[i4], zz10VarZzZtK);
        return groupShape;
    }

    private static Shape zzZ(zz0J zz0j, DocumentBase documentBase, double d, double d2, double d3, boolean z) throws Exception {
        zz10 zz10VarZzZtK = zz0j.zzZCZ().zzZtK();
        Shape shape = new Shape(documentBase, 202);
        shape.setWidth(d);
        shape.setHeight(d2);
        shape.setStroked(false);
        shape.setFilled(false);
        shape.getTextBox().setInternalMarginBottom(((double) zz10VarZzZtK.zzZtG()) / 12700.0d);
        shape.getTextBox().setInternalMarginLeft(((double) zz10VarZzZtK.zzZtD()) / 12700.0d);
        shape.getTextBox().setInternalMarginRight(((double) zz10VarZzZtK.zzZtE()) / 12700.0d);
        shape.getTextBox().setInternalMarginTop(((double) zz10VarZzZtK.zzZtF()) / 12700.0d);
        shape.getTextBox().zzHx(zzZZZ.zzGy(zz10VarZzZtK.zzMg()));
        shape.getTextBox().setLayoutFlow(zzZZZ.zz8(zz10VarZzZtK.zzZtu(), false));
        shape.getTextBox().setTextBoxWrapMode(zz10VarZzZtK.zzZts());
        shape.getTextBox().setFitShapeToText(zz10VarZzZtK.zzZtH() instanceof zz2K);
        shape.setLeft(d3);
        if (z) {
            zzZ(zz0j, shape);
        }
        zzZ(zz10VarZzZtK, shape);
        return shape;
    }

    private static void zzZ(zz10 zz10Var, Shape shape) {
        while (shape.getFirstParagraph() != null && !shape.getFirstParagraph().hasChildNodes() && shape.getFirstParagraph().isListItem()) {
            shape.getFirstParagraph().remove();
        }
        while (shape.getLastParagraph() != null && !shape.getLastParagraph().hasChildNodes() && shape.getLastParagraph().isListItem()) {
            shape.getLastParagraph().remove();
        }
        if (zz10Var.zzZtw()) {
            return;
        }
        Paragraph firstParagraph = shape.getFirstParagraph();
        if (firstParagraph != null) {
            firstParagraph.getParagraphFormat().setSpaceBefore(0.0d);
        }
        Paragraph lastParagraph = shape.getLastParagraph();
        if (lastParagraph != null) {
            lastParagraph.getParagraphFormat().setSpaceAfter(0.0d);
        }
    }

    private static void zzZ(Shape shape, zz10 zz10Var) {
        int iZzZtt = zz10Var.zzZtt();
        if (iZzZtt != 0) {
            if (iZzZtt == 2 && zz10Var.zzZts() != 2) {
                int id = shape.getId() + 1;
                shape.zzmb(shape.getId() + 1);
                Shape shape2 = (Shape) shape.deepClone(false);
                shape2.setId(id);
                shape2.zzmb(0);
                ((Document) shape.getDocument()).getFirstSection().getBody().getFirstParagraph().appendChild(shape2);
                return;
            }
            return;
        }
        shape.getTextBox().setFitShapeToText(true);
    }

    private static void zzZ(zz0J zz0j, Shape shape) throws Exception {
        com.aspose.words.internal.zzZYI zzzyi = new com.aspose.words.internal.zzZYI();
        Iterator<zz4A> it = zz0j.zzZCZ().zzMi().iterator();
        while (it.hasNext()) {
            shape.appendChild(zzZ(it.next(), shape.getDocument(), zzzyi));
        }
    }

    private static Paragraph zzZ(zz4A zz4a, DocumentBase documentBase, com.aspose.words.internal.zzZYI zzzyi) throws Exception {
        Paragraph paragraph = new Paragraph(documentBase);
        double dMax = 0.0d;
        for (zz47 zz47Var : zz4a.zzMf()) {
            dMax = Math.max(dMax, zz47Var.zzZx5().zzZvS().zzZsA());
            for (Node node : zzZ(zz47Var, documentBase)) {
                paragraph.appendChild(node);
            }
        }
        zzZ(paragraph, zz4a, dMax);
        zzZ(paragraph, zz4a, zzzyi);
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(paragraph.getLastChild(), zzZAM.class);
        if (zz4a.zzZxo().isEmpty() && zzzam != null) {
            paragraph.zzC(zzzam.getRunPr_IInline());
        }
        return paragraph;
    }

    private static void zzZ(Paragraph paragraph, zz4A zz4a, com.aspose.words.internal.zzZYI zzzyi) throws Exception {
        Object zz1c;
        zzU1 zzu1ZzZ;
        zz49 zz49VarZzZxp = zz4a.zzZxp();
        if (zz49VarZzZxp.getLevel() > 0 && zz49VarZzZxp.zzZxl() == null) {
            zz49VarZzZxp.zzZ(new zz0W());
            zz49VarZzZxp.zzZxl().zzOj("•");
        }
        if (zz49VarZzZxp.zzZxa()) {
            paragraph.zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(zzZ(zzzyi, zz4a, paragraph.getDocument())));
            boolean z = true;
            boolean z2 = zz49VarZzZxp.zzZxk() == null || zz49VarZzZxp.zzZxk().zzZtd();
            boolean z3 = zz49VarZzZxp.zzZxi() == null || zz49VarZzZxp.zzZxi().zzZtd();
            if (zz49VarZzZxp.zzZxj() != null && !zz49VarZzZxp.zzZxj().zzZtd()) {
                z = false;
            }
            zzYEF zzyefZzZYh = paragraph.zzYVe() != null ? paragraph.zzYVe().zzZYh() : paragraph.zzYp5();
            if (z2) {
                zz1c = (zz7X) zzZZZ.zzZC(zzyefZzZYh.zzPj(830));
            } else {
                zz1c = new zz1C(zz49VarZzZxp.zzZxk().zzZQX());
            }
            if (z3) {
                zzu1ZzZ = (zzU1) zzyefZzZYh.zzPj(230);
            } else {
                zzu1ZzZ = zzZ(zz49VarZzZxp.zzZxi().zzZw1(), paragraph.getDocument().zzZqI());
            }
            int size = z ? zzyefZzZYh.getSize() : zz49VarZzZxp.zzZxj().zzX(zzyefZzZYh);
            if (zz1c != null) {
                paragraph.zzYp5().zzQ(830, zz1c);
            }
            if (zzu1ZzZ != null) {
                paragraph.zzYp5().zzQ(230, zzu1ZzZ);
            }
            paragraph.zzYp5().zzQ(190, Integer.valueOf(size));
        }
    }

    private static int zzZ(com.aspose.words.internal.zzZYI zzzyi, zz4A zz4a, DocumentBase documentBase) throws Exception {
        List listAdd;
        String strZzX = zzX(zz4a);
        if (!zzzyi.containsKey(strZzX)) {
            zz0W zz0wZzZxl = zz4a.zzZxp().zzZxl();
            int iZzZth = zz0wZzZxl.zzZth();
            if (iZzZth == 1) {
                Shape shape = new Shape(documentBase, 75);
                shape.getImageData().setImageBytes(zz0wZzZxl.zzZtg().getImageBytes());
                shape.setWrapType(0);
                ImageSize imageSize = shape.getImageData().getImageSize();
                shape.zze(imageSize.getWidthPoints(), imageSize.getHeightPoints());
                int iZzo = documentBase.getLists().zzo(shape);
                listAdd = documentBase.getLists().add(0);
                listAdd.getListLevels().get(0).zzzp(iZzo);
            } else if (iZzZth != 2) {
                listAdd = documentBase.getLists().add(6);
                zzZ(listAdd.getListLevels().get(0), zz0wZzZxl.zzZth());
            } else {
                listAdd = documentBase.getLists().add(6);
                listAdd.getListLevels().get(0).setNumberFormat(Character.toString(zz0wZzZxl.zzZtf().charAt(0)));
            }
            TabStopCollection tabStopCollection = new TabStopCollection();
            tabStopCollection.add(new TabStop(0, 6, 0));
            listAdd.getListLevels().get(0).zzZYj().zzY(tabStopCollection);
            listAdd.getListLevels().get(0).zzZYj().zzQ(1160, 0);
            zzzyi.add(strZzX, listAdd.getListId());
        }
        return zzzyi.get(strZzX);
    }

    private static void zzZ(ListLevel listLevel, int i) {
        switch (i) {
            case 3:
                listLevel.setNumberStyle(4);
                listLevel.setNumberFormat("(\u0000)");
                break;
            case 4:
                listLevel.setNumberStyle(3);
                listLevel.setNumberFormat("(\u0000)");
                break;
            case 5:
                listLevel.setNumberStyle(4);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 6:
                listLevel.setNumberStyle(3);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 7:
                listLevel.setNumberStyle(4);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 8:
                listLevel.setNumberStyle(3);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 9:
                listLevel.setNumberStyle(0);
                listLevel.setNumberFormat("(\u0000)");
                break;
            case 10:
                listLevel.setNumberStyle(0);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 11:
                listLevel.setNumberStyle(0);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 12:
                listLevel.setNumberStyle(0);
                listLevel.setNumberFormat("\u0000");
                break;
            case 13:
                listLevel.setNumberStyle(2);
                listLevel.setNumberFormat("(\u0000)");
                break;
            case 14:
                listLevel.setNumberStyle(1);
                listLevel.setNumberFormat("(\u0000)");
                break;
            case 15:
                listLevel.setNumberStyle(2);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 16:
                listLevel.setNumberStyle(1);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 17:
                listLevel.setNumberStyle(2);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 18:
                listLevel.setNumberStyle(1);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 19:
                listLevel.setNumberStyle(18);
                listLevel.setNumberFormat("\u0000");
                break;
            case 20:
                listLevel.setNumberStyle(18);
                listLevel.setNumberFormat("\u0000");
                break;
            case 21:
                listLevel.setNumberStyle(18);
                listLevel.setNumberFormat("\u0000");
                break;
            case 22:
                listLevel.setNumberStyle(0);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 23:
                listLevel.setNumberStyle(0);
                listLevel.setNumberFormat("\u0000");
                break;
            case 24:
                listLevel.setNumberStyle(39);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 25:
                listLevel.setNumberStyle(39);
                listLevel.setNumberFormat("\u0000");
                break;
            case 26:
                listLevel.setNumberStyle(35);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 27:
                listLevel.setNumberStyle(35);
                listLevel.setNumberFormat("\u0000");
                break;
            case 28:
                listLevel.setNumberStyle(10);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 29:
                listLevel.setNumberStyle(42);
                listLevel.setNumberFormat("\u0000");
                break;
            case 30:
                listLevel.setNumberStyle(42);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 31:
                listLevel.setNumberStyle(46);
                listLevel.setNumberFormat("\u0000-");
                break;
            case 32:
                listLevel.setNumberStyle(48);
                listLevel.setNumberFormat("\u0000-");
                break;
            case 33:
                listLevel.setNumberStyle(45);
                listLevel.setNumberFormat("\u0000-");
                break;
            case 34:
                listLevel.setNumberStyle(55);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 35:
                listLevel.setNumberStyle(55);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 36:
                listLevel.setNumberStyle(55);
                listLevel.setNumberFormat("(\u0000)");
                break;
            case 37:
                listLevel.setNumberStyle(54);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 38:
                listLevel.setNumberStyle(54);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 39:
                listLevel.setNumberStyle(54);
                listLevel.setNumberFormat("(\u0000)");
                break;
            case 40:
                listLevel.setNumberStyle(52);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 41:
                listLevel.setNumberStyle(51);
                listLevel.setNumberFormat("\u0000.");
                break;
            case 42:
                listLevel.setNumberStyle(51);
                listLevel.setNumberFormat("\u0000)");
                break;
            case 43:
                listLevel.setNumberStyle(49);
                listLevel.setNumberFormat("\u0000.");
                break;
        }
    }

    private static Node[] zzZ(zz47 zz47Var, DocumentBase documentBase) {
        zz31 zz31Var = (zz31) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz31.class);
        if (zz31Var != null) {
            return zzZ(zz31Var, documentBase);
        }
        zz0X zz0x = (zz0X) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz0X.class);
        if (zz0x != null) {
            return zzZ(zz0x, documentBase);
        }
        zz0M zz0m = (zz0M) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz0M.class);
        if (zz0m != null) {
            return zzZ(zz0m, documentBase);
        }
        zz0P zz0p = (zz0P) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz0P.class);
        if (zz0p != null) {
            return zzZ(zz0p, documentBase);
        }
        return new Node[0];
    }

    private static Node[] zzZ(zz0P zz0p, DocumentBase documentBase) {
        return new Node[]{new Run(documentBase, zz0p.getText(), zzYED.zzZ(zz0p.zzZx5(), documentBase.zzZqI()))};
    }

    private static Node[] zzZ(zz0M zz0m, DocumentBase documentBase) {
        OfficeMath officeMath = new OfficeMath(documentBase, zz0m.zzZsL());
        zzYED.zzZ(zz0m.zzZx5(), documentBase.zzZqI()).zzY(officeMath.zzZYh());
        Iterator<zz47> it = zz0m.zzMf().iterator();
        while (it.hasNext()) {
            for (Node node : zzZ(it.next(), documentBase)) {
                officeMath.appendChild(node);
            }
        }
        return new Node[]{officeMath};
    }

    private static Node[] zzZ(zz31 zz31Var, DocumentBase documentBase) {
        zzYEF zzyefZzZ = zzYED.zzZ(zz31Var.zzZx5(), documentBase.zzZqI());
        String strReplace = zz31Var.getText().replace(ControlChar.CR_LF, ControlChar.LINE_BREAK);
        if (!zzOi(strReplace)) {
            return new Node[]{zzZ(documentBase, strReplace, zzyefZzZ)};
        }
        ArrayList<com.aspose.words.internal.zzY3> arrayListZzK = new com.aspose.words.internal.zzY4(strReplace, -1, null).zzK(zz31Var.zzZx6().zzZxp().zzZxe());
        Node[] nodeArr = new Node[arrayListZzK.size()];
        for (int i = 0; i < arrayListZzK.size(); i++) {
            com.aspose.words.internal.zzY3 zzy3 = arrayListZzK.get(i);
            Run runZzZ = zzZ(documentBase, zzy3.getText(), (zzYEF) zzyefZzZ.zzbn());
            if (zzy3.zzXn()) {
                runZzZ.zzZYh().zzQ(StyleIdentifier.BIBLIOGRAPHY, zzZU.zzZF6);
                runZzZ.zzZYh().zzvA(runZzZ.zzZYh().getSize());
                runZzZ.zzZYh().zzY(runZzZ.zzZYh().zzYe1());
                runZzZ.zzZYh().zzX(runZzZ.zzZYh().zzYe0());
            }
            nodeArr[i] = runZzZ;
        }
        return nodeArr;
    }

    private static Run zzZ(DocumentBase documentBase, String str, zzYEF zzyef) {
        Run run = new Run(documentBase, str, zzyef);
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            return run;
        }
        String strZzXG = zzY4R.zzXG(str.charAt(0));
        String eastAsian = ((Document) documentBase).getTheme().getMinorFonts().getEastAsian();
        if (!"Courier New".equals(strZzXG) && zzyef.getLocaleId() != 1024 && zzyef.getLocaleId() != 0 && zzyef.zzYdA() && com.aspose.words.internal.zzZKN.zzU3(eastAsian)) {
            run.getFont().setNameFarEast(strZzXG);
        }
        return run;
    }

    private static Node[] zzZ(zz0X zz0x, DocumentBase documentBase) {
        Run run = new Run(documentBase, ControlChar.LINE_BREAK);
        zzYED.zzZ(zz0x.zzZx5(), documentBase.zzZqI()).zzY(run.zzZYh());
        return new Node[]{run};
    }

    private static void zzZ(Paragraph paragraph, zz4A zz4a, double d) {
        paragraph.zzZYj().zzQ(1470, Boolean.FALSE);
        zzYED.zzZ(zz4a.zzZxo(), paragraph.getDocument().zzZqI()).zzY(paragraph.zzYp5());
        paragraph.zzZYj().zzQ(1200, Integer.valueOf(zzZ(d, zz4a.zzZxp().zzZxb())));
        paragraph.zzZYj().zzQ(1220, Integer.valueOf(zzZ(d, zz4a.zzZxp().zzZxc())));
        paragraph.zzZYj().zzQ(1650, zzW(zz4a.zzZxp().zzZxd()));
        paragraph.zzZYj().zzQ(PointerIconCompat.TYPE_GRAB, Integer.valueOf(zz4a.zzZxp().getAlignment()));
        paragraph.zzZYj().zzQ(1510, Integer.valueOf(zzGD(zz4a.zzZxp().zzZxg())));
        int iZzYD = com.aspose.words.internal.zzSA.zzYD(zz4a.zzZxp().zzZxf());
        int iZzYD2 = com.aspose.words.internal.zzSA.zzYD(zz4a.zzZxp().zzZRi());
        if (iZzYD < 0 && !zz4a.zzZxp().zzZxa()) {
            iZzYD = -iZzYD2;
        }
        paragraph.zzZYj().zzQ(EditingLanguage.CENTRAL_KURDISH_IRAQ, Integer.valueOf(iZzYD));
        paragraph.zzZYj().zzQ(1160, Integer.valueOf(iZzYD2));
        paragraph.zzZYj().zzQ(EditingLanguage.BRETON, Integer.valueOf(com.aspose.words.internal.zzSA.zzYD(zz4a.zzZxp().zzZRh())));
        paragraph.zzZYj().zzQ(1560, Boolean.valueOf(zz4a.zzZxp().zzZxe()));
        TabStopCollection tabStopCollection = new TabStopCollection();
        tabStopCollection.add(new TabStop((zz4a.zzZxp().zzZxa() || zz4a.zzZxp().getLevel() != 0) ? 0.0d : ((double) zz4a.zzZxp().zzZxh()) / 12700.0d, 0, 0));
        paragraph.zzZYj().zzY(tabStopCollection);
        if (tabStopCollection.get(0).getPosition() >= 0.0d) {
            ((Document) paragraph.getDocument()).setDefaultTabStop(tabStopCollection.get(0).getPosition());
        }
    }

    private static zzU1 zzZ(zz7P zz7p, Theme theme) {
        String strZzZ = zz7p != null ? zz0O.zzZ(zz7p.zzZAY(), theme) : "";
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            return zzU1.zzSP(strZzZ);
        }
        return zzU1.zzMW(131073);
    }

    private static int zzZ(double d, zz0E zz0e) {
        zz3K zz3k = (zz3K) com.aspose.words.internal.zzZKW.zzZ(zz0e, zz3K.class);
        if (zz3k != null) {
            return com.aspose.words.internal.zzSA.zzr(zz3k.zzZwo().zzZsA());
        }
        zz3X zz3x = (zz3X) com.aspose.words.internal.zzZKW.zzZ(zz0e, zz3X.class);
        if (zz3x != null) {
            return com.aspose.words.internal.zzSA.zzr(zz3x.getValue() * d);
        }
        return 0;
    }
}
