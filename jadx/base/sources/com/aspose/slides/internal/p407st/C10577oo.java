package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.oo */
/* JADX INFO: loaded from: classes4.dex */
public class C10577oo extends AbstractC10620rm {

    /* JADX INFO: renamed from: k4 */
    private C10367bb[] f37269k4;

    public C10577oo(C10395d2 c10395d2) {
        super(c10395d2);
        this.f37269k4 = new C10367bb[]{new C10367bb()};
        m51409um().m51917k4(4010);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int i = 0;
        int iM50462kk = 0;
        while (true) {
            C10367bb[] c10367bbArr = this.f37269k4;
            if (i >= c10367bbArr.length) {
                return iM50462kk;
            }
            iM50462kk += c10367bbArr[i].m50462kk();
            i++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51434kk() {
        C10367bb[] c10367bbArr = this.f37269k4;
        if (c10367bbArr == null || c10367bbArr.length < 1) {
            return true;
        }
        int i = 0;
        while (true) {
            C10367bb[] c10367bbArr2 = this.f37269k4;
            if (i >= c10367bbArr2.length) {
                return true;
            }
            if (!c10367bbArr2[i].m50463x1().m51100c5()) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m51435to() {
        C10367bb[] c10367bbArr = this.f37269k4;
        if (c10367bbArr == null || c10367bbArr.length < 2) {
            return;
        }
        List list = new List();
        C10367bb c10367bb = this.f37269k4[0];
        list.addItem(c10367bb);
        int i = 1;
        while (true) {
            C10367bb[] c10367bbArr2 = this.f37269k4;
            if (i >= c10367bbArr2.length) {
                this.f37269k4 = (C10367bb[]) list.toArray(new C10367bb[0]);
                return;
            }
            if (c10367bbArr2[i].m50461k4(c10367bb)) {
                c10367bb.m50457k4(((c10367bb.m50456k4() & 4294967295L) + (this.f37269k4[i].m50456k4() & 4294967295L)) & 4294967295L);
            } else {
                c10367bb = this.f37269k4[i];
                list.addItem(c10367bb);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C10367bb[] m51436x1() {
        return this.f37269k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int iM51914du = m51409um().m51914du();
        List list = new List();
        while (iM51914du > 0) {
            C10367bb c10367bb = new C10367bb();
            c10367bb.m50458k4(c3134k4);
            iM51914du -= c10367bb.m50462kk();
            list.addItem(c10367bb);
        }
        if (list.size() > 0) {
            this.f37269k4 = (C10367bb[]) list.toArray(new C10367bb[0]);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        int i = 0;
        while (true) {
            C10367bb[] c10367bbArr = this.f37269k4;
            if (i >= c10367bbArr.length) {
                return;
            }
            c10367bbArr[i].m50459k4(c3149x1);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51433k4(C10367bb[] c10367bbArr) {
        this.f37269k4 = c10367bbArr;
    }
}
