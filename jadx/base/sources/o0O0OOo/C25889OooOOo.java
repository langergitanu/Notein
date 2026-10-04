package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.Map;
import o0O0OOo.OooO0O0;
import o0O0OOo.OooOOO0;

/* JADX INFO: renamed from: o0O0OOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25889OooOOo extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f88400OooO0Oo;

    /* JADX INFO: renamed from: o0O0OOo.OooOOo$OooO00o */
    public static abstract class OooO00o<C extends C25889OooOOo, B extends OooO00o<C, B>> extends OooOOO0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Map<String, String> f88401OooO0Oo;

        @Override // o0O0OOo.OooOOO0.OooO00o
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            Map<String, String> map = c.f88400OooO0Oo;
            if (map == null) {
                throw new NullPointerException("userAttributes is marked non-null but is null");
            }
            this.f88401OooO0Oo = map;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooOOO0.OooO00o, o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            return "SignUpSubmitUserAttributesCommandParameters.SignUpSubmitUserAttributesCommandParametersBuilder(super=" + super.toString() + ", userAttributes=" + this.f88401OooO0Oo + ")";
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooOOo$OooO0O0 */
    public static final class OooO0O0 extends OooO00o<C25889OooOOo, OooO0O0> {
        @Override // o0O0OOo.C25889OooOOo.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o OooO0o0() {
            return this;
        }

        @Override // o0O0OOo.C25889OooOOo.OooO00o, o0O0OOo.OooOOO0.OooO00o
        public final OooOOO0.OooO00o OooO0o0() {
            return this;
        }

        @Override // o0O0OOo.C25889OooOOo.OooO00o
        /* JADX INFO: renamed from: OooO0oO */
        public final C25889OooOOo build() {
            return new C25889OooOOo(this);
        }

        @Override // o0O0OOo.C25889OooOOo.OooO00o
        /* JADX INFO: renamed from: OooO0oo */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.C25889OooOOo.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new C25889OooOOo(this);
        }

        @Override // o0O0OOo.C25889OooOOo.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public C25889OooOOo(OooO0O0 oooO0O0) {
        super(oooO0O0);
        Map<String, String> map = oooO0O0.f88401OooO0Oo;
        this.f88400OooO0Oo = map;
        if (map == null) {
            throw new NullPointerException("userAttributes is marked non-null but is null");
        }
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0O0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooOOO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooOOO0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean canEqual(Object obj) {
        return obj instanceof C25889OooOOo;
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25889OooOOo)) {
            return false;
        }
        C25889OooOOo c25889OooOOo = (C25889OooOOo) obj;
        c25889OooOOo.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        Map<String, String> map = this.f88400OooO0Oo;
        Map<String, String> map2 = c25889OooOOo.f88400OooO0Oo;
        return map != null ? map.equals(map2) : map2 == null;
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        Map<String, String> map = this.f88400OooO0Oo;
        return iHashCode + (map == null ? 43 : map.hashCode());
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
