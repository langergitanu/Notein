package o000OO00;

import OooOoO.C20509OooO0oo;
import androidx.ink.brush.BrushTipNative;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import o000OO00.C24453OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o000OO00.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24477Oooo00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f82769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<C24453OooO0oO> f82770OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82768OooO0Oo = {new C24028OooOoO0(C24477Oooo00O.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f82767OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: o000OO00.Oooo00O$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o000OO00.Oooo00O$OooO0O0 */
    public static final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((BrushTipNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C24477Oooo00O() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List<o000OO00.OooO0oO>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    public C24477Oooo00O(oO0O000o.OooO00o<Long> oooO00o, List<C24453OooO0oO> list) {
        BrushTipNative brushTipNative = BrushTipNative.f65350OooO00o;
        this.f82769OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0O0(1, brushTipNative, BrushTipNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        if (list == 0) {
            oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, brushTipNative.getBehaviorCount(OooO00o()));
            list = new ArrayList<>(C34428OooOOo.OooOOoo(OooO2, 10));
            Iterator<Integer> it = OooO2.iterator();
            while (((C32520OooO0oo) it).f116817OooOoO0) {
                final int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
                C24453OooO0oO.OooO00o oooO00o2 = C24453OooO0oO.f82640OooO0Oo;
                oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o() { // from class: o000OO00.Oooo000
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return Long.valueOf(BrushTipNative.f65350OooO00o.newCopyOfBrushBehavior(this.f82766OooOo0o.OooO00o(), iNextInt));
                    }
                };
                oooO00o2.getClass();
                list.add(new C24453OooO0oO(oooO00o3, null, null));
            }
        }
        List<C24453OooO0oO> listUnmodifiableList = Collections.unmodifiableList(oOo000Oo.OooOo.o0ooOO0((Iterable) list));
        kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(...)");
        this.f82770OooO0O0 = listUnmodifiableList;
    }

    public final long OooO00o() {
        return this.f82769OooO00o.OooO00o(this, f82768OooO0Oo[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C24477Oooo00O)) {
            return false;
        }
        BrushTipNative brushTipNative = BrushTipNative.f65350OooO00o;
        C24477Oooo00O c24477Oooo00O = (C24477Oooo00O) obj;
        return brushTipNative.getScaleY(OooO00o()) == brushTipNative.getScaleY(c24477Oooo00O.OooO00o()) && brushTipNative.getScaleX(OooO00o()) == brushTipNative.getScaleX(c24477Oooo00O.OooO00o()) && brushTipNative.getPinch(OooO00o()) == brushTipNative.getPinch(c24477Oooo00O.OooO00o()) && brushTipNative.getCornerRounding(OooO00o()) == brushTipNative.getCornerRounding(c24477Oooo00O.OooO00o()) && brushTipNative.getSlantDegrees(OooO00o()) == brushTipNative.getSlantDegrees(c24477Oooo00O.OooO00o()) && brushTipNative.getRotationDegrees(OooO00o()) == brushTipNative.getRotationDegrees(c24477Oooo00O.OooO00o()) && brushTipNative.getParticleGapDistanceScale(OooO00o()) == brushTipNative.getParticleGapDistanceScale(c24477Oooo00O.OooO00o()) && brushTipNative.getParticleGapDurationMillis(OooO00o()) == brushTipNative.getParticleGapDurationMillis(c24477Oooo00O.OooO00o()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82770OooO0O0, c24477Oooo00O.f82770OooO0O0);
    }

    public final int hashCode() {
        BrushTipNative brushTipNative = BrushTipNative.f65350OooO00o;
        return this.f82770OooO0O0.hashCode() + ((Long.hashCode(brushTipNative.getParticleGapDurationMillis(OooO00o())) + ((Float.hashCode(brushTipNative.getParticleGapDistanceScale(OooO00o())) + ((Float.hashCode(brushTipNative.getRotationDegrees(OooO00o())) + ((Float.hashCode(brushTipNative.getSlantDegrees(OooO00o())) + ((Float.hashCode(brushTipNative.getCornerRounding(OooO00o())) + ((Float.hashCode(brushTipNative.getPinch(OooO00o())) + ((Float.hashCode(brushTipNative.getScaleY(OooO00o())) + (Float.hashCode(brushTipNative.getScaleX(OooO00o())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        BrushTipNative brushTipNative = BrushTipNative.f65350OooO00o;
        float scaleX = brushTipNative.getScaleX(OooO00o());
        float scaleY = brushTipNative.getScaleY(OooO00o());
        float cornerRounding = brushTipNative.getCornerRounding(OooO00o());
        float slantDegrees = brushTipNative.getSlantDegrees(OooO00o());
        float pinch = brushTipNative.getPinch(OooO00o());
        float rotationDegrees = brushTipNative.getRotationDegrees(OooO00o());
        float particleGapDistanceScale = brushTipNative.getParticleGapDistanceScale(OooO00o());
        long particleGapDurationMillis = brushTipNative.getParticleGapDurationMillis(OooO00o());
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("BrushTip(scale=(", scaleX, ", ", scaleY, "), cornerRounding=");
        sbOooO0Oo.append(cornerRounding);
        sbOooO0Oo.append(", slantDegrees=");
        sbOooO0Oo.append(slantDegrees);
        sbOooO0Oo.append(", pinch=");
        sbOooO0Oo.append(pinch);
        sbOooO0Oo.append(", rotationDegrees=");
        sbOooO0Oo.append(rotationDegrees);
        sbOooO0Oo.append(", particleGapDistanceScale=");
        sbOooO0Oo.append(particleGapDistanceScale);
        sbOooO0Oo.append(", particleGapDurationMillis=");
        sbOooO0Oo.append(particleGapDurationMillis);
        sbOooO0Oo.append(", behaviors=");
        return com.google.firebase.firestore.util.OooOOO.OooO0O0(")", sbOooO0Oo, this.f82770OooO0O0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24477Oooo00O(final List list, int i) {
        list = (i & 256) != 0 ? C34434OooOoO.f123453OooOo0o : list;
        this((oO0O000o.OooO00o<Long>) new oO0O000o.OooO00o() { // from class: o000OO00.OooOooo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BrushTipNative brushTipNative = BrushTipNative.f65350OooO00o;
                List list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((C24453OooO0oO) it.next()).OooO00o()));
                }
                return Long.valueOf(brushTipNative.create(1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, oOo000Oo.OooOo.o0ooOOo(arrayList)));
            }
        }, (List<C24453OooO0oO>) list);
    }
}
