package oO0oO00;

/* JADX INFO: renamed from: oO0oO00.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33947OooOOOo extends o0OO00O<Character, char[], C33946OooOOOO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33947OooOOOo f122153OooO0OO = new C33947OooOOOo(C33949OooOOo0.f122154OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(cArr, "<this>");
        return cArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33946OooOOOO builder = (C33946OooOOOO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        char cOooOoOO = oooO00o.OooOoOO(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        char[] cArr = builder.f122151OooO00o;
        int i2 = builder.f122152OooO0O0;
        builder.f122152OooO0O0 = i2 + 1;
        cArr[i2] = cOooOoOO;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(cArr, "<this>");
        C33946OooOOOO c33946OooOOOO = new C33946OooOOOO();
        c33946OooOOOO.f122151OooO00o = cArr;
        c33946OooOOOO.f122152OooO0O0 = cArr.length;
        c33946OooOOOO.OooO0O0(10);
        return c33946OooOOOO;
    }

    @Override // oO0oO00.o0OO00O
    public final char[] OooOO0() {
        return new char[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, char[] cArr, int i) {
        char[] content = cArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooOOo(this.f122275OooO0O0, i2, content[i2]);
        }
    }
}
