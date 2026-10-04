package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class erz extends AbstractC7020m9<erz> {

    /* JADX INFO: renamed from: k4 */
    long f4858k4;

    /* JADX INFO: renamed from: kk */
    long f4859kk;

    /* JADX INFO: renamed from: to */
    long f4860to;

    /* JADX INFO: renamed from: x1 */
    long f4861x1;

    public erz() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        Object[] objArr = (Object[]) C7019kk.m27452k4(obj, Object[].class);
        if (objArr != null && objArr.length == 3) {
            ctm ctmVar = new ctm();
            ctmVar.f4437k4 = ((Boolean) C7019kk.m27464to(objArr[1], Boolean.TYPE)).booleanValue() ? r1s.f48530kk : r1s.f48531x1;
            ctmVar.f4439x1 = objArr[2];
            ctmVar.f4438kk = ((long) ctmVar.hashCode()) ^ 16293972378L;
            Object obj2 = objArr[0];
            if (C7019kk.m27469x1(obj2, Presentation.class)) {
                ((Presentation) obj2).m2374k4(ctmVar);
            } else if (C7019kk.m27469x1(obj2, LoadOptions.class)) {
                ((LoadOptions) obj2).m1920k4(ctmVar);
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public erz Clone() {
        erz erzVar = new erz();
        CloneTo(erzVar);
        return erzVar;
    }

    public erz(Long l, Long l2, Long l3, Long l4) {
        if (l == null && l2 == null && l3 == null && l4 == null) {
            l = 9937416103L;
            l2 = 12160126062L;
            l3 = 8555092912L;
            l4 = 11312394723L;
        }
        this.f4858k4 = l.longValue();
        this.f4861x1 = l2.longValue();
        this.f4859kk = l3.longValue();
        this.f4860to = l4.longValue();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(erz erzVar) {
        erzVar.f4858k4 = this.f4858k4;
        erzVar.f4861x1 = this.f4861x1;
        erzVar.f4859kk = this.f4859kk;
        erzVar.f4860to = this.f4860to;
    }
}
