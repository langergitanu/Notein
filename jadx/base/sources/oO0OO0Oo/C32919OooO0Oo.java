package oO0OO0Oo;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32449OooOOoo;
import oO0OO00.OooOOO;
import oO0OO00.OooOOOO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OO0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32919OooO0Oo implements InterfaceC32918OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f118799OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f118800OooO0O0;

    public C32919OooO0Oo(OooOOOO strings, OooOOO qualifiedNames) {
        OooOOO0.OooO0oO(strings, "strings");
        OooOOO0.OooO0oO(qualifiedNames, "qualifiedNames");
        this.f118799OooO00o = strings;
        this.f118800OooO0O0 = qualifiedNames;
    }

    @Override // oO0OO0Oo.InterfaceC32918OooO0OO
    public final String OooO00o(int i) {
        C32449OooOOoo<List<String>, List<String>, Boolean> c32449OooOOooOooO0OO = OooO0OO(i);
        List<String> list = c32449OooOOooOooO0OO.f116648OooOo0o;
        String strO000oOoO = OooOo.o000oOoO(c32449OooOOooOooO0OO.f116647OooOo, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strO000oOoO;
        }
        return OooOo.o000oOoO(list, "/", null, null, null, 62) + IOUtils.DIR_SEPARATOR_UNIX + strO000oOoO;
    }

    @Override // oO0OO0Oo.InterfaceC32918OooO0OO
    public final boolean OooO0O0(int i) {
        return OooO0OO(i).f116649OooOoO0.booleanValue();
    }

    public final C32449OooOOoo<List<String>, List<String>, Boolean> OooO0OO(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            OooOOO.OooO0OO oooO0OO = this.f118800OooO0O0.f118295OooOo.get(i);
            String str = (String) this.f118799OooO00o.f118357OooOo.get(oooO0OO.f118305OooOoO);
            OooOOO.OooO0OO.EnumC20269OooO0OO enumC20269OooO0OO = oooO0OO.f118307OooOoOO;
            OooOOO0.OooO0Oo(enumC20269OooO0OO);
            int iOrdinal = enumC20269OooO0OO.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i = oooO0OO.f118306OooOoO0;
        }
        return new C32449OooOOoo<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // oO0OO0Oo.InterfaceC32918OooO0OO
    public final String getString(int i) {
        String str = (String) this.f118799OooO00o.f118357OooOo.get(i);
        OooOOO0.OooO0o(str, "strings.getString(index)");
        return str;
    }
}
