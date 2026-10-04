package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.C7017h4;
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
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.huawei.hms.network.base.util.HttpUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class uih {

    /* JADX INFO: renamed from: c5 */
    private static final C13129ny f49325c5 = null;

    /* JADX INFO: renamed from: du */
    private static final C13129ny f49326du = null;

    /* JADX INFO: renamed from: dy */
    private static final C13129ny f49327dy = null;

    /* JADX INFO: renamed from: h4 */
    private static final C13129ny f49328h4 = null;

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f49329jd;

    /* JADX INFO: renamed from: k4 */
    static final byte[] f49330k4;

    /* JADX INFO: renamed from: kk */
    private static final C13129ny f49331kk;

    /* JADX INFO: renamed from: m9 */
    private static final C13129ny f49332m9 = null;

    /* JADX INFO: renamed from: to */
    private static final C13129ny f49333to;

    /* JADX INFO: renamed from: x1 */
    SortedList<String, mqz> f49334x1;

    static {
        SortedList sortedList = new SortedList();
        AbstractC3150x6 abstractC3150x6M21997k4 = C5133k4.m21997k4("schemas.zip");
        try {
            C12275wy c12275wyM57431k4 = C12275wy.m57431k4(abstractC3150x6M21997k4);
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
                                    } else {
                                        i += i2;
                                    }
                                }
                                sortedList.addItem(C14113y2.m67448x1(next.m57356to(), "http") ? C14113y2.m67408k4(HttpUtils.HTTP_PREFIX, C14113y2.m67422kk(next.m57356to(), 5)) : C14113y2.m67408k4("http://zip/", next.m57356to()), bArr);
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
                AbstractC13319z7 abstractC13319z7 = new AbstractC13319z7() { // from class: com.aspose.slides.uih.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Xlsx.WorkbookML.XlsxFile.schemaEventHandler(System.Object,System.Xml.Schema.ValidationEventArgs)";
                    }

                    @Override // com.aspose.slides.internal.p532yu.AbstractC13319z7
                    /* JADX INFO: renamed from: k4 */
                    public void mo12838k4(Object obj, C13020hq c13020hq) {
                        uih.m71702x1(obj, c13020hq);
                    }
                };
                dx5 dx5Var = new dx5(sortedList);
                f49331kk = m71700k4("opc-contentTypes.xsd", sortedList, dx5Var, abstractC13319z7);
                f49333to = m71700k4("opc-relationships.xsd", sortedList, dx5Var, abstractC13319z7);
                c12275wyM57431k4 = C12275wy.m57431k4(C5133k4.m21997k4("templates.zip"));
                try {
                    f49330k4 = mqz.m64939k4(c12275wyM57431k4, c12275wyM57431k4.m57505x1("emptySheet.xml"));
                    c12275wyM57431k4.dispose();
                    f49329jd = new C7017h4("application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.table+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml");
                } finally {
                }
            } finally {
            }
        } finally {
            if (abstractC3150x6M21997k4 != null) {
                abstractC3150x6M21997k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C13129ny m71700k4(String str, SortedList<String, byte[]> sortedList, AbstractC13943n5 abstractC13943n5, AbstractC13319z7 abstractC13319z7) {
        C13129ny c13129ny = new C13129ny();
        c13129ny.m61327k4(abstractC13943n5);
        try {
            if (C14113y2.m67429to(str, ':') < 0) {
                str = C14113y2.m67408k4("http://zip/", str);
            }
            C13938ms c13938ms = new C13938ms(str, new C3152yj(sortedList.get_Item(str), false));
            try {
                c13938ms.m65616kk(true);
                c13129ny.m61320k4(C13282xc.m61691k4(c13938ms, abstractC13319z7));
                c13938ms.dispose();
                c13129ny.m61312ck();
                return c13129ny;
            } catch (Throwable th) {
                c13938ms.dispose();
                throw th;
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static void m71702x1(Object obj, C13020hq c13020hq) {
    }
}
