package androidx.ink.geometry;

import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Landroidx/ink/geometry/ImmutableVec;", "Landroidx/ink/geometry/Vec;", "", "x", "y", "<init>", "(FF)V", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImmutableVec extends Vec {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f65384OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f65385OooO0OO;

    @UsedByNative
    public ImmutableVec(float f, float f2) {
        this.f65384OooO0O0 = f;
        this.f65385OooO0OO = f2;
    }

    @Override // androidx.ink.geometry.Vec
    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final float getF65384OooO0O0() {
        return this.f65384OooO0O0;
    }

    @Override // androidx.ink.geometry.Vec
    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final float getF65385OooO0OO() {
        return this.f65385OooO0OO;
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
        if (this.f65384OooO0O0 == second.getF65384OooO0O0()) {
            return this.f65385OooO0OO == second.getF65385OooO0OO();
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65385OooO0OO) + (Float.hashCode(this.f65384OooO0O0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vec(x=");
        sb.append(this.f65384OooO0O0);
        sb.append(", y=");
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Immutable", Oooo00o.OooO0OO.OooO0OO(sb, this.f65385OooO0OO, ")"));
    }
}
