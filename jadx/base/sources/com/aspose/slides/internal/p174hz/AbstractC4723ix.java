package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.ix */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4723ix extends AbstractC4709du {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC4723ix m19627k4(String str) {
        return (AbstractC4723ix) C4756up.m19759k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC4723ix m19628kk() {
        return m19627k4(C4754u4.class.getName());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo19630k4(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: k4 */
    public abstract byte[] mo19631k4(byte[] bArr);

    /* JADX INFO: renamed from: x1 */
    public abstract C4762wl mo19633x1(boolean z);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo19634x1(C4762wl c4762wl);

    /* JADX INFO: renamed from: x1 */
    public void m19635x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("xmlString");
        }
        C4762wl c4762wl = new C4762wl();
        try {
            try {
                c4762wl.f13308to = AbstractC4709du.m19590k4(str, "P");
                c4762wl.f13302du = AbstractC4709du.m19590k4(str, "Q");
                c4762wl.f13309x1 = AbstractC4709du.m19590k4(str, "G");
                c4762wl.f13306kk = AbstractC4709du.m19590k4(str, "J");
                c4762wl.f13303dy = AbstractC4709du.m19590k4(str, "Y");
                c4762wl.f13307m9 = AbstractC4709du.m19590k4(str, "X");
                c4762wl.f13304h4 = AbstractC4709du.m19590k4(str, "Seed");
                byte[] bArrM19590k4 = AbstractC4709du.m19590k4(str, "PgenCounter");
                if (bArrM19590k4 != null) {
                    byte[] bArr = new byte[4];
                    C14058fa.m66596k4(bArrM19590k4, 0, bArr, 0, bArrM19590k4.length);
                    c4762wl.f13305k4 = C14069jd.m66765du(bArr, 0);
                }
                mo19634x1(c4762wl.Clone());
                m19629k4(c4762wl.Clone());
            } catch (Exception e) {
                m19629k4(c4762wl.Clone());
                throw e;
            }
        } catch (Throwable th) {
            m19629k4(c4762wl.Clone());
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m19629k4(C4762wl c4762wl) {
        byte[] bArr = c4762wl.f13307m9;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
    }

    /* JADX INFO: renamed from: kk */
    public String m19632kk(boolean z) {
        String strM66953k4;
        StringBuilder sb = new StringBuilder();
        C4762wl c4762wlClone = mo19633x1(z).Clone();
        try {
            sb.append("<DSAKeyValue>");
            sb.append("<P>");
            sb.append(C14080ne.m66952k4(c4762wlClone.f13308to));
            sb.append("</P>");
            sb.append("<Q>");
            sb.append(C14080ne.m66952k4(c4762wlClone.f13302du));
            sb.append("</Q>");
            sb.append("<G>");
            sb.append(C14080ne.m66952k4(c4762wlClone.f13309x1));
            sb.append("</G>");
            sb.append("<Y>");
            sb.append(C14080ne.m66952k4(c4762wlClone.f13303dy));
            sb.append("</Y>");
            if (c4762wlClone.f13306kk != null) {
                sb.append("<J>");
                sb.append(C14080ne.m66952k4(c4762wlClone.f13306kk));
                sb.append("</J>");
            }
            if (c4762wlClone.f13304h4 != null) {
                sb.append("<Seed>");
                sb.append(C14080ne.m66952k4(c4762wlClone.f13304h4));
                sb.append("</Seed>");
                sb.append("<PgenCounter>");
                int i = c4762wlClone.f13305k4;
                if (i != 0) {
                    byte[] bArrM66785x1 = C14069jd.m66785x1(i);
                    int length = bArrM66785x1.length;
                    while (bArrM66785x1[length - 1] == 0) {
                        length--;
                    }
                    strM66953k4 = C14080ne.m66953k4(bArrM66785x1, 0, length);
                } else {
                    strM66953k4 = "AA==";
                }
                sb.append(strM66953k4);
                sb.append("</PgenCounter>");
            }
            if (c4762wlClone.f13307m9 != null) {
                sb.append("<X>");
                sb.append(C14080ne.m66952k4(c4762wlClone.f13307m9));
                sb.append("</X>");
            } else if (z) {
                throw new ArgumentException("X");
            }
            sb.append("</DSAKeyValue>");
            return sb.toString();
        } catch (RuntimeException e) {
            m19629k4(c4762wlClone.Clone());
            throw e;
        }
    }
}
