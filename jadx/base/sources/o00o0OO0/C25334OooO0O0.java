package o00o0OO0;

import android.graphics.Bitmap;
import android.util.Log;
import com.aspose.words.ControlChar;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.api.client.googleapis.notifications.ResourceStates;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o00o0OO0.C25328OooO;
import o00o0OO0.C25345OooO0o;

/* JADX INFO: renamed from: o00o0OO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25334OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0o0 f86291OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public EnumC25342OooOOoo f86292OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f86293OooO0OO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO */
    public static final class OooO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO f86294OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO f86295OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO f86296OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO f86297OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final HashMap f86298OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO[] f86299OooOoo0;

        /* JADX INFO: Fake field, exist only in values array */
        OooO EF1;

        static {
            OooO oooO = new OooO("target", 0);
            OooO oooO2 = new OooO("root", 1);
            OooO oooO3 = new OooO("nth_child", 2);
            f86295OooOo0o = oooO3;
            OooO oooO4 = new OooO("nth_last_child", 3);
            OooO oooO5 = new OooO("nth_of_type", 4);
            f86294OooOo = oooO5;
            OooO oooO6 = new OooO("nth_last_of_type", 5);
            f86297OooOoO0 = oooO6;
            OooO oooO7 = new OooO("first_child", 6);
            OooO oooO8 = new OooO("last_child", 7);
            OooO oooO9 = new OooO("first_of_type", 8);
            OooO oooO10 = new OooO("last_of_type", 9);
            OooO oooO11 = new OooO("only_child", 10);
            OooO oooO12 = new OooO("only_of_type", 11);
            OooO oooO13 = new OooO("empty", 12);
            OooO oooO14 = new OooO("not", 13);
            OooO oooO15 = new OooO(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, 14);
            OooO oooO16 = new OooO("link", 15);
            OooO oooO17 = new OooO("visited", 16);
            OooO oooO18 = new OooO("hover", 17);
            OooO oooO19 = new OooO(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, 18);
            OooO oooO20 = new OooO("focus", 19);
            OooO oooO21 = new OooO("enabled", 20);
            OooO oooO22 = new OooO("disabled", 21);
            OooO oooO23 = new OooO("checked", 22);
            OooO oooO24 = new OooO("indeterminate", 23);
            OooO oooO25 = new OooO("UNSUPPORTED", 24);
            f86296OooOoO = oooO25;
            f86299OooOoo0 = new OooO[]{oooO, oooO2, oooO3, oooO4, oooO5, oooO6, oooO7, oooO8, oooO9, oooO10, oooO11, oooO12, oooO13, oooO14, oooO15, oooO16, oooO17, oooO18, oooO19, oooO20, oooO21, oooO22, oooO23, oooO24, oooO25};
            f86298OooOoOO = new HashMap();
            for (OooO oooO26 : values()) {
                if (oooO26 != f86296OooOoO) {
                    f86298OooOoOO.put(oooO26.name().replace('_', '-'), oooO26);
                }
            }
        }

        public OooO() {
            throw null;
        }

        public static OooO valueOf(String str) {
            return (OooO) Enum.valueOf(OooO.class, str);
        }

        public static OooO[] values() {
            return (OooO[]) f86299OooOoo0.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f86300OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final EnumC19696OooO0O0 f86301OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f86302OooO0OO;

        public OooO00o(String str, EnumC19696OooO0O0 enumC19696OooO0O0, String str2) {
            this.f86300OooO00o = str;
            this.f86301OooO0O0 = enumC19696OooO0O0;
            this.f86302OooO0OO = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class EnumC19696OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC19696OooO0O0 f86303OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC19696OooO0O0 f86304OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC19696OooO0O0 f86305OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC19696OooO0O0 f86306OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ EnumC19696OooO0O0[] f86307OooOoOO;

        static {
            EnumC19696OooO0O0 enumC19696OooO0O0 = new EnumC19696OooO0O0(ResourceStates.EXISTS, 0);
            f86304OooOo0o = enumC19696OooO0O0;
            EnumC19696OooO0O0 enumC19696OooO0O02 = new EnumC19696OooO0O0("EQUALS", 1);
            f86303OooOo = enumC19696OooO0O02;
            EnumC19696OooO0O0 enumC19696OooO0O03 = new EnumC19696OooO0O0("INCLUDES", 2);
            f86306OooOoO0 = enumC19696OooO0O03;
            EnumC19696OooO0O0 enumC19696OooO0O04 = new EnumC19696OooO0O0("DASHMATCH", 3);
            f86305OooOoO = enumC19696OooO0O04;
            f86307OooOoOO = new EnumC19696OooO0O0[]{enumC19696OooO0O0, enumC19696OooO0O02, enumC19696OooO0O03, enumC19696OooO0O04};
        }

        public EnumC19696OooO0O0() {
            throw null;
        }

        public static EnumC19696OooO0O0 valueOf(String str) {
            return (EnumC19696OooO0O0) Enum.valueOf(EnumC19696OooO0O0.class, str);
        }

        public static EnumC19696OooO0O0[] values() {
            return (EnumC19696OooO0O0[]) f86307OooOoOO.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0OO */
    public static class OooO0OO extends C25328OooO.C25332OooO0oo {

        /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0OO$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f86308OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f86309OooO0O0;

            public OooO00o(int i, int i2) {
                this.f86308OooO00o = i;
                this.f86309OooO0O0 = i2;
            }
        }

        public OooO0OO(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int OooOOo(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public final String OooOOoo() {
            int iOooOOo;
            if (OooO0o()) {
                return null;
            }
            char cCharAt = this.f86287OooO00o.charAt(this.f86288OooO0O0);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.f86288OooO0O0++;
            int iIntValue = OooO0oo().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = OooO0oo().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = OooO0oo().intValue();
                        } else {
                            int iOooOOo2 = OooOOo(iIntValue);
                            if (iOooOOo2 != -1) {
                                for (int i = 1; i <= 5 && (iOooOOo = OooOOo((iIntValue = OooO0oo().intValue()))) != -1; i++) {
                                    iOooOOo2 = (iOooOOo2 * 16) + iOooOOo;
                                }
                                sb.append((char) iOooOOo2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = OooO0oo().intValue();
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0300  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x03ce  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x03d3  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x040b  */
        /* JADX WARN: Removed duplicated region for block: B:263:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:287:0x026e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:288:0x03ea A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:289:0x044a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARN: Type inference failed for: r11v3, types: [o00o0OO0.OooO0O0$OooO0O0] */
        /* JADX WARN: Type inference failed for: r11v68 */
        /* JADX WARN: Type inference failed for: r11v69 */
        /* JADX WARN: Type inference failed for: r12v26 */
        /* JADX WARN: Type inference failed for: r12v27 */
        /* JADX WARN: Type inference failed for: r12v28, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v32 */
        /* JADX WARN: Type inference failed for: r12v33 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [o00o0OO0.OooO0O0$OooO0Oo] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v9, types: [o00o0OO0.OooO0O0$OooO0OO$OooO00o] */
        /* JADX WARN: Type inference failed for: r9v10, types: [o00o0OO0.OooO0O0$OooOOo] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [o00o0OO0.OooO0O0$OooOOo] */
        /* JADX WARN: Type inference failed for: r9v13, types: [o00o0OO0.OooO0O0$OooOOo] */
        /* JADX WARN: Type inference failed for: r9v14, types: [o00o0OO0.OooO0O0$OooOOo] */
        /* JADX WARN: Type inference failed for: r9v15, types: [o00o0OO0.OooO0O0$OooOOo] */
        /* JADX WARN: Type inference failed for: r9v16, types: [o00o0OO0.OooO0O0$OooOOo] */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [o00o0OO0.OooO0O0$OooOOo] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ArrayList OooOo0() throws C25333OooO00o {
            ?? r6;
            ?? c25340OooOOo;
            String strOooOO0O;
            char c;
            int i;
            C25343OooO0OO c25343OooO0OOOooO00o;
            OooO00o oooO00o;
            ?? r7;
            OooO00o oooO00o2;
            Object obj;
            C25336OooO0oO c25336OooO0oO;
            Object obj2;
            Object obj3;
            ArrayList arrayListOooOo0;
            ArrayList arrayList;
            ArrayList arrayList2;
            OooOO0O oooOO0O;
            String str = null;
            if (OooO0o()) {
                return null;
            }
            ?? r3 = 1;
            ArrayList arrayList3 = new ArrayList(1);
            C25341OooOOo0 c25341OooOOo0 = new C25341OooOOo0();
            while (true) {
                if (!OooO0o() && !OooO0o()) {
                    int i2 = this.f86288OooO0O0;
                    ArrayList arrayList4 = c25341OooOOo0.f86334OooO00o;
                    boolean z = false;
                    char c2 = '+';
                    if (((arrayList4 == null || arrayList4.isEmpty()) ? r3 : 0) != 0) {
                        r6 = str;
                        if (OooO0Oo('*')) {
                            String strOooOo00 = OooOo00();
                            if (strOooOo00 != null) {
                                C25340OooOOo c25340OooOOo2 = new C25340OooOOo(r6, strOooOo00);
                                c25341OooOOo0.f86335OooO0O0 += r3;
                                c25340OooOOo = c25340OooOOo2;
                            } else {
                                c25340OooOOo = str;
                            }
                        } else {
                            c25340OooOOo = new C25340OooOOo(r6, str);
                        }
                        while (!OooO0o()) {
                            boolean zOooO0Oo = OooO0Oo(FilenameUtils.EXTENSION_SEPARATOR);
                            EnumC19696OooO0O0 enumC19696OooO0O0 = EnumC19696OooO0O0.f86303OooOo;
                            if (zOooO0Oo) {
                                if (c25340OooOOo == 0) {
                                    c25340OooOOo = new C25340OooOOo(r6, str);
                                }
                                String strOooOo002 = OooOo00();
                                if (strOooOo002 == null) {
                                    throw new C25333OooO00o("Invalid \".class\" simpleSelectors");
                                }
                                c25340OooOOo.OooO00o("class", enumC19696OooO0O0, strOooOo002);
                                c25341OooOOo0.OooO00o();
                            } else if (OooO0Oo('#')) {
                                if (c25340OooOOo == 0) {
                                    c25340OooOOo = new C25340OooOOo(r6, str);
                                }
                                String strOooOo003 = OooOo00();
                                if (strOooOo003 == null) {
                                    throw new C25333OooO00o("Invalid \"#id\" simpleSelectors");
                                }
                                c25340OooOOo.OooO00o("id", enumC19696OooO0O0, strOooOo003);
                                c25341OooOOo0.f86335OooO0O0 += 1000000;
                            } else if (OooO0Oo('[')) {
                                if (c25340OooOOo == 0) {
                                    c25340OooOOo = new C25340OooOOo(r6, str);
                                }
                                OooOOo0();
                                String strOooOo004 = OooOo00();
                                if (strOooOo004 == null) {
                                    throw new C25333OooO00o("Invalid attribute simpleSelectors");
                                }
                                OooOOo0();
                                Object obj4 = enumC19696OooO0O0;
                                if (!OooO0Oo('=')) {
                                    obj4 = OooO0o0("~=") ? EnumC19696OooO0O0.f86306OooOoO0 : OooO0o0("|=") ? EnumC19696OooO0O0.f86305OooOoO : str;
                                }
                                if (obj4 != null) {
                                    OooOOo0();
                                    if (OooO0o()) {
                                        strOooOO0O = str;
                                    } else {
                                        strOooOO0O = OooOO0O();
                                        if (strOooOO0O == null) {
                                            strOooOO0O = OooOo00();
                                        }
                                    }
                                    if (strOooOO0O == null) {
                                        throw new C25333OooO00o("Invalid attribute simpleSelectors");
                                    }
                                    OooOOo0();
                                } else {
                                    strOooOO0O = str;
                                }
                                ?? r11 = obj4;
                                if (!OooO0Oo(']')) {
                                    throw new C25333OooO00o("Invalid attribute simpleSelectors");
                                }
                                if (obj4 == null) {
                                    r11 = EnumC19696OooO0O0.f86304OooOo0o;
                                }
                                c25340OooOOo.OooO00o(strOooOo004, r11, strOooOO0O);
                                c25341OooOOo0.OooO00o();
                            } else {
                                c25340OooOOo = c25340OooOOo;
                                if (OooO0Oo(':')) {
                                    if (c25340OooOOo == 0) {
                                        c25340OooOOo = new C25340OooOOo(r6, str);
                                    }
                                    String strOooOo005 = OooOo00();
                                    if (strOooOo005 == null) {
                                        throw new C25333OooO00o("Invalid pseudo class");
                                    }
                                    OooO oooO = (OooO) OooO.f86298OooOoOO.get(strOooOo005);
                                    if (oooO == null) {
                                        oooO = OooO.f86296OooOoO;
                                    }
                                    switch (oooO.ordinal()) {
                                        case 0:
                                            c = c2;
                                            OooOOO oooOOO = new OooOOO();
                                            c25341OooOOo0.OooO00o();
                                            obj = oooOOO;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                                c25340OooOOo.f86333OooO0Oo = new ArrayList();
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 1:
                                            c = c2;
                                            OooOOO0 oooOOO0 = new OooOOO0();
                                            c25341OooOOo0.OooO00o();
                                            obj = oooOOO0;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                            boolean z2 = (oooO == OooO.f86295OooOo0o || oooO == OooO.f86294OooOo) ? r3 == true ? 1 : 0 : z ? 1 : 0;
                                            boolean z3 = (oooO == OooO.f86294OooOo || oooO == OooO.f86297OooOoO0) ? r3 == true ? 1 : 0 : z ? 1 : 0;
                                            if (OooO0o()) {
                                                r7 = str;
                                                c = '+';
                                                if (r7 != 0) {
                                                    throw new C25333OooO00o("Invalid or missing parameter section for pseudo class: ".concat(strOooOo005));
                                                }
                                                C25336OooO0oO c25336OooO0oO2 = new C25336OooO0oO(c25340OooOOo.f86331OooO0O0, r7.f86308OooO00o, r7.f86309OooO0O0, z2, z3);
                                                c25341OooOOo0.OooO00o();
                                                obj = c25336OooO0oO2;
                                                if (c25340OooOOo.f86333OooO0Oo == null) {
                                                }
                                                c25340OooOOo.f86333OooO0Oo.add(obj);
                                                c2 = c;
                                                str = null;
                                                r3 = 1;
                                                z = false;
                                                break;
                                            } else {
                                                int i3 = this.f86288OooO0O0;
                                                if (OooO0Oo('(')) {
                                                    OooOOo0();
                                                    if (OooO0o0("odd")) {
                                                        oooO00o = new OooO00o(2, r3 == true ? 1 : 0);
                                                    } else if (OooO0o0("even")) {
                                                        oooO00o = new OooO00o(2, z ? 1 : 0);
                                                    } else {
                                                        int i4 = (!OooO0Oo('+') && OooO0Oo('-')) ? -1 : r3 == true ? 1 : 0;
                                                        int i5 = this.f86288OooO0O0;
                                                        String str2 = this.f86287OooO00o;
                                                        int i6 = this.f86289OooO0OO;
                                                        C25343OooO0OO c25343OooO0OOOooO00o2 = C25343OooO0OO.OooO00o(i5, i6, str2);
                                                        if (c25343OooO0OOOooO00o2 != null) {
                                                            this.f86288OooO0O0 = c25343OooO0OOOooO00o2.f86338OooO00o;
                                                        }
                                                        if (OooO0Oo('n') || OooO0Oo('N')) {
                                                            if (c25343OooO0OOOooO00o2 == null) {
                                                                c25343OooO0OOOooO00o2 = new C25343OooO0OO(1L, this.f86288OooO0O0);
                                                            }
                                                            OooOOo0();
                                                            c = '+';
                                                            boolean zOooO0Oo2 = OooO0Oo('+');
                                                            i = (zOooO0Oo2 || !(zOooO0Oo2 = OooO0Oo('-'))) ? 1 : -1;
                                                            if (zOooO0Oo2) {
                                                                OooOOo0();
                                                                c25343OooO0OOOooO00o = C25343OooO0OO.OooO00o(this.f86288OooO0O0, i6, str2);
                                                                if (c25343OooO0OOOooO00o != null) {
                                                                    this.f86288OooO0O0 = c25343OooO0OOOooO00o.f86338OooO00o;
                                                                } else {
                                                                    this.f86288OooO0O0 = i3;
                                                                    r7 = 0;
                                                                }
                                                            } else {
                                                                c25343OooO0OOOooO00o = null;
                                                            }
                                                        } else {
                                                            c25343OooO0OOOooO00o = c25343OooO0OOOooO00o2;
                                                            i = i4 == true ? 1 : 0;
                                                            c25343OooO0OOOooO00o2 = null;
                                                            c = '+';
                                                            i4 = 1;
                                                        }
                                                        oooO00o2 = new OooO00o(c25343OooO0OOOooO00o2 == null ? 0 : i4 * ((int) c25343OooO0OOOooO00o2.f86339OooO0O0), c25343OooO0OOOooO00o == null ? 0 : i * ((int) c25343OooO0OOOooO00o.f86339OooO0O0));
                                                        OooOOo0();
                                                        r7 = oooO00o2;
                                                        if (!OooO0Oo(')')) {
                                                            this.f86288OooO0O0 = i3;
                                                            r7 = 0;
                                                        }
                                                    }
                                                    oooO00o2 = oooO00o;
                                                    c = '+';
                                                    OooOOo0();
                                                    r7 = oooO00o2;
                                                    if (!OooO0Oo(')')) {
                                                    }
                                                }
                                                if (r7 != 0) {
                                                }
                                            }
                                            break;
                                        case 6:
                                            c25336OooO0oO = new C25336OooO0oO(null, 0, 1, true, false);
                                            c25341OooOOo0.OooO00o();
                                            obj2 = c25336OooO0oO;
                                            c = '+';
                                            obj = obj2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 7:
                                            C25336OooO0oO c25336OooO0oO3 = new C25336OooO0oO(null, 0, 1, false, false);
                                            c25341OooOOo0.OooO00o();
                                            obj3 = c25336OooO0oO3;
                                            obj2 = obj3;
                                            c = '+';
                                            obj = obj2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 8:
                                            C25336OooO0oO c25336OooO0oO4 = new C25336OooO0oO(c25340OooOOo.f86331OooO0O0, 0, 1, true, true);
                                            c25341OooOOo0.OooO00o();
                                            obj2 = c25336OooO0oO4;
                                            c = '+';
                                            obj = obj2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 9:
                                            c25336OooO0oO = new C25336OooO0oO(c25340OooOOo.f86331OooO0O0, 0, 1, false, true);
                                            c25341OooOOo0.OooO00o();
                                            obj2 = c25336OooO0oO;
                                            c = '+';
                                            obj = obj2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 10:
                                            C25338OooOO0o c25338OooOO0o = new C25338OooOO0o(z, str);
                                            c25341OooOOo0.OooO00o();
                                            obj3 = c25338OooOO0o;
                                            obj2 = obj3;
                                            c = '+';
                                            obj = obj2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 11:
                                            C25338OooOO0o c25338OooOO0o2 = new C25338OooOO0o(r3, c25340OooOOo.f86331OooO0O0);
                                            c25341OooOOo0.OooO00o();
                                            obj3 = c25338OooOO0o2;
                                            obj2 = obj3;
                                            c = '+';
                                            obj = obj2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 12:
                                            C25337OooO0oo c25337OooO0oo = new C25337OooO0oo();
                                            c25341OooOOo0.OooO00o();
                                            obj3 = c25337OooO0oo;
                                            obj2 = obj3;
                                            c = '+';
                                            obj = obj2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 13:
                                            if (OooO0o()) {
                                                arrayListOooOo0 = str;
                                                if (arrayListOooOo0 == null) {
                                                    throw new C25333OooO00o("Invalid or missing parameter section for pseudo class: ".concat(strOooOo005));
                                                }
                                                OooOO0 oooOO02 = new OooOO0();
                                                oooOO02.f86322OooO00o = arrayListOooOo0;
                                                Iterator it = arrayListOooOo0.iterator();
                                                int i7 = Integer.MIN_VALUE;
                                                while (it.hasNext()) {
                                                    int i8 = ((C25341OooOOo0) it.next()).f86335OooO0O0;
                                                    if (i8 > i7) {
                                                        i7 = i8;
                                                    }
                                                }
                                                c25341OooOOo0.f86335OooO0O0 = i7;
                                                obj3 = oooOO02;
                                                obj2 = obj3;
                                                c = '+';
                                                obj = obj2;
                                                if (c25340OooOOo.f86333OooO0Oo == null) {
                                                }
                                                c25340OooOOo.f86333OooO0Oo.add(obj);
                                                c2 = c;
                                                str = null;
                                                r3 = 1;
                                                z = false;
                                                break;
                                            } else {
                                                int i9 = this.f86288OooO0O0;
                                                if (OooO0Oo('(')) {
                                                    OooOOo0();
                                                    arrayListOooOo0 = OooOo0();
                                                    if (arrayListOooOo0 != null && OooO0Oo(')')) {
                                                        Iterator it2 = arrayListOooOo0.iterator();
                                                        while (it2.hasNext() && (arrayList = ((C25341OooOOo0) it2.next()).f86334OooO00o) != null) {
                                                            Iterator it3 = arrayList.iterator();
                                                            while (it3.hasNext() && (arrayList2 = ((C25340OooOOo) it3.next()).f86333OooO0Oo) != null) {
                                                                Iterator it4 = arrayList2.iterator();
                                                                while (it4.hasNext()) {
                                                                    if (((OooO0o) it4.next()) instanceof OooOO0) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (arrayListOooOo0 == null) {
                                                        }
                                                    } else {
                                                        this.f86288OooO0O0 = i9;
                                                    }
                                                    arrayListOooOo0 = str;
                                                    if (arrayListOooOo0 == null) {
                                                    }
                                                }
                                            }
                                            break;
                                        case 14:
                                            if (!OooO0o()) {
                                                int i10 = this.f86288OooO0O0;
                                                if (OooO0Oo('(')) {
                                                    OooOOo0();
                                                    ?? arrayList5 = str;
                                                    while (true) {
                                                        String strOooOo006 = OooOo00();
                                                        arrayList5 = arrayList5;
                                                        if (strOooOo006 == null) {
                                                            this.f86288OooO0O0 = i10;
                                                        } else {
                                                            if (arrayList5 == 0) {
                                                                arrayList5 = new ArrayList();
                                                            }
                                                            arrayList5.add(strOooOo006);
                                                            OooOOo0();
                                                            if (!OooOOOo()) {
                                                                if (!OooO0Oo(')')) {
                                                                    this.f86288OooO0O0 = i10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            oooOO0O = new OooOO0O(strOooOo005);
                                            c25341OooOOo0.OooO00o();
                                            obj = oooOO0O;
                                            c = c2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                            oooOO0O = new OooOO0O(strOooOo005);
                                            c25341OooOOo0.OooO00o();
                                            obj = oooOO0O;
                                            c = c2;
                                            if (c25340OooOOo.f86333OooO0Oo == null) {
                                            }
                                            c25340OooOOo.f86333OooO0Oo.add(obj);
                                            c2 = c;
                                            str = null;
                                            r3 = 1;
                                            z = false;
                                            break;
                                        default:
                                            throw new C25333OooO00o("Unsupported pseudo class: ".concat(strOooOo005));
                                    }
                                } else if (c25340OooOOo != 0) {
                                    if (c25341OooOOo0.f86334OooO00o == null) {
                                        c25341OooOOo0.f86334OooO00o = new ArrayList();
                                    }
                                    c25341OooOOo0.f86334OooO00o.add(c25340OooOOo);
                                    if (OooOOOo()) {
                                        arrayList3.add(c25341OooOOo0);
                                        c25341OooOOo0 = new C25341OooOOo0();
                                    }
                                    str = null;
                                    r3 = 1;
                                } else {
                                    this.f86288OooO0O0 = i2;
                                }
                            }
                        }
                        if (c25340OooOOo != 0) {
                        }
                    } else {
                        if (OooO0Oo('>')) {
                            EnumC25335OooO0Oo enumC25335OooO0Oo = EnumC25335OooO0Oo.f86310OooOo;
                            OooOOo0();
                            r6 = enumC25335OooO0Oo;
                        } else if (OooO0Oo('+')) {
                            EnumC25335OooO0Oo enumC25335OooO0Oo2 = EnumC25335OooO0Oo.f86313OooOoO0;
                            OooOOo0();
                            r6 = enumC25335OooO0Oo2;
                        }
                        if (OooO0Oo('*')) {
                        }
                        while (!OooO0o()) {
                        }
                        if (c25340OooOOo != 0) {
                        }
                    }
                }
            }
            ArrayList arrayList6 = c25341OooOOo0.f86334OooO00o;
            if (arrayList6 != null && !arrayList6.isEmpty()) {
                arrayList3.add(c25341OooOOo0);
            }
            return arrayList3;
        }

        public final String OooOo00() {
            int i;
            int i2;
            boolean zOooO0o = OooO0o();
            String str = this.f86287OooO00o;
            if (zOooO0o) {
                i2 = this.f86288OooO0O0;
            } else {
                int i3 = this.f86288OooO0O0;
                int iCharAt = str.charAt(i3);
                if (iCharAt == 45) {
                    iCharAt = OooO00o();
                }
                if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                    i = i3;
                } else {
                    int iOooO00o = OooO00o();
                    while (true) {
                        if ((iOooO00o < 65 || iOooO00o > 90) && ((iOooO00o < 97 || iOooO00o > 122) && !((iOooO00o >= 48 && iOooO00o <= 57) || iOooO00o == 45 || iOooO00o == 95))) {
                            break;
                        }
                        iOooO00o = OooO00o();
                    }
                    i = this.f86288OooO0O0;
                }
                this.f86288OooO0O0 = i3;
                i2 = i;
            }
            int i4 = this.f86288OooO0O0;
            if (i2 == i4) {
                return null;
            }
            String strSubstring = str.substring(i4, i2);
            this.f86288OooO0O0 = i2;
            return strSubstring;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static final class EnumC25335OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC25335OooO0Oo f86310OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC25335OooO0Oo f86311OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ EnumC25335OooO0Oo[] f86312OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC25335OooO0Oo f86313OooOoO0;

        static {
            EnumC25335OooO0Oo enumC25335OooO0Oo = new EnumC25335OooO0Oo("DESCENDANT", 0);
            f86311OooOo0o = enumC25335OooO0Oo;
            EnumC25335OooO0Oo enumC25335OooO0Oo2 = new EnumC25335OooO0Oo("CHILD", 1);
            f86310OooOo = enumC25335OooO0Oo2;
            EnumC25335OooO0Oo enumC25335OooO0Oo3 = new EnumC25335OooO0Oo("FOLLOWS", 2);
            f86313OooOoO0 = enumC25335OooO0Oo3;
            f86312OooOoO = new EnumC25335OooO0Oo[]{enumC25335OooO0Oo, enumC25335OooO0Oo2, enumC25335OooO0Oo3};
        }

        public EnumC25335OooO0Oo() {
            throw null;
        }

        public static EnumC25335OooO0Oo valueOf(String str) {
            return (EnumC25335OooO0Oo) Enum.valueOf(EnumC25335OooO0Oo.class, str);
        }

        public static EnumC25335OooO0Oo[] values() {
            return (EnumC25335OooO0Oo[]) f86312OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0o */
    public interface OooO0o {
        boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0o0 */
    public static final class OooO0o0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0o0 f86314OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0o0 f86315OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO0o0[] f86316OooOoO0;

        static {
            OooO0o0 oooO0o0 = new OooO0o0("all", 0);
            f86315OooOo0o = oooO0o0;
            OooO0o0 oooO0o02 = new OooO0o0("aural", 1);
            OooO0o0 oooO0o03 = new OooO0o0("braille", 2);
            OooO0o0 oooO0o04 = new OooO0o0("embossed", 3);
            OooO0o0 oooO0o05 = new OooO0o0("handheld", 4);
            OooO0o0 oooO0o06 = new OooO0o0("print", 5);
            OooO0o0 oooO0o07 = new OooO0o0("projection", 6);
            OooO0o0 oooO0o08 = new OooO0o0("screen", 7);
            f86314OooOo = oooO0o08;
            f86316OooOoO0 = new OooO0o0[]{oooO0o0, oooO0o02, oooO0o03, oooO0o04, oooO0o05, oooO0o06, oooO0o07, oooO0o08, new OooO0o0("speech", 8), new OooO0o0("tty", 9), new OooO0o0("tv", 10)};
        }

        public OooO0o0() {
            throw null;
        }

        public static OooO0o0 valueOf(String str) {
            return (OooO0o0) Enum.valueOf(OooO0o0.class, str);
        }

        public static OooO0o0[] values() {
            return (OooO0o0[]) f86316OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0oO, reason: case insensitive filesystem */
    public static class C25336OooO0oO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f86317OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f86318OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f86319OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f86320OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f86321OooO0o0;

        public C25336OooO0oO(String str, int i, int i2, boolean z, boolean z2) {
            this.f86317OooO00o = i;
            this.f86318OooO0O0 = i2;
            this.f86319OooO0OO = z;
            this.f86320OooO0Oo = z2;
            this.f86321OooO0o0 = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
        @Override // o00o0OO0.C25334OooO0O0.OooO0o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
            int i;
            int i2;
            boolean z = this.f86320OooO0Oo;
            String strOooOOO0 = this.f86321OooO0o0;
            if (z && strOooOOO0 == null) {
                strOooOOO0 = abstractC25373Oooo0OO.OooOOO0();
            }
            C25345OooO0o.Oooo0 oooo0 = abstractC25373Oooo0OO.f86521OooO0O0;
            if (oooo0 != null) {
                Iterator<C25345OooO0o.Oooo0o> it = oooo0.getChildren().iterator();
                i2 = 0;
                i = 0;
                while (it.hasNext()) {
                    C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO2 = (C25345OooO0o.AbstractC25373Oooo0OO) it.next();
                    if (abstractC25373Oooo0OO2 == abstractC25373Oooo0OO) {
                        i2 = i;
                    }
                    if (strOooOOO0 == null || abstractC25373Oooo0OO2.OooOOO0().equals(strOooOOO0)) {
                        i++;
                    }
                }
            } else {
                i = 1;
                i2 = 0;
            }
            int i3 = this.f86319OooO0OO ? i2 + 1 : i - i2;
            int i4 = this.f86317OooO00o;
            int i5 = this.f86318OooO0O0;
            if (i4 == 0) {
                return i3 == i5;
            }
            int i6 = i3 - i5;
            if (i6 % i4 != 0 || (Integer.signum(i6) != 0 && Integer.signum(i6) != Integer.signum(i4))) {
            }
        }

        public final String toString() {
            String str = this.f86319OooO0OO ? "" : "last-";
            boolean z = this.f86320OooO0Oo;
            int i = this.f86318OooO0O0;
            int i2 = this.f86317OooO00o;
            return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.f86321OooO0o0) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooO0oo, reason: case insensitive filesystem */
    public static class C25337OooO0oo implements OooO0o {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00o0OO0.C25334OooO0O0.OooO0o
        public final boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
            return !(abstractC25373Oooo0OO instanceof C25345OooO0o.Oooo0) || ((C25345OooO0o.Oooo0) abstractC25373Oooo0OO).getChildren().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOO0 */
    public static class OooOO0 implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<C25341OooOOo0> f86322OooO00o;

        @Override // o00o0OO0.C25334OooO0O0.OooO0o
        public final boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
            Iterator<C25341OooOOo0> it = this.f86322OooO00o.iterator();
            while (it.hasNext()) {
                if (C25334OooO0O0.OooO0oO(it.next(), abstractC25373Oooo0OO)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return com.google.firebase.firestore.util.OooOOO.OooO0O0(")", new StringBuilder("not("), this.f86322OooO00o);
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOO0O */
    public static class OooOO0O implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f86323OooO00o;

        public OooOO0O(String str) {
            this.f86323OooO00o = str;
        }

        @Override // o00o0OO0.C25334OooO0O0.OooO0o
        public final boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
            return false;
        }

        public final String toString() {
            return this.f86323OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOO0o, reason: case insensitive filesystem */
    public static class C25338OooOO0o implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f86324OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f86325OooO0O0;

        public C25338OooOO0o(boolean z, String str) {
            this.f86324OooO00o = z;
            this.f86325OooO0O0 = str;
        }

        @Override // o00o0OO0.C25334OooO0O0.OooO0o
        public final boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
            int i;
            boolean z = this.f86324OooO00o;
            String strOooOOO0 = this.f86325OooO0O0;
            if (z && strOooOOO0 == null) {
                strOooOOO0 = abstractC25373Oooo0OO.OooOOO0();
            }
            C25345OooO0o.Oooo0 oooo0 = abstractC25373Oooo0OO.f86521OooO0O0;
            if (oooo0 != null) {
                Iterator<C25345OooO0o.Oooo0o> it = oooo0.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO2 = (C25345OooO0o.AbstractC25373Oooo0OO) it.next();
                    if (strOooOOO0 == null || abstractC25373Oooo0OO2.OooOOO0().equals(strOooOOO0)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public final String toString() {
            return this.f86324OooO00o ? androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("only-of-type <"), this.f86325OooO0O0, ">") : "only-child";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOOO */
    public static class OooOOO implements OooO0o {
        @Override // o00o0OO0.C25334OooO0O0.OooO0o
        public final boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
            return false;
        }

        public final String toString() {
            return "target";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOOO0 */
    public static class OooOOO0 implements OooO0o {
        @Override // o00o0OO0.C25334OooO0O0.OooO0o
        public final boolean OooO00o(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
            return abstractC25373Oooo0OO.f86521OooO0O0 == null;
        }

        public final String toString() {
            return "root";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOOOO */
    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C25341OooOOo0 f86326OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C25345OooO0o.C25363OooOooO f86327OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public EnumC25342OooOOoo f86328OooO0OO;

        public final String toString() {
            return String.valueOf(this.f86326OooO00o) + " {...} (src=" + this.f86328OooO0OO + ")";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOOOo, reason: case insensitive filesystem */
    public static class C25339OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ArrayList f86329OooO00o = null;

        public final void OooO00o(OooOOOO oooOOOO) {
            if (this.f86329OooO00o == null) {
                this.f86329OooO00o = new ArrayList();
            }
            for (int i = 0; i < this.f86329OooO00o.size(); i++) {
                if (((OooOOOO) this.f86329OooO00o.get(i)).f86326OooO00o.f86335OooO0O0 > oooOOOO.f86326OooO00o.f86335OooO0O0) {
                    this.f86329OooO00o.add(i, oooOOOO);
                    return;
                }
            }
            this.f86329OooO00o.add(oooOOOO);
        }

        public final void OooO0O0(C25339OooOOOo c25339OooOOOo) {
            if (c25339OooOOOo.f86329OooO00o == null) {
                return;
            }
            if (this.f86329OooO00o == null) {
                this.f86329OooO00o = new ArrayList(c25339OooOOOo.f86329OooO00o.size());
            }
            Iterator it = c25339OooOOOo.f86329OooO00o.iterator();
            while (it.hasNext()) {
                OooO00o((OooOOOO) it.next());
            }
        }

        public final String toString() {
            if (this.f86329OooO00o == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f86329OooO00o.iterator();
            while (it.hasNext()) {
                sb.append(((OooOOOO) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOOo, reason: case insensitive filesystem */
    public static class C25340OooOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EnumC25335OooO0Oo f86330OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f86331OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ArrayList f86332OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ArrayList f86333OooO0Oo = null;

        public C25340OooOOo(EnumC25335OooO0Oo enumC25335OooO0Oo, String str) {
            this.f86330OooO00o = null;
            this.f86331OooO0O0 = null;
            this.f86330OooO00o = enumC25335OooO0Oo == null ? EnumC25335OooO0Oo.f86311OooOo0o : enumC25335OooO0Oo;
            this.f86331OooO0O0 = str;
        }

        public final void OooO00o(String str, EnumC19696OooO0O0 enumC19696OooO0O0, String str2) {
            if (this.f86332OooO0OO == null) {
                this.f86332OooO0OO = new ArrayList();
            }
            this.f86332OooO0OO.add(new OooO00o(str, enumC19696OooO0O0, str2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            EnumC25335OooO0Oo enumC25335OooO0Oo = EnumC25335OooO0Oo.f86310OooOo;
            EnumC25335OooO0Oo enumC25335OooO0Oo2 = this.f86330OooO00o;
            if (enumC25335OooO0Oo2 == enumC25335OooO0Oo) {
                sb.append("> ");
            } else if (enumC25335OooO0Oo2 == EnumC25335OooO0Oo.f86313OooOoO0) {
                sb.append("+ ");
            }
            String str = this.f86331OooO0O0;
            if (str == null) {
                str = C18358t1.g.f56183c;
            }
            sb.append(str);
            ArrayList<OooO00o> arrayList = this.f86332OooO0OO;
            if (arrayList != null) {
                for (OooO00o oooO00o : arrayList) {
                    sb.append('[');
                    sb.append(oooO00o.f86300OooO00o);
                    int iOrdinal = oooO00o.f86301OooO0O0.ordinal();
                    String str2 = oooO00o.f86302OooO0OO;
                    if (iOrdinal == 1) {
                        sb.append('=');
                        sb.append(str2);
                    } else if (iOrdinal == 2) {
                        sb.append("~=");
                        sb.append(str2);
                    } else if (iOrdinal == 3) {
                        sb.append("|=");
                        sb.append(str2);
                    }
                    sb.append(']');
                }
            }
            ArrayList<OooO0o> arrayList2 = this.f86333OooO0Oo;
            if (arrayList2 != null) {
                for (OooO0o oooO0o : arrayList2) {
                    sb.append(':');
                    sb.append(oooO0o);
                }
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOOo0, reason: case insensitive filesystem */
    public static class C25341OooOOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ArrayList f86334OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f86335OooO0O0 = 0;

        public final void OooO00o() {
            this.f86335OooO0O0 += 1000;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r0v1, types: [boolean, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int, java.io.OutputStream] */
        public final String toString() {
            ?? sb = new StringBuilder();
            Iterator it = this.f86334OooO00o.iterator();
            while (it.hasNext()) {
                sb.append((C25340OooOOo) it.next());
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append('[');
            return Bitmap.compress(93, sb, this.f86335OooO0O0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO0O0$OooOOoo, reason: case insensitive filesystem */
    public static final class EnumC25342OooOOoo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ EnumC25342OooOOoo[] f86336OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC25342OooOOoo f86337OooOo0o;

        static {
            EnumC25342OooOOoo enumC25342OooOOoo = new EnumC25342OooOOoo("Document", 0);
            f86337OooOo0o = enumC25342OooOOoo;
            f86336OooOo = new EnumC25342OooOOoo[]{enumC25342OooOOoo, new EnumC25342OooOOoo("RenderOptions", 1)};
        }

        public EnumC25342OooOOoo() {
            throw null;
        }

        public static EnumC25342OooOOoo valueOf(String str) {
            return (EnumC25342OooOOoo) Enum.valueOf(EnumC25342OooOOoo.class, str);
        }

        public static EnumC25342OooOOoo[] values() {
            return (EnumC25342OooOOoo[]) f86336OooOo.clone();
        }
    }

    public static boolean OooO(C25340OooOOo c25340OooOOo, C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
        ArrayList arrayList;
        String str = c25340OooOOo.f86331OooO0O0;
        if (str != null && !str.equals(abstractC25373Oooo0OO.OooOOO0().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<OooO00o> arrayList2 = c25340OooOOo.f86332OooO0OO;
        if (arrayList2 != null) {
            for (OooO00o oooO00o : arrayList2) {
                String str2 = oooO00o.f86300OooO00o;
                String str3 = oooO00o.f86302OooO0OO;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC25373Oooo0OO.f86515OooO0OO)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = abstractC25373Oooo0OO.f86519OooO0oO) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c25340OooOOo.f86333OooO0Oo;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((OooO0o) it.next()).OooO00o(abstractC25373Oooo0OO)) {
                return false;
            }
        }
        return true;
    }

    public static int OooO00o(ArrayList arrayList, int i, C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        C25345OooO0o.Oooo0 oooo0 = abstractC25373Oooo0OO.f86521OooO0O0;
        if (obj != oooo0) {
            return -1;
        }
        Iterator<C25345OooO0o.Oooo0o> it = oooo0.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == abstractC25373Oooo0OO) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList OooO0OO(OooO0OO oooO0OO) {
        ArrayList arrayList = new ArrayList();
        while (!oooO0OO.OooO0o()) {
            String strSubstring = null;
            if (!oooO0OO.OooO0o()) {
                int i = oooO0OO.f86288OooO0O0;
                String str = oooO0OO.f86287OooO00o;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    oooO0OO.f86288OooO0O0 = i;
                } else {
                    int iOooO00o = oooO0OO.OooO00o();
                    while (true) {
                        if ((iOooO00o < 65 || iOooO00o > 90) && (iOooO00o < 97 || iOooO00o > 122)) {
                            break;
                        }
                        iOooO00o = oooO0OO.OooO00o();
                    }
                    strSubstring = str.substring(i, oooO0OO.f86288OooO0O0);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(OooO0o0.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!oooO0OO.OooOOOo()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean OooO0o(C25341OooOOo0 c25341OooOOo0, int i, ArrayList arrayList, int i2, C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
        C25340OooOOo c25340OooOOo = (C25340OooOOo) c25341OooOOo0.f86334OooO00o.get(i);
        if (!OooO(c25340OooOOo, abstractC25373Oooo0OO)) {
            return false;
        }
        EnumC25335OooO0Oo enumC25335OooO0Oo = EnumC25335OooO0Oo.f86311OooOo0o;
        EnumC25335OooO0Oo enumC25335OooO0Oo2 = c25340OooOOo.f86330OooO00o;
        if (enumC25335OooO0Oo2 == enumC25335OooO0Oo) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!OooO0oo(c25341OooOOo0, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC25335OooO0Oo2 == EnumC25335OooO0Oo.f86310OooOo) {
            return OooO0oo(c25341OooOOo0, i - 1, arrayList, i2);
        }
        int iOooO00o = OooO00o(arrayList, i2, abstractC25373Oooo0OO);
        if (iOooO00o <= 0) {
            return false;
        }
        return OooO0o(c25341OooOOo0, i - 1, arrayList, i2, (C25345OooO0o.AbstractC25373Oooo0OO) abstractC25373Oooo0OO.f86521OooO0O0.getChildren().get(iOooO00o - 1));
    }

    public static boolean OooO0oO(C25341OooOOo0 c25341OooOOo0, C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC25373Oooo0OO.f86521OooO0O0;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((C25345OooO0o.Oooo0o) obj).f86521OooO0O0;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c25341OooOOo0.f86334OooO00o;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return OooO((C25340OooOOo) c25341OooOOo0.f86334OooO00o.get(0), abstractC25373Oooo0OO);
        }
        ArrayList arrayList3 = c25341OooOOo0.f86334OooO00o;
        return OooO0o(c25341OooOOo0, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC25373Oooo0OO);
    }

    public static boolean OooO0oo(C25341OooOOo0 c25341OooOOo0, int i, ArrayList arrayList, int i2) {
        C25340OooOOo c25340OooOOo = (C25340OooOOo) c25341OooOOo0.f86334OooO00o.get(i);
        C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO = (C25345OooO0o.AbstractC25373Oooo0OO) arrayList.get(i2);
        if (!OooO(c25340OooOOo, abstractC25373Oooo0OO)) {
            return false;
        }
        EnumC25335OooO0Oo enumC25335OooO0Oo = EnumC25335OooO0Oo.f86311OooOo0o;
        EnumC25335OooO0Oo enumC25335OooO0Oo2 = c25340OooOOo.f86330OooO00o;
        if (enumC25335OooO0Oo2 == enumC25335OooO0Oo) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (OooO0oo(c25341OooOOo0, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC25335OooO0Oo2 == EnumC25335OooO0Oo.f86310OooOo) {
            return OooO0oo(c25341OooOOo0, i - 1, arrayList, i2 - 1);
        }
        int iOooO00o = OooO00o(arrayList, i2, abstractC25373Oooo0OO);
        if (iOooO00o <= 0) {
            return false;
        }
        return OooO0o(c25341OooOOo0, i - 1, arrayList, i2, (C25345OooO0o.AbstractC25373Oooo0OO) abstractC25373Oooo0OO.f86521OooO0O0.getChildren().get(iOooO00o - 1));
    }

    public final void OooO0O0(C25339OooOOOo c25339OooOOOo, OooO0OO oooO0OO) throws C25333OooO00o {
        int iIntValue;
        int iOooOOo;
        String strOooOo00 = oooO0OO.OooOo00();
        oooO0OO.OooOOo0();
        if (strOooOo00 == null) {
            throw new C25333OooO00o("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f86293OooO0OO && strOooOo00.equals("media")) {
            ArrayList<OooO0o0> arrayListOooO0OO = OooO0OO(oooO0OO);
            if (!oooO0OO.OooO0Oo('{')) {
                throw new C25333OooO00o("Invalid @media rule: missing rule set");
            }
            oooO0OO.OooOOo0();
            OooO0o0 oooO0o0 = this.f86291OooO00o;
            for (OooO0o0 oooO0o02 : arrayListOooO0OO) {
                if (oooO0o02 == OooO0o0.f86315OooOo0o || oooO0o02 == oooO0o0) {
                    this.f86293OooO0OO = true;
                    c25339OooOOOo.OooO0O0(OooO0o0(oooO0OO));
                    this.f86293OooO0OO = false;
                    break;
                }
            }
            OooO0o0(oooO0OO);
            if (!oooO0OO.OooO0o() && !oooO0OO.OooO0Oo('}')) {
                throw new C25333OooO00o("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f86293OooO0OO || !strOooOo00.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strOooOo00 + " rule");
            while (!oooO0OO.OooO0o() && ((iIntValue = oooO0OO.OooO0oo().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strOooOOoo = null;
            if (!oooO0OO.OooO0o()) {
                int i2 = oooO0OO.f86288OooO0O0;
                if (oooO0OO.OooO0o0("url(")) {
                    oooO0OO.OooOOo0();
                    String strOooOOoo2 = oooO0OO.OooOOoo();
                    if (strOooOOoo2 == null) {
                        StringBuilder sb = new StringBuilder();
                        while (!oooO0OO.OooO0o()) {
                            int i3 = oooO0OO.f86288OooO0O0;
                            String str = oooO0OO.f86287OooO00o;
                            char cCharAt = str.charAt(i3);
                            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || C25328OooO.C25332OooO0oo.OooO0oO(cCharAt) || Character.isISOControl((int) cCharAt)) {
                                break;
                            }
                            oooO0OO.f86288OooO0O0++;
                            if (cCharAt == '\\') {
                                if (!oooO0OO.OooO0o()) {
                                    int i4 = oooO0OO.f86288OooO0O0;
                                    oooO0OO.f86288OooO0O0 = i4 + 1;
                                    cCharAt = str.charAt(i4);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iOooOOo2 = OooO0OO.OooOOo(cCharAt);
                                        if (iOooOOo2 != -1) {
                                            for (int i5 = 1; i5 <= 5 && !oooO0OO.OooO0o() && (iOooOOo = OooO0OO.OooOOo(str.charAt(oooO0OO.f86288OooO0O0))) != -1; i5++) {
                                                oooO0OO.f86288OooO0O0++;
                                                iOooOOo2 = (iOooOOo2 * 16) + iOooOOo;
                                            }
                                            sb.append((char) iOooOOo2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strOooOOoo2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strOooOOoo2 == null) {
                        oooO0OO.f86288OooO0O0 = i2;
                    } else {
                        oooO0OO.OooOOo0();
                        if (oooO0OO.OooO0o() || oooO0OO.OooO0o0(")")) {
                            strOooOOoo = strOooOOoo2;
                        } else {
                            oooO0OO.f86288OooO0O0 = i2;
                        }
                    }
                }
            }
            if (strOooOOoo == null) {
                strOooOOoo = oooO0OO.OooOOoo();
            }
            if (strOooOOoo == null) {
                throw new C25333OooO00o("Invalid @import rule: expected string or url()");
            }
            oooO0OO.OooOOo0();
            OooO0OO(oooO0OO);
            if (!oooO0OO.OooO0o() && !oooO0OO.OooO0Oo(';')) {
                throw new C25333OooO00o("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        oooO0OO.OooOOo0();
    }

    public final boolean OooO0Oo(C25339OooOOOo c25339OooOOOo, OooO0OO oooO0OO) throws C25333OooO00o {
        ArrayList<C25341OooOOo0> arrayListOooOo0 = oooO0OO.OooOo0();
        if (arrayListOooOo0 == null || arrayListOooOo0.isEmpty()) {
            return false;
        }
        if (!oooO0OO.OooO0Oo('{')) {
            throw new C25333OooO00o("Malformed rule block: expected '{'");
        }
        oooO0OO.OooOOo0();
        C25345OooO0o.C25363OooOooO c25363OooOooO = new C25345OooO0o.C25363OooOooO();
        do {
            String strOooOo00 = oooO0OO.OooOo00();
            oooO0OO.OooOOo0();
            if (!oooO0OO.OooO0Oo(':')) {
                throw new C25333OooO00o("Expected ':'");
            }
            oooO0OO.OooOOo0();
            String strSubstring = null;
            if (!oooO0OO.OooO0o()) {
                int i = oooO0OO.f86288OooO0O0;
                String str = oooO0OO.f86287OooO00o;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!C25328OooO.C25332OooO0oo.OooO0oO(iCharAt)) {
                        i2 = oooO0OO.f86288OooO0O0 + 1;
                    }
                    iCharAt = oooO0OO.OooO00o();
                }
                if (oooO0OO.f86288OooO0O0 > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    oooO0OO.f86288OooO0O0 = i;
                }
            }
            if (strSubstring == null) {
                throw new C25333OooO00o("Expected property value");
            }
            oooO0OO.OooOOo0();
            if (oooO0OO.OooO0Oo('!')) {
                oooO0OO.OooOOo0();
                if (!oooO0OO.OooO0o0("important")) {
                    throw new C25333OooO00o("Malformed rule set: found unexpected '!'");
                }
                oooO0OO.OooOOo0();
            }
            oooO0OO.OooO0Oo(';');
            C25328OooO.OooOooo(c25363OooOooO, strOooOo00, strSubstring);
            oooO0OO.OooOOo0();
            if (oooO0OO.OooO0o()) {
                break;
            }
        } while (!oooO0OO.OooO0Oo('}'));
        oooO0OO.OooOOo0();
        for (C25341OooOOo0 c25341OooOOo0 : arrayListOooOo0) {
            OooOOOO oooOOOO = new OooOOOO();
            oooOOOO.f86326OooO00o = c25341OooOOo0;
            oooOOOO.f86327OooO0O0 = c25363OooOooO;
            oooOOOO.f86328OooO0OO = this.f86292OooO0O0;
            c25339OooOOOo.OooO00o(oooOOOO);
        }
        return true;
    }

    public final C25339OooOOOo OooO0o0(OooO0OO oooO0OO) {
        C25339OooOOOo c25339OooOOOo = new C25339OooOOOo();
        while (!oooO0OO.OooO0o()) {
            try {
                if (!oooO0OO.OooO0o0("<!--") && !oooO0OO.OooO0o0("-->")) {
                    if (!oooO0OO.OooO0Oo('@')) {
                        if (!OooO0Oo(c25339OooOOOo, oooO0OO)) {
                            break;
                        }
                    } else {
                        OooO0O0(c25339OooOOOo, oooO0OO);
                    }
                }
            } catch (C25333OooO00o e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
            }
        }
        return c25339OooOOOo;
    }
}
