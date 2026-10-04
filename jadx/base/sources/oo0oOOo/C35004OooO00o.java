package oo0oOOo;

import OooOO0.OooO0OO;
import android.graphics.PointF;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oOo.C26125OooO0OO;
import o0O0oOo.C26130OooO0oo;
import o0O0oOo.C26132OooOO0O;
import o0O0oOo.C26136OooOOOO;
import o0O0oOo.C26138OooOOo;
import o0O0oOo.C26139OooOOo0;
import o0O0oOo.C26141OooOo0;
import o0O0oOo.C26142OooOo0O;
import o0O0oOo.C26143OooOo0o;
import oO00ooO.C32443OooOOO;
import oOO00OO0.OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import org.opencv.imgproc.Imgproc;

/* JADX INFO: renamed from: oo0oOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35004OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f125706OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f125707OooO0O0 = C34434OooOoO.f123453OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bf  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable, o0O0oOo.OooOO0o] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [o0O0oOo.OooOO0o] */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.graphics.PointF[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC26133OooOO0o OooO00o() {
        int i;
        OooO0O0 oooO0O0;
        ?? next;
        ?? next2;
        ?? next3;
        ?? next4;
        ?? c26136OooOOOO;
        int i2 = 1;
        Object obj = null;
        if (this.f125707OooO0O0.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f125706OooO00o;
        int i3 = 0;
        float fSqrt = 0.0f;
        if (arrayList.size() >= 2) {
            int size = arrayList.size() - 1;
            int i4 = 0;
            while (i4 < size) {
                PointF pointF = (PointF) arrayList.get(i4);
                i4++;
                float f = pointF.x - ((PointF) arrayList.get(i4 % arrayList.size())).x;
                fSqrt += (float) Math.sqrt(OooO0OO.OooO00o(pointF.y, r10.y, f * f));
            }
        }
        double d = ((double) fSqrt) * 0.03d;
        float f2 = ((PointF) OooOo.Oooo0oO(this.f125707OooO0O0)).x - ((PointF) OooOo.OoooOOo(this.f125707OooO0O0)).x;
        float fSqrt2 = (float) Math.sqrt(OooO0OO.OooO00o(r3.y, r5.y, f2 * f2));
        boolean z = ((double) fSqrt2) < ((double) 3) * d;
        Log.d("InstantShaper", OooOo.Oooo0oO(this.f125707OooO0O0) + ", " + OooOo.OoooOOo(this.f125707OooO0O0));
        Log.d("InstantShaper", "getCurveLength: " + fSqrt + ", dis:" + fSqrt2 + ", epsilon:" + d + ", isPolygon = " + z);
        OooO0O0 oooO0O02 = new OooO0O0();
        Iterable<PointF> iterable = (Iterable) this.f125707OooO0O0;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        for (PointF pointF2 : iterable) {
            arrayList2.add(new oOO00OO0.OooO0OO(pointF2.x, pointF2.y));
            obj = obj;
            i2 = i2;
            oooO0O02 = oooO0O02;
        }
        int i5 = i2;
        OooO0O0 oooO0O03 = oooO0O02;
        ?? r16 = obj;
        oOO00OO0.OooO0OO[] oooO0OOArr = (oOO00OO0.OooO0OO[]) arrayList2.toArray(new oOO00OO0.OooO0OO[0]);
        if (oooO0OOArr == null || oooO0OOArr.length == 0) {
            i = 0;
            oooO0O0 = oooO0O03;
        } else {
            int length = oooO0OOArr.length;
            if (length > 0) {
                oooO0O0 = oooO0O03;
                oooO0O0.OooO00o(length, oOO00OO0.OooO00o.OooO0O0(5, 2));
            } else {
                oooO0O0 = oooO0O03;
            }
            float[] fArr = new float[length * 2];
            int i6 = 0;
            while (i6 < length) {
                oOO00OO0.OooO0OO oooO0OO = oooO0OOArr[i6];
                int i7 = i6 * 2;
                fArr[i7] = (float) oooO0OO.f123307OooO00o;
                fArr[i7 + 1] = (float) oooO0OO.f123308OooO0O0;
                i6++;
                i3 = i3;
            }
            i = i3;
            oooO0O0.OooO0Oo(fArr);
        }
        OooO0O0 oooO0O04 = new OooO0O0();
        Imgproc.OooO00o(oooO0O0, oooO0O04, d);
        String str = AbstractC26133OooOO0o.f89191OooO0O0;
        int iOooO0o0 = (int) oooO0O04.OooO0o0();
        oOO00OO0.OooO0OO[] oooO0OOArr2 = new oOO00OO0.OooO0OO[iOooO0o0];
        if (iOooO0o0 != 0) {
            oooO0O04.OooO0O0(new float[iOooO0o0 * 2]);
            for (int i8 = i; i8 < iOooO0o0; i8++) {
                int i9 = i8 * 2;
                oooO0OOArr2[i8] = new oOO00OO0.OooO0OO(r5[i9], r5[i9 + 1]);
            }
        }
        List listAsList = Arrays.asList(oooO0OOArr2);
        OooOOO0.OooO0o(listAsList, "toList(...)");
        List<oOO00OO0.OooO0OO> list = listAsList;
        ArrayList<PointF> arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (oOO00OO0.OooO0OO oooO0OO2 : list) {
            arrayList3.add(new PointF((float) oooO0OO2.f123307OooO00o, (float) oooO0OO2.f123308OooO0O0));
        }
        String str2 = AbstractC26133OooOO0o.f89191OooO0O0;
        int size2 = arrayList3.size();
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
        for (PointF pointF3 : arrayList3) {
            arrayList4.add("[" + pointF3.x + "," + pointF3.y + "]");
        }
        Log.d(str2, "createGeometryInternal points size: " + size2 + ", " + arrayList4);
        if (z) {
            switch (arrayList3.size()) {
                case 3:
                    Log.d(AbstractC26133OooOO0o.f89191OooO0O0, "triangle");
                    c26136OooOOOO = new C26143OooOo0o(arrayList3);
                    break;
                case 4:
                    Object objOoooOOo = OooOo.OoooOOo(arrayList3);
                    ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                    for (PointF pointF4 : arrayList3) {
                        String str3 = AbstractC26133OooOO0o.f89191OooO0O0;
                        arrayList5.add(Float.valueOf(AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF4, (PointF) objOoooOOo)));
                        objOoooOOo = pointF4;
                    }
                    ArrayList arrayList6 = new ArrayList();
                    PointF pointFOooO0OO = AbstractC26133OooOO0o.OooO00o.OooO0OO((PointF) OooOo.Oooo0oO(arrayList3), (PointF) OooOo.OoooOOo(arrayList3));
                    int i10 = i;
                    for (Object obj2 : arrayList3) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            C34429OooOOo0.OooOOo();
                            throw r16;
                        }
                        int i12 = i11 == arrayList3.size() ? i : i11;
                        String str4 = AbstractC26133OooOO0o.f89191OooO0O0;
                        PointF pointFOooO0OO2 = AbstractC26133OooOO0o.OooO00o.OooO0OO((PointF) arrayList3.get(i12), (PointF) arrayList3.get(i10));
                        arrayList6.add(Float.valueOf((((pointFOooO0OO2.y * pointFOooO0OO.y) + (pointFOooO0OO2.x * pointFOooO0OO.x)) / ((Number) arrayList5.get(i12)).floatValue()) / ((Number) arrayList5.get(i10)).floatValue()));
                        i10 = i11;
                        pointFOooO0OO = pointFOooO0OO2;
                    }
                    Iterator it = arrayList6.iterator();
                    while (it.hasNext()) {
                        Log.d(AbstractC26133OooOO0o.f89191OooO0O0, "cos:" + ((Number) it.next()).floatValue());
                    }
                    PointF pointFOooO0OO3 = AbstractC26133OooOO0o.OooO00o.OooO0OO((PointF) arrayList3.get(i5), (PointF) arrayList3.get(i));
                    PointF pointFOooO0OO4 = AbstractC26133OooOO0o.OooO00o.OooO0OO((PointF) arrayList3.get(3), (PointF) arrayList3.get(2));
                    float fFloatValue = (((pointFOooO0OO3.y * pointFOooO0OO4.y) + (pointFOooO0OO3.x * pointFOooO0OO4.x)) / ((Number) arrayList5.get(1)).floatValue()) / ((Number) arrayList5.get(3)).floatValue();
                    PointF pointFOooO0OO5 = AbstractC26133OooOO0o.OooO00o.OooO0OO((PointF) arrayList3.get(2), (PointF) arrayList3.get(1));
                    PointF pointFOooO0OO6 = AbstractC26133OooOO0o.OooO00o.OooO0OO((PointF) arrayList3.get(0), (PointF) arrayList3.get(3));
                    float fFloatValue2 = (((pointFOooO0OO5.y * pointFOooO0OO6.y) + (pointFOooO0OO5.x * pointFOooO0OO6.x)) / ((Number) arrayList5.get(2)).floatValue()) / ((Number) arrayList5.get(0)).floatValue();
                    Log.d(AbstractC26133OooOO0o.f89191OooO0O0, "a13:" + fFloatValue + ", a20:" + fFloatValue2);
                    if (fFloatValue >= -0.98d || fFloatValue2 >= -0.98d) {
                        c26136OooOOOO = new C26142OooOo0O(arrayList3);
                        break;
                    } else {
                        Iterator it2 = arrayList6.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        float fFloatValue3 = ((Number) it2.next()).floatValue();
                        while (it2.hasNext()) {
                            fFloatValue3 = Math.max(fFloatValue3, ((Number) it2.next()).floatValue());
                        }
                        if (fFloatValue3 < 0.15f) {
                            float fFloatValue4 = ((Number) arrayList5.get(2)).floatValue() + ((Number) arrayList5.get(0)).floatValue();
                            float fFloatValue5 = ((Number) arrayList5.get(3)).floatValue() + ((Number) arrayList5.get(1)).floatValue();
                            c26136OooOOOO = (fFloatValue4 < fFloatValue5 ? fFloatValue4 / fFloatValue5 : fFloatValue5 / fFloatValue4) > 0.9f ? new C26141OooOo0(arrayList3) : new C26138OooOOo(arrayList3);
                            break;
                        }
                    }
                    break;
                case 5:
                    c26136OooOOOO = new C26139OooOOo0(arrayList3);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    List<C32443OooOOO> listO000000 = OooOo.o000000(OooOo.OooooOo(arrayList3, OooOo.Oooo0oO(arrayList3)));
                    ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(listO000000, 10));
                    for (C32443OooOOO c32443OooOOO : listO000000) {
                        PointF pointF5 = (PointF) c32443OooOOO.f116638OooOo0o;
                        PointF pointF6 = (PointF) c32443OooOOO.f116637OooOo;
                        ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                        for (PointF pointF7 : arrayList3) {
                            String str5 = AbstractC26133OooOO0o.f89191OooO0O0;
                            arrayList8.add(AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointF5, pointF6, pointF7));
                        }
                        PointF pointF8 = (PointF) OooOo.Oooo0oO(arrayList8);
                        Iterator it3 = arrayList8.iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                String str6 = AbstractC26133OooOO0o.f89191OooO0O0;
                                float fOooO0O0 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF8, (PointF) next2);
                                do {
                                    Object next5 = it3.next();
                                    String str7 = AbstractC26133OooOO0o.f89191OooO0O0;
                                    float fOooO0O02 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF8, (PointF) next5);
                                    next2 = next2;
                                    if (Float.compare(fOooO0O0, fOooO0O02) < 0) {
                                        next2 = next5;
                                        fOooO0O0 = fOooO0O02;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next2 = r16;
                        }
                        OooOOO0.OooO0Oo(next2);
                        PointF pointF9 = (PointF) next2;
                        Iterator it4 = arrayList8.iterator();
                        if (it4.hasNext()) {
                            next3 = it4.next();
                            if (it4.hasNext()) {
                                String str8 = AbstractC26133OooOO0o.f89191OooO0O0;
                                float fOooO0O03 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF9, (PointF) next3);
                                do {
                                    Object next6 = it4.next();
                                    String str9 = AbstractC26133OooOO0o.f89191OooO0O0;
                                    float fOooO0O04 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF9, (PointF) next6);
                                    next3 = next3;
                                    if (Float.compare(fOooO0O03, fOooO0O04) < 0) {
                                        next3 = next6;
                                        fOooO0O03 = fOooO0O04;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next3 = r16;
                        }
                        OooOOO0.OooO0Oo(next3);
                        PointF pointF10 = (PointF) next3;
                        String str10 = AbstractC26133OooOO0o.f89191OooO0O0;
                        PointF pointFOooO0o = AbstractC26133OooOO0o.OooO00o.OooO0o(pointF10, 90.0f, pointF9);
                        ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                        for (PointF pointF11 : arrayList3) {
                            String str11 = AbstractC26133OooOO0o.f89191OooO0O0;
                            arrayList9.add(AbstractC26133OooOO0o.OooO00o.OooO0Oo(pointFOooO0o, pointF9, pointF11));
                        }
                        Iterator it5 = arrayList9.iterator();
                        if (it5.hasNext()) {
                            next4 = it5.next();
                            if (it5.hasNext()) {
                                String str12 = AbstractC26133OooOO0o.f89191OooO0O0;
                                float fOooO0O05 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF9, (PointF) next4);
                                do {
                                    Object next7 = it5.next();
                                    String str13 = AbstractC26133OooOO0o.f89191OooO0O0;
                                    float fOooO0O06 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF9, (PointF) next7);
                                    next4 = next4;
                                    if (Float.compare(fOooO0O05, fOooO0O06) < 0) {
                                        next4 = next7;
                                        fOooO0O05 = fOooO0O06;
                                    }
                                } while (it5.hasNext());
                            }
                        } else {
                            next4 = r16;
                        }
                        OooOOO0.OooO0Oo(next4);
                        PointF pointF12 = (PointF) next4;
                        arrayList7.add(C34429OooOOo0.OooOO0o(pointF10, pointF9, pointF12, new PointF((pointF12.x + pointF10.x) - pointF9.x, (pointF12.y + pointF10.y) - pointF9.y)));
                    }
                    Iterator it6 = arrayList7.iterator();
                    if (it6.hasNext()) {
                        next = it6.next();
                        if (it6.hasNext()) {
                            String str14 = AbstractC26133OooOO0o.f89191OooO0O0;
                            float fOooO0o0 = AbstractC26133OooOO0o.OooO00o.OooO0o0((List) next);
                            do {
                                Object next8 = it6.next();
                                String str15 = AbstractC26133OooOO0o.f89191OooO0O0;
                                float fOooO0o02 = AbstractC26133OooOO0o.OooO00o.OooO0o0((List) next8);
                                next = next;
                                if (Float.compare(fOooO0o0, fOooO0o02) > 0) {
                                    next = next8;
                                    fOooO0o0 = fOooO0o02;
                                }
                            } while (it6.hasNext());
                        }
                    } else {
                        next = r16;
                    }
                    OooOOO0.OooO0Oo(next);
                    c26136OooOOOO = AbstractC26133OooOO0o.OooO00o.OooO0o0(r2) > 0.8d ? new C26125OooO0OO(arrayList3) : new C26132OooOO0O((List) next);
                    break;
            }
        } else if (arrayList3.size() == 2) {
            c26136OooOOOO = new C26136OooOOOO(arrayList3);
        } else if (arrayList3.size() > 2) {
            float fOooO0O07 = AbstractC26133OooOO0o.OooO00o.OooO0O0((PointF) OooOo.Oooo0oO(arrayList3), (PointF) OooOo.OoooOOo(arrayList3));
            Iterator it7 = arrayList3.iterator();
            if (!it7.hasNext()) {
                throw new NoSuchElementException();
            }
            PointF pointF13 = (PointF) it7.next();
            String str16 = AbstractC26133OooOO0o.f89191OooO0O0;
            float fOooO0O08 = AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF13, AbstractC26133OooOO0o.OooO00o.OooO0Oo((PointF) OooOo.Oooo0oO(arrayList3), (PointF) OooOo.OoooOOo(arrayList3), pointF13));
            while (it7.hasNext()) {
                PointF pointF14 = (PointF) it7.next();
                String str17 = AbstractC26133OooOO0o.f89191OooO0O0;
                fOooO0O08 = Math.max(fOooO0O08, AbstractC26133OooOO0o.OooO00o.OooO0O0(pointF14, AbstractC26133OooOO0o.OooO00o.OooO0Oo((PointF) OooOo.Oooo0oO(arrayList3), (PointF) OooOo.OoooOOo(arrayList3), pointF14)));
            }
            if (fOooO0O08 < ((double) fOooO0O07) * 0.1d) {
                ?? r1 = new PointF[2];
                r1[i] = OooOo.Oooo0oO(arrayList3);
                r1[i5] = OooOo.OoooOOo(arrayList3);
                c26136OooOOOO = new C26136OooOOOO(C34429OooOOo0.OooOO0o(r1));
            } else {
                c26136OooOOOO = new C26130OooO0oo(arrayList3);
            }
        } else {
            c26136OooOOOO = r16;
        }
        if (c26136OooOOOO != 0 && AbstractC26133OooOO0o.OooO00o.OooO00o(c26136OooOOOO.OooO0Oo())) {
            return c26136OooOOOO;
        }
        Log.d(AbstractC26133OooOO0o.f89191OooO0O0, "createGeometry: geometry is null or invalid");
        return r16;
    }
}
