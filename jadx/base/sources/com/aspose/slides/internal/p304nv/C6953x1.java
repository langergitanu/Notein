package com.aspose.slides.internal.p304nv;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p265m4.InterfaceC6316x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.nv.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6953x1 {

    /* JADX INFO: renamed from: du */
    private boolean f18939du;

    /* JADX INFO: renamed from: h4 */
    private boolean f18940h4;

    /* JADX INFO: renamed from: k4 */
    private final List<AbstractC5535bv> f18941k4;

    /* JADX INFO: renamed from: kk */
    private final C6951k4 f18942kk;

    /* JADX INFO: renamed from: to */
    private final int f18943to;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC5535bv f18944x1;

    public C6953x1(AbstractC5535bv abstractC5535bv, C6951k4 c6951k4, int i) {
        if (abstractC5535bv == null) {
            throw new ArgumentNullException("target");
        }
        if (c6951k4 == null) {
            throw new ArgumentNullException(NotificationCompat.CATEGORY_EVENT);
        }
        this.f18941k4 = new List<>();
        this.f18944x1 = abstractC5535bv;
        this.f18942kk = c6951k4;
        this.f18943to = i;
        m27208du();
    }

    /* JADX INFO: renamed from: du */
    private void m27208du() {
        m27209k4(this.f18944x1);
        AbstractC5535bv abstractC5535bvMo22646kp = this.f18944x1;
        while (true) {
            abstractC5535bvMo22646kp = abstractC5535bvMo22646kp.mo22646kp();
            if (abstractC5535bvMo22646kp == null) {
                return;
            } else {
                m27209k4(abstractC5535bvMo22646kp);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27211k4() {
        this.f18939du = true;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m27213kk() {
        return this.f18940h4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m27214to() {
        int i = this.f18943to;
        if ((i == 2 || i == 1) && !m27210k4(1)) {
            return false;
        }
        int i2 = this.f18943to;
        return !(i2 == 2 || i2 == 0) || m27210k4(0);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27215x1() {
        this.f18940h4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m27209k4(AbstractC5535bv abstractC5535bv) {
        if (abstractC5535bv.m22668x1(this.f18942kk)) {
            this.f18941k4.addItem(abstractC5535bv);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m27210k4(int i) {
        List<AbstractC5535bv> list = i == 1 ? new List<>(this.f18941k4) : this.f18941k4;
        if (i == 1) {
            list.reverse();
        }
        List.Enumerator<AbstractC5535bv> it = list.iterator();
        while (it.hasNext()) {
            try {
                AbstractC5535bv next = it.next();
                IGenericCollection<InterfaceC6316x1> iGenericCollectionM22635k4 = next.m22635k4(this.f18942kk, i);
                if (iGenericCollectionM22635k4.size() > 0) {
                    this.f18942kk.m27198k4(next);
                }
                IGenericEnumerator<InterfaceC6316x1> it2 = iGenericCollectionM22635k4.iterator();
                while (it2.hasNext()) {
                    try {
                        if (!m27212k4(it2.next())) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return false;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27212k4(InterfaceC6316x1 interfaceC6316x1) {
        interfaceC6316x1.m25862k4(this.f18942kk);
        return !this.f18939du;
    }
}
