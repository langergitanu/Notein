package o0000Ooo;

import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;

/* JADX INFO: renamed from: o0000Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24229OooO0OO {
    default long OooOoo0(long j) {
        return j != C21293OooOO0.f61729OooO0OO ? C24231OooO0o.OooO0O0(OoooOOo(C21293OooOO0.OooO0Oo(j)), OoooOOo(C21293OooOO0.OooO0O0(j))) : C24234OooO0oo.f81484OooO0OO;
    }

    default float OoooOOO(int i) {
        return i / getDensity();
    }

    default float OoooOOo(float f) {
        return f / getDensity();
    }

    default long Ooooo00(long j) {
        return j != C24234OooO0oo.f81484OooO0OO ? C21294OooOO0O.OooO00o(o0OOO0o(C24234OooO0oo.OooO0O0(j)), o0OOO0o(C24234OooO0oo.OooO00o(j))) : C21293OooOO0.f61729OooO0OO;
    }

    float getDensity();

    default float o00Oo0(long j) {
        if (!C24241OooOOOo.OooO00o(C24240OooOOOO.OooO0O0(j), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return getDensity() * o0ooOoO() * C24240OooOOOO.OooO0OO(j);
    }

    default float o0OOO0o(float f) {
        return getDensity() * f;
    }

    default int o0OoOo0(float f) {
        float fO0OOO0o = o0OOO0o(f);
        if (Float.isInfinite(fO0OOO0o)) {
            return Integer.MAX_VALUE;
        }
        return oO0O00O.OooO00o.OooO0O0(fO0OOO0o);
    }

    float o0ooOoO();
}
