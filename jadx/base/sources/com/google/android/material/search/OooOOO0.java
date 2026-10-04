package com.google.android.material.search;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import o000o0O0.C24564OooO00o;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30017OoooO0;
import o0o0O00.C30185OooO00o;
import o0o0OOO.C30465OooO0oo;
import o0o0OOO.C30471OooOOOO;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67727OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67728OooOo0o;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f67728OooOo0o = i;
        this.f67727OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f67728OooOo0o) {
            case 0:
                ((SearchView) this.f67727OooOo).lambda$setUpClearButton$2(view);
                break;
            case 1:
                ((com.orion.notein.p607ui.creative_library.purchase.OooO00o) this.f67727OooOo).OooO0O0(0);
                break;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                int color = penColorVO.getColor();
                C30017OoooO0 c30017OoooO0 = (C30017OoooO0) this.f67727OooOo;
                c30017OoooO0.OooO0Oo(color);
                C29936OooO0oO c29936OooO0oO = c30017OoooO0.f106696Oooo00O;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0Oo(penColorVO, view, c30017OoooO0.f106691OooOoo0);
                }
                break;
            case 3:
                ((C30185OooO00o) this.f67727OooOo).f107468OooO0O0.f107496OooO0O0.Oooo000(0);
                break;
            case 4:
                C30471OooOOOO c30471OooOOOO = ((C30465OooO0oo) this.f67727OooOo).f108794OooO0oO;
                if (c30471OooOOOO != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c30471OooOOOO.invoke(view);
                }
                break;
            default:
                C21030OooOO0o.OooO0OO((PageSettingsFragment) this.f67727OooOo).OooOOOO(new C24564OooO00o(R.id.action_pageSettingsFragment_to_globalPdfQuoteSettingFragment));
                break;
        }
    }
}
