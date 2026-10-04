package o00o0OOo;

import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOOO0;
import o00o0OO.C25327OooO00o;
import o00o0OOO.C25398OooO0O0;
import o00o0OOO.C25399OooO0OO;
import o00o0OOO.C25400OooO0Oo;
import o00o0OOO.C25402OooO0o0;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0OOo.C25404OooO00o;
import o00o0OOo.InterfaceC25411OooO0o0;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00o0oO0.C25454OooO00o;
import o00o0oOO.C25457OooO0OO;
import o00oo0O0.C25662OooO0o0;

/* JADX INFO: renamed from: o00o0OOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25410OooO0o implements InterfaceC25413OooO0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C25400OooO0Oo f86659OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f86660OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f86661OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f86662OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashSet f86663OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C25454OooO00o f86664OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f86665OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC25411OooO0o0 f86666OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25408OooO0OO f86667OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO00o f86668OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C25457OooO0OO f86669OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Object f86670OooOO0o = new Object();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final long f86658OooOOO0 = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final long f86657OooOOO = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: o00o0OOo.OooO0o$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f86671OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f86672OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f86673OooO0OO;

        public final synchronized long OooO00o() {
            return this.f86672OooO0O0;
        }

        public final synchronized void OooO0O0(long j, long j2) {
            if (this.f86671OooO00o) {
                this.f86672OooO0O0 += j;
                this.f86673OooO0OO += j2;
            }
        }
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO0o$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f86674OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f86675OooO0O0;

        public OooO0O0(long j, long j2, long j3) {
            this.f86674OooO00o = j2;
            this.f86675OooO0O0 = j3;
        }
    }

    public C25410OooO0o(InterfaceC25411OooO0o0 interfaceC25411OooO0o0, C25408OooO0OO c25408OooO0OO, OooO0O0 oooO0O0, C25402OooO0o0 c25402OooO0o0, C25400OooO0Oo c25400OooO0Oo, ExecutorService executorService) {
        C25454OooO00o c25454OooO00o;
        this.f86660OooO00o = oooO0O0.f86674OooO00o;
        long j = oooO0O0.f86675OooO0O0;
        this.f86661OooO0O0 = j;
        this.f86662OooO0OO = j;
        C25454OooO00o c25454OooO00o2 = C25454OooO00o.f86745OooO0oo;
        synchronized (C25454OooO00o.class) {
            try {
                if (C25454OooO00o.f86745OooO0oo == null) {
                    C25454OooO00o.f86745OooO0oo = new C25454OooO00o();
                }
                c25454OooO00o = C25454OooO00o.f86745OooO0oo;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f86664OooO0o = c25454OooO00o;
        this.f86666OooO0oO = interfaceC25411OooO0o0;
        this.f86667OooO0oo = c25408OooO0OO;
        this.f86665OooO0o0 = -1L;
        this.f86659OooO = c25400OooO0Oo;
        OooO00o oooO00o = new OooO00o();
        oooO00o.f86671OooO00o = false;
        oooO00o.f86672OooO0O0 = -1L;
        oooO00o.f86673OooO0OO = -1L;
        this.f86668OooOO0 = oooO00o;
        this.f86669OooOO0O = C25457OooO0OO.f86756OooO00o;
        this.f86663OooO0Oo = new HashSet();
        new CountDownLatch(0);
    }

    @Override // o00o0OOo.InterfaceC25413OooO0oo
    public final C25327OooO00o OooO00o(InterfaceC25397OooO00o key, C25662OooO0o0 c25662OooO0o0) throws IOException {
        String strOooO0O0;
        C25327OooO00o c25327OooO00oOooO00o;
        C25403OooO c25403OooOOooO00o = C25403OooO.OooO00o();
        c25403OooOOooO00o.f86621OooO00o = key;
        synchronized (this.f86670OooOO0o) {
            OooOOO0.OooO0oO(key, "key");
            try {
                if (key instanceof C25399OooO0OO) {
                    OooOOO0.OooO0o(null, "getCacheKeys(...)");
                    throw null;
                }
                strOooO0O0 = C25398OooO0O0.OooO0O0(key);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            try {
                InterfaceC25411OooO0o0.OooO0O0 oooO0O0OooO0o = OooO0o(strOooO0O0, key);
                boolean z = true;
                try {
                    C25404OooO00o.C25406OooO0o0 c25406OooO0o0 = (C25404OooO00o.C25406OooO0o0) oooO0O0OooO0o;
                    c25406OooO0o0.OooO0O0(c25662OooO0o0);
                    synchronized (this.f86670OooOO0o) {
                        c25327OooO00oOooO00o = c25406OooO0o0.OooO00o();
                        this.f86663OooO0Oo.add(strOooO0O0);
                        this.f86668OooOO0.OooO0O0(c25327OooO00oOooO00o.f86173OooO00o.length(), 1L);
                    }
                    c25327OooO00oOooO00o.f86173OooO00o.length();
                    this.f86668OooOO0.OooO00o();
                    File file = c25406OooO0o0.f86641OooO0O0;
                    if (file.exists() && !file.delete()) {
                        z = false;
                    }
                    if (!z) {
                        C25438OooO00o.OooO00o(C25410OooO0o.class, "Failed to delete temp file");
                    }
                    return c25327OooO00oOooO00o;
                } catch (Throwable th) {
                    File file2 = ((C25404OooO00o.C25406OooO0o0) oooO0O0OooO0o).f86641OooO0O0;
                    if (file2.exists() && !file2.delete()) {
                        z = false;
                    }
                    if (!z) {
                        C25438OooO00o.OooO00o(C25410OooO0o.class, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e2) {
                if (C25438OooO00o.f86720OooO00o.OooO00o(6)) {
                    C25439OooO0O0.OooO0OO(6, C25410OooO0o.class.getSimpleName(), "Failed inserting a file into the cache", e2);
                }
                throw e2;
            }
        } finally {
            c25403OooOOooO00o.OooO0O0();
        }
    }

    @Override // o00o0OOo.InterfaceC25413OooO0oo
    public final C25327OooO00o OooO0O0(InterfaceC25397OooO00o interfaceC25397OooO00o) {
        C25327OooO00o c25327OooO00oOooO0Oo;
        C25403OooO c25403OooOOooO00o = C25403OooO.OooO00o();
        c25403OooOOooO00o.f86621OooO00o = interfaceC25397OooO00o;
        try {
            synchronized (this.f86670OooOO0o) {
                try {
                    ArrayList arrayListOooO00o = C25398OooO0O0.OooO00o(interfaceC25397OooO00o);
                    String str = null;
                    c25327OooO00oOooO0Oo = null;
                    for (int i = 0; i < arrayListOooO00o.size() && (c25327OooO00oOooO0Oo = this.f86666OooO0oO.OooO0Oo((str = (String) arrayListOooO00o.get(i)), interfaceC25397OooO00o)) == null; i++) {
                    }
                    if (c25327OooO00oOooO0Oo == null) {
                        this.f86663OooO0Oo.remove(str);
                    } else {
                        str.getClass();
                        this.f86663OooO0Oo.add(str);
                    }
                } finally {
                }
            }
            return c25327OooO00oOooO0Oo;
        } catch (IOException unused) {
            this.f86659OooO.getClass();
            return null;
        } finally {
            c25403OooOOooO00o.OooO0O0();
        }
    }

    public final void OooO0OO(long j) throws IOException {
        InterfaceC25411OooO0o0 interfaceC25411OooO0o0 = this.f86666OooO0oO;
        try {
            ArrayList<InterfaceC25411OooO0o0.OooO00o> arrayListOooO0Oo = OooO0Oo(interfaceC25411OooO0o0.getEntries());
            OooO00o oooO00o = this.f86668OooOO0;
            long jOooO00o = oooO00o.OooO00o() - j;
            int i = 0;
            long j2 = 0;
            for (InterfaceC25411OooO0o0.OooO00o oooO00o2 : arrayListOooO0Oo) {
                if (j2 > jOooO00o) {
                    break;
                }
                long jOooO0OO = interfaceC25411OooO0o0.OooO0OO(oooO00o2);
                this.f86663OooO0Oo.remove(oooO00o2.getId());
                if (jOooO0OO > 0) {
                    i++;
                    j2 += jOooO0OO;
                    C25403OooO.OooO00o().OooO0O0();
                }
            }
            oooO00o.OooO0O0(-j2, -i);
            interfaceC25411OooO0o0.OooO0O0();
        } catch (IOException e) {
            e.getMessage();
            this.f86659OooO.getClass();
            throw e;
        }
    }

    public final ArrayList OooO0Oo(Collection collection) {
        this.f86669OooOO0O.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + f86658OooOOO0;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC25411OooO0o0.OooO00o oooO00o = (InterfaceC25411OooO0o0.OooO00o) it.next();
            if (oooO00o.getTimestamp() > jCurrentTimeMillis) {
                arrayList.add(oooO00o);
            } else {
                arrayList2.add(oooO00o);
            }
        }
        this.f86667OooO0oo.getClass();
        Collections.sort(arrayList2, new C25407OooO0O0());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final InterfaceC25411OooO0o0.OooO0O0 OooO0o(String str, InterfaceC25397OooO00o interfaceC25397OooO00o) throws IOException {
        synchronized (this.f86670OooOO0o) {
            boolean zOooO0o0 = OooO0o0();
            OooO0oO();
            long jOooO00o = this.f86668OooOO0.OooO00o();
            if (jOooO00o > this.f86662OooO0OO && !zOooO0o0) {
                OooO00o oooO00o = this.f86668OooOO0;
                synchronized (oooO00o) {
                    oooO00o.f86671OooO00o = false;
                    oooO00o.f86673OooO0OO = -1L;
                    oooO00o.f86672OooO0O0 = -1L;
                }
                OooO0o0();
            }
            long j = this.f86662OooO0OO;
            if (jOooO00o > j) {
                OooO0OO((j * 9) / 10);
            }
        }
        return this.f86666OooO0oO.OooO00o(str, interfaceC25397OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0o0() {
        boolean z;
        long j;
        boolean z2;
        this.f86669OooOO0O.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        OooO00o oooO00o = this.f86668OooOO0;
        synchronized (oooO00o) {
            z = oooO00o.f86671OooO00o;
        }
        long jMax = -1;
        if (z) {
            long j2 = this.f86665OooO0o0;
            if (j2 == -1 || jCurrentTimeMillis - j2 > f86657OooOOO) {
                this.f86669OooOO0O.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j3 = f86658OooOOO0 + jCurrentTimeMillis2;
                try {
                    long size = 0;
                    boolean z3 = false;
                    int i = 0;
                    for (InterfaceC25411OooO0o0.OooO00o oooO00o2 : this.f86666OooO0oO.getEntries()) {
                        i++;
                        size += oooO00o2.getSize();
                        if (oooO00o2.getTimestamp() > j3) {
                            oooO00o2.getSize();
                            jMax = Math.max(oooO00o2.getTimestamp() - jCurrentTimeMillis2, jMax);
                            z3 = true;
                        }
                    }
                    if (z3) {
                        this.f86659OooO.getClass();
                    }
                    OooO00o oooO00o3 = this.f86668OooOO0;
                    synchronized (oooO00o3) {
                        j = oooO00o3.f86673OooO0OO;
                    }
                    long j4 = i;
                    if (j == j4 && this.f86668OooOO0.OooO00o() == size) {
                        z2 = true;
                    } else {
                        OooO00o oooO00o4 = this.f86668OooOO0;
                        synchronized (oooO00o4) {
                            oooO00o4.f86673OooO0OO = j4;
                            oooO00o4.f86672OooO0O0 = size;
                            z2 = true;
                            oooO00o4.f86671OooO00o = true;
                        }
                    }
                    this.f86665OooO0o0 = jCurrentTimeMillis2;
                    return z2;
                } catch (IOException e) {
                    C25400OooO0Oo c25400OooO0Oo = this.f86659OooO;
                    e.getMessage();
                    c25400OooO0Oo.getClass();
                }
            }
        }
        return false;
    }

    public final void OooO0oO() {
        boolean zIsExternal = this.f86666OooO0oO.isExternal();
        C25454OooO00o.EnumC19704OooO00o enumC19704OooO00o = C25454OooO00o.EnumC19704OooO00o.f86754OooOo0o;
        C25454OooO00o.EnumC19704OooO00o enumC19704OooO00o2 = zIsExternal ? C25454OooO00o.EnumC19704OooO00o.f86753OooOo : enumC19704OooO00o;
        C25454OooO00o c25454OooO00o = this.f86664OooO0o;
        long jOooO00o = this.f86661OooO0O0 - this.f86668OooOO0.OooO00o();
        c25454OooO00o.OooO00o();
        c25454OooO00o.OooO00o();
        ReentrantLock reentrantLock = c25454OooO00o.f86750OooO0o;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - c25454OooO00o.f86751OooO0o0 > C25454OooO00o.f86744OooO) {
                    c25454OooO00o.f86746OooO00o = C25454OooO00o.OooO0O0(c25454OooO00o.f86746OooO00o, c25454OooO00o.f86747OooO0O0);
                    c25454OooO00o.f86748OooO0OO = C25454OooO00o.OooO0O0(c25454OooO00o.f86748OooO0OO, c25454OooO00o.f86749OooO0Oo);
                    c25454OooO00o.f86751OooO0o0 = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = enumC19704OooO00o2 == enumC19704OooO00o ? c25454OooO00o.f86746OooO00o : c25454OooO00o.f86748OooO0OO;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        if (availableBlocksLong <= 0 || availableBlocksLong < jOooO00o) {
            this.f86662OooO0OO = this.f86660OooO00o;
        } else {
            this.f86662OooO0OO = this.f86661OooO0O0;
        }
    }
}
