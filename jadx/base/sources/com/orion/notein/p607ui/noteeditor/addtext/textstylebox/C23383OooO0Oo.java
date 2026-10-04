package com.orion.notein.p607ui.noteeditor.addtext.textstylebox;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0o0oO.ViewOnClickListenerC26055Ooooo00;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import o0OoOOOo.InterfaceC29093OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23383OooO0Oo implements InterfaceC29093OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f74112OooO = o000000O.OooO0o(220);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int f74113OooOO0 = o000000O.OooO0o(70);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int f74114OooOO0O = o000000O.OooO0o(50);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f74115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f74116OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TextView f74117OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f74118OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SeekBar f74119OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final View f74120OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f74121OooO0oO = new OooO0O0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f74122OooO0oo;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0Oo$OooO00o */
    public interface OooO00o {
        void OooO00o(int i);

        void OooO0O0(int i);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 implements SeekBar.OnSeekBarChangeListener {
        public OooO0O0() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2 = i + 15;
            C23383OooO0Oo c23383OooO0Oo = C23383OooO0Oo.this;
            c23383OooO0Oo.f74117OooO0OO.setText(c23383OooO0Oo.f74115OooO00o.getContentView().getContext().getString(R.string.font_size_desc, Integer.valueOf(i + 5)));
            OooO00o oooO00o = c23383OooO0Oo.f74122OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO0O0(i2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public C23383OooO0Oo(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_textstyle_text_size, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        this.f74117OooO0OO = (TextView) viewInflate.findViewById(R.id.tv_font_size);
        this.f74119OooO0o = (SeekBar) viewInflate.findViewById(R.id.seekbar);
        View viewFindViewById = viewInflate.findViewById(R.id.btn_inc);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC26054OoooOoo(this, 2));
        this.f74118OooO0Oo = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.btn_dec);
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26055Ooooo00(this, 1));
        this.f74120OooO0o0 = viewFindViewById2;
        PopupWindow popupWindow = new PopupWindow(viewInflate, f74112OooO, f74113OooOO0, true);
        this.f74115OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0OoOOOo.OooOo00
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C23383OooO0Oo.OooO00o oooO00o = this.f103177OooOo0o.f74122OooO0oo;
                if (oooO00o != null) {
                    oooO00o.OooO00o(8);
                }
            }
        });
        View viewFindViewById3 = viewInflate.findViewById(R.id.btn_dismiss);
        this.f74116OooO0O0 = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC26057OooooO0(this, 2));
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final boolean OooO00o() {
        return this.f74115OooO00o.isShowing();
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final void dismiss() {
        this.f74115OooO00o.dismiss();
        this.f74119OooO0o.setOnSeekBarChangeListener(null);
    }
}
