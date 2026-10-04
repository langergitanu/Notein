package o00O0Ooo;

import android.content.Context;
import androidx.core.os.BuildCompat;
import androidx.work.ListenableWorker;
import java.util.UUID;
import o00O0O0o.C24836OooO0oO;
import o00O0OoO.C24880OooOOoo;
import o00O0o00.C24932OooO0OO;
import o00oOOo.C25591OooO0O0;

/* JADX INFO: renamed from: o00O0Ooo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24914OooOo00 implements Runnable {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String f84547OooOoo = o00O0O0o.OooOO0O.OooO0o0("WorkForegroundRunnable");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Context f84548OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24932OooO0OO<Void> f84549OooOo0o = new C24932OooO0OO<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ListenableWorker f84550OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C24880OooOOoo f84551OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24915OooOo0O f84552OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C25591OooO0O0 f84553OooOoo0;

    /* JADX INFO: renamed from: o00O0Ooo.OooOo00$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24932OooO0OO f84555OooOo0o;

        public OooO00o(C24932OooO0OO c24932OooO0OO) {
            this.f84555OooOo0o = c24932OooO0OO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f84555OooOo0o.OooOO0O(RunnableC24914OooOo00.this.f84550OooOoO.OooO00o());
        }
    }

    /* JADX INFO: renamed from: o00O0Ooo.OooOo00$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24932OooO0OO f84557OooOo0o;

        public OooO0O0(C24932OooO0OO c24932OooO0OO) {
            this.f84557OooOo0o = c24932OooO0OO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            RunnableC24914OooOo00 runnableC24914OooOo00 = RunnableC24914OooOo00.this;
            C24932OooO0OO<Void> c24932OooO0OO = runnableC24914OooOo00.f84549OooOo0o;
            try {
                C24836OooO0oO c24836OooO0oO = (C24836OooO0oO) this.f84557OooOo0o.get();
                C24880OooOOoo c24880OooOOoo = runnableC24914OooOo00.f84551OooOoO0;
                if (c24836OooO0oO == null) {
                    throw new IllegalStateException("Worker was marked important (" + c24880OooOOoo.f84459OooO0OO + ") but did not provide ForegroundInfo");
                }
                o00O0O0o.OooOO0O.OooO0OO().OooO00o(RunnableC24914OooOo00.f84547OooOoo, "Updating notification for " + c24880OooOOoo.f84459OooO0OO, new Throwable[0]);
                ListenableWorker listenableWorker = runnableC24914OooOo00.f84550OooOoO;
                listenableWorker.f66672OooOoOO = true;
                C24915OooOo0O c24915OooOo0O = runnableC24914OooOo00.f84552OooOoOO;
                Context context = runnableC24914OooOo00.f84548OooOo;
                UUID uuid = listenableWorker.f66668OooOo.f66691OooO00o;
                c24915OooOo0O.getClass();
                C24932OooO0OO c24932OooO0OO2 = new C24932OooO0OO();
                c24915OooOo0O.f84558OooO00o.OooO00o(new RunnableC24913OooOo0(c24915OooOo0O, c24932OooO0OO2, uuid, c24836OooO0oO, context));
                c24932OooO0OO.OooOO0O(c24932OooO0OO2);
            } catch (Throwable th) {
                c24932OooO0OO.OooOO0(th);
            }
        }
    }

    public RunnableC24914OooOo00(Context context, C24880OooOOoo c24880OooOOoo, ListenableWorker listenableWorker, C24915OooOo0O c24915OooOo0O, C25591OooO0O0 c25591OooO0O0) {
        this.f84548OooOo = context;
        this.f84551OooOoO0 = c24880OooOOoo;
        this.f84550OooOoO = listenableWorker;
        this.f84552OooOoOO = c24915OooOo0O;
        this.f84553OooOoo0 = c25591OooO0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f84551OooOoO0.f84473OooOOo0 || BuildCompat.isAtLeastS()) {
            this.f84549OooOo0o.OooO(null);
            return;
        }
        C24932OooO0OO c24932OooO0OO = new C24932OooO0OO();
        C25591OooO0O0 c25591OooO0O0 = this.f84553OooOoo0;
        c25591OooO0O0.f87295OooO0OO.execute(new OooO00o(c24932OooO0OO));
        c24932OooO0OO.addListener(new OooO0O0(c24932OooO0OO), c25591OooO0O0.f87295OooO0OO);
    }
}
