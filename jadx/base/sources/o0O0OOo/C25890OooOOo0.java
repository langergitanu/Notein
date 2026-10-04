package o0O0OOo;

import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import java.util.Arrays;
import o0O0OOo.OooO0O0;
import o0O0OOo.OooOOO0;

/* JADX INFO: renamed from: o0O0OOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25890OooOOo0 extends OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final char[] f88402OooO0Oo;

    /* JADX INFO: renamed from: o0O0OOo.OooOOo0$OooO00o */
    public static abstract class OooO00o<C extends C25890OooOOo0, B extends OooO00o<C, B>> extends OooOOO0.OooO00o<C, B> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public char[] f88403OooO0Oo;

        @Override // o0O0OOo.OooOOO0.OooO00o
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public final B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            char[] cArr = c.f88402OooO0Oo;
            if (cArr == null) {
                throw new NullPointerException("password is marked non-null but is null");
            }
            this.f88403OooO0Oo = cArr;
            return (OooO0O0) this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
        public abstract C build();

        @Override // com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public abstract OooO0O0 self();

        @Override // o0O0OOo.OooOOO0.OooO00o, o0O0OOo.OooO0O0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final String toString() {
            return "SignUpSubmitPasswordCommandParameters.SignUpSubmitPasswordCommandParametersBuilder(super=" + super.toString() + ", password=" + Arrays.toString(this.f88403OooO0Oo) + ")";
        }
    }

    /* JADX INFO: renamed from: o0O0OOo.OooOOo0$OooO0O0 */
    public static final class OooO0O0 extends OooO00o<C25890OooOOo0, OooO0O0> {
        @Override // o0O0OOo.C25890OooOOo0.OooO00o, o0O0OOo.OooO0O0.OooO00o
        /* JADX INFO: renamed from: OooO0O0 */
        public final OooO0O0.OooO00o OooO0o0() {
            return this;
        }

        @Override // o0O0OOo.C25890OooOOo0.OooO00o, o0O0OOo.OooOOO0.OooO00o
        /* JADX INFO: renamed from: OooO0o0 */
        public final OooOOO0.OooO00o self() {
            return this;
        }

        @Override // o0O0OOo.C25890OooOOo0.OooO00o
        /* JADX INFO: renamed from: OooO0oO */
        public final C25890OooOOo0 build() {
            return new C25890OooOOo0(this);
        }

        @Override // o0O0OOo.C25890OooOOo0.OooO00o
        /* JADX INFO: renamed from: OooO0oo */
        public final OooO0O0 OooO0o0() {
            return this;
        }

        @Override // o0O0OOo.C25890OooOOo0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters build() {
            return new C25890OooOOo0(this);
        }

        @Override // o0O0OOo.C25890OooOOo0.OooO00o, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public final CommandParameters.CommandParametersBuilder self() {
            return this;
        }
    }

    public C25890OooOOo0(OooO0O0 oooO0O0) {
        super(oooO0O0);
        char[] cArr = oooO0O0.f88403OooO0Oo;
        this.f88402OooO0Oo = cArr;
        if (cArr == null) {
            throw new NullPointerException("password is marked non-null but is null");
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
        return obj instanceof C25890OooOOo0;
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25890OooOOo0)) {
            return false;
        }
        C25890OooOOo0 c25890OooOOo0 = (C25890OooOOo0) obj;
        c25890OooOOo0.getClass();
        return super.equals(obj) && Arrays.equals(this.f88402OooO0Oo, c25890OooOOo0.f88402OooO0Oo);
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final int hashCode() {
        return Arrays.hashCode(this.f88402OooO0Oo) + (super.hashCode() * 59);
    }

    @Override // o0O0OOo.OooOOO0, o0O0OOo.OooO0O0, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public final CommandParameters.CommandParametersBuilder toBuilder() {
        return new OooO0O0().$fillValuesFrom(this);
    }
}
