package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.AbstractC13319z7;
import com.aspose.slides.internal.p532yu.C13020hq;
import com.aspose.slides.internal.p532yu.C13129ny;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13906gx;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.aspose.slides.p559ms.System.Xml.C14015xb;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.dc */
/* JADX INFO: loaded from: classes3.dex */
public class C3044dc {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC13319z7 f8949k4 = new AbstractC13319z7() { // from class: com.aspose.slides.internal.d8.dc.1
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.Util.XmlUtil.SchemaEventHandler(System.Object,System.Xml.Schema.ValidationEventArgs)";
        }

        @Override // com.aspose.slides.internal.p532yu.AbstractC13319z7
        /* JADX INFO: renamed from: k4 */
        public void mo12838k4(Object obj, C13020hq c13020hq) {
            C3044dc.m12836k4(obj, c13020hq);
        }
    };

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m12833k4(AbstractC3151yd abstractC3151yd, C13129ny c13129ny, SortedList<String, String> sortedList, String str, boolean z) {
        return m12834k4(abstractC3151yd, c13129ny, sortedList, str, z, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m12834k4(AbstractC3151yd abstractC3151yd, C13129ny c13129ny, SortedList<String, String> sortedList, String str, boolean z, boolean z2) {
        C13963qw c13963qw = new C13963qw();
        C13950o3 c3117zm = z ? new C3117zm(c13963qw, str) : new C13950o3(c13963qw);
        if (sortedList != null) {
            IGenericEnumerator<KeyValuePair<String, String>> it = sortedList.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<String, String> next = it.next();
                    c3117zm.mo65707k4(next.getKey(), next.getValue());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        C14015xb c14015xb = new C14015xb(null, c3117zm, null, 0);
        C13906gx c13906gx = new C13906gx();
        if (c13129ny != null) {
            c13906gx.m65371du(4);
            c13906gx.m65398ne().m61326k4(c13129ny);
            c13906gx.f46543x1.mo27432x1(f8949k4);
        }
        c13906gx.m65409x1(z2);
        return AbstractC13912i5.m65467k4(abstractC3151yd, c13906gx, c14015xb);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m12835k4(String str) {
        C6765kp c6765kp = new C6765kp(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (m12837k4(cCharAt)) {
                c6765kp.m26780k4(cCharAt);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12836k4(Object obj, C13020hq c13020hq) {
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m12837k4(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        if (c >= ' ' && c <= 55295) {
            return true;
        }
        if (c < 57344 || c > 65533) {
            return c >= 0 && c <= 65535;
        }
        return true;
    }
}
