package o000o0O0;

import java.util.Iterator;
import o000o0O0.C24585OooOoO0;
import o000o0O0.C24587OooOoo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33574OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C24589OooOooO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24572OooOO0o f83254OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24583OooOo0o f83255OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C24583OooOo0o c24583OooOo0o, C24572OooOO0o c24572OooOO0o) {
        super(1);
        this.f83255OooOo0o = c24583OooOo0o;
        this.f83254OooOo = c24572OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(C24589OooOooO c24589OooOooO) {
        C24589OooOooO navOptions = c24589OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(navOptions, "$this$navOptions");
        OooOOO0 animBuilder = OooOOO0.f83253OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(animBuilder, "animBuilder");
        OooO0OO oooO0OO = new OooO0OO();
        animBuilder.invoke(oooO0OO);
        int i = oooO0OO.f83179OooO00o;
        C24587OooOoo.OooO00o oooO00o = navOptions.f83336OooO00o;
        oooO00o.f83332OooO0o0 = i;
        oooO00o.f83331OooO0o = oooO0OO.f83180OooO0O0;
        C24583OooOo0o c24583OooOo0o = this.f83255OooOo0o;
        if (c24583OooOo0o instanceof C24585OooOoO0) {
            int i2 = C24583OooOo0o.f83294Oooo000;
            Iterator it = C33574OooOOO0.OooO(c24583OooOo0o, C24582OooOo0O.f83293OooOo0o).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C24572OooOO0o c24572OooOO0o = this.f83254OooOo;
                if (!zHasNext) {
                    int i3 = C24585OooOoO0.f83310Oooo0O0;
                    int i4 = C24585OooOoO0.OooO00o.OooO00o(c24572OooOO0o.OooO()).f83302OooOooO;
                    OooOOO popUpToBuilder = OooOOO.f83252OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(popUpToBuilder, "popUpToBuilder");
                    navOptions.f83338OooO0OO = i4;
                    C24601Oooo0o c24601Oooo0o = new C24601Oooo0o();
                    popUpToBuilder.invoke(c24601Oooo0o);
                    navOptions.f83339OooO0Oo = c24601Oooo0o.f83366OooO00o;
                    break;
                }
                C24583OooOo0o c24583OooOo0o2 = (C24583OooOo0o) it.next();
                C24583OooOo0o c24583OooOo0oOooO0oO = c24572OooOO0o.OooO0oO();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c24583OooOo0o2, c24583OooOo0oOooO0oO != null ? c24583OooOo0oOooO0oO.f83295OooOo : null)) {
                    break;
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
