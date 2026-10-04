package oO0oO00;

import oO00ooO.C32453OooOo0O;
import oO00ooO.C32454OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O00 extends o0OO00O<C32453OooOo0O, C32454OooOo0o, o0000> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O00 f122242OooO0OO = new o0000O00(C33997o0000oo.f122255OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        int[] collectionSize = ((C32454OooOo0o) obj).f116656OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        o0000 builder = (o0000) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        int iOooOOo = oooO00o.OooOOoo(this.f122275OooO0O0, i).OooOOo();
        builder.OooO0O0(builder.OooO0Oo() + 1);
        int[] iArr = builder.f122220OooO00o;
        int i2 = builder.f122221OooO0O0;
        builder.f122221OooO0O0 = i2 + 1;
        iArr[i2] = iOooOOo;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        int[] toBuilder = ((C32454OooOo0o) obj).f116656OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(toBuilder, "$this$toBuilder");
        o0000 o0000Var = new o0000();
        o0000Var.f122220OooO00o = toBuilder;
        o0000Var.f122221OooO0O0 = toBuilder.length;
        o0000Var.OooO0O0(10);
        return o0000Var;
    }

    @Override // oO0oO00.o0OO00O
    public final C32454OooOo0o OooOO0() {
        return new C32454OooOo0o(new int[0]);
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, C32454OooOo0o c32454OooOo0o, int i) {
        int[] iArr = c32454OooOo0o.f116656OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooO0Oo(this.f122275OooO0O0, i2).OooOOOO(iArr[i2]);
        }
    }
}
