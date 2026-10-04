package com.aspose.slides.internal.p368qq;

import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p444um.C11448k4;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.ar */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9911ar implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private boolean f35776c5;

    /* JADX INFO: renamed from: du */
    private char[] f35777du;

    /* JADX INFO: renamed from: dy */
    private int f35778dy;

    /* JADX INFO: renamed from: h4 */
    private int f35779h4;

    /* JADX INFO: renamed from: k4 */
    protected int f35780k4;

    /* JADX INFO: renamed from: kk */
    private C3144um f35781kk;

    /* JADX INFO: renamed from: m9 */
    private int f35782m9;

    /* JADX INFO: renamed from: to */
    private String f35783to;

    /* JADX INFO: renamed from: x1 */
    protected int f35784x1;

    public AbstractC9911ar(InterfaceC12359fa interfaceC12359fa) {
        this(interfaceC12359fa.mo57918ck(), false);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC9911ar m48776k4(InterfaceC12359fa interfaceC12359fa) {
        return new C11448k4(interfaceC12359fa);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        C3144um c3144um = this.f35781kk;
        if (c3144um != null) {
            c3144um.dispose();
            this.f35781kk = null;
        }
    }

    /* JADX INFO: renamed from: du */
    public abstract void mo48777du();

    /* JADX INFO: renamed from: h4 */
    public int mo48778h4() {
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final String m48780kk() {
        char[] cArr = this.f35777du;
        int i = this.f35782m9;
        return C14113y2.m67406k4(cArr, i, this.f35778dy - i);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m48781m9() {
        do {
            m48783x1();
        } while (this.f35780k4 != -1);
    }

    /* JADX INFO: renamed from: to */
    public final int m48782to() {
        this.f35782m9 = this.f35779h4 - 1;
        mo48777du();
        this.f35778dy = this.f35779h4 - mo48778h4();
        return this.f35784x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m48783x1() {
        int iMo13056h4;
        int iMo13056h42 = this.f35781kk.mo13056h4();
        this.f35780k4 = iMo13056h42;
        if (this.f35776c5 && iMo13056h42 == 32) {
            do {
                iMo13056h4 = this.f35781kk.mo13056h4();
                this.f35780k4 = iMo13056h4;
            } while (iMo13056h4 == 32);
        }
        int i = this.f35780k4;
        if (i == -1) {
            return i;
        }
        int i2 = this.f35779h4;
        char[] cArr = this.f35777du;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length + cArr.length];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f35777du = cArr2;
        }
        char[] cArr3 = this.f35777du;
        int i3 = this.f35779h4;
        this.f35779h4 = i3 + 1;
        int i4 = this.f35780k4;
        cArr3[i3] = (char) i4;
        return i4;
    }

    public AbstractC9911ar(String str, boolean z) {
        this.f35777du = new char[128];
        this.f35783to = str;
        this.f35776c5 = z;
        this.f35781kk = new C3144um(m48779k4());
        this.f35780k4 = m48783x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m48779k4() {
        return this.f35783to;
    }
}
