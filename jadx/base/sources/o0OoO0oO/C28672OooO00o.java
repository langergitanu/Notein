package o0OoO0oO;

import Oooo.C20811OooO00o;
import android.widget.SeekBar;

/* JADX INFO: renamed from: o0OoO0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28672OooO00o implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C28674OooO0OO f101602OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C20811OooO00o f101603OooO0O0;

    public C28672OooO00o(C28674OooO0OO c28674OooO0OO, C20811OooO00o c20811OooO00o) {
        this.f101602OooO00o = c28674OooO0OO;
        this.f101603OooO0O0 = c20811OooO00o;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(seekBar, "seekBar");
        this.f101602OooO00o.f101608OooO0OO.setText(String.valueOf(i));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(seekBar, "seekBar");
        this.f101603OooO0O0.OooO00o(seekBar.getProgress(), this.f101602OooO00o.f101609OooO0Oo.getProgress());
    }
}
