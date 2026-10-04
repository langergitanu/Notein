package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0016@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000f"}, m80612d2 = {"Landroidx/ink/geometry/MutableVec;", "Landroidx/ink/geometry/Vec;", "<init>", "()V", "", "OooO0O0", "F", "OooO00o", "()F", "setX", "(F)V", "x", "OooO0OO", "setY", "y", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MutableVec extends Vec {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    public float x;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    public float y;

    public MutableVec(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    @Override // androidx.ink.geometry.Vec
    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final float getX() {
        return this.x;
    }

    @Override // androidx.ink.geometry.Vec
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Vec)) {
            return false;
        }
        Vec second = (Vec) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
        return this.x == second.getX() && this.y == second.getY();
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    @UsedByNative
    public final void setX(float f) {
        this.x = f;
    }

    @UsedByNative
    public final void setY(float f) {
        this.y = f;
    }

    public final String toString() {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Mutable", "Vec(x=" + this.x + ", y=" + this.y + ")");
    }

    public MutableVec() {
        this(0.0f, 0.0f);
    }
}
