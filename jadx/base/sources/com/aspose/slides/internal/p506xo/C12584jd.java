package com.aspose.slides.internal.p506xo;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p240kw.C5995kk;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C12584jd extends AbstractC12578c5 {

    /* JADX INFO: renamed from: du */
    private Dictionary<Integer, Float> f42109du;

    public C12584jd() {
        this.f42109du = new Dictionary<>();
        m58740k4();
        this.f42121k4.m27815x1(C7182dy.f19585pu, C7182dy.f19523m5);
    }

    /* JADX INFO: renamed from: wl */
    private void m58741wl() {
        if (m58776x6() == null) {
            m58766k4(new C12583h4());
        }
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: k4 */
    public float mo58724k4(int i) {
        float fMo58724k4 = super.mo58724k4(i);
        if (fMo58724k4 > 0.0f) {
            return fMo58724k4;
        }
        if (this.f42109du.containsKey(Integer.valueOf(i))) {
            return this.f42109du.get_Item(Integer.valueOf(i)).floatValue();
        }
        this.f42109du.addItem(Integer.valueOf(i), Float.valueOf(250.0f));
        return 250.0f;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12578c5, com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: kk */
    public String mo58718kk(byte[] bArr, int i, int i2) {
        C6765kp c6765kp = new C6765kp();
        String str = C14113y2.f47374k4;
        if (!C14113y2.m67411k4(str)) {
            return str;
        }
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return c6765kp.toString();
            }
            String strM58716h4 = m58716h4(bArr, i3, 1);
            if (strM58716h4 == null && i3 < i4 - 1) {
                strM58716h4 = m58716h4(bArr, i3, 2);
                i3++;
            }
            if (strM58716h4 != null) {
                c6765kp.m26792k4(strM58716h4);
            }
            i3++;
        }
    }

    public C12584jd(C7187kk c7187kk) {
        super(c7187kk);
        this.f42109du = new Dictionary<>();
        m58740k4();
        m58741wl();
    }

    /* JADX INFO: renamed from: k4 */
    private void m58740k4() {
        C7185jd c7185jdM58775x1 = m58775x1(this.f42121k4.mo27767fa(C7182dy.f19687wt));
        if (c7185jdM58775x1 == null) {
            m58763k4((C7182dy) null);
            C5995kk c5995kkM58774up = m58774up();
            if (c5995kkM58774up != null) {
                IGenericEnumerator<KeyValuePair<TKey, TValue>> it = c5995kkM58774up.m24224x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair keyValuePair = (KeyValuePair) it.next();
                        m58757dy().m26126k4(((Integer) keyValuePair.getKey()).intValue(), ((Integer) keyValuePair.getValue()).intValue());
                        m58761jd().m26126k4(((Integer) keyValuePair.getValue()).intValue(), ((Integer) keyValuePair.getKey()).intValue());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        } else if (C7019kk.m27469x1(c7185jdM58775x1, C7182dy.class)) {
            m58763k4((C7182dy) c7185jdM58775x1);
        } else if (C7019kk.m27469x1(c7185jdM58775x1, C7187kk.class)) {
            C7187kk c7187kk = (C7187kk) c7185jdM58775x1;
            C7185jd c7185jdM58775x12 = m58775x1(c7187kk.mo27767fa(C7182dy.f19665v4));
            if (c7185jdM58775x12 == null) {
                m58763k4((C7182dy) null);
            } else {
                m58763k4((C7182dy) c7185jdM58775x12);
            }
            m58765k4(c7187kk, null);
        }
        m58720u4();
    }
}
