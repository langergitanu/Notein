package o0o0OoOO;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.C21650OooOoO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.debug.DebugFragment;

/* JADX INFO: renamed from: o0o0OoOO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30705OooOoO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextView f109812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ DebugFragment f109813OooO0O0;

    public C30705OooOoO(TextView textView, DebugFragment debugFragment) {
        this.f109812OooO00o = textView;
        this.f109813OooO0O0 = debugFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f109812OooO00o.setText(i == 0 ? this.f109813OooO0O0.getString(R.string.debug_sampling_rate_default) : C21650OooOoO.OooO00o(i, "Hz"));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
