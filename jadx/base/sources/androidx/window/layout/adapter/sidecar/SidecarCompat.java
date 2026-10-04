package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.util.Consumer;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00O00o.OooO;
import o00O00oO.C24822OooOO0o;
import o00O0O00.C24832OooO0oO;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes.dex */
public final class SidecarCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SidecarInterface f66649OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O00.OooO00o f66650OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f66651OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f66652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f66653OooO0o0;

    public static final class OooO00o {
        public static SidecarInterface OooO00o(Context context) {
            OooOOO0.OooO0oO(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public static OooO OooO0O0() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                OooO oooO = OooO.f84121OooOoo0;
                return OooO.OooO00o.OooO00o(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C24832OooO0oO.OooO00o f66654OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ReentrantLock f66655OooO0O0 = new ReentrantLock();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakHashMap<Activity, C24822OooOO0o> f66656OooO0OO = new WeakHashMap<>();

        public OooO0O0(C24832OooO0oO.OooO00o oooO00o) {
            this.f66654OooO00o = oooO00o;
        }

        public final void OooO00o(Activity activity, C24822OooOO0o c24822OooOO0o) {
            OooOOO0.OooO0oO(activity, "activity");
            ReentrantLock reentrantLock = this.f66655OooO0O0;
            reentrantLock.lock();
            WeakHashMap<Activity, C24822OooOO0o> weakHashMap = this.f66656OooO0OO;
            try {
                if (c24822OooOO0o.equals(weakHashMap.get(activity))) {
                    return;
                }
                weakHashMap.put(activity, c24822OooOO0o);
                reentrantLock.unlock();
                for (C24832OooO0oO.OooO0O0 oooO0O0 : C24832OooO0oO.this.f84218OooO0O0) {
                    if (oooO0O0.f84220OooO00o.equals(activity)) {
                        oooO0O0.f84222OooO0OO = c24822OooOO0o;
                        oooO0O0.f84221OooO0O0.accept(c24822OooOO0o);
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class OooO0OO implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final WeakReference<Activity> f66657OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final SidecarCompat f66658OooOo0o;

        public OooO0OO(SidecarCompat sidecarCompat, Activity activity) {
            OooOOO0.OooO0oO(sidecarCompat, "sidecarCompat");
            this.f66658OooOo0o = sidecarCompat;
            this.f66657OooOo = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Window window;
            WindowManager.LayoutParams attributes;
            OooOOO0.OooO0oO(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f66657OooOo.get();
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (activity == null || iBinder == null) {
                return;
            }
            this.f66658OooOo0o.OooO0OO(iBinder, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            OooOOO0.OooO0oO(view, "view");
        }
    }

    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "LoO00ooO/OooOooO;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterface;
            Window window;
            WindowManager.LayoutParams attributes;
            OooOOO0.OooO0oO(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.f66651OooO0OO.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (iBinder != null && (sidecarInterface = sidecarCompat.f66649OooO00o) != null) {
                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
                }
                OooO0O0 oooO0O0 = sidecarCompat.f66653OooO0o0;
                if (oooO0O0 != null) {
                    oooO0O0.OooO00o(activity, sidecarCompat.f66650OooO0O0.OooO0Oo(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            OooOOO0.OooO0oO(windowToken, "windowToken");
            OooOOO0.OooO0oO(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f66651OooO0OO.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            o00O0O00.OooO00o oooO00o = sidecarCompat.f66650OooO0O0;
            SidecarInterface sidecarInterface = sidecarCompat.f66649OooO00o;
            if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            C24822OooOO0o c24822OooOO0oOooO0Oo = oooO00o.OooO0Oo(newLayout, sidecarDeviceState);
            OooO0O0 oooO0O0 = SidecarCompat.this.f66653OooO0o0;
            if (oooO0O0 != null) {
                oooO0O0.OooO00o(activity, c24822OooOO0oOooO0Oo);
            }
        }
    }

    public SidecarCompat(Context context) {
        OooOOO0.OooO0oO(context, "context");
        SidecarInterface sidecarInterfaceOooO00o = OooO00o.OooO00o(context);
        o00O0O00.OooO00o oooO00o = new o00O0O00.OooO00o(0);
        this.f66649OooO00o = sidecarInterfaceOooO00o;
        this.f66650OooO0O0 = oooO00o;
        this.f66651OooO0OO = new LinkedHashMap();
        this.f66652OooO0Oo = new LinkedHashMap();
    }

    public final C24822OooOO0o OooO00o(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C24822OooOO0o(C34434OooOoO.f123453OooOo0o);
        }
        SidecarInterface sidecarInterface = this.f66649OooO00o;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.f66649OooO00o;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f66650OooO0O0.OooO0Oo(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f66649OooO00o;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f66652OooO0Oo;
        Consumer<Configuration> consumer = (Consumer) linkedHashMap.get(activity);
        if (consumer != null) {
            if (activity instanceof OnConfigurationChangedProvider) {
                ((OnConfigurationChangedProvider) activity).removeOnConfigurationChangedListener(consumer);
            }
            linkedHashMap.remove(activity);
        }
        OooO0O0 oooO0O0 = this.f66653OooO0o0;
        if (oooO0O0 != null) {
            ReentrantLock reentrantLock = oooO0O0.f66655OooO0O0;
            reentrantLock.lock();
            try {
                oooO0O0.f66656OooO0OO.put(activity, null);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } finally {
                reentrantLock.unlock();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f66651OooO0OO;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f66649OooO00o) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f66651OooO0OO;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f66649OooO00o;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f66649OooO00o) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        OooO0O0 oooO0O0 = this.f66653OooO0o0;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(activity, OooO00o(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f66652OooO0Oo;
        if (linkedHashMap2.get(activity) == null && (activity instanceof OnConfigurationChangedProvider)) {
            Consumer<Configuration> consumer = new Consumer() { // from class: o00O0O00.OooO0o
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    SidecarCompat this$0 = this.f84213OooOo0o;
                    OooOOO0.OooO0oO(this$0, "this$0");
                    Activity activity2 = activity;
                    OooOOO0.OooO0oO(activity2, "$activity");
                    SidecarCompat.OooO0O0 oooO0O02 = this$0.f66653OooO0o0;
                    if (oooO0O02 != null) {
                        oooO0O02.OooO00o(activity2, this$0.OooO00o(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, consumer);
            ((OnConfigurationChangedProvider) activity).addOnConfigurationChangedListener(consumer);
        }
    }

    public final void OooO0Oo(C24832OooO0oO.OooO00o oooO00o) {
        this.f66653OooO0o0 = new OooO0O0(oooO00o);
        SidecarInterface sidecarInterface = this.f66649OooO00o;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f66650OooO0O0, new TranslatingCallback()));
        }
    }

    public final boolean OooO0o0() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f66649OooO00o;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!OooOOO0.OooO0O0(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f66649OooO00o;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f66649OooO00o;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f66649OooO00o;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!OooOOO0.OooO0O0(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f66649OooO00o;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!OooOOO0.OooO0O0(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f66649OooO00o;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!OooOOO0.OooO0O0(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            OooOOO0.OooO0o(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                OooOOO0.OooO0o0(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!arrayList.equals((List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }
}
