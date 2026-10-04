package o0ooOO0;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0ooOO0.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31544OoooOo0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ChoreographerFrameCallbackC31545OoooOoO f112759OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C31546OoooOoo f112760OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31544OoooOo0(C31546OoooOoo c31546OoooOoo, ChoreographerFrameCallbackC31545OoooOoO choreographerFrameCallbackC31545OoooOoO) {
        super(1);
        this.f112760OooOo0o = c31546OoooOoo;
        this.f112759OooOo = choreographerFrameCallbackC31545OoooOoO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        this.f112760OooOo0o.f112763OooOo0o.removeFrameCallback(this.f112759OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
