package o0OoO0oO;

import Oooo.C20811OooO00o;
import android.widget.SeekBar;

/* JADX INFO: renamed from: o0OoO0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28673OooO0O0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C28674OooO0OO f101604OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C20811OooO00o f101605OooO0O0;

    public C28673OooO0O0(C28674OooO0OO c28674OooO0OO, C20811OooO00o c20811OooO00o) {
        this.f101604OooO00o = c28674OooO0OO;
        this.f101605OooO0O0 = c20811OooO00o;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f101604OooO00o.f101611OooO0o0.setText(i + "%");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(seekBar, "seekBar");
        this.f101605OooO0O0.OooO00o(this.f101604OooO00o.f101607OooO0O0.getProgress(), seekBar.getProgress());
    }
}
