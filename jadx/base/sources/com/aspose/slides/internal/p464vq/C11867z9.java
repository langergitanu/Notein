package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.z9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11867z9 extends AbstractC11819tq {

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f39965ix = new C7017h4("application/vnd.openxmlformats-officedocument.extended-properties+xml", "application/vnd.openxmlformats-package.core-properties+xml", "application/vnd.openxmlformats-officedocument.custom-properties+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.calcChain+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.chartsheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.connections+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.dialogsheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.externalLink+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheetMetadata+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.volatileDependencies+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", "application/vnd.ms-excel.sheet.macroEnabled.main+xml", "application/vnd.ms-excel.template.macroEnabled.main+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml");

    /* JADX INFO: renamed from: c5 */
    private List<C11791os> f39966c5;

    /* JADX INFO: renamed from: ck */
    private C11791os f39967ck;

    /* JADX INFO: renamed from: du */
    private C11791os f39968du;

    /* JADX INFO: renamed from: dy */
    private C11791os f39969dy;

    /* JADX INFO: renamed from: fa */
    private C11791os f39970fa;

    /* JADX INFO: renamed from: h4 */
    private C11791os f39971h4;

    /* JADX INFO: renamed from: jd */
    private List<C11791os> f39972jd;

    /* JADX INFO: renamed from: kk */
    private C11791os f39973kk;

    /* JADX INFO: renamed from: ks */
    private C11791os f39974ks;

    /* JADX INFO: renamed from: m9 */
    private List<C11791os> f39975m9;

    /* JADX INFO: renamed from: ne */
    private C11791os f39976ne;

    /* JADX INFO: renamed from: rv */
    private C11791os f39977rv;

    /* JADX INFO: renamed from: to */
    private C11791os f39978to;

    /* JADX INFO: renamed from: up */
    private C11791os f39979up;

    /* JADX INFO: renamed from: x6 */
    private List<C11791os> f39980x6;

    /* JADX INFO: renamed from: yj */
    private C11791os f39981yj;

    public C11867z9() {
        m55389ck();
    }

    /* JADX INFO: renamed from: ix */
    public final C11791os m55445ix() {
        return this.f39976ne;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11819tq
    /* JADX INFO: renamed from: k4 */
    public void mo55278k4(IGenericList<C11791os> iGenericList) {
        if (this.f39975m9 == null) {
            this.f39975m9 = new List<>();
        }
        if (this.f39966c5 == null) {
            this.f39966c5 = new List<>();
        }
        if (this.f39972jd == null) {
            this.f39972jd = new List<>();
        }
        if (this.f39980x6 == null) {
            this.f39980x6 = new List<>();
        }
        IGenericEnumerator<C11791os> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                mo55279k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        String strM55292k4 = m55390dy().m55309k4(AbstractC11817tl.f39865k4)[0].m55292k4();
        C11791os[] c11791osArr = {this.f39976ne};
        boolean zTryGetValue = ((AbstractC11819tq) this).f39873x1.tryGetValue(strM55292k4, c11791osArr);
        this.f39976ne = c11791osArr[0];
        if (!zTryGetValue) {
            throw new C11726dl(C14113y2.m67402k4("Error reading pptx presentation: can't find \"{0}\" entry in \"parts\" list.", strM55292k4));
        }
    }

    /* JADX INFO: renamed from: ks */
    public final C11791os m55446ks() {
        return this.f39973kk;
    }

    /* JADX INFO: renamed from: ne */
    public final C11791os m55447ne() {
        return this.f39974ks;
    }

    /* JADX INFO: renamed from: rv */
    public final C11791os m55448rv() {
        return this.f39971h4;
    }

    /* JADX INFO: renamed from: u4 */
    public final C11791os[] m55449u4() {
        return this.f39980x6.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: up */
    public final C11791os m55450up() {
        return this.f39968du;
    }

    /* JADX INFO: renamed from: x6 */
    public final C11791os m55451x6() {
        return this.f39970fa;
    }

    /* JADX INFO: renamed from: yj */
    public final C11791os m55452yj() {
        return this.f39978to;
    }

    public C11867z9(AbstractC3150x6 abstractC3150x6, AbstractC3174jd abstractC3174jd) {
        m55407x1(abstractC3150x6, false, abstractC3174jd);
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11819tq
    /* JADX INFO: renamed from: k4 */
    public void mo55279k4(C11791os c11791os) {
        if (this.f39975m9 == null) {
            this.f39975m9 = new List<>();
        }
        if (this.f39966c5 == null) {
            this.f39966c5 = new List<>();
        }
        if (this.f39972jd == null) {
            this.f39972jd = new List<>();
        }
        if (this.f39980x6 == null) {
            this.f39980x6 = new List<>();
        }
        if (!(c11791os.m55372fa() instanceof AbstractC11714bv)) {
            if (c11791os.m55372fa() == null) {
                c11791os.m55378x1(new C11731dx());
                return;
            }
            return;
        }
        switch (f39965ix.m27428k4(c11791os.m55372fa().mo55273k4())) {
            case 0:
                this.f39973kk = c11791os;
                break;
            case 1:
                this.f39978to = c11791os;
                break;
            case 2:
                this.f39968du = c11791os;
                break;
            case 3:
                this.f39971h4 = c11791os;
                break;
            case 4:
                this.f39975m9.addItem(c11791os);
                break;
            case 5:
                this.f39969dy = c11791os;
                break;
            case 6:
                this.f39966c5.addItem(c11791os);
                break;
            case 7:
                this.f39972jd.addItem(c11791os);
                break;
            case 8:
                this.f39967ck = c11791os;
                break;
            case 9:
                this.f39970fa = c11791os;
                break;
            case 10:
                this.f39979up = c11791os;
                break;
            case 11:
                this.f39981yj = c11791os;
                break;
            case 12:
                this.f39974ks = c11791os;
                break;
            case 13:
                this.f39977rv = c11791os;
                break;
            case 14:
                this.f39980x6.addItem(c11791os);
                break;
            case 15:
            case 16:
            case 17:
            case 18:
                this.f39976ne = c11791os;
                break;
        }
    }
}
