package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.NewCommentDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.settings.gesture.GlobalGestureSettingsFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserSettingsFragment;
import com.orion.notein.ui.export.ExportBottomSheetFragment.OooO;
import java.util.Set;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.o0000OOO;
import o0OoO0.C28513OooO0oO;
import o0OoO0oo.C28698OooOOOO;
import o0oOoOo.C31044OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0Oo0o0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28223OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100053OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100054OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28223OooO(Object obj, int i) {
        this.f100054OooOo0o = i;
        this.f100053OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100053OooOo;
        switch (this.f100054OooOo0o) {
            case 0:
                ExportBottomSheetFragment exportBottomSheetFragment = (ExportBottomSheetFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = exportBottomSheetFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, exportBottomSheetFragment.new OooO(null), 3);
                break;
            case 1:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.ImageVO");
                C31044OooOOOo c31044OooOOOo = (C31044OooOOOo) tag;
                BaseToolbarChildFragment baseToolbarChildFragment = ((o0OoO.OooO0o) obj).f101031OooO00o.f105794OooO00o;
                boolean zBooleanValue = ((Boolean) baseToolbarChildFragment.Oooo0o0().f101692OooO0o.getValue()).booleanValue();
                Uri uri = c31044OooOOOo.f110841OooO00o;
                if (!zBooleanValue) {
                    baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                    baseToolbarChildFragment.OooooOO(25, com.facebook.soloader.OooOo.OooO0oO(uri));
                } else if (c31044OooOOOo.f110842OooO0O0) {
                    C28698OooOOOO c28698OooOOOOOooo0o0 = baseToolbarChildFragment.Oooo0o0();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
                    C33781o00o0O c33781o00o0O = c28698OooOOOOOooo0o0.f101695OooO0oo;
                    Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O.getValue());
                    setO0Oo0oo.remove(uri);
                    c33781o00o0O.OooOO0(null, setO0Oo0oo);
                } else if (((Set) baseToolbarChildFragment.Oooo0o0().f101690OooO.getValue()).size() < 9) {
                    C28698OooOOOO c28698OooOOOOOooo0o02 = baseToolbarChildFragment.Oooo0o0();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
                    C33781o00o0O c33781o00o0O2 = c28698OooOOOOOooo0o02.f101695OooO0oo;
                    Set setO0Oo0oo2 = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O2.getValue());
                    setO0Oo0oo2.add(uri);
                    c33781o00o0O2.OooOO0(null, setO0Oo0oo2);
                } else {
                    Context context = baseToolbarChildFragment.getContext();
                    if (context != null) {
                        C28513OooO0oO.OooO00o(context, R.string.popup_add_pic_reach_max_count, "getString(...)", context);
                    }
                }
                break;
            case 2:
                Dialog dialog = ((NewCommentDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 3:
                C21030OooOO0o.OooO0OO((GlobalGestureSettingsFragment) obj).OooOOO0(R.id.f57945x75d75f2d, null, null);
                break;
            default:
                FirebaseUserSettingsFragment firebaseUserSettingsFragment = (FirebaseUserSettingsFragment) obj;
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) firebaseUserSettingsFragment.f79737OooOoo0.getValue();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c26320o0000OoO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0000OOO(null, c26320o0000OoO), 2);
                C21030OooOO0o.OooO0OO(firebaseUserSettingsFragment).OooOOo(R.id.noteListContainerFragment, false);
                break;
        }
    }
}
