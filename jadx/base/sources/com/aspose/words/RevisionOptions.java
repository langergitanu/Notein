package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class RevisionOptions implements Cloneable {
    private boolean zzXB2;
    private boolean zzYg1;
    private int zzXB7 = 13;
    private float zzXB6 = 0.576f;
    private int zzXB5 = 5;
    private boolean zzXB4 = true;
    private boolean zzXB3 = true;
    private int zzXB1 = 0;
    private int zzXB0 = 1;
    private int zzXAZ = 13;
    private zzYJ6 zzXAY = zzYJ6.zzXAL;
    private zzYJ6 zzXAX = zzYJ6.zzXAK;
    private zzYJ6 zzXAW = zzYJ6.zzXAJ;
    private zzYJ6 zzXAV = zzYJ6.zzXAI;
    private zzYJ6 zzXAU = zzYJ6.zzXAH;

    private void zzV(zzYJ6 zzyj6) {
        this.zzYg1 = true;
        this.zzXAU = zzyj6;
    }

    private void zzW(zzYJ6 zzyj6) {
        this.zzYg1 = true;
        this.zzXAV = zzyj6;
    }

    private void zzX(zzYJ6 zzyj6) {
        this.zzYg1 = true;
        this.zzXAW = zzyj6;
    }

    private void zzY(zzYJ6 zzyj6) {
        this.zzYg1 = true;
        this.zzXAX = zzyj6;
    }

    private void zzZ(zzYJ6 zzyj6) {
        this.zzYg1 = true;
        this.zzXAY = zzyj6;
    }

    private static void zzpu(int i) {
        if (i == 7) {
            throw new IllegalArgumentException("DoubleStrikeThrough value can only be set for DeletedTextEffect, RevisedPropertiesEffect or MovedFromTextEffect properties.\r\nParameter name: value");
        }
    }

    private static void zzpv(int i) {
        if (i == 8) {
            throw new IllegalArgumentException("Hidden value can only be set for DeletedTextEffect or MovedFromTextEffect properties.\r\nParameter name: value");
        }
    }

    public int getCommentColor() {
        return this.zzXAZ;
    }

    public int getDeletedTextColor() {
        return this.zzXAX.getColor();
    }

    public int getDeletedTextEffect() {
        return zzYJ5.zzpq(this.zzXAX.zzYkP());
    }

    public int getInsertedTextColor() {
        return this.zzXAY.getColor();
    }

    public int getInsertedTextEffect() {
        return zzYJ5.zzpq(this.zzXAY.zzYkP());
    }

    public int getMeasurementUnit() {
        return this.zzXB0;
    }

    public int getMovedFromTextColor() {
        return this.zzXAW.getColor();
    }

    public int getMovedFromTextEffect() {
        return zzYJ5.zzpq(this.zzXAW.zzYkP());
    }

    public int getMovedToTextColor() {
        return this.zzXAV.getColor();
    }

    public int getMovedToTextEffect() {
        return zzYJ5.zzpq(this.zzXAV.zzYkP());
    }

    public int getRevisedPropertiesColor() {
        return this.zzXAU.getColor();
    }

    public int getRevisedPropertiesEffect() {
        return zzYJ5.zzpq(this.zzXAU.zzYkP());
    }

    public int getRevisionBarsColor() {
        return this.zzXB7;
    }

    public int getRevisionBarsPosition() {
        return this.zzXB5;
    }

    public float getRevisionBarsWidth() {
        return this.zzXB6;
    }

    public int getShowInBalloons() {
        return this.zzXB1;
    }

    public boolean getShowOriginalRevision() {
        return this.zzXB2;
    }

    public boolean getShowRevisionBars() {
        return this.zzXB3;
    }

    public boolean getShowRevisionMarks() {
        return this.zzXB4;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setCommentColor(int i) {
        this.zzYg1 = true;
        this.zzXAZ = i;
    }

    public void setDeletedTextColor(int i) {
        zzY(new zzYJ6(i, this.zzXAX.zzYkP()));
    }

    public void setDeletedTextEffect(int i) {
        zzY(new zzYJ6(this.zzXAX.getColor(), zzYJ5.zzpp(i)));
    }

    public void setInsertedTextColor(int i) {
        zzZ(new zzYJ6(i, this.zzXAY.zzYkP()));
    }

    public void setInsertedTextEffect(int i) {
        zzpv(i);
        zzpu(i);
        zzZ(new zzYJ6(this.zzXAY.getColor(), zzYJ5.zzpp(i)));
    }

    public void setMeasurementUnit(int i) {
        this.zzYg1 = true;
        this.zzXB0 = i;
    }

    public void setMovedFromTextColor(int i) {
        zzX(new zzYJ6(i, this.zzXAW.zzYkP()));
    }

    public void setMovedFromTextEffect(int i) {
        zzX(new zzYJ6(this.zzXAW.getColor(), zzYJ5.zzpp(i)));
    }

    public void setMovedToTextColor(int i) {
        zzW(new zzYJ6(i, this.zzXAV.zzYkP()));
    }

    public void setMovedToTextEffect(int i) {
        zzpv(i);
        zzpu(i);
        zzW(new zzYJ6(this.zzXAV.getColor(), zzYJ5.zzpp(i)));
    }

    public void setRevisedPropertiesColor(int i) {
        zzV(new zzYJ6(i, this.zzXAU.zzYkP()));
    }

    public void setRevisedPropertiesEffect(int i) {
        zzpv(i);
        zzV(new zzYJ6(this.zzXAU.getColor(), zzYJ5.zzpp(i)));
    }

    public void setRevisionBarsColor(int i) {
        this.zzYg1 = true;
        this.zzXB7 = i;
    }

    public void setRevisionBarsPosition(int i) {
        if (2 == i || 4 == i) {
            throw new IllegalArgumentException("Center or Inside value is not valid for this property.\r\nParameter name: value");
        }
        this.zzYg1 = true;
        this.zzXB5 = i;
    }

    public void setRevisionBarsWidth(float f) {
        this.zzYg1 = true;
        this.zzXB6 = f;
    }

    public void setShowInBalloons(int i) {
        this.zzYg1 = true;
        this.zzXB1 = i;
    }

    public void setShowOriginalRevision(boolean z) {
        this.zzYg1 = true;
        this.zzXB2 = z;
    }

    public void setShowRevisionBars(boolean z) {
        this.zzYg1 = true;
        this.zzXB3 = z;
    }

    public void setShowRevisionMarks(boolean z) {
        this.zzYg1 = true;
        this.zzXB4 = z;
    }

    public final boolean zzV0(boolean z) {
        boolean z2 = this.zzYg1;
        if (z) {
            this.zzYg1 = false;
        }
        return z2;
    }

    public final zzYJ6 zzYkY() {
        return this.zzXAU;
    }

    public final zzYJ6 zzYkZ() {
        return this.zzXAV;
    }

    public final zzYJ6 zzYl0() {
        return this.zzXAW;
    }

    public final zzYJ6 zzYl1() {
        return this.zzXAX;
    }

    public final zzYJ6 zzYl2() {
        return this.zzXAY;
    }

    public final RevisionOptions zzYl3() {
        return (RevisionOptions) memberwiseClone();
    }
}
