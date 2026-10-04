package oO000Oo;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: oO000Oo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC32007Oooooo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31999OoooOoo f114302OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o.o00Oo0 f114303OooOo0o;

    public RunnableC32007Oooooo(C31999OoooOoo c31999OoooOoo, oO0OOo0o.o00Oo0 o00oo02) {
        this.f114302OooOo = c31999OoooOoo;
        this.f114303OooOo0o = o00oo02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = new ArrayList(this.f114302OooOo.f114270OooOOoo).iterator();
        while (it.hasNext()) {
            ((o000000) it.next()).OooO0O0(this.f114303OooOo0o);
        }
    }
}
