package oO0OOo0o;

import Oooo0oo.AbstractC21138OooO0oo;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import oO0OOo0o.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO.OooO0O0<Long> f119514OooO00o;

    public static abstract class OooO00o {
        public OooO OooO00o(OooO0O0 oooO0O0, C33094OoooO c33094OoooO) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f119515OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f119516OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f119517OooO0OO;

        public OooO0O0(OooO0OO oooO0OO, int i, boolean z) {
            this.f119515OooO00o = (OooO0OO) Preconditions.checkNotNull(oooO0OO, "callOptions");
            this.f119516OooO0O0 = i;
            this.f119517OooO0OO = z;
        }

        public final String toString() {
            return MoreObjects.toStringHelper(this).add("callOptions", this.f119515OooO00o).add("previousAttempts", this.f119516OooO0O0).add("isTransparentRetry", this.f119517OooO0OO).toString();
        }
    }

    static {
        Preconditions.checkNotNull("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED", "debugString");
        f119514OooO00o = new OooO0OO.OooO0O0<>("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");
    }

    public void OoooooO() {
    }

    public void Ooooooo() {
    }

    public void o00O0O(C33058OooO00o c33058OooO00o, C33094OoooO c33094OoooO) {
    }

    public void o0OoOo0(C33094OoooO c33094OoooO) {
    }

    public void ooOO() {
    }
}
