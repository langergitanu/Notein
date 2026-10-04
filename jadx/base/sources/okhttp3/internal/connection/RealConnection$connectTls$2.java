package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.OooO00o;
import oOo000Oo.C34428OooOOo;
import okhttp3.Handshake;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m80612d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
final class RealConnection$connectTls$2 extends OooOOOO implements OooO00o<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ RealConnection f124417OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f124417OooOo0o = realConnection;
    }

    @Override // oO0O000o.OooO00o
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake = this.f124417OooOo0o.f124402OooO0o0;
        OooOOO0.OooO0Oo(handshake);
        List<Certificate> listOooO00o = handshake.OooO00o();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO00o, 10));
        Iterator<T> it = listOooO00o.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
