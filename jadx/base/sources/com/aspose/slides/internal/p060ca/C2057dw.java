package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dw */
/* JADX INFO: loaded from: classes3.dex */
public class C2057dw extends AbstractC2281rv {

    /* JADX INFO: renamed from: c5 */
    private List<Byte> f7102c5;

    /* JADX INFO: renamed from: ck */
    private int f7103ck;

    /* JADX INFO: renamed from: du */
    private C2255q6 f7104du;

    /* JADX INFO: renamed from: dy */
    private int f7105dy;

    /* JADX INFO: renamed from: h4 */
    private C2331uz f7106h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f7107jd;

    /* JADX INFO: renamed from: m9 */
    private byte[] f7108m9;

    public C2057dw(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        this.f7107jd = new byte[2];
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("currentfile eexec\n"), AbstractC6747ar.m26650yj().mo26677to("currentfile eexec\r\n"), AbstractC6747ar.m26650yj().mo26677to("currentfile eexec\r")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("0000000000000000000")};
        this.f7102c5 = new List<>(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10225k4(int i) {
        boolean z = false;
        byte b = this.f7514to[i];
        if (this.f7106h4 == null) {
            this.f7106h4 = m11351rv().m10702kk() ? new C2331uz(this.f7514to.length - (i / 2)) : new C2331uz(this.f7514to.length - i);
        }
        if (m11351rv().m10702kk()) {
            byte[] bArr = {0};
            boolean zM10436k4 = m10436k4(this.f7514to[i], bArr);
            byte b2 = bArr[0];
            if (zM10436k4) {
                byte[] bArr2 = this.f7107jd;
                int i2 = this.f7103ck;
                int i3 = i2 + 1;
                this.f7103ck = i3;
                bArr2[i2] = b2;
                if (i3 >= 2) {
                    b = (byte) (((bArr2[0] & 255) * 16) + (bArr2[1] & 255));
                    this.f7103ck = 0;
                    z = true;
                }
            }
        } else if (this.f7105dy > 0) {
            z = true;
        } else if (this.f7102c5.size() != 0 || (this.f7514to[i] & 255) == 128) {
            if (this.f7102c5.size() == 1) {
                byte b3 = this.f7514to[i];
                if ((b3 & 255) != 2 && (b3 & 255) != 1) {
                    this.f7105dy = Integer.MAX_VALUE;
                    z = true;
                }
            }
            this.f7102c5.addItem(Byte.valueOf(this.f7514to[i]));
            if (this.f7102c5.size() == 6) {
                int iByteValue = (this.f7102c5.get_Item(5).byteValue() & 255) << 24;
                this.f7105dy = iByteValue;
                int iByteValue2 = iByteValue + ((this.f7102c5.get_Item(4).byteValue() & 255) << 16);
                this.f7105dy = iByteValue2;
                int iByteValue3 = iByteValue2 + ((this.f7102c5.get_Item(3).byteValue() & 255) << 8);
                this.f7105dy = iByteValue3;
                this.f7105dy = iByteValue3 + (this.f7102c5.get_Item(2).byteValue() & 255);
                this.f7102c5.clear();
            }
        }
        if (z) {
            this.f7106h4.m11552k4(this.f7104du.m11274k4(b));
            if (!m11351rv().m10702kk()) {
                this.f7105dy--;
            }
        }
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7104du = new C2255q6(0);
        this.f7105dy = 0;
        this.f7106h4 = null;
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: z_ */
    public void mo10281z_() {
        this.f7108m9 = new byte[this.f7106h4.m11554x1()];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f7106h4.m11553k4()), 0, AbstractC14092to.m67208k4((Object) this.f7108m9), 0, this.f7106h4.m11554x1());
        this.f7106h4 = null;
        super.mo10281z_();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m10436k4(byte b, byte[] bArr) {
        bArr[0] = b;
        if ((b & 255) >= 48 && (b & 255) <= 57) {
            bArr[0] = (byte) ((b & 255) - 48);
            return true;
        }
        if ((b & 255) >= 65 && (b & 255) <= 70) {
            bArr[0] = (byte) ((b & 255) - 55);
            return true;
        }
        if ((b & 255) < 97 || (b & 255) > 102) {
            return false;
        }
        bArr[0] = (byte) ((b & 255) - 87);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m10437k4() {
        return this.f7108m9;
    }
}
