package com.aspose.slides.internal.p391s2;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.s2.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10132k4 {

    /* JADX INFO: renamed from: k4 */
    private Hashtable f36328k4 = null;

    /* JADX INFO: renamed from: k4 */
    public final Hashtable m49777k4() {
        if (this.f36328k4 == null) {
            this.f36328k4 = new Hashtable();
        }
        return this.f36328k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m49780x1(String str, String str2) {
        m49777k4().set_Item(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49778k4(Hashtable hashtable) {
        this.f36328k4 = hashtable;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49779k4(String str, String str2) {
        if (str != null && str.length() > 0) {
            C13850af.m65120kk(str);
        }
        if (str2 != null && str2.length() > 0) {
            C13850af.m65125qq(str2);
        }
        m49780x1(str, str2);
    }
}
