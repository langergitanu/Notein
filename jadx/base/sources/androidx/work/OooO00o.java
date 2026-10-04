package androidx.work;

import Oooo0.o000000;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o00O0O0o.C24842OooOOoo;
import o00O0O0o.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f66675OooO00o = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new o00O0O0o.OooO0O0(false));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorService f66676OooO0O0 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new o00O0O0o.OooO0O0(true));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00 f66677OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000000 f66678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f66679OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0OO0.OooO00o f66680OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f66681OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f66682OooO0oo;

    /* JADX INFO: renamed from: androidx.work.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19047OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOo00 f66683OooO00o;
    }

    public interface OooO0O0 {
        OooO00o OooO00o();
    }

    public OooO00o(C19047OooO00o c19047OooO00o) {
        OooOo00 oooOo00 = c19047OooO00o.f66683OooO00o;
        if (oooOo00 == null) {
            String str = OooOo00.f84289OooO00o;
            this.f66677OooO0OO = new C24842OooOOoo();
        } else {
            this.f66677OooO0OO = oooOo00;
        }
        this.f66678OooO0Oo = new o000000();
        this.f66680OooO0o0 = new o00O0OO0.OooO00o();
        this.f66679OooO0o = 4;
        this.f66681OooO0oO = Integer.MAX_VALUE;
        this.f66682OooO0oo = 20;
    }
}
