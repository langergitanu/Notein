package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartTitle {
    private zzZCO zzZyD;

    public ChartTitle(zzZCO zzzco) {
        this.zzZyD = zzzco;
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
        this.zzZyD.setTitleDeleted(!z);
    }

    public void setText(String str) {
        zz3F().setText(str);
    }

    public final zzCU zz3F() {
        if (this.zzZyD.getDCTitle() == null) {
            zzZCO zzzco = this.zzZyD;
            zzzco.setDCTitle(new zzCU(zzzco));
        }
        return this.zzZyD.getDCTitle();
    }
}
