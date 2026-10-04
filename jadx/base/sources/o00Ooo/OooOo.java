package o00Ooo;

import OooooO0.C21290OooO0o0;
import androidx.compose.p002ui.platform.AndroidComposeView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o00oO0O.C25496OooOOo0;
import o00oO0O.C25503OooOoOO;
import o00oO0O.InterfaceC25547o0ooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25503OooOoOO f85134OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25076OooO0o f85135OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25085OooOo0 f85136OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25496OooOOo0<InterfaceC25547o0ooOO0> f85137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f85138OooO0o0;

    public OooOo(C25503OooOoOO root) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(root, "root");
        this.f85134OooO00o = root;
        this.f85135OooO0O0 = new C25076OooO0o(root.f86970o000oOoO.f87084OooO0O0);
        this.f85136OooO0OO = new C25085OooOo0();
        this.f85137OooO0Oo = new C25496OooOOo0<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO00o(C25086OooOo0O c25086OooOo0O, AndroidComposeView androidComposeView, boolean z) {
        Object[] objArr;
        C25076OooO0o c25076OooO0o;
        int i;
        C25496OooOOo0<InterfaceC25547o0ooOO0> c25496OooOOo0 = this.f85137OooO0Oo;
        if (this.f85138OooO0o0) {
            return 0;
        }
        try {
            this.f85138OooO0o0 = true;
            C25078OooO0oO c25078OooO0oOOooO00o = this.f85136OooO0OO.OooO00o(c25086OooOo0O, androidComposeView);
            LinkedHashMap linkedHashMap = c25078OooO0oOOooO00o.f85108OooO00o;
            Collection<OooOo00> collectionValues = linkedHashMap.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                for (OooOo00 oooOo00 : collectionValues) {
                    if (oooOo00.f85147OooO0Oo || oooOo00.f85150OooO0oO) {
                        objArr = false;
                        break;
                    }
                }
            }
            objArr = true;
            Iterator it = linkedHashMap.values().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c25076OooO0o = this.f85135OooO0O0;
                if (!zHasNext) {
                    break;
                }
                OooOo00 oooOo002 = (OooOo00) it.next();
                if (objArr != false || OooOOO.OooO00o(oooOo002)) {
                    boolean z2 = oooOo002.f85151OooO0oo == 1;
                    C25503OooOoOO c25503OooOoOO = this.f85134OooO00o;
                    long j = oooOo002.f85146OooO0OO;
                    C25496OooOOo0<InterfaceC25547o0ooOO0> c25496OooOOo02 = this.f85137OooO0Oo;
                    C25503OooOoOO.OooO0OO oooO0OO = C25503OooOoOO.f86933OooooOO;
                    c25503OooOoOO.OooOo0O(j, c25496OooOOo02, z2, true);
                    if (!c25496OooOOo0.isEmpty()) {
                        c25076OooO0o.OooO00o(oooOo002.f85144OooO00o, c25496OooOOo0);
                        c25496OooOOo0.clear();
                    }
                }
            }
            c25076OooO0o.f85105OooO0O0.OooO0OO();
            boolean zOooO0O0 = c25076OooO0o.OooO0O0(c25078OooO0oOOooO00o, z);
            Collection<OooOo00> collectionValues2 = linkedHashMap.values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                for (OooOo00 oooOo003 : collectionValues2) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(oooOo003, "<this>");
                    if (!C21290OooO0o0.OooO00o(OooOOO.OooO0oO(oooOo003, true), C21290OooO0o0.f61718OooO0O0) && oooOo003.OooO0O0()) {
                        i = 2;
                        break;
                    }
                }
            }
            i = 0;
            int i2 = (zOooO0O0 ? 1 : 0) | i;
            this.f85138OooO0o0 = false;
            return i2;
        } catch (Throwable th) {
            this.f85138OooO0o0 = false;
            throw th;
        }
    }

    public final void OooO0O0() {
        if (this.f85138OooO0o0) {
            return;
        }
        this.f85136OooO0OO.f85139OooO00o.clear();
        C25080OooOO0o c25080OooOO0o = this.f85135OooO0O0.f85105OooO0O0;
        Oooo.OooO0O0 oooO0O0 = (Oooo.OooO0O0) c25080OooOO0o.f85125OooO00o;
        int i = oooO0O0.f59746OooOoO0;
        if (i > 0) {
            Object[] objArr = oooO0O0.f59745OooOo0o;
            int i2 = 0;
            do {
                ((OooOO0O) objArr[i2]).OooO0Oo();
                i2++;
            } while (i2 < i);
        }
        ((Oooo.OooO0O0) c25080OooOO0o.f85125OooO00o).OooO0o();
    }
}
