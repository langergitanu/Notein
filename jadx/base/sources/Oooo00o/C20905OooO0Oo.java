package Oooo00o;

import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24232OooO0o0;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: renamed from: Oooo00o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20905OooO0Oo implements InterfaceC20904OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f60297OooO00o;

    public C20905OooO0Oo(float f) {
        this.f60297OooO00o = f;
    }

    @Override // Oooo00o.InterfaceC20904OooO0O0
    public final float OooO00o(long j, InterfaceC24229OooO0OO density) {
        OooOOO0.OooO0oO(density, "density");
        return density.o0OOO0o(this.f60297OooO00o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20905OooO0Oo) && C24232OooO0o0.OooO00o(this.f60297OooO00o, ((C20905OooO0Oo) obj).f60297OooO00o);
    }

    public final int hashCode() {
        return Float.hashCode(this.f60297OooO00o);
    }

    public final String toString() {
        return OooO0OO.OooO0OO(new StringBuilder("CornerSize(size = "), this.f60297OooO00o, ".dp)");
    }
}
