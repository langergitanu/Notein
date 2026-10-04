package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import o0O0OOo.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f88388OooO0OO;

    public static abstract class OooO00o<C extends OooOOO, B extends OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f88389OooO0OO;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88388OooO0OO;
            if (str == null) {
                throw new NullPointerException("continuationToken is marked non-null but is null");
            }
            this.f88389OooO0OO = str;
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
            StringBuilder sb = new StringBuilder("SignUpResendCodeCommandParameters.SignUpResendCodeCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", continuationToken=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88389OooO0OO, ")");
        }
    }

    public static final class OooO0O0 extends OooO00o<OooOOO, OooO0O0> {
        @Override // o0O0OOo.OooOOO.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooOOO.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final OooOOO build() {
            return new OooOOO(this);
        }

        @Override // o0O0OOo.OooOOO.OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.OooOOO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooOOO(this);
        }

        @Override // o0O0OOo.OooOOO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooOOO(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88389OooO0OO;
        this.f88388OooO0OO = str;
        if (str == null) {
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
        return obj instanceof OooOOO;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        oooOOO.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88388OooO0OO;
        String str2 = oooOOO.f88388OooO0OO;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88388OooO0OO;
        return iHashCode + (str == null ? 43 : str.hashCode());
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
