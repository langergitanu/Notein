package oO0O0oO0;

import oO0O000o.InterfaceC32507OooOO0o;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32740OooOOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Class<?>, C33479OooO0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32740OooOOOO f117684OooOo0o = new C32740OooOOOO(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C33479OooO0o invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!C33479OooO0o.OooO0o(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return C33479OooO0o.OooO0o0(simpleName);
        }
        return null;
    }
}
