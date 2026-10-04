package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7397cc;
import com.aspose.slides.internal.p332p7.C7628f2;
import com.aspose.slides.internal.p332p7.C8055k4;
import com.aspose.slides.internal.p332p7.C8315n7;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11766k4;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.um */
/* JADX INFO: loaded from: classes3.dex */
class C14641um extends ywb {
    public C14641um(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71733k4(IControl iControl) {
        C7628f2 c7628f2;
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "http://schemas.microsoft.com/office/2006/activeX".equals(m55443jd().mo65050up()) && "ocx".equals(m55443jd().mo65023fa())) {
                C8055k4 c8055k4 = new C8055k4(m55443jd());
                Control control = (Control) iControl;
                C14739wi c14739wiM1246k4 = control.m1246k4();
                control.m1247k4(c8055k4.m35118du());
                control.m1248k4(new C14047bz(c8055k4.m35126x1()));
                if (c8055k4.m35118du() == 0) {
                    for (C8315n7 c8315n7 : c8055k4.m35119h4()) {
                        C7394ca c7394caM37297kk = c8315n7.m37297kk();
                        if (c8315n7.m37299x1() != null || c7394caM37297kk == null) {
                            iControl.getProperties().add(c8315n7.m37296k4(), c8315n7.m37299x1());
                        } else if (C7019kk.m27469x1(c7394caM37297kk.m29542x1(), C7397cc.class)) {
                            C7397cc c7397cc = (C7397cc) c7394caM37297kk.m29542x1();
                            if (c7397cc != null && c7397cc.m29557x1() == 0 && "font".equals(c7394caM37297kk.m29539k4())) {
                                c14739wiM1246k4.m72758k4(new ControlPropertiesCollection());
                                for (C8315n7 c8315n72 : c7397cc.m29556kk()) {
                                    c14739wiM1246k4.m72763to().add(c8315n72.m37296k4(), c8315n72.m37299x1());
                                }
                                if (!C7019kk.m27469x1(c7394caM37297kk.m29542x1(), C7628f2.class)) {
                                }
                            }
                        } else if (!C7019kk.m27469x1(c7394caM37297kk.m29542x1(), C7628f2.class) && (c7628f2 = (C7628f2) c7394caM37297kk.m29542x1()) != null && IDToken.PICTURE.equals(c7394caM37297kk.m29539k4()) && c7628f2.m31545k4() != null) {
                            C11791os c11791osM55296x1 = mo3471m9().m55338u4().m55303k4(c7628f2.m31545k4()).m55296x1();
                            c14739wiM1246k4.m72761k4(c11791osM55296x1.m55426to());
                            c11791osM55296x1.m55422k4(true);
                        }
                    }
                }
                c14739wiM1246k4.m72759k4(c8055k4.m35123kk());
                if (c8055k4.m35125to() != null) {
                    C11791os c11791osM55296x12 = mo3471m9().m55338u4().m55303k4(c8055k4.m35125to()).m55296x1();
                    control.m1251k4(c11791osM55296x12.m55426to());
                    c11791osM55296x12.m55422k4(true);
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71734x1(IControl iControl) {
        mo55332up();
        C8055k4 c8055k4 = new C8055k4();
        m71732k4(iControl, c8055k4);
        if (iControl.getProperties() != null) {
            IGenericEnumerator<String> it = iControl.getProperties().getNamesOfProperties().iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    C8315n7 c8315n7M35120k4 = c8055k4.m35120k4();
                    c8315n7M35120k4.m37300x1(next);
                    c8315n7M35120k4.m37298kk(iControl.getProperties().get_Item(next));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        c8055k4.mo6846k4(null, m55442ck(), "ocx");
        mo55333yj();
    }

    public C14641um(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71732k4(IControl iControl, C8055k4 c8055k4) {
        Control control = (Control) iControl;
        C14739wi c14739wiM1246k4 = control.m1246k4();
        c8055k4.m35121k4(control.getPersistence());
        c8055k4.m35127x1(c14739wiM1246k4.m72756k4());
        if (control.getActiveXControlBinary() != null) {
            C11791os c11791osM55394k4 = mo3468h4().mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/activeX/activeX", C14057f9.m66591x1(mo3468h4().m71522ar()), ".bin"), (AbstractC11760jd.k4) null, new C11766k4());
            c11791osM55394k4.m55423k4(control.getActiveXControlBinary());
            c8055k4.m35124kk(mo3468h4().m55433g8().m55311x1(c11791osM55394k4).m55289du());
        }
        c8055k4.m35122k4(C14113y2.m67407k4("{", iControl.getClassId(), "}"));
        if (c14739wiM1246k4.m72763to() != null) {
            C8315n7 c8315n7M35120k4 = c8055k4.m35120k4();
            c8315n7M35120k4.m37300x1("font");
            C7397cc c7397cc = (C7397cc) c8315n7M35120k4.m37295k4("font").m29542x1();
            c7397cc.m29555k4(0);
            IGenericEnumerator<String> it = c14739wiM1246k4.m72763to().getNamesOfProperties().iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    C8315n7 c8315n7M29554k4 = c7397cc.m29554k4();
                    c8315n7M29554k4.m37300x1(next);
                    c8315n7M29554k4.m37298kk(c14739wiM1246k4.m72763to().get_Item(next));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (c14739wiM1246k4.m72755du() != null) {
            C8315n7 c8315n7M35120k42 = c8055k4.m35120k4();
            c8315n7M35120k42.m37300x1(IDToken.PICTURE);
            C7628f2 c7628f2 = (C7628f2) c8315n7M35120k42.m37295k4(IDToken.PICTURE).m29542x1();
            C11791os c11791osM55394k42 = mo3468h4().mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/activeX/activeX", C14057f9.m66591x1(mo3468h4().m71522ar()), ".bin"), (AbstractC11760jd.k4) null, new C11766k4());
            c11791osM55394k42.m55423k4(c14739wiM1246k4.m72755du());
            c7628f2.m31546k4(mo3468h4().m55433g8().m55311x1(c11791osM55394k42).m55289du());
        }
    }
}
