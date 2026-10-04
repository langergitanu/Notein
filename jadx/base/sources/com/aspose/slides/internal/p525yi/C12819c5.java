package com.aspose.slides.internal.p525yi;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p174hz.AbstractC4703bz;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.C4743qw;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12819c5 extends AbstractC4703bz {

    /* JADX INFO: renamed from: dy */
    private byte[] f42645dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f42646h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4705c6 f42647k4;

    /* JADX INFO: renamed from: m9 */
    private byte[] f42648m9;

    public C12819c5() {
        AbstractC4715g8 abstractC4715g8M19610du = AbstractC4715g8.m19610du();
        this.f42647k4 = abstractC4715g8M19610du;
        this.f13126kk = abstractC4715g8M19610du.m19587up();
        byte[] bArr = new byte[64];
        new C4743qw().mo19625x1(bArr);
        this.f13124du = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) bArr).deepClone(), byte[].class);
        mo18846c5();
    }

    /* JADX INFO: renamed from: du */
    private void m59610du() {
        byte[] bArr;
        this.f42648m9 = new byte[64];
        this.f42645dy = new byte[64];
        int i = 0;
        while (true) {
            bArr = this.f13124du;
            if (i >= bArr.length) {
                break;
            }
            this.f42648m9[i] = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArr[i]), 6) ^ 54), 9);
            this.f42645dy[i] = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f13124du[i]), 6) ^ 92), 9);
            i++;
        }
        for (int length = bArr.length; length < 64; length++) {
            this.f42648m9[length] = PatternStyle.DiagonalCross;
            this.f42645dy[length] = 92;
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        this.f42647k4.mo18846c5();
        m59610du();
        this.f42646h4 = false;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        if (!this.f42646h4) {
            AbstractC4705c6 abstractC4705c6 = this.f42647k4;
            byte[] bArr = this.f42648m9;
            abstractC4705c6.mo19562k4(bArr, 0, bArr.length, bArr, 0);
            this.f42646h4 = true;
        }
        this.f42647k4.mo19564k4(new byte[0], 0, 0);
        byte[] bArrM19584fa = this.f42647k4.m19584fa();
        this.f42647k4.mo18846c5();
        AbstractC4705c6 abstractC4705c62 = this.f42647k4;
        byte[] bArr2 = this.f42645dy;
        abstractC4705c62.mo19562k4(bArr2, 0, bArr2.length, bArr2, 0);
        this.f42647k4.mo19564k4(bArrM19584fa, 0, bArrM19584fa.length);
        mo18846c5();
        return this.f42647k4.m19584fa();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4703bz
    /* JADX INFO: renamed from: h4 */
    public byte[] mo19575h4() {
        return (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) this.f13124du).deepClone(), byte[].class);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4703bz
    /* JADX INFO: renamed from: k4 */
    public void mo19577k4(byte[] bArr) {
        if (this.f42646h4) {
            throw new Exception("Cannot change key during hash operation.");
        }
        if (bArr.length > 64) {
            this.f13124du = this.f42647k4.m19588x1(bArr);
        } else {
            this.f13124du = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) bArr).deepClone(), byte[].class);
        }
        m59610du();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        if (!this.f42646h4) {
            AbstractC4705c6 abstractC4705c6 = this.f42647k4;
            byte[] bArr2 = this.f42648m9;
            abstractC4705c6.mo19562k4(bArr2, 0, bArr2.length, bArr2, 0);
            this.f42646h4 = true;
        }
        this.f42647k4.mo19562k4(bArr, i, i2, bArr, i);
    }

    public C12819c5(AbstractC4705c6 abstractC4705c6, byte[] bArr) {
        this.f42647k4 = abstractC4705c6;
        this.f13126kk = abstractC4705c6.m19587up();
        if (bArr.length > 64) {
            this.f13124du = this.f42647k4.m19588x1(bArr);
        } else {
            this.f13124du = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) bArr).deepClone(), byte[].class);
        }
        mo18846c5();
    }
}
