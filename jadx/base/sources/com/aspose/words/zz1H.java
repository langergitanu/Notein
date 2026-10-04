package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz1H {
    private static com.aspose.words.internal.zzD3<int[]> zzYYl;
    private Shape zzZ2R;

    static {
        com.aspose.words.internal.zzD3<int[]> zzd3 = new com.aspose.words.internal.zzD3<>();
        zzYYl = zzd3;
        zzd3.add(52, new int[]{-1800, 0, -3600, 0, -3600, 0, -1800});
        zzYYl.add(46, new int[]{-1800, 0, -3600, 0, -3600, 0, -1800});
        zzYYl.add(190, new int[]{1350});
        zzYYl.add(192, new int[]{1350});
        zzYYl.add(200, new int[]{1350});
        zzYYl.add(197, new int[]{1350});
        zzYYl.add(49, new int[]{-1800, 0, -3600, 0, -3600, 0, -1800});
        zzYYl.add(43, new int[]{-1800, 0, -3600, 0, -3600, 0, -1800});
        zzYYl.add(55, new int[]{10800});
        zzYYl.add(106, new int[]{6300, 24300});
        zzYYl.add(38, new int[]{10800});
        zzYYl.add(39, new int[]{10800, 10800});
        zzYYl.add(40, new int[]{10800, 10800, 10800});
        zzYYl.add(105, new int[]{10800, 18900, 16200});
        zzYYl.add(103, new int[]{10800, 18900, 5400});
        zzYYl.add(102, new int[]{10800, 18900, 16200});
        zzYYl.add(104, new int[]{10800, 18900, 5400});
        zzYYl.add(188, new int[]{1350});
        zzYYl.add(67, new int[]{10800});
        zzYYl.add(80, new int[]{14035, 0, 16200});
        zzYYl.add(65, new int[]{18000});
        zzYYl.add(15, new int[]{10800});
        zzYYl.add(66, new int[]{10800});
        zzYYl.add(77, new int[]{7565, 0, 5400});
        zzYYl.add(69, new int[]{10800});
        zzYYl.add(81, new int[]{5603, 0, 5400});
        zzYYl.add(57, new int[]{4050});
        zzYYl.add(94, new int[]{10800});
        zzYYl.add(53, new int[]{0, 3600});
        zzYYl.add(54, new int[]{0, 18000});
        zzYYl.add(13, new int[]{10800});
        zzYYl.add(78, new int[]{14035, 0, 16200});
        zzYYl.add(58, new int[]{2700});
        zzYYl.add(93, new int[]{10800});
        zzYYl.add(68, new int[]{10800});
        zzYYl.add(79, new int[]{7565, 0, 5400});
        zzYYl.add(70, new int[]{0, 10800});
        zzYYl.add(82, new int[]{5603, 0, 5400});
        zzYYl.add(64, new int[]{2700});
        zzYYl.add(63, new int[]{6300, 24300});
        zzYYl.add(61, new int[]{6300, 24300});
        zzYYl.add(62, new int[]{6300, 24300});
        zzYYl.add(2, new int[]{16668});
        zzYYl.add(34, new int[]{10800});
    }

    private void zzGU(int i) {
        if (i != 185 && i != 186) {
            switch (i) {
            }
            return;
        }
        this.zzZ2R.setShapeAttr(443, Boolean.TRUE);
    }

    private static boolean zzGV(int i) {
        switch (i) {
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzR(Shape shape) throws Exception {
        com.aspose.words.internal.zzOU zzouZzZ;
        double dZzl;
        zz2O zz2o = (zz2O) shape.zzY9i();
        zz34 zz34Var = new zz34(shape.getDocument(), new zz4I());
        zz1K zz1kZzZTj = zz2o.zzZTj();
        if (zz1kZzZTj == null) {
            zz1kZzZTj = new zz1K();
        }
        zzGR zzgr = new zzGR(zz2o, zz34Var, zz1kZzZTj);
        int iZzOL = zz84.zzOL(zz2o.zzZTf().zzZAO());
        if (shape.zzY9o() && iZzOL == 1) {
            iZzOL = 202;
        }
        if (!zz84.zzIf(iZzOL)) {
            this.zzZ2R.setShapeType(iZzOL);
            zzZ(iZzOL, zz2o.zzZTf().zzZAP());
            zzGU(iZzOL);
        } else if (zzGV(iZzOL)) {
            double dZzl2 = zzl(zz2o.getWidth(), zz2o.getHeight());
            if (com.aspose.words.internal.zzAN.zzL(dZzl2, 21600.0d)) {
                dZzl2 = 21600.0d;
                dZzl = 21600.0d;
            } else if (dZzl2 > 21600.0d) {
                dZzl = 21600.0d;
            } else {
                dZzl = zzl(zz2o.getHeight(), zz2o.getWidth());
                dZzl2 = 21600.0d;
            }
            zz7E zz7e = new zz7E(shape, new zz2G(dZzl2, dZzl, zz2o.getOutline(), zz2o.getFill(), zzgr, zz2o.zzZTf().zzZAP()));
            this.zzZ2R.setShapeAttr(StyleIdentifier.LIST_TABLE_5_DARK, zz7e.zzZAF());
            this.zzZ2R.setShapeAttr(StyleIdentifier.LIST_TABLE_4, zz7e.zzZAE());
            this.zzZ2R.setShapeAttr(4127, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZa(dZzl2)));
            this.zzZ2R.setShapeAttr(4128, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZa(dZzl)));
        }
        if (zz2o.getOutline() != null && (zzouZzZ = zz2o.getOutline().zzZ(zzgr, false)) != null) {
            this.zzZ2R.setShapeAttr(459, Integer.valueOf((int) zzouZzZ.getWidth()));
            com.aspose.words.internal.zzOI zzoi = (com.aspose.words.internal.zzOI) com.aspose.words.internal.zzZKW.zzZ(zzouZzZ.zzZ1(), com.aspose.words.internal.zzOI.class);
            if (zzoi != null) {
                this.zzZ2R.setShapeAttr(448, zzoi.zzZy());
            }
        }
        if (zz2o.zzZBM()) {
            this.zzZ2R.zzY9h().zzXh(zz2o.zzZBM());
        }
        if (zz2o.getFill() == null || zz2o.getFill().zzZQ4() == 0) {
            return;
        }
        this.zzZ2R.setShapeAttr(385, zz2o.getFill().zzY(zzgr));
    }

    private void zzX(int[] iArr, zz6U zz6u) {
        double width;
        double height;
        boolean z;
        boolean z2;
        boolean z3;
        double d;
        double dZzZ;
        boolean z4;
        int i;
        int[] iArr2 = iArr;
        boolean z5 = this.zzZ2R.getWidth() > this.zzZ2R.getHeight();
        boolean z6 = this.zzZ2R.getShapeType() == 102;
        boolean z7 = z5;
        boolean z8 = this.zzZ2R.getShapeType() == 103;
        boolean z9 = this.zzZ2R.getShapeType() == 104;
        boolean z10 = this.zzZ2R.getShapeType() == 105;
        Shape shape = this.zzZ2R;
        if (z7) {
            width = shape.getHeight();
            height = this.zzZ2R.getWidth();
        } else {
            width = shape.getWidth();
            height = this.zzZ2R.getHeight();
        }
        double d2 = width / height;
        double d3 = 1.0d - d2;
        int[] iArrZzY = zzY(iArr2.length, zz6u);
        boolean z11 = iArrZzY.length == iArr2.length;
        int i2 = 0;
        while (i2 < iArr2.length) {
            if (z11) {
                int i3 = i2;
                z4 = z6;
                double dZzZ2 = zzZ(z4, z8, z9, z10, z7, i3, iArrZzY, d2);
                z2 = z9;
                d = d3;
                z = z8;
                z3 = z7;
                i = i3;
                dZzZ = dZzZ2;
            } else {
                z = z8;
                z2 = z9;
                z3 = z7;
                d = d3;
                dZzZ = zzZ(z6, z, z2, z10, iArr2, i2, z3, d);
                int i4 = i2;
                z4 = z6;
                i = i4;
            }
            this.zzZ2R.setShapeAttr(i + StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZa(dZzZ)));
            boolean z12 = z4;
            i2 = i + 1;
            z6 = z12;
            iArr2 = iArr;
            z7 = z3;
            d3 = d;
            z8 = z;
            z9 = z2;
        }
    }

    private void zzY(int[] iArr, zz6U zz6u) {
        int iZzZG;
        int[] iArrZzY = zzY(iArr.length, zz6u);
        if (iArrZzY.length == 0 || (iZzZG = com.aspose.words.internal.zzAN.zzZG(((double) iArrZzY[0]) * 0.216d)) == iArr[0]) {
            return;
        }
        this.zzZ2R.setShapeAttr(StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(iZzZG));
    }

    private static double zzZ(int i, boolean z, boolean z2, boolean z3, double d) {
        return d * ((i == 0 && z) ? 1.0d : (i == 1 && z) ? 0.14285714285714285d : (i == 2 && z2) ? 0.3333333333333333d : (i == 2 && z3) ? -1.0d : 0.0d);
    }

    private static double zzl(double d, double d2) {
        if (com.aspose.words.internal.zzAN.zzZD(d2)) {
            return 21600.0d;
        }
        return (d / d2) * 21600.0d;
    }

    private void zzq(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != 0) {
                int height = (int) (this.zzZ2R.getHeight() / this.zzZ2R.getWidth());
                this.zzZ2R.setShapeAttr(i + StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(height != 1 ? (int) (21600.0d - ((this.zzZ2R.getHeight() / this.zzZ2R.getWidth()) * ((double) iArr[i]))) : height * iArr[i]));
            }
        }
    }

    public final Shape zzS(Shape shape) throws Exception {
        Node firstChild;
        zzYC3 zzyc3 = (zzYC3) shape.zzYvW().zzbn();
        Shape shape2 = new Shape(shape.getDocument());
        this.zzZ2R = shape2;
        shape2.zzS(zzyc3);
        this.zzZ2R.zzZ((zzYEF) shape.zzZYh().zzbn());
        zzO zzoZzYdB = this.zzZ2R.zzZYh().zzYdB();
        if (zzoZzYdB != null && zzoZzYdB.zzbR() != null && (firstChild = zzoZzYdB.zzbR().getFirstChild()) != null && firstChild.getNodeType() == 18) {
            ((Shape) firstChild).zzYvW().zzX(zzyc3, 781);
        }
        zzR(shape);
        Iterator<T> it = shape.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            this.zzZ2R.appendChild(((Node) it.next()).deepClone(true));
        }
        this.zzZ2R.accept(new zzZRJ());
        if (shape.getImageData().getImageBytes() != null) {
            this.zzZ2R.setShapeAttr(shape.zzY9i() instanceof zz3V ? 4102 : 4110, shape.getImageData().getImageBytes());
        }
        return this.zzZ2R;
    }

    private void zzZ(int i, zz6U zz6u) {
        int[] iArr = zzYYl.get(i);
        if (iArr == null) {
        }
        if (i == 2) {
            zzZ(iArr, zz6u);
            return;
        }
        if (i == 34) {
            zzY(iArr, zz6u);
            return;
        }
        switch (i) {
            case 66:
            case 67:
            case 68:
            case 69:
                zzZ(iArr, (i == 67 || i == 68) ? false : true, i == 68);
                break;
            default:
                switch (i) {
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                        zzX(iArr, zz6u);
                        break;
                    default:
                        zzq(iArr);
                        break;
                }
                break;
        }
    }

    private static int[] zzY(int i, zz6U zz6u) {
        if (zz6u.zzZA2().size() != i * 2) {
            return new int[0];
        }
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i + i2;
            if (i3 > zz6u.zzZA2().size()) {
                break;
            }
            zz6W zz6w = zz6u.zzZA2().get(i3);
            if (!zz6w.zzZA5()) {
                iArr[i2] = (int) zz6w.zzZA6().zzX(zz6u);
            }
        }
        return iArr;
    }

    private void zzZ(int[] iArr, boolean z, boolean z2) {
        int iZzX;
        boolean z3 = true;
        boolean z4 = this.zzZ2R.getWidth() > this.zzZ2R.getHeight();
        if (!z) {
            z3 = z4;
        } else if (z4) {
            z3 = false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (z3) {
                iZzX = iArr[i];
            } else {
                iZzX = iArr[i] - zzZZZ.zzX(this.zzZ2R.getWidth(), this.zzZ2R.getHeight(), iArr[i]);
            }
            if (z2) {
                iZzX = 21600 - iZzX;
            }
            this.zzZ2R.setShapeAttr(i + StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(iZzX));
        }
    }

    private void zzZ(int[] iArr, zz6U zz6u) {
        int[] iArrZzY = zzY(iArr.length, zz6u);
        if (iArrZzY.length == 0) {
            iArrZzY = new int[]{iArr[0]};
        }
        for (int i = 0; i < iArr.length; i++) {
            this.zzZ2R.setShapeAttr(i + StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG((((double) ((iArrZzY[i] * 32768) / 50000)) / 65536.0d) * ((double) this.zzZ2R.zzY9h().zzZyj()))));
        }
    }

    private static double zzZ(boolean z, boolean z2, boolean z3, boolean z4, int[] iArr, int i, boolean z5, double d) {
        double d2 = iArr[i];
        return (zzZ(i, (z5 && (z3 || z4)) || (!z5 && (z || z2)), (z && z5) || (z4 && !z5), (z2 && z5) || (z3 && !z5), d) * d2) + d2;
    }

    private static double zzZ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int[] iArr, double d) {
        boolean z6 = ((z || z2) && z5) || ((z3 || z4) && !z5);
        if (i == 0) {
            return 21600.0d - ((((double) iArr[1]) * 0.216d) * (z6 ? 1.0d : d));
        }
        if (i == 1) {
            return (((double) (iArr[0] - iArr[1])) * 0.108d * (z6 ? 1.0d : d)) + 21600.0d;
        }
        if (i != 2) {
            return 21600.0d;
        }
        double d2 = ((double) iArr[2]) * (z6 ? d : 1.0d) * 0.216d;
        return (z || z4) ? 21600.0d - d2 : d2;
    }
}
