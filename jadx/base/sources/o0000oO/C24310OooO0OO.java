package o0000oO;

import Oooo0.C20855OooooOO;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24347OooO0o;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24310OooO0OO extends AbstractC24322OooOOOo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<AbstractC24322OooOOOo> f81830OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f81831OooOO0o;

    public C24310OooO0OO(C24348OooO0o0 c24348OooO0o0, int i) {
        C24348OooO0o0 c24348OooO0o02;
        super(c24348OooO0o0);
        this.f81830OooOO0O = new ArrayList<>();
        this.f81879OooO0o = i;
        C24348OooO0o0 c24348OooO0o03 = this.f81876OooO0O0;
        C24348OooO0o0 c24348OooO0o0OooOOO0 = c24348OooO0o03.OooOOO0(i);
        while (true) {
            C24348OooO0o0 c24348OooO0o04 = c24348OooO0o0OooOOO0;
            c24348OooO0o02 = c24348OooO0o03;
            c24348OooO0o03 = c24348OooO0o04;
            if (c24348OooO0o03 == null) {
                break;
            } else {
                c24348OooO0o0OooOOO0 = c24348OooO0o03.OooOOO0(this.f81879OooO0o);
            }
        }
        this.f81876OooO0O0 = c24348OooO0o02;
        int i2 = this.f81879OooO0o;
        AbstractC24322OooOOOo abstractC24322OooOOOo = i2 == 0 ? c24348OooO0o02.f81997OooO0Oo : i2 == 1 ? c24348OooO0o02.f81999OooO0o0 : null;
        ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
        arrayList.add(abstractC24322OooOOOo);
        C24348OooO0o0 c24348OooO0o0OooOO0o = c24348OooO0o02.OooOO0o(this.f81879OooO0o);
        while (c24348OooO0o0OooOO0o != null) {
            int i3 = this.f81879OooO0o;
            arrayList.add(i3 == 0 ? c24348OooO0o0OooOO0o.f81997OooO0Oo : i3 == 1 ? c24348OooO0o0OooOO0o.f81999OooO0o0 : null);
            c24348OooO0o0OooOO0o = c24348OooO0o0OooOO0o.OooOO0o(this.f81879OooO0o);
        }
        for (AbstractC24322OooOOOo abstractC24322OooOOOo2 : arrayList) {
            int i4 = this.f81879OooO0o;
            if (i4 == 0) {
                abstractC24322OooOOOo2.f81876OooO0O0.f81995OooO0O0 = this;
            } else if (i4 == 1) {
                abstractC24322OooOOOo2.f81876OooO0O0.f81996OooO0OO = this;
            }
        }
        if (this.f81879OooO0o == 0 && ((C24347OooO0o) this.f81876OooO0O0.f82054o000oOoO).f81991o0ooOoO && arrayList.size() > 1) {
            this.f81876OooO0O0 = ((AbstractC24322OooOOOo) C21505OooO0Oo.OooO00o(1, arrayList)).f81876OooO0O0;
        }
        this.f81831OooOO0o = this.f81879OooO0o == 0 ? this.f81876OooO0O0.f82060o0OoOo0 : this.f81876OooO0O0.f82061ooOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    @Override // o0000oO.AbstractC24322OooOOOo, o0000oO.InterfaceC24311OooO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(InterfaceC24311OooO0Oo interfaceC24311OooO0Oo) {
        int i;
        C24348OooO0o0.OooO00o oooO00o;
        boolean z;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iOooO00o;
        int i10;
        int i11;
        float f2;
        float f3;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        if (c24312OooO0o.f81841OooOO0) {
            C24312OooO0o c24312OooO0o2 = this.f81874OooO;
            if (c24312OooO0o2.f81841OooOO0) {
                C24348OooO0o0 c24348OooO0o0 = this.f81876OooO0O0.f82054o000oOoO;
                boolean z3 = c24348OooO0o0 instanceof C24347OooO0o ? ((C24347OooO0o) c24348OooO0o0).f81991o0ooOoO : false;
                int i16 = c24312OooO0o2.f81839OooO0oO - c24312OooO0o.f81839OooO0oO;
                ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    i = -1;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (arrayList.get(i17).f81876OooO0O0.f82052OoooooO != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                int i19 = i18;
                while (true) {
                    if (i19 < 0) {
                        break;
                    }
                    if (arrayList.get(i19).f81876OooO0O0.f82052OoooooO != 8) {
                        i = i19;
                        break;
                    }
                    i19--;
                }
                int i20 = 0;
                while (true) {
                    oooO00o = C24348OooO0o0.OooO00o.f82065OooOoO0;
                    if (i20 >= 2) {
                        z = z3;
                        f = 0.0f;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        break;
                    }
                    f3 = 0.0f;
                    int i21 = 0;
                    i4 = 0;
                    i12 = 0;
                    i13 = 0;
                    while (i21 < size) {
                        AbstractC24322OooOOOo abstractC24322OooOOOo = arrayList.get(i21);
                        C24348OooO0o0 c24348OooO0o02 = abstractC24322OooOOOo.f81876OooO0O0;
                        boolean z4 = z3;
                        int i22 = i20;
                        if (c24348OooO0o02.f82052OoooooO != 8) {
                            i13++;
                            if (i21 > 0 && i21 >= i17) {
                                i4 += abstractC24322OooOOOo.f81882OooO0oo.f81837OooO0o;
                            }
                            C24314OooO0oO c24314OooO0oO = abstractC24322OooOOOo.f81880OooO0o0;
                            int i23 = c24314OooO0oO.f81839OooO0oO;
                            boolean z5 = abstractC24322OooOOOo.f81878OooO0Oo != oooO00o;
                            if (z5) {
                                int i24 = this.f81879OooO0o;
                                z2 = z5;
                                if (i24 == 0 && !c24348OooO0o02.f81997OooO0Oo.f81880OooO0o0.f81841OooOO0) {
                                    return;
                                }
                                if (i24 == 1 && !c24348OooO0o02.f81999OooO0o0.f81880OooO0o0.f81841OooOO0) {
                                    return;
                                } else {
                                    i14 = i4;
                                }
                            } else {
                                z2 = z5;
                                i14 = i4;
                                if (abstractC24322OooOOOo.f81875OooO00o == 1 && i22 == 0) {
                                    i15 = c24314OooO0oO.f81861OooOOO0;
                                    i12++;
                                } else if (c24314OooO0oO.f81841OooOO0) {
                                    i15 = i23;
                                }
                                z2 = true;
                                if (z2) {
                                    i12++;
                                    float f4 = c24348OooO0o02.f82055o00O0O[this.f81879OooO0o];
                                    if (f4 >= 0.0f) {
                                        f3 += f4;
                                    }
                                    i4 = i14;
                                } else {
                                    i4 = i14 + i15;
                                }
                                if (i21 >= i18 && i21 < i) {
                                    i4 += -abstractC24322OooOOOo.f81874OooO.f81837OooO0o;
                                }
                            }
                            i15 = i23;
                            if (z2) {
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        z3 = z4;
                        i20 = i22;
                    }
                    z = z3;
                    int i25 = i20;
                    if (i4 < i16 || i12 == 0) {
                        break;
                    }
                    i20 = i25 + 1;
                    z3 = z;
                }
                i2 = i12;
                i3 = i13;
                f = f3;
                int i26 = c24312OooO0o.f81839OooO0oO;
                if (z) {
                    i26 = c24312OooO0o2.f81839OooO0oO;
                }
                if (i4 > i16) {
                    i26 = z ? i26 + ((int) (((i4 - i16) / 2.0f) + 0.5f)) : i26 - ((int) (((i4 - i16) / 2.0f) + 0.5f));
                }
                if (i2 > 0) {
                    float f5 = i16 - i4;
                    int i27 = (int) ((f5 / i2) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        int i30 = i26;
                        AbstractC24322OooOOOo abstractC24322OooOOOo2 = arrayList.get(i28);
                        int i31 = i28;
                        C24348OooO0o0 c24348OooO0o03 = abstractC24322OooOOOo2.f81876OooO0O0;
                        int i32 = i2;
                        int i33 = i27;
                        if (c24348OooO0o03.f82052OoooooO != 8 && abstractC24322OooOOOo2.f81878OooO0Oo == oooO00o) {
                            C24314OooO0oO c24314OooO0oO2 = abstractC24322OooOOOo2.f81880OooO0o0;
                            if (c24314OooO0oO2.f81841OooOO0) {
                                f2 = f;
                                i9 = i4;
                            } else {
                                if (f > 0.0f) {
                                    i9 = i4;
                                    iOooO00o = (int) C20855OooooOO.OooO00o(c24348OooO0o03.f82055o00O0O[this.f81879OooO0o], f5, f, 0.5f);
                                } else {
                                    i9 = i4;
                                    iOooO00o = i33;
                                }
                                if (this.f81879OooO0o == 0) {
                                    i10 = c24348OooO0o03.f82015OooOo0O;
                                    i11 = c24348OooO0o03.f82013OooOo0;
                                } else {
                                    i10 = c24348OooO0o03.f82018OooOoO0;
                                    i11 = c24348OooO0o03.f82012OooOo;
                                }
                                f2 = f;
                                int iMax = Math.max(i11, abstractC24322OooOOOo2.f81875OooO00o == 1 ? Math.min(iOooO00o, c24314OooO0oO2.f81861OooOOO0) : iOooO00o);
                                if (i10 > 0) {
                                    iMax = Math.min(i10, iMax);
                                }
                                if (iMax != iOooO00o) {
                                    i29++;
                                    iOooO00o = iMax;
                                }
                                c24314OooO0oO2.OooO0Oo(iOooO00o);
                            }
                        }
                        i28 = i31 + 1;
                        i26 = i30;
                        i2 = i32;
                        i27 = i33;
                        i4 = i9;
                        f = f2;
                    }
                    i5 = i26;
                    int i34 = i2;
                    int i35 = i4;
                    if (i29 > 0) {
                        i2 = i34 - i29;
                        i4 = 0;
                        for (int i36 = 0; i36 < size; i36++) {
                            AbstractC24322OooOOOo abstractC24322OooOOOo3 = arrayList.get(i36);
                            if (abstractC24322OooOOOo3.f81876OooO0O0.f82052OoooooO != 8) {
                                if (i36 > 0 && i36 >= i17) {
                                    i4 += abstractC24322OooOOOo3.f81882OooO0oo.f81837OooO0o;
                                }
                                i4 += abstractC24322OooOOOo3.f81880OooO0o0.f81839OooO0oO;
                                if (i36 < i18 && i36 < i) {
                                    i4 += -abstractC24322OooOOOo3.f81874OooO.f81837OooO0o;
                                }
                            }
                        }
                    } else {
                        i2 = i34;
                        i4 = i35;
                    }
                    i7 = 2;
                    if (this.f81831OooOO0o == 2 && i29 == 0) {
                        i6 = 0;
                        this.f81831OooOO0o = 0;
                    } else {
                        i6 = 0;
                    }
                } else {
                    i5 = i26;
                    i6 = 0;
                    i7 = 2;
                }
                if (i4 > i16) {
                    this.f81831OooOO0o = i7;
                }
                if (i3 > 0 && i2 == 0 && i17 == i) {
                    this.f81831OooOO0o = i7;
                }
                int i37 = this.f81831OooOO0o;
                if (i37 == 1) {
                    int i38 = i3 > 1 ? (i16 - i4) / (i3 - 1) : i3 == 1 ? (i16 - i4) / 2 : i6;
                    if (i2 > 0) {
                        i38 = i6;
                    }
                    int i39 = i5;
                    for (int i40 = i6; i40 < size; i40++) {
                        AbstractC24322OooOOOo abstractC24322OooOOOo4 = arrayList.get(z ? size - (i40 + 1) : i40);
                        int i41 = abstractC24322OooOOOo4.f81876OooO0O0.f82052OoooooO;
                        C24312OooO0o c24312OooO0o3 = abstractC24322OooOOOo4.f81874OooO;
                        C24312OooO0o c24312OooO0o4 = abstractC24322OooOOOo4.f81882OooO0oo;
                        if (i41 == 8) {
                            c24312OooO0o4.OooO0Oo(i39);
                            c24312OooO0o3.OooO0Oo(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i17) {
                                i39 = z ? i39 - c24312OooO0o4.f81837OooO0o : i39 + c24312OooO0o4.f81837OooO0o;
                            }
                            if (z) {
                                c24312OooO0o3.OooO0Oo(i39);
                            } else {
                                c24312OooO0o4.OooO0Oo(i39);
                            }
                            C24314OooO0oO c24314OooO0oO3 = abstractC24322OooOOOo4.f81880OooO0o0;
                            int i42 = c24314OooO0oO3.f81839OooO0oO;
                            if (abstractC24322OooOOOo4.f81878OooO0Oo == oooO00o) {
                                i8 = i39;
                                if (abstractC24322OooOOOo4.f81875OooO00o == 1) {
                                    i42 = c24314OooO0oO3.f81861OooOOO0;
                                }
                            } else {
                                i8 = i39;
                            }
                            i39 = z ? i8 - i42 : i8 + i42;
                            if (z) {
                                c24312OooO0o4.OooO0Oo(i39);
                            } else {
                                c24312OooO0o3.OooO0Oo(i39);
                            }
                            abstractC24322OooOOOo4.f81881OooO0oO = true;
                            if (i40 < i18 && i40 < i) {
                                i39 = z ? i39 - (-c24312OooO0o3.f81837OooO0o) : i39 + (-c24312OooO0o3.f81837OooO0o);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i43 = (i16 - i4) / (i3 + 1);
                    if (i2 > 0) {
                        i43 = i6;
                    }
                    int i44 = i5;
                    for (int i45 = i6; i45 < size; i45++) {
                        AbstractC24322OooOOOo abstractC24322OooOOOo5 = arrayList.get(z ? size - (i45 + 1) : i45);
                        int i46 = abstractC24322OooOOOo5.f81876OooO0O0.f82052OoooooO;
                        C24312OooO0o c24312OooO0o5 = abstractC24322OooOOOo5.f81874OooO;
                        C24312OooO0o c24312OooO0o6 = abstractC24322OooOOOo5.f81882OooO0oo;
                        if (i46 == 8) {
                            c24312OooO0o6.OooO0Oo(i44);
                            c24312OooO0o5.OooO0Oo(i44);
                        } else {
                            int i47 = z ? i44 - i43 : i44 + i43;
                            if (i45 > 0 && i45 >= i17) {
                                i47 = z ? i47 - c24312OooO0o6.f81837OooO0o : i47 + c24312OooO0o6.f81837OooO0o;
                            }
                            if (z) {
                                c24312OooO0o5.OooO0Oo(i47);
                            } else {
                                c24312OooO0o6.OooO0Oo(i47);
                            }
                            C24314OooO0oO c24314OooO0oO4 = abstractC24322OooOOOo5.f81880OooO0o0;
                            int iMin = c24314OooO0oO4.f81839OooO0oO;
                            if (abstractC24322OooOOOo5.f81878OooO0Oo == oooO00o && abstractC24322OooOOOo5.f81875OooO00o == 1) {
                                iMin = Math.min(iMin, c24314OooO0oO4.f81861OooOOO0);
                            }
                            i44 = z ? i47 - iMin : i47 + iMin;
                            if (z) {
                                c24312OooO0o6.OooO0Oo(i44);
                            } else {
                                c24312OooO0o5.OooO0Oo(i44);
                            }
                            if (i45 < i18 && i45 < i) {
                                i44 = z ? i44 - (-c24312OooO0o5.f81837OooO0o) : i44 + (-c24312OooO0o5.f81837OooO0o);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float f6 = this.f81879OooO0o == 0 ? this.f81876OooO0O0.f82049OooooOo : this.f81876OooO0O0.f82051Oooooo0;
                    if (z) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i16 - i4) * f6) + 0.5f);
                    if (i48 < 0 || i2 > 0) {
                        i48 = i6;
                    }
                    int i49 = z ? i5 - i48 : i5 + i48;
                    for (int i50 = i6; i50 < size; i50++) {
                        AbstractC24322OooOOOo abstractC24322OooOOOo6 = arrayList.get(z ? size - (i50 + 1) : i50);
                        int i51 = abstractC24322OooOOOo6.f81876OooO0O0.f82052OoooooO;
                        C24312OooO0o c24312OooO0o7 = abstractC24322OooOOOo6.f81874OooO;
                        C24312OooO0o c24312OooO0o8 = abstractC24322OooOOOo6.f81882OooO0oo;
                        if (i51 == 8) {
                            c24312OooO0o8.OooO0Oo(i49);
                            c24312OooO0o7.OooO0Oo(i49);
                        } else {
                            if (i50 > 0 && i50 >= i17) {
                                i49 = z ? i49 - c24312OooO0o8.f81837OooO0o : i49 + c24312OooO0o8.f81837OooO0o;
                            }
                            if (z) {
                                c24312OooO0o7.OooO0Oo(i49);
                            } else {
                                c24312OooO0o8.OooO0Oo(i49);
                            }
                            C24314OooO0oO c24314OooO0oO5 = abstractC24322OooOOOo6.f81880OooO0o0;
                            int i52 = c24314OooO0oO5.f81839OooO0oO;
                            if (abstractC24322OooOOOo6.f81878OooO0Oo == oooO00o && abstractC24322OooOOOo6.f81875OooO00o == 1) {
                                i52 = c24314OooO0oO5.f81861OooOOO0;
                            }
                            i49 = z ? i49 - i52 : i49 + i52;
                            if (z) {
                                c24312OooO0o8.OooO0Oo(i49);
                            } else {
                                c24312OooO0o7.OooO0Oo(i49);
                            }
                            if (i50 < i18 && i50 < i) {
                                i49 = z ? i49 - (-c24312OooO0o7.f81837OooO0o) : i49 + (-c24312OooO0o7.f81837OooO0o);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0Oo() {
        ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
        Iterator<AbstractC24322OooOOOo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().OooO0Oo();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C24348OooO0o0 c24348OooO0o0 = arrayList.get(0).f81876OooO0O0;
        C24348OooO0o0 c24348OooO0o02 = arrayList.get(size - 1).f81876OooO0O0;
        int i = this.f81879OooO0o;
        C24312OooO0o c24312OooO0o = this.f81874OooO;
        C24312OooO0o c24312OooO0o2 = this.f81882OooO0oo;
        if (i == 0) {
            C24346OooO0Oo c24346OooO0Oo = c24348OooO0o0.f82029Oooo0O0;
            C24346OooO0Oo c24346OooO0Oo2 = c24348OooO0o02.f82032Oooo0o0;
            C24312OooO0o c24312OooO0oOooO = AbstractC24322OooOOOo.OooO(c24346OooO0Oo, 0);
            int iOooO0o0 = c24346OooO0Oo.OooO0o0();
            C24348OooO0o0 c24348OooO0o0OooOOO0 = OooOOO0();
            if (c24348OooO0o0OooOOO0 != null) {
                iOooO0o0 = c24348OooO0o0OooOOO0.f82029Oooo0O0.OooO0o0();
            }
            if (c24312OooO0oOooO != null) {
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO, iOooO0o0);
            }
            C24312OooO0o c24312OooO0oOooO2 = AbstractC24322OooOOOo.OooO(c24346OooO0Oo2, 0);
            int iOooO0o02 = c24346OooO0Oo2.OooO0o0();
            C24348OooO0o0 c24348OooO0o0OooOOO = OooOOO();
            if (c24348OooO0o0OooOOO != null) {
                iOooO0o02 = c24348OooO0o0OooOOO.f82032Oooo0o0.OooO0o0();
            }
            if (c24312OooO0oOooO2 != null) {
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO2, -iOooO0o02);
            }
        } else {
            C24346OooO0Oo c24346OooO0Oo3 = c24348OooO0o0.f82030Oooo0OO;
            C24346OooO0Oo c24346OooO0Oo4 = c24348OooO0o02.f82031Oooo0o;
            C24312OooO0o c24312OooO0oOooO3 = AbstractC24322OooOOOo.OooO(c24346OooO0Oo3, 1);
            int iOooO0o03 = c24346OooO0Oo3.OooO0o0();
            C24348OooO0o0 c24348OooO0o0OooOOO02 = OooOOO0();
            if (c24348OooO0o0OooOOO02 != null) {
                iOooO0o03 = c24348OooO0o0OooOOO02.f82030Oooo0OO.OooO0o0();
            }
            if (c24312OooO0oOooO3 != null) {
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO3, iOooO0o03);
            }
            C24312OooO0o c24312OooO0oOooO4 = AbstractC24322OooOOOo.OooO(c24346OooO0Oo4, 1);
            int iOooO0o04 = c24346OooO0Oo4.OooO0o0();
            C24348OooO0o0 c24348OooO0o0OooOOO2 = OooOOO();
            if (c24348OooO0o0OooOOO2 != null) {
                iOooO0o04 = c24348OooO0o0OooOOO2.f82031Oooo0o.OooO0o0();
            }
            if (c24312OooO0oOooO4 != null) {
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO4, -iOooO0o04);
            }
        }
        c24312OooO0o2.f81833OooO00o = this;
        c24312OooO0o.f81833OooO00o = this;
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o() {
        this.f81877OooO0OO = null;
        Iterator<AbstractC24322OooOOOo> it = this.f81830OooOO0O.iterator();
        while (it.hasNext()) {
            it.next().OooO0o();
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).OooO0o0();
            i++;
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final long OooOO0() {
        ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
        int size = arrayList.size();
        long jOooOO0 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC24322OooOOOo abstractC24322OooOOOo = arrayList.get(i);
            jOooOO0 = ((long) abstractC24322OooOOOo.f81874OooO.f81837OooO0o) + abstractC24322OooOOOo.OooOO0() + jOooOO0 + ((long) abstractC24322OooOOOo.f81882OooO0oo.f81837OooO0o);
        }
        return jOooOO0;
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final boolean OooOO0O() {
        ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).OooOO0O()) {
                return false;
            }
        }
        return true;
    }

    public final C24348OooO0o0 OooOOO() {
        ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C24348OooO0o0 c24348OooO0o0 = arrayList.get(size).f81876OooO0O0;
            if (c24348OooO0o0.f82052OoooooO != 8) {
                return c24348OooO0o0;
            }
        }
        return null;
    }

    public final C24348OooO0o0 OooOOO0() {
        int i = 0;
        while (true) {
            ArrayList<AbstractC24322OooOOOo> arrayList = this.f81830OooOO0O;
            if (i >= arrayList.size()) {
                return null;
            }
            C24348OooO0o0 c24348OooO0o0 = arrayList.get(i).f81876OooO0O0;
            if (c24348OooO0o0.f82052OoooooO != 8) {
                return c24348OooO0o0;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f81879OooO0o == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC24322OooOOOo abstractC24322OooOOOo : this.f81830OooOO0O) {
            sb.append("<");
            sb.append(abstractC24322OooOOOo);
            sb.append("> ");
        }
        return sb.toString();
    }
}
