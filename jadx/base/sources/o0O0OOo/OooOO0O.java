package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.Arrays;
import o0O0OOo.OooO0O0;
import o0O0OOo.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0O extends OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f88380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final char[] f88381OooO0o0;

    public static abstract class OooO00o<C extends OooOO0O, B extends OooO00o<C, B>> extends OooO0OO.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f88382OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public char[] f88383OooO0o0;

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            char[] cArr = c.f88381OooO0o0;
            if (cArr == null) {
                throw new NullPointerException("password is marked non-null but is null");
            }
            this.f88383OooO0o0 = cArr;
            String str = c.f88380OooO0o;
            if (str == null) {
                throw new NullPointerException("continuationToken is marked non-null but is null");
            }
            this.f88382OooO0o = str;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooO0OO.OooO00o, o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            StringBuilder sb = new StringBuilder("SignInSubmitPasswordCommandParameters.SignInSubmitPasswordCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", password=");
            sb.append(Arrays.toString(this.f88383OooO0o0));
            sb.append(", continuationToken=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88382OooO0o, ")");
        }
    }

    public static final class OooO0O0 extends OooO00o<OooOO0O, OooO0O0> {
        @Override // o0O0OOo.OooOO0O.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooOO0O.OooO00o, o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final OooO0OO.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooOO0O.OooO00o
        /* JADX INFO: renamed from: OooO0o */
        public final OooOO0O build() {
            return new OooOO0O(this);
        }

        @Override // o0O0OOo.OooOO0O.OooO00o
        /* JADX INFO: renamed from: OooO0oO */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.OooOO0O.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooOO0O(this);
        }

        @Override // o0O0OOo.OooOO0O.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooOO0O(OooO0O0 oooO0O0) {
        super(oooO0O0);
        char[] cArr = oooO0O0.f88383OooO0o0;
        this.f88381OooO0o0 = cArr;
        if (cArr == null) {
            throw new NullPointerException("password is marked non-null but is null");
        }
        String str = oooO0O0.f88382OooO0o;
        this.f88380OooO0o = str;
        if (str == null) {
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
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
        return obj instanceof OooOO0O;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        oooOO0O.getClass();
        if (!super.equals(obj) || !Arrays.equals(this.f88381OooO0o0, oooOO0O.f88381OooO0o0)) {
            return false;
        }
        String str = this.f88380OooO0o;
        String str2 = oooOO0O.f88380OooO0o;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f88381OooO0o0) + (super.hashCode() * 59)) * 59;
        String str = this.f88380OooO0o;
        return iHashCode + (str == null ? 43 : str.hashCode());
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
