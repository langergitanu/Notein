package com.orion.notein.p607ui.user.settings.entry;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.datepicker.ViewOnClickListenerC22469OooO0o0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import com.orion.notein.p607ui.user.settings.entry.UserSettingsDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24586OooOoOO;
import o000o0O0.OooOO0;
import o0OoO000.o0000O0;
import o0oOo.C30908OooO0O0;
import o0oOo0o0.InterfaceC30981OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/settings/entry/UserSettingsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserSettingsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30908OooO0O0 f79830OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f79831OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public NavHostFragment f79832OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f79833OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public CharSequence f79834OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO00o f79835Oooo000 = new OooO00o();

    public static final class OooO00o extends FragmentManager.AbstractC21880OooOO0o {
        public OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentManager.AbstractC21880OooOO0o
        public final void OooO00o(FragmentManager fragmentManager, Fragment f) {
            OooOOO0.OooO0oO(f, "f");
            InterfaceC30981OooO0OO interfaceC30981OooO0OO = f instanceof InterfaceC30981OooO0OO ? (InterfaceC30981OooO0OO) f : null;
            if (interfaceC30981OooO0OO == null) {
                return;
            }
            UserSettingsDialogFragment userSettingsDialogFragment = UserSettingsDialogFragment.this;
            View view = userSettingsDialogFragment.f79831OooOoo;
            if (view != null) {
                view.setBackgroundResource(interfaceC30981OooO0OO.OooO0o().intValue());
            }
            TextView textView = userSettingsDialogFragment.f79833OooOooO;
            if (textView != null) {
                Integer numOooOO0 = interfaceC30981OooO0OO.OooOO0();
                if (numOooOO0 != null) {
                    textView.setText(numOooOO0.intValue());
                } else {
                    textView.setText(userSettingsDialogFragment.f79834OooOooo);
                }
            }
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.container);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void OooOoO0() {
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment == null || !navHostFragment.OooOoO0().OooOOo0()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.dialog_user_settings_container;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FragmentManager childFragmentManager;
        NavHostFragment navHostFragment = this.f79832OooOoo0;
        if (navHostFragment != null) {
            C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment.OooOoO0();
            C30908OooO0O0 c30908OooO0O0 = this.f79830OooOoOO;
            if (c30908OooO0O0 != null) {
                c24586OooOoOOOooOoO0.OooOo0o(c30908OooO0O0);
            }
        }
        NavHostFragment navHostFragment2 = this.f79832OooOoo0;
        if (navHostFragment2 != null && (childFragmentManager = navHostFragment2.getChildFragmentManager()) != null) {
            childFragmentManager.o00O0O(this.f79835Oooo000);
        }
        this.f79831OooOoo = null;
        this.f79833OooOooO = null;
        this.f79834OooOooo = null;
        this.f79830OooOoOO = null;
        this.f79832OooOoo0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [o000o0O0.OooOO0o$OooO0O0, o0oOo.OooO0O0] */
    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager childFragmentManager;
        FragmentManager childFragmentManager2;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f79831OooOoo = view.findViewById(R.id.container);
        this.f79833OooOooO = (TextView) view.findViewById(R.id.tv_title);
        View view2 = this.f79831OooOoo;
        if (view2 != null) {
            view2.getBackground();
        }
        TextView textView = this.f79833OooOooO;
        this.f79834OooOooo = textView != null ? textView.getText() : null;
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        this.f79832OooOoo0 = navHostFragment;
        final C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : 0;
        View viewFindViewById = view.findViewById(R.id.btn_close);
        final View viewFindViewById2 = view.findViewById(R.id.btn_back);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new o0000O0(this, 1));
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC22469OooO0o0(c24586OooOoOOOooOoO0, 6));
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility((c24586OooOoOOOooOoO0 != 0 ? c24586OooOoOOOooOoO0.OooOO0O() : null) != null ? 0 : 8);
        }
        if (c24586OooOoOOOooOoO0 != 0) {
            ?? r1 = new C24572OooOO0o.OooO0O0(this) { // from class: o0oOo.OooO0O0
                @Override // o000o0O0.C24572OooOO0o.OooO0O0
                public final void OooO00o(C24572OooOO0o c24572OooOO0o, C24583OooOo0o c24583OooOo0o, Bundle bundle2) {
                    OooOOO0.OooO0oO(c24572OooOO0o, "<unused var>");
                    OooOOO0.OooO0oO(c24583OooOo0o, "<unused var>");
                    C24586OooOoOO c24586OooOoOO = c24586OooOoOOOooOoO0;
                    View view3 = viewFindViewById2;
                    if (view3 != null) {
                        view3.setVisibility(c24586OooOoOO.OooOO0O() != null ? 0 : 8);
                    }
                }
            };
            c24586OooOoOOOooOoO0.OooO0O0(r1);
            this.f79830OooOoOO = r1;
            C24583OooOo0o c24583OooOo0oOooO0oO = c24586OooOoOOOooOoO0.OooO0oO();
            if (c24583OooOo0oOooO0oO != null) {
                OooOO0 oooOO0OooO0oo = c24586OooOoOOOooOoO0.f83213OooO0oO.OooO0oo();
                r1.OooO00o(c24586OooOoOOOooOoO0, c24583OooOo0oOooO0oO, oooOO0OooO0oo != null ? oooOO0OooO0oo.f83192OooOoO0 : null);
            }
        }
        NavHostFragment navHostFragment2 = this.f79832OooOoo0;
        if (navHostFragment2 != null && (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) != null) {
            childFragmentManager2.OoooOOo(this.f79835Oooo000, true);
        }
        NavHostFragment navHostFragment3 = this.f79832OooOoo0;
        if (navHostFragment3 == null || (childFragmentManager = navHostFragment3.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.Oooooo0("user_settings:user_deleted", getViewLifecycleOwner(), new InterfaceC21912Oooo0o() { // from class: o0oOo.OooO0OO
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle2, String str) {
                FragmentManager supportFragmentManager;
                OooOOO0.OooO0oO(bundle2, "bundle");
                if (bundle2.getBoolean("user_deleted")) {
                    UserSettingsDialogFragment userSettingsDialogFragment = this.f110479OooOo0o;
                    ActivityC21897OooOo0 activity = userSettingsDialogFragment.getActivity();
                    Fragment fragmentOooOooO2 = (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.OooOooO(R.id.nav_host_fragment);
                    NavHostFragment navHostFragment4 = fragmentOooOooO2 instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO2 : null;
                    C24586OooOoOO c24586OooOoOOOooOoO02 = navHostFragment4 != null ? navHostFragment4.OooOoO0() : null;
                    if (c24586OooOoOOOooOoO02 != null && !c24586OooOoOOOooOoO02.OooOOo(R.id.noteListContainerFragment, false)) {
                        c24586OooOoOOOooOoO02.OooOOO0(R.id.noteListContainerFragment, null, null);
                    }
                    userSettingsDialogFragment.dismissAllowingStateLoss();
                }
            }
        });
    }
}
