package o0O0OOo;

import com.google.gson.annotations.Expose;
import com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import com.microsoft.identity.common.java.dto.AccountRecord;
import o0O0OOo.OooO0O0;

/* JADX INFO: renamed from: o0O0OOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25882OooO00o extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AccountRecord f88348OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Expose
    private final AbstractAuthenticationScheme f88349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Expose
    private final boolean f88350OooO0o0;

    /* JADX INFO: renamed from: o0O0OOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractC19728OooO00o<C extends C25882OooO00o, B extends AbstractC19728OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public AccountRecord f88351OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public AbstractAuthenticationScheme f88352OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f88353OooO0o0;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            this.f88351OooO0OO = c.f88348OooO0OO;
            AbstractAuthenticationScheme abstractAuthenticationScheme = ((C25882OooO00o) c).f88349OooO0Oo;
            if (abstractAuthenticationScheme == null) {
                throw new NullPointerException("authenticationScheme is marked non-null but is null");
            }
            this.f88352OooO0Oo = abstractAuthenticationScheme;
            this.f88353OooO0o0 = ((C25882OooO00o) c).f88350OooO0o0;
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
            StringBuilder sb = new StringBuilder("AcquireTokenNoFixedScopesCommandParameters.AcquireTokenNoFixedScopesCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", account=");
            sb.append(this.f88351OooO0OO);
            sb.append(", authenticationScheme=");
            sb.append(this.f88352OooO0Oo);
            sb.append(", forceRefresh=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, ", loginHint=null, extraOptions=null)", this.f88353OooO0o0);
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooO00o$OooO0O0 */
    public static final class OooO0O0 extends AbstractC19728OooO00o<C25882OooO00o, OooO0O0> {
        @Override // o0O0OOo.C25882OooO00o.AbstractC19728OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25882OooO00o.AbstractC19728OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final C25882OooO00o build() {
            return new C25882OooO00o(this);
        }

        @Override // o0O0OOo.C25882OooO00o.AbstractC19728OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.C25882OooO00o.AbstractC19728OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new C25882OooO00o(this);
        }

        @Override // o0O0OOo.C25882OooO00o.AbstractC19728OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public C25882OooO00o(OooO0O0 oooO0O0) {
        super(oooO0O0);
        this.f88348OooO0OO = oooO0O0.f88351OooO0OO;
        AbstractAuthenticationScheme abstractAuthenticationScheme = oooO0O0.f88352OooO0Oo;
        this.f88349OooO0Oo = abstractAuthenticationScheme;
        if (abstractAuthenticationScheme == null) {
            throw new NullPointerException("authenticationScheme is marked non-null but is null");
        }
        this.f88350OooO0o0 = oooO0O0.f88353OooO0o0;
    }

    @Override // o0O0OOo.OooO0O0
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0O0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean canEqual(Object obj) {
        return obj instanceof C25882OooO00o;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25882OooO00o)) {
            return false;
        }
        C25882OooO00o c25882OooO00o = (C25882OooO00o) obj;
        c25882OooO00o.getClass();
        if (!super.equals(obj) || this.f88350OooO0o0 != c25882OooO00o.f88350OooO0o0) {
            return false;
        }
        AccountRecord accountRecord = this.f88348OooO0OO;
        AccountRecord accountRecord2 = c25882OooO00o.f88348OooO0OO;
        if (accountRecord == null) {
            if (accountRecord2 != null) {
                return false;
            }
        } else if (!accountRecord.equals(accountRecord2)) {
            return false;
        }
        AbstractAuthenticationScheme abstractAuthenticationScheme = this.f88349OooO0Oo;
        AbstractAuthenticationScheme abstractAuthenticationScheme2 = c25882OooO00o.f88349OooO0Oo;
        if (abstractAuthenticationScheme == null) {
            if (abstractAuthenticationScheme2 != null) {
                return false;
            }
        } else if (!abstractAuthenticationScheme.equals(abstractAuthenticationScheme2)) {
            return false;
        }
        return true;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 59) + (this.f88350OooO0o0 ? 79 : 97)) * 59;
        AccountRecord accountRecord = this.f88348OooO0OO;
        int iHashCode2 = iHashCode + (accountRecord == null ? 43 : accountRecord.hashCode());
        AbstractAuthenticationScheme abstractAuthenticationScheme = this.f88349OooO0Oo;
        return (((((iHashCode2 * 59) + (abstractAuthenticationScheme == null ? 43 : abstractAuthenticationScheme.hashCode())) * 59) + 43) * 59) + 43;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
