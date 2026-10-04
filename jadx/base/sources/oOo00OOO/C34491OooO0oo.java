package oOo00OOO;

import com.huawei.hms.network.embedded.C18358t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0OOOO.C32944OooO0Oo;
import oO0Oo0o0.OooOO0;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.Oooo0;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO.InterfaceC33454OooO0Oo;
import oO0o000.C33538OooO0OO;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oOo00OOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34491OooO0oo extends AbstractC33316OooOo0o implements Oooo0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34491OooO0oo(AbstractC33328Oooo0O0 lowerBound, AbstractC33328Oooo0O0 upperBound) {
        super(lowerBound, upperBound);
        OooOOO0.OooO0oO(lowerBound, "lowerBound");
        OooOOO0.OooO0oO(upperBound, "upperBound");
        InterfaceC33454OooO0Oo.f120914OooO00o.OooO0Oo(lowerBound, upperBound);
    }

    public static final ArrayList o0000O00(C32944OooO0Oo c32944OooO0Oo, AbstractC33320OooOoo abstractC33320OooOoo) {
        List<InterfaceC33348OooooOO> listO000000O = abstractC33320OooOoo.o000000O();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO000000O, 10));
        Iterator<T> it = listO000000O.iterator();
        while (it.hasNext()) {
            arrayList.add(c32944OooO0Oo.OooooO0((InterfaceC33348OooooOO) it.next()));
        }
        return arrayList;
    }

    public static final String o0000oo(String str, String str2) {
        if (!C33599OooOo0O.OooOoo0(str, '<')) {
            return str;
        }
        return C33599OooOo0O.Ooooo0o(str, '<') + '<' + str2 + '>' + C33599OooOo0O.OoooOoo('>', str, str);
    }

    @Override // oO0Ooo.AbstractC33316OooOo0o, oO0Ooo.AbstractC33320OooOoo
    public final OooOO0 OooOOO0() {
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = o00000().OooO0OO();
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO : null;
        if (interfaceC32596OooO0o0 != null) {
            OooOO0 oooOO0OooOoO = interfaceC32596OooO0o0.OooOoO(new C34488OooO0o());
            OooOOO0.OooO0o(oooOO0OooOoO, "classDescriptor.getMemberScope(RawSubstitution())");
            return oooOO0OooOoO;
        }
        throw new IllegalStateException(("Incorrect classifier: " + o00000().OooO0OO()).toString());
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o0000, reason: merged with bridge method [inline-methods] */
    public final AbstractC33316OooOo0o o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C34491OooO0oo((AbstractC33328Oooo0O0) kotlinTypeRefiner.Oooo0o0(this.f120554OooOo), (AbstractC33328Oooo0O0) kotlinTypeRefiner.Oooo0o0(this.f120555OooOoO0));
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o00000Oo(boolean z) {
        return new C34491OooO0oo(this.f120554OooOo.o00000Oo(z), this.f120555OooOoO0.o00000Oo(z));
    }

    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final AbstractC33328Oooo0O0 o00000oO() {
        return this.f120554OooOo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0Ooo.AbstractC33316OooOo0o
    public final String o00000oo(C32944OooO0Oo c32944OooO0Oo, C32944OooO0Oo c32944OooO0Oo2) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = this.f120554OooOo;
        String strOoooOOo = c32944OooO0Oo.OoooOOo(abstractC33328Oooo0O0);
        AbstractC33328Oooo0O0 abstractC33328Oooo0O02 = this.f120555OooOoO0;
        String strOoooOOo2 = c32944OooO0Oo.OoooOOo(abstractC33328Oooo0O02);
        if (c32944OooO0Oo2.f118975OooO0Oo.OooOOO()) {
            return "raw (" + strOoooOOo + ".." + strOoooOOo2 + ')';
        }
        if (abstractC33328Oooo0O02.o000000O().isEmpty()) {
            return c32944OooO0Oo.OooOooo(strOoooOOo, strOoooOOo2, C33538OooO0OO.OooO0o0(this));
        }
        ArrayList arrayListO0000O00 = o0000O00(c32944OooO0Oo, abstractC33328Oooo0O0);
        ArrayList arrayListO0000O002 = o0000O00(c32944OooO0Oo, abstractC33328Oooo0O02);
        String strO000oOoO = OooOo.o000oOoO(arrayListO0000O00, ", ", null, null, C34490OooO0oO.f123598OooOo0o, 30);
        ArrayList<C32443OooOOO> arrayListO000OOo = OooOo.o000OOo(arrayListO0000O00, arrayListO0000O002);
        if (arrayListO000OOo.isEmpty()) {
            strOoooOOo2 = o0000oo(strOoooOOo2, strO000oOoO);
        } else {
            for (C32443OooOOO c32443OooOOO : arrayListO000OOo) {
                String str = (String) c32443OooOOO.f116638OooOo0o;
                String str2 = (String) c32443OooOOO.f116637OooOo;
                if (!OooOOO0.OooO0O0(str, C33599OooOo0O.OoooO0(str2, "out ")) && !str2.equals(C18358t1.g.f56183c)) {
                    break;
                }
            }
            strOoooOOo2 = o0000oo(strOoooOOo2, strO000oOoO);
        }
        String strO0000oo = o0000oo(strOoooOOo, strO000oOoO);
        return OooOOO0.OooO0O0(strO0000oo, strOoooOOo2) ? strO0000oo : c32944OooO0Oo.OooOooo(strO0000oo, strOoooOOo2, C33538OooO0OO.OooO0o0(this));
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o0000Ooo(C33339OoooOOO newAttributes) {
        OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return new C34491OooO0oo(this.f120554OooOo.o0000Ooo(newAttributes), this.f120555OooOoO0.o0000Ooo(newAttributes));
    }
}
