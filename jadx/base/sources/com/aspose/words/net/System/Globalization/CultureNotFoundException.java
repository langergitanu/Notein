package com.aspose.words.net.System.Globalization;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import androidx.core.database.OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class CultureNotFoundException extends RuntimeException {
    public CultureNotFoundException(Exception exc) {
        super(exc);
    }

    public CultureNotFoundException(int i) {
        super(o0Oo0oo.OooO0O0(i, "Culture ID '", "' is not supported"));
    }

    public CultureNotFoundException(String str) {
        super(C20593OooO0Oo.OooO0O0("Culture '", str, "' is not supported"));
    }

    public CultureNotFoundException(String str, String str2) {
        super(OooO00o.OooO00o("Culture '", str, "' and Alter name '", str2, "' are not supported"));
    }
}
