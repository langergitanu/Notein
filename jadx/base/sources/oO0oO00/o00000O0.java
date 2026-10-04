package oO0oO00;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000O0 extends o0OO00O<Short, short[], o00000> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00000O0 f122229OooO0OO = new o00000O0(o00000O.f122227OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sArr, "<this>");
        return sArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        o00000 builder = (o00000) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        short sOooOO0o = oooO00o.OooOO0o(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        short[] sArr = builder.f122222OooO00o;
        int i2 = builder.f122223OooO0O0;
        builder.f122223OooO0O0 = i2 + 1;
        sArr[i2] = sOooOO0o;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sArr, "<this>");
        o00000 o00000Var = new o00000();
        o00000Var.f122222OooO00o = sArr;
        o00000Var.f122223OooO0O0 = sArr.length;
        o00000Var.OooO0O0(10);
        return o00000Var;
    }

    @Override // oO0oO00.o0OO00O
    public final short[] OooOO0() {
        return new short[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, short[] sArr, int i) {
        short[] content = sArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooO0o(this.f122275OooO0O0, i2, content[i2]);
        }
    }
}
