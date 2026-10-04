package com.aspose.slides.internal.p389s0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10118du {

    /* JADX INFO: renamed from: du */
    private C10123kk f36250du;

    /* JADX INFO: renamed from: h4 */
    private C3152yj f36251h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f36252k4;

    /* JADX INFO: renamed from: kk */
    private C10125to f36253kk;

    /* JADX INFO: renamed from: m9 */
    private C10124m9 f36254m9;

    /* JADX INFO: renamed from: to */
    private C10117c5 f36255to;

    /* JADX INFO: renamed from: x1 */
    private C10120h4 f36256x1;

    public C10118du() {
    }

    /* JADX INFO: renamed from: k4 */
    private long m49699k4(AbstractC3150x6 abstractC3150x6, boolean z) {
        return m49700k4(abstractC3150x6, z, new int[]{0});
    }

    /* JADX INFO: renamed from: kk */
    private void m49704kk() {
        this.f36250du = new C10123kk();
        C3134k4 c3134k4 = new C3134k4(this.f36252k4, AbstractC6747ar.m26643rv());
        long jM49698x1 = this.f36256x1.f36266m9;
        while ((4294967295L & jM49698x1) != 4294967294L) {
            this.f36252k4.setPosition(C10121jd.m49714k4(jM49698x1, true));
            for (int i = 0; i < 4; i++) {
                this.f36250du.m49722k4(new C10126x1(c3134k4));
            }
            jM49698x1 = this.f36253kk.m49698x1(jM49698x1);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m49705to() {
        m49703k4(this.f36250du.m49720k4(0L), (C10124m9) null);
    }

    /* JADX INFO: renamed from: x1 */
    private void m49706x1() {
        int iM67507x1 = C14116yg.m67507x1(10, this.f36253kk.m49697to());
        for (long j = 0; (j & 4294967295L) < iM67507x1; j++) {
            if ((4294967295L & this.f36253kk.m49698x1(j)) != 0) {
                return;
            }
        }
        throw new InvalidOperationException("The FAT in the structured storage document seems to be corrupted.");
    }

    public C10118du(AbstractC3150x6 abstractC3150x6) {
        m49707x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    private long m49700k4(AbstractC3150x6 abstractC3150x6, boolean z, int[] iArr) {
        char c = 0;
        iArr[0] = 0;
        if (abstractC3150x6.getLength() == 0) {
            return 4294967294L;
        }
        boolean z2 = this.f36256x1.m49713k4(abstractC3150x6.getLength()) || z;
        C10117c5 c10117c5 = z2 ? this.f36253kk : this.f36255to;
        AbstractC3150x6 abstractC3150x62 = z2 ? this.f36252k4 : this.f36251h4;
        int i = z2 ? 512 : 64;
        long jM49716x1 = C10121jd.m49716x1(abstractC3150x62.getPosition(), z2);
        abstractC3150x6.setPosition(0L);
        C12565ks.m58615k4(abstractC3150x6, abstractC3150x62);
        C12565ks.m58614k4(abstractC3150x62, i);
        iArr[0] = C12565ks.m58609k4(abstractC3150x6.getLength(), i);
        long j = 1;
        while (true) {
            long j2 = j & 4294967295L;
            if (j2 >= iArr[c]) {
                c10117c5.m49694k4(4294967294L);
                return jM49716x1;
            }
            c10117c5.m49694k4(((jM49716x1 & 4294967295L) + j2) & 4294967295L);
            j++;
            c = 0;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m49707x1(AbstractC3150x6 abstractC3150x6) {
        this.f36252k4 = abstractC3150x6;
        abstractC3150x6.setPosition(0L);
        C10120h4 c10120h4 = new C10120h4(new C3134k4(this.f36252k4, AbstractC6747ar.m26643rv()));
        this.f36256x1 = c10120h4;
        C10125to c10125to = new C10125to(this.f36252k4, c10120h4);
        this.f36253kk = c10125to;
        c10125to.m49729k4();
        m49706x1();
        C10120h4 c10120h42 = this.f36256x1;
        this.f36255to = new C10117c5(m49701k4(c10120h42.f36257c5, c10120h42.m49711k4(), this.f36256x1.m49711k4(), true));
        m49704kk();
    }

    public C10118du(C10124m9 c10124m9) {
        this.f36254m9 = c10124m9;
    }

    /* JADX INFO: renamed from: k4 */
    private C3152yj m49701k4(long j, int i, int i2, boolean z) {
        int iM67507x1 = C14116yg.m67507x1(i, i2);
        C3152yj c3152yj = new C3152yj(iM67507x1);
        c3152yj.setLength(iM67507x1);
        int i3 = 0;
        boolean z2 = z || this.f36256x1.m49713k4((long) i);
        if (!z2) {
            C10126x1 c10126x1M49720k4 = this.f36250du.m49720k4(0L);
            long j2 = c10126x1M49720k4.f36274ck;
            if ((j2 & 4294967295L) != 4294967295L && this.f36251h4 == null) {
                long j3 = c10126x1M49720k4.f36277fa;
                this.f36251h4 = m49701k4(j2, (int) j3, (int) j3, true);
            }
            if (this.f36256x1.m49711k4() == 0 || this.f36251h4 == null) {
                c3152yj.setLength(0L);
                return c3152yj;
            }
        }
        C10117c5 c10117c5 = z2 ? this.f36253kk : this.f36255to;
        AbstractC3150x6 abstractC3150x6 = z2 ? this.f36252k4 : this.f36251h4;
        int i4 = z2 ? 512 : 64;
        long position = abstractC3150x6.getPosition();
        long jM49698x1 = j;
        while (true) {
            long j4 = jM49698x1 & 4294967295L;
            if (j4 == 4294967294L || j4 == 4294967295L) {
                break;
            }
            long jM49714k4 = C10121jd.m49714k4(jM49698x1, z2);
            if (position != jM49714k4) {
                abstractC3150x6.setPosition(jM49714k4);
                position = jM49714k4;
            }
            int i5 = iM67507x1 - i3;
            if (i5 == 0) {
                break;
            }
            int iM67507x12 = C14116yg.m67507x1(i4, i5);
            if (abstractC3150x6.read(c3152yj.getBuffer(), i3, iM67507x12) != iM67507x12) {
                C6005k4.m24264to("The structured file is probably corrupt. Cannot read all data that was expected, but okay to continue.");
            }
            i3 += iM67507x12;
            position += (long) iM67507x12;
            jM49698x1 = c10117c5.m49698x1(jM49698x1);
        }
        return c3152yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10124m9 m49708k4() {
        if (this.f36254m9 == null) {
            m49705to();
        }
        return this.f36254m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49709k4(AbstractC3150x6 abstractC3150x6) {
        this.f36252k4 = abstractC3150x6;
        abstractC3150x6.setPosition(512L);
        C10120h4 c10120h4 = new C10120h4();
        this.f36256x1 = c10120h4;
        this.f36253kk = new C10125to(this.f36252k4, c10120h4);
        this.f36255to = new C10117c5();
        this.f36251h4 = new C3152yj();
        this.f36250du = new C10123kk();
        m49702k4(this.f36254m9, (C10126x1) null);
        if (this.f36251h4.getLength() > 0) {
            this.f36250du.m49720k4(0L).f36274ck = m49699k4((AbstractC3150x6) this.f36251h4, true);
            this.f36250du.m49720k4(0L).f36277fa = this.f36251h4.getLength();
            int[] iArr = {0};
            this.f36256x1.f36257c5 = m49700k4(this.f36255to.m49696kk(), true, iArr);
            this.f36256x1.f36263jd = iArr[0];
        } else {
            this.f36256x1.f36257c5 = 4294967294L;
        }
        this.f36256x1.f36266m9 = m49699k4((AbstractC3150x6) this.f36250du.m49723x1(), true);
        this.f36253kk.m49730x1();
        this.f36252k4.setPosition(0L);
        this.f36256x1.m49712k4(new C3149x1(this.f36252k4, AbstractC6747ar.m26643rv()));
        AbstractC3150x6 abstractC3150x62 = this.f36252k4;
        abstractC3150x62.setPosition(abstractC3150x62.getLength());
    }

    /* JADX INFO: renamed from: k4 */
    private void m49702k4(C10124m9 c10124m9, C10126x1 c10126x1) {
        C10126x1 c10126x12;
        if (c10126x1 == null) {
            c10126x1 = new C10126x1("Root Entry", true, c10124m9.m49725k4().Clone());
            this.f36250du.m49722k4(c10126x1);
        }
        if (c10124m9.size() > 0) {
            c10126x1.f36278h4 = ((long) this.f36250du.m49719k4()) & 4294967295L;
        }
        for (int i = 0; i < c10124m9.size(); i++) {
            String str = c10124m9.getKeys().get_Item(i);
            Object obj = c10124m9.getValues().get_Item(i);
            C10124m9 c10124m92 = (C10124m9) C7019kk.m27452k4(obj, C10124m9.class);
            if (c10124m92 != null) {
                c10126x12 = new C10126x1(str, false, c10124m92.m49725k4().Clone());
                this.f36250du.m49722k4(c10126x12);
                m49702k4(c10124m92, c10126x12);
            } else {
                AbstractC3150x6 abstractC3150x6 = (AbstractC3150x6) C7019kk.m27452k4(obj, AbstractC3150x6.class);
                if (abstractC3150x6 == null) {
                    throw new InvalidOperationException("Unknown object in memory storage.");
                }
                C10126x1 c10126x13 = new C10126x1(str, 2, abstractC3150x6.getLength());
                this.f36250du.m49722k4(c10126x13);
                c10126x13.f36274ck = m49699k4(abstractC3150x6, false);
                c10126x12 = c10126x13;
            }
            if (i < c10124m9.size() - 1) {
                c10126x12.f36275du = ((long) this.f36250du.m49719k4()) & 4294967295L;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m49703k4(C10126x1 c10126x1, C10124m9 c10124m9) {
        C10118du c10118du;
        C10124m9 c10124m92;
        C10126x1 c10126x1M49721k4;
        if (c10126x1.f36284up) {
            C6005k4.m24264to("The structured storage file seems to be corrupt. This directory entry was already read, ignoring.");
            return;
        }
        c10126x1.f36284up = true;
        int i = c10126x1.f36285x1;
        if (i != 0) {
            if (i == 1) {
                c10118du = this;
                c10124m92 = new C10124m9(c10126x1.f36282m9.Clone());
                if (c10126x1.f36285x1 == 5 || c10118du.f36254m9 != null) {
                    c10124m9.m49727k4(c10126x1.f36280k4, c10124m92);
                } else {
                    c10118du.f36254m9 = c10124m92;
                }
                c10126x1M49721k4 = c10118du.f36250du.m49721k4(c10126x1, c10126x1.f36278h4);
                if (c10126x1M49721k4 != null) {
                    m49703k4(c10126x1M49721k4, c10124m92);
                }
            } else if (i != 2) {
                if (i != 5) {
                    throw new InvalidOperationException("Unknown type of directory entry in the structured storage.");
                }
                c10118du = this;
                c10124m92 = new C10124m9(c10126x1.f36282m9.Clone());
                if (c10126x1.f36285x1 == 5) {
                    c10124m9.m49727k4(c10126x1.f36280k4, c10124m92);
                    c10126x1M49721k4 = c10118du.f36250du.m49721k4(c10126x1, c10126x1.f36278h4);
                    if (c10126x1M49721k4 != null) {
                    }
                }
            } else {
                String str = c10126x1.f36280k4;
                long j = c10126x1.f36274ck;
                long j2 = c10126x1.f36277fa;
                c10118du = this;
                c10124m9.m49726k4(str, c10118du.m49701k4(j, (int) j2, (int) j2, false));
            }
            C10126x1 c10126x1M49721k42 = c10118du.f36250du.m49721k4(c10126x1, c10126x1.f36283to);
            if (c10126x1M49721k42 != null) {
                m49703k4(c10126x1M49721k42, c10124m9);
            }
            C10126x1 c10126x1M49721k43 = c10118du.f36250du.m49721k4(c10126x1, c10126x1.f36275du);
            if (c10126x1M49721k43 != null) {
                m49703k4(c10126x1M49721k43, c10124m9);
            }
        }
    }
}
