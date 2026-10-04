package androidx.transition;

import Oooo0oO.C21111o0ooOoO;
import android.view.View;
import com.aspose.slides.C22226Oooo0oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.transition.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22107OooOo0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View f66395OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f66394OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<OooOOO0> f66396OooO0OO = new ArrayList<>();

    @Deprecated
    public C22107OooOo0o() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22107OooOo0o)) {
            return false;
        }
        C22107OooOo0o c22107OooOo0o = (C22107OooOo0o) obj;
        return this.f66395OooO0O0 == c22107OooOo0o.f66395OooO0O0 && this.f66394OooO00o.equals(c22107OooOo0o.f66394OooO00o);
    }

    public final int hashCode() {
        return this.f66394OooO00o.hashCode() + (this.f66395OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbOooO0OO.append(this.f66395OooO0O0);
        sbOooO0OO.append(IOUtils.LINE_SEPARATOR_UNIX);
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(sbOooO0OO.toString(), "    values:");
        HashMap map = this.f66394OooO00o;
        for (String str : map.keySet()) {
            strOooO0Oo = strOooO0Oo + "    " + str + ": " + map.get(str) + IOUtils.LINE_SEPARATOR_UNIX;
        }
        return strOooO0Oo;
    }

    public C22107OooOo0o(View view) {
        this.f66395OooO0O0 = view;
    }
}
