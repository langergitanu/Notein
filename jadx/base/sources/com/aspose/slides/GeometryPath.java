package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
public final class GeometryPath implements IGeometryPath {

    /* JADX INFO: renamed from: k4 */
    private byte f2385k4;

    /* JADX INFO: renamed from: kk */
    private List<PathSegment> f2386kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f2387x1;

    public GeometryPath() {
        this.f2385k4 = (byte) 1;
        this.f2387x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    private PathSegment m1572k4(byte b, float[] fArr) {
        m1574k4(fArr);
        if (this.f2386kk == null) {
            this.f2386kk = new List<>();
        }
        PathSegment pathSegment = new PathSegment(b, fArr);
        this.f2386kk.addItem(pathSegment);
        return pathSegment;
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void arcTo(float f, float f2, float f3, float f4) {
        m1572k4((byte) 3, new float[]{f, f2, f3, f4});
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void closeFigure() {
        m1572k4((byte) 0, new float[0]);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void cubicBezierTo(float f, float f2, float f3, float f4, float f5, float f6) {
        m1572k4((byte) 5, new float[]{f, f2, f3, f4, f5, f6});
    }

    @Override // com.aspose.slides.IGeometryPath
    public final byte getFillMode() {
        return this.f2385k4;
    }

    @Override // com.aspose.slides.IGeometryPath
    public final IPathSegment[] getPathData() {
        if (this.f2386kk == null) {
            this.f2386kk = new List<>();
        }
        return this.f2386kk.toArray(new PathSegment[0]);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final boolean getStroke() {
        return this.f2387x1;
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void lineTo(float f, float f2) {
        m1572k4((byte) 2, new float[]{f, f2});
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void moveTo(float f, float f2) {
        m1572k4((byte) 1, new float[]{f, f2});
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void quadraticBezierTo(float f, float f2, float f3, float f4) {
        m1572k4((byte) 4, new float[]{f, f2, f3, f4});
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void removeAt(int i) {
        if (i >= this.f2386kk.size() || i < 0) {
            throw new InvalidOperationException("Index out of bounds");
        }
        this.f2386kk.removeAt(i);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void setFillMode(byte b) {
        this.f2385k4 = b;
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void setStroke(boolean z) {
        this.f2387x1 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public void m1581x1(C12025x6 c12025x6) {
        moveTo(c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    public GeometryPath(byte b, boolean z) {
        this.f2385k4 = b;
        this.f2387x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private PathSegment m1573k4(byte b, float[] fArr, long j) {
        m1574k4(fArr);
        if (this.f2386kk == null || (4294967295L & j) >= r0.size()) {
            throw new ArgumentOutOfRangeException("Segment index is out of PathData range");
        }
        PathSegment pathSegment = new PathSegment(b, fArr);
        this.f2386kk.insertItem((int) j, pathSegment);
        return pathSegment;
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void cubicBezierTo(float f, float f2, float f3, float f4, float f5, float f6, long j) {
        m1573k4((byte) 5, new float[]{f, f2, f3, f4, f5, f6}, j);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void lineTo(float f, float f2, long j) {
        m1573k4((byte) 2, new float[]{f, f2}, j);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void moveTo(PointF pointF) {
        m1581x1(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void quadraticBezierTo(float f, float f2, float f3, float f4, long j) {
        m1573k4((byte) 4, new float[]{f, f2, f3, f4}, j);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void cubicBezierTo(PointF pointF, PointF pointF2, PointF pointF3) {
        m1579k4(C12025x6.m56882k4(pointF), C12025x6.m56882k4(pointF2), C12025x6.m56882k4(pointF3));
    }

    /* JADX INFO: renamed from: k4 */
    public void m1575k4(C12025x6 c12025x6) {
        lineTo(c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void lineTo(PointF pointF) {
        m1575k4(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void quadraticBezierTo(PointF pointF, PointF pointF2) {
        m1577k4(C12025x6.m56882k4(pointF), C12025x6.m56882k4(pointF2));
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void cubicBezierTo(PointF pointF, PointF pointF2, PointF pointF3, long j) {
        m1580k4(C12025x6.m56882k4(pointF), C12025x6.m56882k4(pointF2), C12025x6.m56882k4(pointF3), j);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1576k4(C12025x6 c12025x6, long j) {
        lineTo(c12025x6.m56897x1(), c12025x6.m56895kk(), j);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void lineTo(PointF pointF, long j) {
        m1576k4(C12025x6.m56882k4(pointF), j);
    }

    @Override // com.aspose.slides.IGeometryPath
    public final void quadraticBezierTo(PointF pointF, PointF pointF2, long j) {
        m1578k4(C12025x6.m56882k4(pointF), C12025x6.m56882k4(pointF2), j);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1577k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        quadraticBezierTo(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m1578k4(C12025x6 c12025x6, C12025x6 c12025x62, long j) {
        quadraticBezierTo(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk(), j);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1579k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        cubicBezierTo(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m1580k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, long j) {
        cubicBezierTo(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk(), j);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1574k4(float[] fArr) {
        for (float f : fArr) {
            if (C14064he.m66715kk(f)) {
                throw new ArgumentException("Path data can't be NaN");
            }
        }
    }
}
