package o000OO00;

import androidx.core.app.FrameMetricsAggregator;
import androidx.ink.brush.BrushCoatNative;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import o000OO00.C24477Oooo00O;
import o000OO00.OooOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f82651OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24477Oooo00O f82652OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooOo> f82653OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82650OooO0o0 = {new C24028OooOoO0(OooOO0O.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f82649OooO0Oo = new OooO00o();

    public static final class OooO00o {
    }

    public static final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((BrushCoatNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List<o000OO00.OooOo>] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    public OooOO0O(oO0O000o.OooO00o<Long> oooO00o, C24477Oooo00O c24477Oooo00O, List<OooOo> list) {
        BrushCoatNative brushCoatNative = BrushCoatNative.f65346OooO00o;
        this.f82651OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0O0(1, brushCoatNative, BrushCoatNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        if (c24477Oooo00O == null) {
            C24477Oooo00O.OooO00o oooO00o2 = C24477Oooo00O.f82767OooO0OO;
            oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o() { // from class: o000OO00.OooO
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return Long.valueOf(BrushCoatNative.f65346OooO00o.newCopyOfBrushTip(this.f82624OooOo0o.OooO00o()));
                }
            };
            oooO00o2.getClass();
            c24477Oooo00O = new C24477Oooo00O((oO0O000o.OooO00o<Long>) oooO00o3, (List<C24453OooO0oO>) null);
        }
        this.f82652OooO0O0 = c24477Oooo00O;
        if (list == 0) {
            int brushPaintPreferencesCount = brushCoatNative.getBrushPaintPreferencesCount(OooO00o());
            list = new ArrayList<>(brushPaintPreferencesCount);
            for (final int i = 0; i < brushPaintPreferencesCount; i++) {
                OooOo.OooO0O0 oooO0O0 = OooOo.f82686OooO0o0;
                oO0O000o.OooO00o oooO00o4 = new oO0O000o.OooO00o() { // from class: o000OO00.OooOO0
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return Long.valueOf(BrushCoatNative.f65346OooO00o.newCopyOfBrushPaintPreference(this.f82648OooOo0o.OooO00o(), i));
                    }
                };
                oooO0O0.getClass();
                list.add(new OooOo(oooO00o4, null, null));
            }
        }
        List<OooOo> listUnmodifiableList = Collections.unmodifiableList(oOo000Oo.OooOo.o0ooOO0((Iterable) list));
        kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(...)");
        this.f82653OooO0OO = listUnmodifiableList;
    }

    public final long OooO00o() {
        return this.f82651OooO00o.OooO00o(this, f82650OooO0o0[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82652OooO0O0, oooOO0O.f82652OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82653OooO0OO, oooOO0O.f82653OooO0OO);
    }

    public final int hashCode() {
        return this.f82653OooO0OO.hashCode() + (this.f82652OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        return "BrushCoat(tip=" + this.f82652OooO0O0 + ", paintPreferences=" + this.f82653OooO0OO + ")";
    }

    public OooOO0O() {
        final C24477Oooo00O c24477Oooo00O = new C24477Oooo00O((List) null, FrameMetricsAggregator.EVERY_DURATION);
        final List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(new OooOo(null));
        this(new oO0O000o.OooO00o() { // from class: o000OO00.OooO0oo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BrushCoatNative brushCoatNative = BrushCoatNative.f65346OooO00o;
                long jOooO00o = c24477Oooo00O.OooO00o();
                List list = listOooO0oO;
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("BrushCoat.paintPreferences cannot be empty");
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((OooOo) it.next()).OooO0O0()));
                }
                return Long.valueOf(brushCoatNative.create(jOooO00o, oOo000Oo.OooOo.o0ooOOo(arrayList)));
            }
        }, c24477Oooo00O, listOooO0oO);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOO0O(final C24477Oooo00O c24477Oooo00O, OooOo oooOo) {
        final List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(oooOo);
        this(new oO0O000o.OooO00o() { // from class: o000OO00.OooO0oo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BrushCoatNative brushCoatNative = BrushCoatNative.f65346OooO00o;
                long jOooO00o = c24477Oooo00O.OooO00o();
                List list = listOooO0oO;
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("BrushCoat.paintPreferences cannot be empty");
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((OooOo) it.next()).OooO0O0()));
                }
                return Long.valueOf(brushCoatNative.create(jOooO00o, oOo000Oo.OooOo.o0ooOOo(arrayList)));
            }
        }, c24477Oooo00O, listOooO0oO);
    }
}
