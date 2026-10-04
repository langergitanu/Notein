package o00oOOO0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.TimeUnit;
import o00o0Oo.OooO0o;
import o00oOOO0.InterfaceC25581OooO00o;
import o00oOOOO.C25585OooO00o;
import o00oOOo0.InterfaceC25592OooO00o;

/* JADX INFO: renamed from: o00oOOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25583OooO0OO<T extends InterfaceC25581OooO00o> extends C25582OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RealtimeSinceBootClock f87266OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f87267OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f87268OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f87269OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25585OooO00o f87270OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f87271OooO0oo;

    /* JADX INFO: renamed from: o00oOOO0.OooO0OO$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C25583OooO0OO.this) {
                try {
                    C25583OooO0OO c25583OooO0OO = C25583OooO0OO.this;
                    c25583OooO0OO.f87269OooO0o0 = false;
                    if (c25583OooO0OO.f87266OooO0OO.now() - c25583OooO0OO.f87268OooO0o > 2000) {
                        C25585OooO00o c25585OooO00o = C25583OooO0OO.this.f87270OooO0oO;
                        if (c25585OooO00o.f87277OooO0o) {
                            InterfaceC25592OooO00o interfaceC25592OooO00o = c25585OooO00o.f87279OooO0oO;
                            if (interfaceC25592OooO00o != null) {
                                interfaceC25592OooO00o.onStop();
                            }
                        } else {
                            c25585OooO00o.OooO0Oo();
                        }
                    } else {
                        C25583OooO0OO.this.OooO0o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C25583OooO0OO(C25585OooO00o c25585OooO00o, C25585OooO00o c25585OooO00o2, RealtimeSinceBootClock realtimeSinceBootClock, OooO0o oooO0o) {
        this.f87265OooO0O0 = c25585OooO00o;
        this.f87269OooO0o0 = false;
        this.f87271OooO0oo = new OooO00o();
        this.f87270OooO0oO = c25585OooO00o2;
        this.f87266OooO0OO = realtimeSinceBootClock;
        this.f87267OooO0Oo = oooO0o;
    }

    public final synchronized void OooO0o() {
        if (!this.f87269OooO0o0) {
            this.f87269OooO0o0 = true;
            this.f87267OooO0Oo.schedule(this.f87271OooO0oo, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // o00oOOO0.C25582OooO0O0
    public final boolean OooO0o0(Drawable drawable, Canvas canvas, int i) throws Throwable {
        this.f87268OooO0o = this.f87266OooO0OO.now();
        boolean zOooO0o0 = super.OooO0o0(drawable, canvas, i);
        OooO0o();
        return zOooO0o0;
    }
}
