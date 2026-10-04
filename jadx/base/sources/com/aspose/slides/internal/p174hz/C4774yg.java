package com.aspose.slides.internal.p174hz;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.yg */
/* JADX INFO: loaded from: classes.dex */
public class C4774yg {

    /* JADX INFO: renamed from: k4 */
    private String f13343k4;

    /* JADX INFO: renamed from: kk */
    private String f13344kk;

    /* JADX INFO: renamed from: to */
    private String f13345to;

    /* JADX INFO: renamed from: x1 */
    private String f13346x1;

    /* JADX INFO: renamed from: du */
    public AbstractC4705c6 mo19824du() {
        String str = this.f13346x1;
        if (str != null) {
            return (AbstractC4705c6) C4756up.m19759k4(str);
        }
        throw new ArgumentNullException("DigestAlgorithm");
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4710dy mo19552k4(AbstractC4709du abstractC4709du) {
        String str = this.f13343k4;
        if (str == null) {
            throw new ArgumentNullException("DeformatterAlgorithm");
        }
        AbstractC4710dy abstractC4710dy = (AbstractC4710dy) C4756up.m19759k4(str);
        if (this.f13345to == null) {
            throw new NullReferenceException("KeyAlgorithm");
        }
        abstractC4710dy.mo19595k4(abstractC4709du);
        return abstractC4710dy;
    }

    /* JADX INFO: renamed from: kk */
    public String m19827kk() {
        return this.f13344kk;
    }

    /* JADX INFO: renamed from: to */
    public String m19829to() {
        return this.f13345to;
    }

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4704c5 mo19831x1(AbstractC4709du abstractC4709du) {
        String str = this.f13344kk;
        if (str == null) {
            throw new ArgumentNullException("FormatterAlgorithm");
        }
        AbstractC4704c5 abstractC4704c5 = (AbstractC4704c5) C4756up.m19759k4(str);
        if (this.f13345to == null) {
            throw new NullReferenceException("KeyAlgorithm");
        }
        abstractC4704c5.mo19578k4(abstractC4709du);
        return abstractC4704c5;
    }

    /* JADX INFO: renamed from: k4 */
    public String m19825k4() {
        return this.f13343k4;
    }

    /* JADX INFO: renamed from: kk */
    public void m19828kk(String str) {
        this.f13344kk = str;
    }

    /* JADX INFO: renamed from: to */
    public void m19830to(String str) {
        this.f13345to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public String m19832x1() {
        return this.f13346x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m19826k4(String str) {
        this.f13343k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m19833x1(String str) {
        this.f13346x1 = str;
    }
}
