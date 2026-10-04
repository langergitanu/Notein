package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.y9 */
/* JADX INFO: loaded from: classes.dex */
public class C5764y9 extends AbstractC5706j2 {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC5706j2[] f15819k4;

    /* JADX INFO: renamed from: to */
    protected int f15820to;

    /* JADX INFO: renamed from: x1 */
    protected int f15821x1;

    public C5764y9(ArrayList arrayList) {
        this.f15819k4 = new AbstractC5706j2[arrayList.size()];
        int i = 0;
        while (true) {
            AbstractC5706j2[] abstractC5706j2Arr = this.f15819k4;
            if (i >= abstractC5706j2Arr.length) {
                m23362h4();
                return;
            } else {
                abstractC5706j2Arr[i] = new C5709jw((ArrayList) arrayList.get_Item(i));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m23362h4() {
        AbstractC5706j2[] abstractC5706j2Arr;
        int i = 0;
        while (true) {
            abstractC5706j2Arr = this.f15819k4;
            if (i >= abstractC5706j2Arr.length) {
                break;
            }
            m23363k4(i);
            i++;
        }
        int length = abstractC5706j2Arr.length - 2;
        while (this.f15821x1 <= length) {
            if (m23364x1(length)) {
                length--;
            }
        }
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        int i = 0;
        this.f15821x1 = 0;
        this.f15820to = 0;
        while (true) {
            AbstractC5706j2[] abstractC5706j2Arr = this.f15819k4;
            if (i >= abstractC5706j2Arr.length) {
                m23362h4();
                return;
            } else {
                abstractC5706j2Arr[i].mo23138c5();
                i++;
            }
        }
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5764y9(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15819k4[this.f15821x1].mo21834kk();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f15820to;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        int i = this.f15821x1;
        if (i >= this.f15819k4.length) {
            return false;
        }
        if (this.f15820to != 0) {
            if (m23363k4(i)) {
                m23364x1(this.f15821x1);
            }
            if (this.f15821x1 >= this.f15819k4.length) {
                return false;
            }
        }
        this.f15820to++;
        return true;
    }

    public C5764y9(C5764y9 c5764y9) {
        this.f15819k4 = (AbstractC5706j2[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) c5764y9.f15819k4).deepClone(), AbstractC5706j2[].class);
        this.f15821x1 = c5764y9.f15821x1;
        this.f15820to = c5764y9.f15820to;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m23363k4(int i) {
        if (this.f15819k4[i].mo21770x1()) {
            return true;
        }
        if (this.f15821x1 != i) {
            AbstractC5706j2[] abstractC5706j2Arr = this.f15819k4;
            AbstractC5706j2 abstractC5706j2 = abstractC5706j2Arr[i];
            AbstractC14092to abstractC14092toM67208k4 = AbstractC14092to.m67208k4((Object) abstractC5706j2Arr);
            int i2 = this.f15821x1;
            AbstractC14092to abstractC14092toM67208k42 = AbstractC14092to.m67208k4((Object) this.f15819k4);
            int i3 = this.f15821x1;
            AbstractC14092to.m67216k4(abstractC14092toM67208k4, i2, abstractC14092toM67208k42, i3 + 1, i - i3);
            this.f15819k4[this.f15821x1] = abstractC5706j2;
        }
        this.f15821x1++;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r5.f15819k4[r6] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m23364x1(int i) {
        int iM23313k4;
        AbstractC5706j2 abstractC5706j2 = this.f15819k4[i];
        while (true) {
            int i2 = i + 1;
            if (i2 >= this.f15819k4.length || (iM23313k4 = AbstractC5728qw.m23313k4(abstractC5706j2.mo21834kk(), this.f15819k4[i2].mo21834kk())) == 0) {
                break;
            }
            if (iM23313k4 == 1) {
                AbstractC5706j2[] abstractC5706j2Arr = this.f15819k4;
                abstractC5706j2Arr[i] = abstractC5706j2Arr[i2];
                i = i2;
            } else {
                this.f15819k4[i] = abstractC5706j2;
                if (!m23363k4(i)) {
                    return false;
                }
                abstractC5706j2 = this.f15819k4[i];
            }
        }
    }
}
