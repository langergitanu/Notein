package ooOOo0;

import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import oO00o00O.C32327OooO0Oo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ooOOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC35109OooO0O0 implements oO0OOO00.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC35109OooO0O0[] f126091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC35109OooO0O0 f126092OooOo0o;

    static {
        EnumC35109OooO0O0 enumC35109OooO0O0 = new EnumC35109OooO0O0("DISPOSED", 0);
        f126092OooOo0o = enumC35109OooO0O0;
        f126091OooOo = new EnumC35109OooO0O0[]{enumC35109OooO0O0};
    }

    public EnumC35109OooO0O0() {
        throw null;
    }

    public static void OooO00o(AtomicReference atomicReference) {
        oO0OOO00.OooO0O0 oooO0O0;
        oO0OOO00.OooO0O0 oooO0O02 = (oO0OOO00.OooO0O0) atomicReference.get();
        EnumC35109OooO0O0 enumC35109OooO0O0 = f126092OooOo0o;
        if (oooO0O02 == enumC35109OooO0O0 || (oooO0O0 = (oO0OOO00.OooO0O0) atomicReference.getAndSet(enumC35109OooO0O0)) == enumC35109OooO0O0 || oooO0O0 == null) {
            return;
        }
        oooO0O0.dispose();
    }

    public static boolean OooO0O0(oO0OOO00.OooO0O0 oooO0O0) {
        return oooO0O0 == f126092OooOo0o;
    }

    public static boolean OooO0OO(AtomicReference<oO0OOO00.OooO0O0> atomicReference, oO0OOO00.OooO0O0 oooO0O0) {
        while (true) {
            oO0OOO00.OooO0O0 oooO0O02 = atomicReference.get();
            if (oooO0O02 == f126092OooOo0o) {
                if (oooO0O0 == null) {
                    return false;
                }
                oooO0O0.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(oooO0O02, oooO0O0)) {
                if (atomicReference.get() != oooO0O02) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean OooO0Oo(AtomicReference<oO0OOO00.OooO0O0> atomicReference, oO0OOO00.OooO0O0 oooO0O0) {
        o00Oo0.OooO00o(oooO0O0, "d is null");
        while (!atomicReference.compareAndSet(null, oooO0O0)) {
            if (atomicReference.get() != null) {
                oooO0O0.dispose();
                if (atomicReference.get() == f126092OooOo0o) {
                    return false;
                }
                oO0OOO0O.OooO00o.OooO0O0(new C32327OooO0Oo("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0o0(oO0OOO00.OooO0O0 oooO0O0, oO0OOO00.OooO0O0 oooO0O02) {
        if (oooO0O02 == null) {
            oO0OOO0O.OooO00o.OooO0O0(new NullPointerException("next is null"));
            return false;
        }
        if (oooO0O0 == null) {
            return true;
        }
        oooO0O02.dispose();
        oO0OOO0O.OooO00o.OooO0O0(new C32327OooO0Oo("Disposable already set!"));
        return false;
    }

    public static EnumC35109OooO0O0 valueOf(String str) {
        return (EnumC35109OooO0O0) Enum.valueOf(EnumC35109OooO0O0.class, str);
    }

    public static EnumC35109OooO0O0[] values() {
        return (EnumC35109OooO0O0[]) f126091OooOo.clone();
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
    }
}
