package o000O0oo;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000O0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24417OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24019OooOO0o f82430OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicBoolean f82431OooO0O0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RunnableC24416OooO00o f82432OooO0OO = new Runnable() { // from class: o000O0oo.OooO00o
        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooO00o] */
        @Override // java.lang.Runnable
        public final void run() {
            C24417OooO0O0 c24417OooO0O0 = this.f82429OooOo0o;
            if (c24417OooO0O0.f82431OooO0O0.getAndSet(false)) {
                c24417OooO0O0.f82430OooO00o.invoke();
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [o000O0oo.OooO00o] */
    public C24417OooO0O0(oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        this.f82430OooO00o = (C24019OooOO0o) oooO00o;
    }
}
