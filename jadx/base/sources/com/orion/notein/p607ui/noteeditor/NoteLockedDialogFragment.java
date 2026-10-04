package com.orion.notein.p607ui.noteeditor;

import Oooo0O0.OooOO0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o0O0.C24568OooO0oO;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.ViewOnClickListenerC28591o0000oOO;
import o0OoO0oo.C28960o00oOoO0;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/NoteLockedDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteLockedDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f73337OooOoOO = new C24568OooO0oO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28960o00oOoO0.class), new OooO00o());

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            NoteLockedDialogFragment noteLockedDialogFragment = NoteLockedDialogFragment.this;
            Bundle arguments = noteLockedDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + noteLockedDialogFragment + " has null arguments");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_note_locked;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OooOO0.OooO00o(this);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Dialog dialog;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        if (((C28960o00oOoO0) this.f73337OooOoOO.getValue()).f102614OooO00o.length() == 0 && (dialog = getDialog()) != null) {
            dialog.dismiss();
        }
        view.findViewById(R.id.btn_cancel).setOnClickListener(new ViewOnClickListenerC28958o00oOo0o(this, 0));
        View viewFindViewById = view.findViewById(R.id.btn_confirm);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        C28050OooO0OO.OooO00o(viewFindViewById, 1500L, new ViewOnClickListenerC28591o0000oOO(this, 1));
    }
}
