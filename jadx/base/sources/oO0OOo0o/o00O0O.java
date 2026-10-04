package oO0OOo0o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes10.dex */
public final class o00O0O {

    public interface OooO00o<T> {
        boolean OooO00o(T t);

        int OooO0O0(T t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    public static List OooO00o(Class cls, List list, ClassLoader classLoader, OooO00o oooO00o) {
        ?? Load;
        Object objNewInstance;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused) {
                    objNewInstance = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            if (oooO00o.OooO00o(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new C33122ooOO(oooO00o)));
        return Collections.unmodifiableList(arrayList);
    }
}
