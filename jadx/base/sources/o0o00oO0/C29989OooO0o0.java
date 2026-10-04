package o0o00oO0;

import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.ColorPickerView;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import o0o00o0.C29935OooO0o0;

/* JADX INFO: renamed from: o0o00oO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29989OooO0o0 implements ColorPickerView.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29990OooO0oO f106520OooO00o;

    public C29989OooO0o0(C29990OooO0oO c29990OooO0oO) {
        this.f106520OooO00o = c29990OooO0oO;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorPickerView.OooO00o
    public final void OooO00o(int i) {
        C29935OooO0o0 c29935OooO0o0;
        C29990OooO0oO c29990OooO0oO = this.f106520OooO00o;
        PenColorVO penColorVO = c29990OooO0oO.f106538Oooo0o0;
        if (penColorVO == null || (c29935OooO0o0 = c29990OooO0oO.f106537Oooo0o) == null) {
            return;
        }
        int type = penColorVO.getType();
        int index = penColorVO.getIndex();
        PenBox.OooO0o oooO0o = c29935OooO0o0.f106279OooO0O0;
        if (oooO0o != null) {
            oooO0o.OooO00o(type, index, i);
        }
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorPickerView.OooO00o
    public final void OooO0O0(int i) {
        C29990OooO0oO c29990OooO0oO = this.f106520OooO00o;
        c29990OooO0oO.OooO0OO((i & 16777215) | (((c29990OooO0oO.f106539Oooo0oO >> 24) & 255) << 24));
    }
}
