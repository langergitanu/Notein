package o00oo0O0;

import java.util.HashMap;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: o00oo0O0.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25675OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f87621OooO00o = new HashMap();

    public final synchronized C25638OooO0oO OooO00o(InterfaceC25397OooO00o interfaceC25397OooO00o) {
        interfaceC25397OooO00o.getClass();
        C25638OooO0oO c25638OooO0oOOooO00o = (C25638OooO0oO) this.f87621OooO00o.get(interfaceC25397OooO00o);
        if (c25638OooO0oOOooO00o != null) {
            synchronized (c25638OooO0oOOooO00o) {
                if (!C25638OooO0oO.Oooo0OO(c25638OooO0oOOooO00o)) {
                    this.f87621OooO00o.remove(interfaceC25397OooO00o);
                    C25438OooO00o.OooO0oo(C25675OooOo.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c25638OooO0oOOooO00o)), interfaceC25397OooO00o.OooO00o(), Integer.valueOf(System.identityHashCode(interfaceC25397OooO00o)));
                    return null;
                }
                c25638OooO0oOOooO00o = C25638OooO0oO.OooO00o(c25638OooO0oOOooO00o);
            }
        }
        return c25638OooO0oOOooO00o;
    }

    public final synchronized void OooO0O0() {
        C25438OooO00o.OooO0Oo(C25675OooOo.class, Integer.valueOf(this.f87621OooO00o.size()), "Count = %d");
    }

    public final synchronized void OooO0OO(InterfaceC25397OooO00o interfaceC25397OooO00o, C25638OooO0oO c25638OooO0oO) {
        interfaceC25397OooO00o.getClass();
        c25638OooO0oO.getClass();
        if (!C25638OooO0oO.Oooo0OO(c25638OooO0oO)) {
            throw new IllegalArgumentException();
        }
        C25638OooO0oO c25638OooO0oO2 = (C25638OooO0oO) this.f87621OooO00o.get(interfaceC25397OooO00o);
        if (c25638OooO0oO2 == null) {
            return;
        }
        AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO2.f87502OooOo0o);
        AbstractC25434OooO00o abstractC25434OooO00oOooOOO02 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
        if (abstractC25434OooO00oOooOOO0 != null && abstractC25434OooO00oOooOOO02 != null) {
            try {
                if (abstractC25434OooO00oOooOOO0.Oooo000() == abstractC25434OooO00oOooOOO02.Oooo000()) {
                    this.f87621OooO00o.remove(interfaceC25397OooO00o);
                    abstractC25434OooO00oOooOOO02.close();
                    abstractC25434OooO00oOooOOO0.close();
                    c25638OooO0oO2.close();
                    OooO0O0();
                    return;
                }
            } catch (Throwable th) {
                abstractC25434OooO00oOooOOO02.close();
                abstractC25434OooO00oOooOOO0.close();
                c25638OooO0oO2.close();
                throw th;
            }
        }
        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooOOO02);
        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooOOO0);
        c25638OooO0oO2.close();
    }
}
