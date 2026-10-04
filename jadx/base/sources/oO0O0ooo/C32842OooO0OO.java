package oO0O0ooo;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.HashMap;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0O0o.OooOOO;
import oO0O0oOo.InterfaceC32777OooO0oO;
import oO0O0oo0.C32782OooO0Oo;
import oO0O0ooo.AbstractC32840OooO00o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0o0000.InterfaceC33541OooO0oO;
import oOo00OOo.C34499OooO0oO;
import ooOOO0Oo.C35033OooO0o0;

/* JADX INFO: renamed from: oO0O0ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32842OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Object, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32840OooO00o.C20258OooO00o f117894OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32876OooOo0O f117895OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32842OooO0OO(C32876OooOo0O c32876OooOo0O, AbstractC32840OooO00o.C20258OooO00o c20258OooO00o) {
        super(1);
        this.f117895OooOo0o = c32876OooOo0O;
        this.f117894OooOo = c20258OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Object extractNullability) {
        boolean z;
        boolean z2 = true;
        kotlin.jvm.internal.OooOOO0.OooO0oO(extractNullability, "$this$extractNullability");
        AbstractC32840OooO00o.C20258OooO00o c20258OooO00o = this.f117894OooOo;
        C32876OooOo0O c32876OooOo0O = this.f117895OooOo0o;
        oOo0oooO.OooO0OO annotation = (oOo0oooO.OooO0OO) extractNullability;
        if (!(annotation instanceof InterfaceC32777OooO0oO) || !((InterfaceC32777OooO0oO) annotation).OooO00o()) {
            boolean z3 = annotation instanceof C32782OooO0Oo;
            C34499OooO0oO c34499OooO0oO = c32876OooOo0O.f117969OooO0OO;
            if (z3) {
                c34499OooO0oO.f123639OooO00o.f123626OooOo00.getClass();
                if (!((C32782OooO0Oo) annotation).f117772OooO0oo) {
                    if (c32876OooOo0O.f117970OooO0Oo != ooOOO0Oo.OooO0OO.TYPE_PARAMETER_BOUNDS) {
                        InterfaceC33541OooO0oO interfaceC33541OooO0oO = c20258OooO00o.f117889OooO00o;
                        if (interfaceC33541OooO0oO == null || !oO0O0O0o.OooOO0.OooOooo((AbstractC33320OooOoo) interfaceC33541OooO0oO)) {
                            z2 = false;
                        } else {
                            C35033OooO0o0 c35033OooO0o0OooO0o0 = c32876OooOo0O.OooO0o0();
                            c35033OooO0o0OooO0o0.getClass();
                            kotlin.jvm.internal.OooOOO0.OooO0oO(annotation, "annotation");
                            oOo0oooO.OooO0OO OooO0Oo2 = c35033OooO0o0OooO0o0.OooO0Oo(annotation, OooOOO.OooO00o.f117170OooOo00);
                            if (OooO0Oo2 == null) {
                                z = false;
                                if (!z) {
                                    c34499OooO0oO.f123639OooO00o.f123626OooOo00.getClass();
                                }
                            } else {
                                ArrayList<String> arrayListOooO00o = c35033OooO0o0OooO0o0.OooO00o(OooO0Oo2, false);
                                if (!arrayListOooO00o.isEmpty()) {
                                    for (String str : arrayListOooO00o) {
                                        HashMap<String, oOo0oooO.OooOOO0> map = oOo0oooO.OooOOO0.f123930OooOo;
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, CredentialProviderBaseController.TYPE_TAG)) {
                                            z = true;
                                            break;
                                        }
                                    }
                                    z = false;
                                    if (!z) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
