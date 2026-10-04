package oO000Oo;

import OooOoo.C20593OooO0Oo;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import oO000Oo.o00Ooo;
import oO0OOo0o.AbstractC33086Oooo0o;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33092Oooo0oO;

/* JADX INFO: renamed from: oO000Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31939OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33092Oooo0oO f113962OooO00o = (C33092Oooo0oO) Preconditions.checkNotNull(C33092Oooo0oO.OooO00o(), "registry");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113963OooO0O0;

    /* JADX INFO: renamed from: oO000Oo.OooO0oo$OooO00o */
    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00Ooo.OooOO0O f113964OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public AbstractC33087Oooo0o0 f113965OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public AbstractC33086Oooo0o f113966OooO0OO;

        public OooO00o(o00Ooo.OooOO0O oooOO0O) {
            this.f113964OooO00o = oooOO0O;
            C33092Oooo0oO c33092Oooo0oO = C31939OooO0oo.this.f113962OooO00o;
            String str = C31939OooO0oo.this.f113963OooO0O0;
            AbstractC33086Oooo0o abstractC33086Oooo0oOooO0O0 = c33092Oooo0oO.OooO0O0(str);
            this.f113966OooO0OO = abstractC33086Oooo0oOooO0O0;
            if (abstractC33086Oooo0oOooO0O0 == null) {
                throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            }
            this.f113965OooO0O0 = abstractC33086Oooo0oOooO0O0.OooO00o(oooOO0O);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooO0oo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC33087Oooo0o0.OooOO0 {
        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            return AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0;
        }

        public final String toString() {
            return MoreObjects.toStringHelper((Class<?>) OooO0O0.class).toString();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooO0oo$OooO0OO */
    public static final class OooO0OO extends AbstractC33087Oooo0o0.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO0OOo0o.o00Oo0 f113968OooO00o;

        public OooO0OO(oO0OOo0o.o00Oo0 o00oo02) {
            this.f113968OooO00o = o00oo02;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            return AbstractC33087Oooo0o0.OooO0o.OooO00o(this.f113968OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C31940OooO0Oo extends AbstractC33087Oooo0o0 {
        @Override // oO0OOo0o.AbstractC33087Oooo0o0
        public final oO0OOo0o.o00Oo0 OooO00o(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
            return oO0OOo0o.o00Oo0.f119717OooO0o0;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0
        public final void OooO0OO(oO0OOo0o.o00Oo0 o00oo02) {
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0
        @Deprecated
        public final void OooO0Oo(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0
        public final void OooO0o() {
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooO0oo$OooO0o0, reason: case insensitive filesystem */
    public static final class C31941OooO0o0 extends Exception {
        private static final long serialVersionUID = 1;
    }

    public C31939OooO0oo(String str) {
        this.f113963OooO0O0 = (String) Preconditions.checkNotNull(str, "defaultPolicy");
    }
}
