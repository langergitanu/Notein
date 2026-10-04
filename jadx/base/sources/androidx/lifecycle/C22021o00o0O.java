package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22021o00o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f65690OooO00o = new LinkedHashMap();

    public final void OooO00o() {
        for (AbstractC22019Ooooooo abstractC22019Ooooooo : this.f65690OooO00o.values()) {
            abstractC22019Ooooooo.f65679OooO0OO = true;
            HashMap map = abstractC22019Ooooooo.f65677OooO00o;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = abstractC22019Ooooooo.f65677OooO00o.values().iterator();
                        while (it.hasNext()) {
                            AbstractC22019Ooooooo.OooO0O0(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC22019Ooooooo.f65678OooO0O0;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = abstractC22019Ooooooo.f65678OooO0O0.iterator();
                        while (it2.hasNext()) {
                            AbstractC22019Ooooooo.OooO0O0((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
                abstractC22019Ooooooo.f65678OooO0O0.clear();
            }
            abstractC22019Ooooooo.OooO0OO();
        }
        this.f65690OooO00o.clear();
    }
}
