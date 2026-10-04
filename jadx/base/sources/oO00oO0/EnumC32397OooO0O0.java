package oO00oO0;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oOo00o0o.C34558OooO0Oo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO00oO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32397OooO0O0 implements InterfaceC32925OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC32397OooO0O0[] f116500OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC32397OooO0O0 f116501OooOo0o;

    static {
        EnumC32397OooO0O0 enumC32397OooO0O0 = new EnumC32397OooO0O0("DISPOSED", 0);
        f116501OooOo0o = enumC32397OooO0O0;
        f116500OooOo = new EnumC32397OooO0O0[]{enumC32397OooO0O0};
    }

    public EnumC32397OooO0O0() {
        throw null;
    }

    public static void OooO00o(AtomicReference atomicReference) {
        InterfaceC32925OooO0O0 interfaceC32925OooO0O0;
        InterfaceC32925OooO0O0 interfaceC32925OooO0O02 = (InterfaceC32925OooO0O0) atomicReference.get();
        EnumC32397OooO0O0 enumC32397OooO0O0 = f116501OooOo0o;
        if (interfaceC32925OooO0O02 == enumC32397OooO0O0 || (interfaceC32925OooO0O0 = (InterfaceC32925OooO0O0) atomicReference.getAndSet(enumC32397OooO0O0)) == enumC32397OooO0O0 || interfaceC32925OooO0O0 == null) {
            return;
        }
        interfaceC32925OooO0O0.dispose();
    }

    public static boolean OooO0O0(AtomicReference<InterfaceC32925OooO0O0> atomicReference, InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        while (true) {
            InterfaceC32925OooO0O0 interfaceC32925OooO0O02 = atomicReference.get();
            if (interfaceC32925OooO0O02 == f116501OooOo0o) {
                if (interfaceC32925OooO0O0 == null) {
                    return false;
                }
                interfaceC32925OooO0O0.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC32925OooO0O02, interfaceC32925OooO0O0)) {
                if (atomicReference.get() != interfaceC32925OooO0O02) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean OooO0OO(AtomicReference<InterfaceC32925OooO0O0> atomicReference, InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        Objects.requireNonNull(interfaceC32925OooO0O0, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC32925OooO0O0)) {
            if (atomicReference.get() != null) {
                interfaceC32925OooO0O0.dispose();
                if (atomicReference.get() == f116501OooOo0o) {
                    return false;
                }
                C32430OooO00o.OooO00o(new C34558OooO0Oo("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0Oo(InterfaceC32925OooO0O0 interfaceC32925OooO0O0, InterfaceC32925OooO0O0 interfaceC32925OooO0O02) {
        if (interfaceC32925OooO0O0 == null) {
            return true;
        }
        interfaceC32925OooO0O02.dispose();
        C32430OooO00o.OooO00o(new C34558OooO0Oo("Disposable already set!"));
        return false;
    }

    public static EnumC32397OooO0O0 valueOf(String str) {
        return (EnumC32397OooO0O0) Enum.valueOf(EnumC32397OooO0O0.class, str);
    }

    public static EnumC32397OooO0O0[] values() {
        return (EnumC32397OooO0O0[]) f116500OooOo.clone();
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
    }
}
