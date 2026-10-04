package com.aspose.slides.internal.p419tg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.k4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10939k4 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f38068k4 = new C7017h4("1.3.14.3.2.26", "1.2.840.113549.2.2", "1.2.840.113549.2.5", "2.16.840.1.101.3.4.1", "2.16.840.1.101.3.4.2", "2.16.840.1.101.3.4.3");

    /* JADX INFO: renamed from: x1 */
    private static String f38069x1 = C14113y2.m67402k4("Input data cannot be coded as a valid certificate.", new Object[0]);

    /* JADX INFO: renamed from: com.aspose.slides.internal.tg.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private String f38070k4;

        /* JADX INFO: renamed from: x1 */
        private C12842x1 f38071x1;

        public k4() {
            this.f38071x1 = new C12842x1((byte) -96);
        }

        /* JADX INFO: renamed from: k4 */
        public C12842x1 m52766k4() {
            return m52770to();
        }

        /* JADX INFO: renamed from: kk */
        public String m52769kk() {
            return this.f38070k4;
        }

        /* JADX INFO: renamed from: to */
        public C12842x1 m52770to() {
            C12842x1 c12842x1 = new C12842x1(PatternStyle.Wave);
            c12842x1.m59712k4(C12828kk.m59650k4(this.f38070k4));
            C12842x1 c12842x12 = this.f38071x1;
            if (c12842x12 != null && c12842x12.m59709k4() > 0) {
                c12842x1.m59712k4(this.f38071x1);
            }
            return c12842x1;
        }

        /* JADX INFO: renamed from: x1 */
        public C12842x1 m52771x1() {
            return this.f38071x1;
        }

        public k4(C12842x1 c12842x1) {
            if (c12842x1.m59718x1() != 48 || (c12842x1.m59709k4() < 1 && c12842x1.m59709k4() > 2)) {
                throw new ArgumentException("Invalid ASN1");
            }
            if (c12842x1.m59710k4(0).m59718x1() != 6) {
                throw new ArgumentException("Invalid contentType");
            }
            this.f38070k4 = C12828kk.m59652x1(c12842x1.m59710k4(0));
            if (c12842x1.m59709k4() > 1) {
                if ((c12842x1.m59710k4(1).m59718x1() & 255) != 160) {
                    throw new ArgumentException("Invalid content");
                }
                this.f38071x1 = c12842x1.m59710k4(1);
            }
        }

        /* JADX INFO: renamed from: k4 */
        public void m52767k4(C12842x1 c12842x1) {
            this.f38071x1 = c12842x1;
        }

        public k4(String str) {
            this();
            this.f38070k4 = str;
        }

        /* JADX INFO: renamed from: k4 */
        public void m52768k4(String str) {
            this.f38070k4 = str;
        }

        public k4(byte[] bArr) {
            this(new C12842x1(bArr));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tg.k4$kk */
    public static class kk {

        /* JADX INFO: renamed from: du */
        private ArrayList f38072du;

        /* JADX INFO: renamed from: dy */
        private boolean f38073dy;

        /* JADX INFO: renamed from: h4 */
        private to f38074h4;

        /* JADX INFO: renamed from: k4 */
        private byte f38075k4;

        /* JADX INFO: renamed from: kk */
        private k4 f38076kk;

        /* JADX INFO: renamed from: m9 */
        private boolean f38077m9;

        /* JADX INFO: renamed from: to */
        private C10940kk f38078to;

        /* JADX INFO: renamed from: x1 */
        private String f38079x1;

        public kk() {
            this.f38075k4 = (byte) 1;
            this.f38076kk = new k4();
            this.f38078to = new C10940kk();
            this.f38072du = new ArrayList();
            this.f38074h4 = new to();
            this.f38077m9 = true;
            this.f38073dy = false;
        }

        /* JADX INFO: renamed from: k4 */
        public C10940kk m52772k4() {
            return this.f38078to;
        }

        /* JADX INFO: renamed from: x1 */
        public to m52774x1() {
            return this.f38074h4;
        }

        public kk(C12842x1 c12842x1) {
            if (c12842x1.m59710k4(0).m59718x1() == 48) {
                int i = 4;
                if (c12842x1.m59710k4(0).m59709k4() >= 4) {
                    if (c12842x1.m59710k4(0).m59710k4(0).m59718x1() != 2) {
                        throw new ArgumentException("Invalid version");
                    }
                    this.f38075k4 = c12842x1.m59710k4(0).m59710k4(0).m59717to()[0];
                    this.f38076kk = new k4(c12842x1.m59710k4(0).m59710k4(2));
                    this.f38078to = new C10940kk();
                    if ((c12842x1.m59710k4(0).m59710k4(3).m59718x1() & 255) == 160) {
                        for (int i2 = 0; i2 < c12842x1.m59710k4(0).m59710k4(3).m59709k4(); i2++) {
                            this.f38078to.m52783k4(new C10945x1(c12842x1.m59710k4(0).m59710k4(3).m59710k4(i2).m59708du()));
                        }
                    } else {
                        i = 3;
                    }
                    this.f38072du = new ArrayList();
                    if ((c12842x1.m59710k4(0).m59710k4(i).m59718x1() & 255) == 161) {
                        for (int i3 = 0; i3 < c12842x1.m59710k4(0).m59710k4(i).m59709k4(); i3++) {
                            this.f38072du.addItem(c12842x1.m59710k4(0).m59710k4(i).m59710k4(i3).m59708du());
                        }
                        i++;
                    }
                    if (c12842x1.m59710k4(0).m59710k4(i).m59709k4() > 0) {
                        this.f38074h4 = new to(c12842x1.m59710k4(0).m59710k4(i));
                    } else {
                        this.f38074h4 = new to();
                    }
                    if (this.f38074h4.m52778kk() != null) {
                        m52773k4(m52775x1(this.f38074h4.m52778kk()));
                    }
                    this.f38077m9 = this.f38074h4.m52779x1().size() > 0;
                    return;
                }
            }
            throw new ArgumentException("Invalid SignedData");
        }

        /* JADX INFO: renamed from: k4 */
        public void m52773k4(String str) {
            this.f38079x1 = str;
            this.f38074h4.m52777k4(str);
        }

        /* JADX INFO: renamed from: x1 */
        public String m52775x1(String str) {
            int iM27428k4 = C10939k4.f38068k4.m27428k4(str);
            return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 4 ? iM27428k4 != 5 ? str : "SHA512" : "SHA384" : "SHA256" : "MD5" : "MD2" : "SHA1";
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tg.k4$to */
    public static class to {

        /* JADX INFO: renamed from: du */
        private byte[] f38080du;

        /* JADX INFO: renamed from: dy */
        private byte[] f38081dy;

        /* JADX INFO: renamed from: h4 */
        private String f38082h4;

        /* JADX INFO: renamed from: k4 */
        private byte f38083k4;

        /* JADX INFO: renamed from: kk */
        private ArrayList f38084kk;

        /* JADX INFO: renamed from: m9 */
        private byte[] f38085m9;

        /* JADX INFO: renamed from: to */
        private ArrayList f38086to;

        /* JADX INFO: renamed from: x1 */
        private String f38087x1;

        public to() {
            this.f38083k4 = (byte) 1;
            this.f38084kk = new ArrayList();
            this.f38086to = new ArrayList();
        }

        /* JADX INFO: renamed from: k4 */
        public String m52776k4() {
            return this.f38082h4;
        }

        /* JADX INFO: renamed from: kk */
        public String m52778kk() {
            return this.f38087x1;
        }

        /* JADX INFO: renamed from: x1 */
        public ArrayList m52779x1() {
            return this.f38084kk;
        }

        public to(C12842x1 c12842x1) {
            this();
            if (c12842x1.m59710k4(0).m59718x1() != 48 || c12842x1.m59710k4(0).m59709k4() < 5) {
                throw new ArgumentException("Invalid SignedData");
            }
            if (c12842x1.m59710k4(0).m59710k4(0).m59718x1() != 2) {
                throw new ArgumentException("Invalid version");
            }
            this.f38083k4 = c12842x1.m59710k4(0).m59710k4(0).m59717to()[0];
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0).m59710k4(1);
            int i = 3;
            if ((c12842x1M59710k4.m59718x1() & 255) == 128 && this.f38083k4 == 3) {
                this.f38081dy = c12842x1M59710k4.m59717to();
            } else {
                this.f38082h4 = C10936fa.m52725k4(c12842x1M59710k4.m59710k4(0));
                this.f38085m9 = c12842x1M59710k4.m59710k4(1).m59717to();
            }
            this.f38087x1 = C12828kk.m59652x1(c12842x1.m59710k4(0).m59710k4(2).m59710k4(0));
            C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(0).m59710k4(3);
            if ((c12842x1M59710k42.m59718x1() & 255) == 160) {
                for (int i2 = 0; i2 < c12842x1M59710k42.m59709k4(); i2++) {
                    this.f38084kk.addItem(c12842x1M59710k42.m59710k4(i2));
                }
                i = 4;
            }
            int i3 = i + 1;
            int i4 = i + 2;
            C12842x1 c12842x1M59710k43 = c12842x1.m59710k4(0).m59710k4(i3);
            if (c12842x1M59710k43.m59718x1() == 4) {
                this.f38080du = c12842x1M59710k43.m59717to();
            }
            C12842x1 c12842x1M59710k44 = c12842x1.m59710k4(0).m59710k4(i4);
            if (c12842x1M59710k44 == null || (c12842x1M59710k44.m59718x1() & 255) != 161) {
                return;
            }
            for (int i5 = 0; i5 < c12842x1M59710k44.m59709k4(); i5++) {
                this.f38086to.addItem(c12842x1M59710k44.m59710k4(i5));
            }
        }

        /* JADX INFO: renamed from: k4 */
        public void m52777k4(String str) {
            this.f38087x1 = str;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tg.k4$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private byte f38088k4;

        /* JADX INFO: renamed from: kk */
        private k4 f38089kk;

        /* JADX INFO: renamed from: to */
        private byte[] f38090to;

        /* JADX INFO: renamed from: x1 */
        private k4 f38091x1;

        public x1() {
            this.f38088k4 = (byte) 0;
        }

        /* JADX INFO: renamed from: k4 */
        public k4 m52780k4() {
            return this.f38089kk;
        }

        /* JADX INFO: renamed from: x1 */
        public byte[] m52781x1() {
            byte[] bArr = this.f38090to;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }

        public x1(C12842x1 c12842x1) {
            this();
            if (c12842x1.m59718x1() != 48 || c12842x1.m59709k4() < 2) {
                throw new ArgumentException("Invalid EncryptedData");
            }
            if (c12842x1.m59710k4(0).m59718x1() != 2) {
                throw new ArgumentException("Invalid version");
            }
            this.f38088k4 = c12842x1.m59710k4(0).m59717to()[0];
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(1);
            if (c12842x1M59710k4.m59718x1() != 48) {
                throw new ArgumentException("missing EncryptedContentInfo");
            }
            C12842x1 c12842x1M59710k42 = c12842x1M59710k4.m59710k4(0);
            if (c12842x1M59710k42.m59718x1() != 6) {
                throw new ArgumentException("missing EncryptedContentInfo.ContentType");
            }
            this.f38091x1 = new k4(C12828kk.m59652x1(c12842x1M59710k42));
            C12842x1 c12842x1M59710k43 = c12842x1M59710k4.m59710k4(1);
            if (c12842x1M59710k43.m59718x1() != 48) {
                throw new ArgumentException("missing EncryptedContentInfo.ContentEncryptionAlgorithmIdentifier");
            }
            k4 k4Var = new k4(C12828kk.m59652x1(c12842x1M59710k43.m59710k4(0)));
            this.f38089kk = k4Var;
            k4Var.m52767k4(c12842x1M59710k43.m59710k4(1));
            C12842x1 c12842x1M59710k44 = c12842x1M59710k4.m59710k4(2);
            if ((c12842x1M59710k44.m59718x1() & 255) != 128) {
                throw new ArgumentException("missing EncryptedContentInfo.EncryptedContent");
            }
            this.f38090to = c12842x1M59710k44.m59717to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C10945x1[] m52765k4(byte[] bArr) {
        k4 k4Var = new k4(bArr);
        if (!k4Var.m52769kk().equals("1.2.840.113549.1.7.2")) {
            throw new CryptographicException(f38069x1);
        }
        kk kkVar = new kk(k4Var.m52771x1());
        if (kkVar.m52774x1().m52776k4() == null) {
            throw new CryptographicException("The original signer is not found.");
        }
        C10945x1[] c10945x1Arr = new C10945x1[kkVar.m52772k4().size()];
        kkVar.m52772k4().m52786k4(c10945x1Arr, 0);
        return c10945x1Arr;
    }
}
