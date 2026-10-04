package com.microsoft.identity.common.java.authscheme;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TokenAuthenticationScheme extends AbstractAuthenticationScheme implements ITokenAuthenticationSchemeInternal {
    public static final String SCHEME_DELIMITER = " ";
    private static final long serialVersionUID = 8007073391895830795L;

    public static abstract class TokenAuthenticationSchemeBuilder<C extends TokenAuthenticationScheme, B extends TokenAuthenticationSchemeBuilder<C, B>> extends AbstractAuthenticationScheme.AbstractAuthenticationSchemeBuilder<C, B> {
        private static void $fillValuesFromInstanceIntoBuilder(TokenAuthenticationScheme tokenAuthenticationScheme, TokenAuthenticationSchemeBuilder<?, ?> tokenAuthenticationSchemeBuilder) {
        }

        @Override // com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme.AbstractAuthenticationSchemeBuilder
        public abstract C build();

        @Override // com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme.AbstractAuthenticationSchemeBuilder
        public abstract B self();

        @Override // com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme.AbstractAuthenticationSchemeBuilder
        public String toString() {
            return OooO00o.OooO0OO(new StringBuilder("TokenAuthenticationScheme.TokenAuthenticationSchemeBuilder(super="), super.toString(), ")");
        }

        @Override // com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme.AbstractAuthenticationSchemeBuilder
        public B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            $fillValuesFromInstanceIntoBuilder((TokenAuthenticationScheme) c, (TokenAuthenticationSchemeBuilder<?, ?>) this);
            return (B) self();
        }
    }

    public TokenAuthenticationScheme(TokenAuthenticationSchemeBuilder<?, ?> tokenAuthenticationSchemeBuilder) {
        super(tokenAuthenticationSchemeBuilder);
    }

    @Override // com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme
    public boolean canEqual(Object obj) {
        return obj instanceof TokenAuthenticationScheme;
    }

    @Override // com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TokenAuthenticationScheme) && ((TokenAuthenticationScheme) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme
    public int hashCode() {
        return super.hashCode();
    }

    public TokenAuthenticationScheme(String str) {
        super(str);
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
    }
}
