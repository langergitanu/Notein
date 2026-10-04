package o000o0O0;

import OooO0o.C20424OooO0Oo;
import OooOo.C20495Oooo0OO;
import OooOo.C20496Oooo0o0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C24039Oooo0o0;
import o000o0O.C24563OooO00o;
import o000o0O0.C24580OooOOoo;
import o000o0O0.C24600Oooo0OO;
import oO00ooO.C32460OooOooO;
import oO0o0O0O.C33562OooO00o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34426OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34447Oooo0o0;

/* JADX INFO: renamed from: o000o0O0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24583OooOo0o {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final /* synthetic */ int f83294Oooo000 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24585OooOoO0 f83295OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f83296OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public CharSequence f83297OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f83298OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ArrayList f83299OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final LinkedHashMap f83300OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOo.Oooo0<C24567OooO0o0> f83301OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f83302OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public String f83303OooOooo;

    /* JADX INFO: renamed from: o000o0O0.OooOo0o$OooO00o */
    public static final class OooO00o {
        public static String OooO00o(Context context, int i) {
            String strValueOf;
            kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOo0o$OooO0O0 */
    public static final class OooO0O0 implements Comparable<OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Bundle f83304OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C24583OooOo0o f83305OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final boolean f83306OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final boolean f83307OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final int f83308OooOoOO;

        public OooO0O0(C24583OooOo0o destination, Bundle bundle, boolean z, boolean z2, int i) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
            this.f83305OooOo0o = destination;
            this.f83304OooOo = bundle;
            this.f83307OooOoO0 = z;
            this.f83306OooOoO = z2;
            this.f83308OooOoOO = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final int compareTo(OooO0O0 other) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
            boolean z = other.f83307OooOoO0;
            boolean z2 = this.f83307OooOoO0;
            if (z2 && !z) {
                return 1;
            }
            if (!z2 && z) {
                return -1;
            }
            Bundle bundle = other.f83304OooOo;
            Bundle bundle2 = this.f83304OooOo;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z3 = other.f83306OooOoO;
            boolean z4 = this.f83306OooOoO;
            if (z4 && !z3) {
                return 1;
            }
            if (z4 || !z3) {
                return this.f83308OooOoOO - other.f83308OooOoOO;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public C24583OooOo0o(Oooo0<? extends C24583OooOo0o> oooo0) {
        LinkedHashMap linkedHashMap = C24600Oooo0OO.f83364OooO0O0;
        this.f83296OooOo0o = C24600Oooo0OO.OooO00o.OooO00o(oooo0.getClass());
        this.f83299OooOoOO = new ArrayList();
        this.f83301OooOoo0 = new OooOo.Oooo0<>();
        this.f83300OooOoo = new LinkedHashMap();
    }

    public final void OooO0O0(C24580OooOOoo c24580OooOOoo) {
        Map mapOooOOO0 = C34444Oooo0O0.OooOOO0(this.f83300OooOoo);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOooOOO0.entrySet()) {
            OooO oooO = (OooO) entry.getValue();
            if (!oooO.f83169OooO0O0 && !oooO.f83170OooO0OO) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            ArrayList arrayList2 = c24580OooOOoo.f83272OooO0Oo;
            Collection collectionValues = c24580OooOOoo.f83274OooO0o0.values();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                C34431OooOo0.OooOo0o(arrayList3, ((C24580OooOOoo.OooO00o) it.next()).f83281OooO0O0);
            }
            if (!oOo000Oo.OooOo.OooooOO(arrayList2, arrayList3).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f83299OooOoOO.add(c24580OooOOoo);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + c24580OooOOoo.f83269OooO00o + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    public final Bundle OooO0Oo(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f83300OooOoo;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            OooO oooO = (OooO) entry.getValue();
            oooO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            if (oooO.f83170OooO0OO) {
                oooO.f83168OooO00o.OooO0Oo(bundle2, name, oooO.f83171OooO0Oo);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                OooO oooO2 = (OooO) entry2.getValue();
                oooO2.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(name2, "name");
                AbstractC24590OooOooo<Object> abstractC24590OooOooo = oooO2.f83168OooO00o;
                if (oooO2.f83169OooO0O0 || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        abstractC24590OooOooo.OooO00o(bundle2, name2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Wrong argument type for '", name2, "' in argument bundle. ");
                sbOooO0o0.append(abstractC24590OooOooo.OooO0O0());
                sbOooO0o0.append(" expected.");
                throw new IllegalArgumentException(sbOooO0o0.toString().toString());
            }
        }
        return bundle2;
    }

    public final C24567OooO0o0 OooO0o(int i) {
        OooOo.Oooo0<C24567OooO0o0> oooo0 = this.f83301OooOoo0;
        C24567OooO0o0 c24567OooO0o0OooO0OO = oooo0.OooO0o() == 0 ? null : oooo0.OooO0OO(i);
        if (c24567OooO0o0OooO0OO != null) {
            return c24567OooO0o0OooO0OO;
        }
        C24585OooOoO0 c24585OooOoO0 = this.f83295OooOo;
        if (c24585OooOoO0 != null) {
            return c24585OooOoO0.OooO0o(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] OooO0o0(C24583OooOo0o c24583OooOo0o) {
        C34426OooOO0o c34426OooOO0o = new C34426OooOO0o();
        C24583OooOo0o c24583OooOo0o2 = this;
        while (true) {
            C24585OooOoO0 c24585OooOoO0 = c24583OooOo0o2.f83295OooOo;
            if ((c24583OooOo0o != null ? c24583OooOo0o.f83295OooOo : null) != null) {
                C24585OooOoO0 c24585OooOoO02 = c24583OooOo0o.f83295OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c24585OooOoO02);
                if (c24585OooOoO02.OooOO0(c24583OooOo0o2.f83302OooOooO, true) != c24583OooOo0o2) {
                    if (c24585OooOoO0 == null || c24585OooOoO0.f83313Oooo00o != c24583OooOo0o2.f83302OooOooO) {
                        c34426OooOO0o.addFirst(c24583OooOo0o2);
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c24585OooOoO0, c24583OooOo0o) || c24585OooOoO0 == null) {
                        break;
                    }
                    c24583OooOo0o2 = c24585OooOoO0;
                } else {
                    c34426OooOO0o.addFirst(c24583OooOo0o2);
                    break;
                }
            }
        }
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(c34426OooOO0o);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO0ooOO0, 10));
        Iterator it = listO0ooOO0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C24583OooOo0o) it.next()).f83302OooOooO));
        }
        return oOo000Oo.OooOo.o00oO0O(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooO0O0 OooO0oO(C24581OooOo0 c24581OooOo0) {
        Bundle bundle;
        int i;
        List listOooO0oO;
        List listO00Oo0;
        String str;
        Matcher matcher;
        List listOooO0oO2;
        String str2;
        Bundle bundle2;
        Matcher matcher2;
        LinkedHashMap linkedHashMap;
        Uri uri;
        Map map;
        String strGroup;
        C24583OooOo0o c24583OooOo0o = this;
        ArrayList<C24580OooOOoo> arrayList = c24583OooOo0o.f83299OooOoOO;
        Bundle bundle3 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        OooO0O0 oooO0O0 = null;
        for (C24580OooOOoo c24580OooOOoo : arrayList) {
            Uri uri2 = c24581OooOo0.f83284OooO00o;
            if (uri2 != null) {
                Map mapOooOOO0 = C34444Oooo0O0.OooOOO0(c24583OooOo0o.f83300OooOoo);
                c24580OooOOoo.getClass();
                Pattern pattern = (Pattern) c24580OooOOoo.f83275OooO0oO.getValue();
                Matcher matcher3 = pattern != null ? pattern.matcher(uri2.toString()) : bundle3;
                if (matcher3 != 0 && matcher3.matches()) {
                    bundle2 = new Bundle();
                    ArrayList arrayList2 = c24580OooOOoo.f83272OooO0Oo;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str3 = (String) arrayList2.get(i2);
                        i2++;
                        String value = Uri.decode(matcher3.group(i2));
                        OooO oooO = (OooO) mapOooOOO0.get(str3);
                        try {
                            kotlin.jvm.internal.OooOOO0.OooO0o(value, "value");
                            C24580OooOOoo.OooO0O0(bundle2, str3, value, oooO);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (c24580OooOOoo.f83276OooO0oo) {
                        LinkedHashMap linkedHashMap2 = c24580OooOOoo.f83274OooO0o0;
                        for (String str4 : linkedHashMap2.keySet()) {
                            C24580OooOOoo.OooO00o oooO00o = (C24580OooOOoo.OooO00o) linkedHashMap2.get(str4);
                            String queryParameter = uri2.getQueryParameter(str4);
                            if (c24580OooOOoo.f83268OooO) {
                                String string = uri2.toString();
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "deepLink.toString()");
                                String strOoooOo0 = C33599OooOo0O.OoooOo0('?', string, string);
                                if (!strOoooOo0.equals(string)) {
                                    queryParameter = strOoooOo0;
                                }
                            }
                            if (queryParameter != null) {
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
                                matcher2 = Pattern.compile(oooO00o.f83280OooO00o, 32).matcher(queryParameter);
                                if (!matcher2.matches()) {
                                    break;
                                }
                            } else {
                                matcher2 = null;
                            }
                            Bundle bundle4 = new Bundle();
                            try {
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
                                ArrayList arrayList3 = oooO00o.f83281OooO0O0;
                                int size2 = arrayList3.size();
                                int i3 = 0;
                                while (i3 < size2) {
                                    if (matcher2 != null) {
                                        strGroup = matcher2.group(i3 + 1);
                                        if (strGroup == null) {
                                            strGroup = "";
                                        }
                                    } else {
                                        strGroup = null;
                                    }
                                    String str5 = (String) arrayList3.get(i3);
                                    linkedHashMap = linkedHashMap2;
                                    try {
                                        OooO oooO2 = (OooO) mapOooOOO0.get(str5);
                                        if (strGroup != null) {
                                            uri = uri2;
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                map = mapOooOOO0;
                                                try {
                                                    sb.append('{');
                                                    sb.append(str5);
                                                    sb.append('}');
                                                    if (!strGroup.equals(sb.toString())) {
                                                        C24580OooOOoo.OooO0O0(bundle4, str5, strGroup, oooO2);
                                                    }
                                                } catch (IllegalArgumentException unused2) {
                                                }
                                            } catch (IllegalArgumentException unused3) {
                                                map = mapOooOOO0;
                                            }
                                        } else {
                                            uri = uri2;
                                            map = mapOooOOO0;
                                        }
                                        i3++;
                                        uri2 = uri;
                                        linkedHashMap2 = linkedHashMap;
                                        mapOooOOO0 = map;
                                    } catch (IllegalArgumentException unused4) {
                                        uri = uri2;
                                        map = mapOooOOO0;
                                        uri2 = uri;
                                        linkedHashMap2 = linkedHashMap;
                                        mapOooOOO0 = map;
                                    }
                                }
                                linkedHashMap = linkedHashMap2;
                                uri = uri2;
                                map = mapOooOOO0;
                                bundle2.putAll(bundle4);
                            } catch (IllegalArgumentException unused5) {
                                linkedHashMap = linkedHashMap2;
                            }
                            uri2 = uri;
                            linkedHashMap2 = linkedHashMap;
                            mapOooOOO0 = map;
                        }
                        for (Map.Entry entry : mapOooOOO0.entrySet()) {
                            String str6 = (String) entry.getKey();
                            OooO oooO3 = (OooO) entry.getValue();
                            if (oooO3 != null && !oooO3.f83169OooO0O0 && !oooO3.f83170OooO0OO && !bundle2.containsKey(str6)) {
                                bundle2 = null;
                            }
                        }
                    } else {
                        while (r1.hasNext()) {
                        }
                    }
                } else {
                    bundle2 = bundle3;
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str7 = c24581OooOo0.f83285OooO0O0;
            boolean z = str7 != null && str7.equals(c24580OooOOoo.f83270OooO0O0);
            String str8 = c24581OooOo0.f83286OooO0OO;
            if (str8 != null) {
                c24580OooOOoo.getClass();
                String str9 = c24580OooOOoo.f83271OooO0OO;
                if (str9 != null) {
                    Pattern pattern2 = (Pattern) c24580OooOOoo.f83278OooOO0O.getValue();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(pattern2);
                    if (pattern2.matcher(str8).matches()) {
                        Pattern patternCompile = Pattern.compile("/");
                        kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
                        Matcher matcher4 = patternCompile.matcher(str9);
                        if (matcher4.find()) {
                            ArrayList arrayList4 = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList4.add(str9.subSequence(iEnd, matcher4.start()).toString());
                                iEnd = matcher4.end();
                            } while (matcher4.find());
                            arrayList4.add(str9.subSequence(iEnd, str9.length()).toString());
                            listOooO0oO = arrayList4;
                        } else {
                            listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(str9.toString());
                        }
                        boolean zIsEmpty = listOooO0oO.isEmpty();
                        List listO00Oo02 = C34434OooOoO.f123453OooOo0o;
                        if (zIsEmpty) {
                            listO00Oo0 = listO00Oo02;
                            String str10 = (String) listO00Oo0.get(0);
                            str = (String) listO00Oo0.get(1);
                            Pattern patternCompile2 = Pattern.compile("/");
                            kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile2, "compile(...)");
                            matcher = patternCompile2.matcher(str8);
                            if (matcher.find()) {
                            }
                            if (!listOooO0oO2.isEmpty()) {
                            }
                            List list = listO00Oo02;
                            String str11 = (String) list.get(0);
                            str2 = (String) list.get(1);
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str10, str11)) {
                            }
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, str2)) {
                            }
                        } else {
                            ListIterator listIterator = listOooO0oO.listIterator(listOooO0oO.size());
                            while (listIterator.hasPrevious()) {
                                if (((String) listIterator.previous()).length() != 0) {
                                    listO00Oo0 = oOo000Oo.OooOo.o00Oo0(listOooO0oO, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                            listO00Oo0 = listO00Oo02;
                            String str102 = (String) listO00Oo0.get(0);
                            str = (String) listO00Oo0.get(1);
                            Pattern patternCompile22 = Pattern.compile("/");
                            kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile22, "compile(...)");
                            matcher = patternCompile22.matcher(str8);
                            if (matcher.find()) {
                                listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(str8.toString());
                            } else {
                                ArrayList arrayList5 = new ArrayList(10);
                                int iEnd2 = 0;
                                do {
                                    arrayList5.add(str8.subSequence(iEnd2, matcher.start()).toString());
                                    iEnd2 = matcher.end();
                                } while (matcher.find());
                                arrayList5.add(str8.subSequence(iEnd2, str8.length()).toString());
                                listOooO0oO2 = arrayList5;
                            }
                            if (!listOooO0oO2.isEmpty()) {
                                ListIterator listIterator2 = listOooO0oO2.listIterator(listOooO0oO2.size());
                                while (true) {
                                    if (!listIterator2.hasPrevious()) {
                                        break;
                                    }
                                    if (((String) listIterator2.previous()).length() != 0) {
                                        listO00Oo02 = oOo000Oo.OooOo.o00Oo0(listOooO0oO2, listIterator2.nextIndex() + 1);
                                        break;
                                    }
                                }
                            }
                            List list2 = listO00Oo02;
                            String str112 = (String) list2.get(0);
                            str2 = (String) list2.get(1);
                            i = !kotlin.jvm.internal.OooOOO0.OooO0O0(str102, str112) ? 2 : 0;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, str2)) {
                                i++;
                            }
                        }
                    } else {
                        i = -1;
                    }
                }
            }
            if (bundle != null || z || i > -1) {
                OooO0O0 oooO0O02 = new OooO0O0(this, bundle, c24580OooOOoo.f83279OooOO0o, z, i);
                if (oooO0O0 == null || oooO0O02.compareTo(oooO0O0) > 0) {
                    bundle3 = null;
                    c24583OooOo0o = this;
                    oooO0O0 = oooO0O02;
                }
            }
            bundle3 = null;
            c24583OooOo0o = this;
        }
        return oooO0O0;
    }

    public void OooO0oo(Context context, AttributeSet attributeSet) {
        Object next;
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C24563OooO00o.f83167OooO0o0);
        kotlin.jvm.internal.OooOOO0.OooO0o(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = typedArrayObtainAttributes.getString(2);
        if (string == null) {
            this.f83302OooOooO = 0;
            this.f83298OooOoO0 = null;
        } else {
            if (C33599OooOo0O.Oooo0o0(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            this.f83302OooOooO = strConcat.hashCode();
            this.f83298OooOoO0 = null;
            OooO0O0(new C24580OooOOoo(strConcat, null, null));
        }
        ArrayList arrayList = this.f83299OooOoOO;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = ((C24580OooOOoo) next).f83269OooO00o;
            String str2 = this.f83303OooOooo;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, str2 != null ? "android-app://androidx.navigation/".concat(str2) : "")) {
                break;
            }
        }
        C24039Oooo0o0.OooO00o(arrayList);
        arrayList.remove(next);
        this.f83303OooOooo = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.f83302OooOooO = resourceId;
            this.f83298OooOoO0 = null;
            this.f83298OooOoO0 = OooO00o.OooO00o(context, resourceId);
        }
        this.f83297OooOoO = typedArrayObtainAttributes.getText(0);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        typedArrayObtainAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[EDGE_INSN: B:62:0x010a->B:46:0x010a BREAK  A[LOOP:2: B:30:0x0098->B:65:?], EDGE_INSN: B:63:0x010a->B:46:0x010a BREAK  A[LOOP:2: B:30:0x0098->B:65:?], EDGE_INSN: B:46:0x010a->B:47:0x010b BREAK  A[LOOP:3: B:38:0x00d7->B:69:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        int size;
        LinkedHashMap linkedHashMap;
        boolean z2;
        if (obj != null && (obj instanceof C24583OooOo0o)) {
            ArrayList arrayList = this.f83299OooOoOO;
            C24583OooOo0o c24583OooOo0o = (C24583OooOo0o) obj;
            boolean z3 = oOo000Oo.OooOo.OoooO0O(arrayList, c24583OooOo0o.f83299OooOoOO).size() == arrayList.size();
            OooOo.Oooo0<C24567OooO0o0> oooo0 = this.f83301OooOoo0;
            int iOooO0o = oooo0.OooO0o();
            OooOo.Oooo0<C24567OooO0o0> oooo02 = c24583OooOo0o.f83301OooOoo0;
            if (iOooO0o == oooo02.OooO0o()) {
                Iterator it = ((C33562OooO00o) C33574OooOOO0.OooO0o(C20496Oooo0o0.OooO(oooo0))).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!oooo02.OooO0O0((C24567OooO0o0) it.next())) {
                            break;
                        }
                    } else {
                        Iterator it2 = ((C33562OooO00o) C33574OooOOO0.OooO0o(C20496Oooo0o0.OooO(oooo02))).iterator();
                        while (it2.hasNext()) {
                            if (!oooo0.OooO0O0((C24567OooO0o0) it2.next())) {
                            }
                        }
                        z = true;
                    }
                }
                z = false;
                LinkedHashMap linkedHashMap2 = this.f83300OooOoo;
                size = C34444Oooo0O0.OooOOO0(linkedHashMap2).size();
                linkedHashMap = c24583OooOo0o.f83300OooOoo;
                if (size != C34444Oooo0O0.OooOOO0(linkedHashMap).size()) {
                    Iterator it3 = C34447Oooo0o0.OooOOOo(C34444Oooo0O0.OooOOO0(linkedHashMap2)).f123452OooO00o.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            if (!C34444Oooo0O0.OooOOO0(linkedHashMap).containsKey(entry.getKey()) || !kotlin.jvm.internal.OooOOO0.OooO0O0(C34444Oooo0O0.OooOOO0(linkedHashMap).get(entry.getKey()), entry.getValue())) {
                                break;
                            }
                        } else {
                            for (Map.Entry entry2 : C34447Oooo0o0.OooOOOo(C34444Oooo0O0.OooOOO0(linkedHashMap)).f123452OooO00o) {
                                if (!C34444Oooo0O0.OooOOO0(linkedHashMap2).containsKey(entry2.getKey()) || !kotlin.jvm.internal.OooOOO0.OooO0O0(C34444Oooo0O0.OooOOO0(linkedHashMap2).get(entry2.getKey()), entry2.getValue())) {
                                }
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                    if (this.f83302OooOooO != c24583OooOo0o.f83302OooOooO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83303OooOooo, c24583OooOo0o.f83303OooOooo) && z3 && z && z2) {
                        return true;
                    }
                } else {
                    z2 = false;
                    if (this.f83302OooOooO != c24583OooOo0o.f83302OooOooO) {
                    }
                }
            } else {
                z = false;
                LinkedHashMap linkedHashMap22 = this.f83300OooOoo;
                size = C34444Oooo0O0.OooOOO0(linkedHashMap22).size();
                linkedHashMap = c24583OooOo0o.f83300OooOoo;
                if (size != C34444Oooo0O0.OooOOO0(linkedHashMap).size()) {
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.f83302OooOooO * 31;
        String str = this.f83303OooOooo;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (C24580OooOOoo c24580OooOOoo : this.f83299OooOoOO) {
            int i2 = iHashCode * 31;
            String str2 = c24580OooOOoo.f83269OooO00o;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = c24580OooOOoo.f83270OooO0O0;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = c24580OooOOoo.f83271OooO0OO;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C20495Oooo0OO c20495Oooo0OOOooO = C20496Oooo0o0.OooO(this.f83301OooOoo0);
        while (c20495Oooo0OOOooO.hasNext()) {
            C24567OooO0o0 c24567OooO0o0 = (C24567OooO0o0) c20495Oooo0OOOooO.next();
            int i3 = ((iHashCode * 31) + c24567OooO0o0.f83181OooO00o) * 31;
            C24587OooOoo c24587OooOoo = c24567OooO0o0.f83182OooO0O0;
            iHashCode = i3 + (c24587OooOoo != null ? c24587OooOoo.hashCode() : 0);
            Bundle bundle = c24567OooO0o0.f83183OooO0OO;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i4 = iHashCode * 31;
                    Bundle bundle2 = c24567OooO0o0.f83183OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i4 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        LinkedHashMap linkedHashMap = this.f83300OooOoo;
        for (String str6 : C34444Oooo0O0.OooOOO0(linkedHashMap).keySet()) {
            int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(iHashCode * 31, 31, str6);
            Object obj2 = C34444Oooo0O0.OooOOO0(linkedHashMap).get(str6);
            iHashCode = iOooO0O0 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f83298OooOoO0;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f83302OooOooO));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f83303OooOooo;
        if (str2 != null && !C33599OooOo0O.Oooo0o0(str2)) {
            sb.append(" route=");
            sb.append(this.f83303OooOooo);
        }
        if (this.f83297OooOoO != null) {
            sb.append(" label=");
            sb.append(this.f83297OooOoO);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
        return string;
    }
}
