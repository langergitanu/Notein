package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.Arrays;
import java.util.Map;
import o0O0OOo.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOOO extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f88392OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f88393OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final char[] f88394OooO0o0;

    public static abstract class OooO00o<C extends OooOOOO, B extends OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f88395OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Map<String, String> f88396OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public char[] f88397OooO0o0;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88392OooO0OO;
            if (str == null) {
                throw new NullPointerException("username is marked non-null but is null");
            }
            this.f88395OooO0OO = str;
            this.f88396OooO0Oo = c.f88393OooO0Oo;
            this.f88397OooO0o0 = c.f88394OooO0o0;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            return "SignUpStartCommandParameters.SignUpStartCommandParametersBuilder(super=" + super.toString() + ", username=" + this.f88395OooO0OO + ", userAttributes=" + this.f88396OooO0Oo + ", password=" + Arrays.toString(this.f88397OooO0o0) + ")";
        }
    }

    public static final class OooO0O0 extends OooO00o<OooOOOO, OooO0O0> {
        @Override // o0O0OOo.OooOOOO.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooOOOO.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final OooOOOO build() {
            return new OooOOOO(this);
        }

        @Override // o0O0OOo.OooOOOO.OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooO0O0 OooO0O0() {
            return this;
        }

        @Override // o0O0OOo.OooOOOO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooOOOO(this);
        }

        @Override // o0O0OOo.OooOOOO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooOOOO(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88395OooO0OO;
        this.f88392OooO0OO = str;
        if (str == null) {
            throw new NullPointerException("username is marked non-null but is null");
        }
        this.f88393OooO0Oo = oooO0O0.f88396OooO0Oo;
        this.f88394OooO0o0 = oooO0O0.f88397OooO0o0;
    }

    @Override // o0O0OOo.OooO0O0
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0O0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean canEqual(Object obj) {
        return obj instanceof OooOOOO;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        oooOOOO.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88392OooO0OO;
        String str2 = oooOOOO.f88392OooO0OO;
        if (str != null ? str.equals(str2) : str2 == null) {
            return Arrays.equals(this.f88394OooO0o0, oooOOOO.f88394OooO0o0);
        }
        return false;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88392OooO0OO;
        return Arrays.hashCode(this.f88394OooO0o0) + ((iHashCode + (str == null ? 43 : str.hashCode())) * 59);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
