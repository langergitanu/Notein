package com.aspose.words.internal;

import java.security.AlgorithmParameters;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

/* JADX INFO: loaded from: classes5.dex */
public interface zzYM6 {
    Signature zzwg(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    MessageDigest zzwh(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    AlgorithmParameters zzwi(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
