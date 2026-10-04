package o00O00OO;

import android.os.Handler;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;

/* JADX INFO: renamed from: o00O00OO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24799OooO0o0 implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ RunnableC24798OooO0Oo f84115OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Handler f84116OooOo0o;

    public C24799OooO0o0(Handler handler, RunnableC24798OooO0Oo runnableC24798OooO0Oo) {
        this.f84116OooOo0o = handler;
        this.f84115OooOo = runnableC24798OooO0Oo;
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
            this.f84116OooOo0o.removeCallbacks(this.f84115OooOo);
            interfaceC21987OooOoo.getLifecycle().OooO0OO(this);
        }
    }
}
