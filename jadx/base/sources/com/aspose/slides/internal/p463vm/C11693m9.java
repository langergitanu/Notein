package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p527yk.C12850k4;
import com.aspose.slides.internal.p527yk.C12854x1;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11693m9 extends AbstractC11694rv {

    /* JADX INFO: renamed from: k4 */
    static final C14084qq f39619k4 = new C14084qq(1868, 9, 8);

    /* JADX INFO: renamed from: x1 */
    C12854x1 f39620x1 = new C12854x1(this, C12850k4.m59902x1());

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11693m9 c11693m9 = new C11693m9();
        c11693m9.mo55087k4(mo55082du());
        return c11693m9;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55082du() {
        if (this.f39622du == -1) {
            this.f39622du = 99;
        }
        return this.f39622du;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: h4 */
    public int mo55084h4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public int mo55085k4(C14084qq c14084qq) {
        return this.f39620x1.m59924k4(c14084qq);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public int mo55088kk(C14084qq c14084qq) {
        return this.f39620x1.m59928kk(c14084qq);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public int mo55090to(C14084qq c14084qq) {
        return this.f39620x1.m59929to(c14084qq);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int mo55092x1(C14084qq c14084qq) {
        return this.f39620x1.m59931x1(c14084qq);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55083du(C14084qq c14084qq) {
        return this.f39620x1.m59921du(c14084qq);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public C14084qq mo55086k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return this.f39620x1.m59925k4(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public C14084qq mo55089kk() {
        return C14084qq.f47293kk.Clone();
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public C14084qq mo55091to() {
        return f39619k4;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int[] mo55093x1() {
        return this.f39620x1.m59927k4();
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public void mo55087k4(int i) {
        super.m55232m9();
        if (i < 99 || i > this.f39620x1.m59930x1()) {
            throw new ArgumentOutOfRangeException("year");
        }
        this.f39622du = i;
    }
}
