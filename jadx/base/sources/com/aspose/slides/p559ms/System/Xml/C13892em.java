package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.em */
/* JADX INFO: loaded from: classes5.dex */
public class C13892em {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13912i5 f46483k4;

    /* JADX INFO: renamed from: kk */
    private int f46484kk;

    /* JADX INFO: renamed from: to */
    private boolean f46485to;

    /* JADX INFO: renamed from: x1 */
    private int f46486x1;

    /* JADX INFO: renamed from: k4 */
    public final void m65321k4() {
        if (this.f46486x1 != 0) {
            while (m65320k4(true)) {
            }
            if (this.f46486x1 == 2) {
                if (this.f46483k4.mo65028jd() != 15) {
                    throw new XmlException("'{0}' is an invalid XmlNodeType.", C14042ak.m66410k4(C13929li.class, this.f46483k4.mo65028jd()), (InterfaceC13896f9) C7019kk.m27452k4((Object) this.f46483k4, InterfaceC13896f9.class));
                }
                this.f46483k4.mo65026h4();
            }
        }
        m65322x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65322x1() {
        this.f46486x1 = 0;
        this.f46485to = false;
        this.f46484kk = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m65320k4(boolean z) {
        while (true) {
            int iMo65028jd = this.f46483k4.mo65028jd();
            if (iMo65028jd == 2) {
                return !z;
            }
            if (iMo65028jd == 3 || iMo65028jd == 4) {
                if (!z) {
                    return true;
                }
            } else if (iMo65028jd != 5) {
                if (iMo65028jd != 7 && iMo65028jd != 8) {
                    if (iMo65028jd != 13 && iMo65028jd != 14) {
                        if (iMo65028jd != 16) {
                            return false;
                        }
                    }
                }
            } else {
                if (!this.f46483k4.mo65027ix()) {
                    return false;
                }
                this.f46483k4.mo65016b3();
            }
            if (!this.f46483k4.mo65026h4()) {
                return false;
            }
            z = false;
        }
    }
}
