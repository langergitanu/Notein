package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: loaded from: classes3.dex */
class ibg implements IOutputSaver {
    @Override // com.aspose.slides.IOutputSaver
    public final void save(String str, IOutputFile iOutputFile) {
        String strM13400h4 = C3141rv.m13400h4(str);
        if (!"".equals(strM13400h4) && !C3142to.m13421kk(strM13400h4)) {
            C3142to.m13416k4(strM13400h4);
        }
        if (C14113y2.m67359c5(str, MsalUtils.QUERY_STRING_SYMBOL)) {
            ((OutputFile) iOutputFile).mo2108k4(((v1i) C7019kk.m27452k4((Object) iOutputFile, v1i.class)).m72053kk());
            return;
        }
        C3130fa c3130fa = new C3130fa(str, 2);
        try {
            ((OutputFile) iOutputFile).mo2108k4(c3130fa);
        } finally {
            c3130fa.dispose();
        }
    }
}
