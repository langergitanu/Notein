package o00OO0O0;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.material.color.utilities.C22378Oooo00o;
import com.google.android.material.color.utilities.C22382Oooo0o0;
import com.google.android.material.color.utilities.Oooo000;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25446OooO0Oo;
import o0OOo0o.OooOO0;
import o0o0OoOo.C30735OooOOOO;
import o0o0OoOo.C30738OooOOo0;
import o0o0OoOo.C30743OooOo0O;
import o0oo0O0O.C31221OooO00o;
import oO00ooO.C32442OooOO0o;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f84783OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f84784OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f84785OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f84786OooO0Oo = 0;

    public static final boolean OooO(AbstractC33320OooOoo abstractC33320OooOoo) {
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        return abstractC33320OooOoo.o00000OO() instanceof AbstractC33316OooOo0o;
    }

    public static void OooO00o(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static int OooO0O0(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return ((bArr[i + 3] & 255) << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    public static final PointF OooO0OO(RectF rectF) {
        OooOOO0.OooO0oO(rectF, "<this>");
        return new PointF((rectF.left + rectF.right) / 2.0f, (rectF.top + rectF.bottom) / 2.0f);
    }

    public static final RectF OooO0Oo(RectF rectF, float f, float f2, float f3) {
        OooOOO0.OooO0oO(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f2);
        OooOO0O(rectF2, f3);
        return rectF2;
    }

    public static final List OooO0o(RectF rectF) {
        OooOOO0.OooO0oO(rectF, "<this>");
        return C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.right, rectF.bottom), new PointF(rectF.left, rectF.bottom));
    }

    public static final void OooO0o0(RectF rectF, float f, float f2, float f3) {
        OooOOO0.OooO0oO(rectF, "<this>");
        rectF.left = Float.min(f - f3, rectF.left);
        rectF.right = Float.max(f + f3, rectF.right);
        rectF.top = Float.min(f2 - f3, rectF.top);
        rectF.bottom = Float.max(f2 + f3, rectF.bottom);
    }

    public static final RectF OooO0oO(RectF rectF, float f) {
        OooOOO0.OooO0oO(rectF, "<this>");
        List listOooOO0o = C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.right, rectF.bottom), new PointF(rectF.left, rectF.bottom));
        PointF pointF = new PointF((rectF.left + rectF.right) / 2.0f, (rectF.top + rectF.bottom) / 2.0f);
        List list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C25446OooO0Oo.OooOO0O((PointF) it.next(), pointF, f));
        }
        Comparator comparatorComparing = Comparator.comparing(new Oooo000(new C31221OooO00o()));
        Object obj = arrayList.stream().map(new C22378Oooo00o(new C30735OooOOOO(1), 1)).min(comparatorComparing).get();
        OooOOO0.OooO0o(obj, "get(...)");
        float fFloatValue = ((Number) obj).floatValue();
        Stream stream = arrayList.stream();
        final C30738OooOOo0 c30738OooOOo0 = new C30738OooOOo0(1);
        Object obj2 = stream.map(new Function() { // from class: o0oo0O0O.OooO0O0
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                return (Float) c30738OooOOo0.invoke(obj3);
            }
        }).min(comparatorComparing).get();
        OooOOO0.OooO0o(obj2, "get(...)");
        float fFloatValue2 = ((Number) obj2).floatValue();
        Object obj3 = arrayList.stream().map(new C22382Oooo0o0(new C30743OooOo0O(1), 1)).max(comparatorComparing).get();
        OooOOO0.OooO0o(obj3, "get(...)");
        float fFloatValue3 = ((Number) obj3).floatValue();
        Stream stream2 = arrayList.stream();
        final OooOO0 oooOO02 = new OooOO0(3);
        Object obj4 = stream2.map(new Function() { // from class: o0oo0O0O.OooO0OO
            @Override // java.util.function.Function
            public final Object apply(Object obj5) {
                return (Float) oooOO02.invoke(obj5);
            }
        }).max(comparatorComparing).get();
        OooOOO0.OooO0o(obj4, "get(...)");
        return new RectF(fFloatValue, fFloatValue2, fFloatValue3, ((Number) obj4).floatValue());
    }

    public static final boolean OooO0oo(float f, float f2, RectF rectF) {
        OooOOO0.OooO0oO(rectF, "<this>");
        float f3 = rectF.left;
        if (f > rectF.right || f3 > f) {
            return false;
        }
        return f2 <= rectF.bottom && rectF.top <= f2;
    }

    public static final AbstractC33328Oooo0O0 OooOO0(AbstractC33320OooOoo abstractC33320OooOoo) {
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) {
            return ((AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO).f120554OooOo;
        }
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0) {
            return (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO;
        }
        throw new C32442OooOO0o();
    }

    public static final void OooOO0O(RectF rectF, float f) {
        OooOOO0.OooO0oO(rectF, "<this>");
        rectF.left *= f;
        rectF.top *= f;
        rectF.right *= f;
        rectF.bottom *= f;
    }

    public static final AbstractC33328Oooo0O0 OooOO0o(AbstractC33320OooOoo abstractC33320OooOoo) {
        OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) {
            return ((AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO).f120555OooOoO0;
        }
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0) {
            return (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO;
        }
        throw new C32442OooOO0o();
    }
}
