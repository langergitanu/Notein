package o00oo00O;

import o00o0OOO.InterfaceC25397OooO00o;
import o00oo0O0.InterfaceC25665OooOO0;

/* JADX INFO: renamed from: o00oo00O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25648OooO0O0 implements InterfaceC25665OooOO0.OooO0O0<InterfaceC25397OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C25649OooO0OO f87546OooO00o;

    public C25648OooO0O0(C25649OooO0OO c25649OooO0OO) {
        this.f87546OooO00o = c25649OooO0OO;
    }

    public final void OooO00o(Object obj, boolean z) {
        InterfaceC25397OooO00o interfaceC25397OooO00o = (InterfaceC25397OooO00o) obj;
        C25649OooO0OO c25649OooO0OO = this.f87546OooO00o;
        synchronized (c25649OooO0OO) {
            try {
                if (z) {
                    c25649OooO0OO.f87550OooO0Oo.add(interfaceC25397OooO00o);
                } else {
                    c25649OooO0OO.f87550OooO0Oo.remove(interfaceC25397OooO00o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
