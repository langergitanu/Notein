package oO0oO00;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 extends o0OO00O<Float, float[], C33964Oooo00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Oooo0 f122181OooO0OO = new Oooo0(C33965Oooo0O0.f122189OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fArr, "<this>");
        return fArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33964Oooo00o builder = (C33964Oooo00o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        float fOooO0Oo = oooO00o.OooO0Oo(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        float[] fArr = builder.f122187OooO00o;
        int i2 = builder.f122188OooO0O0;
        builder.f122188OooO0O0 = i2 + 1;
        fArr[i2] = fOooO0Oo;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fArr, "<this>");
        C33964Oooo00o c33964Oooo00o = new C33964Oooo00o();
        c33964Oooo00o.f122187OooO00o = fArr;
        c33964Oooo00o.f122188OooO0O0 = fArr.length;
        c33964Oooo00o.OooO0O0(10);
        return c33964Oooo00o;
    }

    @Override // oO0oO00.o0OO00O
    public final float[] OooOO0() {
        return new float[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, float[] fArr, int i) {
        float[] content = fArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooOOo0(this.f122275OooO0O0, i2, content[i2]);
        }
    }
}
