package o0o00oO0;

import Oooo0.o000000O;
import android.widget.SeekBar;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import kotlin.jvm.internal.C24032OooOooO;
import o0o00o0.C29936OooO0oO;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o00oO0.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30024OoooOoO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C24032OooOooO f106716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C24032OooOooO f106717OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C30025OoooOoo f106718OooO0OO;

    public C30024OoooOoO(C24032OooOooO c24032OooOooO, C24032OooOooO c24032OooOooO2, C30025OoooOoo c30025OoooOoo) {
        this.f106716OooO00o = c24032OooOooO;
        this.f106717OooO0O0 = c24032OooOooO2;
        this.f106718OooO0OO = c30025OoooOoo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(8, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(1.0f)));
        float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
        float fFloatValue2 = ((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue();
        C24032OooOooO c24032OooOooO = this.f106716OooO00o;
        boolean zOooO = o000000O.OooO(c24032OooOooO.f80939OooOo0o, fFloatValue);
        C24032OooOooO c24032OooOooO2 = this.f106717OooO0O0;
        C30025OoooOoo c30025OoooOoo = this.f106718OooO0OO;
        if (!zOooO || !o000000O.OooO(c24032OooOooO2.f80939OooOo0o, fFloatValue2)) {
            if (seekBar != null) {
                c30025OoooOoo.getClass();
                seekBar.setMax((int) ((fFloatValue2 - fFloatValue) / 0.05f));
            }
            c24032OooOooO.f80939OooOo0o = fFloatValue;
            c24032OooOooO2.f80939OooOo0o = fFloatValue2;
        }
        c30025OoooOoo.getClass();
        float fOooO0O0 = oO0O00O.OooO00o.OooO0O0(((i * 0.05f) + fFloatValue) * 100) / 100.0f;
        TextView textView = c30025OoooOoo.f106723OooOoOO;
        textView.setText(textView.getContext().getString(R.string.pen_width_text, Float.valueOf(fOooO0O0)));
        if (seekBar != null) {
            seekBar.setTag(Float.valueOf(fOooO0O0));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Object tag;
        C29936OooO0oO c29936OooO0oO;
        C30025OoooOoo c30025OoooOoo = this.f106718OooO0OO;
        PenWidthVO penWidthVO = c30025OoooOoo.f106731Oooo00o;
        if (penWidthVO == null || seekBar == null || (tag = seekBar.getTag()) == null || (c29936OooO0oO = c30025OoooOoo.f106730Oooo00O) == null) {
            return;
        }
        c29936OooO0oO.OooO0o(((Float) tag).floatValue(), penWidthVO.getType(), penWidthVO.getIndex());
    }
}
