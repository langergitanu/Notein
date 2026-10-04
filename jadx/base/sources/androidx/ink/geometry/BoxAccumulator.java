package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Landroidx/ink/geometry/BoxAccumulator;", "", "<init>", "()V", "reset", "()Landroidx/ink/geometry/BoxAccumulator;", "", "x1", "y1", "x2", "y2", "populateFrom", "(FFFF)Landroidx/ink/geometry/BoxAccumulator;", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BoxAccumulator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MutableBox f65371OooO00o = new MutableBox();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f65372OooO0O0;

    public final void OooO00o(OooO0o oooO0o) {
        if (oooO0o != null) {
            OooO0O0(oooO0o.getF65374OooO00o(), oooO0o.getF65375OooO0O0());
            OooO0O0(oooO0o.getF65376OooO0OO(), oooO0o.getF65377OooO0Oo());
        }
    }

    public final void OooO0O0(float f, float f2) {
        boolean z = this.f65372OooO0O0;
        MutableBox mutableBox = this.f65371OooO00o;
        if (z) {
            mutableBox.setXBounds(Math.min(mutableBox.f65389OooO00o, f), Math.max(mutableBox.f65391OooO0OO, f));
            mutableBox.setYBounds(Math.min(mutableBox.f65390OooO0O0, f2), Math.max(mutableBox.f65392OooO0Oo, f2));
        } else {
            this.f65372OooO0O0 = true;
            mutableBox.setXBounds(f, f);
            mutableBox.setYBounds(f2, f2);
        }
    }

    public final MutableBox OooO0OO() {
        if (this.f65372OooO0O0) {
            return this.f65371OooO00o;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoxAccumulator)) {
            return false;
        }
        BoxAccumulator second = (BoxAccumulator) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
        if (this == second) {
            return true;
        }
        if (!this.f65372OooO0O0) {
            return !second.f65372OooO0O0;
        }
        if (!second.f65372OooO0O0) {
            return false;
        }
        MutableBox first = this.f65371OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(first, "first");
        MutableBox second2 = second.f65371OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(second2, "second");
        return first.f65389OooO00o == second2.f65389OooO00o && first.f65390OooO0O0 == second2.f65390OooO0O0 && first.f65391OooO0OO == second2.f65391OooO0OO && first.f65392OooO0Oo == second2.f65392OooO0Oo;
    }

    public final int hashCode() {
        MutableBox mutableBoxOooO0OO = OooO0OO();
        if (mutableBoxOooO0OO != null) {
            return mutableBoxOooO0OO.hashCode();
        }
        return 0;
    }

    @UsedByNative
    public final BoxAccumulator populateFrom(float x1, float y1, float x2, float y2) {
        this.f65372OooO0O0 = true;
        MutableBox mutableBox = this.f65371OooO00o;
        mutableBox.setXBounds(x1, x2);
        mutableBox.setYBounds(y1, y2);
        return this;
    }

    @UsedByNative
    public final BoxAccumulator reset() {
        this.f65372OooO0O0 = false;
        MutableBox mutableBox = this.f65371OooO00o;
        mutableBox.setXBounds(Float.NaN, Float.NaN);
        mutableBox.setYBounds(Float.NaN, Float.NaN);
        return this;
    }

    public final String toString() {
        return "BoxAccumulator(box=" + OooO0OO() + ")";
    }
}
