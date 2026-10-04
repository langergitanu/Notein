package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.C4743qw;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes3.dex */
class eeo {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Long, String> f4785k4;

    /* JADX INFO: renamed from: x1 */
    private com.aspose.slides.internal.p332p7.i0y f4786x1;

    static {
        Dictionary<Long, String> dictionary = new Dictionary<>();
        f4785k4 = dictionary;
        dictionary.addItem(1L, "MD2");
        dictionary.addItem(2L, "MD4");
        dictionary.addItem(3L, "MD5");
        dictionary.addItem(4L, "SHA1");
        dictionary.addItem(5L, "MAC");
        dictionary.addItem(6L, "RIPEMD");
        dictionary.addItem(7L, "RIPEMD160");
        dictionary.addItem(9L, "HMAC");
        dictionary.addItem(12L, "SHA256");
        dictionary.addItem(13L, "SHA384");
        dictionary.addItem(14L, "SHA512");
    }

    /* JADX INFO: renamed from: kk */
    private static AbstractC4705c6 m5512kk(String str) {
        C6005k4.m24261k4(!C14113y2.m67411k4(str));
        AbstractC4705c6 abstractC4705c6M19582kk = AbstractC4705c6.m19582kk(str);
        if (abstractC4705c6M19582kk != null) {
            return abstractC4705c6M19582kk;
        }
        throw new PptxException(C14113y2.m67402k4("The {0} hashing algorithm is not supported for encrypting and decrypting passwords to modify.", str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5513k4(com.aspose.slides.internal.p332p7.i0y i0yVar) {
        this.f4786x1 = i0yVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5517x1() {
        this.f4786x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5514k4(String str) {
        byte[] bArr = new byte[16];
        new C4743qw().mo19625x1(bArr);
        byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(str);
        byte[] bArr2 = new byte[bArrMo26677to.length + 16];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, 16);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArrMo26677to), 0, AbstractC14092to.m67208k4((Object) bArr2), 16, bArrMo26677to.length);
        C4772y9 c4772y9 = new C4772y9();
        try {
            byte[] bArrM19588x1 = c4772y9.m19588x1(bArr2);
            for (int i = 0; i < 100000; i++) {
                bArrM19588x1 = c4772y9.m19588x1(m5511k4(C14069jd.m66785x1(i), bArrM19588x1));
            }
            c4772y9.dispose();
            com.aspose.slides.internal.p332p7.i0y i0yVar = new com.aspose.slides.internal.p332p7.i0y();
            this.f4786x1 = i0yVar;
            i0yVar.m33814k4(2);
            this.f4786x1.m33821x1(1);
            this.f4786x1.m33818kk(1);
            this.f4786x1.m33815k4(4L);
            this.f4786x1.m33822x1(100000L);
            this.f4786x1.m33816k4(C14080ne.m66952k4(bArr));
            this.f4786x1.m33823x1(C14080ne.m66952k4(bArrM19588x1));
        } catch (Throwable th) {
            c4772y9.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final com.aspose.slides.internal.p332p7.i0y m5516kk() {
        return this.f4786x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m5518x1(String str) {
        com.aspose.slides.internal.p332p7.i0y i0yVar;
        if (C14113y2.m67411k4(str) || (i0yVar = this.f4786x1) == null) {
            return false;
        }
        return m5510k4(str, i0yVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m5515k4() {
        return this.f4786x1 != null;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5510k4(String str, com.aspose.slides.internal.p332p7.i0y i0yVar) {
        if (str == null) {
            throw new ArgumentNullException("password");
        }
        if (i0yVar == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (i0yVar.m33813k4() != 1) {
            throw new PptxException("An unknown cryptographic algorithm class is encountered for the password to modify.");
        }
        if (i0yVar.m33820x1() != 1) {
            throw new PptxException("An unknown cryptographic algorithm type is encountered for the password to modify.");
        }
        Dictionary<Long, String> dictionary = f4785k4;
        if (!dictionary.containsKey(Long.valueOf(i0yVar.m33817kk()))) {
            throw new PptxException("An unknown cryptographic hashing algorithm is encountered for the password to modify.");
        }
        byte[] bArrM66934jd = C14080ne.m66934jd(i0yVar.m33811du());
        byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(str);
        byte[] bArr = new byte[bArrM66934jd.length + bArrMo26677to.length];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArrM66934jd), 0, AbstractC14092to.m67208k4((Object) bArr), 0, bArrM66934jd.length);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArrMo26677to), 0, AbstractC14092to.m67208k4((Object) bArr), bArrM66934jd.length, bArrMo26677to.length);
        long jM33819to = i0yVar.m33819to();
        AbstractC4705c6 abstractC4705c6M5512kk = m5512kk(dictionary.get_Item(Long.valueOf(i0yVar.m33817kk())));
        try {
            byte[] bArrM19588x1 = abstractC4705c6M5512kk.m19588x1(bArr);
            for (int i = 0; i < (4294967295L & jM33819to); i++) {
                bArrM19588x1 = abstractC4705c6M5512kk.m19588x1(m5511k4(C14069jd.m66785x1(i), bArrM19588x1));
            }
            boolean zM67363du = C14113y2.m67363du(C14080ne.m66952k4(bArrM19588x1), i0yVar.m33812h4());
            abstractC4705c6M5512kk.dispose();
            return zM67363du;
        } catch (Throwable th) {
            if (abstractC4705c6M5512kk != null) {
                abstractC4705c6M5512kk.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m5511k4(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr2), 0, AbstractC14092to.m67208k4((Object) bArr3), 0, bArr2.length);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr3), bArr2.length, bArr.length);
        return bArr3;
    }
}
