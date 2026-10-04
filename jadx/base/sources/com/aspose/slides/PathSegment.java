package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class PathSegment implements IPathSegment {

    /* JADX INFO: renamed from: k4 */
    private final float[] f2974k4;

    /* JADX INFO: renamed from: x1 */
    private final byte f2975x1;

    public PathSegment(byte b, float[] fArr) {
        this.f2975x1 = b;
        this.f2974k4 = fArr;
    }

    @Override // com.aspose.slides.IPathSegment
    public final byte getPathCommand() {
        return this.f2975x1;
    }

    @Override // com.aspose.slides.IPathSegment
    public final float[] getSegmentData() {
        return this.f2974k4;
    }
}
