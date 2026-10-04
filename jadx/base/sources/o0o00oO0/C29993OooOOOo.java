package o0o00oO0;

import OooOoo.C20593OooO0Oo;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.C21650OooOoO;
import androidx.core.os.BundleKt;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import o0Oo0O0.C28050OooO0OO;
import o0o000OO.ViewOnClickListenerC29749OooO00o;
import o0o000OO.ViewOnClickListenerC29750OooO0O0;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29931OooO0O0;
import o0oOoOo.C31056OooOoo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00oO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29993OooOOOo implements InterfaceC29931OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ImageView f106550OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f106551OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ImageView f106552OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ImageView f106553OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final SwitchMaterial f106554OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final SeekBar f106555OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final TextView f106556OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final TextView f106557OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final SeekBar f106558OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C29936OooO0oO f106559Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final SwitchMaterial f106560Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final SwitchMaterial f106561Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final View f106562Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public PenWidthVO f106563Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public String f106564Oooo0OO;

    public C29993OooOOOo(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.pixel_eraser);
        this.f106551OooOo0o = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.eraser);
        this.f106550OooOo = imageView2;
        ImageView imageView3 = (ImageView) view.findViewById(R.id.lasso_eraser);
        this.f106553OooOoO0 = imageView3;
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f106552OooOoO = imageView4;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.eraser_pen_pressure_correct_seekbar);
        this.f106555OooOoo = seekBar;
        this.f106556OooOoo0 = (TextView) view.findViewById(R.id.eraser_pen_pressure_correct_text);
        SwitchMaterial switchMaterial = (SwitchMaterial) view.findViewById(R.id.pressure_sensitive_eraser_switch);
        this.f106554OooOoOO = switchMaterial;
        SeekBar seekBar2 = (SeekBar) view.findViewById(R.id.pen_width_seekbar);
        this.f106558OooOooo = seekBar2;
        this.f106557OooOooO = (TextView) view.findViewById(R.id.tv_pen_width);
        SwitchMaterial switchMaterial2 = (SwitchMaterial) view.findViewById(R.id.switch_only_erase_hl);
        this.f106560Oooo000 = switchMaterial2;
        SwitchMaterial switchMaterial3 = (SwitchMaterial) view.findViewById(R.id.switch_only_erase_tape);
        this.f106561Oooo00O = switchMaterial3;
        View viewFindViewById = view.findViewById(R.id.eraser_clear_page);
        this.f106562Oooo00o = viewFindViewById;
        C28050OooO0OO.OooO00o(imageView4, 1000L, new ViewOnClickListenerC29992OooOO0o(this, 0));
        imageView.setOnClickListener(new ViewOnClickListenerC29749OooO00o(this, 1));
        imageView2.setOnClickListener(new ViewOnClickListenerC29750OooO0O0(this, 1));
        imageView3.setOnClickListener(new o0o000OO.OooO0OO(this, 1));
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00oO0.OooOOO0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PenBox.OooO00o oooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                C29936OooO0oO c29936OooO0oO = this.f106548OooO00o.f106559Oooo0;
                if (c29936OooO0oO == null || (oooO00o = c29936OooO0oO.f106287OooO0o0) == null) {
                    return;
                }
                oooO00o.OooO0Oo(z);
            }
        });
        seekBar.setOnSeekBarChangeListener(new OooOOOO(this));
        seekBar2.setOnSeekBarChangeListener(new OooOOO(new OooO(this, 0), this));
        switchMaterial2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00oO0.OooOO0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PenBox.OooO00o oooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                C29936OooO0oO c29936OooO0oO = this.f106542OooO00o.f106559Oooo0;
                if (c29936OooO0oO == null || (oooO00o = c29936OooO0oO.f106287OooO0o0) == null) {
                    return;
                }
                oooO00o.OooO0o0(z);
            }
        });
        switchMaterial3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00oO0.OooOO0O
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PenBox.OooO00o oooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                C29936OooO0oO c29936OooO0oO = this.f106543OooO00o.f106559Oooo0;
                if (c29936OooO0oO == null || (oooO00o = c29936OooO0oO.f106287OooO0o0) == null) {
                    return;
                }
                oooO00o.OooO0OO(z);
            }
        });
        C28050OooO0OO.OooO00o(viewFindViewById, 1000L, new ViewOnClickListenerC29991OooO0oo(this, 0));
        this.f106564Oooo0OO = DrawToolFactory.ERASER_TYPE_PIXEL;
    }

    @Override // o0o00o0.InterfaceC29931OooO0O0
    public final void OooO00o() {
        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, this.f106564Oooo0OO));
        C29936OooO0oO c29936OooO0oO = this.f106559Oooo0;
        this.f106552OooOoO.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(3, bundleBundleOf) : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(C31056OooOoo penSettingsVO) {
        String string;
        Bundle extra;
        kotlin.jvm.internal.OooOOO0.OooO0oO(penSettingsVO, "penSettingsVO");
        PenVO penVO = penSettingsVO.f110874OooO00o;
        if (penVO == null || (extra = penVO.getExtra()) == null || (string = extra.getString(C18437z2.f56754h)) == null) {
            string = DrawToolFactory.ERASER_TYPE_PIXEL;
        }
        OooO0OO(string);
        PenWidthVO penWidthVO = penSettingsVO.f110877OooO0Oo;
        if (penWidthVO != null) {
            this.f106563Oooo0O0 = penWidthVO;
            Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
            C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidthVO.getType(), new C32443OooOOO(Float.valueOf(4.0f), Float.valueOf(20.0f)));
            float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
            this.f106558OooOooo.setProgress((int) ((penWidthVO.getWidthInMillimetre() - fFloatValue) / ((((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue() - fFloatValue) / 100.0f)));
        }
        if (penVO != null) {
            String string2 = penVO.getExtra().getString("penPressToEraser");
            if (string2 == null) {
                string2 = TelemetryEventStrings.Value.TRUE;
            }
            boolean zEquals = string2.equals(TelemetryEventStrings.Value.TRUE);
            float f = penVO.getExtra().getFloat("eraserPressure");
            this.f106554OooOoOO.setChecked(zEquals);
            int i = (int) (f * 100);
            SeekBar seekBar = this.f106555OooOoo;
            seekBar.setProgress(i);
            this.f106556OooOoo0.setText(C21650OooOoO.OooO00o(seekBar.getProgress(), "%"));
            String string3 = penVO.getExtra().getString("eraseHighlighterOnly");
            String str = TelemetryEventStrings.Value.FALSE;
            if (string3 == null) {
                string3 = TelemetryEventStrings.Value.FALSE;
            }
            boolean zEquals2 = string3.equals(TelemetryEventStrings.Value.TRUE);
            String string4 = penVO.getExtra().getString("eraseTapeOnly");
            if (string4 != null) {
                str = string4;
            }
            boolean zEquals3 = str.equals(TelemetryEventStrings.Value.TRUE);
            this.f106560Oooo000.setChecked(zEquals2);
            this.f106561Oooo00O.setChecked(zEquals3);
        }
    }

    public final void OooO0OO(String str) {
        this.f106564Oooo0OO = str;
        ImageView imageView = this.f106551OooOo0o;
        C32443OooOOO c32443OooOOO = new C32443OooOOO(DrawToolFactory.ERASER_TYPE_PIXEL, imageView);
        ImageView imageView2 = this.f106550OooOo;
        C32443OooOOO c32443OooOOO2 = new C32443OooOOO(DrawToolFactory.ERASER_TYPE_STROKE, imageView2);
        ImageView imageView3 = this.f106553OooOoO0;
        ImageView imageView4 = (ImageView) C34444Oooo0O0.OooO0oo(c32443OooOOO, c32443OooOOO2, new C32443OooOOO(DrawToolFactory.ERASER_TYPE_LASSO, imageView3)).get(str);
        if (imageView4 == null) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("type (", str, ") must be one of ERASER_TYPE_STROKE, ERASER_TYPE_PIXEL, ERASER_TYPE_LASSO"));
        }
        for (ImageView imageView5 : C34429OooOOo0.OooOO0o(imageView, imageView2, imageView3)) {
            imageView5.setSelected(kotlin.jvm.internal.OooOOO0.OooO0O0(imageView5, imageView4));
        }
        OooO00o();
    }

    @Override // o0o00o0.InterfaceC29931OooO0O0
    public final void OooO0Oo(boolean z, boolean z2) {
        this.f106560Oooo000.setChecked(z);
        this.f106561Oooo00O.setChecked(z2);
    }

    @Override // o0o00o0.InterfaceC29931OooO0O0
    public final void OooO0oo(String type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        OooO0OO(type);
    }
}
