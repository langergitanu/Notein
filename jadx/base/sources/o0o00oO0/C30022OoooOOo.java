package o0o00oO0;

import Oooo0.o000000O;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.search.ViewOnClickListenerC22479OooOOo;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import kotlin.jvm.internal.C24032OooOooO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28150OooO0OO;
import o0Ooo0oo.C29553o00O0O;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o00oO0.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30022OoooOOo implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final View f106706OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f106707OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final SeekBar f106708OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C29553o00O0O f106709OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final TextView f106710OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final SwitchMaterial f106711OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final SwitchMaterial f106712OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C29936OooO0oO f106713OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public PenWidthVO f106714OooOooo;

    public C30022OoooOOo(View view) {
        C29553o00O0O c29553o00O0O;
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f106707OooOo0o = imageView;
        int i = 3;
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            c29553o00O0O = new C29553o00O0O(o000000O.OooO0o(3), o000000O.OooO0o(24));
        } else {
            int i2 = 0;
            c29553o00O0O = new C29553o00O0O(i2, i, i2);
        }
        this.f106709OooOoO0 = c29553o00O0O;
        View viewFindViewById = view.findViewById(R.id.rv_pen_color);
        ((RecyclerView) viewFindViewById).setAdapter(c29553o00O0O);
        this.f106706OooOo = viewFindViewById;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.pen_width_seekbar);
        this.f106708OooOoO = seekBar;
        this.f106710OooOoOO = (TextView) view.findViewById(R.id.tv_pen_width);
        SwitchMaterial switchMaterial = (SwitchMaterial) view.findViewById(R.id.st_straight_line);
        this.f106712OooOoo0 = switchMaterial;
        SwitchMaterial switchMaterial2 = (SwitchMaterial) view.findViewById(R.id.st_tape_visible);
        this.f106711OooOoo = switchMaterial2;
        C28050OooO0OO.OooO00o(imageView, 1000L, new ViewOnClickListenerC22479OooOOo(this, 3));
        seekBar.setOnSeekBarChangeListener(new C30021OoooOOO(this, new C24032OooOooO(), new C24032OooOooO()));
        c29553o00O0O.f104835OooO0Oo = new ViewOnClickListenerC28150OooO0OO(this, 2);
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00oO0.OoooOO0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PenBox.OooO oooO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                C29936OooO0oO c29936OooO0oO = this.f106702OooO00o.f106713OooOooO;
                if (c29936OooO0oO == null || (oooO = c29936OooO0oO.f106285OooO0Oo) == null) {
                    return;
                }
                oooO.OooO0OO(z);
            }
        });
        switchMaterial2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00oO0.o000oOoO
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PenBox.OooO oooO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                C29936OooO0oO c29936OooO0oO = this.f106732OooO00o.f106713OooOooO;
                if (c29936OooO0oO == null || (oooO = c29936OooO0oO.f106285OooO0Oo) == null) {
                    return;
                }
                oooO.OooO0O0(z);
            }
        });
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C29936OooO0oO c29936OooO0oO = this.f106713OooOooO;
        this.f106707OooOo0o.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(11, null) : false);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        this.f106709OooOoO0.OooO0Oo(list);
    }

    public final void OooO0OO(C31056OooOoo penSettingsVO) {
        boolean z;
        kotlin.jvm.internal.OooOOO0.OooO0oO(penSettingsVO, "penSettingsVO");
        OooO0O0(penSettingsVO.f110876OooO0OO);
        PenWidthVO penWidthVO = penSettingsVO.f110877OooO0Oo;
        if (penWidthVO != null) {
            OooOOOO(penWidthVO);
        }
        PenVO penVO = penSettingsVO.f110874OooO00o;
        if (penVO != null) {
            this.f106711OooOoo.setChecked(penVO.isTapeTransparent());
            try {
                z = Boolean.parseBoolean(penVO.getExtra().getString("draw_line_directly"));
            } catch (Exception unused) {
                z = false;
            }
            this.f106712OooOoo0.setChecked(z);
        }
        OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidth) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penWidth, "penWidth");
        this.f106714OooOooo = penWidth;
        TextView textView = this.f106710OooOoOO;
        textView.setText(textView.getContext().getString(R.string.pen_width_text, Float.valueOf(penWidth.getWidthInMillimetre())));
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidth.getType(), new C32443OooOOO(Float.valueOf(0.5f), Float.valueOf(8.0f)));
        float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
        ((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue();
        this.f106708OooOoO.setProgress(oO0O00O.OooO00o.OooO0O0((penWidth.getWidthInMillimetre() - fFloatValue) / 0.05f));
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
    }
}
