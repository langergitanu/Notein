package com.orion.notein.p607ui.notelist.about;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OoO000.ViewOnClickListenerC28541OooOoo;
import o0OoO000.ViewOnClickListenerC28542OooOoo0;
import o0Ooo0oo.ViewOnClickListenerC29448OooOO0O;
import o0o0000.OooO00o;
import o0o00Ooo.ViewOnClickListenerC29918OooO0o0;
import o0o00oo0.ViewOnClickListenerC30134OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/about/AboutFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AboutFragment extends Hilt_AboutFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f77314OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f77315OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f77316OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f77317OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f77318Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f77319Oooo00O;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.about_us_fragment_host, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws PackageManager.NameNotFoundException {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.setContentInsetsAbsolute(0, 0);
        View viewFindViewById = view.findViewById(R.id.btn_back_to_parent);
        this.f77315OooOoo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28542OooOoo0(this, 3));
        TextView textView = (TextView) view.findViewById(R.id.version);
        if (textView == null) {
            OooOOO0.OooOOOO("txtVersion");
            throw null;
        }
        PackageInfo packageInfo = requireActivity().getPackageManager().getPackageInfo(requireActivity().getPackageName(), 0);
        OooOOO0.OooO0o(packageInfo, "getPackageInfo(...)");
        String str = packageInfo.versionName;
        if (str == null) {
            str = "unknown";
        }
        textView.setText(str);
        View viewFindViewById2 = view.findViewById(R.id.privacy);
        this.f77314OooOoo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("privacy");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28541OooOoo(this, 2));
        View viewFindViewById3 = view.findViewById(R.id.agreement);
        this.f77316OooOooO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("agreement");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC29918OooO0o0(this, 1));
        View viewFindViewById4 = view.findViewById(R.id.btn_twitter);
        this.f77317OooOooo = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnTwitter");
            throw null;
        }
        viewFindViewById4.setOnClickListener(new OooO00o(this, 1));
        View viewFindViewById5 = view.findViewById(R.id.btn_youtube);
        this.f77318Oooo000 = viewFindViewById5;
        if (viewFindViewById5 == null) {
            OooOOO0.OooOOOO("btnYoutube");
            throw null;
        }
        viewFindViewById5.setOnClickListener(new ViewOnClickListenerC29448OooOO0O(this, 1));
        View viewFindViewById6 = view.findViewById(R.id.btn_instagram);
        this.f77319Oooo00O = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(new ViewOnClickListenerC30134OooO00o(this, 0));
        } else {
            OooOOO0.OooOOOO("btnInstagram");
            throw null;
        }
    }
}
