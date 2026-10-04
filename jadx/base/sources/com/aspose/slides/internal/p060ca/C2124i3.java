package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.i3 */
/* JADX INFO: loaded from: classes3.dex */
public class C2124i3 extends AbstractC2320ug {
    @Override // com.aspose.slides.internal.p060ca.AbstractC2320ug
    /* JADX INFO: renamed from: k4 */
    public void mo10708k4(List<Integer> list, C2212n9 c2212n9) {
        List<AbstractC2166kq> list2;
        AbstractC2166kq c2408zg;
        for (int i = 0; i < list.size(); i++) {
            long jIntValue = ((this.f8014k4 & 4294967295L) + ((long) (list.get_Item(i).intValue() & 65535))) & 4294967295L;
            c2212n9.m11159k4(jIntValue);
            int iM11151fa = c2212n9.m11151fa() & 65535;
            int i2 = this.f8017x1;
            if (i2 == 1) {
                list2 = this.f8013du;
                c2408zg = iM11151fa == 1 ? new C2408zg(jIntValue, iM11151fa) : new C2000al(jIntValue, iM11151fa);
            } else if (i2 == 2) {
                list2 = this.f8013du;
                c2408zg = iM11151fa == 2 ? new C2109h8(jIntValue, iM11151fa) : new C2000al(jIntValue, iM11151fa);
            } else if (i2 == 4) {
                list2 = this.f8013du;
                c2408zg = new C2158k9(jIntValue, iM11151fa);
            } else if (i2 != 8) {
                list2 = this.f8013du;
                c2408zg = new C2000al(jIntValue, iM11151fa);
            } else {
                list2 = this.f8013du;
                c2408zg = iM11151fa == 2 ? new C2189m6(jIntValue, iM11151fa) : new C2000al(jIntValue, iM11151fa);
            }
            list2.addItem(AbstractC2320ug.m11481k4(c2408zg, c2212n9));
        }
    }
}
