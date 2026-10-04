package oO0Ooo;

import java.util.Collection;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32635OoooOo0;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0Ooo0.InterfaceC33373OooOOO;
import oO0Oooo.C33509OooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33300OooO0oo extends AbstractC33305OooOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33370OooOO0<OooO00o> f120532OooO0O0;

    /* JADX INFO: renamed from: oO0Ooo.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Collection<AbstractC33320OooOoo> f120533OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<? extends AbstractC33320OooOoo> f120534OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Collection<? extends AbstractC33320OooOoo> allSupertypes) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(allSupertypes, "allSupertypes");
            this.f120533OooO00o = allSupertypes;
            this.f120534OooO0O0 = com.facebook.soloader.OooOo.OooO0oO(C33509OooO.f121035OooO0Oo);
        }
    }

    /* JADX INFO: renamed from: oO0Ooo.OooO0oo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooO00o invoke() {
            return new OooO00o(AbstractC33300OooO0oo.this.OooO0oO());
        }
    }

    /* JADX INFO: renamed from: oO0Ooo.OooO0oo$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Boolean, OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f120536OooOo0o = new OooO0OO(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final OooO00o invoke(Boolean bool) {
            bool.getClass();
            return new OooO00o(com.facebook.soloader.OooOo.OooO0oO(C33509OooO.f121035OooO0Oo));
        }
    }

    /* JADX INFO: renamed from: oO0Ooo.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C33301OooO0Oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooO00o, C32460OooOooO> {
        public C33301OooO0Oo() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(OooO00o oooO00o) {
            OooO00o supertypes = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(supertypes, "supertypes");
            AbstractC33300OooO0oo abstractC33300OooO0oo = AbstractC33300OooO0oo.this;
            InterfaceC32635OoooOo0 interfaceC32635OoooOo0OooOO0 = abstractC33300OooO0oo.OooOO0();
            C33292OooO c33292OooO = new C33292OooO(abstractC33300OooO0oo);
            C33302OooOO0 c33302OooOO0 = new C33302OooOO0(abstractC33300OooO0oo);
            List list = supertypes.f120533OooO00o;
            interfaceC32635OoooOo0OooOO0.OooO00o(abstractC33300OooO0oo, list, c33292OooO, c33302OooOO0);
            if (list.isEmpty()) {
                AbstractC33320OooOoo abstractC33320OooOooOooO0oo = abstractC33300OooO0oo.OooO0oo();
                List listOooO0oO = abstractC33320OooOooOooO0oo != null ? com.facebook.soloader.OooOo.OooO0oO(abstractC33320OooOooOooO0oo) : null;
                if (listOooO0oO == null) {
                    listOooO0oO = C34434OooOoO.f123453OooOo0o;
                }
                list = listOooO0oO;
            }
            List<AbstractC33320OooOoo> listO0ooOO0 = list instanceof List ? (List) list : null;
            if (listO0ooOO0 == null) {
                listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(list);
            }
            List<AbstractC33320OooOoo> listOooOOO0 = abstractC33300OooO0oo.OooOOO0(listO0ooOO0);
            kotlin.jvm.internal.OooOOO0.OooO0oO(listOooOOO0, "<set-?>");
            supertypes.f120534OooO0O0 = listOooOOO0;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public AbstractC33300OooO0oo(InterfaceC33373OooOOO storageManager) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(storageManager, "storageManager");
        this.f120532OooO0O0 = storageManager.OooO0O0(new OooO0O0(), OooO0OO.f120536OooOo0o, new C33301OooO0Oo());
    }

    public Collection OooO() {
        return C34434OooOoO.f123453OooOo0o;
    }

    public abstract Collection<AbstractC33320OooOoo> OooO0oO();

    public AbstractC33320OooOoo OooO0oo() {
        return null;
    }

    public abstract InterfaceC32635OoooOo0 OooOO0();

    @Override // oO0Ooo.InterfaceC33342OoooOo0
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public final List<AbstractC33320OooOoo> OooO0Oo() {
        return this.f120532OooO0O0.invoke().f120534OooO0O0;
    }

    public void OooOOO(AbstractC33320OooOoo type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
    }

    public List<AbstractC33320OooOoo> OooOOO0(List<AbstractC33320OooOoo> list) {
        return list;
    }
}
