package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.FirebaseNetworkException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.orion.notein.domain.models.User;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.TextUrlLinkDialogFragment;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import o000o0O0.C24564OooO00o;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28038OooO0Oo;
import o0o0OOo0.C30549OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101130OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101131OooOo0o;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f101131OooOo0o = i;
        this.f101130OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101130OooOo;
        switch (this.f101131OooOo0o) {
            case 0:
                final FirebaseCreateUserPasswordFragment firebaseCreateUserPasswordFragment = (FirebaseCreateUserPasswordFragment) obj;
                CheckBox checkBox = firebaseCreateUserPasswordFragment.f72230Oooo;
                if (checkBox == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAgree");
                    throw null;
                }
                if (!checkBox.isChecked()) {
                    String string = firebaseCreateUserPasswordFragment.getString(R.string.please_agree_terms_and_privacy);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    firebaseCreateUserPasswordFragment.Oooo0o0(0L, string);
                    return;
                }
                EditText editText = firebaseCreateUserPasswordFragment.f72238Oooo0o0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                String string2 = editText.getText().toString();
                if (!firebaseCreateUserPasswordFragment.Oooo0(string2)) {
                    ViewGroup viewGroup = firebaseCreateUserPasswordFragment.f72242OoooO0;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("passwordRequirements");
                        throw null;
                    }
                }
                OooO oooO = (OooO) firebaseCreateUserPasswordFragment.f72232Oooo000.getValue();
                ((C26320o0000OoO) firebaseCreateUserPasswordFragment.f72233Oooo00O.getValue()).OooO();
                TextView textView = firebaseCreateUserPasswordFragment.f72239Oooo0oO;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView.setEnabled(false);
                TextView textView2 = firebaseCreateUserPasswordFragment.f72239Oooo0oO;
                if (textView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView2.setText("");
                CircularProgressIndicator circularProgressIndicator = firebaseCreateUserPasswordFragment.f72240Oooo0oo;
                if (circularProgressIndicator == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnContinue");
                    throw null;
                }
                circularProgressIndicator.setVisibility(0);
                ((C28560OoooOOO) firebaseCreateUserPasswordFragment.f72234Oooo00o.getValue()).f101228OooOO0.createUserWithEmailAndPassword(oooO.f101122OooO00o, string2).addOnCompleteListener(firebaseCreateUserPasswordFragment.requireActivity(), new OnCompleteListener() { // from class: o0OoO000.OooO0oO
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
                        FirebaseCreateUserPasswordFragment firebaseCreateUserPasswordFragment2 = firebaseCreateUserPasswordFragment;
                        TextView textView3 = firebaseCreateUserPasswordFragment2.f72239Oooo0oO;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                            throw null;
                        }
                        textView3.setEnabled(true);
                        TextView textView4 = firebaseCreateUserPasswordFragment2.f72239Oooo0oO;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                            throw null;
                        }
                        textView4.setText(firebaseCreateUserPasswordFragment2.getString(R.string._continue));
                        CircularProgressIndicator circularProgressIndicator2 = firebaseCreateUserPasswordFragment2.f72240Oooo0oo;
                        if (circularProgressIndicator2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnContinue");
                            throw null;
                        }
                        circularProgressIndicator2.setVisibility(8);
                        if (task.isSuccessful()) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("FirebasePasswordFragment");
                            c20358OooO00o.OooO00o("createUserWithEmail:success", new Object[0]);
                            C21989OooOooO.OooO00o(firebaseCreateUserPasswordFragment2).OooO0O0(new C28528OooO0oo(firebaseCreateUserPasswordFragment2, null));
                            return;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("FirebasePasswordFragment");
                        c20358OooO00o2.OooOO0o(task.getException(), "createUserWithEmail:failure", new Object[0]);
                        if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                            firebaseCreateUserPasswordFragment2.Oooo0O0(1008);
                        } else if (task.getException() instanceof FirebaseNetworkException) {
                            firebaseCreateUserPasswordFragment2.Oooo0O0(1002);
                        } else {
                            firebaseCreateUserPasswordFragment2.Oooo0O0(1005);
                        }
                    }
                });
                return;
            case 1:
                TextStyleBox.OooO00o oooO00o = ((TextStyleBox) obj).f74155OoooO00;
                if (oooO00o != null) {
                    oooO00o.OooO0OO();
                    return;
                }
                return;
            case 2:
                int i = PenBox.f76736o000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                if (penColorVO.getEnable()) {
                    PenBox penBox = (PenBox) obj;
                    if (!penColorVO.getSelected()) {
                        View.OnClickListener onClickListener = penBox.penColorItemClickListener;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                            return;
                        }
                        return;
                    }
                    o0o00Ooo.OooOO0 oooOO02 = penBox.f76774OoooooO;
                    Context context = penBox.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                    if (C28038OooO0Oo.OooO0O0(context)) {
                        oooOO02.OooO0oo(penBox, penColorVO);
                        return;
                    }
                    oooOO02.OooO0o(penColorVO);
                    View contentView = oooOO02.OooO0OO().getContentView();
                    contentView.measure(o0o00Ooo.OooOO0.OooO0Oo(oooOO02.OooO0OO().getWidth()), o0o00Ooo.OooOO0.OooO0Oo(oooOO02.OooO0OO().getHeight()));
                    int width = (penBox.getWidth() - contentView.getMeasuredWidth()) / 2;
                    switch (penBox.getCom.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String()) {
                        case 0:
                            oooOO02.OooO0OO().showAtLocation(penBox, 51, width, Oooo0.o000000O.OooO0o(70));
                            return;
                        case 1:
                            oooOO02.OooO0OO().showAtLocation(penBox, 49, 0, Oooo0.o000000O.OooO0o(70));
                            return;
                        case 2:
                            oooOO02.OooO0OO().showAtLocation(penBox, 53, width, Oooo0.o000000O.OooO0o(70));
                            return;
                        case 3:
                            oooOO02.OooO0OO().showAtLocation(penBox, 21, Oooo0.o000000O.OooO0o(70), 0);
                            return;
                        case 4:
                            oooOO02.OooO0OO().showAtLocation(penBox, 85, width, Oooo0.o000000O.OooO0o(70));
                            return;
                        case 5:
                            oooOO02.OooO0OO().showAtLocation(penBox, 81, 0, Oooo0.o000000O.OooO0o(70));
                            return;
                        case 6:
                            oooOO02.OooO0OO().showAtLocation(penBox, 83, width, Oooo0.o000000O.OooO0o(70));
                            return;
                        case 7:
                            oooOO02.OooO0OO().showAtLocation(penBox, 19, Oooo0.o000000O.OooO0o(70), 0);
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 3:
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListContainerFragment");
                c20358OooO00o.OooO0o0("finish select button clicked: select finish", new Object[0]);
                ((NoteListContainerFragment) obj).OooOoo().Oooo000(0);
                return;
            case 4:
                ViewOnClickListenerC26091OooO00o viewOnClickListenerC26091OooO00o = ((C30549OooO0OO) obj).f109275OooO0O0;
                if (viewOnClickListenerC26091OooO00o != null) {
                    viewOnClickListenerC26091OooO00o.onClick(view);
                    return;
                }
                return;
            case 5:
                UserSettingFragment userSettingFragment = (UserSettingFragment) obj;
                User user = (User) userSettingFragment.OooOoOO().f90225OooOoO.f121747OooOo0o.getValue();
                if (user != null) {
                    if ((user.getMobile().length() == 0 ? user : null) != null) {
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(userSettingFragment), new C24564OooO00o(R.id.action_userSettingFragment_toUserBindPhoneFragment));
                        return;
                    }
                }
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(userSettingFragment), new C24564OooO00o(R.id.action_userSettingFragment_to_requestOldPhoneCodeFragment));
                return;
            default:
                Dialog dialog = ((TextUrlLinkDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
