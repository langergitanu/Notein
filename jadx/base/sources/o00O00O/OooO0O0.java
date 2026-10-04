package o00O00O;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import o0O0o0oo.C26085OooOOOO;
import o0O0o0oo.C26090OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f84088OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f84089OooOo0o;

    public OooO0O0(C26085OooOOOO c26085OooOOOO, C26090OooOo00 c26090OooOo00) {
        this.f84088OooOo = c26085OooOOOO;
        this.f84089OooOo0o = c26090OooOo00;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        if (windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
            return windowInsetsCompatOnApplyWindowInsets;
        }
        int systemWindowInsetLeft = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft();
        Rect rect = (Rect) this.f84089OooOo0o;
        rect.left = systemWindowInsetLeft;
        rect.top = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetTop();
        rect.right = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight();
        rect.bottom = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom();
        ViewPager viewPager = (ViewPager) this.f84088OooOo;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(viewPager.getChildAt(i), windowInsetsCompatOnApplyWindowInsets);
            rect.left = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
            rect.top = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
            rect.right = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
            rect.bottom = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
        }
        return windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
    }

    public OooO0O0(ViewPager viewPager) {
        this.f84088OooOo = viewPager;
        this.f84089OooOo0o = new Rect();
    }
}
