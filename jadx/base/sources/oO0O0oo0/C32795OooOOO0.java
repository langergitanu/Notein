package oO0O0oo0;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import io.ktor.utils.p616io.C23992OoooooO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o00oO0O.C25515Oooo0O0;
import oO00ooO.C32443OooOOO;
import oO0O.OooO00o;
import oO0O0OO.o000oOoO;
import oO0O0Oo0.AbstractC32693Oooo0oO;
import oO0OOO.C32934OooO0o0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.C33367OooO0o0;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34435OooOoO0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;
import oOo00OOo.C34492OooO;
import oOo00OOo.C34494OooO0O0;
import oOo00OOo.C34495OooO0OO;
import oOo00OOo.C34499OooO0oO;
import oOo0oooO.InterfaceC34588OooO0oO;
import oOoo0.InterfaceC34602OooOO0o;
import ooo0o.C35194OooOOOo;
import ooo0o.InterfaceC35196OooOOo0;

/* JADX INFO: renamed from: oO0O0oo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32795OooOOO0 extends AbstractC32693Oooo0oO {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117833Oooo0O0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final oO0O0ooO.OooOo00 f117834OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C34499OooO0oO f117835OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C32934OooO0o0 f117836OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final InterfaceC34588OooO0oO f117837Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f117838Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C32781OooO0OO f117839Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final InterfaceC33370OooOO0<List<C33477OooO0OO>> f117840Oooo00o;

    /* JADX INFO: renamed from: oO0O0oo0.OooOOO0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Map<String, ? extends InterfaceC35196OooOOo0>> {
        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.OooO00o
        public final Map<String, ? extends InterfaceC35196OooOOo0> invoke() {
            C32795OooOOO0 c32795OooOOO0 = C32795OooOOO0.this;
            c32795OooOOO0.f117835OooOooO.f123639OooO00o.f123616OooOO0o.OooO00o(c32795OooOOO0.f117533OooOoOO.OooO0O0());
            ArrayList arrayList = new ArrayList();
            C34435OooOoO0 c34435OooOoO0 = C34435OooOoO0.f123454OooOo0o;
            while (c34435OooOoO0.hasNext()) {
                String str = (String) c34435OooOoO0.next();
                InterfaceC35196OooOOo0 interfaceC35196OooOOo0OooO00o = C35194OooOOOo.OooO00o(c32795OooOOO0.f117835OooOooO.f123639OooO00o.f123608OooO0OO, C33476OooO0O0.OooOO0(new C33477OooO0OO(oO0Oo0.OooO0OO.OooO0Oo(str).f120108OooO00o.replace(IOUtils.DIR_SEPARATOR_UNIX, FilenameUtils.EXTENSION_SEPARATOR))), c32795OooOOO0.f117836OooOooo);
                C32443OooOOO c32443OooOOO = interfaceC35196OooOOo0OooO00o != null ? new C32443OooOOO(str, interfaceC35196OooOOo0OooO00o) : null;
                if (c32443OooOOO != null) {
                    arrayList.add(c32443OooOOO);
                }
            }
            return C34444Oooo0O0.OooOO0o(arrayList);
        }
    }

    /* JADX INFO: renamed from: oO0O0oo0.OooOOO0$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<HashMap<oO0Oo0.OooO0OO, oO0Oo0.OooO0OO>> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final HashMap<oO0Oo0.OooO0OO, oO0Oo0.OooO0OO> invoke() {
            HashMap<oO0Oo0.OooO0OO, oO0Oo0.OooO0OO> map = new HashMap<>();
            C32795OooOOO0 c32795OooOOO0 = C32795OooOOO0.this;
            c32795OooOOO0.getClass();
            for (Map.Entry entry : ((Map) C25515Oooo0O0.OooO00o(c32795OooOOO0.f117838Oooo000, C32795OooOOO0.f117833Oooo0O0[0])).entrySet()) {
                String str = (String) entry.getKey();
                InterfaceC35196OooOOo0 interfaceC35196OooOOo0 = (InterfaceC35196OooOOo0) entry.getValue();
                oO0Oo0.OooO0OO OooO0Oo2 = oO0Oo0.OooO0OO.OooO0Oo(str);
                oO0O.OooO00o oooO00oOooO0O0 = interfaceC35196OooOOo0.OooO0O0();
                int iOrdinal = oooO00oOooO0O0.f116740OooO00o.ordinal();
                if (iOrdinal == 2) {
                    map.put(OooO0Oo2, OooO0Oo2);
                } else if (iOrdinal == 5) {
                    String str2 = oooO00oOooO0O0.f116740OooO00o == OooO00o.EnumC20235OooO00o.MULTIFILE_CLASS_PART ? oooO00oOooO0O0.f116744OooO0o : null;
                    if (str2 != null) {
                        map.put(OooO0Oo2, oO0Oo0.OooO0OO.OooO0Oo(str2));
                    }
                }
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: oO0O0oo0.OooOOO0$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends C33477OooO0OO>> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends C33477OooO0OO> invoke() {
            C32795OooOOO0.this.f117834OooOoo.getClass();
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(c34434OooOoO, 10));
            Iterator<E> it = c34434OooOoO.iterator();
            while (it.hasNext()) {
                arrayList.add(((oO0O0ooO.OooOo00) it.next()).OooO0OO());
            }
            return arrayList;
        }
    }

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117833Oooo0O0 = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32795OooOOO0.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32795OooOOO0.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C32795OooOOO0(C34499OooO0oO outerContext, oO0O0ooO.OooOo00 oooOo00) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outerContext, "outerContext");
        C34495OooO0OO c34495OooO0OO = outerContext.f123639OooO00o;
        super(c34495OooO0OO.f123619OooOOOO, oooOo00.OooO0OO());
        this.f117834OooOoo = oooOo00;
        C34499OooO0oO c34499OooO0oOOooO00o = C34494OooO0O0.OooO00o(outerContext, this, null, 6);
        this.f117835OooOooO = c34499OooO0oOOooO00o;
        this.f117836OooOooo = C34449Oooo0oo.OooO0o0(c34495OooO0OO.f123609OooO0Oo.OooO0OO().f120271OooO0OO);
        C34495OooO0OO c34495OooO0OO2 = c34499OooO0oOOooO00o.f123639OooO00o;
        C33361OooO0Oo c33361OooO0Oo = c34495OooO0OO2.f123606OooO00o;
        this.f117838Oooo000 = c33361OooO0Oo.OooO00o(new OooO00o());
        this.f117839Oooo00O = new C32781OooO0OO(c34499OooO0oOOooO00o, oooOo00, this);
        OooO0OO oooO0OO = new OooO0OO();
        c33361OooO0Oo.getClass();
        this.f117840Oooo00o = new C33367OooO0o0(c33361OooO0Oo, oooO0OO);
        this.f117837Oooo0 = c34495OooO0OO2.f123627OooOo0O.f125824OooO0OO ? InterfaceC34588OooO0oO.OooO00o.f123919OooO00o : C23992OoooooO.OooO0Oo(c34499OooO0oOOooO00o, oooOo00);
        c33361OooO0Oo.OooO00o(new OooO0O0());
    }

    @Override // oO0O0OO.InterfaceC32620Oooo00O
    public final oO0Oo0o0.OooOO0 OooOOO0() {
        return this.f117839Oooo00O;
    }

    @Override // oOo0oooO.OooO0O0, oOo0oooO.OooO00o
    public final InterfaceC34588OooO0oO getAnnotations() {
        return this.f117837Oooo0;
    }

    @Override // oO0O0Oo0.AbstractC32693Oooo0oO, oO0O0Oo0.AbstractC32675OooOOoo, oO0O0OO.OooOOO
    public final o000oOoO getSource() {
        return new C34492OooO(this);
    }

    @Override // oO0O0Oo0.AbstractC32693Oooo0oO, oO0O0Oo0.AbstractC32673OooOOo
    public final String toString() {
        return "Lazy Java package fragment: " + this.f117533OooOoOO + " of module " + this.f117835OooOooO.f123639OooO00o.f123619OooOOOO;
    }
}
