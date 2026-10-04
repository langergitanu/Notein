package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3S {
    private Shape zzZ2R;

    private void zzZwv() {
        if (((Boolean) this.zzZ2R.zzYvW().zzPj(446)).booleanValue()) {
            zzYC3 zzyc3ZzYvW = this.zzZ2R.zzYvW();
            int iIntValue = ((Integer) zzyc3ZzYvW.zzPj(404)).intValue();
            int iIntValue2 = ((Integer) zzyc3ZzYvW.zzPj(401)).intValue();
            int iIntValue3 = ((Integer) zzyc3ZzYvW.zzPj(403)).intValue();
            int iIntValue4 = ((Integer) zzyc3ZzYvW.zzPj(402)).intValue();
            double dDoubleValue = ((Double) zzyc3ZzYvW.zzPj(StyleIdentifier.SUBTLE_EMPHASIS)).doubleValue();
            double dDoubleValue2 = ((Double) zzyc3ZzYvW.zzPj(StyleIdentifier.INTENSE_EMPHASIS)).doubleValue();
            double width = this.zzZ2R.getWidth();
            double height = this.zzZ2R.getHeight();
            double dZzZ = zzZ(width, dDoubleValue, iIntValue2, iIntValue3);
            double dZzZ2 = zzZ(height, dDoubleValue2, iIntValue4, iIntValue);
            if (dZzZ > dZzZ2) {
                height *= dZzZ2 / dZzZ;
            } else {
                width *= dZzZ / dZzZ2;
            }
            zzyc3ZzYvW.zzQ(4131, Double.valueOf(width));
            zzyc3ZzYvW.zzQ(4132, Double.valueOf(height));
        }
    }

    public final Shape zzZ(Shape shape, zzYDZ zzydz) throws Exception {
        shape.getMarkupLanguage();
        zzYC3 zzyc3 = (zzYC3) shape.zzYvW().zzbn();
        Shape shape2 = new Shape(shape.getDocument());
        this.zzZ2R = shape2;
        shape2.zzS(zzyc3);
        this.zzZ2R.setShapeType(75);
        this.zzZ2R.zzZ((zzYEF) shape.zzZYh().zzbn());
        zzZwv();
        if (shape.getImageData().zzZjT()) {
            try {
                this.zzZ2R.getImageData().setImageBytes(zzZ8K.zzZW(shape.getImageData().getImageBytes()));
            } catch (Exception unused) {
                this.zzZ2R.getImageData().setImageBytes(com.aspose.words.internal.zzEF.zzDL());
            }
        }
        if (this.zzZ2R.getImageData().isLink()) {
            zzZ(this.zzZ2R, this.zzZ2R.getImageData().zzYW2(), zzydz.zzYfy.getWarningCallback());
        }
        zz3V zz3v = (zz3V) shape.zzY9i();
        if (zz3v.zzZBM()) {
            this.zzZ2R.zzY9h().zzXh(zz3v.zzZBM());
        }
        return this.zzZ2R;
    }

    private static double zzZ(double d, double d2, int i, int i2) {
        double dZzXz = zz3W.zzXz(i) + zz3W.zzXz(i2);
        if (dZzXz > 0.0d) {
            d *= dZzXz;
        }
        if (d > 0.0d) {
            return d2 / d;
        }
        return 1.0d;
    }

    private static void zzZ(Shape shape, byte[] bArr, IWarningCallback iWarningCallback) throws Exception {
        if (bArr != null) {
            try {
                shape.getImageData().setImageBytes(bArr);
            } catch (Exception e) {
                zzY1Z.zzZ(iWarningCallback, 65536, 2, com.aspose.words.internal.zzZKN.format("Some of DrawingML shape can not set image data loaded from specified link. {0}: {1}", "Detail message", e.getMessage()));
            }
        }
    }
}
