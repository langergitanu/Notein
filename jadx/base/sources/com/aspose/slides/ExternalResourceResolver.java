package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class ExternalResourceResolver implements IExternalResourceResolver {
    private final C14010x0 m_xmlUrlResolver = new C14010x0();

    @Override // com.aspose.slides.IExternalResourceResolver
    public InputStream getEntity(String str) {
        return getEntityInternal(str).toInputStream();
    }

    public AbstractC3150x6 getEntityInternal(String str) {
        int responseCode;
        try {
            if (new C14062gk(str).m66683ix()) {
                return (AbstractC3150x6) this.m_xmlUrlResolver.mo5312k4(new C14062gk(str), "", C7019kk.m27443k4((Class<?>) AbstractC3150x6.class));
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if ((uRLConnectionOpenConnection instanceof HttpURLConnection) && (responseCode = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode()) != 200 && (responseCode == 302 || responseCode == 301 || responseCode == 303)) {
                String headerField = uRLConnectionOpenConnection.getHeaderField("Location");
                String headerField2 = uRLConnectionOpenConnection.getHeaderField(HttpHeaders.SET_COOKIE);
                URLConnection uRLConnectionOpenConnection2 = new URL(headerField).openConnection();
                uRLConnectionOpenConnection2.setRequestProperty(HttpHeaders.COOKIE, headerField2);
                uRLConnectionOpenConnection = uRLConnectionOpenConnection2;
            }
            try {
                AbstractC3150x6 abstractC3150x6FromJava = AbstractC3150x6.fromJava(uRLConnectionOpenConnection.getInputStream());
                try {
                    return new C3152yj(C13447k4.m62559k4(abstractC3150x6FromJava));
                } finally {
                    if (abstractC3150x6FromJava != null) {
                        abstractC3150x6FromJava.dispose();
                    }
                }
            } finally {
                if (uRLConnectionOpenConnection.getInputStream() != null) {
                    uRLConnectionOpenConnection.getInputStream().close();
                }
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                }
            }
        } catch (IOException e2) {
            C3085sv.m13082k4(e2);
            return null;
        } catch (RuntimeException e3) {
            C3085sv.m13082k4(e3);
            return null;
        } catch (MalformedURLException e4) {
            C3085sv.m13082k4(e4);
            return null;
        }
    }

    @Override // com.aspose.slides.IExternalResourceResolver
    public String resolveUri(String str, String str2) {
        try {
            return this.m_xmlUrlResolver.mo65674k4(new C14062gk(str), str2).toString();
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }
}
