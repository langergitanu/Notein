package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.microsoft.identity.common.java.util.BrokerProtocolVersionUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZHF {
    static final HashMap<String, Integer> zzWQr;
    protected boolean zzWQq;

    static {
        HashMap<String, Integer> map = new HashMap<>(16);
        zzWQr = map;
        OooO.OooO0O0(1, map, "org.codehaus.stax2.implName", 2, "org.codehaus.stax2.implVersion");
        OooO.OooO0O0(3, map, "org.codehaus.stax2.supportsXml11", 4, "org.codehaus.stax2.supportXmlId");
        OooO.OooO0O0(5, map, "com.ctc.wstx.returnNullForDefaultNamespace", 1, "http://java.sun.com/xml/stream/properties/implementation-name");
    }

    public zzZHF(zzZHF zzzhf) {
        this.zzWQq = zzzhf == null ? Boolean.getBoolean("com.ctc.wstx.returnNullForDefaultNamespace") : zzzhf.zzWQq;
    }

    private boolean zzY(String str, int i, Object obj) {
        if (i != 5) {
            return false;
        }
        this.zzWQq = zzZE8.zzF(str, obj);
        return true;
    }

    private Object zzhb(int i) {
        if (i == 1) {
            return "woodstox";
        }
        if (i == 2) {
            return BrokerProtocolVersionUtil.MSAL_TO_BROKER_PROTOCOL_COMPRESSION_CHANGES_MINIMUM_VERSION;
        }
        if (i == 3) {
            return zzXPY() ? Boolean.TRUE : Boolean.FALSE;
        }
        if (i == 4) {
            return zzXPX() ? Boolean.TRUE : Boolean.FALSE;
        }
        if (i == 5) {
            return zzXPW() ? Boolean.TRUE : Boolean.FALSE;
        }
        throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Internal error: no handler for property with internal id ", "."));
    }

    private static int zzy6(String str) {
        Integer num = zzWQr.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private static void zzy9(String str) {
        throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Unrecognized property '", str, "'"));
    }

    public Object getProperty(String str) {
        int iZzy7 = zzy7(str);
        if (iZzy7 >= 0) {
            return zzLv(iZzy7);
        }
        int iZzy6 = zzy6(str);
        if (iZzy6 >= 0) {
            return zzhb(iZzy6);
        }
        zzy9(str);
        return null;
    }

    public boolean zzL(String str, Object obj) {
        int iZzy7 = zzy7(str);
        if (iZzy7 >= 0) {
            return zzZ(str, iZzy7, obj);
        }
        int iZzy6 = zzy6(str);
        if (iZzy6 >= 0) {
            return zzY(str, iZzy6, obj);
        }
        zzy9(str);
        return false;
    }

    public abstract Object zzLv(int i);

    public boolean zzXPW() {
        return this.zzWQq;
    }

    public boolean zzXPX() {
        return true;
    }

    public boolean zzXPY() {
        return true;
    }

    public abstract boolean zzZ(String str, int i, Object obj);

    public abstract int zzy7(String str);

    public final Object zzy8(String str) {
        int iZzy7 = zzy7(str);
        if (iZzy7 >= 0) {
            return zzLv(iZzy7);
        }
        int iZzy6 = zzy6(str);
        if (iZzy6 < 0) {
            return null;
        }
        return zzhb(iZzy6);
    }
}
