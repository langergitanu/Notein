package o0O0O0oo;

import Oooo0.OooOo00;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.core.view.GravityCompat;
import com.google.firebase.firestore.util.RunnableC22710OooO0Oo;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.widget.ParentFrameLayout;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOO0;
import o0O0O0oo.C25875OooO0O0;
import o0O0O0oo.C25877OooO0o0;
import o0O0OO0.InterfaceC25881OooO0o0;
import o0o000.OooO;
import o0ooO.EnumC31414OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0O0O0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25875OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f88292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final FloatConfig f88293OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public WindowManager f88294OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public WindowManager.LayoutParams f88295OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C25879OooO0oo f88296OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ParentFrameLayout f88297OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f88298OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f88299OooO0oo;

    /* JADX INFO: renamed from: o0O0O0oo.OooO0O0$OooO00o */
    public static final class OooO00o implements InterfaceC25881OooO0o0 {
        public OooO00o() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:132:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00cf A[PHI: r7
          0x00cf: PHI (r7v36 int) = (r7v4 int), (r7v5 int), (r7v8 int) binds: [B:49:0x00cd, B:59:0x00e3, B:55:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // o0O0OO0.InterfaceC25881OooO0o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o(MotionEvent motionEvent) {
            int i;
            int i2;
            int i3;
            int i4;
            int width;
            C25875OooO0O0 c25875OooO0O0 = C25875OooO0O0.this;
            C25879OooO0oo c25879OooO0oo = c25875OooO0O0.f88296OooO0o;
            if (c25879OooO0oo == null) {
                OooOOO0.OooOOOO("touchUtils");
                throw null;
            }
            final ParentFrameLayout parentFrameLayout = c25875OooO0O0.f88297OooO0o0;
            OooOOO0.OooO0Oo(parentFrameLayout);
            final WindowManager windowManagerOooO0Oo = c25875OooO0O0.OooO0Oo();
            final WindowManager.LayoutParams layoutParamsOooO0OO = c25875OooO0O0.OooO0OO();
            FloatConfig floatConfig = c25879OooO0oo.f88317OooO0O0;
            floatConfig.getCallbacks();
            o0O0OO0.OooO00o floatCallbacks = floatConfig.getFloatCallbacks();
            if (floatCallbacks != null) {
                floatCallbacks.OooO00o();
            }
            final boolean z = false;
            width = 0;
            height = 0;
            height = 0;
            width = 0;
            int width2 = 0;
            int height = 0;
            z = false;
            z = false;
            z = false;
            z = false;
            z = false;
            if (!floatConfig.getDragEnable() || floatConfig.isAnim()) {
                floatConfig.setDrag(false);
                return;
            }
            int action = motionEvent.getAction() & 255;
            EnumC31414OooO00o enumC31414OooO00o = EnumC31414OooO00o.f112175OooOo0o;
            if (action == 0) {
                floatConfig.setDrag(false);
                c25879OooO0oo.f88324OooOO0 = motionEvent.getRawX();
                c25879OooO0oo.f88325OooOO0O = motionEvent.getRawY();
                Context context = c25879OooO0oo.f88316OooO00o;
                Object systemService = context.getSystemService("window");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
                c25879OooO0oo.f88321OooO0o0 = context.getResources().getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.widthPixels - OooOo00.OooOO0o(context);
                c25879OooO0oo.f88319OooO0Oo = floatConfig.getDisplayHeight().OooO00o(context);
                int[] iArr = c25879OooO0oo.f88331OooOOo;
                parentFrameLayout.getLocationOnScreen(iArr);
                c25879OooO0oo.f88333OooOOoo = iArr[1] > layoutParamsOooO0OO.y ? C25879OooO0oo.OooO00o(parentFrameLayout) : 0;
                c25879OooO0oo.f88334OooOo00 = (c25879OooO0oo.f88319OooO0Oo - parentFrameLayout.getHeight()) - c25879OooO0oo.f88333OooOOoo;
                c25879OooO0oo.f88320OooO0o = Math.max(0, floatConfig.getLeftBorder());
                c25879OooO0oo.f88323OooO0oo = Math.min(c25879OooO0oo.f88321OooO0o0, floatConfig.getRightBorder()) - parentFrameLayout.getWidth();
                c25879OooO0oo.f88322OooO0oO = floatConfig.getShowPattern() == enumC31414OooO00o ? floatConfig.getImmersionStatusBar() ? floatConfig.getTopBorder() : floatConfig.getTopBorder() + C25879OooO0oo.OooO00o(parentFrameLayout) : floatConfig.getImmersionStatusBar() ? floatConfig.getTopBorder() - C25879OooO0oo.OooO00o(parentFrameLayout) : floatConfig.getTopBorder();
                c25879OooO0oo.f88315OooO = floatConfig.getShowPattern() == enumC31414OooO00o ? floatConfig.getImmersionStatusBar() ? Math.min(c25879OooO0oo.f88334OooOo00, floatConfig.getBottomBorder() - parentFrameLayout.getHeight()) : Math.min(c25879OooO0oo.f88334OooOo00, (C25879OooO0oo.OooO00o(parentFrameLayout) + floatConfig.getBottomBorder()) - parentFrameLayout.getHeight()) : floatConfig.getImmersionStatusBar() ? Math.min(c25879OooO0oo.f88334OooOo00, (floatConfig.getBottomBorder() - C25879OooO0oo.OooO00o(parentFrameLayout)) - parentFrameLayout.getHeight()) : Math.min(c25879OooO0oo.f88334OooOo00, floatConfig.getBottomBorder() - parentFrameLayout.getHeight());
                return;
            }
            if (action != 1) {
                if (action == 2) {
                    if (motionEvent.getRawX() >= c25879OooO0oo.f88320OooO0o) {
                        if (motionEvent.getRawX() > parentFrameLayout.getWidth() + c25879OooO0oo.f88323OooO0oo || motionEvent.getRawY() < c25879OooO0oo.f88322OooO0oO) {
                            return;
                        }
                        if (motionEvent.getRawY() > parentFrameLayout.getHeight() + c25879OooO0oo.f88315OooO) {
                            return;
                        }
                        float rawX = motionEvent.getRawX() - c25879OooO0oo.f88324OooOO0;
                        float rawY = motionEvent.getRawY() - c25879OooO0oo.f88325OooOO0O;
                        if (!floatConfig.isDrag()) {
                            if ((rawY * rawY) + (rawX * rawX) < 81.0f) {
                                return;
                            }
                        }
                        floatConfig.setDrag(true);
                        int i5 = layoutParamsOooO0OO.x + ((int) rawX);
                        int iOooO00o = layoutParamsOooO0OO.y + ((int) rawY);
                        int i6 = c25879OooO0oo.f88320OooO0o;
                        if (i5 < i6 || i5 > (i6 = c25879OooO0oo.f88323OooO0oo)) {
                            i5 = i6;
                        }
                        if (floatConfig.getShowPattern() == enumC31414OooO00o && iOooO00o < C25879OooO0oo.OooO00o(parentFrameLayout) && !floatConfig.getImmersionStatusBar()) {
                            iOooO00o = C25879OooO0oo.OooO00o(parentFrameLayout);
                        }
                        int i7 = c25879OooO0oo.f88322OooO0oO;
                        if (iOooO00o >= i7) {
                            if (iOooO00o >= 0) {
                                i7 = c25879OooO0oo.f88315OooO;
                                if (iOooO00o > i7) {
                                }
                            } else if (floatConfig.getImmersionStatusBar()) {
                                i7 = -c25879OooO0oo.f88333OooOOoo;
                                if (iOooO00o < i7) {
                                    iOooO00o = i7;
                                }
                            } else {
                                iOooO00o = 0;
                            }
                        }
                        int iOrdinal = floatConfig.getSidePattern().ordinal();
                        Rect rect = c25879OooO0oo.f88318OooO0OO;
                        switch (iOrdinal) {
                            case 1:
                                break;
                            case 2:
                                i4 = c25879OooO0oo.f88321OooO0o0;
                                width = parentFrameLayout.getWidth();
                                width2 = i4 - width;
                                break;
                            case 3:
                                iOooO00o = height;
                                width2 = i5;
                                break;
                            case 4:
                                height = c25879OooO0oo.f88334OooOo00;
                                iOooO00o = height;
                                width2 = i5;
                                break;
                            case 5:
                                float rawX2 = motionEvent.getRawX() * 2;
                                int i8 = c25879OooO0oo.f88321OooO0o0;
                                if (rawX2 > i8) {
                                    width2 = i8 - parentFrameLayout.getWidth();
                                }
                                break;
                            case 6:
                                float rawY2 = (motionEvent.getRawY() - rect.top) * 2;
                                int i9 = c25879OooO0oo.f88319OooO0Oo;
                                if (rawY2 > i9) {
                                    height = i9 - parentFrameLayout.getHeight();
                                }
                                iOooO00o = height;
                                width2 = i5;
                                break;
                            case 7:
                                c25879OooO0oo.f88326OooOO0o = (int) motionEvent.getRawX();
                                c25879OooO0oo.f88328OooOOO0 = c25879OooO0oo.f88321OooO0o0 - ((int) motionEvent.getRawX());
                                int rawY3 = (int) motionEvent.getRawY();
                                int i10 = rect.top;
                                c25879OooO0oo.f88327OooOOO = rawY3 - i10;
                                c25879OooO0oo.f88329OooOOOO = (c25879OooO0oo.f88319OooO0Oo + i10) - ((int) motionEvent.getRawY());
                                c25879OooO0oo.f88330OooOOOo = Math.min(c25879OooO0oo.f88326OooOO0o, c25879OooO0oo.f88328OooOOO0);
                                int iMin = Math.min(c25879OooO0oo.f88327OooOOO, c25879OooO0oo.f88329OooOOOO);
                                c25879OooO0oo.f88332OooOOo0 = iMin;
                                int i11 = c25879OooO0oo.f88330OooOOOo;
                                if (i11 >= iMin) {
                                    if (c25879OooO0oo.f88327OooOOO != iMin) {
                                        height = c25879OooO0oo.f88334OooOo00;
                                    }
                                    iOooO00o = height;
                                    width2 = i5;
                                } else if (c25879OooO0oo.f88326OooOO0o != i11) {
                                    i4 = c25879OooO0oo.f88321OooO0o0;
                                    width = parentFrameLayout.getWidth();
                                    width2 = i4 - width;
                                }
                                break;
                            default:
                                width2 = i5;
                                break;
                        }
                        layoutParamsOooO0OO.x = width2;
                        layoutParamsOooO0OO.y = iOooO00o;
                        windowManagerOooO0Oo.updateViewLayout(parentFrameLayout, layoutParamsOooO0OO);
                        floatConfig.getCallbacks();
                        o0O0OO0.OooO00o floatCallbacks2 = floatConfig.getFloatCallbacks();
                        if (floatCallbacks2 != null) {
                            floatCallbacks2.OooO00o();
                        }
                        c25879OooO0oo.f88324OooOO0 = motionEvent.getRawX();
                        c25879OooO0oo.f88325OooOO0O = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                if (action != 3) {
                    return;
                }
            }
            if (floatConfig.isDrag()) {
                floatConfig.getCallbacks();
                o0O0OO0.OooO00o floatCallbacks3 = floatConfig.getFloatCallbacks();
                if (floatCallbacks3 != null) {
                    floatCallbacks3.OooO00o();
                }
                switch (floatConfig.getSidePattern().ordinal()) {
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        int i12 = layoutParamsOooO0OO.x;
                        int i13 = i12 - c25879OooO0oo.f88320OooO0o;
                        c25879OooO0oo.f88326OooOO0o = i13;
                        int i14 = c25879OooO0oo.f88323OooO0oo - i12;
                        c25879OooO0oo.f88328OooOOO0 = i14;
                        int i15 = layoutParamsOooO0OO.y;
                        c25879OooO0oo.f88327OooOOO = i15 - c25879OooO0oo.f88322OooO0oO;
                        c25879OooO0oo.f88329OooOOOO = c25879OooO0oo.f88315OooO - i15;
                        c25879OooO0oo.f88330OooOOOo = Math.min(i13, i14);
                        c25879OooO0oo.f88332OooOOo0 = Math.min(c25879OooO0oo.f88327OooOOO, c25879OooO0oo.f88329OooOOOO);
                        switch (floatConfig.getSidePattern().ordinal()) {
                            case 8:
                                i = c25879OooO0oo.f88320OooO0o;
                                z = true;
                                final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                        OooOOO0.OooO0oO(params, "$params");
                                        WindowManager windowManager = windowManagerOooO0Oo;
                                        OooOOO0.OooO0oO(windowManager, "$windowManager");
                                        View view = parentFrameLayout;
                                        OooOOO0.OooO0oO(view, "$view");
                                        try {
                                            if (z) {
                                                Object animatedValue = valueAnimator.getAnimatedValue();
                                                if (animatedValue == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.x = ((Integer) animatedValue).intValue();
                                            } else {
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.y = ((Integer) animatedValue2).intValue();
                                            }
                                            windowManager.updateViewLayout(view, params);
                                        } catch (Exception unused) {
                                            valueAnimatorOfInt.cancel();
                                        }
                                    }
                                });
                                valueAnimatorOfInt.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                valueAnimatorOfInt.start();
                                return;
                            case 9:
                                i2 = layoutParamsOooO0OO.x;
                                i3 = c25879OooO0oo.f88328OooOOO0;
                                i = i2 + i3;
                                z = true;
                                final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                        OooOOO0.OooO0oO(params, "$params");
                                        WindowManager windowManager = windowManagerOooO0Oo;
                                        OooOOO0.OooO0oO(windowManager, "$windowManager");
                                        View view = parentFrameLayout;
                                        OooOOO0.OooO0oO(view, "$view");
                                        try {
                                            if (z) {
                                                Object animatedValue = valueAnimator.getAnimatedValue();
                                                if (animatedValue == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.x = ((Integer) animatedValue).intValue();
                                            } else {
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.y = ((Integer) animatedValue2).intValue();
                                            }
                                            windowManager.updateViewLayout(view, params);
                                        } catch (Exception unused) {
                                            valueAnimatorOfInt2.cancel();
                                        }
                                    }
                                });
                                valueAnimatorOfInt2.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                valueAnimatorOfInt2.start();
                                return;
                            case 10:
                                i = c25879OooO0oo.f88322OooO0oO;
                                final ValueAnimator valueAnimatorOfInt22 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                valueAnimatorOfInt22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                        OooOOO0.OooO0oO(params, "$params");
                                        WindowManager windowManager = windowManagerOooO0Oo;
                                        OooOOO0.OooO0oO(windowManager, "$windowManager");
                                        View view = parentFrameLayout;
                                        OooOOO0.OooO0oO(view, "$view");
                                        try {
                                            if (z) {
                                                Object animatedValue = valueAnimator.getAnimatedValue();
                                                if (animatedValue == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.x = ((Integer) animatedValue).intValue();
                                            } else {
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.y = ((Integer) animatedValue2).intValue();
                                            }
                                            windowManager.updateViewLayout(view, params);
                                        } catch (Exception unused) {
                                            valueAnimatorOfInt22.cancel();
                                        }
                                    }
                                });
                                valueAnimatorOfInt22.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                valueAnimatorOfInt22.start();
                                return;
                            case 11:
                                i = c25879OooO0oo.f88315OooO;
                                final ValueAnimator valueAnimatorOfInt222 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                valueAnimatorOfInt222.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                        OooOOO0.OooO0oO(params, "$params");
                                        WindowManager windowManager = windowManagerOooO0Oo;
                                        OooOOO0.OooO0oO(windowManager, "$windowManager");
                                        View view = parentFrameLayout;
                                        OooOOO0.OooO0oO(view, "$view");
                                        try {
                                            if (z) {
                                                Object animatedValue = valueAnimator.getAnimatedValue();
                                                if (animatedValue == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.x = ((Integer) animatedValue).intValue();
                                            } else {
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.y = ((Integer) animatedValue2).intValue();
                                            }
                                            windowManager.updateViewLayout(view, params);
                                        } catch (Exception unused) {
                                            valueAnimatorOfInt222.cancel();
                                        }
                                    }
                                });
                                valueAnimatorOfInt222.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                valueAnimatorOfInt222.start();
                                return;
                            case 12:
                                int i16 = c25879OooO0oo.f88326OooOO0o;
                                i3 = c25879OooO0oo.f88328OooOOO0;
                                if (i16 < i3) {
                                    i = c25879OooO0oo.f88320OooO0o;
                                    z = true;
                                    final ValueAnimator valueAnimatorOfInt2222 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                    valueAnimatorOfInt2222.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                            OooOOO0.OooO0oO(params, "$params");
                                            WindowManager windowManager = windowManagerOooO0Oo;
                                            OooOOO0.OooO0oO(windowManager, "$windowManager");
                                            View view = parentFrameLayout;
                                            OooOOO0.OooO0oO(view, "$view");
                                            try {
                                                if (z) {
                                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                                    if (animatedValue == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                    }
                                                    params.x = ((Integer) animatedValue).intValue();
                                                } else {
                                                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                    if (animatedValue2 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                    }
                                                    params.y = ((Integer) animatedValue2).intValue();
                                                }
                                                windowManager.updateViewLayout(view, params);
                                            } catch (Exception unused) {
                                                valueAnimatorOfInt2222.cancel();
                                            }
                                        }
                                    });
                                    valueAnimatorOfInt2222.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                    valueAnimatorOfInt2222.start();
                                    return;
                                }
                                i2 = layoutParamsOooO0OO.x;
                                i = i2 + i3;
                                z = true;
                                final ValueAnimator valueAnimatorOfInt22222 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                valueAnimatorOfInt22222.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                        OooOOO0.OooO0oO(params, "$params");
                                        WindowManager windowManager = windowManagerOooO0Oo;
                                        OooOOO0.OooO0oO(windowManager, "$windowManager");
                                        View view = parentFrameLayout;
                                        OooOOO0.OooO0oO(view, "$view");
                                        try {
                                            if (z) {
                                                Object animatedValue = valueAnimator.getAnimatedValue();
                                                if (animatedValue == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.x = ((Integer) animatedValue).intValue();
                                            } else {
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.y = ((Integer) animatedValue2).intValue();
                                            }
                                            windowManager.updateViewLayout(view, params);
                                        } catch (Exception unused) {
                                            valueAnimatorOfInt22222.cancel();
                                        }
                                    }
                                });
                                valueAnimatorOfInt22222.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                valueAnimatorOfInt22222.start();
                                return;
                            case 13:
                                i = c25879OooO0oo.f88327OooOOO < c25879OooO0oo.f88329OooOOOO ? c25879OooO0oo.f88322OooO0oO : c25879OooO0oo.f88315OooO;
                                final ValueAnimator valueAnimatorOfInt222222 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                valueAnimatorOfInt222222.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                        OooOOO0.OooO0oO(params, "$params");
                                        WindowManager windowManager = windowManagerOooO0Oo;
                                        OooOOO0.OooO0oO(windowManager, "$windowManager");
                                        View view = parentFrameLayout;
                                        OooOOO0.OooO0oO(view, "$view");
                                        try {
                                            if (z) {
                                                Object animatedValue = valueAnimator.getAnimatedValue();
                                                if (animatedValue == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.x = ((Integer) animatedValue).intValue();
                                            } else {
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.y = ((Integer) animatedValue2).intValue();
                                            }
                                            windowManager.updateViewLayout(view, params);
                                        } catch (Exception unused) {
                                            valueAnimatorOfInt222222.cancel();
                                        }
                                    }
                                });
                                valueAnimatorOfInt222222.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                valueAnimatorOfInt222222.start();
                                return;
                            case 14:
                                if (c25879OooO0oo.f88330OooOOOo >= c25879OooO0oo.f88332OooOOo0) {
                                    i = c25879OooO0oo.f88327OooOOO < c25879OooO0oo.f88329OooOOOO ? c25879OooO0oo.f88322OooO0oO : c25879OooO0oo.f88315OooO;
                                    final ValueAnimator valueAnimatorOfInt2222222 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                    valueAnimatorOfInt2222222.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                            OooOOO0.OooO0oO(params, "$params");
                                            WindowManager windowManager = windowManagerOooO0Oo;
                                            OooOOO0.OooO0oO(windowManager, "$windowManager");
                                            View view = parentFrameLayout;
                                            OooOOO0.OooO0oO(view, "$view");
                                            try {
                                                if (z) {
                                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                                    if (animatedValue == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                    }
                                                    params.x = ((Integer) animatedValue).intValue();
                                                } else {
                                                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                    if (animatedValue2 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                    }
                                                    params.y = ((Integer) animatedValue2).intValue();
                                                }
                                                windowManager.updateViewLayout(view, params);
                                            } catch (Exception unused) {
                                                valueAnimatorOfInt2222222.cancel();
                                            }
                                        }
                                    });
                                    valueAnimatorOfInt2222222.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                    valueAnimatorOfInt2222222.start();
                                    return;
                                }
                                int i17 = c25879OooO0oo.f88326OooOO0o;
                                i3 = c25879OooO0oo.f88328OooOOO0;
                                if (i17 < i3) {
                                    i = c25879OooO0oo.f88320OooO0o;
                                    z = true;
                                    final ValueAnimator valueAnimatorOfInt22222222 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                    valueAnimatorOfInt22222222.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                            WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                            OooOOO0.OooO0oO(params, "$params");
                                            WindowManager windowManager = windowManagerOooO0Oo;
                                            OooOOO0.OooO0oO(windowManager, "$windowManager");
                                            View view = parentFrameLayout;
                                            OooOOO0.OooO0oO(view, "$view");
                                            try {
                                                if (z) {
                                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                                    if (animatedValue == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                    }
                                                    params.x = ((Integer) animatedValue).intValue();
                                                } else {
                                                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                    if (animatedValue2 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                    }
                                                    params.y = ((Integer) animatedValue2).intValue();
                                                }
                                                windowManager.updateViewLayout(view, params);
                                            } catch (Exception unused) {
                                                valueAnimatorOfInt22222222.cancel();
                                            }
                                        }
                                    });
                                    valueAnimatorOfInt22222222.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                    valueAnimatorOfInt22222222.start();
                                    return;
                                }
                                i2 = layoutParamsOooO0OO.x;
                                i = i2 + i3;
                                z = true;
                                final ValueAnimator valueAnimatorOfInt222222222 = ValueAnimator.ofInt(!z ? layoutParamsOooO0OO.x : layoutParamsOooO0OO.y, i);
                                valueAnimatorOfInt222222222.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oo.OooO0o
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        WindowManager.LayoutParams params = layoutParamsOooO0OO;
                                        OooOOO0.OooO0oO(params, "$params");
                                        WindowManager windowManager = windowManagerOooO0Oo;
                                        OooOOO0.OooO0oO(windowManager, "$windowManager");
                                        View view = parentFrameLayout;
                                        OooOOO0.OooO0oO(view, "$view");
                                        try {
                                            if (z) {
                                                Object animatedValue = valueAnimator.getAnimatedValue();
                                                if (animatedValue == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.x = ((Integer) animatedValue).intValue();
                                            } else {
                                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                                if (animatedValue2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                                }
                                                params.y = ((Integer) animatedValue2).intValue();
                                            }
                                            windowManager.updateViewLayout(view, params);
                                        } catch (Exception unused) {
                                            valueAnimatorOfInt222222222.cancel();
                                        }
                                    }
                                });
                                valueAnimatorOfInt222222222.addListener(new C25878OooO0oO(c25879OooO0oo, parentFrameLayout));
                                valueAnimatorOfInt222222222.start();
                                return;
                            default:
                                return;
                        }
                    default:
                        floatConfig.getCallbacks();
                        o0O0OO0.OooO00o floatCallbacks4 = floatConfig.getFloatCallbacks();
                        if (floatCallbacks4 == null) {
                            return;
                        }
                        floatCallbacks4.OooO00o();
                        return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o0O0O0oo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19726OooO0O0 implements ParentFrameLayout.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ View f88302OooO0O0;

        public C19726OooO0O0(View view) {
            this.f88302OooO0O0 = view;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
        @Override // com.lzf.easyfloat.widget.ParentFrameLayout.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o() {
            ParentFrameLayout parentFrameLayout;
            OooO oooO;
            C25875OooO0O0 c25875OooO0O0 = C25875OooO0O0.this;
            ParentFrameLayout parentFrameLayout2 = c25875OooO0O0.f88297OooO0o0;
            FloatConfig floatConfig = c25875OooO0O0.f88293OooO0O0;
            if (OooOOO0.OooO0O0(floatConfig.getLocationPair(), new C32443OooOOO(0, 0)) && parentFrameLayout2 != null) {
                Rect rect = new Rect();
                c25875OooO0O0.OooO0Oo().getDefaultDisplay().getRectSize(rect);
                int[] iArr = new int[2];
                parentFrameLayout2.getLocationOnScreen(iArr);
                if (iArr[1] > c25875OooO0O0.OooO0OO().y) {
                    Context applicationContext = parentFrameLayout2.getContext().getApplicationContext();
                    OooOOO0.OooO0o(applicationContext, "view.context.applicationContext");
                    Resources resources = applicationContext.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", TelemetryEventStrings.C18741Os.OS_NAME);
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int iOooO00o = floatConfig.getDisplayHeight().OooO00o(c25875OooO0O0.f88292OooO00o) - dimensionPixelSize;
                    switch (floatConfig.getGravity()) {
                        case 1:
                        case 49:
                            c25875OooO0O0.OooO0OO().x = (rect.right - parentFrameLayout2.getWidth()) >> 1;
                            break;
                        case 5:
                        case 53:
                        case GravityCompat.END /* 8388613 */:
                        case 8388661:
                            c25875OooO0O0.OooO0OO().x = rect.right - parentFrameLayout2.getWidth();
                            break;
                        case 16:
                        case 19:
                        case 8388627:
                            c25875OooO0O0.OooO0OO().y = (iOooO00o - parentFrameLayout2.getHeight()) >> 1;
                            break;
                        case 17:
                            c25875OooO0O0.OooO0OO().x = (rect.right - parentFrameLayout2.getWidth()) >> 1;
                            c25875OooO0O0.OooO0OO().y = (iOooO00o - parentFrameLayout2.getHeight()) >> 1;
                            break;
                        case 21:
                        case 8388629:
                            c25875OooO0O0.OooO0OO().x = rect.right - parentFrameLayout2.getWidth();
                            c25875OooO0O0.OooO0OO().y = (iOooO00o - parentFrameLayout2.getHeight()) >> 1;
                            break;
                        case 80:
                        case 83:
                        case 8388691:
                            c25875OooO0O0.OooO0OO().y = iOooO00o - parentFrameLayout2.getHeight();
                            break;
                        case 81:
                            c25875OooO0O0.OooO0OO().x = (rect.right - parentFrameLayout2.getWidth()) >> 1;
                            c25875OooO0O0.OooO0OO().y = iOooO00o - parentFrameLayout2.getHeight();
                            break;
                        case 85:
                        case 8388693:
                            c25875OooO0O0.OooO0OO().x = rect.right - parentFrameLayout2.getWidth();
                            c25875OooO0O0.OooO0OO().y = iOooO00o - parentFrameLayout2.getHeight();
                            break;
                    }
                    WindowManager.LayoutParams layoutParamsOooO0OO = c25875OooO0O0.OooO0OO();
                    layoutParamsOooO0OO.x = floatConfig.getOffsetPair().f116638OooOo0o.intValue() + layoutParamsOooO0OO.x;
                    WindowManager.LayoutParams layoutParamsOooO0OO2 = c25875OooO0O0.OooO0OO();
                    layoutParamsOooO0OO2.y = floatConfig.getOffsetPair().f116637OooOo.intValue() + layoutParamsOooO0OO2.y;
                    boolean immersionStatusBar = floatConfig.getImmersionStatusBar();
                    EnumC31414OooO00o enumC31414OooO00o = EnumC31414OooO00o.f112175OooOo0o;
                    if (immersionStatusBar) {
                        if (floatConfig.getShowPattern() != enumC31414OooO00o) {
                            c25875OooO0O0.OooO0OO().y -= dimensionPixelSize;
                        }
                    } else if (floatConfig.getShowPattern() == enumC31414OooO00o) {
                        c25875OooO0O0.OooO0OO().y += dimensionPixelSize;
                    }
                    c25875OooO0O0.OooO0Oo().updateViewLayout(parentFrameLayout2, c25875OooO0O0.OooO0OO());
                }
            }
            ParentFrameLayout parentFrameLayout3 = c25875OooO0O0.f88297OooO0o0;
            c25875OooO0O0.f88298OooO0oO = parentFrameLayout3 == null ? -1 : parentFrameLayout3.getMeasuredWidth();
            ParentFrameLayout parentFrameLayout4 = c25875OooO0O0.f88297OooO0o0;
            c25875OooO0O0.f88299OooO0oo = parentFrameLayout4 != null ? parentFrameLayout4.getMeasuredHeight() : -1;
            FloatConfig floatConfig2 = c25875OooO0O0.f88293OooO0O0;
            boolean filterSelf$easyfloat_release = floatConfig2.getFilterSelf$easyfloat_release();
            View view = this.f88302OooO0O0;
            if (filterSelf$easyfloat_release || ((floatConfig2.getShowPattern() == EnumC31414OooO00o.f112177OooOoO0 && OooO.OooO00o.f58142OooO00o > 0) || (floatConfig2.getShowPattern() == EnumC31414OooO00o.f112174OooOo && OooO.OooO00o.f58142OooO00o <= 0))) {
                c25875OooO0O0.OooO0o(8, true);
                if (c25875OooO0O0.f88293OooO0O0.getHasEditText() && (parentFrameLayout = c25875OooO0O0.f88297OooO0o0) != null) {
                    c25875OooO0O0.OooO0oO(parentFrameLayout);
                }
            } else if (c25875OooO0O0.f88297OooO0o0 != null) {
                FloatConfig floatConfig3 = c25875OooO0O0.f88293OooO0O0;
                if (!floatConfig3.isAnim()) {
                    ParentFrameLayout parentFrameLayout5 = c25875OooO0O0.f88297OooO0o0;
                    OooOOO0.OooO0Oo(parentFrameLayout5);
                    WindowManager.LayoutParams layoutParamsOooO0OO3 = c25875OooO0O0.OooO0OO();
                    WindowManager windowManagerOooO0Oo = c25875OooO0O0.OooO0Oo();
                    o0O0OO0.OooO0OO floatAnimator = floatConfig3.getFloatAnimator();
                    ValueAnimator valueAnimatorOooO00o = floatAnimator == null ? null : floatAnimator.OooO00o(parentFrameLayout5, layoutParamsOooO0OO3, windowManagerOooO0Oo, floatConfig3.getSidePattern());
                    if (valueAnimatorOooO00o == null) {
                        valueAnimatorOooO00o = null;
                    } else {
                        c25875OooO0O0.OooO0OO().flags = 552;
                        valueAnimatorOooO00o.addListener(new OooO0OO(c25875OooO0O0, view));
                        valueAnimatorOooO00o.start();
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    if (valueAnimatorOooO00o == null) {
                        view.setVisibility(0);
                        c25875OooO0O0.OooO0Oo().updateViewLayout(c25875OooO0O0.f88297OooO0o0, c25875OooO0O0.OooO0OO());
                    }
                }
            }
            floatConfig2.setLayoutView(view);
            floatConfig2.getInvokeView();
            floatConfig2.getCallbacks();
            o0O0OO0.OooO00o floatCallbacks = floatConfig2.getFloatCallbacks();
            if (floatCallbacks == null || (oooO = floatCallbacks.OooO00o().f88336OooO00o) == null) {
                return;
            }
            oooO.invoke(Boolean.TRUE, null, view);
        }
    }

    public C25875OooO0O0(Context context, FloatConfig config) {
        OooOOO0.OooO0oO(config, "config");
        this.f88292OooO00o = context;
        this.f88293OooO0O0 = config;
        this.f88298OooO0oO = -1;
        this.f88299OooO0oo = -1;
    }

    public final void OooO00o() {
        ViewTreeObserver viewTreeObserver;
        Context context = this.f88292OooO00o;
        ParentFrameLayout parentFrameLayout = new ParentFrameLayout(context, this.f88293OooO0O0);
        this.f88297OooO0o0 = parentFrameLayout;
        FloatConfig floatConfig = this.f88293OooO0O0;
        parentFrameLayout.setTag(floatConfig.getFloatTag());
        View layoutView = floatConfig.getLayoutView();
        if (layoutView == null) {
            layoutView = null;
        } else {
            ParentFrameLayout parentFrameLayout2 = this.f88297OooO0o0;
            if (parentFrameLayout2 != null) {
                parentFrameLayout2.addView(layoutView);
            }
        }
        if (layoutView == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            Integer layoutId = floatConfig.getLayoutId();
            OooOOO0.OooO0Oo(layoutId);
            layoutView = layoutInflaterFrom.inflate(layoutId.intValue(), (ViewGroup) this.f88297OooO0o0, true);
        }
        layoutView.setVisibility(4);
        OooO0Oo().addView(this.f88297OooO0o0, OooO0OO());
        ParentFrameLayout parentFrameLayout3 = this.f88297OooO0o0;
        if (parentFrameLayout3 != null) {
            parentFrameLayout3.setTouchListener(new OooO00o());
        }
        ParentFrameLayout parentFrameLayout4 = this.f88297OooO0o0;
        if (parentFrameLayout4 != null) {
            parentFrameLayout4.setLayoutListener(new C19726OooO0O0(layoutView));
        }
        final ParentFrameLayout parentFrameLayout5 = this.f88297OooO0o0;
        if (parentFrameLayout5 == null || (viewTreeObserver = parentFrameLayout5.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o0O0O0oo.OooO00o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C25875OooO0O0 this$0 = this.f88291OooOo0o;
                OooOOO0.OooO0oO(this$0, "this$0");
                ParentFrameLayout this_apply = parentFrameLayout5;
                OooOOO0.OooO0oO(this_apply, "$this_apply");
                int i = this$0.f88298OooO0oO;
                boolean z = false;
                boolean z2 = i == -1 || this$0.f88299OooO0oo == -1;
                if (i == this_apply.getMeasuredWidth() && this$0.f88299OooO0oo == this_apply.getMeasuredHeight()) {
                    z = true;
                }
                if (z2 || z) {
                    return;
                }
                FloatConfig floatConfig2 = this$0.f88293OooO0O0;
                if ((floatConfig2.getLayoutChangedGravity() & GravityCompat.START) != 8388611) {
                    if ((floatConfig2.getLayoutChangedGravity() & GravityCompat.END) == 8388613) {
                        this$0.OooO0OO().x -= this_apply.getMeasuredWidth() - this$0.f88298OooO0oO;
                    } else if ((floatConfig2.getLayoutChangedGravity() & 1) == 1 || (floatConfig2.getLayoutChangedGravity() & 17) == 17) {
                        this$0.OooO0OO().x += (this$0.f88298OooO0oO / 2) - (this_apply.getMeasuredWidth() / 2);
                    }
                }
                if ((floatConfig2.getLayoutChangedGravity() & 48) != 48) {
                    if ((floatConfig2.getLayoutChangedGravity() & 80) == 80) {
                        this$0.OooO0OO().y -= this_apply.getMeasuredHeight() - this$0.f88299OooO0oo;
                    } else if ((floatConfig2.getLayoutChangedGravity() & 16) == 16 || (floatConfig2.getLayoutChangedGravity() & 17) == 17) {
                        this$0.OooO0OO().y += (this$0.f88299OooO0oo / 2) - (this_apply.getMeasuredHeight() / 2);
                    }
                }
                this$0.f88298OooO0oO = this_apply.getMeasuredWidth();
                this$0.f88299OooO0oo = this_apply.getMeasuredHeight();
                this$0.OooO0Oo().updateViewLayout(this$0.f88297OooO0o0, this$0.OooO0OO());
            }
        });
    }

    public final boolean OooO0O0() {
        OooO oooO;
        FloatConfig floatConfig = this.f88293OooO0O0;
        try {
            this.f88296OooO0o = new C25879OooO0oo(this.f88292OooO00o, floatConfig);
            OooO0o0();
            OooO00o();
            floatConfig.setShow(true);
            return true;
        } catch (Exception e) {
            floatConfig.getCallbacks();
            o0O0OO0.OooO00o floatCallbacks = floatConfig.getFloatCallbacks();
            if (floatCallbacks == null || (oooO = floatCallbacks.OooO00o().f88336OooO00o) == null) {
                return false;
            }
            oooO.invoke(Boolean.FALSE, String.valueOf(e), null);
            return false;
        }
    }

    public final WindowManager.LayoutParams OooO0OO() {
        WindowManager.LayoutParams layoutParams = this.f88295OooO0Oo;
        if (layoutParams != null) {
            return layoutParams;
        }
        OooOOO0.OooOOOO("params");
        throw null;
    }

    public final WindowManager OooO0Oo() {
        WindowManager windowManager = this.f88294OooO0OO;
        if (windowManager != null) {
            return windowManager;
        }
        OooOOO0.OooOOOO("windowManager");
        throw null;
    }

    public final void OooO0o(int i, boolean z) {
        ParentFrameLayout parentFrameLayout = this.f88297OooO0o0;
        if (parentFrameLayout != null) {
            OooOOO0.OooO0Oo(parentFrameLayout);
            if (parentFrameLayout.getChildCount() < 1) {
                return;
            }
            FloatConfig floatConfig = this.f88293OooO0O0;
            floatConfig.setNeedShow$easyfloat_release(z);
            ParentFrameLayout parentFrameLayout2 = this.f88297OooO0o0;
            OooOOO0.OooO0Oo(parentFrameLayout2);
            parentFrameLayout2.setVisibility(i);
            ParentFrameLayout parentFrameLayout3 = this.f88297OooO0o0;
            OooOOO0.OooO0Oo(parentFrameLayout3);
            parentFrameLayout3.getChildAt(0);
            if (i == 0) {
                floatConfig.setShow(true);
                floatConfig.getCallbacks();
                o0O0OO0.OooO00o floatCallbacks = floatConfig.getFloatCallbacks();
                if (floatCallbacks == null) {
                    return;
                }
                floatCallbacks.OooO00o();
                return;
            }
            floatConfig.setShow(false);
            floatConfig.getCallbacks();
            o0O0OO0.OooO00o floatCallbacks2 = floatConfig.getFloatCallbacks();
            if (floatCallbacks2 == null) {
                return;
            }
            floatCallbacks2.OooO00o();
        }
    }

    public final void OooO0o0() {
        Activity activity;
        Window window;
        View decorView;
        Context context = this.f88292OooO00o;
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.f88294OooO0OO = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        FloatConfig floatConfig = this.f88293OooO0O0;
        if (floatConfig.getShowPattern() == EnumC31414OooO00o.f112175OooOo0o) {
            layoutParams.type = 1000;
            IBinder windowToken = null;
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                WeakReference weakReference = OooO.OooO00o.f58143OooO0O0;
                activity = weakReference == null ? null : (Activity) weakReference.get();
            }
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                windowToken = decorView.getWindowToken();
            }
            layoutParams.token = windowToken;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = floatConfig.getImmersionStatusBar() ? 552 : 40;
        layoutParams.width = floatConfig.getWidthMatch() ? -1 : -2;
        layoutParams.height = floatConfig.getHeightMatch() ? -1 : -2;
        if (floatConfig.getImmersionStatusBar() && floatConfig.getHeightMatch()) {
            Point point = new Point();
            Object systemService2 = context.getSystemService("window");
            if (systemService2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
            ((WindowManager) systemService2).getDefaultDisplay().getRealSize(point);
            layoutParams.height = point.y;
        }
        if (!OooOOO0.OooO0O0(floatConfig.getLocationPair(), new C32443OooOOO(0, 0))) {
            layoutParams.x = floatConfig.getLocationPair().f116638OooOo0o.intValue();
            layoutParams.y = floatConfig.getLocationPair().f116637OooOo.intValue();
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        this.f88295OooO0Oo = layoutParams;
    }

    public final void OooO0oO(View view) {
        if (view == null) {
            return;
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                final EditText editText = (EditText) view;
                final String floatTag = this.f88293OooO0O0.getFloatTag();
                editText.setOnTouchListener(new View.OnTouchListener() { // from class: o0O0OOO0.OooO0O0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        EditText editText2 = editText;
                        OooOOO0.OooO0oO(editText2, "$editText");
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap = C25877OooO0o0.f88312OooO00o;
                        C25875OooO0O0 c25875OooO0O0OooO0O0 = C25877OooO0o0.OooO0O0(floatTag);
                        if (c25875OooO0O0OooO0O0 != null) {
                            c25875OooO0O0OooO0O0.OooO0OO().flags = 32;
                            c25875OooO0O0OooO0O0.OooO0Oo().updateViewLayout(c25875OooO0O0OooO0O0.f88297OooO0o0, c25875OooO0O0OooO0O0.OooO0OO());
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC22710OooO0Oo(editText2, 1), 100L);
                        return false;
                    }
                });
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View child = viewGroup.getChildAt(i);
            if (child instanceof ViewGroup) {
                OooO0oO(child);
            } else {
                OooOOO0.OooO0o(child, "child");
                if (child instanceof EditText) {
                    final EditText editText2 = (EditText) child;
                    final String floatTag2 = this.f88293OooO0O0.getFloatTag();
                    editText2.setOnTouchListener(new View.OnTouchListener() { // from class: o0O0OOO0.OooO0O0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            EditText editText22 = editText2;
                            OooOOO0.OooO0oO(editText22, "$editText");
                            if (motionEvent.getAction() != 0) {
                                return false;
                            }
                            ConcurrentHashMap<String, C25875OooO0O0> concurrentHashMap = C25877OooO0o0.f88312OooO00o;
                            C25875OooO0O0 c25875OooO0O0OooO0O0 = C25877OooO0o0.OooO0O0(floatTag2);
                            if (c25875OooO0O0OooO0O0 != null) {
                                c25875OooO0O0OooO0O0.OooO0OO().flags = 32;
                                c25875OooO0O0OooO0O0.OooO0Oo().updateViewLayout(c25875OooO0O0OooO0O0.f88297OooO0o0, c25875OooO0O0OooO0O0.OooO0OO());
                            }
                            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC22710OooO0Oo(editText22, 1), 100L);
                            return false;
                        }
                    });
                }
            }
            if (i2 >= childCount) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
