package com.aspose.slides.internal.p508xq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12571u4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12598k4 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f42145k4 = new C7017h4("application/vnd.openxmlformats-package.relationships+xml", "image/bmp", "image/x-emf", "image/gif", "image/jpeg", "image/x-pcz", "image/png", "image/x-wmf", "application/vnd.openxmlformats-officedocument.obfuscatedFont");

    /* JADX INFO: renamed from: k4 */
    public static void m58807k4(AbstractC12594du abstractC12594du, boolean z) {
        C12571u4<KeyValuePair> c12571u4 = new C12571u4();
        C12571u4<KeyValuePair> c12571u42 = new C12571u4();
        IGenericEnumerator<C12596h4> it = abstractC12594du.m58793x1().iterator();
        while (it.hasNext()) {
            try {
                C12596h4 next = it.next();
                switch (f42145k4.m27428k4(next.m58802kk())) {
                    case 0:
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        c12571u4.set_Item(next.m58804x1(), next.m58802kk());
                        break;
                    default:
                        c12571u42.addItem(next.m58800k4(), next.m58802kk());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C12596h4 c12596h4 = new C12596h4("/[Content_Types].xml", C14113y2.f47374k4);
        abstractC12594du.m58793x1().m58814k4(c12596h4);
        C3175k4 c3175k4 = new C3175k4(c12596h4.m58803to(), z);
        c3175k4.m13584k4("Types");
        c3175k4.m13590kk("xmlns", "http://schemas.openxmlformats.org/package/2006/content-types");
        for (KeyValuePair keyValuePair : c12571u4) {
            m58808k4((String) keyValuePair.getKey(), (String) keyValuePair.getValue(), c3175k4);
        }
        m58808k4("rels", "application/vnd.openxmlformats-package.relationships+xml", c3175k4);
        m58808k4("xml", "application/xml", c3175k4);
        for (KeyValuePair keyValuePair2 : c12571u42) {
            m58809x1((String) keyValuePair2.getKey(), (String) keyValuePair2.getValue(), c3175k4);
        }
        c3175k4.m13592x1();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m58809x1(String str, String str2, C3175k4 c3175k4) {
        c3175k4.m13593x1("Override");
        c3175k4.m13590kk("PartName", str);
        c3175k4.m13590kk("ContentType", str2);
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58808k4(String str, String str2, C3175k4 c3175k4) {
        c3175k4.m13593x1("Default");
        c3175k4.m13590kk("Extension", str);
        c3175k4.m13590kk("ContentType", str2);
        c3175k4.m13588kk();
    }
}
