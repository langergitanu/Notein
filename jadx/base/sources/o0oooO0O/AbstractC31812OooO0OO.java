package o0oooO0O;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooOoo.C31669OooO00o;
import o0oooO00.C31803OooOO0o;
import o0oooO00.C31804OooOOO;
import o0oooO00.C31806OooOOOO;

/* JADX INFO: renamed from: o0oooO0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31812OooO0OO extends AbstractC31823OooOOOO {
    @Override // o0oooO0O.AbstractC31823OooOOOO
    public void OooO0OO() throws IOException {
        List<String> listOooO0o0 = OooO0o0();
        if (listOooO0o0.size() <= 0) {
            OooO0oo(OooO0o());
            return;
        }
        try {
            int i = Integer.parseInt(OooO0o());
            if (i < listOooO0o0.size()) {
                OooO0oO(listOooO0o0.get(i));
            }
        } catch (NumberFormatException unused) {
        }
    }

    public String OooO0o() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0O0 = OooO0O0(C31441OooOO0.f112420o00OOOO0);
        if (!(abstractC31434OooO0O0OooO0O0 instanceof C31441OooOO0)) {
            return "Off";
        }
        String str = ((C31441OooOO0) abstractC31434OooO0O0OooO0O0).f112461OooOo;
        List<String> listOooO0o0 = OooO0o0();
        if (!listOooO0o0.isEmpty()) {
            try {
                int i = Integer.parseInt(str, 10);
                if (i >= 0 && i < listOooO0o0.size()) {
                    return listOooO0o0.get(i);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return str;
    }

    public List<String> OooO0o0() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0O0 = OooO0O0(C31441OooOO0.f112371o00O0000);
        if (!(abstractC31434OooO0O0OooO0O0 instanceof C31450OooOOoo)) {
            return abstractC31434OooO0O0OooO0O0 instanceof C31433OooO00o ? C31669OooO00o.OooO0O0((C31433OooO00o) abstractC31434OooO0O0OooO0O0) : Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((C31450OooOOoo) abstractC31434OooO0O0OooO0O0).OooOooo());
        return arrayList;
    }

    public final void OooO0oO(String str) throws IOException {
        C31804OooOOO c31804OooOOOOooO00o;
        C31806OooOOOO c31806OooOOOOOooO00o;
        List<C31803OooOO0o> listOooO0Oo = OooO0Oo();
        List<String> listOooO0o0 = OooO0o0();
        if (((ArrayList) listOooO0Oo).size() != listOooO0o0.size()) {
            throw new IllegalArgumentException("The number of options doesn't match the number of widgets");
        }
        if (str.equals(C31441OooOO0.f112367o000oooo.f112461OooOo)) {
            OooO0oo(str);
            return;
        }
        int iIndexOf = listOooO0o0.indexOf(str);
        if (iIndexOf != -1) {
            ArrayList arrayList = (ArrayList) OooO0Oo();
            String str2 = "";
            if (iIndexOf < arrayList.size() && (c31804OooOOOOooO00o = ((C31803OooOO0o) arrayList.get(iIndexOf)).OooO00o()) != null && (c31806OooOOOOOooO00o = c31804OooOOOOooO00o.OooO00o()) != null) {
                Iterator it = c31806OooOOOOOooO00o.OooO0O0().f113208OooOo.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C31441OooOO0 c31441OooOO0 = (C31441OooOO0) it.next();
                    if (C31441OooOO0.f112367o000oooo.f112461OooOo.compareTo(c31441OooOO0.f112461OooOo) != 0) {
                        str2 = c31441OooOO0.f112461OooOo;
                        break;
                    }
                }
            }
            OooO0oo(str2);
        }
    }

    public final void OooO0oo(String str) throws IOException {
        this.f113445OooOoO0.o000OooO(C31441OooOO0.f112420o00OOOO0, str);
        for (C31803OooOO0o c31803OooOO0o : (ArrayList) OooO0Oo()) {
            if (c31803OooOO0o.OooO00o() != null) {
                C31436OooO0Oo c31436OooO0Oo = c31803OooOO0o.OooO00o().OooO00o().f113425OooOo0o;
                c31436OooO0Oo.getClass();
                boolean zContainsKey = c31436OooO0Oo.f112222OooOoO0.containsKey(C31441OooOO0.OooOooo(str));
                C31436OooO0Oo c31436OooO0Oo2 = c31803OooOO0o.f113422OooOo0o;
                if (zContainsKey) {
                    c31436OooO0Oo2.o000OooO(C31441OooOO0.f112250Oooo0O0, str);
                } else {
                    c31436OooO0Oo2.o000OooO(C31441OooOO0.f112250Oooo0O0, C31441OooOO0.f112367o000oooo.f112461OooOo);
                }
            }
        }
    }
}
