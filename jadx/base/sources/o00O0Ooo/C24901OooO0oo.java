package o00O0Ooo;

import androidx.work.impl.WorkDatabase;
import o00O0OoO.C24872OooO0Oo;

/* JADX INFO: renamed from: o00O0Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24901OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WorkDatabase f84513OooO00o;

    public C24901OooO0oo(WorkDatabase workDatabase) {
        this.f84513OooO00o = workDatabase;
    }

    public final int OooO00o(String str) {
        WorkDatabase workDatabase = this.f84513OooO00o;
        workDatabase.OooO0OO();
        try {
            Long lOooO0O0 = workDatabase.OooOo0O().OooO0O0(str);
            int i = 0;
            int iIntValue = lOooO0O0 != null ? lOooO0O0.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            workDatabase.OooOo0O().OooO0OO(new C24872OooO0Oo(str, i));
            workDatabase.OooOOoo();
            workDatabase.OooOOOo();
            return iIntValue;
        } catch (Throwable th) {
            workDatabase.OooOOOo();
            throw th;
        }
    }
}
