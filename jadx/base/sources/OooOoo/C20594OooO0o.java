package OooOoo;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: OooOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20594OooO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58870OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58871OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20594OooO0o(Object obj, int i) {
        super(1);
        this.f58871OooOo0o = i;
        this.f58870OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f58871OooOo0o) {
            case 0:
                ((C20595OooO0o0) this.f58870OooOo).f58877OooOoo = (InterfaceC34635OooOOOO) obj;
                return C32460OooOooO.f116667OooO00o;
            default:
                return Boolean.valueOf(kotlin.jvm.internal.OooOOO0.OooO0O0((String) obj, (String) this.f58870OooOo));
        }
    }
}
