package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.page.PagePaddingStyle;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment.OooO0OO;
import com.orion.penkit.models.TextBoxInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o0o.C28226OooO0OO;
import o0Oo0oO0.C28293OooO0o;
import o0Ooo0Oo.C29406OooO0OO;
import o0Ooo0o.C29415OooO0o;
import o0Ooo0oO.C29423OooO00o;
import o0Ooo0oO.C29429OooO0O0;
import o0Ooo0oO.C29432OooO0o;
import o0oOOO0o.C30832OooOO0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0OO00O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89002OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89003OooOo0o;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f89003OooOo0o = i;
        this.f89002OooOo = obj;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.lifecycle.OooOo, void] */
    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.fragment.app.Fragment, com.orion.notein.ui.notelist.documents.NoteListContainerFragment, java.lang.String] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        int i2 = 1;
        Object obj = this.f89002OooOo;
        switch (this.f89003OooOo0o) {
            case 0:
                ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = (ViewOnAttachStateChangeListenerC26064o000000o) obj;
                TextBoxInfo textBoxInfo = viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o;
                if (textBoxInfo != null) {
                    viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO0Oo(textBoxInfo);
                    return;
                }
                return;
            case 1:
                AddWaterMarkFragment addWaterMarkFragment = ((C23110OooO0oo) obj).f71794OooO0O0.get();
                if (addWaterMarkFragment != null) {
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(addWaterMarkFragment), null, null, new C28226OooO0OO(addWaterMarkFragment, null), 3);
                    return;
                }
                return;
            case 2:
                TextStyleBox.OooO0O0((TextStyleBox) obj, view);
                return;
            case 3:
                C29415OooO0o c29415OooO0o = (C29415OooO0o) obj;
                if (c29415OooO0o.f104317OooOO0O) {
                    C30832OooOO0O c30832OooOO0O = c29415OooO0o.f104319OooOOO0;
                    if (c30832OooOO0O != null) {
                        int i3 = c29415OooO0o.f104318OooOO0o;
                        PagePaddingFragment pagePaddingFragment = c30832OooOO0O.f110182OooO00o;
                        C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c29423OooO00oOooOooO);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29429OooO0O0(c29423OooO00oOooOooO, i3, null), 2);
                        pagePaddingFragment.OooOooO().OooOOOO(i3);
                        C29415OooO0o c29415OooO0o2 = pagePaddingFragment.f74941Ooooo0o;
                        if (c29415OooO0o2 != null) {
                            c29415OooO0o2.f104309OooO0O0.dismiss();
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("pagePaddingColorPicker");
                            throw null;
                        }
                    }
                    return;
                }
                C30832OooOO0O c30832OooOO0O2 = c29415OooO0o.f104319OooOOO0;
                if (c30832OooOO0O2 != null) {
                    int i4 = c29415OooO0o.f104318OooOO0o;
                    PagePaddingFragment pagePaddingFragment2 = c30832OooOO0O2.f110182OooO00o;
                    C29415OooO0o c29415OooO0o3 = pagePaddingFragment2.f74941Ooooo0o;
                    if (c29415OooO0o3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pagePaddingColorPicker");
                        throw null;
                    }
                    c29415OooO0o3.f104309OooO0O0.dismiss();
                    List list = (List) pagePaddingFragment2.OooOooO().f104380OooOo0o.f121747OooOo0o.getValue();
                    Iterator it = list.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                        } else if (((C29406OooO0OO) it.next()).f104279OooO00o != i4) {
                            i5++;
                        }
                    }
                    if (i5 == -1) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                i5 = -1;
                            } else if (((C29406OooO0OO) it2.next()).f104280OooO0O0) {
                                i5 = i;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (i5 == -1) {
                        return;
                    }
                    if (((C29406OooO0OO) list.get(i5)).f104280OooO0O0) {
                        C29406OooO0OO c29406OooO0OO = (C29406OooO0OO) oOo000Oo.OooOo.OoooO00(i5 + 1, list);
                        C29406OooO0OO c29406OooO0OO2 = (C29406OooO0OO) oOo000Oo.OooOo.OoooO00(i5 - 1, list);
                        if (c29406OooO0OO != null) {
                            pagePaddingFragment2.OooOooO().OooOOOO(c29406OooO0OO.f104279OooO00o);
                        } else if (c29406OooO0OO2 != null) {
                            pagePaddingFragment2.OooOooO().OooOOOO(c29406OooO0OO2.f104279OooO00o);
                        }
                    }
                    if (list.size() > 1) {
                        C29423OooO00o c29423OooO00oOooOooO2 = pagePaddingFragment2.OooOooO();
                        int i6 = ((C29406OooO0OO) list.get(i5)).f104279OooO00o;
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = androidx.lifecycle.o0OoOo0.OooO00o(c29423OooO00oOooOooO2);
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29432OooO0o(c29423OooO00oOooOooO2, i6, null), 2);
                        PagePaddingStyle pagePaddingStyle = (PagePaddingStyle) c29423OooO00oOooOooO2.f104369OooOOO.getValue();
                        LambdaPaperTheme lambdaPaperThemeOooOO0o = pagePaddingStyle == null ? null : C29423OooO00o.OooOO0o(pagePaddingStyle);
                        PaperTheme baseTheme = lambdaPaperThemeOooOO0o != null ? lambdaPaperThemeOooOO0o.getBaseTheme() : null;
                        if ((baseTheme instanceof ColorPaperTheme ? ((ColorPaperTheme) baseTheme).getColor() : -1) == i6) {
                            Integer num = (Integer) oOo000Oo.OooOo.Oooo((List) c29423OooO00oOooOooO2.f104370OooOOO0.f121747OooOo0o.getValue());
                            c29423OooO00oOooOooO2.OooOOOO(num != null ? num.intValue() : -1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                PenBox penBox = (PenBox) obj;
                ImageView imageView = penBox.f76783o00ooo;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserPixel");
                    throw null;
                }
                imageView.setSelected(true);
                ImageView imageView2 = penBox.f76792oo000o;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserStroke");
                    throw null;
                }
                imageView2.setSelected(false);
                ImageView imageView3 = penBox.f76782o00oO0o;
                if (imageView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserLasso");
                    throw null;
                }
                imageView3.setSelected(false);
                PenBox.OooO00o oooO00o = penBox.eraserTypeListener;
                if (oooO00o != null) {
                    oooO00o.OooO0O0(DrawToolFactory.ERASER_TYPE_PIXEL);
                    return;
                }
                return;
            case 5:
                ?? r5 = (NoteListContainerFragment) obj;
                LockNoteFragment lockNoteFragmentOooOoo0 = r5.OooOoo0();
                ?? PutString = Bundle.putString(r5, "getViewLifecycleOwner(...)");
                Iterable iterable = (Iterable) r5.OooOoo().f77172OooooOO.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((NoteVO) it3.next()).getId());
                }
                LockNoteFragment.OooOoo(lockNoteFragmentOooOoo0, PutString, arrayList, new C28293OooO0o(r5, i2));
                return;
            case 6:
                NoteEditorSwitchFragment noteEditorSwitchFragment = (NoteEditorSwitchFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = noteEditorSwitchFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, noteEditorSwitchFragment.new OooO0OO(null), 3);
                return;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((UserSettingFragment) obj), new C24564OooO00o(R.id.action_userSettingFragment_to_deleteAccountAgreementFragment));
                return;
        }
    }
}
