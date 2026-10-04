package androidx.ink.strokes;

import Oooo0oO.o0Oo0oo;
import kotlin.jvm.internal.C24019OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f65463OooO0Oo = new OooO00o(new C19027OooO00o(0, StrokeInputBatchNative.f65498OooO00o, StrokeInputBatchNative.class, "create", "create()J", 0));

    /* JADX INFO: renamed from: androidx.ink.strokes.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final /* synthetic */ class C19027OooO00o extends C24019OooOO0o implements oO0O000o.OooO00o<Long> {
        @Override // oO0O000o.OooO00o
        public final Long invoke() {
            return Long.valueOf(((StrokeInputBatchNative) this.receiver).create());
        }
    }

    @Override // androidx.ink.strokes.OooOOO
    public final OooO00o OooO0o() {
        return this;
    }

    public final String toString() {
        return o0Oo0oo.OooO0O0(OooO0OO(), "ImmutableStrokeInputBatch(size=", ")");
    }
}
