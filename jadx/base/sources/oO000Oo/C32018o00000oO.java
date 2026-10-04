package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33072OooOo0O;

/* JADX INFO: renamed from: oO000Oo.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32018o00000oO extends AbstractC33087Oooo0o0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 f114400OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AbstractC33087Oooo0o0.OooO f114401OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public oO0OOo0o.OooOOO f114402OooO0oo = oO0OOo0o.OooOOO.f119554OooOoO;

    /* JADX INFO: renamed from: oO000Oo.o00000oO$OooO00o */
    public class OooO00o implements AbstractC33087Oooo0o0.OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ AbstractC33087Oooo0o0.OooO f114403OooO00o;

        public OooO00o(AbstractC33087Oooo0o0.OooO oooO) {
            this.f114403OooO00o = oooO;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0O
        public final void OooO00o(oO0OOo0o.OooOOOO oooOOOO) {
            AbstractC33087Oooo0o0.OooOO0 oooO0OO;
            C32018o00000oO c32018o00000oO = C32018o00000oO.this;
            c32018o00000oO.getClass();
            oO0OOo0o.OooOOO oooOOO = oooOOOO.f119560OooO00o;
            if (oooOOO == oO0OOo0o.OooOOO.f119556OooOoOO) {
                return;
            }
            oO0OOo0o.OooOOO oooOOO2 = oO0OOo0o.OooOOO.f119555OooOoO0;
            oO0OOo0o.OooOOO oooOOO3 = oO0OOo0o.OooOOO.f119554OooOoO;
            AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0 = c32018o00000oO.f114400OooO0o;
            if (oooOOO == oooOOO2 || oooOOO == oooOOO3) {
                abstractC33089OooO0o0.OooO0o0();
            }
            if (c32018o00000oO.f114402OooO0oo == oooOOO2) {
                if (oooOOO == oO0OOo0o.OooOOO.f119553OooOo0o) {
                    return;
                }
                if (oooOOO == oooOOO3) {
                    c32018o00000oO.OooO0o0();
                    return;
                }
            }
            int iOrdinal = oooOOO.ordinal();
            if (iOrdinal != 0) {
                AbstractC33087Oooo0o0.OooO oooO = this.f114403OooO00o;
                if (iOrdinal == 1) {
                    oooO0OO = new OooO0OO(AbstractC33087Oooo0o0.OooO0o.OooO0O0(oooO, null));
                } else if (iOrdinal == 2) {
                    oooO0OO = new OooO0OO(AbstractC33087Oooo0o0.OooO0o.OooO00o(oooOOOO.f119561OooO0O0));
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("Unsupported state:" + oooOOO);
                    }
                    oooO0OO = c32018o00000oO.new C32019OooO0Oo(oooO);
                }
            } else {
                oooO0OO = new OooO0OO(AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0);
            }
            c32018o00000oO.f114402OooO0oo = oooOOO;
            abstractC33089OooO0o0.OooO0o(oooOOO, oooO0OO);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000oO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Boolean f114405OooO00o;

        public OooO0O0(Boolean bool) {
            this.f114405OooO00o = bool;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000oO$OooO0OO */
    public static final class OooO0OO extends AbstractC33087Oooo0o0.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooO0o f114406OooO00o;

        public OooO0OO(AbstractC33087Oooo0o0.OooO0o oooO0o) {
            this.f114406OooO00o = (AbstractC33087Oooo0o0.OooO0o) Preconditions.checkNotNull(oooO0o, "result");
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            return this.f114406OooO00o;
        }

        public final String toString() {
            return MoreObjects.toStringHelper((Class<?>) OooO0OO.class).add("result", this.f114406OooO00o).toString();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000oO$OooO0Oo, reason: case insensitive filesystem */
    public final class C32019OooO0Oo extends AbstractC33087Oooo0o0.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooO f114407OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicBoolean f114408OooO0O0 = new AtomicBoolean(false);

        public C32019OooO0Oo(AbstractC33087Oooo0o0.OooO oooO) {
            this.f114407OooO00o = (AbstractC33087Oooo0o0.OooO) Preconditions.checkNotNull(oooO, "subchannel");
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            if (this.f114408OooO0O0.compareAndSet(false, true)) {
                C32018o00000oO.this.f114400OooO0o.OooO0Oo().execute(new RunnableC32020o00000oo(this));
            }
            return AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0;
        }
    }

    public C32018o00000oO(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        this.f114400OooO0o = (AbstractC33087Oooo0o0.AbstractC33089OooO0o0) Preconditions.checkNotNull(abstractC33089OooO0o0, "helper");
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final oO0OOo0o.o00Oo0 OooO00o(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
        Boolean bool;
        List<C33072OooOo0O> list = c33091OooO0oo.f119643OooO00o;
        if (list.isEmpty()) {
            oO0OOo0o.o00Oo0 o00oo0OooO0oo = oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("NameResolver returned no usable address. addrs=" + list + ", attrs=" + c33091OooO0oo.f119644OooO0O0);
            OooO0OO(o00oo0OooO0oo);
            return o00oo0OooO0oo;
        }
        Object obj = c33091OooO0oo.f119645OooO0OO;
        if ((obj instanceof OooO0O0) && (bool = ((OooO0O0) obj).f114405OooO00o) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        AbstractC33087Oooo0o0.OooO oooO = this.f114401OooO0oO;
        if (oooO == null) {
            AbstractC33087Oooo0o0.OooO0O0.OooO00o oooO00oOooO0O0 = AbstractC33087Oooo0o0.OooO0O0.OooO0O0();
            oooO00oOooO0O0.OooO0O0(list);
            AbstractC33087Oooo0o0.OooO0O0 oooO0O0 = new AbstractC33087Oooo0o0.OooO0O0(oooO00oOooO0O0.f119634OooO00o, oooO00oOooO0O0.f119635OooO0O0, oooO00oOooO0O0.f119636OooO0OO);
            AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0 = this.f114400OooO0o;
            AbstractC33087Oooo0o0.OooO oooOOooO00o = abstractC33089OooO0o0.OooO00o(oooO0O0);
            oooOOooO00o.OooO0oo(new OooO00o(oooOOooO00o));
            this.f114401OooO0oO = oooOOooO00o;
            oO0OOo0o.OooOOO oooOOO = oO0OOo0o.OooOOO.f119553OooOo0o;
            OooO0OO oooO0OO = new OooO0OO(AbstractC33087Oooo0o0.OooO0o.OooO0O0(oooOOooO00o, null));
            this.f114402OooO0oo = oooOOO;
            abstractC33089OooO0o0.OooO0o(oooOOO, oooO0OO);
            oooOOooO00o.OooO0o();
        } else {
            oooO.OooO(list);
        }
        return oO0OOo0o.o00Oo0.f119717OooO0o0;
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0OO(oO0OOo0o.o00Oo0 o00oo02) {
        AbstractC33087Oooo0o0.OooO oooO = this.f114401OooO0oO;
        if (oooO != null) {
            oooO.OooO0oO();
            this.f114401OooO0oO = null;
        }
        oO0OOo0o.OooOOO oooOOO = oO0OOo0o.OooOOO.f119555OooOoO0;
        OooO0OO oooO0OO = new OooO0OO(AbstractC33087Oooo0o0.OooO0o.OooO00o(o00oo02));
        this.f114402OooO0oo = oooOOO;
        this.f114400OooO0o.OooO0o(oooOOO, oooO0OO);
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0o() {
        AbstractC33087Oooo0o0.OooO oooO = this.f114401OooO0oO;
        if (oooO != null) {
            oooO.OooO0oO();
        }
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0o0() {
        AbstractC33087Oooo0o0.OooO oooO = this.f114401OooO0oO;
        if (oooO != null) {
            oooO.OooO0o();
        }
    }
}
