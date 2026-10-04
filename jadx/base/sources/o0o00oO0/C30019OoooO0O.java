package o0o00oO0;

import android.widget.SeekBar;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import o0o00o0.C29936OooO0oO;

/* JADX INFO: renamed from: o0o00oO0.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30019OoooO0O implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C30016OoooO f106701OooO00o;

    public C30019OoooO0O(C30016OoooO c30016OoooO) {
        this.f106701OooO00o = c30016OoooO;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f106701OooO00o.f106681OooOoo0.setText(i + "%");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        PenBox.OooOOOO oooOOOO;
        C30016OoooO c30016OoooO = this.f106701OooO00o;
        int progress = seekBar != null ? seekBar.getProgress() : c30016OoooO.f106683OooOooo;
        C29936OooO0oO c29936OooO0oO = c30016OoooO.f106675OooOo;
        if (c29936OooO0oO != null) {
            PenBox.OooOOOO oooOOOO2 = c29936OooO0oO.f106293OooOOO0;
            if (oooOOOO2 != null ? oooOOOO2.OooO0O0() : false) {
                if (seekBar != null) {
                    seekBar.setProgress(c30016OoooO.f106683OooOooo);
                }
                c30016OoooO.f106681OooOoo0.setText(c30016OoooO.f106683OooOooo + "%");
                return;
            }
        }
        c30016OoooO.f106683OooOooo = progress;
        C29936OooO0oO c29936OooO0oO2 = c30016OoooO.f106675OooOo;
        if (c29936OooO0oO2 == null || (oooOOOO = c29936OooO0oO2.f106293OooOOO0) == null) {
            return;
        }
        oooOOOO.OooO0OO(progress);
    }
}
