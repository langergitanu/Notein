package oO0oO00;

/* JADX INFO: renamed from: oO0oO00.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33941OooOO0 extends o0OO00O<Byte, byte[], C33932OooO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33941OooOO0 f122146OooO0OO = new C33941OooOO0(C33942OooOO0O.f122147OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(bArr, "<this>");
        return bArr.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33932OooO builder = (C33932OooO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        byte bOooOo = oooO00o.OooOo(this.f122275OooO0O0, i);
        builder.OooO0O0(builder.OooO0Oo() + 1);
        byte[] bArr = builder.f122138OooO00o;
        int i2 = builder.f122139OooO0O0;
        builder.f122139OooO0O0 = i2 + 1;
        bArr[i2] = bOooOo;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(bArr, "<this>");
        C33932OooO c33932OooO = new C33932OooO();
        c33932OooO.f122138OooO00o = bArr;
        c33932OooO.f122139OooO0O0 = bArr.length;
        c33932OooO.OooO0O0(10);
        return c33932OooO;
    }

    @Override // oO0oO00.o0OO00O
    public final byte[] OooOO0() {
        return new byte[0];
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, byte[] bArr, int i) {
        byte[] content = bArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooOo0(this.f122275OooO0O0, i2, content[i2]);
        }
    }
}
