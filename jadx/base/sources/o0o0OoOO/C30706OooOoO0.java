package o0o0OoOO;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: o0o0OoOO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30706OooOoO0 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextView f109814OooO00o;

    public C30706OooOoO0(TextView textView) {
        this.f109814OooO00o = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f109814OooO00o.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf((i + 1) / 10.0f)}, 1)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
