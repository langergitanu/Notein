package o0Ooo0oo;

import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.shapeeditor.AnchorAssistLinePaintingDelegate;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Ooo0oo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29457OooOo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104523OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104524OooOo0o;

    public /* synthetic */ C29457OooOo(Object obj, int i) {
        this.f104524OooOo0o = i;
        this.f104523OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f104524OooOo0o) {
            case 0:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.f104523OooOo;
                penBarChildFragment.f75310o0O0O00 = false;
                View view = penBarChildFragment.f75251Oooo000;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                    throw null;
                }
                view.setVisibility(8);
                View view2 = penBarChildFragment.f75252Oooo00O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                    throw null;
                }
                view2.setVisibility(8);
                View view3 = penBarChildFragment.f75253Oooo00o;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
                    throw null;
                }
                view3.setVisibility(8);
                View view4 = penBarChildFragment.f75248OooOooo;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view4.setRotation(0.0f);
                View view5 = penBarChildFragment.f75248OooOooo;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view5.setLayoutDirection(0);
                View view6 = penBarChildFragment.f75248OooOooo;
                if (view6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view6.getLayoutParams().width = PenBarChildFragment.f75240o0000OOo;
                View view7 = penBarChildFragment.f75248OooOooo;
                if (view7 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view7.getLayoutParams().height = PenBarChildFragment.f75242o0000Oo0;
                View view8 = penBarChildFragment.f75248OooOooo;
                if (view8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view8.setPadding(0, 0, 0, 0);
                View view9 = penBarChildFragment.f75248OooOooo;
                if (view9 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view9.requestLayout();
                View view10 = penBarChildFragment.f75250Oooo0;
                if (view10 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = view10.getLayoutParams();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                View view11 = penBarChildFragment.f75250Oooo0;
                if (view11 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                    throw null;
                }
                view11.setLayoutParams(marginLayoutParams);
                View view12 = penBarChildFragment.f75250Oooo0;
                if (view12 != null) {
                    view12.requestLayout();
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                throw null;
            default:
                return AnchorAssistLinePaintingDelegate.OooO00o((AnchorAssistLinePaintingDelegate) this.f104523OooOo);
        }
    }
}
