package com.aspose.slides.internal.p065ck;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p231kk.InterfaceC5805u4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.kp */
/* JADX INFO: loaded from: classes3.dex */
public class C2583kp extends AbstractC2598to {

    /* JADX INFO: renamed from: k4 */
    private IGenericList<String> f8417k4;

    public C2583kp(IGenericList<String> iGenericList) {
        super("lang(");
        this.f8417k4 = iGenericList;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2598to, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        C6765kp c6765kp = new C6765kp();
        if (this.f8417k4.size() != 0) {
            c6765kp.m26792k4(this.f8417k4.get_Item(0));
            for (int i = 1; i < this.f8417k4.size(); i++) {
                c6765kp.m26792k4(", ").m26792k4(this.f8417k4.get_Item(i));
            }
        }
        return C14113y2.m67407k4(':', m11909k4(), c6765kp.toString(), ')');
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        String strMo22721to = interfaceC12769ix.mo22698c5(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL) ? interfaceC12769ix.mo22721to(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL) : ((InterfaceC5805u4) interfaceC12769ix.mo22660v4()).mo20431k4().mo26009x1().mo26027x1();
        if (C14113y2.m67411k4(strMo22721to)) {
            return false;
        }
        IGenericEnumerator<String> it = this.f8417k4.iterator();
        while (it.hasNext()) {
            try {
                if (m11906k4(strMo22721to, it.next())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m11906k4(String str, String str2) {
        if (str.length() < str2.length()) {
            return false;
        }
        return str.length() == str2.length() ? C14113y2.m67432to(str, str2, (short) 5) : C14113y2.m67412k4(str, str2, (short) 5) && str.charAt(str2.length()) == '-';
    }
}
