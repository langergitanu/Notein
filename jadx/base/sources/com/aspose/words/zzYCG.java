package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCG {
    private int zzFV;
    private double zzXnn;

    public zzYCG(Shape shape) {
        if (shape.getMarkupLanguage() != 0) {
            TextBox textBox = shape.getTextBox();
            this.zzFV = textBox.getTextBoxWrapMode();
            this.zzXnn = textBox.getInternalMarginRight() + textBox.getInternalMarginLeft();
            return;
        }
        zz2O zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(shape.zzY9i(), zz2O.class);
        if (zz2o == null || zz2o.zzZAk() == null) {
            this.zzFV = 2;
            this.zzXnn = 0.0d;
        } else {
            zz10 zz10VarZzZtK = zz2o.zzZAk().zzZCZ().zzZtK();
            this.zzFV = zz10VarZzZtK.zzZts();
            this.zzXnn = ((double) (zz10VarZzZtK.zzZtD() + zz10VarZzZtK.zzZtE())) / 12700.0d;
        }
    }

    public final int zzNa() {
        return this.zzFV;
    }

    public final double zzYax() {
        return this.zzXnn;
    }
}
