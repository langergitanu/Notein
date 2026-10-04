package o0ooOO0;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0ooOO0.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31543OoooOOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ChoreographerFrameCallbackC31545OoooOoO f112757OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C31542OoooOOO f112758OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31543OoooOOo(C31542OoooOOO c31542OoooOOO, ChoreographerFrameCallbackC31545OoooOoO choreographerFrameCallbackC31545OoooOoO) {
        super(1);
        this.f112758OooOo0o = c31542OoooOOO;
        this.f112757OooOo = choreographerFrameCallbackC31545OoooOoO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        C31542OoooOOO c31542OoooOOO = this.f112758OooOo0o;
        ChoreographerFrameCallbackC31545OoooOoO choreographerFrameCallbackC31545OoooOoO = this.f112757OooOo;
        synchronized (c31542OoooOOO.f112747OooOoOO) {
            c31542OoooOOO.f112748OooOoo.remove(choreographerFrameCallbackC31545OoooOoO);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
