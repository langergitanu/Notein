package oO00O0o;

import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.Oooo000;
import java.util.List;
import java.util.Set;
import oO00O0o0.C32190OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0oO00.o0ooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;
import oOo00OO0.C34477OooO00o;
import oOo00OO0.C34478OooO0O0;
import oOo00OO0.C34479OooO0OO;
import oOo00OO0.C34480OooO0Oo;
import oOo00OO0.C34483OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<Character> f115500OooO00o = oOo000Oo.OooOOO.OoooOo0(new Character[]{Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), '?', '#', '@'});

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34479OooO0OO<String> f115501OooO0O0 = C34479OooO0OO.OooO00o.OooO00o(C34429OooOOo0.OooOO0o("HTTP/1.0", "HTTP/1.1"), C34477OooO00o.f123541OooOo0o, C34478OooO0O0.f123542OooOo0o);

    public static final void OooO00o(C34480OooO0Oo c34480OooO0Oo, char c) {
        throw new OooOOOO("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) c34480OooO0Oo));
    }

    public static final int OooO0O0(C34480OooO0Oo c34480OooO0Oo, C34483OooO0oo c34483OooO0oo) {
        int i = c34483OooO0oo.f123571OooO0O0;
        for (int i2 = c34483OooO0oo.f123570OooO00o; i2 < i; i2++) {
            char cCharAt = c34480OooO0Oo.charAt(i2);
            if (cCharAt == ':' && i2 != c34483OooO0oo.f123570OooO00o) {
                c34483OooO0oo.f123570OooO00o = i2 + 1;
                return i2;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO(cCharAt, 32) <= 0 || C33599OooOo0O.OooOoo0("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                int i3 = c34483OooO0oo.f123570OooO00o;
                if (cCharAt == ':') {
                    throw new OooOOOO("Empty header names are not allowed as per RFC7230.");
                }
                if (i2 == i3) {
                    throw new OooOOOO("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
                }
                OooO00o(c34480OooO0Oo, cCharAt);
                throw null;
            }
        }
        throw new OooOOOO("No colon in HTTP header in " + c34480OooO0Oo.subSequence(c34483OooO0oo.f123570OooO00o, c34483OooO0oo.f123571OooO0O0).toString() + " in builder: \n" + ((Object) c34480OooO0Oo));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cd, code lost:
    
        OooO00o(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:23:0x0068, B:25:0x0071, B:29:0x0079, B:32:0x0084, B:35:0x0094, B:38:0x00a0, B:40:0x00a4, B:58:0x00d9, B:43:0x00ae, B:54:0x00c6, B:55:0x00cd, B:56:0x00d0, B:57:0x00d1, B:59:0x00ee, B:60:0x00f5, B:61:0x00f6, B:63:0x0100), top: B:70:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:23:0x0068, B:25:0x0071, B:29:0x0079, B:32:0x0084, B:35:0x0094, B:38:0x00a0, B:40:0x00a4, B:58:0x00d9, B:43:0x00ae, B:54:0x00c6, B:55:0x00cd, B:56:0x00d0, B:57:0x00d1, B:59:0x00ee, B:60:0x00f5, B:61:0x00f6, B:63:0x0100), top: B:70:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0064 -> B:70:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, C34480OooO0Oo c34480OooO0Oo, C34483OooO0oo c34483OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOO0O oooOO0O;
        C34480OooO0Oo c34480OooO0Oo2;
        OooO oooO;
        OooOO0O oooOO0O2;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        C34483OooO0oo c34483OooO0oo2;
        Throwable th;
        Object objOooO;
        int iOooO0O0;
        int iOooO0O02;
        int i;
        int i2;
        int i3 = 1;
        if (abstractC32479OooO0OO instanceof OooOO0O) {
            oooOO0O = (OooOO0O) abstractC32479OooO0OO;
            int i4 = oooOO0O.f115493OooOoo0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oooOO0O.f115493OooOoo0 = i4 - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(abstractC32479OooO0OO);
            }
        }
        Object obj = oooOO0O.f115492OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = oooOO0O.f115493OooOoo0;
        int i6 = 8192;
        if (i5 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c34480OooO0Oo2 = c34480OooO0Oo;
            oooO = new OooO(c34480OooO0Oo2);
            oooOO0O2 = oooOO0O;
            interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o;
            c34483OooO0oo2 = c34483OooO0oo;
            oooOO0O2.f115489OooOo0o = interfaceC23986Ooooo0o2;
            oooOO0O2.f115488OooOo = c34480OooO0Oo2;
            oooOO0O2.f115491OooOoO0 = c34483OooO0oo2;
            oooOO0O2.f115490OooOoO = oooO;
            oooOO0O2.f115493OooOoo0 = i3;
            objOooO = interfaceC23986Ooooo0o2.OooO(c34480OooO0Oo2, i6, oooOO0O2);
            if (objOooO != enumC32485OooO00o) {
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OooO oooO2 = oooOO0O.f115490OooOoO;
            C34483OooO0oo c34483OooO0oo3 = oooOO0O.f115491OooOoO0;
            C34480OooO0Oo c34480OooO0Oo3 = oooOO0O.f115488OooOo;
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0o3 = oooOO0O.f115489OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                oooOO0O2 = oooOO0O;
                c34483OooO0oo2 = c34483OooO0oo3;
                OooO oooO3 = oooO2;
                c34480OooO0Oo2 = c34480OooO0Oo3;
                try {
                    if (((Boolean) obj).booleanValue()) {
                        oooO3.OooO0Oo();
                        return null;
                    }
                    int i7 = c34480OooO0Oo2.f123553OooOoo;
                    c34483OooO0oo2.f123571OooO0O0 = i7;
                    int i8 = c34483OooO0oo2.f123570OooO00o;
                    int i9 = i7 - i8;
                    if (i9 == 0) {
                        List<String> list = C32190OooOOo0.f115537OooO00o;
                        C34480OooO0Oo.OooO00o OooO00o2 = oooO3.OooO00o("Host");
                        if (OooO00o2 != null) {
                            OooO0oO(OooO00o2);
                        }
                        return oooO3;
                    }
                    if (i9 >= i6) {
                        throw new IllegalStateException("Header line length limit exceeded");
                    }
                    try {
                        iOooO0O0 = OooO0O0(c34480OooO0Oo2, c34483OooO0oo2);
                        iOooO0O02 = oOo00OO0.OooO0o.OooO0O0(c34480OooO0Oo2, i8, iOooO0O0);
                        i = c34483OooO0oo2.f123571OooO0O0;
                        int i10 = c34483OooO0oo2.f123570OooO00o;
                        while (i10 < i) {
                            char cCharAt = c34480OooO0Oo2.charAt(i10);
                            if (!Oooo000.OooO0o0(cCharAt) && cCharAt != '\t') {
                                break;
                            }
                            i10 += i3;
                        }
                        if (i10 >= i) {
                            c34483OooO0oo2.f123570OooO00o = i;
                            i2 = i3;
                        } else {
                            int i11 = i10;
                            int i12 = i11;
                            while (i11 < i) {
                                int i13 = i3;
                                char cCharAt2 = c34480OooO0Oo2.charAt(i11);
                                if (cCharAt2 != '\t' && cCharAt2 != ' ') {
                                    if (cCharAt2 == '\r' || cCharAt2 == '\n') {
                                        break;
                                    }
                                    i12 = i11;
                                }
                                i11++;
                                i3 = i13;
                            }
                            i2 = i3;
                            c34483OooO0oo2.f123570OooO00o = i10;
                            c34483OooO0oo2.f123571OooO0O0 = i12 + 1;
                        }
                        oooOO0O2.f115489OooOo0o = interfaceC23986Ooooo0o2;
                        oooOO0O2.f115488OooOo = c34480OooO0Oo2;
                        oooOO0O2.f115491OooOoO0 = c34483OooO0oo2;
                        oooOO0O2.f115490OooOoO = oooO;
                        oooOO0O2.f115493OooOoo0 = i3;
                        objOooO = interfaceC23986Ooooo0o2.OooO(c34480OooO0Oo2, i6, oooOO0O2);
                        if (objOooO != enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o2;
                        obj = objOooO;
                        oooO3 = oooO;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        oooO2 = oooO;
                        oooO2.OooO0Oo();
                        throw th;
                    }
                    int i14 = c34483OooO0oo2.f123570OooO00o;
                    int i15 = c34483OooO0oo2.f123571OooO0O0;
                    int iOooO0O03 = oOo00OO0.OooO0o.OooO0O0(c34480OooO0Oo2, i14, i15);
                    c34483OooO0oo2.f123570OooO00o = i;
                    oooO3.OooO0OO(iOooO0O02, iOooO0O03, i8, iOooO0O0, i14, i15);
                    interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o3;
                    oooO = oooO3;
                    i3 = i2;
                    i6 = 8192;
                } catch (Throwable th3) {
                    th = th3;
                    oooO2 = oooO3;
                    oooO2.OooO0Oo();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                oooO2.OooO0Oo();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:20:0x0057, B:29:0x0088, B:32:0x0091), top: B:51:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[Catch: all -> 0x00cd, TryCatch #2 {all -> 0x00cd, blocks: (B:36:0x00c2, B:38:0x00c6, B:42:0x00d1), top: B:53:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32180OooOO0o c32180OooOO0o;
        Throwable th;
        C34480OooO0Oo c34480OooO0Oo;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        C34483OooO0oo c34483OooO0oo;
        C34480OooO0Oo c34480OooO0Oo2;
        CharSequence charSequence;
        C34480OooO0Oo c34480OooO0Oo3;
        int i;
        CharSequence charSequence2;
        OooO oooO;
        if (abstractC32479OooO0OO instanceof C32180OooOO0o) {
            c32180OooOO0o = (C32180OooOO0o) abstractC32479OooO0OO;
            int i2 = c32180OooOO0o.f115499OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c32180OooOO0o.f115499OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c32180OooOO0o = new C32180OooOO0o(abstractC32479OooO0OO);
            }
        }
        Object obj = c32180OooOO0o.f115498OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c32180OooOO0o.f115499OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34480OooO0Oo c34480OooO0Oo4 = new C34480OooO0Oo(null);
            C34483OooO0oo c34483OooO0oo2 = new C34483OooO0oo();
            c34483OooO0oo2.f123570OooO00o = 0;
            c34483OooO0oo2.f123571OooO0O0 = 0;
            try {
                c32180OooOO0o.f115495OooOo0o = interfaceC23986Ooooo0o;
                c32180OooOO0o.f115494OooOo = c34480OooO0Oo4;
                c32180OooOO0o.f115497OooOoO0 = c34483OooO0oo2;
                c32180OooOO0o.f115499OooOoo0 = 1;
                Object objOooO = interfaceC23986Ooooo0o.OooO(c34480OooO0Oo4, 8192, c32180OooOO0o);
                if (objOooO != enumC32485OooO00o) {
                    interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o;
                    c34483OooO0oo = c34483OooO0oo2;
                    c34480OooO0Oo2 = c34480OooO0Oo4;
                    obj = objOooO;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th2) {
                th = th2;
                c34480OooO0Oo = c34480OooO0Oo4;
            }
        } else if (i3 == 1) {
            c34483OooO0oo = (C34483OooO0oo) c32180OooOO0o.f115497OooOoO0;
            c34480OooO0Oo2 = (C34480OooO0Oo) c32180OooOO0o.f115494OooOo;
            interfaceC23986Ooooo0o2 = (InterfaceC23986Ooooo0o) c32180OooOO0o.f115495OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                c34483OooO0oo.f123571OooO0O0 = c34480OooO0Oo2.f123553OooOoo;
                String strOooO0o = OooO0o(c34480OooO0Oo2, c34483OooO0oo);
                int iOooO0o0 = OooO0o0(c34480OooO0Oo2, c34483OooO0oo);
                o0ooOOo.OooO0OO(c34480OooO0Oo2, c34483OooO0oo);
                CharSequence charSequenceSubSequence = c34480OooO0Oo2.subSequence(c34483OooO0oo.f123570OooO00o, c34483OooO0oo.f123571OooO0O0);
                c34483OooO0oo.f123570OooO00o = c34483OooO0oo.f123571OooO0O0;
                c32180OooOO0o.f115495OooOo0o = c34480OooO0Oo2;
                c32180OooOO0o.f115494OooOo = strOooO0o;
                c32180OooOO0o.f115497OooOoO0 = charSequenceSubSequence;
                c32180OooOO0o.f115496OooOoO = iOooO0o0;
                c32180OooOO0o.f115499OooOoo0 = 2;
                Object objOooO0OO = OooO0OO(interfaceC23986Ooooo0o2, c34480OooO0Oo2, c34483OooO0oo, c32180OooOO0o);
                if (objOooO0OO != enumC32485OooO00o) {
                    charSequence = strOooO0o;
                    c34480OooO0Oo3 = c34480OooO0Oo2;
                    i = iOooO0o0;
                    charSequence2 = charSequenceSubSequence;
                    obj = objOooO0OO;
                    oooO = (OooO) obj;
                    if (oooO == null) {
                    }
                    return new C32182OooOOo0(charSequence, i, charSequence2, oooO, c34480OooO0Oo3);
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                th = th3;
                c34480OooO0Oo = c34480OooO0Oo2;
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c32180OooOO0o.f115496OooOoO;
            CharSequence charSequence3 = (CharSequence) c32180OooOO0o.f115497OooOoO0;
            CharSequence charSequence4 = c32180OooOO0o.f115494OooOo;
            c34480OooO0Oo = (C34480OooO0Oo) c32180OooOO0o.f115495OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                i = i4;
                charSequence2 = charSequence3;
                charSequence = charSequence4;
                c34480OooO0Oo3 = c34480OooO0Oo;
                try {
                    oooO = (OooO) obj;
                    if (oooO == null) {
                        oooO = new OooO(c34480OooO0Oo3);
                    }
                    return new C32182OooOOo0(charSequence, i, charSequence2, oooO, c34480OooO0Oo3);
                } catch (Throwable th4) {
                    th = th4;
                    c34480OooO0Oo = c34480OooO0Oo3;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        c34480OooO0Oo.OooO0o0();
        throw th;
    }

    public static final String OooO0o(C34480OooO0Oo c34480OooO0Oo, C34483OooO0oo c34483OooO0oo) {
        o0ooOOo.OooO0OO(c34480OooO0Oo, c34483OooO0oo);
        int i = c34483OooO0oo.f123570OooO00o;
        int i2 = c34483OooO0oo.f123571OooO0O0;
        if (i >= i2) {
            throw new IllegalStateException(("Failed to parse version: " + ((Object) c34480OooO0Oo)).toString());
        }
        String str = (String) OooOo.o0OoOo0(C34479OooO0OO.OooO0O0(f115501OooO0O0, c34480OooO0Oo, i, i2, OooOOO0.f115502OooOo0o, 8));
        if (str != null) {
            c34483OooO0oo.f123570OooO00o = str.length() + c34483OooO0oo.f123570OooO00o;
            return str;
        }
        int iOooO00o = o0ooOOo.OooO00o(c34480OooO0Oo, c34483OooO0oo);
        CharSequence charSequenceSubSequence = c34480OooO0Oo.subSequence(c34483OooO0oo.f123570OooO00o, iOooO00o);
        c34483OooO0oo.f123570OooO00o = iOooO00o;
        throw new OooOOOO("Unsupported HTTP version: " + ((Object) charSequenceSubSequence));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        r6.f123570OooO00o = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int OooO0o0(C34480OooO0Oo c34480OooO0Oo, C34483OooO0oo c34483OooO0oo) {
        char cCharAt;
        o0ooOOo.OooO0OO(c34480OooO0Oo, c34483OooO0oo);
        int i = c34483OooO0oo.f123571OooO0O0;
        int i2 = c34483OooO0oo.f123570OooO00o;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            cCharAt = c34480OooO0Oo.charAt(i2);
            if (cCharAt == ' ') {
                if (i3 < 100 || i3 > 999) {
                    throw new OooOOOO("Status-code must be 3-digit. Status received: " + i3 + FilenameUtils.EXTENSION_SEPARATOR);
                }
                i = i2;
            } else {
                if ('0' > cCharAt || cCharAt >= ':') {
                    break;
                }
                i3 = (i3 * 10) + (cCharAt - '0');
                i2++;
            }
        }
        throw new NumberFormatException("Illegal digit " + cCharAt + " in status code " + c34480OooO0Oo.subSequence(c34483OooO0oo.f123570OooO00o, o0ooOOo.OooO00o(c34480OooO0Oo, c34483OooO0oo)).toString());
    }

    public static final void OooO0oO(C34480OooO0Oo.OooO00o oooO00o) {
        if (C33599OooOo0O.OooOooO(oooO00o, C18241k5.f55433h)) {
            throw new OooOOOO("Host header with ':' should contains port: " + ((Object) oooO00o));
        }
        for (int i = 0; i < oooO00o.length(); i++) {
            Character chValueOf = Character.valueOf(oooO00o.charAt(i));
            Set<Character> set = f115500OooO00o;
            if (set.contains(chValueOf)) {
                throw new OooOOOO("Host cannot contain any of the following symbols: " + set);
            }
        }
    }
}
