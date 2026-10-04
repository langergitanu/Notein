package oO0oO00;

/* JADX INFO: renamed from: oO0oO00.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33955OooOoO extends o0OO00O<Double, double[], C33956OooOoO0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33955OooOoO f122163OooO0OO = new C33955OooOoO(C33957OooOoOO.f122166OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(dArr, "<this>");
        return dArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33956OooOoO0 builder = (C33956OooOoO0) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        double dOooO = oooO00o.OooO(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        double[] dArr = builder.f122164OooO00o;
        int i2 = builder.f122165OooO0O0;
        builder.f122165OooO0O0 = i2 + 1;
        dArr[i2] = dOooO;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(dArr, "<this>");
        C33956OooOoO0 c33956OooOoO0 = new C33956OooOoO0();
        c33956OooOoO0.f122164OooO00o = dArr;
        c33956OooOoO0.f122165OooO0O0 = dArr.length;
        c33956OooOoO0.OooO0O0(10);
        return c33956OooOoO0;
    }

    @Override // oO0oO00.o0OO00O
    public final double[] OooOO0() {
        return new double[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, double[] dArr, int i) {
        double[] content = dArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooOO0(this.f122275OooO0O0, i2, content[i2]);
        }
    }
}
