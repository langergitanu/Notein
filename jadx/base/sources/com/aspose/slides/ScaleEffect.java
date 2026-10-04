package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
public class ScaleEffect extends Behavior implements IScaleEffect {

    /* JADX INFO: renamed from: du */
    C12025x6 f3278du = new C12025x6(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: h4 */
    C12025x6 f3280h4 = new C12025x6(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: m9 */
    C12025x6 f3281m9 = new C12025x6(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: dy */
    byte f3279dy = -1;

    @Override // com.aspose.slides.IScaleEffect
    public final PointF getBy() {
        return (PointF) C12025x6.m56887x1(m2514to());
    }

    @Override // com.aspose.slides.IScaleEffect
    public final PointF getFrom() {
        return (PointF) C12025x6.m56887x1(m2515x1());
    }

    @Override // com.aspose.slides.IScaleEffect
    public final PointF getTo() {
        return (PointF) C12025x6.m56887x1(m2512kk());
    }

    @Override // com.aspose.slides.IScaleEffect
    public final byte getZoomContent() {
        return this.f3279dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m2511k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f3278du);
    }

    /* JADX INFO: renamed from: kk */
    public C12025x6 m2512kk() {
        return this.f3280h4;
    }

    @Override // com.aspose.slides.IScaleEffect
    public final void setBy(PointF pointF) {
        m2513kk(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IScaleEffect
    public final void setFrom(PointF pointF) {
        m2511k4(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IScaleEffect
    public final void setTo(PointF pointF) {
        m2516x1(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IScaleEffect
    public final void setZoomContent(byte b) {
        this.f3279dy = b;
    }

    /* JADX INFO: renamed from: to */
    public C12025x6 m2514to() {
        return this.f3281m9;
    }

    /* JADX INFO: renamed from: x1 */
    public C12025x6 m2515x1() {
        return this.f3278du;
    }

    /* JADX INFO: renamed from: kk */
    public void m2513kk(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f3281m9);
    }

    /* JADX INFO: renamed from: x1 */
    public void m2516x1(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f3280h4);
    }
}
