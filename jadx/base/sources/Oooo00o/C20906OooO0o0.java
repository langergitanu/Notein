package Oooo00o;

import OooooO0.C21293OooOO0;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: renamed from: Oooo00o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20906OooO0o0 implements InterfaceC20904OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f60298OooO00o;

    public C20906OooO0o0(float f) {
        this.f60298OooO00o = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // Oooo00o.InterfaceC20904OooO0O0
    public final float OooO00o(long j, InterfaceC24229OooO0OO density) {
        OooOOO0.OooO0oO(density, "density");
        return (this.f60298OooO00o / 100.0f) * C21293OooOO0.OooO0OO(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20906OooO0o0) && Float.compare(this.f60298OooO00o, ((C20906OooO0o0) obj).f60298OooO00o) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f60298OooO00o);
    }

    public final String toString() {
        return OooO0OO.OooO0OO(new StringBuilder("CornerSize(size = "), this.f60298OooO00o, "%)");
    }
}
