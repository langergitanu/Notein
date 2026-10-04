package Oooo0oO;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.util.Property;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.C21893OooOOOo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import java.io.File;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24586OooOoOO;
import o00o0OoO.InterfaceC25420OooO00o;
import oO000Oo.C31938OooO0oO;

/* JADX INFO: renamed from: Oooo0oO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21030OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f60891OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f60892OooO0O0 = 0;

    public static oO000Oo.o00Oo0 OooO00o() {
        return oO000Oo.o0000O0O.f114515OooO0o0 == null ? new oO000Oo.o0000O0O() : new C31938OooO0oO();
    }

    public static boolean OooO0O0(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                OooO0O0(file2);
            }
        }
        return file.delete();
    }

    public static final C24572OooOO0o OooO0OO(Fragment fragment) {
        Dialog dialog;
        Window window;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "<this>");
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                C24586OooOoOO c24586OooOoOO = ((NavHostFragment) parentFragment).f65730OooOo0o;
                if (c24586OooOoOO != null) {
                    return c24586OooOoOO;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
            Fragment fragment2 = parentFragment.getParentFragmentManager().f64823OooOoOO;
            if (fragment2 instanceof NavHostFragment) {
                C24586OooOoOO c24586OooOoOO2 = ((NavHostFragment) fragment2).f65730OooOo0o;
                if (c24586OooOoOO2 != null) {
                    return c24586OooOoOO2;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return C21022OooO0OO.OooO0O0(view);
        }
        View decorView = null;
        DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return C21022OooO0OO.OooO0O0(decorView);
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", fragment, " does not have a NavController set"));
    }

    public static final void OooO0Oo() {
        throw new IllegalStateException("Invalid applier");
    }

    public static void OooO0o(View fromV, View toV) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fromV, "fromV");
        kotlin.jvm.internal.OooOOO0.OooO0oO(toV, "toV");
        float width = fromV.getWidth();
        toV.setTranslationX(width);
        toV.setVisibility(0);
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fromV, (Property<View, Float>) property, 0.0f, -width);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(toV, (Property<View, Float>) property, width, 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    public static void OooO0o0(View toV, View fromV) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(toV, "toV");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fromV, "fromV");
        float width = toV.getWidth();
        toV.setVisibility(0);
        float f = -width;
        toV.setTranslationX(f);
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fromV, (Property<View, Float>) property, 0.0f, width);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(toV, (Property<View, Float>) property, f, 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    public static void OooO0oO(File file, InterfaceC25420OooO00o interfaceC25420OooO00o) {
        interfaceC25420OooO00o.OooO0OO(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    OooO0oO(file2, interfaceC25420OooO00o);
                } else {
                    interfaceC25420OooO00o.OooO00o(file2);
                }
            }
        }
        interfaceC25420OooO00o.OooO0O0(file);
    }
}
