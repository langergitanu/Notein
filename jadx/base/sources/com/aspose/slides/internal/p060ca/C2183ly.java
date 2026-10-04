package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ly */
/* JADX INFO: loaded from: classes3.dex */
public class C2183ly implements InterfaceC2001am {

    /* JADX INFO: renamed from: k4 */
    private String f7592k4;

    public C2183ly(String str) {
        this.f7592k4 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: RuntimeException -> 0x0040, PHI: r5
      0x009f: PHI (r5v6 com.aspose.slides.internal.ca.cj) = (r5v5 com.aspose.slides.internal.ca.cj), (r5v8 com.aspose.slides.internal.ca.cj) binds: [B:36:0x00b3, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {RuntimeException -> 0x0040, blocks: (B:13:0x001e, B:15:0x0031, B:18:0x0043, B:20:0x004d, B:23:0x0058, B:25:0x0062, B:27:0x0071, B:28:0x0079, B:30:0x0083, B:32:0x008d, B:34:0x009f, B:35:0x00a3), top: B:47:0x001e, outer: #3 }] */
    @Override // com.aspose.slides.internal.p060ca.InterfaceC2001am
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2033cj[] mo10154k4() throws Throwable {
        C2033cj c2033cjM11309k4;
        try {
            String[] strArrM13414du = C3142to.m13414du(this.f7592k4);
            if (strArrM13414du.length < 1) {
                return new C2033cj[0];
            }
            ArrayList arrayList = new ArrayList(strArrM13414du.length);
            for (int i = 0; i < strArrM13414du.length; i++) {
                try {
                    String strM67443x1 = C14113y2.f47374k4;
                    int iM67418kk = C14113y2.m67418kk(strArrM13414du[i], FilenameUtils.EXTENSION_SEPARATOR);
                    if (iM67418kk < strArrM13414du[i].length() - 1) {
                        String str = strArrM13414du[i];
                        strM67443x1 = C14113y2.m67443x1(str, iM67418kk + 1, (str.length() - iM67418kk) - 1);
                    }
                    if (C14113y2.m67382k4(strM67443x1, C2145ji.m10845x1(), true) == 0 || C14113y2.m67382k4(strM67443x1, C2145ji.m10842k4(), true) == 0) {
                        c2033cjM11309k4 = new C2265qp().m11309k4(new C2405zd(strArrM13414du[i]));
                        if (c2033cjM11309k4 != null) {
                            arrayList.addItem(c2033cjM11309k4);
                        }
                    } else if (C14113y2.m67382k4(strM67443x1, C2145ji.m10843kk(), true) == 0) {
                        for (C2033cj c2033cj : new C2182lv(strArrM13414du[i]).mo10154k4()) {
                            arrayList.addItem(c2033cj);
                        }
                    } else if (C14113y2.m67382k4(strM67443x1, C2156k6.m10909x1(), true) == 0 || C14113y2.m67382k4(strM67443x1, C2156k6.m10906k4(), true) == 0) {
                        c2033cjM11309k4 = new C2061e2().m10445k4(new C2405zd(strArrM13414du[i]));
                        if (c2033cjM11309k4 != null) {
                        }
                    }
                } catch (RuntimeException e) {
                    if (C2063e8.m10448k4().m10449kk() != 1) {
                        throw e;
                    }
                }
            }
            return (C2033cj[]) C7019kk.m27458kk(arrayList.toArray(C7019kk.m27443k4((Class<?>) C2033cj.class)), C2033cj[].class);
        } catch (C2096ga e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw new C2096ga("Unexpected font parsing exception", e3);
        }
    }
}
