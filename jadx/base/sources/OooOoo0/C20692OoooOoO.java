package OooOoo0;

import OooOooO.C20727OooO0Oo;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo000.InterfaceC20896OooO0o0;
import Ooooo0o.InterfaceC21272OooOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Ooo.C33822OooO0OO;
import oo000o.InterfaceC34654Oooo0OO;

/* JADX INFO: renamed from: OooOoo0.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20692OoooOoO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21272OooOo, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33822OooO0OO f59398OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34654Oooo0OO f59399OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<InterfaceC34654Oooo0OO.OooO00o> f59400OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<Boolean> f59401OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<C20727OooO0Oo> f59402OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20896OooO0o0 f59403OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59404OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20692OoooOoO(InterfaceC34654Oooo0OO interfaceC34654Oooo0OO, C33822OooO0OO c33822OooO0OO, Oooo0oO.o00oO0O o00oo0o, Oooo0oO.o00oO0O o00oo0o2, Oooo0oO.o00oO0O o00oo0o3, InterfaceC20736OooOOO0 interfaceC20736OooOOO0, InterfaceC20896OooO0o0 interfaceC20896OooO0o0) {
        super(1);
        this.f59399OooOo0o = interfaceC34654Oooo0OO;
        this.f59398OooOo = c33822OooO0OO;
        this.f59401OooOoO0 = o00oo0o;
        this.f59400OooOoO = o00oo0o2;
        this.f59402OooOoOO = o00oo0o3;
        this.f59404OooOoo0 = interfaceC20736OooOOO0;
        this.f59403OooOoo = interfaceC20896OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC21272OooOo interfaceC21272OooOo) {
        InterfaceC21272OooOo it = interfaceC21272OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        Boolean boolValueOf = Boolean.valueOf(it.OooO00o());
        Oooo0oO.o00oO0O<Boolean> o00oo0o = this.f59401OooOoO0;
        o00oo0o.setValue(boolValueOf);
        boolean zBooleanValue = o00oo0o.getValue().booleanValue();
        C33822OooO0OO c33822OooO0OO = this.f59398OooOo;
        InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59404OooOoo0;
        Oooo0oO.o00oO0O<C20727OooO0Oo> o00oo0o2 = this.f59402OooOoOO;
        Oooo0oO.o00oO0O<InterfaceC34654Oooo0OO.OooO00o> o00oo0o3 = this.f59400OooOoO;
        if (zBooleanValue) {
            InterfaceC34654Oooo0OO interfaceC34654Oooo0OO = this.f59399OooOo0o;
            o00oo0o3.setValue(interfaceC34654Oooo0OO != null ? interfaceC34654Oooo0OO.OooO00o() : null);
            C33609OooO0oo.OooO0OO(c33822OooO0OO, null, null, new C20690OoooOOo(o00oo0o2, interfaceC20736OooOOO0, this.f59403OooOoo, null), 3);
        } else {
            InterfaceC34654Oooo0OO.OooO00o value = o00oo0o3.getValue();
            if (value != null) {
                value.release();
            }
            o00oo0o3.setValue(null);
            C33609OooO0oo.OooO0OO(c33822OooO0OO, null, null, new C20691OoooOo0(interfaceC20736OooOOO0, o00oo0o2, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
