package com.huawei.hms.hwid;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.support.api.client.Status;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

/* JADX INFO: renamed from: com.huawei.hms.hwid.ao */
/* JADX INFO: loaded from: classes8.dex */
public class C18049ao {
    /* JADX INFO: renamed from: a */
    public static void m77645a(Activity activity) {
        if (C18051aq.m77651a()) {
            m77647b(activity);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m77647b(Activity activity) {
        C18053as.m77659b("AccountSdkUtil", "enter initOnApplyWindowInsets", true);
        final ViewGroup viewGroup = (ViewGroup) activity.getWindow().findViewById(R.id.content);
        if (viewGroup == null) {
            C18053as.m77659b("AccountSdkUtil", "rootView is null", true);
        } else {
            m77648c(activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.hms.hwid.ao.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    try {
                        Object objInvoke = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx").getMethod("getDisplaySideRegion", WindowInsets.class).invoke(null, windowInsets);
                        if (objInvoke == null) {
                            C18053as.m77659b("AccountSdkUtil", "sideRegion is null", true);
                        } else {
                            Rect rect = (Rect) Class.forName("com.huawei.android.view.DisplaySideRegionEx").getMethod("getSafeInsets", new Class[0]).invoke(objInvoke, new Object[0]);
                            C18053as.m77659b("AccountSdkUtil", "safeInsets LR: " + rect.left + C18241k5.f55433h + rect.right, true);
                            C18053as.m77659b("AccountSdkUtil", "safeInsets TB: " + rect.top + C18241k5.f55433h + rect.bottom, true);
                            ViewGroup viewGroup2 = viewGroup;
                            if (viewGroup2 != null) {
                                viewGroup2.setPadding(rect.left, 0, rect.right, 0);
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                        C18053as.m77661d("AccountSdkUtil", "ClassNotFoundException onApplyWindowInsets", true);
                    } catch (IllegalAccessException unused2) {
                        C18053as.m77661d("AccountSdkUtil", "IllegalAccessException onApplyWindowInsets", true);
                    } catch (NoSuchMethodException unused3) {
                        C18053as.m77661d("AccountSdkUtil", "NoSuchMethodException onApplyWindowInsets", true);
                    } catch (InvocationTargetException unused4) {
                        C18053as.m77661d("AccountSdkUtil", "InvocationTargetException onApplyWindowInsets", true);
                    } catch (Throwable th) {
                        C18053as.m77661d("AccountSdkUtil", "onApplyWindowInsets--".concat(th.getClass().getSimpleName()), true);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m77648c(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (ClassNotFoundException unused) {
            C18053as.m77661d("AccountSdkUtil", "ClassNotFoundException setDisplaySideMode", true);
        } catch (IllegalAccessException unused2) {
            C18053as.m77661d("AccountSdkUtil", "IllegalAccessException setDisplaySideMode", true);
        } catch (InstantiationException unused3) {
            C18053as.m77661d("AccountSdkUtil", "InstantiationException setDisplaySideMode", true);
        } catch (NoSuchMethodException unused4) {
            C18053as.m77661d("AccountSdkUtil", "NoSuchMethodException setDisplaySideMode", true);
        } catch (InvocationTargetException unused5) {
            C18053as.m77661d("AccountSdkUtil", "InvocationTargetException setDisplaySideMode", true);
        } catch (Throwable th) {
            C18053as.m77661d("AccountSdkUtil", "setDisplaySideMode--".concat(th.getClass().getSimpleName()), true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m77644a() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static void m77646a(ResponseErrorCode responseErrorCode, Status status) {
        if (responseErrorCode == null || status == null) {
            C18053as.m77659b("AccountSdkUtil", "response or status is null", true);
            return;
        }
        if (responseErrorCode.getParcelable() == null) {
            C18053as.m77659b("AccountSdkUtil", "parcelable is null", true);
            return;
        }
        try {
            if (responseErrorCode.getParcelable() instanceof PendingIntent) {
                C18053as.m77659b("AccountSdkUtil", "doExecute is PendingIntent", true);
                status.setPendingIntent((PendingIntent) responseErrorCode.getParcelable());
            }
            if (responseErrorCode.getParcelable() instanceof Intent) {
                C18053as.m77659b("AccountSdkUtil", "doExecute is Intent", true);
                status.setIntent((Intent) responseErrorCode.getParcelable());
            }
        } catch (ClassCastException unused) {
            C18053as.m77661d("AccountSdkUtil", "doExecuteIntent ClassCastException", true);
        } catch (Throwable th) {
            C18053as.m77661d("AccountSdkUtil", "doExecuteIntent--".concat(th.getClass().getSimpleName()), true);
        }
    }
}
