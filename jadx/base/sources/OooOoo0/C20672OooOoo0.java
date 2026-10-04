package OooOoo0;

import o0Oo0oo.C28378OooO;
import o0Oo0oo.C28379OooO00o;
import o0Oo0oo.C28385OooO0oO;
import o0Oo0oo.C28396OooOOoo;
import o0Oo0oo.C28402OooOo0O;
import o0Oo0oo.InterfaceC28404OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: OooOoo0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20672OooOoo0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC28404OooOoO0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f59329OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C28385OooO0oO f59330OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f59331OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20672OooOoo0(C28385OooO0oO c28385OooO0oO, boolean z, oO0O000o.OooO00o oooO00o) {
        super(1);
        this.f59330OooOo0o = c28385OooO0oO;
        this.f59329OooOo = z;
        this.f59331OooOoO0 = oooO00o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC28404OooOoO0 interfaceC28404OooOoO0) {
        InterfaceC28404OooOoO0 semantics = interfaceC28404OooOoO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(semantics, "$this$semantics");
        C28385OooO0oO c28385OooO0oO = this.f59330OooOo0o;
        if (c28385OooO0oO != null) {
            C28402OooOo0O.OooO00o(semantics, c28385OooO0oO.f100639OooO00o);
        }
        C20670OooOoOO c20670OooOoOO = new C20670OooOoOO(this.f59331OooOoO0);
        InterfaceC34602OooOO0o<Object>[] interfaceC34602OooOO0oArr = C28402OooOo0O.f100700OooO00o;
        semantics.OooO0O0(C28378OooO.f100618OooO0O0, new C28379OooO00o(null, c20670OooOoOO));
        if (!this.f59329OooOo) {
            semantics.OooO0O0(C28396OooOOoo.f100661OooO, C32460OooOooO.f116667OooO00o);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
