package oO000Oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oO000Oo.o00Ooo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OO00O implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo.OooOOO0 f114755OooOo0o;

    public o0OO00O(o00Ooo.OooOOO0 oooOOO0) {
        this.f114755OooOo0o = oooOOO0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        if (this.f114755OooOo0o.f114704OooO00o.get() == o00Ooo.f114613ooOO) {
            this.f114755OooOo0o.f114704OooO00o.set(null);
        }
        LinkedHashSet linkedHashSet = o00Ooo.this.f114643OooOooO;
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((o00Ooo.OooOOO0.C32061OooO0o0) it.next()).cancel("Channel is forcefully shutdown", null);
            }
        }
        o00Ooo.C32063OooOOo0 c32063OooOOo0 = o00Ooo.this.f114649Oooo00o;
        oO0OOo0o.o00Oo0 o00oo02 = o00Ooo.f114607Oooooo;
        c32063OooOOo0.OooO00o(o00oo02);
        synchronized (c32063OooOOo0.f114734OooO00o) {
            arrayList = new ArrayList(c32063OooOOo0.f114735OooO0O0);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC31946OooOOo) it2.next()).OooOO0o(o00oo02);
        }
        o00Ooo.this.f114648Oooo00O.OooO0O0(o00oo02);
    }
}
