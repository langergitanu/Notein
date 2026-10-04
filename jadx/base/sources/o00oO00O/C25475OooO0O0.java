package o00oO00O;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import o00oO00O.AbstractC25474OooO00o;
import o00oO00o.AbstractC25477OooO00o;

/* JADX INFO: renamed from: o00oO00O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25475OooO0O0 extends AbstractC25474OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f86789OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f86792OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<AbstractC25474OooO00o.InterfaceC19705OooO00o> f86791OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<AbstractC25474OooO00o.InterfaceC19705OooO00o> f86793OooO0o0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f86790OooO0OO = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o00oO00O.OooO0O0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<AbstractC25474OooO00o.InterfaceC19705OooO00o> arrayList;
            synchronized (C25475OooO0O0.this.f86789OooO0O0) {
                C25475OooO0O0 c25475OooO0O0 = C25475OooO0O0.this;
                ArrayList<AbstractC25474OooO00o.InterfaceC19705OooO00o> arrayList2 = c25475OooO0O0.f86793OooO0o0;
                arrayList = c25475OooO0O0.f86791OooO0Oo;
                c25475OooO0O0.f86793OooO0o0 = arrayList;
                c25475OooO0O0.f86791OooO0Oo = arrayList2;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C25475OooO0O0.this.f86793OooO0o0.get(i).release();
            }
            C25475OooO0O0.this.f86793OooO0o0.clear();
        }
    }

    public final void OooO00o(AbstractC25477OooO00o abstractC25477OooO00o) {
        synchronized (this.f86789OooO0O0) {
            this.f86791OooO0Oo.remove(abstractC25477OooO00o);
        }
    }
}
