package o0oooO0O;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0oooO00.C31803OooOO0o;

/* JADX INFO: renamed from: o0oooO0O.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31823OooOOOO extends AbstractC31817OooO0oo {
    public abstract void OooO0OO() throws IOException;

    public final List<C31803OooOO0o> OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112330o000Oo;
        C31436OooO0Oo c31436OooO0Oo = this.f113445OooOoO0;
        C31433OooO00o c31433OooO00o = (C31433OooO00o) c31436OooO0Oo.o0000O0O(c31441OooOO0);
        if (c31433OooO00o == null) {
            arrayList.add(new C31803OooOO0o(c31436OooO0Oo));
            return arrayList;
        }
        ArrayList arrayList2 = c31433OooO00o.f112214OooOo;
        if (arrayList2.size() > 0) {
            for (int i = 0; i < arrayList2.size(); i++) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
                if (abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo) {
                    arrayList.add(new C31803OooOO0o((C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO));
                }
            }
        }
        return arrayList;
    }
}
