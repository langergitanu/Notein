package androidx.ink.strokes;

import Oooo0.C20856OooooOo;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f65483OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f65482OooO0OO = {new C24028OooOoO0(OooOOO.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f65481OooO0O0 = new OooO00o();

    public static final class OooO00o {
    }

    public static final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((StrokeInputBatchNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooOOO(oO0O000o.OooO00o<Long> oooO00o) {
        this.f65483OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0O0(1, StrokeInputBatchNative.f65498OooO00o, StrokeInputBatchNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
    }

    public final StrokeInput OooO00o(int i) {
        StrokeInput strokeInput = new StrokeInput();
        OooO0o0(i, strokeInput);
        return strokeInput;
    }

    public final long OooO0O0() {
        return this.f65483OooO00o.OooO00o(this, f65482OooO0OO[0]);
    }

    public final int OooO0OO() {
        return StrokeInputBatchNative.f65498OooO00o.getSize(OooO0O0());
    }

    public final boolean OooO0Oo() {
        return OooO0OO() == 0;
    }

    public abstract androidx.ink.strokes.OooO00o OooO0o();

    public final void OooO0o0(int i, StrokeInput outStrokeInput) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outStrokeInput, "outStrokeInput");
        if (i >= OooO0OO() || i < 0) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("index (", i, ") must be in [0, size=", ")", OooO0OO()).toString());
        }
        StrokeInputBatchNative.f65498OooO00o.populate(OooO0O0(), i, outStrokeInput);
    }
}
