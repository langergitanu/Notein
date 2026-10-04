package com.microsoft.identity.client;

/* JADX INFO: loaded from: classes9.dex */
public interface ICurrentAccountResult {
    boolean didAccountChange();

    IAccount getCurrentAccount();

    IAccount getPriorAccount();
}
