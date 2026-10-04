package o0ooOOO0;

import com.orion.notein.p607ui.login.verificationcode.PhoneVerificationRequestFragment;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0O.C33859OooO0O0;

/* JADX INFO: renamed from: o0ooOOO0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31633OooOOO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f113083OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f113084OooOo0o;

    public /* synthetic */ C31633OooOOO0(Object obj, int i) {
        this.f113084OooOo0o = i;
        this.f113083OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        switch (this.f113084OooOo0o) {
            case 0:
                String value2 = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value2, "value");
                PhoneVerificationRequestFragment phoneVerificationRequestFragment = (PhoneVerificationRequestFragment) this.f113083OooOo;
                C31639OooOo0 c31639OooOo0Oooo000 = phoneVerificationRequestFragment.Oooo000();
                do {
                    c33781o00o0O = c31639OooOo0Oooo000.f113094OooO0Oo;
                    value = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value, C31640OooOo00.OooO00o((C31640OooOo00) value, null, value2, false, 5)));
                phoneVerificationRequestFragment.OooOooo().OooO();
                return C32460OooOooO.f116667OooO00o;
            default:
                return new C33859OooO0O0.OooO0OO((C33859OooO0O0) this.f113083OooOo, (InterfaceC32507OooOO0o) obj);
        }
    }
}
