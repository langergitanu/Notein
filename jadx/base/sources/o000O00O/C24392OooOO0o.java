package o000O00O;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000O00O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24392OooOO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<o000OO0O.OooO0OO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0<Object> f82323OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24392OooOO0o(OooOOO0<Object> oooOOO0) {
        super(1);
        this.f82323OooOo0o = oooOOO0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(o000OO0O.OooO0OO oooO0OO) {
        o000OO0O.OooO0OO releaseFence = oooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(releaseFence, "releaseFence");
        o000OO0O.OooO0OO oooO0OO2 = this.f82323OooOo0o.f82339OooOOO;
        if (oooO0OO2 != null) {
            oooO0OO2.close();
        }
        this.f82323OooOo0o.f82339OooOOO = releaseFence;
        return C32460OooOooO.f116667OooO00o;
    }
}
