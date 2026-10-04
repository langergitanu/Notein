package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;

/* JADX INFO: loaded from: classes3.dex */
class o8s extends AbstractC14463so {

    /* JADX INFO: renamed from: ar */
    private byte[] f47694ar;

    /* JADX INFO: renamed from: bv */
    private q4s f47695bv;

    /* JADX INFO: renamed from: du */
    private com.aspose.slides.internal.p332p7.wdt f47698du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC7414ck f47701h4;

    /* JADX INFO: renamed from: kk */
    private com.aspose.slides.internal.p332p7.pti f47705kk;

    /* JADX INFO: renamed from: qq */
    private byte[] f47709qq;

    /* JADX INFO: renamed from: rv */
    private n3i f47710rv;

    /* JADX INFO: renamed from: to */
    private com.aspose.slides.internal.p332p7.bzy f47711to;

    /* JADX INFO: renamed from: u4 */
    private oyy f47712u4;

    /* JADX INFO: renamed from: um */
    private VbaProject f47713um;

    /* JADX INFO: renamed from: x6 */
    private pzs f47718x6;

    /* JADX INFO: renamed from: k4 */
    private eeo f47704k4 = new eeo();

    /* JADX INFO: renamed from: x1 */
    private int f47717x1 = 0;

    /* JADX INFO: renamed from: m9 */
    private float f47707m9 = 0.5f;

    /* JADX INFO: renamed from: dy */
    private boolean f47699dy = true;

    /* JADX INFO: renamed from: c5 */
    private boolean f47696c5 = false;

    /* JADX INFO: renamed from: jd */
    private boolean f47703jd = false;

    /* JADX INFO: renamed from: ck */
    private boolean f47697ck = false;

    /* JADX INFO: renamed from: fa */
    private boolean f47700fa = true;

    /* JADX INFO: renamed from: up */
    private boolean f47714up = false;

    /* JADX INFO: renamed from: yj */
    private boolean f47719yj = true;

    /* JADX INFO: renamed from: ks */
    private int f47706ks = 1;

    /* JADX INFO: renamed from: ne */
    private mhp f47708ne = new mhp();

    /* JADX INFO: renamed from: ix */
    private List<coq> f47702ix = new List<>();

    /* JADX INFO: renamed from: uz */
    private long f47715uz = 256;

    /* JADX INFO: renamed from: wl */
    private long f47716wl = 2147483648L;

    /* JADX INFO: renamed from: ar */
    public final long m68353ar() {
        long j = this.f47715uz;
        this.f47715uz = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m68354c5() {
        return this.f47696c5;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m68355ck() {
        return this.f47697ck;
    }

    /* JADX INFO: renamed from: du */
    public final com.aspose.slides.internal.p332p7.wdt m68356du() {
        return this.f47698du;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m68358dy() {
        return this.f47699dy;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m68359fa() {
        return this.f47700fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC7414ck m68360h4() {
        return this.f47701h4;
    }

    /* JADX INFO: renamed from: ix */
    public final List<coq> m68362ix() {
        return this.f47702ix;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m68363jd() {
        return this.f47703jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final eeo m68364k4() {
        return this.f47704k4;
    }

    /* JADX INFO: renamed from: kk */
    public final q4s m68379kk() {
        return this.f47695bv;
    }

    /* JADX INFO: renamed from: ks */
    public final int m68381ks() {
        return this.f47706ks;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m68382m9() {
        return this.f47707m9;
    }

    /* JADX INFO: renamed from: ne */
    public final mhp m68384ne() {
        return this.f47708ne;
    }

    /* JADX INFO: renamed from: qq */
    public final byte[] m68385qq() {
        return this.f47694ar;
    }

    /* JADX INFO: renamed from: rv */
    public final n3i m68386rv() {
        return this.f47710rv;
    }

    /* JADX INFO: renamed from: to */
    public final com.aspose.slides.internal.p332p7.bzy m68387to() {
        return this.f47711to;
    }

    /* JADX INFO: renamed from: u4 */
    public final oyy m68389u4() {
        return this.f47712u4;
    }

    /* JADX INFO: renamed from: um */
    public final long m68390um() {
        long j = this.f47716wl;
        this.f47716wl = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m68391up() {
        return this.f47714up;
    }

    /* JADX INFO: renamed from: uz */
    public final byte[] m68392uz() {
        return this.f47709qq;
    }

    /* JADX INFO: renamed from: wl */
    public final VbaProject m68393wl() {
        return this.f47713um;
    }

    /* JADX INFO: renamed from: x1 */
    public final com.aspose.slides.internal.p332p7.pti m68394x1() {
        return this.f47705kk;
    }

    /* JADX INFO: renamed from: x6 */
    public final pzs m68399x6() {
        return this.f47718x6;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m68400yj() {
        return this.f47719yj;
    }

    /* JADX INFO: renamed from: du */
    public final void m68357du(boolean z) {
        this.f47700fa = z;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m68361h4(boolean z) {
        this.f47714up = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68365k4(float f) {
        if (f < 0.0f || f > 100.0f) {
            throw new ArgumentOutOfRangeException("ServerZoom must be in range [0;100]");
        }
        this.f47707m9 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m68380kk(boolean z) {
        this.f47703jd = z;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m68383m9(boolean z) {
        this.f47719yj = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m68388to(boolean z) {
        this.f47697ck = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68395x1(int i) {
        this.f47706ks = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68366k4(int i) {
        this.f47717x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68396x1(long j) {
        long j2 = j & 4294967295L;
        if (j2 == 4294967295L || (this.f47716wl & 4294967295L) > j2) {
            return;
        }
        this.f47716wl = (j2 + 1) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68367k4(long j) {
        long j2 = j & 4294967295L;
        if ((this.f47715uz & 4294967295L) <= j2) {
            this.f47715uz = (j2 + 1) & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68397x1(boolean z) {
        this.f47696c5 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68368k4(VbaProject vbaProject) {
        this.f47713um = vbaProject;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68398x1(byte[] bArr) {
        this.f47694ar = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68369k4(com.aspose.slides.internal.p332p7.bzy bzyVar) {
        this.f47711to = bzyVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68370k4(AbstractC7414ck abstractC7414ck) {
        this.f47701h4 = abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68371k4(com.aspose.slides.internal.p332p7.pti ptiVar) {
        this.f47705kk = ptiVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68372k4(com.aspose.slides.internal.p332p7.wdt wdtVar) {
        this.f47698du = wdtVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68373k4(n3i n3iVar) {
        this.f47710rv = n3iVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68374k4(oyy oyyVar) {
        this.f47712u4 = oyyVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68375k4(pzs pzsVar) {
        this.f47718x6 = pzsVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68376k4(q4s q4sVar) {
        this.f47695bv = q4sVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68377k4(boolean z) {
        this.f47699dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68378k4(byte[] bArr) {
        this.f47709qq = bArr;
    }
}
