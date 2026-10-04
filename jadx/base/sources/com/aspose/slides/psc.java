package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4718gk;
import com.aspose.slides.internal.p174hz.C4727jw;
import com.aspose.slides.internal.p174hz.C4734m4;
import com.aspose.slides.internal.p174hz.C4743qw;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p174hz.C4775yj;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes3.dex */
class psc {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f48121h4 = new C7017h4("urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k", "SHA1/1K", "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha1-1k", "http://www.w3.org/2000/09/xmldsig#sha256", "SHA1", "http://www.w3.org/2000/09/xmldsig#sha1");

    /* JADX INFO: renamed from: du */
    private int f48122du;

    /* JADX INFO: renamed from: k4 */
    private byte[] f48123k4;

    /* JADX INFO: renamed from: kk */
    private int f48124kk;

    /* JADX INFO: renamed from: to */
    private String f48125to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f48126x1;

    public psc(String str) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("The argument is null or empty.", "password");
        }
        m69223k4(1024);
        this.f48125to = "SHA1";
        this.f48122du = 32;
        this.f48123k4 = AbstractC6747ar.m26635ix().mo26677to(str);
    }

    /* JADX INFO: renamed from: m9 */
    private void m69215m9() {
        AbstractC4705c6 abstractC4705c6M19620du;
        int iM27428k4 = f48121h4.m27428k4(m69227kk());
        if (iM27428k4 == 3) {
            abstractC4705c6M19620du = AbstractC4718gk.m19620du();
        } else {
            if (iM27428k4 != 4 && iM27428k4 != 5) {
                throw new NotSupportedException(C14113y2.m67402k4("The start key generation name '{0}' is not supported.", m69227kk()));
            }
            abstractC4705c6M19620du = new C4772y9();
        }
        this.f48126x1 = abstractC4705c6M19620du.m19588x1(this.f48123k4);
        abstractC4705c6M19620du.dispose();
    }

    /* JADX INFO: renamed from: du */
    public final byte[] m69219du() {
        byte[] bArr = new byte[16];
        new C4743qw().mo19625x1(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m69220h4() {
        byte[] bArr = new byte[16];
        new C4743qw().mo19625x1(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m69221k4() {
        return this.f48124kk;
    }

    /* JADX INFO: renamed from: kk */
    public final String m69227kk() {
        return this.f48125to;
    }

    /* JADX INFO: renamed from: to */
    public final int m69228to() {
        return this.f48126x1.length;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m69229x1() {
        return this.f48122du;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m69216x1(AbstractC3150x6 abstractC3150x6, String str) {
        int length = (int) abstractC3150x6.getLength();
        int iM27428k4 = f48121h4.m27428k4(str);
        if (iM27428k4 != 0 && iM27428k4 != 1 && iM27428k4 != 2) {
            throw new NotSupportedException(C14113y2.m67402k4("Checksum type '{0}' is not supported.", str));
        }
        if (length > 1024) {
            return 1024;
        }
        return length;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3150x6 m69222k4(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        m69218x1(bArr, bArr2, bArr3);
        byte[] bArrM69214k4 = m69214k4(bArr2);
        C3152yj c3152yj = new C3152yj();
        C3152yj c3152yj2 = new C3152yj(bArr);
        try {
            C4734m4 c4734m4 = new C4734m4();
            try {
                c4734m4.m19687kk(1);
                c4734m4.m19691to(5);
                c4734m4.m19695x1(128);
                c4734m4.mo19609k4(bArrM69214k4.length * 8);
                c4734m4.mo19688kk(bArrM69214k4);
                c4734m4.mo19692to(bArr3);
                InterfaceC4752ts interfaceC4752tsM19696yj = c4734m4.m19696yj();
                try {
                    C4775yj c4775yj = new C4775yj(c3152yj2, interfaceC4752tsM19696yj, 0);
                    try {
                        byte[] bArr4 = new byte[4096];
                        while (true) {
                            int i = c4775yj.read(bArr4, 0, 4096);
                            if (i <= 0) {
                                break;
                            }
                            c3152yj.write(bArr4, 0, i);
                        }
                        c3152yj2.dispose();
                        c3152yj.seek(0L, 0);
                        return c3152yj;
                    } finally {
                        c4775yj.dispose();
                    }
                } finally {
                    if (interfaceC4752tsM19696yj != null) {
                        interfaceC4752tsM19696yj.dispose();
                    }
                }
            } finally {
                c4734m4.dispose();
            }
        } catch (Throwable th) {
            c3152yj2.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69223k4(int i) {
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("value", "The value of iteration count must be a positive number.");
        }
        this.f48124kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69230x1(int i) {
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("value", "The value of derived key size must be a positive number.");
        }
        this.f48122du = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m69217x1(AbstractC3150x6 abstractC3150x6, byte[] bArr, byte[] bArr2) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (bArr == null) {
            throw new ArgumentNullException("salt");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("initVector");
        }
        if (bArr.length != 16) {
            throw new InvalidDataException(C14113y2.m67402k4("Salt has invalid length ({0} bytes) for encryption algorithm.", Integer.valueOf(bArr.length)));
        }
        if (bArr2.length != 16) {
            throw new InvalidDataException(C14113y2.m67402k4("Initialisation vector has invalid length ({0} bytes) for encryption algorithm.", Integer.valueOf(bArr2.length)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69224k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f48125to = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m69218x1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("salt");
        }
        if (bArr3 == null) {
            throw new ArgumentNullException("initVector");
        }
        if (bArr2.length != 16) {
            throw new InvalidDataException(C14113y2.m67402k4("Salt has invalid length ({0} bytes) for decryption algorithm.", Integer.valueOf(bArr2.length)));
        }
        if (bArr3.length != 16) {
            throw new InvalidDataException(C14113y2.m67402k4("Initialisation vector has invalid length ({0} bytes) for decryption algorithm.", Integer.valueOf(bArr3.length)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m69225k4(AbstractC3150x6 abstractC3150x6, String str) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (str == null) {
            throw new ArgumentNullException("checksumType");
        }
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new ArgumentException("The argument is empty.", "checksumType");
        }
        int iM69216x1 = m69216x1(abstractC3150x6, str);
        byte[] bArr = new byte[iM69216x1];
        abstractC3150x6.read(bArr, 0, iM69216x1);
        abstractC3150x6.seek(0L, 0);
        int iM27428k4 = f48121h4.m27428k4(str);
        if (iM27428k4 != 0) {
            if (iM27428k4 != 1 && iM27428k4 != 2) {
                throw new NotSupportedException(C14113y2.m67402k4("Checksum type '{0}' is not supported.", str));
            }
            C4772y9 c4772y9 = new C4772y9();
            try {
                return c4772y9.m19588x1(bArr);
            } finally {
                c4772y9.dispose();
            }
        }
        AbstractC4718gk abstractC4718gkM19620du = AbstractC4718gk.m19620du();
        try {
            byte[] bArrM19588x1 = abstractC4718gkM19620du.m19588x1(bArr);
            abstractC4718gkM19620du.dispose();
            return bArrM19588x1;
        } catch (Throwable th) {
            if (abstractC4718gkM19620du != null) {
                abstractC4718gkM19620du.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m69226k4(AbstractC3150x6 abstractC3150x6, byte[] bArr, byte[] bArr2) {
        m69217x1(abstractC3150x6, bArr, bArr2);
        byte[] bArrM69214k4 = m69214k4(bArr);
        C3152yj c3152yj = new C3152yj();
        try {
            C4734m4 c4734m4 = new C4734m4();
            try {
                c4734m4.m19687kk(1);
                c4734m4.m19691to(5);
                c4734m4.m19695x1(128);
                c4734m4.mo19609k4(bArrM69214k4.length * 8);
                c4734m4.mo19688kk(bArrM69214k4);
                c4734m4.mo19692to(bArr2);
                InterfaceC4752ts interfaceC4752tsM19689ks = c4734m4.m19689ks();
                try {
                    C4775yj c4775yj = new C4775yj(c3152yj, interfaceC4752tsM19689ks, 1);
                    try {
                        byte[] bArr3 = new byte[4096];
                        while (true) {
                            int i = abstractC3150x6.read(bArr3, 0, 4096);
                            if (i <= 0) {
                                break;
                            }
                            c4775yj.write(bArr3, 0, i);
                        }
                        c4775yj.m19834k4();
                        c3152yj.seek(0L, 0);
                        byte[] array = c3152yj.toArray();
                        c4775yj.dispose();
                        return array;
                    } catch (Throwable th) {
                        c4775yj.dispose();
                        throw th;
                    }
                } finally {
                    if (interfaceC4752tsM19689ks != null) {
                        interfaceC4752tsM19689ks.dispose();
                    }
                }
            } finally {
                c4734m4.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m69214k4(byte[] bArr) {
        if (this.f48126x1 == null) {
            m69215m9();
        }
        return new C4727jw(this.f48126x1, bArr, m69221k4()).mo19573k4(m69229x1());
    }
}
