package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.internal.p174hz.C4724j2;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p174hz.C4754u4;
import com.aspose.slides.internal.p174hz.C4762wl;
import com.aspose.slides.internal.p174hz.C4763wp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10945x1;
import com.aspose.slides.internal.p525yi.C12824h4;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3820k4 {

    /* JADX INFO: renamed from: du */
    private C4763wp f10407du;

    /* JADX INFO: renamed from: kk */
    private C4750to f10408kk;

    /* JADX INFO: renamed from: to */
    private C4750to f10409to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4709du f10410x1;

    /* JADX INFO: renamed from: k4 */
    static byte[] f10406k4 = new byte[0];

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f10405h4 = new C7017h4("1.2.840.113549.1.1.1", "1.2.840.10040.4.1");

    public C3820k4(C10945x1 c10945x1) {
        AbstractC4709du abstractC4709duM52831k4;
        C12824h4 c12824h4;
        if ("1.2.840.113549.1.1.1".equals(c10945x1.m52825du())) {
            C4724j2 c4724j2 = (C4724j2) C7019kk.m27452k4((Object) c10945x1.m52826dy(), C4724j2.class);
            if ((c4724j2 == null || !c4724j2.m19641to()) && ((c12824h4 = (C12824h4) C7019kk.m27452k4((Object) c10945x1.m52826dy(), C12824h4.class)) == null || !c12824h4.m59622to())) {
                C4701bs c4701bsClone = c10945x1.m52826dy().mo19642x1(false).Clone();
                AbstractC4751tq abstractC4751tqM19738kk = AbstractC4751tq.m19738kk();
                this.f10410x1 = abstractC4751tqM19738kk;
                ((AbstractC4751tq) C7019kk.m27452k4((Object) abstractC4751tqM19738kk, AbstractC4751tq.class)).mo19639k4(c4701bsClone.Clone());
            } else {
                abstractC4709duM52831k4 = c10945x1.m52826dy();
                this.f10410x1 = abstractC4709duM52831k4;
            }
        } else {
            C4754u4 c4754u4 = (C4754u4) C7019kk.m27452k4((Object) c10945x1.m52831k4(), C4754u4.class);
            if (c4754u4 == null || !c4754u4.m19758to()) {
                C4762wl c4762wlClone = c10945x1.m52831k4().mo19633x1(false).Clone();
                AbstractC4723ix abstractC4723ixM19628kk = AbstractC4723ix.m19628kk();
                this.f10410x1 = abstractC4723ixM19628kk;
                ((AbstractC4723ix) C7019kk.m27452k4((Object) abstractC4723ixM19628kk, AbstractC4723ix.class)).mo19634x1(c4762wlClone.Clone());
            } else {
                abstractC4709duM52831k4 = c10945x1.m52831k4();
                this.f10410x1 = abstractC4709duM52831k4;
            }
        }
        this.f10407du = new C4763wp(c10945x1.m52825du());
        this.f10408kk = new C4750to(this.f10407du, c10945x1.m52839m9());
        byte[] bArrM52828h4 = c10945x1.m52828h4();
        this.f10409to = new C4750to(this.f10407du, bArrM52828h4 == null ? f10406k4 : bArrM52828h4);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4723ix m15296k4(byte[] bArr, byte[] bArr2) {
        C4762wl c4762wl = new C4762wl();
        try {
            C12842x1 c12842x1 = new C12842x1(bArr);
            if (C7019kk.m27462to(Byte.valueOf(c12842x1.m59718x1()), 6) != 2) {
                throw new CryptographicException(C14113y2.m67402k4("Missing DSA Y integer.", new Object[0]));
            }
            c4762wl.f13303dy = m15298x1(c12842x1.m59717to());
            C12842x1 c12842x12 = new C12842x1(bArr2);
            if (C7019kk.m27462to(Byte.valueOf(c12842x12.m59718x1()), 6) != 48 || c12842x12.m59709k4() < 3) {
                throw new CryptographicException(C14113y2.m67402k4("Missing DSA parameters.", new Object[0]));
            }
            if (C7019kk.m27462to(Byte.valueOf(c12842x12.m59710k4(0).m59718x1()), 6) != 2 || C7019kk.m27462to(Byte.valueOf(c12842x12.m59710k4(1).m59718x1()), 6) != 2 || C7019kk.m27462to(Byte.valueOf(c12842x12.m59710k4(2).m59718x1()), 6) != 2) {
                throw new CryptographicException(C14113y2.m67402k4("Invalid DSA parameters.", new Object[0]));
            }
            c4762wl.f13308to = m15298x1(c12842x12.m59710k4(0).m59717to());
            c4762wl.f13302du = m15298x1(c12842x12.m59710k4(1).m59717to());
            c4762wl.f13309x1 = m15298x1(c12842x12.m59710k4(2).m59717to());
            C4754u4 c4754u4 = new C4754u4(c4762wl.f13303dy.length << 3);
            c4754u4.mo19634x1(c4762wl.Clone());
            return c4754u4;
        } catch (RuntimeException e) {
            throw new CryptographicException(C14113y2.m67402k4("Error decoding the ASN.1 structure.", new Object[0]), e);
        }
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC4709du m15300kk() {
        AbstractC4709du abstractC4709duM15297k4;
        if (this.f10410x1 == null) {
            int iM27428k4 = f10405h4.m27428k4(this.f10407du.m19795x1());
            if (iM27428k4 == 0) {
                abstractC4709duM15297k4 = m15297k4(this.f10408kk.m19736x1());
            } else {
                if (iM27428k4 != 1) {
                    throw new NotSupportedException(C14113y2.m67402k4("Cannot decode public key from unknown OID '{0}'.", this.f10407du.m19795x1()));
                }
                abstractC4709duM15297k4 = m15296k4(this.f10408kk.m19736x1(), this.f10409to.m19736x1());
            }
            this.f10410x1 = abstractC4709duM15297k4;
        }
        return this.f10410x1;
    }

    /* JADX INFO: renamed from: x1 */
    public C4750to m15301x1() {
        return this.f10409to;
    }

    /* JADX INFO: renamed from: x1 */
    private static byte[] m15298x1(byte[] bArr) {
        if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        C14058fa.m66596k4(bArr, 1, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public C4750to m15299k4() {
        return this.f10408kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4751tq m15297k4(byte[] bArr) {
        C4701bs c4701bs = new C4701bs();
        try {
            C12842x1 c12842x1 = new C12842x1(bArr);
            if (c12842x1.m59709k4() == 0) {
                throw new CryptographicException(C14113y2.m67402k4("Missing RSA modulus and exponent.", new Object[0]));
            }
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
            if (c12842x1M59710k4 == null || C7019kk.m27462to(Byte.valueOf(c12842x1M59710k4.m59718x1()), 6) != 2) {
                throw new CryptographicException(C14113y2.m67402k4("Missing RSA modulus.", new Object[0]));
            }
            C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(1);
            if (C7019kk.m27462to(Byte.valueOf(c12842x1M59710k42.m59718x1()), 6) != 2) {
                throw new CryptographicException(C14113y2.m67402k4("Missing RSA public exponent.", new Object[0]));
            }
            c4701bs.f13121m9 = m15298x1(c12842x1M59710k4.m59717to());
            c4701bs.f13117dy = c12842x1M59710k42.m59717to();
            C4724j2 c4724j2 = new C4724j2(c4701bs.f13121m9.length << 3);
            c4724j2.mo19639k4(c4701bs.Clone());
            return c4724j2;
        } catch (RuntimeException e) {
            throw new CryptographicException(C14113y2.m67402k4("Error decoding the ASN.1 structure.", new Object[0]), e);
        }
    }
}
