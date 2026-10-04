package o00O0OoO;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24734OooO0O0;
import oO00o0Oo.C32370OooO0Oo;
import oO0OooOO.InterfaceC33501OooOOo;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: o00O0OoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24871OooO0OO implements InterfaceC33501OooOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f84436OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f84437OooOo0o;

    public C24871OooO0OO(WorkDatabase_Impl workDatabase_Impl) {
        this.f84437OooOo0o = workDatabase_Impl;
        this.f84436OooOo = new C24870OooO0O0(workDatabase_Impl);
    }

    @Override // oO0OooOO.InterfaceC33501OooOOo
    public void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
        EnumC35109OooO0O0.OooO0OO((C32370OooO0Oo.OooO00o) this.f84437OooOo0o, oooO0O0);
    }

    public ArrayList OooO0O0(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f84437OooOo0o;
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

    public boolean OooO0OO(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            c24681OooOoo0OooOOO0.OooO0oO(1);
        } else {
            c24681OooOoo0OooOOO0.OoooOO0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f84437OooOo0o;
        workDatabase_Impl.OooO0O0();
        boolean z = false;
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            if (cursorOooO.moveToFirst()) {
                z = cursorOooO.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }

    @Override // oO0OooOO.InterfaceC33501OooOOo
    public void onError(Throwable th) {
        ((InterfaceC33501OooOOo) this.f84436OooOo).onError(th);
    }

    @Override // oO0OooOO.InterfaceC33501OooOOo
    public void onSuccess(Object obj) {
        ((InterfaceC33501OooOOo) this.f84436OooOo).onSuccess(obj);
    }

    public C24871OooO0OO(C32370OooO0Oo.OooO00o oooO00o, InterfaceC33501OooOOo interfaceC33501OooOOo) {
        this.f84437OooOo0o = oooO00o;
        this.f84436OooOo = interfaceC33501OooOOo;
    }
}
