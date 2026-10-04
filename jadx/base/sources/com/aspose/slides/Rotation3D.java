package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
public class Rotation3D implements IRotation3D, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private boolean f3232du;

    /* JADX INFO: renamed from: k4 */
    byte f3235k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC14397rj f3236kk;

    /* JADX INFO: renamed from: x1 */
    int f3239x1;

    /* JADX INFO: renamed from: to */
    private byte f3238to = 30;

    /* JADX INFO: renamed from: h4 */
    private int f3234h4 = 100;

    /* JADX INFO: renamed from: m9 */
    private int f3237m9 = 100;

    /* JADX INFO: renamed from: dy */
    private jwc f3233dy = new jwc();

    public Rotation3D(Chart chart) {
        this.f3236kk = chart;
    }

    @Override // com.aspose.slides.IRotation3D
    public final int getDepthPercents() {
        return this.f3234h4;
    }

    @Override // com.aspose.slides.IRotation3D
    public final int getHeightPercents() {
        return this.f3237m9;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3236kk;
    }

    @Override // com.aspose.slides.IRotation3D
    public final byte getPerspective() {
        return this.f3238to;
    }

    @Override // com.aspose.slides.IRotation3D
    public final boolean getRightAngleAxes() {
        return this.f3232du;
    }

    @Override // com.aspose.slides.IRotation3D
    public final byte getRotationX() {
        return this.f3235k4;
    }

    @Override // com.aspose.slides.IRotation3D
    public final int getRotationY() {
        return this.f3239x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final jwc m2477k4() {
        return this.f3233dy;
    }

    @Override // com.aspose.slides.IRotation3D
    public final void setDepthPercents(int i) {
        int i2 = 65535 & i;
        if (i2 < 20 || i2 > 2000) {
            throw new ArgumentOutOfRangeException("Out of range [20; 2000] for new property value.");
        }
        this.f3234h4 = i;
    }

    @Override // com.aspose.slides.IRotation3D
    public final void setHeightPercents(int i) {
        int i2 = 65535 & i;
        if (i2 < 5 || i2 > 500) {
            throw new ArgumentOutOfRangeException("Out of range [5; 500] for new property value.");
        }
        this.f3237m9 = i;
    }

    @Override // com.aspose.slides.IRotation3D
    public final void setPerspective(byte b) {
        int i = b & 255;
        if (i < 0 || i > 240) {
            throw new ArgumentOutOfRangeException("Out of range [0; 240] for new property value.");
        }
        this.f3238to = b;
    }

    @Override // com.aspose.slides.IRotation3D
    public final void setRightAngleAxes(boolean z) {
        this.f3232du = z;
    }

    @Override // com.aspose.slides.IRotation3D
    public final void setRotationX(byte b) {
        if (b < -90 || b > 90) {
            throw new ArgumentOutOfRangeException("Out of range [-90; 90] for new RotationX property value.");
        }
        this.f3235k4 = b;
    }

    @Override // com.aspose.slides.IRotation3D
    public final void setRotationY(int i) {
        int i2 = 65535 & i;
        if (i2 < 0 || i2 > 360) {
            throw new ArgumentOutOfRangeException("Out of range [0; 360] for new RotationY property value.");
        }
        this.f3239x1 = i;
    }
}
