package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.OooO00o;
import oOo000Oo.C34428OooOOo;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m80612d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class CertificatePinner$check$1 extends OooOOOO implements OooO00o<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f124051OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f124052OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f124053OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.f124052OooOo0o = certificatePinner;
        this.f124051OooOo = list;
        this.f124053OooOoO0 = str;
    }

    @Override // oO0O000o.OooO00o
    public final List<? extends X509Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f124052OooOo0o.f124049OooO0O0;
        List<Certificate> list = this.f124051OooOo;
        List<Certificate> listOooO00o = certificateChainCleaner == null ? null : certificateChainCleaner.OooO00o(this.f124053OooOoO0, list);
        if (listOooO00o != null) {
            list = listOooO00o;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
