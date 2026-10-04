package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC21979OooOOo0;

/* JADX INFO: renamed from: androidx.lifecycle.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22016Oooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21990OooOooo f65668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f65669OooO0O0 = new Handler();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f65670OooO0OO;

    /* JADX INFO: renamed from: androidx.lifecycle.Oooooo$OooO00o */
    public static final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC21979OooOOo0.OooO00o f65671OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C21990OooOooo f65672OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f65673OooOoO0;

        public OooO00o(C21990OooOooo registry, AbstractC21979OooOOo0.OooO00o event) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(registry, "registry");
            kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
            this.f65672OooOo0o = registry;
            this.f65671OooOo = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f65673OooOoO0) {
                return;
            }
            this.f65672OooOo0o.OooO0o(this.f65671OooOo);
            this.f65673OooOoO0 = true;
        }
    }

    public C22016Oooooo(ServiceC21993Oooo00O serviceC21993Oooo00O) {
        this.f65668OooO00o = new C21990OooOooo(serviceC21993Oooo00O);
    }

    public final void OooO00o(AbstractC21979OooOOo0.OooO00o oooO00o) {
        OooO00o oooO00o2 = this.f65670OooO0OO;
        if (oooO00o2 != null) {
            oooO00o2.run();
        }
        OooO00o oooO00o3 = new OooO00o(this.f65668OooO00o, oooO00o);
        this.f65670OooO0OO = oooO00o3;
        this.f65669OooO0O0.postAtFrontOfQueue(oooO00o3);
    }
}
