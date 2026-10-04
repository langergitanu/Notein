package o0O0o0o0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o0O0o0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26012OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O00.OooO00o f88834OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicBoolean f88835OooO0O0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f88836OooO0OO;

    public C26012OooO00o(o000O00.OooO00o oooO00o, int i) {
        this.f88834OooO00o = oooO00o;
        this.f88836OooO0OO = i;
    }

    public final synchronized boolean OooO00o() {
        int i = this.f88836OooO0OO - 1;
        this.f88836OooO0OO = i;
        if (i != 0 || !this.f88835OooO0O0.compareAndSet(false, true)) {
            return false;
        }
        this.f88834OooO00o.close();
        return true;
    }
}
