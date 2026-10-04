package oO0OOo0o;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oO0OOo0o.C33058OooO00o;

/* JADX INFO: renamed from: oO0OOo0o.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33072OooOo0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33058OooO00o.OooO0O0<String> f119586OooO0Oo = new C33058OooO00o.OooO0O0<>("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<SocketAddress> f119587OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33058OooO00o f119588OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f119589OooO0OO;

    public C33072OooOo0O(SocketAddress socketAddress) {
        C33058OooO00o c33058OooO00o = C33058OooO00o.f119518OooO0O0;
        List listSingletonList = Collections.singletonList(socketAddress);
        Preconditions.checkArgument(!listSingletonList.isEmpty(), "addrs is empty");
        List<SocketAddress> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f119587OooO00o = listUnmodifiableList;
        this.f119588OooO0O0 = (C33058OooO00o) Preconditions.checkNotNull(c33058OooO00o, "attrs");
        this.f119589OooO0OO = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33072OooOo0O)) {
            return false;
        }
        C33072OooOo0O c33072OooOo0O = (C33072OooOo0O) obj;
        List<SocketAddress> list = this.f119587OooO00o;
        if (list.size() != c33072OooOo0O.f119587OooO00o.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(c33072OooOo0O.f119587OooO00o.get(i))) {
                return false;
            }
        }
        return this.f119588OooO0O0.equals(c33072OooOo0O.f119588OooO0O0);
    }

    public final int hashCode() {
        return this.f119589OooO0OO;
    }

    public final String toString() {
        return "[" + this.f119587OooO00o + "/" + this.f119588OooO0O0 + "]";
    }
}
