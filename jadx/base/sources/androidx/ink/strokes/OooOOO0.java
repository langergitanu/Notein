package androidx.ink.strokes;

import Oooo0.C20856OooooOo;
import androidx.ink.brush.BrushCoatNative;
import androidx.ink.geometry.OooOo00;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24477Oooo00O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f65484OooO0o = {new C24028OooOoO0(OooOOO0.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f65485OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO00.OooO0O0 f65486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f65487OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final androidx.ink.strokes.OooO00o f65488OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo00 f65489OooO0Oo;

    public static final class OooO00o {
    }

    public static final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((StrokeNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooOOO0(oO0O000o.OooO00o<Long> oooO00o, o000OO00.OooO0O0 oooO0O0, OooOOO oooOOO, OooOo00 oooOo00) {
        androidx.ink.strokes.OooO00o oooO00oOooO0o;
        this.f65486OooO00o = oooO0O0;
        this.f65487OooO0O0 = new o000OOoO.OooO0O0(oooO00o, new OooO0O0(1, StrokeNative.f65499OooO00o, StrokeNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        this.f65488OooO0OO = (oooOOO == null || (oooO00oOooO0o = oooOOO.OooO0o()) == null) ? new androidx.ink.strokes.OooO00o(new OooOO0O(this, 0)) : oooO00oOooO0o;
        if (oooOo00 == null) {
            OooOo00.OooO0O0 oooO0O02 = OooOo00.f65436OooO0Oo;
            C21971OooOO0o c21971OooOO0o = new C21971OooOO0o(this, 0);
            oooO0O02.getClass();
            oooOo00 = new OooOo00(c21971OooOO0o);
        }
        this.f65489OooO0Oo = oooOo00;
        if (oooOo00.OooO0o0() != oooO0O0.f82632OooO0O0.f82669OooO0O0.size()) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("The shape must have one render group per brush coat, but found ", oooOo00.OooO0o0(), " render groups in shape and ", " brush coats in brush.", oooO0O0.f82632OooO0O0.f82669OooO0O0.size()).toString());
        }
    }

    public final OooOOO0 OooO00o(final o000OO00.OooO0O0 oooO0O0) {
        o000OO00.OooO0O0 oooO0O02 = this.f65486OooO00o;
        if (oooO0O0.equals(oooO0O02)) {
            return this;
        }
        float fOooO0o = oooO0O02.OooO0o();
        float fOooO0o2 = oooO0O0.OooO0o();
        final androidx.ink.strokes.OooO00o inputs = this.f65488OooO0OO;
        if (fOooO0o == fOooO0o2 && oooO0O02.OooO0OO() == oooO0O0.OooO0OO()) {
            C24457OooOOo c24457OooOOo = oooO0O02.f82632OooO0O0;
            int size = c24457OooOOo.f82669OooO0O0.size();
            C24457OooOOo c24457OooOOo2 = oooO0O0.f82632OooO0O0;
            if (size == c24457OooOOo2.f82669OooO0O0.size()) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c24457OooOOo.f82670OooO0OO, c24457OooOOo2.f82670OooO0OO)) {
                    List<o000OO00.OooOO0O> list = c24457OooOOo.f82669OooO0O0;
                    int size2 = list.size();
                    int i = 0;
                    while (true) {
                        final OooOo00 shape = this.f65489OooO0Oo;
                        if (i >= size2) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(inputs, "inputs");
                            kotlin.jvm.internal.OooOOO0.OooO0oO(shape, "shape");
                            return new OooOOO0((oO0O000o.OooO00o<Long>) new oO0O000o.OooO00o() { // from class: androidx.ink.strokes.OooOO0
                                @Override // oO0O000o.OooO00o
                                public final Object invoke() {
                                    StrokeNative strokeNative = StrokeNative.f65499OooO00o;
                                    o000OO00.OooO0O0 oooO0O03 = oooO0O0;
                                    long jOooO0o0 = oooO0O03.OooO0o0();
                                    long jOooO0O0 = inputs.OooO0O0();
                                    OooOo00 oooOo00 = shape;
                                    int iOooO0o0 = oooOo00.OooO0o0();
                                    C24457OooOOo c24457OooOOo3 = oooO0O03.f82632OooO0O0;
                                    if (iOooO0o0 != c24457OooOOo3.f82669OooO0O0.size()) {
                                        throw new IllegalArgumentException(C20856OooooOo.OooO0O0("The shape must have one render group per brush coat, but found ", oooOo00.OooO0o0(), " render groups in shape and ", " brush coats in brush.", c24457OooOOo3.f82669OooO0O0.size()).toString());
                                    }
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    return Long.valueOf(strokeNative.createWithBrushInputsAndShape(jOooO0o0, jOooO0O0, oooOo00.OooO0O0()));
                                }
                            }, oooO0O0, inputs, shape);
                        }
                        C24477Oooo00O c24477Oooo00O = list.get(i).f82652OooO0O0;
                        List<o000OO00.OooOO0O> list2 = c24457OooOOo2.f82669OooO0O0;
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c24477Oooo00O, list2.get(i).f82652OooO0O0)) {
                            break;
                        }
                        o000OO00.OooOO0O oooOO0O = list2.get(i);
                        androidx.ink.geometry.OooOOO oooOOOOooO0oO = shape.OooO0oO(i);
                        oooOO0O.getClass();
                        if (!BrushCoatNative.f65346OooO00o.isCompatibleWithMeshFormat(oooOO0O.OooO00o(), oooOOOOooO0oO.OooO00o())) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return new OooOOO0(oooO0O0, inputs);
    }

    public final String toString() {
        return "Stroke(brush=" + this.f65486OooO00o + ", inputs=" + this.f65488OooO0OO + ", shape=" + this.f65489OooO0Oo + ")";
    }

    public /* synthetic */ OooOOO0(oO0O000o.OooO00o oooO00o, o000OO00.OooO0O0 oooO0O0, OooOOO oooOOO, int i) {
        this((oO0O000o.OooO00o<Long>) oooO00o, oooO0O0, (i & 4) != 0 ? null : oooOOO, (OooOo00) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooOOO0(o000OO00.OooO0O0 brush, OooOOO inputs) {
        this(new OooO(0, brush, inputs), brush, inputs, 8);
        kotlin.jvm.internal.OooOOO0.OooO0oO(brush, "brush");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputs, "inputs");
    }
}
