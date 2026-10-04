package o0oo0Ooo;

import android.util.LruCache;
import com.facebook.soloader.OooOo;
import java.util.ArrayList;
import java.util.List;
import o000OO00.C24452OooO0o0;
import o000OO00.C24453OooO0oO;
import o000OO00.C24457OooOOo;
import o000OO00.C24477Oooo00O;
import o000OO00.C24485OoooO;
import o0OoO0o.AbstractC28645OooO0o;
import o0OoO0o.C28642OooO0O0;
import o0OoO0o.C28643OooO0OO;
import o0OoO0o.C28657OooOOOO;
import o0OoO0o.C28661OooOOoo;
import o0OoO0o.C28663OooOo0;
import o0OoO0o.C28666OooOo0o;
import o0oo0OoO.C31272OooO0o;
import o0oo0Ooo.C31281OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32449OooOOoo;
import oO0O00oo.OooOO0;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31278OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C31278OooO00o f111677OooO00o = new C31278OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LruCache<C32449OooOOoo<Integer, Integer, Integer>, C24457OooOOo> f111678OooO0O0 = new LruCache<>(32);

    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C24477Oooo00O OooO0O0(float f, float f2, EnumC31282OooO0o0 enumC31282OooO0o0) {
        EnumC31282OooO0o0 enumC31282OooO0o02;
        float f3;
        float f4;
        AbstractC28645OooO0o.OooO0O0 oooO0O0;
        float f5;
        float f6 = f;
        ArrayList arrayList = new ArrayList();
        arrayList.add((C24453OooO0oO) C24485OoooO.f82782OooO00o.getValue());
        ArrayList arrayList2 = new ArrayList();
        if (f6 > 0.0f || f2 > 0.0f) {
            if (f6 > 0.0f) {
                enumC31282OooO0o02 = enumC31282OooO0o0;
                if (enumC31282OooO0o02 == EnumC31282OooO0o0.f111695OooOoO0) {
                    float[] fArr = C31280OooO0OO.f111686OooO00o;
                    if (f6 < 0.3f) {
                        C28666OooOo0o.OooO00o oooO00o = C28666OooOo0o.OooO00o.f101595OooO0Oo;
                        float[] fArr2 = C31280OooO0OO.f111686OooO00o;
                        float[][] fArr3 = C31280OooO0OO.f111687OooO0O0;
                        float[] fArrOooO00o = C31280OooO0OO.OooO00o(f6, fArr2, fArr3);
                        AbstractC28645OooO0o.OooO0O0 oooO0O02 = new AbstractC28645OooO0o.OooO0O0(fArrOooO00o[4], fArrOooO00o[5], fArrOooO00o[6], fArrOooO00o[7]);
                        float[] fArrOooO00o2 = C31280OooO0OO.OooO00o(f6, fArr2, fArr3);
                        List listOooO0oO = OooOo.OooO0oO(new C28666OooOo0o(oooO00o, 0.0f, 1.0f, new C28661OooOOoo(oooO0O02, new C28661OooOOoo(new AbstractC28645OooO0o.OooO0O0(fArrOooO00o2[0], fArrOooO00o2[1], fArrOooO00o2[2], fArrOooO00o2[3]), new C28663OooOo0(C28663OooOo0.OooO00o.f101579OooO0Oo, 0.0f, 1.0f, C28657OooOOOO.f101558OooO0Oo)))));
                        arrayList2.add(new C24453OooO0oO(new C24452OooO0o0(0, listOooO0oO, ""), listOooO0oO, ""));
                    } else {
                        C28663OooOo0.OooO00o oooO00o2 = C28663OooOo0.OooO00o.f101579OooO0Oo;
                        C28666OooOo0o.OooO00o oooO00o3 = C28666OooOo0o.OooO00o.f101595OooO0Oo;
                        if (f6 == 1.0f) {
                            float[] fArr4 = C31280OooO0OO.f111686OooO00o;
                            int iOrdinal = enumC31282OooO0o02.ordinal();
                            if (iOrdinal == 0) {
                                f5 = 0.96f;
                            } else {
                                if (iOrdinal != 1) {
                                    throw new C32442OooOO0o();
                                }
                                f5 = 1.0f;
                            }
                            f4 = f5;
                        } else {
                            f4 = 1.0f;
                        }
                        C28657OooOOOO c28657OooOOOO = C28657OooOOOO.f101558OooO0Oo;
                        float[] fArr5 = C31280OooO0OO.f111686OooO00o;
                        int iOrdinal2 = enumC31282OooO0o02.ordinal();
                        if (iOrdinal2 == 0) {
                            double d = f6;
                            oooO0O0 = new AbstractC28645OooO0o.OooO0O0(0.33333334f, (float) Math.pow(0.33333334f, d), 0.6666667f, (float) Math.pow(0.6666667f, d));
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new C32442OooOO0o();
                            }
                            if (f6 < 0.3f) {
                                f6 = 0.3f;
                            }
                            float[] fArrOooO00o3 = C31280OooO0OO.OooO00o(f6, C31280OooO0OO.f111688OooO0OO, C31280OooO0OO.f111689OooO0Oo);
                            oooO0O0 = new AbstractC28645OooO0o.OooO0O0(fArrOooO00o3[0], fArrOooO00o3[1], fArrOooO00o3[2], fArrOooO00o3[3]);
                        }
                        arrayList2.add(C31272OooO0o.OooO00o(oooO00o2, oooO00o3, 0.0f, 1.0f, 0.0f, f4, c28657OooOOOO, (128 & 128) != 0 ? AbstractC28645OooO0o.C28646OooO0Oo.f101529OooO0o : oooO0O0, (128 & 256) != 0 ? 0L : 25L));
                    }
                    f3 = 0.0f;
                }
            } else {
                enumC31282OooO0o02 = enumC31282OooO0o0;
                f3 = 0.0f;
            }
            if (f2 > f3) {
                float fOooO0o0 = (OooOO0.OooO0o0(f2, f3, 1.0f) * (C31281OooO0Oo.OooO0O0(enumC31282OooO0o02) - 1.0f)) + 1.0f;
                C28663OooOo0.OooO00o oooO00o4 = C28663OooOo0.OooO00o.f101580OooO0o;
                C28666OooOo0o.OooO00o oooO00o5 = C28666OooOo0o.OooO00o.f101595OooO0Oo;
                float fOooO0OO = C31281OooO0Oo.OooO0OO(enumC31282OooO0o02);
                C28657OooOOOO c28657OooOOOO2 = C28657OooOOOO.f101558OooO0Oo;
                C31281OooO0Oo.OooO00o OooO00o2 = C31281OooO0Oo.OooO00o(enumC31282OooO0o02);
                arrayList2.add(C31272OooO0o.OooO00o(oooO00o4, oooO00o5, 0.0f, fOooO0OO, 1.0f, fOooO0o0, c28657OooOOOO2, new AbstractC28645OooO0o.OooO0O0(0.33333334f, OooO00o2.f111691OooO00o, 0.6666667f, OooO00o2.f111692OooO0O0), 20L));
            }
        } else {
            arrayList2.add(new C24453OooO0oO(new C28666OooOo0o(C28666OooOo0o.OooO00o.f101595OooO0Oo, 0.0f, 1.0f, new C28643OooO0OO(new C28642OooO0O0(), C34434OooOoO.f123453OooOo0o))));
        }
        arrayList.addAll(arrayList2);
        C28663OooOo0.OooO00o oooO00o6 = C28663OooOo0.OooO00o.f101581OooO0o0;
        C28666OooOo0o.OooO00o oooO00o7 = C28666OooOo0o.OooO00o.f101595OooO0Oo;
        C28657OooOOOO c28657OooOOOO3 = C28657OooOOOO.f101558OooO0Oo;
        arrayList.addAll(C34429OooOOo0.OooOO0o(C31272OooO0o.OooO00o(oooO00o6, oooO00o7, 0.45f, 0.65f, 1.0f, 1.08f, c28657OooOOOO3, (128 & 128) != 0 ? AbstractC28645OooO0o.C28646OooO0Oo.f101529OooO0o : null, (128 & 256) != 0 ? 0L : 25L), C31272OooO0o.OooO00o(C28663OooOo0.OooO00o.f101582OooO0oO, oooO00o7, -80.0f, -230.0f, 1.0f, 1.08f, c28657OooOOOO3, (128 & 128) != 0 ? AbstractC28645OooO0o.C28646OooO0Oo.f101529OooO0o : null, (128 & 256) != 0 ? 0L : 25L)));
        return new C24477Oooo00O(arrayList, 255);
    }

    public final synchronized C24457OooOOo OooO00o(float f, float f2, EnumC31282OooO0o0 enumC31282OooO0o0) {
        C24457OooOOo c24457OooOOo;
        String str;
        try {
            float f3 = 100;
            C32449OooOOoo<Integer, Integer, Integer> c32449OooOOoo = new C32449OooOOoo<>(Integer.valueOf(oO0O00O.OooO00o.OooO0O0(f * f3)), Integer.valueOf(oO0O00O.OooO00o.OooO0O0(f3 * f2)), Integer.valueOf(enumC31282OooO0o0.f111696OooOo0o));
            LruCache<C32449OooOOoo<Integer, Integer, Integer>, C24457OooOOo> lruCache = f111678OooO0O0;
            c24457OooOOo = lruCache.get(c32449OooOOoo);
            if (c24457OooOOo == null) {
                C24477Oooo00O c24477Oooo00OOooO0O0 = OooO0O0(f, f2, enumC31282OooO0o0);
                int iOrdinal = enumC31282OooO0o0.ordinal();
                if (iOrdinal == 0) {
                    str = "notein-fountain-v1";
                } else {
                    if (iOrdinal != 1) {
                        throw new C32442OooOO0o();
                    }
                    str = "notein-fountain-v2";
                }
                c24457OooOOo = new C24457OooOOo(c24477Oooo00OOooO0O0, (C24457OooOOo.OooO0O0.OooO0OO) null, str, 14);
                lruCache.put(c32449OooOOoo, c24457OooOOo);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c24457OooOOo;
    }
}
