package oO0OoOO0;

import OooOoo0.C20678Oooo0O0;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import oO0OOoO0.InterfaceC33126OooO00o;
import oO0Ooooo.InterfaceC33522OooO00o;

/* JADX INFO: renamed from: oO0OoOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33287OooO0o0 implements InterfaceC33522OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f120507OooO00o = new HashSet();

    public final void OooO00o() {
        if (C20678Oooo0O0.f59366OooO0OO == null) {
            C20678Oooo0O0.f59366OooO0OO = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != C20678Oooo0O0.f59366OooO0OO) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f120507OooO00o.iterator();
        while (it.hasNext()) {
            ((InterfaceC33126OooO00o) it.next()).OooO00o();
        }
    }
}
