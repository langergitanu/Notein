package OooOooo;

import OoooOoO.C21230OooO0O0;
import o0ooOO0.C31583o0000oo0;
import o0ooOO0.o0OOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOooo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20798OoooOOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59720OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59721OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20798OoooOOo(Object obj, int i) {
        super(1);
        this.f59721OooOo0o = i;
        this.f59720OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f59721OooOo0o) {
            case 0:
                o0OOO0o $receiver = (o0OOO0o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO($receiver, "$this$$receiver");
                C21230OooO0O0.C18985OooO0O0 c18985OooO0O0 = (C21230OooO0O0.C18985OooO0O0) this.f59720OooOo;
                C31583o0000oo0 c31583o0000oo0 = $receiver.f112918OooO00o;
                c31583o0000oo0.OooO0O0("align", c18985OooO0O0);
                c31583o0000oo0.OooO0O0("unbounded", Boolean.FALSE);
                break;
            default:
                ((StringBuilder) this.f59720OooOo).append(oO00O0o0.OooO0O0.OooO00o(((Number) obj).byteValue()));
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
