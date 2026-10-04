package Oooo0oO;

import android.view.Choreographer;
import oO00ooO.C32446OooOOOo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: Oooo0oO.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC21058Oooo0oO implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Long, Object> f60998OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f60999OooOo0o;

    public ChoreographerFrameCallbackC21058Oooo0oO(InterfaceC32507OooOO0o interfaceC32507OooOO0o, C33614OooOOO0 c33614OooOOO0) {
        this.f60999OooOo0o = c33614OooOOO0;
        this.f60998OooOo = interfaceC32507OooOO0o;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objOooO00o;
        C21057Oooo0o0 c21057Oooo0o0 = C21057Oooo0o0.f60997OooOo0o;
        try {
            objOooO00o = this.f60998OooOo.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        this.f60999OooOo0o.resumeWith(objOooO00o);
    }
}
