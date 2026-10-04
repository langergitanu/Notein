package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.tq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4751tq extends AbstractC4709du {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC4751tq m19737k4(String str) {
        return (AbstractC4751tq) C4756up.m19759k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC4751tq m19738kk() {
        return m19737k4(C4724j2.class.getName());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo19639k4(C4701bs c4701bs);

    /* JADX INFO: renamed from: k4 */
    public abstract byte[] mo19640k4(byte[] bArr);

    /* JADX INFO: renamed from: x1 */
    public abstract C4701bs mo19642x1(boolean z);

    /* JADX INFO: renamed from: x1 */
    public void m19740x1(C4701bs c4701bs) {
        byte[] bArr = c4701bs.f13119k4;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
        byte[] bArr2 = c4701bs.f13123x1;
        if (bArr2 != null) {
            AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
        }
        byte[] bArr3 = c4701bs.f13122to;
        if (bArr3 != null) {
            AbstractC14092to.m67225k4(bArr3, 0, bArr3.length);
        }
        byte[] bArr4 = c4701bs.f13116du;
        if (bArr4 != null) {
            AbstractC14092to.m67225k4(bArr4, 0, bArr4.length);
        }
        byte[] bArr5 = c4701bs.f13118h4;
        if (bArr5 != null) {
            AbstractC14092to.m67225k4(bArr5, 0, bArr5.length);
        }
        byte[] bArr6 = c4701bs.f13120kk;
        if (bArr6 != null) {
            AbstractC14092to.m67225k4(bArr6, 0, bArr6.length);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract byte[] mo19643x1(byte[] bArr);

    /* JADX INFO: renamed from: kk */
    public String mo19739kk(boolean z) {
        StringBuilder sb = new StringBuilder("<RSAKeyValue><Modulus>");
        C4701bs c4701bsClone = mo19642x1(z).Clone();
        try {
            sb.append(C14080ne.m66952k4(c4701bsClone.f13121m9));
            sb.append("</Modulus><Exponent>");
            sb.append(C14080ne.m66952k4(c4701bsClone.f13117dy));
            sb.append("</Exponent>");
            if (z) {
                if (c4701bsClone.f13120kk == null) {
                    throw new ArgumentNullException("rsaParams.D", C12825ix.m59623k4("Missing D parameter for the private key."));
                }
                if (c4701bsClone.f13119k4 == null || c4701bsClone.f13123x1 == null || c4701bsClone.f13122to == null || c4701bsClone.f13116du == null || c4701bsClone.f13118h4 == null) {
                    throw new CryptographicException(C12825ix.m59623k4("Missing some CRT parameters for the private key."));
                }
                sb.append("<P>");
                sb.append(C14080ne.m66952k4(c4701bsClone.f13119k4));
                sb.append("</P><Q>");
                sb.append(C14080ne.m66952k4(c4701bsClone.f13123x1));
                sb.append("</Q><DP>");
                sb.append(C14080ne.m66952k4(c4701bsClone.f13122to));
                sb.append("</DP><DQ>");
                sb.append(C14080ne.m66952k4(c4701bsClone.f13116du));
                sb.append("</DQ><InverseQ>");
                sb.append(C14080ne.m66952k4(c4701bsClone.f13118h4));
                sb.append("</InverseQ><D>");
                sb.append(C14080ne.m66952k4(c4701bsClone.f13120kk));
                sb.append("</D>");
            }
            sb.append("</RSAKeyValue>");
            return sb.toString();
        } catch (RuntimeException e) {
            m19740x1(c4701bsClone.Clone());
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m19741x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("xmlString");
        }
        C4701bs c4701bs = new C4701bs();
        try {
            try {
                c4701bs.f13119k4 = AbstractC4709du.m19590k4(str, "P");
                c4701bs.f13123x1 = AbstractC4709du.m19590k4(str, "Q");
                c4701bs.f13120kk = AbstractC4709du.m19590k4(str, "D");
                c4701bs.f13122to = AbstractC4709du.m19590k4(str, "DP");
                c4701bs.f13116du = AbstractC4709du.m19590k4(str, "DQ");
                c4701bs.f13118h4 = AbstractC4709du.m19590k4(str, "InverseQ");
                c4701bs.f13117dy = AbstractC4709du.m19590k4(str, "Exponent");
                c4701bs.f13121m9 = AbstractC4709du.m19590k4(str, "Modulus");
                mo19639k4(c4701bs.Clone());
            } catch (RuntimeException e) {
                m19740x1(c4701bs.Clone());
                throw new CryptographicException(C12825ix.m59623k4("Couldn't decode XML"), e);
            }
        } finally {
            m19740x1(c4701bs.Clone());
        }
    }
}
