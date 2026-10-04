package ooOOOOoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.google.common.collect.C22504OooOOOo;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o0oooo.C31862OooO00o;
import o0ooooO0.InterfaceC31872OooO00o;
import ooOOOOoo.C35078OooOo0o;
import ooOOOOoo.C35081OooOoOO;

/* JADX INFO: renamed from: ooOOOOoo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35079OooOoO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static WeakReference<C31862OooO00o> f126000OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static InterfaceC31872OooO00o f126001OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31862OooO00o f126002OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public InterfaceC31872OooO00o f126004OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Set<Activity> f125999OooO0o0 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static C35078OooOo0o f125998OooO0o = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f126005OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C35064OooO0Oo f126003OooO0O0 = new C35064OooO0Oo("miui_relay", new Handler.Callback() { // from class: ooOOOOoo.OooOo
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i;
            C35079OooOoO c35079OooOoO = this.f125992OooOo0o;
            c35079OooOoO.getClass();
            try {
                i = message.what;
            } catch (Throwable th) {
                C35077OooOo0O.OooO0OO("RI", th, "unknown error", new Object[0]);
            }
            if (i == 1) {
                c35079OooOoO.OooO0OO((InterfaceC31872OooO00o) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            c35079OooOoO.OooO00o();
            return true;
        }
    });

    /* JADX INFO: renamed from: ooOOOOoo.OooOoO$OooO00o */
    public class OooO00o extends AbstractC35076OooOo0 {
        public OooO00o() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C35077OooOo0O.OooO0o0("RI", "on Act Destroyed %s", activity);
            C35079OooOoO c35079OooOoO = C35079OooOoO.this;
            c35079OooOoO.f126003OooO0O0.OooO00o().obtainMessage(2).sendToTarget();
            C35064OooO0Oo c35064OooO0Oo = c35079OooOoO.f126003OooO0O0;
            c35064OooO0Oo.getClass();
            C35077OooOo0O.OooO0o0("HD", "release", null);
            c35064OooO0Oo.f125955OooO00o.quitSafely();
            c35064OooO0Oo.f125957OooO0OO = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C35077OooOo0O.OooO0o0("RI", "on Act Resumed %s", activity);
            C35079OooOoO c35079OooOoO = C35079OooOoO.this;
            C35079OooOoO.f126000OooO0oO = new WeakReference<>(c35079OooOoO.f126002OooO00o);
            C35079OooOoO.f126001OooO0oo = c35079OooOoO.f126004OooO0OO;
            C35078OooOo0o c35078OooOo0o = C35079OooOoO.f125998OooO0o;
            if (c35078OooOo0o != null) {
                c35078OooOo0o.OooO0Oo();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ooOOOOoo.OooOo] */
    public C35079OooOoO(C31862OooO00o c31862OooO00o) {
        this.f126002OooO00o = c31862OooO00o;
    }

    public final void OooO00o() {
        C35078OooOo0o c35078OooOo0o;
        C35077OooOo0O.OooO0O0("RI", "cancel", null);
        this.f126002OooO00o.f113561OooO00o.unregisterActivityLifecycleCallbacks(this.f126005OooO0Oo);
        Set<Activity> set = f125999OooO0o0;
        set.remove(this.f126002OooO00o.f113561OooO00o);
        synchronized (C35078OooOo0o.class) {
            if (set.isEmpty() && (c35078OooOo0o = f125998OooO0o) != null) {
                c35078OooOo0o.OooO00o();
                f126000OooO0oO = null;
                f125998OooO0o = null;
                f126001OooO0oo = null;
                C35077OooOo0O.OooO0o0("RI", "cancel done", null);
            }
        }
    }

    public final void OooO0O0(Intent intent) {
        C35077OooOo0O.OooO0o0("RI", "onRestoreSessionState", null);
        if (intent == null) {
            C35077OooOo0O.OooO0o0("RI", "intent is null skip", null);
            return;
        }
        try {
            if (intent.getData() != null) {
                this.f126002OooO00o.getClass();
            }
            C35077OooOo0O.OooO0Oo("RI", "onRestoreSessionState, data or callback is null", null);
        } catch (Throwable th) {
            C35077OooOo0O.OooO0Oo("RI", "onRestoreSessionState, decode fail", th);
        }
    }

    public final void OooO0OO(InterfaceC31872OooO00o interfaceC31872OooO00o) {
        C35077OooOo0O.OooO0O0("RI", "publish", null);
        this.f126004OooO0OO = interfaceC31872OooO00o;
        f125999OooO0o0.add(this.f126002OooO00o.f113561OooO00o);
        this.f126002OooO00o.f113561OooO00o.registerActivityLifecycleCallbacks(this.f126005OooO0Oo);
        boolean z = f125998OooO0o == null;
        synchronized (C35078OooOo0o.class) {
            try {
                f126000OooO0oO = new WeakReference<>(this.f126002OooO00o);
                f126001OooO0oo = interfaceC31872OooO00o;
                if (z) {
                    C35078OooOo0o c35078OooOo0o = new C35078OooOo0o(this.f126002OooO00o.f113561OooO00o.getApplication(), new C35080OooOoO0());
                    f125998OooO0o = c35078OooOo0o;
                    C22504OooOOOo c22504OooOOOo = new C22504OooOOOo(1);
                    C35077OooOo0O.OooO0o0("RH", "publish", null);
                    c35078OooOo0o.f125995OooO0OO = c22504OooOOOo;
                    C35081OooOoOO c35081OooOoOO = C35081OooOoOO.OooO00o.f126011OooO00o;
                    C35078OooOo0o.OooO00o oooO00o = c35078OooOo0o.f125996OooO0Oo;
                    if (c35081OooOoOO.OooO00o()) {
                        c35081OooOoOO.f126010OooO0OO.OooO0O0(c35081OooOoOO.f126008OooO00o, oooO00o);
                    }
                }
                f125998OooO0o.OooO0Oo();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            OooO0O0(this.f126002OooO00o.f113561OooO00o.getIntent());
        }
    }
}
