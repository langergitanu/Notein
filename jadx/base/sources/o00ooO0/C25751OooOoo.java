package o00ooO0;

import OooOoOO.AbstractC20531OooOOo;

/* JADX INFO: renamed from: o00ooO0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25751OooOoo implements InterfaceC25755Oooo00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C25751OooOoo f87877OooO00o;

    public static final AbstractC20531OooOOo OooO00o(AbstractC20531OooOOo abstractC20531OooOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC20531OooOOo, "<this>");
        AbstractC20531OooOOo abstractC20531OooOOoOooO0OO = abstractC20531OooOOo.OooO0OO();
        int iOooO0O0 = abstractC20531OooOOoOooO0OO.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            abstractC20531OooOOoOooO0OO.OooO0o0(i, abstractC20531OooOOo.OooO00o(i));
        }
        return abstractC20531OooOOoOooO0OO;
    }

    public static synchronized C25751OooOoo OooO0O0() {
        try {
            if (f87877OooO00o == null) {
                f87877OooO00o = new C25751OooOoo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f87877OooO00o;
    }

    public static final AbstractC20531OooOOo OooO0OO(AbstractC20531OooOOo abstractC20531OooOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC20531OooOOo, "<this>");
        return abstractC20531OooOOo.OooO0OO();
    }
}
