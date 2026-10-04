package Oooo0O0;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import OooooO0.C21290OooO0o0;
import o00000o0.EnumC24118OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: Oooo0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20911OooO0Oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f60318OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21233OooO0o f60319OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f60320OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ long f60321OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ EnumC24118OooO0oO f60322OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ boolean f60323OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20911OooO0Oo(int i, long j, InterfaceC21233OooO0o interfaceC21233OooO0o, EnumC24118OooO0oO enumC24118OooO0oO, boolean z, boolean z2) {
        super(2);
        this.f60319OooOo0o = interfaceC21233OooO0o;
        this.f60318OooOo = z;
        this.f60321OooOoO0 = j;
        this.f60320OooOoO = i;
        this.f60322OooOoOO = enumC24118OooO0oO;
        this.f60323OooOoo0 = z2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            interfaceC21033OooOOOO2.OooOo00(386443790);
            boolean z = this.f60318OooOo;
            Boolean boolValueOf = Boolean.valueOf(z);
            long j = this.f60321OooOoO0;
            C21290OooO0o0 c21290OooO0o0 = new C21290OooO0o0(j);
            interfaceC21033OooOOOO2.OooOo00(511388516);
            boolean zOooO0oo = interfaceC21033OooOOOO2.OooO0oo(boolValueOf) | interfaceC21033OooOOOO2.OooO0oo(c21290OooO0o0);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new C20910OooO0OO(j, z);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO2.OooOoo();
            InterfaceC21233OooO0o interfaceC21233OooO0oOooO0o = C20519OooO0Oo.OooO0o(this.f60319OooOo0o, false, (InterfaceC32507OooOO0o) objOooOo0);
            int i = this.f60320OooOoO & 8176;
            C20908OooO00o.OooO00o(interfaceC21233OooO0oOooO0o, this.f60318OooOo, this.f60322OooOoOO, this.f60323OooOoo0, interfaceC21033OooOOOO2, i);
            interfaceC21033OooOOOO2.OooOoo();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
