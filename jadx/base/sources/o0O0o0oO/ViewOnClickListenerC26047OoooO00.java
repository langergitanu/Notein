package o0O0o0oO;

import Oooo0.C20857Oooooo;
import android.view.View;
import com.aspose.words.EditingLanguage;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import o0Ooo0O.C29375OooO00o;
import o0oOoOo.C31049OooOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0o0oO.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26047OoooO00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88932OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88933OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26047OoooO00(Object obj, int i) {
        this.f88933OooOo0o = i;
        this.f88932OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88933OooOo0o) {
            case 0:
                NoteInContextMenu noteInContextMenu = (NoteInContextMenu) this.f88932OooOo;
                noteInContextMenu.f69376OooOo.smoothScrollTo(C20857Oooooo.OooO0O0(noteInContextMenu.getContext(), EditingLanguage.FAEROESE), 0);
                break;
            case 1:
                ((ExportBottomSheetFragment) this.f88932OooOo).OooOooo().OooOO0(2);
                break;
            case 2:
                C29375OooO00o.InterfaceC19985OooO00o interfaceC19985OooO00o = ((C29375OooO00o) this.f88932OooOo).f104160OooO0O0;
                if (interfaceC19985OooO00o != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    interfaceC19985OooO00o.OooO0OO(view);
                }
                break;
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteFilterVO");
                C31049OooOo0 c31049OooOo0 = (C31049OooOo0) tag;
                NoteFilterBottomSheetDialog noteFilterBottomSheetDialog = (NoteFilterBottomSheetDialog) this.f88932OooOo;
                InterfaceC32507OooOO0o<? super Integer, C32460OooOooO> interfaceC32507OooOO0o = noteFilterBottomSheetDialog.f77824OooOoOO;
                if (interfaceC32507OooOO0o != null) {
                    interfaceC32507OooOO0o.invoke(Integer.valueOf(c31049OooOo0.f110853OooO00o));
                }
                noteFilterBottomSheetDialog.dismiss();
                break;
        }
    }
}
