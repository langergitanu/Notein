package com.microsoft.identity.common.java.providers.oauth2;

import androidx.appcompat.app.OooOOO;
import com.microsoft.identity.common.java.authscheme.AbstractAuthenticationScheme;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class OAuth2StrategyParameters {
    private final transient AbstractAuthenticationScheme mAuthenticationScheme;
    public final List<String> mChallengeTypes;
    private final transient IPlatformComponents mPlatformComponents;
    private transient boolean mUsingOpenIdConfiguration;

    public static class OAuth2StrategyParametersBuilder {
        private AbstractAuthenticationScheme authenticationScheme;
        private List<String> challengeTypes;
        private IPlatformComponents platformComponents;
        private boolean usingOpenIdConfiguration;

        public OAuth2StrategyParametersBuilder authenticationScheme(AbstractAuthenticationScheme abstractAuthenticationScheme) {
            this.authenticationScheme = abstractAuthenticationScheme;
            return this;
        }

        public OAuth2StrategyParameters build() {
            return new OAuth2StrategyParameters(this.platformComponents, this.authenticationScheme, this.challengeTypes, this.usingOpenIdConfiguration);
        }

        public OAuth2StrategyParametersBuilder challengeTypes(List<String> list) {
            this.challengeTypes = list;
            return this;
        }

        public OAuth2StrategyParametersBuilder platformComponents(IPlatformComponents iPlatformComponents) {
            this.platformComponents = iPlatformComponents;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("OAuth2StrategyParameters.OAuth2StrategyParametersBuilder(platformComponents=");
            sb.append(this.platformComponents);
            sb.append(", authenticationScheme=");
            sb.append(this.authenticationScheme);
            sb.append(", challengeTypes=");
            sb.append(this.challengeTypes);
            sb.append(", usingOpenIdConfiguration=");
            return OooOOO.OooO00o(sb, ")", this.usingOpenIdConfiguration);
        }

        public OAuth2StrategyParametersBuilder usingOpenIdConfiguration(boolean z) {
            this.usingOpenIdConfiguration = z;
            return this;
        }
    }

    public OAuth2StrategyParameters(IPlatformComponents iPlatformComponents, AbstractAuthenticationScheme abstractAuthenticationScheme, List<String> list, boolean z) {
        this.mPlatformComponents = iPlatformComponents;
        this.mAuthenticationScheme = abstractAuthenticationScheme;
        this.mChallengeTypes = list;
        this.mUsingOpenIdConfiguration = z;
    }

    public static OAuth2StrategyParametersBuilder builder() {
        return new OAuth2StrategyParametersBuilder();
    }

    public AbstractAuthenticationScheme getAuthenticationScheme() {
        return this.mAuthenticationScheme;
    }

    public List<String> getChallengeTypes() {
        return this.mChallengeTypes;
    }

    public IPlatformComponents getPlatformComponents() {
        return this.mPlatformComponents;
    }

    public boolean isUsingOpenIdConfiguration() {
        return this.mUsingOpenIdConfiguration;
    }

    public void setUsingOpenIdConfiguration(boolean z) {
        this.mUsingOpenIdConfiguration = z;
    }
}
