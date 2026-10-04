package o0o00oO0;

import Oooo0.C20855OooooOO;
import Oooo0.o000000O;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.ViewOnClickListenerC22469OooO0o0;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C24032OooOooO;
import o00O0oo0.C24969OooOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.o00000O0;
import o0Oo0oOo.o000OOo;
import o0OoOoo0.ViewOnClickListenerC29234OooOO0;
import o0Ooo0oo.C29553o00O0O;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00oO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29997OooOo0 implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final float f106569Oooo0oo = o000000O.OooO0o0(12.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final View f106570OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f106571OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ImageView f106572OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final View f106573OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final View f106574OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RecyclerView f106575OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ImageView f106576OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C29553o00O0O f106577OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ImageView f106578OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final View f106579Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final SeekBar f106580Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final TextView f106581Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final SwitchMaterial f106582Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C30016OoooO f106583Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C29936OooO0oO f106584Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public PenWidthVO f106585Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public Object f106586Oooo0o0 = C34436OooOoOO.f123455OooOo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f106587Oooo0oO = 2;

    public C29997OooOo0(View view) {
        View viewFindViewById = view.findViewById(R.id.hl_group_settings_wrapper);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
        int i = 0;
        viewFindViewById.setVisibility(0);
        viewFindViewById.setTranslationX(0.0f);
        this.f106571OooOo0o = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rect_hl_pen);
        this.f106573OooOoO0 = viewFindViewById2;
        this.f106572OooOoO = (ImageView) view.findViewById(R.id.rect_hl_pen_color);
        View viewFindViewById3 = view.findViewById(R.id.round_hl_pen);
        this.f106574OooOoOO = viewFindViewById3;
        this.f106576OooOoo0 = (ImageView) view.findViewById(R.id.round_hl_pen_color);
        C29553o00O0O c29553o00O0O = C30983OooO0o.OooO00o(view, "getContext(...)") ? new C29553o00O0O(o000000O.OooO0o(3), o000000O.OooO0o(24)) : new C29553o00O0O(i, 3, i);
        this.f106577OooOooO = c29553o00O0O;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_pen_color);
        recyclerView.setAdapter(c29553o00O0O);
        this.f106575OooOoo = recyclerView;
        this.f106578OooOooo = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f106580Oooo000 = (SeekBar) view.findViewById(R.id.pen_width_seekbar);
        this.f106581Oooo00O = (TextView) view.findViewById(R.id.tv_pen_width);
        this.f106582Oooo00o = (SwitchMaterial) view.findViewById(R.id.st_straight_line);
        View viewFindViewById4 = view.findViewById(R.id.cl_shape_settings);
        this.f106579Oooo0 = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.shape_settings_wrapper);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById5);
        viewFindViewById5.setVisibility(8);
        this.f106570OooOo = viewFindViewById5;
        this.f106583Oooo0O0 = new C30016OoooO(viewFindViewById5);
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC22469OooO0o0(this, 3));
        viewFindViewById5.findViewById(R.id.shape_settings_wrapper);
        viewFindViewById5.findViewById(R.id.iv_back).setOnClickListener(new ViewOnClickListenerC29234OooOO0(this, 1));
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO(viewFindViewById3, 2), new C32443OooOOO(viewFindViewById2, 9)).entrySet()) {
            View view2 = (View) entry.getKey();
            final int iIntValue = ((Number) entry.getValue()).intValue();
            view2.setOnClickListener(new View.OnClickListener() { // from class: o0o00oO0.OooOOo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C29997OooOo0 c29997OooOo0 = this.f106566OooOo0o;
                    c29997OooOo0.getClass();
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("HLRectDebug");
                    int i2 = c29997OooOo0.f106587Oooo0oO;
                    StringBuilder sb = new StringBuilder("switchPen, penType: ");
                    int i3 = iIntValue;
                    sb.append(i3);
                    sb.append(", selectedPenType: ");
                    sb.append(i2);
                    c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
                    int i4 = c29997OooOo0.f106587Oooo0oO;
                    if (i4 == i3) {
                        return;
                    }
                    c29997OooOo0.OooO0oO(i3);
                    c20358OooO00o.OooOOO0("HLRectDebug");
                    c20358OooO00o.OooO0o0(C20855OooooOO.OooO0OO(c29997OooOo0.f106587Oooo0oO, i4, "switchPen, startAnim selectedPenType: ", ", previousPenType: "), new Object[0]);
                    int i5 = c29997OooOo0.f106587Oooo0oO;
                    Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(2, c29997OooOo0.f106574OooOoOO), new C32443OooOOO(9, c29997OooOo0.f106573OooOoO0));
                    View view4 = (View) mapOooO0oo.get(Integer.valueOf(i5));
                    if (view4 != null) {
                        C29997OooOo0.OooO0OO(c29997OooOo0, view4, C29997OooOo0.f106569Oooo0oo, 0.0f);
                    }
                    View view5 = (View) mapOooO0oo.get(Integer.valueOf(i4));
                    if (view5 != null) {
                        C29997OooOo0.OooO0OO(c29997OooOo0, view5, 0.0f, C29997OooOo0.f106569Oooo0oo);
                    }
                    C29936OooO0oO c29936OooO0oO = c29997OooOo0.f106584Oooo0OO;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO(i3);
                    }
                }
            });
        }
        C28050OooO0OO.OooO00o(this.f106578OooOooo, 1000L, new o00000O0(this, 2));
        this.f106580Oooo000.setOnSeekBarChangeListener(new OooOo00(this, new C24032OooOooO(), new C24032OooOooO()));
        this.f106582Oooo00o.setOnClickListener(new o000OOo(this, 1));
        this.f106577OooOooO.f104835OooO0Oo = new o0Oo0oOo.o000000O(this, 2);
    }

    public static void OooO0OO(C29997OooOo0 c29997OooOo0, View view, float f, float f2) {
        C29994OooOOo c29994OooOOo = new C29994OooOOo();
        c29997OooOo0.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C29996OooOOoo(view, f2, c29994OooOOo));
        objectAnimatorOfFloat.start();
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C29936OooO0oO c29936OooO0oO = this.f106584Oooo0OO;
        this.f106578OooOooo.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(this.f106587Oooo0oO, null) : false);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        OooO0Oo(list);
    }

    public final void OooO0Oo(List<PenColorVO> list) {
        Object next;
        this.f106577OooOooO.OooO0Oo(list);
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
            int i = this.f106587Oooo0oO;
            if (i == 2) {
                this.f106576OooOoo0.setColorFilter(C24969OooOO0.OooO0OO(color));
            } else {
                if (i != 9) {
                    return;
                }
                this.f106572OooOoO.setColorFilter(C24969OooOO0.OooO0OO(color));
            }
        }
    }

    public final void OooO0o(C29936OooO0oO c29936OooO0oO) {
        this.f106584Oooo0OO = c29936OooO0oO;
        this.f106583Oooo0O0.f106675OooOo = c29936OooO0oO;
    }

    public final void OooO0o0(C31056OooOoo penSettingsVO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penSettingsVO, "penSettingsVO");
        List<PenVO> list = penSettingsVO.f110875OooO0O0;
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((PenVO) obj).getType()), obj);
        }
        this.f106586Oooo0o0 = linkedHashMap;
        PenVO penVO = penSettingsVO.f110874OooO00o;
        OooO0oO(penVO != null ? penVO.getType() : 2);
        int i = this.f106587Oooo0oO;
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO(2, this.f106574OooOoOO), new C32443OooOOO(9, this.f106573OooOoO0)).entrySet()) {
            ((View) entry.getValue()).setTranslationY(((Number) entry.getKey()).intValue() == i ? 0.0f : f106569Oooo0oo);
        }
        for (PenVO penVO2 : list) {
            int type = penVO2.getType();
            if (type == 2) {
                this.f106576OooOoo0.setColorFilter(C24969OooOO0.OooO0OO(penVO2.getColor()));
            } else if (type == 9) {
                this.f106572OooOoO.setColorFilter(C24969OooOO0.OooO0OO(penVO2.getColor()));
            }
        }
        OooO0Oo(penSettingsVO.f110876OooO0OO);
        PenWidthVO penWidthVO = penSettingsVO.f110877OooO0Oo;
        if (penWidthVO != null) {
            OooOOOO(penWidthVO);
        }
        OooO00o();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void OooO0oO(int i) {
        Bundle bundle;
        this.f106587Oooo0oO = i;
        PenVO penVO = (PenVO) this.f106586Oooo0o0.get(Integer.valueOf(i));
        if (penVO == null || (bundle = penVO.getExtra()) == null) {
            bundle = new Bundle();
        }
        this.f106582Oooo00o.setChecked(kotlin.jvm.internal.OooOOO0.OooO0O0(bundle.getString("straight_line", TranslateLanguage.NORWEGIAN), "yes"));
        OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidth) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penWidth, "penWidth");
        this.f106585Oooo0o = penWidth;
        TextView textView = this.f106581Oooo00O;
        textView.setText(textView.getContext().getString(R.string.pen_width_text, Float.valueOf(penWidth.getWidthInMillimetre())));
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidth.getType(), new C32443OooOOO(Float.valueOf(0.2f), Float.valueOf(8.0f)));
        float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
        ((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue();
        this.f106580Oooo000.setProgress(oO0O00O.OooO00o.OooO0O0((penWidth.getWidthInMillimetre() - fFloatValue) / 0.05f));
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
        this.f106583Oooo0O0.OooOOOo(z);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
        this.f106583Oooo0O0.f106678OooOoO0.setChecked(z);
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
        this.f106583Oooo0O0.OooOo0o(i);
    }
}
