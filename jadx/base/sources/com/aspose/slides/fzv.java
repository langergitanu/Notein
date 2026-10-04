package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class fzv extends abb {
    public fzv(C11839vw c11839vw, OdpSerializationContext odpSerializationContext) {
        super(c11839vw, odpSerializationContext);
    }

    /* JADX INFO: renamed from: k4 */
    private com.aspose.slides.internal.p332p7.zh8 m6397k4(com.aspose.slides.internal.p332p7.v1c v1cVar) {
        com.aspose.slides.internal.p332p7.zh8 zh8VarM42654k4 = v1cVar.m42654k4();
        zh8VarM42654k4.m45623x1("ooo:configuration-settings");
        return zh8VarM42654k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6400x1(Presentation presentation) {
        com.aspose.slides.internal.p332p7.v1c v1cVar;
        mo55332up();
        com.aspose.slides.internal.p332p7.aa8 aa8VarM5104k4 = presentation.m2400yj().m5104k4();
        if (aa8VarM5104k4 == null) {
            aa8VarM5104k4 = new com.aspose.slides.internal.p332p7.aa8();
        }
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) presentation.m2399x6(), bArr);
        byte[] bArr2 = bArr[0];
        C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        if ((!Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) || C3092um.m13135k4() == null || !(C3092um.m13135k4() instanceof C3038bv)) && !Arrays.equals(iArrM2334k4, r1s.f48530kk) && !Arrays.equals(iArrM12821x1, C3052g8.f9070x1)) {
            if (aa8VarM5104k4.m28091x1() == null) {
                v1cVar = aa8VarM5104k4.m28089k4();
            } else {
                v1cVar = new com.aspose.slides.internal.p332p7.v1c();
                aa8VarM5104k4.m28090k4(v1cVar);
            }
            m6398k4(m6397k4(v1cVar), true);
        }
        aa8VarM5104k4.mo6846k4(null, m55442ck(), "document-settings");
        mo55333yj();
    }

    public fzv(C11839vw c11839vw, qye qyeVar) {
        super(c11839vw, qyeVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6399k4(Presentation presentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "document-settings".equals(m55443jd().mo65023fa())) {
                presentation.m2400yj().m5105k4(new com.aspose.slides.internal.p332p7.aa8(m55443jd()));
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    private void m6398k4(com.aspose.slides.internal.p332p7.zh8 zh8Var, boolean z) {
        com.aspose.slides.internal.p332p7.iih iihVar = (com.aspose.slides.internal.p332p7.iih) zh8Var.m45622k4("config-item").m29542x1();
        iihVar.m34160k4("LoadReadonly");
        iihVar.m34159k4(1);
        iihVar.m34161x1(z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
    }
}
