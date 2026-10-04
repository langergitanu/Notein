package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.Arrays;
import o0O0OOo.OooO0O0;
import o0O0OOo.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO extends OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final char[] f88344OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f88345OooO0o0;

    public static abstract class OooO00o<C extends OooO, B extends OooO00o<C, B>> extends OooO0OO.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public char[] f88346OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f88347OooO0o0;

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88345OooO0o0;
            if (str == null) {
                throw new NullPointerException("username is marked non-null but is null");
            }
            this.f88347OooO0o0 = str;
            this.f88346OooO0o = c.f88344OooO0o;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooO0OO.OooO00o, o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            return "SignInStartCommandParameters.SignInStartCommandParametersBuilder(super=" + super.toString() + ", username=" + this.f88347OooO0o0 + ", password=" + Arrays.toString(this.f88346OooO0o) + ")";
        }
    }

    public static final class OooO0O0 extends OooO00o<OooO, OooO0O0> {
        @Override // o0O0OOo.OooO.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o OooO0Oo() {
            return this;
        }

        @Override // o0O0OOo.OooO.OooO00o, o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final OooO0OO.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooO.OooO00o
        /* JADX INFO: renamed from: OooO0o */
        public final OooO build() {
            return new OooO(this);
        }

        @Override // o0O0OOo.OooO.OooO00o
        /* JADX INFO: renamed from: OooO0oO */
        public final OooO0O0 OooO0o0() {
            return this;
        }

        @Override // o0O0OOo.OooO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooO(this);
        }

        @Override // o0O0OOo.OooO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooO(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88347OooO0o0;
        this.f88345OooO0o0 = str;
        if (str == null) {
            throw new NullPointerException("username is marked non-null but is null");
        }
        this.f88344OooO0o = oooO0O0.f88346OooO0o;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0O0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0OO
    /* JADX INFO: renamed from: OooO0OO */
    public final OooO0OO.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean canEqual(Object obj) {
        return obj instanceof OooO;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        oooO.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88345OooO0o0;
        String str2 = oooO.f88345OooO0o0;
        if (str != null ? str.equals(str2) : str2 == null) {
            return Arrays.equals(this.f88344OooO0o, oooO.f88344OooO0o);
        }
        return false;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88345OooO0o0;
        return Arrays.hashCode(this.f88344OooO0o) + ((iHashCode + (str == null ? 43 : str.hashCode())) * 59);
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
