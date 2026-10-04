package o00O0Ooo;

import androidx.work.impl.WorkDatabase;
import o00O0O0o.C24841OooOOo0;
import o00O0OO0.C24845OooO0Oo;
import o00O0OoO.C24890OooOooo;

/* JADX INFO: renamed from: o00O0Ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24909OooOOo implements Runnable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String f84527OooOoO = o00O0O0o.OooOO0O.OooO0o0("StopWorkRunnable");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f84528OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f84529OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f84530OooOoO0;

    public RunnableC24909OooOOo(o00O0OO0.OooOO0O oooOO0O, String str, boolean z) {
        this.f84529OooOo0o = oooOO0O;
        this.f84528OooOo = str;
        this.f84530OooOoO0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zOooOO0;
        o00O0OO0.OooOO0O oooOO0O = this.f84529OooOo0o;
        WorkDatabase workDatabase = oooOO0O.f84362OooO0OO;
        C24845OooO0Oo c24845OooO0Oo = oooOO0O.f84364OooO0o;
        o00O0OoO.OooOo00 oooOo00OooOoO = workDatabase.OooOoO();
        workDatabase.OooO0OO();
        try {
            String str = this.f84528OooOo;
            synchronized (c24845OooO0Oo.f84339Oooo00O) {
                zContainsKey = c24845OooO0Oo.f84335OooOoo0.containsKey(str);
            }
            if (this.f84530OooOoO0) {
                zOooOO0 = this.f84529OooOo0o.f84364OooO0o.OooO(this.f84528OooOo);
            } else {
                if (!zContainsKey) {
                    C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOo00OooOoO;
                    if (c24890OooOooo.OooO0oo(this.f84528OooOo) == C24841OooOOo0.OooO00o.f84282OooOo) {
                        c24890OooOooo.OooOOOO(C24841OooOOo0.OooO00o.f84283OooOo0o, this.f84528OooOo);
                    }
                }
                zOooOO0 = this.f84529OooOo0o.f84364OooO0o.OooOO0(this.f84528OooOo);
            }
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84527OooOoO, "StopWorkRunnable for " + this.f84528OooOo + "; Processor.stopWork = " + zOooOO0, new Throwable[0]);
            workDatabase.OooOOoo();
            workDatabase.OooOOOo();
        } catch (Throwable th) {
            workDatabase.OooOOOo();
            throw th;
        }
    }
}
