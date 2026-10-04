package com.aspose.slides.internal.p525yi;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p174hz.AbstractC4720he;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.internal.p174hz.C4724j2;
import com.aspose.slides.internal.p174hz.C4731ks;
import com.aspose.slides.internal.p174hz.C4762wl;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.um */
/* JADX INFO: loaded from: classes5.dex */
public final class C12837um {

    /* JADX INFO: renamed from: com.aspose.slides.internal.yi.um$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private String f42703k4;

        /* JADX INFO: renamed from: kk */
        private int f42704kk;

        /* JADX INFO: renamed from: to */
        private byte[] f42705to;

        /* JADX INFO: renamed from: x1 */
        private byte[] f42706x1;

        public k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public String m59684k4() {
            return this.f42703k4;
        }

        /* JADX INFO: renamed from: kk */
        public byte[] m59685kk() {
            if (this.f42706x1 == null) {
                AbstractC4720he abstractC4720heM19622k4 = AbstractC4720he.m19622k4();
                byte[] bArr = new byte[8];
                this.f42706x1 = bArr;
                abstractC4720heM19622k4.mo19624k4(bArr);
            }
            return (byte[]) this.f42706x1.clone();
        }

        /* JADX INFO: renamed from: to */
        public int m59686to() {
            return this.f42704kk;
        }

        /* JADX INFO: renamed from: x1 */
        public byte[] m59687x1() {
            byte[] bArr = this.f42705to;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }

        public k4(byte[] bArr) {
            this();
            m59683k4(bArr);
        }

