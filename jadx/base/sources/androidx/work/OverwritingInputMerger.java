package androidx.work;

import androidx.work.OooO0O0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import o00O0O0o.AbstractC24837OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC24837OooO0oo {
    @Override // o00O0O0o.AbstractC24837OooO0oo
    public final OooO0O0 OooO00o(ArrayList arrayList) throws Throwable {
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((OooO0O0) it.next()).f66686OooO00o));
        }
        oooO00o.OooO00o(map);
        OooO0O0 oooO0O0 = new OooO0O0(oooO00o.f66687OooO00o);
        OooO0O0.OooO0OO(oooO0O0);
        return oooO0O0;
    }
}
