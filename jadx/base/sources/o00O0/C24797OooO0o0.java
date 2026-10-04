package o00O0;

import Oooo0.C20855OooooOO;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import o00O00o.C24807OooO0O0;
import o00O00oO.C24816OooO0Oo;
import o00O00oO.C24822OooOO0o;
import o00O00oO.C24823OooOOOo;
import o00O00oO.InterfaceC24815OooO0OO;
import o00O00oO.OooOOO0;

/* JADX INFO: renamed from: o00O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24797OooO0o0 {
    public static C24816OooO0Oo OooO00o(OooOOO0 oooOOO0, FoldingFeature foldingFeature) {
        C24816OooO0Oo.OooO00o oooO00o;
        InterfaceC24815OooO0OO.OooO0O0 oooO0O0;
        int type = foldingFeature.getType();
        if (type == 1) {
            oooO00o = C24816OooO0Oo.OooO00o.f84166OooO0O0;
        } else {
            if (type != 2) {
                return null;
            }
            oooO00o = C24816OooO0Oo.OooO00o.f84167OooO0OO;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            oooO0O0 = InterfaceC24815OooO0OO.OooO0O0.f84160OooO0O0;
        } else {
            if (state != 2) {
                return null;
            }
            oooO0O0 = InterfaceC24815OooO0OO.OooO0O0.f84161OooO0OO;
        }
        Rect bounds = foldingFeature.getBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(bounds, "oemFeature.bounds");
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        if (i > i3) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        C24807OooO0O0 c24807OooO0O0 = oooOOO0.f84187OooO00o;
        c24807OooO0O0.getClass();
        Rect rect = new Rect(c24807OooO0O0.f84129OooO00o, c24807OooO0O0.f84130OooO0O0, c24807OooO0O0.f84131OooO0OO, c24807OooO0O0.f84132OooO0Oo);
        int i5 = i4 - i2;
        if (i5 == 0 && i3 - i == 0) {
            return null;
        }
        int i6 = i3 - i;
        if (i6 != rect.width() && i5 != rect.height()) {
            return null;
        }
        if (i6 < rect.width() && i5 < rect.height()) {
            return null;
        }
        if (i6 == rect.width() && i5 == rect.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(bounds2, "oemFeature.bounds");
        return new C24816OooO0Oo(new C24807OooO0O0(bounds2), oooO00o, oooO0O0);
    }

    public static C24822OooOO0o OooO0O0(Context context, WindowLayoutInfo windowLayoutInfo) {
        OooOOO0 oooOOO0;
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            if (i < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            C24823OooOOOo.f84189OooO00o.getClass();
            return OooO0OO(C24823OooOOOo.OooO00o((Activity) context), windowLayoutInfo);
        }
        C24823OooOOOo.f84189OooO00o.getClass();
        if (i < 30) {
            Context baseContext = context;
            while (baseContext instanceof ContextWrapper) {
                boolean z = baseContext instanceof Activity;
                if (!z && !(baseContext instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                    if (contextWrapper.getBaseContext() != null) {
                        baseContext = contextWrapper.getBaseContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(baseContext, "iterator.baseContext");
                    }
                }
                if (z) {
                    oooOOO0 = C24823OooOOOo.OooO00o((Activity) baseContext);
                } else {
                    if (!(baseContext instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    kotlin.jvm.internal.OooOOO0.OooO0o(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
                    kotlin.jvm.internal.OooOOO0.OooO0o(windowInsetsCompatBuild, "Builder().build()");
                    oooOOO0 = new OooOOO0(new C24807OooO0O0(rect), windowInsetsCompatBuild);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowManager.getCurrentWindowMetrics().getWindowInsets());
        kotlin.jvm.internal.OooOOO0.OooO0o(windowInsetsCompat, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(bounds, "wm.currentWindowMetrics.bounds");
        oooOOO0 = new OooOOO0(new C24807OooO0O0(bounds), windowInsetsCompat);
        return OooO0OO(oooOOO0, windowLayoutInfo);
    }

    public static C24822OooOO0o OooO0OO(OooOOO0 oooOOO0, WindowLayoutInfo windowLayoutInfo) {
        C24816OooO0Oo c24816OooO0OoOooO00o;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        kotlin.jvm.internal.OooOOO0.OooO0o(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                kotlin.jvm.internal.OooOOO0.OooO0o(feature, "feature");
                c24816OooO0OoOooO00o = OooO00o(oooOOO0, feature);
            } else {
                c24816OooO0OoOooO00o = null;
            }
            if (c24816OooO0OoOooO00o != null) {
                arrayList.add(c24816OooO0OoOooO00o);
            }
        }
        return new C24822OooOO0o(arrayList);
    }
}
