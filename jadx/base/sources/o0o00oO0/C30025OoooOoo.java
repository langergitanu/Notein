package o0o00oO0;

import Oooo0.o000000O;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.VectorVO;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24032OooOooO;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28147OooO;
import o0Oo0o00.ViewOnClickListenerC28152OooO0o;
import o0Oo0o00.ViewOnClickListenerC28154OooO0oO;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0Ooo0oo.C29553o00O0O;
import o0o00Oo.C29907OooOo0;
import o0o00o0.C29936OooO0oO;
import o0o00o0O.C29953OooOO0o;
import o0oOoOo.C31056OooOoo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oO0.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30025OoooOoo implements o0o00o0.OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final RecyclerView f106719OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f106720OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final SeekBar f106721OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final RecyclerView f106722OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final TextView f106723OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final TextView f106724OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final SwitchMaterial f106725OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final SeekBar f106726OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f106727OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f106728Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f106729Oooo000 = 20;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C29936OooO0oO f106730Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public PenWidthVO f106731Oooo00o;

    public C30025OoooOoo(View view) {
        C29553o00O0O c29553o00O0O;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.type_list);
        recyclerView.setAdapter(new C29907OooOo0());
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        C28038OooO0Oo.OooO0O0(context);
        this.f106719OooOo = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_pen_color);
        Context context2 = recyclerView2.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
        boolean zOooO0O0 = C28038OooO0Oo.OooO0O0(context2);
        int i = 3;
        if (zOooO0O0) {
            c29553o00O0O = new C29553o00O0O(o000000O.OooO0o(3), o000000O.OooO0o(24));
        } else {
            int i2 = 0;
            c29553o00O0O = new C29553o00O0O(i2, i, i2);
        }
        recyclerView2.setAdapter(c29553o00O0O);
        this.f106722OooOoO0 = recyclerView2;
        this.f106723OooOoOO = (TextView) view.findViewById(R.id.tv_pen_width);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.pen_width_seekbar);
        this.f106721OooOoO = seekBar;
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f106720OooOo0o = imageView;
        SwitchMaterial switchMaterial = (SwitchMaterial) view.findViewById(R.id.st_fill_shape_with_color);
        this.f106725OooOoo0 = switchMaterial;
        this.f106724OooOoo = (TextView) view.findViewById(R.id.tv_opacity_stat);
        SeekBar seekBar2 = (SeekBar) view.findViewById(R.id.seekbar_color_opacity);
        this.f106726OooOooO = seekBar2;
        C28050OooO0OO.OooO00o(imageView, 1000L, new ViewOnClickListenerC28155OooO0oo(this, 3));
        RecyclerView.AbstractC22062OooO0oO adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.VectorAdapter");
        ((C29907OooOo0) adapter).f106110OooO0O0 = new ViewOnClickListenerC28154OooO0oO(this, 2);
        RecyclerView.AbstractC22062OooO0oO adapter2 = recyclerView2.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter2, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.penbar.PenBarColorAdapter");
        ((C29553o00O0O) adapter2).f104835OooO0Oo = new ViewOnClickListenerC28152OooO0o(this, 2);
        seekBar.setOnSeekBarChangeListener(new C30024OoooOoO(new C24032OooOooO(), new C24032OooOooO(), this));
        switchMaterial.setOnClickListener(new ViewOnClickListenerC28147OooO(this, 4));
        seekBar2.setOnSeekBarChangeListener(new C30023OoooOo0(this));
        this.f106728Oooo0 = 7;
    }

    @Override // o0o00o0.OooO
    public final void OooO(int i) {
        OooO0Oo(i);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO00o() {
        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, String.valueOf(this.f106728Oooo0)));
        C29936OooO0oO c29936OooO0oO = this.f106730Oooo00O;
        this.f106720OooOo0o.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(8, bundleBundleOf) : false);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooO0O0(List<PenColorVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106722OooOoO0.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.penbar.PenBarColorAdapter");
        ((C29553o00O0O) adapter).OooO0Oo(list);
    }

    public final void OooO0OO(C31056OooOoo penSettingsVO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penSettingsVO, "penSettingsVO");
        PenVO penVO = penSettingsVO.f110874OooO00o;
        if (penVO != null) {
            String string = penVO.getExtra().getString(C18437z2.f56754h);
            OooO0Oo(string != null ? Integer.parseInt(string) : 7);
        }
        OooO0O0(penSettingsVO.f110876OooO0OO);
        PenWidthVO penWidthVO = penSettingsVO.f110877OooO0Oo;
        if (penWidthVO != null) {
            OooOOOO(penWidthVO);
        }
    }

    public final void OooO0Oo(int i) {
        this.f106728Oooo0 = i;
        List<Integer> list = C29953OooOO0o.f106391OooOO0;
        List<Integer> list2 = C29953OooOO0o.f106391OooOO0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new VectorVO(iIntValue, iIntValue == i));
        }
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106719OooOo.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.VectorAdapter");
        ((C29907OooOo0) adapter).OooO0Oo(arrayList);
        OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOOOO(PenWidthVO penWidth) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penWidth, "penWidth");
        this.f106731Oooo00o = penWidth;
        TextView textView = this.f106723OooOoOO;
        textView.setText(textView.getContext().getString(R.string.pen_width_text, Float.valueOf(penWidth.getWidthInMillimetre())));
        Object obj = C31253OooOOOo.OooO00o.f111551OooO00o;
        C32443OooOOO c32443OooOOOOooO00o = C31253OooOOOo.OooO00o.OooO00o(8, new C32443OooOOO(Float.valueOf(0.1f), Float.valueOf(1.0f)));
        float fFloatValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).floatValue();
        ((Number) c32443OooOOOOooO00o.f116637OooOo).floatValue();
        this.f106721OooOoO.setProgress(oO0O00O.OooO00o.OooO0O0((penWidth.getWidthInMillimetre() - fFloatValue) / 0.05f));
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOOOo(boolean z) {
        this.f106727OooOooo = z;
        this.f106725OooOoo0.setChecked(z);
    }

    @Override // o0o00o0.InterfaceC29934OooO0o
    public final void OooOo00(boolean z) {
    }

    @Override // o0o00o0.InterfaceC29937OooO0oo
    public final void OooOo0o(int i) {
        this.f106729Oooo000 = i;
        this.f106724OooOoo.setText(i + "%");
        this.f106726OooOooO.setProgress(i);
    }
}
