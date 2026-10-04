package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class tla implements IXamlOutputSaver {
    @Override // com.aspose.slides.IXamlOutputSaver
    public final void save(String str, byte[] bArr) {
        if (C14113y2.m67411k4(str)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamlOutputSaver", "path"));
        }
        if (bArr == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamlOutputSaver", "binaryData"));
        }
        try {
            String strM13400h4 = C3141rv.m13400h4(str);
            if (!C14113y2.m67411k4(strM13400h4) && !C3142to.m13421kk(strM13400h4)) {
                C3142to.m13416k4(strM13400h4);
            }
            C3130fa c3130fa = new C3130fa(str, 4, 2);
            try {
                c3130fa.write(bArr, 0, bArr.length);
            } finally {
                c3130fa.dispose();
            }
        } catch (RuntimeException e) {
            throw new yii(C14113y2.m67402k4("Error in writing a binary data to a file stream. Exception details: {0}", e.getMessage()), e);
        }
    }
}
