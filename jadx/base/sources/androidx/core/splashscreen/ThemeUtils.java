package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m80612d2 = {"Landroidx/core/splashscreen/ThemeUtils;", "", "()V", "Api31", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ThemeUtils {
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Landroidx/core/splashscreen/ThemeUtils$Api31;", "", "<init>", "()V", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "Landroid/view/View;", "decor", "Landroid/util/TypedValue;", "tv", "LoO00ooO/OooOooO;", "applyThemesSystemBarAppearance", "(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Api31 {
        public static final Api31 INSTANCE = new Api31();

        private Api31() {
        }

        public static final void applyThemesSystemBarAppearance(Resources.Theme theme, View decor) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(theme, "theme");
            kotlin.jvm.internal.OooOOO0.OooO0oO(decor, "decor");
            applyThemesSystemBarAppearance$default(theme, decor, null, 4, null);
        }

        public static /* synthetic */ void applyThemesSystemBarAppearance$default(Resources.Theme theme, View view, TypedValue typedValue, int i, Object obj) {
            if ((i & 4) != 0) {
                typedValue = new TypedValue();
            }
            applyThemesSystemBarAppearance(theme, view, typedValue);
        }

        public static final void applyThemesSystemBarAppearance(Resources.Theme theme, View decor, TypedValue tv) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(theme, "theme");
            kotlin.jvm.internal.OooOOO0.OooO0oO(decor, "decor");
            kotlin.jvm.internal.OooOOO0.OooO0oO(tv, "tv");
            int i = (!theme.resolveAttribute(android.R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
                i |= 16;
            }
            WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i, 24);
        }
    }

    private ThemeUtils() {
    }
}
