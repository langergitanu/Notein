package o00OooO;

import androidx.fragment.app.C21929Ooooo0o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: o00OooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25126OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f85412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f85413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ReferenceQueue<C25141OooOOo0<?>> f85414OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO0 f85415OooO0Oo;

    /* JADX INFO: renamed from: o00OooO.OooO0OO$OooO00o */
    public static final class OooO00o extends WeakReference<C25141OooOOo0<?>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOOO f85416OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f85417OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public InterfaceC25145OooOo0o<?> f85418OooO0OO;

        public OooO00o(OooOOOO oooOOOO, C25141OooOOo0 c25141OooOOo0, ReferenceQueue referenceQueue) {
            super(c25141OooOOo0, referenceQueue);
            C21929Ooooo0o.OooO0OO(oooOOOO, "Argument must not be null");
            this.f85416OooO00o = oooOOOO;
            boolean z = c25141OooOOo0.f85564OooOo0o;
            this.f85418OooO0OO = null;
            this.f85417OooO0O0 = z;
        }
    }

    public C25126OooO0OO() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC25124OooO00o());
        this.f85413OooO0O0 = new HashMap();
        this.f85414OooO0OO = new ReferenceQueue<>();
        this.f85412OooO00o = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new RunnableC25125OooO0O0(this));
    }

    public final synchronized void OooO00o(OooOOOO oooOOOO, C25141OooOOo0 c25141OooOOo0) {
        OooO00o oooO00o = (OooO00o) this.f85413OooO0O0.put(oooOOOO, new OooO00o(oooOOOO, c25141OooOOo0, this.f85414OooO0OO));
        if (oooO00o != null) {
            oooO00o.f85418OooO0OO = null;
            oooO00o.clear();
        }
    }

    public final void OooO0O0(OooO00o oooO00o) {
        InterfaceC25145OooOo0o<?> interfaceC25145OooOo0o;
        synchronized (this) {
            this.f85413OooO0O0.remove(oooO00o.f85416OooO00o);
            if (oooO00o.f85417OooO0O0 && (interfaceC25145OooOo0o = oooO00o.f85418OooO0OO) != null) {
                this.f85415OooO0Oo.OooO0o0(oooO00o.f85416OooO00o, new C25141OooOOo0(interfaceC25145OooOo0o, true, false, oooO00o.f85416OooO00o, this.f85415OooO0Oo));
            }
        }
    }
}
