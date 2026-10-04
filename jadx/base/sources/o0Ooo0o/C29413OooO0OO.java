package o0Ooo0o;

import android.widget.SeekBar;
import kotlin.jvm.internal.OooOOO0;
import o0oOOO0o.C30832OooOO0O;

/* JADX INFO: renamed from: o0Ooo0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29413OooO0OO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29415OooO0o f104302OooO00o;

    public C29413OooO0OO(C29415OooO0o c29415OooO0o) {
        this.f104302OooO00o = c29415OooO0o;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        OooOOO0.OooO0oO(seekBar, "seekBar");
        int progress = seekBar.getProgress();
        C29415OooO0o c29415OooO0o = this.f104302OooO00o;
        int i2 = c29415OooO0o.f104318OooOO0o;
        if (progress != ((i2 >> 24) & 255)) {
            c29415OooO0o.OooO0o0((seekBar.getProgress() << 24) | (16777215 & i2));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C30832OooOO0O c30832OooOO0O;
        C29415OooO0o c29415OooO0o = this.f104302OooO00o;
        if (c29415OooO0o.f104317OooOO0O || (c30832OooOO0O = c29415OooO0o.f104319OooOOO0) == null) {
            return;
        }
        c30832OooOO0O.OooO00o(c29415OooO0o.f104318OooOO0o);
    }
}
