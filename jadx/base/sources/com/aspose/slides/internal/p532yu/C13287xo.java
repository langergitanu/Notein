package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p205ji.C5463qq;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p343pr.C9483k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.xo */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class C13287xo implements ICollection {

    /* JADX INFO: renamed from: c5 */
    private AbstractC13943n5 f44586c5;

    /* JADX INFO: renamed from: du */
    private ReentrantLock f44587du;

    /* JADX INFO: renamed from: dy */
    private AbstractC13319z7 f44588dy;

    /* JADX INFO: renamed from: h4 */
    private int f44589h4;

    /* JADX INFO: renamed from: jd */
    private AbstractC13319z7 f44590jd;

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7018k4<AbstractC13319z7> f44591k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13883dt f44592kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f44593m9;

    /* JADX INFO: renamed from: to */
    private C13058k1 f44594to;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f44595x1;

    public C13287xo() {
        this(new C13963qw());
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        C13045j6 it = iterator();
        while (it.hasNext()) {
            if (i == abstractC14092to.m67265du() && abstractC14092to.isFixedSize()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            abstractC14092to.m67276kk(it.next(), i);
            i++;
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13058k1 m61748k4(AbstractC13883dt abstractC13883dt) {
        AbstractC13883dt abstractC13883dt2 = this.f44592kk;
        if (abstractC13883dt2 != abstractC13883dt) {
            return new C13058k1(abstractC13883dt);
        }
        if (this.f44594to == null) {
            this.f44594to = new C13058k1(abstractC13883dt2);
        }
        return this.f44594to;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC13319z7 m61754kk() {
        return this.f44588dy;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f44595x1.size();
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C13045j6 iterator() {
        return new C13045j6(this.f44595x1);
    }

    public C13287xo(AbstractC13883dt abstractC13883dt) {
        this.f44589h4 = C5463qq.f15028k4;
        this.f44593m9 = true;
        this.f44588dy = null;
        this.f44586c5 = null;
        this.f44591k4 = new C13076kw(this);
        if (abstractC13883dt == null) {
            throw new ArgumentNullException("nametable");
        }
        this.f44592kk = abstractC13883dt;
        this.f44595x1 = Hashtable.sync(new Hashtable());
        this.f44586c5 = C9483k4.m46681x1();
        this.f44593m9 = true;
        this.f44587du = new ReentrantLock();
    }

    /* JADX INFO: renamed from: k4 */
    public final C13282xc m61749k4(String str) {
        Hashtable hashtable = this.f44595x1;
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        C13204sl c13204sl = (C13204sl) hashtable.get_Item(str);
        if (c13204sl != null) {
            return c13204sl.m61468x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13282xc m61750k4(String str, C13322zd c13322zd, C13282xc c13282xc, boolean z) {
        return m61742k4(str, c13322zd, c13282xc, z, this.f44586c5);
    }

    /* JADX INFO: renamed from: k4 */
    private C13282xc m61742k4(String str, C13322zd c13322zd, C13282xc c13282xc, boolean z, AbstractC13943n5 abstractC13943n5) {
        C13322zd c13322zd2;
        C13282xc c13282xc2;
        int iM61889rv;
        String strMo65266k4;
        int i;
        if (c13282xc != null) {
            if (c13282xc.m61726um() == 0 && z) {
                c13322zd2 = c13322zd;
                c13282xc2 = c13282xc;
                i = !c13282xc2.m61712k4(this, abstractC13943n5, c13322zd2, str, this.f44588dy, this.f44592kk, true);
                strMo65266k4 = c13282xc2.m61697du() == null ? C14113y2.f47374k4 : c13282xc2.m61697du();
            } else {
                c13322zd2 = c13322zd;
                c13282xc2 = c13282xc;
                i = 0;
                strMo65266k4 = str;
            }
            iM61889rv = c13282xc2.m61726um() + i;
        } else {
            c13322zd2 = c13322zd;
            c13282xc2 = c13282xc;
            iM61889rv = c13322zd2.m61889rv();
            strMo65266k4 = m61751k4().mo65266k4(str);
        }
        if (iM61889rv != 0) {
            return null;
        }
        C13204sl c13204sl = new C13204sl();
        c13204sl.m61467k4(strMo65266k4);
        c13204sl.m61466k4(c13322zd2);
        c13204sl.m61465k4(c13282xc2);
        m61745k4(strMo65266k4, c13204sl);
        return c13282xc2;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13322zd m61756x1(String str) {
        Hashtable hashtable = this.f44595x1;
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        C13204sl c13204sl = (C13204sl) hashtable.get_Item(str);
        if (c13204sl != null) {
            return c13204sl.m61464k4();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13883dt m61751k4() {
        return this.f44592kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61752k4(AbstractC13319z7 abstractC13319z7) {
        this.f44588dy = abstractC13319z7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61753k4(AbstractC13943n5 abstractC13943n5) {
        this.f44586c5 = abstractC13943n5;
    }

    /* JADX INFO: renamed from: k4 */
    private void m61745k4(String str, C13204sl c13204sl) {
        try {
            try {
                if (this.f44593m9) {
                    this.f44587du.tryLock(this.f44589h4, TimeUnit.MILLISECONDS);
                }
                if (this.f44595x1.get_Item(str) != null) {
                    this.f44595x1.removeItem(str);
                }
                this.f44595x1.addItem(str, c13204sl);
                if (this.f44593m9) {
                    this.f44587du.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                if (this.f44593m9) {
                    this.f44587du.unlock();
                }
            }
        } catch (Throwable th) {
            if (this.f44593m9) {
                this.f44587du.unlock();
            }
            throw th;
        }
    }
}
