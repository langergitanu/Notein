package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.h8 */
/* JADX INFO: loaded from: classes4.dex */
public class C10461h8 extends AbstractC10620rm {

    /* JADX INFO: renamed from: k4 */
    private C10672uu[] f37032k4;

    /* JADX INFO: renamed from: x1 */
    private C10757zr[] f37033x1;

    public C10461h8(C10395d2 c10395d2) {
        super(c10395d2);
        this.f37032k4 = new C10672uu[]{new C10672uu()};
        this.f37033x1 = new C10757zr[]{new C10757zr()};
        m51409um().m51917k4(4001);
    }

    /* JADX INFO: renamed from: dy */
    private void m50872dy() {
        C10757zr[] c10757zrArr = this.f37033x1;
        if (c10757zrArr == null || c10757zrArr.length < 2) {
            return;
        }
        List list = new List();
        C10757zr c10757zr = this.f37033x1[0];
        list.addItem(c10757zr);
        int i = 1;
        while (true) {
            C10757zr[] c10757zrArr2 = this.f37033x1;
            if (i >= c10757zrArr2.length) {
                this.f37033x1 = (C10757zr[]) list.toArray(new C10757zr[0]);
                return;
            }
            if (c10757zrArr2[i].m52178k4(c10757zr)) {
                c10757zr.m52174k4(((c10757zr.m52173k4() & 4294967295L) + (this.f37033x1[i].m52173k4() & 4294967295L)) & 4294967295L);
            } else {
                c10757zr = this.f37033x1[i];
                list.addItem(c10757zr);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m50873m9() {
        C10672uu[] c10672uuArr = this.f37032k4;
        if (c10672uuArr == null || c10672uuArr.length < 2) {
            return;
        }
        List list = new List();
        C10672uu c10672uu = this.f37032k4[0];
        list.addItem(c10672uu);
        int i = 1;
        while (true) {
            C10672uu[] c10672uuArr2 = this.f37032k4;
            if (i >= c10672uuArr2.length) {
                this.f37032k4 = (C10672uu[]) list.toArray(new C10672uu[0]);
                return;
            }
            if (c10672uuArr2[i].m51824k4(c10672uu)) {
                c10672uu.m51821k4(((c10672uu.m51819k4() & 4294967295L) + (this.f37032k4[i].m51819k4() & 4294967295L)) & 4294967295L);
            } else {
                c10672uu = this.f37032k4[i];
                list.addItem(c10672uu);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m50874du() {
        m50873m9();
        m50872dy();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int i = 0;
        int i2 = 0;
        int iM52179kk = 0;
        while (true) {
            C10672uu[] c10672uuArr = this.f37032k4;
            if (i2 >= c10672uuArr.length) {
                break;
            }
            iM52179kk += c10672uuArr[i2].m51826to();
            i2++;
        }
        while (true) {
            C10757zr[] c10757zrArr = this.f37033x1;
            if (i >= c10757zrArr.length) {
                return iM52179kk;
            }
            iM52179kk += c10757zrArr[i].m52179kk();
            i++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final C10757zr[] m50877kk() {
        return this.f37033x1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m50878to() {
        C10757zr[] c10757zrArr;
        C10672uu[] c10672uuArr = this.f37032k4;
        if (c10672uuArr != null && (c10757zrArr = this.f37033x1) != null && c10672uuArr.length >= 1 && c10757zrArr.length >= 1) {
            int i = 0;
            while (true) {
                C10672uu[] c10672uuArr2 = this.f37032k4;
                if (i >= c10672uuArr2.length) {
                    int i2 = 0;
                    while (true) {
                        C10757zr[] c10757zrArr2 = this.f37033x1;
                        if (i2 >= c10757zrArr2.length) {
                            break;
                        }
                        if (!c10757zrArr2[i2].m52180x1().m50788ix()) {
                            return false;
                        }
                        i2++;
                    }
                } else {
                    if (!c10672uuArr2[i].m51825kk().m50934ar() || (this.f37032k4[i].m51827x1() & 65535) != 0) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10672uu[] m50879x1() {
        return this.f37032k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition();
        int iM50604qq = m51626h4().m50604qq() + 1;
        List list = new List();
        int iM51819k4 = iM50604qq;
        while (iM51819k4 > 0) {
            C10672uu c10672uu = new C10672uu();
            c10672uu.m51822k4(c3134k4);
            iM51819k4 -= (int) c10672uu.m51819k4();
            list.addItem(c10672uu);
        }
        this.f37032k4 = (C10672uu[]) list.toArray(new C10672uu[0]);
        List list2 = new List();
        while (iM50604qq > 0) {
            C10757zr c10757zr = new C10757zr();
            c10757zr.m52175k4(c3134k4, iM50604qq);
            iM50604qq -= (int) c10757zr.m52173k4();
            list2.addItem(c10757zr);
            if (c3134k4.m13371ck().getPosition() - position == m51409um().m51914du()) {
                iM50604qq = 0;
            }
        }
        this.f37033x1 = (C10757zr[]) list2.toArray(new C10757zr[0]);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        int i = 0;
        int i2 = 0;
        while (true) {
            C10672uu[] c10672uuArr = this.f37032k4;
            if (i2 >= c10672uuArr.length) {
                break;
            }
            c10672uuArr[i2].m51823k4(c3149x1);
            i2++;
        }
        while (true) {
            C10757zr[] c10757zrArr = this.f37033x1;
            if (i >= c10757zrArr.length) {
                return;
            }
            c10757zrArr[i].m52176k4(c3149x1);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50875k4(C10672uu[] c10672uuArr) {
        this.f37032k4 = c10672uuArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50876k4(C10757zr[] c10757zrArr) {
        this.f37033x1 = c10757zrArr;
    }
}
