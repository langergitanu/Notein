package o000oo0;

import Oooo0oO.C21023OooO0Oo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o000O0oO.C24412OooO0oO;
import o000oo0O.C24703OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32463OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o000oo0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24695OoooO00 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String[] f83672OooOO0o = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C24666OooOOO f83673OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC24673OooOo0O f83674OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f83675OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f83676OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f83677OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C24662OooO0oo f83679OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String[] f83680OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C24665OooOO0o f83681OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final AtomicBoolean f83682OooOO0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public oO0O000o.OooO00o<Boolean> f83683OooOO0O = new C24692Oooo0oo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashMap f83678OooO0o = new LinkedHashMap();

    /* JADX INFO: renamed from: o000oo0.OoooO00$OooO00o */
    public static final class OooO00o {
    }

    public C24695OoooO00(AbstractC24673OooOo0O abstractC24673OooOo0O, HashMap map, HashMap map2, String[] strArr, boolean z, C24662OooO0oo c24662OooO0oo) {
        String lowerCase;
        this.f83674OooO00o = abstractC24673OooOo0O;
        this.f83675OooO0O0 = map;
        this.f83676OooO0OO = map2;
        this.f83677OooO0Oo = z;
        this.f83679OooO0o0 = c24662OooO0oo;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
            this.f83678OooO0o.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f83675OooO0O0.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f83680OooO0oO = strArr2;
        for (Map.Entry entry : this.f83675OooO0O0.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase3, "toLowerCase(...)");
            if (this.f83678OooO0o.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f83678OooO0o;
                linkedHashMap.put(lowerCase4, C34444Oooo0O0.OooO0oO(lowerCase3, linkedHashMap));
            }
        }
        this.f83681OooO0oo = new C24665OooOO0o(this.f83680OooO0oO.length);
        this.f83673OooO = new C24666OooOOO(this.f83680OooO0oO.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C24695OoooO00 c24695OoooO00, OooOOOO oooOOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24694OoooO0 c24694OoooO0;
        c24695OoooO00.getClass();
        if (abstractC32479OooO0OO instanceof C24694OoooO0) {
            c24694OoooO0 = (C24694OoooO0) abstractC32479OooO0OO;
            int i = c24694OoooO0.f83670OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24694OoooO0.f83670OooOoO = i - Integer.MIN_VALUE;
            } else {
                c24694OoooO0 = new C24694OoooO0(c24695OoooO00, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c24694OoooO0.f83668OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24694OoooO0.f83670OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C24691Oooo0oO c24691Oooo0oO = new C24691Oooo0oO(0);
            c24694OoooO0.f83669OooOo0o = oooOOOO;
            c24694OoooO0.f83670OooOoO = 1;
            objOooO0O0 = oooOOOO.OooO0O0("SELECT * FROM room_table_modification_log WHERE invalidated = 1", c24691Oooo0oO, c24694OoooO0);
            if (objOooO0O0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) c24694OoooO0.f83669OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            return set;
        }
        oooOOOO = (OooOOOO) c24694OoooO0.f83669OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0O0);
        Set set2 = (Set) objOooO0O0;
        if (!set2.isEmpty()) {
            c24694OoooO0.f83669OooOo0o = set2;
            c24694OoooO0.f83670OooOoO = 2;
            if (C24689Oooo0o.OooO00o(oooOOOO, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c24694OoooO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C24695OoooO00 c24695OoooO00, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24693OoooO c24693OoooO;
        C24703OooO00o c24703OooO00o;
        Throwable th;
        C24703OooO00o c24703OooO00o2;
        c24695OoooO00.getClass();
        if (abstractC32479OooO0OO instanceof C24693OoooO) {
            c24693OoooO = (C24693OoooO) abstractC32479OooO0OO;
            int i = c24693OoooO.f83667OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24693OoooO.f83667OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c24693OoooO = new C24693OoooO(c24695OoooO00, abstractC32479OooO0OO);
            }
        }
        Object objOooOo00 = c24693OoooO.f83666OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24693OoooO.f83667OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo00);
            AbstractC24673OooOo0O abstractC24673OooOo0O = c24695OoooO00.f83674OooO00o;
            c24703OooO00o = abstractC24673OooOo0O.f83584OooO0oO;
            boolean zOooO00o = c24703OooO00o.OooO00o();
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            if (!zOooO00o) {
                return c34438OooOoo0;
            }
            try {
                if (!c24695OoooO00.f83682OooOO0.compareAndSet(true, false)) {
                    c24703OooO00o.OooO0O0();
                    return c34438OooOoo0;
                }
                if (!c24695OoooO00.f83683OooOO0O.invoke().booleanValue()) {
                    c24703OooO00o.OooO0O0();
                    return c34438OooOoo0;
                }
                C24697OoooOO0 c24697OoooOO0 = new C24697OoooOO0(c24695OoooO00, null);
                c24693OoooO.f83664OooOo0o = c24695OoooO00;
                c24693OoooO.f83663OooOo = c24703OooO00o;
                c24693OoooO.f83667OooOoOO = 1;
                objOooOo00 = abstractC24673OooOo0O.OooOo00(false, c24697OoooOO0, c24693OoooO);
                if (objOooOo00 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } catch (Throwable th2) {
                th = th2;
                c24703OooO00o2 = c24703OooO00o;
                c24703OooO00o2.OooO0O0();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24703OooO00o2 = c24693OoooO.f83663OooOo;
            C24695OoooO00 c24695OoooO002 = c24693OoooO.f83664OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooOo00);
                c24703OooO00o = c24703OooO00o2;
                c24695OoooO00 = c24695OoooO002;
            } catch (Throwable th3) {
                th = th3;
                c24703OooO00o2.OooO0O0();
                throw th;
            }
        }
        Set<Integer> set = (Set) objOooOo00;
        if (!set.isEmpty()) {
            c24695OoooO00.f83673OooO.OooO0O0(set);
            c24695OoooO00.f83679OooO0o0.invoke(set);
        }
        c24703OooO00o.OooO0O0();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (o000oo0.C24689Oooo0o.OooO00o(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (o000oo0.C24689Oooo0o.OooO00o(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:28:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(C24695OoooO00 c24695OoooO00, InterfaceC24688Oooo0OO interfaceC24688Oooo0OO, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24698OoooOOO c24698OoooOOO;
        String[] strArr;
        C24695OoooO00 c24695OoooO002;
        int i2;
        OooOOOO oooOOOO;
        int i3;
        String str;
        C24695OoooO00 c24695OoooO003 = c24695OoooO00;
        OooOOOO oooOOOO2 = interfaceC24688Oooo0OO;
        int i4 = i;
        c24695OoooO003.getClass();
        if (abstractC32479OooO0OO instanceof C24698OoooOOO) {
            c24698OoooOOO = (C24698OoooOOO) abstractC32479OooO0OO;
            int i5 = c24698OoooOOO.f83715Oooo000;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c24698OoooOOO.f83715Oooo000 = i5 - Integer.MIN_VALUE;
            } else {
                c24698OoooOOO = new C24698OoooOOO(c24695OoooO003, abstractC32479OooO0OO);
            }
        }
        Object obj = c24698OoooOOO.f83713OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i6 = c24698OoooOOO.f83715Oooo000;
        boolean z = true;
        if (i6 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)";
            c24698OoooOOO.f83707OooOo0o = c24695OoooO003;
            c24698OoooOOO.f83706OooOo = oooOOOO2;
            c24698OoooOOO.f83710OooOoOO = i4;
            c24698OoooOOO.f83715Oooo000 = 1;
        } else if (i6 == 1) {
            int i7 = c24698OoooOOO.f83710OooOoOO;
            oooOOOO2 = c24698OoooOOO.f83706OooOo;
            C24695OoooO00 c24695OoooO004 = c24698OoooOOO.f83707OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i4 = i7;
            c24695OoooO003 = c24695OoooO004;
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c24698OoooOOO.f83711OooOoo;
            i3 = c24698OoooOOO.f83712OooOoo0;
            i4 = c24698OoooOOO.f83710OooOoOO;
            strArr = c24698OoooOOO.f83708OooOoO;
            str = c24698OoooOOO.f83709OooOoO0;
            oooOOOO = c24698OoooOOO.f83706OooOo;
            c24695OoooO002 = c24698OoooOOO.f83707OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            boolean z2 = true;
            i3++;
            z = z2;
            if (i3 < i2) {
                return C32460OooOooO.f116667OooO00o;
            }
            String str3 = strArr[i3];
            z2 = z;
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("CREATE ", c24695OoooO002.f83677OooO0Oo ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
            OooOO0.OooO0OO.OooO0o0(sbOooO0O0, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            String strOooO0OO = C21023OooO0Oo.OooO0OO(" AND invalidated = 0; END", i4, sbOooO0O0);
            c24698OoooOOO.f83707OooOo0o = c24695OoooO002;
            c24698OoooOOO.f83706OooOo = oooOOOO;
            c24698OoooOOO.f83709OooOoO0 = str;
            c24698OoooOOO.f83708OooOoO = strArr;
            c24698OoooOOO.f83710OooOoOO = i4;
            c24698OoooOOO.f83712OooOoo0 = i3;
            c24698OoooOOO.f83711OooOoo = i2;
            c24698OoooOOO.f83715Oooo000 = 2;
        }
        String str4 = c24695OoooO003.f83680OooO0oO[i4];
        strArr = f83672OooOO0o;
        c24695OoooO002 = c24695OoooO003;
        i2 = 3;
        oooOOOO = oooOOOO2;
        i3 = 0;
        str = str4;
        if (i3 < i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(C24695OoooO00 c24695OoooO00, InterfaceC24688Oooo0OO interfaceC24688Oooo0OO, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24699OoooOOo c24699OoooOOo;
        String str;
        int i2;
        OooOOOO oooOOOO;
        int i3;
        String[] strArr;
        c24695OoooO00.getClass();
        if (abstractC32479OooO0OO instanceof C24699OoooOOo) {
            c24699OoooOOo = (C24699OoooOOo) abstractC32479OooO0OO;
            int i4 = c24699OoooOOo.f83723OooOooO;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c24699OoooOOo.f83723OooOooO = i4 - Integer.MIN_VALUE;
            } else {
                c24699OoooOOo = new C24699OoooOOo(c24695OoooO00, abstractC32479OooO0OO);
            }
        }
        Object obj = c24699OoooOOo.f83722OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = c24699OoooOOo.f83723OooOooO;
        if (i5 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = c24695OoooO00.f83680OooO0oO[i];
            i2 = 3;
            oooOOOO = interfaceC24688Oooo0OO;
            i3 = 0;
            strArr = f83672OooOO0o;
            if (i3 < i2) {
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c24699OoooOOo.f83720OooOoOO;
            i3 = c24699OoooOOo.f83718OooOoO;
            String[] strArr2 = c24699OoooOOo.f83719OooOoO0;
            str = c24699OoooOOo.f83716OooOo;
            OooOOOO oooOOOO2 = c24699OoooOOo.f83717OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            strArr = strArr2;
            oooOOOO = oooOOOO2;
            i3++;
            if (i3 < i2) {
                String strOooO00o = C24684Oooo.OooO00o('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i3]);
                c24699OoooOOo.f83717OooOo0o = oooOOOO;
                c24699OoooOOo.f83716OooOo = str;
                c24699OoooOOo.f83719OooOoO0 = strArr;
                c24699OoooOOo.f83718OooOoO = i3;
                c24699OoooOOo.f83720OooOoOO = i2;
                c24699OoooOOo.f83723OooOooO = 1;
                if (C24689Oooo0o.OooO00o(oooOOOO, strOooO00o, c24699OoooOOo) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                i3++;
                if (i3 < i2) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24700OoooOo0 c24700OoooOo0;
        C24703OooO00o c24703OooO00o;
        if (abstractC32479OooO0OO instanceof C24700OoooOo0) {
            c24700OoooOo0 = (C24700OoooOo0) abstractC32479OooO0OO;
            int i = c24700OoooOo0.f83726OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24700OoooOo0.f83726OooOoO = i - Integer.MIN_VALUE;
            } else {
                c24700OoooOo0 = new C24700OoooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24700OoooOo0.f83724OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24700OoooOo0.f83726OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24673OooOo0O abstractC24673OooOo0O = this.f83674OooO00o;
            C24703OooO00o c24703OooO00o2 = abstractC24673OooOo0O.f83584OooO0oO;
            if (c24703OooO00o2.OooO00o()) {
                try {
                    C24701OoooOoO c24701OoooOoO = new C24701OoooOoO(this, null);
                    c24700OoooOo0.f83725OooOo0o = c24703OooO00o2;
                    c24700OoooOo0.f83726OooOoO = 1;
                    if (abstractC24673OooOo0O.OooOo00(false, c24701OoooOoO, c24700OoooOo0) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    c24703OooO00o = c24703OooO00o2;
                    c24703OooO00o.OooO0O0();
                } catch (Throwable th) {
                    th = th;
                    c24703OooO00o = c24703OooO00o2;
                    c24703OooO00o.OooO0O0();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24703OooO00o = c24700OoooOo0.f83725OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                c24703OooO00o.OooO0O0();
            } catch (Throwable th2) {
                th = th2;
                c24703OooO00o.OooO0O0();
                throw th;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final void OooO0o0(C24412OooO0oO onRefreshScheduled, C24659OooO0o onRefreshCompleted) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(onRefreshScheduled, "onRefreshScheduled");
        kotlin.jvm.internal.OooOOO0.OooO0oO(onRefreshCompleted, "onRefreshCompleted");
        if (this.f83682OooOO0.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            C33609OooO0oo.OooO0OO(this.f83674OooO00o.OooO(), new C33635Oooo00O("Room Invalidation Tracker Refresh"), null, new o000oOoO(this, onRefreshCompleted, null), 2);
        }
    }

    public final C32443OooOOO<String[], int[]> OooO0oO(String[] strArr) {
        C32463OooO c32463OooO = new C32463OooO();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f83676OooO0OO.get(lowerCase);
            if (set != null) {
                c32463OooO.addAll(set);
            } else {
                c32463OooO.add(str);
            }
        }
        String[] strArr2 = (String[]) C34449Oooo0oo.OooO0Oo(c32463OooO).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            LinkedHashMap linkedHashMap = this.f83678OooO0o;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i] = num.intValue();
        }
        return new C32443OooOOO<>(strArr2, iArr);
    }
}
