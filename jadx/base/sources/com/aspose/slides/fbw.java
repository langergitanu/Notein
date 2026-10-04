package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: loaded from: classes3.dex */
final class fbw {

    /* JADX INFO: renamed from: k4 */
    private final SortedList<String, kfh> f5024k4 = new SortedList<>();

    /* JADX INFO: renamed from: x1 */
    private String f5025x1;

    public fbw(String str, kfh kfhVar) {
        this.f5025x1 = str;
        String str2 = C14113y2.f47374k4;
        m6115k4(str2, str2, kfhVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13981tl m6113k4(String str, String str2, String str3, XmlDocument xmlDocument) {
        if (this.f5024k4.size() > 0) {
            int iIndexOfKey = this.f5024k4.indexOfKey(C14113y2.m67407k4(str3, '#', str2));
            if (iIndexOfKey < 0) {
                iIndexOfKey = this.f5024k4.indexOfKey(str3);
            }
            if (iIndexOfKey < 0) {
                iIndexOfKey = this.f5024k4.indexOfKey(C14113y2.f47374k4);
            }
            if (iIndexOfKey >= 0) {
                return this.f5024k4.getValues().get_Item(iIndexOfKey).mo4589k4(str, str2, str3, xmlDocument);
            }
        }
        return new dnf(str, str2, str3, xmlDocument);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6114k4(String str, kfh kfhVar) {
        m6115k4(this.f5025x1, str, kfhVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6115k4(String str, String str2, kfh kfhVar) {
        if (!C14113y2.m67411k4(str2)) {
            str = C14113y2.m67400k4(str, C14113y2.m67407k4('#', str2));
        }
        this.f5024k4.set_Item(str, kfhVar);
    }
}
