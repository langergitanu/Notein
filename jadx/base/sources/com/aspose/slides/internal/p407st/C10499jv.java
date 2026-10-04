package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.sms.common.ReadSmsConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.jv */
/* JADX INFO: loaded from: classes4.dex */
public class C10499jv extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f37114k4 = {2021, Integer.MAX_VALUE, ReadSmsConstant.FAIL, Integer.MAX_VALUE};

    public C10499jv() {
        m51409um().m51917k4(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED);
        m51409um().m51920k4((short) 5);
        m50513yj().addItem(new C10537m6());
    }

    /* JADX INFO: renamed from: k4 */
    public final C10659tx m51042k4(int i) {
        for (int i2 = 0; i2 < m50513yj().size(); i2++) {
            if (C7019kk.m27469x1(m50513yj().get_Item(i2), C10659tx.class) && ((C10659tx) m50513yj().get_Item(i2)).m51786m9() == i) {
                return (C10659tx) m50513yj().get_Item(i2).m51411wy();
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37114k4;
    }

    /* JADX INFO: renamed from: to */
    public final C10659tx[] m51043to() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10659tx c10659tx = (C10659tx) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10659tx.class);
            if (c10659tx != null && !c10659tx.m51403b3()) {
                list.addItem(c10659tx);
            }
        }
        if (list.size() == 0) {
            return null;
        }
        return (C10659tx[]) list.toArray(new C10659tx[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10537m6 m51044x1() {
        return (C10537m6) m50508kk(2021);
    }

    public C10499jv(int i) {
        m51409um().m51917k4(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED);
        m51409um().m51920k4((short) 5);
    }
}
