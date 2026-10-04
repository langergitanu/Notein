package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f65677OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashSet f65678OooO0O0 = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile boolean f65679OooO0OO = false;

    public static void OooO0O0(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void OooO0OO() {
    }

    public final Object OooO0Oo(Object obj, String str) {
        Object obj2;
        synchronized (this.f65677OooO00o) {
            try {
                obj2 = this.f65677OooO00o.get(str);
                if (obj2 == null) {
                    this.f65677OooO00o.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f65679OooO0OO) {
            OooO0O0(obj);
        }
        return obj;
    }
}
