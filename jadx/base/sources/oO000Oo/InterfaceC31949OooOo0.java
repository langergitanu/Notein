package oO000Oo;

import com.google.common.base.Objects;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import oO000Oo.C31999OoooOoo;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33078OooOoo0;

/* JADX INFO: renamed from: oO000Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31949OooOo0 extends Closeable {

    /* JADX INFO: renamed from: oO000Oo.OooOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f114042OooO00o = "unknown-authority";

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C33058OooO00o f114043OooO0O0 = C33058OooO00o.f119518OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C33078OooOoo0 f114044OooO0OO;

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f114042OooO00o.equals(oooO00o.f114042OooO00o) && this.f114043OooO0O0.equals(oooO00o.f114043OooO0O0) && Objects.equal(null, null) && Objects.equal(this.f114044OooO0OO, oooO00o.f114044OooO0OO);
        }

        public final int hashCode() {
            return Objects.hashCode(this.f114042OooO00o, this.f114043OooO0O0, null, this.f114044OooO0OO);
        }
    }

    InterfaceC31954OooOo0o OooOo(SocketAddress socketAddress, OooO00o oooO00o, C31999OoooOoo.OooO0o oooO0o);

    ScheduledExecutorService Oooo0o0();

    Collection<Class<? extends SocketAddress>> o0ooOO0();
}
