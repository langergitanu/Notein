package oO000o00;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.Map;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.OooOOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 f114977OooO00o;

    public static final class OooO00o extends AbstractC32095OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooO f114978OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooOO0O f114979OooO0O0;

        /* JADX INFO: renamed from: oO000o00.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C20196OooO00o implements AbstractC33087Oooo0o0.OooOO0O {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ AbstractC33087Oooo0o0.OooOO0O f114980OooO00o;

            public C20196OooO00o(AbstractC33087Oooo0o0.OooOO0O oooOO0O) {
                this.f114980OooO00o = oooOO0O;
            }

            @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0O
            public final void OooO00o(OooOOOO oooOOOO) {
                this.f114980OooO00o.OooO00o(oooOOOO);
                OooO00o.this.f114979OooO0O0.OooO00o(oooOOOO);
            }
        }

        public OooO00o(AbstractC33087Oooo0o0.OooO oooO, AbstractC33087Oooo0o0.OooOO0O oooOO0O) {
            this.f114978OooO00o = (AbstractC33087Oooo0o0.OooO) Preconditions.checkNotNull(oooO, "delegate");
            this.f114979OooO0O0 = (AbstractC33087Oooo0o0.OooOO0O) Preconditions.checkNotNull(oooOO0O, "healthListener");
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final C33058OooO00o OooO0OO() {
            C33058OooO00o c33058OooO00oOooO0OO = this.f114978OooO00o.OooO0OO();
            c33058OooO00oOooO0OO.getClass();
            C33058OooO00o.OooO0O0<Boolean> oooO0O0 = AbstractC33087Oooo0o0.f119628OooO0Oo;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(oooO0O0, bool);
            for (Map.Entry<C33058OooO00o.OooO0O0<?>, Object> entry : c33058OooO00oOooO0OO.f119519OooO00o.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new C33058OooO00o(identityHashMap);
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO0oo(AbstractC33087Oooo0o0.OooOO0O oooOO0O) {
            this.f114978OooO00o.OooO0oo(new C20196OooO00o(oooOO0O));
        }

        @Override // oO000o00.AbstractC32095OooO0Oo
        public final AbstractC33087Oooo0o0.OooO OooOO0() {
            return this.f114978OooO00o;
        }
    }

    public OooO0o(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        this.f114977OooO00o = (AbstractC33087Oooo0o0.AbstractC33089OooO0o0) Preconditions.checkNotNull(abstractC33089OooO0o0, "helper");
    }

    @Override // oO000o00.OooO0OO, oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
    public final AbstractC33087Oooo0o0.OooO OooO00o(AbstractC33087Oooo0o0.OooO0O0 oooO0O0) {
        AbstractC33087Oooo0o0.OooOO0O oooOO0O = (AbstractC33087Oooo0o0.OooOO0O) oooO0O0.OooO00o(AbstractC33087Oooo0o0.f119627OooO0OO);
        AbstractC33087Oooo0o0.OooO oooOOooO00o = super.OooO00o(oooO0O0);
        if (oooOO0O != null) {
            C33058OooO00o c33058OooO00oOooO0OO = oooOOooO00o.OooO0OO();
            if (c33058OooO00oOooO0OO.f119519OooO00o.get(AbstractC33087Oooo0o0.f119628OooO0Oo) == null) {
                return new OooO00o(oooOOooO00o, oooOO0O);
            }
        }
        return oooOOooO00o;
    }

    @Override // oO000o00.OooO0OO
    public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 OooO0oO() {
        return this.f114977OooO00o;
    }
}
