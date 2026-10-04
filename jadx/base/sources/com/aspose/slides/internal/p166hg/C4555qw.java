package com.aspose.slides.internal.p166hg;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p474wg.AbstractC11940h4;
import com.aspose.slides.internal.p474wg.C11980vj;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.qw */
/* JADX INFO: loaded from: classes.dex */
public class C4555qw {

    /* JADX INFO: renamed from: k4 */
    static AbstractC11940h4 f12721k4;

    /* JADX INFO: renamed from: x1 */
    static AbstractC11940h4 f12722x1;

    /* JADX INFO: renamed from: k4 */
    private static C4569vh m18830k4() {
        C4569vh c4569vh = new C4569vh(192);
        c4569vh.m18875k4((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", 4, 2, 3, false, true, (byte) 32, (byte) 32, (short) 256, (byte) 16, (byte) 16);
        c4569vh.m18875k4((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", 4, 2, 3, false, true, (byte) 16, (byte) 16, (short) 128, (byte) 16, (byte) 16);
        c4569vh.m18875k4((short) 10, "TLS_RSA_WITH_3DES_EDE_CBC_SHA", 6, 2, 3, false, true, (byte) 24, (byte) 24, (short) 168, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 5, "TLS_RSA_WITH_RC4_128_SHA", 3, 2, 3, false, false, (byte) 16, (byte) 16, (short) 128, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 4, "TLS_RSA_WITH_RC4_128_MD5", 3, 0, 3, false, false, (byte) 16, (byte) 16, (short) 128, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 9, "TLS_RSA_WITH_DES_CBC_SHA", 0, 2, 3, false, true, (byte) 8, (byte) 8, (short) 56, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 3, "TLS_RSA_EXPORT_WITH_RC4_40_MD5", 3, 0, 3, true, false, (byte) 5, (byte) 16, (short) 40, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 6, "TLS_RSA_EXPORT_WITH_RC2_CBC_40_MD5", 2, 0, 3, true, true, (byte) 5, (byte) 16, (short) 40, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 8, "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", 0, 2, 3, true, true, (byte) 5, (byte) 8, (short) 40, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 96, "TLS_RSA_EXPORT_WITH_RC4_56_MD5", 3, 0, 3, true, false, (byte) 7, (byte) 16, (short) 56, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 97, "TLS_RSA_EXPORT_WITH_RC2_CBC_56_MD5", 2, 0, 3, true, true, (byte) 7, (byte) 16, (short) 56, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 98, "TLS_RSA_EXPORT_WITH_DES_CBC_56_SHA", 0, 2, 3, true, true, (byte) 8, (byte) 8, (short) 64, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 100, "TLS_RSA_EXPORT_WITH_RC4_56_SHA", 3, 2, 3, true, false, (byte) 7, (byte) 16, (short) 56, (byte) 0, (byte) 0);
        return c4569vh;
    }

    /* JADX INFO: renamed from: x1 */
    private static C4569vh m18832x1() {
        C4569vh c4569vh = new C4569vh(48);
        c4569vh.m18875k4((short) 53, "SSL_RSA_WITH_AES_256_CBC_SHA", 4, 2, 3, false, true, (byte) 32, (byte) 32, (short) 256, (byte) 16, (byte) 16);
        c4569vh.m18875k4((short) 47, "SSL_RSA_WITH_AES_128_CBC_SHA", 4, 2, 3, false, true, (byte) 16, (byte) 16, (short) 128, (byte) 16, (byte) 16);
        c4569vh.m18875k4((short) 10, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 6, 2, 3, false, true, (byte) 24, (byte) 24, (short) 168, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 5, "SSL_RSA_WITH_RC4_128_SHA", 3, 2, 3, false, false, (byte) 16, (byte) 16, (short) 128, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 4, "SSL_RSA_WITH_RC4_128_MD5", 3, 0, 3, false, false, (byte) 16, (byte) 16, (short) 128, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 9, "SSL_RSA_WITH_DES_CBC_SHA", 0, 2, 3, false, true, (byte) 8, (byte) 8, (short) 56, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 3, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3, 0, 3, true, false, (byte) 5, (byte) 16, (short) 40, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 6, "SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5", 2, 0, 3, true, true, (byte) 5, (byte) 16, (short) 40, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 8, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0, 2, 3, true, true, (byte) 5, (byte) 8, (short) 40, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 96, "SSL_RSA_EXPORT_WITH_RC4_56_MD5", 3, 0, 3, true, false, (byte) 7, (byte) 16, (short) 56, (byte) 0, (byte) 0);
        c4569vh.m18875k4((short) 97, "SSL_RSA_EXPORT_WITH_RC2_CBC_56_MD5", 2, 0, 3, true, true, (byte) 7, (byte) 16, (short) 56, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 98, "SSL_RSA_EXPORT_WITH_DES_CBC_56_SHA", 0, 2, 3, true, true, (byte) 8, (byte) 8, (short) 64, (byte) 8, (byte) 8);
        c4569vh.m18875k4((short) 100, "SSL_RSA_EXPORT_WITH_RC4_56_SHA", 3, 2, 3, true, false, (byte) 7, (byte) 16, (short) 56, (byte) 0, (byte) 0);
        return c4569vh;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4569vh m18831k4(boolean z, int i) {
        C4569vh c4569vhM18830k4;
        AbstractC11940h4 abstractC11940h4;
        if (i == -1073741824) {
            c4569vhM18830k4 = m18830k4();
        } else if (i != 48) {
            if (i != 192) {
                throw new NotSupportedException("Unsupported security protocol type");
            }
            c4569vhM18830k4 = m18830k4();
        } else {
            c4569vhM18830k4 = m18832x1();
        }
        if (z) {
            if (f12722x1 == null) {
                f12722x1 = C11980vj.m56252h4();
            }
            abstractC11940h4 = f12722x1;
        } else {
            if (f12721k4 == null) {
                f12721k4 = C11980vj.m56251du();
            }
            abstractC11940h4 = f12721k4;
        }
        if (abstractC11940h4 == null) {
            return c4569vhM18830k4;
        }
        IGenericEnumerable<String> iGenericEnumerableM55974k4 = abstractC11940h4.m55974k4(i, c4569vhM18830k4.m18872k4());
        C4569vh c4569vh = new C4569vh(i);
        if (iGenericEnumerableM55974k4 != null) {
            Iterator<String> it = iGenericEnumerableM55974k4.iterator();
            while (it.hasNext()) {
                AbstractC4570vj abstractC4570vjM18873k4 = c4569vhM18830k4.m18873k4(it.next());
                if (abstractC4570vjM18873k4 != null) {
                    c4569vh.addItem(abstractC4570vjM18873k4);
                }
            }
        }
        return c4569vh;
    }
}
