package o0Ooo0o;

import android.graphics.Color;
import android.widget.SeekBar;
import kotlin.jvm.internal.OooOOO0;
import o0oOOO0o.C30832OooOO0O;

/* JADX INFO: renamed from: o0Ooo0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29416OooO0o0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29415OooO0o f104320OooO00o;

    public C29416OooO0o0(C29415OooO0o c29415OooO0o) {
        this.f104320OooO00o = c29415OooO0o;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        int progress = seekBar.getProgress();
        C29415OooO0o c29415OooO0o = this.f104320OooO00o;
        float[] fArr = {progress, 0.0f, 0.0f};
        Color.colorToHSV(c29415OooO0o.f104318OooOO0o, fArr);
        c29415OooO0o.OooO0OO().setColorHSV(fArr);
        c29415OooO0o.OooO0o0(Color.HSVToColor((c29415OooO0o.f104318OooOO0o >> 24) & 255, fArr));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C30832OooOO0O c30832OooOO0O;
        OooOOO0.OooO0oO(seekBar, "seekBar");
        C29415OooO0o c29415OooO0o = this.f104320OooO00o;
        if (c29415OooO0o.f104317OooOO0O || (c30832OooOO0O = c29415OooO0o.f104319OooOOO0) == null) {
            return;
        }
        c30832OooOO0O.OooO00o(c29415OooO0o.f104318OooOO0o);
    }
}
