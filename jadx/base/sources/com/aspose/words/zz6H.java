package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6H {
    private static void zzQ(zz6G zz6g) {
        zzZ(zz6g, 0, 0, 19050, 19050);
    }

    private static void zzR(zz6G zz6g) {
        int i;
        int i2;
        int iZzX;
        int iZzX2;
        double width = zz6g.getShape().getWidth();
        double height = zz6g.getShape().getHeight();
        if (zz6g.zzZzL() == 187) {
            i2 = width < height ? 19050 : 38100;
            i = width > height ? 19050 : 38100;
        } else {
            i = (com.aspose.words.internal.zzAN.zzZD(width) || height / width <= 2.0d) ? 19050 : 38100;
            i2 = (com.aspose.words.internal.zzAN.zzZD(height) || width / height <= 2.0d) ? 19050 : 38100;
        }
        if (zz6g.zzZzL() == 18) {
            int iZzX3 = zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 19050);
            iZzX = 25400 - (width < height ? iZzX3 : 0);
            if (width <= height) {
                iZzX3 = -iZzX3;
            }
            iZzX2 = iZzX3 + 38100;
        } else if (zz6g.zzZzL() == 187) {
            int i3 = width <= height ? -zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 38100) : 0;
            iZzX2 = width <= height ? 38100 - zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 10500) : 38100;
            iZzX = i3;
        } else {
            iZzX = 38100 - (width > height ? zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 38100) : 0);
            iZzX2 = 38100 - (width < height ? zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 38100) : 0);
        }
        zzZ(zz6g, i, i2, iZzX, iZzX2);
    }

    private static void zzS(zz6G zz6g) {
        zzQ(zz6g);
        Shape shape = zz6g.getShape();
        shape.setShapeAttr(4146, Integer.valueOf(shape.getHeight() > 3.5d ? 31115 + com.aspose.words.internal.zzSA.zzp(shape.getHeight() / 10.5d) : 31115));
    }

    private static void zzT(zz6G zz6g) {
        Shape shape = zz6g.getShape();
        int iZzZzL = zz6g.zzZzL();
        int i = 38100;
        if (iZzZzL != 32) {
            switch (iZzZzL) {
                case 12:
                case 13:
                case 14:
                    zzZ(zz6g, 38100, 19050);
                    break;
                default:
                    zzZ(zz6g, 19050, 9050);
                    break;
            }
        } else {
            zzZ(zz6g, 59690, 59690);
        }
        if (iZzZzL == 12) {
            return;
        }
        if (iZzZzL == 64 || iZzZzL == 65) {
            if (shape.getWidth() > shape.getHeight()) {
                shape.setShapeAttr(4146, 19050);
            } else {
                shape.setShapeAttr(4145, 19050);
            }
        }
        if (iZzZzL != 13 && iZzZzL != 14) {
            i = 0;
        } else if (shape.getWidth() >= shape.getHeight()) {
            i = 19050;
        }
        shape.setShapeAttr(4143, 0);
        shape.setShapeAttr(4144, Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzU(zz6G zz6g) {
        int i;
        int i2;
        int i3;
        int i4;
        Shape shape = zz6g.getShape();
        double width = shape.getWidth();
        double height = shape.getHeight();
        int iZzZzL = zz6g.zzZzL();
        int i5 = iZzZzL == 63 ? 19050 : 0;
        int iZzX = width > height ? zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 5715) + 21590 : 21590;
        if (iZzZzL == 63 || iZzZzL == 106 || iZzZzL == 178 || iZzZzL == 180 || iZzZzL == 181) {
            boolean z = iZzZzL == 106 || iZzZzL == 63;
            int i6 = z ? 38100 : 21590;
            if (width > height) {
                iZzX = i6 - zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), z ? 38100 : 10500);
            } else {
                iZzX = i6;
            }
        }
        if (iZzZzL != 106 && iZzZzL != 178 && iZzZzL != 180 && iZzZzL != 181) {
            switch (iZzZzL) {
                default:
                    switch (iZzZzL) {
                        case 61:
                        case 62:
                        case 63:
                            break;
                        default:
                            i = 2142;
                            break;
                    }
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                    break;
            }
        } else {
            i = 1428;
        }
        if (iZzZzL != 106) {
            switch (iZzZzL) {
                case 61:
                case 62:
                case 63:
                    i2 = 76200;
                    break;
                default:
                    i2 = 38100;
                    break;
            }
        }
        int iZzZa = (int) com.aspose.words.internal.zzZKQ.zzZa((height * ((double) i)) + ((double) i2));
        if (iZzZzL != 178 && iZzZzL != 180 && iZzZzL != 181) {
            switch (iZzZzL) {
                case 41:
                case 44:
                case 47:
                case 50:
                    break;
                case 42:
                case 45:
                case 48:
                case 51:
                    i3 = 6123;
                    break;
                case 43:
                case 46:
                case 49:
                case 52:
                    i3 = 2041;
                    break;
                default:
                    i3 = 0;
                    break;
            }
        } else {
            i3 = 4762;
        }
        int iZzZa2 = (int) com.aspose.words.internal.zzZKQ.zzZa((width * ((double) i3)) + 19050.0d);
        int iZzZzL2 = zz6g.zzZzL();
        if (iZzZzL2 != 106) {
            switch (iZzZzL2) {
                case 61:
                case 62:
                    i4 = 0;
                    break;
                case 63:
                    i4 = 19050;
                    break;
                default:
                    i4 = iZzZa2;
                    break;
            }
        }
        zzZ(zz6g, i5, i4, iZzX, iZzZa);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzV(zz6G zz6g) {
        int i;
        int i2;
        double d;
        int i3;
        int i4;
        zz6G zz6g2;
        int iZzZzL = zz6g.zzZzL();
        double height = zz6g.getShape().getHeight();
        double width = zz6g.getShape().getWidth();
        if (iZzZzL == 67 || iZzZzL == 68 || iZzZzL == 70) {
            i = width > height ? 38100 : 19050;
        } else if (iZzZzL != 94) {
            i = 0;
        }
        if (iZzZzL == 68 || iZzZzL == 70) {
            i2 = width > height ? 0 : 38100;
        } else if (iZzZzL == 90 || iZzZzL == 91) {
            i2 = iZzZzL == 91 ? 21590 : 38100;
            if (!com.aspose.words.internal.zzAN.zzZD(height) && width / height > 2.0d) {
                i2 = iZzZzL == 91 ? 10500 : 29500;
            }
        } else if (iZzZzL != 93) {
            if (iZzZzL == 94) {
                if (height <= width) {
                    if (com.aspose.words.internal.zzAN.zzZD(height) || width / height <= 2.0d) {
                    }
                }
            } else if (width > height) {
            }
            i2 = 21590;
        }
        int i5 = i2;
        if (iZzZzL == 68 || iZzZzL == 70 || iZzZzL == 90) {
            d = 2.0d;
            i3 = 19050;
        } else if (iZzZzL == 93 || iZzZzL == 94) {
            d = 2.0d;
            i3 = height > width ? 38100 : 19050;
        } else {
            d = 2.0d;
            i3 = 0;
        }
        if (iZzZzL == 67) {
            i4 = 38100;
            zz6g2 = zz6g;
        } else {
            if (iZzZzL != 68) {
                if (iZzZzL != 70) {
                    if (iZzZzL == 90 || iZzZzL == 91) {
                        if (!com.aspose.words.internal.zzAN.zzZD(width) && height / width > d) {
                            i4 = 10500;
                        }
                    } else if (iZzZzL != 93 && iZzZzL != 94) {
                        i4 = 0;
                    }
                    zz6g2 = zz6g;
                }
            }
            zz6g2 = zz6g;
            i4 = 21590;
        }
        zzZ(zz6g2, i3, i, i5, i4);
    }

    private static void zzW(zz6G zz6g) {
        double width = zz6g.getShape().getWidth();
        double height = zz6g.getShape().getHeight();
        zzZ(zz6g, 0, 0, height <= width ? zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 38100) + 38100 : 38100, (com.aspose.words.internal.zzAN.zzZD(width) || height / width <= 2.0d) ? 21590 : 10500);
    }

    private static void zzX(zz6G zz6g) {
        int iZzZzL = zz6g.zzZzL();
        double width = zz6g.getShape().getWidth();
        double height = zz6g.getShape().getHeight();
        int i = 19050;
        int i2 = (com.aspose.words.internal.zzAN.zzZD(height) || width / height <= 2.0d) ? 19050 : 38100;
        if (!com.aspose.words.internal.zzAN.zzZD(width) && height / width > 2.0d) {
            i = 38100;
        }
        if (108 == iZzZzL) {
            i = 0;
        }
        int iZzX = width > height ? zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), 38100) + 38100 : 38100;
        if (108 == iZzZzL) {
            iZzX = 38100;
        }
        zzZ(zz6g, i, i2, iZzX, 108 != iZzZzL ? (com.aspose.words.internal.zzAN.zzZD(width) || height / width <= 2.0d) ? 21590 : 10500 : 38100);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[FALL_THROUGH] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzY(com.aspose.words.zz6G r13) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.zz6H.zzY(com.aspose.words.zz6G):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzZ(com.aspose.words.zz6G r4) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.zz6H.zzZ(com.aspose.words.zz6G):void");
    }

    private static void zzZ(zz6G zz6g, int i, int i2, int i3, int i4) {
        Shape shape = zz6g.getShape();
        shape.setShapeAttr(4144, Integer.valueOf(i));
        shape.setShapeAttr(4143, Integer.valueOf(i2));
        shape.setShapeAttr(4146, Integer.valueOf(i4));
        shape.setShapeAttr(4145, Integer.valueOf(i3));
    }

    private static void zzZ(zz6G zz6g, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iZzX = zzZZZ.zzX(zz6g.getShape().getWidth(), zz6g.getShape().getHeight(), i2);
        if (iZzX != 0) {
            i4 = i + iZzX;
            i -= iZzX;
            i5 = i;
            i3 = i4;
        } else {
            i3 = i;
            i4 = i3;
            i5 = i4;
        }
        zzZ(zz6g, i, i4, i3, i5);
    }
}
