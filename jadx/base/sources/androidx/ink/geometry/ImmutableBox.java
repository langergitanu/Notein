package androidx.ink.geometry;

import OooOoO.C20509OooO0oo;
import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Landroidx/ink/geometry/ImmutableBox;", "Landroidx/ink/geometry/OooO0o;", "OooO00o", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImmutableBox extends OooO0o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f65373OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f65374OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f65375OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f65376OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f65377OooO0Oo;

    public static final class OooO00o {
        @UsedByNative
        public final ImmutableBox fromTwoPoints(Vec point1, Vec point2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(point1, "point1");
            kotlin.jvm.internal.OooOOO0.OooO0oO(point2, "point2");
            return new ImmutableBox(point1.getF65384OooO0O0(), point1.getF65385OooO0OO(), point2.getF65384OooO0O0(), point2.getF65385OooO0OO());
        }
    }

    public ImmutableBox(float f, float f2, float f3, float f4) {
        this.f65374OooO00o = Math.min(f, f3);
        this.f65375OooO0O0 = Math.min(f2, f4);
        this.f65376OooO0OO = Math.max(f, f3);
        this.f65377OooO0Oo = Math.max(f2, f4);
    }

    @UsedByNative
    public static final ImmutableBox fromTwoPoints(Vec vec, Vec vec2) {
        return f65373OooO0o0.fromTwoPoints(vec, vec2);
    }

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final float getF65376OooO0OO() {
        return this.f65376OooO0OO;
    }

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final float getF65374OooO00o() {
        return this.f65374OooO00o;
    }

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final float getF65377OooO0Oo() {
        return this.f65377OooO0Oo;
    }

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final float getF65375OooO0O0() {
        return this.f65375OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o second = (OooO0o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
        if (this.f65374OooO00o != second.getF65374OooO00o()) {
            return false;
        }
        if (this.f65375OooO0O0 != second.getF65375OooO0O0()) {
            return false;
        }
        if (this.f65376OooO0OO == second.getF65376OooO0OO()) {
            return this.f65377OooO0Oo == second.getF65377OooO0Oo();
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65377OooO0Oo) + C20509OooO0oo.OooO0OO(this.f65376OooO0OO, C20509OooO0oo.OooO0OO(this.f65375OooO0O0, Float.hashCode(this.f65374OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Box(xMin=");
        sb.append(this.f65374OooO00o);
        sb.append(", yMin=");
        sb.append(this.f65375OooO0O0);
        sb.append(", xMax=");
        sb.append(this.f65376OooO0OO);
        sb.append(", yMax=");
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Immutable", Oooo00o.OooO0OO.OooO0OO(sb, this.f65377OooO0Oo, ")"));
    }
}
