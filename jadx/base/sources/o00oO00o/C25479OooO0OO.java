package o00oO00o;

import o00o0Ooo.C25431OooO0oo;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0oo.InterfaceC25467OooO0o0;
import o00oO00o.AbstractC25478OooO0O0;
import o00oo000.C25644OooO0OO;

/* JADX INFO: renamed from: o00oO00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25479OooO0OO implements InterfaceC25423OooO<InterfaceC25467OooO0o0<Object>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C25644OooO0OO f86848OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f86849OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f86850OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AbstractC25478OooO0O0.EnumC19707OooO0O0 f86851OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AbstractC25478OooO0O0 f86852OooO0o0;

    public C25479OooO0OO(AbstractC25478OooO0O0 abstractC25478OooO0O0, C25644OooO0OO c25644OooO0OO, String str, Object obj, AbstractC25478OooO0O0.EnumC19707OooO0O0 enumC19707OooO0O0) {
        this.f86852OooO0o0 = abstractC25478OooO0O0;
        this.f86848OooO00o = c25644OooO0OO;
        this.f86849OooO0O0 = str;
        this.f86850OooO0OO = obj;
        this.f86851OooO0Oo = enumC19707OooO0O0;
    }

    @Override // o00o0Ooo.InterfaceC25423OooO
    public final InterfaceC25467OooO0o0<Object> get() {
        return this.f86852OooO0o0.OooO0O0(this.f86848OooO00o, this.f86849OooO0O0, this.f86850OooO0OO, this.f86851OooO0Oo);
    }

    public final String toString() {
        C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO(this.f86850OooO0OO.toString(), "request");
        return oooO00oOooO0O0.toString();
    }
}
