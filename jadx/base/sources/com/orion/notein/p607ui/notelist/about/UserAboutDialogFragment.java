package com.orion.notein.p607ui.notelist.about;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0Oo0oOo.ViewOnClickListenerC28314OooOO0;
import o0OoOOo0.ViewOnClickListenerC29184OooO0Oo;
import o0OoOOoO.ViewOnClickListenerC29187OooO00o;
import o0Ooo0oo.ViewOnClickListenerC29451OooOOO0;
import o0o00oo0.ViewOnClickListenerC30136OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/about/UserAboutDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserAboutDialogFragment extends Hilt_UserAboutDialogFragment {
    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.container);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.about_us_dialog_host;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final boolean OooOoo0() {
        return false;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws PackageManager.NameNotFoundException {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.close_button).setOnClickListener(new ViewOnClickListenerC30136OooO0OO(this, 0));
        TextView textView = (TextView) view.findViewById(R.id.version);
        if (textView != null) {
            PackageInfo packageInfo = requireActivity().getPackageManager().getPackageInfo(requireActivity().getPackageName(), 0);
            OooOOO0.OooO0o(packageInfo, "getPackageInfo(...)");
            String str = packageInfo.versionName;
            if (str == null) {
                str = "unknown";
            }
            textView.setText(str);
        }
        View viewFindViewById = view.findViewById(R.id.privacy);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC29451OooOOO0(this, 1));
        }
        View viewFindViewById2 = view.findViewById(R.id.agreement);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29184OooO0Oo(this, 3));
        }
        view.findViewById(R.id.btn_twitter).setOnClickListener(new ViewOnClickListenerC28305OooO(this, 4));
        view.findViewById(R.id.btn_youtube).setOnClickListener(new ViewOnClickListenerC28314OooOO0(this, 3));
        view.findViewById(R.id.btn_instagram).setOnClickListener(new ViewOnClickListenerC29187OooO00o(this, 2));
    }
}
