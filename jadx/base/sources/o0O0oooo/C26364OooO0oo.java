package o0O0oooo;

import com.orion.notein.p607ui.user.settings.verifycode.VerifyCodeFragment;
import com.orion.penkit.models.DualLinkSourceInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o0OOoO0o.C27755OooO0Oo;
import o0Oo0ooo.C28482OooOOoo;
import o0Oo0ooo.C28496OooOooO;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0O0oooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26364OooO0oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90468OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90469OooOo0o;

    public /* synthetic */ C26364OooO0oo(Object obj, int i) {
        this.f90469OooOo0o = i;
        this.f90468OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        C32465OooO0O0 c32465OooO0O0OooO0O0;
        C33781o00o0O c33781o00o0O;
        Object value;
        switch (this.f90469OooOo0o) {
            case 0:
                C26395Oooo0o0 c26395Oooo0o0 = (C26395Oooo0o0) this.f90468OooOo;
                Integer num = (Integer) obj;
                num.getClass();
                synchronized (c26395Oooo0o0.f90559OooO0oo) {
                    C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                    HashMap<Integer, List<DualLinkSourceInfo>> map = c26395Oooo0o0.f90569OooOOoo;
                    C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                    c32465OooO0O0OooO0Oo.addAll(map.getOrDefault(num, c34434OooOoO));
                    c32465OooO0O0OooO0Oo.addAll(c26395Oooo0o0.f90572OooOo00.getOrDefault(num, c34434OooOoO));
                    c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                }
                return c32465OooO0O0OooO0O0;
            case 1:
                C27755OooO0Oo c27755OooO0Oo = (C27755OooO0Oo) this.f90468OooOo;
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(entry, "<destruct>");
                String str = (String) entry.getKey();
                C27755OooO0Oo.OooO0O0 oooO0O0 = (C27755OooO0Oo.OooO0O0) entry.getValue();
                return Boolean.valueOf((c27755OooO0Oo.f97993OooO0oO.contains(str) || oooO0O0.f98004OooO00o.isEmpty() || oooO0O0.f98005OooO0O0 != C27755OooO0Oo.EnumC27756OooO0o0.f98020OooOo) ? false : true);
            default:
                String value2 = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value2, "value");
                C28496OooOooO c28496OooOooOOooOoo = ((VerifyCodeFragment) this.f90468OooOo).OooOoo();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < value2.length(); i++) {
                    char cCharAt = value2.charAt(i);
                    if (!io.ktor.utils.p616io.Oooo000.OooO0o0(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String enteredCode = sb.toString();
                do {
                    c33781o00o0O = c28496OooOooOOooOoo.f100983OooO0o0;
                    value = c33781o00o0O.getValue();
                    ((C28482OooOOoo) value).getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(enteredCode, "enteredCode");
                } while (!c33781o00o0O.OooO(value, new C28482OooOOoo(enteredCode, false, null)));
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
