package oO0OOOo0;

import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import oO00o00O.C32327OooO0Oo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OOOo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC33007OooO0oO implements oOO00OOO.OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC33007OooO0oO[] f119401OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC33007OooO0oO f119402OooOo0o;

    static {
        EnumC33007OooO0oO enumC33007OooO0oO = new EnumC33007OooO0oO("CANCELLED", 0);
        f119402OooOo0o = enumC33007OooO0oO;
        f119401OooOo = new EnumC33007OooO0oO[]{enumC33007OooO0oO};
    }

    public EnumC33007OooO0oO() {
        throw null;
    }

    public static void OooO00o(AtomicReference atomicReference) {
        oOO00OOO.OooO0OO oooO0OO;
        oOO00OOO.OooO0OO oooO0OO2 = (oOO00OOO.OooO0OO) atomicReference.get();
        EnumC33007OooO0oO enumC33007OooO0oO = f119402OooOo0o;
        if (oooO0OO2 == enumC33007OooO0oO || (oooO0OO = (oOO00OOO.OooO0OO) atomicReference.getAndSet(enumC33007OooO0oO)) == enumC33007OooO0oO || oooO0OO == null) {
            return;
        }
        oooO0OO.cancel();
    }

    public static boolean OooO0O0(AtomicReference<oOO00OOO.OooO0OO> atomicReference, oOO00OOO.OooO0OO oooO0OO) {
        o00Oo0.OooO00o(oooO0OO, "s is null");
        while (!atomicReference.compareAndSet(null, oooO0OO)) {
            if (atomicReference.get() != null) {
                oooO0OO.cancel();
                if (atomicReference.get() == f119402OooOo0o) {
                    return false;
                }
                oO0OOO0O.OooO00o.OooO0O0(new C32327OooO0Oo("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0OO(long j) {
        if (j > 0) {
            return true;
        }
        oO0OOO0O.OooO00o.OooO0O0(new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean OooO0Oo(oOO00OOO.OooO0OO oooO0OO, oOO00OOO.OooO0OO oooO0OO2) {
        if (oooO0OO2 == null) {
            oO0OOO0O.OooO00o.OooO0O0(new NullPointerException("next is null"));
            return false;
        }
        if (oooO0OO == null) {
            return true;
        }
        oooO0OO2.cancel();
        oO0OOO0O.OooO00o.OooO0O0(new C32327OooO0Oo("Subscription already set!"));
        return false;
    }

    public static EnumC33007OooO0oO valueOf(String str) {
        return (EnumC33007OooO0oO) Enum.valueOf(EnumC33007OooO0oO.class, str);
    }

    public static EnumC33007OooO0oO[] values() {
        return (EnumC33007OooO0oO[]) f119401OooOo.clone();
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
    }
}
