package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TextBoxControl extends MorphDataControl {
    private zzYO8 zzZxa;

    public TextBoxControl(String str) {
        super(str);
        zzYO8 zzyo8Zzh = zzYO8.zzh(72.0d, 18.0d);
        this.zzZxa = zzyo8Zzh;
        zzZ(zzyo8Zzh);
    }

    @Override // com.aspose.words.OleControl
    public String getClsidVirtual() {
        return "8bd21d10-ec42-11ce-9e0d-00aa006002f3";
    }

    public final String getFontName() {
        return (String) this.zzYvV.zzPj(31600);
    }

    public String getText() {
        return getValue();
    }

    @Override // com.aspose.words.Forms2OleControl
    public int getType() {
        return 2;
    }

    public void setText(String str) {
        setValue(str);
    }

    public final int zz1B() {
        return ((Integer) this.zzYvV.zzPj(31625)).intValue();
    }

    public final int zz1C() {
        return ((Integer) this.zzYvV.zzPj(31605)).intValue();
    }

    public final int zz1D() {
        return ((Integer) this.zzYvV.zzPj(31610)).intValue();
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int zz1E() {
        return 23;
    }
}
