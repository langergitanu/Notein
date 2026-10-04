package o000000o;

import o000000o.AbstractC24088OooO0oO;
import o000000o.OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33664o00000Oo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements AbstractC24088OooO0oO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24083OooO00o f81176OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC24095OooOo0 f81177OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24101OooOoo f81178OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO f81179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24089OooO0oo f81180OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo00 f81181OooO0o0;

    public OooOO0(C24083OooO00o c24083OooO00o, C24084OooO0O0 c24084OooO0O0) {
        C24101OooOoo typefaceRequestCache = OooOO0O.f81182OooO00o;
        C24086OooO0Oo asyncTypefaceCache = OooOO0O.f81183OooO0O0;
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(asyncTypefaceCache, "asyncTypefaceCache");
        OooOOO oooOOO = new OooOOO();
        OooOOO.OooO00o oooO00o = OooOOO.f81184OooO00o;
        oooO00o.getClass();
        C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO00o.OooO00o(oooO00o, oooO).plus(new C33664o00000Oo(null)));
        OooOo00 oooOo00 = new OooOo00();
        kotlin.jvm.internal.OooOOO0.OooO0oO(typefaceRequestCache, "typefaceRequestCache");
        this.f81176OooO00o = c24083OooO00o;
        this.f81177OooO0O0 = c24084OooO0O0;
        this.f81178OooO0OO = typefaceRequestCache;
        this.f81179OooO0Oo = oooOOO;
        this.f81181OooO0o0 = oooOo00;
        this.f81180OooO0o = new C24089OooO0oo(this);
    }

    @Override // o000000o.AbstractC24088OooO0oO.OooO00o
    public final InterfaceC24103OooOooO OooO00o(AbstractC24088OooO0oO abstractC24088OooO0oO, C24093OooOOo0 fontWeight, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
        InterfaceC24095OooOo0 interfaceC24095OooOo0 = this.f81177OooO0O0;
        interfaceC24095OooOo0.getClass();
        int i3 = InterfaceC24095OooOo0.f81194OooO00o;
        C24093OooOOo0 c24093OooOOo0OooO00o = interfaceC24095OooOo0.OooO00o(fontWeight);
        this.f81176OooO00o.getClass();
        return OooO0O0(new C24100OooOoOO(abstractC24088OooO0oO, c24093OooOOo0OooO00o, i, i2, null));
    }

    public final InterfaceC24103OooOooO OooO0O0(C24100OooOoOO c24100OooOoOO) {
        C24101OooOoo c24101OooOoo = this.f81178OooO0OO;
        OooO oooO = new OooO(this, c24100OooOoOO);
        c24101OooOoo.getClass();
        synchronized (c24101OooOoo.f81202OooO00o) {
            InterfaceC24103OooOooO interfaceC24103OooOooOOooO00o = c24101OooOoo.f81203OooO0O0.OooO00o(c24100OooOoOO);
            if (interfaceC24103OooOooOOooO00o != null) {
                if (interfaceC24103OooOooOOooO00o.OooO0O0()) {
                    return interfaceC24103OooOooOOooO00o;
                }
                c24101OooOoo.f81203OooO0O0.OooO0OO(c24100OooOoOO);
            }
            try {
                InterfaceC24103OooOooO interfaceC24103OooOooO = (InterfaceC24103OooOooO) oooO.invoke(new C24102OooOoo0(c24101OooOoo, c24100OooOoOO));
                synchronized (c24101OooOoo.f81202OooO00o) {
                    try {
                        if (c24101OooOoo.f81203OooO0O0.OooO00o(c24100OooOoOO) == null && interfaceC24103OooOooO.OooO0O0()) {
                            c24101OooOoo.f81203OooO0O0.OooO0O0(c24100OooOoOO, interfaceC24103OooOooO);
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC24103OooOooO;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
