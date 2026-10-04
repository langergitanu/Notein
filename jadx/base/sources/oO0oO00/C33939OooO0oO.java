package oO0oO00;

/* JADX INFO: renamed from: oO0oO00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33939OooO0oO extends o0OO00O<Boolean, boolean[], C33937OooO0o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33939OooO0oO f122143OooO0OO = new C33939OooO0oO(C33940OooO0oo.f122144OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(zArr, "<this>");
        return zArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33937OooO0o builder = (C33937OooO0o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        boolean zOooOOOo = oooO00o.OooOOOo(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        boolean[] zArr = builder.f122140OooO00o;
        int i2 = builder.f122141OooO0O0;
        builder.f122141OooO0O0 = i2 + 1;
        zArr[i2] = zOooOOOo;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(zArr, "<this>");
        C33937OooO0o c33937OooO0o = new C33937OooO0o();
        c33937OooO0o.f122140OooO00o = zArr;
        c33937OooO0o.f122141OooO0O0 = zArr.length;
        c33937OooO0o.OooO0O0(10);
        return c33937OooO0o;
    }

    @Override // oO0oO00.o0OO00O
    public final boolean[] OooOO0() {
        return new boolean[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, boolean[] zArr, int i) {
        boolean[] content = zArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooO0oO(this.f122275OooO0O0, i2, content[i2]);
        }
    }
}
