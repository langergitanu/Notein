package o00O0Ooo;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.List;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24733OooO00o;
import o000ooOO.C24734OooO0O0;
import o00O0O0o.C24841OooOOo0;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.Oooo0;

/* JADX INFO: renamed from: o00O0Ooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24908OooOOOo extends AbstractRunnableC24910OooOOo0<List<C24841OooOOo0>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00O0OO0.OooOO0O f84526OooOo;

    public C24908OooOOOo(o00O0OO0.OooOO0O oooOO0O) {
        this.f84526OooOo = oooOO0O;
    }

    @Override // o00O0Ooo.AbstractRunnableC24910OooOOo0
    public final List OooO00o() {
        C24890OooOooo c24890OooOooo = (C24890OooOooo) this.f84526OooOo.f84362OooO0OO.OooOoO();
        c24890OooOooo.getClass();
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        c24681OooOoo0OooOOO0.OoooOO0(1, "CloudBackupWorker");
        WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
        workDatabase_Impl.OooO0O0();
        workDatabase_Impl.OooO0OO();
        try {
            Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, true);
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
                c24681OooOoo0OooOOO0.release();
                workDatabase_Impl.OooOOOo();
                return C24880OooOOoo.f84455OooOo00.apply(arrayList);
            } catch (Throwable th) {
                cursorOooO.close();
                c24681OooOoo0OooOOO0.release();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.OooOOOo();
            throw th2;
        }
    }
}
