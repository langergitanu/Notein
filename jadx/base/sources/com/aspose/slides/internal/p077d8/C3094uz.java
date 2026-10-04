package com.aspose.slides.internal.p077d8;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.uz */
/* JADX INFO: loaded from: classes3.dex */
public class C3094uz {

    /* JADX INFO: renamed from: k4 */
    private static final String[] f9195k4 = {"JPEG", "GIF", "PNG", "BMP"};

    /* JADX INFO: renamed from: x1 */
    private static final String[] f9196x1 = {"image/jpeg", "image/gif", "image/png", "image/bmp"};

    /* JADX INFO: renamed from: c5 */
    private boolean f9197c5;

    /* JADX INFO: renamed from: ck */
    private boolean f9198ck;

    /* JADX INFO: renamed from: du */
    private int f9199du;

    /* JADX INFO: renamed from: dy */
    private int f9200dy;

    /* JADX INFO: renamed from: fa */
    private int f9201fa;

    /* JADX INFO: renamed from: h4 */
    private int f9202h4;

    /* JADX INFO: renamed from: jd */
    private List<String> f9203jd;

    /* JADX INFO: renamed from: kk */
    private int f9204kk;

    /* JADX INFO: renamed from: ks */
    private AbstractC3150x6 f9205ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f9206m9;

    /* JADX INFO: renamed from: to */
    private int f9207to;

    /* JADX INFO: renamed from: up */
    private int f9208up;

    /* JADX INFO: renamed from: yj */
    private int f9209yj;

