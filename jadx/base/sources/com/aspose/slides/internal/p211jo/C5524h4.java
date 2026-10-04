package com.aspose.slides.internal.p211jo;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.C4545k4;
import com.aspose.slides.internal.p166hg.C4557s7;
import com.aspose.slides.internal.p166hg.C4562tq;
import com.aspose.slides.internal.p257ls.C6227k4;
import com.aspose.slides.internal.p257ls.C6228kk;
import com.aspose.slides.internal.p257ls.C6229to;
import com.aspose.slides.internal.p257ls.C6230x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p419tg.C10940kk;
import com.aspose.slides.internal.p419tg.C10943to;
import com.aspose.slides.internal.p419tg.C10945x1;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12381h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C5524h4 extends AbstractC2417k4 {

    /* JADX INFO: renamed from: k4 */
    private C10940kk f15063k4;

    public C5524h4(AbstractC4523ai abstractC4523ai, byte[] bArr) {
        super(abstractC4523ai, (byte) 11, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m22591k4(C4562tq c4562tq, byte b) {
        C4557s7 c4557s7M18863x1 = c4562tq.m18842k4().m18863x1(this.f15063k4);
        if (c4557s7M18863x1.m18833k4()) {
            return;
        }
        long jM18834x1 = c4557s7M18863x1.m18834x1();
        int i = (int) jM18834x1;
        byte b2 = PatternStyle.Wave;
        switch (i) {
            case -2146762495:
                b2 = PatternStyle.DottedGrid;
                break;
            case -2146762487:
            case -2146762486:
                break;
            default:
                b2 = PatternStyle.Divot;
                break;
        }
        throw new C4545k4(b2, C14113y2.m67402k4("Invalid certificate received from server. Error code: 0x{0:x}", C7019kk.m27449k4(jM18834x1)));
    }

    /* JADX INFO: renamed from: x1 */
    private void m22596x1(C4562tq c4562tq, byte b) {
        int i;
        int i2;
        boolean zM52803k4 = false;
        C10945x1 c10945x1 = this.f15063k4.get_Item(0);
        C3817h4 c3817h4 = new C3817h4(c10945x1.m52823c5());
        ArrayList arrayList = new ArrayList();
        if (!m22593k4(c10945x1)) {
            arrayList.addItem(C7019kk.m27466x1(-2146762490));
        }
        if (!m22597x1(c10945x1)) {
            arrayList.addItem(C7019kk.m27466x1(-2146762481));
        }
        C10940kk c10940kk = new C10940kk(this.f15063k4);
        c10940kk.m52788to(c10945x1);
        C10943to c10943to = new C10943to(c10940kk);
        try {
            zM52803k4 = c10943to.m52803k4(c10945x1);
        } catch (RuntimeException unused) {
        }
        if (!zM52803k4) {
            int iM52802k4 = c10943to.m52802k4();
            if (iM52802k4 != 1) {
                if (iM52802k4 == 2) {
                    i = -2146762494;
                } else if (iM52802k4 != 8) {
                    if (iM52802k4 == 32) {
                        i2 = -2146762487;
                    } else if (iM52802k4 == 1024) {
                        i = -2146869223;
                    } else if (iM52802k4 != 65536) {
                        arrayList.addItem(C7019kk.m27466x1(c10943to.m52802k4()));
                        b = PatternStyle.Divot;
                    } else {
                        i2 = -2146762486;
                    }
                    arrayList.addItem(C7019kk.m27466x1(i2));
                    b = 48;
                } else {
                    i = -2146869232;
                }
                arrayList.addItem(C7019kk.m27466x1(i));
            } else {
                arrayList.addItem(C7019kk.m27466x1(-2146762495));
                b = PatternStyle.DottedGrid;
            }
        }
        if (!c4562tq.m18842k4().mo18763k4(c3817h4, (int[]) C7019kk.m27458kk(arrayList.toArray(C7019kk.m27443k4((Class<?>) Integer.TYPE)), int[].class))) {
            throw new C4545k4(b, "Invalid certificate received from server.");
        }
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        mo11837jd();
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        super.mo11835dy();
        m11834ck().m18632ck().m18767k4(this.f15063k4);
        m11834ck().m18632ck().m18765h4();
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        this.f15063k4 = new C10940kk();
        int iM18747to = m18747to();
        int i = 0;
        while (i < iM18747to) {
            int iM18747to2 = m18747to();
            i += 3;
            if (iM18747to2 > 0) {
                this.f15063k4.m52783k4(new C10945x1(m18744k4(iM18747to2)));
                i += iM18747to2;
            }
        }
        m22592k4(this.f15063k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m22592k4(C10940kk c10940kk) {
        C4562tq c4562tq = (C4562tq) m11834ck();
        if (c4562tq.m18842k4().m18860to()) {
            m22591k4(c4562tq, PatternStyle.Plaid);
        } else {
            m22596x1(c4562tq, PatternStyle.Plaid);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m22597x1(C10945x1 c10945x1) {
        String strM18835k4 = ((C4562tq) m11834ck()).m18639fa().m18835k4();
        C10934du c10934duM52730x1 = c10945x1.m52845x1().m52730x1("2.5.29.17");
        if (c10934duM52730x1 != null) {
            C6229to c6229to = new C6229to(c10934duM52730x1);
            for (String str : c6229to.m25223h4()) {
                if (m22595k4(strM18835k4, str)) {
                    return true;
                }
            }
            for (String str2 : c6229to.m25224m9()) {
                if (C14113y2.m67363du(str2, strM18835k4)) {
                    return true;
                }
            }
        }
        return m22594k4(c10945x1.m52844up());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[RETURN] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m22593k4(C10945x1 c10945x1) {
        int i;
        C4562tq c4562tq = (C4562tq) m11834ck();
        if (c10945x1.m52841rv() >= 3) {
            int iM18883dy = c4562tq.m18684xk().m18754k4().m18883dy();
            if (iM18883dy != 0) {
                i = iM18883dy != 1 ? iM18883dy != 3 ? iM18883dy != 4 ? 0 : 128 : 32 : 8;
                return false;
            }
            C10934du c10934duM52730x1 = c10945x1.m52845x1().m52730x1("2.5.29.15");
            C6230x1 c6230x1 = c10934duM52730x1 != null ? new C6230x1(c10934duM52730x1) : null;
            C10934du c10934duM52730x12 = c10945x1.m52845x1().m52730x1("2.5.29.37");
            C6227k4 c6227k4 = c10934duM52730x12 != null ? new C6227k4(c10934duM52730x12) : null;
            if (c6230x1 == null || c6227k4 == null) {
                if (c6230x1 != null) {
                    return c6230x1.m25225k4(i);
                }
                if (c6227k4 == null) {
                    C10934du c10934duM52730x13 = c10945x1.m52845x1().m52730x1("2.16.840.1.113730.1.1");
                    if (c10934duM52730x13 != null) {
                        return new C6228kk(c10934duM52730x13).m25222k4(64);
                    }
                } else if (!c6227k4.m25221h4().contains("1.3.6.1.5.5.7.3.1") && !c6227k4.m25221h4().contains("2.16.840.1.113730.4.1")) {
                    return false;
                }
            } else if (c6230x1.m25225k4(i) && (c6227k4.m25221h4().contains("1.3.6.1.5.5.7.3.1") || c6227k4.m25221h4().contains("2.16.840.1.113730.4.1"))) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m22594k4(String str) {
        C4562tq c4562tq = (C4562tq) m11834ck();
        String string = C14113y2.f47374k4;
        C12381h4 c12381h4M57986kk = new C12380dy("CN\\s*=\\s*([^,]*)").m57986kk(str);
        if (c12381h4M57986kk.m57991k4() == 1 && c12381h4M57986kk.m57992k4(0).mo58006to()) {
            string = c12381h4M57986kk.m57992k4(0).m58004du().m58000k4(1).mo57995kk().toString();
        }
        return m22595k4(c4562tq.m18639fa().m18835k4(), string);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m22595k4(String str, String str2) {
        int iM67429to = C14113y2.m67429to(str2, '*');
        if (iM67429to == -1) {
            return C14113y2.m67383k4(str, str2, true, C11697x1.m55250kk()) == 0;
        }
        if (iM67429to != str2.length() - 1 && str2.charAt(iM67429to + 1) != '.') {
            return false;
        }
        int i = iM67429to + 1;
        if (C14113y2.m67434x1(str2, '*', i) != -1) {
            return false;
        }
        String strM67422kk = C14113y2.m67422kk(str2, i);
        int length = str.length() - strM67422kk.length();
        if (length <= 0 || C14113y2.m67377k4(str, length, strM67422kk, 0, strM67422kk.length(), true, C11697x1.m55250kk()) != 0) {
            return false;
        }
        if (iM67429to == 0) {
            int iM67429to2 = C14113y2.m67429to(str, FilenameUtils.EXTENSION_SEPARATOR);
            return iM67429to2 == -1 || iM67429to2 >= str.length() - strM67422kk.length();
        }
        String strM67443x1 = C14113y2.m67443x1(str2, 0, iM67429to);
        return C14113y2.m67377k4(str, 0, strM67443x1, 0, strM67443x1.length(), true, C11697x1.m55250kk()) == 0;
    }
}
