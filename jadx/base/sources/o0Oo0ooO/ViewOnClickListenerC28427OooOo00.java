package o0Oo0ooO;

import Oooo0oO.C21030OooOO0o;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.stickers.edit.ExportStickerCollectionDialogFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoO0Oo.C28629OooO0O0;
import o0OoO0Oo.C28639OooOOO0;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30016OoooO;
import o0oOo00.C30930OooO0O0;
import o0oOo00.C30933OooO0o0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0ooO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28427OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100778OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100779OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28427OooOo00(Object obj, int i) {
        this.f100779OooOo0o = i;
        this.f100778OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PenBox.OooOOO0 oooOOO0;
        Object obj = this.f100778OooOo;
        switch (this.f100779OooOo0o) {
            case 0:
                ((com.orion.notein.p607ui.label.OooO0o) obj).f71993OooO0O0.OooO0Oo();
                break;
            case 1:
                com.orion.notein.p607ui.membership.plan.OooO00o oooO00o = (com.orion.notein.p607ui.membership.plan.OooO00o) obj;
                int childAdapterPosition = oooO00o.f72745OooO0Oo.getChildAdapterPosition(view);
                if (childAdapterPosition != -1) {
                    String productId = ((C28629OooO0O0) oooO00o.f72751OooOO0O.f66021OooO00o.f65811OooO0o.get(childAdapterPosition)).f101487OooO00o;
                    C28639OooOOO0 c28639OooOOO0 = oooO00o.f72744OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(productId, "productId");
                    C33781o00o0O c33781o00o0O = c28639OooOOO0.f101513OooO0o;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, productId);
                    oooO00o.f72753OooOOO0 = false;
                }
                C34406OooO00o.f123390OooO00o.OooO00o(C21532OooOOo.OooO0OO(childAdapterPosition, "commodity selected: "), new Object[0]);
                break;
            case 2:
                EditorSummaryFragment editorSummaryFragment = (EditorSummaryFragment) obj;
                if (((Number) ((C32443OooOOO) editorSummaryFragment.OooOoOO().f75603OooOOOo.f121747OooOo0o.getValue()).f116638OooOo0o).intValue() > 0) {
                    editorSummaryFragment.OooOoO(true);
                } else if (editorSummaryFragment.OooOoOO().f75616OooOoo0.get()) {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorSummaryFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_aiQuotaPayDialogFragment));
                }
                break;
            case 3:
                C29936OooO0oO c29936OooO0oO = ((C30016OoooO) obj).f106675OooOo;
                if (c29936OooO0oO != null && (oooOOO0 = c29936OooO0oO.f106292OooOO0o) != null) {
                    oooOOO0.OooO00o();
                    break;
                }
                break;
            case 4:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = DebugFragment.f79020Oooo0OO;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/zip");
                ((DebugFragment) obj).f79026Oooo0.OooO00o(intent);
                break;
            default:
                ExportStickerCollectionDialogFragment exportStickerCollectionDialogFragment = (ExportStickerCollectionDialogFragment) obj;
                C30933OooO0o0 c30933OooO0o0 = (C30933OooO0o0) exportStickerCollectionDialogFragment.f79471Oooo000.getValue();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C30930OooO0O0(c30933OooO0o0, null), 3);
                exportStickerCollectionDialogFragment.dismissAllowingStateLoss();
                break;
        }
    }
}
