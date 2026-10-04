package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
public class MotionEffect extends Behavior implements IMotionEffect {

    /* JADX INFO: renamed from: c5 */
    int f2818c5;

    /* JADX INFO: renamed from: ck */
    int f2819ck;

    /* JADX INFO: renamed from: fa */
    float f2822fa;

    /* JADX INFO: renamed from: jd */
    MotionPath f2824jd;

    /* JADX INFO: renamed from: du */
    C12025x6 f2820du = new C12025x6(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: h4 */
    C12025x6 f2823h4 = new C12025x6(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: m9 */
    C12025x6 f2825m9 = new C12025x6(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: dy */
    C12025x6 f2821dy = new C12025x6(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: du */
    public C12025x6 m2013du() {
        return this.f2821dy;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final float getAngle() {
        return this.f2822fa;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final PointF getBy() {
        return (PointF) C12025x6.m56887x1(m2017to());
    }

    @Override // com.aspose.slides.IMotionEffect
    public final PointF getFrom() {
        return (PointF) C12025x6.m56887x1(m2019x1());
    }

    @Override // com.aspose.slides.IMotionEffect
    public final int getOrigin() {
        return this.f2818c5;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final IMotionPath getPath() {
        return this.f2824jd;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final int getPathEditMode() {
        return this.f2819ck;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final PointF getRotationCenter() {
        return (PointF) C12025x6.m56887x1(m2013du());
    }

    @Override // com.aspose.slides.IMotionEffect
    public final PointF getTo() {
        return (PointF) C12025x6.m56887x1(m2015kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m2014k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f2820du);
    }

    /* JADX INFO: renamed from: kk */
    public C12025x6 m2015kk() {
        return this.f2823h4;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setAngle(float f) {
        this.f2822fa = f;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setBy(PointF pointF) {
        m2016kk(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setFrom(PointF pointF) {
        m2014k4(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setOrigin(int i) {
        this.f2818c5 = i;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setPath(IMotionPath iMotionPath) {
        this.f2824jd = (MotionPath) iMotionPath;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setPathEditMode(int i) {
        this.f2819ck = i;
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setRotationCenter(PointF pointF) {
        m2018to(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IMotionEffect
    public final void setTo(PointF pointF) {
        m2020x1(C12025x6.m56882k4(pointF));
    }

    /* JADX INFO: renamed from: to */
    public C12025x6 m2017to() {
        return this.f2825m9;
    }

    /* JADX INFO: renamed from: x1 */
    public C12025x6 m2019x1() {
        return this.f2820du;
    }

    /* JADX INFO: renamed from: kk */
    public void m2016kk(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f2825m9);
    }

    /* JADX INFO: renamed from: to */
    public void m2018to(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f2821dy);
    }

    /* JADX INFO: renamed from: x1 */
    public void m2020x1(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f2823h4);
    }
}
