package oO0OOo0o;

import OooOoo.C20593OooO0Oo;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import oO0OOo0o.o0OoOo0;

/* JADX INFO: renamed from: oO0OOo0o.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33115Ooooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, C33112Oooooo<?, ?>> f119698OooO00o;

    /* JADX INFO: renamed from: oO0OOo0o.Ooooooo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f119699OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0OoOo0 f119700OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashMap f119701OooO0OO = new HashMap();

        public OooO00o(o0OoOo0 o0oooo02) {
            this.f119700OooO0O0 = (o0OoOo0) Preconditions.checkNotNull(o0oooo02, "serviceDescriptor");
            this.f119699OooO00o = o0oooo02.f119773OooO00o;
        }

        public final void OooO00o(C33101OoooOO0 c33101OoooOO0, InterfaceC33113Oooooo0 interfaceC33113Oooooo0) {
            C33101OoooOO0 c33101OoooOO02 = (C33101OoooOO0) Preconditions.checkNotNull(c33101OoooOO0, "method must not be null");
            C33112Oooooo c33112Oooooo = new C33112Oooooo(c33101OoooOO02, (InterfaceC33113Oooooo0) Preconditions.checkNotNull(interfaceC33113Oooooo0, "handler must not be null"));
            String str = c33101OoooOO02.f119668OooO0OO;
            String str2 = this.f119699OooO00o;
            boolean zEquals = str2.equals(str);
            String str3 = c33101OoooOO02.f119667OooO0O0;
            Preconditions.checkArgument(zEquals, "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str2, str3);
            HashMap map = this.f119701OooO0OO;
            Preconditions.checkState(!map.containsKey(str3), "Method by same name already registered: %s", str3);
            map.put(str3, c33112Oooooo);
        }

        public final C33115Ooooooo OooO0O0() {
            HashMap map = this.f119701OooO0OO;
            o0OoOo0 o0oooo02 = this.f119700OooO0O0;
            if (o0oooo02 == null) {
                ArrayList arrayList = new ArrayList(map.size());
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C33112Oooooo) it.next()).f119696OooO00o);
                }
                o0OoOo0.OooO00o OooO00o2 = o0OoOo0.OooO00o(this.f119699OooO00o);
                OooO00o2.f119776OooO0O0.addAll((Collection) Preconditions.checkNotNull(arrayList, "methods"));
                o0oooo02 = new o0OoOo0(OooO00o2);
            }
            HashMap map2 = new HashMap(map);
            for (C33101OoooOO0 c33101OoooOO0 : o0oooo02.f119774OooO0O0) {
                C33112Oooooo c33112Oooooo = (C33112Oooooo) map2.remove(c33101OoooOO0.f119667OooO0O0);
                String str = c33101OoooOO0.f119667OooO0O0;
                if (c33112Oooooo == null) {
                    throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("No method bound for descriptor entry ", str));
                }
                if (c33112Oooooo.f119696OooO00o != c33101OoooOO0) {
                    throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Bound method for ", str, " not same instance as method in service descriptor"));
                }
            }
            if (map2.size() <= 0) {
                return new C33115Ooooooo(o0oooo02, map);
            }
            throw new IllegalStateException("No entry in descriptor matching bound method " + ((C33112Oooooo) map2.values().iterator().next()).f119696OooO00o.f119667OooO0O0);
        }
    }

    public C33115Ooooooo(o0OoOo0 o0oooo02, HashMap map) {
        this.f119698OooO00o = Collections.unmodifiableMap(new HashMap(map));
    }
}
