package com.aspose.slides.internal.p474wg;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.Specialized.HybridDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import com.google.api.client.testing.http.HttpTesting;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.yg */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11994yg {

    /* JADX INFO: renamed from: du */
    static boolean f40477du;

    /* JADX INFO: renamed from: h4 */
    static InterfaceC11968sv f40478h4;

    /* JADX INFO: renamed from: to */
    static HybridDictionary f40480to = new HybridDictionary();

    /* JADX INFO: renamed from: m9 */
    static final Object f40479m9 = new Object();

    static {
        C11962qq c11962qq = new C11962qq();
        m56283k4("http", c11962qq);
        m56283k4(AuthenticationConstants.HTTPS_PROTOCOL_STRING, c11962qq);
        m56283k4("file", new C11943ix());
        m56283k4("ftp", new C11974u4());
    }

    /* JADX INFO: renamed from: ak */
    public static InterfaceC11968sv m56280ak() {
        Proxy next;
        ProxySelector.getDefault();
        try {
            Iterator<Proxy> it = ProxySelector.getDefault().select(new URI(HttpTesting.SIMPLE_URL)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.address() != null) {
                    break;
                }
            }
            if (next == null) {
                return C11977uz.m56250x1();
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) next.address();
            return new C11996yn(inetSocketAddress.getHostName(), inetSocketAddress.getPort());
        } catch (Exception unused) {
            return C11977uz.m56250x1();
        }
    }

    /* JADX INFO: renamed from: b3 */
    public static InterfaceC11968sv m56281b3() {
        if (!f40477du) {
            synchronized (f40479m9) {
                try {
                    if (f40478h4 == null) {
                        f40478h4 = m56285wy();
                    }
                } finally {
                }
            }
        }
        return f40478h4;
    }

    /* JADX INFO: renamed from: kk */
    private static InterfaceC11983wp m56284kk(String str) {
        String strM67398k4 = C14113y2.m67398k4(str, C11697x1.m55250kk());
        IDictionaryEnumerator it = f40480to.iterator();
        int length = -1;
        InterfaceC11983wp interfaceC11983wp = null;
        while (it.hasNext()) {
            String str2 = (String) C7019kk.m27452k4(it.getKey(), String.class);
            if (str2.length() > length && C14113y2.m67448x1(strM67398k4, str2)) {
                length = str2.length();
                interfaceC11983wp = (InterfaceC11983wp) it.getValue();
            }
        }
        if (interfaceC11983wp != null) {
            return interfaceC11983wp;
        }
        throw new NotSupportedException(strM67398k4);
    }

    /* JADX INFO: renamed from: wy */
    public static InterfaceC11968sv m56285wy() {
        return m56280ak();
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC11994yg m56286x1(String str) {
        if (str != null) {
            return m56282k4(new C14062gk(str));
        }
        throw new ArgumentNullException("requestUriString");
    }

    /* JADX INFO: renamed from: yd */
    public static Exception m56287yd() {
        return new NotImplementedException("This method must be implemented in derived classes");
    }

    /* JADX INFO: renamed from: bv */
    public void mo56199bv() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: du */
    public long mo56202du() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: dy */
    public C11973u1 mo56203dy() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: fa */
    public String mo56204fa() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC11956my mo56208k4(InterfaceC14083qm interfaceC14083qm) {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: m9 */
    public InterfaceC11926c6 mo56225m9() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: qq */
    public AbstractC11956my mo56227qq() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: up */
    public InterfaceC11968sv mo56233up() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: yj */
    public C14062gk mo56240yj() {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC11994yg m56282k4(C14062gk c14062gk) {
        if (c14062gk != null) {
            return m56284kk(c14062gk.m66697x1()).mo55979k4(c14062gk);
        }
        throw new ArgumentNullException("requestUri");
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC14083qm mo56210k4(AbstractC14078m9 abstractC14078m9, Object obj) {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo56215k4(InterfaceC11926c6 interfaceC11926c6) {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo56218k4(InterfaceC11968sv interfaceC11968sv) {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo56219k4(String str) {
        throw m56287yd();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m56283k4(String str, InterfaceC11983wp interfaceC11983wp) {
        if (str == null) {
            throw new ArgumentNullException(RequestParameters.PREFIX);
        }
        if (interfaceC11983wp == null) {
            throw new ArgumentNullException("creator");
        }
        synchronized (f40480to.getSyncRoot()) {
            try {
                String strM67398k4 = C14113y2.m67398k4(str, C11697x1.m55250kk());
                if (f40480to.contains(strM67398k4)) {
                    return false;
                }
                f40480to.addItem(strM67398k4, interfaceC11983wp);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
