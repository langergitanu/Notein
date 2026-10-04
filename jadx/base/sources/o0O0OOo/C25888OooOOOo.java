package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import o0O0OOo.OooO0O0;
import o0O0OOo.OooOOO0;

/* JADX INFO: renamed from: o0O0OOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25888OooOOOo extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f88398OooO0Oo;

    /* JADX INFO: renamed from: o0O0OOo.OooOOOo$OooO00o */
    public static abstract class OooO00o<C extends C25888OooOOOo, B extends OooO00o<C, B>> extends OooOOO0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f88399OooO0Oo;

        @Override // o0O0OOo.OooOOO0.OooO00o
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            String str = c.f88398OooO0Oo;
            if (str == null) {
                throw new NullPointerException("code is marked non-null but is null");
            }
            this.f88399OooO0Oo = str;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooOOO0.OooO00o, o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            StringBuilder sb = new StringBuilder("SignUpSubmitCodeCommandParameters.SignUpSubmitCodeCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", code=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88399OooO0Oo, ")");
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooOOOo$OooO0O0 */
    public static final class OooO0O0 extends OooO00o<C25888OooOOOo, OooO0O0> {
        @Override // o0O0OOo.C25888OooOOOo.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25888OooOOOo.OooO00o, o0O0OOo.OooOOO0.OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooOOO0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25888OooOOOo.OooO00o
        /* JADX INFO: renamed from: OooO0oO */
        public final C25888OooOOOo build() {
            return new C25888OooOOOo(this);
        }

        @Override // o0O0OOo.C25888OooOOOo.OooO00o
        /* JADX INFO: renamed from: OooO0oo */
        public final OooO0O0 OooO0Oo() {
            return this;
        }

        @Override // o0O0OOo.C25888OooOOOo.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new C25888OooOOOo(this);
        }

        @Override // o0O0OOo.C25888OooOOOo.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public C25888OooOOOo(OooO0O0 oooO0O0) {
        super(oooO0O0);
        String str = oooO0O0.f88399OooO0Oo;
        this.f88398OooO0Oo = str;
        if (str == null) {
            throw new NullPointerException("code is marked non-null but is null");
        }
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0
    /* JADX INFO: renamed from: OooO00o */
    public final OooO0O0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooOOO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooOOO0.OooO00o toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean canEqual(Object obj) {
        return obj instanceof C25888OooOOOo;
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25888OooOOOo)) {
            return false;
        }
        C25888OooOOOo c25888OooOOOo = (C25888OooOOOo) obj;
        c25888OooOOOo.getClass();
        if (!super.equals(obj)) {
            return false;
        }
        String str = this.f88398OooO0Oo;
        String str2 = c25888OooOOOo.f88398OooO0Oo;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        String str = this.f88398OooO0Oo;
        return iHashCode + (str == null ? 43 : str.hashCode());
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
