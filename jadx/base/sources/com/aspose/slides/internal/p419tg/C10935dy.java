package com.aspose.slides.internal.p419tg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14098up;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C10935dy extends C10934du {

    /* JADX INFO: renamed from: to */
    private byte[] f38030to;

    public C10935dy() {
        this.f38027k4 = "2.5.29.35";
    }

    /* JADX INFO: renamed from: h4 */
    public byte[] m52724h4() {
        byte[] bArr = this.f38030to;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: k4 */
    public void mo25217k4() {
        C12842x1 c12842x1 = new C12842x1(this.f38028kk.m59717to());
        if (C7019kk.m27462to(Byte.valueOf(c12842x1.m59718x1()), 6) != 48) {
            throw new ArgumentException("Invalid AuthorityKeyIdentifier extension");
        }
        for (int i = 0; i < c12842x1.m59709k4(); i++) {
            C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(i);
            if (c12842x1M59710k4.m59718x1() == -128) {
                this.f38030to = c12842x1M59710k4.m59717to();
            }
        }
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (this.f38030to != null) {
            c6765kp.m26792k4("KeyID=");
            int i = 0;
            while (true) {
                byte[] bArr = this.f38030to;
                if (i >= bArr.length) {
                    break;
                }
                c6765kp.m26792k4(C14098up.m67321k4(bArr[i], "X2", C11697x1.m55250kk()));
                if (i % 2 == 1) {
                    c6765kp.m26792k4(" ");
                }
                i++;
            }
        }
        return c6765kp.toString();
    }

    public C10935dy(C10934du c10934du) {
        super(c10934du);
    }
}
