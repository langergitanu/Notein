package o000oo0O;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o000oo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24704OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f83748OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final LinkedHashMap f83749OooO0Oo = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ReentrantLock f83750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24705OooO0OO f83751OooO0O0;

    /* JADX INFO: renamed from: o000oo0O.OooO0O0$OooO00o */
    public static final class OooO00o {
    }

    public C24704OooO0O0(String filename, boolean z) {
        ReentrantLock reentrantLock;
        OooOOO0.OooO0oO(filename, "filename");
        synchronized (f83748OooO0OO) {
            try {
                LinkedHashMap linkedHashMap = f83749OooO0Oo;
                Object reentrantLock2 = linkedHashMap.get(filename);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(filename, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f83750OooO00o = reentrantLock;
        this.f83751OooO0O0 = z ? new C24705OooO0OO(filename) : null;
    }
}
