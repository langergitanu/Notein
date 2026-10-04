package androidx.core.splashscreen;

import OooOoOO.C20519OooO0Oo;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import androidx.core.splashscreen.ThemeUtils;
import com.huawei.hms.network.embedded.C18361t4;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.time.Duration;
import java.time.Instant;
import kotlin.Metadata;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider;", "", "Landroid/app/Activity;", AbstractJwtRequest.ClaimNames.CTX, "<init>", "(Landroid/app/Activity;)V", "Landroid/window/SplashScreenView;", "platformView", "(Landroid/window/SplashScreenView;Landroid/app/Activity;)V", "LoO00ooO/OooOooO;", "remove", "()V", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "impl", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "getIconView", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "ViewImpl", "ViewImpl31", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class SplashScreenViewProvider {
    private final ViewImpl impl;

    @Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "", "Landroid/app/Activity;", C18361t4.f56218b, "<init>", "(Landroid/app/Activity;)V", "LoO00ooO/OooOooO;", "createSplashScreenView", "()V", "remove", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/view/ViewGroup;", "_splashScreenView$delegate", "LoO00ooO/OooOO0;", "get_splashScreenView", "()Landroid/view/ViewGroup;", "_splashScreenView", "getSplashScreenView", "splashScreenView", "Landroid/view/View;", "getIconView", "()Landroid/view/View;", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static class ViewImpl {

        /* JADX INFO: renamed from: _splashScreenView$delegate, reason: from kotlin metadata */
        private final InterfaceC32440OooOO0 _splashScreenView;
        private final Activity activity;

        public ViewImpl(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            this.activity = activity;
            this._splashScreenView = C20519OooO0Oo.OooO0OO(new SplashScreenViewProvider$ViewImpl$_splashScreenView$2(this));
        }

        private final ViewGroup get_splashScreenView() {
            return (ViewGroup) this._splashScreenView.getValue();
        }

        public void createSplashScreenView() {
            View rootView = ((ViewGroup) this.activity.findViewById(android.R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(get_splashScreenView());
            }
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public long getIconAnimationDurationMillis() {
            return 0L;
        }

        public long getIconAnimationStartMillis() {
            return 0L;
        }

        public View getIconView() {
            View viewFindViewById = getSplashScreenView().findViewById(C0038R.id.splashscreen_icon_view);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "splashScreenView.findVie…d.splashscreen_icon_view)");
            return viewFindViewById;
        }

        public ViewGroup getSplashScreenView() {
            return get_splashScreenView();
        }

        public void remove() {
            ViewParent parent = getSplashScreenView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(getSplashScreenView());
            }
        }
    }

    @Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "Landroid/app/Activity;", C18361t4.f56218b, "<init>", "(Landroid/app/Activity;)V", "LoO00ooO/OooOooO;", "createSplashScreenView", "()V", "remove", "Landroid/window/SplashScreenView;", "platformView", "Landroid/window/SplashScreenView;", "getPlatformView", "()Landroid/window/SplashScreenView;", "setPlatformView", "(Landroid/window/SplashScreenView;)V", "getSplashScreenView", "splashScreenView", "Landroid/view/View;", "getIconView", "()Landroid/view/View;", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class ViewImpl31 extends ViewImpl {
        public SplashScreenView platformView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewImpl31(Activity activity) {
            super(activity);
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void createSplashScreenView() {
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationDurationMillis() {
            Duration iconAnimationDuration = getPlatformView().getIconAnimationDuration();
            if (iconAnimationDuration != null) {
                return iconAnimationDuration.toMillis();
            }
            return 0L;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationStartMillis() {
            Instant iconAnimationStart = getPlatformView().getIconAnimationStart();
            if (iconAnimationStart != null) {
                return iconAnimationStart.toEpochMilli();
            }
            return 0L;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public View getIconView() {
            View iconView = getPlatformView().getIconView();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(iconView);
            return iconView;
        }

        public final SplashScreenView getPlatformView() {
            SplashScreenView splashScreenView = this.platformView;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("platformView");
            throw null;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void remove() {
            getPlatformView().remove();
            Resources.Theme theme = getActivity().getTheme();
            kotlin.jvm.internal.OooOOO0.OooO0o(theme, "activity.theme");
            View decorView = getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "activity.window.decorView");
            ThemeUtils.Api31.applyThemesSystemBarAppearance$default(theme, decorView, null, 4, null);
        }

        public final void setPlatformView(SplashScreenView splashScreenView) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(splashScreenView, "<set-?>");
            this.platformView = splashScreenView;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public SplashScreenView getSplashScreenView() {
            return getPlatformView();
        }
    }

    public SplashScreenViewProvider(Activity ctx) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ctx, "ctx");
        ViewImpl viewImpl31 = Build.VERSION.SDK_INT >= 31 ? new ViewImpl31(ctx) : new ViewImpl(ctx);
        viewImpl31.createSplashScreenView();
        this.impl = viewImpl31;
    }

    public final long getIconAnimationDurationMillis() {
        return this.impl.getIconAnimationDurationMillis();
    }

    public final long getIconAnimationStartMillis() {
        return this.impl.getIconAnimationStartMillis();
    }

    public final View getIconView() {
        return this.impl.getIconView();
    }

    public final View getView() {
        return this.impl.getSplashScreenView();
    }

    public final void remove() {
        this.impl.remove();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplashScreenViewProvider(SplashScreenView platformView, Activity ctx) {
        this(ctx);
        kotlin.jvm.internal.OooOOO0.OooO0oO(platformView, "platformView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(ctx, "ctx");
        ((ViewImpl31) this.impl).setPlatformView(platformView);
    }
}
