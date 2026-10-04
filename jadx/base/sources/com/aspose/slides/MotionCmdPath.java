package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
public class MotionCmdPath implements IMotionCmdPath {

    /* JADX INFO: renamed from: k4 */
    int f2814k4;

    /* JADX INFO: renamed from: kk */
    C12025x6[] f2815kk;

    /* JADX INFO: renamed from: to */
    int f2816to;

    /* JADX INFO: renamed from: x1 */
    boolean f2817x1;

    public MotionCmdPath(int i, C12025x6[] c12025x6Arr, int i2, boolean z) {
        this.f2817x1 = z;
        this.f2814k4 = i;
        this.f2816to = i2;
        this.f2815kk = null;
        if (c12025x6Arr != null) {
            this.f2815kk = (C12025x6[]) c12025x6Arr.clone();
        }
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final int getCommandType() {
        return this.f2814k4;
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final PointF[] getPoints() {
        return C3085sv.m13096k4(this.f2815kk);
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final int getPointsType() {
        return this.f2816to;
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final boolean isRelative() {
        return this.f2817x1;
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6[] m2012k4() {
        return this.f2815kk;
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final void setCommandType(int i) {
        this.f2814k4 = i;
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final void setPoints(PointF[] pointFArr) {
        this.f2815kk = C3085sv.m13097k4(pointFArr);
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final void setPointsType(int i) {
        this.f2816to = i;
    }

    @Override // com.aspose.slides.IMotionCmdPath
    public final void setRelative(boolean z) {
        this.f2817x1 = z;
    }
}
