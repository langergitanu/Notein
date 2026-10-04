package o0Ooo0O0;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29381OooO0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<String> f104192OooO0OO = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f104190OooO00o = 2000;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f104191OooO0O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o0Ooo0O0.OooO0Oo$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Runnable f104193OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ String f104194OooOo0o;

        public OooO00o(String str, Runnable runnable) {
            this.f104194OooOo0o = str;
            this.f104193OooOo = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C29381OooO0Oo.this.f104192OooO0OO.remove(this.f104194OooOo0o);
            this.f104193OooOo.run();
        }
    }

    public final void OooO00o(String str, Runnable runnable) {
        Set<String> set = this.f104192OooO0OO;
        if (set.contains(str)) {
            C34406OooO00o.f123390OooO00o.OooO00o("hasExistingTask id: %s", str);
        } else {
            set.add(str);
            this.f104191OooO0O0.postDelayed(new OooO00o(str, runnable), this.f104190OooO00o);
        }
    }
}
