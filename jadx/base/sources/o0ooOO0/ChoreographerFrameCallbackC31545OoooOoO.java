package o0ooOO0;

import android.view.Choreographer;
import oO00ooO.C32446OooOOOo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: o0ooOO0.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC31545OoooOoO implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Long, Object> f112761OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f112762OooOo0o;

    public ChoreographerFrameCallbackC31545OoooOoO(C33614OooOOO0 c33614OooOOO0, C31546OoooOoo c31546OoooOoo, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        this.f112762OooOo0o = c33614OooOOO0;
        this.f112761OooOo = interfaceC32507OooOO0o;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objOooO00o;
        try {
            objOooO00o = this.f112761OooOo.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        this.f112762OooOo0o.resumeWith(objOooO00o);
    }
}
