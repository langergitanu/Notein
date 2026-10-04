package oO0OOo0o;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import oO000Oo.o0000O00;
import oO000o00.C32098OooO0oo;
import oO0OOo0o.C33058OooO00o;

/* JADX INFO: renamed from: oO0OOo0o.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33087Oooo0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33058OooO00o.OooO0O0<Map<String, ?>> f119626OooO0O0 = new C33058OooO00o.OooO0O0<>("internal:health-checking-config");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0.C20299OooO0O0<OooOO0O> f119627OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33058OooO00o.OooO0O0<Boolean> f119628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C33058OooO00o.OooO0O0<Boolean> f119629OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f119630OooO00o;

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO */
    public static abstract class OooO {
        public void OooO(List<C33072OooOo0O> list) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C33072OooOo0O OooO00o() {
            boolean z;
            List<C33072OooOo0O> listOooO0O0 = OooO0O0();
            if (listOooO0O0 != null) {
                z = listOooO0O0.size() == 1;
            }
            Preconditions.checkState(z, "%s does not have exactly one group", listOooO0O0);
            return listOooO0O0.get(0);
        }

        public List<C33072OooOo0O> OooO0O0() {
            throw new UnsupportedOperationException();
        }

        public abstract C33058OooO00o OooO0OO();

        public AbstractC33061OooO0o0 OooO0Oo() {
            throw new UnsupportedOperationException();
        }

        public abstract void OooO0o();

        public Object OooO0o0() {
            throw new UnsupportedOperationException();
        }

        public abstract void OooO0oO();

        public void OooO0oo(OooOO0O oooOO0O) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO00o */
    public class OooO00o extends OooOO0 {
        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final OooO0o OooO00o(o0000O00 o0000o00) {
            return OooO0o.f119638OooO0o0;
        }

        public final String toString() {
            return "EMPTY_PICKER";
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<C33072OooOo0O> f119631OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C33058OooO00o f119632OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object[][] f119633OooO0OO;

        /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0O0$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public List<C33072OooOo0O> f119634OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public C33058OooO00o f119635OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public Object[][] f119636OooO0OO;

            public final void OooO00o(C20299OooO0O0 c20299OooO0O0, OooOO0O oooOO0O) {
                Preconditions.checkNotNull(c20299OooO0O0, "key");
                Preconditions.checkNotNull(oooOO0O, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f119636OooO0OO;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    } else if (c20299OooO0O0.equals(objArr[length][0])) {
                        break;
                    } else {
                        length++;
                    }
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f119636OooO0OO.length + 1, 2);
                    Object[][] objArr3 = this.f119636OooO0OO;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f119636OooO0OO = objArr2;
                    length = objArr2.length - 1;
                }
                this.f119636OooO0OO[length] = new Object[]{c20299OooO0O0, oooOO0O};
            }

            public final void OooO0O0(List list) {
                Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
                this.f119634OooO00o = Collections.unmodifiableList(new ArrayList(list));
            }
        }

        /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C20299OooO0O0<T> {
            public final String toString() {
                return "internal:health-check-consumer-listener";
            }
        }

        public OooO0O0(List list, C33058OooO00o c33058OooO00o, Object[][] objArr) {
            this.f119631OooO00o = (List) Preconditions.checkNotNull(list, "addresses are not set");
            this.f119632OooO0O0 = (C33058OooO00o) Preconditions.checkNotNull(c33058OooO00o, "attrs");
            this.f119633OooO0OO = (Object[][]) Preconditions.checkNotNull(objArr, "customOptions");
        }

        public static OooO00o OooO0O0() {
            OooO00o oooO00o = new OooO00o();
            oooO00o.f119635OooO0O0 = C33058OooO00o.f119518OooO0O0;
            oooO00o.f119636OooO0OO = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
            return oooO00o;
        }

        public final <T> T OooO00o(C20299OooO0O0<T> c20299OooO0O0) {
            Preconditions.checkNotNull(c20299OooO0O0, "key");
            int i = 0;
            while (true) {
                Object[][] objArr = this.f119633OooO0OO;
                if (i >= objArr.length) {
                    c20299OooO0O0.getClass();
                    return null;
                }
                if (c20299OooO0O0.equals(objArr[i][0])) {
                    return (T) objArr[i][1];
                }
                i++;
            }
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("addrs", this.f119631OooO00o).add("attrs", this.f119632OooO0O0).add("customOptions", Arrays.deepToString(this.f119633OooO0OO)).toString();
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0OO */
    public static abstract class OooO0OO {
        public abstract AbstractC33087Oooo0o0 OooO00o(AbstractC33089OooO0o0 abstractC33089OooO0o0);
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C33088OooO0Oo extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f119637OooO00o;

        public C33088OooO0Oo(OooO0o oooO0o) {
            this.f119637OooO00o = (OooO0o) Preconditions.checkNotNull(oooO0o, "result");
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final OooO0o OooO00o(o0000O00 o0000o00) {
            return this.f119637OooO00o;
        }

        public final String toString() {
            return "FixedResultPicker(" + this.f119637OooO00o + ")";
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0o */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO0o f119638OooO0o0 = new OooO0o(null, null, o00Oo0.f119717OooO0o0, false);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO f119639OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C32098OooO0oo.C32101OooO0oO.OooO00o f119640OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00Oo0 f119641OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f119642OooO0Oo;

        public OooO0o(OooO oooO, C32098OooO0oo.C32101OooO0oO.OooO00o oooO00o, o00Oo0 o00oo02, boolean z) {
            this.f119639OooO00o = oooO;
            this.f119640OooO0O0 = oooO00o;
            this.f119641OooO0OO = (o00Oo0) Preconditions.checkNotNull(o00oo02, "status");
            this.f119642OooO0Oo = z;
        }

        public static OooO0o OooO00o(o00Oo0 o00oo02) {
            Preconditions.checkArgument(!o00oo02.OooO0o(), "error status shouldn't be OK");
            return new OooO0o(null, null, o00oo02, false);
        }

        public static OooO0o OooO0O0(OooO oooO, C32098OooO0oo.C32101OooO0oO.OooO00o oooO00o) {
            return new OooO0o((OooO) Preconditions.checkNotNull(oooO, "subchannel"), oooO00o, o00Oo0.f119717OooO0o0, false);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return Objects.equal(this.f119639OooO00o, oooO0o.f119639OooO00o) && Objects.equal(this.f119641OooO0OO, oooO0o.f119641OooO0OO) && Objects.equal(this.f119640OooO0O0, oooO0o.f119640OooO0O0) && this.f119642OooO0Oo == oooO0o.f119642OooO0Oo;
        }

        public final int hashCode() {
            Boolean boolValueOf = Boolean.valueOf(this.f119642OooO0Oo);
            return Objects.hashCode(this.f119639OooO00o, this.f119641OooO0OO, this.f119640OooO0O0, boolValueOf);
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("subchannel", this.f119639OooO00o).add("streamTracerFactory", this.f119640OooO0O0).add("status", this.f119641OooO0OO).add("drop", this.f119642OooO0Oo).toString();
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC33089OooO0o0 {
        public OooO OooO00o(OooO0O0 oooO0O0) {
            throw new UnsupportedOperationException();
        }

        public AbstractC33061OooO0o0 OooO0O0() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService OooO0OO() {
            throw new UnsupportedOperationException();
        }

        public ExecutorC33121o00ooo OooO0Oo() {
            throw new UnsupportedOperationException();
        }

        public abstract void OooO0o(OooOOO oooOOO, OooOO0 oooOO02);

        public void OooO0o0() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0oO, reason: case insensitive filesystem */
    public static abstract class AbstractC33090OooO0oO {
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooO0oo, reason: case insensitive filesystem */
    public static final class C33091OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<C33072OooOo0O> f119643OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C33058OooO00o f119644OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f119645OooO0OO;

        public C33091OooO0oo() {
            throw null;
        }

        public C33091OooO0oo(List list, C33058OooO00o c33058OooO00o, Object obj) {
            this.f119643OooO00o = Collections.unmodifiableList(new ArrayList((Collection) Preconditions.checkNotNull(list, "addresses")));
            this.f119644OooO0O0 = (C33058OooO00o) Preconditions.checkNotNull(c33058OooO00o, "attributes");
            this.f119645OooO0OO = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C33091OooO0oo)) {
                return false;
            }
            C33091OooO0oo c33091OooO0oo = (C33091OooO0oo) obj;
            return Objects.equal(this.f119643OooO00o, c33091OooO0oo.f119643OooO00o) && Objects.equal(this.f119644OooO0O0, c33091OooO0oo.f119644OooO0O0) && Objects.equal(this.f119645OooO0OO, c33091OooO0oo.f119645OooO0OO);
        }

        public final int hashCode() {
            return Objects.hashCode(this.f119643OooO00o, this.f119644OooO0O0, this.f119645OooO0OO);
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("addresses", this.f119643OooO00o).add("attributes", this.f119644OooO0O0).add("loadBalancingPolicyConfig", this.f119645OooO0OO).toString();
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooOO0 */
    public static abstract class OooOO0 {
        public abstract OooO0o OooO00o(o0000O00 o0000o00);
    }

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o0$OooOO0O */
    public interface OooOO0O {
        void OooO00o(OooOOOO oooOOOO);
    }

    static {
        Preconditions.checkNotNull("internal:health-check-consumer-listener", "debugString");
        f119627OooO0OO = new OooO0O0.C20299OooO0O0<>();
        f119628OooO0Oo = new C33058OooO00o.OooO0O0<>("internal:has-health-check-producer-listener");
        f119629OooO0o0 = new C33058OooO00o.OooO0O0<>("io.grpc.IS_PETIOLE_POLICY");
        new OooO00o();
    }

    public o00Oo0 OooO00o(C33091OooO0oo c33091OooO0oo) {
        List<C33072OooOo0O> list = c33091OooO0oo.f119643OooO00o;
        if (!list.isEmpty() || OooO0O0()) {
            int i = this.f119630OooO00o;
            this.f119630OooO00o = i + 1;
            if (i == 0) {
                OooO0Oo(c33091OooO0oo);
            }
            this.f119630OooO00o = 0;
            return o00Oo0.f119717OooO0o0;
        }
        o00Oo0 o00oo0OooO0oo = o00Oo0.f119725OooOOOO.OooO0oo("NameResolver returned no usable address. addrs=" + list + ", attrs=" + c33091OooO0oo.f119644OooO0O0);
        OooO0OO(o00oo0OooO0oo);
        return o00oo0OooO0oo;
    }

    public boolean OooO0O0() {
        return false;
    }

    public abstract void OooO0OO(o00Oo0 o00oo02);

    public void OooO0Oo(C33091OooO0oo c33091OooO0oo) {
        int i = this.f119630OooO00o;
        this.f119630OooO00o = i + 1;
        if (i == 0) {
            OooO00o(c33091OooO0oo);
        }
        this.f119630OooO00o = 0;
    }

    public abstract void OooO0o();

    public void OooO0o0() {
    }
}
