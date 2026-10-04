package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.models.User;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.search.SearchListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.TextUrlLinkDialogFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.p607ui.pay.aiquota.AiQuotaPayDialogFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import com.orion.notein.richeditor.effects.Effects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000o0O0.C24564OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0Ooooo0.ViewOnClickListenerC29697OooO00o;
import o0o0O0o.C30294OooO0OO;
import o0o0O0o0.C30296OooO00o;
import o0o0O0o0.C30306OooOO0o;
import o0o0OoO0.C30679OooO0oo;
import o0oOoO0.C31000OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0OOooo.C33163OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oo000o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100303OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100304OooOo0o;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f100304OooOo0o = i;
        this.f100303OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        final String string;
        int i = 2;
        Object obj = this.f100303OooOo;
        switch (this.f100304OooOo0o) {
            case 0:
                AddWaterMarkFragment addWaterMarkFragment = ((C23110OooO0oo) obj).f71794OooO0O0.get();
                if (addWaterMarkFragment != null) {
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(addWaterMarkFragment), null, null, new C28227OooO0Oo(addWaterMarkFragment, null), 3);
                    return;
                }
                return;
            case 1:
                FirebaseCreateUserPasswordFragment firebaseCreateUserPasswordFragment = (FirebaseCreateUserPasswordFragment) obj;
                CheckBox checkBox = firebaseCreateUserPasswordFragment.f72230Oooo;
                if (checkBox != null) {
                    firebaseCreateUserPasswordFragment.Oooo00o(checkBox.isChecked());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAgree");
                    throw null;
                }
            case 2:
                TextStyleBox.OooO00o oooO00o = ((TextStyleBox) obj).f74155OoooO00;
                if (oooO00o != null) {
                    oooO00o.OooO0OO();
                    return;
                }
                return;
            case 3:
                View.OnClickListener onClickListener = ((PenBox) obj).colorSetFavoriteOnClick;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                final NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) obj;
                final List list = (List) noteListContainerFragment.OooOoo().f77172OooooOO.f121747OooOo0o.getValue();
                Context context = noteListContainerFragment.getContext();
                if (context == null) {
                    return;
                }
                if (list.size() == 1) {
                    string = ((NoteVO) oOo000Oo.OooOo.Oooo0oO(list)).getName();
                    if (C33599OooOo0O.Oooo0o0(string)) {
                        string = context.getString(R.string.app_name);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    }
                } else {
                    string = context.getString(R.string.export_multi_notes_name);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                }
                LockNoteFragment lockNoteFragmentOooOoo0 = noteListContainerFragment.OooOoo0();
                androidx.lifecycle.OooOo oooOoOooO00o = OooO0O0.OooO0o.OooO00o(noteListContainerFragment, "getViewLifecycleOwner(...)");
                List list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NoteVO) it.next()).getId());
                }
                final C33163OooO0oO c33163OooO0oO = (C33163OooO0oO) context;
                LockNoteFragment.OooOoo(lockNoteFragmentOooOoo0, oooOoOooO00o, arrayList, new oO0O000o.OooO00o() { // from class: o0o00oo.OooO0o
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        NoteListContainerFragment noteListContainerFragment2 = noteListContainerFragment;
                        C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(noteListContainerFragment2, "getViewLifecycleOwner(...)"), null, null, new C30112OooOOoo(c33163OooO0oO, list, string, noteListContainerFragment2, null), 3);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return;
            case 5:
                SearchListContainerFragment searchListContainerFragment = (SearchListContainerFragment) obj;
                C30294OooO0OO c30294OooO0OO = searchListContainerFragment.f77990Oooo0;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                c30294OooO0OO.OooO00o();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                C30296OooO00o c30296OooO00oOooOoOO = searchListContainerFragment.OooOoOO();
                com.orion.notein.p607ui.p609vo.OooO00o key = ((SortKeyVO) tag).getKey();
                kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c30296OooO00oOooOoOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30306OooOO0o(c30296OooO00oOooOoOO, key, null), 2);
                return;
            case 6:
                C21030OooOO0o.OooO0OO((AiQuotaPayDialogFragment) obj).OooOOo0();
                return;
            case 7:
                ((NoteEditorSwitchFragment) obj).OooOoOO();
                return;
            case 8:
                UserSettingFragment userSettingFragment = (UserSettingFragment) obj;
                User user = (User) userSettingFragment.OooOoOO().f90225OooOoO.f121747OooOo0o.getValue();
                if (user != null) {
                    String password = user.getPassword();
                    if (password != null && password.length() != 0) {
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(userSettingFragment), new C24564OooO00o(R.id.action_userSettingFragment_to_ConfirmPasswordFragment));
                        return;
                    }
                    String mobile = user.getMobile();
                    if (mobile.length() == 0) {
                        String string2 = userSettingFragment.getString(R.string.bind_phone);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        String string3 = userSettingFragment.getString(R.string.please_bind_phone_before_set_password);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        userSettingFragment.OooOooO(string2, string3, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC29697OooO00o(userSettingFragment, i));
                        return;
                    }
                    String region = user.getRegion();
                    if (region == null) {
                        region = "86";
                    }
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(userSettingFragment), new C31000OooO0oo(region, mobile));
                    return;
                }
                return;
            default:
                TextUrlLinkDialogFragment textUrlLinkDialogFragment = (TextUrlLinkDialogFragment) obj;
                EditText editText = textUrlLinkDialogFragment.f78412Oooo0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                C30679OooO0oo c30679OooO0oo = textUrlLinkDialogFragment.f78417Oooo0OO;
                if (c30679OooO0oo != null) {
                    String url = text.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(url, "url");
                    AiOcrRichEditor aiOcrRichEditor = c30679OooO0oo.f109753OooO00o.f78424OooOoO0;
                    if (aiOcrRichEditor != null) {
                        aiOcrRichEditor.applyEffect(Effects.LINK, url, false);
                    }
                }
                Dialog dialog = textUrlLinkDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
