package com.aspose.slides.internal.p506xo;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p045br.AbstractC1846x1;
import com.aspose.slides.internal.p045br.C1842k4;
import com.aspose.slides.internal.p045br.C1843kk;
import com.aspose.slides.internal.p240kw.C5995kk;
import com.aspose.slides.internal.p271mc.C6361du;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p333p8.C9424dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.c5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12578c5 extends AbstractC12588to {

    /* JADX INFO: renamed from: c5 */
    private final Dictionary<Integer, Float> f42096c5;

    /* JADX INFO: renamed from: du */
    private float f42097du;

    /* JADX INFO: renamed from: dy */
    private char[] f42098dy;

    /* JADX INFO: renamed from: h4 */
    private float f42099h4;

    /* JADX INFO: renamed from: jd */
    private final byte[] f42100jd;

    /* JADX INFO: renamed from: m9 */
    private C5995kk f42101m9;

    public AbstractC12578c5() {
        this.f42096c5 = new Dictionary<>();
        this.f42100jd = new byte[]{32};
        m58720u4();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m58716h4(byte[] bArr, int i, int i2) {
        C5995kk c5995kk = this.f42101m9;
        if (c5995kk != null) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IndexOutOfRangeException(C14113y2.m67402k4("Invalid index '{0}'", Integer.valueOf(i3)));
            }
            String strM24222k4 = c5995kk.m24222k4(bArr, i, i2);
            if (strM24222k4 != null) {
                return strM24222k4;
            }
            if (i2 != 1 || this.f42098dy == null) {
                return null;
            }
        }
        if (i2 != 1) {
            throw new ArgumentException("Multi-byte glyphs not implemented yet");
        }
        char[] cArr = this.f42098dy;
        return cArr == null ? C14113y2.f47374k4 : C14113y2.m67406k4(cArr, bArr[i] & 255, 1);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: k4 */
    public float mo58717k4(byte[] bArr, int i, int i2) {
        int iM58755du = m58755du(bArr, i, i2);
        if (this.f42096c5.containsKey(Integer.valueOf(iM58755du))) {
            return this.f42096c5.get_Item(Integer.valueOf(iM58755du)).floatValue();
        }
        float fMo58724k4 = mo58724k4(iM58755du);
        this.f42096c5.addItem(Integer.valueOf(iM58755du), Float.valueOf(fMo58724k4));
        return fMo58724k4;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: kk */
    public String mo58718kk(byte[] bArr, int i, int i2) {
        C6765kp c6765kp = new C6765kp();
        String str = C14113y2.f47374k4;
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                break;
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
        String string = c6765kp.toString();
        if (!C14113y2.m67411k4(string) || m58772to() == null) {
            return string;
        }
        return m58772to().m9632x1(m58755du(bArr, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: RuntimeException -> 0x0037, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0037, blocks: (B:6:0x000e, B:8:0x0012, B:10:0x0019, B:11:0x001d, B:13:0x0029, B:15:0x0030, B:12:0x0020), top: B:20:0x000c }] */
    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: ne */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float mo58719ne() {
        float fMo58717k4;
        int iM24221k4;
        if (this.f42097du == -1.0f) {
            try {
                if (m58760ix() != null) {
                    C5995kk c5995kk = this.f42101m9;
                    if (c5995kk != null && (iM24221k4 = c5995kk.m24221k4()) > -1) {
                        fMo58717k4 = mo58724k4(iM24221k4);
                    }
                    if (this.f42097du <= 0.0f) {
                        this.f42097du = mo58725x1();
                    }
                } else {
                    fMo58717k4 = mo58717k4(this.f42100jd, 0, 1);
                }
                this.f42097du = fMo58717k4;
                if (this.f42097du <= 0.0f) {
                }
            } catch (RuntimeException unused) {
                this.f42097du = 250.0f;
            }
        }
        return this.f42097du;
    }

    /* JADX INFO: renamed from: u4 */
    public final void m58720u4() {
        this.f42097du = -1.0f;
        this.f42099h4 = 0.0f;
        this.f42101m9 = m58774up();
        m58715k4();
    }

    /* JADX INFO: renamed from: uz */
    public final void m58721uz() {
        C7182dy c7182dy;
        String strM27766k4;
        C7185jd c7185jdM58768kk = m58768kk();
        AbstractC1846x1 c1842k4 = null;
        if (c7185jdM58768kk != null) {
            try {
                if (C7019kk.m27469x1(c7185jdM58768kk, C7182dy.class)) {
                    if (this.f42101m9 == null) {
                        c7182dy = (C7182dy) c7185jdM58768kk;
                        strM27766k4 = c7182dy.m27766k4();
                    } else {
                        c7182dy = null;
                        strM27766k4 = null;
                    }
                    if (this.f42101m9 == null && strM27766k4 != null) {
                        c1842k4 = C1843kk.f6682k4.m9623k4(c7182dy);
                    }
                } else if (C7019kk.m27469x1(c7185jdM58768kk, C7187kk.class)) {
                    c1842k4 = new C1842k4((C7187kk) c7185jdM58768kk);
                }
            } catch (IOException unused) {
            }
        }
        m58762k4(c1842k4);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: x1 */
    public float mo58722x1(byte[] bArr, int i, int i2) {
        float f = this.f42099h4;
        if (f > 0.0f) {
            return f;
        }
        AbstractC12580du abstractC12580duM58776x6 = m58776x6();
        if (abstractC12580duM58776x6 == null) {
            return 0.0f;
        }
        C9424dy c9424dyMo58733m9 = abstractC12580duM58776x6.mo58733m9();
        float fM46139kk = c9424dyMo58733m9 != null ? c9424dyMo58733m9.m46139kk() / 2.0f : 0.0f;
        if (fM46139kk == 0.0f) {
            fM46139kk = abstractC12580duM58776x6.mo58731k4();
        }
        if (fM46139kk == 0.0f) {
            fM46139kk = abstractC12580duM58776x6.mo58732kk();
        }
        if (fM46139kk == 0.0f) {
            fM46139kk = abstractC12580duM58776x6.mo58735x1();
            if (fM46139kk > 0.0f) {
                fM46139kk -= abstractC12580duM58776x6.mo58734to();
            }
        }
        this.f42099h4 = fM46139kk;
        return fM46139kk;
    }

    public AbstractC12578c5(C7187kk c7187kk) {
        super(c7187kk);
        this.f42096c5 = new Dictionary<>();
        this.f42100jd = new byte[]{32};
        m58720u4();
        m58721uz();
    }

    /* JADX INFO: renamed from: k4 */
    private void m58715k4() {
        C6361du c6361duM58761jd = m58761jd();
        int[] iArrM26129x1 = c6361duM58761jd.m26129x1();
        if (iArrM26129x1.length == 0) {
            return;
        }
        this.f42098dy = new char[256];
        for (int i : iArrM26129x1) {
            if (i <= 255) {
                this.f42098dy[i] = (char) c6361duM58761jd.m26124k4(i);
            }
        }
        C5995kk c5995kk = this.f42101m9;
        if (c5995kk != null) {
            IGenericEnumerator<KeyValuePair<TKey, TValue>> it = c5995kk.m24223kk().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair keyValuePair = (KeyValuePair) it.next();
                    if (((Integer) keyValuePair.getKey()).intValue() < 256) {
                        this.f42098dy[((Integer) keyValuePair.getKey()).intValue()] = (char) ((Integer) keyValuePair.getValue()).intValue();
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        C6361du c6361duM58754ck = m58754ck();
        if (c6361duM58754ck != null) {
            int[] iArrM26129x12 = c6361duM58754ck.m26129x1();
            for (int i2 = 0; i2 < iArrM26129x12.length; i2++) {
                int iM26124k4 = c6361duM58754ck.m26124k4(iArrM26129x12[i2]);
                if (iM26124k4 < 256) {
                    this.f42098dy[iM26124k4] = (char) iArrM26129x12[i2];
                }
            }
        }
    }
}
