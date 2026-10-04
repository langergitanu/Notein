package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import o0O0OOo.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public class OooOOO0 extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f88390OooO0OO;

    public static abstract class OooO00o<C extends OooOOO0, B extends OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f88391OooO0OO;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            OooO0Oo(c.f88390OooO0OO);
            return (B) OooO0o0();
        }

        public final B OooO0Oo(String str) {
            if (str == null) {
                throw new NullPointerException("continuationToken is marked non-null but is null");
            }
            this.f88391OooO0OO = str;
            return (B) OooO0o0();
        }

        public abstract B OooO0o0();

        @Override // o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public String toString() {
            StringBuilder sb = new StringBuilder("SignUpContinueCommandParameters.SignUpContinueCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", continuationToken=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88391OooO0OO, ")");
        }
    }

    public static final class OooO0O0 extends OooO00o<OooOOO0, OooO0O0> {
        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.OooOOO0.OooO00o
        public final OooO00o OooO0o0() {
            return this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new OooOOO0(this);
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public OooOOO0(OooO00o<?, ?> oooO00o) {
        super(oooO00o);
        String str = oooO00o.f88391OooO0OO;
        this.f88390OooO0OO = str;
        if (str == null) {
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public OooO00o<?, ?> toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean canEqual(Object obj) {
        return obj instanceof OooOOO0;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (!oooOOO0.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String str = this.f88390OooO0OO;
        String str2 = oooOOO0.f88390OooO0OO;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88390OooO0OO;
        return iHashCode + (str == null ? 43 : str.hashCode());
    }
}
