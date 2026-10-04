package o00oo000;

import android.content.Context;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o.AbstractC25434OooO00o;
import o00o0oo.AbstractC25464OooO0OO;
import o00o0oo.C25466OooO0o;
import o00o0oo.InterfaceC25467OooO0o0;
import o00oO00o.AbstractC25478OooO0O0;
import o00oO00o.C25479OooO0OO;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.OooO;
import o00oo0O0.C25657OooO00o;
import o00oo0O0.C25667OooOO0o;
import o00oo0Oo.C25701OooOOo0;
import o00ooO.C25732OooO0O0;
import o00ooO0o.C25763OooO00o;
import o0ooOO.InterfaceC31496OooO00o;

/* JADX INFO: renamed from: o00oo000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25645OooO0Oo extends AbstractC25478OooO0O0<C25645OooO0Oo, C25763OooO00o, AbstractC25434OooO00o<InterfaceC25636OooO0Oo>, OooO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o f87524OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25701OooOOo0 f87525OooO0oo;

    public C25645OooO0Oo(Context context, OooO0o oooO0o, C25701OooOOo0 c25701OooOOo0) {
        this.f86842OooO00o = null;
        this.f86843OooO0O0 = null;
        this.f86844OooO0OO = false;
        this.f86845OooO0Oo = null;
        this.f87525OooO0oo = c25701OooOOo0;
        this.f87524OooO = oooO0o;
    }

    @Override // o00oO00o.AbstractC25478OooO0O0
    public final AbstractC25464OooO0OO OooO0O0(C25644OooO0OO c25644OooO0OO, String str, Object obj, AbstractC25478OooO0O0.EnumC19707OooO0O0 enumC19707OooO0O0) {
        C25763OooO00o.OooO0OO oooO0OO;
        C25763OooO00o c25763OooO00o = (C25763OooO00o) obj;
        C25701OooOOo0 c25701OooOOo0 = this.f87525OooO0oo;
        int iOrdinal = enumC19707OooO0O0.ordinal();
        if (iOrdinal == 0) {
            oooO0OO = C25763OooO00o.OooO0OO.FULL_FETCH;
        } else if (iOrdinal == 1) {
            oooO0OO = C25763OooO00o.OooO0OO.DISK_CACHE;
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException("Cache level" + enumC19707OooO0O0 + "is not supported. ");
            }
            oooO0OO = C25763OooO00o.OooO0OO.BITMAP_MEMORY_CACHE;
        }
        C25763OooO00o.OooO0OO oooO0OO2 = oooO0OO;
        if (c25644OooO0OO != null) {
            synchronized (c25644OooO0OO) {
            }
        }
        return c25701OooOOo0.OooO00o(c25763OooO00o, null, oooO0OO2, null, str);
    }

    @Override // o00oO00o.AbstractC25478OooO0O0
    public final C25644OooO0OO OooO0OO() throws Throwable {
        C25644OooO0OO c25644OooO0OO;
        C25645OooO0Oo c25645OooO0Oo;
        InterfaceC25423OooO<InterfaceC25467OooO0o0<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>>> c25466OooO0o;
        C25732OooO0O0.OooO00o();
        try {
            InterfaceC31496OooO00o interfaceC31496OooO00o = this.f86845OooO0Oo;
            String strValueOf = String.valueOf(AbstractC25478OooO0O0.f86841OooO0oO.getAndIncrement());
            if (interfaceC31496OooO00o instanceof C25644OooO0OO) {
                c25644OooO0OO = (C25644OooO0OO) interfaceC31496OooO00o;
            } else {
                OooO0o oooO0o = this.f87524OooO;
                c25644OooO0OO = new C25644OooO0OO(oooO0o.f87526OooO00o, oooO0o.f87527OooO0O0, oooO0o.f87528OooO0OO, oooO0o.f87529OooO0Oo, oooO0o.f87530OooO0o0);
            }
            C25763OooO00o c25763OooO00o = this.f86842OooO00o;
            AbstractC25478OooO0O0.EnumC19707OooO0O0 enumC19707OooO0O0 = AbstractC25478OooO0O0.EnumC19707OooO0O0.f86847OooOo0o;
            if (c25763OooO00o != null) {
                c25645OooO0Oo = this;
                try {
                    c25466OooO0o = new C25479OooO0OO(c25645OooO0Oo, c25644OooO0OO, strValueOf, c25763OooO00o, enumC19707OooO0O0);
                } catch (Throwable th) {
                    th = th;
                    C25732OooO0O0.OooO00o();
                    throw th;
                }
            } else {
                c25645OooO0Oo = this;
                c25466OooO0o = null;
            }
            if (c25466OooO0o == null) {
                c25466OooO0o = new C25466OooO0o();
            }
            C25667OooOO0o c25667OooOO0o = c25645OooO0Oo.f87525OooO0oo.f87708OooO0o0;
            C25657OooO00o c25657OooO00oOooO0O0 = (c25667OooOO0o == null || c25763OooO00o == null) ? null : c25667OooOO0o.OooO0O0(c25763OooO00o, null);
            c25644OooO0OO.getClass();
            C25732OooO0O0.OooO00o();
            c25644OooO0OO.OooOOO(strValueOf);
            c25644OooO0OO.f86833OooOOO = false;
            c25644OooO0OO.f87523OooOo0O = c25466OooO0o;
            c25644OooO0OO.OooOoo0(null);
            c25644OooO0OO.f87521OooOo0 = c25657OooO00oOooO0O0;
            c25644OooO0OO.OooOoo0(null);
            C25732OooO0O0.OooO00o();
            synchronized (c25644OooO0OO) {
            }
            C25732OooO0O0.OooO00o();
            return c25644OooO0OO;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
