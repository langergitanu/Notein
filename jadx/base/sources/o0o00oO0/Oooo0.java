package o0o00oO0;

import Oooo0.o000000O;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C24032OooOooO;
import o00O0oo0.C24969OooOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0OoO0OO.ViewOnClickListenerC28609OooO0oO;
import o0OoO0OO.ViewOnClickListenerC28610OooO0oo;
import o0Ooo0oo.C29553o00O0O;
import o0o000oO.ViewOnClickListenerC29783OooO0oO;
import o0o00Oo.C29897OooO0Oo;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29932OooO0OO;
import o0oOoOo.C31045OooOOo;
import o0oOoOo.C31056OooOoo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 implements InterfaceC29932OooO0OO {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final float f106632Oooo0 = o000000O.OooO0o0(12.0f);

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final float f106633Oooo0O0 = 0.05f;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ImageView f106634OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f106635OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ImageView f106636OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final View f106637OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ImageView f106638OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final SeekBar f106639OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RecyclerView f106640OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final TextView f106641OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final RecyclerView f106642OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public PenWidthVO f106643Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C29936OooO0oO f106644Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public String f106645Oooo00o;

    public Oooo0(View view) {
        View viewFindViewById = view.findViewById(R.id.laser_pen_line);
        this.f106635OooOo0o = viewFindViewById;
        this.f106634OooOo = (ImageView) view.findViewById(R.id.laser_pen_line_color);
        View viewFindViewById2 = view.findViewById(R.id.laser_pen_spot);
        this.f106637OooOoO0 = viewFindViewById2;
        this.f106636OooOoO = (ImageView) view.findViewById(R.id.laser_pen_spot_color);
        this.f106638OooOoOO = (ImageView) view.findViewById(R.id.iv_favorite);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_pen_color);
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        int i = 0;
        recyclerView.setAdapter(C28038OooO0Oo.OooO0O0(context) ? new C29553o00O0O(o000000O.OooO0o(3), o000000O.OooO0o(24)) : new C29553o00O0O(i, 3, i));
        this.f106640OooOoo0 = recyclerView;
        this.f106641OooOooO = (TextView) view.findViewById(R.id.tv_pen_width);
        this.f106639OooOoo = (SeekBar) view.findViewById(R.id.pen_width_seekbar);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_disappear_setting);
        this.f106642OooOooo = recyclerView2;
        Context context2 = recyclerView2.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
        recyclerView2.setAdapter(C28038OooO0Oo.OooO0O0(context2) ? new C29897OooO0Oo(i) : new C29897OooO0Oo(o000000O.OooO0o(10), 0, o000000O.OooO0o(10), o000000O.OooO0o(6)));
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO(viewFindViewById, "line"), new C32443OooOOO(viewFindViewById2, "spot")).entrySet()) {
            ((View) entry.getKey()).setOnClickListener(new ViewOnClickListenerC29783OooO0oO(1, this, (String) entry.getValue()));
        }
        C28050OooO0OO.OooO00o(this.f106638OooOoOO, 1000L, new ViewOnClickListenerC28610OooO0oo(this, 3));
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106640OooOoo0.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.penbar.PenBarColorAdapter");
        ((C29553o00O0O) adapter).f104835OooO0Oo = new ViewOnClickListenerC28609OooO0oO(this, 2);
        this.f106639OooOoo.setOnSeekBarChangeListener(new C30009Oooo00o(new C24032OooOooO(), new C24032OooOooO(), this));
        RecyclerView recyclerView3 = this.f106642OooOooo;
        RecyclerView.AbstractC22062OooO0oO adapter2 = recyclerView3 != null ? recyclerView3.getAdapter() : null;
        C29897OooO0Oo c29897OooO0Oo = adapter2 instanceof C29897OooO0Oo ? (C29897OooO0Oo) adapter2 : null;
        if (c29897OooO0Oo != null) {
            c29897OooO0Oo.f106068OooO0o = new ViewOnClickListenerC28408OooO0O0(this, 5);
        }
        this.f106645Oooo00o = "line";
    }

    public static void OooO0OO(Oooo0 oooo0, View view, float f, float f2) {
        Oooo000 oooo000 = new Oooo000();
        oooo0.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new C30008Oooo00O(view, f2, oooo000));
        objectAnimatorOfFloat.start();
    }

    @Override // o0o00o0.InterfaceC29932OooO0OO
    public final void OooO00o() {
        C29936OooO0oO c29936OooO0oO = this.f106644Oooo00O;
        this.f106638OooOoOO.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(7, BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, this.f106645Oooo00o))) : false);
    }

    @Override // o0o00o0.InterfaceC29932OooO0OO
    public final void OooO0O0(List<PenColorVO> list) {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106640OooOoo0.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.penbar.PenBarColorAdapter");
        ((C29553o00O0O) adapter).OooO0Oo(list);
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
            this.f106636OooOoO.setColorFilter(C24969OooOO0.OooO0OO(color));
            this.f106634OooOo.setColorFilter(C24969OooOO0.OooO0OO(color));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo(C31056OooOoo penSettingsVO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penSettingsVO, "penSettingsVO");
        PenVO penVO = penSettingsVO.f110874OooO00o;
        if (penVO != null) {
            String string = penVO.getExtra().getString(C18437z2.f56754h);
            if (string == null) {
                string = "line";
            }
            OooO0o(string);
        }
        OooO0O0(penSettingsVO.f110876OooO0OO);
        PenWidthVO penWidthVO = penSettingsVO.f110877OooO0Oo;
        if (penWidthVO != null) {
            this.f106643Oooo000 = penWidthVO;
            TextView textView = this.f106641OooOooO;
            textView.setText(textView.getContext().getString(R.string.pen_width_text, Float.valueOf(penWidthVO.getWidthInMillimetre())));
            Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
            C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(penWidthVO.getType(), new C32443OooOOO(Float.valueOf(0.2f), Float.valueOf(1.6f)));
            float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
            ((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue();
            this.f106639OooOoo.setProgress(oO0O00O.OooO00o.OooO0O0((penWidthVO.getWidthInMillimetre() - fFloatValue) / f106633Oooo0O0));
        }
        OooOO0o(penSettingsVO.f110878OooO0o0);
    }

    public final void OooO0o(String str) {
        this.f106645Oooo00o = str;
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(str, "line");
        float f = f106632Oooo0;
        this.f106635OooOo0o.setTranslationY(zOooO0O0 ? 0.0f : f);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "spot")) {
            f = 0.0f;
        }
        this.f106637OooOoO0.setTranslationY(f);
        OooO00o();
    }

    @Override // o0o00o0.InterfaceC29932OooO0OO
    public final void OooO0o0(String str) {
        OooO0o(str);
    }

    @Override // o0o00o0.InterfaceC29932OooO0OO
    public final void OooOO0o(List<C31045OooOOo> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        RecyclerView recyclerView = this.f106642OooOooo;
        RecyclerView.AbstractC22062OooO0oO adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        C29897OooO0Oo c29897OooO0Oo = adapter instanceof C29897OooO0Oo ? (C29897OooO0Oo) adapter : null;
        if (c29897OooO0Oo != null) {
            c29897OooO0Oo.OooO0Oo(list);
        }
    }
}
