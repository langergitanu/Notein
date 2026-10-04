package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.FirebaseNetworkException;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.entry.LoginTipsDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserResetPasswordFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import com.orion.notein.p607ui.noteeditor.NoteLockedDialogFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o000Oo0O.C24529OooOo0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24587OooOoo;
import o00o00Oo.C25261OooO0o0;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28960o00oOoO0;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;
import o0o0O00.C30202OooOOOO;
import o0o0OO.C30367OooO0o0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoO000.o0000oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28591o0000oOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101332OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101333OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28591o0000oOO(Object obj, int i) {
        this.f101333OooOo0o = i;
        this.f101332OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LockNoteFragment lockNoteFragment;
        C30201OooOOO0 c30201OooOOO0;
        C24583OooOo0o c24583OooOo0o;
        switch (this.f101333OooOo0o) {
            case 0:
                final FirebaseUserResetPasswordFragment firebaseUserResetPasswordFragment = (FirebaseUserResetPasswordFragment) this.f101332OooOo;
                EditText editText = firebaseUserResetPasswordFragment.f72415Oooo0o0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etEmail");
                    throw null;
                }
                String string = C33599OooOo0O.Oooooo0(editText.getText().toString()).toString();
                if (string.length() == 0) {
                    EditText editText2 = firebaseUserResetPasswordFragment.f72415Oooo0o0;
                    if (editText2 != null) {
                        editText2.setError(firebaseUserResetPasswordFragment.getString(R.string.error_wrong_email_format));
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etEmail");
                        throw null;
                    }
                }
                TextView textView = firebaseUserResetPasswordFragment.f72409Oooo0;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView.setEnabled(false);
                TextView textView2 = firebaseUserResetPasswordFragment.f72409Oooo0;
                if (textView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView2.setText("");
                CircularProgressIndicator circularProgressIndicator = firebaseUserResetPasswordFragment.f72413Oooo0O0;
                if (circularProgressIndicator == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnContinue");
                    throw null;
                }
                circularProgressIndicator.setVisibility(0);
                Task<Void> taskSendPasswordResetEmail = ((C28560OoooOOO) firebaseUserResetPasswordFragment.f72410Oooo000.getValue()).f101228OooOO0.sendPasswordResetEmail(string);
                final C28592o0000oOo c28592o0000oOo = new C28592o0000oOo(firebaseUserResetPasswordFragment, 0);
                taskSendPasswordResetEmail.addOnSuccessListener(new OnSuccessListener() { // from class: o0OoO000.o0000oo0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) throws Exception {
                        c28592o0000oOo.invoke(obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: o0OoO000.o0000ooO
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception it) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("FirebaseUserResetPasswordFragment");
                        c20358OooO00o.OooO0Oo(it, "Failed to send email.", new Object[0]);
                        boolean z = it instanceof FirebaseNetworkException;
                        FirebaseUserResetPasswordFragment firebaseUserResetPasswordFragment2 = firebaseUserResetPasswordFragment;
                        if (z) {
                            String string2 = firebaseUserResetPasswordFragment2.getString(R.string.network_error);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                            FirebaseUserResetPasswordFragment.Oooo00o(firebaseUserResetPasswordFragment2, string2);
                        } else {
                            String string3 = firebaseUserResetPasswordFragment2.getString(R.string.send_failed);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                            FirebaseUserResetPasswordFragment.Oooo00o(firebaseUserResetPasswordFragment2, string3);
                        }
                    }
                });
                return;
            case 1:
                NoteLockedDialogFragment noteLockedDialogFragment = (NoteLockedDialogFragment) this.f101332OooOo;
                Fragment fragmentOooOooo = noteLockedDialogFragment.getChildFragmentManager().OooOooo("LockNoteFragment");
                if (fragmentOooOooo != null) {
                    lockNoteFragment = (LockNoteFragment) fragmentOooOooo;
                } else {
                    lockNoteFragment = new LockNoteFragment();
                    FragmentManager childFragmentManager = noteLockedDialogFragment.getChildFragmentManager();
                    androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
                    oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
                    oooO00oOooO0OO.OooOO0O();
                }
                InterfaceC21987OooOoo viewLifecycleOwner = noteLockedDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                LockNoteFragment.OooOoo(lockNoteFragment, C21989OooOooO.OooO00o(viewLifecycleOwner), com.facebook.soloader.OooOo.OooO0oO(((C28960o00oOoO0) noteLockedDialogFragment.f73337OooOoOO.getValue()).f102614OooO00o), new C24529OooOo0(noteLockedDialogFragment, 1));
                return;
            case 2:
                ((LoginTipsDialogFragment) this.f101332OooOo).dismiss();
                return;
            case 3:
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) this.f101332OooOo;
                NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO == null || (c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO) == null) {
                    return;
                }
                InterfaceC21987OooOoo viewLifecycleOwner2 = c30201OooOOO0.f107547OooO00o.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30202OooOOOO(noteVO, null, c30201OooOOO0), 3);
                return;
            case 4:
                TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) this.f101332OooOo;
                NavEditorLayoutInfo navEditorLayoutInfoCopy$default = null;
                if (((Number) tiledPageListContainerFragment.Oooo000().f108345OooOo00.getValue()).intValue() == 0) {
                    C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(tiledPageListContainerFragment);
                    o000o0O0.OooOO0 oooOO0OooOO0O = c24572OooOO0oOooO0OO.OooOO0O();
                    if (oooOO0OooOO0O != null && (c24583OooOo0o = oooOO0OooOO0O.f83189OooOo) != null && c24583OooOo0o.f83302OooOooO == R.id.noteEditorContainerFragment) {
                        c24572OooOO0oOooO0OO.OooOOo0();
                        return;
                    }
                    C24587OooOoo c24587OooOoo = new C24587OooOoo(false, false, R.id.noteEditorContainerFragment, true, false, -1, -1, -1, -1);
                    NavEditorLayoutInfo navEditorLayoutInfo = tiledPageListContainerFragment.OooOooo().f108716OooO0OO;
                    if (navEditorLayoutInfo != null) {
                        List<String> noteIdList = navEditorLayoutInfo.getNoteIdList();
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(noteIdList, 10));
                        int i = 0;
                        for (Object obj : noteIdList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C34429OooOOo0.OooOOo();
                                throw null;
                            }
                            String str = (String) obj;
                            if (i == navEditorLayoutInfo.getFocusIndex()) {
                                str = (String) tiledPageListContainerFragment.Oooo000().f108338OooOOOO.getValue();
                            }
                            arrayList.add(str);
                            i = i2;
                        }
                        navEditorLayoutInfoCopy$default = NavEditorLayoutInfo.copy$default(navEditorLayoutInfo, arrayList, 0, null, 0, 14, null);
                    }
                    C28026OooO0OO.OooO0OO(c24572OooOO0oOooO0OO, C25261OooO0o0.OooO00o((String) tiledPageListContainerFragment.Oooo000().f108338OooOOOO.getValue(), navEditorLayoutInfoCopy$default), c24587OooOoo);
                    return;
                }
                if (!((List) tiledPageListContainerFragment.Oooo000().f108347OooOo0o.f121747OooOo0o.getValue()).isEmpty()) {
                    tiledPageListContainerFragment.Oooo000().OooOO0();
                    return;
                }
                List<TiledPagePreviewVOFilter> list = tiledPageListContainerFragment.f78539o000oOoO;
                if (list == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteTypeFilters");
                    throw null;
                }
                ViewPager2 viewPager2 = tiledPageListContainerFragment.f78536OoooO0O;
                if (viewPager2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
                    throw null;
                }
                TiledPagePreviewVOFilter tiledPagePreviewVOFilter = (TiledPagePreviewVOFilter) oOo000Oo.OooOo.OoooO00(viewPager2.getCurrentItem(), list);
                if (tiledPagePreviewVOFilter == null) {
                    return;
                }
                List<TiledPagePreviewVOFilter> list2 = tiledPageListContainerFragment.f78539o000oOoO;
                if (list2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteTypeFilters");
                    throw null;
                }
                boolean zEquals = tiledPagePreviewVOFilter.equals(list2.get(1));
                C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
                List list3 = (List) c30367OooO0o0Oooo000.f108346OooOo0O.f121747OooOo0o.getValue();
                if (list3 == null) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    TiledPagePreviewVO tiledPagePreviewVO = (TiledPagePreviewVO) obj2;
                    if (!zEquals || tiledPagePreviewVO.getHasComment()) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((TiledPagePreviewVO) it.next()).getId());
                }
                HashSet hashSetO00oO0o = oOo000Oo.OooOo.o00oO0o(arrayList3);
                C33781o00o0O c33781o00o0O = c30367OooO0o0Oooo000.f108340OooOOo;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, hashSetO00oO0o);
                return;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) this.f101332OooOo;
                o0o0O.OooO0O0 oooO0O0 = textRecognizeFragment.f78193Oooooo;
                if (oooO0O0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("quotaUsagePopupMenu");
                    throw null;
                }
                oooO0O0.OooO00o();
                if (view.getId() == R.id.btn_purchase_more) {
                    textRecognizeFragment.Oooo0o();
                    return;
                }
                return;
        }
    }
}
