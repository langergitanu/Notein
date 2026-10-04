package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7303b7;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7537e7;
import com.aspose.slides.internal.p332p7.C7613ey;
import com.aspose.slides.internal.p332p7.C7965iw;
import com.aspose.slides.internal.p332p7.C8147ky;
import com.aspose.slides.internal.p332p7.C8201ln;
import com.aspose.slides.internal.p332p7.C8275mn;
import com.aspose.slides.internal.p332p7.C8362nn;
import com.aspose.slides.internal.p332p7.C8445oi;
import com.aspose.slides.internal.p332p7.C8448oj;
import com.aspose.slides.internal.p332p7.C8487p0;
import com.aspose.slides.internal.p332p7.C8518pf;
import com.aspose.slides.internal.p332p7.C8527pj;
import com.aspose.slides.internal.p332p7.C8532pl;
import com.aspose.slides.internal.p332p7.C8539pp;
import com.aspose.slides.internal.p332p7.C8824sy;
import com.aspose.slides.internal.p332p7.C8842t8;
import com.aspose.slides.internal.p332p7.C8847ta;
import com.aspose.slides.internal.p332p7.C9281yf;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class vdg {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49490k4 = new C7017h4("r", "f", "d", "sSub", "sSup", "sSubSup", "sPre", "rad", "eqArr", "func", "nary", "limLow", "limUpp", "acc", "bar", "box", "groupChr", "borderBox", "m");

    /* JADX INFO: renamed from: k4 */
    public static C7394ca m72185k4(IMathElement iMathElement, u8s u8sVar) {
        return new C7394ca(C14625ua.m71586k4(iMathElement), C14768x8.m73179k4(iMathElement, u8sVar));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72186k4(C7394ca c7394ca, IMathElementCollection iMathElementCollection, gnb gnbVar) {
        IMathElement iMathElementM68294k4;
        switch (f49490k4.m27428k4(c7394ca.m29539k4())) {
            case 0:
                lv5 lv5VarM73783k4 = y9s.m73783k4((C8362nn) c7394ca.m29541kk(), gnbVar);
                IGenericEnumerator<InterfaceC14740wj> it = lv5VarM73783k4.m64607x1().iterator();
                while (it.hasNext()) {
                    try {
                        b3y b3yVar = (b3y) C7019kk.m27452k4((Object) it.next(), b3y.class);
                        if (b3yVar != null) {
                            MathematicalText mathematicalText = new MathematicalText(b3yVar.m3992k4(), (PortionFormat) lv5VarM73783k4.m64604du());
                            if (lv5VarM73783k4.m64606kk() != null) {
                                mathematicalText.m2006k4(new ldn(lv5VarM73783k4.m64606kk()));
                            }
                            iMathElementCollection.add(mathematicalText);
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
                    return;
                }
                return;
            case 1:
                iMathElementM68294k4 = C14210o0.m68294k4((C8448oj) c7394ca.m29541kk(), gnbVar);
                break;
            case 2:
                iMathElementM68294k4 = C0925e3.m5336k4((C7965iw) c7394ca.m29541kk(), gnbVar);
                break;
            case 3:
                iMathElementM68294k4 = tuc.m71326k4((C8445oi) c7394ca.m29541kk(), gnbVar);
                break;
            case 4:
                iMathElementM68294k4 = tuc.m71327k4((C8518pf) c7394ca.m29541kk(), gnbVar);
                break;
            case 5:
                iMathElementM68294k4 = tuc.m71325k4((C8527pj) c7394ca.m29541kk(), gnbVar);
                break;
            case 6:
                iMathElementM68294k4 = tuc.m71324k4((C9281yf) c7394ca.m29541kk(), gnbVar);
                break;
            case 7:
                iMathElementM68294k4 = xxs.m73634k4((C8532pl) c7394ca.m29541kk(), gnbVar);
                break;
            case 8:
                iMathElementM68294k4 = C13673j5.m63213k4((C8147ky) c7394ca.m29541kk(), gnbVar);
                break;
            case 9:
                iMathElementM68294k4 = C14841yb.m73800k4((C7613ey) c7394ca.m29541kk(), gnbVar);
                break;
            case 10:
                iMathElementM68294k4 = pyz.m69332k4((C8275mn) c7394ca.m29541kk(), gnbVar);
                break;
            case 11:
                iMathElementM68294k4 = zm1.m74571k4((C8487p0) c7394ca.m29541kk(), gnbVar);
                break;
            case 12:
                iMathElementM68294k4 = pbm.m69010k4((C7303b7) c7394ca.m29541kk(), gnbVar);
                break;
            case 13:
                iMathElementM68294k4 = C13681jd.m63283k4((C8847ta) c7394ca.m29541kk(), gnbVar);
                break;
            case 14:
                iMathElementM68294k4 = C14579tw.m71339k4((C8824sy) c7394ca.m29541kk(), gnbVar);
                break;
            case 15:
                iMathElementM68294k4 = C1096fd.m6117k4((C7537e7) c7394ca.m29541kk(), gnbVar);
                break;
            case 16:
                iMathElementM68294k4 = C13843mn.m64924k4((C8539pp) c7394ca.m29541kk(), gnbVar);
                break;
            case 17:
                iMathElementM68294k4 = C14147mx.m67763k4((C8201ln) c7394ca.m29541kk(), gnbVar);
                break;
            case 18:
                iMathElementM68294k4 = dac.m5022k4((C8842t8) c7394ca.m29541kk(), gnbVar);
                break;
            default:
                throw new NotSupportedException(C14113y2.m67402k4("The type {0} not yet supported", c7394ca.m29539k4()));
        }
        iMathElementCollection.add(iMathElementM68294k4);
    }
}
