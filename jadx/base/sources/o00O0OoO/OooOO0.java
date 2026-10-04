package o00O0OoO;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24733OooO00o;
import o000ooOO.C24734OooO0O0;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WorkDatabase_Impl f84444OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24875OooO0oo f84445OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f84446OooO0OO;

    public OooOO0(WorkDatabase_Impl workDatabase_Impl) {
        this.f84444OooO00o = workDatabase_Impl;
        this.f84445OooO0O0 = new C24875OooO0oo(workDatabase_Impl);
        this.f84446OooO0OO = new OooO(workDatabase_Impl);
    }

    public final C24874OooO0oO OooO00o(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f84444OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            return cursorOooO.moveToFirst() ? new C24874OooO0oO(cursorOooO.getString(C24733OooO00o.OooO0O0("work_spec_id", cursorOooO)), cursorOooO.getInt(C24733OooO00o.OooO0O0("system_id", cursorOooO))) : null;
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }

    public final void OooO0O0(C24874OooO0oO c24874OooO0oO) {
        WorkDatabase_Impl workDatabase_Impl = this.f84444OooO00o;
        workDatabase_Impl.OooO0O0();
        workDatabase_Impl.OooO0OO();
        try {
            this.f84445OooO0O0.OooOOO(c24874OooO0oO);
            workDatabase_Impl.OooOOoo();
        } finally {
            workDatabase_Impl.OooOOOo();
        }
    }

    public final void OooO0OO(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f84444OooO00o;
        workDatabase_Impl.OooO0O0();
        OooO oooO = this.f84446OooO0OO;
        InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = oooO.OooO0oo();
        if (str == null) {
            interfaceC24759OooO0oOooO0oo.OooO0oO(1);
        } else {
            interfaceC24759OooO0oOooO0oo.OoooOO0(1, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            interfaceC24759OooO0oOooO0oo.OooOo0();
            workDatabase_Impl.OooOOoo();
        } finally {
            workDatabase_Impl.OooOOOo();
            oooO.OooOO0o(interfaceC24759OooO0oOooO0oo);
        }
    }
}
