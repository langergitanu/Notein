package com.microsoft.identity.common.java.strategies;

import com.microsoft.identity.common.java.commands.parameters.InteractiveTokenCommandParameters;
import com.microsoft.identity.common.java.providers.oauth2.IAuthorizationStrategy;

/* JADX INFO: loaded from: classes9.dex */
public interface IAuthorizationStrategyFactory<GenericAuthorizationStrategy extends IAuthorizationStrategy> {
    GenericAuthorizationStrategy getAuthorizationStrategy(InteractiveTokenCommandParameters interactiveTokenCommandParameters);
}
