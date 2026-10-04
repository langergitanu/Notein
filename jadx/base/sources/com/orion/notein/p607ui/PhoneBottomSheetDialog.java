package com.orion.notein.p607ui;

import Oooo0.o000000O;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class PhoneBottomSheetDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f70448OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70449OooOo0o = 1;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getResources().getConfiguration().orientation;
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("phone_bottom_sheet:last_orientation")) : null;
        if (numValueOf != null && numValueOf.intValue() != i) {
            this.f70448OooOo = true;
        }
        this.f70449OooOo0o = i;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("phone_bottom_sheet:last_orientation", this.f70449OooOo0o);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f70448OooOo) {
            this.f70448OooOo = false;
            dismissAllowingStateLoss();
            return;
        }
        Dialog dialog = getDialog();
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            OooOOO0.OooO0o(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setState(3);
            if (getResources().getConfiguration().orientation == 2) {
                bottomSheetBehaviorFrom.setMaxWidth(o000000O.OooO0o(StyleIdentifier.LIST_TABLE_4_ACCENT_5));
            } else {
                bottomSheetBehaviorFrom.setMaxWidth(-1);
            }
            bottomSheetBehaviorFrom.setMaxHeight(o000000O.OooO0o(getResources().getConfiguration().screenHeightDp) - getResources().getDimensionPixelSize(R.dimen.immersive_toolbar_height));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.post(new Runnable() { // from class: o0oOo0o0.OooO0o0
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                try {
                    Object parent = view2.getParent();
                    OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                    ((View) parent).setBackgroundColor(0);
                } catch (Exception unused) {
                }
                if (C30983OooO0o.OooO00o(view2, "getContext(...)")) {
                    return;
                }
                this.dismissAllowingStateLoss();
            }
        });
    }
}
