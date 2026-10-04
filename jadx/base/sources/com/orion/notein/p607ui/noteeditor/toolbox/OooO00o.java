package com.orion.notein.p607ui.noteeditor.toolbox;

import Oooo0.o000000O;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import kotlin.jvm.internal.OooOOO0;
import o0o00Oo.InterfaceC29896OooO0OO;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements InterfaceC29896OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int f76727OooO0o = o000000O.OooO0o(220);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int f76728OooO0oO = o000000O.OooO0o(70);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f76729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TextView f76730OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SeekBar f76731OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PenWidthVO f76732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PenBox.InterfaceC23607OooO0oO f76733OooO0o0;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19398OooO00o implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f76734OooO00o = 0.4f;

        public C19398OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
            OooO00o oooO00o = OooO00o.this;
            PenWidthVO penWidthVO = oooO00o.f76732OooO0Oo;
            if (penWidthVO == null) {
                OooOOO0.OooOOOO("vo");
                throw null;
            }
            C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidthVO.getType(), new C32443OooOOO(Float.valueOf(4.0f), Float.valueOf(20.0f)));
            float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
            float fFloatValue2 = (i * ((((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue() - fFloatValue) / 100.0f)) + fFloatValue;
            float fOooO0O0 = oO0O00O.OooO00o.OooO0O0(fFloatValue2);
            this.f76734OooO00o = fOooO0O0;
            Log.d("PenWidthPopupWindow", "progress: " + i + ", penWidth: " + fFloatValue2 + ", round:" + fOooO0O0 + "mm");
            TextView textView = oooO00o.f76730OooO0O0;
            if (textView == null) {
                OooOOO0.OooOOOO("penWidthText");
                throw null;
            }
            textView.setText(((int) this.f76734OooO00o) + "mm");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            OooO00o oooO00o = OooO00o.this;
            PenBox.InterfaceC23607OooO0oO interfaceC23607OooO0oO = oooO00o.f76733OooO0o0;
            if (interfaceC23607OooO0oO != null) {
                PenWidthVO penWidthVO = oooO00o.f76732OooO0Oo;
                if (penWidthVO == null) {
                    OooOOO0.OooOOOO("vo");
                    throw null;
                }
                int type = penWidthVO.getType();
                PenWidthVO penWidthVO2 = oooO00o.f76732OooO0Oo;
                if (penWidthVO2 == null) {
                    OooOOO0.OooOOOO("vo");
                    throw null;
                }
                interfaceC23607OooO0oO.OooO00o(this.f76734OooO00o, type, penWidthVO2.getIndex());
            }
        }
    }

    public OooO00o(Context context) {
        C19398OooO00o c19398OooO00o = new C19398OooO00o();
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_toolbox_eraser_width, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        this.f76730OooO0O0 = (TextView) viewInflate.findViewById(R.id.pen_width_text);
        SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.pen_width_seekbar);
        this.f76731OooO0OO = seekBar;
        seekBar.setOnSeekBarChangeListener(c19398OooO00o);
        PopupWindow popupWindow = new PopupWindow(viewInflate, f76727OooO0o, f76728OooO0oO, false);
        this.f76729OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        return this.f76729OooO00o.isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(View view) {
        Object tag = view.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenWidthVO");
        PenWidthVO penWidthVO = (PenWidthVO) tag;
        this.f76732OooO0Oo = penWidthVO;
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidthVO.getType(), new C32443OooOOO(Float.valueOf(4.0f), Float.valueOf(20.0f)));
        float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
        float fFloatValue2 = (((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue() - fFloatValue) / 100.0f;
        PenWidthVO penWidthVO2 = this.f76732OooO0Oo;
        if (penWidthVO2 == null) {
            OooOOO0.OooOOOO("vo");
            throw null;
        }
        this.f76731OooO0OO.setProgress((int) ((penWidthVO2.getWidthInMillimetre() - fFloatValue) / fFloatValue2));
        PopupWindow popupWindow = this.f76729OooO00o;
        View contentView = popupWindow.getContentView();
        int width = popupWindow.getWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
        int height = popupWindow.getHeight();
        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
        popupWindow.showAsDropDown(view, -((contentView.getMeasuredWidth() - view.getWidth()) / 2), 0);
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        this.f76729OooO00o.dismiss();
    }
}
