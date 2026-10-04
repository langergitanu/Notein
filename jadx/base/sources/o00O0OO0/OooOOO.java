package o00O0OO0;

import OooO0o.C20424OooO0Oo;
import OooOoo.C20593OooO0Oo;
import Oooo0.o000000;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24734OooO0O0;
import o000oooO.InterfaceC24759OooO0o;
import o00O0O0o.AbstractC24837OooO0oo;
import o00O0O0o.C24841OooOOo0;
import o00O0OoO.C24871OooO0OO;
import o00O0OoO.C24877OooOOOo;
import o00O0OoO.C24878OooOOo;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24884OooOoO;
import o00O0OoO.C24886OooOoOO;
import o00O0OoO.C24890OooOooo;
import o00O0OoO.C24892Oooo00o;
import o00O0OoO.OooOo00;
import o00O0Ooo.C24902OooOO0;
import o00O0Ooo.C24915OooOo0O;
import o00O0Ooo.RunnableC24914OooOo00;
import o00O0o00.C24932OooO0OO;
import o00oOOo.C25591OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final String f84371Oooo0oo = o00O0O0o.OooOO0O.OooO0o0("WorkerWrapper");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f84372OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Context f84373OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C24880OooOOoo f84374OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List<InterfaceC24846OooO0o0> f84375OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ListenableWorker f84376OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ListenableWorker.OooO00o f84377OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C25591OooO0O0 f84378OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public androidx.work.OooO00o f84379OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C24845OooO0Oo f84380OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C24892Oooo00o f84381Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public WorkDatabase f84382Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public OooOo00 f84383Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C24871OooO0OO f84384Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ArrayList f84385Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public String f84386Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ListenableFuture<ListenableWorker.OooO00o> f84387Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C24932OooO0OO<Boolean> f84388Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile boolean f84389Oooo0oO;

    public final boolean OooO() {
        if (!this.f84389Oooo0oO) {
            return false;
        }
        o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84371Oooo0oo, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Work interrupted for ", this.f84386Oooo0OO), new Throwable[0]);
        if (((C24890OooOooo) this.f84383Oooo00O).OooO0oo(this.f84372OooOo) == null) {
            OooO0o(false);
            return true;
        }
        OooO0o(!r0.OooO00o());
        return true;
    }

    public final void OooO00o(ListenableWorker.OooO00o oooO00o) {
        boolean z = oooO00o instanceof ListenableWorker.OooO00o.OooO0OO;
        String str = f84371Oooo0oo;
        if (!z) {
            if (oooO00o instanceof ListenableWorker.OooO00o.OooO0O0) {
                o00O0O0o.OooOO0O.OooO0OO().OooO0Oo(str, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Worker result RETRY for ", this.f84386Oooo0OO), new Throwable[0]);
                OooO0Oo();
                return;
            }
            o00O0O0o.OooOO0O.OooO0OO().OooO0Oo(str, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Worker result FAILURE for ", this.f84386Oooo0OO), new Throwable[0]);
            if (this.f84374OooOoO.OooO0OO()) {
                OooO0o0();
                return;
            } else {
                OooO0oo();
                return;
            }
        }
        o00O0O0o.OooOO0O.OooO0OO().OooO0Oo(str, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Worker result SUCCESS for ", this.f84386Oooo0OO), new Throwable[0]);
        if (this.f84374OooOoO.OooO0OO()) {
            OooO0o0();
            return;
        }
        C24871OooO0OO c24871OooO0OO = this.f84384Oooo00o;
        String str2 = this.f84372OooOo;
        OooOo00 oooOo00 = this.f84383Oooo00O;
        WorkDatabase workDatabase = this.f84382Oooo000;
        workDatabase.OooO0OO();
        try {
            ((C24890OooOooo) oooOo00).OooOOOO(C24841OooOOo0.OooO00o.f84285OooOoO0, str2);
            ((C24890OooOooo) oooOo00).OooOOO0(str2, ((ListenableWorker.OooO00o.OooO0OO) this.f84377OooOoo).f66674OooO00o);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : c24871OooO0OO.OooO0O0(str2)) {
                if (((C24890OooOooo) oooOo00).OooO0oo(str3) == C24841OooOOo0.OooO00o.f84286OooOoOO && c24871OooO0OO.OooO0OO(str3)) {
                    o00O0O0o.OooOO0O.OooO0OO().OooO0Oo(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                    ((C24890OooOooo) oooOo00).OooOOOO(C24841OooOOo0.OooO00o.f84283OooOo0o, str3);
                    ((C24890OooOooo) oooOo00).OooOOO(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.OooOOoo();
            workDatabase.OooOOOo();
            OooO0o(false);
        } catch (Throwable th) {
            workDatabase.OooOOOo();
            OooO0o(false);
            throw th;
        }
    }

    public final void OooO0O0(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C24890OooOooo c24890OooOooo = (C24890OooOooo) this.f84383Oooo00O;
            if (c24890OooOooo.OooO0oo(str2) != C24841OooOOo0.OooO00o.f84288OooOoo0) {
                c24890OooOooo.OooOOOO(C24841OooOOo0.OooO00o.f84284OooOoO, str2);
            }
            linkedList.addAll(this.f84384Oooo00o.OooO0O0(str2));
        }
    }

    public final void OooO0OO() {
        boolean zOooO = OooO();
        String str = this.f84372OooOo;
        WorkDatabase workDatabase = this.f84382Oooo000;
        if (!zOooO) {
            workDatabase.OooO0OO();
            try {
                C24841OooOOo0.OooO00o oooO00oOooO0oo = ((C24890OooOooo) this.f84383Oooo00O).OooO0oo(str);
                C24878OooOOo c24878OooOOoOooOoO0 = workDatabase.OooOoO0();
                WorkDatabase_Impl workDatabase_Impl = c24878OooOOoOooOoO0.f84451OooO00o;
                workDatabase_Impl.OooO0O0();
                C24877OooOOOo c24877OooOOOo = c24878OooOOoOooOoO0.f84452OooO0O0;
                InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24877OooOOOo.OooO0oo();
                if (str == null) {
                    interfaceC24759OooO0oOooO0oo.OooO0oO(1);
                } else {
                    interfaceC24759OooO0oOooO0oo.OoooOO0(1, str);
                }
                workDatabase_Impl.OooO0OO();
                try {
                    interfaceC24759OooO0oOooO0oo.OooOo0();
                    workDatabase_Impl.OooOOoo();
                    if (oooO00oOooO0oo == null) {
                        OooO0o(false);
                    } else if (oooO00oOooO0oo == C24841OooOOo0.OooO00o.f84282OooOo) {
                        OooO00o(this.f84377OooOoo);
                    } else if (!oooO00oOooO0oo.OooO00o()) {
                        OooO0Oo();
                    }
                    workDatabase.OooOOoo();
                    workDatabase.OooOOOo();
                } finally {
                    workDatabase_Impl.OooOOOo();
                    c24877OooOOOo.OooOO0o(interfaceC24759OooO0oOooO0oo);
                }
            } catch (Throwable th) {
                workDatabase.OooOOOo();
                throw th;
            }
        }
        List<InterfaceC24846OooO0o0> list = this.f84375OooOoO0;
        if (list != null) {
            Iterator<InterfaceC24846OooO0o0> it = list.iterator();
            while (it.hasNext()) {
                it.next().OooO0OO(str);
            }
            OooO0o.OooO00o(this.f84379OooOooO, workDatabase, list);
        }
    }

    public final void OooO0Oo() {
        String str = this.f84372OooOo;
        OooOo00 oooOo00 = this.f84383Oooo00O;
        WorkDatabase workDatabase = this.f84382Oooo000;
        workDatabase.OooO0OO();
        try {
            ((C24890OooOooo) oooOo00).OooOOOO(C24841OooOOo0.OooO00o.f84283OooOo0o, str);
            ((C24890OooOooo) oooOo00).OooOOO(System.currentTimeMillis(), str);
            ((C24890OooOooo) oooOo00).OooOO0o(-1L, str);
            workDatabase.OooOOoo();
        } finally {
            workDatabase.OooOOOo();
            OooO0o(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o(boolean z) {
        boolean z2;
        ListenableWorker listenableWorker;
        this.f84382Oooo000.OooO0OO();
        try {
            C24890OooOooo c24890OooOooo = (C24890OooOooo) this.f84382Oooo000.OooOoO();
            c24890OooOooo.getClass();
            C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
            workDatabase_Impl.OooO0O0();
            Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
            try {
                if (cursorOooO.moveToFirst()) {
                    z2 = cursorOooO.getInt(0) != 0;
                }
                if (!z2) {
                    C24902OooOO0.OooO00o(this.f84373OooOo0o, RescheduleReceiver.class, false);
                }
                if (z) {
                    ((C24890OooOooo) this.f84383Oooo00O).OooOOOO(C24841OooOOo0.OooO00o.f84283OooOo0o, this.f84372OooOo);
                    ((C24890OooOooo) this.f84383Oooo00O).OooOO0o(-1L, this.f84372OooOo);
                }
                if (this.f84374OooOoO != null && (listenableWorker = this.f84376OooOoOO) != null && listenableWorker.OooO0O0()) {
                    C24845OooO0Oo c24845OooO0Oo = this.f84380OooOooo;
                    String str = this.f84372OooOo;
                    synchronized (c24845OooO0Oo.f84339Oooo00O) {
                        c24845OooO0Oo.f84335OooOoo0.remove(str);
                        c24845OooO0Oo.OooO0oo();
                    }
                }
                this.f84382Oooo000.OooOOoo();
                this.f84382Oooo000.OooOOOo();
                this.f84388Oooo0o0.OooO(Boolean.valueOf(z));
            } finally {
                cursorOooO.close();
                c24681OooOoo0OooOOO0.release();
            }
        } catch (Throwable th) {
            this.f84382Oooo000.OooOOOo();
            throw th;
        }
    }

    public final void OooO0o0() {
        String str = this.f84372OooOo;
        OooOo00 oooOo00 = this.f84383Oooo00O;
        WorkDatabase workDatabase = this.f84382Oooo000;
        workDatabase.OooO0OO();
        try {
            ((C24890OooOooo) oooOo00).OooOOO(System.currentTimeMillis(), str);
            ((C24890OooOooo) oooOo00).OooOOOO(C24841OooOOo0.OooO00o.f84283OooOo0o, str);
            C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOo00;
            WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
            workDatabase_Impl.OooO0O0();
            C24886OooOoOO c24886OooOoOO = c24890OooOooo.f84491OooO0oO;
            InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24886OooOoOO.OooO0oo();
            if (str == null) {
                interfaceC24759OooO0oOooO0oo.OooO0oO(1);
            } else {
                interfaceC24759OooO0oOooO0oo.OoooOO0(1, str);
            }
            workDatabase_Impl.OooO0OO();
            try {
                interfaceC24759OooO0oOooO0oo.OooOo0();
                workDatabase_Impl.OooOOoo();
                workDatabase_Impl.OooOOOo();
                c24886OooOoOO.OooOO0o(interfaceC24759OooO0oOooO0oo);
                ((C24890OooOooo) oooOo00).OooOO0o(-1L, str);
                workDatabase.OooOOoo();
            } catch (Throwable th) {
                workDatabase_Impl.OooOOOo();
                c24886OooOoOO.OooOO0o(interfaceC24759OooO0oOooO0oo);
                throw th;
            }
        } finally {
            workDatabase.OooOOOo();
            OooO0o(false);
        }
    }

    public final void OooO0oO() {
        C24890OooOooo c24890OooOooo = (C24890OooOooo) this.f84383Oooo00O;
        String str = this.f84372OooOo;
        C24841OooOOo0.OooO00o oooO00oOooO0oo = c24890OooOooo.OooO0oo(str);
        C24841OooOOo0.OooO00o oooO00o = C24841OooOOo0.OooO00o.f84282OooOo;
        String str2 = f84371Oooo0oo;
        if (oooO00oOooO0oo == oooO00o) {
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(str2, C20593OooO0Oo.OooO0O0("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            OooO0o(true);
            return;
        }
        o00O0O0o.OooOO0O.OooO0OO().OooO00o(str2, "Status for " + str + " is " + oooO00oOooO0oo + "; not doing any work", new Throwable[0]);
        OooO0o(false);
    }

    public final void OooO0oo() {
        String str = this.f84372OooOo;
        WorkDatabase workDatabase = this.f84382Oooo000;
        workDatabase.OooO0OO();
        try {
            OooO0O0(str);
            ((C24890OooOooo) this.f84383Oooo00O).OooOOO0(str, ((ListenableWorker.OooO00o.C19046OooO00o) this.f84377OooOoo).f66673OooO00o);
            workDatabase.OooOOoo();
        } finally {
            workDatabase.OooOOOo();
            OooO0o(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4 A[Catch: all -> 0x007e, TryCatch #4 {all -> 0x007e, blocks: (B:14:0x0052, B:17:0x005f, B:22:0x0081, B:25:0x0087, B:28:0x00af, B:30:0x00b5, B:32:0x00bb, B:45:0x0103, B:37:0x00c4, B:40:0x00d3, B:42:0x00db), top: B:115:0x0052 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AbstractC24837OooO0oo abstractC24837OooO0oo;
        androidx.work.OooO0O0 oooO0O0OooO00o;
        boolean z;
        boolean z2 = false;
        C24892Oooo00o c24892Oooo00o = this.f84381Oooo0;
        String str = this.f84372OooOo;
        ArrayList<String> arrayListOooO00o = c24892Oooo00o.OooO00o(str);
        this.f84385Oooo0O0 = arrayListOooO00o;
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Work [ id=", str, ", tags={ ");
        boolean z3 = true;
        for (String str2 : arrayListOooO00o) {
            if (z3) {
                z3 = false;
            } else {
                sbOooO0o0.append(", ");
            }
            sbOooO0o0.append(str2);
        }
        sbOooO0o0.append(" } ]");
        this.f84386Oooo0OO = sbOooO0o0.toString();
        OooOo00 oooOo00 = this.f84383Oooo00O;
        if (OooO()) {
            return;
        }
        WorkDatabase workDatabase = this.f84382Oooo000;
        workDatabase.OooO0OO();
        try {
            C24880OooOOoo c24880OooOOooOooOO0 = ((C24890OooOooo) oooOo00).OooOO0(str);
            this.f84374OooOoO = c24880OooOOooOooOO0;
            String str3 = f84371Oooo0oo;
            if (c24880OooOOooOooOO0 == null) {
                o00O0O0o.OooOO0O.OooO0OO().OooO0O0(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                OooO0o(false);
                workDatabase.OooOOoo();
                return;
            }
            C24841OooOOo0.OooO00o oooO00o = c24880OooOOooOooOO0.f84458OooO0O0;
            C24841OooOOo0.OooO00o oooO00o2 = C24841OooOOo0.OooO00o.f84283OooOo0o;
            if (oooO00o != oooO00o2) {
                OooO0oO();
                workDatabase.OooOOoo();
                o00O0O0o.OooOO0O.OooO0OO().OooO00o(str3, this.f84374OooOoO.f84459OooO0OO + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                return;
            }
            if (!c24880OooOOooOooOO0.OooO0OO()) {
                C24880OooOOoo c24880OooOOoo = this.f84374OooOoO;
                if (c24880OooOOoo.f84458OooO0O0 == oooO00o2 && c24880OooOOoo.f84466OooOO0O > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C24880OooOOoo c24880OooOOoo2 = this.f84374OooOoO;
                    if (c24880OooOOoo2.f84468OooOOO != 0 && jCurrentTimeMillis < c24880OooOOoo2.OooO00o()) {
                        o00O0O0o.OooOO0O.OooO0OO().OooO00o(str3, "Delaying execution for " + this.f84374OooOoO.f84459OooO0OO + " because it is being executed before schedule.", new Throwable[0]);
                        OooO0o(true);
                        workDatabase.OooOOoo();
                        return;
                    }
                }
            }
            workDatabase.OooOOoo();
            workDatabase.OooOOOo();
            boolean zOooO0OO = this.f84374OooOoO.OooO0OO();
            androidx.work.OooO00o oooO00o3 = this.f84379OooOooO;
            if (zOooO0OO) {
                oooO0O0OooO00o = this.f84374OooOoO.f84462OooO0o0;
            } else {
                o000000 o000000Var = oooO00o3.f66678OooO0Oo;
                String str4 = this.f84374OooOoO.f84460OooO0Oo;
                o000000Var.getClass();
                String str5 = AbstractC24837OooO0oo.f84253OooO00o;
                try {
                    abstractC24837OooO0oo = (AbstractC24837OooO0oo) Class.forName(str4).newInstance();
                } catch (Exception e) {
                    o00O0O0o.OooOO0O.OooO0OO().OooO0O0(AbstractC24837OooO0oo.f84253OooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Trouble instantiating + ", str4), e);
                    abstractC24837OooO0oo = null;
                }
                if (abstractC24837OooO0oo == null) {
                    o00O0O0o.OooOO0O.OooO0OO().OooO0O0(str3, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Could not create Input Merger ", this.f84374OooOoO.f84460OooO0Oo), new Throwable[0]);
                    OooO0oo();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f84374OooOoO.f84462OooO0o0);
                C24890OooOooo c24890OooOooo = (C24890OooOooo) oooOo00;
                c24890OooOooo.getClass();
                C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    c24681OooOoo0OooOOO0.OooO0oO(1);
                } else {
                    c24681OooOoo0OooOOO0.OoooOO0(1, str);
                }
                WorkDatabase_Impl workDatabase_Impl = c24890OooOooo.f84485OooO00o;
                workDatabase_Impl.OooO0O0();
                Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorOooO.getCount());
                    while (cursorOooO.moveToNext()) {
                        arrayList2.add(androidx.work.OooO0O0.OooO00o(cursorOooO.getBlob(0)));
                    }
                    cursorOooO.close();
                    c24681OooOoo0OooOOO0.release();
                    arrayList.addAll(arrayList2);
                    oooO0O0OooO00o = abstractC24837OooO0oo.OooO00o(arrayList);
                } catch (Throwable th) {
                    cursorOooO.close();
                    c24681OooOoo0OooOOO0.release();
                    throw th;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ArrayList arrayList3 = this.f84385Oooo0O0;
            int i = this.f84374OooOoO.f84466OooOO0O;
            ExecutorService executorService = oooO00o3.f66675OooO00o;
            C24845OooO0Oo c24845OooO0Oo = this.f84380OooOooo;
            C25591OooO0O0 c25591OooO0O0 = this.f84378OooOoo0;
            C24915OooOo0O c24915OooOo0O = new C24915OooOo0O(workDatabase, c24845OooO0Oo, c25591OooO0O0);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f66691OooO00o = uuidFromString;
            workerParameters.f66692OooO0O0 = oooO0O0OooO00o;
            new HashSet(arrayList3);
            workerParameters.f66693OooO0OO = executorService;
            workerParameters.f66694OooO0Oo = c25591OooO0O0;
            o00O0O0o.OooOo00 oooOo002 = oooO00o3.f66677OooO0OO;
            workerParameters.f66695OooO0o0 = oooOo002;
            if (this.f84376OooOoOO == null) {
                this.f84376OooOoOO = oooOo002.OooO0O0(this.f84373OooOo0o, this.f84374OooOoO.f84459OooO0OO, workerParameters);
            }
            ListenableWorker listenableWorker = this.f84376OooOoOO;
            if (listenableWorker == null) {
                o00O0O0o.OooOO0O.OooO0OO().OooO0O0(str3, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Could not create Worker ", this.f84374OooOoO.f84459OooO0OO), new Throwable[0]);
                OooO0oo();
                return;
            }
            if (listenableWorker.f66670OooOoO) {
                o00O0O0o.OooOO0O.OooO0OO().OooO0O0(str3, C20593OooO0Oo.OooO0O0("Received an already-used Worker ", this.f84374OooOoO.f84459OooO0OO, "; WorkerFactory should return new instances"), new Throwable[0]);
                OooO0oo();
                return;
            }
            listenableWorker.f66670OooOoO = true;
            workDatabase.OooO0OO();
            try {
                if (((C24890OooOooo) oooOo00).OooO0oo(str) == oooO00o2) {
                    ((C24890OooOooo) oooOo00).OooOOOO(C24841OooOOo0.OooO00o.f84282OooOo, str);
                    C24890OooOooo c24890OooOooo2 = (C24890OooOooo) oooOo00;
                    WorkDatabase_Impl workDatabase_Impl2 = c24890OooOooo2.f84485OooO00o;
                    workDatabase_Impl2.OooO0O0();
                    C24884OooOoO c24884OooOoO = c24890OooOooo2.f84489OooO0o;
                    InterfaceC24759OooO0o interfaceC24759OooO0oOooO0oo = c24884OooOoO.OooO0oo();
                    if (str == null) {
                        z = true;
                        interfaceC24759OooO0oOooO0oo.OooO0oO(1);
                    } else {
                        z = true;
                        interfaceC24759OooO0oOooO0oo.OoooOO0(1, str);
                    }
                    workDatabase_Impl2.OooO0OO();
                    try {
                        interfaceC24759OooO0oOooO0oo.OooOo0();
                        workDatabase_Impl2.OooOOoo();
                        workDatabase_Impl2.OooOOOo();
                        c24884OooOoO.OooOO0o(interfaceC24759OooO0oOooO0oo);
                        z2 = z;
                    } catch (Throwable th2) {
                        workDatabase_Impl2.OooOOOo();
                        c24884OooOoO.OooOO0o(interfaceC24759OooO0oOooO0oo);
                        throw th2;
                    }
                }
                workDatabase.OooOOoo();
                if (!z2) {
                    OooO0oO();
                    return;
                }
                if (OooO()) {
                    return;
                }
                C24932OooO0OO c24932OooO0OO = new C24932OooO0OO();
                RunnableC24914OooOo00 runnableC24914OooOo00 = new RunnableC24914OooOo00(this.f84373OooOo0o, this.f84374OooOoO, this.f84376OooOoOO, c24915OooOo0O, this.f84378OooOoo0);
                c25591OooO0O0.f87295OooO0OO.execute(runnableC24914OooOo00);
                C24932OooO0OO<Void> c24932OooO0OO2 = runnableC24914OooOo00.f84549OooOo0o;
                c24932OooO0OO2.addListener(new RunnableC24849OooOO0o(this, c24932OooO0OO2, c24932OooO0OO), c25591OooO0O0.f87295OooO0OO);
                c24932OooO0OO.addListener(new OooOOO0(this, c24932OooO0OO, this.f84386Oooo0OO), c25591OooO0O0.f87293OooO00o);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.OooOOOo();
        }
    }
}
