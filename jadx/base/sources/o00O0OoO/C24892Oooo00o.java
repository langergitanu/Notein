package o00O0OoO;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24734OooO0O0;

/* JADX INFO: renamed from: o00O0OoO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24892Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WorkDatabase_Impl f84495OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24891Oooo00O f84496OooO0O0;

    public C24892Oooo00o(WorkDatabase_Impl workDatabase_Impl) {
        this.f84495OooO00o = workDatabase_Impl;
        this.f84496OooO0O0 = new C24891Oooo00O(workDatabase_Impl);
    }

    public final ArrayList OooO00o(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f84495OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO.getCount());
            while (cursorOooO.moveToNext()) {
                arrayList.add(cursorOooO.getString(0));
            }
            return arrayList;
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }
}
