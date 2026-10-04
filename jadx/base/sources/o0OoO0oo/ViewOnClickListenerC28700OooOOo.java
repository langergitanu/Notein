package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.JumpToPageDialogFragment;
import com.orion.notein.p607ui.noteeditor.addpage.popup.ThemeActionsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import o0O0oooO.C26349o00o0O;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0OoOO.C28987OooO0OO;
import o0OoOOO0.C29048OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28700OooOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101698OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101699OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28700OooOOo(Object obj, int i) {
        this.f101699OooOo0o = i;
        this.f101698OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        switch (this.f101699OooOo0o) {
            case 0:
                Dialog dialog = ((JumpToPageDialogFragment) this.f101698OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                ((C29048OooO0oo) this.f101698OooOo).getClass();
                return;
            case 2:
                final MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f101698OooOo;
                C28987OooO0OO c28987OooO0OO = myTemplateFragment.f78622Oooo000;
                if (c28987OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("themeMoreMenu");
                    throw null;
                }
                synchronized (c28987OooO0OO) {
                    try {
                        ThemeActionsBottomSheetDialog themeActionsBottomSheetDialog = c28987OooO0OO.f102725OooO0OO;
                        if (themeActionsBottomSheetDialog != null) {
                            themeActionsBottomSheetDialog.dismissAllowingStateLoss();
                        } else if (c28987OooO0OO.f102727OooO0o) {
                            PopupWindow popupWindow = c28987OooO0OO.f102726OooO0Oo;
                            if (popupWindow == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                                throw null;
                            }
                            popupWindow.dismiss();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object tag = view.getTag();
                final ThemeVO themeVO = tag instanceof ThemeVO ? (ThemeVO) tag : null;
                myTemplateFragment.OooOoO0(1, new oO0O000o.OooO00o() { // from class: o0o0OOO.OooOOoo
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        final String myTemplateId;
                        String myTemplateId2;
                        int id = view.getId();
                        final MyTemplateFragment myTemplateFragment2 = myTemplateFragment;
                        ThemeVO themeVO2 = themeVO;
                        if (id != R.id.item_delete) {
                            if (id == R.id.item_rename && themeVO2 != null && (myTemplateId2 = themeVO2.getMyTemplateId()) != null) {
                                String displayName = themeVO2.getDisplayName();
                                if (displayName == null) {
                                    displayName = "";
                                }
                                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(myTemplateFragment2), new C30504OoooO0O(myTemplateId2, displayName));
                            }
                        } else if (themeVO2 != null && (myTemplateId = themeVO2.getMyTemplateId()) != null) {
                            String string = myTemplateFragment2.getString(R.string.tips);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            String string2 = myTemplateFragment2.getString(R.string.tips_delete_my_templates);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                            TipsDialogFragment tipsDialogFragment = new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new View.OnClickListener() { // from class: o0o0OOO.OooOo0O
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C30520o000000o c30520o000000oOooOooo = myTemplateFragment2.OooOooo();
                                    c30520o000000oOooOooo.getClass();
                                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c30520o000000oOooOooo), null, null, new C30542ooOO(myTemplateId, null, c30520o000000oOooOooo), 3);
                                }
                            });
                            if (myTemplateFragment2.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                                tipsDialogFragment.show(myTemplateFragment2.getChildFragmentManager(), "TipsDialogFragment");
                            }
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return;
            default:
                FirebaseUserInfoFragment firebaseUserInfoFragment = (FirebaseUserInfoFragment) this.f101698OooOo;
                firebaseUserInfoFragment.getClass();
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(firebaseUserInfoFragment), new C26349o00o0O(null));
                return;
        }
    }
}
