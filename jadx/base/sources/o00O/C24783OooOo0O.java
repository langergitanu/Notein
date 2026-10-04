package o00O;

import android.graphics.Rect;
import com.airbnb.lottie.C22142OooO0oo;
import com.airbnb.lottie.C22148OooOo0;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18252l2;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.richeditor.fonts.FontManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import o00000oO.C24121OooO00o;
import o00O0oOO.C24944OooO0O0;
import o00O0oOO.C24945OooO0OO;
import o00O0oo.C24959OooO00o;
import o00O0oo0.C24972OooOOO;
import o00OO000.C24982OooO0Oo;
import o00OO000.OooO0OO;
import o00OO00O.C24983OooO0Oo;
import o00OO00O.C24986OooO0oo;

/* JADX INFO: renamed from: o00O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24783OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84040OooO00o = OooO0OO.OooO00o.OooO00o("w", C18773h.f57233c, C18252l2.f55577m, "op", TranslateLanguage.FRENCH, "v", "layers", "assets", FontManager.REMOTE_FONT_DIR, "chars", "markers");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84041OooO0O0 = OooO0OO.OooO00o.OooO00o("id", "layers", "w", C18773h.f57233c, ContextChain.TAG_PRODUCT, "u");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84042OooO0OO = OooO0OO.OooO00o.OooO00o("list");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84043OooO0Oo = OooO0OO.OooO00o.OooO00o("cm", "tm", "dr");

    public static C22142OooO0oo OooO00o(C24982OooO0Oo c24982OooO0Oo) throws IOException {
        int i;
        float f;
        HashMap map;
        ArrayList arrayList;
        OooOo.Oooo0 oooo0;
        float f2;
        int i2;
        int i3 = 1;
        float fOooO0O0 = C24986OooO0oo.OooO0O0();
        OooOo.OooOOO<C24959OooO00o> oooOOO = new OooOo.OooOOO<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        OooOo.Oooo0 oooo02 = new OooOo.Oooo0();
        C22142OooO0oo c22142OooO0oo = new C22142OooO0oo();
        c24982OooO0Oo.OooO0OO();
        float fOooo00o = 0.0f;
        int iOooo0 = 0;
        int iOooo02 = 0;
        while (c24982OooO0Oo.OooOooo()) {
            switch (c24982OooO0Oo.o0Oo0oo(f84040OooO00o)) {
                case 0:
                    iOooo0 = c24982OooO0Oo.Oooo0();
                    break;
                case 1:
                    iOooo02 = c24982OooO0Oo.Oooo0();
                    break;
                case 2:
                    c24982OooO0Oo.Oooo00o();
                    break;
                case 3:
                    i = i3;
                    fOooo00o = ((float) c24982OooO0Oo.Oooo00o()) - 0.01f;
                    fOooO0O0 = fOooO0O0;
                    i3 = i;
                    break;
                case 4:
                    c24982OooO0Oo.Oooo00o();
                    break;
                case 5:
                    f = fOooO0O0;
                    map = map4;
                    arrayList = arrayList3;
                    oooo0 = oooo02;
                    f2 = fOooo00o;
                    String[] strArrSplit = c24982OooO0Oo.Oooo0OO().split("\\.");
                    int i4 = Integer.parseInt(strArrSplit[0]);
                    i = 1;
                    int i5 = Integer.parseInt(strArrSplit[1]);
                    int i6 = Integer.parseInt(strArrSplit[2]);
                    if (i4 < 4 || (i4 <= 4 && (i5 < 4 || (i5 <= 4 && i6 < 0)))) {
                        c22142OooO0oo.OooO00o("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fOooO0O0 = f;
                    arrayList3 = arrayList;
                    oooo02 = oooo0;
                    map4 = map;
                    fOooo00o = f2;
                    i3 = i;
                    break;
                case 6:
                    f = fOooO0O0;
                    map = map4;
                    arrayList = arrayList3;
                    oooo0 = oooo02;
                    f2 = fOooo00o;
                    c24982OooO0Oo.OooO00o();
                    int i7 = 0;
                    while (c24982OooO0Oo.OooOooo()) {
                        C24959OooO00o c24959OooO00oOooO00o = C24782OooOo0.OooO00o(c24982OooO0Oo, c22142OooO0oo);
                        if (c24959OooO00oOooO00o.f84657OooO0o0 == C24959OooO00o.EnumC19661OooO00o.f84663OooOo0o) {
                            i7++;
                        }
                        arrayList2.add(c24959OooO00oOooO00o);
                        oooOOO.OooO0o0(c24959OooO00oOooO00o.f84655OooO0Oo, c24959OooO00oOooO00o);
                        if (i7 > 4) {
                            C24983OooO0Oo.OooO0O0("You have " + i7 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    c24982OooO0Oo.OooOOO0();
                    i = 1;
                    fOooO0O0 = f;
                    arrayList3 = arrayList;
                    oooo02 = oooo0;
                    map4 = map;
                    fOooo00o = f2;
                    i3 = i;
                    break;
                case 7:
                    f = fOooO0O0;
                    arrayList = arrayList3;
                    c24982OooO0Oo.OooO00o();
                    while (c24982OooO0Oo.OooOooo()) {
                        ArrayList arrayList4 = new ArrayList();
                        OooOo.OooOOO oooOOO2 = new OooOo.OooOOO();
                        c24982OooO0Oo.OooO0OO();
                        OooOo.Oooo0 oooo03 = oooo02;
                        String strOooo0OO = null;
                        String strOooo0OO2 = null;
                        int iOooo03 = 0;
                        int iOooo04 = 0;
                        while (c24982OooO0Oo.OooOooo()) {
                            HashMap map5 = map4;
                            int iO0Oo0oo = c24982OooO0Oo.o0Oo0oo(f84041OooO0O0);
                            if (iO0Oo0oo != 0) {
                                float f3 = fOooo00o;
                                if (iO0Oo0oo != 1) {
                                    if (iO0Oo0oo == 2) {
                                        iOooo03 = c24982OooO0Oo.Oooo0();
                                    } else if (iO0Oo0oo == 3) {
                                        iOooo04 = c24982OooO0Oo.Oooo0();
                                    } else if (iO0Oo0oo == 4) {
                                        strOooo0OO2 = c24982OooO0Oo.Oooo0OO();
                                    } else if (iO0Oo0oo != 5) {
                                        c24982OooO0Oo.o00000OO();
                                        c24982OooO0Oo.o00000oO();
                                        i2 = iOooo04;
                                    } else {
                                        c24982OooO0Oo.Oooo0OO();
                                    }
                                    map4 = map5;
                                    fOooo00o = f3;
                                } else {
                                    c24982OooO0Oo.OooO00o();
                                    while (c24982OooO0Oo.OooOooo()) {
                                        C24959OooO00o c24959OooO00oOooO00o2 = C24782OooOo0.OooO00o(c24982OooO0Oo, c22142OooO0oo);
                                        oooOOO2.OooO0o0(c24959OooO00oOooO00o2.f84655OooO0Oo, c24959OooO00oOooO00o2);
                                        arrayList4.add(c24959OooO00oOooO00o2);
                                        iOooo04 = iOooo04;
                                    }
                                    i2 = iOooo04;
                                    c24982OooO0Oo.OooOOO0();
                                }
                                map4 = map5;
                                fOooo00o = f3;
                                iOooo04 = i2;
                            } else {
                                strOooo0OO = c24982OooO0Oo.Oooo0OO();
                                map4 = map5;
                            }
                        }
                        HashMap map6 = map4;
                        float f4 = fOooo00o;
                        int i8 = iOooo04;
                        c24982OooO0Oo.OooOOo0();
                        if (strOooo0OO2 != null) {
                            map3.put(strOooo0OO, new C22148OooOo0(iOooo03, i8, strOooo0OO, strOooo0OO2));
                        } else {
                            map2.put(strOooo0OO, arrayList4);
                        }
                        oooo02 = oooo03;
                        map4 = map6;
                        fOooo00o = f4;
                    }
                    map = map4;
                    oooo0 = oooo02;
                    f2 = fOooo00o;
                    c24982OooO0Oo.OooOOO0();
                    i = 1;
                    fOooO0O0 = f;
                    arrayList3 = arrayList;
                    oooo02 = oooo0;
                    map4 = map;
                    fOooo00o = f2;
                    i3 = i;
                    break;
                case 8:
                    c24982OooO0Oo.OooO0OO();
                    while (c24982OooO0Oo.OooOooo()) {
                        if (c24982OooO0Oo.o0Oo0oo(f84042OooO0OO) != 0) {
                            c24982OooO0Oo.o00000OO();
                            c24982OooO0Oo.o00000oO();
                        } else {
                            c24982OooO0Oo.OooO00o();
                            while (c24982OooO0Oo.OooOooo()) {
                                OooO0OO.OooO00o oooO00o = OooOOO0.f84024OooO00o;
                                c24982OooO0Oo.OooO0OO();
                                String strOooo0OO3 = null;
                                String strOooo0OO4 = null;
                                String strOooo0OO5 = null;
                                while (c24982OooO0Oo.OooOooo()) {
                                    float f5 = fOooO0O0;
                                    int iO0Oo0oo2 = c24982OooO0Oo.o0Oo0oo(OooOOO0.f84024OooO00o);
                                    if (iO0Oo0oo2 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (iO0Oo0oo2 == 1) {
                                            strOooo0OO4 = c24982OooO0Oo.Oooo0OO();
                                        } else if (iO0Oo0oo2 == 2) {
                                            strOooo0OO5 = c24982OooO0Oo.Oooo0OO();
                                        } else if (iO0Oo0oo2 != 3) {
                                            c24982OooO0Oo.o00000OO();
                                            c24982OooO0Oo.o00000oO();
                                        } else {
                                            c24982OooO0Oo.Oooo00o();
                                        }
                                        fOooO0O0 = f5;
                                        arrayList3 = arrayList5;
                                    } else {
                                        strOooo0OO3 = c24982OooO0Oo.Oooo0OO();
                                        fOooO0O0 = f5;
                                    }
                                }
                                c24982OooO0Oo.OooOOo0();
                                map4.put(strOooo0OO4, new C24944OooO0O0(strOooo0OO3, strOooo0OO4, strOooo0OO5));
                                fOooO0O0 = fOooO0O0;
                                arrayList3 = arrayList3;
                            }
                            c24982OooO0Oo.OooOOO0();
                        }
                    }
                    f = fOooO0O0;
                    arrayList = arrayList3;
                    c24982OooO0Oo.OooOOo0();
                    map = map4;
                    oooo0 = oooo02;
                    f2 = fOooo00o;
                    i = 1;
                    fOooO0O0 = f;
                    arrayList3 = arrayList;
                    oooo02 = oooo0;
                    map4 = map;
                    fOooo00o = f2;
                    i3 = i;
                    break;
                case 9:
                    c24982OooO0Oo.OooO00o();
                    while (c24982OooO0Oo.OooOooo()) {
                        OooO0OO.OooO00o oooO00o2 = C24777OooOO0o.f84021OooO00o;
                        ArrayList arrayList6 = new ArrayList();
                        c24982OooO0Oo.OooO0OO();
                        String strOooo0OO6 = null;
                        String strOooo0OO7 = null;
                        double dOooo00o = 0.0d;
                        char cCharAt = 0;
                        while (c24982OooO0Oo.OooOooo()) {
                            int iO0Oo0oo3 = c24982OooO0Oo.o0Oo0oo(C24777OooOO0o.f84021OooO00o);
                            if (iO0Oo0oo3 == 0) {
                                cCharAt = c24982OooO0Oo.Oooo0OO().charAt(0);
                            } else if (iO0Oo0oo3 == i3) {
                                c24982OooO0Oo.Oooo00o();
                            } else if (iO0Oo0oo3 == 2) {
                                dOooo00o = c24982OooO0Oo.Oooo00o();
                            } else if (iO0Oo0oo3 == 3) {
                                strOooo0OO6 = c24982OooO0Oo.Oooo0OO();
                            } else if (iO0Oo0oo3 == 4) {
                                strOooo0OO7 = c24982OooO0Oo.Oooo0OO();
                            } else if (iO0Oo0oo3 != 5) {
                                c24982OooO0Oo.o00000OO();
                                c24982OooO0Oo.o00000oO();
                            } else {
                                c24982OooO0Oo.OooO0OO();
                                while (c24982OooO0Oo.OooOooo()) {
                                    if (c24982OooO0Oo.o0Oo0oo(C24777OooOO0o.f84022OooO0O0) != 0) {
                                        c24982OooO0Oo.o00000OO();
                                        c24982OooO0Oo.o00000oO();
                                    } else {
                                        c24982OooO0Oo.OooO00o();
                                        while (c24982OooO0Oo.OooOooo()) {
                                            arrayList6.add((C24972OooOOO) C24776OooO0oo.OooO00o(c24982OooO0Oo, c22142OooO0oo));
                                        }
                                        c24982OooO0Oo.OooOOO0();
                                    }
                                }
                                c24982OooO0Oo.OooOOo0();
                            }
                            i3 = 1;
                        }
                        c24982OooO0Oo.OooOOo0();
                        C24945OooO0OO c24945OooO0OO = new C24945OooO0OO(arrayList6, cCharAt, dOooo00o, strOooo0OO6, strOooo0OO7);
                        oooo02.OooO0o0(c24945OooO0OO.hashCode(), c24945OooO0OO);
                        i3 = 1;
                    }
                    c24982OooO0Oo.OooOOO0();
                    f = fOooO0O0;
                    map = map4;
                    arrayList = arrayList3;
                    oooo0 = oooo02;
                    f2 = fOooo00o;
                    i = 1;
                    fOooO0O0 = f;
                    arrayList3 = arrayList;
                    oooo02 = oooo0;
                    map4 = map;
                    fOooo00o = f2;
                    i3 = i;
                    break;
                case 10:
                    c24982OooO0Oo.OooO00o();
                    while (c24982OooO0Oo.OooOooo()) {
                        c24982OooO0Oo.OooO0OO();
                        while (c24982OooO0Oo.OooOooo()) {
                            int iO0Oo0oo4 = c24982OooO0Oo.o0Oo0oo(f84043OooO0Oo);
                            if (iO0Oo0oo4 == 0) {
                                c24982OooO0Oo.Oooo0OO();
                            } else if (iO0Oo0oo4 == i3) {
                                c24982OooO0Oo.Oooo00o();
                            } else if (iO0Oo0oo4 != 2) {
                                c24982OooO0Oo.o00000OO();
                                c24982OooO0Oo.o00000oO();
                            } else {
                                c24982OooO0Oo.Oooo00o();
                            }
                        }
                        c24982OooO0Oo.OooOOo0();
                        arrayList3.add(new C24121OooO00o());
                    }
                    c24982OooO0Oo.OooOOO0();
                    i = i3;
                    f = fOooO0O0;
                    map = map4;
                    arrayList = arrayList3;
                    oooo0 = oooo02;
                    f2 = fOooo00o;
                    fOooO0O0 = f;
                    arrayList3 = arrayList;
                    oooo02 = oooo0;
                    map4 = map;
                    fOooo00o = f2;
                    i3 = i;
                    break;
                default:
                    c24982OooO0Oo.o00000OO();
                    c24982OooO0Oo.o00000oO();
                    i = i3;
                    f = fOooO0O0;
                    map = map4;
                    arrayList = arrayList3;
                    oooo0 = oooo02;
                    f2 = fOooo00o;
                    fOooO0O0 = f;
                    arrayList3 = arrayList;
                    oooo02 = oooo0;
                    map4 = map;
                    fOooo00o = f2;
                    i3 = i;
                    break;
            }
        }
        float f6 = fOooO0O0;
        new Rect(0, 0, (int) (iOooo0 * f6), (int) (iOooo02 * f6));
        c22142OooO0oo.f66773OooO0o = fOooo00o;
        c22142OooO0oo.f66774OooO0o0 = arrayList2;
        c22142OooO0oo.f66772OooO0Oo = oooOOO;
        c22142OooO0oo.f66770OooO0O0 = map3;
        c22142OooO0oo.f66771OooO0OO = map4;
        return c22142OooO0oo;
    }
}
