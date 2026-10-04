package o0o00oO0;

import Oooo0.o000000O;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28137OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28141OooO0oO;
import o0Oo0ooO.ViewOnClickListenerC28414OooO0oo;
import o0Ooo0oo.C29553o00O0O;
import o0o00o0.C29936OooO0oO;
import o0o00o0.InterfaceC29933OooO0Oo;
import o0oOoOo.C31056OooOoo;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00oO0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30012Oooo0o implements InterfaceC29933OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ImageView f106654OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f106655OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final View f106656OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ImageView f106657OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ImageView f106658OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final TextView f106659OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ImageView f106660OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ImageView f106661OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final TextView f106662OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final SwitchMaterial f106663Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final ImageView f106664Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final TextView f106665Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final RecyclerView f106666Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final TextView f106667Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C29936OooO0oO f106668Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public String f106669Oooo0o0;

    public C30012Oooo0o(View view) {
        C29553o00O0O c29553o00O0O;
        ImageView imageView = (ImageView) view.findViewById(R.id.lasso_type_free);
        this.f106655OooOo0o = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.lasso_type_rect);
        this.f106654OooOo = imageView2;
        ImageView imageView3 = (ImageView) view.findViewById(R.id.lasso_type_capture);
        this.f106657OooOoO0 = imageView3;
        this.f106656OooOoO = view.findViewById(R.id.lasso_type_capture_helper);
        this.f106660OooOoo0 = (ImageView) view.findViewById(R.id.shape_type_checkbox);
        this.f106659OooOoo = (TextView) view.findViewById(R.id.tv_shape_type);
        this.f106661OooOooO = (ImageView) view.findViewById(R.id.text_type_checkbox);
        this.f106662OooOooo = (TextView) view.findViewById(R.id.tv_text_type);
        this.f106664Oooo000 = (ImageView) view.findViewById(R.id.image_type_checkbox);
        this.f106665Oooo00O = (TextView) view.findViewById(R.id.tv_image_type);
        this.f106663Oooo0 = (SwitchMaterial) view.findViewById(R.id.dual_link_switch);
        this.f106667Oooo0O0 = (TextView) view.findViewById(R.id.dual_link_text);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_favorite);
        this.f106658OooOoOO = imageView4;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_color_list);
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        int i = 3;
        if (C28038OooO0Oo.OooO0O0(context)) {
            c29553o00O0O = new C29553o00O0O(o000000O.OooO0o(3), o000000O.OooO0o(24));
        } else {
            int i2 = 0;
            c29553o00O0O = new C29553o00O0O(i2, i, i2);
        }
        recyclerView.setAdapter(c29553o00O0O);
        this.f106666Oooo00o = recyclerView;
        C28050OooO0OO.OooO00o(imageView4, 1000L, new ViewOnClickListenerC30011Oooo0OO(this, 0));
        for (ImageView imageView5 : C34429OooOOo0.OooOO0o(imageView, imageView2, imageView3)) {
            imageView5.setOnClickListener(new ViewOnClickListenerC30013Oooo0o0(0, this, imageView5));
        }
        this.f106656OooOoO.setOnClickListener(new ViewOnClickListenerC28141OooO0oO(this, 2));
        for (ImageView imageView6 : C34429OooOOo0.OooOO0o(this.f106660OooOoo0, this.f106661OooOooO, this.f106664Oooo000)) {
            imageView6.setOnClickListener(new ViewOnClickListenerC28414OooO0oo(1, this, imageView6));
        }
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106666Oooo00o.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.penbar.PenBarColorAdapter");
        ((C29553o00O0O) adapter).f104835OooO0Oo = new ViewOnClickListenerC28137OooO0OO(this, 2);
        this.f106663Oooo0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00oO0.Oooo0O0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PenBox.InterfaceC23606OooO0o0 interfaceC23606OooO0o0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                C29936OooO0oO c29936OooO0oO = this.f106651OooO00o.f106668Oooo0OO;
                if (c29936OooO0oO == null || (interfaceC23606OooO0o0 = c29936OooO0oO.f106288OooO0oO) == null) {
                    return;
                }
                interfaceC23606OooO0o0.OooO0Oo(z);
            }
        });
        this.f106669Oooo0o0 = DrawToolFactory.LASSO_TYPE_FREE;
    }

    @Override // o0o00o0.InterfaceC29933OooO0Oo
    public final void OooO00o() {
        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, this.f106669Oooo0o0));
        C29936OooO0oO c29936OooO0oO = this.f106668Oooo0OO;
        this.f106658OooOoOO.setActivated(c29936OooO0oO != null ? c29936OooO0oO.OooO0oO(4, bundleBundleOf) : false);
    }

    @Override // o0o00o0.InterfaceC29933OooO0Oo
    public final void OooO0O0(List<PenColorVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106666Oooo00o.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.penbar.PenBarColorAdapter");
        ((C29553o00O0O) adapter).OooO0Oo(list);
    }

    public final void OooO0OO(C31056OooOoo penSettingsVO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penSettingsVO, "penSettingsVO");
        PenVO penVO = penSettingsVO.f110874OooO00o;
        if (penVO != null) {
            String string = penVO.getExtra().getString(C18437z2.f56754h);
            if (string == null) {
                string = DrawToolFactory.LASSO_TYPE_FREE;
            }
            OooO0Oo(string);
            String string2 = penVO.getExtra().getString("filter");
            OooOo0(string2 != null ? C33599OooOo0O.OoooOO0(string2, new String[]{","}) : C34434OooOoO.f123453OooOo0o);
            String string3 = penVO.getExtra().getString("showDualLinkIcon");
            if (string3 == null) {
                string3 = TelemetryEventStrings.Value.TRUE;
            }
            boolean zEquals = string3.equals(TelemetryEventStrings.Value.TRUE);
            SwitchMaterial switchMaterial = this.f106663Oooo0;
            switchMaterial.setChecked(zEquals);
            String string4 = penVO.getExtra().getString("isDualLinkFeatureEnabled");
            if (string4 == null) {
                string4 = TelemetryEventStrings.Value.TRUE;
            }
            boolean zEquals2 = string4.equals(TelemetryEventStrings.Value.TRUE);
            switchMaterial.setEnabled(zEquals2);
            this.f106667Oooo0O0.setEnabled(zEquals2);
        }
        OooO0O0(penSettingsVO.f110876OooO0OO);
        OooO00o();
    }

    public final void OooO0Oo(String str) {
        this.f106669Oooo0o0 = str;
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO(DrawToolFactory.LASSO_TYPE_FREE, this.f106655OooOo0o), new C32443OooOOO(DrawToolFactory.LASSO_TYPE_RECT, this.f106654OooOo), new C32443OooOOO(DrawToolFactory.LASSO_TYPE_CAPTURE, this.f106657OooOoO0)).entrySet()) {
            ((ImageView) entry.getValue()).setSelected(str.equals((String) entry.getKey()));
        }
        Iterator it = C34429OooOOo0.OooOO0o(this.f106660OooOoo0, this.f106661OooOooO, this.f106664Oooo000, this.f106665Oooo00O, this.f106659OooOoo, this.f106662OooOooo).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(!str.equals(DrawToolFactory.LASSO_TYPE_CAPTURE));
        }
        OooO00o();
    }

    @Override // o0o00o0.InterfaceC29933OooO0Oo
    public final void OooOo0(List<String> list) {
        for (Map.Entry entry : C34444Oooo0O0.OooO0oo(new C32443OooOOO("shape", this.f106660OooOoo0), new C32443OooOOO("text", this.f106661OooOooO), new C32443OooOOO("image", this.f106664Oooo000)).entrySet()) {
            ((ImageView) entry.getValue()).setActivated(list.contains((String) entry.getKey()));
        }
    }
}
