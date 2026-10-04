package o0ooO0oO;

import Oooo0.o0OoOo0;
import android.util.Log;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.android.billingclient.api.C22193OoooOOO;
import com.aspose.words.StyleIdentifier;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31432OooO;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31437OooO0o;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31442OooOO0O;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31450OooOOoo;
import o0ooO0o.C31454OooO;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31456OooO0O0;
import o0ooO0o.C31458OooO0Oo;
import o0ooO0o.C31462OooO0oo;
import o0ooO0oo.C31489OooO0o;
import o0ooOO0o.C31610OooO;
import o0ooOO0o.C31611OooO00o;
import o0ooOO0o.C31612OooO0O0;
import o0ooOO0o.C31614OooO0Oo;
import o0ooOO0o.C31615OooO0o;
import o0ooOO0o.C31616OooO0o0;
import o0ooOO0o.C31618OooO0oo;
import o0ooOO0o.C31619OooOO0;
import o0ooOoo.AbstractC31673OooO0o;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31669OooO00o;
import o0ooOoo.C31675OooO0oO;
import o0ooOoo.C31676OooO0oo;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0ooOoo.InterfaceC31672OooO0Oo;
import o0ooOooo.C31677OooO00o;
import o0ooOooo.C31678OooO0O0;
import o0ooOooo.C31679OooO0OO;
import o0ooOooo.C31681OooO0o0;
import o0ooo0o.C31766OooO0o0;
import o0ooo0oo.C31770OooO0OO;
import o0oooO.C31783OooO00o;
import o0oooO0.AbstractC31784OooO00o;
import o0oooO0.AbstractC31786OooO0OO;
import o0oooO00.AbstractC31793OooO00o;
import o0oooO0O.AbstractC31817OooO0oo;
import o0oooO0O.C31809OooO;
import o0oooO0O.C31811OooO0O0;
import o0oooO0o.AbstractC31833OooO0Oo;
import o0oooO0o.C31830OooO00o;
import o0oooO0o.C31831OooO0O0;
import o0oooO0o.C31832OooO0OO;

