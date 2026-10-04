package androidx.ink.geometry;

import OooOoO.C20509OooO0oo;
import androidx.ink.geometry.AbstractC21962OooOOo0;
import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Landroidx/ink/geometry/ImmutableParallelogram;", "Landroidx/ink/geometry/OooOOo0;", "OooO00o", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImmutableParallelogram extends AbstractC21962OooOOo0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f65378OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ImmutableVec f65379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f65380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f65381OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f65382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f65383OooO0o0;

    public static final class OooO00o {
        @UsedByNative
        public final ImmutableParallelogram fromCenterDimensionsAndRotationInDegrees(ImmutableVec center, float f, float f2, float f3) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(center, "center");
            return fromCenterDimensionsRotationInDegreesAndSkew(center, f, f2, f3, 0.0f);
        }

        @UsedByNative
        public final ImmutableParallelogram fromCenterDimensionsRotationInDegreesAndSkew(ImmutableVec center, float f, float f2, float f3, float f4) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(center, "center");
            if (f >= 0.0f) {
                return new ImmutableParallelogram(center, f, f2, AngleNative.f65370OooO00o.normalizedDegrees(f3), f4);
            }
            return new ImmutableParallelogram(center, -f, -f2, AngleNative.f65370OooO00o.normalizedDegrees(f3 + 180.0f), f4);
        }
    }

    public ImmutableParallelogram(ImmutableVec immutableVec, float f, float f2, float f3, float f4) {
        this.f65379OooO00o = immutableVec;
        this.f65380OooO0O0 = f;
        this.f65381OooO0OO = f2;
        this.f65382OooO0Oo = f3;
        this.f65383OooO0o0 = f4;
    }

    @UsedByNative
    public static final ImmutableParallelogram fromCenterDimensionsAndRotationInDegrees(ImmutableVec immutableVec, float f, float f2, float f3) {
        return f65378OooO0o.fromCenterDimensionsAndRotationInDegrees(immutableVec, f, f2, f3);
    }

    @UsedByNative
    public static final ImmutableParallelogram fromCenterDimensionsRotationInDegreesAndSkew(ImmutableVec immutableVec, float f, float f2, float f3, float f4) {
        return f65378OooO0o.fromCenterDimensionsRotationInDegreesAndSkew(immutableVec, f, f2, f3, f4);
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    public final Vec OooO00o() {
        return this.f65379OooO00o;
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final float getF65381OooO0OO() {
        return this.f65381OooO0OO;
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final float getF65382OooO0Oo() {
        return this.f65382OooO0Oo;
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final float getF65383OooO0o0() {
        return this.f65383OooO0o0;
    }

    @Override // androidx.ink.geometry.AbstractC21962OooOOo0
    /* JADX INFO: renamed from: OooO0o0, reason: from getter */
    public final float getF65380OooO0O0() {
        return this.f65380OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof AbstractC21962OooOOo0) && AbstractC21962OooOOo0.OooO00o.OooO00o(this, (AbstractC21962OooOOo0) obj);
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65383OooO0o0) + C20509OooO0oo.OooO0OO(this.f65382OooO0Oo, C20509OooO0oo.OooO0OO(this.f65381OooO0OO, C20509OooO0oo.OooO0OO(this.f65380OooO0O0, this.f65379OooO00o.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Immutable", AbstractC21962OooOOo0.OooO00o.OooO0O0(this));
    }
}
