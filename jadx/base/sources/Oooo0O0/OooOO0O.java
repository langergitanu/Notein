package Oooo0O0;

import o00000oo.InterfaceC24138OooOoO0;
import o0000Ooo.C24226OooO;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.C24236OooOO0O;
import o0000Ooo.EnumC24238OooOOO;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements InterfaceC24138OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC20916OooOO0o f60347OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f60348OooO0O0;

    public OooOO0O(EnumC20916OooOO0o enumC20916OooOO0o, long j) {
        this.f60347OooO00o = enumC20916OooOO0o;
        this.f60348OooO0O0 = j;
    }

    @Override // o00000oo.InterfaceC24138OooOoO0
    public final long OooO00o(C24236OooOO0O anchorBounds, long j, EnumC24238OooOOO layoutDirection, long j2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        int iOrdinal = this.f60347OooO00o.ordinal();
        long j3 = this.f60348OooO0O0;
        int i = anchorBounds.f81489OooO0O0;
        int i2 = anchorBounds.f81488OooO00o;
        if (iOrdinal == 0) {
            int i3 = C24226OooO.f81469OooO0OO;
            return C24235OooOO0.OooO00o(i2 + ((int) (j3 >> 32)), i + ((int) (j3 & 4294967295L)));
        }
        if (iOrdinal == 1) {
            int i4 = C24226OooO.f81469OooO0OO;
            return C24235OooOO0.OooO00o((i2 + ((int) (j3 >> 32))) - ((int) (j2 >> 32)), i + ((int) (j3 & 4294967295L)));
        }
        if (iOrdinal != 2) {
            throw new C32442OooOO0o();
        }
        int i5 = C24226OooO.f81469OooO0OO;
        return C24235OooOO0.OooO00o((i2 + ((int) (j3 >> 32))) - (((int) (j2 >> 32)) / 2), i + ((int) (j3 & 4294967295L)));
    }
}
