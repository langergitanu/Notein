package o0o00oO0;

import android.widget.SeekBar;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import o0o00o0.C29936OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29993OooOOOo f106549OooO00o;

    public OooOOOO(C29993OooOOOo c29993OooOOOo) {
        this.f106549OooO00o = c29993OooOOOo;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f106549OooO00o.f106556OooOoo0.setText(i + "%");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar p0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekbar) {
        PenBox.OooO00o oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(seekbar, "seekbar");
        float progress = seekbar.getProgress() / 100.0f;
        C29936OooO0oO c29936OooO0oO = this.f106549OooO00o.f106559Oooo0;
        if (c29936OooO0oO == null || (oooO00o = c29936OooO0oO.f106287OooO0o0) == null) {
            return;
        }
        oooO00o.OooO0o(progress);
    }
}
