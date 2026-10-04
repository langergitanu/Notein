package o0oo0OoO;

import androidx.ink.brush.behavior.DampingNodeNative;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24453OooO0oO;
import o0OoO0o.AbstractC28645OooO0o;
import o0OoO0o.AbstractC28667OooOoO;
import o0OoO0o.C28649OooO0o0;
import o0OoO0o.C28657OooOOOO;
import o0OoO0o.C28660OooOOo0;
import o0OoO0o.C28661OooOOoo;
import o0OoO0o.C28663OooOo0;
import o0OoO0o.C28666OooOo0o;

/* JADX INFO: renamed from: o0oo0OoO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31272OooO0o {
    public static final C24453OooO0oO OooO00o(C28663OooOo0.OooO00o source, C28666OooOo0o.OooO00o target, float f, float f2, float f3, float f4, C28657OooOOOO sourceOutOfRangeBehavior, AbstractC28645OooO0o responseCurve, long j) {
        OooOOO0.OooO0oO(source, "source");
        OooOOO0.OooO0oO(target, "target");
        OooOOO0.OooO0oO(sourceOutOfRangeBehavior, "sourceOutOfRangeBehavior");
        OooOOO0.OooO0oO(responseCurve, "responseCurve");
        AbstractC28667OooOoO c28663OooOo0 = new C28663OooOo0(source, f, f2, sourceOutOfRangeBehavior);
        if (!responseCurve.equals(AbstractC28645OooO0o.C28646OooO0Oo.f101529OooO0o)) {
            c28663OooOo0 = new C28661OooOOoo(responseCurve, c28663OooOo0);
        }
        if (j != 0) {
            final C28660OooOOo0 dampingSource = C28660OooOOo0.f101571OooO0Oo;
            final float f5 = j / 1000.0f;
            OooOOO0.OooO0oO(dampingSource, "dampingSource");
            c28663OooOo0 = new C28649OooO0o0(new oO0O000o.OooO00o() { // from class: o0OoO0o.OooO0Oo
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return Long.valueOf(DampingNodeNative.f65359OooO00o.create(dampingSource.f101572OooO00o, f5));
                }
            }, c28663OooOo0);
        }
        return new C24453OooO0oO(new C28666OooOo0o(target, f3, f4, c28663OooOo0));
    }
}
