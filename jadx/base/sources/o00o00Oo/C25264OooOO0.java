package o00o00Oo;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC21988OooOoo0;
import androidx.lifecycle.InterfaceC21997Oooo0o;
import java.util.HashSet;
import java.util.Iterator;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o00Oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25264OooOO0 implements InterfaceC25255OooO, InterfaceC21988OooOoo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC21979OooOOo0 f85993OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HashSet f85994OooOo0o = new HashSet();

    public C25264OooOO0(AbstractC21979OooOOo0 abstractC21979OooOOo0) {
        this.f85993OooOo = abstractC21979OooOOo0;
        abstractC21979OooOOo0.OooO00o(this);
    }

    @Override // o00o00Oo.InterfaceC25255OooO
    public final void OooO00o(InterfaceC25265OooOO0O interfaceC25265OooOO0O) {
        this.f85994OooOo0o.add(interfaceC25265OooOO0O);
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f85993OooOo;
        if (abstractC21979OooOOo0.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            interfaceC25265OooOO0O.onDestroy();
        } else if (abstractC21979OooOOo0.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65539OooOoO) >= 0) {
            interfaceC25265OooOO0O.onStart();
        } else {
            interfaceC25265OooOO0O.onStop();
        }
    }

    @Override // o00o00Oo.InterfaceC25255OooO
    public final void OooO0O0(InterfaceC25265OooOO0O interfaceC25265OooOO0O) {
        this.f85994OooOo0o.remove(interfaceC25265OooOO0O);
    }

    @InterfaceC21997Oooo0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY)
    public void onDestroy(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        Iterator it = C25316OooOO0o.OooO0o0(this.f85994OooOo0o).iterator();
        while (it.hasNext()) {
            ((InterfaceC25265OooOO0O) it.next()).onDestroy();
        }
        interfaceC21987OooOoo.getLifecycle().OooO0OO(this);
    }

    @InterfaceC21997Oooo0o(AbstractC21979OooOOo0.OooO00o.ON_START)
    public void onStart(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        Iterator it = C25316OooOO0o.OooO0o0(this.f85994OooOo0o).iterator();
        while (it.hasNext()) {
            ((InterfaceC25265OooOO0O) it.next()).onStart();
        }
    }

    @InterfaceC21997Oooo0o(AbstractC21979OooOOo0.OooO00o.ON_STOP)
    public void onStop(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        Iterator it = C25316OooOO0o.OooO0o0(this.f85994OooOo0o).iterator();
        while (it.hasNext()) {
            ((InterfaceC25265OooOO0O) it.next()).onStop();
        }
    }
}
