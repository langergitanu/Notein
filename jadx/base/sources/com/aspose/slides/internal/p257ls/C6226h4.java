package com.aspose.slides.internal.p257ls;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10936fa;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14098up;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ls.h4 */
/* JADX INFO: loaded from: classes4.dex */
class C6226h4 {

    /* JADX INFO: renamed from: du */
    private ArrayList f17645du;

    /* JADX INFO: renamed from: k4 */
    private ArrayList f17646k4;

    /* JADX INFO: renamed from: kk */
    private ArrayList f17647kk;

    /* JADX INFO: renamed from: to */
    private ArrayList f17648to;

    /* JADX INFO: renamed from: x1 */
    private ArrayList f17649x1;

    public C6226h4() {
    }

    /* JADX INFO: renamed from: k4 */
    public String[] m25219k4() {
        ArrayList arrayList = this.f17649x1;
        return arrayList == null ? new String[0] : (String[]) C7019kk.m27458kk(arrayList.toArray(C7019kk.m27443k4((Class<?>) String.class)), String[].class);
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        ArrayList<String> arrayList = this.f17646k4;
        if (arrayList != null) {
            for (String str : arrayList) {
                c6765kp.m26792k4("RFC822 Name=");
                c6765kp.m26792k4(str);
                c6765kp.m26792k4(C14052dq.m66570kk());
            }
        }
        ArrayList<String> arrayList2 = this.f17649x1;
        if (arrayList2 != null) {
            for (String str2 : arrayList2) {
                c6765kp.m26792k4("DNS Name=");
                c6765kp.m26792k4(str2);
                c6765kp.m26792k4(C14052dq.m66570kk());
            }
        }
        ArrayList<String> arrayList3 = this.f17647kk;
        if (arrayList3 != null) {
            for (String str3 : arrayList3) {
                c6765kp.m26792k4("Directory Address: ");
                c6765kp.m26792k4(str3);
                c6765kp.m26792k4(C14052dq.m66570kk());
            }
        }
        ArrayList<String> arrayList4 = this.f17648to;
        if (arrayList4 != null) {
            for (String str4 : arrayList4) {
                c6765kp.m26792k4("URL=");
                c6765kp.m26792k4(str4);
                c6765kp.m26792k4(C14052dq.m66570kk());
            }
        }
        ArrayList<String> arrayList5 = this.f17645du;
        if (arrayList5 != null) {
            for (String str5 : arrayList5) {
                c6765kp.m26792k4("IP Address=");
                c6765kp.m26792k4(str5);
                c6765kp.m26792k4(C14052dq.m66570kk());
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public String[] m25220x1() {
        ArrayList arrayList = this.f17645du;
        return arrayList == null ? new String[0] : (String[]) C7019kk.m27458kk(arrayList.toArray(C7019kk.m27443k4((Class<?>) String.class)), String[].class);
    }

    public C6226h4(C12842x1 c12842x1) {
        ArrayList arrayList;
        String strM26681x1;
        for (int i = 0; i < c12842x1.m59709k4(); i++) {
            int iM59718x1 = c12842x1.m59710k4(i).m59718x1() & 255;
            if (iM59718x1 == 129) {
                if (this.f17646k4 == null) {
                    this.f17646k4 = new ArrayList();
                }
                arrayList = this.f17646k4;
                strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c12842x1.m59710k4(i).m59717to());
            } else if (iM59718x1 == 130) {
                if (this.f17649x1 == null) {
                    this.f17649x1 = new ArrayList();
                }
                arrayList = this.f17649x1;
                strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c12842x1.m59710k4(i).m59717to());
            } else if (iM59718x1 == 132 || iM59718x1 == 164) {
                if (this.f17647kk == null) {
                    this.f17647kk = new ArrayList();
                }
                arrayList = this.f17647kk;
                strM26681x1 = C10936fa.m52725k4(c12842x1.m59710k4(i).m59710k4(0));
            } else if (iM59718x1 != 134) {
                if (iM59718x1 == 135) {
                    if (this.f17645du == null) {
                        this.f17645du = new ArrayList();
                    }
                    byte[] bArrM59717to = c12842x1.m59710k4(i).m59717to();
                    String str = bArrM59717to.length == 4 ? "." : C18241k5.f55433h;
                    C6765kp c6765kp = new C6765kp();
                    for (int i2 = 0; i2 < bArrM59717to.length; i2++) {
                        c6765kp.m26792k4(C14098up.m67323x1(bArrM59717to[i2]));
                        if (i2 < bArrM59717to.length - 1) {
                            c6765kp.m26792k4(str);
                        }
                    }
                    this.f17645du.addItem(c6765kp.toString());
                    if (this.f17645du == null) {
                        this.f17645du = new ArrayList();
                    }
                }
            } else {
                if (this.f17648to == null) {
                    this.f17648to = new ArrayList();
                }
                arrayList = this.f17648to;
                strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c12842x1.m59710k4(i).m59717to());
            }
            arrayList.addItem(strM26681x1);
        }
    }
}
