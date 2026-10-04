package OooOoo0;

import Ooooo0o.InterfaceC21266OooOOO0;
import java.net.SocketTimeoutException;
import oO000oo.C32134OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.C32618OooOooo;
import oO0Ooo0O.C33418OoooO;
import oO0OooO0.C33477OooO0OO;
import ooOO.InterfaceC35030OooO0O0;

/* JADX INFO: renamed from: OooOoo0.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20694Ooooo00 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59407OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59408OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20694Ooooo00(Object obj, int i) {
        super(1);
        this.f59408OooOo0o = i;
        this.f59407OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f59408OooOo0o) {
            case 0:
                InterfaceC21266OooOOO0 focusProperties = (InterfaceC21266OooOOO0) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(focusProperties, "$this$focusProperties");
                focusProperties.OooO00o(!(((InterfaceC35030OooO0O0) this.f59407OooOo).OooO00o() == 1));
                return C32460OooOooO.f116667OooO00o;
            case 1:
                Throwable th = (Throwable) obj;
                Throwable th2 = null;
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if ((cause != null ? cause.getCause() : null) != null) {
                            cause = cause.getCause();
                        } else {
                            th2 = cause;
                        }
                    }
                }
                return th2 instanceof SocketTimeoutException ? C33418OoooO.OooO0O0((C32134OooO0o0) this.f59407OooOo, th) : th;
            default:
                C33477OooO0OO fqName = (C33477OooO0OO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
                return new oO0O0Oo0.OooOo00(((C32618OooOooo) this.f59407OooOo).f117269OooO0O0, fqName);
        }
    }
}
