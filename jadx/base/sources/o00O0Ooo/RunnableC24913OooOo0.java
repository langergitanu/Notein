package o00O0Ooo;

import android.content.Context;
import java.util.UUID;
import o00O0O0o.C24836OooO0oO;
import o00O0O0o.C24841OooOOo0;
import o00O0Oo.C24857OooO0O0;
import o00O0OoO.C24890OooOooo;
import o00O0o00.AbstractC24926OooO00o;
import o00O0o00.C24932OooO0OO;

/* JADX INFO: renamed from: o00O0Ooo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24913OooOo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UUID f84542OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24932OooO0OO f84543OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Context f84544OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24836OooO0oO f84545OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24915OooOo0O f84546OooOoOO;

    public RunnableC24913OooOo0(C24915OooOo0O c24915OooOo0O, C24932OooO0OO c24932OooO0OO, UUID uuid, C24836OooO0oO c24836OooO0oO, Context context) {
        this.f84546OooOoOO = c24915OooOo0O;
        this.f84543OooOo0o = c24932OooO0OO;
        this.f84542OooOo = uuid;
        this.f84545OooOoO0 = c24836OooO0oO;
        this.f84544OooOoO = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f84543OooOo0o.f84573OooOo0o instanceof AbstractC24926OooO00o.OooO0O0)) {
                String string = this.f84542OooOo.toString();
                C24841OooOOo0.OooO00o oooO00oOooO0oo = ((C24890OooOooo) this.f84546OooOoOO.f84560OooO0OO).OooO0oo(string);
                if (oooO00oOooO0oo == null || oooO00oOooO0oo.OooO00o()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                this.f84546OooOoOO.f84559OooO0O0.OooO0o(string, this.f84545OooOoO0);
                this.f84544OooOoO.startService(C24857OooO0O0.OooO00o(this.f84544OooOoO, string, this.f84545OooOoO0));
            }
            this.f84543OooOo0o.OooO(null);
        } catch (Throwable th) {
            this.f84543OooOo0o.OooOO0(th);
        }
    }
}
