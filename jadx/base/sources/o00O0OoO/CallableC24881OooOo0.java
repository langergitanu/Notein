package o00O0OoO;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24733OooO00o;
import o000ooOO.C24734OooO0O0;
import o00O0OoO.C24880OooOOoo;

/* JADX INFO: renamed from: o00O0OoO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC24881OooOo0 implements Callable<List<C24880OooOOoo.OooO0OO>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24890OooOooo f84482OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24681OooOoo0 f84483OooOo0o;

    public CallableC24881OooOo0(C24890OooOooo c24890OooOooo, C24681OooOoo0 c24681OooOoo0) {
        this.f84482OooOo = c24890OooOooo;
        this.f84483OooOo0o = c24681OooOoo0;
    }

    @Override // java.util.concurrent.Callable
    public final List<C24880OooOOoo.OooO0OO> call() throws Exception {
        C24890OooOooo c24890OooOooo = this.f84482OooOo;
        WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
        workDatabase_Impl.OooO0OO();
        try {
            Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, this.f84483OooOo0o, true);
            try {
                int iOooO0O0 = C24733OooO00o.OooO0O0("id", cursorOooO);
                int iOooO0O02 = C24733OooO00o.OooO0O0("state", cursorOooO);
                int iOooO0O03 = C24733OooO00o.OooO0O0("output", cursorOooO);
                int iOooO0O04 = C24733OooO00o.OooO0O0("run_attempt_count", cursorOooO);
                OooOo.OooO00o<String, ArrayList<String>> oooO00o = new OooOo.OooO00o<>();
                OooOo.OooO00o<String, ArrayList<androidx.work.OooO0O0>> oooO00o2 = new OooOo.OooO00o<>();
                while (cursorOooO.moveToNext()) {
                    if (!cursorOooO.isNull(iOooO0O0)) {
                        String string = cursorOooO.getString(iOooO0O0);
                        if (oooO00o.get(string) == null) {
                            oooO00o.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorOooO.isNull(iOooO0O0)) {
                        String string2 = cursorOooO.getString(iOooO0O0);
                        if (oooO00o2.get(string2) == null) {
                            oooO00o2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorOooO.moveToPosition(-1);
                c24890OooOooo.OooO0O0(oooO00o);
                c24890OooOooo.OooO00o(oooO00o2);
                ArrayList arrayList = new ArrayList(cursorOooO.getCount());
                while (cursorOooO.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorOooO.isNull(iOooO0O0) ? oooO00o.get(cursorOooO.getString(iOooO0O0)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<androidx.work.OooO0O0> arrayList3 = cursorOooO.isNull(iOooO0O0) ? null : oooO00o2.get(cursorOooO.getString(iOooO0O0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    C24880OooOOoo.OooO0OO oooO0OO = new C24880OooOOoo.OooO0OO();
                    oooO0OO.f84476OooO00o = cursorOooO.getString(iOooO0O0);
                    oooO0OO.f84477OooO0O0 = Oooo0.OooO0o0(cursorOooO.getInt(iOooO0O02));
                    oooO0OO.f84478OooO0OO = androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(iOooO0O03));
                    oooO0OO.f84479OooO0Oo = cursorOooO.getInt(iOooO0O04);
                    oooO0OO.f84481OooO0o0 = arrayList2;
                    oooO0OO.f84480OooO0o = arrayList3;
                    arrayList.add(oooO0OO);
                }
                workDatabase_Impl.OooOOoo();
                cursorOooO.close();
                return arrayList;
            } catch (Throwable th) {
                cursorOooO.close();
                throw th;
            }
        } finally {
            workDatabase_Impl.OooOOOo();
        }
    }

    public final void finalize() {
        this.f84483OooOo0o.release();
    }
}
