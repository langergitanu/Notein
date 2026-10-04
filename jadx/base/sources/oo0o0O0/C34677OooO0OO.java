package oo0o0O0;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.OooOO0O;
import o00O0OO0.InterfaceC24846OooO0o0;
import o00O0OOo.C24855OooO0Oo;
import o00O0OOo.InterfaceC24854OooO0OO;
import o00O0OoO.C24880OooOOoo;
import o00O0Ooo.C24906OooOOO0;
import o00oOOo.C25591OooO0O0;

/* JADX INFO: renamed from: oo0o0O0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34677OooO0OO implements InterfaceC24846OooO0o0, InterfaceC24854OooO0OO, o00O0OO0.OooO0O0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String f124867OooOooo = OooOO0O.OooO0o0("GreedyScheduler");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f124868OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f124869OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C24855OooO0Oo f124871OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C34676OooO0O0 f124872OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f124874OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Boolean f124875OooOooO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final HashSet f124870OooOoO = new HashSet();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Object f124873OooOoo = new Object();

    public C34677OooO0OO(Context context, androidx.work.OooO00o oooO00o, C25591OooO0O0 c25591OooO0O0, o00O0OO0.OooOO0O oooOO0O) {
        this.f124869OooOo0o = context;
        this.f124868OooOo = oooOO0O;
        this.f124871OooOoO0 = new C24855OooO0Oo(context, c25591OooO0O0, this);
        this.f124872OooOoOO = new C34676OooO0O0(this, oooO00o.f66680OooO0o0);
    }

    @Override // o00O0OO0.InterfaceC24846OooO0o0
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00O0OO0.OooO0O0
    public final void OooO0O0(String str, boolean z) {
        synchronized (this.f124873OooOoo) {
            try {
                Iterator it = this.f124870OooOoO.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C24880OooOOoo c24880OooOOoo = (C24880OooOOoo) it.next();
                    if (c24880OooOOoo.f84457OooO00o.equals(str)) {
                        OooOO0O.OooO0OO().OooO00o(f124867OooOooo, "Stopping tracking for " + str, new Throwable[0]);
                        this.f124870OooOoO.remove(c24880OooOOoo);
                        this.f124871OooOoO0.OooO0O0(this.f124870OooOoO);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00O0OO0.InterfaceC24846OooO0o0
    public final void OooO0OO(String str) {
        Runnable runnable;
        Boolean bool = this.f124875OooOooO;
        o00O0OO0.OooOO0O oooOO0O = this.f124868OooOo;
        if (bool == null) {
            this.f124875OooOooO = Boolean.valueOf(C24906OooOOO0.OooO00o(this.f124869OooOo0o, oooOO0O.f84361OooO0O0));
        }
        boolean zBooleanValue = this.f124875OooOooO.booleanValue();
        String str2 = f124867OooOooo;
        if (!zBooleanValue) {
            OooOO0O.OooO0OO().OooO0Oo(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f124874OooOoo0) {
            oooOO0O.f84364OooO0o.OooO00o(this);
            this.f124874OooOoo0 = true;
        }
        OooOO0O.OooO0OO().OooO00o(str2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Cancelling work ID ", str), new Throwable[0]);
        C34676OooO0O0 c34676OooO0O0 = this.f124872OooOoOO;
        if (c34676OooO0O0 != null && (runnable = (Runnable) c34676OooO0O0.f124866OooO0OO.remove(str)) != null) {
            ((Handler) c34676OooO0O0.f124865OooO0O0.f84325OooO00o).removeCallbacks(runnable);
        }
        oooOO0O.o00Oo0(str);
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0Oo(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            OooOO0O.OooO0OO().OooO00o(f124867OooOooo, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f124868OooOo.o00Oo0(str);
        }
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0o(List<String> list) {
        for (String str : (ArrayList) list) {
            OooOO0O.OooO0OO().OooO00o(f124867OooOooo, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f124868OooOo.o00O0O(str, null);
        }
    }

    @Override // o00O0OO0.InterfaceC24846OooO0o0
    public final void OooO0o0(C24880OooOOoo... c24880OooOOooArr) {
        if (this.f124875OooOooO == null) {
            this.f124875OooOooO = Boolean.valueOf(C24906OooOOO0.OooO00o(this.f124869OooOo0o, this.f124868OooOo.f84361OooO0O0));
        }
        if (!this.f124875OooOooO.booleanValue()) {
            OooOO0O.OooO0OO().OooO0Oo(f124867OooOooo, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f124874OooOoo0) {
            this.f124868OooOo.f84364OooO0o.OooO00o(this);
            this.f124874OooOoo0 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C24880OooOOoo c24880OooOOoo : c24880OooOOooArr) {
            long jOooO00o = c24880OooOOoo.OooO00o();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c24880OooOOoo.f84458OooO0O0 == C24841OooOOo0.OooO00o.f84283OooOo0o) {
                if (jCurrentTimeMillis < jOooO00o) {
                    C34676OooO0O0 c34676OooO0O0 = this.f124872OooOoOO;
                    if (c34676OooO0O0 != null) {
                        HashMap map = c34676OooO0O0.f124866OooO0OO;
                        Runnable runnable = (Runnable) map.remove(c24880OooOOoo.f84457OooO00o);
                        o00O0OO0.OooO00o oooO00o = c34676OooO0O0.f124865OooO0O0;
                        if (runnable != null) {
                            ((Handler) oooO00o.f84325OooO00o).removeCallbacks(runnable);
                        }
                        RunnableC34675OooO00o runnableC34675OooO00o = new RunnableC34675OooO00o(c34676OooO0O0, c24880OooOOoo);
                        map.put(c24880OooOOoo.f84457OooO00o, runnableC34675OooO00o);
                        ((Handler) oooO00o.f84325OooO00o).postDelayed(runnableC34675OooO00o, c24880OooOOoo.OooO00o() - System.currentTimeMillis());
                    }
                } else if (c24880OooOOoo.OooO0O0()) {
                    o00O0O0o.OooO0OO oooO0OO = c24880OooOOoo.f84465OooOO0;
                    if (oooO0OO.f84234OooO0OO) {
                        OooOO0O.OooO0OO().OooO00o(f124867OooOooo, "Ignoring WorkSpec " + c24880OooOOoo + ", Requires device idle.", new Throwable[0]);
                    } else if (oooO0OO.f84239OooO0oo.f84240OooO00o.size() > 0) {
                        OooOO0O.OooO0OO().OooO00o(f124867OooOooo, "Ignoring WorkSpec " + c24880OooOOoo + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(c24880OooOOoo);
                        hashSet2.add(c24880OooOOoo.f84457OooO00o);
                    }
                } else {
                    OooOO0O.OooO0OO().OooO00o(f124867OooOooo, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Starting work for ", c24880OooOOoo.f84457OooO00o), new Throwable[0]);
                    this.f124868OooOo.o00O0O(c24880OooOOoo.f84457OooO00o, null);
                }
            }
        }
        synchronized (this.f124873OooOoo) {
            try {
                if (!hashSet.isEmpty()) {
                    OooOO0O.OooO0OO().OooO00o(f124867OooOooo, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f124870OooOoO.addAll(hashSet);
                    this.f124871OooOoO0.OooO0O0(this.f124870OooOoO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
