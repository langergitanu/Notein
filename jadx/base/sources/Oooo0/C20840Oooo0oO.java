package Oooo0;

import java.util.List;
import o0000o0O.C24280OoooO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20840Oooo0oO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59931OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59932OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20840Oooo0oO(Object obj, int i) {
        super(1);
        this.f59932OooOo0o = i;
        this.f59931OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f59932OooOo0o) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                o000O0 o000o0 = (o000O0) this.f59931OooOo;
                if (o000o0.OooO0OO() != null) {
                    o000O0Oo o000o0ooOooO0OO = o000o0.OooO0OO();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(o000o0ooOooO0OO);
                    it.add(o000o0ooOooO0OO.f60144OooO00o);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Throwable th = (Throwable) obj;
                o0000o0O.OooOOO oooOOO = (o0000o0O.OooOOO) this.f59931OooOo;
                if (th != null) {
                    oooOOO.f81558OooO0oo.OooO0O0(new C24280OoooO(th));
                }
                if (oooOOO.f81559OooOO0.isInitialized()) {
                    ((o0000o0O.o0ooOOo) oooOOO.f81559OooOO0.getValue()).close();
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
