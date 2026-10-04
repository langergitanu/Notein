package com.aspose.slides.internal.p184ik;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5097kk extends AbstractC5096k4 {

    /* JADX INFO: renamed from: du */
    private String f14024du;

    /* JADX INFO: renamed from: to */
    private String f14025to;

    public C5097kk(C5097kk c5097kk) {
        super(c5097kk);
        this.f14025to = c5097kk.f14025to;
        this.f14024du = c5097kk.f14024du;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5097kk(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        if (this.f14023x1 == 0) {
            if (!this.f14022k4.mo21860kk(this.f14025to, this.f14024du)) {
                return false;
            }
        } else if (!this.f14022k4.mo21870to(this.f14025to, this.f14024du)) {
            return false;
        }
        this.f14023x1++;
        return true;
    }

    public C5097kk(C5098m9 c5098m9, String str, String str2) {
        super(c5098m9);
        if (str2 == null) {
            throw new ArgumentNullException("namespaceURI");
        }
        this.f14025to = c5098m9.mo21874x1().mo65268x1(str);
        this.f14024du = str2;
    }
}
