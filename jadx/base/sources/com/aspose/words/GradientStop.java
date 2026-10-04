package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class GradientStop {
    private GradientStopCollection zzYuw;
    private zz7B zzYux;
    private zzZ90 zzZxX;

    public GradientStop(int i, double d) {
        com.aspose.words.internal.zzZ4.zzY((Object) Integer.valueOf(i), "Color");
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 1.0d, "Position");
        this.zzYux = new zz7B(d, zzBW.zzj(com.aspose.words.internal.zzPV.zzYR(i)));
    }

    private com.aspose.words.internal.zzPV zzZ5d() {
        return this.zzYux.zzZQX().zzZ(this.zzZxX, (zzZCM) null);
    }

    public int getBaseColor() {
        return this.zzYux.zzZQX().zzY(this.zzZxX).zzPF().zzPG();
    }

    public int getColor() {
        return zzZ5d().zzPF().zzPG();
    }

    public double getPosition() {
        return this.zzYux.getPosition();
    }

    public double getTransparency() {
        GradientStopCollection gradientStopCollection = this.zzYuw;
        if (gradientStopCollection != null) {
            return gradientStopCollection.zzZ5c().zzZBt().getTransparency(this.zzYux.zzZQX());
        }
        if (this.zzYux.zzZQX().zzZFG() == null) {
            return 0.0d;
        }
        return this.zzYux.zzZQX().zzZFG().getValue();
    }

    public void remove() {
        GradientStopCollection gradientStopCollection = this.zzYuw;
        if (gradientStopCollection == null) {
            throw new IllegalStateException("The gradient stop doesn't belong to any collection.");
        }
        gradientStopCollection.remove(this);
    }

    public void setColor(int i) {
        com.aspose.words.internal.zzZ4.zzY((Object) Integer.valueOf(i), "Color");
        this.zzYux.zzZ(zzBW.zzj(com.aspose.words.internal.zzPV.zzYR(i)));
    }

    public void setPosition(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 1.0d, "Position");
        this.zzYux.setPosition(d);
    }

    public void setTransparency(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 1.0d, "Transparency");
        GradientStopCollection gradientStopCollection = this.zzYuw;
        if (gradientStopCollection == null) {
            this.zzYux.zzZQX().zzY0(d);
        } else {
            gradientStopCollection.zzZ5c().zzZBt().setTransparency(this.zzYux.zzZQX(), d);
        }
    }

    public final void zzZ(GradientStopCollection gradientStopCollection) {
        this.zzYuw = gradientStopCollection;
        if (gradientStopCollection == null || this.zzYux.zzZQX().zzZFG() == null || (this.zzYuw.zzZ5c().zzZBt() instanceof Font)) {
            return;
        }
        this.zzYux.zzZQX().zzY0(1.0d - this.zzYux.zzZQX().zzZFG().getValue());
    }

    public final zz7B zzZ5e() {
        return this.zzYux;
    }

    public final GradientStopCollection zzZ5f() {
        return this.zzYuw;
    }

    public GradientStop(int i, double d, double d2) {
        this(i, d);
        setTransparency(d2);
    }

    public GradientStop(zz7B zz7b, zzZ90 zzz90, GradientStopCollection gradientStopCollection) {
        com.aspose.words.internal.zzZ4.zzY((Object) zz7b, "dmlGradientStop");
        this.zzYux = zz7b;
        this.zzZxX = zzz90;
        this.zzYuw = gradientStopCollection;
    }
}
