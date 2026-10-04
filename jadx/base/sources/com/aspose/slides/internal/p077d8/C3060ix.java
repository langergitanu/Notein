package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.ix */
/* JADX INFO: loaded from: classes3.dex */
public class C3060ix implements InterfaceC3096vh {

    /* JADX INFO: renamed from: k4 */
    private final List<C3075ne> f9091k4;

    public C3060ix() {
        this.f9091k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public List<C3075ne> m12956k4() {
        return this.f9091k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00df A[PHI: r1
      0x00df: PHI (r1v14 int) = (r1v11 int), (r1v20 int) binds: [B:30:0x014b, B:17:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.internal.p077d8.InterfaceC3096vh
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] mo12907x1() {
        String strM67422kk;
        if (this.f9091k4.size() <= 0) {
            C3152yj c3152yj = new C3152yj();
            C3110yd.m13242k4(c3152yj, 65);
            C3110yd.m13242k4(c3152yj, 4);
            C3110yd.m13242k4(c3152yj, 0);
            return c3152yj.toArray();
        }
        int i = 12;
        int i2 = 12;
        for (int i3 = 0; i3 < this.f9091k4.size(); i3++) {
            int length = this.f9091k4.get_Item(i3).m13015x1().length() + 1;
            int i4 = (length * 2) + i2 + 52;
            if ((length & 1) != 0) {
                i4 += 2;
            }
            i2 = i4;
        }
        byte[] bArr = new byte[i2];
        C3110yd.m13243k4(bArr, 0, 65);
        C3110yd.m13243k4(bArr, 2, 0);
        C3110yd.m13258x1(bArr, 4, i2 - 8);
        C3110yd.m13258x1(bArr, 8, this.f9091k4.size() * 6);
        for (int i5 = 0; i5 < this.f9091k4.size(); i5++) {
            C3110yd.m13258x1(bArr, i, 3);
            C3110yd.m13258x1(bArr, i + 4, 7);
            C3110yd.m13258x1(bArr, i + 8, 3);
            C3110yd.m13258x1(bArr, i + 12, 6);
            C3110yd.m13258x1(bArr, i + 16, 3);
            C3110yd.m13258x1(bArr, i + 20, 0);
            C3110yd.m13258x1(bArr, i + 24, 3);
            C3110yd.m13258x1(bArr, i + 28, 7);
            int iM13014k4 = this.f9091k4.get_Item(i5).m13014k4();
            C3110yd.m13258x1(bArr, i + 32, 31);
            int i6 = i + 36;
            if (iM13014k4 == 1) {
                C3110yd.m13258x1(bArr, i6, 1);
                C3110yd.m13258x1(bArr, i + 40, 0);
                C3110yd.m13258x1(bArr, i + 44, 31);
                int length2 = this.f9091k4.get_Item(i5).m13015x1().length();
                int i7 = length2 + 1;
                C3110yd.m13258x1(bArr, i + 48, i7);
                int i8 = i + 52;
                new C6773ss().mo26659k4(this.f9091k4.get_Item(i5).m13015x1(), 0, length2, bArr, i8);
                i = (i7 * 2) + i8;
                if ((i7 & 1) != 0) {
                    i += 2;
                }
            } else {
                String strM13015x1 = this.f9091k4.get_Item(i5).m13015x1();
                if (C14113y2.m67429to(strM13015x1, '#') >= 0) {
                    int iM67429to = C14113y2.m67429to(strM13015x1, '#');
                    strM67422kk = C14113y2.m67422kk(strM13015x1, iM67429to + 1);
                    strM13015x1 = C14113y2.m67443x1(strM13015x1, 0, iM67429to);
                } else {
                    strM67422kk = "";
                }
                String str = strM67422kk;
                String str2 = strM13015x1;
                int length3 = str2.length();
                int i9 = length3 + 1;
                C3110yd.m13258x1(bArr, i6, i9);
                int i10 = i + 40;
                C6773ss c6773ss = new C6773ss();
                c6773ss.mo26659k4(str2, 0, length3, bArr, i10);
                int i11 = (i9 * 2) + i10;
                if ((i9 & 1) != 0) {
                    i11 += 2;
                }
                C3110yd.m13258x1(bArr, i11, 31);
                int i12 = i11 + 4;
                if (str.length() > 0) {
                    int length4 = str.length();
                    int i13 = length4 + 1;
                    C3110yd.m13258x1(bArr, i12, i13);
                    int i14 = i11 + 8;
                    c6773ss.mo26659k4(str, 0, length4, bArr, i14);
                    i = (i13 * 2) + i14;
                    if ((i13 & 1) != 0) {
                    }
                } else {
                    C3110yd.m13258x1(bArr, i12, 1);
                    C3110yd.m13258x1(bArr, i11 + 8, 0);
                    i = i11 + 12;
                }
            }
        }
        return bArr;
    }

    public C3060ix(C3114yo c3114yo) {
        String strM67408k4;
        List<C3075ne> list = new List<>();
        this.f9091k4 = list;
        byte[] bArrMo12907x1 = c3114yo.mo12907x1();
        String[] strArr = {""};
        if (C3110yd.m13249kk(bArrMo12907x1, 0) == 30) {
            c3114yo.m13288k4(strArr, 1251);
            list.add(new C3075ne(2, strArr[0]));
            return;
        }
        int iM13249kk = C3110yd.m13249kk(bArrMo12907x1, 8);
        if (bArrMo12907x1.length < iM13249kk / 6) {
            return;
        }
        int i = 12;
        while (iM13249kk > 0) {
            int iM13249kk2 = C3110yd.m13249kk(bArrMo12907x1, i + 36);
            int i2 = i + 40;
            int i3 = 1;
            if (iM13249kk2 == 1) {
                int iM13249kk3 = C3110yd.m13249kk(bArrMo12907x1, i + 48);
                int i4 = i + 52;
                strM67408k4 = new C6773ss().mo26682x1(bArrMo12907x1, i4, (iM13249kk3 - 1) * 2);
                int i5 = (iM13249kk3 * 2) + i4;
                i = (iM13249kk3 & 1) != 0 ? i5 + 2 : i5;
            } else {
                C6773ss c6773ss = new C6773ss();
                String strMo26682x1 = c6773ss.mo26682x1(bArrMo12907x1, i2, (iM13249kk2 - 1) * 2);
                int i6 = (iM13249kk2 * 2) + i2;
                i6 = (iM13249kk2 & 1) != 0 ? i6 + 2 : i6;
                int iM13249kk4 = C3110yd.m13249kk(bArrMo12907x1, i6 + 4);
                int i7 = i6 + 8;
                if (iM13249kk4 > 1) {
                    String strMo26682x12 = c6773ss.mo26682x1(bArrMo12907x1, i7, (iM13249kk4 - 1) * 2);
                    int i8 = (iM13249kk4 * 2) + i7;
                    i8 = (iM13249kk4 & 1) != 0 ? i8 + 2 : i8;
                    strM67408k4 = C14113y2.m67408k4(strMo26682x1, "#", strMo26682x12);
                    i = i8;
                    i3 = 2;
                } else {
                    strM67408k4 = strMo26682x1;
                    i3 = 2;
                    i = i6 + 12;
                }
            }
            this.f9091k4.addItem(new C3075ne(i3, strM67408k4));
            iM13249kk -= 6;
        }
    }
}
