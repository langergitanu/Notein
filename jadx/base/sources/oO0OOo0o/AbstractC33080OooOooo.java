package oO0OOo0o;

import com.google.common.base.Preconditions;
import oO0OOo0o.C33058OooO00o;

/* JADX INFO: renamed from: oO0OOo0o.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33080OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33058OooO00o.OooO0O0<AbstractC33080OooOooo> f119614OooO00o = new C33058OooO00o.OooO0O0<>("internal:io.grpc.config-selector");

    /* JADX INFO: renamed from: oO0OOo0o.OooOooo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00Oo0 f119615OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f119616OooO0O0;

        public OooO00o(o00Oo0 o00oo02, Object obj) {
            this.f119615OooO00o = (o00Oo0) Preconditions.checkNotNull(o00oo02, "status");
            this.f119616OooO0O0 = obj;
        }
    }

    public abstract OooO00o OooO00o();
}
