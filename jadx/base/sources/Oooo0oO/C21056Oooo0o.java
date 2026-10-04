package Oooo0oO;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0oO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21056Oooo0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ChoreographerFrameCallbackC21058Oooo0oO f60995OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21056Oooo0o(ChoreographerFrameCallbackC21058Oooo0oO choreographerFrameCallbackC21058Oooo0oO) {
        super(1);
        this.f60995OooOo0o = choreographerFrameCallbackC21058Oooo0oO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        C21057Oooo0o0.f60996OooOo.removeFrameCallback(this.f60995OooOo0o);
        return C32460OooOooO.f116667OooO00o;
    }
}
