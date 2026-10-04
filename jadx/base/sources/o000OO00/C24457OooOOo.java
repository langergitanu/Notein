package o000OO00;

import OooOo.C20481OooOOoo;
import OooOoOO.C20519OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.app.FrameMetricsAggregator;
import androidx.ink.brush.BrushFamilyNative;
import androidx.ink.brush.InputModelNative;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import o000OO00.C24457OooOOo;
import o000OO00.OooOO0O;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o000OO00.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24457OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f82668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooOO0O> f82669OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f82670OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32447OooOOo f82671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f82672OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f82673OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82667OooO0oo = {new C24028OooOoO0(C24457OooOOo.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f82666OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: o000OO00.OooOOo$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o000OO00.OooOOo$OooO0OO */
    public static final /* synthetic */ class OooO0OO extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((BrushFamilyNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List<o000OO00.OooOO0O>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList] */
    public C24457OooOOo(oO0O000o.OooO00o<Long> oooO00o, List<OooOO0O> list, OooO0O0 oooO0O0) {
        OooO0O0.C19615OooO0O0 oooO0OO;
        BrushFamilyNative brushFamilyNative = BrushFamilyNative.f65347OooO00o;
        this.f82668OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0OO(1, brushFamilyNative, BrushFamilyNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        if (list == 0) {
            oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, brushFamilyNative.getBrushCoatCount(OooO0O0()));
            list = new ArrayList<>(C34428OooOOo.OooOOoo(OooO2, 10));
            Iterator<Integer> it = OooO2.iterator();
            while (((C32520OooO0oo) it).f116817OooOoO0) {
                final int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
                OooOO0O.OooO00o oooO00o2 = OooOO0O.f82649OooO0Oo;
                oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o() { // from class: o000OO00.OooOOO0
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return Long.valueOf(BrushFamilyNative.f65347OooO00o.newCopyOfBrushCoat(this.f82661OooOo0o.OooO0O0(), iNextInt));
                    }
                };
                oooO00o2.getClass();
                list.add(new OooOO0O(oooO00o3, null, null));
            }
        }
        List<OooOO0O> listUnmodifiableList = Collections.unmodifiableList(oOo000Oo.OooOo.o0ooOO0((Iterable) list));
        kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(...)");
        this.f82669OooO0O0 = listUnmodifiableList;
        if (oooO0O0 == null) {
            OooO0O0.OooO00o oooO00o4 = OooO0O0.f82674OooO0O0;
            int inputModelType = BrushFamilyNative.f65347OooO00o.getInputModelType(OooO0O0());
            OooOOO oooOOO = new OooOOO(this, 0);
            oooO00o4.getClass();
            if (inputModelType == 4) {
                oooO0OO = new OooO0O0.OooO0OO(oooOOO);
            } else {
                OooO0O0.C19615OooO0O0 c19615OooO0O0OooO0O0 = OooO0O0.C19615OooO0O0.f82678OooO0o.OooO0O0(inputModelType);
                if (c19615OooO0O0OooO0O0 == null) {
                    throw new IllegalStateException(C21532OooOOo.OooO0OO(inputModelType, "Invalid NoParametersModel type: ").toString());
                }
                oooO0OO = c19615OooO0O0OooO0O0;
            }
            oooO0O0 = oooO0OO;
        }
        this.f82670OooO0OO = oooO0O0;
        this.f82671OooO0Oo = C20519OooO0Oo.OooO0OO(new OooOOOO(this, 0));
        this.f82673OooO0o0 = BrushFamilyNative.f65347OooO00o.getDeveloperComment(OooO0O0());
        int i = 0;
        this.f82672OooO0o = C20519OooO0Oo.OooO0OO(new C24456OooOOOo(this, i));
        C20519OooO0Oo.OooO0OO(new C24459OooOOo0(this, i));
    }

    public final String OooO00o() {
        return (String) this.f82671OooO0Oo.getValue();
    }

    public final long OooO0O0() {
        return this.f82668OooO00o.OooO00o(this, f82667OooO0oo[0]);
    }

    public final long OooO0OO() {
        return ((Number) this.f82672OooO0o.getValue()).longValue();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C24457OooOOo)) {
            if (obj == this) {
                return true;
            }
            C24457OooOOo c24457OooOOo = (C24457OooOOo) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82669OooO0O0, c24457OooOOo.f82669OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82670OooO0OO, c24457OooOOo.f82670OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(OooO00o(), c24457OooOOo.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82673OooO0o0, c24457OooOOo.f82673OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f82673OooO0o0.hashCode() + ((OooO00o().hashCode() + ((this.f82670OooO0OO.hashCode() + (this.f82669OooO0O0.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BrushFamily(developerComment=" + this.f82673OooO0o0 + ", coats=" + this.f82669OooO0O0 + ", inputModel=" + this.f82670OooO0OO + ", clientBrushFamilyId=" + OooO00o() + ")";
    }

    /* JADX INFO: renamed from: o000OO00.OooOOo$OooO0O0 */
    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f82676OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOoO.OooO0O0 f82677OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82675OooO0OO = {new C24028OooOoO0(OooO0O0.class, "nativePointer", "getNativePointer$ink_brush()J", 0)};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f82674OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: o000OO00.OooOOo$OooO0O0$OooO00o */
        public static final class OooO00o {
        }

        /* JADX INFO: renamed from: o000OO00.OooOOo$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C19615OooO0O0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public static final C20481OooOOoo<C19615OooO0O0> f82678OooO0o = new C20481OooOOoo<>((Object) null);

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final String f82679OooO0o0;

            static {
                new C19615OooO0O0();
            }

            public C19615OooO0O0() {
                super(new C24460OooOOoo(0));
                this.f82679OooO0o0 = "PassthroughModel";
                C20481OooOOoo<C19615OooO0O0> c20481OooOOoo = f82678OooO0o;
                if (c20481OooOOoo.OooO00o(3)) {
                    throw new IllegalStateException("Duplicate NoParametersModel type: 3".toString());
                }
                c20481OooOOoo.OooO0oO(3, this);
            }

            public final String toString() {
                return this.f82679OooO0o0;
            }
        }

        /* JADX INFO: renamed from: o000OO00.OooOOo$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        public static final /* synthetic */ class C24458OooO0Oo extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final C32460OooOooO invoke(Long l) {
                ((InputModelNative) this.receiver).free(l.longValue());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        static {
            C20481OooOOoo<C19615OooO0O0> c20481OooOOoo = C19615OooO0O0.f82678OooO0o;
            f82676OooO0Oo = new OooO0OO();
        }

        public OooO0O0(oO0O000o.OooO00o<Long> oooO00o) {
            this.f82677OooO00o = new o000OOoO.OooO0O0(oooO00o, new C24458OooO0Oo(1, InputModelNative.f65352OooO00o, InputModelNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        }

        /* JADX INFO: renamed from: o000OO00.OooOOo$OooO0O0$OooO0OO */
        public static final class OooO0OO extends OooO0O0 {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final int f82680OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final long f82681OooO0o0;

            public OooO0OO(oO0O000o.OooO00o<Long> oooO00o) {
                super(oooO00o);
                InputModelNative inputModelNative = InputModelNative.f65352OooO00o;
                InterfaceC34602OooOO0o<?>[] interfaceC34602OooOO0oArr = OooO0O0.f82675OooO0OO;
                this.f82681OooO0o0 = inputModelNative.getSlidingWindowDurationMillis(this.f82677OooO00o.OooO00o(this, interfaceC34602OooOO0oArr[0]));
                this.f82680OooO0o = inputModelNative.getSlidingUpsamplingFrequencyHz(this.f82677OooO00o.OooO00o(this, interfaceC34602OooOO0oArr[0]));
            }

            public final boolean equals(Object obj) {
                if (obj != null && (obj instanceof OooO0OO)) {
                    OooO0OO oooO0OO = (OooO0OO) obj;
                    if (this.f82681OooO0o0 == oooO0OO.f82681OooO0o0 && this.f82680OooO0o == oooO0OO.f82680OooO0o) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f82680OooO0o) + (Long.hashCode(this.f82681OooO0o0) * 31);
            }

            public final String toString() {
                return "SlidingWindowModel(windowDurationMillis=" + this.f82681OooO0o0 + ", upsamplingFrequencyHz=" + this.f82680OooO0o + ")";
            }

            public OooO0OO() {
                this(new OooOo00());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24457OooOOo(final List<OooOO0O> coats, final OooO0O0 inputModel, final String str, final String str2) {
        this(new oO0O000o.OooO00o() { // from class: o000OO00.OooOO0o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BrushFamilyNative brushFamilyNative = BrushFamilyNative.f65347OooO00o;
                List list = coats;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((OooOO0O) it.next()).OooO00o()));
                }
                long[] jArrO0ooOOo = oOo000Oo.OooOo.o0ooOOo(arrayList);
                C24457OooOOo.OooO0O0 oooO0O0 = inputModel;
                oooO0O0.getClass();
                return Long.valueOf(brushFamilyNative.create(jArrO0ooOOo, oooO0O0.f82677OooO00o.OooO00o(oooO0O0, C24457OooOOo.OooO0O0.f82675OooO0OO[0]), str2, str));
            }
        }, coats, inputModel);
        kotlin.jvm.internal.OooOOO0.OooO0oO(coats, "coats");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputModel, "inputModel");
    }

    public C24457OooOOo() {
        C24477Oooo00O c24477Oooo00O = new C24477Oooo00O((List) null, FrameMetricsAggregator.EVERY_DURATION);
        OooOo oooOo = new OooOo(null);
        OooO0O0.OooO0OO inputModel = OooO0O0.f82676OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputModel, "inputModel");
        this((List<OooOO0O>) com.facebook.soloader.OooOo.OooO0oO(new OooOO0O(c24477Oooo00O, oooOo)), inputModel, "", "");
    }

    public C24457OooOOo(C24477Oooo00O c24477Oooo00O, OooO0O0.OooO0OO inputModel, String str, int i) {
        OooOo oooOo = new OooOo(null);
        inputModel = (i & 4) != 0 ? OooO0O0.f82676OooO0Oo : inputModel;
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputModel, "inputModel");
        this((List<OooOO0O>) com.facebook.soloader.OooOo.OooO0oO(new OooOO0O(c24477Oooo00O, oooOo)), inputModel, "", str);
    }
}
