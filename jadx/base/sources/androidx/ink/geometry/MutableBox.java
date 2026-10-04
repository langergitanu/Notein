package androidx.ink.geometry;

import OooOoO.C20509OooO0oo;
import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, m80612d2 = {"Landroidx/ink/geometry/MutableBox;", "Landroidx/ink/geometry/OooO0o;", "<init>", "()V", "", "x1", "x2", "setXBounds", "(FF)Landroidx/ink/geometry/MutableBox;", "y1", "y2", "setYBounds", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MutableBox extends OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f65389OooO00o = Math.min(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f65390OooO0O0 = Math.min(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f65391OooO0OO = Math.max(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f65392OooO0Oo = Math.max(0.0f, 0.0f);

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final float getF65391OooO0OO() {
        return this.f65391OooO0OO;
    }

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final float getF65389OooO00o() {
        return this.f65389OooO00o;
    }

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final float getF65392OooO0Oo() {
        return this.f65392OooO0Oo;
    }

    @Override // androidx.ink.geometry.OooO0o
    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final float getF65390OooO0O0() {
        return this.f65390OooO0O0;
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
        return this.f65389OooO00o == second.getF65389OooO00o() && this.f65390OooO0O0 == second.getF65390OooO0O0() && this.f65391OooO0OO == second.getF65391OooO0OO() && this.f65392OooO0Oo == second.getF65392OooO0Oo();
    }

    public final int hashCode() {
        return Float.hashCode(this.f65392OooO0Oo) + C20509OooO0oo.OooO0OO(this.f65391OooO0OO, C20509OooO0oo.OooO0OO(this.f65390OooO0O0, Float.hashCode(this.f65389OooO00o) * 31, 31), 31);
    }

    @UsedByNative
    public final MutableBox setXBounds(float x1, float x2) {
        this.f65389OooO00o = Math.min(x1, x2);
        this.f65391OooO0OO = Math.max(x1, x2);
        return this;
    }

    @UsedByNative
    public final MutableBox setYBounds(float y1, float y2) {
        this.f65390OooO0O0 = Math.min(y1, y2);
        this.f65392OooO0Oo = Math.max(y1, y2);
        return this;
    }

    public final String toString() {
        float f = this.f65389OooO00o;
        float f2 = this.f65390OooO0O0;
        float f3 = this.f65391OooO0OO;
        float f4 = this.f65392OooO0Oo;
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("Box(xMin=", f, ", yMin=", f2, ", xMax=");
        sbOooO0Oo.append(f3);
        sbOooO0Oo.append(", yMax=");
        sbOooO0Oo.append(f4);
        sbOooO0Oo.append(")");
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Mutable", sbOooO0Oo.toString());
    }
}
