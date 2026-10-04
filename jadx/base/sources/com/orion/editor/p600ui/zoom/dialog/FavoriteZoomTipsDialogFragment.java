package com.orion.editor.p600ui.zoom.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.orion.notein.global.R;
import o0O0oO0o.ViewOnClickListenerC26096OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public class FavoriteZoomTipsDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ViewOnClickListenerC26096OooO0Oo f69440OooOo0o;

    public class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Dialog f69442OooOo0o;

        public OooO00o(Dialog dialog) {
            this.f69442OooOo0o = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewOnClickListenerC26096OooO0Oo viewOnClickListenerC26096OooO0Oo = FavoriteZoomTipsDialogFragment.this.f69440OooOo0o;
            if (viewOnClickListenerC26096OooO0Oo != null) {
                viewOnClickListenerC26096OooO0Oo.onClick(view);
            }
            this.f69442OooOo0o.dismiss();
        }
    }

    public class OooO0O0 implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Dialog f69444OooOo0o;

        public OooO0O0(Dialog dialog) {
            this.f69444OooOo0o = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FavoriteZoomTipsDialogFragment.this.getClass();
            this.f69444OooOo0o.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
        }
        return layoutInflater.inflate(R.layout.fragment_favorite_zoom_tips_dialog, viewGroup, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        view.findViewById(R.id.btn_confirm).setOnClickListener(new OooO00o(dialog));
        view.findViewById(R.id.btn_cancel).setOnClickListener(new OooO0O0(dialog));
        dialog.setCancelable(false);
    }
}