    public C3094uz() {
        this.f9202h4 = -1;
        this.f9197c5 = true;
        this.f9205ks = null;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r4v13, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: du */
    private boolean m13150du() {
        AbstractC3150x6 abstractC3150x6;
        long position;
        int i;
        byte[] bArr = new byte[12];
        while (true) {
            if (this.f9205ks.read(bArr, 0, 4) != 4) {
                return false;
            }
            int iM13155kk = m13155kk(bArr, 0);
            int iM13155kk2 = m13155kk(bArr, 2);
            if ((iM13155kk & 65280) != 65280) {
                return false;
            }
            if (iM13155kk == 65504) {
                if ((iM13155kk2 < 14 && iM13155kk2 != 8) || this.f9205ks.read(bArr, 0, 12) != 12) {
                    return false;
                }
                if (m13154k4(new byte[]{74, 70, 73, 70, 0}, 0, bArr, 0, 5)) {
                    byte b = bArr[7];
                    if ((b & 255) == 1) {
                        this.f9209yj = m13155kk(bArr, 8);
                        this.f9208up = m13155kk(bArr, 10);
                    } else if ((b & 255) == 2) {
                        int iM13155kk3 = m13155kk(bArr, 8);
                        int iM13155kk4 = m13155kk(bArr, 10);
                        this.f9209yj = PackageManager.getPackageInfo((String) iM13155kk3, 1076006748);
                        this.f9208up = PackageManager.getPackageInfo((String) iM13155kk4, 1076006748);
                    }
                }
                abstractC3150x6 = this.f9205ks;
                position = abstractC3150x6.getPosition();
                i = iM13155kk2 - 14;
            } else if (this.f9197c5 && iM13155kk2 > 2 && iM13155kk == 65534) {
                int i2 = iM13155kk2 - 2;
                byte[] bArr2 = new byte[i2];
                if (this.f9205ks.read(bArr2, 0, i2) != i2) {
                    return false;
                }
                m13153k4(C14113y2.m67440x1(C12555c5.m58553k4("iso-8859-1").m26681x1(bArr2)));
            } else {
                if (iM13155kk >= 65472 && iM13155kk <= 65487 && iM13155kk != 65476 && iM13155kk != 65480) {
                    if (this.f9205ks.read(bArr, 0, 6) != 6) {
                        return false;
                    }
                    this.f9200dy = 0;
                    this.f9199du = (bArr[0] & 255) * (bArr[5] & 255);
                    this.f9206m9 = iM13155kk == 65474 || iM13155kk == 65478 || iM13155kk == 65482 || iM13155kk == 65486;
                    this.f9204kk = m13155kk(bArr, 3);
                    this.f9207to = m13155kk(bArr, 1);
                    return true;
                }
                abstractC3150x6 = this.f9205ks;
                position = abstractC3150x6.getPosition();
                i = iM13155kk2 - 2;
            }
            abstractC3150x6.setPosition(position + ((long) i));
        }
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m13151h4() {
        byte[] bArr = {78, 71, 13, 10, 26, 10};
        byte[] bArr2 = new byte[27];
        if (this.f9205ks.read(bArr2, 0, 27) != 27 || !m13154k4(bArr2, 0, bArr, 0, 6)) {
            return false;
        }
        this.f9200dy = 2;
        this.f9204kk = m13152k4(bArr2, 14);
        this.f9207to = m13152k4(bArr2, 18);
        int i = bArr2[22] & 255;
        this.f9199du = i;
        int i2 = bArr2[23] & 255;
        if (i2 == 2 || i2 == 6) {
            this.f9199du = i * 3;
        }
        this.f9206m9 = (bArr2[26] & 255) != 0;
        return true;
    }

    /* JADX INFO: renamed from: kk */
    private int m13155kk(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX INFO: renamed from: to */
    private int m13157to(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: x1 */
    private int m13159x1(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m13160k4() {
        return this.f9200dy;
    }

    public C3094uz(AbstractC3150x6 abstractC3150x6) {
        this.f9202h4 = -1;
        this.f9197c5 = true;
        this.f9205ks = abstractC3150x6;
    }

    /* JADX INFO: renamed from: k4 */
    private int m13152k4(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m13156kk() {
        byte[] bArr = new byte[44];
        if (this.f9205ks.read(bArr, 0, 44) != 44) {
            return false;
        }
        this.f9204kk = m13159x1(bArr, 16);
        int iM13159x1 = m13159x1(bArr, 20);
        this.f9207to = iM13159x1;
        if (this.f9204kk < 1 || iM13159x1 < 1) {
            return false;
        }
        int iM13157to = m13157to(bArr, 26);
        this.f9199du = iM13157to;
        if (iM13157to != 1 && iM13157to != 4 && iM13157to != 8 && iM13157to != 16 && iM13157to != 24 && iM13157to != 32) {
            return false;
        }
        int iOooO00o = OooO00o.OooO00o(m13159x1(bArr, 36), 0.0254d, 14);
        if (iOooO00o > 0) {
            this.f9209yj = iOooO00o;
        }
        int iOooO00o2 = OooO00o.OooO00o(m13159x1(bArr, 40), 0.0254d, 14);
        if (iOooO00o2 > 0) {
            this.f9208up = iOooO00o2;
        }
        this.f9200dy = 3;
        return true;
    }

    /* JADX INFO: renamed from: to */
    private boolean m13158to() {
        C3094uz c3094uz;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr = {70, 56, 55, 97};
        byte[] bArr2 = {70, 56, 57, 97};
        byte[] bArr3 = new byte[11];
        if (this.f9205ks.read(bArr3, 0, 11) != 11) {
            return false;
        }
        if (m13154k4(bArr3, 0, bArr2, 0, 4)) {
            c3094uz = this;
        } else {
            c3094uz = this;
            if (!c3094uz.m13154k4(bArr3, 0, bArr, 0, 4)) {
                return false;
            }
        }
        c3094uz.f9200dy = 1;
        c3094uz.f9204kk = m13157to(bArr3, 4);
        c3094uz.f9207to = m13157to(bArr3, 6);
        byte b = bArr3[8];
        c3094uz.f9199du = (((b & 255) >> 4) & 7) + 1;
        c3094uz.f9206m9 = (b & 2) != 0;
        if (!c3094uz.f9198ck) {
            return true;
        }
        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            int i5 = (1 << ((b & 7) + 1)) * 3;
            AbstractC3150x6 abstractC3150x6 = c3094uz.f9205ks;
            abstractC3150x6.setPosition(abstractC3150x6.getPosition() + ((long) i5));
        }
        c3094uz.f9201fa = 0;
        do {
            i = c3094uz.f9205ks.readByte();
            if (i == 33) {
                int i6 = c3094uz.f9205ks.readByte();
                if (c3094uz.f9197c5 && i6 == 254) {
                    C6765kp c6765kp = new C6765kp();
                    do {
                        i3 = c3094uz.f9205ks.readByte();
                        if (i3 == -1) {
                            return false;
                        }
                        if (i3 > 0) {
                            for (int i7 = 0; i7 < i3; i7++) {
                                int i8 = c3094uz.f9205ks.readByte();
                                if (i8 == -1) {
                                    return false;
                                }
                                c6765kp.m26780k4((char) i8);
                            }
                        }
                    } while (i3 > 0);
                } else {
                    do {
                        i2 = c3094uz.f9205ks.readByte();
                        if (i2 > 0) {
                            AbstractC3150x6 abstractC3150x62 = c3094uz.f9205ks;
                            abstractC3150x62.setPosition(abstractC3150x62.getPosition() + ((long) i2));
                        } else if (i2 == -1) {
                            return false;
                        }
                    } while (i2 > 0);
                }
            } else if (i != 44) {
                if (i != 59) {
                    return false;
                }
            } else {
                if (c3094uz.f9205ks.read(bArr3, 0, 9) != 9) {
                    return false;
                }
                byte b2 = bArr3[8];
                int i9 = (b2 & 7) + 1;
                if (i9 > c3094uz.f9199du) {
                    c3094uz.f9199du = i9;
                }
                if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    AbstractC3150x6 abstractC3150x63 = c3094uz.f9205ks;
                    abstractC3150x63.setPosition(abstractC3150x63.getPosition() + ((long) ((1 << i9) * 3)));
                }
                AbstractC3150x6 abstractC3150x64 = c3094uz.f9205ks;
                abstractC3150x64.setPosition(abstractC3150x64.getPosition() + 1);
                do {
                    i4 = c3094uz.f9205ks.readByte();
                    if (i4 > 0) {
                        AbstractC3150x6 abstractC3150x65 = c3094uz.f9205ks;
                        abstractC3150x65.setPosition(abstractC3150x65.getPosition() + ((long) i4));
                    } else if (i4 == -1) {
                        return false;
                    }
                } while (i4 > 0);
                c3094uz.f9201fa++;
            }
        } while (i != 59);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m13161x1() {
        AbstractC3150x6 abstractC3150x6 = this.f9205ks;
        if (abstractC3150x6 == null) {
            return false;
        }
        this.f9200dy = -1;
        this.f9204kk = -1;
        this.f9207to = -1;
        this.f9199du = -1;
        this.f9201fa = 1;
        this.f9208up = -1;
        this.f9209yj = -1;
        this.f9203jd = null;
        abstractC3150x6.setPosition(0L);
        try {
            int i = this.f9205ks.readByte() & 255;
            int i2 = this.f9205ks.readByte() & 255;
            if (i == 71 && i2 == 73) {
                return m13158to();
            }
            if (i == 137 && i2 == 80) {
                return m13151h4();
            }
            if (i == 255 && i2 == 216) {
                return m13150du();
            }
            if (i == 66 && i2 == 77) {
                return m13156kk();
            }
            return false;
        } catch (IOException e) {
            C3085sv.m13082k4(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m13153k4(String str) {
        if (this.f9203jd == null) {
            this.f9203jd = new List<>();
        }
        this.f9203jd.addItem(str);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m13154k4(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i2 + 1;
            if ((bArr[i] & 255) != (bArr2[i2] & 255)) {
                return false;
            }
            i = i5;
            i3 = i4;
            i2 = i6;
        }
    }
}
