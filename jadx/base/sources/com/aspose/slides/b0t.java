package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class b0t extends el1 {

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f4066k4;

    /* JADX INFO: renamed from: kk */
    private final float f4067kk;

    /* JADX INFO: renamed from: x1 */
    private final oju f4068x1;

    static {
        C7019kk.m27454k4(wsf.class, (InterfaceC7014c5) new InterfaceC7014c5<wsf>() { // from class: com.aspose.slides.b0t.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public wsf mo838x1() {
                return new wsf();
            }
        });
    }

    public b0t(MathMatrix mathMatrix, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathMatrix, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f4066k4 = c14327q42;
        this.f4068x1 = new oju();
        c14327q4.CloneTo(c14327q42);
        for (int i = 0; i < mathMatrix.getRowCount(); i++) {
            for (int i2 = 0; i2 < mathMatrix.getColumnCount(); i2++) {
                m5579k4(mathMatrix.get_Item(i, i2), c14327q4.Clone());
            }
        }
        float f = c14327q4.f48231du / 96.0f;
        float f2 = 97.0f * f;
        new oju(f2, 68.0f * f).CloneTo(this.f4068x1);
        if (mo4555du().m69390x1()) {
            new oju(f2, f * 112.0f).CloneTo(this.f4068x1);
        }
        this.f4067kk = (c14327q4.f48231du * 23.0f) / 72.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final MathMatrix m3933k4() {
        return (MathMatrix) this.f4820c5;
    }

    /* JADX INFO: renamed from: k4 */
    private el1 m3932k4(int i, int i2) {
        return this.f4826m9.get_Item((m3933k4().getColumnCount() * i) + i2);
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        float f;
        float f2;
        float fM72912k4;
        MathMatrix mathMatrixM3933k4 = m3933k4();
        wsf[] wsfVarArr = (wsf[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) wsf.class), mathMatrixM3933k4.getRowCount()));
        for (int i = 0; i < mathMatrixM3933k4.getRowCount(); i++) {
            wsf wsfVar = new wsf(0.0f, 0.0f);
            for (int i2 = 0; i2 < mathMatrixM3933k4.getColumnCount(); i2++) {
                wsf.m72910k4(wsfVar.Clone(), m3932k4(i, i2).m5578h4().f5390x1.Clone()).CloneTo(wsfVar);
            }
            wsfVar.CloneTo(wsfVarArr[i]);
        }
        float[] fArr = new float[mathMatrixM3933k4.getColumnCount()];
        float f3 = 0.0f;
        int i3 = 0;
        while (i3 < mathMatrixM3933k4.getColumnCount()) {
            float fM67481k4 = 0.0f;
            for (int i4 = 0; i4 < mathMatrixM3933k4.getRowCount(); i4++) {
                fM67481k4 = C14116yg.m67481k4(fM67481k4, m3932k4(i4, i3).m5578h4().f5389k4);
            }
            f3 += fM67481k4;
            int i5 = i3 + 1;
            if (i5 < mathMatrixM3933k4.getColumnCount()) {
                f3 += this.f4068x1.f47836k4;
            }
            fArr[i3] = fM67481k4;
            i3 = i5;
        }
        float fM72912k42 = 0.0f;
        int i6 = 0;
        while (i6 < mathMatrixM3933k4.getRowCount()) {
            wsf wsfVarClone = wsfVarArr[i6].Clone();
            float f4 = 0.0f;
            int i7 = 0;
            while (i7 < mathMatrixM3933k4.getColumnCount()) {
                float f5 = fArr[i7];
                el1 el1VarM3932k4 = m3932k4(i6, i7);
                h2y h2yVarClone = el1VarM3932k4.m5578h4().Clone();
                el1VarM3932k4.m5584x1(C20503OooO00o.OooO0O0(f5, h2yVarClone.f5389k4, 2.0f, f4), (wsfVarClone.f49849k4 + fM72912k42) - h2yVarClone.f5390x1.f49849k4);
                f4 += f5;
                i7++;
                if (i7 < mathMatrixM3933k4.getColumnCount()) {
                    f4 += this.f4068x1.f47836k4;
                }
            }
            fM72912k42 += wsfVarClone.m72912k4();
            i6++;
            if (i6 < mathMatrixM3933k4.getRowCount()) {
                if (mo4555du().m69390x1()) {
                    f = this.f4067kk;
                    f2 = this.f4068x1.f47837x1;
                    fM72912k4 = wsfVarClone.m72912k4();
                } else {
                    f = this.f4067kk;
                    f2 = this.f4068x1.f47837x1;
                    fM72912k4 = wsfVarClone.f49850x1;
                }
                fM72912k42 = C14116yg.m67481k4(f, f2 - fM72912k4) + fM72912k42;
            }
        }
        nn2 nn2VarM69387k4 = mo4555du().m69387k4(this.f4066k4.f48231du);
        h2y h2yVar = new h2y();
        C13818m2.m64689k4(fM72912k42, nn2VarM69387k4.m68101c5()).CloneTo(h2yVar.f5390x1);
        h2yVar.f5389k4 = f3;
        return h2yVar;
    }
}
