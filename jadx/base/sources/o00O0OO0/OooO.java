package o00O0OO0;

import androidx.work.impl.WorkDatabase;
import o000oo0.AbstractC24673OooOo0O;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends AbstractC24673OooOo0O.OooO0O0 {
    @Override // o000oo0.AbstractC24673OooOo0O.OooO0O0
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        super.OooO00o(interfaceC24756OooO0O0);
        interfaceC24756OooO0O0.OooOOo();
        try {
            int i = WorkDatabase.f66708OooOOO0;
            interfaceC24756OooO0O0.oo0o0Oo("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f66707OooOO0o) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            interfaceC24756OooO0O0.o00000O0();
        } finally {
            interfaceC24756OooO0O0.o0000Ooo();
        }
    }
}
