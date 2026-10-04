package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10959ix;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.inner.api.NetworkService;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6243kk extends C6257wy {
    public C6243kk(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m25300x1() {
        C3152yj c3152yj = new C3152yj();
        try {
            C3175k4 c3175k4 = new C3175k4(c3152yj, new C6783wp(false), false);
            c3175k4.m13584k4("document");
            c3175k4.m13593x1("locales");
            c3175k4.m13593x1(IDToken.LOCALE);
            c3175k4.m13590kk("name", "en_US");
            c3175k4.m13590kk("font", C14113y2.m67408k4(m25385m9().m25402m9().m48228to(), "_AW"));
            m25297k4(c3175k4, "topPane", m25385m9().m25401kk().m25336uz());
            m25297k4(c3175k4, "leftPane", m25385m9().m25401kk().m25337wl());
            m25297k4(c3175k4, "bottomPane", m25385m9().m25401kk().m25329qq());
            m25297k4(c3175k4, "readModePane", m25385m9().m25401kk().m25302ar());
            m25297k4(c3175k4, "dialogs", m25385m9().m25401kk().m25334um());
            c3175k4.m13588kk();
            c3175k4.m13588kk();
            m25296k4(c3175k4);
            m25385m9().m25388c5().m25362k4(c3175k4);
            for (int i = 0; i < m25385m9().m25389du().size(); i++) {
                C6247ne c6247ne = m25385m9().m25389du().get_Item(i);
                c3175k4.m13593x1("page");
                c3175k4.m13590kk("width", C13850af.m65103k4(c6247ne.m25351k4()));
                c3175k4.m13590kk("height", C13850af.m65103k4(c6247ne.m25359x1()));
                Dictionary.Enumerator<Short, C10959ix> it = c6247ne.m25358kk().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        C10959ix c10959ix = (C10959ix) next.getValue();
                        String strM67423kk = (!c10959ix.m52944x1() || c10959ix.m52941kk() == null) ? C14113y2.f47374k4 : C14113y2.m67423kk(c10959ix.m52941kk(), '#');
                        if (!c10959ix.m52944x1() || m25385m9().m25390dy().containsKey(strM67423kk)) {
                            c3175k4.m13593x1("hyperlink");
                            c3175k4.m13590kk("id", C13850af.m65111k4(((Short) next.getKey()).shortValue()));
                            c3175k4.m13590kk("islocal", C13850af.m65112k4(c10959ix.m52944x1()));
                            c3175k4.m13581k4().mo21894du(c10959ix.m52944x1() ? m25385m9().m25390dy().get_Item(strM67423kk).toString() : c10959ix.m52941kk());
                            c3175k4.m13588kk();
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                c3175k4.m13588kk();
            }
            c3175k4.m13592x1();
            byte[] bArrM58632x1 = C12565ks.m58632x1(c3152yj);
            c3152yj.dispose();
            return bArrM58632x1;
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25301k4() {
        short sM25404x1 = m25385m9().m25404x1();
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25293x1(sM25404x1);
        m25384h4().m25291kk(0);
        m25384h4().m25290k4(m25300x1());
        c6260yd.m25414k4(87);
        m25299k4(sM25404x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25296k4(C3175k4 c3175k4) {
        c3175k4.m13593x1(NetworkService.Constants.CONFIG_SERVICE);
        m25298k4(c3175k4, "showFullScreen", C13850af.m65112k4(m25385m9().m25401kk().m25327m9()), true);
        m25298k4(c3175k4, "showPageStepper", C13850af.m65112k4(m25385m9().m25401kk().m25311dy()), true);
        m25298k4(c3175k4, "showSearch", C13850af.m65112k4(m25385m9().m25401kk().m25305c5()), true);
        m25298k4(c3175k4, "showTopPane", C13850af.m65112k4(m25385m9().m25401kk().m25317jd()), true);
        m25298k4(c3175k4, "showBottomPane", C13850af.m65112k4(m25385m9().m25401kk().m25307ck()), true);
        m25298k4(c3175k4, "showLeftPane", C13850af.m65112k4(m25385m9().m25401kk().m25312fa()), true);
        m25298k4(c3175k4, "startOpenLeftPane", C13850af.m65112k4(m25385m9().m25401kk().m25335up()), true);
        m25298k4(c3175k4, "allowReadMode", C13850af.m65112k4(m25385m9().m25401kk().m25342yj()), true);
        m25298k4(c3175k4, "enableContextMenu", C13850af.m65112k4(m25385m9().m25401kk().m25325ks()), true);
        m25298k4(c3175k4, "controlFlags", C13850af.m65103k4(m25385m9().m25401kk().m25330rv()), true);
        m25298k4(c3175k4, "leftPaneTabs", C13850af.m65103k4(m25385m9().m25401kk().m25341x6()), true);
        if (m25385m9().m25401kk().m25328ne() != null) {
            m25298k4(c3175k4, "logoImage", C14080ne.m66952k4(m25385m9().m25401kk().m25328ne()), false);
        }
        if (C12565ks.m58630x1(m25385m9().m25401kk().m25315ix())) {
            m25298k4(c3175k4, "logoLink", m25385m9().m25401kk().m25315ix(), true);
        }
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m25297k4(C3175k4 c3175k4, String str, Dictionary<String, String> dictionary) {
        c3175k4.m13593x1("bundle");
        c3175k4.m13590kk("name", str);
        Dictionary.Enumerator<String, String> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String str2 = (String) next.getKey();
                String str3 = (String) next.getValue();
                if (C12565ks.m58630x1(str3)) {
                    c3175k4.m13593x1("item");
                    c3175k4.m13590kk("id", str2);
                    c3175k4.m13590kk("tip", str3);
                    c3175k4.m13588kk();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m25298k4(C3175k4 c3175k4, String str, String str2, boolean z) {
        c3175k4.m13593x1("param");
        c3175k4.m13590kk("name", str);
        c3175k4.m13590kk("allowOverride", C13850af.m65112k4(z));
        c3175k4.m13581k4().mo21894du(str2);
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private void m25299k4(short s) {
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25291kk(1);
        m25384h4().m25288k4("DocumentDescriptor");
        m25384h4().m25290k4(C6252um.m25366kk());
        c6260yd.m25414k4(82);
        c6260yd.m25413k4();
        m25384h4().m25293x1(1);
        m25384h4().m25293x1(s);
        m25384h4().m25288k4("DocumentDescriptor");
        c6260yd.m25414k4(76);
    }
}
