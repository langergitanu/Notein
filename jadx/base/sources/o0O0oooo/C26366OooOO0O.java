package o0O0oooo;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.settings.profile.NicknameFragment;
import o0O0ooo0.EnumC26248OooOo0;
import o0oOoOO0.C31016OooO0O0;
import o0oOoOO0.C31019OooO0o;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0O0oooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26366OooOO0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90471OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90472OooOo0o;

    public /* synthetic */ C26366OooOO0O(Object obj, int i) {
        this.f90472OooOo0o = i;
        this.f90471OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        C32465OooO0O0 c32465OooO0O0OooO0O0;
        C33781o00o0O c33781o00o0O;
        Object value;
        EnumC26248OooOo0 enumC26248OooOo0;
        switch (this.f90472OooOo0o) {
            case 0:
                C26395Oooo0o0 c26395Oooo0o0 = (C26395Oooo0o0) this.f90471OooOo;
                Integer num = (Integer) obj;
                num.getClass();
                synchronized (c26395Oooo0o0.f90559OooO0oo) {
                    C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                    c32465OooO0O0OooO0Oo.addAll(c26395Oooo0o0.f90568OooOOo0.getOrDefault(num, C34434OooOoO.f123453OooOo0o));
                    c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                }
                return c32465OooO0O0OooO0O0;
            default:
                String value2 = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value2, "value");
                C31019OooO0o c31019OooO0oOooOoO = ((NicknameFragment) this.f90471OooOo).OooOoO();
                do {
                    c33781o00o0O = c31019OooO0oOooOoO.f110754OooO0oo;
                    value = c33781o00o0O.getValue();
                    enumC26248OooOo0 = EnumC26248OooOo0.f89694OooOo0o;
                    ((C31016OooO0O0) value).getClass();
                } while (!c33781o00o0O.OooO(value, new C31016OooO0O0(value2, enumC26248OooOo0, R.string.account_setting_nickname_hint, true)));
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
