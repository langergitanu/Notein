package o000000o;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000000o.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24102OooOoo0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC24103OooOooO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24100OooOoOO f81204OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24101OooOoo f81205OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24102OooOoo0(C24101OooOoo c24101OooOoo, C24100OooOoOO c24100OooOoOO) {
        super(1);
        this.f81205OooOo0o = c24101OooOoo;
        this.f81204OooOo = c24100OooOoOO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC24103OooOooO interfaceC24103OooOooO) {
        InterfaceC24103OooOooO finalResult = interfaceC24103OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(finalResult, "finalResult");
        C24101OooOoo c24101OooOoo = this.f81205OooOo0o;
        o00000O.OooOO0 oooOO02 = c24101OooOoo.f81202OooO00o;
        C24100OooOoOO c24100OooOoOO = this.f81204OooOo;
        synchronized (oooOO02) {
            try {
                if (finalResult.OooO0O0()) {
                    c24101OooOoo.f81203OooO0O0.OooO0O0(c24100OooOoOO, finalResult);
                } else {
                    c24101OooOoo.f81203OooO0O0.OooO0OO(c24100OooOoOO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
