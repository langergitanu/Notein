package oO0oO00;

import oO00ooO.C32457OooOoOO;
import oO00ooO.C32459OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O extends o0OO00O<C32457OooOoOO, C32459OooOoo0, o000OO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O f122240OooO0OO = new o0000O(o0000OO0.f122247OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        short[] collectionSize = ((C32459OooOoo0) obj).f116664OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        o000OO builder = (o000OO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        short sOooO0o = oooO00o.OooOOoo(this.f122275OooO0O0, i).OooO0o();
        builder.OooO0O0(builder.OooO0Oo() + 1);
        short[] sArr = builder.f122257OooO00o;
        int i2 = builder.f122258OooO0O0;
        builder.f122258OooO0O0 = i2 + 1;
        sArr[i2] = sOooO0o;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        short[] toBuilder = ((C32459OooOoo0) obj).f116664OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(toBuilder, "$this$toBuilder");
        o000OO o000oo2 = new o000OO();
        o000oo2.f122257OooO00o = toBuilder;
        o000oo2.f122258OooO0O0 = toBuilder.length;
        o000oo2.OooO0O0(10);
        return o000oo2;
    }

    @Override // oO0oO00.o0OO00O
    public final C32459OooOoo0 OooOO0() {
        return new C32459OooOoo0(new short[0]);
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, C32459OooOoo0 c32459OooOoo0, int i) {
        short[] sArr = c32459OooOoo0.f116664OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooO0Oo(this.f122275OooO0O0, i2).OooOO0O(sArr[i2]);
        }
    }
}
