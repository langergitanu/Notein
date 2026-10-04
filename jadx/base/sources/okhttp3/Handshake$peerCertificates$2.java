package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m80612d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Handshake$peerCertificates$2 extends OooOOOO implements OooO00o<List<? extends Certificate>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f124122OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(OooO00o<? extends List<? extends Certificate>> oooO00o) {
        super(0);
        this.f124122OooOo0o = (OooOOOO) oooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // oO0O000o.OooO00o
    public final List<? extends Certificate> invoke() {
        try {
            return (List) this.f124122OooOo0o.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return C34434OooOoO.f123453OooOo0o;
        }
    }
}
