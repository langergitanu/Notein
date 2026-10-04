package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C14010x0;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HtmlExternalResolver implements IHtmlExternalResolver {

    /* JADX INFO: renamed from: k4 */
    private final C14010x0 f2446k4 = new C14010x0();

    @Override // com.aspose.slides.IExternalResourceResolver
    public InputStream getEntity(String str) {
        return m1661k4(str).toInputStream();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 m1661k4(String str) {
        int i = 5;
        if (str.length() > 5) {
            boolean z = false;
            if ("data:".equals(C14113y2.m67368h4(C14113y2.m67443x1(str, 0, 5)))) {
                while (i < str.length() && str.charAt(i) != ',' && str.charAt(i) != ';') {
                    i++;
                }
                while (i < str.length() && str.charAt(i) == ';') {
                    do {
                        i++;
                        if (i >= str.length()) {
                            break;
                        }
                    } while (str.charAt(i) <= ' ');
                    int i2 = i;
                    while (i2 < str.length() && str.charAt(i2) != ',' && str.charAt(i2) != ';') {
                        i2++;
                    }
                    int i3 = i2;
                    while (i < i3 && str.charAt(i3 - 1) <= ' ') {
                        i3--;
                    }
                    if ("base64".equals(C14113y2.m67368h4(C14113y2.m67443x1(str, i, i3 - i)))) {
                        z = true;
                    }
                    i = i2;
                }
                if (i < str.length() && str.charAt(i) == ',') {
                    int i4 = i + 1;
                    if (z) {
                        return new C3152yj(C14080ne.m66934jd(C14113y2.m67422kk(str, i4)));
                    }
                    try {
                        return new C3152yj(URLDecoder.decode(C14113y2.m67422kk(str, i4), "UTF-8").getBytes());
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        try {
            Object objMo5312k4 = this.f2446k4.mo5312k4(new C14062gk(str), "", C7019kk.m27443k4((Class<?>) AbstractC3150x6.class));
            if (objMo5312k4 instanceof AbstractC3150x6) {
                return (AbstractC3150x6) objMo5312k4;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // com.aspose.slides.IExternalResourceResolver
    public String resolveUri(String str, String str2) {
        try {
            return str != null ? new C14062gk(new C14062gk(str), str2).toString() : new C14062gk(str2).toString();
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
