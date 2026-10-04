package com.aspose.slides.internal.p530yo;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12762bv;
import com.aspose.slides.internal.p517y2.InterfaceC12765du;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12775m9;
import com.aspose.slides.internal.p517y2.InterfaceC12776ne;
import com.aspose.slides.internal.p517y2.InterfaceC12779to;
import com.aspose.slides.internal.p517y2.InterfaceC12780u4;
import com.aspose.slides.internal.p517y2.InterfaceC12781um;
import com.aspose.slides.internal.p517y2.InterfaceC12783uz;
import com.aspose.slides.internal.p517y2.InterfaceC12784v4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yo.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12884x1 extends AbstractC12883k4 {
    public C12884x1(C5546kk c5546kk) {
        super(c5546kk);
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59935k4(InterfaceC12762bv interfaceC12762bv) {
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: x1 */
    public void mo59946x1(InterfaceC12769ix interfaceC12769ix) {
        if (((C5543ix) interfaceC12769ix).m22719to().m22848k4()) {
            return;
        }
        m59934k4().mo13302k4('<');
        m59934k4().mo13302k4(IOUtils.DIR_SEPARATOR_UNIX);
        m59934k4().mo13304k4(interfaceC12769ix.mo22604c5());
        m59934k4().mo13302k4('>');
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59936k4(InterfaceC12765du interfaceC12765du) {
        m59934k4().mo13304k4("<![CDATA[");
        m59934k4().mo13304k4(interfaceC12765du.mo22687k4());
        m59934k4().mo13304k4("]]>");
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59937k4(InterfaceC12769ix interfaceC12769ix) {
        m59934k4().mo13302k4('<');
        m59934k4().mo13304k4(interfaceC12769ix.mo22604c5());
        m59947k4(interfaceC12769ix.mo22620A_());
        m59934k4().mo13302k4('>');
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59938k4(InterfaceC12775m9 interfaceC12775m9) {
        m59934k4().mo13304k4("<!--");
        m59934k4().mo13304k4(interfaceC12775m9.mo22687k4());
        m59934k4().mo13304k4("-->");
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59939k4(InterfaceC12776ne interfaceC12776ne) {
        AbstractC3124b3 abstractC3124b3M59934k4;
        String strM67408k4;
        m59934k4().mo13304k4("<!DOCTYPE");
        m59934k4().mo13302k4(ControlChar.SPACE_CHAR);
        m59934k4().mo13304k4("html");
        if (!C14113y2.m67411k4(interfaceC12776ne.mo22769to())) {
            m59934k4().mo13302k4(ControlChar.SPACE_CHAR);
            m59934k4().mo13304k4("PUBLIC");
            m59934k4().mo13302k4(ControlChar.SPACE_CHAR);
            m59934k4().mo13304k4(C14113y2.m67408k4("\"", interfaceC12776ne.mo22769to(), "\""));
            if (!C14113y2.m67411k4(interfaceC12776ne.mo22765du())) {
                m59934k4().mo13302k4(ControlChar.SPACE_CHAR);
                abstractC3124b3M59934k4 = m59934k4();
                strM67408k4 = C14113y2.m67408k4("\"", interfaceC12776ne.mo22765du(), "\"");
                abstractC3124b3M59934k4.mo13304k4(strM67408k4);
            }
        } else if (!C14113y2.m67411k4(interfaceC12776ne.mo22765du())) {
            m59934k4().mo13302k4(ControlChar.SPACE_CHAR);
            m59934k4().mo13304k4("SYSTEM");
            m59934k4().mo13302k4(ControlChar.SPACE_CHAR);
            abstractC3124b3M59934k4 = m59934k4();
            strM67408k4 = C14113y2.m67408k4("\"", interfaceC12776ne.mo22765du(), "\"");
            abstractC3124b3M59934k4.mo13304k4(strM67408k4);
        }
        m59934k4().mo13304k4(">");
    }

    /* JADX INFO: renamed from: k4 */
    private void m59947k4(InterfaceC12779to interfaceC12779to) {
        IEnumerator it = interfaceC12779to.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC12772kk interfaceC12772kk = (InterfaceC12772kk) it.next();
                m59934k4().mo13302k4(ControlChar.SPACE_CHAR);
                m59934k4().mo13304k4(interfaceC12772kk.mo22738k4());
                if (!C14113y2.m67411k4(interfaceC12772kk.mo22741kk())) {
                    m59934k4().mo13302k4('=');
                    m59934k4().mo13304k4(C14113y2.m67408k4("\"", interfaceC12772kk.mo22741kk(), "\""));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59940k4(InterfaceC12780u4 interfaceC12780u4) {
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59941k4(InterfaceC12781um interfaceC12781um) {
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59942k4(InterfaceC12783uz interfaceC12783uz) {
    }

    @Override // com.aspose.slides.internal.p530yo.AbstractC12883k4
    /* JADX INFO: renamed from: k4 */
    public void mo59943k4(InterfaceC12784v4 interfaceC12784v4) {
        m59934k4().mo13304k4(interfaceC12784v4.mo22687k4());
    }
}