/* JADX INFO: renamed from: o0ooO0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31483OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f112612OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public FileOutputStream f112613OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f112614OooO0Oo = 1;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f112611OooO00o = new ArrayList();

    public static void OooO(C31433OooO00o c31433OooO00o, C31436OooO0Oo c31436OooO0Oo, C31441OooOO0 c31441OooOO0) {
        for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
            if (abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo) {
                C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO;
                c31436OooO0Oo2.o000OoOO(C31441OooOO0.o00O00, c31436OooO0Oo);
                if (c31441OooOO0 != null) {
                    c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112393o00O0o0, c31441OooOO0);
                }
            }
        }
    }

    public static LinkedHashMap OooO0OO(AbstractC31673OooO0o abstractC31673OooO0o) throws IOException {
        Map mapUnmodifiableMap;
        C31433OooO00o c31433OooO00oOooo0 = abstractC31673OooO0o.f113210OooOo0o.Oooo0(C31441OooOO0.f112360o000oo0o);
        C31669OooO00o c31669OooO00o = null;
        if (c31433OooO00oOooo0 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = c31433OooO00oOooo0.f112214OooOo;
            if (arrayList.size() % 2 != 0) {
                Log.w("PdfBox-Android", "Names array has odd size: " + arrayList.size());
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= arrayList.size()) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                    break;
                }
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00oOooo0.Oooo0OO(i);
                if (!(abstractC31434OooO0O0Oooo0OO instanceof C31450OooOOoo)) {
                    throw new IOException("Expected string, found " + abstractC31434OooO0O0Oooo0OO + " in name tree at index " + i);
                }
                linkedHashMap.put(((C31450OooOOoo) abstractC31434OooO0O0Oooo0OO).OooOooo(), abstractC31673OooO0o.OooO00o(c31433OooO00oOooo0.Oooo0OO(i2)));
                i += 2;
            }
        } else {
            mapUnmodifiableMap = null;
        }
        LinkedHashMap linkedHashMap2 = mapUnmodifiableMap == null ? new LinkedHashMap() : new LinkedHashMap(mapUnmodifiableMap);
        C31433OooO00o c31433OooO00oOooo02 = abstractC31673OooO0o.f113210OooOo0o.Oooo0(C31441OooOO0.f112330o000Oo);
        if (c31433OooO00oOooo02 != null) {
            ArrayList arrayList2 = c31433OooO00oOooo02.f112214OooOo;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                arrayList3.add(abstractC31673OooO0o.OooO0O0((C31436OooO0Oo) c31433OooO00oOooo02.Oooo0OO(i3)));
            }
            c31669OooO00o = new C31669OooO00o(arrayList3, c31433OooO00oOooo02);
        }
        if (c31669OooO00o != null) {
            Iterator it = c31669OooO00o.f113203OooOo.iterator();
            while (it.hasNext()) {
                linkedHashMap2.putAll(OooO0OO((AbstractC31673OooO0o) it.next()));
            }
        }
        return linkedHashMap2;
    }

    public static LinkedHashMap OooO0Oo(C31675OooO0oO c31675OooO0oO) throws IOException {
        Map mapUnmodifiableMap;
        InterfaceC31671OooO0OO interfaceC31671OooO0OONewInstance;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31675OooO0oO.f113213OooOo0o.o0000O0O(C31441OooOO0.f112361o000ooO);
        boolean z = abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o;
        Class<? extends InterfaceC31671OooO0OO> cls = c31675OooO0oO.f113212OooOo;
        C31669OooO00o c31669OooO00o = null;
        if (z) {
            C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
            HashMap map = new HashMap();
            int size = c31433OooO00o.f112214OooOo.size() % 2;
            ArrayList arrayList = c31433OooO00o.f112214OooOo;
            if (size != 0) {
                Log.w("PdfBox-Android", "Numbers array has odd size: " + arrayList.size());
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= arrayList.size()) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    break;
                }
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
                if (!(abstractC31434OooO0O0Oooo0OO instanceof C31432OooO)) {
                    Log.e("PdfBox-Android", "page labels ignored, index " + i + " should be a number, but is " + abstractC31434OooO0O0Oooo0OO);
                    break;
                }
                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO2 = c31433OooO00o.Oooo0OO(i2);
                Integer numValueOf = Integer.valueOf((int) ((C31432OooO) abstractC31434OooO0O0Oooo0OO).f112212OooOo);
                if (abstractC31434OooO0O0Oooo0OO2 == null) {
                    interfaceC31671OooO0OONewInstance = null;
                } else {
                    try {
                        interfaceC31671OooO0OONewInstance = cls.getDeclaredConstructor(abstractC31434OooO0O0Oooo0OO2.getClass()).newInstance(abstractC31434OooO0O0Oooo0OO2);
                    } catch (Throwable th) {
                        throw new IOException("Error while trying to create value in number tree:" + th.getMessage(), th);
                    }
                }
                map.put(numValueOf, interfaceC31671OooO0OONewInstance);
                i += 2;
            }
            mapUnmodifiableMap = null;
        } else {
            mapUnmodifiableMap = null;
        }
        LinkedHashMap linkedHashMap = mapUnmodifiableMap == null ? new LinkedHashMap() : new LinkedHashMap(mapUnmodifiableMap);
        C31433OooO00o c31433OooO00o2 = (C31433OooO00o) c31675OooO0oO.f113213OooOo0o.o0000O0O(C31441OooOO0.f112330o000Oo);
        if (c31433OooO00o2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < c31433OooO00o2.f112214OooOo.size(); i3++) {
                arrayList2.add(new C31675OooO0oO((C31436OooO0Oo) c31433OooO00o2.Oooo0OO(i3), cls));
            }
            c31669OooO00o = new C31669OooO00o(arrayList2, c31433OooO00o2);
        }
        if (c31669OooO00o != null) {
            Iterator it = c31669OooO00o.f113203OooOo.iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(OooO0Oo((C31675OooO0oO) it.next()));
            }
        }
        return linkedHashMap;
    }

    public static boolean OooO0o0(C31433OooO00o c31433OooO00o) {
        for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o.Oooo0OO(i);
            if (abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo) {
                C31441OooOO0 c31441OooOO0O0Oo0oo = ((C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO).o0Oo0oo(C31441OooOO0.f112393o00O0o0);
                if (C31441OooOO0.f112287o00000oO.equals(c31441OooOO0O0Oo0oo) || C31441OooOO0.f112369o00O0.equals(c31441OooOO0O0Oo0oo)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void OooO0oO(C31436OooO0Oo c31436OooO0Oo, C31436OooO0Oo c31436OooO0Oo2, Set set) {
        for (Map.Entry entry : c31436OooO0Oo.f112222OooOoO0.entrySet()) {
            if (!set.contains(entry.getKey())) {
                if (!c31436OooO0Oo2.f112222OooOoO0.containsKey((C31441OooOO0) entry.getKey())) {
                    c31436OooO0Oo2.o000OoOO((C31441OooOO0) entry.getKey(), (AbstractC31434OooO0O0) entry.getValue());
                }
            }
        }
    }

    public final void OooO00o(C31482OooO00o c31482OooO00o, C31811OooO0O0 c31811OooO0O0, C31811OooO0O0 c31811OooO0O02) throws IOException {
        AbstractC31817OooO0oo abstractC31817OooO0oo;
        List<AbstractC31817OooO0oo> listOooO0O0 = c31811OooO0O02.OooO0O0();
        if (listOooO0O0 == null || listOooO0O0.isEmpty()) {
            return;
        }
        c31811OooO0O0.getClass();
        C31809OooO c31809OooO = new C31809OooO(c31811OooO0O0);
        while (c31809OooO.hasNext()) {
            String strO000OOo0 = ((AbstractC31817OooO0oo) c31809OooO.next()).f113445OooOoO0.o000OOo0(C31441OooOO0.f112408o00OO0O);
            if (strO000OOo0.startsWith("dummyFieldName")) {
                String strSubstring = strO000OOo0.substring(14);
                if (strSubstring.matches("\\d+")) {
                    this.f112614OooO0Oo = Math.max(this.f112614OooO0Oo, Integer.parseInt(strSubstring) + 1);
                }
            }
        }
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112294o0000OOO;
        C31436OooO0Oo c31436OooO0Oo = c31811OooO0O0.f113436OooOo;
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o = c31436OooO0Oo.o0OoO0o(c31441OooOO0);
        C31433OooO00o c31433OooO00o = abstractC31434OooO0O0O0OoO0o instanceof C31433OooO00o ? (C31433OooO00o) abstractC31434OooO0O0O0OoO0o : new C31433OooO00o();
        for (AbstractC31817OooO0oo abstractC31817OooO0oo2 : c31811OooO0O02.OooO0O0()) {
            C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) c31482OooO00o.OooO00o(abstractC31817OooO0oo2.f113445OooOoO0);
            String strOooO00o = abstractC31817OooO0oo2.OooO00o();
            C31809OooO c31809OooO2 = new C31809OooO(c31811OooO0O0);
            while (true) {
                if (c31809OooO2.hasNext()) {
                    abstractC31817OooO0oo = (AbstractC31817OooO0oo) c31809OooO2.next();
                    if (abstractC31817OooO0oo.OooO00o().equals(strOooO00o)) {
                        break;
                    }
                } else {
                    abstractC31817OooO0oo = null;
                    break;
                }
            }
            if (abstractC31817OooO0oo != null) {
                C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112408o00OO0O;
                StringBuilder sb = new StringBuilder("dummyFieldName");
                int i = this.f112614OooO0Oo;
                this.f112614OooO0Oo = i + 1;
                sb.append(i);
                c31436OooO0Oo2.o000o000(c31441OooOO02, sb.toString());
            }
            c31433OooO00o.OooOooo(c31436OooO0Oo2);
        }
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112294o0000OOO, c31433OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x04c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x078b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(C31611OooO00o c31611OooO00o, C31611OooO00o c31611OooO00o2) throws IOException {
        InterfaceC31671OooO0OO interfaceC31671OooO0OOOooO0O0;
        AbstractC31784OooO00o abstractC31784OooO00oOooO00o;
        int i;
        C31433OooO00o c31433OooO00o;
        C31616OooO0o0 c31616OooO0o0;
        C31436OooO0Oo c31436OooO0Oo;
        InterfaceC31671OooO0OO c31616OooO0o02;
        InterfaceC31671OooO0OO c31614OooO0Oo;
        C31830OooO00o c31830OooO00o;
        C31612OooO0O0 c31612OooO0O0;
        C31612OooO0O0 c31612OooO0O02;
        int i2;
        String strO000OOO;
        C31436OooO0Oo c31436OooO0OoOooo0OO;
        C31441OooOO0 c31441OooOO0;
        C31448OooOOo c31448OooOOo;
        C31448OooOOo c31448OooOOo2;
        C31436OooO0Oo c31436OooO0OoOooo0OO2;
        InterfaceC31671OooO0OO interfaceC31671OooO0OOOooo0OO;
        C31441OooOO0 c31441OooOO02;
        C31681OooO0o0 c31681OooO0o0;
        int i3;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMapOooO0Oo;
        int i4;
        Iterator<C31615OooO0o> it;
        int i5;
        C31618OooO0oo.OooO00o oooO00o;
        Integer num;
        Integer num2;
        AbstractC31434OooO0O0 abstractC31434OooO0O0;
        C31783OooO00o c31783OooO00o;
        String strO000OOo0;
        C31433OooO00o c31433OooO00oOooo0;
        C31436OooO0Oo c31436OooO0Oo2;
        C31436OooO0Oo c31436OooO0Oo3;
        C31676OooO0oo c31676OooO0ooOooO0OO;
        int i6;
        AbstractC31786OooO0OO abstractC31786OooO0OO;
        Iterator<C31615OooO0o> it2;
        C31618OooO0oo.OooO00o oooO00o2;
        C31433OooO00o c31433OooO00o2;
        String str;
        if (c31611OooO00o2.f113008OooOo0o.f112232OooOooo) {
            throw new IOException("Error: source PDF is closed.");
        }
        if (c31611OooO00o.f113008OooOo0o.f112232OooOooo) {
            throw new IOException("Error: destination PDF is closed.");
        }
        C31612OooO0O0 c31612OooO0O0OooO00o = c31611OooO00o2.OooO00o();
        C22193OoooOOO c22193OoooOOO = new C22193OoooOOO();
        c22193OoooOOO.f67064OooOo0o = c31612OooO0O0OooO00o.f113015OooOo;
        C31811OooO0O0 c31811OooO0O0OooO00o = c31612OooO0O0OooO00o.OooO00o(c22193OoooOOO);
        if (c31811OooO0O0OooO00o != null) {
            if (c31811OooO0O0OooO00o.f113436OooOo.f112222OooOoO0.containsKey(C31441OooOO0.f112426o00OOooO) && c31811OooO0O0OooO00o.OooO0O0().isEmpty()) {
                throw new IOException("Error: can't merge source document containing dynamic XFA form content.");
            }
        }
        OooO0oO(c31611OooO00o2.OooO0OO().f113019OooOo0o, c31611OooO00o.OooO0OO().f113019OooOo0o, Collections.EMPTY_SET);
        float fOooOOo0 = c31611OooO00o.OooOOo0();
        float fOooOOo02 = c31611OooO00o2.OooOOo0();
        if (fOooOOo0 < fOooOOo02) {
            c31611OooO00o.OooOooo(fOooOOo02);
        }
        C31612OooO0O0 c31612OooO0O0OooO00o2 = c31611OooO00o.OooO00o();
        InterfaceC31672OooO0Oo interfaceC31672OooO0OoOooO0O0 = c31612OooO0O0OooO00o2.OooO0O0();
        C31436OooO0Oo c31436OooO0Oo4 = c31612OooO0O0OooO00o2.f113016OooOo0o;
        if (interfaceC31672OooO0OoOooO0O0 == null) {
            try {
                interfaceC31671OooO0OOOooO0O0 = c31612OooO0O0OooO00o.OooO0O0();
            } catch (IOException e) {
                Log.e("PdfBox-Android", "Invalid OpenAction ignored", e);
                interfaceC31671OooO0OOOooO0O0 = null;
            }
            if (interfaceC31671OooO0OOOooO0O0 instanceof C31770OooO0OO) {
                C31770OooO0OO c31770OooO0OO = (C31770OooO0OO) interfaceC31671OooO0OOOooO0O0;
                c31770OooO0OO.getClass();
                abstractC31784OooO00oOooO00o = AbstractC31784OooO00o.OooO00o(c31770OooO0OO.f113417OooOo0o.o0000O0O(C31441OooOO0.f112450o0ooOoO));
            } else {
                abstractC31784OooO00oOooO00o = interfaceC31671OooO0OOOooO0O0 instanceof AbstractC31784OooO00o ? (AbstractC31784OooO00o) interfaceC31671OooO0OOOooO0O0 : null;
            }
            if (abstractC31784OooO00oOooO00o instanceof AbstractC31786OooO0OO) {
                C31433OooO00o c31433OooO00o3 = ((AbstractC31786OooO0OO) abstractC31784OooO00oOooO00o).f113421OooOo0o;
                if (c31433OooO00o3.f112214OooOo.size() > 0) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO = c31433OooO00o3.Oooo0OO(0);
                    C31615OooO0o c31615OooO0o = abstractC31434OooO0O0Oooo0OO instanceof C31436OooO0Oo ? new C31615OooO0o((C31436OooO0Oo) abstractC31434OooO0O0Oooo0OO) : null;
                    if (c31615OooO0o != null) {
                        C31618OooO0oo c31618OooO0ooOooO0Oo = c31612OooO0O0OooO00o.OooO0Oo();
                        C31618OooO0oo.OooO0O0 oooO0O0 = new C31618OooO0oo.OooO0O0(c31615OooO0o);
                        i = C31618OooO0oo.OooO0O0(oooO0O0, c31618OooO0ooOooO0Oo.f113036OooOo0o) ? oooO0O0.f113041OooO0O0 : -1;
                        c31436OooO0Oo4.o000OoOo(C31441OooOO0.f112275o00, interfaceC31671OooO0OOOooO0O0);
                    }
                }
            }
        } else {
            i = -1;
        }
        C31482OooO00o c31482OooO00o = new C31482OooO00o(c31611OooO00o);
        try {
            C22193OoooOOO c22193OoooOOO2 = new C22193OoooOOO();
            c22193OoooOOO2.f67064OooOo0o = c31612OooO0O0OooO00o2.f113015OooOo;
            C31811OooO0O0 c31811OooO0O0OooO00o2 = c31612OooO0O0OooO00o2.OooO00o(c22193OoooOOO2);
            C22193OoooOOO c22193OoooOOO3 = new C22193OoooOOO();
            c22193OoooOOO3.f67064OooOo0o = c31612OooO0O0OooO00o.f113015OooOo;
            C31811OooO0O0 c31811OooO0O0OooO00o3 = c31612OooO0O0OooO00o.OooO00o(c22193OoooOOO3);
            if (c31811OooO0O0OooO00o2 != null || c31811OooO0O0OooO00o3 == null) {
                if (c31811OooO0O0OooO00o3 != null) {
                    OooO00o(c31482OooO00o, c31811OooO0O0OooO00o2, c31811OooO0O0OooO00o3);
                }
                C31441OooOO0 c31441OooOO03 = C31441OooOO0.f112410o00OO0OO;
                c31433OooO00o = (C31433OooO00o) c31436OooO0Oo4.o0000O0O(c31441OooOO03);
                C31433OooO00o c31433OooO00o4 = (C31433OooO00o) c31482OooO00o.OooO00o(c31436OooO0Oo4.o0000O0O(c31441OooOO03));
                if (c31433OooO00o != null) {
                    c31436OooO0Oo4.o000OoOO(c31441OooOO03, c31433OooO00o4);
                } else {
                    c31433OooO00o.Oooo00o(c31433OooO00o4);
                }
                C31441OooOO0 c31441OooOO04 = C31441OooOO0.f112360o000oo0o;
                C31436OooO0Oo c31436OooO0Oo5 = (C31436OooO0Oo) c31436OooO0Oo4.o0000O0O(c31441OooOO04);
                c31616OooO0o0 = c31436OooO0Oo5 != null ? null : new C31616OooO0o0(c31436OooO0Oo5);
                c31436OooO0Oo = c31612OooO0O0OooO00o.f113016OooOo0o;
                C31436OooO0Oo c31436OooO0Oo6 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO04);
                c31616OooO0o02 = c31436OooO0Oo6 != null ? null : new C31616OooO0o0(c31436OooO0Oo6);
                if (c31616OooO0o02 != null) {
                    if (c31616OooO0o0 == null) {
                        c31436OooO0Oo4.o000OoOO(c31441OooOO04, c31482OooO00o.OooO00o(c31616OooO0o02));
                    } else {
                        c31482OooO00o.OooO0O0(c31616OooO0o02, c31616OooO0o0);
                    }
                }
                if (c31616OooO0o0 != null) {
                    C31441OooOO0 c31441OooOO05 = C31441OooOO0.f112321o000O0oo;
                    C31436OooO0Oo c31436OooO0Oo7 = c31616OooO0o0.f113025OooOo0o;
                    if (c31436OooO0Oo7.f112222OooOoO0.containsKey(c31441OooOO05)) {
                        c31436OooO0Oo7.o000OOoO(c31441OooOO05);
                        Log.w("PdfBox-Android", "Removed /IDTree from /Names dictionary, doesn't belong there");
                    }
                }
                C31441OooOO0 c31441OooOO06 = C31441OooOO0.f112278o00000;
                C31436OooO0Oo c31436OooO0Oo8 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO06);
                c31614OooO0Oo = c31436OooO0Oo8 == null ? new C31614OooO0Oo(c31436OooO0Oo8) : null;
                if (c31614OooO0Oo != null) {
                    C31436OooO0Oo c31436OooO0Oo9 = (C31436OooO0Oo) c31436OooO0Oo4.o0000O0O(c31441OooOO06);
                    InterfaceC31671OooO0OO c31614OooO0Oo2 = c31436OooO0Oo9 != null ? new C31614OooO0Oo(c31436OooO0Oo9) : null;
                    if (c31614OooO0Oo2 == null) {
                        c31436OooO0Oo4.o000OoOO(c31441OooOO06, c31482OooO00o.OooO00o(c31614OooO0Oo));
                    } else {
                        c31482OooO00o.OooO0O0(c31614OooO0Oo, c31614OooO0Oo2);
                    }
                }
                C31441OooOO0 c31441OooOO07 = C31441OooOO0.f112438o00oOoo;
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO07);
                c31830OooO00o = !(abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) ? new C31830OooO00o((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O) : null;
                if (c31830OooO00o == null) {
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo4.o0000O0O(c31441OooOO07);
                    i2 = 1;
                    C31830OooO00o c31830OooO00o2 = abstractC31434OooO0O0O0000O0O2 instanceof C31436OooO0Oo ? new C31830OooO00o((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O2) : null;
                    if (c31830OooO00o2 != null) {
                        C31441OooOO0 c31441OooOO08 = C31441OooOO0.f112297o0000Oo0;
                        if (c31830OooO00o2.OooO00o(c31441OooOO08) == null) {
                            c31612OooO0O0 = c31612OooO0O0OooO00o;
                            c31612OooO0O02 = c31612OooO0O0OooO00o2;
                            c31436OooO0Oo4.o000OoOo(c31441OooOO07, new C31830OooO00o((C31436OooO0Oo) c31482OooO00o.OooO00o(c31830OooO00o)));
                        } else {
                            C31831OooO0O0 c31831OooO0O0OooO00o = c31830OooO00o2.OooO00o(c31441OooOO08);
                            while (true) {
                                c31831OooO0O0OooO00o.getClass();
                                C31831OooO0O0 c31831OooO0O0OooO00o2 = c31831OooO0O0OooO00o.OooO00o(C31441OooOO0.f112362o000ooO0);
                                if (c31831OooO0O0OooO00o2 == null) {
                                    break;
                                } else {
                                    c31831OooO0O0OooO00o = c31831OooO0O0OooO00o2;
                                }
                            }
                            C31832OooO0OO c31832OooO0OO = new C31832OooO0OO(c31830OooO00o.OooO00o(C31441OooOO0.f112297o0000Oo0));
                            while (c31832OooO0OO.hasNext()) {
                                C31436OooO0Oo c31436OooO0Oo10 = (C31436OooO0Oo) c31482OooO00o.OooO00o((C31831OooO0O0) c31832OooO0OO.next());
                                C31441OooOO0 c31441OooOO09 = C31441OooOO0.f112382o00O0O0O;
                                c31436OooO0Oo10.o000OOoO(c31441OooOO09);
                                C31441OooOO0 c31441OooOO010 = C31441OooOO0.f112362o000ooO0;
                                c31436OooO0Oo10.o000OOoO(c31441OooOO010);
                                C31831OooO0O0 c31831OooO0O0 = new C31831OooO0O0(c31436OooO0Oo10);
                                c31831OooO0O0OooO00o.getClass();
                                if (c31831OooO0O0.OooO00o(c31441OooOO010) != null || c31831OooO0O0.OooO00o(c31441OooOO09) != null) {
                                    throw new IllegalArgumentException("A single node with no siblings is required");
                                }
                                AbstractC31833OooO0Oo abstractC31833OooO0OoOooO0O0 = c31831OooO0O0OooO00o.OooO0O0();
                                C31612OooO0O0 c31612OooO0O03 = c31612OooO0O0OooO00o;
                                c31436OooO0Oo10.o000OoOo(C31441OooOO0.f112376o00O00o, abstractC31833OooO0OoOooO0O0);
                                C31831OooO0O0 c31831OooO0O0OooO00o3 = c31831OooO0O0OooO00o.OooO00o(c31441OooOO010);
                                C31612OooO0O0 c31612OooO0O04 = c31612OooO0O0OooO00o2;
                                c31831OooO0O0OooO00o.f113211OooOo0o.o000OoOo(c31441OooOO010, c31831OooO0O0);
                                c31436OooO0Oo10.o000OoOo(c31441OooOO09, c31831OooO0O0OooO00o);
                                if (c31831OooO0O0OooO00o3 != null) {
                                    c31436OooO0Oo10.o000OoOo(c31441OooOO010, c31831OooO0O0OooO00o3);
                                    c31831OooO0O0OooO00o3.f113211OooOo0o.o000OoOo(c31441OooOO09, c31831OooO0O0);
                                } else if (abstractC31833OooO0OoOooO0O0 != null) {
                                    AbstractC31833OooO0Oo abstractC31833OooO0OoOooO0O02 = c31831OooO0O0OooO00o.OooO0O0();
                                    abstractC31833OooO0OoOooO0O02.getClass();
                                    abstractC31833OooO0OoOooO0O02.f113211OooOo0o.o000OoOo(C31441OooOO0.f112337o000OoOo, c31831OooO0O0);
                                }
                                c31831OooO0O0.OooO0Oo(c31831OooO0O0.OooO0OO() ? c31436OooO0Oo10.o000O00O(C31441OooOO0.f112453oo000o, null, 0) + 1 : 1);
                                c31831OooO0O0OooO00o = c31831OooO0O0OooO00o.OooO00o(c31441OooOO010);
                                c31612OooO0O0OooO00o = c31612OooO0O03;
                                c31612OooO0O0OooO00o2 = c31612OooO0O04;
                            }
                            c31612OooO0O0 = c31612OooO0O0OooO00o;
                            c31612OooO0O02 = c31612OooO0O0OooO00o2;
                        }
                    }
                } else {
                    c31612OooO0O0 = c31612OooO0O0OooO00o;
                    c31612OooO0O02 = c31612OooO0O0OooO00o2;
                    i2 = 1;
                }
                strO000OOO = c31436OooO0Oo4.o000OOO(C31441OooOO0.f112374o00O00OO);
                if (strO000OOO != null) {
                    try {
                        for (int i7 : o0OoOo0.OooO0O0(6)) {
                            switch (i7) {
                                case 1:
                                    str = "UseNone";
                                    break;
                                case 2:
                                    str = "UseOutlines";
                                    break;
                                case 3:
                                    str = "UseThumbs";
                                    break;
                                case 4:
                                    str = "FullScreen";
                                    break;
                                case 5:
                                    str = "UseOC";
                                    break;
                                case 6:
                                    str = "UseAttachments";
                                    break;
                                default:
                                    throw null;
                            }
                            if (!str.equals(strO000OOO)) {
                            }
                        }
                        throw new IllegalArgumentException(strO000OOO);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                C31441OooOO0 c31441OooOO011 = C31441OooOO0.f112451oOO00O;
                c31436OooO0OoOooo0OO = c31436OooO0Oo.Oooo0OO(c31441OooOO011);
                if (c31436OooO0OoOooo0OO != null) {
                    int iO000O00O = c31611OooO00o.OooO00o().OooO0Oo().f113036OooOo0o.o000O00O(C31441OooOO0.f112453oo000o, null, 0);
                    C31436OooO0Oo c31436OooO0OoOooo0OO3 = c31436OooO0Oo4.Oooo0OO(c31441OooOO011);
                    if (c31436OooO0OoOooo0OO3 == null) {
                        C31436OooO0Oo c31436OooO0Oo11 = new C31436OooO0Oo();
                        c31433OooO00o2 = new C31433OooO00o();
                        c31436OooO0Oo11.o000OoOO(C31441OooOO0.f112361o000ooO, c31433OooO00o2);
                        c31436OooO0Oo4.o000OoOO(c31441OooOO011, c31436OooO0Oo11);
                    } else {
                        c31433OooO00o2 = (C31433OooO00o) c31436OooO0OoOooo0OO3.o0000O0O(C31441OooOO0.f112361o000ooO);
                    }
                    C31433OooO00o c31433OooO00o5 = (C31433OooO00o) c31436OooO0OoOooo0OO.o0000O0O(C31441OooOO0.f112361o000ooO);
                    if (c31433OooO00o5 != null) {
                        int size = c31433OooO00o2.f112214OooOo.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 < c31433OooO00o5.f112214OooOo.size()) {
                                AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0OO2 = c31433OooO00o5.Oooo0OO(i8);
                                if (abstractC31434OooO0O0Oooo0OO2 instanceof AbstractC31443OooOO0o) {
                                    c31433OooO00o2.OooOooo(C31432OooO.o0Oo0oo(((long) ((AbstractC31443OooOO0o) abstractC31434OooO0O0Oooo0OO2).Oooo0()) + ((long) iO000O00O)));
                                    c31433OooO00o2.OooOooo(c31482OooO00o.OooO00o(c31433OooO00o5.Oooo0OO(i8 + 1)));
                                    i8 += 2;
                                } else {
                                    Log.e("PdfBox-Android", "page labels ignored, index " + i8 + " should be a number, but is " + abstractC31434OooO0O0Oooo0OO2);
                                    while (c31433OooO00o2.f112214OooOo.size() > size) {
                                        c31433OooO00o2.o0Oo0oo(size);
                                    }
                                }
                            }
                        }
                    }
                }
                c31441OooOO0 = C31441OooOO0.f112350o000o0o;
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O3 = c31436OooO0Oo4.o0000O0O(c31441OooOO0);
                c31448OooOOo = !(abstractC31434OooO0O0O0000O0O3 instanceof C31448OooOOo) ? (C31448OooOOo) abstractC31434OooO0O0O0000O0O3 : null;
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O4 = c31436OooO0Oo.o0000O0O(c31441OooOO0);
                c31448OooOOo2 = !(abstractC31434OooO0O0O0000O0O4 instanceof C31448OooOOo) ? (C31448OooOOo) abstractC31434OooO0O0O0000O0O4 : null;
                if (c31448OooOOo == null && c31448OooOOo2 != null) {
                    try {
                        C31668OooO c31668OooO = new C31668OooO(c31611OooO00o, c31448OooOOo2.o000o00O(), null);
                        OooO0oO(c31448OooOOo2, c31668OooO.f113202OooOo0o, new HashSet(Arrays.asList(C31441OooOO0.f112295o0000OOo, C31441OooOO0.f112340o000OooO)));
                        c31436OooO0Oo4.o000OoOo(c31441OooOO0, c31668OooO);
                    } catch (IOException e2) {
                        Log.e("PdfBox-Android", "Metadata skipped because it could not be read", e2);
                    }
                }
                C31441OooOO0 c31441OooOO012 = C31441OooOO0.f112364o000ooo;
                c31436OooO0OoOooo0OO2 = c31436OooO0Oo4.Oooo0OO(c31441OooOO012);
                interfaceC31671OooO0OOOooo0OO = c31436OooO0Oo.Oooo0OO(c31441OooOO012);
                if (c31436OooO0OoOooo0OO2 != null && interfaceC31671OooO0OOOooo0OO != null) {
                    c31436OooO0Oo4.o000OoOO(c31441OooOO012, c31482OooO00o.OooO00o(interfaceC31671OooO0OOOooo0OO));
                } else if (c31436OooO0OoOooo0OO2 != null && interfaceC31671OooO0OOOooo0OO != null) {
                    c31482OooO00o.OooO0O0(interfaceC31671OooO0OOOooo0OO, c31436OooO0OoOooo0OO2);
                }
                ArrayList<C31766OooO0o0> arrayListOooO0OO = c31612OooO0O0.OooO0OO();
                ArrayList arrayListOooO0OO2 = c31612OooO0O02.OooO0OO();
                for (C31766OooO0o0 c31766OooO0o0 : arrayListOooO0OO) {
                    String strO000OOo02 = c31766OooO0o0.f113416OooOo0o.o000OOo0(C31441OooOO0.f112370o00O000);
                    if (strO000OOo02 != null && !"Custom".equals(strO000OOo02)) {
                        Iterator it3 = arrayListOooO0OO2.iterator();
                        while (it3.hasNext()) {
                            if (((C31766OooO0o0) it3.next()).f113416OooOo0o.o000OOo0(C31441OooOO0.f112370o00O000).equals(strO000OOo02)) {
                                break;
                            }
                        }
                    }
                    C31436OooO0Oo c31436OooO0Oo12 = (C31436OooO0Oo) c31482OooO00o.OooO00o(c31766OooO0o0);
                    C31441OooOO0 c31441OooOO013 = C31441OooOO0.f112372o00O000o;
                    C31433OooO00o c31433OooO00o6 = (C31433OooO00o) c31436OooO0Oo4.o0000O0O(c31441OooOO013);
                    if (c31433OooO00o6 == null) {
                        c31433OooO00o6 = new C31433OooO00o();
                        c31436OooO0Oo4.o000OoOO(c31441OooOO013, c31433OooO00o6);
                    }
                    c31433OooO00o6.OooOooo(c31436OooO0Oo12);
                    arrayListOooO0OO2.add(c31766OooO0o0);
                }
                c31441OooOO02 = C31441OooOO0.f112368o00O;
                C31436OooO0Oo c31436OooO0OoOooo0OO4 = c31436OooO0Oo.Oooo0OO(c31441OooOO02);
                C31681OooO0o0 c31681OooO0o02 = c31436OooO0OoOooo0OO4 != null ? null : new C31681OooO0o0(c31436OooO0OoOooo0OO4);
                C31436OooO0Oo c31436OooO0OoOooo0OO5 = c31436OooO0Oo4.Oooo0OO(c31441OooOO02);
                c31681OooO0o0 = c31436OooO0OoOooo0OO5 != null ? null : new C31681OooO0o0(c31436OooO0OoOooo0OO5);
                if (c31681OooO0o0 == null && c31681OooO0o02 != null) {
                    c31681OooO0o0 = new C31681OooO0o0();
                    c31436OooO0Oo4.o000OoOo(c31441OooOO02, c31681OooO0o0);
                    c31681OooO0o0.f113217OooOo0o.o000OoOo(C31441OooOO0.f112378o00O00oO, new C31675OooO0oO());
                    it2 = c31612OooO0O02.OooO0Oo().iterator();
                    while (true) {
                        oooO00o2 = (C31618OooO0oo.OooO00o) it2;
                        if (!oooO00o2.hasNext()) {
                            C31615OooO0o c31615OooO0o2 = (C31615OooO0o) oooO00o2.next();
                            c31615OooO0o2.f113022OooOo0o.o000OOoO(C31441OooOO0.f112402o00O0ooo);
                            Iterator it4 = c31615OooO0o2.OooO0O0().f113203OooOo.iterator();
                            while (it4.hasNext()) {
                                ((AbstractC31793OooO00o) it4.next()).f113422OooOo0o.o000OOoO(C31441OooOO0.f112400o00O0oo);
                            }
                        }
                    }
                }
                if (c31681OooO0o0 == null) {
                    C31441OooOO0 c31441OooOO014 = C31441OooOO0.f112378o00O00oO;
                    C31436OooO0Oo c31436OooO0Oo13 = c31681OooO0o0.f113217OooOo0o;
                    AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O5 = c31436OooO0Oo13.o0000O0O(c31441OooOO014);
                    C31675OooO0oO c31675OooO0oO = abstractC31434OooO0O0O0000O0O5 instanceof C31436OooO0Oo ? new C31675OooO0oO((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O5, C31678OooO0O0.class) : null;
                    int iO000O00O2 = c31436OooO0Oo13.o000O00O(C31441OooOO0.f112454oo00o, null, -1);
                    if (c31675OooO0oO != null) {
                        linkedHashMapOooO0Oo = OooO0Oo(c31675OooO0oO);
                        if (iO000O00O2 < 0) {
                            iO000O00O2 = linkedHashMapOooO0Oo.isEmpty() ? 0 : ((Integer) Collections.max(linkedHashMapOooO0Oo.keySet())).intValue() + 1;
                        }
                        if (iO000O00O2 < 0 || c31681OooO0o02 == null) {
                            i4 = iO000O00O2;
                            i3 = 0;
                            linkedHashMap = null;
                        } else {
                            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O6 = c31681OooO0o02.f113217OooOo0o.o0000O0O(c31441OooOO014);
                            C31675OooO0oO c31675OooO0oO2 = abstractC31434OooO0O0O0000O0O6 instanceof C31436OooO0Oo ? new C31675OooO0oO((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O6, C31678OooO0O0.class) : null;
                            if (c31675OooO0oO2 != null) {
                                LinkedHashMap linkedHashMapOooO0Oo2 = OooO0Oo(c31675OooO0oO2);
                                i4 = iO000O00O2;
                                linkedHashMap = linkedHashMapOooO0Oo2;
                                i3 = !linkedHashMapOooO0Oo2.isEmpty() ? i2 : 0;
                            }
                        }
                    } else {
                        i4 = iO000O00O2;
                        i3 = 0;
                        linkedHashMap = null;
                        linkedHashMapOooO0Oo = null;
                    }
                } else {
                    i3 = 0;
                    linkedHashMap = null;
                    linkedHashMapOooO0Oo = null;
                    i4 = -1;
                }
                HashMap map = new HashMap();
                it = c31612OooO0O0.OooO0Oo().iterator();
                i5 = 0;
                while (true) {
                    oooO00o = (C31618OooO0oo.OooO00o) it;
                    if (oooO00o.hasNext()) {
                        LinkedHashMap linkedHashMap2 = linkedHashMap;
                        C31436OooO0Oo c31436OooO0Oo14 = c31436OooO0Oo4;
                        C31436OooO0Oo c31436OooO0Oo15 = c31436OooO0Oo;
                        int i9 = i4;
                        int iMax = -1;
                        if (i3 != 0) {
                            for (InterfaceC31671OooO0OO interfaceC31671OooO0OO : linkedHashMap2.values()) {
                                if (interfaceC31671OooO0OO != null) {
                                    throw null;
                                }
                            }
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                int iIntValue = ((Integer) entry.getKey()).intValue();
                                iMax = Math.max(iIntValue, iMax);
                                linkedHashMapOooO0Oo.put(Integer.valueOf(i9 + iIntValue), c31482OooO00o.OooO00o(entry.getValue()));
                            }
                            int i10 = iMax + 1 + i9;
                            C31675OooO0oO c31675OooO0oO3 = new C31675OooO0oO();
                            C31436OooO0Oo c31436OooO0Oo16 = c31675OooO0oO3.f113213OooOo0o;
                            if (linkedHashMapOooO0Oo == null) {
                                c31436OooO0Oo16.o000OoOo(C31441OooOO0.f112361o000ooO, null);
                                c31436OooO0Oo16.o000OoOo(C31441OooOO0.f112342o000o00, null);
                            } else {
                                ArrayList<Integer> arrayList = new ArrayList(linkedHashMapOooO0Oo.keySet());
                                Collections.sort(arrayList);
                                C31433OooO00o c31433OooO00o7 = new C31433OooO00o();
                                for (Integer num3 : arrayList) {
                                    c31433OooO00o7.OooOooo(C31432OooO.o0Oo0oo(num3.intValue()));
                                    InterfaceC31671OooO0OO interfaceC31671OooO0OO2 = (InterfaceC31671OooO0OO) linkedHashMapOooO0Oo.get(num3);
                                    if (interfaceC31671OooO0OO2 == null) {
                                        interfaceC31671OooO0OO2 = C31442OooOO0O.f112464OooOoO0;
                                    }
                                    c31433OooO00o7.f112214OooOo.add(interfaceC31671OooO0OO2.OooOOo0());
                                }
                                if (arrayList.isEmpty()) {
                                    num = null;
                                    num2 = null;
                                } else {
                                    num2 = (Integer) arrayList.get(0);
                                    num = (Integer) C21505OooO0Oo.OooO00o(1, arrayList);
                                }
                                C31441OooOO0 c31441OooOO015 = C31441OooOO0.f112342o000o00;
                                C31433OooO00o c31433OooO00o8 = (C31433OooO00o) c31436OooO0Oo16.o0000O0O(c31441OooOO015);
                                if (c31433OooO00o8 == null) {
                                    c31433OooO00o8 = new C31433OooO00o();
                                    c31433OooO00o8.OooOooo(null);
                                    c31433OooO00o8.OooOooo(null);
                                    c31436OooO0Oo16.o000OoOO(c31441OooOO015, c31433OooO00o8);
                                }
                                if (num != null) {
                                    c31433OooO00o8.o0000O0O(1, C31432OooO.o0Oo0oo(num.intValue()));
                                    abstractC31434OooO0O0 = null;
                                } else {
                                    abstractC31434OooO0O0 = null;
                                    c31433OooO00o8.o0000O0O(1, null);
                                }
                                C31433OooO00o c31433OooO00o9 = (C31433OooO00o) c31436OooO0Oo16.o0000O0O(c31441OooOO015);
                                if (c31433OooO00o9 == null) {
                                    c31433OooO00o9 = new C31433OooO00o();
                                    c31433OooO00o9.OooOooo(abstractC31434OooO0O0);
                                    c31433OooO00o9.OooOooo(abstractC31434OooO0O0);
                                    c31436OooO0Oo16.o000OoOO(c31441OooOO015, c31433OooO00o9);
                                }
                                if (num2 != null) {
                                    c31433OooO00o9.o0000O0O(0, C31432OooO.o0Oo0oo(num2.intValue()));
                                } else {
                                    c31433OooO00o9.o0000O0O(0, null);
                                }
                                c31436OooO0Oo16.o000OoOO(C31441OooOO0.f112361o000ooO, c31433OooO00o7);
                            }
                            c31681OooO0o0.getClass();
                            C31441OooOO0 c31441OooOO016 = C31441OooOO0.f112378o00O00oO;
                            C31436OooO0Oo c31436OooO0Oo17 = c31681OooO0o0.f113217OooOo0o;
                            c31436OooO0Oo17.o000OoOo(c31441OooOO016, c31675OooO0oO3);
                            c31436OooO0Oo17.o000Oo(C31441OooOO0.f112454oo00o, i10);
                            c31681OooO0o02.getClass();
                            C31441OooOO0 c31441OooOO017 = C31441OooOO0.f112333o000Oo0O;
                            C31436OooO0Oo c31436OooO0Oo18 = c31681OooO0o02.f113217OooOo0o;
                            Object objO0000O0O = c31436OooO0Oo18.o0000O0O(c31441OooOO017);
                            C31433OooO00o c31433OooO00o10 = new C31433OooO00o();
                            AbstractC31434OooO0O0 abstractC31434OooO0O0OooO00o = c31482OooO00o.OooO00o(objO0000O0O);
                            if (abstractC31434OooO0O0OooO00o instanceof C31433OooO00o) {
                                c31433OooO00o10.Oooo00o((C31433OooO00o) abstractC31434OooO0O0OooO00o);
                            } else if (abstractC31434OooO0O0OooO00o instanceof C31436OooO0Oo) {
                                c31433OooO00o10.OooOooo(abstractC31434OooO0O0OooO00o);
                            }
                            if (c31433OooO00o10.f112214OooOo.size() != 0) {
                                C31433OooO00o c31433OooO00o11 = new C31433OooO00o();
                                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O7 = c31436OooO0Oo17.o0000O0O(c31441OooOO017);
                                if (abstractC31434OooO0O0O0000O0O7 instanceof C31433OooO00o) {
                                    c31433OooO00o11.Oooo00o((C31433OooO00o) abstractC31434OooO0O0O0000O0O7);
                                } else if (abstractC31434OooO0O0O0000O0O7 instanceof C31436OooO0Oo) {
                                    c31433OooO00o11.OooOooo(abstractC31434OooO0O0O0000O0O7);
                                }
                                ArrayList arrayList2 = c31433OooO00o11.f112214OooOo;
                                if (arrayList2.size() == 1 && (c31433OooO00o11.Oooo0OO(0) instanceof C31436OooO0Oo)) {
                                    C31436OooO0Oo c31436OooO0Oo19 = (C31436OooO0Oo) c31433OooO00o11.Oooo0OO(0);
                                    if (C31441OooOO0.f112287o00000oO.equals(c31436OooO0Oo19.o0Oo0oo(C31441OooOO0.f112393o00O0o0)) && (c31433OooO00oOooo0 = c31436OooO0Oo19.Oooo0(c31441OooOO017)) != null && OooO0o0(c31433OooO00oOooo0)) {
                                        c31433OooO00oOooo0.Oooo00o(c31433OooO00o10);
                                        OooO(c31433OooO00oOooo0, c31436OooO0Oo19, C31441OooOO0.f112369o00O0);
                                    }
                                } else if (arrayList2.size() == 0) {
                                    OooO(c31433OooO00o10, c31436OooO0Oo17, null);
                                    c31436OooO0Oo17.o000OoOO(c31441OooOO017, c31433OooO00o10);
                                } else {
                                    c31433OooO00o11.Oooo00o(c31433OooO00o10);
                                    C31436OooO0Oo c31436OooO0Oo20 = new C31436OooO0Oo();
                                    OooO(c31433OooO00o11, c31436OooO0Oo20, OooO0o0(c31433OooO00o11) ? C31441OooOO0.f112369o00O0 : null);
                                    c31436OooO0Oo20.o000OoOO(c31441OooOO017, c31433OooO00o11);
                                    c31436OooO0Oo20.o000OoOo(C31441OooOO0.o00O00, c31681OooO0o0);
                                    c31436OooO0Oo20.o000OoOO(C31441OooOO0.f112393o00O0o0, C31441OooOO0.f112287o00000oO);
                                    c31436OooO0Oo17.o000OoOO(c31441OooOO017, c31436OooO0Oo20);
                                }
                            }
                            C31441OooOO0 c31441OooOO018 = C31441OooOO0.f112458oo0oOO0;
                            C31436OooO0Oo c31436OooO0OoOooo0OO6 = c31436OooO0Oo18.Oooo0OO(c31441OooOO018);
                            C31436OooO0Oo c31436OooO0OoOooo0OO7 = c31436OooO0Oo17.Oooo0OO(c31441OooOO018);
                            if (c31436OooO0OoOooo0OO6 != null) {
                                if (c31436OooO0OoOooo0OO7 == null) {
                                    c31436OooO0Oo17.o000OoOO(c31441OooOO018, c31436OooO0OoOooo0OO6);
                                } else {
                                    for (Map.Entry entry2 : c31436OooO0OoOooo0OO6.f112222OooOoO0.entrySet()) {
                                        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O8 = c31436OooO0OoOooo0OO7.o0000O0O((C31441OooOO0) entry2.getKey());
                                        if (abstractC31434OooO0O0O0000O0O8 == null || !abstractC31434OooO0O0O0000O0O8.equals(entry2.getValue())) {
                                            if (c31436OooO0OoOooo0OO7.f112222OooOoO0.containsKey((C31441OooOO0) entry2.getKey())) {
                                                Log.w("PdfBox-Android", "key " + entry2.getKey() + " already exists in destination RoleMap");
                                            } else {
                                                c31436OooO0OoOooo0OO7.o000OoOO((C31441OooOO0) entry2.getKey(), (AbstractC31434OooO0O0) entry2.getValue());
                                            }
                                        }
                                    }
                                }
                            }
                            C31441OooOO0 c31441OooOO019 = C31441OooOO0.f112321o000O0oo;
                            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O9 = c31436OooO0Oo18.o0000O0O(c31441OooOO019);
                            C31619OooOO0 c31619OooOO0 = abstractC31434OooO0O0O0000O0O9 instanceof C31436OooO0Oo ? new C31619OooOO0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O9) : null;
                            if (c31619OooOO0 == null) {
                                c31783OooO00o = null;
                            } else {
                                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O10 = c31436OooO0Oo17.o0000O0O(c31441OooOO019);
                                C31619OooOO0 c31619OooOO02 = abstractC31434OooO0O0O0000O0O10 instanceof C31436OooO0Oo ? new C31619OooOO0((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O10) : null;
                                if (c31619OooOO02 == null) {
                                    c31619OooOO02 = new C31619OooOO0();
                                }
                                LinkedHashMap linkedHashMapOooO0OO = OooO0OO(c31619OooOO0);
                                LinkedHashMap linkedHashMapOooO0OO2 = OooO0OO(c31619OooOO02);
                                for (Map.Entry entry3 : linkedHashMapOooO0OO.entrySet()) {
                                    if (linkedHashMapOooO0OO2.containsKey(entry3.getKey())) {
                                        Log.w("PdfBox-Android", "key " + ((String) entry3.getKey()) + " already exists in destination IDTree");
                                    } else {
                                        linkedHashMapOooO0OO2.put(entry3.getKey(), new C31679OooO0OO((C31436OooO0Oo) c31482OooO00o.OooO00o(((C31679OooO0OO) entry3.getValue()).f113217OooOo0o)));
                                    }
                                }
                                C31619OooOO0 c31619OooOO03 = new C31619OooOO0();
                                C31433OooO00o c31433OooO00o12 = new C31433OooO00o();
                                ArrayList<String> arrayList3 = new ArrayList(linkedHashMapOooO0OO2.keySet());
                                Collections.sort(arrayList3);
                                for (String str2 : arrayList3) {
                                    c31433OooO00o12.OooOooo(new C31450OooOOoo(str2));
                                    c31433OooO00o12.f112214OooOo.add(((InterfaceC31671OooO0OO) linkedHashMapOooO0OO2.get(str2)).OooOOo0());
                                }
                                C31441OooOO0 c31441OooOO020 = C31441OooOO0.f112360o000oo0o;
                                C31436OooO0Oo c31436OooO0Oo21 = c31619OooOO03.f113210OooOo0o;
                                c31436OooO0Oo21.o000OoOO(c31441OooOO020, c31433OooO00o12);
                                c31783OooO00o = null;
                                c31436OooO0Oo21.o000OoOO(C31441OooOO0.f112342o000o00, null);
                                c31436OooO0Oo17.o000OoOo(C31441OooOO0.f112321o000O0oo, c31619OooOO03);
                            }
                            C31441OooOO0 c31441OooOO021 = C31441OooOO0.f112346o000o0O;
                            C31436OooO0Oo c31436OooO0Oo22 = (C31436OooO0Oo) c31436OooO0Oo14.o0000O0O(c31441OooOO021);
                            C31677OooO00o c31677OooO00o = c31436OooO0Oo22 == null ? c31783OooO00o : new C31677OooO00o(c31436OooO0Oo22);
                            C31436OooO0Oo c31436OooO0Oo23 = (C31436OooO0Oo) c31436OooO0Oo15.o0000O0O(c31441OooOO021);
                            C31677OooO00o c31677OooO00o2 = c31436OooO0Oo23 == null ? c31783OooO00o : new C31677OooO00o(c31436OooO0Oo23);
                            if (c31677OooO00o == 0) {
                                c31677OooO00o = new C31677OooO00o();
                            }
                            if (c31677OooO00o2 == 0) {
                                c31677OooO00o2 = new C31677OooO00o();
                            }
                            C31436OooO0Oo c31436OooO0Oo24 = c31677OooO00o.f113216OooOo0o;
                            c31436OooO0Oo24.o000Oo00("Marked", true);
                            C31436OooO0Oo c31436OooO0Oo25 = c31677OooO00o2.f113216OooOo0o;
                            c31436OooO0Oo25.getClass();
                            if (!c31436OooO0Oo25.Oooo00o(C31441OooOO0.OooOooo("Suspects"))) {
                                c31436OooO0Oo24.getClass();
                                c31436OooO0Oo24.Oooo00o(C31441OooOO0.OooOooo("Suspects"));
                            }
                            c31436OooO0Oo24.o000Oo00("Suspects", false);
                            c31436OooO0Oo25.getClass();
                            if (!c31436OooO0Oo25.Oooo00o(C31441OooOO0.OooOooo("UserProperties"))) {
                                c31436OooO0Oo24.getClass();
                                c31436OooO0Oo24.Oooo00o(C31441OooOO0.OooOooo("UserProperties"));
                            }
                            c31436OooO0Oo24.o000Oo00("Suspects", false);
                            c31436OooO0Oo14.o000OoOo(c31441OooOO021, c31677OooO00o);
                            C31441OooOO0 c31441OooOO022 = C31441OooOO0.f112336o000OoOO;
                            if (c31436OooO0Oo14.o000OOo0(c31441OooOO022) == null && (strO000OOo0 = c31436OooO0Oo15.o000OOo0(c31441OooOO022)) != null) {
                                c31436OooO0Oo14.o000o000(c31441OooOO022, strO000OOo0);
                            }
                            C31441OooOO0 c31441OooOO023 = C31441OooOO0.f112421o00OOOOo;
                            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O11 = c31436OooO0Oo15.o0000O0O(c31441OooOO023);
                            C31783OooO00o c31783OooO00o2 = abstractC31434OooO0O0O0000O0O11 instanceof C31436OooO0Oo ? new C31783OooO00o((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O11) : c31783OooO00o;
                            if (c31783OooO00o2 == null) {
                                return;
                            }
                            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O12 = c31436OooO0Oo14.o0000O0O(c31441OooOO023);
                            if (abstractC31434OooO0O0O0000O0O12 instanceof C31436OooO0Oo) {
                                c31783OooO00o = new C31783OooO00o((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O12);
                            }
                            if (c31783OooO00o == null) {
                                c31783OooO00o = new C31783OooO00o(new C31436OooO0Oo());
                                c31436OooO0Oo14.o000OoOo(c31441OooOO023, c31783OooO00o);
                            }
                            Set set = Collections.EMPTY_SET;
                            C31436OooO0Oo c31436OooO0Oo26 = c31783OooO00o2.f113419OooOo0o;
                            C31436OooO0Oo c31436OooO0Oo27 = c31783OooO00o.f113419OooOo0o;
                            OooO0oO(c31436OooO0Oo26, c31436OooO0Oo27, set);
                            C31441OooOO0 c31441OooOO024 = C31441OooOO0.f112324o000OO0O;
                            if (c31436OooO0Oo26.Oooo00o(c31441OooOO024) || c31436OooO0Oo27.Oooo00o(c31441OooOO024)) {
                                c31436OooO0Oo27.o000Oo0O(c31441OooOO024, true);
                            }
                            C31441OooOO0 c31441OooOO025 = C31441OooOO0.f112317o000O0Oo;
                            if (c31436OooO0Oo26.Oooo00o(c31441OooOO025) || c31436OooO0Oo27.Oooo00o(c31441OooOO025)) {
                                c31436OooO0Oo27.o000Oo0O(c31441OooOO025, true);
                            }
                            C31441OooOO0 c31441OooOO026 = C31441OooOO0.f112316o000O0O0;
                            if (c31436OooO0Oo26.Oooo00o(c31441OooOO026) || c31436OooO0Oo27.Oooo00o(c31441OooOO026)) {
                                c31436OooO0Oo27.o000Oo0O(c31441OooOO026, true);
                            }
                            C31441OooOO0 c31441OooOO027 = C31441OooOO0.f112298o0000OoO;
                            if (c31436OooO0Oo26.Oooo00o(c31441OooOO027) || c31436OooO0Oo27.Oooo00o(c31441OooOO027)) {
                                c31436OooO0Oo27.o000Oo0O(c31441OooOO027, true);
                            }
                            C31441OooOO0 c31441OooOO028 = C31441OooOO0.f112269OooooOO;
                            if (c31436OooO0Oo26.Oooo00o(c31441OooOO028) || c31436OooO0Oo27.Oooo00o(c31441OooOO028)) {
                                c31436OooO0Oo27.o000Oo0O(c31441OooOO028, true);
                            }
                            C31441OooOO0 c31441OooOO029 = C31441OooOO0.f112285o00000Oo;
                            if (c31436OooO0Oo26.Oooo00o(c31441OooOO029) || c31436OooO0Oo27.Oooo00o(c31441OooOO029)) {
                                c31436OooO0Oo27.o000Oo0O(c31441OooOO029, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C31615OooO0o c31615OooO0o3 = (C31615OooO0o) oooO00o.next();
                    int i11 = i3;
                    C31436OooO0Oo c31436OooO0Oo28 = c31615OooO0o3.f113022OooOo0o;
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    C31436OooO0Oo c31436OooO0Oo29 = (C31436OooO0Oo) c31482OooO00o.OooO00o(c31436OooO0Oo28);
                    C31615OooO0o c31615OooO0o4 = new C31615OooO0o(c31436OooO0Oo29);
                    Iterator<C31615OooO0o> it5 = it;
                    if (i11 == 0) {
                        c31436OooO0Oo29.o000OOoO(C31441OooOO0.f112402o00O0ooo);
                        for (Iterator it6 = c31615OooO0o4.OooO0O0().f113203OooOo.iterator(); it6.hasNext(); it6 = it6) {
                            ((AbstractC31793OooO00o) it6.next()).f113422OooOo0o.o000OOoO(C31441OooOO0.f112400o00O0oo);
                        }
                    }
                    C31441OooOO0 c31441OooOO030 = C31441OooOO0.f112448o0ooOO0;
                    AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0OO = C31618OooO0oo.OooO0OO(c31436OooO0Oo28, c31441OooOO030);
                    int i12 = i4;
                    if (abstractC31434OooO0O0OooO0OO instanceof C31433OooO00o) {
                        C31676OooO0oo c31676OooO0oo = new C31676OooO0oo((C31433OooO00o) abstractC31434OooO0O0OooO0OO);
                        C31676OooO0oo c31676OooO0ooOooO0OO2 = c31615OooO0o3.OooO0OO();
                        c31676OooO0ooOooO0OO = new C31676OooO0oo();
                        c31436OooO0Oo3 = c31436OooO0Oo;
                        C31437OooO0o c31437OooO0o = new C31437OooO0o(Math.max(c31676OooO0ooOooO0OO2.OooO0O0(), c31676OooO0oo.OooO0O0()));
                        C31433OooO00o c31433OooO00o13 = c31676OooO0ooOooO0OO.f113215OooOo0o;
                        c31436OooO0Oo2 = c31436OooO0Oo4;
                        c31433OooO00o13.o0000O0O(0, c31437OooO0o);
                        c31433OooO00o13.o0000O0O(i2, new C31437OooO0o(Math.max(c31676OooO0ooOooO0OO2.OooO0OO(), c31676OooO0oo.OooO0OO())));
                        c31676OooO0ooOooO0OO.OooO0oO(Math.min(c31676OooO0ooOooO0OO2.OooO0Oo(), c31676OooO0oo.OooO0Oo()));
                        c31676OooO0ooOooO0OO.OooO0oo(Math.min(c31676OooO0ooOooO0OO2.OooO0o0(), c31676OooO0oo.OooO0o0()));
                    } else {
                        c31436OooO0Oo2 = c31436OooO0Oo4;
                        c31436OooO0Oo3 = c31436OooO0Oo;
                        c31676OooO0ooOooO0OO = c31615OooO0o3.OooO0OO();
                    }
                    C31436OooO0Oo c31436OooO0Oo30 = c31615OooO0o4.f113022OooOo0o;
                    if (c31676OooO0ooOooO0OO == null) {
                        c31436OooO0Oo30.o000OOoO(c31441OooOO030);
                    } else {
                        c31436OooO0Oo30.o000OoOO(c31441OooOO030, c31676OooO0ooOooO0OO.f113215OooOo0o);
                    }
                    C31676OooO0oo c31676OooO0ooOooO0OO3 = c31615OooO0o3.OooO0OO();
                    c31615OooO0o4.f113023OooOoO = c31676OooO0ooOooO0OO3;
                    if (c31676OooO0ooOooO0OO3 == null) {
                        c31436OooO0Oo30.o000OOoO(C31441OooOO0.f112351o000o0o0);
                    } else {
                        c31436OooO0Oo30.o000OoOo(C31441OooOO0.f112351o000o0o0, c31676OooO0ooOooO0OO3);
                    }
                    C31441OooOO0 c31441OooOO031 = C31441OooOO0.f112390o00O0OoO;
                    AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0OO2 = C31618OooO0oo.OooO0OO(c31436OooO0Oo28, c31441OooOO031);
                    if (abstractC31434OooO0O0OooO0OO2 instanceof AbstractC31443OooOO0o) {
                        int iOooo0 = ((AbstractC31443OooOO0o) abstractC31434OooO0O0OooO0OO2).Oooo0();
                        i6 = iOooo0 % 90 == 0 ? ((iOooo0 % StyleIdentifier.LIST_TABLE_4_ACCENT_5) + StyleIdentifier.LIST_TABLE_4_ACCENT_5) % StyleIdentifier.LIST_TABLE_4_ACCENT_5 : 0;
                    }
                    c31436OooO0Oo30.o000Oo(c31441OooOO031, i6);
                    if (c31615OooO0o3.f113021OooOo == null) {
                        AbstractC31434OooO0O0 abstractC31434OooO0O0OooO0OO3 = C31618OooO0oo.OooO0OO(c31436OooO0Oo28, C31441OooOO0.f112389o00O0Oo0);
                        if (abstractC31434OooO0O0OooO0OO3 instanceof C31436OooO0Oo) {
                            c31615OooO0o3.f113021OooOo = new C31610OooO((C31436OooO0Oo) abstractC31434OooO0O0OooO0OO3, c31615OooO0o3.f113024OooOoO0);
                        }
                    }
                    Object obj = c31615OooO0o3.f113021OooOo;
                    if (obj != null) {
                        C31610OooO c31610OooO = new C31610OooO((C31436OooO0Oo) c31482OooO00o.OooO00o(obj));
                        c31615OooO0o4.f113021OooOo = c31610OooO;
                        c31436OooO0Oo30.o000OoOo(C31441OooOO0.f112389o00O0Oo0, c31610OooO);
                    } else {
                        C31610OooO c31610OooO2 = new C31610OooO();
                        c31615OooO0o4.f113021OooOo = c31610OooO2;
                        c31436OooO0Oo30.o000OoOo(C31441OooOO0.f112389o00O0Oo0, c31610OooO2);
                    }
                    if (i11 != 0) {
                        C31441OooOO0 c31441OooOO032 = C31441OooOO0.f112402o00O0ooo;
                        int iO000O00O3 = c31436OooO0Oo30.o000O00O(c31441OooOO032, null, -1);
                        if (iO000O00O3 >= 0) {
                            c31436OooO0Oo30.o000Oo(c31441OooOO032, iO000O00O3 + i12);
                        }
                        ArrayList arrayList4 = c31615OooO0o4.OooO0O0().f113203OooOo;
                        ArrayList arrayList5 = new ArrayList(arrayList4.size());
                        Iterator it7 = arrayList4.iterator();
                        while (it7.hasNext()) {
                            AbstractC31793OooO00o abstractC31793OooO00o = (AbstractC31793OooO00o) it7.next();
                            abstractC31793OooO00o.getClass();
                            C31441OooOO0 c31441OooOO033 = C31441OooOO0.f112400o00O0oo;
                            C31615OooO0o c31615OooO0o5 = c31615OooO0o4;
                            C31436OooO0Oo c31436OooO0Oo31 = abstractC31793OooO00o.f113422OooOo0o;
                            Iterator it8 = it7;
                            C31615OooO0o c31615OooO0o6 = c31615OooO0o3;
                            int iO000O00O4 = c31436OooO0Oo31.o000O00O(c31441OooOO033, null, -1);
                            if (iO000O00O4 >= 0) {
                                c31436OooO0Oo31.o000Oo(c31441OooOO033, iO000O00O4 + i12);
                            }
                            arrayList5.add(abstractC31793OooO00o);
                            c31615OooO0o4 = c31615OooO0o5;
                            it7 = it8;
                            c31615OooO0o3 = c31615OooO0o6;
                        }
                        C31615OooO0o c31615OooO0o7 = c31615OooO0o4;
                        c31436OooO0Oo30.o000OoOO(C31441OooOO0.f112249Oooo00o, C31669OooO00o.OooO0OO(arrayList5));
                        map.put(c31436OooO0Oo28, c31436OooO0Oo30);
                        C31669OooO00o c31669OooO00oOooO0O0 = c31615OooO0o3.OooO0O0();
                        C31669OooO00o c31669OooO00oOooO0O02 = c31615OooO0o7.OooO0O0();
                        int i13 = 0;
                        while (true) {
                            ArrayList arrayList6 = c31669OooO00oOooO0O0.f113203OooOo;
                            if (i13 < arrayList6.size()) {
                                map.put(((AbstractC31793OooO00o) arrayList6.get(i13)).f113422OooOo0o, ((AbstractC31793OooO00o) c31669OooO00oOooO0O02.f113203OooOo.get(i13)).f113422OooOo0o);
                                i13++;
                            }
                        }
                    }
                    C31618OooO0oo c31618OooO0ooOooO0Oo2 = c31611OooO00o.OooO00o().OooO0Oo();
                    C31441OooOO0 c31441OooOO034 = C31441OooOO0.f112376o00O00o;
                    C31436OooO0Oo c31436OooO0Oo32 = c31618OooO0ooOooO0Oo2.f113036OooOo0o;
                    c31436OooO0Oo30.o000OoOO(c31441OooOO034, c31436OooO0Oo32);
                    ((C31433OooO00o) c31436OooO0Oo32.o0000O0O(C31441OooOO0.f112330o000Oo)).OooOooo(c31436OooO0Oo30);
                    C31436OooO0Oo c31436OooO0Oo33 = c31436OooO0Oo30;
                    do {
                        c31436OooO0Oo33 = (C31436OooO0Oo) c31436OooO0Oo33.o0000O(C31441OooOO0.f112376o00O00o, C31441OooOO0.o00O00);
                        if (c31436OooO0Oo33 != null) {
                            C31441OooOO0 c31441OooOO035 = C31441OooOO0.f112453oo000o;
                            c31436OooO0Oo33.o000Oo(c31441OooOO035, c31436OooO0Oo33.o000O00O(c31441OooOO035, null, -1) + 1);
                        }
                    } while (c31436OooO0Oo33 != null);
                    if (i5 == i) {
                        InterfaceC31672OooO0Oo interfaceC31672OooO0OoOooO0O02 = c31612OooO0O02.OooO0O0();
                        if (interfaceC31672OooO0OoOooO0O02 instanceof C31770OooO0OO) {
                            C31770OooO0OO c31770OooO0OO2 = (C31770OooO0OO) interfaceC31672OooO0OoOooO0O02;
                            c31770OooO0OO2.getClass();
                            abstractC31786OooO0OO = (AbstractC31786OooO0OO) AbstractC31784OooO00o.OooO00o(c31770OooO0OO2.f113417OooOo0o.o0000O0O(C31441OooOO0.f112450o0ooOoO));
                        } else {
                            abstractC31786OooO0OO = (AbstractC31786OooO0OO) interfaceC31672OooO0OoOooO0O02;
                        }
                        C31433OooO00o c31433OooO00o14 = abstractC31786OooO0OO.f113421OooOo0o;
                        c31433OooO00o14.getClass();
                        c31433OooO00o14.f112214OooOo.set(0, c31436OooO0Oo30);
                    }
                    i5++;
                    i3 = i11;
                    it = it5;
                    linkedHashMap = linkedHashMap3;
                    i4 = i12;
                    c31436OooO0Oo = c31436OooO0Oo3;
                    c31436OooO0Oo4 = c31436OooO0Oo2;
                    i2 = 1;
                }
            } else {
                c31436OooO0Oo4.o000OoOO(C31441OooOO0.f112243OooOooO, c31482OooO00o.OooO00o(c31811OooO0O0OooO00o3.f113436OooOo));
            }
            C31441OooOO0 c31441OooOO036 = C31441OooOO0.f112410o00OO0OO;
            c31433OooO00o = (C31433OooO00o) c31436OooO0Oo4.o0000O0O(c31441OooOO036);
            C31433OooO00o c31433OooO00o42 = (C31433OooO00o) c31482OooO00o.OooO00o(c31436OooO0Oo4.o0000O0O(c31441OooOO036));
            if (c31433OooO00o != null) {
            }
            C31441OooOO0 c31441OooOO042 = C31441OooOO0.f112360o000oo0o;
            C31436OooO0Oo c31436OooO0Oo52 = (C31436OooO0Oo) c31436OooO0Oo4.o0000O0O(c31441OooOO042);
            if (c31436OooO0Oo52 != null) {
            }
            c31436OooO0Oo = c31612OooO0O0OooO00o.f113016OooOo0o;
            C31436OooO0Oo c31436OooO0Oo62 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO042);
            if (c31436OooO0Oo62 != null) {
            }
            if (c31616OooO0o02 != null) {
            }
            if (c31616OooO0o0 != null) {
            }
            C31441OooOO0 c31441OooOO062 = C31441OooOO0.f112278o00000;
            C31436OooO0Oo c31436OooO0Oo82 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO062);
            if (c31436OooO0Oo82 == null) {
            }
            if (c31614OooO0Oo != null) {
            }
            C31441OooOO0 c31441OooOO072 = C31441OooOO0.f112438o00oOoo;
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O13 = c31436OooO0Oo.o0000O0O(c31441OooOO072);
            if (!(abstractC31434OooO0O0O0000O0O13 instanceof C31436OooO0Oo)) {
            }
            if (c31830OooO00o == null) {
            }
            strO000OOO = c31436OooO0Oo4.o000OOO(C31441OooOO0.f112374o00O00OO);
            if (strO000OOO != null) {
            }
            C31441OooOO0 c31441OooOO0112 = C31441OooOO0.f112451oOO00O;
            c31436OooO0OoOooo0OO = c31436OooO0Oo.Oooo0OO(c31441OooOO0112);
            if (c31436OooO0OoOooo0OO != null) {
            }
            c31441OooOO0 = C31441OooOO0.f112350o000o0o;
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O32 = c31436OooO0Oo4.o0000O0O(c31441OooOO0);
            if (!(abstractC31434OooO0O0O0000O0O32 instanceof C31448OooOOo)) {
            }
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O42 = c31436OooO0Oo.o0000O0O(c31441OooOO0);
            if (!(abstractC31434OooO0O0O0000O0O42 instanceof C31448OooOOo)) {
            }
            if (c31448OooOOo == null) {
                C31668OooO c31668OooO2 = new C31668OooO(c31611OooO00o, c31448OooOOo2.o000o00O(), null);
                OooO0oO(c31448OooOOo2, c31668OooO2.f113202OooOo0o, new HashSet(Arrays.asList(C31441OooOO0.f112295o0000OOo, C31441OooOO0.f112340o000OooO)));
                c31436OooO0Oo4.o000OoOo(c31441OooOO0, c31668OooO2);
            }
            C31441OooOO0 c31441OooOO0122 = C31441OooOO0.f112364o000ooo;
            c31436OooO0OoOooo0OO2 = c31436OooO0Oo4.Oooo0OO(c31441OooOO0122);
            interfaceC31671OooO0OOOooo0OO = c31436OooO0Oo.Oooo0OO(c31441OooOO0122);
            if (c31436OooO0OoOooo0OO2 != null) {
                if (c31436OooO0OoOooo0OO2 != null) {
                    c31482OooO00o.OooO0O0(interfaceC31671OooO0OOOooo0OO, c31436OooO0OoOooo0OO2);
                }
            }
            ArrayList<C31766OooO0o0> arrayListOooO0OO3 = c31612OooO0O0.OooO0OO();
            ArrayList arrayListOooO0OO22 = c31612OooO0O02.OooO0OO();
            while (r0.hasNext()) {
            }
            c31441OooOO02 = C31441OooOO0.f112368o00O;
            C31436OooO0Oo c31436OooO0OoOooo0OO42 = c31436OooO0Oo.Oooo0OO(c31441OooOO02);
            if (c31436OooO0OoOooo0OO42 != null) {
            }
            C31436OooO0Oo c31436OooO0OoOooo0OO52 = c31436OooO0Oo4.Oooo0OO(c31441OooOO02);
            if (c31436OooO0OoOooo0OO52 != null) {
            }
            if (c31681OooO0o0 == null) {
                c31681OooO0o0 = new C31681OooO0o0();
                c31436OooO0Oo4.o000OoOo(c31441OooOO02, c31681OooO0o0);
                c31681OooO0o0.f113217OooOo0o.o000OoOo(C31441OooOO0.f112378o00O00oO, new C31675OooO0oO());
                it2 = c31612OooO0O02.OooO0Oo().iterator();
                while (true) {
                    oooO00o2 = (C31618OooO0oo.OooO00o) it2;
                    if (!oooO00o2.hasNext()) {
                    }
                }
            }
            if (c31681OooO0o0 == null) {
            }
            HashMap map2 = new HashMap();
            it = c31612OooO0O0.OooO0Oo().iterator();
            i5 = 0;
            while (true) {
                oooO00o = (C31618OooO0oo.OooO00o) it;
                if (oooO00o.hasNext()) {
                }
                i5++;
                i3 = i11;
                it = it5;
                linkedHashMap = linkedHashMap3;
                i4 = i12;
                c31436OooO0Oo = c31436OooO0Oo3;
                c31436OooO0Oo4 = c31436OooO0Oo2;
                i2 = 1;
            }
        } catch (IOException e3) {
            throw new IOException(e3);
        }
    }

    public final void OooO0o(C31456OooO0O0 c31456OooO0O0) throws Throwable {
        C31611OooO00o c31611OooO00o;
        C31456OooO0O0 c31456OooO0O02;
        C31611OooO00o c31611OooO00oO000oOoO;
        ArrayList arrayList = this.f112611OooO00o;
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            try {
                int size = arrayList.size() + 1;
                long j = c31456OooO0O0.f112495OooO0OO;
                if (j > 0) {
                    j /= (long) size;
                }
                long j2 = j;
                long j3 = c31456OooO0O0.f112496OooO0Oo;
                if (j3 > 0) {
                    j3 /= (long) size;
                }
                c31456OooO0O02 = new C31456OooO0O0(j2, j3, c31456OooO0O0.f112493OooO00o, c31456OooO0O0.f112494OooO0O0);
                c31611OooO00o = new C31611OooO00o(c31456OooO0O02);
            } catch (Throwable th) {
                th = th;
                c31611OooO00o = null;
            }
            try {
                for (Object obj : arrayList) {
                    if (obj instanceof File) {
                        C31458OooO0Oo c31458OooO0Oo = new C31458OooO0Oo((File) obj);
                        try {
                            C31462OooO0oo c31462OooO0oo = new C31462OooO0oo(c31456OooO0O02);
                            try {
                                C31489OooO0o c31489OooO0o = new C31489OooO0o(c31458OooO0Oo, c31462OooO0oo);
                                c31489OooO0o.OoooOOo();
                                c31611OooO00oO000oOoO = c31489OooO0o.o000oOoO();
                            } catch (IOException e) {
                                C31455OooO00o.OooO0O0(c31462OooO0oo);
                                throw e;
                            }
                        } catch (IOException e2) {
                            C31455OooO00o.OooO0O0(c31458OooO0Oo);
                            throw e2;
                        }
                    } else {
                        InputStream inputStream = (InputStream) obj;
                        C31462OooO0oo c31462OooO0oo2 = new C31462OooO0oo(c31456OooO0O02);
                        try {
                            C31454OooO c31454OooO = new C31454OooO(c31462OooO0oo2);
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i <= -1) {
                                    break;
                                } else {
                                    c31454OooO.OooOooo(bArr, 0, i);
                                }
                            }
                            c31454OooO.seek(0L);
                            C31489OooO0o c31489OooO0o2 = new C31489OooO0o(c31454OooO, c31462OooO0oo2);
                            c31489OooO0o2.OoooOOo();
                            c31611OooO00oO000oOoO = c31489OooO0o2.o000oOoO();
                        } catch (IOException e3) {
                            C31455OooO00o.OooO0O0(c31462OooO0oo2);
                            throw e3;
                        }
                    }
                    arrayList2.add(c31611OooO00oO000oOoO);
                    OooO0O0(c31611OooO00o, c31611OooO00oO000oOoO);
                }
                FileOutputStream fileOutputStream = this.f112613OooO0OO;
                if (fileOutputStream == null) {
                    c31611OooO00o.OooOOoo(new BufferedOutputStream(new FileOutputStream(new File(this.f112612OooO0O0))));
                } else {
                    c31611OooO00o.OooOOoo(fileOutputStream);
                }
                C31455OooO00o.OooO00o(c31611OooO00o, "PDDocument", null);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C31455OooO00o.OooO00o((C31611OooO00o) it.next(), "PDDocument", null);
                }
            } catch (Throwable th2) {
                th = th2;
                if (c31611OooO00o != null) {
                    C31455OooO00o.OooO00o(c31611OooO00o, "PDDocument", null);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C31455OooO00o.OooO00o((C31611OooO00o) it2.next(), "PDDocument", null);
                }
                throw th;
            }
        }
    }

    public final void OooO0oo(String str) {
        this.f112612OooO0O0 = str;
    }
}
