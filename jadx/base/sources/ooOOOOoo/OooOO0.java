package ooOOOOoo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import o0O0oooO.C26340o000Oo;
import o0Ooooo.RunnableC29668OooO0o0;
import o0oooo.C31862OooO00o;
import o0ooooO0.InterfaceC31872OooO00o;
import ooOOOOoo.InterfaceC35073OooOOo;
import ooOOOOoo.InterfaceC35075OooOOoo;
import ooOOOOoo.OooOo00;
import p615ho.C18932e;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final BinderC35070OooO0o0 f125967OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C31862OooO00o f125970OooO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile InterfaceC35073OooOOo f125974OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CountDownLatch f125976OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public View f125977OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public C26340o000Oo f125978OooOOO0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f125968OooO0OO = new OooO00o(null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f125969OooO0Oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f125971OooO0o0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ServiceConnectionC35069OooO0Oo f125972OooO0oO = new ServiceConnectionC35069OooO0Oo();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f125973OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f125965OooO = true;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Boolean f125975OooOO0O = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C35064OooO0Oo f125966OooO00o = new C35064OooO0Oo("ho_dispatcher", null);

    public static final class OooO00o extends InterfaceC35075OooOOoo.OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final WeakReference<InterfaceC31872OooO00o> f125979OooO0o0;

        public OooO00o(C26340o000Oo c26340o000Oo) {
            this.f125979OooO0o0 = new WeakReference<>(c26340o000Oo);
        }
    }

    public final class OooO0O0 extends AbstractC35076OooOo0 {
        public OooO0O0() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C35077OooOo0O.OooO0o0("HH", "onActivityDestroyed, act class name=%s, hash=%s", activity.getLocalClassName(), Integer.valueOf(activity.hashCode()));
            final OooOO0 oooOO02 = OooOO0.this;
            oooOO02.f125965OooO = false;
            C35077OooOo0O.OooO0o0("HH", "cancel", null);
            View view = oooOO02.f125977OooOOO;
            if (view != null) {
                view.removeOnLayoutChangeListener(oooOO02.f125971OooO0o0);
                oooOO02.f125977OooOOO = null;
            }
            oooOO02.f125970OooO0o.f113561OooO00o.unregisterActivityLifecycleCallbacks(oooOO02.f125969OooO0Oo);
            C35064OooO0Oo c35064OooO0Oo = oooOO02.f125966OooO00o;
            c35064OooO0Oo.OooO00o().removeCallbacksAndMessages(null);
            oooOO02.f125975OooOO0O = Boolean.FALSE;
            try {
                c35064OooO0Oo.OooO00o().getLooper().getThread().interrupt();
            } catch (Throwable unused) {
            }
            c35064OooO0Oo.OooO00o().post(new Runnable() { // from class: ooOOOOoo.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    OooOO0 oooOO03 = oooOO02;
                    oooOO03.getClass();
                    if (Thread.interrupted()) {
                        C35077OooOo0O.OooO0O0("HH", "clear interrupted state", null);
                    }
                    if (oooOO03.f125973OooO0oo > 0) {
                        oooOO03.OooO00o(null, new C35060OooO());
                    }
                    oooOO03.f125966OooO00o.OooO00o().post(new RunnableC29668OooO0o0(oooOO03, 1));
                }
            });
        }

        @Override // ooOOOOoo.AbstractC35076OooOo0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C35077OooOo0O.OooO0o0("HH", "onActivityPaused, act class name=%s, hash=%s", activity.getLocalClassName(), Integer.valueOf(activity.hashCode()));
            OooOO0 oooOO02 = OooOO0.this;
            oooOO02.f125965OooO = false;
            oooOO02.OooO00o(new Consumer() { // from class: ooOOOOoo.OooOO0O
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    OooOO0.this.OooO0OO((InterfaceC35073OooOOo) obj, false);
                }
            }, null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C35077OooOo0O.OooO0o0("HH", "onActivityResumed, act class name=%s, hash=%s", activity.getLocalClassName(), Integer.valueOf(activity.hashCode()));
            OooOO0 oooOO02 = OooOO0.this;
            oooOO02.f125965OooO = true;
            oooOO02.OooO00o(new Consumer() { // from class: ooOOOOoo.OooOO0o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    OooOO0.this.OooO0OO((InterfaceC35073OooOOo) obj, true);
                }
            }, null);
        }
    }

    public final class OooO0OO implements View.OnLayoutChangeListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            OooOO0 oooOO02 = OooOO0.this;
            boolean zIsInMultiWindowMode = oooOO02.f125970OooO0o.f113561OooO00o.isInMultiWindowMode();
            Boolean bool = oooOO02.f125975OooOO0O;
            if (bool == null || bool.booleanValue() != zIsInMultiWindowMode) {
                C35077OooOo0O.OooO0o0("HH", "onLayoutChange, isSmallWindowState=%s", Boolean.valueOf(zIsInMultiWindowMode));
                oooOO02.f125975OooOO0O = Boolean.valueOf(zIsInMultiWindowMode);
                oooOO02.OooO00o(new Consumer() { // from class: ooOOOOoo.OooOOO0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        try {
                            ((InterfaceC35073OooOOo) obj).mo80639a(OooOO0.this.f125975OooOO0O.booleanValue());
                        } catch (Throwable th) {
                            Log.e(C35077OooOo0O.OooO00o("HH"), "setInMultiWindowMode exception", th);
                        }
                    }
                }, null);
            }
        }
    }

    /* JADX INFO: renamed from: ooOOOOoo.OooOO0$OooO0Oo, reason: case insensitive filesystem */
    public final class ServiceConnectionC35069OooO0Oo implements ServiceConnection {
        public ServiceConnectionC35069OooO0Oo() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC35073OooOOo interfaceC35073OooOOo;
            C35077OooOo0O.OooO0o0("HH", "onServiceConnected", null);
            try {
                CountDownLatch countDownLatch = OooOO0.this.f125976OooOO0o;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } catch (Throwable unused) {
            }
            OooOO0 oooOO02 = OooOO0.this;
            int i = InterfaceC35073OooOOo.OooO00o.f125989OooO0o0;
            if (iBinder == null) {
                interfaceC35073OooOOo = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.dist.handoff.IAppHandoffService");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC35073OooOOo)) {
                    InterfaceC35073OooOOo.OooO00o.C20375OooO00o c20375OooO00o = new InterfaceC35073OooOOo.OooO00o.C20375OooO00o();
                    c20375OooO00o.f125990OooO0o0 = iBinder;
                    interfaceC35073OooOOo = c20375OooO00o;
                } else {
                    interfaceC35073OooOOo = (InterfaceC35073OooOOo) iInterfaceQueryLocalInterface;
                }
            }
            oooOO02.f125974OooOO0 = interfaceC35073OooOOo;
            C35077OooOo0O.OooO0Oo("HH", "restoreState", null);
            OooOO0 oooOO03 = OooOO0.this;
            final int i2 = oooOO03.f125973OooO0oo;
            oooOO03.OooO00o(new Consumer() { // from class: ooOOOOoo.OooOOO
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    InterfaceC35073OooOOo interfaceC35073OooOOo2 = (InterfaceC35073OooOOo) obj;
                    OooOO0 oooOO04 = OooOO0.this;
                    boolean z = i2 == oooOO04.f125973OooO0oo;
                    C35077OooOo0O.OooO0o("HH", "UpdateSessionState %s when service connected.", Boolean.valueOf(z));
                    if (z) {
                        oooOO04.OooO0O0(interfaceC35073OooOOo2);
                        oooOO04.OooO0OO(interfaceC35073OooOOo2, oooOO04.f125965OooO);
                    }
                }
            }, null);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C35077OooOo0O.OooO0Oo("HH", "onServiceDisconnected", null);
            OooOO0.this.f125974OooOO0 = null;
            OooOO0.this.OooO00o(null, null);
        }
    }

    /* JADX INFO: renamed from: ooOOOOoo.OooOO0$OooO0o0, reason: case insensitive filesystem */
    public static final class BinderC35070OooO0o0 extends OooOo00.OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final WeakReference<C31862OooO00o> f125983OooO0o0;

        public BinderC35070OooO0o0(C31862OooO00o c31862OooO00o) {
            this.f125983OooO0o0 = new WeakReference<>(c31862OooO00o);
        }
    }

    public OooOO0(C31862OooO00o c31862OooO00o) {
        this.f125970OooO0o = c31862OooO00o;
        this.f125967OooO0O0 = new BinderC35070OooO0o0(c31862OooO00o);
        OooO00o(null, null);
    }

    public final void OooO00o(final Consumer consumer, final C35060OooO c35060OooO) {
        this.f125966OooO00o.OooO00o().post(new Runnable() { // from class: ooOOOOoo.OooO0oO
            @Override // java.lang.Runnable
            public final void run() {
                OooOO0 oooOO02 = this.f125961OooOo0o;
                C35060OooO c35060OooO2 = c35060OooO;
                Consumer consumer2 = consumer;
                oooOO02.getClass();
                try {
                    InterfaceC35073OooOOo interfaceC35073OooOOo = oooOO02.f125974OooOO0;
                    if (interfaceC35073OooOOo == null || !interfaceC35073OooOOo.asBinder().isBinderAlive()) {
                        C35077OooOo0O.OooO0O0("HH", "unbind Handoff Service", null);
                        try {
                            oooOO02.f125970OooO0o.f113561OooO00o.unbindService(oooOO02.f125972OooO0oO);
                        } catch (Throwable unused) {
                        }
                        oooOO02.OooO0o0();
                    }
                    InterfaceC35073OooOOo interfaceC35073OooOOo2 = oooOO02.f125974OooOO0;
                    if (interfaceC35073OooOOo2 != null) {
                        if (consumer2 != null) {
                            consumer2.accept(interfaceC35073OooOOo2);
                        }
                    } else {
                        Log.e(C35077OooOo0O.OooO00o("HH"), "bind fail, handoff service unavailable", null);
                        if (c35060OooO2 != null) {
                            c35060OooO2.accept(null);
                        }
                    }
                } catch (Throwable th) {
                    Log.e(C35077OooOo0O.OooO00o("HH"), "handle task error.", th);
                }
            }
        });
    }

    public final void OooO0O0(InterfaceC35073OooOOo interfaceC35073OooOOo) {
        try {
            int i = this.f125973OooO0oo;
            C35077OooOo0O.OooO0o0("HH", "call cancelHandoffSession, sessionId %s", Integer.valueOf(i));
            if (i > 0 && interfaceC35073OooOOo != null) {
                interfaceC35073OooOOo.mo80637a(i);
                C35077OooOo0O.OooO0o0("HH", "call cancelHandoffSession done", null);
            }
        } catch (Throwable th) {
            try {
                Log.e(C35077OooOo0O.OooO00o("HH"), "cancelHandoffSession exception", th);
            } finally {
                this.f125973OooO0oo = 0;
            }
        }
    }

    public final void OooO0OO(InterfaceC35073OooOOo interfaceC35073OooOOo, boolean z) {
        Intent intent = this.f125970OooO0o.f113561OooO00o.getIntent();
        if (intent == null) {
            C35077OooOo0O.OooO0Oo("HH", "handleUpdateSessionState intent is null", null);
        } else {
            OooO0Oo(interfaceC35073OooOOo, z, intent.getIntExtra("com.xiaomi.dist.intent.extra.REF_TAG", 0));
        }
    }

    public final void OooO0Oo(InterfaceC35073OooOOo interfaceC35073OooOOo, boolean z, int i) {
        try {
            C35077OooOo0O.OooO0o0("HH", "handleUpdateSessionActive, active=%s, refTag=%s", Boolean.valueOf(z), Integer.valueOf(i));
            if (this.f125973OooO0oo <= 0) {
                C35077OooOo0O.OooO0o0("HH", "publish handoff session", null);
                Activity activity = this.f125970OooO0o.f113561OooO00o;
                int iHashCode = activity.getClass().getName().hashCode();
                int taskId = activity.getTaskId();
                String name = activity.getClass().getName();
                String packageName = activity.getPackageName();
                C18932e c18932e = new C18932e();
                c18932e.f80308OooOo0o = iHashCode;
                c18932e.f80307OooOo = taskId;
                c18932e.f80310OooOoO0 = name;
                c18932e.f80309OooOoO = packageName;
                C35077OooOo0O.OooO0O0("HH", "getSessionInfo, info=%s", c18932e);
                this.f125973OooO0oo = interfaceC35073OooOOo.OooO0Oo(c18932e, this.f125967OooO0O0, this.f125968OooO0OO, i);
            }
            interfaceC35073OooOOo.mo80638a(this.f125973OooO0oo, !z ? 1 : 0, i);
        } catch (Throwable th) {
            Log.e(C35077OooOo0O.OooO00o("HH"), "handleUpdateSessionState exception", th);
        }
    }

    public final void OooO0o0() {
        boolean zAwait;
        C35077OooOo0O.OooO0O0("HH", "bind Handoff Service", null);
        if (!C35074OooOOo0.OooO0o(this.f125970OooO0o.f113561OooO00o)) {
            C35077OooOo0O.OooO0Oo("HH", "bindService fail, not support", null);
            return;
        }
        String strOooO0O0 = C35074OooOOo0.OooO0O0(this.f125970OooO0o.f113561OooO00o);
        if (TextUtils.isEmpty(strOooO0O0)) {
            Log.e(C35077OooOo0O.OooO00o("HU"), "service package not found!", null);
            strOooO0O0 = null;
        } else {
            C35077OooOo0O.OooO0o0("HU", "get ho service pkg name= %s", strOooO0O0);
        }
        if (TextUtils.isEmpty(strOooO0O0)) {
            C35077OooOo0O.OooO0Oo("HH", "bindService fail, service package name empty", null);
            return;
        }
        this.f125976OooOO0o = new CountDownLatch(1);
        int i = 3;
        while (i >= 0) {
            try {
            } catch (InterruptedException e) {
                Log.e(C35077OooOo0O.OooO00o("HH"), "bind service interrupted", e);
                return;
            } catch (Throwable th) {
                Log.e(C35077OooOo0O.OooO00o("HH"), "bind service fail", th);
                zAwait = false;
            }
            if (Thread.interrupted()) {
                C35077OooOo0O.OooO0Oo("HH", "bind service interrupted", null);
                return;
            }
            C35077OooOo0O.OooO0o0("HH", "start bind ho service", null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Thread.sleep(timeUnit.toMillis(((long) (3 - i)) * 2));
            InterfaceC35073OooOOo interfaceC35073OooOOo = this.f125974OooOO0;
            if (interfaceC35073OooOOo != null && interfaceC35073OooOOo.asBinder().isBinderAlive()) {
                C35077OooOo0O.OooO0o0("HH", "bind ho service, already bind", null);
                return;
            }
            Activity activity = this.f125970OooO0o.f113561OooO00o;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.dist.intent.action.APP_HANDOFF");
            intent.setPackage(strOooO0O0);
            activity.bindService(intent, this.f125972OooO0oO, 1);
            zAwait = this.f125976OooOO0o.await(2L, timeUnit);
            if (!zAwait) {
                C35077OooOo0O.OooO0Oo("HH", "bind service fail, retry if need.", null);
                i--;
            }
        }
    }
}
