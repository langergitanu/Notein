package oO0oO00;

/* JADX INFO: renamed from: oO0oO00.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33982Ooooo0o extends o0OO00O<Long, long[], C33981Ooooo00> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33982Ooooo0o f122205OooO0OO = new C33982Ooooo0o(C33983OooooO0.f122206OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(jArr, "<this>");
        return jArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33981Ooooo00 builder = (C33981Ooooo00) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        long jOooOo00 = oooO00o.OooOo00(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        long[] jArr = builder.f122203OooO00o;
        int i2 = builder.f122204OooO0O0;
        builder.f122204OooO0O0 = i2 + 1;
        jArr[i2] = jOooOo00;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(jArr, "<this>");
        C33981Ooooo00 c33981Ooooo00 = new C33981Ooooo00();
        c33981Ooooo00.f122203OooO00o = jArr;
        c33981Ooooo00.f122204OooO0O0 = jArr.length;
        c33981Ooooo00.OooO0O0(10);
        return c33981Ooooo00;
    }

    @Override // oO0oO00.o0OO00O
    public final long[] OooOO0() {
        return new long[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, long[] jArr, int i) {
        long[] content = jArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooOo0O(this.f122275OooO0O0, i2, content[i2]);
        }
    }
}
