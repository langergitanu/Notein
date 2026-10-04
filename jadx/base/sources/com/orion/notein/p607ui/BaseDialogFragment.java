package com.orion.notein.p607ui;

import OooO0Oo.OooOo00;
import OooOoo.C20593OooO0Oo;
import OooOooo.C20785Oooo00o;
import Oooo0.o000000O;
import Oooo0oO.C21023OooO0Oo;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.DialogFragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.DeleteMaterialConfirmDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o0o.C28249OooOoo0;
import o0oOo0o0.ViewOnLayoutChangeListenerC30980OooO0O0;
import o0oOoOOO.C31025OooO00o;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class BaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO00o f70437OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f70438OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC30980OooO0O0 f70439OooOoO = new View.OnLayoutChangeListener() { // from class: o0oOo0o0.OooO0O0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f110679OooOo0o.OooOoOO();
        }
    };

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ViewGroup f70440OooOoO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f70441OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Integer f70442OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Integer f70443OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f70444OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f70445OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f70446OooO0o0;

        public OooO00o(int i, Integer num, Integer num2) {
            int iOooO0o = o000000O.OooO0o(16);
            int iOooO0o2 = o000000O.OooO0o(16);
            int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout();
            this.f70441OooO00o = i;
            this.f70442OooO0O0 = num;
            this.f70443OooO0OO = num2;
            this.f70444OooO0Oo = iOooO0o;
            this.f70446OooO0o0 = iOooO0o2;
            this.f70445OooO0o = iSystemBars;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f70441OooO00o == oooO00o.f70441OooO00o && OooOOO0.OooO0O0(this.f70442OooO0O0, oooO00o.f70442OooO0O0) && OooOOO0.OooO0O0(this.f70443OooO0OO, oooO00o.f70443OooO0OO) && this.f70444OooO0Oo == oooO00o.f70444OooO0Oo && this.f70446OooO0o0 == oooO00o.f70446OooO0o0 && this.f70445OooO0o == oooO00o.f70445OooO0o;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f70441OooO00o) * 31;
            Integer num = this.f70442OooO0O0;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f70443OooO0OO;
            return Integer.hashCode(this.f70445OooO0o) + C20785Oooo00o.OooO00o(this.f70446OooO0o0, C20785Oooo00o.OooO00o(this.f70444OooO0Oo, (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 29791, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdaptiveDialogConfig(containerId=");
            sb.append(this.f70441OooO00o);
            sb.append(", maxWidthPx=");
            sb.append(this.f70442OooO0O0);
            sb.append(", maxHeightPx=");
            sb.append(this.f70443OooO0OO);
            sb.append(", minWidthPx=null, minHeightPx=null, horizontalPaddingPx=");
            sb.append(this.f70444OooO0Oo);
            sb.append(", verticalPaddingPx=");
            sb.append(this.f70446OooO0o0);
            sb.append(", insetsType=");
            return C21023OooO0Oo.OooO0OO(")", this.f70445OooO0o, sb);
        }
    }

    public static int OooOooo(int i, int i2, Integer num) {
        if (i2 <= 0) {
            return 0;
        }
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                i2 = Math.min(num.intValue(), i2);
            }
        }
        if (i > 0) {
            i2 = Math.min(i, i2);
        } else if (i != -1 && i != -1 && i == -2) {
            i2 = -2;
        }
        if (i2 == -2) {
            return -2;
        }
        return i2;
    }

    public static void Oooo000(BaseDialogFragment baseDialogFragment, boolean z) {
        Window window;
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        Dialog dialog = baseDialogFragment.getDialog();
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

    public Integer OooOoO() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO() {
        ViewGroup viewGroup;
        Dialog dialog;
        Window window;
        C32443OooOOO c32443OooOOO;
        OooO00o oooO00o = this.f70437OooOo;
        if (oooO00o == null || (viewGroup = this.f70440OooOoO0) == null || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        OooOOO0.OooO0o(decorView, "getDecorView(...)");
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        int i2 = oooO00o.f70445OooO0o;
        if (i >= 30) {
            WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
            OooOOO0.OooO0o(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Rect bounds = currentWindowMetrics.getBounds();
            OooOOO0.OooO0o(bounds, "getBounds(...)");
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(currentWindowMetrics.getWindowInsets(), decorView);
            OooOOO0.OooO0o(windowInsetsCompat, "toWindowInsetsCompat(...)");
            Insets insets = windowInsetsCompat.getInsets(i2);
            OooOOO0.OooO0o(insets, "getInsets(...)");
            int iWidth = (bounds.width() - insets.left) - insets.right;
            int iHeight = (bounds.height() - insets.top) - insets.bottom;
            if (iWidth < 0) {
                iWidth = 0;
            }
            Integer numValueOf = Integer.valueOf(iWidth);
            if (iHeight < 0) {
                iHeight = 0;
            }
            c32443OooOOO = new C32443OooOOO(numValueOf, Integer.valueOf(iHeight));
        } else {
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
            Insets insets2 = rootWindowInsets != null ? rootWindowInsets.getInsets(i2) : null;
            int iWidth2 = (rect.width() - (insets2 != null ? insets2.left : 0)) - (insets2 != null ? insets2.right : 0);
            int iHeight2 = (rect.height() - (insets2 != null ? insets2.top : 0)) - (insets2 != null ? insets2.bottom : 0);
            if (iWidth2 < 0) {
                iWidth2 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(iWidth2);
            if (iHeight2 < 0) {
                iHeight2 = 0;
            }
            c32443OooOOO = new C32443OooOOO(numValueOf2, Integer.valueOf(iHeight2));
        }
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            return;
        }
        int i3 = oooO00o.f70444OooO0Oo;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = oooO00o.f70446OooO0o0;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iIntValue - i3;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = iIntValue2 - i4;
        if (i6 < 0) {
            i6 = 0;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        int i7 = layoutParams != null ? layoutParams.width : -2;
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        int i8 = layoutParams2 != null ? layoutParams2.height : -2;
        int iOooOooo = OooOooo(i7, i5, oooO00o.f70442OooO0O0);
        int iOooOooo2 = OooOooo(i8, i6, oooO00o.f70443OooO0OO);
        if (iOooOooo <= 0) {
            iOooOooo = -2;
        }
        int i9 = iOooOooo2 > 0 ? iOooOooo2 : -2;
        ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        if (layoutParams3 == null) {
            viewGroup.setLayoutParams(new ViewGroup.LayoutParams(iOooOooo, i9));
            viewGroup.requestLayout();
            return;
        }
        boolean z2 = true;
        if (layoutParams3.width != iOooOooo) {
            layoutParams3.width = iOooOooo;
            z = true;
        }
        if (layoutParams3.height != i9) {
            layoutParams3.height = i9;
        } else {
            z2 = z;
        }
        if (z2) {
            viewGroup.setLayoutParams(layoutParams3);
            viewGroup.requestLayout();
        }
    }

    public abstract int OooOoo();

    public boolean OooOoo0() {
        return this instanceof DeleteMaterialConfirmDialogFragment;
    }

    public int OooOooO() {
        return R.color.dialog_window_bg_color;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return android.R.style.Theme.Translucent.NoTitleBar.Fullscreen;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
        }
        final Context contextRequireContext = requireContext();
        ViewGroup viewGroup2 = new FrameLayout(contextRequireContext) { // from class: com.orion.notein.ui.BaseDialogFragment$onCreateView$containerView$1
            @Override // android.view.ViewGroup, android.view.View
            public final boolean dispatchTouchEvent(MotionEvent ev) {
                OooOOO0.OooO0oO(ev, "ev");
                if (ev.getAction() == 0) {
                    BaseDialogFragment baseDialogFragment = this.f70447OooOo0o;
                    if (baseDialogFragment.OooOoo0() && baseDialogFragment.f70438OooOo0o != null) {
                        Rect rect = new Rect();
                        View view = baseDialogFragment.f70438OooOo0o;
                        if (view == null) {
                            OooOOO0.OooOOOO("root");
                            throw null;
                        }
                        view.getHitRect(rect);
                        if (!rect.contains((int) ev.getX(), (int) ev.getY())) {
                            baseDialogFragment.dismissAllowingStateLoss();
                            return true;
                        }
                    }
                }
                return super.dispatchTouchEvent(ev);
            }
        };
        viewGroup2.setBackgroundColor(ContextCompat.getColor(requireContext(), OooOooO()));
        this.f70438OooOo0o = inflater.inflate(OooOoo(), viewGroup2, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        View view = this.f70438OooOo0o;
        if (view != null) {
            viewGroup2.addView(view, layoutParams);
            return viewGroup2;
        }
        OooOOO0.OooOOOO("root");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Oooo000(this, false);
        View view = this.f70438OooOo0o;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f70439OooOoO);
        }
        this.f70440OooOoO0 = null;
        this.f70437OooOo = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        Oooo000(this, false);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OooOoOO();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(32);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        Window window;
        Window window2;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog instanceof OooOo00) {
            OooOo00 dialog2 = (OooOo00) dialog;
            C28249OooOoo0 c28249OooOoo0 = new C28249OooOoo0(this, 1);
            OooOOO0.OooO0oO(dialog2, "dialog");
            dialog2.getOnBackPressedDispatcher().OooO00o(dialog2, new C31025OooO00o(c28249OooOoo0, dialog2));
        } else {
            C34406OooO00o.f123390OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("BaseDialogFragment.onViewCreated: dialog is not a ComponentDialog (actual: ", dialog != null ? dialog.getClass().getName() : null, "); back-press handling not attached."), new Object[0]);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null && (window = dialog4.getWindow()) != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
        }
        ViewCompat.setOnApplyWindowInsetsListener(view, new C20785Oooo00o());
        Oooo000(this, true);
        Integer numOooOoO = OooOoO();
        OooO00o oooO00o = (numOooOoO == null || (iIntValue = numOooOoO.intValue()) == -1) ? null : new OooO00o(iIntValue, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.dialog_container_fixed_width)), Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.dialog_container_fixed_height)));
        View view2 = this.f70438OooOo0o;
        ViewOnLayoutChangeListenerC30980OooO0O0 viewOnLayoutChangeListenerC30980OooO0O0 = this.f70439OooOoO;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC30980OooO0O0);
        }
        if (oooO00o == null) {
            this.f70437OooOo = null;
            this.f70440OooOoO0 = null;
            return;
        }
        View view3 = this.f70438OooOo0o;
        if (view3 == null) {
            this.f70437OooOo = null;
            this.f70440OooOoO0 = null;
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view3.findViewById(oooO00o.f70441OooO00o);
        if (viewGroup == null) {
            this.f70437OooOo = null;
            this.f70440OooOoO0 = null;
            return;
        }
        this.f70437OooOo = oooO00o;
        this.f70440OooOoO0 = viewGroup;
        View view4 = this.f70438OooOo0o;
        if (view4 == null) {
            OooOOO0.OooOOOO("root");
            throw null;
        }
        view4.addOnLayoutChangeListener(viewOnLayoutChangeListenerC30980OooO0O0);
        OooOoOO();
    }
}
