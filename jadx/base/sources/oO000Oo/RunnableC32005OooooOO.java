package oO000Oo;

import oO000Oo.C31999OoooOoo;
import oO0OOo0o.ExecutorC33121o00ooo;

/* JADX INFO: renamed from: oO000Oo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC32005OooooOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31999OoooOoo f114299OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o.o00Oo0 f114300OooOo0o;

    public RunnableC32005OooooOO(C31999OoooOoo c31999OoooOoo, oO0OOo0o.o00Oo0 o00oo02) {
        this.f114299OooOo = c31999OoooOoo;
        this.f114300OooOo0o = o00oo02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oO0OOo0o.OooOOO oooOOO = this.f114299OooOo.f114275OooOo0o.f119560OooO00o;
        oO0OOo0o.OooOOO oooOOO2 = oO0OOo0o.OooOOO.f119556OooOoOO;
        if (oooOOO == oooOOO2) {
            return;
        }
        C31999OoooOoo c31999OoooOoo = this.f114299OooOo;
        c31999OoooOoo.f114271OooOo = this.f114300OooOo0o;
        C31999OoooOoo.OooO0O0 oooO0O0 = c31999OoooOoo.f114274OooOo0O;
        C31999OoooOoo c31999OoooOoo2 = this.f114299OooOo;
        C31999OoooOoo.OooO0O0 oooO0O02 = c31999OoooOoo2.f114272OooOo0;
        c31999OoooOoo2.f114274OooOo0O = null;
        C31999OoooOoo c31999OoooOoo3 = this.f114299OooOo;
        c31999OoooOoo3.f114272OooOo0 = null;
        C31999OoooOoo.OooO0oO(c31999OoooOoo3, oooOOO2);
        this.f114299OooOo.f114263OooOO0o.OooO00o();
        if (this.f114299OooOo.f114270OooOOoo.isEmpty()) {
            C31999OoooOoo c31999OoooOoo4 = this.f114299OooOo;
            c31999OoooOoo4.getClass();
            c31999OoooOoo4.f114262OooOO0O.execute(new RunnableC32006OooooOo(c31999OoooOoo4));
        }
        C31999OoooOoo c31999OoooOoo5 = this.f114299OooOo;
        c31999OoooOoo5.f114262OooOO0O.OooO0Oo();
        ExecutorC33121o00ooo.OooO0OO oooO0OO = c31999OoooOoo5.f114267OooOOOo;
        if (oooO0OO != null) {
            oooO0OO.OooO00o();
            c31999OoooOoo5.f114267OooOOOo = null;
            c31999OoooOoo5.f114264OooOOO = null;
        }
        ExecutorC33121o00ooo.OooO0OO oooO0OO2 = this.f114299OooOo.f114269OooOOo0;
        if (oooO0OO2 != null) {
            oooO0OO2.OooO00o();
            this.f114299OooOo.f114268OooOOo.OooO0o(this.f114300OooOo0o);
            C31999OoooOoo c31999OoooOoo6 = this.f114299OooOo;
            c31999OoooOoo6.f114269OooOOo0 = null;
            c31999OoooOoo6.f114268OooOOo = null;
        }
        if (oooO0O0 != null) {
            oooO0O0.OooO0o(this.f114300OooOo0o);
        }
        if (oooO0O02 != null) {
            oooO0O02.OooO0o(this.f114300OooOo0o);
        }
    }
}
