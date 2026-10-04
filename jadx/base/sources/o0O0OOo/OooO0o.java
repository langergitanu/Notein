package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import o0O0OOo.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f88364OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f88365OooO0Oo;

    public static abstract class OooO00o<C extends OooO0o, B extends OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f88366OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f88367OooO0Oo;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88364OooO0OO;
            if (str == null) {
                throw new NullPointerException("code is marked non-null but is null");
            }
            this.f88366OooO0OO = str;
            String str2 = c.f88365OooO0Oo;
            if (str2 == null) {
                throw new NullPointerException("continuationToken is marked non-null but is null");
            }
            this.f88367OooO0Oo = str2;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            StringBuilder sb = new StringBuilder("ResetPasswordSubmitCodeCommandParameters.ResetPasswordSubmitCodeCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", code=");
            sb.append(this.f88366OooO0OO);
            sb.append(", continuationToken=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88367OooO0Oo, ")");
        }
    }

    public static final class OooO0O0 extends OooO00o<OooO0o, OooO0O0> {
        @Override // o0O0OOo.OooO0o.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooO0o.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final OooO0o build() {
            return new OooO0o(this);
        }

        @Override // o0O0OOo.OooO0o.OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.OooO0o.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooO0o(this);
        }

        @Override // o0O0OOo.OooO0o.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooO0o(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88366OooO0OO;
        this.f88364OooO0OO = str;
        if (str == null) {
            throw new NullPointerException("code is marked non-null but is null");
        }
        String str2 = oooO0O0.f88367OooO0Oo;
        this.f88365OooO0Oo = str2;
        if (str2 == null) {
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
    }

    @Override // o0O0OOo.OooO0O0
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0O0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean canEqual(Object obj) {
        return obj instanceof OooO0o;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        oooO0o.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88364OooO0OO;
        String str2 = oooO0o.f88364OooO0OO;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.f88365OooO0Oo;
        String str4 = oooO0o.f88365OooO0Oo;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88364OooO0OO;
        int iHashCode2 = (iHashCode + (str == null ? 43 : str.hashCode())) * 59;
        String str2 = this.f88365OooO0Oo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 43);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
