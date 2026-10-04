package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ex */
/* JADX INFO: loaded from: classes3.dex */
public class C2076ex extends AbstractC2282s0 {

    /* JADX INFO: renamed from: du */
    private int f7184du;

    /* JADX INFO: renamed from: h4 */
    private List<Byte> f7185h4;

    /* JADX INFO: renamed from: kk */
    private int f7186kk;

    /* JADX INFO: renamed from: m9 */
    private int f7187m9;

    /* JADX INFO: renamed from: to */
    private int f7188to;

    /* JADX INFO: renamed from: x1 */
    private int f7189x1;

    public C2076ex(long j) {
        super(j);
        this.f7185h4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m10506k4(int i) {
        if (i < this.f7189x1 || i > this.f7186kk || this.f7185h4.size() == 0) {
            return (byte) 0;
        }
        return this.f7185h4.get_Item(i - m10507x1()).byteValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10507x1() {
        return this.f7189x1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        this.f7189x1 = c2212n9.m11151fa() & 65535;
        int iM11151fa = c2212n9.m11151fa() & 65535;
        this.f7186kk = iM11151fa;
        if (iM11151fa < this.f7189x1) {
            throw new C2243pd(C14113y2.m67402k4("incorrect size values for device table StartSize = {0} EndSize={1}", Integer.valueOf(this.f7189x1), Integer.valueOf(this.f7186kk)));
        }
        int iM11151fa2 = c2212n9.m11151fa() & 65535;
        if (iM11151fa2 == 32768) {
            this.f7188to = this.f7189x1;
            this.f7184du = this.f7186kk;
            this.f7186kk = 0;
            this.f7189x1 = 0;
            return;
        }
        if (iM11151fa2 < 1 || iM11151fa2 > 3) {
            throw new C2243pd(C14113y2.m67402k4("incorrect DeltaFormat = {0} for device table", Integer.valueOf(iM11151fa2)));
        }
        this.f7187m9 = iM11151fa2;
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(2.0d, iM11151fa2)), 14);
        int i = (this.f7186kk - this.f7189x1) + 1;
        int i2 = 16 / iM27462to;
        while (this.f7185h4.size() < i) {
            int iM11151fa3 = c2212n9.m11151fa();
            if (i > this.f7185h4.size() + i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    this.f7185h4.addItem(Byte.valueOf(C2143je.m10820k4(iM11151fa3, i3 * iM27462to, iM27462to)));
                }
            } else {
                int size = i - this.f7185h4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f7185h4.addItem(Byte.valueOf(C2143je.m10820k4(iM11151fa3, i4 * iM27462to, iM27462to)));
                }
            }
        }
    }
}
