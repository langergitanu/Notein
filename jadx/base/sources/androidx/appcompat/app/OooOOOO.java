package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C21572Ooooo0o;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.orion.notein.global.R;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f62459OooOo0o;

    public OooOOOO(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f62459OooOo0o = appCompatDelegateImpl;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        boolean z2;
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        AppCompatDelegateImpl appCompatDelegateImpl = this.f62459OooOo0o;
        appCompatDelegateImpl.getClass();
        int systemWindowInsetTop2 = windowInsetsCompat.getSystemWindowInsetTop();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.f62346OoooO0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.f62346OoooO0.getLayoutParams();
            if (appCompatDelegateImpl.f62346OoooO0.isShown()) {
                if (appCompatDelegateImpl.f62375o0OO00O == null) {
                    appCompatDelegateImpl.f62375o0OO00O = new Rect();
                    appCompatDelegateImpl.f62383oo0o0Oo = new Rect();
                }
                Rect rect = appCompatDelegateImpl.f62375o0OO00O;
                Rect rect2 = appCompatDelegateImpl.f62383oo0o0Oo;
                rect.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                ViewGroup viewGroup = appCompatDelegateImpl.f62351OoooOOo;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = C21572Ooooo0o.f63118OooO00o;
                    C21572Ooooo0o.OooO00o.OooO00o(viewGroup, rect, rect2);
                } else {
                    if (!C21572Ooooo0o.f63118OooO00o) {
                        C21572Ooooo0o.f63118OooO00o = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            C21572Ooooo0o.f63119OooO0O0 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                C21572Ooooo0o.f63119OooO0O0.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = C21572Ooooo0o.f63119OooO0O0;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(appCompatDelegateImpl.f62351OoooOOo);
                int systemWindowInsetLeft = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetRight = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = appCompatDelegateImpl.f62337Oooo00O;
                if (i <= 0 || appCompatDelegateImpl.f62353OoooOoO != null) {
                    View view2 = appCompatDelegateImpl.f62353OoooOoO;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            appCompatDelegateImpl.f62353OoooOoO.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    appCompatDelegateImpl.f62353OoooOoO = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    appCompatDelegateImpl.f62351OoooOOo.addView(appCompatDelegateImpl.f62353OoooOoO, -1, layoutParams);
                }
                View view4 = appCompatDelegateImpl.f62353OoooOoO;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = appCompatDelegateImpl.f62353OoooOoO;
                    view5.setBackgroundColor((ViewCompat.getWindowSystemUiVisibility(view5) & 8192) != 0 ? ContextCompat.getColor(context, R.color.abc_decor_view_status_guard_light) : ContextCompat.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!appCompatDelegateImpl.f62358OooooOO && z) {
                    systemWindowInsetTop2 = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                appCompatDelegateImpl.f62346OoooO0.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = appCompatDelegateImpl.f62353OoooOoO;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return ViewCompat.onApplyWindowInsets(view, systemWindowInsetTop != systemWindowInsetTop2 ? windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), systemWindowInsetTop2, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom()) : windowInsetsCompat);
    }
}
