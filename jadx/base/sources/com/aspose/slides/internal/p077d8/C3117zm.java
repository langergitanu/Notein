package com.aspose.slides.internal.p077d8;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13950o3;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.zm */
/* JADX INFO: loaded from: classes3.dex */
public class C3117zm extends C13950o3 {

    /* JADX INFO: renamed from: k4 */
    private final String f9255k4;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<String, String> f9256x1;

    public C3117zm(AbstractC13883dt abstractC13883dt, String str) {
        super(abstractC13883dt);
        this.f9256x1 = new Dictionary<>();
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentNullException("contentType");
        }
        this.f9255k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    private void m13291kk(String str) {
        if (str == null) {
            throw new ArgumentNullException(RequestParameters.PREFIX);
        }
        String strM67402k4 = C14113y2.m67402k4("{0}:{1}", str, this.f9255k4);
        String strM67402k42 = C14113y2.m67402k4("http://aspose.com/2017/12/fake/namespace/for/prefix/{0}/{1}", this.f9255k4, str);
        if (mo52700x1(strM67402k42) != null) {
            throw new InvalidOperationException(C14113y2.m67402k4("Uri already exists \"{0}\"", strM67402k42));
        }
        if (!this.f9256x1.containsKey(strM67402k4)) {
            this.f9256x1.addItem(strM67402k4, strM67402k42);
        }
        mo65707k4(str, strM67402k42);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13950o3, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return super.mo13292k4(str);
        }
        if (super.mo13292k4(str) == null) {
            m13291kk(str);
        }
        return super.mo13292k4(str);
    }
}
