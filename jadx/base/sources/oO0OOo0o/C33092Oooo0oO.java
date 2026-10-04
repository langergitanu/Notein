package oO0OOo0o;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.o0000;
import oO0OOo0o.o00O0O;

/* JADX INFO: renamed from: oO0OOo0o.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33092Oooo0oO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f119646OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C33092Oooo0oO f119647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List f119648OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashSet<AbstractC33086Oooo0o> f119649OooO00o = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap<String, AbstractC33086Oooo0o> f119650OooO0O0 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0oO$OooO00o */
    public static final class OooO00o implements o00O0O.OooO00o<AbstractC33086Oooo0o> {
        @Override // oO0OOo0o.o00O0O.OooO00o
        public final boolean OooO00o(AbstractC33086Oooo0o abstractC33086Oooo0o) {
            abstractC33086Oooo0o.getClass();
            return true;
        }

        @Override // oO0OOo0o.o00O0O.OooO00o
        public final int OooO0O0(AbstractC33086Oooo0o abstractC33086Oooo0o) {
            abstractC33086Oooo0o.getClass();
            return 5;
        }
    }

    static {
        Logger logger = Logger.getLogger(C33092Oooo0oO.class.getName());
        f119646OooO0OO = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = o0000.f114316OooO0O0;
            arrayList.add(o0000.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            int i = oO000o00.OooOO0O.f115075OooO0O0;
            arrayList.add(oO000o00.OooOO0O.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        f119648OooO0o0 = Collections.unmodifiableList(arrayList);
    }

    public static synchronized C33092Oooo0oO OooO00o() {
        try {
            if (f119647OooO0Oo == null) {
                List<AbstractC33086Oooo0o> listOooO00o = o00O0O.OooO00o(AbstractC33086Oooo0o.class, f119648OooO0o0, AbstractC33086Oooo0o.class.getClassLoader(), new OooO00o());
                f119647OooO0Oo = new C33092Oooo0oO();
                for (AbstractC33086Oooo0o abstractC33086Oooo0o : listOooO00o) {
                    f119646OooO0OO.fine("Service loader found " + abstractC33086Oooo0o);
                    C33092Oooo0oO c33092Oooo0oO = f119647OooO0Oo;
                    synchronized (c33092Oooo0oO) {
                        abstractC33086Oooo0o.getClass();
                        Preconditions.checkArgument(true, "isAvailable() returned false");
                        c33092Oooo0oO.f119649OooO00o.add(abstractC33086Oooo0o);
                    }
                }
                f119647OooO0Oo.OooO0OO();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f119647OooO0Oo;
    }

    public final synchronized AbstractC33086Oooo0o OooO0O0(String str) {
        return this.f119650OooO0O0.get(Preconditions.checkNotNull(str, "policy"));
    }

    public final synchronized void OooO0OO() {
        this.f119650OooO0O0.clear();
        for (AbstractC33086Oooo0o abstractC33086Oooo0o : this.f119649OooO00o) {
            String strOooO0O0 = abstractC33086Oooo0o.OooO0O0();
            if (this.f119650OooO0O0.get(strOooO0O0) == null) {
                this.f119650OooO0O0.put(strOooO0O0, abstractC33086Oooo0o);
            }
        }
    }
}
