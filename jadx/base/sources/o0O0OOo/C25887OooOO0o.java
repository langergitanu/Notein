package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import o0O0OOo.OooO0O0;
import o0O0OOo.OooO0OO;

/* JADX INFO: renamed from: o0O0OOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25887OooOO0o extends OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f88384OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f88385OooO0o0;

    /* JADX INFO: renamed from: o0O0OOo.OooOO0o$OooO00o */
    public static abstract class OooO00o<C extends C25887OooOO0o, B extends OooO00o<C, B>> extends OooO0OO.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f88386OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f88387OooO0o0;

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88385OooO0o0;
            if (str == null) {
                throw new NullPointerException("continuationToken is marked non-null but is null");
            }
            this.f88387OooO0o0 = str;
            String str2 = c.f88384OooO0o;
            if (str2 == null) {
                throw new NullPointerException("username is marked non-null but is null");
            }
            this.f88386OooO0o = str2;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooO0OO.OooO00o, o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            StringBuilder sb = new StringBuilder("SignInWithContinuationTokenCommandParameters.SignInWithContinuationTokenCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", continuationToken=");
            sb.append(this.f88387OooO0o0);
            sb.append(", username=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88386OooO0o, ")");
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooOO0o$OooO0O0 */
    public static final class OooO0O0 extends OooO00o<C25887OooOO0o, OooO0O0> {
        @Override // o0O0OOo.C25887OooOO0o.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25887OooOO0o.OooO00o, o0O0OOo.OooO0OO.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final OooO0OO.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25887OooOO0o.OooO00o
        /* JADX INFO: renamed from: OooO0o */
        public final C25887OooOO0o build() {
            return new C25887OooOO0o(this);
        }

        @Override // o0O0OOo.C25887OooOO0o.OooO00o
        /* JADX INFO: renamed from: OooO0oO */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.C25887OooOO0o.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new C25887OooOO0o(this);
        }

        @Override // o0O0OOo.C25887OooOO0o.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public C25887OooOO0o(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88387OooO0o0;
        this.f88385OooO0o0 = str;
        if (str == null) {
            throw new NullPointerException("continuationToken is marked non-null but is null");
        }
        String str2 = oooO0O0.f88386OooO0o;
        this.f88384OooO0o = str2;
        if (str2 == null) {
            throw new NullPointerException("username is marked non-null but is null");
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
        return obj instanceof C25887OooOO0o;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25887OooOO0o)) {
            return false;
        }
        C25887OooOO0o c25887OooOO0o = (C25887OooOO0o) obj;
        c25887OooOO0o.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88385OooO0o0;
        String str2 = c25887OooOO0o.f88385OooO0o0;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.f88384OooO0o;
        String str4 = c25887OooOO0o.f88384OooO0o;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88385OooO0o0;
        int iHashCode2 = (iHashCode + (str == null ? 43 : str.hashCode())) * 59;
        String str2 = this.f88384OooO0o;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 43);
    }

    @Override // o0O0OOo.OooO0OO, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
