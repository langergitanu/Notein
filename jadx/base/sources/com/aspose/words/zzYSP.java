package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSP implements zzZ9U {
    private static com.aspose.words.internal.zzZNR zzXR0 = new com.aspose.words.internal.zzZNR("^(([^\\.]+)?\\.)?(\\$?([A-Z]+)\\$?(\\d+)$)", 66);
    private boolean zzXQZ;
    private Shape zzXR1;
    private IWarningCallback zzZG0;

    private static int zzD(boolean z, boolean z2) {
        if (!z && !z2) {
            return 3;
        }
        if (z && z2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    private static long zzGe(String str) {
        return com.aspose.words.internal.zzZPZ.zzZm(zzYTW.zzYg(OooO0O0.OooO00o(zzXR0.zzUX(str), 4)), com.aspose.words.internal.zzJB.parseInt(r2.zzhJ().zzQx(5).getValue()) - 1);
    }

    private static com.aspose.words.internal.zzZQ5 zzGf(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ':');
        long jZzGe = zzGe(strArrZzR[0]);
        long jZzGe2 = strArrZzR.length == 1 ? jZzGe : zzGe(strArrZzR[1]);
        return com.aspose.words.internal.zzZQ5.zzT((int) jZzGe, (int) (jZzGe >> 32), (int) jZzGe2, (int) (jZzGe2 >> 32));
    }

    private static void zzR(com.aspose.words.internal.zzD3<zzGK> zzd3) {
        zzGK zzgk = zzd3.get(10);
        if (zzgk != null) {
            if (zzgk.zzZPj().getCount() == 3) {
                zzgk.zzZPj().get(0).setName("Low");
                zzgk.zzZPj().get(1).setName("High");
                zzgk.zzZPj().get(2).setName("Close");
            } else if (zzgk.zzZPj().getCount() == 4) {
                zzgk.zzZPj().get(0).setName("Open");
                zzgk.zzZPj().get(1).setName("Low");
                zzgk.zzZPj().get(2).setName("High");
                zzgk.zzZPj().get(3).setName("Close");
            }
        }
    }

    private static String[] zzY(zzYPI zzypi, String str) throws Exception {
        com.aspose.words.internal.zzZQ5 zzzq5ZzGf = zzGf(str);
        zzzq5ZzGf.getWidth();
        int height = zzzq5ZzGf.getHeight() + 1;
        String[] strArr = new String[height];
        long jZzZE = zzzq5ZzGf.zzZE();
        for (int i = 0; i < height; i++) {
            strArr[i] = zzypi.zzrB(((int) (jZzZE >> 32)) + i).zzrL((int) jZzZE).getValue();
        }
        return strArr;
    }

    private void zzZ(zzDT zzdt, zzYSW zzysw, int i) {
        zzdt.zzZ(zzZ(zzysw.zzQb(), zzysw.zzYm(), zzysw.getWidth(), zzysw.getHeight(), zzysw.zzYxl()));
        zzYSO.zzZ((zzYRL) zzysw.zzYxl(), zzdt.zzaQ(), false);
        if (!zzysw.zzYxe().zzYx8() || i == 9) {
            return;
        }
        zzdt.zzZJc().zzZLQ().zzXw(zzysw.zzYxe().zzYxa());
    }

    private byte[] zzh(Shape shape) throws Exception {
        zz4I zz4i = new zz4I();
        zz4i.zzZ(new zzY21(shape.getDocument().getWarningCallback()));
        zzX0 zzx0ZzZ = zz09.zzZ(shape, zz4i);
        if (com.aspose.words.internal.zzZPW.zzYF(zzx0ZzZ.zz7s().getSize())) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            ImageSaveOptions imageSaveOptions = new ImageSaveOptions(this.zzXQZ ? 101 : 103);
            imageSaveOptions.setUseGdiEmfRenderer(false);
            zzYDY.zzZ(zzx0ZzZ.zz7v(), shape.getSize(), zzzor, imageSaveOptions, shape.getDocument().zzZqx());
            return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private static String[] zzsL(int i) {
        String[] strArr = new String[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            strArr[i2] = com.aspose.words.internal.zzZKN.format("Category {0}", Integer.valueOf(i3));
            i2 = i3;
        }
        return strArr;
    }

    public final void zzYZd() {
        this.zzXQZ = true;
    }

    @Override // com.aspose.words.zzZ9U
    public final Shape zzr(Shape shape) throws Exception {
        this.zzZG0 = shape.getDocument().getWarningCallback();
        this.zzXR1 = shape;
        zzYT7 zzyt7ZzZ = zzYSO.zzZ(shape, new Document(1));
        if (zzyt7ZzZ == null) {
            return null;
        }
        zzD8 zzd8ZzZ = zzZ(zzyt7ZzZ.getType(), zzyt7ZzZ.zzYxS().zzYxe());
        Shape shapeZzg = zzYSO.zzg(shape);
        shapeZzg.zzU(zzd8ZzZ);
        zzEY zzeyZzZHX = zzd8ZzZ.zzZHX();
        zzeyZzZHX.zz45().zzZJf().clear();
        zzeyZzZHX.zz45().zzZJi();
        zzZ(zzyt7ZzZ, shapeZzg.getChart());
        zzYSO.zzZ((zzYRL) zzyt7ZzZ.zzYxl(), zzd8ZzZ.zzaQ(), true);
        zzZ(zzeyZzZHX.zz45(), zzyt7ZzZ.zzYxS(), zzyt7ZzZ.getType());
        zzZ(zzyt7ZzZ, zzd8ZzZ);
        if (zzyt7ZzZ.zzYxR() != null) {
            zzeyZzZHX.setDCTitle(zzZ(zzyt7ZzZ.zzYxR(), zzd8ZzZ.zzZHX()));
            return shapeZzg;
        }
        zzd8ZzZ.zzZHX().zzXV(true);
        return shapeZzg;
    }

    @Override // com.aspose.words.zzZ9U
    public final void zzs(Shape shape) throws Exception {
        Shape shapeZzr = zzr(shape);
        if (shapeZzr != null) {
            shape.getImageData().setImageBytes(zzh(shapeZzr));
        }
    }

    private zzD8 zzZ(int i, zzYSV zzysv) throws Exception {
        zzD8 zzd8 = new zzD8();
        int iZzZ = zzYSO.zzZ(i, zzysv, this.zzZG0);
        zzW4 zzw4 = new zzW4();
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzXR1.getDocument(), Document.class);
        zzw4.zzZ(zzd8, iZzZ, document != null ? document.getBuiltInDocumentProperties().getVersion() : -1);
        zzGK zzgkZzZJd = zzd8.zzZJd();
        zzDO zzdoZzZPg = zzgkZzZJd.zzZPg();
        if ((zzysv.zzYx9() || zzysv.zzYxb()) && i != 7 && i != 4) {
            zzdoZzZPg.zzL(17, 100);
            zzdoZzZPg.zzKB(zzysv.zzYx9() ? 2 : 1);
        }
        if (i == 4) {
            zzdoZzZPg.zzL(32, 0);
        }
        if (i == 7) {
            zzdoZzZPg.zzL(32, 2);
        }
        if (!zzysv.zzYxd() && zzgkZzZJd.zzZPg().zzLh(2)) {
            zzd8.zzZHX().zz45().zzKF(((Integer) zzdoZzZPg.zzLu(2)).intValue());
            zzdoZzZPg.zzL(2, null);
        }
        return zzd8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.aspose.words.zzYSW] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzYT7 zzyt7, Chart chart) throws Exception {
        int i;
        double[] dArr;
        double[] dArr2;
        ChartSeries chartSeriesZzZ;
        com.aspose.words.internal.zzD3<zzGK> zzd3 = new com.aspose.words.internal.zzD3<>();
        com.aspose.words.internal.zzZYG<zzGK> zzzyg = new com.aspose.words.internal.zzZYG<>();
        ?? r7 = 0;
        int i2 = 0;
        for (zzYSS zzyss : zzyt7.zzYxS().zz3H()) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzyss.zzYx5())) {
                zzGK zzgkZzZ = zzZ(zzyss, zzyt7, chart.getChartSpace(), zzd3, zzzyg);
                zzYT6 zzyt6ZzZ = zzyt7.zzYxS().zzZ(zzyss, r7, true);
                if (zzyt6ZzZ != null) {
                    double[] dArrZzZ = zzZ(zzyt7.zzYxU(), zzyss.zzYx5(), true);
                    if (zzyss.zzZQO() == 2 && com.aspose.words.internal.zzZYD.zzXk(zzyss.zzYx4())) {
                        double[] dArrZzZ2 = zzZ(zzyt7.zzYxU(), zzyss.zzYx4(), true);
                        double[] dArrZzZ3 = zzZ(zzyt7.zzYxU(), zzyt6ZzZ.zzYxP(), (boolean) r7);
                        if (dArrZzZ3 == null) {
                            dArrZzZ3 = new double[dArrZzZ2.length];
                            ?? r11 = r7;
                            while (r11 < dArrZzZ2.length) {
                                int i3 = r11 + 1;
                                dArrZzZ3[r11] = i3;
                                r11 = i3;
                                i2 = i2;
                            }
                        }
                        i = i2;
                        dArr2 = dArrZzZ2;
                        dArr = dArrZzZ3;
                    } else {
                        i = i2;
                        dArr = null;
                        dArr2 = null;
                    }
                    String strZzZ = zzZ(zzyt7.zzYxU(), zzyss.zzYx6());
                    ChartSeriesCollection series = chart.getSeries();
                    if (dArr2 == null) {
                        if (com.aspose.words.internal.zzZYD.zzXk(zzyt6ZzZ.zzYxP())) {
                            chartSeriesZzZ = series.zzZ(zzgkZzZ, strZzZ, zzY(zzyt7.zzYxU(), zzyt6ZzZ.zzYxP()), dArrZzZ);
                        } else if (com.aspose.words.internal.zzZYD.zzXk(zzyss.zzYx4())) {
                            chartSeriesZzZ = series.zzZ(zzgkZzZ, strZzZ, zzZ(zzyt7.zzYxU(), zzyss.zzYx4(), true), dArrZzZ);
                        } else {
                            chartSeriesZzZ = series.zzZ(zzgkZzZ, strZzZ, zzsL(dArrZzZ.length), dArrZzZ);
                        }
                    } else {
                        chartSeriesZzZ = series.zzZ(zzgkZzZ, strZzZ, dArr, dArr2, dArrZzZ);
                    }
                    zzZ(zzyss, chartSeriesZzZ);
                    int i4 = i;
                    chartSeriesZzZ.setIndex(i4);
                    chartSeriesZzZ.setOrder(i4);
                    i2 = i4 + 1;
                    if (!zzYSO.zzsK(zzyss.zzZQO())) {
                        chartSeriesZzZ.zz2H().zzaQ().setFill(null);
                    }
                    if (zzyt7.zzYxS().zzYxe().zzYxc() != 0) {
                        chartSeriesZzZ.setSmooth(true);
                    }
                } else {
                    i2 = i2;
                }
            }
            r7 = 0;
        }
        zzR(zzd3);
    }

    private zzGK zzZ(zzYSS zzyss, zzYT7 zzyt7, zzD8 zzd8, com.aspose.words.internal.zzD3<zzGK> zzd3, com.aspose.words.internal.zzZYG<zzGK> zzzyg) throws Exception {
        if (!zzd3.zzVE(zzyss.zzZQO())) {
            zzDT zzdtZz45 = zzZ(zzyss.zzZQO(), zzyt7.zzYxS().zzYxe()).zzZHX().zz45();
            zzGK zzgkZzZJd = zzdtZz45.zzZJd();
            zzd8.zzZHX().zz45().zzU(zzgkZzZJd);
            String strZzYx7 = com.aspose.words.internal.zzZYD.zzXk(zzyss.zzYx7()) ? zzyss.zzYx7() : "";
            if (!zzzyg.containsKey(strZzYx7)) {
                Iterator<ChartAxis> it = zzdtZz45.zz3G().iterator();
                while (it.hasNext()) {
                    zzd8.zzZHX().zz45().zzN(it.next());
                }
                zzZ(zzyss, zzyt7, zzgkZzZJd);
                zzzyg.set(strZzYx7, zzgkZzZJd);
            } else {
                zzDO zzdoZzZPg = zzzyg.get(strZzYx7).zzZPg();
                zzDO zzdoZzZPg2 = zzgkZzZJd.zzZPg();
                zzdoZzZPg2.zzL(0, zzdoZzZPg.zzLu(0));
                zzdoZzZPg2.zzL(1, zzdoZzZPg.zzLu(1));
                zzdoZzZPg2.zzL(2, zzdoZzZPg.zzLu(2));
            }
            zzdtZz45.zzZJg();
            Iterator<zzGK> it2 = zzdtZz45.zzZJf().iterator();
            while (it2.hasNext()) {
                it2.next().zzY3(false);
            }
            if (zzgkZzZJd.zzZQO() == 4) {
                if (com.aspose.words.internal.zzZYD.zzXk(zzyt7.zzYxS().zzYxk())) {
                    zzD9 zzd9 = new zzD9();
                    zzYSO.zzZ((zzYRL) zzyt7.zzYxS().zzYxh(), zzd9, false);
                    zzgkZzZJd.zzZPg().zzL(6, zzd9);
                }
                if (com.aspose.words.internal.zzZYD.zzXk(zzyt7.zzYxS().zzYxj()) || com.aspose.words.internal.zzZYD.zzXk(zzyt7.zzYxS().zzYxi())) {
                    zzCH zzch = new zzCH();
                    zzYSO.zzZ((zzYRL) zzyt7.zzYxS().zzYxf(), zzch.zzZGh(), false);
                    zzYSO.zzZ((zzYRL) zzyt7.zzYxS().zzYxg(), zzch.zzZGi(), false);
                    zzch.zzZGh().setOutline(null);
                    zzch.zzZGi().setOutline(null);
                    zzch.zzXx(!zzch.zzZGh().isEmpty());
                    zzch.zzXy(!zzch.zzZGi().isEmpty());
                    zzgkZzZJd.zzZPg().zzL(26, zzch);
                }
            }
            zzd3.set(zzyss.zzZQO(), zzgkZzZJd);
        }
        return zzd3.get(zzyss.zzZQO());
    }

    private void zzZ(zzYSS zzyss, zzYT7 zzyt7, zzGK zzgk) {
        zzYSW zzyswZzYxS = zzyt7.zzYxS();
        zzYT6 zzyt6ZzZ = zzyswZzYxS.zzZ(zzyss, 0, false);
        zzYT6 zzyt6ZzZ2 = zzyswZzYxS.zzZ(zzyss, 1, false);
        zzYT6 zzyt6ZzZ3 = zzyswZzYxS.zzZ(zzyss, 2, false);
        ChartAxis chartAxisZzZ = zzYSO.zzZ(zzgk, 0);
        ChartAxis chartAxisZzZ2 = zzYSO.zzZ(zzgk, 1);
        ChartAxis chartAxisZzZ3 = zzYSO.zzZ(zzgk, 2);
        zzZ(zzyt6ZzZ, chartAxisZzZ);
        zzZ(zzyt6ZzZ2, chartAxisZzZ2);
        zzZ(zzyt6ZzZ3, chartAxisZzZ3);
        if (zzyt7.getType() == 1) {
            zzgk.zzZPg().zzL(11, Integer.valueOf(zzyt6ZzZ2.zzYxM().getGapWidth()));
            if (!zzyt7.zzYxS().zzYxe().zzYx9() && !zzyt7.zzYxS().zzYxe().zzYxb()) {
                zzgk.zzZPg().zzL(17, Integer.valueOf(zzyt6ZzZ2.zzYxM().zzZQk()));
            }
        }
        if (!zzyswZzYxS.zzYxe().zzYxb() || zzyt7.getType() == 7 || zzyt7.getType() == 4) {
            return;
        }
        chartAxisZzZ2.zzZ(new zzE8());
        chartAxisZzZ2.zz4d().setFormatCode("0%");
    }

    private void zzZ(zzYT6 zzyt6, ChartAxis chartAxis) {
        if (chartAxis == null) {
            return;
        }
        if (zzyt6 == null) {
            chartAxis.setHidden(true);
            return;
        }
        chartAxis.zzZ(zzZ(zzyt6.zzYxR(), chartAxis));
        zzGA.zzP(chartAxis);
        zzYSO.zzZ((zzYRL) zzyt6.zzYxl(), chartAxis.zzaQ(), false);
        zzYSO.zzZ(zzyt6.zzYxl().zzZYh(), chartAxis.zzaR().zzZHj());
        zzYT5 zzyt5ZzYxM = zzyt6.zzYxM();
        chartAxis.setHidden(!zzyt5ZzYxM.getVisible());
        chartAxis.getTickLabels().setPosition(zzYSO.zzZ(zzyt6, this.zzZG0));
        if (!Double.isNaN(zzyt5ZzYxM.zzYxI())) {
            chartAxis.zz4g().setValue(zzyt5ZzYxM.zzYxI());
        } else {
            chartAxis.setMajorUnitIsAuto(true);
        }
        if (zzyt5ZzYxM.zzYxH() > 0 && !chartAxis.getMajorUnitIsAuto()) {
            chartAxis.setMinorUnit(chartAxis.getMajorUnit() / ((double) zzyt5ZzYxM.zzYxH()));
        }
        chartAxis.setMajorTickMark(zzD(zzyt5ZzYxM.zzYxD(), zzyt5ZzYxM.zzYxC()));
        chartAxis.setMinorTickMark(zzD(zzyt5ZzYxM.zzYxB(), zzyt5ZzYxM.zzYxA()));
        chartAxis.getScaling().setOrientation(!zzyt5ZzYxM.zzYxE() ? 1 : 0);
        if (!Double.isNaN(zzyt5ZzYxM.zzYxF())) {
            chartAxis.getScaling().setMinimum(new AxisBound(zzyt5ZzYxM.zzYxF()));
        }
        if (!Double.isNaN(zzyt5ZzYxM.zzYxG())) {
            chartAxis.getScaling().setMaximum(new AxisBound(zzyt5ZzYxM.zzYxG()));
        }
        if (com.aspose.words.internal.zzAN.zzL(zzyt5ZzYxM.zzYxK(), Double.MAX_VALUE)) {
            chartAxis.setCrosses(1);
        } else if (com.aspose.words.internal.zzAN.zzL(zzyt5ZzYxM.zzYxK(), -1.7976931348623157E308d)) {
            chartAxis.setCrosses(2);
        } else if (com.aspose.words.internal.zzAN.zzZD(zzyt5ZzYxM.zzYxK())) {
            chartAxis.setCrosses(0);
        } else {
            chartAxis.setCrosses(3);
            chartAxis.setCrossesAt(zzyt5ZzYxM.zzYxK());
        }
        chartAxis.zzZ(zzZ(zzyt6.zzYxO()));
        chartAxis.zzY(zzZ(zzyt6.zzYxN()));
        String strZzYxm = zzyt6.zzYxm();
        if (strZzYxm != null) {
            chartAxis.getNumberFormat().setFormatCode(strZzYxm);
        }
    }

    private static zzET zzZ(zzYSR zzysr) {
        if (zzysr == null) {
            return null;
        }
        zzET zzet = new zzET();
        zzYSO.zzZ((zzYRL) zzysr, zzet.zzaQ(), false);
        return zzet;
    }

    private zzCU zzZ(zzYSQ zzysq, zzZCO zzzco) {
        zz30 zz30VarZzZHc;
        if (zzysq == null) {
            return null;
        }
        zzCU zzcu = new zzCU(zzzco);
        if (com.aspose.words.internal.zzZYD.zzXk(zzysq.getText())) {
            zzcu.setText(zzysq.getText());
        }
        zzYSO.zzZ((zzYRL) zzysq.zzYxl(), zzcu.zzaQ(), false);
        if (zzcu.zz3u() == null) {
            zz30VarZzZHc = zzcu.zzaR().zzZHj();
        } else {
            zz30VarZzZHc = zzcu.zz3u().zzZGw().zzMi().get(0).zzZxp().zzZHc();
        }
        zzYSO.zzZ(zzysq.zzYxl().zzZYh(), zz30VarZzZHc);
        zzcu.zzZ(zzZ(zzysq.zzQb(), zzysq.zzYm(), Double.NaN, Double.NaN, zzysq.zzYxl()));
        return zzcu;
    }

    private static boolean zzZ(zzYSR zzysr, int i) {
        Object objZzPk = zzysr.zzYx1().zzPk(i);
        return objZzPk != null && ((Boolean) objZzPk).booleanValue();
    }

    private zzEH zzZ(double d, double d2, double d3, double d4, zzYSR zzysr) {
        zzEH zzeh = new zzEH();
        if (!zzZ(zzysr, 1)) {
            if (!Double.isNaN(d) && !com.aspose.words.internal.zzAN.zzZD(this.zzXR1.getWidth())) {
                zzeh.setLeft(d / this.zzXR1.getWidth());
            }
            if (!Double.isNaN(d2) && !com.aspose.words.internal.zzAN.zzZD(this.zzXR1.getHeight())) {
                zzeh.setTop(d2 / this.zzXR1.getHeight());
            }
        }
        if (!zzZ(zzysr, 2)) {
            if (!Double.isNaN(d3) && !com.aspose.words.internal.zzAN.zzZD(this.zzXR1.getWidth())) {
                zzeh.setWidth(d3 / this.zzXR1.getWidth());
            }
            if (!Double.isNaN(d4) && !com.aspose.words.internal.zzAN.zzZD(this.zzXR1.getHeight())) {
                zzeh.setHeight(d4 / this.zzXR1.getHeight());
            }
        }
        if (zzeh.isEmpty()) {
            return null;
        }
        zzeh.zzKN(0);
        zzeh.zzKM(0);
        return zzeh;
    }

    private void zzZ(zzYT7 zzyt7, zzD8 zzd8) {
        if (zzyt7.zzYxT() == null) {
            zzd8.zzZHX().zzZ((ChartLegend) null);
            return;
        }
        ChartLegend chartLegend = new ChartLegend(zzd8.zzZHX());
        zzd8.zzZHX().zzZ(chartLegend);
        chartLegend.setPosition(zzYSO.zzZ(zzyt7.zzYxT().getPosition(), this.zzZG0));
        if (zzyt7.zzYxT().getPosition() == 0) {
            chartLegend.zzZ(zzZ(zzyt7.zzYxT().zzQb(), zzyt7.zzYxT().zzYm(), Double.NaN, Double.NaN, zzyt7.zzYxT().zzYxl()));
        }
        if (zzyt7.zzYxl().zzZYh() != null) {
            zzYSO.zzZ(zzyt7.zzYxl().zzZYh(), chartLegend.zzaR().zzZHj());
            if (!chartLegend.zzaR().zzZHj().isEmpty()) {
                chartLegend.zzaR().zzZGt().zzZxp().zzWS(true);
            }
        }
        zzYSO.zzZ((zzYRL) zzyt7.zzYxl(), chartLegend.zzaQ(), false);
    }

    private void zzZ(zzYSS zzyss, ChartSeries chartSeries) {
        zzYSR zzysrZzYxl;
        zzGK zzgkZz3I = chartSeries.zz3I();
        zzZ(zzyss.zzYx2(), chartSeries.zz2H());
        zzZ(zzyss.zzYxl(), (zzyss.zzYxt() == null || zzyss.zzYxt().zzYxl() == null) ? zzyss.zzYxl() : zzyss.zzYxt().zzYxl(), zzyss, chartSeries.getDataLabels().zz3q(), zzgkZz3I.zzZQO());
        if (chartSeries.getDataLabels().zz3q().getCount() > 0) {
            chartSeries.hasDataLabels(true);
        }
        if (zzgkZz3I.zzZQO() == 11) {
            zzgkZz3I.zzZPg().zzL(16, Integer.valueOf(zzYSO.zzsJ(zzyss.zzYx2().zzYxs().zzYxq())));
        }
        int iZzYxu = 0;
        for (zzYT2 zzyt2 : zzyss.zzYx3()) {
            if (!com.aspose.words.internal.zzZYD.zzXk(zzyt2.getStyleName())) {
                iZzYxu += zzyt2.zzYxu();
            } else {
                zzyt2.zzYxl().zzYx1().zzZ(zzyss.zzYxl().zzYx1());
                for (int i = 0; i < zzyt2.zzYxu(); i++) {
                    ChartDataPoint chartDataPoint = new ChartDataPoint(zzgkZz3I);
                    chartDataPoint.setIndex(iZzYxu);
                    chartDataPoint.zz3d().zzL(5, new zzD9());
                    zzZ(zzyt2, chartDataPoint);
                    chartSeries.getDataPoints().zzW(chartDataPoint);
                    chartSeries.hasDataLabels(true);
                    ChartDataLabel chartDataLabel = chartSeries.getDataLabels().get(iZzYxu);
                    if (zzyt2.zzYxt() != null && zzyt2.zzYxt().zzYxl() != null) {
                        zzysrZzYxl = zzyt2.zzYxt().zzYxl();
                    } else {
                        zzysrZzYxl = zzyt2.zzYxl();
                    }
                    zzZ(zzyt2.zzYxl(), zzysrZzYxl, zzyt2.zzYxt(), chartDataLabel.zz3q(), zzgkZz3I.zzZQO());
                    iZzYxu++;
                }
            }
        }
    }

    private void zzZ(zzYSR zzysr, zzYSR zzysr2, zzYSZ zzysz, zzFT zzft, int i) {
        String strZzYxm;
        zzZ(zzysr2, zzft);
        zzZ(zzysr, zzft, i);
        if (zzysz == null || (strZzYxm = zzysz.zzYxm()) == null) {
            return;
        }
        zzE8 zze8 = new zzE8();
        zze8.setFormatCode(strZzYxm);
        zze8.zzXR(false);
        zzft.zzL(5, zze8);
    }

    private static void zzZ(zzYSR zzysr, zzFT zzft) {
        zzYEF zzyefZzZYh;
        if (zzysr == null || (zzyefZzZYh = zzysr.zzZYh()) == null || zzyefZzZYh.getCount() == 0) {
            return;
        }
        zzCL zzcl = new zzCL();
        zzYSO.zzZ(zzyefZzZYh, zzcl.zzZHj());
        zzcl.zzZGt().zzZxp().zzWS(true);
        zzft.zzL(17, zzcl);
    }

    private void zzZ(zzYSR zzysr, zzFT zzft, int i) {
        if (zzysr == null) {
            return;
        }
        zzYT3 zzyt3 = new zzYT3(zzysr.zzYx1());
        int iZzYxz = zzyt3.zzYxz();
        if (iZzYxz == 1) {
            zzft.zzL(10, Boolean.TRUE);
        } else if (iZzYxz == 2) {
            zzft.zzL(12, Boolean.TRUE);
        } else if (iZzYxz != 3) {
            Boolean bool = Boolean.FALSE;
            zzft.zzL(12, bool);
            zzft.zzL(10, bool);
        } else {
            Boolean bool2 = Boolean.TRUE;
            zzft.zzL(12, bool2);
            zzft.zzL(10, bool2);
        }
        zzft.zzL(8, Boolean.valueOf(zzyt3.zzYxx()));
        zzft.zzL(9, Boolean.valueOf(zzyt3.zzYxy()));
        if (com.aspose.words.internal.zzZYD.zzXk(zzyt3.zzYxw())) {
            zzft.zzL(6, zzyt3.zzYxw());
        }
        zzft.zzL(2, Integer.valueOf(zzYSO.zzX(zzyt3.zzYxv(), i, this.zzZG0)));
    }

    private static void zzZ(zzYT2 zzyt2, ChartDataPoint chartDataPoint) {
        if (zzyt2.zzYxl() == null) {
            return;
        }
        zzYSO.zzZ((zzYRL) zzyt2.zzYxl(), chartDataPoint.zzaQ(), false);
        if (zzyt2.zzYxs().zzYxr() > 0) {
            chartDataPoint.setExplosion(zzyt2.zzYxs().zzYxr());
        }
        ChartMarker marker = chartDataPoint.getMarker();
        if (zzyt2.zzYxs().zzYxo() == 2) {
            chartDataPoint.zz3I().zzZPg().zzL(24, Boolean.TRUE);
            marker.setSymbol(zzYSO.zzsI(zzyt2.zzYxs().zzYxp()));
            marker.setSize((int) zzyt2.zzYxs().zzYxn());
            marker.zz2O().zzL(2, new zzD9());
            zzYSO.zzZ((zzYRL) zzyt2.zzYxl(), marker.zzaQ(), false);
            marker.zzaQ().getOutline().zzHn(1);
        }
        if (zzyt2.zzYxs().zzYxo() == 0) {
            chartDataPoint.zz3I().zzZPg().zzL(24, Boolean.FALSE);
            marker.setSymbol(5);
        }
        if (chartDataPoint.zz3I().zzZQO() == 6 && chartDataPoint.zzaQ().getOutline().getFill().zzZQ4() == 3 && chartDataPoint.getMarker().getSymbol() == 5) {
            chartDataPoint.zzaQ().setOutline(new zz4G());
            chartDataPoint.zzaQ().getOutline().setFill(chartDataPoint.zzaQ().getFill());
        }
    }

    private static String zzZ(zzYPI zzypi, String str) throws Exception {
        long jZzGe = zzGe(str);
        return com.aspose.words.internal.zzZKN.zzTX(zzypi.zzrB((int) (jZzGe >> 32)).zzrL((int) jZzGe).zz6C().toString(70));
    }

    private static double[] zzZ(zzYPI zzypi, String str, boolean z) throws Exception {
        String[] strArrZzY = zzY(zzypi, str);
        int length = strArrZzY.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            double dZzZs = com.aspose.words.internal.zzJB.zzZs(strArrZzY[i]);
            dArr[i] = dZzZs;
            double d = (Double.isNaN(dZzZs) && z) ? 0.0d : dArr[i];
            dArr[i] = d;
            if (Double.isNaN(d)) {
                return null;
            }
        }
        return dArr;
    }
}
