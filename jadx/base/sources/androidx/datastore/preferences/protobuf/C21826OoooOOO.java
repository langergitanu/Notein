package androidx.datastore.preferences.protobuf;

import OooO0o.C20424OooO0Oo;
import androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o;
import androidx.datastore.preferences.protobuf.C21805OooOoO;
import androidx.datastore.preferences.protobuf.C21807OooOoOO;
import androidx.datastore.preferences.protobuf.C21816Oooo0OO;
import androidx.datastore.preferences.protobuf.C21843o00ooo;
import androidx.datastore.preferences.protobuf.OooO;
import androidx.datastore.preferences.protobuf.OooOo00;
import com.aspose.words.WarningType;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import o0000oO0.C24328OooO0o;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21826OoooOOO<T> implements InterfaceC21836Oooooo<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int[] f64519OooOOOo = new int[0];

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Unsafe f64520OooOOo0 = C21843o00ooo.OooO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f64521OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f64522OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f64523OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f64524OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f64525OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f64526OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo f64527OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f64528OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f64529OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f64530OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC21828OoooOo0 f64531OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Oooo000 f64532OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final AbstractC21798OooOOo0<?> f64533OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00Oo0<?, ?> f64534OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC21817Oooo0o f64535OooOOOO;

    public C21826OoooOOO(int[] iArr, Object[] objArr, int i, int i2, OooOo oooOo, int[] iArr2, int i3, int i4, InterfaceC21828OoooOo0 interfaceC21828OoooOo0, Oooo000 oooo000, o00Oo0 o00oo02, AbstractC21798OooOOo0 abstractC21798OooOOo0, InterfaceC21817Oooo0o interfaceC21817Oooo0o) {
        this.f64522OooO00o = iArr;
        this.f64523OooO0O0 = objArr;
        this.f64524OooO0OO = i;
        this.f64525OooO0Oo = i2;
        this.f64528OooO0oO = Objects.nonNull(oooOo);
        this.f64526OooO0o = abstractC21798OooOOo0 != null && abstractC21798OooOOo0.OooO0o0(oooOo);
        this.f64529OooO0oo = iArr2;
        this.f64521OooO = i3;
        this.f64530OooOO0 = i4;
        this.f64531OooOO0O = interfaceC21828OoooOo0;
        this.f64532OooOO0o = oooo000;
        this.f64534OooOOO0 = o00oo02;
        this.f64533OooOOO = abstractC21798OooOOo0;
        this.f64527OooO0o0 = oooOo;
        this.f64535OooOOOO = interfaceC21817Oooo0o;
    }

    public static boolean OooOOO0(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof OooOo) {
            return ((OooOo) obj).OooOO0();
        }
        return true;
    }

    public static <T> long OooOo(T t, long j) {
        return ((Long) C21843o00ooo.f64584OooO0OO.OooO0oo(t, j)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> C21826OoooOOO<T> OooOo0(C21837Oooooo0 c21837Oooooo0, InterfaceC21828OoooOo0 interfaceC21828OoooOo0, Oooo000 oooo000, o00Oo0<?, ?> o00oo02, AbstractC21798OooOOo0<?> abstractC21798OooOOo0, InterfaceC21817Oooo0o interfaceC21817Oooo0o) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        String str;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        Field fieldOooOooO;
        char cCharAt9;
        int i22;
        int i23;
        Object obj;
        Field fieldOooOooO2;
        Object obj2;
        Field fieldOooOooO3;
        int i24;
        char cCharAt10;
        int i25;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String str2 = c21837Oooooo0.f64553OooO0O0;
        int length = str2.length();
        char c = 55296;
        if (str2.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str2.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt2 = str2.charAt(i);
        if (iCharAt2 >= 55296) {
            int i31 = iCharAt2 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = str2.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt2 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f64519OooOOOo;
            i4 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt3 = str2.charAt(i30);
            if (iCharAt3 >= 55296) {
                int i34 = iCharAt3 & 8191;
                int i35 = 13;
                while (true) {
                    i15 = i33 + 1;
                    cCharAt8 = str2.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i15;
                }
                iCharAt3 = i34 | (cCharAt8 << i35);
                i33 = i15;
            }
            int i36 = i33 + 1;
            int iCharAt4 = str2.charAt(i33);
            if (iCharAt4 >= 55296) {
                int i37 = iCharAt4 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    cCharAt7 = str2.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                iCharAt4 = i37 | (cCharAt7 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int iCharAt5 = str2.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    cCharAt6 = str2.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                iCharAt5 = i40 | (cCharAt6 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int iCharAt6 = str2.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    cCharAt5 = str2.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                iCharAt6 = i43 | (cCharAt5 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            iCharAt = str2.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    cCharAt4 = str2.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                iCharAt = i46 | (cCharAt4 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            int iCharAt7 = str2.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    cCharAt3 = str2.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                iCharAt7 = i49 | (cCharAt3 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            int iCharAt8 = str2.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    cCharAt2 = str2.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                iCharAt8 = i52 | (cCharAt2 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int iCharAt9 = str2.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    cCharAt = str2.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                iCharAt9 = i55 | (cCharAt << i56);
                i54 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i57 = (iCharAt3 * 2) + iCharAt4;
            int i58 = iCharAt7;
            i2 = iCharAt5;
            i3 = i58;
            i4 = iCharAt3;
            i30 = i54;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i57;
            i7 = iCharAt9;
        }
        Unsafe unsafe = f64520OooOOo0;
        Class<?> cls = c21837Oooooo0.f64552OooO00o.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i59 = i7 + i3;
        int i60 = i59;
        int i61 = i7;
        int i62 = 0;
        int i63 = 0;
        while (i30 < length) {
            int i64 = i30 + 1;
            int iCharAt10 = str2.charAt(i30);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i27 = i66 + 1;
                    cCharAt12 = str2.charAt(i66);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i27;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i16 = i27;
            } else {
                i16 = i64;
            }
            int i68 = i16 + 1;
            int iCharAt11 = str2.charAt(i16);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i26 = i70 + 1;
                    cCharAt11 = str2.charAt(i70);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i26;
                    length = i17;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i18 = i26;
            } else {
                i17 = length;
                i18 = i68;
            }
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            EnumC21833OooooO0 enumC21833OooooO0 = EnumC21833OooooO0.f64543OooOo0o;
            int[] iArr4 = iArr3;
            Object[] objArr2 = c21837Oooooo0.f64554OooO0OO;
            if (i72 >= 51) {
                int i74 = i18 + 1;
                int iCharAt12 = str2.charAt(i18);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt10 = str2.charAt(i76);
                        i25 = i75;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i75 = i25 | ((cCharAt10 & 8191) << i77);
                        i77 += 13;
                        i76 = i24;
                    }
                    iCharAt12 = i25 | (cCharAt10 << i77);
                    i22 = i24;
                } else {
                    i22 = i74;
                }
                int i78 = iCharAt12;
                int i79 = i72 - 51;
                int i80 = i22;
                if (i79 == 9 || i79 == 17) {
                    i23 = i6 + 1;
                    objArr[((i63 / 3) * 2) + 1] = objArr2[i6];
                } else {
                    if (i79 == 12 && (c21837Oooooo0.getSyntax().equals(enumC21833OooooO0) || (iCharAt11 & 2048) != 0)) {
                        i23 = i6 + 1;
                        objArr[((i63 / 3) * 2) + 1] = objArr2[i6];
                    }
                    int i81 = i78 * 2;
                    obj = objArr2[i81];
                    if (obj instanceof Field) {
                        fieldOooOooO2 = OooOooO(cls, (String) obj);
                        objArr2[i81] = fieldOooOooO2;
                    } else {
                        fieldOooOooO2 = (Field) obj;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldOooOooO2);
                    int i82 = i81 + 1;
                    obj2 = objArr2[i82];
                    if (obj2 instanceof Field) {
                        fieldOooOooO3 = OooOooO(cls, (String) obj2);
                        objArr2[i82] = fieldOooOooO3;
                    } else {
                        fieldOooOooO3 = (Field) obj2;
                    }
                    i19 = i4;
                    i20 = i80;
                    str = str2;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOooO3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                }
                i6 = i23;
                int i812 = i78 * 2;
                obj = objArr2[i812];
                if (obj instanceof Field) {
                }
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldOooOooO2);
                int i822 = i812 + 1;
                obj2 = objArr2[i822];
                if (obj2 instanceof Field) {
                }
                i19 = i4;
                i20 = i80;
                str = str2;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOooO3);
                iObjectFieldOffset = iObjectFieldOffset32;
                i21 = 0;
            } else {
                int i83 = i6 + 1;
                Field fieldOooOooO4 = OooOooO(cls, (String) objArr2[i6]);
                i19 = i4;
                if (i72 == 9 || i72 == 17) {
                    objArr[((i63 / 3) * 2) + 1] = fieldOooOooO4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i6 += 2;
                        objArr[((i63 / 3) * 2) + 1] = objArr2[i83];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (c21837Oooooo0.getSyntax() == enumC21833OooooO0 || (iCharAt11 & 2048) != 0) {
                            i6 += 2;
                            objArr[((i63 / 3) * 2) + 1] = objArr2[i83];
                        }
                    } else if (i72 == 50) {
                        int i84 = i61 + 1;
                        iArr[i61] = i63;
                        int i85 = (i63 / 3) * 2;
                        int i86 = i6 + 2;
                        objArr[i85] = objArr2[i83];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i85 + 1] = objArr2[i86];
                            i6 += 3;
                        } else {
                            i6 = i86;
                        }
                        i61 = i84;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOooOooO4);
                    if ((iCharAt11 & 4096) != 0 || i72 > 17) {
                        str = str2;
                        iObjectFieldOffset2 = 1048575;
                        i20 = i18;
                        i21 = 0;
                    } else {
                        int i87 = i18 + 1;
                        int iCharAt13 = str2.charAt(i18);
                        if (iCharAt13 >= 55296) {
                            int i88 = iCharAt13 & 8191;
                            int i89 = 13;
                            while (true) {
                                i20 = i87 + 1;
                                cCharAt9 = str2.charAt(i87);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i88 |= (cCharAt9 & 8191) << i89;
                                i89 += 13;
                                i87 = i20;
                            }
                            iCharAt13 = i88 | (cCharAt9 << i89);
                        } else {
                            i20 = i87;
                        }
                        int i90 = (iCharAt13 / 32) + (i19 * 2);
                        Object obj3 = objArr2[i90];
                        if (obj3 instanceof Field) {
                            fieldOooOooO = (Field) obj3;
                        } else {
                            fieldOooOooO = OooOooO(cls, (String) obj3);
                            objArr2[i90] = fieldOooOooO;
                        }
                        str = str2;
                        int i91 = iCharAt13;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldOooOooO);
                        i21 = i91 % 32;
                    }
                    if (i72 >= 18 && i72 <= 49) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                }
                i6 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldOooOooO4);
                if ((iCharAt11 & 4096) != 0) {
                    str = str2;
                    iObjectFieldOffset2 = 1048575;
                    i20 = i18;
                    i21 = 0;
                    if (i72 >= 18) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                }
            }
            int i92 = i63 + 1;
            iArr4[i63] = i73;
            int i93 = i63 + 2;
            int i94 = iObjectFieldOffset2;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? WarningType.HINT : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i72 << 20) | iObjectFieldOffset;
            i63 += 3;
            iArr4[i93] = (i21 << 20) | i94;
            str2 = str;
            iArr3 = iArr4;
            length = i17;
            i4 = i19;
            i30 = i20;
            c = 55296;
        }
        return new C21826OoooOOO<>(iArr3, objArr, i2, i5, c21837Oooooo0.f64552OooO00o, iArr, i7, i59, interfaceC21828OoooOo0, oooo000, o00oo02, abstractC21798OooOOo0, interfaceC21817Oooo0o);
    }

    public static long OooOo0O(int i) {
        return i & 1048575;
    }

    public static <T> int OooOo0o(T t, long j) {
        return ((Integer) C21843o00ooo.f64584OooO0OO.OooO0oo(t, j)).intValue();
    }

    public static Field OooOooO(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Field ", str, " for ");
            C21825OoooOO0.OooO0OO(cls, sbOooO0o0, " not found. Known fields are ");
            sbOooO0o0.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbOooO0o0.toString());
        }
    }

    public static int Oooo0(int i) {
        return (i & 267386880) >>> 20;
    }

    public final Object OooO(int i) {
        return this.f64523OooO0O0[(i / 3) * 2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037d A[PHI: r18
      0x037d: PHI (r18v47 int) = 
      (r18v30 int)
      (r18v31 int)
      (r18v32 int)
      (r18v36 int)
      (r18v38 int)
      (r18v39 int)
      (r18v40 int)
      (r18v44 int)
      (r18v48 int)
     binds: [B:214:0x053d, B:210:0x0521, B:206:0x0505, B:178:0x0474, B:160:0x0404, B:156:0x03ea, B:152:0x03d0, B:145:0x039a, B:139:0x037b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO00o(OooO00o oooO00o) {
        int i;
        int i2;
        int iOooO0oo;
        int iOooO0oo2;
        int iOooO0oo3;
        int iOooOO0;
        int iOooO0oo4;
        int iOooOO02;
        int iOooO0oo5;
        int iOooO0oo6;
        int iOooO0O0;
        int size;
        int iOooO;
        int iOooO0oo7;
        int iOooO0oo8;
        int iOooO0oo9;
        int size2;
        int iOooO0oo10;
        int iOooO2;
        int iOooO0Oo;
        int serializedSize;
        int iOooO0oo11;
        int iOooO0oo12;
        int iOooO0oo13;
        int iOooOO03;
        int iOooO0oo14;
        int iOooOO04;
        C21826OoooOOO c21826OoooOOO = this;
        OooO00o oooO00o2 = oooO00o;
        int i3 = 1;
        Unsafe unsafe = f64520OooOOo0;
        int i4 = 0;
        int i5 = 0;
        int iOooO0O02 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = c21826OoooOOO.f64522OooO00o;
            if (i4 >= iArr.length) {
                o00Oo0<?, ?> o00oo02 = c21826OoooOOO.f64534OooOOO0;
                int iOooO0oo15 = o00oo02.OooO0oo(o00oo02.OooO0oO(oooO00o2)) + iOooO0O02;
                if (!c21826OoooOOO.f64526OooO0o) {
                    return iOooO0oo15;
                }
                C21839Ooooooo c21839Ooooooo = c21826OoooOOO.f64533OooOOO.OooO0OO(oooO00o2).f64476OooO00o;
                int size3 = c21839Ooooooo.f64592OooOo0o.size();
                int iOooO0OO = 0;
                for (int i7 = 0; i7 < size3; i7++) {
                    Map.Entry<OooOo00.OooO00o<Object>, Object> entryOooO0Oo = c21839Ooooooo.OooO0Oo(i7);
                    iOooO0OO += OooOo00.OooO0OO(entryOooO0Oo.getKey(), entryOooO0Oo.getValue());
                }
                for (Map.Entry entry : c21839Ooooooo.OooO0o0()) {
                    iOooO0OO += OooOo00.OooO0OO((OooOo00.OooO00o) entry.getKey(), entry.getValue());
                }
                return iOooO0oo15 + iOooO0OO;
            }
            int iOooo0O0 = c21826OoooOOO.Oooo0O0(i4);
            int iOooo0 = Oooo0(iOooo0O0);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            if (iOooo0 <= 17) {
                if (i10 != i6) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(oooO00o2, i10);
                    i6 = i10;
                }
                i = i3 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = iOooo0O0 & 1048575;
            if (iOooo0 >= EnumC21802OooOo0.f64470OooOo.f64474OooOo0o) {
                int i11 = EnumC21802OooOo0.f64472OooOoO0.f64474OooOo0o;
            }
            switch (iOooo0) {
                case 0:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo = AbstractC21794OooOO0o.OooO0oo(i8) + 8;
                        iOooO0O02 += iOooO0oo;
                    }
                    break;
                case 1:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo2 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo6 = iOooO0oo2 + 4;
                        iOooO0O02 += iOooO0oo6;
                    }
                    c21826OoooOOO = this;
                    oooO00o2 = oooO00o;
                    break;
                case 2:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        long j2 = unsafe.getLong(oooO00o2, j);
                        iOooO0oo3 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO0 = AbstractC21794OooOO0o.OooOO0(j2);
                        iOooO0O02 += iOooOO0 + iOooO0oo3;
                    }
                    c21826OoooOOO = this;
                    break;
                case 3:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(oooO00o2, j);
                        iOooO0oo3 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO0 = AbstractC21794OooOO0o.OooOO0(j3);
                        iOooO0O02 += iOooOO0 + iOooO0oo3;
                    }
                    c21826OoooOOO = this;
                    break;
                case 4:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        int i12 = unsafe.getInt(oooO00o2, j);
                        iOooO0oo4 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO02 = AbstractC21794OooOO0o.OooOO0(i12);
                        iOooO0O0 = iOooOO02 + iOooO0oo4;
                        iOooO0O02 += iOooO0O0;
                    }
                    c21826OoooOOO = this;
                    break;
                case 5:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo5 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo6 = iOooO0oo5 + 8;
                        iOooO0O02 += iOooO0oo6;
                    }
                    c21826OoooOOO = this;
                    oooO00o2 = oooO00o;
                    break;
                case 6:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo2 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo6 = iOooO0oo2 + 4;
                        iOooO0O02 += iOooO0oo6;
                    }
                    c21826OoooOOO = this;
                    oooO00o2 = oooO00o;
                    break;
                case 7:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo6 = AbstractC21794OooOO0o.OooO0oo(i8) + 1;
                        iOooO0O02 += iOooO0oo6;
                    }
                    c21826OoooOOO = this;
                    oooO00o2 = oooO00o;
                    break;
                case 8:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        Object object = unsafe.getObject(oooO00o2, j);
                        iOooO0O02 = (object instanceof OooO ? AbstractC21794OooOO0o.OooO0O0(i8, (OooO) object) : AbstractC21794OooOO0o.OooO0oO((String) object) + AbstractC21794OooOO0o.OooO0oo(i8)) + iOooO0O02;
                    }
                    c21826OoooOOO = this;
                    break;
                case 9:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        Object object2 = unsafe.getObject(oooO00o2, j);
                        InterfaceC21836Oooooo interfaceC21836OoooooOooOO0 = c21826OoooOOO.OooOO0(i4);
                        Class<?> cls = C21838OoooooO.f64556OooO00o;
                        if (object2 instanceof C21810OooOooO) {
                            iOooO0oo = AbstractC21794OooOO0o.OooO0Oo((C21810OooOooO) object2) + AbstractC21794OooOO0o.OooO0oo(i8);
                        } else {
                            int iOooO0oo16 = AbstractC21794OooOO0o.OooO0oo(i8);
                            int iOooO0Oo2 = ((OooO00o) ((InterfaceC21822OoooO0) object2)).OooO0Oo(interfaceC21836OoooooOooOO0);
                            iOooO0oo = AbstractC21794OooOO0o.OooO(iOooO0Oo2) + iOooO0Oo2 + iOooO0oo16;
                        }
                        iOooO0O02 += iOooO0oo;
                    }
                    break;
                case 10:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0O0 = AbstractC21794OooOO0o.OooO0O0(i8, (OooO) unsafe.getObject(oooO00o2, j));
                        iOooO0O02 += iOooO0O0;
                    }
                    c21826OoooOOO = this;
                    break;
                case 11:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        int i13 = unsafe.getInt(oooO00o2, j);
                        iOooO0oo4 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO02 = AbstractC21794OooOO0o.OooO(i13);
                        iOooO0O0 = iOooOO02 + iOooO0oo4;
                        iOooO0O02 += iOooO0O0;
                    }
                    c21826OoooOOO = this;
                    break;
                case 12:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        int i14 = unsafe.getInt(oooO00o2, j);
                        iOooO0oo4 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO02 = AbstractC21794OooOO0o.OooOO0(i14);
                        iOooO0O0 = iOooOO02 + iOooO0oo4;
                        iOooO0O02 += iOooO0O0;
                    }
                    c21826OoooOOO = this;
                    break;
                case 13:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo2 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo6 = iOooO0oo2 + 4;
                        iOooO0O02 += iOooO0oo6;
                    }
                    c21826OoooOOO = this;
                    oooO00o2 = oooO00o;
                    break;
                case 14:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo5 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo6 = iOooO0oo5 + 8;
                        iOooO0O02 += iOooO0oo6;
                    }
                    c21826OoooOOO = this;
                    oooO00o2 = oooO00o;
                    break;
                case 15:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        int i15 = unsafe.getInt(oooO00o2, j);
                        iOooO0oo4 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO02 = AbstractC21794OooOO0o.OooO0o0(i15);
                        iOooO0O0 = iOooOO02 + iOooO0oo4;
                        iOooO0O02 += iOooO0O0;
                    }
                    c21826OoooOOO = this;
                    break;
                case 16:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        long j4 = unsafe.getLong(oooO00o2, j);
                        iOooO0oo3 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO0 = AbstractC21794OooOO0o.OooO0o(j4);
                        iOooO0O02 += iOooOO0 + iOooO0oo3;
                    }
                    c21826OoooOOO = this;
                    break;
                case 17:
                    i2 = i3;
                    if (c21826OoooOOO.OooOO0o(oooO00o2, i4, i6, i5, i)) {
                        iOooO0oo = ((OooO00o) ((InterfaceC21822OoooO0) unsafe.getObject(oooO00o2, j))).OooO0Oo(c21826OoooOOO.OooOO0(i4)) + (AbstractC21794OooOO0o.OooO0oo(i8) * 2);
                        iOooO0O02 += iOooO0oo;
                    }
                    break;
                case 18:
                    i2 = i3;
                    iOooO0oo = C21838OoooooO.OooO0OO(i8, (List) unsafe.getObject(oooO00o2, j));
                    iOooO0O02 += iOooO0oo;
                    break;
                case 19:
                    i2 = i3;
                    iOooO0oo = C21838OoooooO.OooO0O0(i8, (List) unsafe.getObject(oooO00o2, j));
                    iOooO0O02 += iOooO0oo;
                    break;
                case 20:
                    i2 = i3;
                    List list = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls2 = C21838OoooooO.f64556OooO00o;
                    iOooO0oo8 = list.size() == 0 ? 0 : (AbstractC21794OooOO0o.OooO0oo(i8) * list.size()) + C21838OoooooO.OooO0o0(list);
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 21:
                    i2 = i3;
                    List list2 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls3 = C21838OoooooO.f64556OooO00o;
                    size = list2.size();
                    if (size != 0) {
                        iOooO = C21838OoooooO.OooO(list2);
                        iOooO0oo7 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo8 = (iOooO0oo7 * size) + iOooO;
                        iOooO0O02 += iOooO0oo8;
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 22:
                    i2 = i3;
                    List list3 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls4 = C21838OoooooO.f64556OooO00o;
                    size = list3.size();
                    if (size != 0) {
                        iOooO = C21838OoooooO.OooO0Oo(list3);
                        iOooO0oo7 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo8 = (iOooO0oo7 * size) + iOooO;
                        iOooO0O02 += iOooO0oo8;
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 23:
                    i2 = i3;
                    iOooO0oo = C21838OoooooO.OooO0OO(i8, (List) unsafe.getObject(oooO00o2, j));
                    iOooO0O02 += iOooO0oo;
                    break;
                case 24:
                    i2 = i3;
                    iOooO0oo = C21838OoooooO.OooO0O0(i8, (List) unsafe.getObject(oooO00o2, j));
                    iOooO0O02 += iOooO0oo;
                    break;
                case 25:
                    i2 = i3;
                    List list4 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls5 = C21838OoooooO.f64556OooO00o;
                    int size4 = list4.size();
                    iOooO0O02 += size4 == 0 ? 0 : (AbstractC21794OooOO0o.OooO0oo(i8) + 1) * size4;
                    break;
                case 26:
                    i2 = i3;
                    List list5 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls6 = C21838OoooooO.f64556OooO00o;
                    int size5 = list5.size();
                    if (size5 != 0) {
                        iOooO0oo8 = AbstractC21794OooOO0o.OooO0oo(i8) * size5;
                        if (list5 instanceof InterfaceC21811OooOooo) {
                            InterfaceC21811OooOooo interfaceC21811OooOooo = (InterfaceC21811OooOooo) list5;
                            for (int i16 = 0; i16 < size5; i16++) {
                                Object objO00000oO = interfaceC21811OooOooo.o00000oO();
                                iOooO0oo8 = (objO00000oO instanceof OooO ? AbstractC21794OooOO0o.OooO0OO((OooO) objO00000oO) : AbstractC21794OooOO0o.OooO0oO((String) objO00000oO)) + iOooO0oo8;
                            }
                        } else {
                            for (int i17 = 0; i17 < size5; i17++) {
                                Object obj = list5.get(i17);
                                iOooO0oo8 = (obj instanceof OooO ? AbstractC21794OooOO0o.OooO0OO((OooO) obj) : AbstractC21794OooOO0o.OooO0oO((String) obj)) + iOooO0oo8;
                            }
                        }
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 27:
                    i2 = i3;
                    List list6 = (List) unsafe.getObject(oooO00o2, j);
                    InterfaceC21836Oooooo interfaceC21836OoooooOooOO02 = c21826OoooOOO.OooOO0(i4);
                    Class<?> cls7 = C21838OoooooO.f64556OooO00o;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iOooO0oo9 = 0;
                    } else {
                        iOooO0oo9 = AbstractC21794OooOO0o.OooO0oo(i8) * size6;
                        for (int i18 = 0; i18 < size6; i18++) {
                            Object obj2 = list6.get(i18);
                            if (obj2 instanceof C21810OooOooO) {
                                iOooO0oo9 = AbstractC21794OooOO0o.OooO0Oo((C21810OooOooO) obj2) + iOooO0oo9;
                            } else {
                                int iOooO0Oo3 = ((OooO00o) ((InterfaceC21822OoooO0) obj2)).OooO0Oo(interfaceC21836OoooooOooOO02);
                                iOooO0oo9 = AbstractC21794OooOO0o.OooO(iOooO0Oo3) + iOooO0Oo3 + iOooO0oo9;
                            }
                        }
                    }
                    iOooO0O02 += iOooO0oo9;
                    break;
                case 28:
                    i2 = i3;
                    List list7 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls8 = C21838OoooooO.f64556OooO00o;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        iOooO0oo8 = AbstractC21794OooOO0o.OooO0oo(i8) * size7;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            iOooO0oo8 += AbstractC21794OooOO0o.OooO0OO((OooO) list7.get(i19));
                        }
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 29:
                    i2 = i3;
                    List list8 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls9 = C21838OoooooO.f64556OooO00o;
                    size = list8.size();
                    if (size != 0) {
                        iOooO = C21838OoooooO.OooO0oo(list8);
                        iOooO0oo7 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo8 = (iOooO0oo7 * size) + iOooO;
                        iOooO0O02 += iOooO0oo8;
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 30:
                    i2 = i3;
                    List list9 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls10 = C21838OoooooO.f64556OooO00o;
                    size = list9.size();
                    if (size != 0) {
                        iOooO = C21838OoooooO.OooO00o(list9);
                        iOooO0oo7 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo8 = (iOooO0oo7 * size) + iOooO;
                        iOooO0O02 += iOooO0oo8;
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 31:
                    i2 = i3;
                    iOooO0oo = C21838OoooooO.OooO0O0(i8, (List) unsafe.getObject(oooO00o2, j));
                    iOooO0O02 += iOooO0oo;
                    break;
                case 32:
                    i2 = i3;
                    iOooO0oo = C21838OoooooO.OooO0OO(i8, (List) unsafe.getObject(oooO00o2, j));
                    iOooO0O02 += iOooO0oo;
                    break;
                case 33:
                    i2 = i3;
                    List list10 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls11 = C21838OoooooO.f64556OooO00o;
                    size = list10.size();
                    if (size != 0) {
                        iOooO = C21838OoooooO.OooO0o(list10);
                        iOooO0oo7 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo8 = (iOooO0oo7 * size) + iOooO;
                        iOooO0O02 += iOooO0oo8;
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 34:
                    i2 = i3;
                    List list11 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls12 = C21838OoooooO.f64556OooO00o;
                    size = list11.size();
                    if (size != 0) {
                        iOooO = C21838OoooooO.OooO0oO(list11);
                        iOooO0oo7 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO0oo8 = (iOooO0oo7 * size) + iOooO;
                        iOooO0O02 += iOooO0oo8;
                    }
                    iOooO0O02 += iOooO0oo8;
                    break;
                case 35:
                    i2 = i3;
                    List list12 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls13 = C21838OoooooO.f64556OooO00o;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 36:
                    i2 = i3;
                    List list13 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls14 = C21838OoooooO.f64556OooO00o;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 37:
                    i2 = i3;
                    size2 = C21838OoooooO.OooO0o0((List) unsafe.getObject(oooO00o2, j));
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 38:
                    i2 = i3;
                    size2 = C21838OoooooO.OooO((List) unsafe.getObject(oooO00o2, j));
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 39:
                    i2 = i3;
                    size2 = C21838OoooooO.OooO0Oo((List) unsafe.getObject(oooO00o2, j));
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 40:
                    i2 = i3;
                    List list14 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls15 = C21838OoooooO.f64556OooO00o;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 41:
                    i2 = i3;
                    List list15 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls16 = C21838OoooooO.f64556OooO00o;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 42:
                    i2 = i3;
                    List list16 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls17 = C21838OoooooO.f64556OooO00o;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 43:
                    i2 = i3;
                    size2 = C21838OoooooO.OooO0oo((List) unsafe.getObject(oooO00o2, j));
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 44:
                    i2 = i3;
                    size2 = C21838OoooooO.OooO00o((List) unsafe.getObject(oooO00o2, j));
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 45:
                    i2 = i3;
                    List list17 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls18 = C21838OoooooO.f64556OooO00o;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 46:
                    i2 = i3;
                    List list18 = (List) unsafe.getObject(oooO00o2, j);
                    Class<?> cls19 = C21838OoooooO.f64556OooO00o;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 47:
                    i2 = i3;
                    size2 = C21838OoooooO.OooO0o((List) unsafe.getObject(oooO00o2, j));
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 48:
                    i2 = i3;
                    size2 = C21838OoooooO.OooO0oO((List) unsafe.getObject(oooO00o2, j));
                    if (size2 > 0) {
                        iOooO0oo10 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooO2 = AbstractC21794OooOO0o.OooO(size2);
                        iOooO0O02 += iOooO2 + iOooO0oo10 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(oooO00o2, j);
                    InterfaceC21836Oooooo interfaceC21836OoooooOooOO03 = c21826OoooOOO.OooOO0(i4);
                    Class<?> cls20 = C21838OoooooO.f64556OooO00o;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        iOooO0Oo = 0;
                    } else {
                        int i20 = 0;
                        iOooO0Oo = 0;
                        while (i20 < size8) {
                            iOooO0Oo += ((OooO00o) ((InterfaceC21822OoooO0) list19.get(i20))).OooO0Oo(interfaceC21836OoooooOooOO03) + (AbstractC21794OooOO0o.OooO0oo(i8) * 2);
                            i20++;
                            i3 = i3;
                        }
                    }
                    i2 = i3;
                    iOooO0O02 += iOooO0Oo;
                    break;
                case 50:
                    serializedSize = c21826OoooOOO.f64535OooOOOO.getSerializedSize(i8, unsafe.getObject(oooO00o2, j), c21826OoooOOO.OooO(i4));
                    iOooO0O02 += serializedSize;
                    i2 = i3;
                    break;
                case 51:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        iOooO0oo11 = AbstractC21794OooOO0o.OooO0oo(i8);
                        serializedSize = iOooO0oo11 + 8;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 52:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        iOooO0oo12 = AbstractC21794OooOO0o.OooO0oo(i8);
                        serializedSize = iOooO0oo12 + 4;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 53:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        long jOooOo = OooOo(oooO00o2, j);
                        iOooO0oo13 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO03 = AbstractC21794OooOO0o.OooOO0(jOooOo);
                        iOooO0O02 += iOooOO03 + iOooO0oo13;
                    }
                    i2 = i3;
                    break;
                case 54:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        long jOooOo2 = OooOo(oooO00o2, j);
                        iOooO0oo13 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO03 = AbstractC21794OooOO0o.OooOO0(jOooOo2);
                        iOooO0O02 += iOooOO03 + iOooO0oo13;
                    }
                    i2 = i3;
                    break;
                case 55:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        int iOooOo0o = OooOo0o(oooO00o2, j);
                        iOooO0oo14 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO04 = AbstractC21794OooOO0o.OooOO0(iOooOo0o);
                        serializedSize = iOooOO04 + iOooO0oo14;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 56:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        iOooO0oo11 = AbstractC21794OooOO0o.OooO0oo(i8);
                        serializedSize = iOooO0oo11 + 8;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 57:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        iOooO0oo12 = AbstractC21794OooOO0o.OooO0oo(i8);
                        serializedSize = iOooO0oo12 + 4;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 58:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        serializedSize = AbstractC21794OooOO0o.OooO0oo(i8) + i3;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 59:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        Object object3 = unsafe.getObject(oooO00o2, j);
                        iOooO0O02 = (object3 instanceof OooO ? AbstractC21794OooOO0o.OooO0O0(i8, (OooO) object3) : AbstractC21794OooOO0o.OooO0oO((String) object3) + AbstractC21794OooOO0o.OooO0oo(i8)) + iOooO0O02;
                    }
                    i2 = i3;
                    break;
                case 60:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        Object object4 = unsafe.getObject(oooO00o2, j);
                        InterfaceC21836Oooooo interfaceC21836OoooooOooOO04 = c21826OoooOOO.OooOO0(i4);
                        Class<?> cls21 = C21838OoooooO.f64556OooO00o;
                        if (object4 instanceof C21810OooOooO) {
                            iOooO0oo14 = AbstractC21794OooOO0o.OooO0oo(i8);
                            iOooOO04 = AbstractC21794OooOO0o.OooO0Oo((C21810OooOooO) object4);
                            serializedSize = iOooOO04 + iOooO0oo14;
                            iOooO0O02 += serializedSize;
                        } else {
                            int iOooO0oo17 = AbstractC21794OooOO0o.OooO0oo(i8);
                            int iOooO0Oo4 = ((OooO00o) ((InterfaceC21822OoooO0) object4)).OooO0Oo(interfaceC21836OoooooOooOO04);
                            serializedSize = AbstractC21794OooOO0o.OooO(iOooO0Oo4) + iOooO0Oo4 + iOooO0oo17;
                            iOooO0O02 += serializedSize;
                        }
                    }
                    i2 = i3;
                    break;
                case 61:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        serializedSize = AbstractC21794OooOO0o.OooO0O0(i8, (OooO) unsafe.getObject(oooO00o2, j));
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 62:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        int iOooOo0o2 = OooOo0o(oooO00o2, j);
                        iOooO0oo14 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO04 = AbstractC21794OooOO0o.OooO(iOooOo0o2);
                        serializedSize = iOooOO04 + iOooO0oo14;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 63:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        int iOooOo0o3 = OooOo0o(oooO00o2, j);
                        iOooO0oo14 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO04 = AbstractC21794OooOO0o.OooOO0(iOooOo0o3);
                        serializedSize = iOooOO04 + iOooO0oo14;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 64:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        iOooO0oo12 = AbstractC21794OooOO0o.OooO0oo(i8);
                        serializedSize = iOooO0oo12 + 4;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 65:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        iOooO0oo11 = AbstractC21794OooOO0o.OooO0oo(i8);
                        serializedSize = iOooO0oo11 + 8;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 66:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        int iOooOo0o4 = OooOo0o(oooO00o2, j);
                        iOooO0oo14 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO04 = AbstractC21794OooOO0o.OooO0o0(iOooOo0o4);
                        serializedSize = iOooOO04 + iOooO0oo14;
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                case 67:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        long jOooOo3 = OooOo(oooO00o2, j);
                        iOooO0oo13 = AbstractC21794OooOO0o.OooO0oo(i8);
                        iOooOO03 = AbstractC21794OooOO0o.OooO0o(jOooOo3);
                        iOooO0O02 += iOooOO03 + iOooO0oo13;
                    }
                    i2 = i3;
                    break;
                case 68:
                    if (c21826OoooOOO.OooOOO(oooO00o2, i8, i4)) {
                        serializedSize = ((OooO00o) ((InterfaceC21822OoooO0) unsafe.getObject(oooO00o2, j))).OooO0Oo(c21826OoooOOO.OooOO0(i4)) + (AbstractC21794OooOO0o.OooO0oo(i8) * 2);
                        iOooO0O02 += serializedSize;
                    }
                    i2 = i3;
                    break;
                default:
                    i2 = i3;
                    break;
            }
            i4 += 3;
            i3 = i2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final void OooO0O0(Object obj, OooOO0O oooOO0O, C21796OooOOOo c21796OooOOOo) throws IOException {
        c21796OooOOOo.getClass();
        if (!OooOOO0(obj)) {
            throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "Mutating immutable message: "));
        }
        OooOOOO(this.f64534OooOOO0, this.f64533OooOOO, obj, oooOO0O, c21796OooOOOo);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final void OooO0OO(T t, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException {
        interfaceC21846o0ooOO0.getClass();
        Oooo0OO(t, interfaceC21846o0ooOO0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0Oo(OooOo oooOo, OooOo oooOo2) {
        int[] iArr = this.f64522OooO00o;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zOooOO0o = true;
            if (i < length) {
                int iOooo0O0 = Oooo0O0(i);
                long j = iOooo0O0 & 1048575;
                switch (Oooo0(iOooo0O0)) {
                    case 0:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o0 = C21843o00ooo.f64584OooO0OO;
                            if (Double.doubleToLongBits(abstractC21845OooO0o0.OooO0Oo(oooOo, j)) != Double.doubleToLongBits(abstractC21845OooO0o0.OooO0Oo(oooOo2, j))) {
                                zOooOO0o = false;
                            }
                            break;
                        }
                        break;
                    case 1:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o02 = C21843o00ooo.f64584OooO0OO;
                            if (Float.floatToIntBits(abstractC21845OooO0o02.OooO0o0(oooOo, j)) != Float.floatToIntBits(abstractC21845OooO0o02.OooO0o0(oooOo2, j))) {
                            }
                        }
                        break;
                    case 2:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o03 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o03.OooO0oO(oooOo, j) != abstractC21845OooO0o03.OooO0oO(oooOo2, j)) {
                            }
                        }
                        break;
                    case 3:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o04 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o04.OooO0oO(oooOo, j) != abstractC21845OooO0o04.OooO0oO(oooOo2, j)) {
                            }
                        }
                        break;
                    case 4:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o05 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o05.OooO0o(oooOo, j) != abstractC21845OooO0o05.OooO0o(oooOo2, j)) {
                            }
                        }
                        break;
                    case 5:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o06 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o06.OooO0oO(oooOo, j) != abstractC21845OooO0o06.OooO0oO(oooOo2, j)) {
                            }
                        }
                        break;
                    case 6:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o07 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o07.OooO0o(oooOo, j) != abstractC21845OooO0o07.OooO0o(oooOo2, j)) {
                            }
                        }
                        break;
                    case 7:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o08 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o08.OooO0OO(oooOo, j) != abstractC21845OooO0o08.OooO0OO(oooOo2, j)) {
                            }
                        }
                        break;
                    case 8:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o09 = C21843o00ooo.f64584OooO0OO;
                            if (!C21838OoooooO.OooOO0o(abstractC21845OooO0o09.OooO0oo(oooOo, j), abstractC21845OooO0o09.OooO0oo(oooOo2, j))) {
                            }
                        }
                        break;
                    case 9:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o010 = C21843o00ooo.f64584OooO0OO;
                            if (!C21838OoooooO.OooOO0o(abstractC21845OooO0o010.OooO0oo(oooOo, j), abstractC21845OooO0o010.OooO0oo(oooOo2, j))) {
                            }
                        }
                        break;
                    case 10:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o011 = C21843o00ooo.f64584OooO0OO;
                            if (!C21838OoooooO.OooOO0o(abstractC21845OooO0o011.OooO0oo(oooOo, j), abstractC21845OooO0o011.OooO0oo(oooOo2, j))) {
                            }
                        }
                        break;
                    case 11:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o012 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o012.OooO0o(oooOo, j) != abstractC21845OooO0o012.OooO0o(oooOo2, j)) {
                            }
                        }
                        break;
                    case 12:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o013 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o013.OooO0o(oooOo, j) != abstractC21845OooO0o013.OooO0o(oooOo2, j)) {
                            }
                        }
                        break;
                    case 13:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o014 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o014.OooO0o(oooOo, j) != abstractC21845OooO0o014.OooO0o(oooOo2, j)) {
                            }
                        }
                        break;
                    case 14:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o015 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o015.OooO0oO(oooOo, j) != abstractC21845OooO0o015.OooO0oO(oooOo2, j)) {
                            }
                        }
                        break;
                    case 15:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o016 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o016.OooO0o(oooOo, j) != abstractC21845OooO0o016.OooO0o(oooOo2, j)) {
                            }
                        }
                        break;
                    case 16:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o017 = C21843o00ooo.f64584OooO0OO;
                            if (abstractC21845OooO0o017.OooO0oO(oooOo, j) != abstractC21845OooO0o017.OooO0oO(oooOo2, j)) {
                            }
                        }
                        break;
                    case 17:
                        if (OooO0o(oooOo, oooOo2, i)) {
                            C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o018 = C21843o00ooo.f64584OooO0OO;
                            if (!C21838OoooooO.OooOO0o(abstractC21845OooO0o018.OooO0oo(oooOo, j), abstractC21845OooO0o018.OooO0oo(oooOo2, j))) {
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o019 = C21843o00ooo.f64584OooO0OO;
                        zOooOO0o = C21838OoooooO.OooOO0o(abstractC21845OooO0o019.OooO0oo(oooOo, j), abstractC21845OooO0o019.OooO0oo(oooOo2, j));
                        break;
                    case 50:
                        C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o020 = C21843o00ooo.f64584OooO0OO;
                        zOooOO0o = C21838OoooooO.OooOO0o(abstractC21845OooO0o020.OooO0oo(oooOo, j), abstractC21845OooO0o020.OooO0oo(oooOo2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o021 = C21843o00ooo.f64584OooO0OO;
                        if (abstractC21845OooO0o021.OooO0o(oooOo, j2) != abstractC21845OooO0o021.OooO0o(oooOo2, j2) || !C21838OoooooO.OooOO0o(abstractC21845OooO0o021.OooO0oo(oooOo, j), abstractC21845OooO0o021.OooO0oo(oooOo2, j))) {
                        }
                        break;
                }
                if (zOooOO0o) {
                    i += 3;
                }
            } else {
                o00Oo0<?, ?> o00oo02 = this.f64534OooOOO0;
                if (o00oo02.OooO0oO(oooOo).equals(o00oo02.OooO0oO(oooOo2))) {
                    if (!this.f64526OooO0o) {
                        return true;
                    }
                    AbstractC21798OooOOo0<?> abstractC21798OooOOo0 = this.f64533OooOOO;
                    return abstractC21798OooOOo0.OooO0OO(oooOo).equals(abstractC21798OooOOo0.OooO0OO(oooOo2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0o(OooOo oooOo, OooOo oooOo2, int i) {
        return OooOO0O(oooOo, i) == OooOO0O(oooOo2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0o0(OooOo oooOo) {
        int i;
        int iOooO0O0;
        int i2;
        int[] iArr = this.f64522OooO00o;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iOooo0O0 = Oooo0O0(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iOooo0O0;
            int i6 = 1237;
            int iHashCode = 37;
            switch (Oooo0(iOooo0O0)) {
                case 0:
                    i = i3 * 53;
                    iOooO0O0 = C21805OooOoO.OooO0O0(Double.doubleToLongBits(C21843o00ooo.f64584OooO0OO.OooO0Oo(oooOo, j)));
                    i3 = iOooO0O0 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iOooO0O0 = Float.floatToIntBits(C21843o00ooo.f64584OooO0OO.OooO0o0(oooOo, j));
                    i3 = iOooO0O0 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iOooO0O0 = C21805OooOoO.OooO0O0(C21843o00ooo.f64584OooO0OO.OooO0oO(oooOo, j));
                    i3 = iOooO0O0 + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iOooO0O0 = C21805OooOoO.OooO0O0(C21843o00ooo.f64584OooO0OO.OooO0oO(oooOo, j));
                    i3 = iOooO0O0 + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0o(oooOo, j);
                    i3 = iOooO0O0 + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iOooO0O0 = C21805OooOoO.OooO0O0(C21843o00ooo.f64584OooO0OO.OooO0oO(oooOo, j));
                    i3 = iOooO0O0 + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0o(oooOo, j);
                    i3 = iOooO0O0 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zOooO0OO = C21843o00ooo.f64584OooO0OO.OooO0OO(oooOo, j);
                    Charset charset = C21805OooOoO.f64482OooO00o;
                    if (zOooO0OO) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iOooO0O0 = ((String) C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j)).hashCode();
                    i3 = iOooO0O0 + i;
                    break;
                case 9:
                    Object objOooO0oo = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j);
                    if (objOooO0oo != null) {
                        iHashCode = objOooO0oo.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j).hashCode();
                    i3 = iOooO0O0 + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0o(oooOo, j);
                    i3 = iOooO0O0 + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0o(oooOo, j);
                    i3 = iOooO0O0 + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0o(oooOo, j);
                    i3 = iOooO0O0 + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iOooO0O0 = C21805OooOoO.OooO0O0(C21843o00ooo.f64584OooO0OO.OooO0oO(oooOo, j));
                    i3 = iOooO0O0 + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0o(oooOo, j);
                    i3 = iOooO0O0 + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iOooO0O0 = C21805OooOoO.OooO0O0(C21843o00ooo.f64584OooO0OO.OooO0oO(oooOo, j));
                    i3 = iOooO0O0 + i;
                    break;
                case 17:
                    Object objOooO0oo2 = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j);
                    if (objOooO0oo2 != null) {
                        iHashCode = objOooO0oo2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j).hashCode();
                    i3 = iOooO0O0 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j).hashCode();
                    i3 = iOooO0O0 + i;
                    break;
                case 51:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21805OooOoO.OooO0O0(Double.doubleToLongBits(((Double) C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j)).doubleValue()));
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 52:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = Float.floatToIntBits(((Float) C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j)).floatValue());
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 53:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21805OooOoO.OooO0O0(OooOo(oooOo, j));
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 54:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21805OooOoO.OooO0O0(OooOo(oooOo, j));
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 55:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = OooOo0o(oooOo, j);
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 56:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21805OooOoO.OooO0O0(OooOo(oooOo, j));
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 57:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = OooOo0o(oooOo, j);
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 58:
                    if (OooOOO(oooOo, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j)).booleanValue();
                        Charset charset2 = C21805OooOoO.f64482OooO00o;
                        if (zBooleanValue) {
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = ((String) C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j)).hashCode();
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 60:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j).hashCode();
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 61:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j).hashCode();
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 62:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = OooOo0o(oooOo, j);
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 63:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = OooOo0o(oooOo, j);
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 64:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = OooOo0o(oooOo, j);
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 65:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21805OooOoO.OooO0O0(OooOo(oooOo, j));
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 66:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = OooOo0o(oooOo, j);
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 67:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21805OooOoO.OooO0O0(OooOo(oooOo, j));
                        i3 = iOooO0O0 + i;
                    }
                    break;
                case 68:
                    if (OooOOO(oooOo, i5, i4)) {
                        i = i3 * 53;
                        iOooO0O0 = C21843o00ooo.f64584OooO0OO.OooO0oo(oooOo, j).hashCode();
                        i3 = iOooO0O0 + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f64534OooOOO0.OooO0oO(oooOo).hashCode() + (i3 * 53);
        if (!this.f64526OooO0o) {
            return iHashCode2;
        }
        return this.f64533OooOOO.OooO0OO(oooOo).f64476OooO00o.hashCode() + (iHashCode2 * 53);
    }

    public final <UT, UB> UB OooO0oO(Object obj, int i, UB ub, o00Oo0<UT, UB> o00oo02, Object obj2) {
        C21805OooOoO.OooO0O0 oooO0O0OooO0oo;
        int i2 = this.f64522OooO00o[i];
        Object objOooO0oo = C21843o00ooo.f64584OooO0OO.OooO0oo(obj, Oooo0O0(i) & 1048575);
        if (objOooO0oo == null || (oooO0O0OooO0oo = OooO0oo(i)) == null) {
            return ub;
        }
        InterfaceC21817Oooo0o interfaceC21817Oooo0o = this.f64535OooOOOO;
        C21818Oooo0o0 c21818Oooo0o0ForMutableMapData = interfaceC21817Oooo0o.forMutableMapData(objOooO0oo);
        C21816Oooo0OO.OooO00o<?, ?> oooO00oForMapMetadata = interfaceC21817Oooo0o.forMapMetadata(OooO(i));
        Iterator it = c21818Oooo0o0ForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!oooO0O0OooO0oo.OooO00o()) {
                if (ub == null) {
                    ub = (UB) o00oo02.OooO0o(obj2);
                }
                int iOooO00o = C21816Oooo0OO.OooO00o(oooO00oForMapMetadata, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iOooO00o];
                Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
                AbstractC21794OooOO0o.OooO0O0 oooO0O0 = new AbstractC21794OooOO0o.OooO0O0(bArr, iOooO00o);
                try {
                    C21816Oooo0OO.OooO0O0(oooO0O0, oooO00oForMapMetadata, entry.getKey(), entry.getValue());
                    if (oooO0O0.f64448OooO0o0 - oooO0O0.f64447OooO0o != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    o00oo02.OooO0Oo(ub, i2, new OooO.OooO0o(bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final C21805OooOoO.OooO0O0 OooO0oo(int i) {
        return (C21805OooOoO.OooO0O0) this.f64523OooO0O0[((i / 3) * 2) + 1];
    }

    public final InterfaceC21836Oooooo OooOO0(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f64523OooO0O0;
        InterfaceC21836Oooooo interfaceC21836Oooooo = (InterfaceC21836Oooooo) objArr[i2];
        if (interfaceC21836Oooooo != null) {
            return interfaceC21836Oooooo;
        }
        InterfaceC21836Oooooo<T> interfaceC21836OoooooOooO00o = C21834OooooOO.f64546OooO0OO.OooO00o((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC21836OoooooOooO00o;
        return interfaceC21836OoooooOooO00o;
    }

    public final boolean OooOO0O(T t, int i) {
        int i2 = this.f64522OooO00o[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iOooo0O0 = Oooo0O0(i);
            long j2 = iOooo0O0 & 1048575;
            switch (Oooo0(iOooo0O0)) {
                case 0:
                    if (Double.doubleToRawLongBits(C21843o00ooo.f64584OooO0OO.OooO0Oo(t, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C21843o00ooo.f64584OooO0OO.OooO0o0(t, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (C21843o00ooo.f64584OooO0OO.OooO0oO(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C21843o00ooo.f64584OooO0OO.OooO0oO(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C21843o00ooo.f64584OooO0OO.OooO0o(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C21843o00ooo.f64584OooO0OO.OooO0oO(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C21843o00ooo.f64584OooO0OO.OooO0o(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C21843o00ooo.f64584OooO0OO.OooO0OO(t, j2);
                case 8:
                    Object objOooO0oo = C21843o00ooo.f64584OooO0OO.OooO0oo(t, j2);
                    if (objOooO0oo instanceof String) {
                        return !((String) objOooO0oo).isEmpty();
                    }
                    if (objOooO0oo instanceof OooO) {
                        return !OooO.f64403OooOo.equals(objOooO0oo);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C21843o00ooo.f64584OooO0OO.OooO0oo(t, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !OooO.f64403OooOo.equals(C21843o00ooo.f64584OooO0OO.OooO0oo(t, j2));
                case 11:
                    if (C21843o00ooo.f64584OooO0OO.OooO0o(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (C21843o00ooo.f64584OooO0OO.OooO0o(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C21843o00ooo.f64584OooO0OO.OooO0o(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C21843o00ooo.f64584OooO0OO.OooO0oO(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C21843o00ooo.f64584OooO0OO.OooO0o(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C21843o00ooo.f64584OooO0OO.OooO0oO(t, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C21843o00ooo.f64584OooO0OO.OooO0oo(t, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C21843o00ooo.f64584OooO0OO.OooO0o(t, j) & (1 << (i2 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooOO0o(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? OooOO0O(t, i) : (i3 & i4) != 0;
    }

    public final boolean OooOOO(T t, int i, int i2) {
        return C21843o00ooo.f64584OooO0OO.OooO0o(t, (long) (this.f64522OooO00o[i2 + 2] & 1048575)) == i;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void OooOOOO(androidx.datastore.preferences.protobuf.o00Oo0 r19, androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0 r20, java.lang.Object r21, androidx.datastore.preferences.protobuf.OooOO0O r22, androidx.datastore.preferences.protobuf.C21796OooOOOo r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C21826OoooOOO.OooOOOO(androidx.datastore.preferences.protobuf.o00Oo0, androidx.datastore.preferences.protobuf.OooOOo0, java.lang.Object, androidx.datastore.preferences.protobuf.OooOO0O, androidx.datastore.preferences.protobuf.OooOOOo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        r9.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        r0.OooO0Oo(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOOo(Object obj, int i, Object obj2, C21796OooOOOo c21796OooOOOo, OooOO0O oooOO0O) throws IOException {
        long jOooo0O0 = Oooo0O0(i) & 1048575;
        Object objOooO0oo = C21843o00ooo.f64584OooO0OO.OooO0oo(obj, jOooo0O0);
        InterfaceC21817Oooo0o interfaceC21817Oooo0o = this.f64535OooOOOO;
        if (objOooO0oo == null) {
            objOooO0oo = interfaceC21817Oooo0o.OooO00o();
            C21843o00ooo.OooOOOO(obj, jOooo0O0, objOooO0oo);
        } else if (interfaceC21817Oooo0o.isImmutable(objOooO0oo)) {
            C21818Oooo0o0 c21818Oooo0o0OooO00o = interfaceC21817Oooo0o.OooO00o();
            interfaceC21817Oooo0o.mergeFrom(c21818Oooo0o0OooO00o, objOooO0oo);
            C21843o00ooo.OooOOOO(obj, jOooo0O0, c21818Oooo0o0OooO00o);
            objOooO0oo = c21818Oooo0o0OooO00o;
        }
        C21818Oooo0o0 c21818Oooo0o0ForMutableMapData = interfaceC21817Oooo0o.forMutableMapData(objOooO0oo);
        C21816Oooo0OO.OooO00o<?, ?> oooO00oForMapMetadata = interfaceC21817Oooo0o.forMapMetadata(obj2);
        oooOO0O.OooOo0o(2);
        OooOO0 oooOO02 = oooOO0O.f64436OooO00o;
        int iOooO0o0 = oooOO02.OooO0o0(oooOO02.OooOo0O());
        oooO00oForMapMetadata.getClass();
        Object objOooO = "";
        C24328OooO0o c24328OooO0o = oooO00oForMapMetadata.f64513OooO0OO;
        Object objOooO2 = c24328OooO0o;
        while (true) {
            try {
                int iOooO00o = oooOO0O.OooO00o();
                if (iOooO00o == Integer.MAX_VALUE || oooOO02.OooO0OO()) {
                    break;
                }
                if (iOooO00o == 1) {
                    objOooO = oooOO0O.OooO(oooO00oForMapMetadata.f64511OooO00o, null, null);
                } else if (iOooO00o != 2) {
                    try {
                        if (!oooOO0O.OooOo()) {
                            throw new C21807OooOoOO("Unable to parse map entry.");
                        }
                    } catch (C21807OooOoOO.OooO00o unused) {
                        if (!oooOO0O.OooOo()) {
                            throw new C21807OooOoOO("Unable to parse map entry.");
                        }
                    }
                } else {
                    objOooO2 = oooOO0O.OooO(oooO00oForMapMetadata.f64512OooO0O0, c24328OooO0o.getClass(), c21796OooOOOo);
                }
            } catch (Throwable th) {
                oooOO02.OooO0Oo(iOooO0o0);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOo(T t, T t2, int i) {
        int[] iArr = this.f64522OooO00o;
        int i2 = iArr[i];
        if (OooOOO(t2, i2, i)) {
            long jOooo0O0 = Oooo0O0(i) & 1048575;
            Unsafe unsafe = f64520OooOOo0;
            Object object = unsafe.getObject(t2, jOooo0O0);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + t2);
            }
            InterfaceC21836Oooooo interfaceC21836OoooooOooOO0 = OooOO0(i);
            if (!OooOOO(t, i2, i)) {
                if (OooOOO0(object)) {
                    Object objNewInstance = interfaceC21836OoooooOooOO0.newInstance();
                    interfaceC21836OoooooOooOO0.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOooo0O0, objNewInstance);
                } else {
                    unsafe.putObject(t, jOooo0O0, object);
                }
                Oooo000(t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jOooo0O0);
            if (!OooOOO0(object2)) {
                Object objNewInstance2 = interfaceC21836OoooooOooOO0.newInstance();
                interfaceC21836OoooooOooOO0.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jOooo0O0, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC21836OoooooOooOO0.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOo0(T t, T t2, int i) {
        if (OooOO0O(t2, i)) {
            long jOooo0O0 = Oooo0O0(i) & 1048575;
            Unsafe unsafe = f64520OooOOo0;
            Object object = unsafe.getObject(t2, jOooo0O0);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f64522OooO00o[i] + " is present but null: " + t2);
            }
            InterfaceC21836Oooooo interfaceC21836OoooooOooOO0 = OooOO0(i);
            if (!OooOO0O(t, i)) {
                if (OooOOO0(object)) {
                    Object objNewInstance = interfaceC21836OoooooOooOO0.newInstance();
                    interfaceC21836OoooooOooOO0.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOooo0O0, objNewInstance);
                } else {
                    unsafe.putObject(t, jOooo0O0, object);
                }
                OooOooo(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jOooo0O0);
            if (!OooOOO0(object2)) {
                Object objNewInstance2 = interfaceC21836OoooooOooOO0.newInstance();
                interfaceC21836OoooooOooOO0.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jOooo0O0, objNewInstance2);
                object2 = objNewInstance2;
            }
            interfaceC21836OoooooOooOO0.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object OooOOoo(T t, int i) {
        InterfaceC21836Oooooo interfaceC21836OoooooOooOO0 = OooOO0(i);
        long jOooo0O0 = Oooo0O0(i) & 1048575;
        if (!OooOO0O(t, i)) {
            return interfaceC21836OoooooOooOO0.newInstance();
        }
        Object object = f64520OooOOo0.getObject(t, jOooo0O0);
        if (OooOOO0(object)) {
            return object;
        }
        Object objNewInstance = interfaceC21836OoooooOooOO0.newInstance();
        if (object != null) {
            interfaceC21836OoooooOooOO0.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object OooOo00(T t, int i, int i2) {
        InterfaceC21836Oooooo interfaceC21836OoooooOooOO0 = OooOO0(i2);
        if (!OooOOO(t, i, i2)) {
            return interfaceC21836OoooooOooOO0.newInstance();
        }
        Object object = f64520OooOOo0.getObject(t, Oooo0O0(i2) & 1048575);
        if (OooOOO0(object)) {
            return object;
        }
        Object objNewInstance = interfaceC21836OoooooOooOO0.newInstance();
        if (object != null) {
            interfaceC21836OoooooOooOO0.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(Object obj, long j, OooOO0O oooOO0O, InterfaceC21836Oooooo interfaceC21836Oooooo, C21796OooOOOo c21796OooOOOo) throws IOException {
        int iOooOo0;
        C21805OooOoO.OooO0OO oooO0OOOooO00o = this.f64532OooOO0o.OooO00o(j, obj);
        int i = oooOO0O.f64437OooO0O0;
        if ((i & 7) != 3) {
            throw C21807OooOoOO.OooO0O0();
        }
        do {
            Object objNewInstance = interfaceC21836Oooooo.newInstance();
            oooOO0O.OooO0O0(objNewInstance, interfaceC21836Oooooo, c21796OooOOOo);
            interfaceC21836Oooooo.makeImmutable(objNewInstance);
            oooO0OOOooO00o.add(objNewInstance);
            OooOO0 oooOO02 = oooOO0O.f64436OooO00o;
            if (oooOO02.OooO0OO() || oooOO0O.f64439OooO0Oo != 0) {
                return;
            } else {
                iOooOo0 = oooOO02.OooOo0();
            }
        } while (iOooOo0 == i);
        oooOO0O.f64439OooO0Oo = iOooOo0;
    }

    public final int OooOoO0(int i) {
        if (i >= this.f64524OooO0OO && i <= this.f64525OooO0Oo) {
            int[] iArr = this.f64522OooO00o;
            int length = (iArr.length / 3) - 1;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoOO(Object obj, int i, OooOO0O oooOO0O, InterfaceC21836Oooooo interfaceC21836Oooooo, C21796OooOOOo c21796OooOOOo) throws IOException {
        int iOooOo0;
        C21805OooOoO.OooO0OO oooO0OOOooO00o = this.f64532OooOO0o.OooO00o(i & 1048575, obj);
        int i2 = oooOO0O.f64437OooO0O0;
        if ((i2 & 7) != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        do {
            Object objNewInstance = interfaceC21836Oooooo.newInstance();
            oooOO0O.OooO0OO(objNewInstance, interfaceC21836Oooooo, c21796OooOOOo);
            interfaceC21836Oooooo.makeImmutable(objNewInstance);
            oooO0OOOooO00o.add(objNewInstance);
            OooOO0 oooOO02 = oooOO0O.f64436OooO00o;
            if (oooOO02.OooO0OO() || oooOO0O.f64439OooO0Oo != 0) {
                return;
            } else {
                iOooOo0 = oooOO02.OooOo0();
            }
        } while (iOooOo0 == i2);
        oooOO0O.f64439OooO0Oo = iOooOo0;
    }

    public final void OooOoo(int i, OooOO0O oooOO0O, Object obj) throws IOException {
        boolean z = (536870912 & i) != 0;
        Oooo000 oooo000 = this.f64532OooOO0o;
        if (z) {
            oooOO0O.OooOOoo(oooo000.OooO00o(i & 1048575, obj), true);
        } else {
            oooOO0O.OooOOoo(oooo000.OooO00o(i & 1048575, obj), false);
        }
    }

    public final void OooOoo0(int i, OooOO0O oooOO0O, Object obj) throws IOException {
        if ((536870912 & i) != 0) {
            oooOO0O.OooOo0o(2);
            C21843o00ooo.OooOOOO(obj, i & 1048575, oooOO0O.f64436OooO00o.OooOo00());
        } else if (!this.f64528OooO0oO) {
            C21843o00ooo.OooOOOO(obj, i & 1048575, oooOO0O.OooO0o0());
        } else {
            oooOO0O.OooOo0o(2);
            C21843o00ooo.OooOOOO(obj, i & 1048575, oooOO0O.f64436OooO00o.OooOOoo());
        }
    }

    public final void OooOooo(T t, int i) {
        int i2 = this.f64522OooO00o[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C21843o00ooo.OooOOO0(t, j, (1 << (i2 >>> 20)) | C21843o00ooo.f64584OooO0OO.OooO0o(t, j));
    }

    public final void Oooo000(T t, int i, int i2) {
        C21843o00ooo.OooOOO0(t, this.f64522OooO00o[i2 + 2] & 1048575, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo00O(Object obj, int i, InterfaceC21822OoooO0 interfaceC21822OoooO0) {
        f64520OooOOo0.putObject(obj, Oooo0O0(i) & 1048575, interfaceC21822OoooO0);
        OooOooo(obj, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo00o(Object obj, int i, int i2, InterfaceC21822OoooO0 interfaceC21822OoooO0) {
        f64520OooOOo0.putObject(obj, Oooo0O0(i2) & 1048575, interfaceC21822OoooO0);
        Oooo000(obj, i, i2);
    }

    public final int Oooo0O0(int i) {
        return this.f64522OooO00o[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0OO(T t, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException {
        Map.Entry entry;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        boolean z;
        boolean z2;
        C21826OoooOOO<T> c21826OoooOOO = this;
        boolean z3 = c21826OoooOOO.f64526OooO0o;
        AbstractC21798OooOOo0<?> abstractC21798OooOOo0 = c21826OoooOOO.f64533OooOOO;
        if (z3) {
            OooOo00<T> oooOo00OooO0OO = abstractC21798OooOOo0.OooO0OO(t);
            entry = !oooOo00OooO0OO.f64476OooO00o.isEmpty() ? (Map.Entry) oooOo00OooO0OO.OooO0oO().next() : null;
        }
        int[] iArr2 = c21826OoooOOO.f64522OooO00o;
        int length = iArr2.length;
        Unsafe unsafe = f64520OooOOo0;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int iOooo0O0 = c21826OoooOOO.Oooo0O0(i8);
            int i10 = iArr2[i8];
            int iOooo0 = Oooo0(iOooo0O0);
            if (iOooo0 <= 17) {
                int i11 = iArr2[i8 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(t, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                abstractC21798OooOOo0.OooO00o(entry);
                if (i10 >= 0) {
                    abstractC21798OooOOo0.OooOO0(entry);
                    throw null;
                }
            }
            int i13 = iOooo0O0 & i6;
            int i14 = i;
            long j = i13;
            switch (iOooo0) {
                case 0:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        double dOooO0Oo = C21843o00ooo.f64584OooO0OO.OooO0Oo(t, j);
                        AbstractC21794OooOO0o abstractC21794OooOO0o = ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o;
                        abstractC21794OooOO0o.getClass();
                        abstractC21794OooOO0o.OooOOoo(i10, Double.doubleToRawLongBits(dOooO0Oo));
                    }
                    break;
                case 1:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        float fOooO0o0 = C21843o00ooo.f64584OooO0OO.OooO0o0(t, j);
                        AbstractC21794OooOO0o abstractC21794OooOO0o2 = ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o;
                        abstractC21794OooOO0o2.getClass();
                        abstractC21794OooOO0o2.OooOOo0(i10, Float.floatToRawIntBits(fOooO0o0));
                    }
                    c21826OoooOOO = this;
                    break;
                case 2:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.Oooo000(i10, unsafe.getLong(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 3:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.Oooo000(i10, unsafe.getLong(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 4:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOo0(i10, unsafe.getInt(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 5:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOoo(i10, unsafe.getLong(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 6:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOo0(i10, unsafe.getInt(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 7:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOO0(i10, C21843o00ooo.f64584OooO0OO.OooO0OO(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 8:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof String) {
                            ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOoOO(i10, (String) object);
                        } else {
                            ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOOO(i10, (OooO) object);
                        }
                    }
                    c21826OoooOOO = this;
                    break;
                case 9:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOo0o(i10, (InterfaceC21822OoooO0) unsafe.getObject(t, j), c21826OoooOOO.OooOO0(i3));
                    }
                    break;
                case 10:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOOO(i10, (OooO) unsafe.getObject(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 11:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOooO(i10, unsafe.getInt(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 12:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOo0(i10, unsafe.getInt(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 13:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOo0(i10, unsafe.getInt(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 14:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOoo(i10, unsafe.getLong(t, j));
                    }
                    c21826OoooOOO = this;
                    break;
                case 15:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        int i15 = unsafe.getInt(t, j);
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOooO(i10, (i15 >> 31) ^ (i15 << 1));
                    }
                    c21826OoooOOO = this;
                    break;
                case 16:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        long j2 = unsafe.getLong(t, j);
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.Oooo000(i10, (j2 >> 63) ^ (j2 << 1));
                    }
                    c21826OoooOOO = this;
                    break;
                case 17:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    if (c21826OoooOOO.OooOO0o(t, i3, i4, i5, i14)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).OooO00o(i10, unsafe.getObject(t, j), c21826OoooOOO.OooOO0(i3));
                    }
                    break;
                case 18:
                    iArr = iArr2;
                    C21838OoooooO.OooOOOO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 19:
                    iArr = iArr2;
                    C21838OoooooO.OooOOoo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 20:
                    iArr = iArr2;
                    C21838OoooooO.OooOo0(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 21:
                    iArr = iArr2;
                    C21838OoooooO.OooOoOO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 22:
                    iArr = iArr2;
                    C21838OoooooO.OooOo00(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 23:
                    iArr = iArr2;
                    C21838OoooooO.OooOOo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 24:
                    iArr = iArr2;
                    C21838OoooooO.OooOOo0(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 25:
                    iArr = iArr2;
                    C21838OoooooO.OooOOO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 26:
                    iArr = iArr2;
                    int i16 = iArr[i8];
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls = C21838OoooooO.f64556OooO00o;
                    if (list != null && !list.isEmpty()) {
                        OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
                        oooOOO0.getClass();
                        boolean z4 = list instanceof InterfaceC21811OooOooo;
                        AbstractC21794OooOO0o abstractC21794OooOO0o3 = oooOOO0.f64452OooO00o;
                        if (z4) {
                            InterfaceC21811OooOooo interfaceC21811OooOooo = (InterfaceC21811OooOooo) list;
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                Object objO00000oO = interfaceC21811OooOooo.o00000oO();
                                if (objO00000oO instanceof String) {
                                    abstractC21794OooOO0o3.OooOoOO(i16, (String) objO00000oO);
                                } else {
                                    abstractC21794OooOO0o3.OooOOOO(i16, (OooO) objO00000oO);
                                }
                            }
                        } else {
                            for (int i18 = 0; i18 < list.size(); i18++) {
                                abstractC21794OooOO0o3.OooOoOO(i16, (String) list.get(i18));
                            }
                        }
                    }
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 27:
                    iArr = iArr2;
                    int i19 = iArr[i8];
                    List list2 = (List) unsafe.getObject(t, j);
                    InterfaceC21836Oooooo interfaceC21836OoooooOooOO0 = c21826OoooOOO.OooOO0(i8);
                    Class<?> cls2 = C21838OoooooO.f64556OooO00o;
                    if (list2 != null && !list2.isEmpty()) {
                        OooOOO0 oooOOO02 = (OooOOO0) interfaceC21846o0ooOO0;
                        oooOOO02.getClass();
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            oooOOO02.f64452OooO00o.OooOo0o(i19, (InterfaceC21822OoooO0) list2.get(i20), interfaceC21836OoooooOooOO0);
                        }
                    }
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    c21826OoooOOO = this;
                    break;
                case 28:
                    iArr = iArr2;
                    int i21 = iArr[i8];
                    List list3 = (List) unsafe.getObject(t, j);
                    Class<?> cls3 = C21838OoooooO.f64556OooO00o;
                    if (list3 != null && !list3.isEmpty()) {
                        OooOOO0 oooOOO03 = (OooOOO0) interfaceC21846o0ooOO0;
                        oooOOO03.getClass();
                        for (int i22 = 0; i22 < list3.size(); i22++) {
                            oooOOO03.f64452OooO00o.OooOOOO(i21, (OooO) list3.get(i22));
                        }
                    }
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 29:
                    iArr = iArr2;
                    z = false;
                    C21838OoooooO.OooOoO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 30:
                    iArr = iArr2;
                    z = false;
                    C21838OoooooO.OooOOOo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 31:
                    iArr = iArr2;
                    z = false;
                    C21838OoooooO.OooOo0O(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 32:
                    iArr = iArr2;
                    z = false;
                    C21838OoooooO.OooOo0o(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 33:
                    iArr = iArr2;
                    z = false;
                    C21838OoooooO.OooOo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 34:
                    iArr = iArr2;
                    z = false;
                    C21838OoooooO.OooOoO0(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, false);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 35:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOOOO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 36:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOOoo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 37:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOo0(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 38:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOoOO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 39:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOo00(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 40:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOOo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 41:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOOo0(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 42:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOOO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 43:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOoO(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 44:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOOOo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 45:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOo0O(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 46:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOo0o(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 47:
                    iArr = iArr2;
                    z2 = true;
                    C21838OoooooO.OooOo(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 48:
                    iArr = iArr2;
                    C21838OoooooO.OooOoO0(iArr[i8], (List) unsafe.getObject(t, j), interfaceC21846o0ooOO0, true);
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 49:
                    iArr = iArr2;
                    int i23 = iArr[i8];
                    List list4 = (List) unsafe.getObject(t, j);
                    InterfaceC21836Oooooo interfaceC21836OoooooOooOO02 = c21826OoooOOO.OooOO0(i8);
                    Class<?> cls4 = C21838OoooooO.f64556OooO00o;
                    if (list4 != null && !list4.isEmpty()) {
                        OooOOO0 oooOOO04 = (OooOOO0) interfaceC21846o0ooOO0;
                        oooOOO04.getClass();
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            oooOOO04.OooO00o(i23, list4.get(i24), interfaceC21836OoooooOooOO02);
                        }
                    }
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(t, j);
                    if (object2 != null) {
                        Object objOooO = c21826OoooOOO.OooO(i8);
                        InterfaceC21817Oooo0o interfaceC21817Oooo0o = c21826OoooOOO.f64535OooOOOO;
                        C21816Oooo0OO.OooO00o<?, ?> oooO00oForMapMetadata = interfaceC21817Oooo0o.forMapMetadata(objOooO);
                        C21818Oooo0o0 c21818Oooo0o0ForMapData = interfaceC21817Oooo0o.forMapData(object2);
                        AbstractC21794OooOO0o abstractC21794OooOO0o4 = ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o;
                        abstractC21794OooOO0o4.getClass();
                        for (Map.Entry entry2 : c21818Oooo0o0ForMapData.entrySet()) {
                            abstractC21794OooOO0o4.OooOoo(i10, 2);
                            abstractC21794OooOO0o4.OooOooo(C21816Oooo0OO.OooO00o(oooO00oForMapMetadata, entry2.getKey(), entry2.getValue()));
                            C21816Oooo0OO.OooO0O0(abstractC21794OooOO0o4, oooO00oForMapMetadata, entry2.getKey(), entry2.getValue());
                            iArr2 = iArr2;
                        }
                    }
                    iArr = iArr2;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    i2 = 1048575;
                    break;
                case 51:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        double dDoubleValue = ((Double) C21843o00ooo.f64584OooO0OO.OooO0oo(t, j)).doubleValue();
                        AbstractC21794OooOO0o abstractC21794OooOO0o5 = ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o;
                        abstractC21794OooOO0o5.getClass();
                        abstractC21794OooOO0o5.OooOOoo(i10, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 52:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        float fFloatValue = ((Float) C21843o00ooo.f64584OooO0OO.OooO0oo(t, j)).floatValue();
                        AbstractC21794OooOO0o abstractC21794OooOO0o6 = ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o;
                        abstractC21794OooOO0o6.getClass();
                        abstractC21794OooOO0o6.OooOOo0(i10, Float.floatToRawIntBits(fFloatValue));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 53:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.Oooo000(i10, OooOo(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 54:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.Oooo000(i10, OooOo(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 55:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOo0(i10, OooOo0o(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 56:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOoo(i10, OooOo(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 57:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOo0(i10, OooOo0o(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 58:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOO0(i10, ((Boolean) C21843o00ooo.f64584OooO0OO.OooO0oo(t, j)).booleanValue());
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 59:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        Object object3 = unsafe.getObject(t, j);
                        if (object3 instanceof String) {
                            ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOoOO(i10, (String) object3);
                        } else {
                            ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOOO(i10, (OooO) object3);
                        }
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 60:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOo0o(i10, (InterfaceC21822OoooO0) unsafe.getObject(t, j), c21826OoooOOO.OooOO0(i8));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 61:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOOO(i10, (OooO) unsafe.getObject(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 62:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOooO(i10, OooOo0o(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 63:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOo0(i10, OooOo0o(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 64:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOo0(i10, OooOo0o(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 65:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOOoo(i10, OooOo(t, j));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 66:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        int iOooOo0o = OooOo0o(t, j);
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.OooOooO(i10, (iOooOo0o >> 31) ^ (iOooOo0o << 1));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 67:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        long jOooOo = OooOo(t, j);
                        ((OooOOO0) interfaceC21846o0ooOO0).f64452OooO00o.Oooo000(i10, (jOooOo << 1) ^ (jOooOo >> 63));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                case 68:
                    if (c21826OoooOOO.OooOOO(t, i10, i8)) {
                        ((OooOOO0) interfaceC21846o0ooOO0).OooO00o(i10, unsafe.getObject(t, j), c21826OoooOOO.OooOO0(i8));
                    }
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
                default:
                    i2 = i6;
                    i3 = i8;
                    i4 = i7;
                    i5 = i9;
                    iArr = iArr2;
                    break;
            }
            i9 = i5;
            iArr2 = iArr;
            i7 = i4;
            i8 = i3 + 3;
            i6 = i2;
        }
        if (entry != null) {
            abstractC21798OooOOo0.OooOO0(entry);
            throw null;
        }
        o00Oo0<?, ?> o00oo02 = c21826OoooOOO.f64534OooOOO0;
        o00oo02.OooOOo(o00oo02.OooO0oO(t), interfaceC21846o0ooOO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.datastore.preferences.protobuf.Oooooo] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.preferences.protobuf.Oooooo] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.datastore.preferences.protobuf.Oooooo] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [androidx.datastore.preferences.protobuf.Oooooo] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f64521OooO) {
            int i7 = this.f64529OooO0oo[i6];
            int[] iArr = this.f64522OooO00o;
            int i8 = iArr[i7];
            int iOooo0O0 = Oooo0O0(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f64520OooOOo0.getInt(t, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iOooo0O0) == 0 || OooOO0o(t, i2, i, i3, i11)) {
                int iOooo0 = Oooo0(iOooo0O0);
                if (iOooo0 == 9 || iOooo0 == 17) {
                    if (OooOO0o(t, i2, i, i3, i11)) {
                        if (!OooOO0(i2).isInitialized(C21843o00ooo.f64584OooO0OO.OooO0oo(t, iOooo0O0 & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (iOooo0 != 27) {
                        if (iOooo0 == 60 || iOooo0 == 68) {
                            if (OooOOO(t, i8, i2)) {
                                if (!OooOO0(i2).isInitialized(C21843o00ooo.f64584OooO0OO.OooO0oo(t, iOooo0O0 & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (iOooo0 != 49) {
                            if (iOooo0 != 50) {
                                continue;
                            } else {
                                Object objOooO0oo = C21843o00ooo.f64584OooO0OO.OooO0oo(t, iOooo0O0 & 1048575);
                                InterfaceC21817Oooo0o interfaceC21817Oooo0o = this.f64535OooOOOO;
                                C21818Oooo0o0 c21818Oooo0o0ForMapData = interfaceC21817Oooo0o.forMapData(objOooO0oo);
                                if (!c21818Oooo0o0ForMapData.isEmpty() && interfaceC21817Oooo0o.forMapMetadata(OooO(i2)).f64512OooO0O0.f64581OooOo0o == o00oO0O.MESSAGE) {
                                    ?? OooO00o2 = 0;
                                    for (Object obj : c21818Oooo0o0ForMapData.values()) {
                                        OooO00o2 = OooO00o2;
                                        if (OooO00o2 == 0) {
                                            OooO00o2 = C21834OooooOO.f64546OooO0OO.OooO00o(obj.getClass());
                                        }
                                        if (!OooO00o2.isInitialized(obj)) {
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) C21843o00ooo.f64584OooO0OO.OooO0oo(t, iOooo0O0 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? OooOO02 = OooOO0(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (OooOO02.isInitialized(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        if (this.f64526OooO0o) {
            this.f64533OooOOO.OooO0OO(t).OooO0o0();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void makeImmutable(T t) {
        if (OooOOO0(t)) {
            if (t instanceof OooOo) {
                OooOo oooOo = (OooOo) t;
                oooOo.OooO0o0(Integer.MAX_VALUE);
                oooOo.memoizedHashCode = 0;
                oooOo.OooOO0O();
            }
            int[] iArr = this.f64522OooO00o;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iOooo0O0 = Oooo0O0(i);
                long j = 1048575 & iOooo0O0;
                int iOooo0 = Oooo0(iOooo0O0);
                if (iOooo0 != 9) {
                    if (iOooo0 != 60 && iOooo0 != 68) {
                        switch (iOooo0) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f64532OooOO0o.OooO0OO(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = f64520OooOOo0;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.f64535OooOOOO.toImmutable(object));
                                }
                                break;
                        }
                    } else if (OooOOO(t, iArr[i], i)) {
                        OooOO0(i).makeImmutable(f64520OooOOo0.getObject(t, j));
                    }
                } else if (OooOO0O(t, i)) {
                    OooOO0(i).makeImmutable(f64520OooOOo0.getObject(t, j));
                }
            }
            this.f64534OooOOO0.OooOO0(t);
            if (this.f64526OooO0o) {
                this.f64533OooOOO.OooO0o(t);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mergeFrom(T t, T t2) {
        T t3;
        if (!OooOOO0(t)) {
            throw new IllegalArgumentException(o000oOoO.OooO00o(t, "Mutating immutable message: "));
        }
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f64522OooO00o;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = C21838OoooooO.f64556OooO00o;
                o00Oo0<?, ?> o00oo02 = this.f64534OooOOO0;
                o00oo02.OooOOOO(t4, o00oo02.OooOO0O(o00oo02.OooO0oO(t4), o00oo02.OooO0oO(t2)));
                if (this.f64526OooO0o) {
                    C21838OoooooO.OooOO0O(this.f64533OooOOO, t4, t2);
                    return;
                }
                return;
            }
            int iOooo0O0 = Oooo0O0(i);
            long j = 1048575 & iOooo0O0;
            int i2 = iArr[i];
            switch (Oooo0(iOooo0O0)) {
                case 0:
                    if (!OooOO0O(t2, i)) {
                        t3 = t;
                    } else {
                        C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o0 = C21843o00ooo.f64584OooO0OO;
                        t3 = t;
                        abstractC21845OooO0o0.OooOO0o(t3, j, abstractC21845OooO0o0.OooO0Oo(t2, j));
                        OooOooo(t3, i);
                    }
                    break;
                case 1:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o02 = C21843o00ooo.f64584OooO0OO;
                        abstractC21845OooO0o02.OooOOO0(t, j, abstractC21845OooO0o02.OooO0o0(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oO(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oO(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO0(t, j, C21843o00ooo.f64584OooO0OO.OooO0o(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oO(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO0(t, j, C21843o00ooo.f64584OooO0OO.OooO0o(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o03 = C21843o00ooo.f64584OooO0OO;
                        abstractC21845OooO0o03.OooOO0(t, j, abstractC21845OooO0o03.OooO0OO(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oo(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 9:
                    OooOOo0(t, t2, i);
                    t3 = t;
                    break;
                case 10:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oo(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 11:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO0(t, j, C21843o00ooo.f64584OooO0OO.OooO0o(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 12:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO0(t, j, C21843o00ooo.f64584OooO0OO.OooO0o(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 13:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO0(t, j, C21843o00ooo.f64584OooO0OO.OooO0o(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oO(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 15:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO0(t, j, C21843o00ooo.f64584OooO0OO.OooO0o(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 16:
                    if (OooOO0O(t2, i)) {
                        C21843o00ooo.OooOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oO(t2, j));
                        OooOooo(t, i);
                    }
                    t3 = t;
                    break;
                case 17:
                    OooOOo0(t, t2, i);
                    t3 = t;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f64532OooOO0o.OooO0O0(t, t2, j);
                    t3 = t;
                    break;
                case 50:
                    Class<?> cls2 = C21838OoooooO.f64556OooO00o;
                    C21843o00ooo.AbstractC21845OooO0o0 abstractC21845OooO0o04 = C21843o00ooo.f64584OooO0OO;
                    C21843o00ooo.OooOOOO(t, j, this.f64535OooOOOO.mergeFrom(abstractC21845OooO0o04.OooO0oo(t, j), abstractC21845OooO0o04.OooO0oo(t2, j)));
                    t3 = t;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (OooOOO(t2, i2, i)) {
                        C21843o00ooo.OooOOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oo(t2, j));
                        Oooo000(t, i2, i);
                    }
                    t3 = t;
                    break;
                case 60:
                    OooOOo(t, t2, i);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (OooOOO(t2, i2, i)) {
                        C21843o00ooo.OooOOOO(t, j, C21843o00ooo.f64584OooO0OO.OooO0oo(t2, j));
                        Oooo000(t, i2, i);
                    }
                    t3 = t;
                    break;
                case 68:
                    OooOOo(t, t2, i);
                    t3 = t;
                    break;
            }
            i += 3;
            t = t3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21836Oooooo
    public final T newInstance() {
        return (T) this.f64531OooOO0O.OooO00o(this.f64527OooO0o0);
    }
}
