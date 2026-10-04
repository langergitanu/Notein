package androidx.ink.strokes;

import Oooo0oO.o0Oo0oo;
import kotlin.jvm.internal.C24019OooOO0o;
import o000OO00.C24478Oooo00o;

/* JADX INFO: renamed from: androidx.ink.strokes.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21970OooO0oo extends OooOOO {

    /* JADX INFO: renamed from: androidx.ink.strokes.OooO0oo$OooO00o */
    public static final /* synthetic */ class OooO00o extends C24019OooOO0o implements oO0O000o.OooO00o<Long> {
        @Override // oO0O000o.OooO00o
        public final Long invoke() {
            return Long.valueOf(((StrokeInputBatchNative) this.receiver).create());
        }
    }

    public C21970OooO0oo() {
        super(new OooO00o(0, StrokeInputBatchNative.f65498OooO00o, StrokeInputBatchNative.class, "create", "create()J", 0));
    }

    @Override // androidx.ink.strokes.OooOOO
    public final androidx.ink.strokes.OooO00o OooO0o() {
        if (OooO0Oo()) {
            StrokeInputBatchNative strokeInputBatchNative = StrokeInputBatchNative.f65498OooO00o;
            if (strokeInputBatchNative.getNoiseSeed(OooO0O0()) == 0 && strokeInputBatchNative.getBaseAnimationPhase(OooO0O0()) == 0.0f) {
                return androidx.ink.strokes.OooO00o.f65463OooO0Oo;
            }
        }
        final long jOooO0O0 = OooO0O0();
        return new androidx.ink.strokes.OooO00o(new oO0O000o.OooO00o() { // from class: androidx.ink.strokes.OooO0oO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return Long.valueOf(MutableStrokeInputBatchNative.f65459OooO00o.newCopy(jOooO0O0));
            }
        });
    }

    public final void OooO0oO(float f, float f2, float f3, float f4, float f5, float f6, long j, C24478Oooo00o type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        if (!MutableStrokeInputBatchNative.f65459OooO00o.appendSingle(OooO0O0(), type.f82776OooO00o, f, f2, j, f3, f4, f5, f6)) {
            throw new IllegalStateException("Should have thrown an exception if add failed.");
        }
    }

    public final void OooO0oo(StrokeInput input) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        C24478Oooo00o c24478Oooo00o = input.f65493OooO0Oo;
        OooO0oO(input.f65490OooO00o, input.f65491OooO0O0, input.f65495OooO0o0, input.f65494OooO0o, input.f65496OooO0oO, input.f65497OooO0oo, input.f65492OooO0OO, c24478Oooo00o);
    }

    public final String toString() {
        return o0Oo0oo.OooO0O0(OooO0OO(), "MutableStrokeInputBatch(size=", ")");
    }
}
