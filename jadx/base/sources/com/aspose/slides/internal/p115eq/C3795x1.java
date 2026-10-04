package com.aspose.slides.internal.p115eq;

import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;
import com.aspose.slides.internal.p468vz.C11878k4;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C3795x1 implements InterfaceC3793to {
    /* JADX INFO: renamed from: k4 */
    private static C3152yj m15169k4(C14062gk c14062gk) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(c14062gk.m66697x1()).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200 && (responseCode == 302 || responseCode == 301 || responseCode == 303)) {
                String headerField = httpURLConnection.getHeaderField("Location");
                String headerField2 = httpURLConnection.getHeaderField(HttpHeaders.SET_COOKIE);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                httpURLConnection2.setRequestProperty(HttpHeaders.COOKIE, headerField2);
                httpURLConnection = httpURLConnection2;
            }
            try {
                AbstractC3150x6 abstractC3150x6FromJava = AbstractC3150x6.fromJava(httpURLConnection.getInputStream());
                try {
                    C3152yj c3152yj = new C3152yj(abstractC3150x6FromJava instanceof C11878k4 ? ((C11878k4) abstractC3150x6FromJava).toArray() : m15170k4(abstractC3150x6FromJava));
                    if (abstractC3150x6FromJava != null) {
                        abstractC3150x6FromJava.dispose();
                    }
                    return c3152yj;
                } catch (Throwable th) {
                    if (abstractC3150x6FromJava != null) {
                        abstractC3150x6FromJava.dispose();
                    }
                    throw th;
                }
            } finally {
                if (httpURLConnection.getInputStream() != null) {
                    httpURLConnection.getInputStream().close();
                }
                httpURLConnection.disconnect();
            }
        } catch (MalformedURLException | IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5815xk
    /* JADX INFO: renamed from: k4 */
    public final C5801ss mo14413k4(Object obj, C5811wp c5811wp) {
        return C14113y2.m67411k4(c5811wp.m23710k4()) ? new C5801ss(null) : new C5801ss(m15171k4(c5811wp.m23710k4()));
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m15170k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 4096);
            if (i == 0) {
                return bArr;
            }
            abstractC3150x6.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m15171k4(String str) {
        if (C14113y2.m67448x1(C14113y2.m67431to(str, ControlChar.SPACE_CHAR, '\t'), "data:")) {
            C12385to c12385toM57989x1 = new C12380dy("data:(.*);\\s*(.*);*\\s*base64\\s*,\\s*(.*)", 66).m57989x1(str);
            if (c12385toM57989x1.mo58006to()) {
                return C14080ne.m66934jd(c12385toM57989x1.m58004du().m58000k4(3).mo57995kk());
            }
        }
        try {
            C14062gk c14062gk = new C14062gk(str);
            if (c14062gk.m66679dy() || !c14062gk.m66683ix()) {
                return C12565ks.m58625k4(c14062gk.m66683ix() ? c14062gk.m66677ck() : c14062gk.m66694u4());
            }
            try {
                C3152yj c3152yjM15169k4 = m15169k4(c14062gk);
                if (c3152yjM15169k4 != null) {
                    return c3152yjM15169k4.toArray();
                }
            } catch (Exception unused) {
            }
            return null;
        } catch (UriFormatException unused2) {
            return null;
        }
    }
}
