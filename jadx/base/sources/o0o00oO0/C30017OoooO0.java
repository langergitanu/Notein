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
import o0Oo0Ooo.ViewOnClickListenerC28142OooO0oo;
import o0Ooo0oo.C29553o00O0O;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29934OooO0o;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31056OooOoo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00oO0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30017OoooO0 implements InterfaceC29934OooO0o {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final float f106684Oooo0O0 = o000000O.OooO0o0(12.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final View f106685OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f106686OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final View f106687OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ImageView f106688OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ImageView f106689OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C29553o00O0O f106690OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RecyclerView f106691OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ImageView f106692OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final SeekBar f106693OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f106694Oooo0 = 2;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final TextView f106695Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C29936OooO0oO f106696Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public PenWidthVO f106697Oooo00o;

    public C30017OoooO0(View view) {
        View viewFindViewById = view.findViewById(R.id.pencil_group_settings_wrapper);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
        int i = 0;
        viewFindViewById.setVisibility(0);
        viewFindViewById.setTranslationX(0.0f);
        this.f106686OooOo0o = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rainbow_pen);
        this.f106685OooOo = viewFindViewById2;
        this.f106688OooOoO0 = (ImageView) view.findViewById(R.id.rainbow_pen_color);
        View viewFindViewById3 = view.findViewById(R.id.pencil_pen);
        this.f106687OooOoO = viewFindViewById3;
        this.f106689OooOoOO = (ImageView) view.findViewById(R.id.pencil_pen_color);
        C29553o00O0O c29553o00O0O = C30983OooO0o.OooO00o(view, "getContext(...)") ? new C29553o00O0O(o000000O.OooO0o(3), o000000O.OooO0o(24)) : new C29553o00O0O(i, 3, i);
        this.f106690OooOoo = c29553o00O0O;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_pen_color);
        recyclerView.setAdapter(c29553o00O0O);
        this.f106691OooOoo0 = recyclerView;
        this.f106692OooOooO = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f106693OooOooo = (SeekBar) view.findViewById(R.id.pen_width_seekbar);
        this.f106695Oooo000 = (TextView) view.findViewById(R.id.tv_pen_width);
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO(viewFindViewById3, 10), new C32443OooOOO(viewFindViewById2, 12)).entrySet()) {
            View view2 = (View) entry.getKey();
            final int iIntValue = ((Number) entry.getValue()).intValue();
            view2.setOnClickListener(new View.OnClickListener() { // from class: o0o00oO0.Oooo0oO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C30017OoooO0 c30017OoooO0 = this.f106674OooOo0o;
                    int i2 = c30017OoooO0.f106694Oooo0;
                    int i3 = iIntValue;
                    if (i2 == i3) {
                        return;
                    }
                    c30017OoooO0.f106694Oooo0 = i3;
                    c30017OoooO0.OooO00o();
                    int i4 = c30017OoooO0.f106694Oooo0;
                    Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(10, c30017OoooO0.f106687OooOoO), new C32443OooOOO(12, c30017OoooO0.f106685OooOo));
                    View view4 = (View) mapOooO0oo.get(Integer.valueOf(i4));
                    if (view4 != null) {
                        C30017OoooO0.OooO0OO(c30017OoooO0, view4, C30017OoooO0.f106684Oooo0O0, 0.0f);
                    }
                    View view5 = (View) mapOooO0oo.get(Integer.valueOf(i2));
                    if (view5 != null) {
                        C30017OoooO0.OooO0OO(c30017OoooO0, view5, 0.0f, C30017OoooO0.f106684Oooo0O0);
                    }
                    C29936OooO0oO c29936OooO0oO = c30017OoooO0.f106696Oooo00O;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO(i3);
                    }
                }
            });
        }
        C28050OooO0OO.OooO00o(this.f106692OooOooO, 1000L, new ViewOnClickListenerC28142OooO0oo(this, 2));
        this.f106693OooOooo.setOnSeekBarChangeListener(new C30018OoooO00(this, new C24032OooOooO(), new C24032OooOooO()));
        this.f106690OooOoo.f104835OooO0Oo = new com.google.android.material.search.OooOOO0(this, 2);
    }

    public static void OooO0OO(C30017OoooO0 c30017OoooO0, View view, float f, float f2) {
        C30015Oooo0oo c30015Oooo0oo = new C30015Oooo0oo();
        c30017OoooO0.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C30007Oooo(view, f2, c30015Oooo0oo));
        objectAnimatorOfFloat.start();
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        C29936OooO0oO c29936OooO0oO = this.f106696Oooo00O;
        this.f106692OooOooO.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(this.f106694Oooo0, null) : false);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        OooO0o0(list);
    }

    public final void OooO0Oo(int i) {
        int i2 = this.f106694Oooo0;
        if (i2 == 10) {
            this.f106689OooOoOO.setColorFilter(C24969OooOO0.OooO0OO(i));
        } else {
            if (i2 != 12) {
                return;
            }
            this.f106688OooOoO0.setColorFilter(C24969OooOO0.OooO0OO(i));
        }
    }

    public final void OooO0o(C31056OooOoo penSettingsVO) {
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
        PenVO penVO = penSettingsVO.f110874OooO00o;
        this.f106694Oooo0 = penVO != null ? penVO.getType() : 2;
        OooO00o();
        int i = this.f106694Oooo0;
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO(10, this.f106687OooOoO), new C32443OooOOO(12, this.f106685OooOo)).entrySet()) {
            ((View) entry.getValue()).setTranslationY(((Number) entry.getKey()).intValue() == i ? 0.0f : f106684Oooo0O0);
        }
        for (PenVO penVO2 : list) {
            int type = penVO2.getType();
            if (type == 10) {
                this.f106689OooOoOO.setColorFilter(C24969OooOO0.OooO0OO(penVO2.getColor()));
            } else if (type == 12) {
                this.f106688OooOoO0.setColorFilter(C24969OooOO0.OooO0OO(penVO2.getColor()));
            }
        }
        OooO0o0(penSettingsVO.f110876OooO0OO);
        PenWidthVO penWidthVO = penSettingsVO.f110877OooO0Oo;
        if (penWidthVO != null) {
            OooOOOO(penWidthVO);
        }
        OooO00o();
    }

    public final void OooO0o0(List<PenColorVO> list) {
        Object next;
        this.f106690OooOoo.OooO0Oo(list);
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
            OooO0Oo(penColorVO.getColor());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidth) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penWidth, "penWidth");
        this.f106697Oooo00o = penWidth;
        TextView textView = this.f106695Oooo000;
        textView.setText(textView.getContext().getString(R.string.pen_width_text, Float.valueOf(penWidth.getWidthInMillimetre())));
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidth.getType(), new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(2.0f)));
        float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
        ((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue();
        this.f106693OooOooo.setProgress(oO0O00O.OooO00o.OooO0O0((penWidth.getWidthInMillimetre() - fFloatValue) / 0.05f));
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
