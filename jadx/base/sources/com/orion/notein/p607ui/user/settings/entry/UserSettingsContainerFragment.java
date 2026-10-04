package com.orion.notein.p607ui.user.settings.entry;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.widget.EdgeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24586OooOoOO;
import o0Oo0oOo.C28376o0ooOoO;
import o0oOo0o0.InterfaceC30981OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/settings/entry/UserSettingsContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserSettingsContainerFragment extends EdgeFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f79824OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NavHostFragment f79825OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public CharSequence f79826OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TextView f79827OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o f79828OooOoOO = new OooO00o();

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
            UserSettingsContainerFragment userSettingsContainerFragment = UserSettingsContainerFragment.this;
            View view = userSettingsContainerFragment.f79824OooOo;
            if (view != null) {
                view.setBackgroundResource(interfaceC30981OooO0OO.OooO0o().intValue());
            }
            TextView textView = userSettingsContainerFragment.f79827OooOoO0;
            if (textView != null) {
                Integer numOooOO0 = interfaceC30981OooO0OO.OooOO0();
                if (numOooOO0 != null) {
                    textView.setText(numOooOO0.intValue());
                } else {
                    textView.setText(userSettingsContainerFragment.f79826OooOoO);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.user_settings_container_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FragmentManager childFragmentManager;
        NavHostFragment navHostFragment = this.f79825OooOo0o;
        if (navHostFragment != null) {
            navHostFragment.OooOoO0();
        }
        NavHostFragment navHostFragment2 = this.f79825OooOo0o;
        if (navHostFragment2 != null && (childFragmentManager = navHostFragment2.getChildFragmentManager()) != null) {
            childFragmentManager.o00O0O(this.f79828OooOoOO);
        }
        this.f79824OooOo = null;
        this.f79827OooOoO0 = null;
        this.f79826OooOoO = null;
        this.f79825OooOo0o = null;
        super.onDestroyView();
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager childFragmentManager;
        FragmentManager childFragmentManager2;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f79824OooOo = view.findViewById(R.id.container);
        this.f79827OooOoO0 = (TextView) view.findViewById(R.id.title);
        View view2 = this.f79824OooOo;
        if (view2 != null) {
            view2.getBackground();
        }
        TextView textView = this.f79827OooOoO0;
        this.f79826OooOoO = textView != null ? textView.getText() : null;
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        this.f79825OooOo0o = navHostFragment;
        final C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        View viewFindViewById = view.findViewById(R.id.btn_back);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o0oOo.OooO00o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C24586OooOoOO c24586OooOoOO = c24586OooOoOOOooOoO0;
                    if (c24586OooOoOO == null || !c24586OooOoOO.OooOOOo()) {
                        C21030OooOO0o.OooO0OO(this).OooOOo0();
                    }
                }
            });
        }
        NavHostFragment navHostFragment2 = this.f79825OooOo0o;
        if (navHostFragment2 != null && (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) != null) {
            childFragmentManager2.OoooOOo(this.f79828OooOoOO, true);
        }
        NavHostFragment navHostFragment3 = this.f79825OooOo0o;
        if (navHostFragment3 == null || (childFragmentManager = navHostFragment3.getChildFragmentManager()) == null) {
            return;
        }
        childFragmentManager.Oooooo0("user_settings:user_deleted", getViewLifecycleOwner(), new C28376o0ooOoO(this, 1));
    }
}
