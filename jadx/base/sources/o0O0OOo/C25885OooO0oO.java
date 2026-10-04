package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.Arrays;
import o0O0OOo.OooO0O0;

/* JADX INFO: renamed from: o0O0OOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25885OooO0oO extends o0O0OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final char[] f88370OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f88371OooO0Oo;

    /* JADX INFO: renamed from: o0O0OOo.OooO0oO$OooO00o */
    public static abstract class OooO00o<C extends C25885OooO0oO, B extends OooO00o<C, B>> extends OooO0O0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public char[] f88372OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f88373OooO0Oo;

        @Override // o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            char[] cArr = c.f88370OooO0OO;
            if (cArr == null) {
                throw new NullPointerException("newPassword is marked non-null but is null");
            }
            this.f88372OooO0OO = cArr;
            String str = c.f88371OooO0Oo;
            if (str == null) {
                throw new NullPointerException("continuationToken is marked non-null but is null");
            }
            this.f88373OooO0Oo = str;
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
            StringBuilder sb = new StringBuilder("ResetPasswordSubmitNewPasswordCommandParameters.ResetPasswordSubmitNewPasswordCommandParametersBuilder(super=");
            sb.append(super.toString());
            sb.append(", newPassword=");
            sb.append(Arrays.toString(this.f88372OooO0OO));
            sb.append(", continuationToken=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f88373OooO0Oo, ")");
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends OooO00o<C25885OooO0oO, OooO0O0> {
        @Override // o0O0OOo.C25885OooO0oO.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25885OooO0oO.OooO00o
        /* JADX INFO: renamed from: OooO0Oo */
        public final C25885OooO0oO build() {
            return new C25885OooO0oO(this);
        }

        @Override // o0O0OOo.C25885OooO0oO.OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooO0O0 self() {
            return this;
        }

        @Override // o0O0OOo.C25885OooO0oO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new C25885OooO0oO(this);
        }

        @Override // o0O0OOo.C25885OooO0oO.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public C25885OooO0oO(OooO0O0 oooO0O0) {
        super(oooO0O0);
        char[] cArr = oooO0O0.f88372OooO0OO;
        this.f88370OooO0OO = cArr;
        if (cArr == null) {
            throw new NullPointerException("newPassword is marked non-null but is null");
        }
        String str = oooO0O0.f88373OooO0Oo;
        this.f88371OooO0Oo = str;
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
        return obj instanceof C25885OooO0oO;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25885OooO0oO)) {
            return false;
        }
        C25885OooO0oO c25885OooO0oO = (C25885OooO0oO) obj;
        c25885OooO0oO.getClass();
        if (!super.equals(obj) || !Arrays.equals(this.f88370OooO0OO, c25885OooO0oO.f88370OooO0OO)) {
            return false;
        }
        String str = this.f88371OooO0Oo;
        String str2 = c25885OooO0oO.f88371OooO0Oo;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f88370OooO0OO) + (super.hashCode() * 59)) * 59;
        String str = this.f88371OooO0Oo;
        return iHashCode + (str == null ? 43 : str.hashCode());
    }

    @Override // o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
