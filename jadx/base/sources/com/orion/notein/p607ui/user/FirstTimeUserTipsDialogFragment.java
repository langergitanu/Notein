package com.orion.notein.p607ui.user;

import Oooo0.o000000O;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0O0OoOo.C25900OooO00o;
import o0O0oo0.C26207OooOOo0;
import o0O0oooO.C26320o0000OoO;
import o0Ooo.ViewOnClickListenerC29256OooO0Oo;
import o0o000oO.ViewOnClickListenerC29781OooO0o;
import o0oOoOoO.C31097OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/FirstTimeUserTipsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirstTimeUserTipsDialogFragment extends Hilt_FirstTimeUserTipsDialogFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f79605OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79606OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new OooO00o(), new OooO0OO(), new OooO0O0());

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f79607OooOooO;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirstTimeUserTipsDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirstTimeUserTipsDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirstTimeUserTipsDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_first_time_user_tips_dialog, viewGroup, true);
        View viewFindViewById = viewInflate.findViewById(R.id.agree);
        this.f79605OooOoo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29256OooO0Oo(this, 2));
        View viewFindViewById2 = viewInflate.findViewById(R.id.disagree);
        this.f79607OooOooO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnDisagree");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29781OooO0o(this, 4));
        TextView textView = (TextView) viewInflate.findViewById(R.id.agreement);
        if (textView != null) {
            o0O0OoOo.OooO0OO.OooO00o(textView, R.string.please_read_privacy_and_service, new C25900OooO00o(R.string.privacy_policy, new InterfaceC32507OooOO0o() { // from class: o0oOo0.OooOO0
                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                    Context contextRequireContext = this.f110493OooOo0o.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                    return C32460OooOooO.f116667OooO00o;
                }
            }), new C25900OooO00o(R.string.service_agreement, new C26207OooOOo0(this, 1)));
            return viewInflate;
        }
        OooOOO0.OooOOOO("privateAndService");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setLayout(o000000O.OooO0o(300), -2);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(view.getContext().getDrawable(R.drawable.dialog_primary_bg));
    }
}
