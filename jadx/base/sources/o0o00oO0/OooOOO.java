package o0o00oO0;

import android.widget.SeekBar;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import o0o00o0.C29936OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO f106546OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C29993OooOOOo f106547OooO0O0;

    public OooOOO(OooO oooO, C29993OooOOOo c29993OooOOOo) {
        this.f106546OooO00o = oooO;
        this.f106547OooO0O0 = c29993OooOOOo;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float fFloatValue = ((Number) this.f106546OooO00o.invoke(Integer.valueOf(i))).floatValue();
        if (seekBar != null) {
            seekBar.setTag(Float.valueOf(fFloatValue));
        }
        this.f106547OooO0O0.f106557OooOooO.setText(((int) fFloatValue) + "mm");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object tag;
        C29993OooOOOo c29993OooOOOo;
        PenWidthVO penWidthVO;
        C29936OooO0oO c29936OooO0oO;
        if (seekBar == null || (tag = seekBar.getTag()) == null || (penWidthVO = (c29993OooOOOo = this.f106547OooO0O0).f106563Oooo0O0) == null || (c29936OooO0oO = c29993OooOOOo.f106559Oooo0) == null) {
            return;
        }
        c29936OooO0oO.OooO0o(((Float) tag).floatValue(), penWidthVO.getType(), penWidthVO.getIndex());
    }
}
