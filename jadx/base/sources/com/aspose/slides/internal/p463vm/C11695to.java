package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p527yk.C12850k4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11695to extends AbstractC11694rv {

    /* JADX INFO: renamed from: x1 */
    public static int f39624x1 = 1;

    /* JADX INFO: renamed from: k4 */
    int f39625k4;

    public C11695to() {
        this(1);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11695to c11695to = new C11695to(m55233k4());
        c11695to.mo55087k4(mo55082du());
        return c11695to;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55082du() {
        if (this.f39622du == -1) {
            this.f39622du = 2029;
        }
        return this.f39622du;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: h4 */
    public int mo55084h4() {
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public int m55233k4() {
        return this.f39625k4;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public int mo55088kk(C14084qq c14084qq) {
        return 1;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public int mo55090to(C14084qq c14084qq) {
        return C12850k4.m59895k4(c14084qq.m67130fa(), 2);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int mo55092x1(C14084qq c14084qq) {
        return ((int) ((c14084qq.m67130fa() / 864000000000L) + 1)) % 7;
    }

    public C11695to(int i) {
        if (i < 1 || i > 12) {
            throw new ArgumentOutOfRangeException(C18437z2.f56754h);
        }
        this.f39625k4 = i;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55083du(C14084qq c14084qq) {
        return C12850k4.m59895k4(c14084qq.m67130fa(), 0);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public int mo55085k4(C14084qq c14084qq) {
        return C12850k4.m59895k4(c14084qq.m67130fa(), 3);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public C14084qq mo55089kk() {
        return C14084qq.f47293kk.Clone();
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public C14084qq mo55091to() {
        return C14084qq.f47299x1.Clone();
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int[] mo55093x1() {
        return new int[]{1};
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public C14084qq mo55086k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0 || i8 == 1) {
            return new C14084qq(i, i2, i3, i4, i5, i6, i7);
        }
        throw new ArgumentOutOfRangeException("era");
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public void mo55087k4(int i) {
        super.m55232m9();
        if (i < 99 || i > 9999) {
            throw new ArgumentOutOfRangeException("year");
        }
        this.f39622du = i;
    }
}
