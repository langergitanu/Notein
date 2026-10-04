package o00O0000;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.orion.notein.global.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile OooO00o f84071OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f84072OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f84075OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet f84074OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f84073OooO00o = new HashMap();

    public OooO00o(Context context) {
        this.f84075OooO0OO = context.getApplicationContext();
    }

    public static OooO00o OooO0OO(Context context) {
        if (f84071OooO0Oo == null) {
            synchronized (f84072OooO0o0) {
                try {
                    if (f84071OooO0Oo == null) {
                        f84071OooO0Oo = new OooO00o(context);
                    }
                } finally {
                }
            }
        }
        return f84071OooO0Oo;
    }

    public final void OooO00o(Bundle bundle) {
        HashSet hashSet;
        String string = this.f84075OooO0OO.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f84074OooO0O0;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (OooO0O0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    OooO0O0((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new OooO0OO(e);
            }
        }
    }

    public final Object OooO0O0(Class cls, HashSet hashSet) {
        Object objOooO00o;
        if (o00O000.OooO00o.OooO0O0()) {
            try {
                o00O000.OooO00o.OooO00o(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f84073OooO00o;
        if (map.containsKey(cls)) {
            objOooO00o = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                OooO0O0 oooO0O0 = (OooO0O0) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends OooO0O0<?>>> listDependencies = oooO0O0.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends OooO0O0<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            OooO0O0(cls2, hashSet);
                        }
                    }
                }
                objOooO00o = oooO0O0.OooO00o(this.f84075OooO0OO);
                hashSet.remove(cls);
                map.put(cls, objOooO00o);
            } catch (Throwable th2) {
                throw new OooO0OO(th2);
            }
        }
        Trace.endSection();
        return objOooO00o;
    }
}
