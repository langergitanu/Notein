package o0OoOOoO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.ruler.SetRulerAngleDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.settings.stylus.GlobalStylusShortcutFragment;
import com.orion.notein.p607ui.settings.stylus.OooO00o;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.o000O00O;
import o0oOOoOo.C30849OooO0O0;
import o0oOOoOo.C30855OooO0oO;
import o0oOOoOo.C30856OooO0oo;
import o0oOoOo.AbstractC31059OooOooo;
import o0oOoOo.C31077OoooOOo;
import o0oOoOoO.C31096OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoOOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29187OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103518OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103519OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29187OooO00o(Object obj, int i) {
        this.f103519OooOo0o = i;
        this.f103518OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f103518OooOo;
        switch (this.f103519OooOo0o) {
            case 0:
                Object tag = view.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.StickerCollectionVO");
                C31077OoooOOo c31077OoooOOo = (C31077OoooOOo) tag;
                o0O000o.OooO0O0 oooO0O0 = ((C29192OooO0o0) obj).f103527OooO0O0;
                boolean z = c31077OoooOOo.f110910OooO0o;
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) oooO0O0.f88129OooO00o;
                if (z) {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), new o000O00O(new Uri[0]));
                    return;
                } else {
                    baseToolbarChildFragment.Oooo0oO().OooO0o0(c31077OoooOOo.f110906OooO00o);
                    return;
                }
            case 1:
                ((SetRulerAngleDialogFragment) obj).Oooo00o();
                return;
            case 2:
                Context contextRequireContext = ((UserAboutDialogFragment) obj).requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31096OooO0OO(contextRequireContext, null), 3);
                return;
            case 3:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((TrashBinContainerFragment) obj), new C24564OooO00o(R.id.action_trashBinContainerFragment_to_clearTrashBinDialogFragment));
                return;
            default:
                Object tag2 = view.getTag();
                OooO00o.OooO0O0.C19507OooO0O0 c19507OooO0O0 = tag2 instanceof OooO00o.OooO0O0.C19507OooO0O0 ? (OooO00o.OooO0O0.C19507OooO0O0) tag2 : null;
                if (c19507OooO0O0 == null) {
                    return;
                }
                AbstractC31059OooOooo abstractC31059OooOooo = c19507OooO0O0.f79305OooO0O0.f110894OooO0OO;
                boolean z2 = abstractC31059OooOooo instanceof AbstractC31059OooOooo.OooO00o;
                C22026ooOO c22026ooOO = ((GlobalStylusShortcutFragment) obj).f79283OooOoo0;
                if (z2) {
                    C30849OooO0O0 c30849OooO0O0 = (C30849OooO0O0) c22026ooOO.getValue();
                    AbstractC31059OooOooo.OooO00o oooO00o = (AbstractC31059OooOooo.OooO00o) abstractC31059OooOooo;
                    AbstractC24338OooO0o0.OooO00o<Integer> key = oooO00o.f110886OooO00o;
                    OooOOO0.OooO0oO(key, "key");
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30849OooO0O0);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30855OooO0oO(c30849OooO0O0, key, oooO00o.f110887OooO0O0, null), 2);
                    return;
                }
                if (!(abstractC31059OooOooo instanceof AbstractC31059OooOooo.OooO0O0)) {
                    throw new C32442OooOO0o();
                }
                C30849OooO0O0 c30849OooO0O02 = (C30849OooO0O0) c22026ooOO.getValue();
                AbstractC31059OooOooo.OooO0O0 oooO0O02 = (AbstractC31059OooOooo.OooO0O0) abstractC31059OooOooo;
                String preferenceName = oooO0O02.f110889OooO00o;
                OooOOO0.OooO0oO(preferenceName, "preferenceName");
                String value = oooO0O02.f110890OooO0O0;
                OooOOO0.OooO0oO(value, "value");
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30849OooO0O02), null, null, new C30856OooO0oo(c30849OooO0O02, preferenceName, value, null), 3);
                return;
        }
    }
}
