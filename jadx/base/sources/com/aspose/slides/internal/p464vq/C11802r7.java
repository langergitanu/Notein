package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.internal.p077d8.C3044dc;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p482wr.C12249c5;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.internal.p532yu.AbstractC13319z7;
import com.aspose.slides.internal.p532yu.C13020hq;
import com.aspose.slides.internal.p532yu.C13129ny;
import com.aspose.slides.internal.p532yu.C13282xc;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.huawei.hms.network.base.util.HttpUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.r7 */
/* JADX INFO: loaded from: classes4.dex */
public class C11802r7 {

    /* JADX INFO: renamed from: k4 */
    private static final k4 f39839k4 = m55383k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.vq.r7$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public SortedDictionary<String, byte[]> f39840k4;

        /* JADX INFO: renamed from: x1 */
        public C11740f7 f39841x1;

        private k4() {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static k4 m55383k4() {
        SortedDictionary<String, byte[]> sortedDictionary;
        String strM67408k4;
        k4 k4Var = new k4();
        k4Var.f39840k4 = new SortedDictionary<>();
        AbstractC3150x6 abstractC3150x6M21998k4 = C5133k4.m21998k4("resources", "schemas.zip");
        try {
            C12275wy c12275wyM57431k4 = C12275wy.m57431k4(abstractC3150x6M21998k4);
            try {
                IGenericEnumerator<C12262lr> it = c12275wyM57431k4.iterator();
                while (it.hasNext()) {
                    try {
                        C12262lr next = it.next();
                        if (!next.m57329ck()) {
                            C12249c5 c12249c5M57327bv = next.m57327bv();
                            try {
                                int iM57328c5 = (int) next.m57328c5();
                                byte[] bArr = new byte[iM57328c5];
                                int i = 0;
                                while (i < iM57328c5) {
                                    int i2 = c12249c5M57327bv.read(bArr, i, iM57328c5 - i);
                                    if (i2 == 0) {
                                        break;
                                    }
                                    i += i2;
                                }
                                if (C14113y2.m67448x1(next.m57356to(), "http")) {
                                    sortedDictionary = k4Var.f39840k4;
                                    strM67408k4 = C14113y2.m67408k4(HttpUtils.HTTP_PREFIX, C14113y2.m67422kk(next.m57356to(), 5));
                                } else {
                                    sortedDictionary = k4Var.f39840k4;
                                    strM67408k4 = C14113y2.m67408k4("http://zip/", next.m57356to());
                                }
                                sortedDictionary.addItem(strM67408k4, bArr);
                                if (c12249c5M57327bv != null) {
                                    c12249c5M57327bv.dispose();
                                }
                            } finally {
                            }
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
                c12275wyM57431k4.dispose();
                k4Var.f39841x1 = new C11740f7(k4Var.f39840k4);
                return k4Var;
            } catch (Throwable th2) {
                if (c12275wyM57431k4 != null) {
                    c12275wyM57431k4.dispose();
                }
                throw th2;
            }
        } finally {
            if (abstractC3150x6M21998k4 != null) {
                abstractC3150x6M21998k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static C13129ny m55385x1(String[] strArr) {
        C13129ny c13129ny = new C13129ny();
        c13129ny.m61327k4(f39839k4.f39841x1);
        try {
            for (String strM67408k4 : strArr) {
                if (C14113y2.m67429to(strM67408k4, ':') < 0) {
                    strM67408k4 = C14113y2.m67408k4("http://zip/", strM67408k4);
                }
                C3152yj c3152yj = new C3152yj(f39839k4.f39840k4.get_Item(strM67408k4), false);
                try {
                    try {
                        C13282xc c13282xcM61691k4 = C13282xc.m61691k4(new C13938ms(strM67408k4, c3152yj), new AbstractC13319z7() { // from class: com.aspose.slides.internal.vq.r7.1
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return "Aspose.Slides.Util.XmlUtil.SchemaEventHandler(System.Object,System.Xml.Schema.ValidationEventArgs)";
                            }

                            @Override // com.aspose.slides.internal.p532yu.AbstractC13319z7
                            /* JADX INFO: renamed from: k4 */
                            public void mo12838k4(Object obj, C13020hq c13020hq) {
                                C3044dc.m12836k4(obj, c13020hq);
                            }
                        });
                        c3152yj.dispose();
                        c13129ny.m61320k4(c13282xcM61691k4);
                    } finally {
                    }
                } catch (Throwable th) {
                    c3152yj.dispose();
                    throw th;
                }
            }
            c13129ny.m61312ck();
            return c13129ny;
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C13129ny m55384k4(String[] strArr) {
        String str;
        if (strArr == null) {
            return null;
        }
        if ((strArr.length != 1 || (str = strArr[0]) == null || str.length() <= 0) && strArr.length <= 1) {
            return null;
        }
        return m55385x1(strArr);
    }
}
