package com.orion.notein.p607ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.firebase.remoteconfig.OooO0O0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.RoundBottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class RoundBottomSheetDialogFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Integer f70450OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Integer f70451OooOo0o;

    public static void OooOoO(RoundBottomSheetDialogFragment roundBottomSheetDialogFragment, boolean z) {
        Window window;
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        Dialog dialog = roundBottomSheetDialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        if (z) {
            windowInsetsControllerCompat.hide(iSystemBars);
        } else {
            windowInsetsControllerCompat.show(iSystemBars);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        OooOOO0.OooO0o(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        OooOoO(this, false);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        OooOoO(this, false);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        final int iIntValue;
        super.onStart();
        Integer num = this.f70451OooOo0o;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ActivityC21897OooOo0 activity = getActivity();
            WindowManager windowManager = activity != null ? activity.getWindowManager() : null;
            OooOOO0.OooO0Oo(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            OooOOO0.OooO0Oo(defaultDisplay);
            defaultDisplay.getMetrics(displayMetrics);
            iIntValue = (int) (((double) displayMetrics.heightPixels) * 0.9d);
        }
        Integer num2 = this.f70450OooOo;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Dialog dialog = getDialog();
        if (dialog != null) {
            View viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = iIntValue;
            marginLayoutParams.width = iIntValue2;
        }
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o0oOo0o0.OooOO0
                @Override // java.lang.Runnable
                public final void run() {
                    RoundBottomSheetDialogFragment roundBottomSheetDialogFragment = this.f110686OooOo0o;
                    try {
                        View view2 = roundBottomSheetDialogFragment.getView();
                        Object parent = view2 != null ? view2.getParent() : null;
                        OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                        View view3 = (View) parent;
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                        CoordinatorLayout.OooO0OO oooO0OO = ((CoordinatorLayout.OooO0o) layoutParams2).f64174OooO00o;
                        OooOOO0.OooO0o0(oooO0OO, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) oooO0OO;
                        View view4 = roundBottomSheetDialogFragment.getView();
                        int i = iIntValue;
                        int measuredHeight = view4 != null ? view4.getMeasuredHeight() : i;
                        if (i == -2) {
                            if (measuredHeight > 0) {
                                bottomSheetBehavior.setPeekHeight(measuredHeight);
                            } else {
                                bottomSheetBehavior.setPeekHeight(-1);
                            }
                            bottomSheetBehavior.setSkipCollapsed(true);
                            bottomSheetBehavior.setState(3);
                        } else {
                            bottomSheetBehavior.setPeekHeight(measuredHeight);
                            bottomSheetBehavior.setSkipCollapsed(false);
                            bottomSheetBehavior.setState(3);
                        }
                        view3.setBackgroundColor(0);
                    } catch (Exception unused) {
                    }
                }
            });
        }
        OooOoO(this, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        View viewFindViewById;
        Window window2;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawableResource(R.color.dialog_window_bg_color);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (viewFindViewById = dialog3.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OooO0O0());
        ViewCompat.requestApplyInsets(viewFindViewById);
    }
}
