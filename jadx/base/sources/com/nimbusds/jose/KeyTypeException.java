package com.nimbusds.jose;

import Oooo0oO.C21111o0ooOoO;
import java.security.Key;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class KeyTypeException extends KeyException {
    public KeyTypeException(Class<? extends Key> cls) {
        super(C21111o0ooOoO.OooO0O0(cls, "Invalid key: Must be an instance of "));
    }

    public KeyTypeException(Class<? extends Key> cls, Class<?>... clsArr) {
        super("Invalid key: Must be an instance of " + cls + " and implement all of the following interfaces " + Arrays.toString(clsArr));
    }
}
