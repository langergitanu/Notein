package oO0oO00;

import oO00ooO.C32451OooOo0;
import oO00ooO.C32452OooOo00;

/* JADX INFO: renamed from: oO0oO00.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33993o00000oO extends o0OO00O<C32452OooOo00, C32451OooOo0, C33995o0000Ooo> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33993o00000oO f122237OooO0OO = new C33993o00000oO(C33994o00000oo.f122238OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        byte[] collectionSize = ((C32451OooOo0) obj).f116651OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33995o0000Ooo builder = (C33995o0000Ooo) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        byte bOooo000 = oooO00o.OooOOoo(this.f122275OooO0O0, i).Oooo000();
        builder.OooO0O0(builder.OooO0Oo() + 1);
        byte[] bArr = builder.f122251OooO00o;
        int i2 = builder.f122252OooO0O0;
        builder.f122252OooO0O0 = i2 + 1;
        bArr[i2] = bOooo000;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        byte[] toBuilder = ((C32451OooOo0) obj).f116651OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(toBuilder, "$this$toBuilder");
        C33995o0000Ooo c33995o0000Ooo = new C33995o0000Ooo();
        c33995o0000Ooo.f122251OooO00o = toBuilder;
        c33995o0000Ooo.f122252OooO0O0 = toBuilder.length;
        c33995o0000Ooo.OooO0O0(10);
        return c33995o0000Ooo;
    }

    @Override // oO0oO00.o0OO00O
    public final C32451OooOo0 OooOO0() {
        return new C32451OooOo0(new byte[0]);
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, C32451OooOo0 c32451OooOo0, int i) {
        byte[] bArr = c32451OooOo0.f116651OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooO0Oo(this.f122275OooO0O0, i2).OooO0o0(bArr[i2]);
        }
    }
}
