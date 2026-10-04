package com.facebook.soloader;

import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOOO0;
import o0OoOO00.C29024Oooo0o0;
import o0ooO.EnumC31415OooO0O0;
import oO00ooO.C32449OooOOoo;
import oO00ooOO.C32465OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public class OooOo implements o0O0OO0.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f67511OooO00o = 0;

    public static C32465OooO0O0 OooO0O0(List builder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        C32465OooO0O0 c32465OooO0O0 = (C32465OooO0O0) builder;
        c32465OooO0O0.OooO0oo();
        c32465OooO0O0.f116675OooOoO0 = true;
        return c32465OooO0O0.f116673OooOo > 0 ? c32465OooO0O0 : C32465OooO0O0.f116672OooOoO;
    }

    public static C22318OooOo0o OooO0OO(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        C22318OooOo0o c22318OooOo0o;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                Log.w("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
                OooOOO.OooO00o("SoLoader", "Corrupted lib name detected");
                c22318OooOo0o = new C22316OooOo0(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                c22318OooOo0o = new C22318OooOo0o(str, unsatisfiedLinkError.toString());
            }
        } else {
            OooOOO.OooO00o("SoLoader", "Corrupted lib file detected");
            c22318OooOo0o = new OooOo00(str, unsatisfiedLinkError.toString());
        }
        c22318OooOo0o.initCause(unsatisfiedLinkError);
        return c22318OooOo0o;
    }

    public static C32465OooO0O0 OooO0Oo() {
        return new C32465OooO0O0((Object) null);
    }

    public static int OooO0o(View view, WindowManager.LayoutParams layoutParams) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] != layoutParams.y) {
            return 0;
        }
        Context applicationContext = view.getContext().getApplicationContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(applicationContext, "view.context.applicationContext");
        Resources resources = applicationContext.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", TelemetryEventStrings.C18741Os.OS_NAME);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final Object OooO0o0(Context context, Class cls) {
        Application application;
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context baseContext = applicationContext;
            while (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                if (baseContext instanceof Application) {
                    application = (Application) baseContext;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
        }
        application = (Application) applicationContext;
        return C29024Oooo0o0.OooO00o(cls, application);
    }

    public static List OooO0oO(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.OooOOO0.OooO0o(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0038. Please report as an issue. */
    @Override // o0O0OO0.OooO0OO
    public ValueAnimator OooO00o(final View view, final WindowManager.LayoutParams layoutParams, final WindowManager windowManager, EnumC31415OooO0O0 sidePattern) {
        int i;
        int i2;
        int right;
        int bottom;
        int i3;
        int iOooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sidePattern, "sidePattern");
        Rect rect = new Rect();
        windowManager.getDefaultDisplay().getRectSize(rect);
        int i4 = layoutParams.x;
        int right2 = rect.right - (view.getRight() + i4);
        int i5 = layoutParams.y;
        int bottom2 = rect.bottom - (view.getBottom() + i5);
        int iMin = Math.min(i4, right2);
        int iMin2 = Math.min(i5, bottom2);
        boolean z = false;
        switch (sidePattern.ordinal()) {
            case 0:
            case 5:
            case 12:
                i = layoutParams.x;
                if (i4 >= right2) {
                    i2 = rect.right;
                    z = true;
                } else {
                    right = view.getRight();
                    i2 = -right;
                    z = true;
                }
                break;
            case 1:
            case 8:
                i = layoutParams.x;
                right = view.getRight();
                i2 = -right;
                z = true;
                break;
            case 2:
            case 9:
                i = layoutParams.x;
                i2 = rect.right;
                z = true;
                break;
            case 3:
            case 10:
                i = layoutParams.y;
                bottom = view.getBottom();
                i2 = -bottom;
                break;
            case 4:
            case 11:
                i = layoutParams.y;
                i3 = rect.bottom;
                iOooO0o = OooO0o(view, layoutParams);
                i2 = i3 + iOooO0o;
                break;
            case 6:
            case 13:
                i = layoutParams.y;
                if (i5 >= bottom2) {
                    i3 = rect.bottom;
                    iOooO0o = OooO0o(view, layoutParams);
                    i2 = i3 + iOooO0o;
                } else {
                    bottom = view.getBottom();
                    i2 = -bottom;
                }
                break;
            case 7:
            default:
                if (iMin > iMin2) {
                    i = layoutParams.y;
                    if (i5 >= bottom2) {
                        i3 = rect.bottom;
                        iOooO0o = OooO0o(view, layoutParams);
                        i2 = i3 + iOooO0o;
                    } else {
                        bottom = view.getBottom();
                        i2 = -bottom;
                    }
                } else {
                    i = layoutParams.x;
                    if (i4 >= right2) {
                        i2 = rect.right;
                        z = true;
                    } else {
                        right = view.getRight();
                        i2 = -right;
                        z = true;
                    }
                }
                break;
        }
        Integer numValueOf = Integer.valueOf(i2);
        Integer numValueOf2 = Integer.valueOf(i);
        final C32449OooOOoo c32449OooOOoo = new C32449OooOOoo(numValueOf, numValueOf2, Boolean.valueOf(z));
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(numValueOf.intValue(), numValueOf2.intValue());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0O0oO.OooO00o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32449OooOOoo triple = c32449OooOOoo;
                OooOOO0.OooO0oO(triple, "$triple");
                WindowManager.LayoutParams params = layoutParams;
                OooOOO0.OooO0oO(params, "$params");
                WindowManager windowManager2 = windowManager;
                OooOOO0.OooO0oO(windowManager2, "$windowManager");
                View view2 = view;
                OooOOO0.OooO0oO(view2, "$view");
                try {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    int iIntValue = ((Integer) animatedValue).intValue();
                    if (((Boolean) triple.f116649OooOoO0).booleanValue()) {
                        params.x = iIntValue;
                    } else {
                        params.y = iIntValue;
                    }
                    windowManager2.updateViewLayout(view2, params);
                } catch (Exception unused) {
                    valueAnimatorOfInt.cancel();
                }
            }
        });
        return valueAnimatorOfInt;
    }
}
