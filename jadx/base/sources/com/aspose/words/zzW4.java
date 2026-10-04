package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzW4 implements zzZD2 {
    private static com.aspose.words.internal.zz77 zz2Z() throws Exception {
        com.aspose.words.internal.zz77 zz77Var = new com.aspose.words.internal.zz77("document.xml", "test");
        zz77Var.zz5(new com.aspose.words.internal.zzZOR());
        com.aspose.words.internal.zzZYQ.zzY("<document />", zz77Var.zzR1());
        zz77Var.zzR1().zzH(0L);
        return zz77Var;
    }

    @Override // com.aspose.words.zzZD2
    public final Shape zzZ(int i, int i2, double d, int i3, double d2, double d3, double d4, int i4, DocumentBuilder documentBuilder) throws Exception {
        double width;
        double height;
        Shape shape = new Shape((DocumentBase) documentBuilder.getDocument(), (byte) 0);
        zzD8 zzd8 = new zzD8();
        zzZ(zzd8, i, documentBuilder.getDocument().getBuiltInDocumentProperties().getVersion());
        zzGK zzgkZzZJd = zzd8.zzZJd();
        zzZ(i, zzgkZzZJd);
        if (i == 13) {
            zzgkZzZJd.zzZPj().get(0).setBubble3D(true);
        }
        shape.zzU(zzd8);
        shape.zzZ(documentBuilder.zzZpG());
        shape.setRelativeHorizontalPosition(i2);
        shape.setLeft(d);
        shape.setRelativeVerticalPosition(i3);
        shape.setTop(d2);
        shape.setWrapType(i4);
        if (com.aspose.words.internal.zzAN.zzK(d3, 0.0d) || com.aspose.words.internal.zzAN.zzK(d4, 0.0d)) {
            zzYB5 zzyb5ZzZ = zzYBZ.zzZ(new zzYB5(0.0d, 0.0d), zzYBZ.zzX(shape, documentBuilder.getCurrentParagraph()), 0.0d);
            width = zzyb5ZzZ.getWidth();
            height = zzyb5ZzZ.getHeight();
        } else {
            width = d3;
            height = d4;
        }
        shape.zzWf(width);
        shape.zzWe(height);
        documentBuilder.insertNode(shape);
        return shape;
    }

    @Override // com.aspose.words.zzZD2
    public final void zzZ(zzD8 zzd8, int i, int i2) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.ChartTypes.xml", Document.class);
        try {
            zzzopZzW.zzH(0L);
            zzZW1 zzzw1 = new zzZW1(zzzopZzW, new zzYO3());
            zzZXU zzzxuZzS = zzZWW.zzS(zz2Z());
            if (i2 >= 0) {
                ((Document) zzzxuZzS.getDocument()).getBuiltInDocumentProperties().setVersion(i2);
            }
            zzzxuZzS.zzZ(zzzw1);
            String str = "";
            switch (i) {
                case 0:
                case 1:
                case 2:
                    str = "areaChart";
                    break;
                case 3:
                case 4:
                case 5:
                    str = "area3DChart";
                    break;
                case 6:
                case 7:
                case 8:
                    str = "barChart";
                    break;
                case 9:
                case 10:
                case 11:
                    str = "bar3DChart";
                    break;
                case 12:
                case 13:
                    str = "bubbleChart";
                    break;
                case 14:
                case 15:
                case 16:
                    str = "colChart";
                    break;
                case 17:
                    str = "col3DChart";
                    break;
                case 18:
                case 19:
                case 20:
                    str = "col3DClusteredChart";
                    break;
                case 21:
                    str = "doughnutChart";
                    break;
                case 22:
                case 23:
                case 24:
                    str = "lineChart";
                    break;
                case 25:
                    str = "line3DChart";
                    break;
                case 26:
                    str = "pieChart";
                    break;
                case 27:
                    str = "pie3DChart";
                    break;
                case 28:
                case 29:
                    str = "ofPieChart";
                    break;
                case 30:
                    str = "radarChart";
                    break;
                case 31:
                    str = "scatterChart";
                    break;
                case 32:
                    str = "stockChart";
                    break;
                case 33:
                    str = "surfaceChart";
                    break;
                case 34:
                    str = "surface3DChart";
                    break;
            }
            while (zzzxuZzS.zzZsD().zzQ("chartTypes")) {
                if (com.aspose.words.internal.zzZKN.equals(zzzxuZzS.zzZsD().getLocalName(), str)) {
                    while (zzzxuZzS.zzZsD().zzQ(str)) {
                        zzDM.zzZ(zzzxuZzS, zzd8);
                    }
                } else {
                    zzzxuZzS.zzZsD().zzk();
                }
            }
            zzzopZzW.close();
        } catch (Throwable th) {
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
            throw th;
        }
    }

    private static void zzZ(int i, zzGK zzgk) {
        zzDO zzdoZzZPg = zzgk.zzZPg();
        if (i == 1) {
            zzdoZzZPg.zzKB(2);
            return;
        }
        if (i == 2) {
            zzdoZzZPg.zzKB(1);
            return;
        }
        if (i == 4) {
            zzdoZzZPg.zzKB(2);
            return;
        }
        if (i == 5) {
            zzdoZzZPg.zzKB(1);
            return;
        }
        if (i == 7) {
            zzdoZzZPg.zzKB(2);
            zzdoZzZPg.zzL(17, 100);
            return;
        }
        if (i == 8) {
            zzdoZzZPg.zzKB(1);
            zzdoZzZPg.zzL(17, 100);
            return;
        }
        if (i == 10) {
            zzdoZzZPg.zzKB(2);
            return;
        }
        if (i == 11) {
            zzdoZzZPg.zzKB(1);
            return;
        }
        if (i == 13) {
            zzgk.zzZPd();
            return;
        }
        if (i == 15) {
            zzdoZzZPg.zzKB(2);
            zzdoZzZPg.zzL(17, 100);
            return;
        }
        if (i == 16) {
            zzdoZzZPg.zzKB(1);
            zzdoZzZPg.zzL(17, 100);
            return;
        }
        if (i == 18) {
            zzdoZzZPg.zzKB(2);
            return;
        }
        if (i == 19) {
            zzdoZzZPg.zzKB(1);
            return;
        }
        if (i == 23) {
            zzdoZzZPg.zzKB(2);
            return;
        }
        if (i == 24) {
            zzdoZzZPg.zzKB(1);
        } else if (i == 28) {
            zzdoZzZPg.zzKA(0);
        } else {
            if (i != 29) {
                return;
            }
            zzdoZzZPg.zzKA(1);
        }
    }
}
