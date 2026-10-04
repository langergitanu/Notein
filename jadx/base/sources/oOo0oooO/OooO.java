package oOo0oooO;

import OooOoOO.C20519OooO0Oo;
import java.util.Map;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.EnumC32441OooOO0O;
import oO0O0OO.o000oOoO;
import oO0OOo.AbstractC33038OooO0oO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O0O0o.OooOO0 f123894OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33477OooO0OO f123895OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<C33479OooO0o, AbstractC33038OooO0oO<?>> f123896OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f123897OooO0Oo;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<AbstractC33328Oooo0O0> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC33328Oooo0O0 invoke() {
            OooO oooO = OooO.this;
            return oooO.f123894OooO00o.OooO(oooO.f123895OooO0O0).OooOOO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO(oO0O0O0o.OooOO0 oooOO02, C33477OooO0OO fqName, Map<C33479OooO0o, ? extends AbstractC33038OooO0oO<?>> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        this.f123894OooO00o = oooOO02;
        this.f123895OooO0O0 = fqName;
        this.f123896OooO0OO = map;
        this.f123897OooO0Oo = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new OooO00o());
    }

    @Override // oOo0oooO.OooO0OO
    public final Map<C33479OooO0o, AbstractC33038OooO0oO<?>> OooO0O0() {
        return this.f123896OooO0OO;
    }

    @Override // oOo0oooO.OooO0OO
    public final C33477OooO0OO OooO0OO() {
        return this.f123895OooO0O0;
    }

    @Override // oOo0oooO.OooO0OO
    public final o000oOoO getSource() {
        return o000oOoO.f117308OooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oOo0oooO.OooO0OO
    public final AbstractC33320OooOoo getType() {
        Object value = this.f123897OooO0Oo.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0o(value, "<get-type>(...)");
        return (AbstractC33320OooOoo) value;
    }
}