        /* JADX INFO: renamed from: k4 */
        private void m59683k4(byte[] bArr) {
            C12842x1 c12842x1 = new C12842x1(bArr);
            if (c12842x1.m59718x1() != 48) {
                throw new CryptographicException("invalid EncryptedPrivateKeyInfo");
            }
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
            if (c12842x1M59710k4.m59718x1() != 48) {
                throw new CryptographicException("invalid encryptionAlgorithm");
            }
            C12842x1 c12842x1M59710k42 = c12842x1M59710k4.m59710k4(0);
            if (c12842x1M59710k42.m59718x1() != 6) {
                throw new CryptographicException("invalid algorithm");
            }
            this.f42703k4 = C12828kk.m59652x1(c12842x1M59710k42);
            if (c12842x1M59710k4.m59709k4() > 1) {
                C12842x1 c12842x1M59710k43 = c12842x1M59710k4.m59710k4(1);
                if (c12842x1M59710k43.m59718x1() != 48) {
                    throw new CryptographicException("invalid parameters");
                }
                C12842x1 c12842x1M59710k44 = c12842x1M59710k43.m59710k4(0);
                if (c12842x1M59710k44.m59718x1() != 4) {
                    throw new CryptographicException("invalid salt");
                }
                this.f42706x1 = c12842x1M59710k44.m59717to();
                C12842x1 c12842x1M59710k45 = c12842x1M59710k43.m59710k4(1);
                if (c12842x1M59710k45.m59718x1() != 2) {
                    throw new CryptographicException("invalid iterationCount");
                }
                this.f42704kk = C12828kk.m59648k4(c12842x1M59710k45);
            }
            C12842x1 c12842x1M59710k46 = c12842x1.m59710k4(1);
            if (c12842x1M59710k46.m59718x1() != 4) {
                throw new CryptographicException("invalid EncryptedData");
            }
            this.f42705to = c12842x1M59710k46.m59717to();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.yi.um$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private int f42707k4;

        /* JADX INFO: renamed from: kk */
        private byte[] f42708kk;

        /* JADX INFO: renamed from: to */
        private ArrayList f42709to;

        /* JADX INFO: renamed from: x1 */
        private String f42710x1;

        public x1() {
            this.f42707k4 = 0;
            this.f42709to = new ArrayList();
        }

        /* JADX INFO: renamed from: k4 */
        public static AbstractC4723ix m59688k4(byte[] bArr, C4762wl c4762wl) {
            C12842x1 c12842x1 = new C12842x1(bArr);
            if (c12842x1.m59718x1() != 2) {
                throw new CryptographicException("invalid private key format");
            }
            c4762wl.f13307m9 = m59690k4(c12842x1.m59717to(), 20);
            AbstractC4723ix abstractC4723ixM19628kk = AbstractC4723ix.m19628kk();
            abstractC4723ixM19628kk.mo19634x1(c4762wl.Clone());
            return abstractC4723ixM19628kk;
        }

        /* JADX INFO: renamed from: kk */
        private static byte[] m59691kk(byte[] bArr) {
            int i;
            int length = bArr.length;
            if (bArr[0] == 0) {
                length--;
                i = 1;
            } else {
                i = 0;
            }
            byte[] bArr2 = new byte[length];
            C14058fa.m66596k4(bArr, i, bArr2, 0, length);
            return bArr2;
        }

        /* JADX INFO: renamed from: x1 */
        private void m59692x1(byte[] bArr) {
            C12842x1 c12842x1 = new C12842x1(bArr);
            if (c12842x1.m59718x1() != 48) {
                throw new CryptographicException("invalid PrivateKeyInfo");
            }
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
            if (c12842x1M59710k4.m59718x1() != 2) {
                throw new CryptographicException("invalid version");
            }
            this.f42707k4 = c12842x1M59710k4.m59717to()[0] & 255;
            C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(1);
            if (c12842x1M59710k42.m59718x1() != 48) {
                throw new CryptographicException("invalid algorithm");
            }
            C12842x1 c12842x1M59710k43 = c12842x1M59710k42.m59710k4(0);
            if (c12842x1M59710k43.m59718x1() != 6) {
                throw new CryptographicException("missing algorithm OID");
            }
            this.f42710x1 = C12828kk.m59652x1(c12842x1M59710k43);
            this.f42708kk = c12842x1.m59710k4(2).m59717to();
            if (c12842x1.m59709k4() > 3) {
                C12842x1 c12842x1M59710k44 = c12842x1.m59710k4(3);
                for (int i = 0; i < c12842x1M59710k44.m59709k4(); i++) {
                    this.f42709to.addItem(c12842x1M59710k44.m59710k4(i));
                }
            }
        }

        public x1(byte[] bArr) {
            this();
            m59692x1(bArr);
        }

        /* JADX INFO: renamed from: k4 */
        public static AbstractC4751tq m59689k4(byte[] bArr) {
            C12842x1 c12842x1 = new C12842x1(bArr);
            if (c12842x1.m59718x1() != 48) {
                throw new CryptographicException("invalid private key format");
            }
            if (c12842x1.m59710k4(0).m59718x1() != 2) {
                throw new CryptographicException("missing version");
            }
            if (c12842x1.m59709k4() < 9) {
                throw new CryptographicException("not enough key parameters");
            }
            C4701bs c4701bs = new C4701bs();
            byte[] bArrM59691kk = m59691kk(c12842x1.m59710k4(1).m59717to());
            c4701bs.f13121m9 = bArrM59691kk;
            int length = bArrM59691kk.length;
            int i = length >> 1;
            c4701bs.f13120kk = m59690k4(c12842x1.m59710k4(3).m59717to(), length);
            c4701bs.f13122to = m59690k4(c12842x1.m59710k4(6).m59717to(), i);
            c4701bs.f13116du = m59690k4(c12842x1.m59710k4(7).m59717to(), i);
            c4701bs.f13117dy = m59691kk(c12842x1.m59710k4(2).m59717to());
            c4701bs.f13118h4 = m59690k4(c12842x1.m59710k4(8).m59717to(), i);
            c4701bs.f13119k4 = m59690k4(c12842x1.m59710k4(4).m59717to(), i);
            c4701bs.f13123x1 = m59690k4(c12842x1.m59710k4(5).m59717to(), i);
            try {
                AbstractC4751tq abstractC4751tqM19738kk = AbstractC4751tq.m19738kk();
                abstractC4751tqM19738kk.mo19639k4(c4701bs.Clone());
                return abstractC4751tqM19738kk;
            } catch (CryptographicException unused) {
                C4731ks c4731ks = new C4731ks();
                c4731ks.m19670k4(1);
                C4724j2 c4724j2 = new C4724j2(c4731ks);
                c4724j2.mo19639k4(c4701bs.Clone());
                return c4724j2;
            }
        }

        /* JADX INFO: renamed from: k4 */
        public byte[] m59693k4() {
            byte[] bArr = this.f42708kk;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }

        /* JADX INFO: renamed from: k4 */
        private static byte[] m59690k4(byte[] bArr, int i) {
            if (bArr.length == i) {
                return bArr;
            }
            if (bArr.length > i) {
                return m59691kk(bArr);
            }
            byte[] bArr2 = new byte[i];
            C14058fa.m66596k4(bArr, 0, bArr2, i - bArr.length, bArr.length);
            return bArr2;
        }
    }
}
