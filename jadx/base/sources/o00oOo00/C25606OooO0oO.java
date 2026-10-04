package o00oOo00;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import o00o0o.AbstractC25434OooO00o;
import o00oOOoO.C25598OooO0O0;
import o00oOOoO.C25599OooO0OO;
import o00oOo00.C25606OooO0oO;
import o00oOo00.C25608OooOO0o;
import o00oOooO.C25631OooO00o;
import o00oo0OO.AbstractC25682OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;
import oOo000Oo.Oooo000;

/* JADX INFO: renamed from: o00oOo00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25606OooO0oO implements OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C25607OooO0oo f87358OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC25682OooO0O0 f87359OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25631OooO00o f87360OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25599OooO0OO f87361OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00oO.OooOO0O f87362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, OooO00o> f87363OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f87364OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile int f87365OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f87366OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f87367OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Object f87368OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Set<Integer> f87369OooOO0o;

    /* JADX INFO: renamed from: o00oOo00.OooO0oO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC25434OooO00o<Bitmap> f87370OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f87371OooO0O0;

        public OooO00o(AbstractC25434OooO00o<Bitmap> abstractC25434OooO00o) {
            this.f87370OooO00o = abstractC25434OooO00o;
        }
    }

    public C25606OooO0oO(AbstractC25682OooO0O0 platformBitmapFactory, C25631OooO00o c25631OooO00o, C25599OooO0OO c25599OooO0OO, o00O00oO.OooOO0O oooOO0O, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(platformBitmapFactory, "platformBitmapFactory");
        this.f87359OooO00o = platformBitmapFactory;
        this.f87360OooO0O0 = c25631OooO00o;
        this.f87361OooO0OO = c25599OooO0OO;
        this.f87362OooO0Oo = oooOO0O;
        int iOooO0o = (OooO0o(oooOO0O) * i) / 1000;
        iOooO0o = iOooO0o < 1 ? 1 : iOooO0o;
        this.f87364OooO0o0 = iOooO0o;
        this.f87363OooO0o = new ConcurrentHashMap<>();
        this.f87358OooO = new C25607OooO0oo(oooOO0O.OooO0O0());
        this.f87367OooOO0 = -1;
        this.f87368OooOO0O = C34436OooOoOO.f123455OooOo0o;
        this.f87369OooOO0o = C34438OooOoo0.f123458OooOo0o;
        OooO0O0(OooO0o(oooOO0O));
        this.f87365OooO0oO = (int) (iOooO0o * 0.5f);
    }

    public static int OooO0o(o00O00oO.OooOO0O oooOO0O) {
        long millis = TimeUnit.SECONDS.toMillis(1L) / ((long) (oooOO0O.OooO0Oo() / oooOO0O.OooO0O0()));
        return (int) (millis >= 1 ? millis : 1L);
    }

    @Override // o00oOo00.OooOO0
    public final void OooO00o(int i, int i2, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        OooO0oO(i, i2);
        oooO00o.invoke();
    }

    @Override // o00oOo00.OooOO0
    public final void OooO0O0(int i) {
        o00O00oO.OooOO0O oooOO0O = this.f87362OooO0Oo;
        int iOooO0Oo = oooOO0O.OooO0Oo();
        int iOooO00o = oooOO0O.OooO00o();
        if (iOooO00o < 1) {
            iOooO00o = 1;
        }
        int i2 = iOooO0Oo * iOooO00o;
        int iOooO0O0 = oooOO0O.OooO0O0();
        int iOooO0o = OooO0o(oooOO0O);
        if (i > iOooO0o) {
            i = iOooO0o;
        }
        C25599OooO0OO c25599OooO0OO = this.f87361OooO0OO;
        int i3 = i >= 1 ? i : 1;
        int i4 = c25599OooO0OO.f87325OooO00o;
        if (i3 > i4) {
            i3 = i4;
        }
        float f = (i2 / 1000.0f) * i3;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = iOooO0O0;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i5 = 0;
        oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, iOooO0O0);
        int iOooO0Oo2 = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(OooO2, 10));
        if (iOooO0Oo2 < 16) {
            iOooO0Oo2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo2);
        Iterator<Integer> it = OooO2.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            Integer next = it.next();
            int iIntValue = next.intValue();
            if (((int) (iIntValue % f3)) == 0) {
                i5 = iIntValue;
            }
            linkedHashMap.put(next, Integer.valueOf(i5));
        }
        this.f87368OooOO0O = linkedHashMap;
        this.f87369OooOO0o = OooOo.o0OO00O(linkedHashMap.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // o00oOo00.OooOO0
    public final C25608OooOO0o OooO0OO(int i, int i2, int i3) {
        Integer num = (Integer) this.f87368OooOO0O.get(Integer.valueOf(i));
        if (num == null) {
            return OooO0o0(i);
        }
        int iIntValue = num.intValue();
        this.f87367OooOO0 = iIntValue;
        OooO00o oooO00o = this.f87363OooO0o.get(num);
        if (oooO00o == null || oooO00o.f87371OooO0O0 || !oooO00o.f87370OooO00o.Oooo00o()) {
            oooO00o = null;
        }
        if (oooO00o == null) {
            OooO0oO(i2, i3);
            return OooO0o0(iIntValue);
        }
        C25607OooO0oo c25607OooO0oo = this.f87358OooO;
        int i4 = this.f87365OooO0oO;
        int iOooO00o = c25607OooO0oo.OooO00o(this.f87364OooO0o0 + i4);
        if (i4 >= iOooO00o ? !((i4 > iIntValue || iIntValue > c25607OooO0oo.f87372OooO00o) && (iIntValue < 0 || iIntValue > iOooO00o)) : !(i4 > iIntValue || iIntValue > iOooO00o)) {
            OooO0oO(i2, i3);
        }
        return new C25608OooOO0o(oooO00o.f87370OooO00o.clone(), C25608OooOO0o.OooO00o.f87380OooOo0o);
    }

    public final C25601OooO00o OooO0Oo(int i) {
        C25601OooO00o c25601OooO00o;
        C25607OooO0oo c25607OooO0oo = this.f87358OooO;
        Iterator<Integer> it = new oO0O00oo.OooO(0, c25607OooO0oo.f87372OooO00o, 1).iterator();
        do {
            c25601OooO00o = null;
            if (!((C32520OooO0oo) it).f116817OooOoO0) {
                break;
            }
            int iOooO00o = c25607OooO0oo.OooO00o(i - ((Oooo000) it).nextInt());
            OooO00o oooO00o = this.f87363OooO0o.get(Integer.valueOf(iOooO00o));
            if (oooO00o != null) {
                if (oooO00o.f87371OooO0O0 || !oooO00o.f87370OooO00o.Oooo00o()) {
                    oooO00o = null;
                }
                if (oooO00o != null) {
                    c25601OooO00o = new C25601OooO00o(iOooO00o, oooO00o.f87370OooO00o);
                }
            }
        } while (c25601OooO00o == null);
        return c25601OooO00o;
    }

    public final C25608OooOO0o OooO0o0(int i) {
        C25601OooO00o c25601OooO00oOooO0Oo = OooO0Oo(i);
        if (c25601OooO00oOooO0Oo == null) {
            return new C25608OooOO0o(null, C25608OooOO0o.OooO00o.f87382OooOoO0);
        }
        AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oClone = c25601OooO00oOooO0Oo.f87345OooOo.clone();
        this.f87367OooOO0 = c25601OooO00oOooO0Oo.f87346OooOo0o;
        return new C25608OooOO0o(abstractC25434OooO00oClone, C25608OooOO0o.OooO00o.f87379OooOo);
    }

    public final void OooO0oO(final int i, final int i2) {
        if (this.f87366OooO0oo) {
            return;
        }
        this.f87366OooO0oo = true;
        C25598OooO0O0.f87324OooO00o.execute(new Runnable() { // from class: o00oOo00.OooO0o
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                ArrayList arrayList;
                int iIntValue;
                C25606OooO0oO this$0 = this.f87349OooOo0o;
                int i3 = i;
                int i4 = i2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                loop0: while (true) {
                    int i5 = this$0.f87367OooOO0;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    C25607OooO0oo c25607OooO0oo = this$0.f87358OooO;
                    int i6 = this$0.f87364OooO0o0;
                    c25607OooO0oo.getClass();
                    oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, i6);
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
                    Iterator<Integer> it = OooO2.iterator();
                    while (((C32520OooO0oo) it).f116817OooOoO0) {
                        arrayList2.add(Integer.valueOf(c25607OooO0oo.OooO00o(((Oooo000) it).nextInt() + i5)));
                    }
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (this$0.f87369OooOO0o.contains(Integer.valueOf(((Number) obj).intValue()))) {
                            arrayList.add(obj);
                        }
                    }
                    Set setO0OO00O = OooOo.o0OO00O(arrayList);
                    Set<Integer> setKeySet = this$0.f87363OooO0o.keySet();
                    kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet, "<get-keys>(...)");
                    ArrayDeque arrayDeque = new ArrayDeque(C34449Oooo0oo.OooO0oO(setKeySet, setO0OO00O));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = ((Number) it2.next()).intValue();
                        if (this$0.f87363OooO0o.get(Integer.valueOf(iIntValue2)) == null) {
                            int i7 = this$0.f87367OooOO0;
                            if (i7 == -1 || setO0OO00O.contains(Integer.valueOf(i7))) {
                                Integer num = (Integer) arrayDeque.pollFirst();
                                int iIntValue3 = num != null ? num.intValue() : -1;
                                C25606OooO0oO.OooO00o oooO00o = this$0.f87363OooO0o.get(Integer.valueOf(iIntValue3));
                                AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oOooO0OO = oooO00o != null ? oooO00o.f87370OooO00o.OooO0OO() : null;
                                if (abstractC25434OooO00oOooO0OO == null) {
                                    AbstractC25682OooO0O0 abstractC25682OooO0O0 = this$0.f87359OooO00o;
                                    abstractC25682OooO0O0.getClass();
                                    AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oOooO00o = abstractC25682OooO0O0.OooO00o(i3, i4, Bitmap.Config.ARGB_8888);
                                    oooO00o = new C25606OooO0oO.OooO00o(abstractC25434OooO00oOooO00o);
                                    abstractC25434OooO00oOooO0OO = abstractC25434OooO00oOooO00o.clone();
                                }
                                oooO00o.f87371OooO0O0 = true;
                                try {
                                    this$0.OooO0oo(iIntValue2, abstractC25434OooO00oOooO0OO);
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    abstractC25434OooO00oOooO0OO.close();
                                    this$0.f87363OooO0o.remove(Integer.valueOf(iIntValue3));
                                    oooO00o.f87371OooO0O0 = false;
                                    this$0.f87363OooO0o.put(Integer.valueOf(iIntValue2), oooO00o);
                                } finally {
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    iIntValue = (int) (this$0.f87364OooO0o0 * 0.5f);
                } else {
                    int size = arrayList.size();
                    iIntValue = ((Number) arrayList.get(oO0O00oo.OooOO0.OooO0o((int) (size * 0.5f), 0, size - 1))).intValue();
                }
                this$0.f87365OooO0oO = iIntValue;
                this$0.f87366OooO0oo = false;
            }
        });
    }

    public final void OooO0oo(int i, AbstractC25434OooO00o abstractC25434OooO00o) throws IOException {
        AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oOooO0OO;
        C25601OooO00o c25601OooO00oOooO0Oo = OooO0Oo(i);
        C25631OooO00o c25631OooO00o = this.f87360OooO0O0;
        if (c25601OooO00oOooO0Oo != null && (abstractC25434OooO00oOooO0OO = c25601OooO00oOooO0Oo.f87345OooOo.OooO0OO()) != null) {
            try {
                int i2 = c25601OooO00oOooO0Oo.f87346OooOo0o;
                if (i2 < i) {
                    Bitmap bitmapOooo000 = abstractC25434OooO00oOooO0OO.Oooo000();
                    if (abstractC25434OooO00o.Oooo00o() && !abstractC25434OooO00o.Oooo000().equals(bitmapOooo000)) {
                        Canvas canvas = new Canvas((Bitmap) abstractC25434OooO00o.Oooo000());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.drawBitmap(bitmapOooo000, 0.0f, 0.0f, (Paint) null);
                    }
                    Iterator<Integer> it = new oO0O00oo.OooO(i2 + 1, i, 1).iterator();
                    while (((C32520OooO0oo) it).f116817OooOoO0) {
                        c25631OooO00o.OooO00o(((Oooo000) it).nextInt(), (Bitmap) abstractC25434OooO00o.Oooo000());
                    }
                    abstractC25434OooO00oOooO0OO.close();
                    return;
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                abstractC25434OooO00oOooO0OO.close();
            } finally {
            }
        }
        if (abstractC25434OooO00o.Oooo00o()) {
            new Canvas((Bitmap) abstractC25434OooO00o.Oooo000()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Iterator<Integer> it2 = new oO0O00oo.OooO(0, i, 1).iterator();
        while (((C32520OooO0oo) it2).f116817OooOoO0) {
            c25631OooO00o.OooO00o(((Oooo000) it2).nextInt(), (Bitmap) abstractC25434OooO00o.Oooo000());
        }
    }

    @Override // o00oOo00.OooOO0
    public final void clear() {
        ConcurrentHashMap<Integer, OooO00o> concurrentHashMap = this.f87363OooO0o;
        Collection<OooO00o> collectionValues = concurrentHashMap.values();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC25434OooO00o.OooOooo(((OooO00o) it.next()).f87370OooO00o);
        }
        concurrentHashMap.clear();
        this.f87367OooOO0 = -1;
    }
}
