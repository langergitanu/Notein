package o000o0O0;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o000o0O0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24602Oooo0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f83367OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Serializable f83368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f83369OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f83370OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f83371OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f83372OooO0o0;

    public AbstractC24602Oooo0o0() {
        this.f83368OooO0O0 = new ReentrantLock(true);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(C34434OooOoO.f123453OooOo0o);
        this.f83369OooO0OO = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(C34438OooOoo0.f123458OooOo0o);
        this.f83370OooO0Oo = c33781o00o0OOooO00o2;
        this.f83372OooO0o0 = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
        this.f83371OooO0o = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o2);
    }

    public void OooO(OooOO0 backStackEntry) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = (ReentrantLock) this.f83368OooO0O0;
        reentrantLock.lock();
        try {
            C33781o00o0O c33781o00o0O = (C33781o00o0O) this.f83369OooO0OO;
            ArrayList arrayListOooooOo = oOo000Oo.OooOo.OooooOo((Collection) c33781o00o0O.getValue(), backStackEntry);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayListOooooOo);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void OooO00o(int i, int i2) {
        if (!this.f83367OooO00o) {
            throw new IllegalStateException("Not a CIDFont");
        }
        ((HashMap) this.f83368OooO0O0).put(Integer.valueOf(i2), Integer.valueOf(i));
        ((HashMap) this.f83372OooO0o0).put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void OooO0O0(int i, int i2, String str) {
        if (this.f83367OooO00o) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        ((HashMap) this.f83368OooO0O0).put(Integer.valueOf(i2), Integer.valueOf(i));
        ((HashMap) this.f83369OooO0OO).put(Integer.valueOf(i), Integer.valueOf(i2));
        ((HashMap) this.f83370OooO0Oo).put(str, Integer.valueOf(i2));
        ((HashMap) this.f83371OooO0o).put(Integer.valueOf(i), str);
    }

    public abstract OooOO0 OooO0OO(C24583OooOo0o c24583OooOo0o, Bundle bundle);

    public int OooO0Oo(int i) {
        if (!this.f83367OooO00o) {
            throw new IllegalStateException("Not a CIDFont");
        }
        Integer num = (Integer) ((HashMap) this.f83368OooO0O0).get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int OooO0o(int i) {
        if (this.f83367OooO00o) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = (Integer) ((HashMap) this.f83369OooO0OO).get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int OooO0o0(int i) {
        if (this.f83367OooO00o) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = (Integer) ((HashMap) this.f83368OooO0O0).get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void OooO0oO(OooOO0 oooOO02) {
        C33781o00o0O c33781o00o0O = (C33781o00o0O) this.f83369OooO0OO;
        ArrayList arrayListOooooOo = oOo000Oo.OooOo.OooooOo(oOo000Oo.OooOo.OoooOoo((Iterable) c33781o00o0O.getValue(), oOo000Oo.OooOo.OoooOOo((List) c33781o00o0O.getValue())), oooOO02);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayListOooooOo);
    }

    public void OooO0oo(OooOO0 popUpTo, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = (ReentrantLock) this.f83368OooO0O0;
        reentrantLock.lock();
        try {
            C33781o00o0O c33781o00o0O = (C33781o00o0O) this.f83369OooO0OO;
            Iterable iterable = (Iterable) c33781o00o0O.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0((OooOO0) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayList);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public AbstractC24602Oooo0o0(boolean z) {
        this.f83368OooO0O0 = new HashMap(250);
        this.f83369OooO0OO = new HashMap(250);
        this.f83370OooO0Oo = new HashMap(250);
        this.f83372OooO0o0 = new HashMap();
        this.f83371OooO0o = new HashMap(250);
        this.f83367OooO00o = z;
    }
}
