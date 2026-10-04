package o000o0O0;

import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.o00Oo0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: renamed from: o000o0O0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lo000o0O0/OooOOo;", "Landroidx/lifecycle/Ooooooo;", "Lo000o0O0/Oooo000;", "<init>", "()V", "navigation-runtime_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class C24578OooOOo extends AbstractC22019Ooooooo implements Oooo000 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f83260OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f83261OooO0Oo = new LinkedHashMap();

    /* JADX INFO: renamed from: o000o0O0.OooOOo$OooO00o */
    public static final class OooO00o implements o00Oo0.OooO0O0 {
        @Override // androidx.lifecycle.o00Oo0.OooO0O0
        public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
            return new C24578OooOOo();
        }
    }

    @Override // o000o0O0.Oooo000
    public final C22021o00o0O OooO00o(String backStackEntryId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f83261OooO0Oo;
        C22021o00o0O c22021o00o0O = (C22021o00o0O) linkedHashMap.get(backStackEntryId);
        if (c22021o00o0O != null) {
            return c22021o00o0O;
        }
        C22021o00o0O c22021o00o0O2 = new C22021o00o0O();
        linkedHashMap.put(backStackEntryId, c22021o00o0O2);
        return c22021o00o0O2;
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        LinkedHashMap linkedHashMap = this.f83261OooO0Oo;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C22021o00o0O) it.next()).OooO00o();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f83261OooO0Oo.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
        return string;
    }
}
