package o0OoO0;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.p607ui.login.password.PasswordLoginFragment;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o.AbstractC33534OooOO0o;
import oO0o.C33523OooO00o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.C33913OooO0o;
import oO0oO00.o00000OO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28510OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101075OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101076OooOo0o;

    public /* synthetic */ C28510OooO0Oo(Object obj, int i) {
        this.f101076OooOo0o = i;
        this.f101075OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f101076OooOo0o) {
            case 0:
                final String value = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                C28522OooOo0O c28522OooOo0OOooOooo = ((PasswordLoginFragment) this.f101075OooOo).OooOooo();
                final String string = C33599OooOo0O.Oooooo0(value).toString();
                c28522OooOo0OOooOooo.OooO0o0(new InterfaceC32507OooOO0o() { // from class: o0OoO0.OooOOO
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj2) {
                        OooOO0O state = (OooOO0O) obj2;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                        int length = string.length();
                        boolean z = false;
                        if (8 <= length && length < 15) {
                            z = true;
                        }
                        return OooOO0O.OooO00o(state, null, null, null, value, z, null, false, false, false, 455);
                    }
                });
                return C32460OooOooO.f116667OooO00o;
            case 1:
                C33523OooO00o buildSerialDescriptor = (C33523OooO00o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C33523OooO00o.OooO00o(buildSerialDescriptor, C18437z2.f56754h, o00000OO.f122231OooO0O0);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
                C33913OooO0o c33913OooO0o = (C33913OooO0o) this.f101075OooOo;
                sb.append(c33913OooO0o.f122124OooO00o.OooOO0());
                sb.append('>');
                C33523OooO00o.OooO00o(buildSerialDescriptor, "value", oO0o.OooOO0O.OooO0OO(sb.toString(), AbstractC33534OooOO0o.OooO00o.f121130OooO00o, new InterfaceC33531OooO0o0[0], new oO0o.OooOO0()));
                C34434OooOoO c34434OooOoO = c33913OooO0o.f122125OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(c34434OooOoO, "<set-?>");
                buildSerialDescriptor.f121094OooO0O0 = c34434OooOoO;
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from DualLinkSourceEntity where note_id = ?");
                String str = (String) this.f101075OooOo;
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
