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

/* JADX INFO: renamed from: o0o00oO0.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30021OoooOOO implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C30022OoooOOo f106703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C24032OooOooO f106704OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C24032OooOooO f106705OooO0OO;

    public C30021OoooOOO(C30022OoooOOo c30022OoooOOo, C24032OooOooO c24032OooOooO, C24032OooOooO c24032OooOooO2) {
        this.f106703OooO00o = c30022OoooOOo;
        this.f106704OooO0O0 = c24032OooOooO;
        this.f106705OooO0OO = c24032OooOooO2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C32443OooOOO c32443OooOOO;
        C30022OoooOOo c30022OoooOOo = this.f106703OooO00o;
        PenWidthVO penWidthVO = c30022OoooOOo.f106714OooOooo;
        if (penWidthVO != null) {
            Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
            c32443OooOOO = C31253OooOOOo.OooO00o.OooO00o(penWidthVO.getType(), new C32443OooOOO(Float.valueOf(0.2f), Float.valueOf(8.0f)));
        } else {
            c32443OooOOO = new C32443OooOOO(Float.valueOf(0.2f), Float.valueOf(0.3f));
        }
        float fFloatValue = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
        float fFloatValue2 = ((Number) c32443OooOOO.f116637OooOo).floatValue();
        C24032OooOooO c24032OooOooO = this.f106704OooO0O0;
        boolean zOooO = o000000O.OooO(c24032OooOooO.f80939OooOo0o, fFloatValue);
        C24032OooOooO c24032OooOooO2 = this.f106705OooO0OO;
        if (!zOooO || !o000000O.OooO(c24032OooOooO2.f80939OooOo0o, fFloatValue2)) {
            if (seekBar != null) {
                seekBar.setMax((int) ((fFloatValue2 - fFloatValue) / 0.05f));
            }
            c24032OooOooO.f80939OooOo0o = fFloatValue;
            c24032OooOooO2.f80939OooOo0o = fFloatValue2;
        }
        float fOooO0O0 = oO0O00O.OooO00o.OooO0O0(((i * 0.05f) + fFloatValue) * 100) / 100.0f;
        TextView textView = c30022OoooOOo.f106710OooOoOO;
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
        if (seekBar == null || (tag = seekBar.getTag()) == null) {
            return;
        }
        float fFloatValue = ((Float) tag).floatValue();
        C30022OoooOOo c30022OoooOOo = this.f106703OooO00o;
        PenWidthVO penWidthVO = c30022OoooOOo.f106714OooOooo;
        if (penWidthVO == null || (c29936OooO0oO = c30022OoooOOo.f106713OooOooO) == null) {
            return;
        }
        c29936OooO0oO.OooO0o(fFloatValue, penWidthVO.getType(), penWidthVO.getIndex());
    }
}
