package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.z9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9352z9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f33796c5 = new C7017h4("uniqueId", "minVer", NoteMeta.PROPERTY_TITLE, "desc", "catLst", "scene3d", "styleLbl", "extLst");

    /* JADX INFO: renamed from: du */
    private C9107wf f33797du;

    /* JADX INFO: renamed from: dy */
    private C8397nz f33798dy;

    /* JADX INFO: renamed from: h4 */
    private C8820sx f33799h4;

    /* JADX INFO: renamed from: k4 */
    private String f33800k4;

    /* JADX INFO: renamed from: kk */
    private List<C8470ot> f33801kk;

    /* JADX INFO: renamed from: m9 */
    private List<C7438ct> f33802m9;

    /* JADX INFO: renamed from: to */
    private List<C7271at> f33803to;

    /* JADX INFO: renamed from: x1 */
    private String f33804x1;

    public C9352z9() {
        m45510h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m45510h4() {
        this.f33800k4 = "";
        this.f33804x1 = "http://schemas.openxmlformats.org/drawingml/2006/diagram";
        this.f33801kk = new List<>();
        this.f33803to = new List<>();
        this.f33802m9 = new List<>();
    }

    /* JADX INFO: renamed from: to */
    public final C7438ct[] m45521to() {
        return this.f33802m9.toArray(new C7438ct[0]);
    }

    public C9352z9(final AbstractC13912i5 abstractC13912i5) {
        m45510h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9352z9.f33796c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9352z9.this.f33800k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9352z9.this.f33804x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.z9.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8470ot;
                List list;
                switch (C9352z9.f33796c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        c8470ot = new C8470ot(abstractC13912i5);
                        list = C9352z9.this.f33801kk;
                        break;
                    case 3:
                        c8470ot = new C7271at(abstractC13912i5);
                        list = C9352z9.this.f33803to;
                        break;
                    case 4:
                        C9352z9.this.f33797du = new C9107wf(abstractC13912i5);
                        return true;
                    case 5:
                        C9352z9.this.f33799h4 = new C8820sx(abstractC13912i5);
                        return true;
                    case 6:
                        c8470ot = new C7438ct(abstractC13912i5);
                        list = C9352z9.this.f33802m9;
                        break;
                    case 7:
                        C9352z9.this.f33798dy = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c8470ot);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C8820sx m45520kk() {
        return this.f33799h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9107wf m45522x1() {
        return this.f33797du;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m45519k4() {
        return this.f33800k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("dgm", str2, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (!"".equals(this.f33800k4)) {
            c3059ii.m12955x1("uniqueId", this.f33800k4);
        }
        if (!"http://schemas.openxmlformats.org/drawingml/2006/diagram".equals(this.f33804x1)) {
            c3059ii.m12955x1("minVer", this.f33804x1);
        }
        List.Enumerator<C8470ot> it = this.f33801kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("dgm", c3059ii, NoteMeta.PROPERTY_TITLE);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<C7438ct> it2 = this.f33803to.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("dgm", c3059ii, "desc");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        C9107wf c9107wf = this.f33797du;
        if (c9107wf != null) {
            c9107wf.mo6846k4("dgm", c3059ii, "catLst");
        }
        C8820sx c8820sx = this.f33799h4;
        if (c8820sx != null) {
            c8820sx.mo6846k4("dgm", c3059ii, "scene3d");
        }
        it2 = this.f33802m9.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("dgm", c3059ii, "styleLbl");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        C8397nz c8397nz = this.f33798dy;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
