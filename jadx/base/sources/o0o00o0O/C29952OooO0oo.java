package o0o00o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import kotlin.jvm.internal.OooOOO0;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o00o0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29952OooO0oo extends AbstractC29946OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final float f106371OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TextView f106372OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SeekBar f106373OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PenWidthVO f106374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PenBox.InterfaceC23607OooO0oO f106375OooO0o0;

    /* JADX INFO: renamed from: o0o00o0O.OooO0oo$OooO00o */
    public static final class OooO00o implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f106376OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f106377OooO0O0;

        public OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
            C29952OooO0oo c29952OooO0oo = C29952OooO0oo.this;
            PenWidthVO penWidthVO = c29952OooO0oo.f106374OooO0Oo;
            if (penWidthVO == null) {
                OooOOO0.OooOOOO("vo");
                throw null;
            }
            C32443OooOOO c32443OooOOOOooO0O0 = C31253OooOOOo.OooO00o.OooO0O0(penWidthVO.getType());
            float fFloatValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).floatValue();
            float fFloatValue2 = ((Number) c32443OooOOOOooO0O0.f116637OooOo).floatValue();
            if (!o000000O.OooO(this.f106376OooO00o, fFloatValue) || !o000000O.OooO(this.f106377OooO0O0, fFloatValue2)) {
                if (seekBar != null) {
                    seekBar.setMax((int) ((fFloatValue2 - fFloatValue) / C29952OooO0oo.f106371OooO0o));
                }
                this.f106376OooO00o = fFloatValue;
                this.f106377OooO0O0 = fFloatValue2;
            }
            float fOooO0O0 = oO0O00O.OooO00o.OooO0O0(((i * C29952OooO0oo.f106371OooO0o) + fFloatValue) * 100) / 100.0f;
            TextView textView = c29952OooO0oo.f106372OooO0O0;
            if (textView == null) {
                OooOOO0.OooOOOO("penWidthText");
                throw null;
            }
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
            C29952OooO0oo c29952OooO0oo;
            PenBox.InterfaceC23607OooO0oO interfaceC23607OooO0oO;
            if (seekBar == null || (tag = seekBar.getTag()) == null || (interfaceC23607OooO0oO = (c29952OooO0oo = C29952OooO0oo.this).f106375OooO0o0) == null) {
                return;
            }
            PenWidthVO penWidthVO = c29952OooO0oo.f106374OooO0Oo;
            if (penWidthVO == null) {
                OooOOO0.OooOOOO("vo");
                throw null;
            }
            int type = penWidthVO.getType();
            PenWidthVO penWidthVO2 = c29952OooO0oo.f106374OooO0Oo;
            if (penWidthVO2 != null) {
                interfaceC23607OooO0oO.OooO00o(((Float) tag).floatValue(), type, penWidthVO2.getIndex());
            } else {
                OooOOO0.OooOOOO("vo");
                throw null;
            }
        }
    }

    static {
        o000000O.OooO0o(220);
        o000000O.OooO0o(70);
        f106371OooO0o = 0.05f;
    }

    public C29952OooO0oo(Context context) {
        super(context, R.layout.popup_toolbox_pen_width, o000000O.OooO0o(220), o000000O.OooO0o(70));
        OooO00o oooO00o = new OooO00o();
        View contentView = OooO0OO().getContentView();
        OooOOO0.OooO0o(contentView, "getContentView(...)");
        this.f106372OooO0O0 = (TextView) contentView.findViewById(R.id.pen_width_text);
        SeekBar seekBar = (SeekBar) contentView.findViewById(R.id.pen_width_seekbar);
        this.f106373OooO0OO = seekBar;
        seekBar.setOnSeekBarChangeListener(oooO00o);
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        return OooO0OO().isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo(int i, View view) {
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenWidthVO");
        PenWidthVO penWidthVO = (PenWidthVO) tag;
        this.f106374OooO0Oo = penWidthVO;
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO0O0 = C31253OooOOOo.OooO00o.OooO0O0(penWidthVO.getType());
        float fFloatValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).floatValue();
        ((Number) c32443OooOOOOooO0O0.f116637OooOo).floatValue();
        PenWidthVO penWidthVO2 = this.f106374OooO0Oo;
        if (penWidthVO2 == null) {
            OooOOO0.OooOOOO("vo");
            throw null;
        }
        this.f106373OooO0OO.setProgress((int) ((penWidthVO2.getWidthInMillimetre() - fFloatValue) / f106371OooO0o));
        TextView textView = this.f106372OooO0O0;
        if (textView == null) {
            OooOOO0.OooOOOO("penWidthText");
            throw null;
        }
        Context context = textView.getContext();
        PenWidthVO penWidthVO3 = this.f106374OooO0Oo;
        if (penWidthVO3 == null) {
            OooOOO0.OooOOOO("vo");
            throw null;
        }
        textView.setText(context.getString(R.string.pen_width_text, Float.valueOf(penWidthVO3.getWidthInMillimetre())));
        C32443OooOOO c32443OooOOOOooO0O02 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O02.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O02.f116637OooOo).intValue());
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        OooO0OO().dismiss();
    }
}
