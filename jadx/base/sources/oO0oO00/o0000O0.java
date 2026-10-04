package oO0oO00;

import oO00ooO.C32450OooOo;
import oO00ooO.C32456OooOoO0;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O0 extends o0OO00O<C32450OooOo, C32456OooOoO0, C33996o0000oO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000O0 f122241OooO0OO = new o0000O0(o0000O0O.f122243OooO00o);

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        long[] collectionSize = ((C32456OooOoO0) obj).f116660OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // oO0oO00.AbstractC33951OooOo0, oO0oO00.AbstractC33933OooO00o
    public final void OooO0o(oO0oO000.OooO00o oooO00o, int i, Object obj) {
        C33996o0000oO builder = (C33996o0000oO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        long jOooO0o0 = oooO00o.OooOOoo(this.f122275OooO0O0, i).OooO0o0();
        builder.OooO0O0(builder.OooO0Oo() + 1);
        long[] jArr = builder.f122253OooO00o;
        int i2 = builder.f122254OooO0O0;
        builder.f122254OooO0O0 = i2 + 1;
        jArr[i2] = jOooO0o0;
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final Object OooO0oO(Object obj) {
        long[] toBuilder = ((C32456OooOoO0) obj).f116660OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(toBuilder, "$this$toBuilder");
        C33996o0000oO c33996o0000oO = new C33996o0000oO();
        c33996o0000oO.f122253OooO00o = toBuilder;
        c33996o0000oO.f122254OooO0O0 = toBuilder.length;
        c33996o0000oO.OooO0O0(10);
        return c33996o0000oO;
    }

    @Override // oO0oO00.o0OO00O
    public final C32456OooOoO0 OooOO0() {
        return new C32456OooOoO0(new long[0]);
    }

    @Override // oO0oO00.o0OO00O
    public final void OooOO0O(oO0oO000.OooO0O0 encoder, C32456OooOoO0 c32456OooOoO0, int i) {
        long[] jArr = c32456OooOoO0.f116660OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.OooO0Oo(this.f122275OooO0O0, i2).OooOo0o(jArr[i2]);
        }
    }
}
