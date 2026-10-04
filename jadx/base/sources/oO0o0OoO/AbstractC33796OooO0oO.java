package oO0o0OoO;

import Oooo0oO.C21111o0ooOoO;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33628OooOoo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33796OooO0oO<T> implements InterfaceC33807OooOOoo<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f121834OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f121835OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final EnumC33692OooO0OO f121836OooOoO0;

    public AbstractC33796OooO0oO(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        this.f121835OooOo0o = interfaceC34415OooO0oo;
        this.f121834OooOo = i;
        this.f121836OooOoO0 = enumC33692OooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // oO0o0OoO.InterfaceC33807OooOOoo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC33721OooO0o<T> OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo2 = this.f121835OooOo0o;
        InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = interfaceC34415OooO0oo.plus(interfaceC34415OooO0oo2);
        EnumC33692OooO0OO enumC33692OooO0OO2 = EnumC33692OooO0OO.f121452OooOo0o;
        EnumC33692OooO0OO enumC33692OooO0OO3 = this.f121836OooOoO0;
        int i2 = this.f121834OooOo;
        if (enumC33692OooO0OO == enumC33692OooO0OO2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i == -2) {
                            i = i2;
                        } else {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            enumC33692OooO0OO = enumC33692OooO0OO3;
        }
        return (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34415OooO0ooPlus, interfaceC34415OooO0oo2) && i == i2 && enumC33692OooO0OO == enumC33692OooO0OO3) ? this : OooO0o0(interfaceC34415OooO0ooPlus, i, enumC33692OooO0OO);
    }

    public abstract Object OooO0O0(InterfaceC33712OooOo0O<? super T> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation);

    public abstract AbstractC33796OooO0oO<T> OooO0o0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO);

    public InterfaceC33721OooO0o<T> OooO0oO() {
        return null;
    }

    public C33710OooOo0 OooO0oo(InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
        int i = this.f121834OooOo;
        if (i == -3) {
            i = -2;
        }
        EnumC33637Oooo0O0 enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121319OooOoO0;
        InterfaceC32508OooOOOo c33794OooO0o = new C33794OooO0o(this, null);
        C33710OooOo0 c33710OooOo0 = new C33710OooOo0(C33628OooOoo.OooO0O0(interfaceC33636Oooo00o, this.f121835OooOo0o), C33703OooOOO0.OooO00o(i, 4, this.f121836OooOoO0), true, true);
        c33710OooOo0.Ooooooo(enumC33637Oooo0O0, c33710OooOo0, c33794OooO0o);
        return c33710OooOo0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        Object objOooO0o0 = C33633Oooo0.OooO0o0(new C33795OooO0o0(interfaceC33723OooO0oO, this, null), continuation);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f121835OooOo0o;
        if (interfaceC34415OooO0oo != oooO) {
            arrayList.add("context=" + interfaceC34415OooO0oo);
        }
        int i = this.f121834OooOo;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        EnumC33692OooO0OO enumC33692OooO0OO = EnumC33692OooO0OO.f121452OooOo0o;
        EnumC33692OooO0OO enumC33692OooO0OO2 = this.f121836OooOoO0;
        if (enumC33692OooO0OO2 != enumC33692OooO0OO) {
            arrayList.add("onBufferOverflow=" + enumC33692OooO0OO2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return C21111o0ooOoO.OooO0OO(oOo000Oo.OooOo.o000oOoO(arrayList, ", ", null, null, null, 62), ']', sb);
    }
}
