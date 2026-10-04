package com.aspose.slides.internal.p184ik;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.to */
/* JADX INFO: loaded from: classes.dex */
public class C5099to extends AbstractC5096k4 {

    /* JADX INFO: renamed from: du */
    private String f14031du;

    /* JADX INFO: renamed from: h4 */
    private String f14032h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f14033m9;

    /* JADX INFO: renamed from: to */
    private C5098m9 f14034to;

    public C5099to(C5098m9 c5098m9, String str, String str2, boolean z) {
        super(c5098m9);
        if (str2 == null) {
            throw new ArgumentNullException("namespaceURI");
        }
        this.f14031du = c5098m9.mo21874x1().mo65268x1(str);
        this.f14032h4 = str2;
        this.f14033m9 = z;
        if (c5098m9.mo21857kk() != 0) {
            C5098m9 c5098m92 = new C5098m9(c5098m9);
            this.f14034to = c5098m92;
            c5098m92.m52697um();
        }
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5099to(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo21770x1() {
        if (this.f14033m9) {
            this.f14033m9 = false;
            if (!this.f14022k4.m21847h4(this.f14031du, this.f14032h4)) {
                if (!this.f14022k4.mo21856k4(this.f14031du, this.f14032h4, this.f14034to)) {
                    return false;
                }
            }
        }
        this.f14023x1++;
        return true;
    }

    public C5099to(C5099to c5099to) {
        super(c5099to);
        this.f14034to = c5099to.f14034to;
        this.f14031du = c5099to.f14031du;
        this.f14032h4 = c5099to.f14032h4;
        this.f14033m9 = c5099to.f14033m9;
    }
}
