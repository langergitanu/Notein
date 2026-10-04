package o0Ooo0oo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import o0OoOOo.C29132OooO0o0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Ooo0oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29466OooOoo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f104536OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104537OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Integer f104538OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f104539OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C29132OooO0o0 f104540OooOoOO;

    public /* synthetic */ C29466OooOoo0(PenBarChildFragment penBarChildFragment, int i, int i2, Integer num, C29132OooO0o0 c29132OooO0o0) {
        this.f104537OooOo0o = penBarChildFragment;
        this.f104536OooOo = i;
        this.f104539OooOoO0 = i2;
        this.f104538OooOoO = num;
        this.f104540OooOoOO = c29132OooO0o0;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        PenBarChildFragment penBarChildFragment = this.f104537OooOo0o;
        penBarChildFragment.f75310o0O0O00 = false;
        View view = penBarChildFragment.f75250Oooo0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
            throw null;
        }
        view.setVisibility(8);
        View view2 = penBarChildFragment.f75252Oooo00O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
            throw null;
        }
        view2.setAlpha(1.0f);
        View view3 = penBarChildFragment.f75251Oooo000;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
            throw null;
        }
        view3.setAlpha(1.0f);
        View view4 = penBarChildFragment.f75253Oooo00o;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
            throw null;
        }
        view4.setAlpha(1.0f);
        View view5 = penBarChildFragment.f75248OooOooo;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view5.getLayoutParams().width = this.f104536OooOo;
        View view6 = penBarChildFragment.f75248OooOooo;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view6.getLayoutParams().height = this.f104539OooOoO0;
        View view7 = penBarChildFragment.f75248OooOooo;
        if (view7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        int paddingLeft = view7.getPaddingLeft();
        View view8 = penBarChildFragment.f75248OooOooo;
        if (view8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        int paddingTop = view8.getPaddingTop();
        int iOooo0OO = penBarChildFragment.Oooo0OO(this.f104538OooOoO.intValue());
        View view9 = penBarChildFragment.f75248OooOooo;
        if (view9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view7.setPadding(paddingLeft, paddingTop, iOooo0OO, view9.getPaddingBottom());
        View view10 = penBarChildFragment.f75248OooOooo;
        if (view10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view10.requestLayout();
        C29132OooO0o0 c29132OooO0o0 = this.f104540OooOoOO;
        if (c29132OooO0o0 == null) {
            return null;
        }
        c29132OooO0o0.invoke();
        return C32460OooOooO.f116667OooO00o;
    }
}
