package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartAxisTitle {
    private zzZCO zzZyD;

    public ChartAxisTitle(zzZCO zzzco) {
        this.zzZyD = zzzco;
    }

    private zzCU zz3F() {
        if (this.zzZyD.getDCTitle() == null) {
            zzZCO zzzco = this.zzZyD;
            zzzco.setDCTitle(new zzCU(zzzco));
            setShow(false);
        }
        return this.zzZyD.getDCTitle();
    }

    public Font getFont() {
        return zz3F().getFont();
    }

    public boolean getOverlay() {
        return zz3F().getOverlay();
    }

    public boolean getShow() {
        return !this.zzZyD.getTitleDeleted();
    }

    public String getText() {
        return zz3F().getText();
    }

    public void setOverlay(boolean z) {
        zz3F().setOverlay(z);
    }

    public void setShow(boolean z) {
        if (getShow() == z) {
            return;
        }
        if (z && this.zzZyD.getDCTitle() == null) {
            zzZCO zzzco = this.zzZyD;
            zzzco.setDCTitle(new zzCU(zzzco));
        }
        this.zzZyD.setTitleDeleted(!z);
        if (z) {
            zz3F().zzZHf();
        }
    }

    public void setText(String str) {
        zz3F().setText(str);
    }
}
