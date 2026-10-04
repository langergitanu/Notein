package o00O0OoO;

import Oooo0oO.AbstractC21020OooO00o;

/* JADX INFO: renamed from: o00O0OoO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24889OooOooO extends AbstractC21020OooO00o {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
