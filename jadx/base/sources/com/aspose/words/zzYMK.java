package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMK {
    private int zzCR;
    private zzZ37 zzXGc;
    private zzZ3C zzXGd;
    private int zzXGe;
    private boolean zzXGf;
    private zzZ31 zzY8T;
    private zzZ6R zzZEV;
    private zzX6 zzZEX;
    private static int[] zzXGh = {1292, 1302, 1290, 1320, 1300, 1330};
    private static int[] zzXGg = {4170, 4190, 4180, 4150, 4200, 4160};

    public zzYMK(zzX6 zzx6, zzZ6R zzz6r) {
        this.zzZEX = zzx6;
        this.zzZEV = zzz6r;
    }

    private boolean zz8(int i, Object obj) {
        int i2;
        if (i == 1350) {
            i2 = 3;
        } else if (i != 1360) {
            i2 = 0;
            if (i != 1370) {
                if (i == 1380) {
                    i2 = 2;
                } else if (i == 1390) {
                    i2 = 4;
                } else {
                    if (i != 1400) {
                        return false;
                    }
                    i2 = 5;
                }
            }
        } else {
            i2 = 1;
        }
        Border border = (Border) obj;
        this.zzXGd.zzZ(i2, zzZ3D.zzZ(this.zzZEX, (float) border.zz8U(), border.getLineStyle(), border.zz8Q(), (float) border.getDistanceFromText(), border.getShadow(), border.zz8P(), border.zz8F(), false));
        return true;
    }

    private boolean zz9(int i, Object obj) {
        switch (i) {
            case 1290:
                this.zzXGf = false;
                this.zzXGc.zzYLJ().setHorizontalAlignment(((Integer) obj).intValue());
                return true;
            case 1292:
                this.zzXGf = false;
                this.zzXGc.zzYLJ().setLeft(((Integer) obj).intValue() * 50);
                return true;
            case 1300:
                this.zzXGc.zzYLJ().setVerticalAlignment(((Integer) obj).intValue());
                return true;
            case 1302:
                this.zzXGc.zzYLJ().setTop(((Integer) obj).intValue() * 50);
                return true;
            case 1310:
                if (((Integer) obj).intValue() <= 0) {
                    obj = Integer.MIN_VALUE;
                }
                this.zzXGc.zzYLJ().setWidth(((Integer) obj).intValue() * 50);
                return true;
            case 1320:
                this.zzXGc.zzYLJ().zzwe(((Integer) obj).intValue());
                return true;
            case 1330:
                this.zzXGc.zzYLJ().zzwd(((Integer) obj).intValue());
                return true;
            case 1340:
                this.zzXGc.zzYLJ().setWrapType(((Integer) obj).intValue());
                return true;
            case 1430:
                zzZKP zzzkp = (zzZKP) obj;
                this.zzCR = zzzkp.getValue();
                this.zzXGe = zzzkp.zzZ4A();
                return true;
            case 1480:
                this.zzXGc.zzYLJ().setOrientation(((Integer) obj).intValue());
                return true;
            case 1490:
                int iIntValue = ((Integer) obj).intValue() * 50;
                this.zzXGc.zzYLJ().zzwh(iIntValue);
                this.zzXGc.zzYLJ().zzwf(iIntValue);
                return true;
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                int iIntValue2 = ((Integer) obj).intValue() * 50;
                this.zzXGc.zzYLJ().zzwi(iIntValue2);
                this.zzXGc.zzYLJ().zzwg(iIntValue2);
                return true;
            default:
                return false;
        }
    }

    private static zzYMX zzU(Row row, int i) {
        return row.getLastCell().getLastParagraph().zzqw(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzXa(Node node) {
        return (node instanceof zzZAM) && !zzZ7R.zzW((zzZ9G) node, 130);
    }

    private static boolean zzXb(Node node) {
        return node.getNodeType() == 22 || node.getNodeType() == 23 || node.getNodeType() == 24;
    }

    private static boolean zzXc(Node node) {
        if (node.getNodeType() == 8 && node.zzYB4() == null && node.getAncestor(7) != null) {
            if (node.getParentNode().getNodeType() == 28) {
                return true;
            }
            if (node.getParentNode().getNodeType() != 7) {
                return false;
            }
            CompositeNode ancestor = node.getAncestor(28);
            while (true) {
                node = node.nextPreOrder(ancestor);
                if (node == null || (node.getNodeType() != 9 && node.getNodeType() != 10)) {
                    break;
                }
            }
            if (node == null) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzXd(Node node) {
        if (node.getNodeType() != 8) {
            return false;
        }
        Paragraph paragraph = (Paragraph) node;
        if (!paragraph.isEndOfSection() || !paragraph.zzYoV()) {
            return false;
        }
        if (paragraph.zzYBd().getNodeType() == 3) {
            if (paragraph.zzYB2()) {
                return false;
            }
            CompositeNode compositeNodeZzYB6 = paragraph.zzYB6();
            if (compositeNodeZzYB6.getNodeType() == 8) {
                if (zzZ(((Paragraph) compositeNodeZzYB6).zzqw(StyleIdentifier.BIBLIOGRAPHY), zzXGh)) {
                    return false;
                }
            } else if (compositeNodeZzYB6.getNodeType() == 5) {
                Table table = (Table) compositeNodeZzYB6;
                if (zzZ(table.getFirstRow().zzZYf(), zzXGg) || zzZ(zzU(table.getLastRow(), 1), zzXGh)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zzXe(Node node) {
        if (node.getNodeType() != 8) {
            return 0;
        }
        boolean zZzZYM = node.zzYBb().zzZpV().zzYVg.zzZYM();
        Paragraph paragraph = (Paragraph) node;
        Node nodeZzZYv = paragraph.zzZYv();
        boolean z = false;
        while (nodeZzZYv != null) {
            if (nodeZzZYv.getNodeType() == 18) {
                Shape shape = (Shape) nodeZzZYv;
                boolean hidden = shape.getFont().getHidden();
                boolean z2 = !hidden;
                if (shape.getWrapType() != 0) {
                    z |= z2;
                } else if (!hidden) {
                    return 0;
                }
                nodeZzZYv = nodeZzZYv.zzYB7();
            } else if (zzXb(nodeZzZYv)) {
                zzZR4 zzzr4ZzW = zzZR4.zzW((FieldChar) nodeZzZYv);
                if (!zzZOO.zzCK(zzzr4ZzW.getFieldType())) {
                    if (!zZzZYM) {
                        if (nodeZzZYv.getNodeType() != 24 && ((nodeZzZYv.getNodeType() != 22 || zzXa(nodeZzZYv)) && zzzr4ZzW.getSeparator() != null)) {
                            if (zzzr4ZzW.getSeparator().getParentNode() != paragraph) {
                                break;
                            }
                            nodeZzZYv = zzzr4ZzW.getSeparator();
                        }
                    } else if (zzXa(nodeZzZYv)) {
                        return 0;
                    }
                } else {
                    nodeZzZYv = zzzr4ZzW.getEnd().getParentNode() == paragraph ? zzzr4ZzW.getEnd() : paragraph.zzZYu();
                }
                nodeZzZYv = nodeZzZYv.zzYB7();
            } else {
                if ((nodeZzZYv instanceof zzZAM) && zzXa(nodeZzZYv)) {
                    return 0;
                }
                nodeZzZYv = nodeZzZYv.zzYB7();
            }
        }
        return z ? 1 : 2;
    }

    private void zzY(Node node, boolean z, boolean z2) {
        if (!node.zzYBb().getCompatibilityOptions().getDoNotUseHTMLParagraphAutoSpacing()) {
            if (z) {
                this.zzXGc.zzw5(Integer.MIN_VALUE);
            }
            if (z2) {
                this.zzXGc.zzw3(Integer.MIN_VALUE);
            }
        }
        this.zzXGc.zzYM2();
        this.zzXGc.zzYM0();
    }

    public static zzYMX zzZ(Node node, zzZ6R zzz6r) {
        int i = node.getNodeType() == 8 ? StyleIdentifier.BIBLIOGRAPHY : 1;
        if (!zzz6r.zzYSR().zzYkW()) {
            i |= 16;
        }
        zzYMX zzymxZzqw = node.getNodeType() == 8 ? ((Paragraph) node).zzqw(i) : zzU((Row) node, i);
        if (node.getNodeType() != 8 || node.getAncestor(19) == null) {
            return zzymxZzqw;
        }
        zzYMX zzymx = new zzYMX();
        zzymx.setBidi(zzymxZzqw.getBidi());
        zzymx.zzO(zzymxZzqw.zz5A());
        zzymx.zzN(zzymxZzqw.zz5z());
        zzymx.zzM(zzymxZzqw.zz5y());
        zzymx.zzL(zzymxZzqw.zz5x());
        zzymx.zzy(zzymxZzqw.zzYpv());
        zzymx.zzx(zzymxZzqw.zzYpu());
        return zzymx;
    }

    private void zzZ7(Object obj) {
        TabStopCollection tabStopCollection = (TabStopCollection) obj;
        int i = 0;
        for (int i2 = 0; i2 < tabStopCollection.getCount(); i2++) {
            TabStop tabStop = tabStopCollection.get(i2);
            if (!tabStop.isClear()) {
                if (tabStop.zzY0A()) {
                    this.zzY8T.zzvo(i);
                }
                i++;
            }
        }
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < tabStopCollection.getCount(); i4++) {
            TabStop tabStop2 = tabStopCollection.get(i4);
            if (!tabStop2.isClear()) {
                iArr[i3] = tabStop2.zzY0E() * 50;
                iArr2[i3] = tabStop2.getAlignment();
                iArr3[i3] = tabStop2.getLeader();
                i3++;
            }
        }
        this.zzY8T.zzf(iArr);
        this.zzY8T.zzh(iArr2);
        this.zzY8T.zzg(iArr3);
    }

    private boolean zza(int i, Object obj) {
        if (i == 1070) {
            this.zzXGc.zzTY(((Boolean) obj).booleanValue());
            return true;
        }
        if (i == 1090) {
            this.zzXGc.zzTX(((Boolean) obj).booleanValue());
            return true;
        }
        if (i == 1240) {
            this.zzXGc.setAddSpaceBetweenFarEastAndAlpha(((Boolean) obj).booleanValue());
            return true;
        }
        if (i == 1250) {
            this.zzXGc.setAddSpaceBetweenFarEastAndDigit(((Boolean) obj).booleanValue());
            return true;
        }
        if (i == 1260) {
            this.zzXGc.setSnapToGrid(((Boolean) obj).booleanValue());
            return true;
        }
        if (i != 1560) {
            return false;
        }
        this.zzXGc.zzTW(((Boolean) obj).booleanValue());
        return true;
    }

    private boolean zzb(int i, Object obj) {
        if (i != 1150) {
            if (i == 1155) {
                Integer num = (Integer) obj;
                if (num.intValue() != 0) {
                    this.zzXGc.zzw8(num.intValue());
                    this.zzXGc.zzU6(true);
                }
            } else if (i != 1160) {
                if (i == 1165) {
                    Integer num2 = (Integer) obj;
                    if (num2.intValue() != 0) {
                        this.zzXGc.zzwa(num2.intValue());
                        this.zzXGc.zzU7(true);
                    }
                } else if (i != 1170) {
                    if (i == 1175) {
                        Integer num3 = (Integer) obj;
                        if (num3.intValue() != 0) {
                            this.zzXGc.zzwb(num3.intValue());
                            this.zzXGc.zzU8(true);
                            if (this.zzXGc.zzYMa() < 0 && !this.zzXGc.zzYM8()) {
                                this.zzXGc.zzwa(0);
                            }
                        }
                    } else if (i == 1592) {
                        this.zzXGc.zzw9(((Integer) obj).intValue() * 50);
                    } else {
                        if (i != 1593) {
                            return false;
                        }
                        this.zzXGc.zzw7(((Integer) obj).intValue() * 50);
                    }
                } else if (!this.zzXGc.zzYM9()) {
                    this.zzXGc.zzwb(((Integer) obj).intValue() * 50);
                }
            } else if (!this.zzXGc.zzYM8() && (!this.zzXGc.zzYM9() || this.zzXGc.zzYMa() >= 0)) {
                this.zzXGc.zzwa(((Integer) obj).intValue() * 50);
            }
        } else if (!this.zzXGc.zzYM5()) {
            this.zzXGc.zzw8(((Integer) obj).intValue() * 50);
        }
        return true;
    }

    public final zzZ37 zzXf(Node node) {
        zzYMX zzymxZzZ = zzZ(node, this.zzZEV);
        this.zzXGc = new zzZ37(this.zzZEX);
        this.zzXGd = new zzZ3C(this.zzZEX, false);
        this.zzY8T = new zzZ31(this.zzZEX, false);
        zzZ34 zzz34 = new zzZ34(this.zzZEX, false);
        zzZ38 zzz38 = new zzZ38(this.zzZEX, false);
        this.zzXGc.zzW(null);
        this.zzXGf = true;
        zzZKP zzzkp = (zzZKP) zzYMX.zzOt(1430);
        this.zzCR = zzzkp.getValue() * 50;
        this.zzXGe = zzzkp.zzZ4A();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        for (int i = 0; i < zzymxZzZ.getCount(); i++) {
            int iZzT3 = zzymxZzZ.zzT3(i);
            Object objZzVY = zzymxZzZ.zzVY(i);
            if (objZzVY != null && !zz9(iZzT3, objZzVY) && !zz8(iZzT3, objZzVY) && !zza(iZzT3, objZzVY) && !zzb(iZzT3, objZzVY)) {
                switch (iZzT3) {
                    case 12:
                    case 14:
                    case EditingLanguage.DIVEHI /* 1125 */:
                    case 10010:
                        this.zzXGc.zzYLE();
                        break;
                    case 1000:
                        this.zzXGc.zzw1(((Integer) objZzVY).intValue());
                        break;
                    case PointerIconCompat.TYPE_GRAB /* 1020 */:
                        this.zzXGc.setAlignment(((Integer) objZzVY).intValue());
                        break;
                    case 1022:
                        this.zzXGc.zzU0(((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                        this.zzXGc.zzU4(((Boolean) objZzVY).booleanValue());
                        break;
                    case 1050:
                        this.zzXGc.zzU3(((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.SLOVENIAN /* 1060 */:
                        this.zzXGc.zzU2(((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.FAEROESE /* 1080 */:
                        this.zzXGc.setWordWrap(((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.GALICIAN /* 1110 */:
                        zzz38.setLevel(((Integer) objZzVY).intValue());
                        break;
                    case EditingLanguage.KASHMIRI_ARABIC /* 1120 */:
                        zzz38.setId(((Integer) objZzVY).intValue());
                        break;
                    case EditingLanguage.YORUBA /* 1130 */:
                        this.zzXGc.zzTZ(((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.GUARANI /* 1140 */:
                        zzZ7(objZzVY);
                        break;
                    case 1200:
                        this.zzXGc.zzw5(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 1205:
                        this.zzXGc.zzw4(((Integer) objZzVY).intValue());
                        break;
                    case 1210:
                        zBooleanValue = ((Boolean) objZzVY).booleanValue();
                        break;
                    case 1220:
                        this.zzXGc.zzw3(((Integer) objZzVY).intValue() * 50);
                        break;
                    case 1225:
                        this.zzXGc.zzw2(((Integer) objZzVY).intValue());
                        break;
                    case 1230:
                        zBooleanValue2 = ((Boolean) objZzVY).booleanValue();
                        break;
                    case 1270:
                        this.zzXGc.zzU5(((Boolean) objZzVY).booleanValue());
                        break;
                    case 1280:
                        this.zzXGc.setOutlineLevel(((Integer) objZzVY).intValue());
                        break;
                    case 1410:
                        this.zzXGc.setSuppressAutoHyphens(((Boolean) objZzVY).booleanValue());
                        break;
                    case 1460:
                        Shading shading = (Shading) objZzVY;
                        zzz34.zzN(zzZQ.zzn(shading.zzYbJ()));
                        zzz34.zzM(zzZQ.zzn(shading.zzYbK()));
                        zzz34.setTexture(shading.getTexture());
                        break;
                    case 1470:
                        this.zzXGc.zzU1(((Boolean) objZzVY).booleanValue());
                        break;
                    case 1510:
                        this.zzXGc.setBaselineAlignment(((Integer) objZzVY).intValue());
                        break;
                    case 1650:
                        zzZ52 zzz52 = (zzZ52) objZzVY;
                        this.zzXGc.zzw6(zzz52.getValue() * 50);
                        this.zzXGc.setLineSpacingRule(zzz52.zzZ4A());
                        break;
                }
            }
        }
        zzY(node, zBooleanValue, zBooleanValue2);
        zzZ(node, zzz38);
        zzZ(node, zzymxZzZ);
        this.zzXGc.zzX(zzZ3C.zzZ(this.zzXGd));
        this.zzXGc.zzY(zzZ34.zzX(zzz34));
        this.zzXGc.zzZ(zzZ31.zzY(this.zzY8T));
        this.zzXGc.zzTU(zzXc(node));
        this.zzXGc.zzvX(zzXe(node));
        return this.zzXGc;
    }

    private void zzZ(Node node, zzZ38 zzz38) {
        if (zzz38.getId() != 0) {
            ListLevel listLevelZzwY = node.getDocument().getLists().zzxv(zzz38.getId()).getListLevels().zzwY(zzz38.getLevel());
            zzz38.setNumberStyle(listLevelZzwY.getNumberStyle());
            zzz38.setAlignment(listLevelZzwY.getAlignment());
            zzz38.setTrailingCharacter(listLevelZzwY.getTrailingCharacter());
            zzz38.zzx1(listLevelZzwY.zzYO6() * 50);
        }
        this.zzXGc.zzY(zzZ38.zzZ(zzz38));
    }

    private void zzZ(Node node, zzYMX zzymx) {
        if (this.zzXGc.zzTV(false) == null) {
            this.zzXGc.zzW(zzZ37.zzY8m);
            return;
        }
        if (FrameFormat.zzY(zzymx) && !zzXd(node)) {
            zzZ(zzymx.getDropCapPosition(), this.zzXGc.zzYLJ());
            zzZP.zzY(this.zzXGc.zzYLJ(), 8);
            this.zzXGc.zzYLJ().setHeight(zzZ39.zzWN(this.zzCR, this.zzXGe));
            this.zzXGc.zzYLJ().setAllowOverlap(!zzymx.zzYpw());
            if (this.zzXGf && this.zzXGc.zzYLJ().zzYMf() == 1) {
                this.zzXGc.zzYLJ().setHorizontalAlignment(1);
            }
            zzZQ.zzZ(this.zzXGc.zzYLJ(), 21537);
            zzZ37 zzz37 = this.zzXGc;
            zzz37.zzW(zzZ39.zzX(zzz37.zzYLJ()));
            return;
        }
        this.zzXGc.zzW(zzZ37.zzY8m);
    }

    private static boolean zzZ(WordAttrCollection wordAttrCollection, int[] iArr) {
        for (int i : iArr) {
            if (wordAttrCollection.zzPk(i) != null) {
                return true;
            }
        }
        return false;
    }

    private static void zzZ(int i, zzZ39 zzz39) {
        if (i == 0) {
            return;
        }
        boolean z = zzz39.getTop() == 0 && !(zzz39.zzYMe() && zzz39.zzYMd() != 2);
        if (z) {
            zzz39.setVerticalAlignment(0);
            zzz39.zzwd(2);
        }
        if (zzz39.zzYMf() == 2) {
            z = zzz39.getLeft() == 0 && zzz39.zzYMd() == 2;
        }
        boolean z2 = zzz39.getHorizontalAlignment() != 0;
        if (z && !z2) {
            zzz39.setHorizontalAlignment(-i);
            zzz39.zzwe(2);
        }
        zzz39.setWrapType(2);
    }
}
