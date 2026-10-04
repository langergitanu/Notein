package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import o0O0OOo.OooO0O0;

/* JADX INFO: renamed from: o0O0OOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25884OooO0o0 extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f88368OooO0OO;

    /* JADX INFO: renamed from: o0O0OOo.OooO0o0$OooO00o */
    public static abstract class OooO00o<C extends C25884OooO0o0, B extends OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f88369OooO0OO;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88368OooO0OO;
            if (str == null) {
                throw new NullPointerException("username is marked non-null but is null");
            }
            this.f88369OooO0OO = str;
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
            StringBuilder sb = new StringBuilder("ResetPasswordStartCommandParameters.ResetPasswordStartCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", username=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88369OooO0OO, ")");
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends OooO00o<C25884OooO0o0, OooO0O0> {
        @Override // o0O0OOo.C25884OooO0o0.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25884OooO0o0.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final C25884OooO0o0 build() {
            return new C25884OooO0o0(this);
        }

        @Override // o0O0OOo.C25884OooO0o0.OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.C25884OooO0o0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new C25884OooO0o0(this);
        }

        @Override // o0O0OOo.C25884OooO0o0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public C25884OooO0o0(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88369OooO0OO;
        this.f88368OooO0OO = str;
        if (str == null) {
            throw new NullPointerException("username is marked non-null but is null");
        }
    }

    @Override // o0O0OOo.OooO0O0
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0O0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean canEqual(Object obj) {
        return obj instanceof C25884OooO0o0;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25884OooO0o0)) {
            return false;
        }
        C25884OooO0o0 c25884OooO0o0 = (C25884OooO0o0) obj;
        c25884OooO0o0.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88368OooO0OO;
        String str2 = c25884OooO0o0.f88368OooO0OO;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88368OooO0OO;
        return iHashCode + (str == null ? 43 : str.hashCode());
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
