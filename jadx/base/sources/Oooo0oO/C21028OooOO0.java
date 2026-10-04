package Oooo0oO;

import Oooo0oO.C21019OooO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0oO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21028OooOO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21019OooO.OooO00o<Object> f60885OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21019OooO f60886OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21028OooOO0(C21019OooO c21019OooO, C21019OooO.OooO00o<Object> oooO00o) {
        super(1);
        this.f60886OooOo0o = c21019OooO;
        this.f60885OooOo = oooO00o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        C21019OooO c21019OooO = this.f60886OooOo0o;
        Object obj = c21019OooO.f60870OooOo;
        C21019OooO.OooO00o<Object> oooO00o = this.f60885OooOo;
        synchronized (obj) {
            c21019OooO.f60872OooOoO.remove(oooO00o);
            if (c21019OooO.f60872OooOoO.isEmpty()) {
                c21019OooO.f60875OooOoo0.set(0);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
