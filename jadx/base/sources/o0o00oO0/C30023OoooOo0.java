package o0o00oO0;

import android.widget.SeekBar;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import o0o00o0.C29936OooO0oO;

/* JADX INFO: renamed from: o0o00oO0.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30023OoooOo0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C30025OoooOoo f106715OooO00o;

    public C30023OoooOo0(C30025OoooOoo c30025OoooOoo) {
        this.f106715OooO00o = c30025OoooOoo;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f106715OooO00o.f106724OooOoo.setText(i + "%");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        PenBox.OooOOOO oooOOOO;
        C30025OoooOoo c30025OoooOoo = this.f106715OooO00o;
        int progress = seekBar != null ? seekBar.getProgress() : c30025OoooOoo.f106729Oooo000;
        C29936OooO0oO c29936OooO0oO = c30025OoooOoo.f106730Oooo00O;
        if (c29936OooO0oO != null) {
            PenBox.OooOOOO oooOOOO2 = c29936OooO0oO.f106293OooOOO0;
            if (oooOOOO2 != null ? oooOOOO2.OooO0O0() : false) {
                if (seekBar != null) {
                    seekBar.setProgress(c30025OoooOoo.f106729Oooo000);
                }
                c30025OoooOoo.f106724OooOoo.setText(c30025OoooOoo.f106729Oooo000 + "%");
                return;
            }
        }
        c30025OoooOoo.f106729Oooo000 = progress;
        C29936OooO0oO c29936OooO0oO2 = c30025OoooOoo.f106730Oooo00O;
        if (c29936OooO0oO2 == null || (oooOOOO = c29936OooO0oO2.f106293OooOOO0) == null) {
            return;
        }
        oooOOOO.OooO0OO(progress);
    }
}
