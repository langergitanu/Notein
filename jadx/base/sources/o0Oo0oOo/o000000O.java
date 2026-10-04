package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.CloudBackupFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.pageeditor.PageSaveAsDialogFragment;
import o00O0oo0.C24969OooOO0;
import o0OoOoo0.C29229OooO0Oo;
import o0OoOoo0.C29246OooOo0;
import o0OoOoo0.C29250OooOoO0;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C29997OooOo0;
import o0oOoOoo.C31102OooO00o;
import o0oOoOoo.C31103OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o000000O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100549OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100550OooOo0o;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f100550OooOo0o = i;
        this.f100549OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2;
        Object obj = this.f100549OooOo;
        switch (this.f100550OooOo0o) {
            case 0:
                ((o000000) obj).invoke();
                return;
            case 1:
                int id = view.getId();
                final LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = (LatestOpenedNoteTabFragment) obj;
                if (id == R.id.cl_close_other_tabs) {
                    C29250OooOoO0 c29250OooOoO0OooOoo0 = latestOpenedNoteTabFragment.OooOoo0();
                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c29250OooOoO0OooOoo0), null, null, new C29246OooOo0(c29250OooOoO0OooOoo0, null), 3);
                    C29229OooO0Oo c29229OooO0Oo = latestOpenedNoteTabFragment.f74474Oooo00O;
                    if (c29229OooO0Oo != null) {
                        c29229OooO0Oo.f103648OooO0O0.dismiss();
                        return;
                    }
                    return;
                }
                if (id == R.id.cl_item_note) {
                    Object tag = view.getTag();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.LatestOpenedNoteVO");
                    final LatestOpenedNoteVO latestOpenedNoteVO = (LatestOpenedNoteVO) tag;
                    LockNoteFragment lockNoteFragmentOooOoo = latestOpenedNoteTabFragment.OooOoo();
                    androidx.lifecycle.OooOo oooOo = latestOpenedNoteTabFragment.f74472Oooo0;
                    if (oooOo != null) {
                        LockNoteFragment.OooOoo(lockNoteFragmentOooOoo, oooOo, com.facebook.soloader.OooOo.OooO0oO(latestOpenedNoteVO.getNoteId()), new oO0O000o.OooO00o() { // from class: o0OoOoo0.OooOO0o
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                latestOpenedNoteTabFragment.OooOoOO().OooOOoo(latestOpenedNoteVO.getNoteId());
                                return C32460OooOooO.f116667OooO00o;
                            }
                        });
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("lifecycleScope");
                        throw null;
                    }
                }
                if (id != R.id.iv_more) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("LatestOpenedNoteTabFragment");
                    c20358OooO00o.OooOO0O("No handled view id.", new Object[0]);
                    return;
                }
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.LatestOpenedNoteVO");
                LatestOpenedNoteVO latestOpenedNoteVO2 = (LatestOpenedNoteVO) tag2;
                if (latestOpenedNoteTabFragment.f74475Oooo00o == null) {
                    Context context = latestOpenedNoteTabFragment.getContext();
                    latestOpenedNoteTabFragment.f74475Oooo00o = context != null ? new C31102OooO00o(context, new o00oO0O(latestOpenedNoteTabFragment, i)) : null;
                }
                C31102OooO00o c31102OooO00o = latestOpenedNoteTabFragment.f74475Oooo00o;
                if (c31102OooO00o != null) {
                    c31102OooO00o.OooO0O0(view, new C31103OooO0O0(latestOpenedNoteVO2.getNoteId(), latestOpenedNoteVO2.isSelected()), ((Number) ((C32443OooOOO) latestOpenedNoteTabFragment.OooOoOO().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue(), true, true, Oooo0.o000000O.OooO0o(10));
                    return;
                }
                return;
            case 2:
                Object tag3 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag3, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag3;
                int color = penColorVO.getColor();
                C29997OooOo0 c29997OooOo0 = (C29997OooOo0) obj;
                int i2 = c29997OooOo0.f106587Oooo0oO;
                if (i2 == 2) {
                    c29997OooOo0.f106576OooOoo0.setColorFilter(C24969OooOO0.OooO0OO(color));
                } else if (i2 == 9) {
                    c29997OooOo0.f106572OooOoO.setColorFilter(C24969OooOO0.OooO0OO(color));
                }
                C29936OooO0oO c29936OooO0oO = c29997OooOo0.f106584Oooo0OO;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0Oo(penColorVO, view, c29997OooOo0.f106575OooOoo);
                    return;
                }
                return;
            case 3:
                EditText editText = ((PageSaveAsDialogFragment) obj).f78515OooOooo;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 4:
                BackupFile.DiskVendor diskVendor = CloudBackupFragment.f70531Oooo0o;
                C21030OooOO0o.OooO0OO((CloudBackupFragment) obj).OooOOo0();
                return;
            default:
                ((TextRecognizeFragment) obj).OooOooO();
                return;
        }
    }
}
