package OooooOO;

import OoooOoO.InterfaceC21233OooO0o;
import OooooO0.C21288OooO0Oo;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24039Oooo0o0;
import o0Ooo0oO.C29437OooOO0O;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;
import oO0o0OO.C33620OooOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33653Ooooo00;
import oO0o0OO.C33668o0000oo;
import oO0o0OO.o0000;
import oO0o0OO.o0000O00;

/* JADX INFO: renamed from: OooooOO.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21355Ooooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61776OooO00o = 0;

    public static final Object OooO(long j, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (j <= 0) {
            throw new o0000("Timed out immediately", null);
        }
        Object objOooO0oO = OooO0oO(new o0000O00(j, abstractC32479OooO0OO), interfaceC32508OooOOOo);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooO0oO;
    }

    public static float[] OooO00o() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static String OooO0O0(androidx.datastore.preferences.protobuf.OooO oooO) {
        StringBuilder sb = new StringBuilder(oooO.size());
        for (int i = 0; i < oooO.size(); i++) {
            byte bOooO0O0 = oooO.OooO0O0(i);
            if (bOooO0O0 == 34) {
                sb.append("\\\"");
            } else if (bOooO0O0 == 39) {
                sb.append("\\'");
            } else if (bOooO0O0 != 92) {
                switch (bOooO0O0) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bOooO0O0 < 32 || bOooO0O0 > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((bOooO0O0 >>> 6) & 3) + 48));
                            sb.append((char) (((bOooO0O0 >>> 3) & 7) + 48));
                            sb.append((char) ((bOooO0O0 & 7) + 48));
                        } else {
                            sb.append((char) bOooO0O0);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final long OooO0OO(float[] fArr, long j) {
        float fOooO0OO = C21290OooO0o0.OooO0OO(j);
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j);
        float f = 1 / (((fArr[7] * fOooO0Oo) + (fArr[3] * fOooO0OO)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return C21289OooO0o.OooO00o(((fArr[4] * fOooO0Oo) + (fArr[0] * fOooO0OO) + fArr[12]) * f, ((fArr[5] * fOooO0Oo) + (fArr[1] * fOooO0OO) + fArr[13]) * f);
    }

    public static final void OooO0Oo(float[] fArr, C21288OooO0Oo c21288OooO0Oo) {
        long jOooO0OO = OooO0OO(fArr, C21289OooO0o.OooO00o(c21288OooO0Oo.f61714OooO00o, c21288OooO0Oo.f61715OooO0O0));
        long jOooO0OO2 = OooO0OO(fArr, C21289OooO0o.OooO00o(c21288OooO0Oo.f61714OooO00o, c21288OooO0Oo.f61717OooO0Oo));
        long jOooO0OO3 = OooO0OO(fArr, C21289OooO0o.OooO00o(c21288OooO0Oo.f61716OooO0OO, c21288OooO0Oo.f61715OooO0O0));
        long jOooO0OO4 = OooO0OO(fArr, C21289OooO0o.OooO00o(c21288OooO0Oo.f61716OooO0OO, c21288OooO0Oo.f61717OooO0Oo));
        c21288OooO0Oo.f61714OooO00o = Math.min(Math.min(C21290OooO0o0.OooO0OO(jOooO0OO), C21290OooO0o0.OooO0OO(jOooO0OO2)), Math.min(C21290OooO0o0.OooO0OO(jOooO0OO3), C21290OooO0o0.OooO0OO(jOooO0OO4)));
        c21288OooO0Oo.f61715OooO0O0 = Math.min(Math.min(C21290OooO0o0.OooO0Oo(jOooO0OO), C21290OooO0o0.OooO0Oo(jOooO0OO2)), Math.min(C21290OooO0o0.OooO0Oo(jOooO0OO3), C21290OooO0o0.OooO0Oo(jOooO0OO4)));
        c21288OooO0Oo.f61716OooO0OO = Math.max(Math.max(C21290OooO0o0.OooO0OO(jOooO0OO), C21290OooO0o0.OooO0OO(jOooO0OO2)), Math.max(C21290OooO0o0.OooO0OO(jOooO0OO3), C21290OooO0o0.OooO0OO(jOooO0OO4)));
        c21288OooO0Oo.f61717OooO0Oo = Math.max(Math.max(C21290OooO0o0.OooO0Oo(jOooO0OO), C21290OooO0o0.OooO0Oo(jOooO0OO2)), Math.max(C21290OooO0o0.OooO0Oo(jOooO0OO3), C21290OooO0o0.OooO0Oo(jOooO0OO4)));
    }

    public static final void OooO0o(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    public static final InterfaceC21233OooO0o OooO0o0(InterfaceC21233OooO0o interfaceC21233OooO0o, InterfaceC32507OooOO0o onGloballyPositioned) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21233OooO0o, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(onGloballyPositioned, "onGloballyPositioned");
        return interfaceC21233OooO0o.o00ooo(new oo000o.Oooo000(onGloballyPositioned, C31604o0ooOoO.f112933OooO00o));
    }

    public static final Object OooO0oO(o0000O00 o0000o00, InterfaceC32508OooOOOo interfaceC32508OooOOOo) throws Throwable {
        Object c33620OooOo;
        Object objOoooO0;
        oO00o00.OooO0OO.OooO0o0(o0000o00, new C33653Ooooo00(C33644OoooO0.OooO0O0(o0000o00.f121948OooOoO.getContext()).OooOooo(o0000o00.f121363OooOoOO, o0000o00, o0000o00.f121272OooOoO0)));
        try {
            if (interfaceC32508OooOOOo == null) {
                c33620OooOo = C21904OooOoo0.OooO0oo(interfaceC32508OooOOOo, o0000o00, o0000o00);
            } else {
                C24039Oooo0o0.OooO0o0(2, interfaceC32508OooOOOo);
                c33620OooOo = interfaceC32508OooOOOo.invoke(o0000o00, o0000o00);
            }
        } catch (Throwable th) {
            c33620OooOo = new C33620OooOo(false, th);
        }
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (c33620OooOo == enumC32485OooO00o || (objOoooO0 = o0000o00.OoooO0(c33620OooOo)) == oO0o0OO.o0Oo0oo.f121383OooO0O0) {
            return enumC32485OooO00o;
        }
        if (objOoooO0 instanceof C33620OooOo) {
            Throwable th2 = ((C33620OooOo) objOoooO0).f121304OooO00o;
            if (!(th2 instanceof o0000) || ((o0000) th2).f121351OooOo0o != o0000o00) {
                throw th2;
            }
            if (c33620OooOo instanceof C33620OooOo) {
                throw ((C33620OooOo) c33620OooOo).f121304OooO00o;
            }
        } else {
            c33620OooOo = oO0o0OO.o0Oo0oo.OooO00o(objOoooO0);
        }
        return c33620OooOo;
    }

    public static void OooO0oo(float f, float f2, float[] fArr) {
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public static final Object OooOO0(long j, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        int i = C33549OooO00o.f121147OooOoO;
        long jOooO0Oo = 0;
        boolean z = j > 0;
        if (z) {
            jOooO0Oo = C33549OooO00o.OooO0Oo(C33549OooO00o.OooO0oO(j, C29437OooOO0O.OooO0oO(999999L, EnumC33551OooO0OO.f121151OooOo)));
        } else if (z) {
            throw new C32442OooOO0o();
        }
        return OooO(jOooO0Oo, interfaceC32508OooOOOo, abstractC32479OooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, oO0o0OO.o0000O00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOO0O(long j, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33668o0000oo c33668o0000oo;
        C24034Oooo00O c24034Oooo00O;
        if (abstractC32479OooO0OO instanceof C33668o0000oo) {
            c33668o0000oo = (C33668o0000oo) abstractC32479OooO0OO;
            int i = c33668o0000oo.f121369OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33668o0000oo.f121369OooOoO = i - Integer.MIN_VALUE;
            } else {
                c33668o0000oo = new C33668o0000oo(abstractC32479OooO0OO);
            }
        }
        Object obj = c33668o0000oo.f121370OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33668o0000oo.f121369OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (j <= 0) {
                return null;
            }
            C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
            try {
                c33668o0000oo.f121368OooOo0o = interfaceC32508OooOOOo;
                c33668o0000oo.f121367OooOo = c24034Oooo00O2;
                c33668o0000oo.f121369OooOoO = 1;
                ?? o0000o00 = new o0000O00(j, c33668o0000oo);
                c24034Oooo00O2.f80942OooOo0o = o0000o00;
                Object objOooO0oO = OooO0oO(o0000o00, interfaceC32508OooOOOo);
                return objOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
            } catch (o0000 e) {
                e = e;
                c24034Oooo00O = c24034Oooo00O2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24034Oooo00O = c33668o0000oo.f121367OooOo;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            } catch (o0000 e2) {
                e = e2;
            }
        }
        if (e.f121351OooOo0o == c24034Oooo00O.f80942OooOo0o) {
            return null;
        }
        throw e;
    }
}
