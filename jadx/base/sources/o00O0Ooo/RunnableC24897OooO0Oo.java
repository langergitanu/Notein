package o00O0Ooo;

import OooOoo.C20593OooO0Oo;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24734OooO0O0;
import o00O0O0o.AbstractC24840OooOOo;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.OooOOO;
import o00O0OO0.C24847OooO0oO;
import o00O0OoO.C24869OooO00o;
import o00O0OoO.C24870OooO0O0;
import o00O0OoO.C24871OooO0OO;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.C24892Oooo00o;
import o00O0OoO.Oooo000;

/* JADX INFO: renamed from: o00O0Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24897OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final String f84510OooOoO0 = o00O0O0o.OooOO0O.OooO0o0("EnqueueRunnable");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o00O0OO0.OooO0OO f84511OooOo = new o00O0OO0.OooO0OO();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24847OooO0oO f84512OooOo0o;

    public RunnableC24897OooO0Oo(C24847OooO0oO c24847OooO0oO) {
        this.f84512OooOo0o = c24847OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OooO00o(C24847OooO0oO c24847OooO0oO) {
        boolean z;
        boolean z2;
        boolean z3;
        WorkDatabase workDatabase;
        boolean z4;
        C24841OooOOo0.OooO00o oooO00o;
        int i;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        c24847OooO0oO.getClass();
        String[] strArr = (String[]) C24847OooO0oO.OoooO00(c24847OooO0oO).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        o00O0OO0.OooOO0O oooOO0O = c24847OooO0oO.f84346OooOo0o;
        WorkDatabase workDatabase2 = oooOO0O.f84362OooO0OO;
        boolean z10 = strArr != null && strArr.length > 0;
        C24841OooOOo0.OooO00o oooO00o2 = C24841OooOOo0.OooO00o.f84285OooOoO0;
        C24841OooOOo0.OooO00o oooO00o3 = C24841OooOOo0.OooO00o.f84288OooOoo0;
        C24841OooOOo0.OooO00o oooO00o4 = C24841OooOOo0.OooO00o.f84284OooOoO;
        if (z10) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str : strArr) {
                C24880OooOOoo c24880OooOOooOooOO0 = ((C24890OooOooo) workDatabase2.OooOoO()).OooOO0(str);
                if (c24880OooOOooOooOO0 == null) {
                    o00O0O0o.OooOO0O.OooO0OO().OooO0O0(f84510OooOoO0, C20593OooO0Oo.OooO0O0("Prerequisite ", str, " doesn't exist; not enqueuing"), new Throwable[0]);
                    break;
                }
                C24841OooOOo0.OooO00o oooO00o5 = c24880OooOOooOooOO0.f84458OooO0O0;
                z &= oooO00o5 == oooO00o2;
                if (oooO00o5 == oooO00o4) {
                    z3 = true;
                } else if (oooO00o5 == oooO00o3) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        String str2 = c24847OooO0oO.f84345OooOo;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        C24841OooOOo0.OooO00o oooO00o6 = C24841OooOOo0.OooO00o.f84283OooOo0o;
        if (zIsEmpty || z10) {
            workDatabase = workDatabase2;
            z4 = zIsEmpty;
            oooO00o = oooO00o6;
            i = 0;
            z5 = z10;
            z6 = z;
            z7 = false;
            boolean z11 = z7;
            for (AbstractC24840OooOOo abstractC24840OooOOo : c24847OooO0oO.f84347OooOoO) {
                C24880OooOOoo c24880OooOOoo = abstractC24840OooOOo.f84271OooO0O0;
                if (!z5 || z6) {
                    if (c24880OooOOoo.OooO0OO()) {
                        c24880OooOOoo.f84468OooOOO = 0L;
                    } else {
                        c24880OooOOoo.f84468OooOOO = jCurrentTimeMillis;
                    }
                } else if (z3) {
                    c24880OooOOoo.f84458OooO0O0 = oooO00o4;
                } else if (z2) {
                    c24880OooOOoo.f84458OooO0O0 = oooO00o3;
                } else {
                    c24880OooOOoo.f84458OooO0O0 = C24841OooOOo0.OooO00o.f84286OooOoOO;
                }
                C24841OooOOo0.OooO00o oooO00o7 = oooO00o;
                if (c24880OooOOoo.f84458OooO0O0 == oooO00o7) {
                    z11 = true;
                }
                C24890OooOooo c24890OooOooo = (C24890OooOooo) workDatabase.OooOoO();
                WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
                workDatabase_Impl.OooO0O0();
                workDatabase_Impl.OooO0OO();
                try {
                    c24890OooOooo.f84486OooO0O0.OooOOO(c24880OooOOoo);
                    workDatabase_Impl.OooOOoo();
                    workDatabase_Impl.OooOOOo();
                    UUID uuid = abstractC24840OooOOo.f84270OooO00o;
                    if (z5) {
                        int length = strArr.length;
                        int i2 = i;
                        while (i2 < length) {
                            String[] strArr2 = strArr;
                            long j = jCurrentTimeMillis;
                            C24869OooO00o c24869OooO00o = new C24869OooO00o(uuid.toString(), strArr2[i2]);
                            C24871OooO0OO c24871OooO0OOOooOo0 = workDatabase.OooOo0();
                            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c24871OooO0OOOooOo0.f84437OooOo0o;
                            workDatabase_Impl2.OooO0O0();
                            workDatabase_Impl2.OooO0OO();
                            try {
                                ((C24870OooO0O0) c24871OooO0OOOooOo0.f84436OooOo).OooOOO(c24869OooO00o);
                                workDatabase_Impl2.OooOOoo();
                                workDatabase_Impl2.OooOOOo();
                                i2++;
                                strArr = strArr2;
                                jCurrentTimeMillis = j;
                            } catch (Throwable th) {
                                workDatabase_Impl2.OooOOOo();
                                throw th;
                            }
                        }
                    }
                    String[] strArr3 = strArr;
                    long j2 = jCurrentTimeMillis;
                    for (String str3 : abstractC24840OooOOo.f84272OooO0OO) {
                        C24892Oooo00o c24892Oooo00oOooOoOO = workDatabase.OooOoOO();
                        Oooo000 oooo000 = new Oooo000(str3, uuid.toString());
                        WorkDatabase_Impl workDatabase_Impl3 = c24892Oooo00oOooOoOO.f84495OooO00o;
                        workDatabase_Impl3.OooO0O0();
                        workDatabase_Impl3.OooO0OO();
                        try {
                            c24892Oooo00oOooOoOO.f84496OooO0O0.OooOOO(oooo000);
                            workDatabase_Impl3.OooOOoo();
                        } finally {
                            workDatabase_Impl3.OooOOOo();
                        }
                    }
                    if (!z4) {
                        o00O0OoO.OooOOO0 oooOOO0OooOo = workDatabase.OooOo();
                        o00O0OoO.OooOO0O oooOO0O2 = new o00O0OoO.OooOO0O(str2, uuid.toString());
                        WorkDatabase_Impl workDatabase_Impl4 = oooOOO0OooOo.f84449OooO00o;
                        workDatabase_Impl4.OooO0O0();
                        workDatabase_Impl4.OooO0OO();
                        try {
                            oooOOO0OooOo.f84450OooO0O0.OooOOO(oooOO0O2);
                            workDatabase_Impl4.OooOOoo();
                        } finally {
                            workDatabase_Impl4.OooOOOo();
                        }
                    }
                    strArr = strArr3;
                    jCurrentTimeMillis = j2;
                    oooO00o = oooO00o7;
                } catch (Throwable th2) {
                    workDatabase_Impl.OooOOOo();
                    throw th2;
                }
            }
            z8 = z11;
        } else {
            ArrayList arrayListOooOO0O = ((C24890OooOooo) workDatabase2.OooOoO()).OooOO0O(str2);
            if (!arrayListOooOO0O.isEmpty()) {
                workDatabase = workDatabase2;
                o00O0O0o.OooO0o oooO0o = o00O0O0o.OooO0o.f84246OooOoO0;
                z4 = zIsEmpty;
                o00O0O0o.OooO0o oooO0o2 = o00O0O0o.OooO0o.f84245OooOoO;
                boolean z12 = z10;
                o00O0O0o.OooO0o oooO0o3 = c24847OooO0oO.f84348OooOoO0;
                if (oooO0o3 == oooO0o || oooO0o3 == oooO0o2) {
                    C24871OooO0OO c24871OooO0OOOooOo02 = workDatabase.OooOo0();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListOooOO0O.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        C24880OooOOoo.OooO0O0 oooO0O0 = (C24880OooOOoo.OooO0O0) it.next();
                        boolean z13 = z;
                        String str4 = oooO0O0.f84474OooO00o;
                        c24871OooO0OOOooOo02.getClass();
                        boolean z14 = z2;
                        C24841OooOOo0.OooO00o oooO00o8 = oooO00o6;
                        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                        if (str4 == null) {
                            c24681OooOoo0OooOOO0.OooO0oO(1);
                        } else {
                            c24681OooOoo0OooOOO0.OoooOO0(1, str4);
                        }
                        WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) c24871OooO0OOOooOo02.f84437OooOo0o;
                        workDatabase_Impl5.OooO0O0();
                        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl5, c24681OooOoo0OooOOO0, false);
                        try {
                            if (cursorOooO.moveToFirst() && cursorOooO.getInt(0) != 0) {
                                z9 = z13;
                            } else {
                                C24841OooOOo0.OooO00o oooO00o9 = oooO0O0.f84475OooO0O0;
                                z9 = z13 & (oooO00o9 == oooO00o2);
                                if (oooO00o9 == oooO00o4) {
                                    z3 = true;
                                } else if (oooO00o9 == oooO00o3) {
                                    z14 = true;
                                }
                                arrayList.add(oooO0O0.f84474OooO00o);
                            }
                            z = z9;
                            it = it2;
                            z2 = z14;
                            oooO00o6 = oooO00o8;
                        } finally {
                            cursorOooO.close();
                            c24681OooOoo0OooOOO0.release();
                        }
                    }
                    oooO00o = oooO00o6;
                    z6 = z;
                    boolean z15 = z2;
                    z7 = false;
                    List list = arrayList;
                    list = arrayList;
                    if (oooO0o3 == oooO0o2 && (z15 || z3)) {
                        C24890OooOooo c24890OooOooo2 = (C24890OooOooo) workDatabase.OooOoO();
                        Iterator it3 = c24890OooOooo2.OooOO0O(str2).iterator();
                        while (it3.hasNext()) {
                            c24890OooOooo2.OooO0OO(((C24880OooOOoo.OooO0O0) it3.next()).f84474OooO00o);
                        }
                        z3 = false;
                        z15 = false;
                        list = Collections.EMPTY_LIST;
                    }
                    strArr = (String[]) list.toArray(strArr);
                    z5 = strArr.length > 0;
                    i = 0;
                    z2 = z15;
                } else {
                    if (oooO0o3 == o00O0O0o.OooO0o.f84243OooOo) {
                        Iterator it4 = arrayListOooOO0O.iterator();
                        while (it4.hasNext()) {
                            C24841OooOOo0.OooO00o oooO00o10 = ((C24880OooOOoo.OooO0O0) it4.next()).f84475OooO0O0;
                            if (oooO00o10 == oooO00o6 || oooO00o10 == C24841OooOOo0.OooO00o.f84282OooOo) {
                                z8 = false;
                            }
                        }
                    }
                    new C24895OooO0O0(oooOO0O, str2, false).run();
                    o00O0OoO.OooOo00 oooOo00OooOoO = workDatabase.OooOoO();
                    Iterator it5 = arrayListOooOO0O.iterator();
                    while (it5.hasNext()) {
                        ((C24890OooOooo) oooOo00OooOoO).OooO0OO(((C24880OooOOoo.OooO0O0) it5.next()).f84474OooO00o);
                    }
                    oooO00o = oooO00o6;
                    z5 = z12;
                    i = 0;
                    z6 = z;
                    z7 = true;
                }
            }
            boolean z112 = z7;
            while (r5.hasNext()) {
            }
            z8 = z112;
        }
        c24847OooO0oO.f84350OooOoo = true;
        return z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        o00O0OO0.OooO0OO oooO0OO = this.f84511OooOo;
        C24847OooO0oO c24847OooO0oO = this.f84512OooOo0o;
        try {
            c24847OooO0oO.getClass();
            o00O0OO0.OooOO0O oooOO0O = c24847OooO0oO.f84346OooOo0o;
            HashSet hashSet = new HashSet();
            hashSet.addAll(c24847OooO0oO.f84349OooOoOO);
            HashSet hashSetOoooO00 = C24847OooO0oO.OoooO00(c24847OooO0oO);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(c24847OooO0oO.f84349OooOoOO);
                    z = false;
                    break;
                } else if (hashSetOoooO00.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c24847OooO0oO + ")");
            }
            WorkDatabase workDatabase = oooOO0O.f84362OooO0OO;
            workDatabase.OooO0OO();
            try {
                boolean zOooO00o = OooO00o(c24847OooO0oO);
                workDatabase.OooOOoo();
                if (zOooO00o) {
                    C24902OooOO0.OooO00o(oooOO0O.f84360OooO00o, RescheduleReceiver.class, true);
                    o00O0OO0.OooO0o.OooO00o(oooOO0O.f84361OooO0O0, oooOO0O.f84362OooO0OO, oooOO0O.f84365OooO0o0);
                }
                oooO0OO.OooO00o(o00O0O0o.OooOOO.f84264OooO00o);
            } finally {
                workDatabase.OooOOOo();
            }
        } catch (Throwable th) {
            oooO0OO.OooO00o(new OooOOO.OooO00o.C19656OooO00o(th));
        }
    }
}
