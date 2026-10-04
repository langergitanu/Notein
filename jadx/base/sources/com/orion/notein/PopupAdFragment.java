package com.orion.notein;

import Oooo0.o000000O;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.DialogFragment;
import com.aspose.words.StyleIdentifier;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orion.notein.LoginActivity;
import com.orion.notein.MainActivity;
import com.orion.notein.PopupAdFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oo000.C25643OooO0O0;
import o00oo000.C25645OooO0Oo;
import o00oo0O.EnumC25653OooO0OO;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0O0oooO.o0Oo0oo;
import o0oOoOoO.C31101OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/PopupAdFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PopupAdFragment extends DialogFragment {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f69775OooOo0o = "";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f69774OooOo = "";

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("image_url");
            if (string == null) {
                string = "";
            }
            this.f69775OooOo0o = string;
            String string2 = arguments.getString("target");
            this.f69774OooOo = string2 != null ? string2 : "";
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext());
        dialog.setContentView(com.orion.notein.global.R.layout.fragment_popup_ad);
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.width = o000000O.OooO0o(StyleIdentifier.GRID_TABLE_2_ACCENT_3);
        }
        if (attributes != null) {
            attributes.height = o000000O.OooO0o(462);
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(com.orion.notein.global.R.layout.fragment_popup_ad, viewGroup, false);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(com.orion.notein.global.R.id.image_view);
        C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(Uri.parse(this.f69775OooOo0o));
        c25764OooO0O0OooO0o.f87937OooO0oo = EnumC25653OooO0OO.f87570OooOoO0;
        C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o.OooO00o();
        C25645OooO0Oo c25645OooO0Oo = C25643OooO0O0.f87518OooO00o.get();
        c25645OooO0Oo.f86842OooO00o = c25763OooO00oOooO00o;
        c25645OooO0Oo.f86845OooO0Oo = simpleDraweeView.getController();
        c25645OooO0Oo.f86844OooO0OO = true;
        simpleDraweeView.setController(c25645OooO0Oo.OooO00o());
        simpleDraweeView.setOnClickListener(new View.OnClickListener() { // from class: o0O0oooO.o0OOO0o
            /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                String str;
                PopupAdFragment popupAdFragment = this.f90445OooOo0o;
                String str2 = popupAdFragment.f69774OooOo;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str2, "pay_fragment")) {
                    ActivityC21897OooOo0 activity = popupAdFragment.getActivity();
                    MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                    if (mainActivity != null) {
                        mainActivity.openMembershipPlans();
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str2, "login_activity")) {
                    popupAdFragment.startActivity(new Intent(popupAdFragment.requireContext(), (Class<?>) LoginActivity.class));
                    popupAdFragment.dismiss();
                    return;
                }
                String str3 = popupAdFragment.f69774OooOo;
                if (str3 == null) {
                    str = "https://notein.cn/mobile/activity/act.html";
                } else {
                    int iHashCode = str3.hashCode();
                    if (iHashCode != -470220986) {
                        if (iHashCode != 336826209) {
                            if (iHashCode == 1986759828 && str3.equals("invite_friend")) {
                                str = "https://notein.cn/mobile/activity/invite_friend/invite.html";
                            }
                        } else if (str3.equals("experience_officer")) {
                            str = "https://help.note-in.com/215e/e0cd";
                        }
                    } else if (str3.equals("note_taking_contest")) {
                        str = "https://help.note-in.com/215e/a370";
                    }
                }
                Context contextRequireContext = popupAdFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C31101OooO0oo.OooO00o(contextRequireContext, str);
                popupAdFragment.dismiss();
            }
        });
        viewInflate.findViewById(com.orion.notein.global.R.id.close_button).setOnClickListener(new o0Oo0oo(this, 0));
        return viewInflate;
    }
}
