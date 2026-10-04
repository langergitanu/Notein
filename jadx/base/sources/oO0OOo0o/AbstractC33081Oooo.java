package oO0OOo0o;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import oO0OOo0o.AbstractC33081Oooo;
import oO0OOo0o.AbstractC33099OoooO00;
import oO0OOo0o.C33100OoooO0O;

/* JADX INFO: renamed from: oO0OOo0o.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33081Oooo<T extends AbstractC33081Oooo<T>> {
    public static AbstractC33081Oooo<?> OooO0O0(String str) {
        C33100OoooO0O c33100OoooO0O;
        List<AbstractC33099OoooO00> list;
        Logger logger = C33100OoooO0O.f119662OooO0OO;
        synchronized (C33100OoooO0O.class) {
            try {
                if (C33100OoooO0O.f119663OooO0Oo == null) {
                    List<AbstractC33099OoooO00> listOooO00o = o00O0O.OooO00o(AbstractC33099OoooO00.class, C33100OoooO0O.OooO00o(), AbstractC33099OoooO00.class.getClassLoader(), new C33100OoooO0O.OooO00o());
                    C33100OoooO0O.f119663OooO0Oo = new C33100OoooO0O();
                    for (AbstractC33099OoooO00 abstractC33099OoooO00 : listOooO00o) {
                        C33100OoooO0O.f119662OooO0OO.fine("Service loader found " + abstractC33099OoooO00);
                        C33100OoooO0O c33100OoooO0O2 = C33100OoooO0O.f119663OooO0Oo;
                        synchronized (c33100OoooO0O2) {
                            abstractC33099OoooO00.getClass();
                            Preconditions.checkArgument(true, "isAvailable() returned false");
                            c33100OoooO0O2.f119664OooO00o.add(abstractC33099OoooO00);
                        }
                    }
                    C33100OoooO0O c33100OoooO0O3 = C33100OoooO0O.f119663OooO0Oo;
                    synchronized (c33100OoooO0O3) {
                        ArrayList arrayList = new ArrayList(c33100OoooO0O3.f119664OooO00o);
                        Collections.sort(arrayList, Collections.reverseOrder(new C33098OoooO0()));
                        c33100OoooO0O3.f119665OooO0O0 = Collections.unmodifiableList(arrayList);
                    }
                }
                c33100OoooO0O = C33100OoooO0O.f119663OooO0Oo;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (c33100OoooO0O) {
            list = c33100OoooO0O.f119665OooO0O0;
        }
        AbstractC33099OoooO00 abstractC33099OoooO002 = list.isEmpty() ? null : list.get(0);
        if (abstractC33099OoooO002 != null) {
            return abstractC33099OoooO002.OooO00o(str);
        }
        throw new AbstractC33099OoooO00.OooO00o("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    public abstract AbstractC33093Oooo0oo OooO00o();

    public void OooO0OO() {
        throw new UnsupportedOperationException();
    }

    public void OooO0Oo() {
        throw new UnsupportedOperationException();
    }
}
