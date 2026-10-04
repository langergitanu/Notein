package androidx.core.splashscreen;

import OooooOO.C21310OooOOOo;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.ThemeUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.hms.network.embedded.C18361t4;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreen;", "", "Landroid/app/Activity;", C18361t4.f56218b, "<init>", "(Landroid/app/Activity;)V", "LoO00ooO/OooOooO;", "install", "()V", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "condition", "setKeepOnScreenCondition", "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnExitAnimationListener", "(Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V", "Landroidx/core/splashscreen/SplashScreen$Impl;", "impl", "Landroidx/core/splashscreen/SplashScreen$Impl;", "Companion", "Impl", "Impl31", "KeepOnScreenCondition", "OnExitAnimationListener", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class SplashScreen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float MASK_FACTOR = 0.6666667f;
    private final Impl impl;

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreen$Companion;", "", "()V", "MASK_FACTOR", "", "installSplashScreen", "Landroidx/core/splashscreen/SplashScreen;", "Landroid/app/Activity;", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final SplashScreen installSplashScreen(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "<this>");
            SplashScreen splashScreen = new SplashScreen(activity, null);
            splashScreen.install();
            return splashScreen;
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u000fR\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010A\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0019R\u0018\u0010F\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl;", "", "Landroid/app/Activity;", C18361t4.f56218b, "<init>", "(Landroid/app/Activity;)V", "Landroid/view/View;", "splashScreenView", "Landroid/graphics/drawable/Drawable;", "icon", "LoO00ooO/OooOooO;", "displaySplashScreenIcon", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "install", "()V", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "currentTheme", "Landroid/util/TypedValue;", "typedValue", "setPostSplashScreenTheme", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "keepOnScreenCondition", "setKeepOnScreenCondition", "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "exitAnimationListener", "setOnExitAnimationListener", "(Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "splashScreenViewProvider", "dispatchOnExitAnimation", "(Landroidx/core/splashscreen/SplashScreenViewProvider;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "", "finalThemeId", "I", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "backgroundResId", "Ljava/lang/Integer;", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "hasBackground", "Z", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "splashScreenWaitPredicate", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "getSplashScreenWaitPredicate", "()Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setSplashScreenWaitPredicate", "animationListener", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "mSplashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static class Impl {
        private final Activity activity;
        private OnExitAnimationListener animationListener;
        private Integer backgroundColor;
        private Integer backgroundResId;
        private int finalThemeId;
        private boolean hasBackground;
        private Drawable icon;
        private SplashScreenViewProvider mSplashScreenViewProvider;
        private KeepOnScreenCondition splashScreenWaitPredicate;

        public Impl(Activity activity) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            this.activity = activity;
            this.splashScreenWaitPredicate = new OooO00o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: dispatchOnExitAnimation$lambda-3, reason: not valid java name */
        public static final void m80664dispatchOnExitAnimation$lambda3(SplashScreenViewProvider splashScreenViewProvider, OnExitAnimationListener finalListener) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(splashScreenViewProvider, "$splashScreenViewProvider");
            kotlin.jvm.internal.OooOOO0.OooO0oO(finalListener, "$finalListener");
            splashScreenViewProvider.getView().bringToFront();
            finalListener.onSplashScreenExit(splashScreenViewProvider);
        }

        private final void displaySplashScreenIcon(View splashScreenView, Drawable icon) {
            float dimension;
            ImageView imageView = (ImageView) splashScreenView.findViewById(C0038R.id.splashscreen_icon_view);
            if (this.hasBackground) {
                Drawable drawable = imageView.getContext().getDrawable(C0038R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(C0038R.dimen.splashscreen_icon_size_with_background) * SplashScreen.MASK_FACTOR;
                if (drawable != null) {
                    imageView.setBackground(new MaskedDrawable(drawable, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(C0038R.dimen.splashscreen_icon_size_no_background) * SplashScreen.MASK_FACTOR;
            }
            imageView.setImageDrawable(new MaskedDrawable(icon, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: splashScreenWaitPredicate$lambda-0, reason: not valid java name */
        public static final boolean m80665splashScreenWaitPredicate$lambda0() {
            return false;
        }

        public final void dispatchOnExitAnimation(final SplashScreenViewProvider splashScreenViewProvider) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(splashScreenViewProvider, "splashScreenViewProvider");
            final OnExitAnimationListener onExitAnimationListener = this.animationListener;
            if (onExitAnimationListener == null) {
                return;
            }
            this.animationListener = null;
            splashScreenViewProvider.getView().postOnAnimation(new Runnable() { // from class: androidx.core.splashscreen.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    SplashScreen.Impl.m80664dispatchOnExitAnimation$lambda3(splashScreenViewProvider, onExitAnimationListener);
                }
            });
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getBackgroundResId() {
            return this.backgroundResId;
        }

        public final int getFinalThemeId() {
            return this.finalThemeId;
        }

        public final boolean getHasBackground() {
            return this.hasBackground;
        }

        public final Drawable getIcon() {
            return this.icon;
        }

        public final KeepOnScreenCondition getSplashScreenWaitPredicate() {
            return this.splashScreenWaitPredicate;
        }

        public void install() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.activity.getTheme();
            if (theme.resolveAttribute(C0038R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.backgroundResId = Integer.valueOf(typedValue.resourceId);
                this.backgroundColor = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(C0038R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.icon = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(C0038R.attr.splashScreenIconSize, typedValue, true)) {
                this.hasBackground = typedValue.resourceId == C0038R.dimen.splashscreen_icon_size_with_background;
            }
            setPostSplashScreenTheme(theme, typedValue);
        }

        public final void setBackgroundColor(Integer num) {
            this.backgroundColor = num;
        }

        public final void setBackgroundResId(Integer num) {
            this.backgroundResId = num;
        }

        public final void setFinalThemeId(int i) {
            this.finalThemeId = i;
        }

        public final void setHasBackground(boolean z) {
            this.hasBackground = z;
        }

        public final void setIcon(Drawable drawable) {
            this.icon = drawable;
        }

        public void setKeepOnScreenCondition(KeepOnScreenCondition keepOnScreenCondition) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(keepOnScreenCondition, "keepOnScreenCondition");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
            final View viewFindViewById = this.activity.findViewById(android.R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (this.this$0.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    SplashScreenViewProvider splashScreenViewProvider = this.this$0.mSplashScreenViewProvider;
                    if (splashScreenViewProvider == null) {
                        return true;
                    }
                    this.this$0.dispatchOnExitAnimation(splashScreenViewProvider);
                    return true;
                }
            });
        }

        public void setOnExitAnimationListener(OnExitAnimationListener exitAnimationListener) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(exitAnimationListener, "exitAnimationListener");
            this.animationListener = exitAnimationListener;
            final SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(this.activity);
            Integer num = this.backgroundResId;
            Integer num2 = this.backgroundColor;
            View view = splashScreenViewProvider.getView();
            if (num != null && num.intValue() != 0) {
                view.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                view.setBackgroundColor(num2.intValue());
            } else {
                view.setBackground(this.activity.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.icon;
            if (drawable != null) {
                displaySplashScreenIcon(view, drawable);
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(view2, "view");
                    if (view2.isAttachedToWindow()) {
                        view2.removeOnLayoutChangeListener(this);
                        if (!this.this$0.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                            this.this$0.dispatchOnExitAnimation(splashScreenViewProvider);
                        } else {
                            this.this$0.mSplashScreenViewProvider = splashScreenViewProvider;
                        }
                    }
                }
            });
        }

        public final void setPostSplashScreenTheme(Resources.Theme currentTheme, TypedValue typedValue) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(currentTheme, "currentTheme");
            kotlin.jvm.internal.OooOOO0.OooO0oO(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(C0038R.attr.postSplashScreenTheme, typedValue, true)) {
                int i = typedValue.resourceId;
                this.finalThemeId = i;
                if (i != 0) {
                    this.activity.setTheme(i);
                }
            }
        }

        public final void setSplashScreenWaitPredicate(KeepOnScreenCondition keepOnScreenCondition) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(keepOnScreenCondition, "<set-?>");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
        }
    }

    @Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl31;", "Landroidx/core/splashscreen/SplashScreen$Impl;", "Landroid/app/Activity;", C18361t4.f56218b, "<init>", "(Landroid/app/Activity;)V", "LoO00ooO/OooOooO;", "applyAppSystemUiTheme", "()V", "Landroid/window/SplashScreenView;", "child", "", "computeDecorFitsWindow", "(Landroid/window/SplashScreenView;)Z", "install", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "keepOnScreenCondition", "setKeepOnScreenCondition", "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "exitAnimationListener", "setOnExitAnimationListener", "(Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;)V", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setPreDrawListener", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "mDecorFitWindowInsets", "Z", "getMDecorFitWindowInsets", "()Z", "setMDecorFitWindowInsets", "(Z)V", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "hierarchyListener", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Impl31 extends Impl {
        private final ViewGroup.OnHierarchyChangeListener hierarchyListener;
        private boolean mDecorFitWindowInsets;
        private ViewTreeObserver.OnPreDrawListener preDrawListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl31(final Activity activity) {
            super(activity);
            kotlin.jvm.internal.OooOOO0.OooO0oO(activity, "activity");
            this.mDecorFitWindowInsets = true;
            this.hierarchyListener = new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(View parent, View child) {
                    if (C21678OooO0oo.OooO00o(child)) {
                        SplashScreen.Impl31 impl31 = this.this$0;
                        impl31.setMDecorFitWindowInsets(impl31.computeDecorFitsWindow(OooO.OooO00o(child)));
                        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(View parent, View child) {
                }
            };
        }

        private final void applyAppSystemUiTheme() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = getActivity().getTheme();
            Window window = getActivity().getWindow();
            if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            if (theme.resolveAttribute(android.R.attr.enforceNavigationBarContrast, typedValue, true)) {
                window.setNavigationBarContrastEnforced(typedValue.data != 0);
            }
            if (theme.resolveAttribute(android.R.attr.enforceStatusBarContrast, typedValue, true)) {
                window.setStatusBarContrastEnforced(typedValue.data != 0);
            }
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            ThemeUtils.Api31.applyThemesSystemBarAppearance(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.mDecorFitWindowInsets);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: setOnExitAnimationListener$lambda-0, reason: not valid java name */
        public static final void m80666setOnExitAnimationListener$lambda0(Impl31 this$0, OnExitAnimationListener exitAnimationListener, SplashScreenView splashScreenView) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
            kotlin.jvm.internal.OooOOO0.OooO0oO(exitAnimationListener, "$exitAnimationListener");
            kotlin.jvm.internal.OooOOO0.OooO0oO(splashScreenView, "splashScreenView");
            this$0.applyAppSystemUiTheme();
            exitAnimationListener.onSplashScreenExit(new SplashScreenViewProvider(splashScreenView, this$0.getActivity()));
        }

        public final boolean computeDecorFitsWindow(SplashScreenView child) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(child, "child");
            WindowInsets windowInsetsBuild = C21310OooOOOo.OooO0OO().build();
            kotlin.jvm.internal.OooOOO0.OooO0o(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final ViewGroup.OnHierarchyChangeListener getHierarchyListener() {
            return this.hierarchyListener;
        }

        public final boolean getMDecorFitWindowInsets() {
            return this.mDecorFitWindowInsets;
        }

        public final ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
            return this.preDrawListener;
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void install() {
            Resources.Theme theme = getActivity().getTheme();
            kotlin.jvm.internal.OooOOO0.OooO0o(theme, "activity.theme");
            setPostSplashScreenTheme(theme, new TypedValue());
            ((ViewGroup) getActivity().getWindow().getDecorView()).setOnHierarchyChangeListener(this.hierarchyListener);
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setKeepOnScreenCondition(KeepOnScreenCondition keepOnScreenCondition) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(keepOnScreenCondition, "keepOnScreenCondition");
            setSplashScreenWaitPredicate(keepOnScreenCondition);
            final View viewFindViewById = getActivity().findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.preDrawListener != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
            }
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (this.this$0.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            };
            this.preDrawListener = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }

        public final void setMDecorFitWindowInsets(boolean z) {
            this.mDecorFitWindowInsets = z;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.core.splashscreen.OooO0oO] */
        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setOnExitAnimationListener(final OnExitAnimationListener exitAnimationListener) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(exitAnimationListener, "exitAnimationListener");
            getActivity().getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: androidx.core.splashscreen.OooO0oO
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    SplashScreen.Impl31.m80666setOnExitAnimationListener$lambda0(this.f64269OooO00o, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final void setPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.preDrawListener = onPreDrawListener;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "", "shouldKeepOnScreen", "", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface KeepOnScreenCondition {
        boolean shouldKeepOnScreen();
    }

    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "splashScreenViewProvider", "LoO00ooO/OooOooO;", "onSplashScreenExit", "(Landroidx/core/splashscreen/SplashScreenViewProvider;)V", "core-splashscreen_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface OnExitAnimationListener {
        void onSplashScreenExit(SplashScreenViewProvider splashScreenViewProvider);
    }

    public /* synthetic */ SplashScreen(Activity activity, C24018OooO0oo c24018OooO0oo) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void install() {
        this.impl.install();
    }

    public static final SplashScreen installSplashScreen(Activity activity) {
        return INSTANCE.installSplashScreen(activity);
    }

    public final void setKeepOnScreenCondition(KeepOnScreenCondition condition) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(condition, "condition");
        this.impl.setKeepOnScreenCondition(condition);
    }

    public final void setOnExitAnimationListener(OnExitAnimationListener listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.impl.setOnExitAnimationListener(listener);
    }

    private SplashScreen(Activity activity) {
        this.impl = Build.VERSION.SDK_INT >= 31 ? new Impl31(activity) : new Impl(activity);
    }
}
