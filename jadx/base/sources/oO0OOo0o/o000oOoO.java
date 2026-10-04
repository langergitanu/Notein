package oO0OOo0o;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.huawei.hms.network.inner.api.NetworkService;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import oO000Oo.C31976Oooo00O;
import oO000Oo.o00Ooo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o000oOoO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f119702OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC33110OooooOO f119703OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ExecutorC33121o00ooo f119704OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AbstractC33118OooO0oO f119705OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AbstractC33061OooO0o0 f119706OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ScheduledExecutorService f119707OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o00Ooo.ExecutorC32058OooO0oo f119708OooO0oO;

        public OooO00o(Integer num, InterfaceC33110OooooOO interfaceC33110OooooOO, ExecutorC33121o00ooo executorC33121o00ooo, AbstractC33118OooO0oO abstractC33118OooO0oO, ScheduledExecutorService scheduledExecutorService, AbstractC33061OooO0o0 abstractC33061OooO0o0, o00Ooo.ExecutorC32058OooO0oo executorC32058OooO0oo) {
            this.f119702OooO00o = ((Integer) Preconditions.checkNotNull(num, "defaultPort not set")).intValue();
            this.f119703OooO0O0 = (InterfaceC33110OooooOO) Preconditions.checkNotNull(interfaceC33110OooooOO, "proxyDetector not set");
            this.f119704OooO0OO = (ExecutorC33121o00ooo) Preconditions.checkNotNull(executorC33121o00ooo, "syncContext not set");
            this.f119705OooO0Oo = (AbstractC33118OooO0oO) Preconditions.checkNotNull(abstractC33118OooO0oO, "serviceConfigParser not set");
            this.f119707OooO0o0 = scheduledExecutorService;
            this.f119706OooO0o = abstractC33061OooO0o0;
            this.f119708OooO0oO = executorC32058OooO0oo;
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("defaultPort", this.f119702OooO00o).add("proxyDetector", this.f119703OooO0O0).add("syncContext", this.f119704OooO0OO).add("serviceConfigParser", this.f119705OooO0Oo).add("scheduledExecutorService", this.f119707OooO0o0).add("channelLogger", this.f119706OooO0o).add("executor", this.f119708OooO0oO).add("overrideAuthority", (Object) null).toString();
        }
    }

    public static abstract class OooO0OO {
        public abstract C31976Oooo00O OooO00o(URI uri, OooO00o oooO00o);
    }

    /* JADX INFO: renamed from: oO0OOo0o.o000oOoO$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC33116OooO0Oo implements InterfaceC33117OooO0o0 {
        public abstract void OooO0O0(OooO0o oooO0o);
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<C33072OooOo0O> f119711OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C33058OooO00o f119712OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f119713OooO0OO;

        public OooO0o(List<C33072OooOo0O> list, C33058OooO00o c33058OooO00o, OooO0O0 oooO0O0) {
            this.f119711OooO00o = Collections.unmodifiableList(new ArrayList(list));
            this.f119712OooO0O0 = (C33058OooO00o) Preconditions.checkNotNull(c33058OooO00o, "attributes");
            this.f119713OooO0OO = oooO0O0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return Objects.equal(this.f119711OooO00o, oooO0o.f119711OooO00o) && Objects.equal(this.f119712OooO0O0, oooO0o.f119712OooO0O0) && Objects.equal(this.f119713OooO0OO, oooO0o.f119713OooO0OO);
        }

        public final int hashCode() {
            return Objects.hashCode(this.f119711OooO00o, this.f119712OooO0O0, this.f119713OooO0OO);
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("addresses", this.f119711OooO00o).add("attributes", this.f119712OooO0O0).add("serviceConfig", this.f119713OooO0OO).toString();
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.o000oOoO$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC33117OooO0o0 {
        void OooO00o(o00Oo0 o00oo02);
    }

    /* JADX INFO: renamed from: oO0OOo0o.o000oOoO$OooO0oO, reason: case insensitive filesystem */
    public static abstract class AbstractC33118OooO0oO {
        public abstract OooO0O0 OooO00o(Map<String, ?> map);
    }

    public abstract String OooO00o();

    public void OooO0O0() {
    }

    public abstract void OooO0OO();

    public void OooO0Oo(AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
        OooO0o0(abstractC33116OooO0Oo);
    }

    public void OooO0o0(AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
        OooO0Oo(abstractC33116OooO0Oo);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00Oo0 f119709OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f119710OooO0O0;

        public OooO0O0(Object obj) {
            this.f119710OooO0O0 = Preconditions.checkNotNull(obj, NetworkService.Constants.CONFIG_SERVICE);
            this.f119709OooO00o = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && OooO0O0.class == obj.getClass()) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (Objects.equal(this.f119709OooO00o, oooO0O0.f119709OooO00o) && Objects.equal(this.f119710OooO0O0, oooO0O0.f119710OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f119709OooO00o, this.f119710OooO0O0);
        }

        public final String toString() {
            Object obj = this.f119710OooO0O0;
            return obj != null ? MoreObjects.toStringHelper(this).add(NetworkService.Constants.CONFIG_SERVICE, obj).toString() : MoreObjects.toStringHelper(this).add("error", this.f119709OooO00o).toString();
        }

        public OooO0O0(o00Oo0 o00oo02) {
            this.f119710OooO0O0 = null;
            this.f119709OooO00o = (o00Oo0) Preconditions.checkNotNull(o00oo02, "status");
            Preconditions.checkArgument(!o00oo02.OooO0o(), "cannot use OK status: %s", o00oo02);
        }
    }
}
