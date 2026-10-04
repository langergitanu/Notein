package com.orion.notein.p607ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24586OooOoOO;
import o0OoOoo.ViewOnClickListenerC29217OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/settings/GlobalSettingsContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GlobalSettingsContainerFragment extends Hilt_GlobalSettingsContainerFragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_global_settings_container, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.title)).setText(getString(R.string.settings));
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        C24586OooOoOO c24586OooOoOOOooOoO0 = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        View viewFindViewById = view.findViewById(R.id.btn_back);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC29217OooO00o(1, c24586OooOoOOOooOoO0, this));
        }
        if (c24586OooOoOOOooOoO0 != null) {
            c24586OooOoOOOooOoO0.OooO0O0(new C24572OooOO0o.OooO0O0() { // from class: o0o0Oo0O.OooO0Oo
                @Override // o000o0O0.C24572OooOO0o.OooO0O0
                public final void OooO00o(C24572OooOO0o c24572OooOO0o, C24583OooOo0o destination, Bundle bundle2) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(c24572OooOO0o, "<unused var>");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
                    TextView textView = (TextView) view.findViewById(R.id.title);
                    CharSequence string = bundle2 != null ? bundle2.getString(NoteMeta.PROPERTY_TITLE) : null;
                    if (string == null) {
                        string = destination.f83297OooOoO;
                    }
                    if (string == null || string.length() == 0 || textView == null) {
                        return;
                    }
                    textView.setText(string);
                }
            });
        }
    }
}
