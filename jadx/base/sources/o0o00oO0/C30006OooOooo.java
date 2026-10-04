package o0o00oO0;

import Oooo0.o000000O;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C24032OooOooO;
import o00O0oo0.C24969OooOO0;
import o00ooOO.C25765OooO00o;
import o0O0oo0.C26206OooOOo;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.C28592o0000oOo;
import o0OoO000.ViewOnClickListenerC28585o0000o;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;
import o0Ooo0oo.C29553o00O0O;
import o0o000oO.ViewOnClickListenerC29777OooO00o;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00oO0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30006OooOooo implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final View f106608OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f106609OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ImageView f106610OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final View f106611OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final View f106612OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final SeekBar f106613OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ImageView f106614OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final TextView f106615OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final SeekBar f106616OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public C29936OooO0oO f106617Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final ImageView f106618Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final TextView f106619Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final RecyclerView f106620Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C29553o00O0O f106621Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final SeekBar f106622Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final TextView f106623Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final TextView f106624Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final View f106625Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ImageView f106626Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C30016OoooO f106627Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f106628OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public PenWidthVO f106629OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final float f106607OoooO0O = o000000O.OooO0o0(12.0f);

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final Object f106606OoooO = C34444Oooo0O0.OooO0oo(new C32443OooOOO("pressure_correct", new C32443OooOOO(Float.valueOf(0.0f), Float.valueOf(2.0f))), new C32443OooOOO("speed_correct", new C32443OooOOO(Float.valueOf(0.0f), Float.valueOf(1.0f))));

    public C30006OooOooo(View view) {
        View viewFindViewById = view.findViewById(R.id.ink_group_settings_wrapper);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
        int i = 0;
        viewFindViewById.setVisibility(0);
        viewFindViewById.setTranslationX(0.0f);
        this.f106609OooOo0o = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ink_pen);
        this.f106611OooOoO0 = viewFindViewById2;
        this.f106610OooOoO = (ImageView) view.findViewById(R.id.ink_pen_color);
        View viewFindViewById3 = view.findViewById(R.id.ballpoint_pen);
        this.f106612OooOoOO = viewFindViewById3;
        this.f106614OooOoo0 = (ImageView) view.findViewById(R.id.ballpoint_pen_color);
        this.f106613OooOoo = (SeekBar) view.findViewById(R.id.ink_pen_pressure_correct_seekbar);
        this.f106615OooOooO = (TextView) view.findViewById(R.id.ink_pen_pressure_correct_text);
        this.f106616OooOooo = (SeekBar) view.findViewById(R.id.ink_pen_speed_correct_seekbar);
        this.f106619Oooo000 = (TextView) view.findViewById(R.id.ink_pen_speed_correct_text);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_pen_color);
        this.f106620Oooo00O = recyclerView;
        C29553o00O0O c29553o00O0O = C30983OooO0o.OooO00o(view, "getContext(...)") ? new C29553o00O0O(o000000O.OooO0o(3), o000000O.OooO0o(24)) : new C29553o00O0O(i, 3, i);
        this.f106621Oooo00o = c29553o00O0O;
        recyclerView.setAdapter(c29553o00O0O);
        this.f106618Oooo0 = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f106622Oooo0O0 = (SeekBar) view.findViewById(R.id.pen_width_seekbar);
        this.f106623Oooo0OO = (TextView) view.findViewById(R.id.tv_pen_width);
        View viewFindViewById4 = view.findViewById(R.id.cl_shape_settings);
        this.f106625Oooo0o0 = viewFindViewById4;
        this.f106624Oooo0o = (TextView) view.findViewById(R.id.tv_shape_settings);
        this.f106626Oooo0oO = (ImageView) view.findViewById(R.id.iv_shape_settings);
        View viewFindViewById5 = view.findViewById(R.id.shape_settings_wrapper);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById5);
        viewFindViewById5.setVisibility(8);
        this.f106608OooOo = viewFindViewById5;
        this.f106627Oooo0oo = new C30016OoooO(viewFindViewById5);
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC29777OooO00o(this, 1));
        viewFindViewById5.findViewById(R.id.shape_settings_wrapper);
        viewFindViewById5.findViewById(R.id.iv_back).setOnClickListener(new ViewOnClickListenerC28585o0000o(this, 1));
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO(viewFindViewById2, 0), new C32443OooOOO(viewFindViewById3, 1)).entrySet()) {
            View view2 = (View) entry.getKey();
            final int iIntValue = ((Number) entry.getValue()).intValue();
            view2.setOnClickListener(new View.OnClickListener() { // from class: o0o00oO0.OooOoOO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C30006OooOooo c30006OooOooo = this.f106597OooOo0o;
                    int i2 = c30006OooOooo.f106628OoooO0;
                    int i3 = iIntValue;
                    if (i2 == i3) {
                        return;
                    }
                    if (i3 != 10) {
                        c30006OooOooo.OooO0oo(i3);
                        return;
                    }
                    C29936OooO0oO c29936OooO0oO = c30006OooOooo.f106617Oooo;
                    if (c29936OooO0oO != null) {
                        C29999OooOo0o c29999OooOo0o = new C29999OooOo0o(c30006OooOooo, i3);
                        PenBox.OooO0OO oooO0OO = c29936OooO0oO.f106282OooO00o;
                        if (oooO0OO != null) {
                            oooO0OO.OooO0Oo(c29999OooOo0o);
                        }
                    }
                }
            });
        }
        C28050OooO0OO.OooO00o(this.f106618Oooo0, 1000L, new ViewOnClickListenerC28603OooO00o(this, 4));
        this.f106613OooOoo.setOnSeekBarChangeListener(new C30003OooOoo(new C25765OooO00o(1), new C26206OooOOo(this, 1), new C29998OooOo0O(this, 0)));
        this.f106616OooOooo.setOnSeekBarChangeListener(new C30003OooOoo(new C30001OooOoO0(), new C28592o0000oOo(this, 1), new InterfaceC32507OooOO0o() { // from class: o0o00oO0.OooOoO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                float fFloatValue = ((Float) obj).floatValue();
                C30006OooOooo c30006OooOooo = this.f106595OooOo0o;
                C29936OooO0oO c29936OooO0oO = c30006OooOooo.f106617Oooo;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0o0("speed_correct", fFloatValue, c30006OooOooo.f106628OoooO0, "");
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }));
        this.f106622Oooo0O0.setOnSeekBarChangeListener(new C30005OooOooO(this, new C24032OooOooO(), new C24032OooOooO()));
        this.f106621Oooo00o.f104835OooO0Oo = new ViewOnClickListenerC28958o00oOo0o(this, 2);
    }

    public static void OooO0OO(C30006OooOooo c30006OooOooo, View view, float f, float f2) {
        OooOo oooOo = new OooOo();
        c30006OooOooo.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C30004OooOoo0(view, f2, oooOo));
        objectAnimatorOfFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public static final void OooO0Oo(PenVO penVO, String str, C32443OooOOO c32443OooOOO, SeekBar seekBar, TextView textView) {
        float f = (float) penVO.getExtra().getDouble(str, 1.0d);
        C32443OooOOO c32443OooOOO2 = (C32443OooOOO) f106606OoooO.get(str);
        if (c32443OooOOO2 != null) {
            c32443OooOOO = c32443OooOOO2;
        }
        float fFloatValue = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
        seekBar.setProgress((int) ((f - fFloatValue) / ((((Number) c32443OooOOO.f116637OooOo).floatValue() - fFloatValue) / 100.0f)));
        textView.setText(oO0O00O.OooO00o.OooO0O0(f * 100) + "%");
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C29936OooO0oO c29936OooO0oO = this.f106617Oooo;
        this.f106618Oooo0.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(this.f106628OoooO0, null) : false);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        this.f106621Oooo00o.OooO0Oo(list);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PenColorVO) next).getSelected()) {
                    break;
                }
            }
        }
        PenColorVO penColorVO = (PenColorVO) next;
        if (penColorVO != null) {
            int color = penColorVO.getColor();
            int i = this.f106628OoooO0;
            if (i == 0) {
                this.f106610OooOoO.setColorFilter(C24969OooOO0.OooO0OO(color));
            } else {
                if (i != 1) {
                    return;
                }
                this.f106614OooOoo0.setColorFilter(C24969OooOO0.OooO0OO(color));
            }
        }
    }

    public final void OooO0o(C31056OooOoo penSettingsVO) {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(penSettingsVO, "penSettingsVO");
        PenVO penVO = penSettingsVO.f110874OooO00o;
        OooOO0(penVO != null ? penVO.getType() : 0);
        int i = this.f106628OoooO0;
        Iterator it = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, this.f106611OooOoO0), new C32443OooOOO(1, this.f106612OooOoOO)).entrySet().iterator();
        while (true) {
            float f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            if (iIntValue != i) {
                f = f106607OoooO0O;
            }
            view.setTranslationY(f);
        }
        List<PenVO> list = penSettingsVO.f110875OooO0O0;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((PenVO) next).getType() == 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PenVO penVO2 = (PenVO) next;
        if (penVO2 != null) {
            OooO0Oo(penVO2, "pressure_correct", new C32443OooOOO(Float.valueOf(0.0f), Float.valueOf(2.0f)), this.f106613OooOoo, this.f106615OooOooO);
            OooO0Oo(penVO2, "speed_correct", new C32443OooOOO(Float.valueOf(0.0f), Float.valueOf(1.0f)), this.f106616OooOooo, this.f106619Oooo000);
        }
        for (PenVO penVO3 : list) {
            int type = penVO3.getType();
            if (type == 0) {
                this.f106610OooOoO.setColorFilter(C24969OooOO0.OooO0OO(penVO3.getColor()));
            } else if (type == 1) {
                this.f106614OooOoo0.setColorFilter(C24969OooOO0.OooO0OO(penVO3.getColor()));
            }
        }
        this.f106621Oooo00o.OooO0Oo(penSettingsVO.f110876OooO0OO);
        OooO0o0(penSettingsVO.f110877OooO0Oo);
        OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(PenWidthVO penWidthVO) {
        if (penWidthVO == null) {
            return;
        }
        this.f106629OoooO00 = penWidthVO;
        TextView textView = this.f106623Oooo0OO;
        textView.setText(textView.getContext().getString(R.string.pen_width_text, Float.valueOf(penWidthVO.getWidthInMillimetre())));
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidthVO.getType(), new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(3.0f)));
        float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
        ((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue();
        this.f106622Oooo0O0.setProgress((int) ((penWidthVO.getWidthInMillimetre() - fFloatValue) / 0.05f));
    }

    public final void OooO0oO(C29936OooO0oO c29936OooO0oO) {
        this.f106617Oooo = c29936OooO0oO;
        this.f106627Oooo0oo.f106675OooOo = c29936OooO0oO;
    }

    public final void OooO0oo(int i) {
        int i2 = this.f106628OoooO0;
        OooOO0(i);
        int i3 = this.f106628OoooO0;
        Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, this.f106611OooOoO0), new C32443OooOOO(1, this.f106612OooOoOO));
        View view = (View) mapOooO0oo.get(Integer.valueOf(i3));
        float f = f106607OoooO0O;
        if (view != null) {
            OooO0OO(this, view, f, 0.0f);
        }
        View view2 = (View) mapOooO0oo.get(Integer.valueOf(i2));
        if (view2 != null) {
            OooO0OO(this, view2, 0.0f, f);
        }
        C29936OooO0oO c29936OooO0oO = this.f106617Oooo;
        if (c29936OooO0oO != null) {
            c29936OooO0oO.OooO(i);
        }
    }

    public final void OooOO0(int i) {
        this.f106628OoooO0 = i;
        boolean z = i == 0;
        boolean z2 = i == 10;
        this.f106613OooOoo.setEnabled(z);
        this.f106616OooOooo.setEnabled(z);
        Iterator it = C34429OooOOo0.OooOO0o(this.f106625Oooo0o0, this.f106624Oooo0o, this.f106626Oooo0oO).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(!z2);
        }
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidthVO) {
        OooO0o0(penWidthVO);
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
        this.f106627Oooo0oo.OooOOOo(z);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
        this.f106627Oooo0oo.f106678OooOoO0.setChecked(z);
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
        this.f106627Oooo0oo.OooOo0o(i);
    }
}
