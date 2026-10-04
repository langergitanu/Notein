package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.qx */
/* JADX INFO: loaded from: classes4.dex */
public class C10614qx extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private C10452gj f37338k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C10421eg> f37339x1;

    public C10614qx() {
        super(61446, (byte) 0);
        this.f37338k4 = new C10452gj();
        this.f37339x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int iM50828du = this.f37338k4.m50828du();
        for (int i = 0; i < this.f37339x1.size(); i++) {
            iM50828du += this.f37339x1.get_Item(i).m50745x1();
        }
        return iM50828du;
    }

    /* JADX INFO: renamed from: kk */
    public final long m51612kk() {
        return this.f37338k4.m50835to();
    }

    /* JADX INFO: renamed from: to */
    public final List<C10421eg> m51614to() {
        return this.f37339x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("{0}\n", super.toString());
        c6765kp.m26796k4("SpidMax:{0}, FidclCount:{1}, CspSaved:{2}, CdgSaved:{3}\n", Long.valueOf(this.f37338k4.m50829k4()), Integer.valueOf(this.f37339x1.size()), Long.valueOf(this.f37338k4.m50833kk()), Long.valueOf(this.f37338k4.m50835to()));
        for (int i = 0; i < this.f37339x1.size(); i++) {
            c6765kp.m26796k4("{0}\n", this.f37339x1.get_Item(i));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51615x1() {
        return this.f37338k4.m50833kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51611k4(long j) {
        this.f37338k4.m50830k4(j);
    }

    /* JADX INFO: renamed from: kk */
    public final void m51613kk(long j) {
        this.f37338k4.m50836to(j);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51616x1(long j) {
        this.f37338k4.m50834kk(j);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37338k4.m50831k4(c3134k4);
        for (int i = 1; i < (this.f37338k4.m50837x1() & 4294967295L); i++) {
            this.f37339x1.addItem(new C10421eg(c3134k4));
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        this.f37338k4.m50838x1(((((long) this.f37339x1.size()) & 4294967295L) + 1) & 4294967295L);
        this.f37338k4.m50832k4(c3149x1);
        for (int i = 0; i < this.f37339x1.size(); i++) {
            this.f37339x1.get_Item(i).m50744k4(c3149x1);
        }
    }
}
