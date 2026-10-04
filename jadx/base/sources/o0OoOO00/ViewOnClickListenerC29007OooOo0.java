package o0OoOO00;

import OooO0oO.C20436OooO0o0;
import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.o0OoOo0;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.domain.models.p605ai.NoteAiContent;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oooo.C29593OooO0Oo;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30016OoooO;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30624OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOO00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29007OooOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102757OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102758OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29007OooOo0(Object obj, int i) {
        this.f102758OooOo0o = i;
        this.f102757OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C29936OooO0oO c29936OooO0oO;
        Object obj = this.f102757OooOo;
        switch (this.f102758OooOo0o) {
            case 0:
                ((AddPageFragment) obj).f73808Oooo0OO.OooO00o(OooO0o.OooOO0O.OooO00o(C20436OooO0o0.C20437OooO0Oo.f58277OooO00o));
                break;
            case 1:
                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoOO = ((EditorSummaryFragment) obj).OooOoOO();
                NoteAiContent noteAiContent = (NoteAiContent) oooO00oOooOoOO.f75608OooOo0.f121747OooOo0o.getValue();
                if (noteAiContent != null) {
                    int savedSummaryIndex = noteAiContent.getSavedSummaryIndex() + 1;
                    if (savedSummaryIndex >= 0 && savedSummaryIndex < noteAiContent.getSummaryIdList().size()) {
                        NoteAiContent noteAiContentCopy$default = NoteAiContent.copy$default(noteAiContent, null, null, savedSummaryIndex, 0L, 0L, 27, null);
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO00oOooOoOO);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29593OooO0Oo(oooO00oOooOoOO, noteAiContentCopy$default, null), 2);
                    } else {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("EditorChatViewModel");
                        c20358OooO00o.OooOO0O("nextSummaryPage: newIndex out of bounds", new Object[0]);
                    }
                    break;
                }
                break;
            case 2:
                C30016OoooO c30016OoooO = (C30016OoooO) obj;
                boolean zIsChecked = c30016OoooO.f106679OooOoOO.isChecked();
                SwitchMaterial switchMaterial = c30016OoooO.f106679OooOoOO;
                if (zIsChecked && (c29936OooO0oO = c30016OoooO.f106675OooOo) != null) {
                    PenBox.OooOOOO oooOOOO = c29936OooO0oO.f106293OooOOO0;
                    if (oooOOOO != null ? oooOOOO.OooO0O0() : false) {
                        switchMaterial.setChecked(c30016OoooO.f106682OooOooO);
                    }
                }
                C29936OooO0oO c29936OooO0oO2 = c30016OoooO.f106675OooOo;
                if (c29936OooO0oO2 != null) {
                    boolean zIsChecked2 = switchMaterial.isChecked();
                    PenBox.OooOOOO oooOOOO2 = c29936OooO0oO2.f106293OooOOO0;
                    if (oooOOOO2 != null) {
                        oooOOOO2.OooO00o(zIsChecked2);
                    }
                }
                c30016OoooO.f106682OooOooO = switchMaterial.isChecked();
                break;
            case 3:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((DebugFragment) obj), new C24564OooO00o(R.id.action_to_storageOptimizationDialogFragment));
                break;
            default:
                C30623OooOOOO c30623OooOOOOOooOoOO = ((PageSettingsFragment) obj).OooOoOO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c30623OooOOOOOooOoOO);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30624OooOOOo(c30623OooOOOOOooOoOO, 1, null), 2);
                break;
        }
    }
}
