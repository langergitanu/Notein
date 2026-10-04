package com.aspose.slides.internal.p077d8;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.yo */
/* JADX INFO: loaded from: classes3.dex */
public class C3114yo implements InterfaceC3096vh {

    /* JADX INFO: renamed from: k4 */
    private int f9251k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f9252x1;

    public C3114yo(double d) {
        this.f9251k4 = 5;
        this.f9252x1 = C14069jd.m66773k4(d);
    }

    /* JADX INFO: renamed from: k4 */
    private void m13280k4(C3152yj c3152yj, C3149x1 c3149x1) {
        int length = ((int) c3152yj.getLength()) % 4;
        if (length > 0) {
            c3149x1.m13450k4(new byte[length]);
        }
    }

    @Override // com.aspose.slides.internal.p077d8.InterfaceC3096vh
    /* JADX INFO: renamed from: x1 */
    public final byte[] mo12907x1() {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13446k4(this.f9251k4 & 65535);
                c3149x1.m13446k4(0);
                c3149x1.m13450k4(this.f9252x1);
                m13280k4(c3152yj, c3149x1);
                c3149x1.m13454x1();
                return c3152yj.toArray();
            } finally {
                c3149x1.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    public C3114yo(float f) {
        this.f9251k4 = 4;
        this.f9252x1 = C14069jd.m66774k4(f);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13281k4() {
        int i = this.f9251k4;
        return i == 30 || i == 31 || i == 2 || i == 3 || i == 64 || i == 11 || i == 4 || i == 5;
    }

    public C3114yo(int i) {
        this.f9251k4 = 3;
        byte[] bArr = new byte[4];
        this.f9252x1 = bArr;
        C3110yd.m13236h4(bArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13282k4(double[] dArr) {
        if (this.f9251k4 == 5) {
            dArr[0] = C14069jd.m66764c5(this.f9252x1, 0);
            return true;
        }
        dArr[0] = 0.0d;
        return false;
    }

    public C3114yo(int i, byte[] bArr) {
        this.f9251k4 = i;
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13450k4(bArr);
                m13280k4(c3152yj, c3149x1);
                this.f9252x1 = c3152yj.toArray();
            } finally {
                c3149x1.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13283k4(float[] fArr) {
        if (this.f9251k4 == 4) {
            fArr[0] = C14069jd.m66766dy(this.f9252x1, 0);
            return true;
        }
        fArr[0] = 0.0f;
        return false;
    }

    public C3114yo(C3072m9 c3072m9) {
        this.f9251k4 = 65;
        byte[] bArrM12985x1 = c3072m9.m12985x1();
        this.f9252x1 = C3110yd.m13251kk(bArrM12985x1, 0, bArrM12985x1.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13284k4(int[] iArr) {
        if (this.f9251k4 == 3) {
            iArr[0] = C3110yd.m13249kk(this.f9252x1, 0);
            return true;
        }
        iArr[0] = 0;
        return false;
    }

    public C3114yo(C14084qq c14084qq) {
        C14084qq c14084qqClone = C14084qq.m67120x1(0L).Clone();
        this.f9251k4 = 64;
        this.f9252x1 = new byte[8];
        C14084qq c14084qqClone2 = c14084qq.Clone();
        if (C14084qq.m67110kk(c14084qq, c14084qqClone)) {
            c14084qqClone.CloneTo(c14084qqClone2);
        }
        C3110yd.m13247k4(this.f9252x1, c14084qqClone2.m67157x6());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13285k4(long[] jArr) {
        if (this.f9251k4 != 64) {
            jArr[0] = 0;
            return false;
        }
        jArr[0] = (C3110yd.m13253to(this.f9252x1, 0) & 4294967295L) | (C3110yd.m13253to(this.f9252x1, 4) << 32);
        return true;
    }

    public C3114yo(String str) {
        this(str, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13286k4(C3072m9[] c3072m9Arr) {
        if (this.f9251k4 == 65) {
            c3072m9Arr[0] = new C3072m9(this.f9252x1);
            return true;
        }
        c3072m9Arr[0] = null;
        return false;
    }

    public C3114yo(String str, boolean z) {
        byte[] bArr;
        AbstractC14092to abstractC14092toM67208k4;
        AbstractC14092to abstractC14092toM67208k42;
        int length;
        int length2 = str.length();
        int i = length2 + 1;
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        c3149x1.m13447k4(((long) i) & 4294967295L);
        i = i % 2 == 1 ? length2 + 2 : i;
        if (z) {
            this.f9251k4 = 31;
            bArr = new byte[i * 2];
            byte[] bArrMo26677to = C12555c5.m58552k4(1200).mo26677to(str);
            abstractC14092toM67208k4 = AbstractC14092to.m67208k4((Object) bArrMo26677to);
            abstractC14092toM67208k42 = AbstractC14092to.m67208k4((Object) bArr);
            length = bArrMo26677to.length;
        } else {
            this.f9251k4 = 30;
            bArr = new byte[i];
            byte[] bArrMo26677to2 = C12555c5.m58552k4(1251).mo26677to(str);
            abstractC14092toM67208k4 = AbstractC14092to.m67208k4((Object) bArrMo26677to2);
            abstractC14092toM67208k42 = AbstractC14092to.m67208k4((Object) bArr);
            length = bArrMo26677to2.length;
        }
        AbstractC14092to.m67220k4(abstractC14092toM67208k4, abstractC14092toM67208k42, length);
        c3149x1.m13450k4(bArr);
        c3149x1.m13454x1();
        this.f9252x1 = c3152yj.toArray();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13287k4(C14084qq[] c14084qqArr) {
        C14084qq.m67120x1(0L).CloneTo(c14084qqArr[0]);
        if (this.f9251k4 != 64) {
            return false;
        }
        long[] jArr = {0};
        boolean zM13285k4 = m13285k4(jArr);
        long j = jArr[0];
        if (!zM13285k4) {
            return false;
        }
        try {
            C14084qq.m67120x1(j).CloneTo(c14084qqArr[0]);
            return true;
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return false;
        }
    }

    public C3114yo(short s) {
        this.f9251k4 = 2;
        byte[] bArr = new byte[4];
        this.f9252x1 = bArr;
        C3110yd.m13248k4(bArr, s);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13288k4(String[] strArr, int i) {
        int i2 = this.f9251k4;
        if (i2 == 30 || i2 == 31) {
            if (i2 == 31) {
                i = 1200;
            }
            try {
                AbstractC6747ar abstractC6747arM58552k4 = C12555c5.m58552k4(i);
                byte[] bArr = this.f9252x1;
                String strMo26682x1 = abstractC6747arM58552k4.mo26682x1(bArr, 4, bArr.length - 4);
                int length = strMo26682x1.length();
                int iM67429to = C14113y2.m67429to(strMo26682x1, (char) 0);
                if (iM67429to >= 0) {
                    strMo26682x1 = C14113y2.m67396k4(strMo26682x1, iM67429to, length - iM67429to);
                }
                strArr[0] = strMo26682x1;
                return true;
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
        strArr[0] = C14113y2.f47374k4;
        return false;
    }

    public C3114yo(boolean z) {
        this.f9251k4 = 11;
        byte[] bArr = new byte[4];
        this.f9252x1 = bArr;
        C3110yd.m13236h4(bArr, z ? 65535 : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13289k4(short[] sArr) {
        if (this.f9251k4 == 2) {
            sArr[0] = C3110yd.m13241k4(this.f9252x1, 0);
            return true;
        }
        sArr[0] = 0;
        return false;
    }

    public C3114yo(byte[] bArr) {
        this.f9251k4 = C3110yd.m13257x1(bArr, 0);
        this.f9252x1 = C3110yd.m13251kk(bArr, 4, bArr.length - 4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13290k4(boolean[] zArr) {
        if (this.f9251k4 != 11) {
            zArr[0] = false;
            return false;
        }
        byte[] bArr = this.f9252x1;
        if (bArr.length == 2) {
            zArr[0] = C3110yd.m13257x1(bArr, 0) != 0;
        } else {
            zArr[0] = C3110yd.m13253to(bArr, 0) != 0;
        }
        return true;
    }
}
