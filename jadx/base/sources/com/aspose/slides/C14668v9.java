package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8609qm;
import com.aspose.slides.internal.p332p7.bf6;
import com.aspose.slides.internal.p332p7.rue;
import com.aspose.slides.internal.p464vq.AbstractC11737em;
import com.aspose.slides.internal.p464vq.AbstractC11758j2;
import com.aspose.slides.internal.p464vq.AbstractC11840w6;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.v9 */
/* JADX INFO: loaded from: classes3.dex */
class C14668v9 extends AbstractC11737em {
    public C14668v9(C11791os c11791os, AbstractC11758j2 abstractC11758j2) {
        super(c11791os, abstractC11758j2);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m72094k4(int i) {
        switch (i) {
            case 0:
                return "On-screen Show (4:3)";
            case 1:
                return "Letter Paper (8.5x11 in)";
            case 2:
                return "A4 Paper (210x297 mm)";
            case 3:
                return "35mm Slides";
            case 4:
                return "Overhead";
            case 5:
                return "Banner";
            case 6:
            default:
                return "Custom";
            case 7:
                return "Ledger Paper (11x17 in)";
            case 8:
                return "A3 Paper (297x420 mm)";
            case 9:
                return "B4 (ISO) Paper (250x353 mm)";
            case 10:
                return "B5 (ISO) Paper (176x250 mm)";
            case 11:
                return "B4 (JIS) Paper (257x364 mm)";
            case 12:
                return "B5 (JIS) Paper (182x257 mm)";
            case 13:
                return "HagakiCard (4x6 in)";
            case 14:
                return "On-screen Show (16:9)";
            case 15:
                return "On-screen Show (16:10)";
            case 16:
                return "Widescreen";
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72099x1(IDocumentProperties iDocumentProperties, IPresentation iPresentation) {
        mo3467du().m55414ck();
        m72098k4(iDocumentProperties, iPresentation);
    }

    public C14668v9(C11791os c11791os, AbstractC11840w6 abstractC11840w6) {
        super(c11791os, abstractC11840w6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72097k4(IDocumentProperties iDocumentProperties) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties".equals(m55443jd().mo65050up()) && "Properties".equals(m55443jd().mo65023fa())) {
                C8609qm c8609qm = new C8609qm(m55443jd());
                DocumentProperties documentProperties = (DocumentProperties) iDocumentProperties;
                documentProperties.setNameOfApplication(c8609qm.m39541fa());
                documentProperties.setCompany(c8609qm.m39537du());
                documentProperties.setManager(c8609qm.m39556to());
                documentProperties.setPresentationFormat(c8609qm.m39542h4());
                documentProperties.setSharedDoc(c8609qm.m39544jd() == 1);
                documentProperties.setApplicationTemplate(c8609qm.m39550kk());
                documentProperties.m1335k4(C14077m4.m66804kk(c8609qm.m39554m9() & 4294967295L).Clone());
                documentProperties.setHyperlinkBase(c8609qm.m39536ck());
                documentProperties.m1337k4(c8609qm.m39560up());
                documentProperties.m1341k4(c8609qm.m39540dy() == 1);
                documentProperties.m1350x1(c8609qm.m39535c5() == 1);
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72098k4(IDocumentProperties iDocumentProperties, IPresentation iPresentation) {
        mo55332up();
        C8609qm c8609qm = new C8609qm();
        DocumentProperties documentProperties = (DocumentProperties) iDocumentProperties;
        c8609qm.m39543h4(C14113y2.m67440x1(BuildVersionInfo.Product));
        String[] strArrM67414k4 = C14113y2.m67414k4("24.6", FilenameUtils.EXTENSION_SEPARATOR);
        c8609qm.m39555m9(C14113y2.m67402k4("{0:00}.{1:00}{2:00}", 24, 6, Integer.valueOf(strArrM67414k4.length > 2 ? C14057f9.m66582k4(strArrM67414k4[2]) : 0)));
        c8609qm.m39553kk(documentProperties.getCompany());
        c8609qm.m39564x1(iDocumentProperties.getManager());
        c8609qm.m39559to(documentProperties.getPresentationFormat());
        c8609qm.m39551kk(documentProperties.getSharedDoc() ? (byte) 1 : (byte) 0);
        c8609qm.m39549k4(documentProperties.getApplicationTemplate());
        c8609qm.m39548k4(C7019kk.m27435du(Double.valueOf(documentProperties.m1334k4().m66814dy()), 14));
        c8609qm.m39539du(documentProperties.getHyperlinkBase());
        c8609qm.m39546k4(documentProperties.m1332du() ? (byte) 1 : (byte) 0);
        c8609qm.m39562x1(documentProperties.m1333h4() ? (byte) 1 : (byte) 0);
        c8609qm.m39557to((byte) 0);
        if (iPresentation != null) {
            if (iPresentation.getSlideSize().getType() != 6) {
                c8609qm.m39559to(m72094k4(iPresentation.getSlideSize().getType()));
            }
            oca ocaVar = new oca(iPresentation);
            c8609qm.m39563x1(ocaVar.m68452x1());
            c8609qm.m39552kk(ocaVar.m68449kk());
            c8609qm.m39558to(ocaVar.m68448k4());
            c8609qm.m39547k4(ocaVar.m68451to());
            c8609qm.m39538du(ocaVar.m68446du());
            bf6 bf6VarM35703k4 = c8609qm.m39545k4().m35703k4();
            bf6VarM35703k4.m28876k4(0L);
            bf6VarM35703k4.m28875k4(1);
            m72096k4(bf6VarM35703k4, "Fonts used", ocaVar.m68447h4().size());
            m72096k4(bf6VarM35703k4, "Theme", 1);
            m72096k4(bf6VarM35703k4, "Slide Titles", ocaVar.m68450m9().size());
            bf6 bf6VarM33863k4 = c8609qm.m39561x1().m33863k4();
            bf6VarM33863k4.m28875k4(12);
            bf6VarM33863k4.m28876k4(0L);
            List.Enumerator<String> it = ocaVar.m68447h4().iterator();
            while (it.hasNext()) {
                try {
                    m72095k4(bf6VarM33863k4, it.next());
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            m72095k4(bf6VarM33863k4, iPresentation.getMasterTheme().getName());
            List.Enumerator<String> it2 = ocaVar.m68450m9().iterator();
            while (it2.hasNext()) {
                try {
                    m72095k4(bf6VarM33863k4, it2.next());
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        c8609qm.mo6846k4(null, m55442ck(), "Properties");
        mo55333yj();
    }

    /* JADX INFO: renamed from: k4 */
    private void m72095k4(bf6 bf6Var, String str) {
        bf6Var.m28877k4(new C7394ca("lpstr", str));
        bf6Var.m28876k4(bf6Var.m28873k4() + 1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72096k4(bf6 bf6Var, String str, int i) {
        ((rue) bf6Var.m28874k4("variant").m29542x1()).m40566k4("lpstr").m29540k4(str);
        ((rue) bf6Var.m28874k4("variant").m29542x1()).m40566k4("i4").m29540k4(Integer.valueOf(i));
        bf6Var.m28876k4(((bf6Var.m28873k4() & 4294967295L) + 2) & 4294967295L);
    }
}
