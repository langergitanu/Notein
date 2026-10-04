package com.orion.notein.p607ui.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24586OooOoOO;
import o000o0O0.OooOO0;
import o0OoO000.o00Oo0;
import o0OoO000.o00Ooo;
import o0o0Oo0O.C30612OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/settings/GlobalSettingsContainerDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GlobalSettingsContainerDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C30612OooO0OO f78853OooOoOO;

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
        return R.layout.fragment_global_settings_container_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment.OooOoO0();
            C30612OooO0OO c30612OooO0OO = this.f78853OooOoOO;
            if (c30612OooO0OO != null) {
                c24586OooOoOOOooOoO0.OooOo0o(c30612OooO0OO);
            }
        }
        this.f78853OooOoOO = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [o000o0O0.OooOO0o$OooO0O0, o0o0Oo0O.OooO0OO] */
    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        final C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : 0;
        View viewFindViewById = view.findViewById(R.id.btn_close);
        final View viewFindViewById2 = view.findViewById(R.id.btn_back);
        final TextView textView = (TextView) view.findViewById(R.id.tv_title);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new o00Oo0(this, 3));
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new o00Ooo(c24586OooOoOOOooOoO0, 3));
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility((c24586OooOoOOOooOoO0 != 0 ? c24586OooOoOOOooOoO0.OooOO0O() : null) != null ? 0 : 8);
        }
        if (c24586OooOoOOOooOoO0 != 0) {
            ?? r0 = new C24572OooOO0o.OooO0O0(textView, this, viewFindViewById2, c24586OooOoOOOooOoO0) { // from class: o0o0Oo0O.OooO0OO

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ TextView f109548OooO00o;

                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                public final /* synthetic */ View f109549OooO0O0;

                /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                public final /* synthetic */ C24586OooOoOO f109550OooO0OO;

                {
                    this.f109549OooO0O0 = viewFindViewById2;
                    this.f109550OooO0OO = c24586OooOoOOOooOoO0;
                }

                @Override // o000o0O0.C24572OooOO0o.OooO0O0
                public final void OooO00o(C24572OooOO0o c24572OooOO0o, C24583OooOo0o destination, Bundle bundle2) {
                    TextView textView2;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(c24572OooOO0o, "<unused var>");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
                    CharSequence string = bundle2 != null ? bundle2.getString(NoteMeta.PROPERTY_TITLE) : null;
                    if (string == null) {
                        string = destination.f83297OooOoO;
                    }
                    if (string != null && string.length() != 0 && (textView2 = this.f109548OooO00o) != null) {
                        textView2.setText(string);
                    }
                    C24586OooOoOO c24586OooOoOO = this.f109550OooO0OO;
                    View view2 = this.f109549OooO0O0;
                    if (view2 != null) {
                        view2.setVisibility(c24586OooOoOO.OooOO0O() != null ? 0 : 8);
                    }
                }
            };
            c24586OooOoOOOooOoO0.OooO0O0(r0);
            this.f78853OooOoOO = r0;
            C24583OooOo0o c24583OooOo0oOooO0oO = c24586OooOoOOOooOoO0.OooO0oO();
            if (c24583OooOo0oOooO0oO != null) {
                OooOO0 oooOO0OooO0oo = c24586OooOoOOOooOoO0.f83213OooO0oO.OooO0oo();
                r0.OooO00o(c24586OooOoOOOooOoO0, c24583OooOo0oOooO0oO, oooOO0OooO0oo != null ? oooOO0OooO0oo.f83192OooOoO0 : null);
            }
        }
    }
}
