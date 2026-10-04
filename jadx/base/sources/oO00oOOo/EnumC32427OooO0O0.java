package oO00oOOo;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import oO00oOo0.C32430OooO00o;
import oOO00OOO.OooO0OO;
import oOo00o0o.C34558OooO0Oo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO00oOOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32427OooO0O0 implements OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC32427OooO0O0[] f116615OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC32427OooO0O0 f116616OooOo0o;

    static {
        EnumC32427OooO0O0 enumC32427OooO0O0 = new EnumC32427OooO0O0("CANCELLED", 0);
        f116616OooOo0o = enumC32427OooO0O0;
        f116615OooOo = new EnumC32427OooO0O0[]{enumC32427OooO0O0};
    }

    public EnumC32427OooO0O0() {
        throw null;
    }

    public static void OooO00o(AtomicReference atomicReference) {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2 = (OooO0OO) atomicReference.get();
        EnumC32427OooO0O0 enumC32427OooO0O0 = f116616OooOo0o;
        if (oooO0OO2 == enumC32427OooO0O0 || (oooO0OO = (OooO0OO) atomicReference.getAndSet(enumC32427OooO0O0)) == enumC32427OooO0O0 || oooO0OO == null) {
            return;
        }
        oooO0OO.cancel();
    }

    public static boolean OooO0O0(AtomicReference<OooO0OO> atomicReference, OooO0OO oooO0OO) {
        Objects.requireNonNull(oooO0OO, "s is null");
        while (!atomicReference.compareAndSet(null, oooO0OO)) {
            if (atomicReference.get() != null) {
                oooO0OO.cancel();
                if (atomicReference.get() == f116616OooOo0o) {
                    return false;
                }
                C32430OooO00o.OooO00o(new C34558OooO0Oo("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0OO(long j) {
        if (j > 0) {
            return true;
        }
        C32430OooO00o.OooO00o(new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean OooO0Oo(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
        if (oooO0OO2 == null) {
            C32430OooO00o.OooO00o(new NullPointerException("next is null"));
            return false;
        }
        if (oooO0OO == null) {
            return true;
        }
        oooO0OO2.cancel();
        C32430OooO00o.OooO00o(new C34558OooO0Oo("Subscription already set!"));
        return false;
    }

    public static EnumC32427OooO0O0 valueOf(String str) {
        return (EnumC32427OooO0O0) Enum.valueOf(EnumC32427OooO0O0.class, str);
    }

    public static EnumC32427OooO0O0[] values() {
        return (EnumC32427OooO0O0[]) f116615OooOo.clone();
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
    }
}
