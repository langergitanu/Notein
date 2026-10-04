package o0Ooo;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import o0o00o0O.C29952OooO0oo;
import o0o00oO0.C29998OooOo0O;
import o0o0O0.C30183OooO0oo;
import o0o0O00.C30201OooOOO0;
import o0oOoOo.C31040OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29259OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103757OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103758OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f103759OooOoO0;

    public /* synthetic */ ViewOnClickListenerC29259OooO0oO(int i, Object obj, Object obj2) {
        this.f103758OooOo0o = i;
        this.f103757OooOo = obj;
        this.f103759OooOoO0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f103759OooOoO0;
        Object obj2 = this.f103757OooOo;
        switch (this.f103758OooOo0o) {
            case 0:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenWidthVO");
                PenWidthVO penWidthVO = (PenWidthVO) tag;
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj2;
                if (!penWidthVO.getSelected()) {
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o((InterfaceC21987OooOoo) obj);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29280Oooo(penBoxChildFragment, penWidthVO, null), 2);
                } else if (penWidthVO.getType() != 3) {
                    Integer num = (Integer) penBoxChildFragment.Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (penBoxChildFragment.f75399o00000Oo == null) {
                            Context contextRequireContext = penBoxChildFragment.requireContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                            C29952OooO0oo c29952OooO0oo = new C29952OooO0oo(contextRequireContext);
                            c29952OooO0oo.f106375OooO0o0 = (PenBox.InterfaceC23607OooO0oO) penBoxChildFragment.f75413o0Oo0oo.getValue();
                            penBoxChildFragment.f75399o00000Oo = c29952OooO0oo;
                        }
                        C29952OooO0oo c29952OooO0oo2 = penBoxChildFragment.f75399o00000Oo;
                        if (c29952OooO0oo2 != null) {
                            c29952OooO0oo2.OooO0Oo(iIntValue, view);
                        }
                    }
                } else {
                    if (penBoxChildFragment.f75400o00000o0 == null) {
                        Context contextRequireContext2 = penBoxChildFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                        com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = new com.orion.notein.p607ui.noteeditor.toolbox.OooO00o(contextRequireContext2);
                        oooO00o.f76733OooO0o0 = (PenBox.InterfaceC23607OooO0oO) penBoxChildFragment.f75413o0Oo0oo.getValue();
                        penBoxChildFragment.f75400o00000o0 = oooO00o;
                    }
                    com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o2 = penBoxChildFragment.f75400o00000o0;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO0O0(view);
                    }
                }
                break;
            default:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.FolderColorVO");
                C31040OooOO0o c31040OooOO0o = (C31040OooOO0o) tag2;
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) obj2;
                NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO != null) {
                    C30201OooOOO0 c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO;
                    if (c30201OooOOO0 != null) {
                        c30201OooOOO0.OooO0OO(c31040OooOO0o.f110821OooO00o, noteVO.getId());
                    }
                    NoteVO noteVOCopy$default = NoteVO.copy$default(noteVO, null, null, null, null, null, null, 0, 0, null, false, 0L, 0L, false, false, false, 0, 0, null, null, null, null, null, null, c31040OooOO0o.f110821OooO00o, null, false, false, 0L, false, null, false, 2139095039, null);
                    c30183OooO0oo.f107461OooO0O0 = noteVOCopy$default;
                    C30201OooOOO0 c30201OooOOO02 = c30183OooO0oo.f107462OooO0OO;
                    if (c30201OooOOO02 != null) {
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(noteVOCopy$default);
                        c30201OooOOO02.OooO0O0(noteVOCopy$default, new C29998OooOo0O((o0o0O000.OooO0OO) obj, 1));
                    }
                }
                break;
        }
    }
}
