package o0o00oO0;

import android.widget.SeekBar;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o00oO0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30003OooOoo implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32443OooOOO<Float, Float>> f106598OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Float, C32460OooOooO> f106599OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Float, C32460OooOooO> f106600OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C30003OooOoo(oO0O000o.OooO00o<C32443OooOOO<Float, Float>> oooO00o, InterfaceC32507OooOO0o<? super Float, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super Float, C32460OooOooO> interfaceC32507OooOO0o2) {
        this.f106598OooO00o = oooO00o;
        this.f106599OooO0O0 = interfaceC32507OooOO0o;
        this.f106600OooO0OO = interfaceC32507OooOO0o2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C32443OooOOO<Float, Float> c32443OooOOOInvoke = this.f106598OooO00o.invoke();
        float fFloatValue = c32443OooOOOInvoke.f116638OooOo0o.floatValue();
        float fFloatValue2 = (((c32443OooOOOInvoke.f116637OooOo.floatValue() - fFloatValue) / 100.0f) * i) + fFloatValue;
        this.f106599OooO0O0.invoke(Float.valueOf(fFloatValue2));
        if (seekBar != null) {
            seekBar.setTag(Float.valueOf(fFloatValue2));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object tag;
        if (seekBar == null || (tag = seekBar.getTag()) == null) {
            return;
        }
        this.f106600OooO0OO.invoke((Float) tag);
    }
}
