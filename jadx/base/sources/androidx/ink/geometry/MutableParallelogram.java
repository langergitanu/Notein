package androidx.ink.geometry;

import OooOoO.C20509OooO0oo;
import androidx.ink.geometry.AbstractC21962OooOOo0;
import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Landroidx/ink/geometry/MutableParallelogram;", "Landroidx/ink/geometry/OooOOo0;", "<init>", "()V", "", "centerX", "centerY", "width", "height", "rotationDegrees", "skew", "setCenterDimensionsRotationInDegreesAndSkew", "(FFFFFF)Landroidx/ink/geometry/MutableParallelogram;", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MutableParallelogram extends AbstractC21962OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MutableVec f65393OooO00o = new MutableVec();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f65394OooO0O0 = 0.0f;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f65395OooO0OO = 0.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f65396OooO0Oo = 0.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f65397OooO0o0 = 0.0f;

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    public final Vec OooO00o() {
        return this.f65393OooO00o;
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final float getF65394OooO0O0() {
        return this.f65394OooO0O0;
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final float getF65396OooO0Oo() {
        return this.f65396OooO0Oo;
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final float getF65395OooO0OO() {
        return this.f65395OooO0OO;
    }

    public final void OooO0o(float f) {
        if (f >= 0.0f) {
            this.f65397OooO0o0 = f;
            return;
        }
        float f2 = this.f65394OooO0O0;
        float f3 = this.f65396OooO0Oo;
        if (f >= 0.0f) {
            AngleNative angleNative = AngleNative.f65370OooO00o;
            float fNormalizedDegrees = angleNative.normalizedDegrees(f3);
            this.f65397OooO0o0 = f;
            this.f65394OooO0O0 = f2;
            this.f65396OooO0Oo = angleNative.normalizedDegrees(fNormalizedDegrees);
            return;
        }
        float f4 = -f2;
        AngleNative angleNative2 = AngleNative.f65370OooO00o;
        float fNormalizedDegrees2 = angleNative2.normalizedDegrees(f3 + 180.0f);
        this.f65397OooO0o0 = -f;
        this.f65394OooO0O0 = f4;
        this.f65396OooO0Oo = angleNative2.normalizedDegrees(fNormalizedDegrees2);
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0o0, reason: from getter */
    public final float getF65397OooO0o0() {
        return this.f65397OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof AbstractC21962OooOOo0) && AbstractC21962OooOOo0.OooO00o.OooO00o(this, (AbstractC21962OooOOo0) obj);
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65395OooO0OO) + C20509OooO0oo.OooO0OO(this.f65396OooO0Oo, C20509OooO0oo.OooO0OO(this.f65394OooO0O0, C20509OooO0oo.OooO0OO(this.f65397OooO0o0, this.f65393OooO00o.hashCode() * 31, 31), 31), 31);
    }

    @UsedByNative
    public final MutableParallelogram setCenterDimensionsRotationInDegreesAndSkew(float centerX, float centerY, float width, float height, float rotationDegrees, float skew) {
        MutableVec mutableVec = this.f65393OooO00o;
        if (width < 0.0f) {
            AngleNative angleNative = AngleNative.f65370OooO00o;
            float fNormalizedDegrees = angleNative.normalizedDegrees(rotationDegrees + 180.0f);
            OooO0o(-width);
            this.f65394OooO0O0 = -height;
            this.f65396OooO0Oo = angleNative.normalizedDegrees(fNormalizedDegrees);
            this.f65395OooO0OO = skew;
            mutableVec.x = centerX;
            mutableVec.y = centerY;
            return this;
        }
        AngleNative angleNative2 = AngleNative.f65370OooO00o;
        float fNormalizedDegrees2 = angleNative2.normalizedDegrees(rotationDegrees);
        OooO0o(width);
        this.f65394OooO0O0 = height;
        this.f65396OooO0Oo = angleNative2.normalizedDegrees(fNormalizedDegrees2);
        this.f65395OooO0OO = skew;
        mutableVec.x = centerX;
        mutableVec.y = centerY;
        return this;
    }

    public final String toString() {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Mutable", AbstractC21962OooOOo0.OooO00o.OooO0O0(this));
    }
}
