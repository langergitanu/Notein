package o00O00oO;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsCompat;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00O00o.C24807OooO0O0;
import o00O0O0.C24826OooO0Oo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o00O00oO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24823OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24823OooOOOo f84189OooO00o = new C24823OooOOOo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f84190OooO0O0 = C24823OooOOOo.class.getSimpleName();

    static {
        C34429OooOOo0.OooO0oo(Integer.valueOf(WindowInsetsCompat.Type.statusBars()), Integer.valueOf(WindowInsetsCompat.Type.navigationBars()), Integer.valueOf(WindowInsetsCompat.Type.captionBar()), Integer.valueOf(WindowInsetsCompat.Type.ime()), Integer.valueOf(WindowInsetsCompat.Type.systemGestures()), Integer.valueOf(WindowInsetsCompat.Type.mandatorySystemGestures()), Integer.valueOf(WindowInsetsCompat.Type.tappableElement()), Integer.valueOf(WindowInsetsCompat.Type.displayCutout()));
    }

    public static OooOOO0 OooO00o(Activity activity) {
        Rect rect;
        WindowInsetsCompat windowInsetsCompatBuild;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            kotlin.jvm.internal.OooOOO0.OooO0o(rect, "wm.currentWindowMetrics.bounds");
        } else {
            if (i >= 29) {
                String str = f84190OooO0O0;
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                    kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                    rect = new Rect((Rect) objInvoke);
                } catch (IllegalAccessException e) {
                    Log.w(str, e);
                    rect = OooO0O0(activity);
                } catch (NoSuchFieldException e2) {
                    Log.w(str, e2);
                    rect = OooO0O0(activity);
                } catch (NoSuchMethodException e3) {
                    Log.w(str, e3);
                    rect = OooO0O0(activity);
                } catch (InvocationTargetException e4) {
                    Log.w(str, e4);
                    rect = OooO0O0(activity);
                }
            } else if (i >= 28) {
                rect = OooO0O0(activity);
            } else {
                rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", TelemetryEventStrings.C18741Os.OS_NAME);
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i2 = rect.bottom + dimensionPixelSize;
                    if (i2 == point.y) {
                        rect.bottom = i2;
                    } else {
                        int i3 = rect.right + dimensionPixelSize;
                        if (i3 == point.x) {
                            rect.right = i3;
                        }
                    }
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            kotlin.jvm.internal.OooOOO0.OooO0o(windowInsetsCompatBuild, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i4 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            windowInsetsCompatBuild = C24826OooO0Oo.f84206OooO00o.OooO00o(activity);
        }
        return new OooOOO0(new C24807OooO0O0(rect), windowInsetsCompatBuild);
    }

    public static Rect OooO0O0(Activity activity) {
        Object obj;
        String str = f84190OooO0O0;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj2.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj2, new Object[0]);
                kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj2.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj2, new Object[0]);
                kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e) {
            Log.w(str, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e2) {
            Log.w(str, e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e3) {
            Log.w(str, e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e4) {
            Log.w(str, e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", TelemetryEventStrings.C18741Os.OS_NAME);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(new Object[0]);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(objNewInstance);
            } catch (ClassNotFoundException e5) {
                Log.w(str, e5);
            } catch (IllegalAccessException e6) {
                Log.w(str, e6);
            } catch (InstantiationException e7) {
                Log.w(str, e7);
            } catch (NoSuchFieldException e8) {
                Log.w(str, e8);
            } catch (NoSuchMethodException e9) {
                Log.w(str, e9);
            } catch (InvocationTargetException e10) {
                Log.w(str, e10);
            }
            DisplayCutout displayCutoutOooO00o = OooOOO.OooO0O0(obj) ? OooOOOO.OooO00o(obj) : null;
            if (displayCutoutOooO00o != null) {
                if (rect.left == displayCutoutOooO00o.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutOooO00o.getSafeInsetRight()) {
                    rect.right = displayCutoutOooO00o.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutOooO00o.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutOooO00o.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutOooO00o.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
