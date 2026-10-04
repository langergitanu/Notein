package OooOoo0;

import OooOOO0.AbstractC20449OooO0Oo;
import OooooO0.C21290OooO0o0;
import OooooOO.C21368o0ooOoO;
import Oooooo0.C21403OooO0oO;
import Oooooo0.InterfaceC21400OooO0Oo;
import Oooooo0.InterfaceC21402OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21400OooO0Oo, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f59274OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21368o0ooOoO f59275OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC20449OooO0Oo f59276OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ long f59277OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(C21368o0ooOoO c21368o0ooOoO, long j, long j2, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        super(1);
        this.f59275OooOo0o = c21368o0ooOoO;
        this.f59274OooOo = j;
        this.f59277OooOoO0 = j2;
        this.f59276OooOoO = abstractC20449OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC21400OooO0Oo interfaceC21400OooO0Oo) {
        InterfaceC21400OooO0Oo onDrawWithContent = interfaceC21400OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.Ooooo0o();
        C21368o0ooOoO c21368o0ooOoO = this.f59275OooOo0o;
        AbstractC20449OooO0Oo abstractC20449OooO0Oo = this.f59276OooOoO;
        long j = this.f59274OooOo;
        long jO0ooOOo = this.f59277OooOoO0;
        if ((104 & 2) != 0) {
            j = C21290OooO0o0.f61718OooO0O0;
        }
        if ((104 & 4) != 0) {
            jO0ooOOo = InterfaceC21402OooO0o0.o0ooOOo(onDrawWithContent.OooOOo0(), j);
        }
        float f = (104 & 8) != 0 ? 1.0f : 0.0f;
        if ((104 & 16) != 0) {
            abstractC20449OooO0Oo = C21403OooO0oO.f61923OooOo0o;
        }
        onDrawWithContent.OoooOO0(c21368o0ooOoO, j, jO0ooOOo, f, abstractC20449OooO0Oo);
        return C32460OooOooO.f116667OooO00o;
    }
}
