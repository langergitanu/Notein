package o0oO0O00;

import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import o0oO0O00.C30781OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0oO0O00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30774OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f110042OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f110043OooOo0o;

    public /* synthetic */ C30774OooO0Oo(Object obj, int i) {
        this.f110043OooOo0o = i;
        this.f110042OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        C33781o00o0O c33781o00o0O;
        Object value;
        C30780OooOO0O c30780OooOO0O;
        switch (this.f110043OooOo0o) {
            case 0:
                String value2 = (String) obj;
                OooOOO0.OooO0oO(value2, "value");
                C30781OooOO0o c30781OooOO0o = ((com.orion.notein.p607ui.login.password.reset.OooO00o) this.f110042OooOo).f72514OooO0O0;
                c30781OooOO0o.getClass();
                do {
                    c33781o00o0O = c30781OooOO0o.f110060OooO0o0;
                    value = c33781o00o0O.getValue();
                    c30780OooOO0O = (C30780OooOO0O) value;
                } while (!c33781o00o0O.OooO(value, C30780OooOO0O.OooO00o(c30780OooOO0O, value2, value2.length() > 0 && !c30780OooOO0O.f110053OooO0OO, false, EnumC26248OooOo0.f89694OooOo0o, Integer.valueOf(C30781OooOO0o.OooO00o.f110063OooO00o[c30780OooOO0O.f110055OooO0o.ordinal()] == 1 ? R.string.input_original_password_tip : R.string.password_hint), 36)));
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from DualLinkRefEntity where note_id = ?");
                String str = (String) this.f110042OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
