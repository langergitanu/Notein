package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ep */
/* JADX INFO: loaded from: classes3.dex */
class C2073ep {

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.ep$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        public int f7177du;

        /* JADX INFO: renamed from: h4 */
        public boolean f7178h4;

        /* JADX INFO: renamed from: k4 */
        public byte f7179k4;

        /* JADX INFO: renamed from: kk */
        public byte f7180kk;

        /* JADX INFO: renamed from: m9 */
        public boolean f7181m9;

        /* JADX INFO: renamed from: to */
        public int f7182to;

        /* JADX INFO: renamed from: x1 */
        public byte f7183x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m10495x1(k4 k4Var) {
            return k4Var.f7179k4 == this.f7179k4 && k4Var.f7183x1 == this.f7183x1 && k4Var.f7180kk == this.f7180kk && k4Var.f7182to == this.f7182to && k4Var.f7177du == this.f7177du && k4Var.f7178h4 == this.f7178h4 && k4Var.f7181m9 == this.f7181m9;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m10495x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            k4Var.f7179k4 = this.f7179k4;
            k4Var.f7183x1 = this.f7183x1;
            k4Var.f7180kk = this.f7180kk;
            k4Var.f7182to = this.f7182to;
            k4Var.f7177du = this.f7177du;
            k4Var.f7178h4 = this.f7178h4;
            k4Var.f7181m9 = this.f7181m9;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static k4 m10494k4(int i) {
        if (i > 127 || i < 0) {
            throw new IndexOutOfRangeException("Index must be in range beetween zero and 127");
        }
        new k4();
        if (i < 10) {
            k4 k4Var = new k4();
            k4Var.f7179k4 = (byte) 2;
            k4Var.f7180kk = (byte) 8;
            k4Var.f7177du = C7019kk.m27457kk(Integer.valueOf((i / 2) * 256), 9);
            k4Var.f7181m9 = i % 2 == 0;
            return k4Var;
        }
        if (i < 20) {
            k4 k4Var2 = new k4();
            k4Var2.f7179k4 = (byte) 2;
            k4Var2.f7183x1 = (byte) 8;
            k4Var2.f7182to = C7019kk.m27457kk(Integer.valueOf(((i - 10) / 2) * 256), 9);
            k4Var2.f7178h4 = i % 2 == 0;
            return k4Var2;
        }
        if (i < 84) {
            int i2 = i - 20;
            int iM27457kk = C7019kk.m27457kk(Integer.valueOf(((i2 / 16) * 16) + 1), 9);
            k4 k4Var3 = new k4();
            k4Var3.f7179k4 = (byte) 2;
            k4Var3.f7183x1 = (byte) 4;
            k4Var3.f7180kk = (byte) 4;
            k4Var3.f7182to = iM27457kk;
            k4Var3.f7177du = C7019kk.m27457kk(Integer.valueOf(((((i2 - C7019kk.m27462to(Integer.valueOf(iM27457kk), 8)) + 1) / 4) * 16) + 1), 9);
            k4Var3.f7178h4 = i % 2 == 0;
            k4Var3.f7181m9 = (i2 / 2) % 2 == 0;
            return k4Var3;
        }
        if (i < 120) {
            int i3 = i - 84;
            int iM27457kk2 = C7019kk.m27457kk(Integer.valueOf(((i3 / 12) * 256) + 1), 9);
            k4 k4Var4 = new k4();
            k4Var4.f7179k4 = (byte) 3;
            k4Var4.f7183x1 = (byte) 8;
            k4Var4.f7180kk = (byte) 8;
            k4Var4.f7182to = iM27457kk2;
            k4Var4.f7177du = C7019kk.m27457kk(Integer.valueOf((((i3 - (((C7019kk.m27462to(Integer.valueOf(iM27457kk2), 8) - 1) / 256) * 12)) / 4) * 256) + 1), 9);
            k4Var4.f7178h4 = i % 2 == 0;
            k4Var4.f7181m9 = (i3 / 2) % 2 == 0;
            return k4Var4;
        }
        if (i < 124) {
            k4 k4Var5 = new k4();
            k4Var5.f7179k4 = (byte) 4;
            k4Var5.f7183x1 = (byte) 12;
            k4Var5.f7180kk = (byte) 12;
            k4Var5.f7178h4 = i % 2 == 0;
            k4Var5.f7181m9 = ((i - 120) / 2) % 2 == 0;
            return k4Var5;
        }
        k4 k4Var6 = new k4();
        k4Var6.f7179k4 = (byte) 5;
        k4Var6.f7183x1 = (byte) 16;
        k4Var6.f7180kk = (byte) 16;
        k4Var6.f7178h4 = i % 2 == 0;
        k4Var6.f7181m9 = ((i - 124) / 2) % 2 == 0;
        return k4Var6;
    }
}
