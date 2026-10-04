package o0O0OOO0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import com.lzf.easyfloat.data.FloatConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import o0O0O0oo.C25875OooO0O0;
import o0O0O0oo.C25877OooO0o0;
import o0ooO.EnumC31414OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == null) {
            return;
        }
        WeakReference weakReference = OooO.OooO00o.f58143OooO0O0;
        if (weakReference != null) {
            weakReference.clear();
        }
        OooO.OooO00o.f58143OooO0O0 = new WeakReference(activity);
        for (Map.Entry<String, C25875OooO0O0> entry : C25877OooO0o0.f88312OooO00o.entrySet()) {
            String key = entry.getKey();
            FloatConfig floatConfig = entry.getValue().f88293OooO0O0;
            if (floatConfig.getShowPattern() != EnumC31414OooO00o.f112175OooOo0o) {
                if (floatConfig.getShowPattern() == EnumC31414OooO00o.f112177OooOoO0) {
                    OooO.OooO00o.OooO0Oo(key, false);
                } else if (floatConfig.getNeedShow$easyfloat_release()) {
                    OooO.OooO00o.OooO0Oo(key, !floatConfig.getFilterSet().contains(activity.getComponentName().getClassName()));
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        OooO.OooO00o.f58142OooO00o++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        FloatConfig floatConfig;
        IBinder iBinder;
        View decorView;
        if (activity == null) {
            return;
        }
        OooO.OooO00o.f58142OooO00o--;
        if (activity.isFinishing() || OooO.OooO00o.f58142OooO00o <= 0) {
            for (Map.Entry<String, C25875OooO0O0> entry : C25877OooO0o0.f88312OooO00o.entrySet()) {
                String key = entry.getKey();
                C25875OooO0O0 value = entry.getValue();
                if (activity.isFinishing() && (iBinder = value.OooO0OO().token) != null) {
                    Window window = activity.getWindow();
                    IBinder windowToken = null;
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        windowToken = decorView.getWindowToken();
                    }
                    if (iBinder.equals(windowToken)) {
                        C25877OooO0o0.OooO00o(key);
                    }
                }
                FloatConfig floatConfig2 = value.f88293OooO0O0;
                if (OooO.OooO00o.f58142OooO00o <= 0 && floatConfig2.getShowPattern() != EnumC31414OooO00o.f112175OooOo0o) {
                    boolean needShow$easyfloat_release = true;
                    boolean z = floatConfig2.getShowPattern() != EnumC31414OooO00o.f112174OooOo && floatConfig2.getNeedShow$easyfloat_release();
                    C25875OooO0O0 c25875OooO0O0 = C25877OooO0o0.f88312OooO00o.get(key);
                    if (c25875OooO0O0 != null && (floatConfig = c25875OooO0O0.f88293OooO0O0) != null) {
                        needShow$easyfloat_release = floatConfig.getNeedShow$easyfloat_release();
                    }
                    C25875OooO0O0 c25875OooO0O0OooO0O0 = C25877OooO0o0.OooO0O0(key);
                    if (c25875OooO0O0OooO0O0 != null) {
                        c25875OooO0O0OooO0O0.OooO0o(z ? 0 : 8, needShow$easyfloat_release);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                }
            }
        }
    }
}
