package com.orion.notein.p607ui.login.entry;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.navigation.fragment.NavHostFragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.login.entry.LoginContainerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24586OooOoOO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooo.C28477OooOOO0;
import o0OooOoo.C29579OooO0O0;
import o0OooOoo.C29580OooO0OO;
import o0OooOoo.ViewOnClickListenerC29578OooO00o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/entry/LoginContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LoginContainerFragment extends Hilt_LoginContainerFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public C24586OooOoOO f72179OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f72180OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28477OooOOO0.class), new OooO00o(), new OooO0OO(), new OooO0O0());

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C29579OooO0O0 f72181OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f72182OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f72183Oooo000;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return LoginContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return LoginContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return LoginContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_login_container, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C29579OooO0O0 c29579OooO0O0;
        C24586OooOoOO c24586OooOoOO = this.f72179OooOoo;
        if (c24586OooOoOO != null && (c29579OooO0O0 = this.f72181OooOooO) != null) {
            c24586OooOoOO.OooOo0o(c29579OooO0O0);
        }
        this.f72181OooOooO = null;
        this.f72179OooOoo = null;
        this.f72182OooOooo = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [o000o0O0.OooOO0o$OooO0O0, o0OooOoo.OooO0O0] */
    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f72182OooOooo = (TextView) view.findViewById(R.id.tv_title);
        View viewFindViewById = view.findViewById(R.id.btn_back);
        if (viewFindViewById != null) {
            C28050OooO0OO.OooO00o(viewFindViewById, 1500L, new ViewOnClickListenerC29578OooO00o(this, 0));
        } else {
            viewFindViewById = null;
        }
        this.f72183Oooo000 = viewFindViewById;
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : 0;
        this.f72179OooOoo = c24586OooOoOOOooOoO0;
        ?? r0 = new C24572OooOO0o.OooO0O0() { // from class: o0OooOoo.OooO0O0
            @Override // o000o0O0.C24572OooOO0o.OooO0O0
            public final void OooO00o(C24572OooOO0o c24572OooOO0o, C24583OooOo0o destination, Bundle bundle2) {
                OooOOO0.OooO0oO(c24572OooOO0o, "<unused var>");
                OooOOO0.OooO0oO(destination, "destination");
                LoginContainerFragment loginContainerFragment = this.f104905OooO00o;
                TextView textView = loginContainerFragment.f72182OooOooo;
                if (textView != null) {
                    CharSequence charSequence = destination.f83297OooOoO;
                    if (charSequence == null) {
                        Context context = loginContainerFragment.getContext();
                        String string = context != null ? context.getString(R.string.login_or_register) : null;
                        if (string == null) {
                            string = "";
                        }
                        charSequence = string;
                    }
                    textView.setText(charSequence);
                }
            }
        };
        if (c24586OooOoOOOooOoO0 != 0) {
            c24586OooOoOOOooOoO0.OooO0O0(r0);
        }
        this.f72181OooOooO = r0;
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29580OooO0OO(this, null), 3);
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getBoolean("arg_show_forbidden") : false) && getParentFragmentManager().OooOooo("TipsDialogFragment") == null) {
            String string = getString(R.string.tips);
            OooOOO0.OooO0o(string, "getString(...)");
            String string2 = getString(R.string.login_devices_reach_limit);
            OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment(string, string2, null, null, null, null, 0, null, 384).show(getParentFragmentManager(), "TipsDialogFragment");
        }
    }
}
