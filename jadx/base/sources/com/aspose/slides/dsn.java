package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
final class dsn {

    /* JADX INFO: renamed from: k4 */
    private final int f4649k4;

    /* JADX INFO: renamed from: kk */
    private final int f4650kk;

    /* JADX INFO: renamed from: to */
    private final float f4651to;

    /* JADX INFO: renamed from: x1 */
    private final float f4652x1;

    public dsn(int i, float f) {
        this.f4649k4 = i;
        this.f4650kk = i;
        this.f4652x1 = f;
        this.f4651to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m5245k4() {
        return this.f4650kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m5246x1() {
        return this.f4651to;
    }

    public dsn(sxo sxoVar, int i, float f) {
        this.f4649k4 = i;
        this.f4652x1 = f;
        float fM69906kk = sxoVar.m70860kk().m69926x1() != 0 ? sxoVar.m70860kk().m69906kk(96.0f) : sxoVar.f48961k4.f48541k4.m4837m9();
        this.f4650kk = sxoVar.m70847du().f4610kk.length() + i;
        this.f4651to = (sxoVar.m70847du().f4610kk.length() * fM69906kk) + f;
    }
}
