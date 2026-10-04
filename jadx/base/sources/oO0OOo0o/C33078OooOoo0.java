package oO0OOo0o;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: renamed from: oO0OOo0o.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33078OooOoo0 extends AbstractC33109OooooO0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f119604OooOoOO = 0;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InetSocketAddress f119605OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SocketAddress f119606OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f119607OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f119608OooOoO0;

    public C33078OooOoo0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        Preconditions.checkNotNull(socketAddress, "proxyAddress");
        Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            Preconditions.checkState(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f119606OooOo0o = socketAddress;
        this.f119605OooOo = inetSocketAddress;
        this.f119608OooOoO0 = str;
        this.f119607OooOoO = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C33078OooOoo0)) {
            return false;
        }
        C33078OooOoo0 c33078OooOoo0 = (C33078OooOoo0) obj;
        return Objects.equal(this.f119606OooOo0o, c33078OooOoo0.f119606OooOo0o) && Objects.equal(this.f119605OooOo, c33078OooOoo0.f119605OooOo) && Objects.equal(this.f119608OooOoO0, c33078OooOoo0.f119608OooOoO0) && Objects.equal(this.f119607OooOoO, c33078OooOoo0.f119607OooOoO);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f119606OooOo0o, this.f119605OooOo, this.f119608OooOoO0, this.f119607OooOoO);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("proxyAddr", this.f119606OooOo0o).add("targetAddr", this.f119605OooOo).add("username", this.f119608OooOoO0).add("hasPassword", this.f119607OooOoO != null).toString();
    }
}
