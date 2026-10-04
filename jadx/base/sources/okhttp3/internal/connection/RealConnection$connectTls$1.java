package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.OooO00o;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m80612d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
final class RealConnection$connectTls$1 extends OooOOOO implements OooO00o<List<? extends Certificate>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Handshake f124414OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f124415OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Address f124416OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f124415OooOo0o = certificatePinner;
        this.f124414OooOo = handshake;
        this.f124416OooOoO0 = address;
    }

    @Override // oO0O000o.OooO00o
    public final List<? extends Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f124415OooOo0o.f124049OooO0O0;
        OooOOO0.OooO0Oo(certificateChainCleaner);
        return certificateChainCleaner.OooO00o(this.f124416OooOoO0.f124018OooO.f124132OooO0Oo, this.f124414OooOo.OooO00o());
    }
}
