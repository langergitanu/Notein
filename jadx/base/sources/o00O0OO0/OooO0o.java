package o00O0OO0;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f84343OooO00o = o00O0O0o.OooOO0O.OooO0o0("Schedulers");

    public static void OooO00o(androidx.work.OooO00o oooO00o, WorkDatabase workDatabase, List<InterfaceC24846OooO0o0> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        OooOo00 oooOo00OooOoO = workDatabase.OooOoO();
        workDatabase.OooO0OO();
        try {
            C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOo00OooOoO;
            ArrayList arrayListOooO0o0 = c24890OooOooo.OooO0o0(oooO00o.f66682OooO0oo);
            ArrayList arrayListOooO0Oo = c24890OooOooo.OooO0Oo();
            if (arrayListOooO0o0.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListOooO0o0.iterator();
                while (it.hasNext()) {
                    c24890OooOooo.OooOO0o(jCurrentTimeMillis, ((C24880OooOOoo) it.next()).f84457OooO00o);
                }
            }
            workDatabase.OooOOoo();
            workDatabase.OooOOOo();
            if (arrayListOooO0o0.size() > 0) {
                C24880OooOOoo[] c24880OooOOooArr = (C24880OooOOoo[]) arrayListOooO0o0.toArray(new C24880OooOOoo[arrayListOooO0o0.size()]);
                for (InterfaceC24846OooO0o0 interfaceC24846OooO0o0 : list) {
                    if (interfaceC24846OooO0o0.OooO00o()) {
                        interfaceC24846OooO0o0.OooO0o0(c24880OooOOooArr);
                    }
                }
            }
            if (arrayListOooO0Oo.size() > 0) {
                C24880OooOOoo[] c24880OooOOooArr2 = (C24880OooOOoo[]) arrayListOooO0Oo.toArray(new C24880OooOOoo[arrayListOooO0Oo.size()]);
                for (InterfaceC24846OooO0o0 interfaceC24846OooO0o02 : list) {
                    if (!interfaceC24846OooO0o02.OooO00o()) {
                        interfaceC24846OooO0o02.OooO0o0(c24880OooOOooArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.OooOOOo();
            throw th;
        }
    }
}
