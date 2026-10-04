package o0O0OO0O;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00Oo0oO.C25050OooO0O0;
import o00Oo0oO.C25052OooO0Oo;
import o0O0O0o.C25871OooO00o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lo0O0OO0O/OooO0O0;", "Landroid/app/Fragment;", "<init>", "()V", "easyfloat_release"}, m80613k = 1, m80614mv = {1, 5, 1}, m80616xi = 48)
public final class OooO0O0 extends Fragment {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static C25871OooO00o f88338OooOo0o;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (oO0o0O0o.C33599OooOo0O.OooOoOO(r5, "flyme", false) != false) goto L14;
     */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Bundle bundle) throws Throwable {
        super.onActivityCreated(bundle);
        String strOooO0o0 = C25050OooO0O0.OooO0o0("ro.build.display.id");
        if (!TextUtils.isEmpty(strOooO0o0)) {
            OooOOO0.OooO0Oo(strOooO0o0);
            if (!C33599OooOo0O.OooOoOO(strOooO0o0, "flyme", false)) {
                String lowerCase = strOooO0o0.toLowerCase();
                OooOOO0.OooO0o(lowerCase, "(this as java.lang.String).toLowerCase()");
            }
            try {
                Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.putExtra("packageName", getActivity().getPackageName());
                startActivityForResult(intent, 199);
                return;
            } catch (Exception e) {
                try {
                    Log.e("MeizuUtils", "获取悬浮窗权限, 打开AppSecActivity失败, " + Log.getStackTraceString(e));
                    C25052OooO0Oo.OooO0Oo(this);
                    return;
                } catch (Exception e2) {
                    Log.e("MeizuUtils", "获取悬浮窗权限失败, 通用获取方法失败, " + Log.getStackTraceString(e2));
                    return;
                }
            }
        }
        try {
            C25052OooO0Oo.OooO0Oo(this);
        } catch (Exception e3) {
            OooOOO0.OooO0o(Log.getStackTraceString(e3), "getStackTraceString(e)");
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 199) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o0O0OO0O.OooO00o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C25871OooO00o c25871OooO00o = OooO0O0.f88338OooOo0o;
                    Fragment fragment = this.f88337OooOo0o;
                    Activity activity = fragment.getActivity();
                    if (activity == null) {
                        return;
                    }
                    boolean zOooO0OO = C25052OooO0Oo.OooO0OO(activity);
                    String msg = OooOOO0.OooOOO0(Boolean.valueOf(zOooO0OO), "PermissionFragment onActivityResult: ");
                    OooOOO0.OooO0oO(msg, "msg");
                    OooOOO0.OooO0oO(msg.toString(), "msg");
                    C25871OooO00o c25871OooO00o2 = OooO0O0.f88338OooOo0o;
                    if (c25871OooO00o2 != null) {
                        if (zOooO0OO) {
                            c25871OooO00o2.OooO0O0();
                        } else {
                            c25871OooO00o2.OooO00o("No permission exception. You need to turn on overlay permissions.");
                        }
                    }
                    OooO0O0.f88338OooOo0o = null;
                    fragment.getFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
                }
            }, 500L);
        }
    }
}
