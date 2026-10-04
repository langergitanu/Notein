package oO0oO00;

/* JADX INFO: renamed from: oO0oO00.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33974OoooO0O extends o0OO00O<Integer, int[], C33972OoooO0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33974OoooO0O f122198OooO0OO = new C33974OoooO0O(C33971OoooO.f122193OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        return iArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33972OoooO0 builder = (C33972OoooO0) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        int iOooOo0 = oooO00o.OooOo0(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        int[] iArr = builder.f122195OooO00o;
        int i2 = builder.f122196OooO0O0;
        builder.f122196OooO0O0 = i2 + 1;
        iArr[i2] = iOooOo0;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        C33972OoooO0 c33972OoooO0 = new C33972OoooO0();
        c33972OoooO0.f122195OooO00o = iArr;
        c33972OoooO0.f122196OooO0O0 = iArr.length;
        c33972OoooO0.OooO0O0(10);
        return c33972OoooO0;
    }

    @Override // oO0oO00.o0OO00O
    public final int[] OooOO0() {
        return new int[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, int[] iArr, int i) {
        int[] content = iArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooOoOO(i2, content[i2], this.f122275OooO0O0);
        }
    }
}
