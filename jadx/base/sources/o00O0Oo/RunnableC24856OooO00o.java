package o00O0Oo;

import androidx.work.impl.WorkDatabase;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;

/* JADX INFO: renamed from: o00O0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24856OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f84408OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f84409OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24857OooO0O0 f84410OooOoO0;

    public RunnableC24856OooO00o(C24857OooO0O0 c24857OooO0O0, WorkDatabase workDatabase, String str) {
        this.f84410OooOoO0 = c24857OooO0O0;
        this.f84409OooOo0o = workDatabase;
        this.f84408OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C24880OooOOoo c24880OooOOooOooOO0 = ((C24890OooOooo) this.f84409OooOo0o.OooOoO()).OooOO0(this.f84408OooOo);
        if (c24880OooOOooOooOO0 == null || !c24880OooOOooOooOO0.OooO0O0()) {
            return;
        }
        synchronized (this.f84410OooOoO0.f84415OooOoO0) {
            this.f84410OooOoO0.f84418OooOoo0.put(this.f84408OooOo, c24880OooOOooOooOO0);
            this.f84410OooOoO0.f84417OooOoo.add(c24880OooOOooOooOO0);
            C24857OooO0O0 c24857OooO0O0 = this.f84410OooOoO0;
            c24857OooO0O0.f84419OooOooO.OooO0O0(c24857OooO0O0.f84417OooOoo);
        }
    }
}
