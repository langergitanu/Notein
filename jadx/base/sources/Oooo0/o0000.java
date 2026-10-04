package Oooo0;

import OooOoOO.C20518OooO0OO;
import OooOoOO.C20529OooOOOO;
import OooooO0.C21289OooO0o;
import OooooO0.C21291OooO0oO;
import OooooO0.C21293OooOO0;
import OooooOO.AbstractC21341OoooOO0;
import Oooooo0.InterfaceC21400OooO0Oo;
import o00000.InterfaceC24054OooOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21400OooO0Oo, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24054OooOo0 f59980OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20518OooO0OO<Float, C20529OooOOOO> f59981OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59982OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00000.Oooo0 f59983OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC21341OoooOO0 f59984OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO, InterfaceC24054OooOo0 interfaceC24054OooOo0, o00000.Oooo0 oooo0, o000O0 o000o0, AbstractC21341OoooOO0 abstractC21341OoooOO0) {
        super(1);
        this.f59981OooOo0o = c20518OooO0OO;
        this.f59980OooOo = interfaceC24054OooOo0;
        this.f59983OooOoO0 = oooo0;
        this.f59982OooOoO = o000o0;
        this.f59984OooOoOO = abstractC21341OoooOO0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC21400OooO0Oo interfaceC21400OooO0Oo) {
        InterfaceC21400OooO0Oo drawWithContent = interfaceC21400OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawWithContent, "$this$drawWithContent");
        drawWithContent.Ooooo0o();
        float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(this.f59981OooOo0o.OooO0OO().floatValue(), 0.0f, 1.0f);
        if (fOooO0o0 != 0.0f) {
            o00000.Oooo0 oooo0 = this.f59983OooOoO0;
            int i = C34696OooOOoo.f124979OooO0OO;
            int iOooO0O0 = this.f59980OooOo.OooO0O0((int) (oooo0.f81084OooO0O0 >> 32));
            o000O0Oo o000o0ooOooO0OO = this.f59982OooOoO.OooO0OO();
            C21291OooO0oO c21291OooO0oOOooO0OO = o000o0ooOooO0OO != null ? o000o0ooOooO0OO.f60144OooO00o.OooO0OO(iOooO0O0) : new C21291OooO0oO(0.0f, 0.0f, 0.0f, 0.0f);
            float fO0OOO0o = drawWithContent.o0OOO0o(C20880o0000oo.f60073OooO0O0);
            float f = fO0OOO0o / 2;
            float f2 = c21291OooO0oOOooO0OO.f61724OooO00o + f;
            float fOooO0Oo = C21293OooOO0.OooO0Oo(drawWithContent.OooOOo0()) - f;
            if (f2 > fOooO0Oo) {
                f2 = fOooO0Oo;
            }
            drawWithContent.OooOoOO(this.f59984OooOoOO, C21289OooO0o.OooO00o(f2, c21291OooO0oOOooO0OO.f61725OooO0O0), C21289OooO0o.OooO00o(f2, c21291OooO0oOOooO0OO.f61727OooO0Oo), fO0OOO0o, fOooO0o0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
