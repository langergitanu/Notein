package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import o0O0OOo.OooO0O0;
import o0O0OOo.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0 extends OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f88376OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f88377OooO0o0;

    public static abstract class OooO00o<C extends OooOO0, B extends OooO00o<C, B>> extends OooO0OO.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f88378OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f88379OooO0o0;

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88377OooO0o0;
            if (str == null) {
                throw new NullPointerException("code is marked non-null but is null");
            }
            this.f88379OooO0o0 = str;
            String str2 = c.f88376OooO0o;
            if (str2 == null) {
                throw new NullPointerException("continuationToken is marked non-null but is null");
            }
            this.f88378OooO0o = str2;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooO0OO.OooO00o, o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            StringBuilder sb = new StringBuilder("SignInSubmitCodeCommandParameters.SignInSubmitCodeCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", code=");
            sb.append(this.f88379OooO0o0);
            sb.append(", continuationToken=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88378OooO0o, ")");
        }
    }

    public static final class OooO0O0 extends OooO00o<OooOO0, OooO0O0> {
        @Override // o0O0OOo.OooOO0.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooOO0.OooO00o, o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final OooO0OO.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooOO0.OooO00o
        /* JADX INFO: renamed from: OooO0o */
        public final OooOO0 build() {
            return new OooOO0(this);
        }

        @Override // o0O0OOo.OooOO0.OooO00o
        /* JADX INFO: renamed from: OooO0oO */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.OooOO0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooOO0(this);
        }

        @Override // o0O0OOo.OooOO0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooOO0(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88379OooO0o0;
        this.f88377OooO0o0 = str;
        if (str == null) {
            throw new NullPointerException("code is marked non-null but is null");
        }
        String str2 = oooO0O0.f88378OooO0o;
        this.f88376OooO0o = str2;
        if (str2 == null) {
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
        return obj instanceof OooOO0;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO02 = (OooOO0) obj;
        oooOO02.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88377OooO0o0;
        String str2 = oooOO02.f88377OooO0o0;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.f88376OooO0o;
        String str4 = oooOO02.f88376OooO0o;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88377OooO0o0;
        int iHashCode2 = (iHashCode + (str == null ? 43 : str.hashCode())) * 59;
        String str2 = this.f88376OooO0o;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 43);
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
