package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGL {
    private boolean zzYoC;
    private int zzYoD = 0;
    private boolean zzYoE;
    private double zzYoF;
    private boolean zzYoG;
    private double zzYoH;
    private boolean zzYoI;
    private double zzYoJ;
    private double zzYoK;
    private double zzYoL;
    private double zzYoM;

    private zzZGL() {
    }

    private void setLeftPadding(double d) {
        this.zzYoH = d;
        this.zzYoG = true;
    }

    public static zzZGL zzV(Paragraph paragraph, int i) {
        zzZ45 zzz45ZzP = zzZ45.zzP(paragraph, i);
        zzZGL zzzgl = new zzZGL();
        zzzgl.setLeftPadding(0.0d);
        zzzgl.setLeftMargin(zzz45ZzP.getLeftIndent());
        zzzgl.zzWX(zzz45ZzP.zzYNW() - zzz45ZzP.getLeftIndent());
        zzzgl.zzYoM = zzz45ZzP.zzZ1a();
        zzzgl.zzYoL = zzz45ZzP.zzZ19();
        return zzzgl;
    }

    private void zzWX(double d) {
        this.zzYoF = d;
        this.zzYoE = true;
    }

    public static zzZGL zzX(Paragraph paragraph, boolean z, boolean z2) {
        zzZ45 zzz45ZzP = zzZ45.zzP(paragraph, 1);
        zzZGL zzzgl = new zzZGL();
        zzzgl.zzYoL = zzz45ZzP.zzZ19();
        if (zzz45ZzP.zzYNW() < 0.0d) {
            zzzgl.zzYoK = -zzz45ZzP.zzYNW();
        }
        double dZzYNV = zzz45ZzP.zzYNV() - (zzz45ZzP.zzYNW() + zzz45ZzP.zzZ19());
        if (z) {
            dZzYNV -= 5.0d;
        }
        if (dZzYNV < 0.0d) {
            dZzYNV = 0.0d;
        }
        int i = Math.abs(zzz45ZzP.zzYNV() - zzz45ZzP.getLeftIndent()) < 1.0d ? 1 : 0;
        if (!z || i == 0) {
            zzzgl.zzzj(i ^ 1);
            zzzgl.setLeftPadding(0.0d);
            zzzgl.setLeftMargin(zzz45ZzP.getLeftIndent());
            zzzgl.zzWX(zzz45ZzP.zzYNW() - zzz45ZzP.getLeftIndent());
            zzzgl.zzYoM = dZzYNV;
            return zzzgl;
        }
        zzzgl.zzzj(0);
        zzzgl.setLeftPadding(dZzYNV);
        zzzgl.setLeftMargin(zzz45ZzP.getLeftIndent() - dZzYNV);
        zzzgl.zzWX(0.0d);
        zzzgl.zzYoM = 0.0d;
        return zzzgl;
    }

    private String zzZ17() {
        int i = this.zzYoD;
        if (i == 0) {
            return "outside";
        }
        if (i == 1) {
            return "inside";
        }
        if (i == 2) {
            return "inherit";
        }
        throw new IllegalArgumentException();
    }

    private void zzzj(int i) {
        this.zzYoD = i;
        this.zzYoC = true;
    }

    public final double getLeftMargin() {
        return this.zzYoJ;
    }

    public final double getLeftPadding() {
        return this.zzYoH;
    }

    public final void setLeftMargin(double d) {
        this.zzYoJ = d;
        this.zzYoI = true;
    }

    public final void zzZ(zzLU zzlu, int i, boolean z) {
        zzO0 zzo0 = new zzO0();
        zzo0.setLeft(this.zzYoJ);
        zzo0.zzYd(this.zzYoI);
        zzo0.zzl(i, z).zzZ(zzlu);
        zzN5 zzn5 = new zzN5();
        zzn5.setLeft(this.zzYoH);
        zzn5.zzYd(this.zzYoG);
        zzn5.zzj(i, z).zzZ(zzlu);
        if (this.zzYoE) {
            zzlu.zzZ("text-indent", this.zzYoF, 4);
        }
        if (this.zzYoC && this.zzYoD != 0) {
            zzlu.zzZs("list-style-position", zzZ17());
        }
        if (z && zzlu.zzSd("text-align") == null) {
            zzlu.zzZs("text-align", "right");
        }
    }

    public final double zzZ18() {
        return this.zzYoK;
    }

    public final double zzZ19() {
        return this.zzYoL;
    }

    public final double zzZ1a() {
        return this.zzYoM;
    }
}
