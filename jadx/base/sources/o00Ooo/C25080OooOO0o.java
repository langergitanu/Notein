package o00Ooo;

import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import java.util.LinkedHashMap;
import o00oO0O.o0ooOOo;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: o00Ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C25080OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f85125OooO00o;

    public C25080OooOO0o() {
        this.f85125OooO00o = new Oooo.OooO0O0(new OooOO0O[16]);
    }

    public boolean OooO00o(LinkedHashMap linkedHashMap, InterfaceC34635OooOOOO parentCoordinates, C25078OooO0oO c25078OooO0oO, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parentCoordinates, "parentCoordinates");
        Oooo.OooO0O0 oooO0O0 = (Oooo.OooO0O0) this.f85125OooO00o;
        int i = oooO0O0.f59746OooOoO0;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = oooO0O0.f59745OooOo0o;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((OooOO0O) objArr[i2]).OooO00o(linkedHashMap, parentCoordinates, c25078OooO0oO, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public void OooO0O0(C25078OooO0oO c25078OooO0oO) {
        Oooo.OooO0O0 oooO0O0 = (Oooo.OooO0O0) this.f85125OooO00o;
        int i = oooO0O0.f59746OooOoO0;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((OooOO0O) oooO0O0.f59745OooOo0o[i]).f85119OooO0OO.OooO()) {
                oooO0O0.OooOO0o(i);
            }
        }
    }

    public void OooO0OO() {
        int i = 0;
        while (true) {
            Oooo.OooO0O0 oooO0O0 = (Oooo.OooO0O0) this.f85125OooO00o;
            if (i >= oooO0O0.f59746OooOoO0) {
                return;
            }
            OooOO0O oooOO0O = (OooOO0O) oooO0O0.f59745OooOo0o[i];
            if (o0ooOOo.OooO00o(oooOO0O.f85118OooO0O0)) {
                i++;
                oooOO0O.OooO0OO();
            } else {
                oooO0O0.OooOO0o(i);
                oooOO0O.OooO0Oo();
            }
        }
    }

    public C25080OooOO0o(PagePaddingFragment pagePaddingFragment) {
        this.f85125OooO00o = pagePaddingFragment;
    }
}
