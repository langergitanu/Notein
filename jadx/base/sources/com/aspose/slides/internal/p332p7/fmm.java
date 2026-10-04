package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class fmm extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private double f22871c5;

    /* JADX INFO: renamed from: du */
    private String f22873du;

    /* JADX INFO: renamed from: dy */
    private int f22874dy;

    /* JADX INFO: renamed from: h4 */
    private long f22876h4;

    /* JADX INFO: renamed from: jd */
    private String f22877jd;

    /* JADX INFO: renamed from: kk */
    private String f22878kk;

    /* JADX INFO: renamed from: ks */
    private List<ok7> f22879ks;

    /* JADX INFO: renamed from: m9 */
    private long f22880m9;

    /* JADX INFO: renamed from: to */
    private boolean f22881to;

    /* JADX INFO: renamed from: up */
    private byte f22882up;

    /* JADX INFO: renamed from: yj */
    private String f22883yj;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f22868k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f22870x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f22869rv = new C7017h4("table:cell-address", "table:matrix-covered", "table:formula", "table:number-matrix-columns-spanned", "table:number-matrix-rows-spanned", "office:value-type", "office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value", ContextChain.TAG_PRODUCT);

    /* JADX INFO: renamed from: ck */
    private C14084qq f22872ck = new C14084qq();

    /* JADX INFO: renamed from: fa */
    private C14077m4 f22875fa = new C14077m4();

    public fmm() {
        m31869x1();
    }

    public fmm(final AbstractC13912i5 abstractC13912i5) {
        m31869x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fmm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (fmm.f22869rv.m27428k4(str)) {
                    case 0:
                        fmm.this.f22878kk = str2;
                        break;
                    case 1:
                        fmm.this.f22881to = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        fmm.this.f22873du = str2;
                        break;
                    case 3:
                        fmm.this.f22876h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 4:
                        fmm.this.f22880m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 5:
                        fmm.this.f22874dy = b3e.m28701k4(str2);
                        break;
                    case 6:
                        fmm.this.f22871c5 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 7:
                        fmm.this.f22877jd = str2;
                        break;
                    case 8:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(fmm.this.f22872ck);
                        break;
                    case 9:
                        AbstractC7361bz.m29294ks(str2).CloneTo(fmm.this.f22875fa);
                        break;
                    case 10:
                        fmm.this.f22882up = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 11:
                        fmm.this.f22883yj = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fmm.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (fmm.f22869rv.m27428k4(abstractC13912i5.mo65023fa()) != 12) {
                    return false;
                }
                fmm.this.f22879ks.addItem(new ok7(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m31869x1() {
        this.f22881to = false;
        this.f22876h4 = 4294967295L;
        this.f22880m9 = 4294967295L;
        this.f22874dy = 0;
        this.f22871c5 = Double.NaN;
        f22868k4.CloneTo(this.f22872ck);
        f22870x1.CloneTo(this.f22875fa);
        this.f22882up = (byte) -1;
        this.f22879ks = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22878kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:cell-address", str3);
        }
        boolean z = this.f22881to;
        String str4 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("table:matrix-covered", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f22873du;
        if (str5 != null) {
            c3059ii.m12955x1("table:formula", str5);
        }
        long j = this.f22876h4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("table:number-matrix-columns-spanned", C13850af.m65147x1(j));
        }
        long j2 = this.f22880m9;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("table:number-matrix-rows-spanned", C13850af.m65147x1(j2));
        }
        int i = this.f22874dy;
        if (i != 0) {
            c3059ii.m12955x1("office:value-type", b3e.m28702k4(i));
        }
        if (!C14044b3.m66437kk(this.f22871c5)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f22871c5));
        }
        String str6 = this.f22877jd;
        if (str6 != null) {
            c3059ii.m12955x1("office:currency", str6);
        }
        if (C14084qq.m67078dy(this.f22872ck, f22868k4)) {
            C20986OooO0o0.OooO0O0(this.f22872ck, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f22875fa, f22870x1)) {
            C22240OooOO0o.OooO00o(this.f22875fa, c3059ii, "office:time-value");
        }
        byte b = this.f22882up;
        if (b != -1) {
            if (b == 1) {
                str4 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("office:boolean-value", str4);
        }
        String str7 = this.f22883yj;
        if (str7 != null) {
            c3059ii.m12955x1("office:string-value", str7);
        }
        List.Enumerator<ok7> it = this.f22879ks.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, ContextChain.TAG_PRODUCT);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
