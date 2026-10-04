package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.hn */
/* JADX INFO: loaded from: classes4.dex */
public class C10469hn extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private byte[] f37049k4;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<Long, AbstractC10571o4> f37050x1;

    public C10469hn() {
        this.f37049k4 = null;
        this.f37050x1 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC10669uo m50898k4(long j) {
        AbstractC10571o4[] abstractC10571o4Arr = {null};
        this.f37050x1.tryGetValue(Long.valueOf(j), abstractC10571o4Arr);
        AbstractC10571o4 abstractC10571o4 = abstractC10571o4Arr[0];
        if (abstractC10571o4 != null) {
            if (abstractC10571o4 instanceof AbstractC10669uo) {
                return (AbstractC10669uo) abstractC10571o4;
            }
            return null;
        }
        if (j >= 0 && j < this.f37049k4.length) {
            C3152yj c3152yj = new C3152yj(this.f37049k4);
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            c3152yj.setPosition(j);
            C10695wm c10695wm = new C10695wm(c3134k4);
            AbstractC10571o4 abstractC10571o4M51432k4 = C10576og.m51432k4(c10695wm, null, null, c3134k4);
            if (!(abstractC10571o4M51432k4 instanceof AbstractC10669uo)) {
                return null;
            }
            abstractC10571o4M51432k4.m51405k4(c3134k4, c10695wm);
            m50513yj().addItem(abstractC10571o4M51432k4);
            this.f37050x1.addItem(Long.valueOf(j), abstractC10571o4M51432k4);
            if (abstractC10571o4M51432k4 != null) {
                return (AbstractC10669uo) abstractC10571o4M51432k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m50900x1() {
        byte[] bArr = this.f37049k4;
        return bArr != null && bArr.length > 7;
    }

    public C10469hn(C9816ck c9816ck) {
        this.f37049k4 = null;
        this.f37050x1 = new Dictionary<>();
        C9820h4 c9820h4 = (C9820h4) c9816ck.m48360k4().m48344to("Pictures");
        if (c9820h4 != null) {
            this.f37049k4 = c9820h4.m48410k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m50899k4(AbstractC10669uo abstractC10669uo) {
        m50513yj().addItem(abstractC10669uo);
    }
}
