package com.orion.notein.p607ui.membership.plan;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.OooOo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import o0O0OoOo.C25900OooO00o;
import o0O0OoOo.OooO0OO;
import o0O0ooo0.C26239OooO0o;
import o0O0oooO.C26320o0000OoO;
import o0Oo0Ooo.ViewOnClickListenerC28134OooO;
import o0Oo0ooO.ViewOnClickListenerC28427OooOo00;
import o0OoO0Oo.C28628OooO00o;
import o0OoO0Oo.C28639OooOOO0;
import o0o00Oo.C29899OooO0o0;
import o0oOoOoO.C31097OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final TextButtonView f72741OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f72742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC19252OooO00o f72743OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C28639OooOOO0 f72744OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RecyclerView f72745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TextView f72746OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final View f72747OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f72748OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TextView f72749OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final TextView f72750OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C28628OooO00o f72751OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final String f72752OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f72753OooOOO0;

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19252OooO00o {
        Context OooO00o();

        int OooO0O0();

        void OooO0OO(String str, String str2);
    }

    public OooO00o(View view, InterfaceC19252OooO00o interfaceC19252OooO00o, C28639OooOOO0 c28639OooOOO0, C26320o0000OoO c26320o0000OoO, OooOo oooOo, String str) {
        this.f72742OooO00o = view;
        this.f72743OooO0O0 = interfaceC19252OooO00o;
        this.f72744OooO0OO = c28639OooOOO0;
        View viewFindViewById = view.findViewById(R.id.tv_user_name_compact);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("membership_content 缺少 tv_user_name_compact");
        }
        View viewFindViewById2 = view.findViewById(R.id.iv_user_avatar_compact);
        if (viewFindViewById2 == null) {
            throw new IllegalArgumentException("membership_content 缺少 iv_user_avatar_compact");
        }
        View viewFindViewById3 = view.findViewById(R.id.commodity_list);
        if (viewFindViewById3 == null) {
            throw new IllegalArgumentException("membership_content 缺少 commodity_list");
        }
        this.f72745OooO0Oo = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.commodity_detail_container);
        if (viewFindViewById4 == null) {
            throw new IllegalArgumentException("membership_content 缺少 commodity_detail_container");
        }
        this.f72747OooO0o0 = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_commodity_detail_description);
        if (viewFindViewById5 == null) {
            throw new IllegalArgumentException("membership_content 缺少 tv_commodity_detail_description");
        }
        this.f72746OooO0o = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.coupon_info_container);
        if (viewFindViewById6 == null) {
            throw new IllegalArgumentException("membership_content 缺少 coupon_info_container");
        }
        this.f72748OooO0oO = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_coupon_info);
        if (viewFindViewById7 == null) {
            throw new IllegalArgumentException("membership_content 缺少 tv_coupon_info");
        }
        this.f72749OooO0oo = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.vf_coupon_hints);
        if (viewFindViewById8 == null) {
            throw new IllegalArgumentException("membership_content 缺少 vf_coupon_hints");
        }
        View viewFindViewById9 = view.findViewById(R.id.btn_create_order);
        if (viewFindViewById9 == null) {
            throw new IllegalArgumentException("membership_content 缺少 btn_create_order");
        }
        this.f72741OooO = (TextButtonView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tv_agreement_text);
        if (viewFindViewById10 == null) {
            throw new IllegalArgumentException("membership_content 缺少 tv_agreement_text");
        }
        this.f72750OooOO0 = (TextView) viewFindViewById10;
        this.f72751OooOO0O = new C28628OooO00o();
        str = (str == null || C33599OooOo0O.Oooo0o0(str)) ? null : str;
        this.f72752OooOO0o = str;
        this.f72753OooOOO0 = str != null;
    }

    public final void OooO00o() {
        OooO0OO.OooO00o(this.f72750OooOO0, R.string.read_privacy_and_service_before_activation, new C25900OooO00o(R.string.privacy_policy, new InterfaceC32507OooOO0o() { // from class: o0OoO0Oo.OooO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                View it = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                Context context = this.f101498OooOo0o.f72750OooOO0.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(context, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }), new C25900OooO00o(R.string.service_agreement, new C26239OooO0o(this, 2)));
        this.f72741OooO.setOnClickListener(new ViewOnClickListenerC28134OooO(this, 1));
        RecyclerView recyclerView = this.f72745OooO0Oo;
        C28628OooO00o c28628OooO00o = this.f72751OooOO0O;
        recyclerView.setAdapter(c28628OooO00o);
        int iOooO0O0 = this.f72743OooO0O0.OooO0O0();
        if (iOooO0O0 > 0) {
            recyclerView.addItemDecoration(new C29899OooO0o0(iOooO0O0, 0, false));
        }
        c28628OooO00o.f101475OooO0O0 = new ViewOnClickListenerC28427OooOo00(this, 1);
        this.f72747OooO0o0.setVisibility(!C33599OooOo0O.Oooo0o0(this.f72746OooO0o.getText().toString()) ? 0 : 8);
        this.f72748OooO0oO.setVisibility(C33599OooOo0O.Oooo0o0(this.f72749OooO0oo.getText().toString()) ? 8 : 0);
    }
}
