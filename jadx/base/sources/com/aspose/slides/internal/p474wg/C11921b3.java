package com.aspose.slides.internal.p474wg;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.b3 */
/* JADX INFO: loaded from: classes5.dex */
class C11921b3 extends AbstractC11963qw {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11975um f40177k4;

    public C11921b3(C11975um c11975um) {
        this.f40177k4 = c11975um;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11963qw
    /* JADX INFO: renamed from: k4 */
    public boolean mo55877k4(C11971tq c11971tq) {
        if (this.f40177k4.f40408t6 != null) {
            if (this.f40177k4.f40399os.m56248x1() != 1 && this.f40177k4.f40385em.m56248x1() != 1) {
                this.f40177k4.f40400qm.write(this.f40177k4.f40408t6, 0, this.f40177k4.f40424xw);
                this.f40177k4.f40408t6 = null;
                this.f40177k4.f40400qm.close();
            }
        } else if (!"HEAD".equals(this.f40177k4.f40415v4) && !"GET".equals(this.f40177k4.f40415v4) && !"MKCOL".equals(this.f40177k4.f40415v4) && !"CONNECT".equals(this.f40177k4.f40415v4) && !"TRACE".equals(this.f40177k4.f40415v4) && this.f40177k4.f40417vj && !this.f40177k4.f40400qm.m56031c5()) {
            return this.f40177k4.f40400qm.m56042k4(c11971tq);
        }
        return false;
    }
}
