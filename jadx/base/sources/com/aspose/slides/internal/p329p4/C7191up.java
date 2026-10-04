package com.aspose.slides.internal.p329p4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p255lq.C6220k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.up */
/* JADX INFO: loaded from: classes4.dex */
public class C7191up extends C7185jd {

    /* JADX INFO: renamed from: k4 */
    private byte[] f19768k4;

    public C7191up(String str) {
        this.f19768k4 = new byte[0];
        if (m27845x1(str)) {
            m27843kk(str);
        } else {
            m27844to(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C7191up m27841k4(String str) {
        List list = new List();
        String strM67440x1 = C14113y2.m67440x1(str);
        if (strM67440x1.length() % 2 != 0) {
            strM67440x1 = C14113y2.m67441x1(strM67440x1, '0');
        }
        int length = strM67440x1.length();
        for (int i = 0; i < length; i += 2) {
            try {
                list.addItem(Byte.valueOf(C14080ne.m66935k4(C14113y2.m67443x1(strM67440x1, i, 2), 16)));
            } catch (FormatException unused) {
                list.addItem(Byte.valueOf(C14080ne.m66935k4(MsalUtils.QUERY_STRING_SYMBOL, 16)));
            }
        }
        return new C7191up(C12565ks.m58622k4((List<Byte>) list));
    }

    /* JADX INFO: renamed from: kk */
    private void m27843kk(String str) {
        byte[] bArrM27842k4 = m27842k4((Byte[]) C6220k4.m25202k4((Class<byte>) Byte.class, (byte[]) C12565ks.m58634x1(this.f19768k4), (byte) -2));
        this.f19768k4 = bArrM27842k4;
        this.f19768k4 = m27842k4((Byte[]) C6220k4.m25202k4((Class<byte>) Byte.class, (byte[]) C12565ks.m58634x1(bArrM27842k4), (byte) -2));
        this.f19768k4 = m27842k4((Byte[]) C6220k4.m25203k4(Byte.class, (Object[]) C12565ks.m58634x1(this.f19768k4), (Object[]) C12565ks.m58634x1(AbstractC6747ar.m26649x6().mo26677to(str))));
    }

    /* JADX INFO: renamed from: to */
    private void m27844to(String str) {
        this.f19768k4 = m27842k4((Byte[]) C6220k4.m25203k4(Byte.class, (Object[]) C12565ks.m58634x1(this.f19768k4), (Object[]) C12565ks.m58634x1(AbstractC6747ar.m26640kk("ISO-8859-1").mo26677to(str))));
    }

    public String toString() {
        return C14113y2.m67402k4("({0})", AbstractC6747ar.m26650yj().m26681x1(this.f19768k4));
    }

    /* JADX INFO: renamed from: x1 */
    public final String m27847x1() {
        return AbstractC6747ar.m26650yj().m26681x1(this.f19768k4);
    }

    public C7191up(byte[] bArr) {
        this.f19768k4 = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) bArr).deepClone(), byte[].class);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m27845x1(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 255) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m27846k4() {
        return this.f19768k4;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m27842k4(Byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }
}
