package o0o00oO0;

import android.graphics.Color;
import android.widget.SeekBar;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import o0o00o0.C29935OooO0o0;

/* JADX INFO: renamed from: o0o00oO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29988OooO0o implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29990OooO0oO f106519OooO00o;

    public C29988OooO0o(C29990OooO0oO c29990OooO0oO) {
        this.f106519OooO00o = c29990OooO0oO;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(seekBar, "seekBar");
        if (z) {
            int progress = seekBar.getProgress();
            C29990OooO0oO c29990OooO0oO = this.f106519OooO00o;
            float[] fArr = {progress, 0.0f, 0.0f};
            Color.colorToHSV(c29990OooO0oO.f106539Oooo0oO, fArr);
            c29990OooO0oO.f106529OooOooO.setColorHSV(fArr);
            c29990OooO0oO.OooO0OO(Color.HSVToColor((c29990OooO0oO.f106539Oooo0oO >> 24) & 255, fArr));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C29935OooO0o0 c29935OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(seekBar, "seekBar");
        C29990OooO0oO c29990OooO0oO = this.f106519OooO00o;
        PenColorVO penColorVO = c29990OooO0oO.f106538Oooo0o0;
        if (penColorVO == null || (c29935OooO0o0 = c29990OooO0oO.f106537Oooo0o) == null) {
            return;
        }
        int type = penColorVO.getType();
        int index = penColorVO.getIndex();
        int i = c29990OooO0oO.f106539Oooo0oO;
        PenBox.OooO0o oooO0o = c29935OooO0o0.f106279OooO0O0;
        if (oooO0o != null) {
            oooO0o.OooO00o(type, index, i);
        }
    }
}
