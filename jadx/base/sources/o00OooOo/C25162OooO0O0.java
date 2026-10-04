package o00OooOo;

import androidx.fragment.app.C21929Ooooo0o;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: o00OooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25162OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f85657OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C19680OooO0O0 f85658OooO0O0 = new C19680OooO0O0();

    /* JADX INFO: renamed from: o00OooOo.OooO0O0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ReentrantLock f85659OooO00o = new ReentrantLock();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f85660OooO0O0;
    }

    /* JADX INFO: renamed from: o00OooOo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19680OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayDeque f85661OooO00o = new ArrayDeque();
    }

    public final void OooO00o(String str) {
        OooO00o oooO00o;
        synchronized (this) {
            try {
                Object obj = this.f85657OooO00o.get(str);
                C21929Ooooo0o.OooO0OO(obj, "Argument must not be null");
                oooO00o = (OooO00o) obj;
                int i = oooO00o.f85660OooO0O0;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + oooO00o.f85660OooO0O0);
                }
                int i2 = i - 1;
                oooO00o.f85660OooO0O0 = i2;
                if (i2 == 0) {
                    OooO00o oooO00o2 = (OooO00o) this.f85657OooO00o.remove(str);
                    if (!oooO00o2.equals(oooO00o)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + oooO00o + ", but actually removed: " + oooO00o2 + ", safeKey: " + str);
                    }
                    C19680OooO0O0 c19680OooO0O0 = this.f85658OooO0O0;
                    synchronized (c19680OooO0O0.f85661OooO00o) {
                        try {
                            if (c19680OooO0O0.f85661OooO00o.size() < 10) {
                                c19680OooO0O0.f85661OooO00o.offer(oooO00o2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        oooO00o.f85659OooO00o.unlock();
    }
}
