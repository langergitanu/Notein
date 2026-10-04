package oO0OOo0o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO0OO0OO.C32908OooO0oO;
import oO0OOo0o.o00O0O;

/* JADX INFO: renamed from: oO0OOo0o.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33100OoooO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f119662OooO0OO = Logger.getLogger(C33100OoooO0O.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C33100OoooO0O f119663OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashSet<AbstractC33099OoooO00> f119664OooO00o = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<AbstractC33099OoooO00> f119665OooO0O0 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: oO0OOo0o.OoooO0O$OooO00o */
    public static final class OooO00o implements o00O0O.OooO00o<AbstractC33099OoooO00> {
        @Override // oO0OOo0o.o00O0O.OooO00o
        public final boolean OooO00o(AbstractC33099OoooO00 abstractC33099OoooO00) {
            abstractC33099OoooO00.getClass();
            return true;
        }

        @Override // oO0OOo0o.o00O0O.OooO00o
        public final int OooO0O0(AbstractC33099OoooO00 abstractC33099OoooO00) {
            return abstractC33099OoooO00.OooO0O0();
        }
    }

    public static List<Class<?>> OooO00o() {
        Logger logger = f119662OooO0OO;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C32908OooO0oO.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
